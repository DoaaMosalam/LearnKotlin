package oop

class PassingArrayThroughFunction {
    fun passinArray(){
        val x:Array<Int> =Array(4){0}
        val y:Array<Int> =Array(4){0}
        input(x)
        output(x)

        input(y)
        output(y)
        //================================================
        val list = arrayOf(2017,"Doaa","Mosalam",3.2)
//        inputList(list)
//        outputList(list)
    }

    private fun input(x: Array<Int>){
        print("Enter the element of Array:")
        for (i in 0 until  x.size){
            x[i]= readLine()!!.toInt()
        }
    }
    private fun output(x: Array<Int>){
        for (i in 0 until x.size){
            println("X[$i]="+x[i])
        }
    }
//======================================================
private fun inputList(x: Array<Any>){
        print("Enter the element of Array:")
        for (i in 0 until  x.size){
            x[i]= readLine()!!
        }
    }
    private fun outputList(x:Array<Int>){
        for (i in 0 until x.size){
            println("X[$i]="+x[i])
        }
    }
}