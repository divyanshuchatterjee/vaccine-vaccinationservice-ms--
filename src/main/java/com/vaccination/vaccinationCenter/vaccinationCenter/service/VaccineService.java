package com.vaccination.vaccinationCenter.vaccinationCenter.service;

import com.vaccination.vaccinationCenter.vaccinationCenter.entity.VaccinationEntity;
import com.vaccination.vaccinationCenter.vaccinationCenter.model.VaccineResponse;
import com.vaccination.vaccinationCenter.vaccinationCenter.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VaccineService {

    @Autowired
    VaccineRepository vaccineRepository;

    public VaccineResponse addVaccineCenter(VaccinationEntity vaccinationEntity){
        VaccinationEntity save = vaccineRepository.save(vaccinationEntity);
        return new VaccineResponse(save);
    }

    public VaccinationEntity getVaccineCenterById(Integer id) {
        Optional<VaccinationEntity> vaccineRepositoryById = vaccineRepository.findById(id);
        return vaccineRepositoryById.orElseGet(VaccinationEntity::new);
    }
}
