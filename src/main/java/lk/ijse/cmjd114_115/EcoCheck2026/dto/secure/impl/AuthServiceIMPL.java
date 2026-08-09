package lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.impl;

import jakarta.transaction.Transactional;
import lk.ijse.cmjd114_115.EcoCheck2026.config.JWTUtil;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.UserDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.JWTResponseDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.secure.SignInDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.service.secure.AuthService;
import lk.ijse.cmjd114_115.EcoCheck2026.util.Conversion;
import lk.ijse.cmjd114_115.EcoCheck2026.util.IDGenerate;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthServiceIMPL implements AuthService {
    private final Conversion conversion;
    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JWTUtil  jwtUtil;


    @Override
    public JWTResponseDTO signIn(SignInDTO signIn) {
        authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(
                        signIn.getEmail(),
                        signIn.getPassword()
                ));

        var authUser= userDao.findByEmail(signIn.getEmail())
                .orElseThrow(()->
                        new UsernameNotFoundException("User not found"));

        String token = jwtUtil.generateToken(
                authUser.getEmail(),
                authUser.getAuthorities());

       return JWTResponseDTO
                .builder()
                .token(token)
                .build();

    }

    @Override
    public JWTResponseDTO signUp(UserDTO user) {
        if(userDao.existsByEmail(user.getEmail())) {
            throw new IllegalStateException("User already exists");
        }
        user.setUserId(IDGenerate.userId());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        UserEntity savedUser =
                userDao.save(conversion.toUserEntity(user));

        String token = jwtUtil.generateToken(
                savedUser.getEmail(),
                savedUser.getAuthorities()
        );
        return JWTResponseDTO
                .builder()
                .token(token)
                .build();
    }
}
