package ifstatement

import java.util.*

fun main(args:Array<String>){
    val value:Boolean=true
    val ageRequest: Int =30

    val birthDay:Int=Calendar.getInstance().get(Calendar.YEAR)
    println("Enter your name:")
//    val name:String= readln()

    println("Enter your birthday:")
    val age:Int= birthDay-readLine()!!.toInt()
    if (ageRequest>age)
        println("Positive")
     else if (ageRequest<age)
        println("Negative")
    else
        println("Good Luck")

//    println("Your name $name\tage is $age")


}

