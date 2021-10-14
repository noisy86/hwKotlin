package educa

import java.util.*

fun main() {
    val scanner  = Scanner(System.`in`)
    println("Enter cisla")
    var cisla = scanner.nextLine()
    var sum = 0;
    for(i in 1..cisla.length-1 step 2){
        var cislo = Integer.parseInt(cisla[i].toString());
        if (cislo % 3 == 0) {
            sum+=cislo;
        }
    }
    println(sum);
}