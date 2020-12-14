package com.vv.kotlin.project.modules.login.inter

import android.content.Context
import com.vv.kotlin.project.entity.LoginResponse

/**
 *
 * @author ShenZhenWei
 * @date 2020/12/12
 */
interface LoginPresenter {
    fun loginAction(context: Context, username: String, password: String)

    //监听接口的回调
    interface onLoginListener {

        fun loginSuccess(loginBean: LoginResponse?)

        fun loginFialure(errMsg: String?)
    }
}