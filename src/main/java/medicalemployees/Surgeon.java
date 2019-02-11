package medicalemployees;

import employeesuper.Employee;
import hospital.Patient;

public class Surgeon extends Employee implements CanDrawBlood {

	private String pay = "$120,000";
	private boolean surgery;
	private String specialty;
	
	public Surgeon(String name, String id, String specialty, String job, boolean surgery) {
		super(name, id, job);
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

	@Override
	public void drawBlood(Patient patient) {
		patient.decreaseBloodLevelByFive();
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "|Name: " + getName() + ", >" + "  \tEmployee ID: " + getId() + ", >" + "  \tTitle: " + getSpecialty() + " " + getJob() + ", >" + "  \tPerforming Surgery: " + getPerformingSurgery() + "|";
	}

	
		

	}


	

	




	
	


	
	


