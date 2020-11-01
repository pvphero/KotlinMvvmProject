package com.vv.kotlin.project.api

import com.vv.kotlin.project.entity.LoginResponse
import com.vv.kotlin.project.entity.LoginResponseWrapper
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 *
 * @author ShenZhenWei
 * @date 2020/10/30
 *
 * 客户端API 可以访问 服务器API
 */
interface WanAndroidAPI {
    /**
     * 登陆API
     *
     *
     */
    @POST("/user/login")
    @FormUrlEncoded
    fun loginAction(
        @Field("username") username: String,
        @Field("password") password: String
    )
            : Observable<LoginResponseWrapper<LoginResponse>>

    /**
     * 注册API
     */
}