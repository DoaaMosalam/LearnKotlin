package varval

fun main(arags:Array<String>){

    /*
    this is variable:
    Var:you can change value to variable.
     Val:you can't change value to variable.
     ** Int,String,Char,Boolean,Double
  //======================================
    print() this is print result in one line
    println() this is print result in new liner
    //===============================================
    TypeCasting:
    toInt()
    toString()
    toDouble()
    toChar()
    toBoolean()
    */
    //Variables
    var x:Int = 5
    var y:Int= 10
    val z:Double=2.5
    val c:Char='D'
    println("X=$x")
    println("Y="+y)
    println("Z="+z)
    println("C="+c)
println("===================================================================")
    val name = "Doaa Mosalam"
    println("Name:$name")
    println(name[1])
    println("================================================================")
    val b:Boolean=true
    println("Boolean is:$b")
    val u:Boolean=2>5
    println("U+$u")
    println("=======================================================================")
    //TypeCasting
    val f = "100"
    val o:Int=f.toInt()
    println(o)
}