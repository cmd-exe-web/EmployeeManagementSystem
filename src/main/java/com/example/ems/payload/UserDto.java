package com.example.ems.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class UserDto {
    private long id;
    @NotEmpty
    @Size(min = 3, message = "Username must be at least 3 characters!")
    private String name;
    @Email(message = "Email address is not valid!")
    private String email;
    @NotEmpty
    @Size(min = 3, max = 10, message = "Password must be min of 3 chars and max of 10 chars!")
    private String password;

}
