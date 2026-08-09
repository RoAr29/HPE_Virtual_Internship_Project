package com.srushti.employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public Employees getEmployees() {

        List<Employee> employeeList = List.of(
                new Employee(
                        "1",
                        "John",
                        "Doe",
                        "john.doe@example.com",
                        "Software Engineer"
                ),
                new Employee(
                        "2",
                        "Jane",
                        "Smith",
                        "jane.smith@example.com",
                        "Database Engineer"
                ),
                new Employee(
                        "3",
                        "Alex",
                        "Johnson",
                        "alex.johnson@example.com",
                        "System Analyst"
                )
        );

        return new Employees(employeeList);
    }
}