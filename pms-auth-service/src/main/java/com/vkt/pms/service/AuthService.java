package com.vkt.pms.service;

import com.vkt.pms.requestDto.LoginRequest;
import com.vkt.pms.utility.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public Optional<String> authenticate(LoginRequest req) {
        Optional<String> token = userService.getUserByEmail(req.getEmail())
                .filter(u-> passwordEncoder.matches(req.getPassword(),u.getPassword()))
                .map(jwtUtil::generateToken);
        return token;
    }

    public boolean validateToken(String token){
        return jwtUtil.isTokenValid(token);
    }
}
