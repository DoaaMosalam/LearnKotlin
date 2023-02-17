package higher_order_function

fun main(args: Array<String>) {
    val x =Array(10, ::myFun)
    for ( i in x){
        print(i)
        print("\t")
    }
}
fun myFun(a:Int):String{
    return (a+1).toString() +" Hello"
}
val arrayLambda={a:Int-> 0}
