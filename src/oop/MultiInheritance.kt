package oop
fun main (args:Array<String>){
    val a = Operation()
    a.sum(2,3)
    a.sub(9,6)
}
class MultiInheritance {
    interface  Sum2{
        fun sum(a:Int,b:Int)
    }
    interface Sub2{
        fun sub(a:Int,b:Int)
    }

    class Operation:Sum2,Sub2 {
        override fun sum(a: Int, b: Int) {
                println("$a + $b = ${a+b}")

        }

        override fun sub(a: Int, b: Int) {
            println("$a - $b = ${a-b}")
        }
    }
}