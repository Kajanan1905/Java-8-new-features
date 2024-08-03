package com.kajanan.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();

		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");

		// 1.Ascending order and Descending order
		// Ascending order
		List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedList);

		// By Lambda
		List<String> sortedList1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortedList1);

		List<String> sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList2);

		// Descending order
		List<String> sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList3);

		// By Lambda
		List<String> sortedList4 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortedList4);

		// 2.How to sort EMP by their salary or age or name ASC and DSC
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(10, "kajanan", 29, 40000));
		employees.add(new Employee(20, "Vinojan", 28, 35000));
		employees.add(new Employee(30, "Ratheesan", 29, 45000));
		employees.add(new Employee(40, "Lambo", 29, 50000));

		List<Employee> employeesSortedList = employees.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}

		}).collect(Collectors.toList());

		System.out.println(employeesSortedList);

		// Lambda
		List<Employee> employeesSortedListByLambda = employees.stream()
				.sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());

		System.out.println(employeesSortedListByLambda);

		// Lambda
		List<Employee> employeesSortedListByLambdaDSC = employees.stream()
				.sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());

		System.out.println(employeesSortedListByLambdaDSC);

		// Method Reference Asc
		List<Employee> employeeListByMethodref = employees.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(employeeListByMethodref);

		// Method Reference Dsc
		List<Employee> employeeListByMethodrefDsc = employees.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(employeeListByMethodrefDsc);

	}

}
