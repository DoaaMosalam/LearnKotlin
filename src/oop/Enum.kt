package oop

fun main(args:Array<String>){
    Direction.North.getDir()
    println(Direction.East.i)
}
enum class Direction{
    North {
        override var i: Int?=1
        override fun getDir() {
            println("North")
        }
          }
    ,South{
        override var i: Int?=2
        override fun getDir() {
            println("South")
        }
          }
    ,East{
        override var i: Int?=3
        override fun getDir() {
            println("East")
        }
         }
    ,West{
        override var i: Int?=4
        override fun getDir() {
            println("West")
        }
    };
    open var i:Int?=null
    var s:String?=null
    abstract fun getDir()
}