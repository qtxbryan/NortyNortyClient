package com.example.itp391.itp391.data.remote;

import retrofit2.Retrofit;

public class ApiUtils {

    private ApiUtils(){}

    public static final String BASE_URL = "192.168.1.20/";

    public static APIService getAPIService(){

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);

    }
}
