package educa

import java.util.*


fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter cislo")
    val cislo = scanner.nextInt()
    for (i in 1..cislo){
        if (jeDokonale(i)){
            println(i)
        }
    }
}

fun jeDokonale(num :Int): Boolean{
    var sum = 0
    for(i in 1..num-1){
        if (num % i == 0){
            sum += i
        }
    }
    return num == sum
}