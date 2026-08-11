package com.srushti.employees;

import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {

    private final Employees employees;

    public EmployeeManager() {
        employees = new Employees();

        employees.addEmployee(new Employee(
                "1",
                "Srushti",
                "Agrawal",
                "srush@example.com",
                "Software Engineer"
        ));

        employees.addEmployee(new Employee(
                "2",
                "Venkatesh",
                "Paitwar",
                "venky@example.com",
                "Database Engineer"
        ));

        employees.addEmployee(new Employee(
                "3",
                "Gauri",
                "Murkya",
                "gaura@example.com",
                "System Analyst"
        ));
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.addEmployee(employee);
    }
}