package com.example.DemoTesting.utils

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class ParametrisedTestCase(val input : String, val expected : Boolean) {

    @Test
    fun test() {
        val helper = Helper()
        val result = helper.isPalindrome(input)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        @Parameters (name = "{index}: {0} is palindrome - {1}")
        fun data() : List<Array<Any>>{
            return listOf(
                arrayOf("Hello", false),
                arrayOf("level", true),
                arrayOf("", true),
                arrayOf("a", true),
            )
        }
    }
}