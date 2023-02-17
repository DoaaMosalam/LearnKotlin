package try_catch

fun main(args: Array<String>) {
   tr@while (true) {
        try {
            print("Enter your age:")
            val age: Int = readLine()!!.toInt()
            println("Your age is: $age years")
            break@tr
        } catch (e: Exception) {
            println("You entered wrong value.")
            continue@tr
        }
    }
    println("Done")
}