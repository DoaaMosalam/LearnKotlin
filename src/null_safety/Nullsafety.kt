package null_safety

fun main(args:Array<String>){

    //? Empty values are accepted
    val x:Int?=null
    println(x)
    // !! Empty values are not accepted
    val y:Int=200
    println(y!!)

}