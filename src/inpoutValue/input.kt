package inpoutValue

import java.util.*

fun main(args:Array<String>){
  println("We need fill this frame.")
    //input
    println("Enter your name:")
    val name:String?= readLine()
    println("Enter your Birth year:")
    //processing
    val birthYear:Int = readLine()!!.toInt()
    val age:Int=Calendar.getInstance().get(Calendar.YEAR)-birthYear

    println("Your name is: $name\nage is: $age")

}