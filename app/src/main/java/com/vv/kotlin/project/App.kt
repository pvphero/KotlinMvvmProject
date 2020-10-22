package com.vv.kotlin.project

import android.app.Activity
import android.app.Application
import com.vv.kotlin.project.di.components.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 *
 * @author ShenZhenWei
 * @date 2020/9/8
 */
class App : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
            .builder()
            .application(this)
            .build()
            .inject(this)

    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}