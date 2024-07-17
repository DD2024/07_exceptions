import org.junit.Test

class WallServiceTest {

    @Test(expected = PostNotFoundException::class)
    fun createComment() {
        val service = WallService()
        val post = Post(1, 1, "authorName", "conent", 25)
        service.add(post)

        val comment = Comment(1, 1, "text of comment")
        val createdCommentFail = service.createComment(2,  comment)
        println(createdCommentFail)

        val createdCommentSuccess = service.createComment(1,  comment)
        println(createdCommentSuccess)
    }
}