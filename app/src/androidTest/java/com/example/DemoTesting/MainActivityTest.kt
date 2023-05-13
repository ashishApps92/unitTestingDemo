package com.example.DemoTesting

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.hamcrest.core.AllOf.allOf
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()


    @Test
    fun clickButtonTest(){
        onView(withId(R.id.btn1)).perform(click())
        onView(withId(R.id.btn1)).perform(click())
        onView(withId(R.id.btn1)).perform(click())
        onView(withId(R.id.tvMsg)).check(matches(withText("count 3")))
        //onView(withId(R.id.tvMsg)).perform(typeText("done"))
    }

    @Test
    fun checkIntent_expectedIntent(){
        Intents.init()  // espresso intent
        val expected = allOf(hasAction(Intent.ACTION_SEND))
        onView(withId(R.id.btn2)).perform(click())
        intended(expected)
        Intents.release()
    }
}