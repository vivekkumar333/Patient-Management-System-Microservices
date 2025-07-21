package com.vkt.pms.service;

public class RegistrationService {
//    private final KafkaTemplate<String, Object> kafkaTemplate;
//
//    public void register(RegisterRequest req) {
//        if (userRepo.findByEmail(req.getEmail()).isPresent()) {
//            throw new RuntimeException("Email already registered.");
//        }
//
//        User user = User.builder()
//                .email(req.getEmail())
//                .password(passwordEncoder.encode(req.getPassword()))
//                .role(Role.PATIENT)
//                .status(Status.ACTIVE)
//                .createdAt(LocalDateTime.now())
//                .updatedAt(LocalDateTime.now())
//                .build();
//
//        userRepo.save(user);
//
//        if (user.getRole() == Role.PATIENT) {
//            kafkaTemplate.send("patient-registration-topic", req);
//        }
//    }
}
