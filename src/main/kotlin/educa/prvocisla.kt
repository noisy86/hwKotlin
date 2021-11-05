package educa
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter cislo")
    val cislo = scanner.nextInt()
    for (i in 2..cislo) {
        if (jePrvocislo(i)) {
            println(i)
        }
    }
}
fun jePrvocislo(num: Int): Boolean {
    var tf = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            tf = false
            break
        }
    }
    return tf
}
