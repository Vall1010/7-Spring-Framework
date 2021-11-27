package com.montrealcollege.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.montrealcollege.entities.Department;
import com.montrealcollege.entities.Employee;

@Configuration
public class AppConfig {

	@Bean
	public Employee emp1() {
		Employee emp = new Employee();
		emp.setFirstName("Vall");
		emp.setLastName("Sumatra");
		emp.setSalary(37000);
		emp.setEmail("ap@gmail.com");
		return emp;
	}

	@Bean
	public Employee emp2() {
		Employee emp = new Employee();
		emp.setFirstName("Psalm");
		emp.setLastName("Silao");
		emp.setSalary(50000);
		emp.setEmail("ps@gmail.com");
		return emp;
	}

	@Bean
	public Employee emp3() {
		Employee emp = new Employee();
		emp.setFirstName("Rhobie");
		emp.setLastName("Tagose");
		emp.setSalary(40000);
		emp.setEmail("rh@gmail.com");
		return emp;
	}

	@Bean
	@Scope("singleton")
	public Department dept1() {
		Department dept = new Department();
		dept.setId(1010);
		dept.setName("IT Department");
		dept.setCity("Montreal");

		return dept;
	}

}
