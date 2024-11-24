package com.personal.todoapp.authentication;

import com.personal.todoapp.configuration.security.JWTService;
import com.personal.todoapp.user.User;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@AllArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final JWTService jwtService;
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> register(@ModelAttribute RegisterUserDTO registerUserDTO) {
        User registeredUser = authenticationService.signup(registerUserDTO);

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> authenticate(@ModelAttribute LoginUserDTO loginUserDTO) {
        User authenticatedUser = authenticationService.login(loginUserDTO);

        String jwtToken = jwtService.generateToken(new HashMap<>(), authenticatedUser);

        LoginResponseDTO loginResponseDTO = LoginResponseDTO.builder()
                .token(jwtToken)
                .build();

        return ResponseEntity.ok(loginResponseDTO);
    }
}
