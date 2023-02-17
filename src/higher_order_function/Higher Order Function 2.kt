package higher_order_function

fun main(args:Array<String>){
    sum(10,5,::myFun)
}

fun sum(a:Int,b:Int,myFun:(Int,Int)->Unit){
   myFun(a,b)

}
fun myFun(a:Int,b:Int){
    var total=0
    total=a+b
    println("Sum= $total")
}