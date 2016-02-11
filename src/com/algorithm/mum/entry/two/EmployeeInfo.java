package com.algorithm.mum.entry.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {

	public static List<Employee> sortByName(List<Employee> employees) {

		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.getName().equals(e2.getName())) {
					return e2.getSalary() - e1.getSalary();
				}
				return e1.getName().compareTo(e2.getName());
			}
		});

		return employees;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Billy", 10000);
		Employee e2 = new Employee("Andrew", 20000);
		Employee e3 = new Employee("Dean", 30000);
		Employee e4 = new Employee("Andrew", 30000);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		List<Employee> result = EmployeeInfo.sortByName(employees);
		for (Employee employee : result) {
			System.out.println(employee.getName() + " : "
					+ employee.getSalary());
		}
	}
}
