package oop

fun main(){
    Direction.North.getDir()
    println(Direction.East.i)
    println(Direction.West)
    println(Direction.East)

}
                            //constructor
enum class Direction  (point:Int, followers:Int){
    North(100,1000) {
        override var i: Int?=1
        override fun getDir() {
            println("North")

        }
          }
    ,South(200,2000){
        override var i: Int?=2
        override fun getDir() {
            println("South")
        }
          }
    ,East(30,3000){
        override var i: Int?=3
        override fun getDir() {
            println("East")
        }
         }
    ,West(40,4000){
        override var i: Int?=4
        override fun getDir() {
            println("West")
        }
    };
    open var i:Int?=null
    var s:String?=null
    abstract fun getDir()
}