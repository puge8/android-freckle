package com.example.antonynganga.android_freckle


import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.antonynganga.android_freckle.data.Constants.CONNECTIVITY_ACTION
import com.example.antonynganga.android_freckle.services.NetworkChangeReceiver
import com.example.antonynganga.android_freckle.util.NetworkInfo
import com.github.ajalt.timberkt.Timber
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {

    internal var intentFilter: IntentFilter? = null
    internal var receiver: NetworkChangeReceiver? = null

    override fun onResume() {
        super.onResume()
        registerReceiver(receiver, intentFilter)
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(receiver)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.plant(Timber.DebugTree())

        intentFilter = IntentFilter()
        intentFilter?.let {
            intentFilter!!.addAction(CONNECTIVITY_ACTION)
            receiver = NetworkChangeReceiver()
        }


        if (NetworkInfo.getConnectivityStatus(this@MainActivity) > 0)
            Toast.makeText(this, "Connect", Toast.LENGTH_SHORT).show()

        else
            Toast.makeText(this, "No connection", Toast.LENGTH_SHORT).show()
    }

    fun addLogText(log: String) {
        Toast.makeText(this, log, Toast.LENGTH_SHORT).show()
    }

}


