package com.example.employeemanagement.domain;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Employee {

    @NotNull(message= "Id cannot be null.")
    private Integer id;

    @NotBlank
    @Size(min=2, max=18,message="first Name must be between 2 and 18")
    private String firstName;
    private String lastName;

    @Valid
    private Address address;

}
