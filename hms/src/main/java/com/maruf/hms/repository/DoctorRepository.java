package com.maruf.hms.repository;

import com.maruf.hms.entity.Doctor;
import com.maruf.hms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
@Repository
public interface DoctorRepository extends JpaRepository <Doctor, Long> {
    Optional<User> findByAppointmentId(Long appointmentId);
    Optional<User> findByPatientName(String patientName);
    Optional<User> findByDate(Date date);

}
