package com.example.meyapp

import android.widget.Toast
import kotlin.math.abs //import
import java.util.Random
fun main(){
    //Control Structure
    val num = 1
    if (num == 7){
        println("Sunday")
    }else{
        println("Any day least Sunday")
    }
    val num2 = 2
    if(num2 == 1 ){
        println("Monday")
    }else if(num == 2){
        println("Tuesday")
    }else {
        println("Any day least monday and tuesday")
    }

    //If variant to fill the variable
    val answerString: String = if(num == 1){
        "Monday"
    }else if(num==2){
        "Tuesday"
    }else{
        "Any day least Monday and Tuesday"
    }
    print(answerString)

    //Other example
    val x = -70
    var message = ""
    if (x>0){
        message = "The number is greater than 0"
    } else if (x==0){
        message= "The number is equal than 0"
    }
    //Toast.makeText(this,"$message", Toast.LENGTH_LONG).show()

    //other example
    val age = 28
    val message2 = "You´re a person ${if(age<18)"teen" else "adult"}"
    val names = listOf("Anne","Peter","Jeff")
    for(name in names){
        println(name)
    }
    //Until Structure
    for (x in 0 until 10 step 2){
        print(x)
    }
    for (y in 0 until 10 step 2){
        print(y)
    }
    //count to down
    for (z in 10 downTo 0 step 2){
        print(z)
    }
    //Control Structure "when"
    val vehicle = "Bike"
    var mess = when (vehicle){
        "Car"->{
            "Four Wheels"
        }
        "Bike"->{
            "Two wheels"
        }
        else ->{
            "Unknown number of wheels"
        }
    }
    val riskAssessment = 246
    val risk = when (riskAssessment){
        in 1..20 ->"negligible risk"
        in 21..40 ->"minor risk"
        in 41..60 ->"major risk"
        else -> "undefined risk"
    }
    //while structure
    var a = 0
    while(a<10){
        print(a)
        a++
    }
    //Range in Kotlin
    val aToZ='a'..'z'
    val oneToNine = 1..9
    //Until Range
    for (a in 1 until 15){
        print("$a \n")
    }
    //dropWhile
    val string = "<<<First Grade>>>"
    println(string.drop(6))
    println(string.dropLast(6))
    println(string.dropWhile { !it.isLetter() })
    println(string.dropLastWhile { !it.isLetter() })
    // try Catch
    try {
        val data = 20 / 0  //may throw exception
    } catch (e: ArithmeticException) {
        println(e)
    }
    println("code below exception...")
    val f = -45.23f;
    val d = 999.32;
    println(abs(f));
    println(abs(d));
    val randomNumber: Int = Random().nextInt(10)
    println(randomNumber)
}

//functions
fun happyBirthday(name:String,age:Int): String{
    return "Happy ${age}th birthday, $name"
}