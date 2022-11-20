package practiceComposition;

public class Bank {

	Employee[] employee = new Employee[10];
	int i;
	public void bankHasEmployees(Employee[] employeeList) {
		for (int i = 0; i < this.employee.length; i++) {
			if (this.employee[i] == null) {
				this.employee[i] = employeeList[i];
			}
		}
	}

	public void displayIdAndDesignation(String employeeEntered) {
		for ( i= 0; i < employee.length; i++) {
			if (employeeEntered.equalsIgnoreCase(employee[i].getEmployeeName())) {//checking if employee present in bank
				System.out.println("Employee Id : " + employee[i].getEmployeeId());
				System.out.println("Designation : " + employee[i].getEmployeeDesignation());
				break;
			}
		}
		if( i==employee.length)
		System.out.println("Employee not present");
	}
}
