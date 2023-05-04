package AnonymousClass

fun main() {
//    val info = A("Doaa")
//    println(info.printInfo())
    var info = object {
        val name = "Doaa"
        val age = 30
        val job = "Software Engineer"
        override fun toString()="My name is:$name,$age and my career is: $job"
        fun projects(){
            println("I create new project is shopping online.")
        }
    }
    println(info)
    println(info.projects())

}


class A(val name:String){
    fun printInfo(){
        println("$name")
    }
}