package nonmedicalemployee;

import employeesuper.Employee;
import hospital.Hospital;

public class Janitor extends Employee implements CanSweep {

	private String pay = "$40,000";
	private boolean sweep; 
	
	public Janitor(String name, String id, String job, boolean sweep) {
		super(name, id, job);
		this.sweep = false;
	}


	@Override
	public String calculatePay() {
		return pay;
	}
	public void toggleSweeping() {
		sweep = !sweep;
	}
	public boolean getIsSweeping() {
		return sweep;
	}
	@Override
	public void sweep(Hospital hospital) {
		hospital.sanitizeHospital();
		
	}

	@Override
	public String toString() {
		return "|Name: " + getName() + ", >" + "  Employee ID: " + getId() + ", >" + "  Title: " + getJob() + ", >" + "  Currently Sweeping: " + getIsSweeping() + "|";
	}

}
