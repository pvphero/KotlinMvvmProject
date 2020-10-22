package com.vv.kotlin.project

import com.vv.kotlin.project.R
import javax.inject.Inject
import android.os.Bundle
import com.vv.kotlin.project.di.qualifiers.ViewModelInjection
import com.vv.kotlin.project.ui.BaseActivity

/**
 *
 * @author ShenZhenWei
 * @date 2020/9/8
 */
class AnimalActivityActivity : BaseActivity() {

    @Inject
    @ViewModelInjection
    lateinit var viewModel: AnimalActivityVM

    override fun layoutRes() = R.layout.activity_animal_activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}