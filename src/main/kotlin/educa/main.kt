package educa;
import java.util.Scanner


fun main(args: Array<String>) {
    val scanner  = Scanner(System.`in`)
    println("Enter String");
    val userInput = scanner.nextLine()
    val ab = "AB";
    val ba = "BA";
    if (userInput.length <= 3) {
        println("NO");
    }else if(userInput.contains(ab) && userInput.contains(ba) ){
        println("YES");
    }else {
        println("NO");
    }


}



