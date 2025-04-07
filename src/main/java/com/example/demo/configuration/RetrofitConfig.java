package com.example.demo.configuration;

import com.example.demo.api.DummyApiClient;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Bean
    public Retrofit retrofit() {
        OkHttpClient client = new OkHttpClient.Builder().build();

        return new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/") // Dummy API base URL
                .client(client)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    @Bean
    public DummyApiClient dummyApiClient(Retrofit retrofit) {
        return retrofit.create(DummyApiClient.class);
    }
}

