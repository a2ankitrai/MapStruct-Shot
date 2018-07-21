package com.ank.mss.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDto {

    private String username;
    
    private int ageInYears;
    
    private int houseNo;
    
    private String locality;
    
    private String city;
    
}
