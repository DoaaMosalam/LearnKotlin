package SealedClass

fun main() {
    val employee:Employees = SeniorDev("Doaa",29,10)
    val message = when(employee){
        is Manager ->{
            "Welcome ${employee.name}! You have ${employee.team} employee in your team"
        }
        is SeniorDev ->{
            "Welcome ${employee.name}! You have already ${employee.project} Project under your belt!"
        }
        JuniorDev ->{
            "Welcome abroad! We wish you are an awesome Experience!"
        }
    }
    println(message)

}