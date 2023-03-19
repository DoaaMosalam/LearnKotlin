package oop

class OverLoad {
    fun sum(a:Double,b:Double){
        var result = a.plus(b)
        println("Sum:{$a,$b} = $result")
    }

    fun sum(a:Int,b:Int){
        var result = a+b
        println("Division:{$a,$b} = $result")
    }
    fun sum(a:Int,b:Double,d:Double){
        var result = a+b+d
        println("Multi:{$a,$b,$d} = $result")
    }
}

fun main(args:Array<String>){
    var over = oop.OverLoad()
    over.sum(3.5,2.9)
    over.sum(10,14)
    over.sum(10,2.5,12.9)

}