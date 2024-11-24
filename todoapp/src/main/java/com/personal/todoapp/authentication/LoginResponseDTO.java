package com.personal.todoapp.authentication;

import lombok.*;

@AllArgsConstructor @Getter @Setter @Builder
public class LoginResponseDTO {
    private String token;
    private long expiresIn;
}
