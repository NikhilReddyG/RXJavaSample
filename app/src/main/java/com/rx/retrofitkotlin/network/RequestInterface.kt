package com.rx.retrofitkotlin.network

import com.rx.retrofitkotlin.model.Android
import io.reactivex.Observable
import retrofit2.http.GET

interface RequestInterface {

    @GET("api/android")
    fun getData() : Observable<List<Android>>
}
