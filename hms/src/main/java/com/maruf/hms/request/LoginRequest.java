package com.maruf.hms.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginRequest {
    @NotNull
    private String email;
    @NotNull
    @Size(min = 4, max = 20)
    private String password;
}
