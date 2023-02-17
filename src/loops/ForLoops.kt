package loops

fun main(args: Array<String>) {
//   Ahmed@for(i:Int in 1..10){
//       if(i==5){
//           break@Ahmed
//       }
//        println("i=$i")
//    }
//    Doaa@for (i in 1..10){
//        Mosalam@for (j in 1..5){
//            if (i==5){
//            println("$i*$j="+(i*j))
//                break@Mosalam
//            }
//
//        }
//    }
    
    var shape =Shapes()
    shape.regtangle()

}
/*
  *
* **
* ***
* ****
* *****
* */

class Shapes(){
    fun regtangle(){
        var row=5
        for (i in 0..row){
            for(j in i..row){
                ++row
                println(" *")

            }
        }
        println()
    }

}