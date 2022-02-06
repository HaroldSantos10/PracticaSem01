package com.example.practicasem02

//#2 exercise with an array
fun main(){
    // using "intArrayOf()" the only type of value that the array can receive is Integer
    val numbers1 = arrayOf<Int>(12,8,4,25,54,7,10)
    //In this way we can build an array empty, inferring the type of value used in the array
    val numbers2 = arrayOf<Int>(95,7,10)
    val numbers3 = arrayOf<Int>()
    val numbers4 = arrayOf<Int>(4,25,54)
    val numbers5 = arrayOf<Int>(10,65,5)
    val numbers6 = arrayOf<Int>()
    val numbers7 = arrayOf<Int>(54,7,10)
    val numbers8 = arrayOf<Int>()
    val numbers9 = arrayOf<Int>(12,8,4)
    val numbers10 = arrayOf<Int>(1,10,40)

    val res1 = runArray(numbers1)
    val res2 = runArray(numbers2)
    val res3 = runArray(numbers3)
    val res4 = runArray(numbers4)
    val res5 = runArray(numbers5)
    val res6 = runArray(numbers6)
    val res7 = runArray(numbers7)
    val res8 = runArray(numbers8)
    val res9 = runArray(numbers9)
    val res10 = runArray(numbers10)
    println("Test1 passed ${res1==120}")
    println("Test2 passed ${res2==112}")
    println("Test3 passed ${res3==-1}")
    println("Test4 passed ${res4==83}")
    println("Test5 passed ${res5==80}")
    println("Test6 passed ${res6==-1}")
    println("Test7 passed ${res7==71}")
    println("Test8 passed ${res8==-1}")
    println("Test9 passed ${res9==24}")
    println("Test10 passed ${res10==51}")

}

fun runArray(args : Array<Int>): Int{// A function with an array as parameter
    var total = 0
    if (args.isNotEmpty()){
        for (index in args){
            total = total + index
        }
    } else{
        total = -1
    }
    return total
}



