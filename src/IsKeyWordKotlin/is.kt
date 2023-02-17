package IsKeyWordKotlin


fun main(args: Array<String>) {
    val age:Any=25
    if(age is Int){
        println("It Is!")
    }else{
        println("It's Not!")
        println(age.javaClass.name)
    }
    val x = 10
    val s ="Doaa".toInt()

}