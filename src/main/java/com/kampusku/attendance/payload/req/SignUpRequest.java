package com.kampusku.attendance.payload.req;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SignUpRequest {

    @NotBlank
    @Size(min = 3, max = 15)
    private String username;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

}