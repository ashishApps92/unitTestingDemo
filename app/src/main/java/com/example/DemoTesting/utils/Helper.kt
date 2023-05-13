package com.example.DemoTesting.utils

import java.lang.IllegalArgumentException

class Helper {
    fun isPalindrome(value: String) : Boolean{
        var i = 0
        var j = value.length - 1
        var charArray = value.toCharArray()
        while (i < j) {
            if(charArray[i] != charArray[j]) {
                return false
            }
            i++
            j--
        }
        return true
    }

    fun passwordValidate(input: String) : String {
        return if(input.isBlank()) {
            "password is required field"
        } else if (input.length < 6) {
            "length of password should be greater than 6"
        } else if (input.length > 10) {
            "length of password should be less than 10"
        } else {
            "password is valid"
        }
    }

    fun password_validate_with_when(input: String) = when {
       input.isBlank() -> {
           "password is required field"
       }
        input.length < 6 -> {
            "length of password should be greater than 6"
        }
        input.length > 10 -> {
            "length of password should be less than 10"
        } else -> {
            "valid"
        }
    }

    fun reverseString(input : String?): String {
        if(input == null){
            throw IllegalArgumentException("enter valid input")
        }
        var left = 0;
        var right = input.length - 1
        val strArray = input.toCharArray()
        var temp = ' '
        while (left < right) {
            temp = strArray[left]
            strArray[left] = strArray[right]
            strArray[right] = temp
            left++
            right--
        }
        return strArray.joinToString("")
    }
}