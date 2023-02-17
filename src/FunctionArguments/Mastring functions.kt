package FunctionArguments

//fun isEven(number:Int):Boolean{
//    if (number %2==0){
//        return true
//    }else{
//        return false
//
//    }
//}
              //short function to
//fun isEven(number: Int):Boolean{
//    return if (number %2==0){
//         true
//    }else{
//        false
//    }
//}
                                    //short function to
//fun isEven(number:Int):Boolean{
//    return if ( number%2==0) true else false
//}

                                      //short function to
fun isEven(number:Int):Boolean{
    return number%2==0
}
/**
this function main
* @param age
 * @return
* */
fun ageStage(age: Int)=when(age){
        in -1 downTo Int.MIN_VALUE -> "لسه لم ياتي الي الدنيا"
        in 0..4 -> "Baby"
        in 5..12 -> "Child"
        in 13..19 -> "Teen"
        in 20..39 -> "Adult"
        in 40..59 -> "Middel age Adult"
        in 60..120 -> "Old"
        in 121 ..Int.MAX_VALUE -> "الله يرحمه"
        else -> "Wrong Value"
    }



fun main(args: Array<String>) {
    println("function(is Even) ${isEven(4)}")
    println("function(getAverage) ${ageStage(32)}")
}
