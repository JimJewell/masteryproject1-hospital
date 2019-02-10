package medicalemployees;

import employeesuper.Employee;
import hospital.Patient;

public class Doctor extends Employee implements CanCareForPatient, CanDrawBlood {

	private String doctorPay = "$90,000";
	private String specialty;
	
	public Doctor(String name, String id, String specialty) {
		super(name, id);
		this.specialty = specialty;
	
	}

	@Override
	public String calculatePay() {
		// TODO Auto-generated method stub
		return doctorPay;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public void drawBlood(Patient patient) {
		
		
	}

	@Override
	public void careForPatient() {
		
		
	}

}
