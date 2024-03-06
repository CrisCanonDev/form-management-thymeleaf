package com.ccdev.formsthymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String email;
    private String password;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date dateOfBirth;
    private String gender;
    private String profession;
    private boolean working;
    private String additionalInformation;

}
