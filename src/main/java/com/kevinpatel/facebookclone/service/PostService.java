package com.kevinpatel.facebookclone.service;

import com.kevinpatel.facebookclone.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
