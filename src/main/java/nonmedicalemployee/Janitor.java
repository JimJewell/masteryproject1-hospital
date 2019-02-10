package nonmedicalemployee;

import employeesuper.Employee;

public class Janitor extends Employee implements CanSweep {

	private String pay = "$40,000";
	
	public Janitor(String name, String id, String job) {
		super(name, id, job);
	}

	@Override
	public String calculatePay() {
		return pay;
	}

	@Override
	public void sweep() {
		// TODO Auto-generated method stub
		
	}

}
