package com.vv.kotlin.project.modules.login.inter

import com.vv.kotlin.project.entity.LoginResponse

/**
 *
 * View 层
 * @author ShenZhenWei
 * @date 2020/12/12
 *
 */
interface LoginView {

    fun loginSuccess(loginBean: LoginResponse?)

    fun loginFialure(errMsg: String?)
}