package com.medyyou.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table(name = "horaires")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Horaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // اليوم من الأسبوع (MONDAY, TUESDAY, ...)
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Le jour est obligatoire")
    private DayOfWeek jour;

    @NotNull(message = "L'heure d'ouverture est obligatoire")
    private LocalTime heureOuverture;

    @NotNull(message = "L'heure de fermeture est obligatoire")
    private LocalTime heureFermeture;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pharmacie_id", nullable = false)
    private Pharmacie pharmacie;
}
