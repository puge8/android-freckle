package com.example.antonynganga.android_freckle.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

import com.example.antonynganga.android_freckle.MainActivity
import com.example.antonynganga.android_freckle.data.Constants
import com.example.antonynganga.android_freckle.util.NetworkInfo


class NetworkChangeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val status = NetworkInfo.getConnectivityStatusString(context)

        Log.e("Receiver ", "" + status)

        if (status == Constants.NOT_CONNECT) {
            Toast.makeText(context,"not connection", Toast.LENGTH_SHORT).show()

        } else {
            Toast.makeText(context,"connected to internet", Toast.LENGTH_SHORT).show()
            Log.e("Receiver ", "connected to internet")//your code when internet connection come back
        }
        (context as MainActivity).addLogText(status)
    }
}
