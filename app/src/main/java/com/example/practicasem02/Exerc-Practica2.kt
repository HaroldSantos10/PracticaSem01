package com.example.practicasem02

//#2 exercise with an array
fun main(){
    // using "intArrayOf()" the only type of value that the array can receive is Integer
    val numbers1 = arrayOf<Int>(12,8,4,25,54,7,10)
    //In this way we can build an array empty, inferring the type of value used in the array
    val numbers3 = arrayOf<Int>()
    runArray(numbers1)
    runArray(numbers3)
}

fun runArray(args : Array<Int>){// A function with an array as parameter
    var total = 0
   if (args.isNotEmpty()){
       for (index in args){
           total = total + index
       }
    println("The sum total of the array is: ${total}")
   } else{
       total = -1
       println("Empty array, code: ${total}")
   }
}

