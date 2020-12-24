package com.exciteon.ui.auth

interface AuthNavigator {
    fun navigateToNextScreen(screen: AuthViewModel.Screen,vararg params:String)
}