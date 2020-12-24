package com.exciteon.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.exciteon.R
import com.exciteon.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    lateinit var mBinding:ActivityAuthBinding
    private val viewModel:AuthViewModel by lazy{
        ViewModelProviders.of(this).get(AuthViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_auth)
        mBinding.viewModel = viewModel
    }
}