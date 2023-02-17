package oop
fun main(args:Array<String>){

    val t1=Thread( Runnable {
            for ( i in 1..5){
                println("Hello")
                Thread.sleep(500)

        }
    })
    val t2=Thread(object:Runnable{
        override fun run() {
            for ( i in 1..5){
                println("world")
                Thread.sleep(500)
            }
        }

    })
    t1.start()
    Thread.sleep(500)
    t2.start()
    println(t1.isAlive)
    t1.join() //print world end in the last
    t2.join()
    println(t1.isAlive)
    println("End")

}
