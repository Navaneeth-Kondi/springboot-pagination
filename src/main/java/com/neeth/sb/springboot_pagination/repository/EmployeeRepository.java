package com.neeth.sb.springboot_pagination.repository;

import com.neeth.sb.springboot_pagination.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
