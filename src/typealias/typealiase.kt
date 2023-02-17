package `typealias`
/*بسبب هي متكرره في ك اللكلاسات بستخدم ال typealias
* وبستدعيها في الكلام arguments
* مكرهوش في كل مره */
typealias AuthToken=String
fun main(args: Array<String>) {
    val user = User("Doaa Mosalam","14i34y_vbfgy48")
    Order(user.authToken)
}

data class User(val userName:String,val authToken:AuthToken)
data class Account(val authToken:AuthToken)
data class Order(val authToken:AuthToken)


