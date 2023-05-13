package com.example.DemoTesting.androidUtils

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test
import java.lang.NullPointerException

class AndroidHelperTest {

    lateinit var helper : AndroidHelper

    @Before
    fun setUp() {
        helper = AndroidHelper()
    }

    @Test(expected = NullPointerException::class)
    fun showToast_inputNull_expectException() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        helper.showToast(context, null)
    }

    @Test
    fun showToast_inputNull_expectShowToast() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = helper.showToastMessage(context, "Hi, Ashish it is demo")
        assertEquals("Hi, Ashish it is demo", result)
    }
}