package com.vacax.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ARouter.openDebug();
        ARouter.init(application);
        sleep(1000)
        ARouter.getInstance().build("/test/webview")
                .withString("url", "file:///android_asset/" + "gu.html")
                .navigation();
    }
}