import org.junit.Assert.assertEquals
import org.junit.Test

class WallServiceTest {

    @Test(expected = PostNotFoundException::class)
    fun createCommentFail() {
        val service = WallService()
        val post = Post(1, 1, "authorName", "conent", 25)
        service.add(post)

        val comment = Comment(1, 1, "text of comment")
        val createdCommentFail = service.createComment(2, comment)
        println(createdCommentFail)
    }

    @Test
    fun createCommentSuccess() {
        val service = WallService()
        val post = Post(1, 1, "authorName", "conent", 25)
        service.add(post)

        val comment = Comment(1, 1, "text of comment")
        val createdCommentSuccess = service.createComment(1, comment)
        assertEquals(comment, createdCommentSuccess)
    }
}
