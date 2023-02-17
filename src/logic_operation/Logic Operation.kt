package logic_operation

fun  main(args:Array<String>){
    println("Enter any two number: ")
    val x:Int = readLine()!!.toInt()
    val y:Int = readLine()!!.toInt()
    print("x>y")
    println(x>y)

    print("x<y:")
    println(x<y)

    print("x==y:")
    println(x==y)

    print("x>=y:")
    println(x>=y)

    print("x<=y:")
    println(x<=y)

    print("x==y:")
    println(x==y)

    print("x>9 && y>2:")
    println(x>9 && y>2)

    print("x>4 && y<2:")
    println(x>4 && y<2)

    print("x>4 || y<2:")
    println(x>4 || y<2)

    print("x>4 || y<2:")
    println(x>4 || y<2)

    print("x != y")
    println(x != y)
}