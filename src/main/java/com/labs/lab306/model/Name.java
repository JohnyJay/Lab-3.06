package com.labs.lab306.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private String Salutation;


}
