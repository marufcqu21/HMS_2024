package com.maruf.hms.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.util.Date;
@Data
public class DoctorRequest {
    @NotNull
    @Size(min = 10, max = 15)
    private Long appointmentId;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date date;
    @NotNull
    private Time time;
    @NotNull
    @Size(min = 2, max = 20, message ="{validation.name.size}")
    private String patientName;

}
