package InfixNotation

fun main(args: Array<String>) {
    val sum = 5 add 5 //infix call
    println(sum)
}

infix fun Int.add(value:Int):Int = this + value