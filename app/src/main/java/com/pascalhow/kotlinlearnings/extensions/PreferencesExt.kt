package com.pascalhow.kotlinlearnings.extensions

import android.content.SharedPreferences

fun SharedPreferences.edit(action: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.action()
    editor.apply()
}
