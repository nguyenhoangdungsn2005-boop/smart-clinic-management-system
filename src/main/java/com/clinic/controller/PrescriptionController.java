package com.clinic.controller;

import com.clinic.model.Prescription;
import com.clinic.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    // ✅ POST endpoint: save prescription with validation
    @PostMapping("/save")
    public ResponseEntity<?> savePrescription(@RequestBody Prescription prescription, @RequestHeader("Authorization") String token) {
        try {
            Prescription saved = prescriptionService.savePrescription(prescription, token);
            return ResponseEntity.ok(saved);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error saving prescription: " + e.getMessage());
        }
    }
}
