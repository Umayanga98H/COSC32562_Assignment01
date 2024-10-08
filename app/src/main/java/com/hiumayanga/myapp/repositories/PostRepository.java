package com.hiumayanga.myapp.repositories;

import com.hiumayanga.myapp.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostRepository {
    @GET("/Posts")
    Call<List<Post>> getPosts();
}