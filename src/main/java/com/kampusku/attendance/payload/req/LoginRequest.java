package com.kampusku.attendance.payload.req;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

}