package collection.arrays
/*Map return value
* FlatMap  return single list of all elements */
fun main(args:Array<String>){
    val fruits1 =listOf("Apple","Orange","Banana","Avocado")
    val fruits2 =listOf("Blueberries","Lemon","Mango")
    val fruits3 =listOf("Passion","Fruit","Watermelon")
    val allFruits = listOf(fruits1,fruits2,fruits3)

    val resultMap = allFruits.map { it }
    println(resultMap)
    println("==========================================================")
    val resultFlatMap = allFruits.flatMap { it }
    println(resultFlatMap)
}