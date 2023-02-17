package higher_order_function

fun main(args:Array<String>) {

//    print( myHigher("Hello") { s -> s.reversed() })
                          //or
    print(myHigher("Hello"){it.reversed()})
}
fun myHigher(d:String,myFun:(String)->String):String{
    return myFun(d)
}
/*You can short all of these function*/

//fun rever(s:String):String{
//    return s.reversed()
//}
//val lambdaReverse:(String)->String={s -> s.reversed()}