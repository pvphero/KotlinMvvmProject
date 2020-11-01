package com.vv.kotlin.project.net

import android.util.TimeUtils
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 *
 * @author ShenZhenWei
 * @date 2020/10/30
 */
class APIClient {
    private object Holder {
        val INSTANCE = APIClient()
    }

    companion object {
        val instance = Holder.INSTANCE
    }

    //WanAndroid API实例化
    fun <T> instanceRetrofit(apiInterface: Class<T>): T {
        //请求方
        val mOkHttpClient:OkHttpClient =OkHttpClient().newBuilder()
            .readTimeout(1000,TimeUnit.SECONDS)
            .connectTimeout(1000,TimeUnit.SECONDS)
                .writeTimeout(1000,TimeUnit.SECONDS)
            .build()
        val retrofit:Retrofit =Retrofit.Builder()
            .baseUrl("https://www.wanandroid.com")
            //okhttpCliet请求服务器
            .client(mOkHttpClient)
        //响应方
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(apiInterface)
    }
}