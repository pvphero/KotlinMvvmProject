package com.vv.kotlin.project.modules.login.inter

import android.content.Context

/**
 *
 * @author ShenZhenWei
 * @date 2020/12/12
 */
interface LoginModule {
    fun cancelRequest()

    //登
    fun login(
        context: Context,
        username: String,
        password: String,

        //接口问题 把 data结果给p层
        onLoginListener: LoginPresenter.onLoginListener
    )
}