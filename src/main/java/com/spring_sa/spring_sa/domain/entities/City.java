package com.spring_sa.spring_sa.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class City {
    @Id
    @Column(columnDefinition = "VARCHAR(5)", nullable = false)
    private String codecity;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String namecity;

    @ManyToOne
    private Region regions;


    public City() {
    }

    public String getCodecity() {
        return codecity;
    }

    public void setCodecity(String codecity) {
        this.codecity = codecity;
    }

    public String getNamecity() {
        return namecity;
    }

    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }
    

}
