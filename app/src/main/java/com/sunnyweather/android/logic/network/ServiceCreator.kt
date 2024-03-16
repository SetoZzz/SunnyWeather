package com.sunnyweather.android.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {
    private const val BASE_URL = "http://api.caiyunapp.com/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())//配置转换器，将kotlin或java对象相互转换
        .build()
    //<T> 泛型参数
    fun <T> create(serviceClass:Class<T>):T = retrofit.create(serviceClass)
    //reified T 泛型实化，让泛型参数在编译时就能得到具体类型
    inline fun <reified T> create():T = create(T::class.java)
}