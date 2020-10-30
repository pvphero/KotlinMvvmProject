package com.vv.kotlin.project.net

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

    }
}