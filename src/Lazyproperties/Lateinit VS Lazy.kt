package Lazyproperties

fun main(){

    val obj = MyInfo()
//    println(obj)
    obj.setValue("Doaa Mosalam")
    println(obj.getValue())
}
class MyInfo(){
    lateinit var myName:String

    fun setValue(name:String){
        myName = name
    }
//    fun getValue() = myname
    fun getValue()=if (::myName.isInitialized) myName else "Not Intialized"
}