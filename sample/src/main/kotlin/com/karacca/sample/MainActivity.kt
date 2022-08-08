package com.karacca.sample

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.karacca.beetle.Beetle

/**
 * @author karacca
 * @date 11.07.2022
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Beetle.setCustomKey("Custom Test", 1)
    }

    override fun onResume() {
        super.onResume()
        Handler().postDelayed({
            Beetle.onShake()
        }, 200)
    }
}