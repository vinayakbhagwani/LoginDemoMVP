package com.demo.logindemomvp.model

public interface IUser {
    fun getEmail(): String
    fun getPassword(): String
    fun isValidData(): Int
}