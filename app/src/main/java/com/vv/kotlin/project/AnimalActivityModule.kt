package com.vv.kotlin.project

import dagger.Module
import dagger.Provides
import com.vv.kotlin.project.di.qualifiers.ViewModelInjection
import com.vv.kotlin.project.di.InjectionViewModelProvider

/**
 *
 * @author ShenZhenWei
 * @date 2020/9/8
 */
@Module
class AnimalActivityModule {

    @Provides
    @ViewModelInjection
    fun provideAnimalActivityVM(
        activity: AnimalActivityActivity,
        viewModelProvider: InjectionViewModelProvider<AnimalActivityVM>
    ): AnimalActivityVM = viewModelProvider.get(activity)
}