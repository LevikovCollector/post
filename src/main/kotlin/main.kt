
fun main(){

    val wall = WallService()
    wall.add(Post(0,12,13,111, 22032020, "Text for posts", 200,
        234, false, Comment(), Copyright(12,"link", "info", "t1"), Likes(),
         Reposts(), Views(), "test", 12322,
        true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))

    wall.add(Post(0,12,13,111, 22032020, "Text for posts", 200,
        234, false, Comment(), Copyright(12,"link", "info", "t1"), Likes(),
        Reposts(), Views(), "test", 12322,
        true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))

    wall.add(Post(0,12,13,111, 22032020, "Text for posts", 200,
        234, false, Comment(), Copyright(12,"link", "info", "t1"), Likes(),
        Reposts(), Views(), "test", 12322,
        true, true, true, true, true, true, Donut(), 90, postSource = null, copyHistory = null, geo = null, attachments = null))

    val nComment1 = Comment(fromId = 13, text = "Text Comment 1", postId =1)
    val nComment2 = Comment(fromId = 13, text = "Text Comment 2", postId =1)
    val nComment3 = Comment(fromId = 13, text = "Text Comment 2", postId =123)
    wall.createComment(nComment1)
    wall.createComment(nComment2)

    println(wall)

    wall.createComment(nComment3)






}


