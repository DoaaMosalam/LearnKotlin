package collection.master_collection

fun main(args: Array<String>) {
    /*It categorizes the items in the list
    *بتصنف العناصر في الليست
*/
    val fruits = listOf("Banana","Apply","Kiwi","Strawberry","Banana")
    val groupBy = fruits.groupBy { it }
    println(groupBy)
    println("=======================================")
    //Remove element repeated
    val distinct = fruits.distinctBy { it }
    println(distinct)
    println("=======================================")
    // collection (take,takeLast,drop,dropLast)
    val take = fruits.take(1)
    println(take)
    val take2 = fruits.takeLast(3)
    println(take2)
    //drop is remove index
    val drop = fruits.drop(1)
    println(drop)
    val dropLast = fruits.dropLast(2)
    println(dropLast)
    println("=======================================")
    //random shuffle
    val shuffle = fruits.shuffled()
    println(shuffle)


}