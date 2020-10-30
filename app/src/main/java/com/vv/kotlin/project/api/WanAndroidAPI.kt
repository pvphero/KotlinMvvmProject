package com.vv.kotlin.project.api

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import java.util.*

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
    fun loginAction(@Field("username") username:String,
                    @Field("passwrod") password:String)
    :Observable<>

    /**
     * 注册API
     */
}