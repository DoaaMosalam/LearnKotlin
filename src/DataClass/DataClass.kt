package DataClass
fun main(args: Array<String>) {

    val dc1 = DataClass("Doaa", 30)
    val dc2 = DataClass("Ahmed", 33)
    println(dc1 == dc2)
    println(dc1.myInfo())
    println(dc2.myInfo())
    println("==========================================================")

    /*division data*/
    val p1 =DataClass("Doaa Mosalam",30,"Software Engineer")
    println(p1)
    println(p1.component1())
    println(p1.component2())
    println(p1.component3())
    println("==========================================================")
    // this is receive data from data class,but must default data in data class
    // division data

    val (fname,fage,fjob) = DataClass()
    println(fname)
    println(fage)
    println(fjob)
}

    data class DataClass (val name:String ="Mostafa",val age:Int =35,val job:String="Developer"){
        fun myInfo():String{
            return "my name is: $name and my age is $age"
        }
    }




