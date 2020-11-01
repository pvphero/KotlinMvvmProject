package com.vv.kotlin.project.entity

/**
 *
 * @author ShenZhenWei
 * @date 2020/10/30
 *
 *
 *
 * "data": {
"admin": false,
"chapterTops": [],
"coinCount": 0,
"collectIds": [],
"email": "",
"icon": "",
"id": 80735,
"nickname": "pvphero2",
"password": "",
"publicName": "pvphero2",
"token": "",
"type": 0,
"username": "pvphero2"
}
 */


data class LoginResponse(
    val admin: Boolean,
    val chapterTops: List<*>,
    val coinCount: Int,
    val collectIds: List<*>,
    val email: String?,
    val icon: String?,
    val id: Int,
    val nickname: String?,
    val password: String?,
    val publicName: String?,
    val token: String?,
    val type: Int,
    val username: String?
)
