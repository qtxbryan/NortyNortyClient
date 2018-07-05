package com.example.itp391.itp391.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("userid")
    @Expose
    private Integer userid;
    @SerializedName("password")
    @Expose
    private Integer password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", userid='" + userid + '}';
    }

}



