package com.vv.kotlin.project.di.modules

import android.app.Application
import android.content.Context
import com.vv.kotlin.project.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *
 * @author ShenZhenWei
 * @date 2020/9/8
 */
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(app: App): Application = app

    @Provides
    @Singleton
    fun provideApplicationContext(app: App): Context = app.applicationContext

}