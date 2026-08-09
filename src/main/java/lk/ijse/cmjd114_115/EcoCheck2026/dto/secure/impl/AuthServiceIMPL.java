package lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.impl;

import jakarta.transaction.Transactional;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.JWTResponseDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.SignInDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.service.secure.AuthService;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AuthServiceIMPL implements AuthService {
    @Override
    public JWTResponseDTO signIn(SignInDTO signIn) {
        return null;
    }

    @Override
    public JWTResponseDTO signUp(UserDTO user) {
        return null;
    }
}
