package oop


fun main(args:Array<String>){
    val circle=Circle()
   circle.printName("Doaa")
}
     abstract class Shape(){
         var name:String?=null
         var age:Int?=null
         var jobTitle:String?=null
         abstract fun printInfo(n:String,ag:Int,job:String)
         abstract fun printName(nm:String)
         abstract fun printAge(ag:Int)
         abstract fun  printJobTitle(jT:String)

     }
      class Circle:Shape(){
         override fun printInfo(n: String, ag: Int, job: String) {
             super.name=n
             super.age=ag
             super.jobTitle=job


         }

         override fun printName(nm: String) {
             super.name=nm
         }

         override fun printAge(ag: Int) {
             super.age=ag

         }

         override fun printJobTitle(jT: String) {
             super.jobTitle=jT
         }

     }
