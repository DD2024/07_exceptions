import org.junit.Test

class WallServiceTestFail {

    @Test(expected = PostNotFoundException::class)
    fun createComment() {
        val service = WallService()
        val post = Post(1, 1, "authorName", "conent", 25)
        service.add(post)

        val comment = Comment(1, 1, "text of comment")
        val createdCommentFail = service.createComment(1, comment)
        println(createdCommentFail)
    }
}
