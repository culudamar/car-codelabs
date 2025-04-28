package com.example.places.carappservice

import android.content.Intent
import android.util.Log
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator
import com.example.places.carappservice.screen.MainScreen
import androidx.car.app.CarAppService

class PlacesCarAppService : CarAppService() {

    private val TAG = "PlacesCarAppService"

    init {
        Log.d(TAG, "PlacesCarAppService() constructor called")
    }

    override fun createHostValidator(): HostValidator {
        Log.d(TAG, "createHostValidator() called")
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreateSession(): Session {
        Log.d(TAG, "onCreateSession() called")
        return PlacesSession()
    }
}

class PlacesSession : Session() {
    private val TAG = "PlacesCarAppService"
    override fun onCreateScreen(intent: Intent): Screen {
        Log.d(TAG, "onCreateScreen() called")
        return MainScreen(carContext)
    }
}