package Functional_SAM_Interfaces

/*An interface with only one abstract method is called a functional interface,
 or a Single Abstract Method (SAM) interface.
 The functional interface can have several non-abstract members but only one abstract member.*/
fun interface InfoPerson{
    fun printInfo():String
/* this is error*/
//    fun printName():String
/*this accepted*/
//    fun printName(){
//
//    }
//    fun printAge(){
//
//    }
}

fun main() {
    val obj = object :InfoPerson{
        override fun printInfo(): String {
            println("Enter your\n1.name\n2.age")
            val name = readLine().toString()
            val age = readLine()!!.toInt()
            return "$name $age"
        }
    }
    println(obj.printInfo())
}