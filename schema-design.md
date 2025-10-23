# Database Schema Design – Smart Clinic Management System

## Overview
The system uses **MySQL** as the relational database for managing doctors, patients, and appointments.  
The design includes **four core tables** with primary and foreign key relationships.

---

## Tables

### 1. Doctor
| Field | Type | Description |
|--------|------|-------------|
| doctor_id | INT (PK, AUTO_INCREMENT) | Unique doctor ID |
| name | VARCHAR(100) | Doctor’s full name |
| specialty | VARCHAR(100) | Doctor’s area of specialization |
| available_times | JSON | List of available time slots |

---

### 2. Patient
| Field | Type | Description |
|--------|------|-------------|
| patient_id | INT (PK, AUTO_INCREMENT) | Unique patient ID |
| name | VARCHAR(100) | Patient’s full name |
| email | VARCHAR(100, UNIQUE) | Patient’s contact email |
| phone | VARCHAR(20) | Patient’s phone number |

---

### 3. Appointment
| Field | Type | Description |
|--------|------|-------------|
| appointment_id | INT (PK, AUTO_INCREMENT) | Unique appointment ID |
| doctor_id | INT (FK → Doctor.doctor_id) | Associated doctor |
| patient_id | INT (FK → Patient.patient_id) | Associated patient |
| appointment_time | DATETIME | Scheduled appointment date and time |

---

### 4. Prescription
| Field | Type | Description |
|--------|------|-------------|
| prescription_id | INT (PK, AUTO_INCREMENT) | Unique prescription ID |
| appointment_id | INT (FK → Appointment.appointment_id) | Linked appointment |
| details | TEXT | Prescription content |
| created_at | TIMESTAMP | Record creation timestamp |

---

## Relationships
- One **Doctor** → Many **Appointments**  
- One **Patient** → Many **Appointments**  
- One **Appointment** → One **Prescription**

---

## ER Diagram (text description)
Doctor (1) ────< (many) Appointment (many) >──── Patient (1)
│
▼
Prescription (1)
---

✅ **Database summary:**
- 4 tables (`Doctor`, `Patient`, `Appointment`, `Prescription`)  
- Proper **primary** and **foreign keys**  
- Clear one-to-many relationships between entities  
- Follows normalization and extensibility best practices

