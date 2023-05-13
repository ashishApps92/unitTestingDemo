package com.example.DemoTesting.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test
import java.lang.IllegalArgumentException

class HelperTest {
    lateinit var sut: Helper // system under test
    @Before
    fun setUp(){
        sut = Helper()
    }
    @Test
    fun isPalindrome_inputString_expectedFase() {
        val result = sut.isPalindrome("Hello")
        assertEquals(false, result)
    }

    @Test
    fun isPalindrome_inputString_ExpectedTrue(){
        val result = sut.isPalindrome("level")
        assertEquals(true, result)
    }

   /* @After
    fun tearDown(){
        println("After every test case")
    }*/

    @Test
    fun passWordValidate_inputBlank_expectedReqMsg(){
        val result = sut.passwordValidate(" ")
        assertEquals("password is required field", result)
    }

    @Test
    fun passWordValidate_inputMin_expectedMinMsg(){
        val result = sut.passwordValidate("1234")
        assertEquals("length of password should be greater than 6", result)
    }

    @Test
    fun passWordValidate_inputMax_expectedMaxMsg(){
        val result = sut.passwordValidate("12345623498")
        assertEquals("length of password should be less than 10", result)
    }

    @Test
    fun passWordValidate_inputValid_expectedValid(){
        val result = sut.passwordValidate("1234567")
        assertEquals("password is valid", result)
    }

    @Test
    fun reverseString_inputValid_expectedValid() {
        val result = sut.reverseString("ashish")
        assertEquals("hsihsa", result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun reverseString_inputnull_expectedException() {
        val result = sut.reverseString(null)
        // not need assert
    }
}