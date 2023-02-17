package oop

class Human() {

    var name: String?=null
     var gender: String?=null
    var length: Int?=null
    fun infoHuman(){
        this.length = this.length?.plus(10)
        println("I am ${this.length} cm")
        println("My name is ${this.name}")
        println("I am ${this.gender}")
    }
}
fun main(args:Array<String>){
      //Object from class Human
    val h1 = Human()

//    "Doaa Mosalam".also { this.name = it }
//    "Female".also { this.gender=it }
////    h1.gender="Female"
//    160.also { this.length = it }
//    h1.infoHuman()
                 //or This.

    h1.run {
        "Doaa Mosalam".also { this.name=it }
        "Female".also { this.gender=it }
        160.also{this.length=it}
        infoHuman()
    }

}