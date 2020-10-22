package com.vv.kotlin.project

import androidx.databinding.ObservableField
import com.vv.kotlin.project.data.Animal
import javax.inject.Inject
import com.vv.kotlin.project.ui.BaseViewModel

/**
 *
 * @author ShenZhenWei
 * @date 2020/9/8
 */
class AnimalActivityVM @Inject constructor(val animal: Animal) : BaseViewModel() {

    //data
    val info= ObservableField<String>("${animal.name} 叫了 ${animal.shoutCount} 声。。。")

    //binding
    fun shout(){
        animal.shoutCount++
        info.set("${animal.name} 叫了 ${animal.shoutCount} 声。。。")
    }
}