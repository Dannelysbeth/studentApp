package com.dannelysbeth.mongorestfullapi.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String country;
    private String city;
    private String zipCode;
}
