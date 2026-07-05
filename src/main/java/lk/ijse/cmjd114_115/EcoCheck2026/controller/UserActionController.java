package lk.ijse.cmjd114_115.EcoCheck2026.controller;


import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.service.UserActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user-action")
@RequiredArgsConstructor
public class UserActionController {

private final UserActionService userActionService;
    @PostMapping
    ResponseEntity<Void> createUser(@RequestBody UserActionDTO userAction){
        userActionService.createUserAction(userAction);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("{userActionId}")
    ResponseEntity<UserActionDTO> getSelectedUser(@PathVariable String userActionId) {
        return new ResponseEntity<>(userActionService.getSelectedUserAction(userActionId), HttpStatus.OK);
    }
    @GetMapping
    ResponseEntity<List<UserActionDTO>> getAllUsers(){
        return new ResponseEntity<>(userActionService.getAllUserActions(), HttpStatus.OK);
    }

    @PatchMapping("{userId}")
    ResponseEntity<Void> updateUser(@PathVariable String userId, @RequestBody UserActionDTO userAction){
        userActionService.updateUserAction(userId,userAction);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("{userActionId}")
    ResponseEntity<Void> deleteClimateAction(@PathVariable String userActionId) {
        userActionService.deleteUserAction(userActionId);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
}
