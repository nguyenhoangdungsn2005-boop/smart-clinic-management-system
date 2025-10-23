package com.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @GetMapping("/availability")
    public ResponseEntity<List<String>> getDoctorAvailability(@RequestParam String name) {
        // giả lập dữ liệu trả về
        List<String> times = List.of("09:00 AM", "10:00 AM", "02:00 PM");
        return ResponseEntity.ok(times);
    }

    @GetMapping("/validate")
    public ResponseEntity<String> validateDoctor(@RequestHeader("Authorization") String token) {
        if (token == null || token.isEmpty()) {
            return ResponseEntity.status(401).body("Invalid token");
        }
        return ResponseEntity.ok("Token validated successfully");
    }
}

