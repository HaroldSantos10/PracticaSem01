package com.example.practicasem02

fun main(){
    val a1 = arrayOf<Int?>(1,2,3)
    val a2 = arrayOf<Int?>(10,null,3)
    val a3 = arrayOf<Int?>()
    val a4 = arrayOf<Int?>(71,27,43)
    val a5 = arrayOf<Int?>(1,42,38)
    val a6 = arrayOf<Int?>()
    val a7 = arrayOf<Int?>(16,2,73)
    val a8 = arrayOf<Int?>()
    val a9 = arrayOf<Int?>()
    val a10 = arrayOf<Int?>(15,null,33)

    val res1 = SumArray(a1)
    val res2 = SumArray(a2)
    val res3 = SumArray(a3)
    val res4 = SumArray(a4)
    val res5 = SumArray(a5)
    val res6 = SumArray(a6)
    val res7 = SumArray(a7)
    val res8 = SumArray(a8)
    val res9 = SumArray(a9)
    val res10 = SumArray(a10)
    println("Test1 passed ${res1==6}")
    println("Test2 passed ${res2==-2}")
    println("Test3 passed ${res3==-1}")
    println("Test4 passed ${res4==141}")
    println("Test5 passed ${res5==81}")
    println("Test6 passed ${res6==-1}")
    println("Test7 passed ${res7==91}")
    println("Test8 passed ${res8==-1}")
    println("Test9 passed ${res9==-1}")
    println("Test10 passed ${res10==-2}")

}

fun SumArray(args: Array<Int?>): Int{
    var total = 0
    if (args.isNotEmpty() && !args.contains(null)){
        for (index in args){
            total += index!!
        }
    } else if(args.contains(null)){
        total = -2
    }else if(args.isEmpty()){
        total = -1
    }
    return total

}