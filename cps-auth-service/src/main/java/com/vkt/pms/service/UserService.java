package com.vkt.pms.service;

import com.vkt.pms.entity.User;
import com.vkt.pms.enums.Role;
import com.vkt.pms.enums.Status;
import com.vkt.pms.repository.UserRepository;
import com.vkt.pms.requestDto.UserRegistrationRequest;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }


    public Map<String,String> createUser(UserRegistrationRequest req) {
        Map<String, String> message = new HashMap<>();
        try {
            if (userRepository.findByEmail(req.getEmail()).isPresent()) {
                throw new RuntimeException("Email already registered.");
            }
            User user = User.builder()
                    .email(req.getEmail())
                    .password(passwordEncoder.encode(req.getPassword()))
                    .role(Role.valueOf(req.getRole()))
                    .status(Status.ACTIVE)
                    .createdTimestamp(LocalDateTime.now())
                    .build();
            User savedUser = userRepository.save(user);
            if (!ObjectUtils.isEmpty(savedUser)) {
                message.put("msg", "User registered successfully");
            }
        }catch (Exception ex){
            throw  ex;
        }
        return message;
    }
}
