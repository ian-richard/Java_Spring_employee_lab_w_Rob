package com.example.Lab_rob_Ian.repositories;

import com.example.Lab_rob_Ian.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
