package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/users")
@RestController
public class UserController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createUser(@RequestBody UserDTO userDTO) {
        System.out.println("createUser: " + userDTO.toString());
        return new  ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value= "{userId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getSelectedUser(@PathVariable String userId) {
        System.out.println("Selected User: " + userId);
        return new  ResponseEntity<>(new UserDTO("U001","Kamal","Silva","kamal@mail.com","pw1111", Role.ADMIN), HttpStatus.OK);
    }
}
