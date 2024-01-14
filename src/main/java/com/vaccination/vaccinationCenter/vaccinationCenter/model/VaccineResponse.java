package com.vaccination.vaccinationCenter.vaccinationCenter.model;

import com.vaccination.vaccinationCenter.vaccinationCenter.entity.VaccinationEntity;

import java.util.List;

public class VaccineResponse {

    private VaccinationEntity vaccinationEntity;

    private List<CitizenModel> citizenModels;

    public VaccineResponse(VaccinationEntity vaccinationEntity) {
        this.vaccinationEntity = vaccinationEntity;
    }

    public VaccineResponse() {
    }

    public VaccinationEntity getVaccinationEntity() {
        return vaccinationEntity;
    }

    public void setVaccinationEntity(VaccinationEntity vaccinationEntity) {
        this.vaccinationEntity = vaccinationEntity;
    }

    public List<CitizenModel> getCitizenModels() {
        return citizenModels;
    }

    public void setCitizenModels(List<CitizenModel> citizenModels) {
        this.citizenModels = citizenModels;
    }
}
