package collection.arrays

fun main(args:Array<String>){
    val x = Array(3){0} //inMutable
    val z=ArrayList<Int>() //Mutable
    z.add(3)
    z.add(5)
    z.add(4)
    z.add(3)
    z.add(6)

    println("Array size: " +z.size)
    println("z.lastIndexOf(3)="+ z.lastIndexOf(3))
    println("z.first:" +z.first())
    println("z.last: "+ z.last())
    println("z.indexOf(6): " +z.indexOf(6))
    println("z.isEmpty: " +z.isEmpty())
    println("z.isNotEmpty: " +z.isNotEmpty())
    println("z.contains(4)= " +z.contains(4))
    println("z.toString: " +z.toString())
    println("z.set(3.7):" + z.set(3,7))
    println(z)
    println("z.get(3)=" +z.get(3))
    println("Remove: " +z.remove(3))
    println("RemoveAt: " +z.removeAt(3))
    z.toArray()
    z.clear()
    println(z.size)


}