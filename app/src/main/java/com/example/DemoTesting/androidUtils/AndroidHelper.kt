package com.example.DemoTesting.androidUtils

import android.content.Context
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class AndroidHelper {
    fun showToast(context: Context, msg : String?) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
    fun showToastMessage(context: Context, msg : String?) : String? {
        CoroutineScope(Dispatchers.Default).launch {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
        return msg
    }
}