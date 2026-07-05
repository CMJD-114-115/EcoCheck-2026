package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.GoalDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/goal")
@RequiredArgsConstructor
public class GoalController {

private final GoalService goalService;

    @PostMapping
    ResponseEntity<Void> createGoal (@RequestBody GoalDTO goal){
        goalService.createGoal(goal);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("{goalId}")
    ResponseEntity<GoalDTO> getSelectedGoal(@PathVariable String goalId) {
        return new ResponseEntity<>(goalService.getSelectedGoal(goalId), HttpStatus.OK);
    }
    @GetMapping
    ResponseEntity<List<GoalDTO>> getAllGoals(){
        return new ResponseEntity<>(goalService.getGoals(), HttpStatus.OK);
    }

    @PatchMapping("{goalId}")
    ResponseEntity<Void> updateGoal(@PathVariable String goalId, @RequestBody GoalDTO goal){
        goalService.updateGoal(goalId,goal);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("{goalId}")
    ResponseEntity<Void> deleteGoal(@PathVariable String goalId){
        goalService.deleteGoal(goalId);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
}
