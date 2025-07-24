package com.vkt.pms.controller;

import com.vkt.pms.requestDto.UserRegistrationRequest;
import com.vkt.pms.service.AuthService;
import com.vkt.pms.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserRegistrationController {
    private final UserService userService;

    @PostMapping()
    public ResponseEntity<Map<String,String>> userRegistration(@RequestBody UserRegistrationRequest req) {
        return ResponseEntity.ok(userService.createUser(req));
    }
}
