package practiceComposition;

import java.util.Scanner;

public class MainBankEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Bank bank = new Bank();

		Employee employee1 = new Employee("Rohan", 101, "Branch Manager");
		Employee employee2 = new Employee("Rohit", 102, "Financial Advisor");
		Employee employee3 = new Employee("John", 103, "Java Developer");
		Employee employee4 = new Employee("Joe", 104, "Risk Analyst");
		Employee employee5 = new Employee("David", 105, "Administrative Assistant");
		Employee employee6 = new Employee("Allen", 106, "QA Engineer");
		Employee employee7 = new Employee("Arya", 107, "Senior Developer");
		Employee employee8 = new Employee("Kaira", 108, "Chartered Manager");
		Employee employee9 = new Employee("Jaccquine", 109, "Security Officer");
		Employee employee10 = new Employee("Lee", 110, "Financial Officer");

		Employee[] employeeList = { employee1, employee2, employee3, employee4, employee5, employee6, employee7,
				employee8, employee9, employee10 };

		bank.bankHasEmployees(employeeList);

		System.out.println("Enter the employee name you want to check");
		String employeeEntered = sc.nextLine();

		bank.displayIdAndDesignation(employeeEntered);
	}
}
