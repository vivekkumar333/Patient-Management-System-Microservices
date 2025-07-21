package com.vkt.pms.controller;

import com.vkt.pms.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class UserRegistrationController {
//    private final AuthService authService;
//
//    @PostMapping("/register")
//    public ResponseEntity<String> register(@RequestBody RegisterRequest req) {
//        authService.register(req);
//        return ResponseEntity.ok("User registered.");
//    }
}
