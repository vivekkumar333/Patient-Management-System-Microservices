package com.vkt.pms.controller;

import com.vkt.pms.requestDto.UserRegistrationRequest;
import com.vkt.pms.service.AuthService;
import com.vkt.pms.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserRegistrationController {
    private final UserService userService;

    @PostMapping()
    public ResponseEntity<Map<String,String>> userRegistration(@RequestBody @Valid UserRegistrationRequest req) {
        return ResponseEntity.ok(userService.createUser(req));
    }
}
