package com.maruf.hms.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequest {
    @NotNull
    private String type;
    @NotNull
    @Size(min = 2, max = 20, message ="{validation.name.size}")
    private String name;
    @NotBlank
    @Size(min = 10, max = 10)
    private Integer age;
    @NotNull
    private String gender;
    @NotNull
    private String city;
    @NotNull
    @Size(min = 11, max = 13)
    private String phone;
    @NotNull
    private String email;
    @NotNull
    @Size(min = 4, max = 20)
    private String password;



}
