package Extension_Function

fun main() {
    val name = "Doaa Mosalam"
    println(name.initials())
    println("==========================================")
    val age = 30
    println(age.isAdult())
    println("========================================")
    val person = Person("Doaa Sayed",25)
    println(person.name.initials())
    println(person.fullName())
}

class Person(val name:String,val age:Int)
