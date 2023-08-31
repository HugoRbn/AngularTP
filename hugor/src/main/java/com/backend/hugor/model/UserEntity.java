package com.backend.hugor.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class UserEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY) // Permet l'auto-incrémentation de l'id
    @Id // Clé primaire de la table
    @Column(name="id")
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    @Column(name = "date_naissance")
    private String dateNaissance;
    private String ville;
    @Column(name = "code_postal")
    private String codePostal;

}
