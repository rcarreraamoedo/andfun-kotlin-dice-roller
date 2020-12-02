package com.example.android.diceroller

import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object MisCorutinas {
    fun salidaLog() {
        CoroutineScope(Dispatchers.Main).launch {
            suspendFun("Start")
            delay(5000)
            suspendFun("Stop")
        }
    }

    private fun suspendFun(msg: String) {
        Log.d("mensajeCorutina", msg)
    }






}


