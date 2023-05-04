package SealedClass

sealed class Employees
//can create data class,class,object and inherit from sealed class
data class Manager(val name:String,val age:Int,val team:Int):Employees()
class SeniorDev(val name: String,val age: Int,val project:Int):Employees()
object JuniorDev:Employees()