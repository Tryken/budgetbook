package com.example.budgetbook.user.domain.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "product")
public class UserEntity {

    @Id
    private UUID id;
    
    private String email;

    private String firstName;

    private String lastName;

    private String password;
}
