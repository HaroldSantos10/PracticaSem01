package com.example.meyapp

fun main(){
    var caso1: Array<Int> = arrayOf(1, 5, 9,41,27,56,32)
    var caso2: Array<Int> = arrayOf(1, 18, 9,27,45,48,68)
    var caso3: Array<Int> = arrayOf(54, 15, 50, 100, 50)
    var caso4: Array<Int> = arrayOf(35,45,56,78,12,100)
    var caso5: Array<Int> = arrayOf(10,24,36,57,86,90)
    var res1 = searchData(caso1, 5) //1
    var res2 = searchData(caso2, 18) //1
    var res3 = searchData(caso3, 50) //2
    var res4 = searchData(caso4, 78) //3
    var res5 = searchData(caso5, 90) //5
    var res6 = searchData(caso1, 27) //4
    var res7 = searchData(caso2, 68) //6
    var res8 = searchData(caso3, 100) //3
    var res9 = searchData(caso4, 12) //4
    var res10 = searchData(caso5, 86) //4
    println("searchData(caso1, n=5) Test passed ${res1==1}")
    println("searchData(caso2, n=18) Test passed ${res2==1}")
    println("searchData(caso3, n=50) Test passed ${res3==2}")
    println("searchData(caso4, n=78) Test passed ${res4==3}")
    println("searchData(caso5, n=90) Test passed ${res5==5}")
    println("searchData(caso1, n=27) Test passed ${res6==4}")
    println("searchData(caso2, n=68) Test passed ${res7==6}")
    println("searchData(caso3, n=100) Test passed ${res8==3}")
    println("searchData(caso4, n=12) Test passed ${res9==4}")
    println("searchData(caso5, n=86) Test passed ${res10==4}")
}
fun searchData(colleccion:Array<Int>, number: Int):Int{
    var pos=0
    for(i in colleccion){
        if(i==number){
            return pos
        }
        pos += 1
    }
    return -1
}
fun searchData2(colleccion:Array<Int>, number: Int):Int{
    colleccion.forEachIndexed({p, i -> if(i==number) return p})
    return -1
}