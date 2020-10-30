package com.vv.kotlin.project.entity

data class RegisterResponseWaraper(
    val `data`: Data,
    val errorCode: Int,
    val errorMsg: String
)