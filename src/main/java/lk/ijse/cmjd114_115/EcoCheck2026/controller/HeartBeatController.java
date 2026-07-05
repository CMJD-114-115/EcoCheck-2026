package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/heart-beat")
public class HeartBeatController {
    @GetMapping
   public String  heartBeat(){
       return "Eck-Check-2026 is up and running";
   }
}
