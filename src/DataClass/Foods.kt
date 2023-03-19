package DataClass

fun main() {
    /*take copy from another data class */
    val obj = DataClassOrder("Doaa Mosalam",25,"Suze","Software Engineer")
    val order = obj.copy("Ahmed Mohamed",25,"Egypt","Software Engineer")
    println(order)

    val order2 = order.copy(address="USA")
    println(order2)




}

data class Order (val order:String,val amount:Int,val customer:DataClassOrder)

data class DataClassOrder(val name:String,val age:Int,
                          val address:String,val job:String)