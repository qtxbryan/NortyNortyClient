package com.example.itp391.itp391.data.remote;

import com.example.itp391.itp391.data.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("/posts")
    @FormUrlEncoded
    Call<Post>savePost(@Field("name")String name,
                       @Field("userid")String userid,
                       @Field("password")String password);


}
