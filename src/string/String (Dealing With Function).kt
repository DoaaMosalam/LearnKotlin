package string
fun main() {
    val str="welcome"
    println("Str1:" + str.plus(" My friend"))
                         //or
    println("str2: ${str.plus(" my friend")}")
    println("str3: ${str.hashCode()}")
    println("str4: "+str.equals("welcome"))
                //or
    println("Str4: $${str == "welcome"}")
    println("str5:"+str.length)
    println("str6: "+str.count())
         //remove first 3 letter
    println("str7: "+str.drop(3))
         //display 3 first letter
    println("str8: "+str.take(3))
    println("str9: "+str.removeRange(2,4))
    println("str10: "+str.uppercase())
    println("str11:"+str.lowercase())
    println("str12:"+str.first())
    println("str13: "+str.last())
    println("str14: "+ str.replace('w','W'))
    println("str15: "+str.replace("welcome","hello"))
    println("str16: "+str.replace("com"," 1 "))
    println(" str17-Index Of: " +str.indexOf("c"))
    println("str18-substring: " + str.substring(2,5))
    val str2 = "welcome people"
    val indexofSecondWord = str2.indexOf('l')

    println("str19: " +str2.substring(indexofSecondWord))


}




