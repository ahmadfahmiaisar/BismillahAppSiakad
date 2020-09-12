package inn.mroyek.bismillahsiakad.common

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.google.gson.JsonElement
import inn.mroyek.bismillahsiakad.BuildConfig
import java.text.SimpleDateFormat
import java.util.*


fun Context.toastShort(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.toastLong(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

inline fun <reified T : Activity> Activity.startNewActivity() {
    startActivity(Intent(this, T::class.java))
}

fun ImageView.loadImageresId(resIdInt: Int) {
    try {
        Glide.with(this.context)
            .load(resIdInt)
            .into(this)
    } catch (e: IllegalArgumentException) {
        e.printStackTrace()
    }
}

fun ImageView.loadImageStr(url: String?) {
    try {
        Glide.with(this.context)
            .load(url)
            .into(this)
    } catch (e: IllegalArgumentException) {
        e.printStackTrace()
    }
}

val Context.layoutInflater: LayoutInflater
    get() = LayoutInflater.from(this)

fun ViewGroup.inflating(resource: Int): View =
    LayoutInflater.from(context).inflate(resource, this, false)

fun logD(tag: String, s: String = "") {
    if (BuildConfig.DEBUG)
        Log.d(tag, s)
}

fun logI(tag: String, msg: String) {
    if (BuildConfig.DEBUG) Log.i(tag, msg)
}

fun logW(tag: String, msg: String) {
    if (BuildConfig.DEBUG) Log.w(tag, msg)
}

fun logE(tag: String, msg: String) {
    if (BuildConfig.DEBUG) Log.e(tag, msg)
}

fun toJsonElement(any: Any): JsonElement = Gson().toJsonTree(any)

fun String.parsingDate(format: String): String {
    val sdf = SimpleDateFormat(format, Locale.getDefault())
    val date = sdf.parse(this)
    val formating = SimpleDateFormat("E, dd MMM YYYY", Locale.getDefault())
    return formating.format(date!!)
}