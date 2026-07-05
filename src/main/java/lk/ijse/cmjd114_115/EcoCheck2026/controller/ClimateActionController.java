package lk.ijse.cmjd114_115.EcoCheck2026.controller;


import lk.ijse.cmjd114_115.EcoCheck2026.dto.ClimateActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.service.ClimateActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/climateaction")
@RequiredArgsConstructor
public class ClimateActionController {
    private final ClimateActionService climateActionService;

    @PostMapping
    ResponseEntity<Void> createClimateAction(@RequestBody ClimateActionDTO climateAction){
      climateActionService.createClimateAction(climateAction);
      return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("{actionID}")
    ResponseEntity<ClimateActionDTO> getSelectedClimateAction(@PathVariable String actionID){
         return new ResponseEntity<>(climateActionService.getSelectedClimateAction(actionID), HttpStatus.OK);
    }
    @GetMapping
    ResponseEntity<List<ClimateActionDTO>> getAllClimateActions(){
       return new ResponseEntity<>(climateActionService.getClimateActions(), HttpStatus.OK);
    }

    @PatchMapping("{actionID}")
    ResponseEntity<Void> updateClimateAction(@PathVariable ("actionID") String climateActionId, @RequestBody ClimateActionDTO climateActionDTO){
        climateActionService.updateClimateActions(climateActionId,climateActionDTO);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("{actionID}")
    ResponseEntity<Void> deleteClimateAction(@PathVariable ("actionID") String climateActionId){
        climateActionService.deleteClimateActions(climateActionId);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }



}
