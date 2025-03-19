package com.example.demo.controller;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class DummyController {
	 private final RestTemplate restTemplate;

	    public DummyController() {
	        this.restTemplate = new RestTemplate();
	    }

	    @GetMapping("/users/{id}")
	    public ResponseEntity<Object> fetchUsers(@PathVariable int id) {
	        String url = "https://jsonplaceholder.typicode.com/posts/"+id;
	        Object users = restTemplate.getForObject(url, Object.class);
	        return ResponseEntity.status(HttpStatus.OK).body(users);
	    }

}
