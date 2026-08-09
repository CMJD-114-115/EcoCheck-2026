package lk.ijse.cmjd114_115.EcoCheck2026.controller.secure;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.JWTResponse;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.SignIn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<JWTResponse> signUp(@RequestBody UserDTO user){
        return null;
    }

    @PostMapping("/signup")
    public ResponseEntity<JWTResponse> signIn(@RequestBody SignIn signInUser){
        return null;
    }
}
