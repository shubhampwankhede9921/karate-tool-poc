package com.example.demo.controller;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

import com.example.demo.model.DummyResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class DummyController {
    private final RestTemplate restTemplate;

//	@Autowired
//	DummyService dummyService;

    public DummyController() {
        this.restTemplate = new RestTemplate();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Object> fetchUsers(@PathVariable int id) {
        String url = "https://jsonplaceholder.typicode.com/posts/" + id;
        Object users = restTemplate.getForObject(url, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody Map<String, Object> request) {
        String url = "https://jsonplaceholder.typicode.com/posts";
        Object response = restTemplate.postForObject(url, request, Object.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

//    @GetMapping("/user/{id}")
//    public Object getUser(@PathVariable String id) {
//		return dummyService.getUser(id);
//    }
}
