package com.vaccination.vaccinationCenter.vaccinationCenter.controller;

import com.vaccination.vaccinationCenter.vaccinationCenter.entity.VaccinationEntity;
import com.vaccination.vaccinationCenter.vaccinationCenter.model.CitizenModel;
import com.vaccination.vaccinationCenter.vaccinationCenter.model.VaccineResponse;
import com.vaccination.vaccinationCenter.vaccinationCenter.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/vaccine-center")
public class VaccinationCenterController {

    @Autowired
    VaccineService vaccineService;
    @Autowired
    RestTemplate restTemplate;

    @Value("${Uri.citizenService}")
    private String citizenUri;

    @PostMapping("/addCenter")
    public ResponseEntity<VaccineResponse> addCenter(@RequestBody VaccinationEntity vaccinationEntity){
        VaccineResponse vaccineResponse = vaccineService.addVaccineCenter(vaccinationEntity);
        return new ResponseEntity<>(vaccineResponse, HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<VaccineResponse> getAllDataBasedOnCenterID(@PathVariable("id") Integer id){
        //get all data from vaccine center db for 'id'
        VaccinationEntity vaccineCenterById = vaccineService.getVaccineCenterById(id);
        //get all data from citizen db for 'id'
        CitizenModel getCitizenById = restTemplate.getForObject(citizenUri + id, CitizenModel.class);

        VaccineResponse vaccineResponse = new VaccineResponse();
        vaccineResponse.setVaccinationEntity(vaccineCenterById);
        vaccineResponse.setCitizenModels(Collections.singletonList(getCitizenById));

        return new ResponseEntity<>(vaccineResponse,HttpStatus.OK);
    }
}
