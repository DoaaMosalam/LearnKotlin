package mathematical_operation

fun main(args:Array<String>){
    /*
    * Order of Operation
         (%) model
         (/) Divine
        (*) multiply
        (+) addition
        (-) subtraction
    */

    print("Enter your number one:")
    val numOne:Int= readLine()!!.toInt()
    print("Enter your number one:")
    val numTwo:Int= readLine()!!.toInt()

    val sum = numOne+numTwo
    println("Sum number= $sum")
              // or
    println("Sum number=" + (numOne+numTwo))

    val sub = numOne - numTwo
   println("Sub number= $sub")

    val mul = numOne* numTwo
    println("Multiplay numer= $mul")

    val div = numOne /numTwo
    println("Divi number is= $div")
    val mod = numOne%numTwo
//    println("Mode number is= $mod")
    println("Mode number is = " +(numOne%numTwo))

}