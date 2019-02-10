package employeesuper;

public abstract class Employee {

	private String name;
	private String id;

// Superclass constructor Employee
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public abstract String calculatePay();

}