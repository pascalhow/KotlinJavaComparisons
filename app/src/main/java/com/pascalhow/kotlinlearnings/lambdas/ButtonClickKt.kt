package com.pascalhow.kotlinlearnings.lambdas

import android.util.Log
import android.widget.Button

class ButtonClickKt(button: Button) {
    init {
        button.setOnClickListener { Log.d("TAG", "ButtonClicked ${it.id}") }
    }
}
