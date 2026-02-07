package com.neeth.sb.springboot_pagination.service;

import com.neeth.sb.springboot_pagination.entity.Employee;
import com.neeth.sb.springboot_pagination.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        for(int t= 1; t<=100; t++) {
            employeeRepository.save(new Employee("First"+t, "Last"+t,1000.06*t, new Date(),"Development", "Contract", "email"+t+"@gmail.com",t+"90876543", "Address +"+t ));
        }
    }
}
