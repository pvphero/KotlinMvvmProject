package com.vv.kotlin.project.modules.login

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.vv.kotlin.project.api.WanAndroidAPI
import com.vv.kotlin.project.config.Flag
import com.vv.kotlin.project.entity.LoginResponse
import com.vv.kotlin.project.modules.login.inter.LoginModule
import com.vv.kotlin.project.modules.login.inter.LoginPresenter
import com.vv.kotlin.project.net.APIClient
import com.vv.kotlin.project.net.APIResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *
 * @author ShenZhenWei
 * @date 2020/12/12
 */
class LoginModelImpl : LoginModule {
    override fun cancelRequest() {
        TODO("Not yet implemented")
    }

    override fun login(
        context: Context,
        username: String,
        password: String,
        onLoginListener: LoginPresenter.onLoginListener
    ) {
        APIClient.instance.instanceRetrofit(WanAndroidAPI::class.java)
            .loginAction(username, password)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : APIResponse<LoginResponse>(context) {
                override fun success(data: LoginResponse?) {
                    // 成功 data UI
                    onLoginListener.loginSuccess(data)
                    Log.e(Flag.TAG, "success:$data")
                }

                override fun failure(errorMsg: String) {
                    // 失败 msg ui
                    onLoginListener.loginFialure(errorMsg)
                    Log.e(Flag.TAG, "failure:$errorMsg")
                }

            })
    }

}