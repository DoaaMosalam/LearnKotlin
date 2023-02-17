package higher_order_function


fun main(args:Array<String>){

//    myFun1()
//    myFun2(9)
//   println(myFun3())
//    println(myFun4(2))
    //=============================================================================
//    println(mylambda6(3,"Doaa"))

   println(sum(3,9, myLambda5))
    println(division(9,5, myLambda6))

}
/* this is normal function
* same function contain parameter
* and same function return value(String or Int)  */
fun myFun1(){
    println("Hello from my fun1 one ")
}
fun myFun2(a:Int){
    println("a=$a")
}
fun myFun3():String{
    return "Hello my fun3 three "
}
fun myFun4(a:Int):Int{
    return a*a
}

fun sum(a:Int, b:Int, myFun:(Int,Int)->Int):Int{
    println(myFun(a,b))
    print("Sum two Numbers=")
    return a+b
}
fun division(q:Int,d:Int,Division:(Int,Int)->Int){
    print("Division two Numbers is= " + Division(q,d))

}

//=========================================================
/*This is function used by lambda expression
* function contain parameter and contain parameter and return value(String and Int*/
val myLambda1:()->Unit={ println("Hello My lambda One") }
val myLambda2={a:Int-> println("a=$a")}
val myLambda22:(Int)->Unit={a-> println("a=$a")}
val myLambda3: () -> String ={"Hello My lambda three"}
val myLambda4:(Int)->Int={b:Int-> b*b}
val myLambda5:(Int,Int)->Int = {a,b -> a+b}
val myLambda6:(Int,Int)->Int = {a,b -> a-b}
val myLambda7:(Int,String)->String = { a, s-> println("a Numbers is:$a String is=$s").toString() }