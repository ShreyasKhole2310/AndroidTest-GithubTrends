package com.test.shreyas.test_trending_repositories.Retrofit_class;

import com.test.shreyas.test_trending_repositories.Repository_List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RequestInterface {

//    q=topic:android&sort=stars&order=desc
    @GET("repositories")
    Call<JsonResponse> getJSON(@Query("q") String android, @Query("sort") String stars,
                                  @Query("order") String order);
}
