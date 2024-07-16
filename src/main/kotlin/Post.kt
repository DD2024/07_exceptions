
data class Post(
    val id: Int,
    val authorId: Long,
    val authorName: String,
    val content: String,
    val created: Long,
    val likes: Int = 0
)
