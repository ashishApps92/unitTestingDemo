package com.example.DemoTesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Rule
import org.junit.Test

class SecondActivityTest {

    @get:Rule
    val activityTest = activityScenarioRule<SecondActivity>()

    @Test
    fun buttonClickTest(){
        onView(withId(R.id.tvName)).perform(typeText("Ashish"))
        onView(withId(R.id.tvAge)).perform(typeText("31"), closeSoftKeyboard())
        onView(withId(R.id.btn)).perform(click())

        onView(withId(R.id.tvThird)).check(matches(withText("Ashish 31")))
    }
}