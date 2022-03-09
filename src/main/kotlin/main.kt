
fun main(){

    val wall = WallService()
    val postForUp = Post(0,31,22,111, 22032020, "Text for posts- WITH UPDATE",
        200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
        Likes(), Reposts(), Views(), "test", 12322,
        true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null)

    val postForUpFalse = Post(2,31,22,111, 22032020, "Text for posts- WITH UPDATE",
        200,234, false, Сomments(), Copyright(12,"link", "info", "t2"),
        Likes(), Reposts(), Views(), "test", 12322,
        true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null)

    wall.add(Post(0,12,13,111, 22032020, "Text for posts", 200,
        234, false, Сomments(), Copyright(12,"link", "info", "t1"), Likes(),
         Reposts(), Views(), "test", 12322,
        true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))

    wall.add(Post(0,12,13,111, 22032020, "Text for posts", 200,
        234, false, Сomments(), Copyright(12,"link", "info", "t1"), Likes(),
        Reposts(), Views(), "test", 12322,
        true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))

    wall.add(Post(0,12,13,111, 22032020, "Text for posts", 200,
        234, false, Сomments(), Copyright(12,"link", "info", "t1"), Likes(),
        Reposts(), Views(), "test", 12322,
        true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))

    wall.add(Post(0,12,13,111, 22032020, "Text for posts", 200,
        234, false, Сomments(), Copyright(12,"link", "info", "t1"), Likes(),
        Reposts(), Views(), "test", 12322,
        true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))
    wall.add(Post(0,31,22,111, 22032020, "Text for posts 123", 200,
        234, false, Сomments(), Copyright(12,"link", "info", "t1"), Likes(),
        Reposts(), Views(), "test", 12322,
        true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))

    println(wall.update(postForUp))
    println(wall.update(postForUpFalse))





}


