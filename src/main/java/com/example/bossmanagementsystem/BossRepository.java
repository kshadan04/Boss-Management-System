package com.example.bossmanagementsystem;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class BossRepository {

    HashMap<Integer,Employee> employeeDb = new HashMap<>();
    HashMap<Integer,Boss> bossDb = new HashMap<>();

    public void addEmployee(Employee employee) {
        employeeDb.put(employee.getEmpId(),employee);
    }

    public void addBoss(Boss boss) {
        bossDb.put(boss.getBosId(),boss);
    }

    public List<Employee> getEmployeeWhoseAgeIsUnderGivenAndRatingGreaterThanX(int age, int rating) {

        List<Employee> list = new ArrayList<>();
        for(Employee emp : employeeDb.values()){
            if(emp.getAge()<age && emp.getRating()>rating){
                list.add(emp);
            }
        }
        return list;
    }

    public int bossAndEmpRatingGreaterThanX(int x) {
        int count = 0;
        for(Boss boss : bossDb.values()){
            if(boss.getRating()>x){
                for(Employee emp: employeeDb.values()){
                    if(emp.getRating()>x){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public void updateBossSalary(int newSalary, int rating) {

        for(Boss boss: bossDb.values()){
            if(boss.getRating()>rating){
                boss.setSalary(newSalary);
            }
        }
    }
}
