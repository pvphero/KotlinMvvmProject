package com.vv.kotlin.project.modules.login

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.vv.kotlin.project.R
import com.vv.kotlin.project.api.WanAndroidAPI
import com.vv.kotlin.project.config.Flag
import com.vv.kotlin.project.entity.LoginResponse
import com.vv.kotlin.project.net.APIClient
import com.vv.kotlin.project.net.APIResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_user_login.*
import kotlinx.android.synthetic.main.fragment_personal.*

/**
 *
 * @author ShenZhenWei
 * @date 2020/10/30
 */
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)

        //WANAndroidAPI.Class ---WanAndroidAPI::class.java
//        val api:WanAndroidAPI=APIClient.instance.instanceRetrofit(WanAndroidAPI::class.java)

        user_login_bt.setOnClickListener(onClickListener)
    }

    private val onClickListener = View.OnClickListener { view ->
        when (view.id) {
            //登陆
            R.id.user_login_bt -> {
                val userNameStr = user_phone_et.text.toString()
                val userPwdStr = user_password_et.text.toString()

                APIClient.instance.instanceRetrofit(WanAndroidAPI::class.java)

                    .loginAction(userNameStr, userPwdStr)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : APIResponse<LoginResponse>(this) {
                        override fun success(data: LoginResponse?) {
                            // 成功 data UI
                            Log.e(Flag.TAG, "success:$data")
                            Toast.makeText(this@LoginActivity, "登陆成功", Toast.LENGTH_SHORT).show()
                        }

                        override fun failure(errorMsg: String) {
                            // 失败 msg ui
                            Log.e(Flag.TAG, "failure:$errorMsg")
                            Toast.makeText(this@LoginActivity, "登陆失败", Toast.LENGTH_SHORT).show()
                        }

                    })
            }
        }

    }

}