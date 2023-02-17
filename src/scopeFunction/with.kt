package scopeFunction

import java.util.*

/*
* تسمح دالة with بتمرير كائن واحد كمعامل واحد، ثم يمكن الوصول إلى الخصائص والدوال العامة الخاصة بهذا الكائن دون الحاجة إلى كتابة اسم الكائن عدة مرات.
*  يتم تمرير الكائن كمعامل أول للدالة، ويمكن الوصول إلى الخصائص والدوال العامة لهذا الكائن باستخدام الكلمة الرئيسية this داخل المشفر.*/
class Person(var name: String, var age: Int){

}
fun main() {
    val person = Person("John", 30)

    val nameLength = with(person) {
        println(name)
        name.length
        name.uppercase()
    }
    val ageperson = with(person){
        println(age)
        age+1

    }
    println("Name length: $nameLength")
    println("Age Person: $ageperson")


}
