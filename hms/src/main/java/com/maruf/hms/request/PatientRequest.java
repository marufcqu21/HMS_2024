package com.maruf.hms.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.sql.Time;
import java.util.Date;
@Data
public class PatientRequest {
    @NotNull
    @Size(min = 2, max = 20, message="{validation.name.size}")
    private String patientName;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    @NotNull
    private String time;
    @NotNull
    private String prescription;
}
