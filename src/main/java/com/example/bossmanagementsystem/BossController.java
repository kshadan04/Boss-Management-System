package com.example.bossmanagementsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BossController {

    @Autowired
    BossService bossService;

    @PostMapping("/add_employee")
    public String addEmployee(@RequestBody Employee employee){
        bossService.addEmployee(employee);

        return "employee added successfully";
    }

    @PostMapping("/add_boss")
    public String addBoss(@RequestBody Boss boss){
        bossService.addBoss(boss);

        return "boss added successfully";
    }

    @GetMapping("/get-emp")
    public List<Employee> getEmployeeWhoseAgeIsUnderGivenAndRatingGreaterThanX(@RequestParam int age, @RequestParam int rating){
        return bossService.getEmployeeWhoseAgeIsUnderGivenAndRatingGreaterThanX(age,rating);
    }

    @GetMapping("/get_xRatingEmp")
    public int bossAndEmpRatingGreaterThanX(@RequestParam int x){
        return bossService.bossAndEmpRatingGreaterThanX(x);
    }

    @PostMapping("/updated")
    public String updateBossSalary(@RequestParam int newSalary, @RequestParam int rating){

        bossService.updateBossSalary(newSalary,rating);
        return "Salary updated successfully";

    }


}
