package lk.ijse.cmjd114_115.EcoCheck2026.controller.secure;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.JWTResponseDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.SignInDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<JWTResponseDTO> signUp(@RequestBody UserDTO user){
        return null;
    }

    @PostMapping("/signup")
    public ResponseEntity<JWTResponseDTO> signIn(@RequestBody SignInDTO signInDTOUser){
        return null;
    }
}
