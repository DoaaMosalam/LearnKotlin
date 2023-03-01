package collection.arrays
/*merge many listOf or arrayOf in one listOf or arrayOf
* */
fun main(args: Array<String>) {
    val fruits1 =listOf("Apple","Orange","Banana","Avocado")
    val fruits2 =listOf("Blueberries","Lemon","Mango")
    val fruits3 =listOf("Passion","Fruit","Watermelon")
    val allFruits = listOf(fruits1,fruits2,fruits3)
    println("Collection all fruits: $allFruits.flatten()")
    println("=======================================")

    val numbersList = listOf<List<Int>>(listOf(3,4,5,6), listOf(7,8,9,10), listOf(11,12,13,14))
    //print normal list
    println(numbersList)
    // convert numbers list to one list
    // return single list of all elements
    val transformation = numbersList.flatMap { it }
    println(transformation)
    // merge all list of or arrayOf in one
    // return single list of all elements
    val transformation2 = numbersList.flatten()
    println(transformation2)


}