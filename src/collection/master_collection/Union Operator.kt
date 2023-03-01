package collection.master_collection
// merge two collection into one
//don't repeat element
fun main(args: Array<String>) {
    val fruits1 = listOf(Fruits("Apple"),
        Fruits("Banana"),
        Fruits("Mango"),
        Fruits("Lemon"),
        Fruits("Avaocado"),
    )
    val fruits2 = listOf(Fruits("Kiwi"),
        Fruits("Strawberry"),
        Fruits("Orange"),
        Fruits("Gawafa")
    )

    val allFruits = fruits1.union(fruits2)
    println(allFruits)
    val allFruits2 = fruits1.union(fruits2).union(listOf(Fruits("Mango")))
    println(allFruits2)
}
data class Fruits(val name:String)