package com.example.practicasem02

import java.security.KeyStore

fun main(){

    //content example #1
    val myInteger = 978
    val myLonger = myInteger.toLong()

    //#2 content example #2
    val strNumber = "101" //declared as string
    val intValue = strNumber.toInt() // the variable strNumber converted to integer
    val intValue2 = "101".toInt() //converting to Int in the same line

    // using the boolean values
    val myTrueValue = true
    val myFalseValue = false
    val a = 1
    val b = 3
    val c = 4
    val d = 6
    val n = a<d && b<c //n is true
    val myStr = "This is a String"
    val escString = "This is a string with new line \n"
    val multiLines = """
        First Line
        Second Line
        Third Line
    """.trimIndent()// Delete the sangria in the 3 lines
    val accBalance = 200
    val bankMessage = "Your account balance is $accBalance"
    val name = "Harold"
    val message = "The first letter in my name is ${name.first()}"//The first letter in my name is H
    val age = 20
    val anotherMess= "You are ${if (age>=18) "adult" else "young"}"


    showResults(n, myLonger, intValue, intValue2, myStr, escString,multiLines)
    arrayExamp()
}



fun showResults(n: Boolean, myLong: Long, intValue: Int, intValue2: Int, myStr: String,
        esc: String, multi: String) {
    println("The variable myLonger Type is: ${myLong::class.simpleName}")
    println("The variable intValue Type is: ${intValue::class.simpleName}")
    println("The variable intValue2 Type is: ${intValue2::class.simpleName}")
    println("The comparison between the values is: ${n}")
    println(myStr)
    println(esc)
    println(multi)

}

fun arrayExamp() {
    // we can include values of different types in the same array (Mixed array)
    val array1 = arrayOf(4,5,7,3)
    val array2 = arrayOf(4,5,7,3,"Chicken", false)
    // 2 ways to build an array that only include one value type
    val array3 = arrayOf<Int>(1,2) //will not compile with others types
    val array4 = intArrayOf(4,2,3) //will not compile with others types

}