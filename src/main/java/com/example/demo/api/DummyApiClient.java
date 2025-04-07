package com.example.demo.api;

import com.example.demo.model.DummyResponse;
import org.springframework.web.bind.annotation.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface DummyApiClient {
    @GET("posts/{id}")
    Call<Object> getUserById(@Path("id") String userId);

    @POST("posts")
    Call<DummyResponse> post(@Body DummyResponse object);
}

