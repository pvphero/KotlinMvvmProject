package com.vv.kotlin.project.di.components

import com.vv.kotlin.project.App
import com.vv.kotlin.project.di.modules.ActivityInjectorsModule
import com.vv.kotlin.project.di.modules.FragmentInjectorsModule
import com.vv.kotlin.project.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 *
 * @author ShenZhenWei
 * @date 2020/9/8
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityInjectorsModule::class,
        FragmentInjectorsModule::class,
        AppModule::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)

}