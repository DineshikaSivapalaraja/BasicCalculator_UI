package com.dineshi.se_2019_045_ass01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dineshi.se_2019_045_ass01.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}