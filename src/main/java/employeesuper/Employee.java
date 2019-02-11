package employeesuper;

public abstract class Employee {

	private String name;
	private String id;
	private String job;

// Superclass constructor Employee
	public Employee(String name, String id, String job) {
		this.name = name;
		this.id = id;
		this.job = job;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}

	public abstract String calculatePay();{
		
	}
	public void tick() {
		return;
	}

	public abstract String toString();

	
	}

