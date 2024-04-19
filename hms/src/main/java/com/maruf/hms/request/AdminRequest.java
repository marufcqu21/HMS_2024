package com.maruf.hms.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.util.Date;

@Data
public class AdminRequest {
  /*  @NotNull
    private String permission; */
    @NotNull
    private String doctorName;
    @NotNull
    private String patientName;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date date;
    @NotNull
    private String time;
}
