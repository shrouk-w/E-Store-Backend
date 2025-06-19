package com.springcourse.store.api.model.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

public class RegistrationBody {

    @NotBlank(message = "username is required")
    @Size(min = 3, max = 255)
    private String username;
    @NotBlank
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,20}$")
    @Size(min = 6, max = 32)
    private String password;
    @NotBlank
    @Email
    @Schema(example = "email@email.com")
    private String email;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
