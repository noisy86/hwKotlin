package educa;

import java.util.*

fun main () {
    val scanner  = Scanner(System.`in`)
    println("Enter String");
    val userInput = scanner.nextLine()
    var sum = 0;
    var temp = "0"
    for (i in 0..userInput.length-1){
        val ch: Char = userInput[i];
        if (Character.isDigit(ch))
            temp += ch;

        // if current character is an alphabet
        else {
            // increment sum by number found earlier
            // (if any)
            sum += Integer.parseInt(temp);

            // reset temporary string to empty
            temp = "0";
        }
    }
    System.out.println(sum+ Integer.parseInt(temp));

}