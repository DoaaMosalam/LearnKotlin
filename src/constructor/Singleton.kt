package constructor

object Setting {
    var language:String="Arabic"
    private set
    var theme:String="Dark"
    private set

    fun logOut(user:Constructor){
        println("user(${user.userName})logout")
    }
    fun changeThemeToLight(){
        theme="Light"
    }
    fun changeThemeToDark(){
        theme="Dark"
    }
    fun changeLanguageToArabic(){
        language="Arabic"
    }
    fun changeLanguageToEnglish(){
        language="English"
    }
}