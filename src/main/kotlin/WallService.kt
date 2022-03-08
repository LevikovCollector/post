class WallService {
    private var postArray = emptyArray<Post>()

    fun add(post: Post): Post{
        if (postArray.size != 0) {
            val nPost = post.copy(id = postArray.last().id + 1)
            postArray += nPost
        }
        else{
            postArray += post.copy(id = 1)
        }

        return postArray.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postFromArray) in postArray.withIndex()) {
            if (post.id == postFromArray.id) {
                postArray[index] = post.copy(
                    ownerId = postFromArray.ownerId,
                    authorId = post.authorId,
                    createdBy = post.createdBy,
                    date = postFromArray.date,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    donut = post.donut,
                    postponedId = post.postponedId
                )
                return true
            }
        }
        return false
    }
}