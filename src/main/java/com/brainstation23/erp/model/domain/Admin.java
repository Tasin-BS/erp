package com.brainstation23.erp.model.domain;

import com.brainstation23.erp.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private UserRole userRole;

}