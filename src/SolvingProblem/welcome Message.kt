package SolvingProblem

fun main() {
    val print = PrintWelcomeMessage()
    println("Hello, World.")
    println(print.printMessage())
}

class PrintWelcomeMessage{
    fun printMessage(){
        val message:String? = readLine()
        println("$message")
    }
}