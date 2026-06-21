package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.ActionCategory;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/action-category")
@RestController
public class ActionCategoryController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createAction(@RequestBody ActionCategory actionCategory) {
        System.out.println("Action Category is: " + actionCategory.toString());
        return new  ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value= "{actionId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ActionCategory> getSelectedUser(@PathVariable String actionId) {
        System.out.println("Selected User: " + actionId);
        return new  ResponseEntity<>(new ActionCategory(
                "AC-005",
                "Transport",
                "Transportation related climate actions")
                ,HttpStatus.OK
        );
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ActionCategory>> getUsers() {
        List<ActionCategory> userList = List.of(
                new ActionCategory(
                        "AC-001",
                        "Energy Saving",
                        "Actions related to reducing electricity and fuel consumption"
                ),
                new ActionCategory(
                        "AC-002",
                        "Waste Management",
                        "Actions related to waste reduction, recycling, and composting"
                ),
                new ActionCategory(
                        "AC-003",
                        "Tree Planting",
                        "Actions related to afforestation and increasing green cover"
                ),
                new ActionCategory(
                        "AC-004",
                        "Water Conservation",
                        "Actions related to reducing water usage and improving efficiency"
                ));
                return new ResponseEntity<>(userList, HttpStatus.OK);


    }
    @PatchMapping(value = "{actionId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateActionCategory(@PathVariable String actionId,@RequestBody ActionCategory actionCategory) {
        System.out.println("Updated action category id is " + actionId +" as: " + actionCategory.toString());
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping(value = "{actionId}")
    public ResponseEntity<Void> deleteActionCategory(@PathVariable String actionId) {
        System.out.println("Deleted User id is " + actionId);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
