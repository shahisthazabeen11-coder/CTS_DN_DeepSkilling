package com.cognizant.jwt.controllers;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt.models.AuthenticationResponse;
import com.cognizant.jwt.util.JWTUtil;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String header) {

        String encoded = header.substring(6);

        byte[] decoded =
                Base64.getDecoder().decode(encoded);

        String credentials =
                new String(decoded, StandardCharsets.UTF_8);

        String username =
                credentials.split(":")[0];

        String token =
                JWTUtil.generateToken(username);

        return new AuthenticationResponse(token);

    }

}