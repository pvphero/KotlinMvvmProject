package com.vv.kotlin.project.net

import retrofit2.Retrofit

/**
 *
 * @author ShenZhenWei
 * @date 2020/10/30
 */
class APIClient {
    private object Holder {
        val INSTANCE = APIClient();
    }

    companion object {
        val instance = Holder.INSTANCE
    }

    //WanAndroid API实例化
    fun <T> instanceRetrofit(apiInterface: Class<T>): T {
        //请求方
        val retrofit:Retrofit =Retrofit.Builder()

                

            .build()
        //响应方
    }
}