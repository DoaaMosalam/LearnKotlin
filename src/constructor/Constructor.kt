package constructor

import java.time.Year

fun main(args: Array<String>) {
     val firstUser = Constructor( "Doaa Mosalam", 32, "Egypt")
    val secondUser = Constructor( "Mohamed Ahmed", 35, "Arabic Unit state")

    println(firstUser.userName)
    println(Constructor.totalUserCount)
    //============================================================
    println(Setting.language)
    Setting.changeThemeToDark()
    println(Setting.theme)
    Setting.logOut(firstUser)

}
class Constructor (var userName:String,var yourAge:Int=1990,var address:String?=null){
    var age :Int=0
   get() = field
    private set(value) {

    }
    init {
        age = yourAge
        totalUserCount++
    }
    companion object{
        var totalUserCount=0
    }

//    constructor(mAge:Int,mAddress:String):this(userName){
//        this.age=mAge
//        this.address=mAddress
//    }



}






