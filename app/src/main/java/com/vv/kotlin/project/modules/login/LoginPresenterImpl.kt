package com.vv.kotlin.project.modules.login

import android.content.Context
import com.vv.kotlin.project.entity.LoginResponse
import com.vv.kotlin.project.modules.login.inter.LoginPresenter
import com.vv.kotlin.project.modules.login.inter.LoginView

/**
 *
 * @author ShenZhenWei
 * @date 2020/12/12
 */
class LoginPresenterImpl(var loginView: LoginView) : LoginPresenter,
    LoginPresenter.onLoginListener {

    //需要M去请求服务器
    private val loginModel: LoginModelImpl = LoginModelImpl()
    //需要V 去更新presenter

    override fun loginAction(context: Context, username: String, password: String) {
        loginModel.login(context, username, password, this)
    }

    //接受Model 的结果
    override fun loginSuccess(loginBean: LoginResponse?) {
        loginView.loginSuccess(loginBean)
    }

    override fun loginFialure(errMsg: String?) {
        loginView.loginFialure(errMsg)
    }

}