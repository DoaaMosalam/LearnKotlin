package ifstatement

fun main(args:Array<String>){
    /*this code you used when about Int*/
    print("Enter your degree:")
//    val degree:Int= readLine()!!.toInt()
    when(readLine()!!.toInt()){
        0 -> {
            println("x=0")
        }
        1 -> {
            println("x=1")
        }
        2 -> {
            println("x=2")
        }
        else ->
            println("Error")

    }
    //=================================================
    /*This code you used when about String */
    println("Enter your name:")
    val name:String?= readLine()?.substring(0)?.lowercase()
    when(name){
        "Doaa" ->{ println("Accepted")}
        "Ahmed" ->{ println("Accepted")}
        "Mayda" ->{ println("Not accepted")}
        else -> {
            println("Error")}
    }
    //===================================================================
}