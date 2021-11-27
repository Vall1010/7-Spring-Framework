package com.montrealcollege.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String firstName;
	private String lastName;
	private Integer salary;
	private String email;
	
	@Autowired
	private Department department;

	public Employee() {

	}



	public Employee(String firstName, String lastName, Integer salary, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.email = email;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		department = department;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", email=" + email
				+ ", Department=" + department + "]";
	}

}
