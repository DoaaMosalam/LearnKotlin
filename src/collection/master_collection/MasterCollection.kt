package collection.master_collection

fun main(args: Array<String>) {
    val numbersList = listOf<List<Int>>(listOf(3,4,5,6), listOf(7,8,9,10), listOf(11,12,13,14))
    //print normal list
    println(numbersList)
    // convert numbers list to one list
    val transformation = numbersList.flatMap { it }
    println(transformation)
    val transformation2 = numbersList.flatten()
    println(transformation2)
    println("=======================================")
    val fruits = listOf("Banana","Apply","Kiwi","Strawberry","Banana")
    val groupBy = fruits.groupBy { it }
    println(groupBy)
    println("=======================================")
    //Remove element repite
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