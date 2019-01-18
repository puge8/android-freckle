package com.example.antonynganga.android_freckle.util

import android.content.Context
import android.net.ConnectivityManager
import android.telephony.TelephonyManager
import com.example.antonynganga.android_freckle.data.Constants


object NetworkInfo {

    var TYPE_WIFI = 1
    var TYPE_MOBILE = 2
    var TYPE_NOT_CONNECTED = 0

    fun getConnectivityStatus(context: Context): Int {

        val activeNetwork = (context.getSystemService(Context.CONNECTIVITY_SERVICE)
                as ConnectivityManager).activeNetworkInfo

        if (null != activeNetwork) {

            if (activeNetwork.type == ConnectivityManager.TYPE_WIFI) return TYPE_WIFI

            if (activeNetwork.type == ConnectivityManager.TYPE_MOBILE) return TYPE_MOBILE
        }
        return TYPE_NOT_CONNECTED
    }

    fun getConnectivityStatusString(context: Context): String {

        val conn = NetworkInfo.getConnectivityStatus(context)

        var status: String? = null
        if (conn == NetworkInfo.TYPE_WIFI) {
            //status = "Wifi enabled";
            status = Constants.CONNECT_TO_WIFI
        } else if (conn == NetworkInfo.TYPE_MOBILE) {
//            status = "Mobile data enabled";
            status = getNetworkClass(context)
        } else if (conn == NetworkInfo.TYPE_NOT_CONNECTED) {
            status = Constants.NOT_CONNECT
        }

        return "$status"
    }

    private fun getNetworkClass(context: Context): String {
        val info = (context.getSystemService(Context.CONNECTIVITY_SERVICE)
                as ConnectivityManager).activeNetworkInfo
        if (info == null || !info.isConnected)
            return "-" //not connected
        if (info.type == ConnectivityManager.TYPE_WIFI)
            return "WIFI"
        if (info.type == ConnectivityManager.TYPE_MOBILE) {
            val networkType = info.subtype
            when (networkType) {
                TelephonyManager.NETWORK_TYPE_HSPAP  //api<13 : replace by 15
                -> return "3G"
                TelephonyManager.NETWORK_TYPE_LTE    //api<11 : replace by 13
                -> return "4G"
                else -> return "UNKNOWN"
            }
        }
        return "UNKNOWN"
    }
}