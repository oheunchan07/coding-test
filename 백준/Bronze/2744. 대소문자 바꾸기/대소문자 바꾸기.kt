import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()

    str.forEach {
        print(
            when (it) {
                in 'A'..'Z' -> it + 32  
                in 'a'..'z' -> it - 32  
                else -> it 
            }
        )
    }
}
