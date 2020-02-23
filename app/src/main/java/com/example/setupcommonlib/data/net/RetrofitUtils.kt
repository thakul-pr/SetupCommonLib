package com.example.setupcommonlib.data.net

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Utility to handle [Retrofit] instance.
 */

object RetrofitUtils {

    // For declare header variable

    /**
     * Setup [Retrofit] instance
     *
     * @param context the context
     * @return the instance
     */

    internal fun setupRetrofit(context: Context):  Retrofit{
        return Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}