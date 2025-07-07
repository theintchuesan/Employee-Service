package com.example.Employee;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface EmployeeService {
    String    createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id,Employee employee);
    Employee readEmployee(Long id);
}