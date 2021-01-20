package com.dizcoding.projectjpr.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun Context.toast(msg: String?) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
fun Context.longToast(msg: String?) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

fun Activity.intentTo(c: Class<*>, vararg bundle: Bundle) {
    val intent = Intent(this, c).apply {
        if (bundle.isNotEmpty()) {
            bundle.forEach {
                putExtras(it)
            }
        }
    }
    startActivity(intent)
}
fun Activity.intentFinishTo(c: Class<*>, vararg bundle: Bundle) {
    val intent = Intent(this, c).apply {
        if (bundle.isNotEmpty()) {
            bundle.forEach {
                putExtras(it)
            }
        }
    }
    startActivity(intent)
    finish()
}

fun Context.presentData(
    rv: RecyclerView,
    type: Int,
    adapter: RecyclerView.Adapter<*>,
    reverseLayout: Boolean = false
) {
    rv.layoutManager = LinearLayoutManager(this, type, reverseLayout)
    rv.adapter = adapter
    rv.setHasFixedSize(true)
}