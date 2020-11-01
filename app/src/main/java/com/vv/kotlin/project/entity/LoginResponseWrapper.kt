package com.vv.kotlin.project.entity

/**
 *
 * @author ShenZhenWei
 * @date 2020/10/30
 *
 */
class LoginResponseWrapper<T>(
    val data: T,
    val errorCode: String,
    val errorMsg: String
)