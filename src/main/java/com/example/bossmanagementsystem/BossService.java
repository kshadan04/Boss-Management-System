package com.example.bossmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BossService {
    @Autowired
    BossRepository bossRepository;


    public void addEmployee(Employee employee) {
        bossRepository.addEmployee(employee);

    }

    public void addBoss(Boss boss) {
        bossRepository.addBoss(boss);
    }

    public List<Employee> getEmployeeWhoseAgeIsUnderGivenAndRatingGreaterThanX(int age, int rating) {
        return bossRepository.getEmployeeWhoseAgeIsUnderGivenAndRatingGreaterThanX(age,rating);
    }

    public int bossAndEmpRatingGreaterThanX(int x) {
        return bossRepository.bossAndEmpRatingGreaterThanX(x);
    }

    public void updateBossSalary(int newSalary, int rating) {
        bossRepository.updateBossSalary(newSalary,rating);
    }
}
