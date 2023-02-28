package collection.arrays

fun main(args: Array<String>) {
    val fruits1 =listOf("Apple","Orange","Banana","Avocado")
    val fruits2 =listOf("Blueberries","Lemon","Mango")
    val fruits3 =listOf("Passion","Fruit","Watermelon")
    val allFruits = listOf(fruits1,fruits2,fruits3)
    println("Collection all fruits: $allFruits.flatten()")


}