package collection.arrays

fun main(args:Array<String>){
    val x = arrayOf(3,5,8,4,2,9)
    val z = ArrayList<Int>()
    z.add(3)
    z.add(99)
    z.add(7)
    z.add(5)
    z.add(33)

//    x.forEach { print("$it ,") }
    for (i in 0 until x.size){
        print("Index: ${i+1}=${x[i]}\t")
    }
    println("\n============================================")
    z.forEach{ println(it)}
}