package com.example.budgetbook.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    
    private UUID id;

    private String email;

    private String firstName;

    private String lastName;

    private String password;
}
