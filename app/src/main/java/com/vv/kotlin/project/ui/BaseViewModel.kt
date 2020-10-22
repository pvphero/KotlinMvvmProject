package com.vv.kotlin.project.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

/**
 *
 * @author ShenZhenWei
 * @date 2020/9/8
 */
abstract class BaseViewModel() : ViewModel() {
    val compositeDisposable = CompositeDisposable()
}