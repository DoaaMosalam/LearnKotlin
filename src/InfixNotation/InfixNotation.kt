package InfixNotation

fun main(args: Array<String>) {
    val sum = 5 add 5 //infix call
    println(sum)
    //===========================================================
    val mul = 5 multiplay 5
    println(mul)
    //=========================================================
    val info = "Doaa Mosalam" printInfo  " Software Engineer"
    println(info)
}

infix fun Int.add(value:Int):Int = this + value
infix fun Int.multiplay(value: Int) = this * value
infix fun String.printInfo(person:String):String = this + person