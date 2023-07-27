package com.example.bossmanagementsystem;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Boss {

    int bosId;
    String name;
    int age;

    float salary;
    int rating;

    List<Employee> employeeList;

}
