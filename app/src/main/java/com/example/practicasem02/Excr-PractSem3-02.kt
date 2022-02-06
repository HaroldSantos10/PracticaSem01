package com.example.meyapp

fun main() {
    var a1 = arrayOf<Int?>(10,57,24,36,86,90)
    var a2 = arrayOf<Int?>(null, null, null)
    var a3 = arrayOf<Int?>()
    var a4 = arrayOf<Int?>(54, 15, 51, 100, 50)
    var a5 = arrayOf<Int?>(35,45,56,78,12,100)
    val a6 = arrayOf<Int?>()
    val a7 = arrayOf<Int?>(null, null)
    val a8 = arrayOf<Int?>(5,9,6)
    val a9 = arrayOf<Int?>()
    val a10 = arrayOf<Int?>(null,null,null)

    val res1 = orderArray(a1)
    val res2 = orderArray(a2)
    val res3 = orderArray(a3)
    val res4= orderArray(a4)
    val res5 = orderArray(a5)
    val res6 = orderArray(a6)
    val res7 = orderArray(a7)
    val res8 = orderArray(a8)
    val res9 = orderArray(a9)
    val res10 = orderArray(a10)

    for (i in res4){
        println(i)
    }

    println("Test1 passed ${res1.toString()=="(908657362410)"}")//90 86 57 36 24 10
    println("Test2 passed ${res2.isEmpty()}")
    println("Test3 passed ${res3.isEmpty()}")
    println("Test4 passed ${res4.toString()=="(10054515015)"}")//100 54 51 50 15
    println("Test5 passed ${res5.toString()=="(1007856453512)"}")//100 78 56 45 35 12
    println("Test6 passed ${res6.isEmpty()}")
    println("Test7 passed ${res7.isEmpty()}")
    println("Test8 passed ${res8.toString()=="(965)"}")//9 6 5
    println("Test9 passed ${res9.isEmpty()}")
    println("Test10 passed ${res10.isEmpty()}")


}

fun orderArray(args: Array<Int?>): Array<Int?>{
    var results = arrayOf<Int?>()
    var total = 0
    if (args.isNotEmpty() && !args.contains(null)){
        results = ordMajor(args)

    } else if(args.contains(null)){
        results = emptyArray()
    }else if(args.isEmpty()){
        results = emptyArray()
    }

    return results
}

fun ordMajor(args: Array<Int?>): Array<Int?>{
    var aux = 0
    val tama = args.size
    for(i in 0 until tama-1){

        for(j in 0 until tama-1){
            if(args[j]!! < args[j+1]!!){
                aux = args[j]!!
                args[j] = args[j+1]
                args[j+1] = aux
            }
        }
    }
    return args
}

fun ComOrder(args: Array<Int?>): Boolean{
    var check = true
    var compro = booleanArrayOf()
    for( i in(args.indices)){
        if (i > args[i]!!){
            compro[i]= true
        }
        else{
            compro[i]= false
        }
    }
    check = compro.find { false } == true

    return check
}
