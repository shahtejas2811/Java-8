package com.pojo;


public class Emp {

	private int id;
	private String name;
	private Designation designation;
	private int age;
	private long salary;
	private Department department;

	public enum Department {

		RESEARCH, SALES, DEVELOPMENT
	}

	public enum Designation {

		MANAGER, TECHLEAD, SSE, JRSC, VP, ASSOCIATE
	}

	public Emp(int id, String name, Designation designation, int age, long salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + ", salary="
				+ salary + ", department=" + department + "]";
	}

}
