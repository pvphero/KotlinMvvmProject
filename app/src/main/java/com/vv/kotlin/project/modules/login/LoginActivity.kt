package com.vv.kotlin.project.modules.login

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.vv.kotlin.project.R
import com.vv.kotlin.project.api.WanAndroidAPI
import com.vv.kotlin.project.net.APIClient

/**
 *
 * @author ShenZhenWei
 * @date 2020/10/30
 */
class LoginActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_user_login)

        //WANAndroidAPI.Class ---WanAndroidAPI::class.java
        val api:WanAndroidAPI=APIClient.instance.instanceRetrofit(WanAndroidAPI::class.java)
    }
}