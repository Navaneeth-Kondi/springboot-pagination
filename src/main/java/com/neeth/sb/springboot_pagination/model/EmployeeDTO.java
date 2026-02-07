package com.neeth.sb.springboot_pagination.model;

import com.neeth.sb.springboot_pagination.entity.Employee;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Getter
@Setter
public class EmployeeDTO {

    private List<Employee> data;

    private long totalEmployees;

    private boolean isFirstPage;

    private boolean isLastPage;

    private int pageNumber;

    private int totalPages;

    private boolean hasPreviousPage;

    private boolean hasNextPage;


    public EmployeeDTO(Page<Employee> pageable) {
        this.data = pageable.getContent();
        this.totalEmployees = pageable.getTotalElements();
        this.isFirstPage = pageable.isFirst();
        this.isLastPage = pageable.isLast();
        this.pageNumber = pageable.getNumber() + 1;
        this.totalPages = pageable.getTotalPages();
        this.hasPreviousPage = pageable.hasPrevious();
        this.hasNextPage = pageable.hasNext();
    }
}
