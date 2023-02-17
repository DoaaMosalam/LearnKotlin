package Generic

import java.util.*
import kotlin.collections.RandomAccess
import kotlin.random.Random

//Create Generic from fun
fun main(args: Array<String>) {
    printTwice<String>("Doaa")
    println(pickRandom("Doaa","Arabic Teacher","Android Developer"))
    foo("Doaa Mosalam",25)
}



fun <T> printTwice(a:T){
    for(i in 1..2){
        println(a)
    }
}

fun <T> pickRandom(a:T,b:T,c:T):T{
    val random=Random.nextInt()
    return when(random){
        0 -> a
        1 -> b
        else ->c
    }
}
fun <T,E> foo(a:T ,b: E){
    print(a.toString() + b.toString())
}

