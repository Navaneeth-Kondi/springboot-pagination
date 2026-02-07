package com.neeth.sb.springboot_pagination.controller;

import com.neeth.sb.springboot_pagination.model.EmployeeDTO;
import com.neeth.sb.springboot_pagination.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public EmployeeDTO fetchAllEMployees(@RequestParam(value = "page", defaultValue = "1") int page) {
        return employeeService.getEmployees(page);
    }
}
