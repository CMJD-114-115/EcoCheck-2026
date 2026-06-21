package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/users")
@RestController
public class UserController {
    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody ??) {

    }
}
