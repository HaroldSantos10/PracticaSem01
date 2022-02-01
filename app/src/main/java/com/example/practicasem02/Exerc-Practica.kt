package com.example.practicasem02

fun main() {
    // part IV
    val res1 = numSum(a= 3, b= 5)
    val res2 = numSum(a= -8, b= 10)
    val res3 = numSum(a= null, b= null)
    val res4 = numSum(16, b= 25)
    val res5 = numSum(a= 20, b= 29)
    val res6 = numSum(a= 9, b= -8)
    val res7 = numSum(a= 3, b= null)
    val res8 = numSum(a= null, b= null)
    val res9 = numSum(a= 52, b= 48)
    val res10 = numSum(a= 96, b= 100)
    println("Test1 passed ${res1==8}")
    println("Test2 passed ${res2==-1}")
    println("Test3 passed ${res3==-2}")
    println("Test4 passed ${res4==41}")
    println("Test5 passed ${res5==49}")
    println("Test6 passed ${res6==-1}")
    println("Test7 passed ${res7==3}")
    println("Test8 passed ${res8==-2}")
    println("Test9 passed ${res9==100}")
    println("Test10 passed ${res10==196}")


}

fun numSum(a: Int?, b: Int?): Int?{

    var result = -1

    if(a != null && b != null){
        if (a >= 0 && b >= 0){
            result = a+b
        }
    }else{
        if (a == null && b == null){
            result = -2
        }else{
            result = if (a!=null) a else b!!
        }
    }
    return result
}

/*
* a= 3, b= 5, result= 8
* a= -8, b= 10, result= -1
* a= null, b= null, result= -2
* a= 16, b= 25, result= 41
* a= 20, b= 29, result= 49
* a= 9, b= -8, result= -1
* a= 3, b= null, result= 3
* a= null, b= null, result= -2
* a= 52, b= 48, result= 100
* a= 96, b= 100, result= 100
 */