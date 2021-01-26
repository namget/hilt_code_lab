package com.example.android.hilt

import android.app.Application
import android.content.Context
import androidx.test.internal.runner.junit3.AndroidJUnit3Builder
import androidx.test.runner.AndroidJUnitRunner
import dagger.hilt.android.testing.HiltTestApplication

/**
 * Created by Namget on 2021.01.26.
 */

class CustomTestRunner : AndroidJUnitRunner(){
    override fun newApplication(
        cl: ClassLoader?,
        className: String?,
        context: Context?
    ): Application {
        return super.newApplication(cl, HiltTestApplication::class.java.name, context)
    }
}