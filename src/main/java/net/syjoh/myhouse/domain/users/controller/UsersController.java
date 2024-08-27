package net.syjoh.myhouse.domain.users.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @GetMapping("/hello")
    public ResponseEntity<?> checkStatus(){
        String result = "hello";
        return ResponseEntity.ok(result);
    }
}