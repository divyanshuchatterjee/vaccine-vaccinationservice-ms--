package com.vaccination.vaccinationCenter.vaccinationCenter.repository;

import com.vaccination.vaccinationCenter.vaccinationCenter.entity.VaccinationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends JpaRepository<VaccinationEntity, Integer> {


}
