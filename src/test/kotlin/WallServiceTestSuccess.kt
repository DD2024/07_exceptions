import org.junit.Test

import org.junit.Assert.*

class WallServiceTestSuccess {

    @Test
    fun createComment() {
        val service = WallService()
        val post = Post(1, 1, "authorName", "conent", 25)
        service.add(post)

        val comment = Comment(1, 1, "text of comment")
        val createdCommentSuccess = service.createComment(1, comment)

        assertEquals(comment, createdCommentSuccess)
    }
}