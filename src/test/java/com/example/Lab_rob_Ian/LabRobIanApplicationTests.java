package com.example.Lab_rob_Ian;

import com.example.Lab_rob_Ian.models.Department;
import com.example.Lab_rob_Ian.models.Employee;
import com.example.Lab_rob_Ian.models.Project;
import com.example.Lab_rob_Ian.repositories.DepartmentRepository;
import com.example.Lab_rob_Ian.repositories.EmployeeRepository;
import com.example.Lab_rob_Ian.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LabRobIanApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department1 = new Department("Public Relations");
		departmentRepository.save(department1);

		Project project1 = new Project("Making the rich richer");
		projectRepository.save(project1);

		Employee boris = new Employee("Alexander Boris", "de Pfeffel Johnson",
				45, 1, "Journo@theTelegraph.com", department1);
		employeeRepository.save(boris);
		project1.addEmployee(boris);
		projectRepository.save(project1);
	}

}
