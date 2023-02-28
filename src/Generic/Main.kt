package Generic

fun main(args: Array<String>) {
    val attachment = Attachment<Int,Int>()
    attachment.sum(2,3)
    val attachment2 = Attachment<Int,Boolean>()
    attachment2.sum(2,true)

}