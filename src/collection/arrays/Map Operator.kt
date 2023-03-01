package collection.arrays


fun main(args: Array<String>) {
    val names = listOf("Doaa Mosalam","Ahmed Mohamed","Mostafa Ibrahim","Adam Youniss","Mohammed yehia")
    val result = names.map { it.substring(0,3).uppercase() }
    println(result)
    separate()
    val result2 = names.map { "Mousa".length }
    println(result2)
    separate()
    //print first letter of each name.
    val solution = names.map { val letters = it.split(' ')
        letters[0].substring(0,1) + letters[1].substring(0,1)
    }
    println(solution)
    //================================================================================================

    val counties = mutableMapOf(
        "NY" to "New York",
        "EG" to "EGYPT",
        "UN" to "United Kingdom",
        "AR" to "Saudi Arabia",
        "GE" to "Germany"
    )
    val filter = counties.filter { it.key.contains("E") }
    println(filter)
    separate()
    //return only key
    val filter2=counties.filterKeys { it.contains("N") }
        .map { it.value.substring(0,4) }
    println(filter2)
    separate()
    //return key and value
    val filter3=counties.filterKeys { it.contains("N") }
        .mapValues { it.value.substring(0,4) }
    println(filter3)
}

fun separate(){
    println("=====================================")
}