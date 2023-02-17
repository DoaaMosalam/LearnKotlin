package loops

fun main(args:Array<String>){
    var x=1
    while (x<=10){
        var y=1
        while (y<=10){
            println("$x*$y="+(x*y))
            y++
        }
        x++

    }

    //===============================================================================================
            //do while
    println("===============================================")
    var w =1
   do {
       var z=1
       while (z<=10){
           println("$w*$z="+(w*z))
           z++
       }
       w++
   }      while (w<=10)
    //===============================================================================================
                       //for loops
   for (x in 1..10) {
       println("The multiplication table of $x ")
       for (y in 1..10) {
           println("$x*$y=" + (x * y))
       }
   }
        x++
}
