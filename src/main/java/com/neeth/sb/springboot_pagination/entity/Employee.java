package com.neeth.sb.springboot_pagination.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {

    @Id
    /*@SequenceGenerator(name="emp_id_gen", sequenceName = "emp_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_gen")*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private Double salary;

    private Date dateOfJoining;

    private String department;

    private String employmentType;

    private String emailId;

    private String phoneNumber;

    private String address;

    public Employee(String firstName, String lastName, Double salary, Date dateOfJoining, String department, String employmentType, String emailId, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.department = department;
        this.employmentType = employmentType;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
