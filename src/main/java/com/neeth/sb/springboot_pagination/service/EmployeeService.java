package com.neeth.sb.springboot_pagination.service;

import com.neeth.sb.springboot_pagination.entity.Employee;
import com.neeth.sb.springboot_pagination.model.EmployeeDTO;
import com.neeth.sb.springboot_pagination.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeDTO getEmployees(int page) {
        page = page < 1 ? 0 : page - 1;
        Pageable pageable = PageRequest.of(page, 5, Sort.Direction.DESC, "dateOfJoining");
        return new EmployeeDTO(employeeRepository.findAll(pageable));
    }
}
