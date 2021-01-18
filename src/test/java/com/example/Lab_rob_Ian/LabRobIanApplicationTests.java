package com.example.Lab_rob_Ian;

import com.example.Lab_rob_Ian.models.Employee;
import com.example.Lab_rob_Ian.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LabRobIanApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee boris = new Employee("Alexander Boris", "de Pfeffel Johnson",
				45, 1, "Journo@theTelegraph.com");
		employeeRepository.save(boris);
	}

}
