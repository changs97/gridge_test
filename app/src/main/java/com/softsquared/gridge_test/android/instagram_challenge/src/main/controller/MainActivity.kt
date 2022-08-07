package com.softsquared.gridge_test.android.instagram_challenge.src.main.controller

import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.softsquared.gridge_test.android.instagram_challenge.config.BaseActivity
import com.softsquared.gridge_test.android.instagram_challenge.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

    }
}