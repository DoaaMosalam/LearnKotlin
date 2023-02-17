package scopeFunction
/*دالة run هي وظيفة نطاق متاحة في لغة Kotlin.
 تساعد هذه الدالة في تنفيذ مجموعة من التعليمات على كائن معين، وتقوم بإرجاع القيمة الناتجة من هذه التعليمات.

يمكن استخدام الدالة run عندما تحتاج إلى تنفيذ بعض الأوامر على كائن معين، وليس هناك حاجة إلى إعادة الكائن بقيمة مختلفة.

تأخذ دالة run كائنًا كمدخل وتعمل على تنفيذ سلسلة من الأوامر على هذا الكائن. تُعد القيمة المُرجعة من دالة run هي آخر تعليمة في سلسلة الأوامر الموجودة فيها.*/
data class Person1(var name: String, var age: Int)

fun main() {
    val person1 = Person("John", 30)

    val updatedPerson = person1.run {
        age += 1
        this
    }

    println("Updated age: ${updatedPerson.age}")
}
