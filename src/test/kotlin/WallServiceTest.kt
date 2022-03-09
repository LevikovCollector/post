import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class WallServiceTest {

    @Test
    fun addPostToWall(){
        val post = Post(ownerId = 11, authorId = 12, createdBy = 123, date = 12122020, text = "Text for post",replyOwnerId = 22,replyPostId = 33,friendsOnly = false,comments = Сomments(),
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
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))
        service.add(Post(0,31,22,111, 22032020, "Text for posts",
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))
        service.add(Post(0,31,22,111, 22032020, "Text for posts",
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))
        // создаём информацию об обновлении
        val update = Post(2,31,22,111, 22032020, "Text for posts- WITH UPDATE",
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
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
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))

        // создаём информацию об обновлении
        val update = Post(2,31,22,111, 22032020, "Text for posts- WITH UPDATE",
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}