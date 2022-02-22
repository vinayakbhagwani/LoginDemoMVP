package com.demo.logindemomvp.view

public interface ILoginView {
    fun onLoginError(message: String)
    fun onLoginSuccess(message: String)
}