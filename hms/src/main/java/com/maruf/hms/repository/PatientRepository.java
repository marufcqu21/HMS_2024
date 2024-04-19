package com.maruf.hms.repository;

import com.maruf.hms.entity.Patient;
import com.maruf.hms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<User> findByDoctorId(Long doctorId);
}
