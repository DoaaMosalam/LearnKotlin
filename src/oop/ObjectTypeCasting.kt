package oop

//fun main(args: Array<String>) {
//    var x=X()
//    var y= Y()
//    x=y as X
//}
//class X
//class Y

      //or

fun main(args: Array<String>){
    var y=Y()
    var d = y.casting()
    d.a=10
    println("$d")
}
class X{
    var a:Int?=null
}
class Y{
    fun casting():X{
        var s = X()
        return s
    }
}
