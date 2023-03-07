package model;

import enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {


    private String FirstName;
    private String LastName;
    private int age;
    private Gender gender;
}
