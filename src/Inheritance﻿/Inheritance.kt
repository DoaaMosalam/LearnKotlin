package oop

open class Inheritance {
    init {

    }
    var age:Int?=null
    fun myAge(){
        this.age=10
        println("age is:${this.age}")
    }

}
open class Inheritance2:Inheritance(){
    init {

    }


}

class Inheritance3:Inheritance2(){
    init {

    }

}