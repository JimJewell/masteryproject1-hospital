package medicalemployees;

import employeesuper.Employee;
import hospital.Patient;

public class Surgeon extends Employee {

	private String pay = "$120,000";
	private boolean surgery;
	private String specialty;
	
	public Surgeon(String name, String id, String specialty, boolean surgery) {
		super(name, id);
		this.surgery = false;
		this.specialty = specialty;
		}

	@Override
	public String calculatePay() {
		return pay;
	}

	public void toggleSurgery() {
		surgery = !surgery;
		
	}

	public boolean getPerformingSurgery() {
		return surgery;
	}

	public String getSpecialty() {
		return specialty;
	}
	
	public void repairPatient(Patient patient){
		patient.healToFullHealth();
		
	}

	
		

	}


	

	




	
	


	
	


