package com.example.Lab_rob_Ian.repositories;

import com.example.Lab_rob_Ian.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
