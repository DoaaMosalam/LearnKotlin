package Companion_Object

fun main() {
    User.printInfo()
    Client.orderC()

}
object User{
    var name:String="Doaa"
    var age = 30
    fun printInfo(){
        println("$name $age")
    }
}

class Client {
    companion object {
//        var nameClient :String?=null
//        var ageClient:Int?=null
        var order:String?=null
        fun orderC(){
            println("Enter your Info: ")
            User.name = readLine().toString()
            println("Enter your age: ")
            User.age= readLine()!!.toInt()
            println("Enter your order: ")
            order= readLine().toString()
            println("${User.name} \n ${User.age} \n $order")
        }

    }
}

