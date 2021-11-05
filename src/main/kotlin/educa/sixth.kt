package educa

import java.util.*


fun main() {
    val scanner  = Scanner(System.`in`)
    println("Enter cisla")
    val pocetCisel = scanner.nextInt()
    val arr = arrayOf<Int>()

    for (i in 0..pocetCisel) {
        val cisla = scanner.nextInt()
        arr[i] = cisla;
    }
//    if(hasDuplicates(arr)){
//        println("it has duplicates")
//    }else {
//        println("It has not duplicates")
//    }
}

