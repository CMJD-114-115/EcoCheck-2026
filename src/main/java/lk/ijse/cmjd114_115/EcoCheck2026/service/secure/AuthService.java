package lk.ijse.cmjd114_115.EcoCheck2026.service.secure;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.JWTResponseDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.SignInDTO;

public interface AuthService {
    JWTResponseDTO signIn(SignInDTO signIn);
    JWTResponseDTO signUp(UserDTO user);
}
