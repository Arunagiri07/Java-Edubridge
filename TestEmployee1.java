package liveclass;

import java.util.Scanner;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Employee1 employee1 = new Employee1();
		employee1.setName("Ruturaj");
		System.out.println(employee1.getName());
		employee1.setSalary(50000.00f);
		System.out.println(employee1.getSalary());
		employee1.setDesignation("Crickter");
		System.out.println(employee1.getDesignation());
		System.out.println("=================");

		Employee1 employee2 = new Employee1();
		employee2.setName("Dhoni");
		System.out.println(employee2.getName());
		employee2.setSalary(75000.00f);
		employee2.setDesignation("Crickter");
		System.out.println(employee2.getDesignation());
		employee2.increaseSalary(1000);
		System.out.println(employee2.getSalary());
		System.out.println("=================");

		Employee1 employee3 = new Employee1();
		employee3.setName("Jadeja");
		System.out.println(employee3.getName());
		employee3.setSalary(65000.00f);
		System.out.println(employee3.getSalary());
		employee3.setDesignation("Crickter");
		System.out.println(employee3.getDesignation());

	}

}
