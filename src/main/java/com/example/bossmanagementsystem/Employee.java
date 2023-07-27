package com.example.bossmanagementsystem;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    int empId;
    String name;
    int age;

    float salary;
    int rating;

    Boss boss;

}
