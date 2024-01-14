package com.vaccination.vaccinationCenter.vaccinationCenter.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vaccincecenter", schema = "vaccine")
public class VaccinationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vaccincecenter_seq")
    @SequenceGenerator(name = "vaccincecenter_seq",allocationSize = 1)
    private int id;
    @Column(name = "centername")
    private String centerName;
    @Column(name = "centeraddress")
    private String centerAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterAddress() {
        return centerAddress;
    }

    public void setCenterAddress(String centerAddress) {
        this.centerAddress = centerAddress;
    }
}
