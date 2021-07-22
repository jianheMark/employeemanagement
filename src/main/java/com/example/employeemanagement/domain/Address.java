package com.example.employeemanagement.domain;


import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter

public class Address {
    @NotBlank
    @Size(min=5,max=100, message="Street name character must be 5 to 100")
    private String street;

    @Size(min=2, max=2,message="state allow only 2 character.")
    private String state;
    private String zipCode;
}
