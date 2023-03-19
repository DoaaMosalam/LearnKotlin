package oop

class Info(n:String?,ae:Int?,g: String?,job:String?) {
     var name:String?=null
     var age:Int?=null
     var gender:String?=null
     var jobTitle:String?=null
    //constructor.
    init {
        this.name = n
        this.age = ae
        this.gender = g
        this.jobTitle = job
    }


}

fun main(args: Array<String>) {
    var info = oop.Info("Doaa Mosalam", 31, "Female", "Arabic Teacher")

    println(info.name)
    println(info.age)
    println(info.gender)
    println(info.jobTitle)



}