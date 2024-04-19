package com.maruf.hms.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LogoutRequest {
    @NotNull
    private String email;
}
