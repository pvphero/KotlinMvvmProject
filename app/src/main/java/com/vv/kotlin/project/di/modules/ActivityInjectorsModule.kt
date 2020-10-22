package com.vv.kotlin.project.di.modules

import com.vv.kotlin.project.AnimalActivityActivity
import com.vv.kotlin.project.AnimalActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *
 * @author ShenZhenWei
 * @date 2020/9/8
 */
@Module
abstract class ActivityInjectorsModule {

    @ContributesAndroidInjector(modules = [AnimalActivityModule::class])
    abstract fun animalActivityActivityInjector(): AnimalActivityActivity
}