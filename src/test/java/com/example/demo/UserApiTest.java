package com.example.demo;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit5.Karate;

public class UserApiTest {

	@Karate.Test
    Karate testUserApi() {
        return Karate.run("classpath:features/user-api.feature");
    }
}
