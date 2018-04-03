package com.pascalhow.kotlinlearnings.lambdas

import android.util.Log
import android.widget.Button

class ButtonClickKt(button: Button) {
    init {
        button.setOnClickListener { Log.d("TAG", "ButtonClicked ${it.id}") }
        button.addOnLayoutChangeListener { v, left, top, right, bottom, _, _, _, _ ->
            Log.d("TAG", "ButtonClicked ${v.id} left:$left top:$top right:$right bottom:$bottom")
        }
        button.setOnFocusChangeListener { v, focus -> Log.d("TAG", "onFocusChange:${v.id} focus:$focus") }
    }
}
