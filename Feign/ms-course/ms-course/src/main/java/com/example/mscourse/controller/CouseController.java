package com.example.mscourse.controller;


import com.example.mscourse.client.ISubscriptionClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouseController {

    @Autowired
    private ISubscriptionClient iSubscriptionClient;

    @GetMapping("/course/find")
    public ResponseEntity<String> find(){
        return ResponseEntity.ok(iSubscriptionClient.find());
    }
}
