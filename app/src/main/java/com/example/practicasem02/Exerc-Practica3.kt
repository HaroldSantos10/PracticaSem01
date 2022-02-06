package com.example.practicasem02

fun main() {
// We use an array of 3 indexes, this way we can check the conditions
    val a1 = arrayOf<Int?>(1,2,3)
    val a2 = arrayOf<Int?>(10,null,3)
    val a3 = arrayOf<Int?>(27,27,27)
    val a4 = arrayOf<Int?>(71,27,43)
    val a5 = arrayOf<Int?>(1,42,38)
    val a6 = arrayOf<Int?>(91,91,91)
    val a7 = arrayOf<Int?>(16,2,73)
    val a8 = arrayOf<Int?>(1,1,1)
    val a9 = arrayOf<Int?>(41,52,3)
    val a10 = arrayOf<Int?>(15,null,33)

    val res1 = compare(a1)
    val res2 = compare(a2)
    val res3 = compare(a3)
    val res4 = compare(a4)
    val res5 = compare(a5)
    val res6 = compare(a6)
    val res7 = compare(a7)
    val res8 = compare(a8)
    val res9 = compare(a9)
    val res10 = compare(a10)
    println("Test1 passed ${res1==6}")
    println("Test2 passed ${res2==-100}")
    println("Test3 passed ${res3==0}")
    println("Test4 passed ${res4==-1}")
    println("Test5 passed ${res5==-2}")
    println("Test6 passed ${res6==0}")
    println("Test7 passed ${res7==91}")
    println("Test8 passed ${res8==0}")
    println("Test9 passed ${res9==-2}")
    println("Test10 passed ${res10==-100}")
}

fun compare(args : Array<Int?>): Int{
    var resp = 0
    resp = if(args.contains(null)){
        -100
    }else{
        comArray(args)
    }
    return resp
}

fun comArray(args : Array<Int?>): Int{
    var res = 0

    if(args[0]!! > args[1]!! && args[0]!! > args[2]!!){
        res = -1
    }else{
        if(args[1]!! > args[0]!! && args[1]!! > args[2]!!) {
            res = -2
        }else {
            if(args[2]!! > args[1]!! && args[2]!! > args[0]!!){
                for (index in args){
                    res += + index!!
                }
            }else {
                if(args[0] == args[1] && args[0] == args[2]){
                    res = 0
                }
        }   }
    }
    return res
}


