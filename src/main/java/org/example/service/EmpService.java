package org.example.service;

import org.example.modal.Employee;

import java.util.ArrayList;

public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
}
