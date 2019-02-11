package nonmedicalemployee;

import employeesuper.Employee;

public class Receptionist extends Employee {

	private String receptionistPay = "$45,000";
	private boolean onPhone;
	
	public Receptionist(String name, String id, String job, boolean onPhone) {
		super(name, id, job);
		this.onPhone = false;
	}
	public void OnPhone() {
		onPhone = !onPhone;
	}
	public boolean getIsOnPhone() {
		return onPhone;
	}
	@Override
	public String calculatePay() {
		// TODO Auto-generated method stub
		return receptionistPay;
	}

	@Override
	public String toString() {
		
		return "|Name: " + getName() + ", >" + "  \tEmployee ID: " + getId() + ", >" + "  \tTitle: " + getJob() + ", >" + "  \tAnswering Phone: " + getIsOnPhone() + "|";
	}

}
