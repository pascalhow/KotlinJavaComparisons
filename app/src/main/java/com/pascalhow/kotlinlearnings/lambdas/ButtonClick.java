package com.pascalhow.kotlinlearnings.lambdas;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ButtonClick {
    public ButtonClick(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "ButtonClicked" + v.getId());
            }
        });

    }
}
