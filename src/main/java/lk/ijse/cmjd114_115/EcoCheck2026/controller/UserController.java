package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDTO>> getUsers() {
        List<UserDTO> userList = List.of(
                new UserDTO(
                        "U001",
                        "Kamal",
                        "Silva",
                        "kamal@mail.com",
                        "pw1111",
                        Role.ADMIN
                ),
                new UserDTO(
                        "U002",
                        "Nimal",
                        "Perera",
                        "nimal@mail.com",
                        "pw2222",
                        Role.USER
                ),
                new UserDTO(
                        "U003",
                        "Sahan",
                        "Silva",
                        "sahan@mail.com",
                        "pw1111",
                        Role.ADMIN
                ),
                new UserDTO(
                        "U004",
                        "Amali",
                        "Jayawardena",
                        "amali@mail.com",
                        "pw4444",
                        Role.ADMIN
                ));
                return new ResponseEntity<>(userList, HttpStatus.OK);


    }
    @PatchMapping(value = "{userId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateUser(@PathVariable String userId,@RequestBody UserDTO userDTO) {
        System.out.println("To be updated the user id " + userId +" as: " + userDTO.toString());
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping(value = "{userId}")
    public ResponseEntity<Void> deleteteUser(@PathVariable String userId) {
        System.out.println("Deleted User id is " + userId);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
