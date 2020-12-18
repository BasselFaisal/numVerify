package com.phonaVerify.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PhoneData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean valid;
    private double number;
    private double local_format;
    private double international_format;
    private double country_prefix;
    private String country_code;
    private String country_name;
    private String location;
    private String carrier;
    private String line_type;

}
