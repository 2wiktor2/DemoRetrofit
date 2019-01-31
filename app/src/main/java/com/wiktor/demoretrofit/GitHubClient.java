package com.wiktor.demoretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {

   // получился синхронный метод

    @GET("/users/{user}/repos")
    // такой результат нужно получить в конце.   конечная точка.
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);
}
