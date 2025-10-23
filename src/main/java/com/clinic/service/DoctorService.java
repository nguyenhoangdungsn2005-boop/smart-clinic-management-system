package com.clinic.service;

import com.clinic.model.Doctor;
import com.clinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // ✅ Return available times for a doctor
    public List<String> getAvailableTimes(Long doctorId) {
        Doctor doctor = doctorRepository.findById(doctorId).orElse(null);
        return doctor != null ? doctor.getAvailableTimes() : null;
    }

    // ✅ Validate doctor credentials (demo logic)
    public boolean validateDoctorLogin(String email, String password) {
        Doctor doctor = doctorRepository.findByEmail(email);
        return doctor != null && doctor.getPassword().equals(password);
    }
}
