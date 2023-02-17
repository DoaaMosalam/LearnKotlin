package recursion

fun add(c:Int):Int{
    if(c != 0) return c+ add(c-1)
    else return 0
}

fun main(args:Array<String>){
    print("Enter a positive Integer: ")
    val x = readLine()!!.toInt()
    print("Sum= ${add(x)}")

}