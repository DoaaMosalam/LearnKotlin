package collection.arrays


fun main(args:Array<String>){
   val x:List<Int> = listOf(3,5,7)
    println("List=$x")
    val y:Map<Int,String> = mapOf<Int,String>(Pair(1,"a"), Pair(2,"b"),Pair(3,"c"))
    println("Map=$y")
    val z:Set<Int> = setOf<Int>(4,6,8,8,6,4)
 println("set=$z")


    val a:MutableList<Int> = mutableListOf<Int>(1,2,3)
 a.add(4)
 println("a=$a")

    val b:MutableMap<Int,String> = mutableMapOf<Int,String>()
    b[9]="Doaa"
    b[3]="Sayed"
    b.put(44,"Mosalam")
    println("B=$b")
    val c:MutableSet<Int> = mutableSetOf<Int>()
    val v=HashMap<Int,String>()

    v[100]="Youssef"
 println("v=$v")
 //===============================================
    println("============================================================================")
 val stickerList = listOf<String>("Smile","Sad","Happy")
 println(stickerList)

    val filter = stickerList.filter { it[0] == 'S'}
    println("Filter list= $filter")
    val filterNot = stickerList.filterNot { it[0] =='S' }
    println("Filter Not $filterNot")
    val find = stickerList.find { it[0]=='S' }
    println("Find $find")
    val findLast = stickerList.findLast { it[it.length-1]=='d' }
    println("findlast $findLast")
 val strickerMap:Map<String,Int> = mapOf<String,Int>("Smile" to 1, "Sad" to 2,"Happy" to 3)
 println(strickerMap)
 val stickerSet:Set<String> = setOf("smile","Sed","Happy","Sed")
 println(stickerSet)

    



}