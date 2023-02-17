package oop

fun main(args: Array<String>) {
    var a = GenericClass<Int,Int>()
    a.x=10
    a.y=3
    val s =GenericClass<Double,Boolean>()
    s.x=67.8
    s.b=true

    a.myFun(2,4)
    s.myFun(3.8,true)

    a.myFun2(4)
    s.myFun2(342.77)
}



class GenericClass <T,E>{
    var x:T?=null
    var y:T?=null
    var b:E?=null
    fun myFun(a:T,w:E){

    }
    fun myFun2(a:T):T{
        return a
    }

}