package com.neeth.sb.springboot_pagination;

import com.neeth.sb.springboot_pagination.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPaginationApplication.class, args);
	}

}
