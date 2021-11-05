package educa

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val aus = "Australie|dolar|1|AUD|15,687".split("|").toTypedArray()
    val kurz =  BigDecimal(1/aus[4].replace(',', '.').toDouble()).setScale(5, RoundingMode.HALF_EVEN)
    val kurz1 = BigDecimal(1/aus[4].replace(',', '.').toDouble() * 30).setScale(4,RoundingMode.HALF_EVEN)

    println("$kurz = 1 CZK");
    println("30 CZK = $kurz1")

}