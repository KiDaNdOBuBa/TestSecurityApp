package com.vsch.mvi.app

import android.app.Application
import android.util.Log
import com.vsch.mvi.data.model.TodoLocal
import dagger.hilt.android.HiltAndroidApp
import java.util.*
import javax.inject.Inject

@HiltAndroidApp
class MviSampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initWithPreconditionData()
    }

    private fun initWithPreconditionData() {
        //Prefill database with data
    }
}