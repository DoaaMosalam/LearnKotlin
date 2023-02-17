package lambda_expression

fun main(args:Array<String>){
    firstFun()
    firstLambda()
    println("===========================================================================")
    secondFun(3)
    secondLambda1(7)
    secondLambda1(9)
    println("===========================================================================")
    println(thirdFun())
    println(Thirdlambda())
    println("===========================================================================")
    println( fourthFun(5))
    println(fourthLambda(5))
    println(fourthLambda1(5))
    println("===========================================================================")
    println(sumFun(2,3))
    println(sumLambda(2,3))
    println(sumLambda1(2,3))




}

fun firstFun(){
    println("Hello from my first function") }
val firstLambda = {-> println("Hello from my first lambda") }
//========================================================================================
fun secondFun(a:Int){
    println("a=$a") }
val secondLambda= {a:Int->println("a=$a")}
val secondLambda1:(Int)-> Unit={ a -> println("a=$a") }
//========================================================================================
fun thirdFun():String{
    return "Hello from my fun" }
val Thirdlambda:() ->String = {-> "Hello" }
//========================================================================================
fun fourthFun(a:Int): Int {
    return a*a
}

val fourthLambda = {a:Int -> a*a}
val fourthLambda1:(Int) -> Int = {a -> a*a}
//========================================================================================

fun sumFun(a:Int,b:Int):Int{
    return a+b;
}
val sumLambda:(Int,Int) -> Int ={a,b -> a+b}
val sumLambda1 = { a:Int,b:Int -> a+b}

