package string

fun main(Args:Array<String>){
//    println("Enter Your Degree")
//    val degree:Int= readLine()!!.toInt()

//    when{
//        degree >= 90  -> {
//            if (degree>=94) println("A+")
//            else println("A")
//
//        }
//        degree in 80..90 ->{
//            if (degree>84) println("B+")
//            else println("B")
//        }
//
//        degree in 70..79 -> {
//            if (degree>74) println("C+")
//            else println("C")
//        }
//        degree in 60..69 -> {
//            if (degree>64)
//                println("D+")
//            else
//                println("D")
//        }
//        degree in 50..59 -> {
//            if (degree > 54) println("E+")
//            else println("E")
//        }
//            else -> println("F")
//    }
//==================================================================
       /* or you can used this method*/
    while (true) {
        println("Enter Your Degree")
        val degree:Int= readLine()!!.toInt()
        if (degree !in 0..100)
            break
        when (degree) {
            in 90..100 -> {
                if (degree >= 94) println("A+")
                else println("A")

            }
            in 80..90 -> {
                if (degree > 84) println("B+")
                else println("B")
            }

            in 70..79 -> {
                if (degree > 74) println("C+")
                else println("C")
            }
            in 60..69 -> {
                if (degree > 64)
                    println("D+")
                else
                    println("D")
            }
            in 50..59 -> {
                if (degree > 54) println("E+")
                else println("E")
            }
            else -> println("F")
        }
    }

}