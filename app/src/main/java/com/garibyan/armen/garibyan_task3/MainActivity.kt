package com.garibyan.armen.garibyan_task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS

            //WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE amit varesizebdi, rodesac keyboardi gamodioda
        )
        setContentView(R.layout.activity_main)
    }
}