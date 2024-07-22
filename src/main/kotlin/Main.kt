

class PostNotFoundException(message: String): RuntimeException(message)

fun main() {
    val service = WallService()
//    val id = 1L
//    val author = service.findById(id)?.authorName ?: throw PostNotFoundException("no post with id $id")
//    println(author)

    val post = Post(1, 1, "authorName", "conent", 25)
    service.add(post)

    val comment = Comment(1, 1, "text of comment")
    val com = service.createComment(1,  comment)
    println(com)
}

