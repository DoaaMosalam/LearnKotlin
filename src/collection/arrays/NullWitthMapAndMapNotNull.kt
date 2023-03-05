package collection.arrays

fun main(args:Array<String>){
    val counties = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "EG" to "EGYPT",
        "UN" to "United Kingdom",
        "AR" to "Saudi Arabia",
        "GE" to "Germany"
    )
    val result = counties.map(::findValue)
    println(result)
    val result1 = counties.mapNotNull  (::findValue)
    println(result1)
}

fun findValue(entry:Map.Entry<String,String>):Map.Entry<String,String>?{
    if(entry.key.startsWith("N")){
        return null
    }else{
        return entry
    }

}

