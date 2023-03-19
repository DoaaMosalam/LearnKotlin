package oop

fun main(args: Array<String>) {
    val x = oop.AccessModifier()
    x.name1
//    x.name2
//    x.name3

}

open class AccessModifier {
   public val name1:String?=null
    private var name2:String?=null
    protected var name3:String?=null
    //Setter and Getter
    fun setName(n:String){
        this.name2=n
    }
    fun getName(): String? {
       return this.name2
    }


     class B:AccessModifier(){
        fun name(){
            super.name1
        }
    }
}