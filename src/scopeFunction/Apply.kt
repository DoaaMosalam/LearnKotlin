package scopeFunction
class Apply {
   data class Person(var name: String, var age: Int, var address: String)

   val person = Person("Doaa Mosalam",25,"Egypt")
      .apply {  name = "Ahmed Mohammed"
         age= 30
         address = "Arabic United state" }



}
class UserSocial {
   data class SocialUser(
      var name: String,
      var email: String,
      var phone: String,
      var username: String,
      var password: String
   )
   val user = SocialUser("Mostafa","Mosatafa345@gmail.com","01027574367","M.mostafa","123456")

}

fun main(args: Array<String>) {
   val a = Apply().person.apply {
      name = "Ahmed Mohammed"
      age = 30
      address = "Arabic United state"
   }
   print(a)
   //==============================================================
 val user = UserSocial().user.apply {
    name="Mohammed Adam"
    email="Mohamed.Adam2gmail.com"
    password="45346"
 }
   print(user)
}
