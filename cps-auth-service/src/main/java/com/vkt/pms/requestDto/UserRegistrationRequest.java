package com.vkt.pms.requestDto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserRegistrationRequest {
    private String email;
    private String password;
    private String name;
    private String address;
    private LocalDate dateOfBirth;
    private String role;
}
