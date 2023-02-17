package collection.arrays

fun main(args:Array<String>){
    val a = arrayOf(58,5,15,3,25,99,1,6)
    println("Array After edit")
    for (i in 0 until a.size){
        print("a[" +(i+1)+"]="+a[i]+" ,")
    }

//    println("Max Element: "+a.max())
//    println("Min Element:"+a.min())
    println("\n Size Element: " +a.size)
    println("Count Element: "+a.count())
    println("First Element: "+a.first())
    println("Last Element: "+a.last())
    println("Set element update index 3 b value 333 " + a.set(3,333))
    println("Get Element: "+ a.get(3))
    println("Sort Element: "+a.sort())

    println("Array Before edit")
    for (i in 0 until a.size){
        println("a[" +(i+1)+"]= " +a[i])
    }

}


