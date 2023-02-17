package oop
//Object, Companion Object
fun main(args: Array<String>) {
    A.y
    A.x
    A.sum()


    B.w
    B.e
    B.sum()

    val b = B()
    b.x=10
    b.y=10


}



object A {
    var x: Int? = null
    var y: Int? = null
    fun sum() {
        println("$x + $y =${x!! + y!!}")
    }
}


// or with used class you need to Companion object

class B {
    companion object {
        var w: Int? = null
        var e: Int? = null
        fun sum() {
            println("${A.x} + ${A.y} =${A.x!! + A.y!!}")
        }
    }


    var x:Int?=null
    var y:Int?=null
    fun sum(){
        println("$x + $y =${x!!+y!!}")
    }


}