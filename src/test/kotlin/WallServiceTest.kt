import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class WallServiceTest {


    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(0,31,22,111, 22032020, "Text for posts",
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90))
        service.add(Post(0,31,22,111, 22032020, "Text for posts",
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90))
        service.add(Post(0,31,22,111, 22032020, "Text for posts",
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90))
        // создаём информацию об обновлении
        val update = Post(2,31,22,111, 22032020, "Text for posts- WITH UPDATE",
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90)

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
            true, true, true, true, true, true, Donut(), 90))

        // создаём информацию об обновлении
        val update = Post(2,31,22,111, 22032020, "Text for posts- WITH UPDATE",
            200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
            Likes(), Reposts(), Views(), "test", 12322,
            true, true, true, true, true, true, Donut(), 90)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}