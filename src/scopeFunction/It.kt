package scopeFunction

fun main(args: Array<String>) {
    val email = "user@example.com"
    val upperCaseEmail = email.let { it.toUpperCase() }
    println(upperCaseEmail)
}