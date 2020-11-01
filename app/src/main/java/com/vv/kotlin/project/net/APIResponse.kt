package com.vv.kotlin.project.net

import android.content.Context
import com.vv.kotlin.project.entity.LoginResponseWrapper
import com.xiangxue.kotlinproject.LoadingDialog
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 *
 * @author ShenZhenWei
 * @date 2020/10/31
 */
abstract class APIResponse<T>(val context: Context) : Observer<LoginResponseWrapper<T>> {

    private var isShow: Boolean = true

    constructor(context: Context, isShow: Boolean = false) : this(context)


    abstract fun success(data: T?)

    abstract fun failure(errorMsg: String)

    override fun onSubscribe(d: Disposable) {
        if (isShow) {
            LoadingDialog.show(context)
        }
    }

    //从上游流下来的数据
    override fun onNext(t: LoginResponseWrapper<T>) {
        if (t.data == null) {
            failure("登陆失败了，请检查原因 ：msg:${t.errorMsg}")
        } else {
            success(t.data)
        }
    }

    //从上游流下来的错误
    override fun onError(e: Throwable) {
        //取消加载
        LoadingDialog.cancel()
        failure(e.message.toString())
    }

    override fun onComplete() {
        LoadingDialog.cancel()
    }

}