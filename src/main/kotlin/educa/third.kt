package educa

import java.util.*

fun main(){

    val scanner  = Scanner(System.`in`)
    println("Enter cisla");

    var minCislo :Int = 0;
    var maxCislo :Int = 0;
    var moves :Int = 0;
    while(scanner.hasNext()) {
        var cisla = scanner.nextInt();
        if (moves == 0){
            minCislo = cisla;
        }
        if (cisla < minCislo) {
            minCislo = cisla;
        }
        if (cisla > maxCislo) {
            maxCislo = cisla;
        }
        moves++;
    }
        println("min number = " + minCislo + " max cislo = " + maxCislo);
}

