package com.example.practicasem02

fun main(){
    var suma= 0
    val num = 2
    var matriz=Array(num){IntArray(num)}
    for(i in (0 until num)){

        for(j in (0 until num)){
            matriz[i][j]= num
            suma += matriz[i][j]
        }
    }

    for(f in(0 until num)){
        for(c in(0 until num)){
            print("${matriz[f][c]},")
        }
        println()
    }
    println("El total de la matriz es: $suma")

}