import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class WallServiceTest {

    @Test
    fun addPostToWall(){
        val post = Post(ownerId = 11, authorId = 12, createdBy = 123, date = 12122020, text = "Text for post",replyOwnerId = 22,replyPostId = 33,friendsOnly = false,comments = Comment(),
            copyright = Copyright(12,"link", "info", "t2"), likes = Likes(), reposts = Reposts(), views = Views(), postType = "Test", signerId = 234,
        canPin = true, canDelete = true, canEdit = true, isPinned = false, markedAsAds = true, isFavorite = false, donut = Donut(), postponedId = 90, postSource = null, copyHistory = null, geo = null, attachments = null)

        assertTrue(post.id != 0)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(0,31,22,111, 22032020, "Text for posts",
            200,234, false, Comment(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))
        service.add(Post(0,31,22,111, 22032020, "Text for posts",
            200,234, false, Comment(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))
        service.add(Post(0,31,22,111, 22032020, "Text for posts",
            200,234, false, Comment(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))
        // создаём информацию об обновлении
        val update = Post(2,31,22,111, 22032020, "Text for posts- WITH UPDATE",
            200,234, false, Comment(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateNoExisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(0,31,22,111, 22032020, "Text for posts",
            200,234, false, Comment(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))

        // создаём информацию об обновлении
        val update = Post(2,31,22,111, 22032020, "Text for posts- WITH UPDATE",
            200,234, false, Comment(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val wall = WallService()
        wall.add(Post(0,12,13,111, 22032020, "Text for posts", 200,
            234, false, Comment(), Copyright(12,"link", "info", "t1"), Likes(),
            Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))
        val nComment1 = Comment(fromId = 13, text = "Text Comment 1", postId =123)
        wall.createComment(nComment1)
    }
    @Test
    fun addCommentWithOutException() {
        val wall = WallService()
        wall.add(Post(0,12,13,111, 22032020, "Text for posts", 200,
            234, false, Comment(), Copyright(12,"link", "info", "t1"), Likes(),
            Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))
        val nComment1 = Comment(fromId = 13, text = "Text Comment 1", postId =1)
        wall.createComment(nComment1)
    }
}