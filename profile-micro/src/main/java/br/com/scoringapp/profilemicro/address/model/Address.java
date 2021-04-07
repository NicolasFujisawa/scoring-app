package br.com.scoringapp.profilemicro.address.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Address implements Serializable {

    private static final long serialVersionUID = 1331826007886728184L;

    String number;
    String route;
    String city;
    String state;
    String country;
}
