package educa
import java.util.*
import kotlin.math.pow
import kotlin.math.roundToInt


fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter cislo")
    val cislo = scanner.nextInt()
    if (cislo >= 0){
        for (i in 0..cislo){
            if (jeArmstrong(i)){
                println(i)
            }
        }
    }
}


fun jeArmstrong(num :Int): Boolean{
    var sum = 0
    var strInt = num.toString()
    for (i in 0..num.toString().length - 1){
        var subInt = Character.getNumericValue(strInt[i])
        var finalVar = subInt.toDouble()
        sum = (sum + finalVar.pow(strInt.length)).roundToInt()
    }
    return sum == num
}