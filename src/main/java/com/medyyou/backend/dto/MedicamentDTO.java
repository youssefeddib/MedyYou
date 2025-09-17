package com.medyyou.backend.dto;

import java.math.BigDecimal;

public class MedicamentDTO {

    private Long id;
    private String nom;
    private String description;
    private BigDecimal prix;

    // Infos minimales sur la pharmacie
    private Long pharmacieId;
    private String pharmacieNom;

    public MedicamentDTO() {}

    public MedicamentDTO(Long id, String nom, String description, BigDecimal prix,
                         Long pharmacieId, String pharmacieNom) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.pharmacieId = pharmacieId;
        this.pharmacieNom = pharmacieNom;
    }

    // --- Getters & Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public Long getPharmacieId() {
        return pharmacieId;
    }

    public void setPharmacieId(Long pharmacieId) {
        this.pharmacieId = pharmacieId;
    }

    public String getPharmacieNom() {
        return pharmacieNom;
    }

    public void setPharmacieNom(String pharmacieNom) {
        this.pharmacieNom = pharmacieNom;
    }
}
