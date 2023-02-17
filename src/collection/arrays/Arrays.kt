package collection.arrays

fun main(args: Array<String>) {
   /*  the was write arrays
     the first way
    This Way don't accept String Datatype*/

    val x = IntArray(3)
    x[0]=2
    x[1]=4
    x[2]=7

    val x2 =DoubleArray(3)
    x2[0]=2.5
    x2[1]=4.8
    x2[2]=7.9
   //Don't Accept
//    val s = StringArray("")
//    s[0]="d"
//    s[1]="o"
//    s[2]="a"
    //=======================================================================================
    //second way
  val y = Array(3){0}
    y[0]=2
    y[1]=4
    y[2]=7
    //String data type
    val s = Array(3){""}
    s[0]="D"
    s[1]="O"
    s[2]="A"
    //=====================================================================
    //Third way
    val z = Array<Int>(3){0}
    z[0]=2
    z[1]=4
    z[2]=7
    //String dataType
    val d = Array<String>(3){""}
    d[0]="M"
    d[1]="S"
    d[2]="F"
    //===================================================================
     /*this is better than away*/
    val e = arrayOf("Doaa Mosalam",30,3.5,true)


}