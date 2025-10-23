package com.clinic.repository;

import com.clinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    // ✅ Derived query: find patient by email
    Optional<Patient> findByEmail(String email);

    // ✅ Custom query: find by email or phone
    Optional<Patient> findByEmailOrPhone(String email, String phone);
}
