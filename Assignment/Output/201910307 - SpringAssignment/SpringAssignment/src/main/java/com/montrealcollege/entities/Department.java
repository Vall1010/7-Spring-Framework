package com.montrealcollege.entities;


public class Department {

	private Integer id;
	private String name;
	private String City;

	public Department() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", City=" + City + "]";
	}

}
