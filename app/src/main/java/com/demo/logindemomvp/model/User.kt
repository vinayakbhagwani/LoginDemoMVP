package com.demo.logindemomvp.model

import android.text.TextUtils
import android.util.Patterns

class User(var em: String, var pass: String) : IUser {

    override fun getEmail(): String {
        return this.em
    }

    override fun getPassword(): String {
        return this.pass
    }

    override fun isValidData(): Int {
        //0: checking for empty email
        //1: checking email is matches pattern
        //2: check password length > 6

        if(TextUtils.isEmpty(getEmail())) {
            return 0
        } else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) {
            return 1
        } else if(getPassword().length <= 6) {
            return 2
        }
        return 4
    }
}