package com.demo.logindemomvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.demo.logindemomvp.databinding.ActivityMainBinding
import com.demo.logindemomvp.presenter.ILoginPresenter
import com.demo.logindemomvp.presenter.LoginPresenter
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity(), ILoginPresenter, ILoginView {

    lateinit var activityMainBinding: ActivityMainBinding
    lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        initViews()
    }

    fun initViews() {
        //init
        loginPresenter = LoginPresenter(this)

        //Event
        activityMainBinding.btnSubmit.setOnClickListener(View.OnClickListener {
            loginPresenter.onLogin(
                activityMainBinding.edtEmail.text.toString(),
                activityMainBinding.edtPassword.text.toString()
            )
        })
    }

    override fun onLogin(email: String, password: String) {
        TODO("Not yet implemented")
    }

    override fun onLoginSuccess(message: String) {
        Toasty.success(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toasty.error(this, message, Toast.LENGTH_SHORT).show()
    }
}