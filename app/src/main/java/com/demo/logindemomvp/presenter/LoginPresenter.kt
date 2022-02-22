package com.demo.logindemomvp.presenter

import com.demo.logindemomvp.model.User
import com.demo.logindemomvp.view.ILoginView

class LoginPresenter(var iLoginView: ILoginView) : ILoginPresenter {

    override fun onLogin(email: String, password: String) {
            var user: User = User(email, password)
            var isLoginSuccess: Int = user.isValidData()

            when(isLoginSuccess) {
                0 -> iLoginView.onLoginError("Empty email")
                1 -> iLoginView.onLoginError("Incorrect email")
                2 -> iLoginView.onLoginError("Password length less than 6")
                4 -> iLoginView.onLoginSuccess("Login Successful")
            }
    }
}