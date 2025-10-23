# Database Schema (MySQL)

## Tables
- Doctor (doctor_id, name, email, specialization)
- Patient (patient_id, name, email, phone)
- Appointment (appointment_id, doctor_id, patient_id, appointment_time)
- Prescription (prescription_id, appointment_id, medication, notes)

## Relationships
- Appointment has @ManyToOne with Doctor and Patient
- Prescription has @OneToOne with Appointment
