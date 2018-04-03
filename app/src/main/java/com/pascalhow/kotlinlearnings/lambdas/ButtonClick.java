package com.pascalhow.kotlinlearnings.lambdas;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ButtonClick {
    public ButtonClick(final Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "ButtonClicked:" + v.getId());
            }
        });

        button.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                String message =
                        "OnLayoutChange" + v.getId() +
                        "left:" + left +
                        "top:" + top +
                        "right:" + right +
                        "bottom:" + bottom;
                Log.d("TAG", message);
            }
        });

        button.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Log.d("TAG", "onFocusChange:" + v.getId() + "hasFocus:" + hasFocus);
            }
        });
    }
}
