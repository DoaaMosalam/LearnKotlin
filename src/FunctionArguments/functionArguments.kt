package FunctionArguments


fun main(args: Array<String>){
    var likeCount:Int=0
    showLike(likeCount)
    likeCount = like(likeCount)
    showLike(likeCount)
    likeCount = like(likeCount)
    showLike(likeCount)
    likeCount=diLike(likeCount)
    showLike(likeCount)
    likeCount =like(likeCount)
    showLike(likeCount)
}
//this is compact function (Delete the starting parenthesis{ and the ending parenthesis  } )

fun like(oldLikeCount:Int)= oldLikeCount+1

fun diLike(oldLikeCount:Int)= oldLikeCount-1
fun getLikeDetails(likesCount: Int)="like: $likesCount"
fun showLike(likesCount:Int) = println(getLikeDetails(likesCount))