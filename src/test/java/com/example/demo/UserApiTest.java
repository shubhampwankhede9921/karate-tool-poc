package com.example.demo;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit5.Karate;

public class UserApiTest {
    @Karate.Test
    Karate runAllFeatures() {
        return Karate.run("classpath:features"); // runs all features in the folder
    }
}
