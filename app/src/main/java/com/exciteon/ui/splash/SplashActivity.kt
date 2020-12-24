package com.exciteon.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.exciteon.R
import com.exciteon.databinding.ActivitySplashBinding
import com.exciteon.ui.auth.AuthActivity

class SplashActivity : AppCompatActivity(),SplashNavigator {
    private lateinit var mBinding:ActivitySplashBinding
    private val viewModel:SplashViewModel by lazy {
        ViewModelProviders.of(this).get(SplashViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_splash)
        mBinding.viewModel = viewModel

        Handler(Looper.getMainLooper()).postDelayed({
            openLoginActivity()
        },2000)

    }

    override fun openHomeActivity() {

    }

    override fun openLoginActivity() {
        startActivity(Intent(this,AuthActivity::class.java))
        finish()
    }
}