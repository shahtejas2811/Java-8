package com.steamproblem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.pojo.Emp;
import com.pojo.Emp.Department;

/**
 * 
 * ● Filter on the list of Employee whose designation is manager and salary > 6000 using Predicate
 * ● Applying group by on the department
 * ● Usage of Optional in the program
 * ● Have an employee class with age and salary. Find the sum of salary whose age > given age.
 * 
 * 
 */

public class EmpProcessing {

	

	public static void main(String[] args) {

		List<Emp> empList = Arrays.asList(

				new Emp(1, "Ramesh", Emp.Designation.VP, 40, 9000L, Emp.Department.DEVELOPMENT),
				new Emp(2, "Mahesh", Emp.Designation.MANAGER, 35, 8000L, Emp.Department.RESEARCH),
				new Emp(3, "Suresh", Emp.Designation.MANAGER, 37, 7000L, Emp.Department.DEVELOPMENT),
				new Emp(4, "Paresh", Emp.Designation.MANAGER, 36, 5000L, Emp.Department.SALES),
				new Emp(5, "Hitesh", Emp.Designation.TECHLEAD, 31, 7000L, Emp.Department.DEVELOPMENT),
				new Emp(6, "Prinkesh", Emp.Designation.ASSOCIATE, 25, 5000L, Emp.Department.SALES),
				new Emp(7, "Chagan", Emp.Designation.JRSC, 28, 9000L, Emp.Department.RESEARCH),
				new Emp(8, "Magan", Emp.Designation.SSE, 29, 9000L, Emp.Department.DEVELOPMENT),
				new Emp(9, "Chaman", Emp.Designation.SSE, 28, 9000L, Emp.Department.DEVELOPMENT)

				
			
		);
		
		List<Emp> mangerList = empManageList(empList);
		System.err.println("Manager whose salary is more than 6000");
		mangerList.forEach(System.out::println);
		
		groupByEmp(empList);
		
		Optional<Long> totalSalary = sumOfSalaryMorethenAgeAbove30(empList);
		
		System.err.println("Total Salary whose age is greter than  30 "+totalSalary.get());
		
	}

	
	


	/*
	 * Filter on the list of Employee whose designation is manager and salary > 6000 using Predicate
	 */
	private static List<Emp> empManageList(List<Emp> empList) {

		return empList.stream()
				//predicate example 
				.filter(e -> e.getDesignation() == Emp.Designation.MANAGER && e.getSalary() > 6000L )
				.collect(Collectors.toList());
		 
	}
	
	/*
	 * Applying group by on the department
	 */
	private static Map<Emp.Department, List<Emp>> groupByEmp(List<Emp> empList) {

		Map<Department, List<Emp>> collect = empList.stream()
		.collect(Collectors.groupingBy(Emp::getDepartment));
		
		System.err.println("Employee count group by Department");
		
		collect.forEach((k,v) -> System.out.println("Department : "+ k + "   number of employee : "+ v.size()));
		
		
		System.err.println("Employee name group by Department");
		
		collect.forEach((k, v) -> System.out.println("Department : " +k +"   " + v.stream().map(m -> m.getName()).collect(Collectors.joining(","))));
		return collect;
	}

	/*
	 * Usage of Optional in the program
	 * Have an employee class with age and salary. Find the sum of salary whose age > given age.
	 */
	private static Optional<Long> sumOfSalaryMorethenAgeAbove30(List<Emp> empList) {
		
		Optional<Long> collect = empList.stream()
				.filter(e -> e.getAge() > 30)
				.map( e -> e.getSalary())
				.collect(Collectors.reducing( (a,b) -> a+b ));
				
		
		return collect;
		
	}

}



