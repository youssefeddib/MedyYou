package com.medyyou.backend.dto;

import com.medyyou.backend.entity.ERole;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String telephone;
    private String adresse;
    private ERole role; // نختار واحد فقط: ROLE_CLIENT أو ROLE_PHARMACIEN
}
