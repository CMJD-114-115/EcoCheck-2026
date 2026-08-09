package lk.ijse.cmjd114_115.EcoCheck2026.controller.secure;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.JWTResponseDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.SignInDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.service.secure.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<JWTResponseDTO> signUp(@RequestBody UserDTO signInUser){
        return ResponseEntity.ok(authService.signUp(signInUser));
    }

    @PostMapping("/signin")
    public ResponseEntity<JWTResponseDTO> signIn(@RequestBody SignInDTO signUpUser){
        return ResponseEntity.ok(authService.signIn(signUpUser));
    }
}
