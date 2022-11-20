package practiceComposition;

public class Employee {
	private String employeeName;
	private int employeeId;
	private String employeeDesignation;

	public Employee(String employeeName, int employeeId, String employeeDesignation) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

}
