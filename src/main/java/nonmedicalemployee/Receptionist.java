package nonmedicalemployee;

import employeesuper.Employee;

public class Receptionist extends Employee {

	private String receptionistPay = "$45,000";
	
	public Receptionist(String name, String id, String job) {
		super(name, id, job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String calculatePay() {
		// TODO Auto-generated method stub
		return receptionistPay;
	}

}
