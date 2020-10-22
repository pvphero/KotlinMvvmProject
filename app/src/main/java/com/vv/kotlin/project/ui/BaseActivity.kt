package com.vv.kotlin.project.ui

import dagger.android.support.DaggerAppCompatActivity
import android.os.Bundle
import androidx.annotation.LayoutRes

/**
 *
 * @author ShenZhenWei
 * @date 2020/9/8
 */
abstract class BaseActivity : DaggerAppCompatActivity() {

    @LayoutRes
    abstract fun layoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes())

    }

}