package collection.arrays

fun main(args: Array<String>) {
    val x= arrayOf("Doaa Mosalam",30,'F',6.9,true)
    println("======================= The First =======================")
    for (i in 0..3){
        println("X["+(i+1)+"]= "+x[i])
    }
                                    //Or
    println("===================== The Second ============================")
    println("Enter the value array")
    for (i in 0 until x.size){
        x[i] = readLine()!!
    }
    for (i:Int in 0 until x.size){
        println(x[i])
    }
              //Or
    println("====================Array b element ========================")
    for (element in x){
        println(element)
    }
                                    //Or
    println("======================= The Third ======================")
    for (i in x){
        println(i)
    }

}