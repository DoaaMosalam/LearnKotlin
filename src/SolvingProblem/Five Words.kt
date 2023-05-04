package SolvingProblem

import java.util.*

fun main() {

//    println(Array(5){ readLine()}.joinToString (separator = " "))

    //or
    println(mutableListOf<String>().also
    { als -> repeat(5){als.add(readLine().toString())} }.joinToString(separator = " "))



}