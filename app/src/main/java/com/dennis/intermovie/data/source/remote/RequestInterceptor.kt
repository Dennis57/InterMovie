package com.dennis.intermovie.data.source.remote

import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val newUrl = originalRequest.url
            .newBuilder()
            .build()
        val request = originalRequest.newBuilder()
            .header("Authorization", "<API KEY>")
            .url(newUrl)
            .build()
        return chain.proceed(request)
    }
}