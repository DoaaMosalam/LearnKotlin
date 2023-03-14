package oop

class Add {
    fun addNumber():Int{
        var numOne:Int?=null
        var numTwo:Int?=null
        println("Enter two numbers: ")
        for (i in 0..2){
            println("Enter the first number: ")
             numOne = readLine()!!.toInt()
            println("Enter the second number: ")
             numTwo= readLine()!!.toInt()
            break
        }
        val result = numOne!! + numTwo!!
        println("Addition Two Numbers is = $result")
        return result
    }
}
fun main (args:Array<String>){
    var add= oop.Add()
    add.addNumber()
}