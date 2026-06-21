package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lk.ijse.cmjd114_115.EcoCheck2026.service.UserService;
import lk.ijse.cmjd114_115.EcoCheck2026.service.impl.UserServiceIMPL;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/users")
@RestController
@RequiredArgsConstructor
public class UserController {
    //constructor injection
    private final UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createUser(@RequestBody UserDTO userDTO) {
        userService.saveUser(userDTO);
        return new  ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value= "{userId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getSelectedUser(@PathVariable String userId) {
        return new  ResponseEntity<>(userService.getSelectedUser(userId), HttpStatus.OK);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDTO>> getUsers() {
                return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
    @PatchMapping(value = "{userId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateUser(@PathVariable String userId,@RequestBody UserDTO userDTO) {
        userService.updateUser(userId,userDTO);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping(value = "{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable String userId) {
       userService.deleteUser(userId);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
