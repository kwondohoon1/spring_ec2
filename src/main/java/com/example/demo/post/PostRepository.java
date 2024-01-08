package com.example.demo.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class PostRepository {
    List<Post> posts;
    PostRepository(){

        this.posts = new ArrayList<>();
        this.posts.add(new Post(1,"title1","hello java world1","kwon1"));
        this.posts.add(new Post(2,"title1","hello java world2","kwon2"));
        this.posts.add(new Post(3,"title1","hello java world3","kwon3"));
        this.posts.add(new Post(4,"title1","hello java world4","kwon4"));

    }
    List<Post> findAll(){
        return this.posts;
    }
}