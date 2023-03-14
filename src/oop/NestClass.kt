package oop

fun main() {
    val obj = Nested()
    obj.sayHi="Hello in,"
   println(obj.NestedTwo().Info())
    println("======================================")
    val obj2 = Nested.NestedThree()
    obj2.Info2()

}

class Nested{
var sayHi:String=""
   inner class NestedTwo{
        var name:String="$sayHi This is Nested class Two: "
        fun Info() =println(name)
    }
    class NestedThree{
        val name2:String ="This is Nested class Three:"
        fun Info2()= println(name2)
    }

}