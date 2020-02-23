package com.example.setupcommonlib.data.net

import android.content.Context

/**
 * Service factory.
 */

object ServiceFactory {
    fun <API> create(context: Context, service: Class<API>): API {
        return RetrofitUtils.setupRetrofit(context).create(service)
    }
}