package com.sunnyweather.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.sunnyweather.android.logic.model.App
import com.sunnyweather.android.logic.network.AppService
import com.sunnyweather.android.logic.network.PlaceService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val btn:Button = findViewById(R.id.)

//        btn.setOnClickListener{
//            val retrofit = Retrofit.Builder()
//                .baseUrl("http://10.0.2.2/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//            val appService = retrofit.create(AppService::class.java)
//            appService.getAppData().enqueue(object : Callback<List<App>>{
//                override fun onResponse(call: Call<List<App>>, response: Response<List<App>>) {
//                    val list = response.body()
//                    if (list != null){
//                        for (app in list){
//                            Log.d("MainActivity", "id is ${app.id}")
//                            Log.d("MainActivity", "name is ${app.name}")
//                            Log.d("MainActivity", "version is ${app.version}")
//                        }
//                    }
//                }
//
//                override fun onFailure(call: Call<List<App>>, t: Throwable) {
//                    t.printStackTrace()
//                }
//
//            })
//        }
    }
}