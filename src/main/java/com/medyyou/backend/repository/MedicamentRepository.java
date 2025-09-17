package com.medyyou.backend.repository;

import com.medyyou.backend.entity.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicamentRepository extends JpaRepository<Medicament, Long> {
    List<Medicament> findByPharmacieId(Long pharmacieId);
}
