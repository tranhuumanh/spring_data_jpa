package org.example.repository;

import org.example.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    ArrayList<Employee> findAllEmployee();
}
