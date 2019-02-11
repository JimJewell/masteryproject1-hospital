package medicalemployees;

import java.util.ArrayList;

import employeesuper.Employee;
import hospital.Patient;

public class Nurse extends Employee implements CanCareForPatient, CanDrawBlood {

	String nursePay = "$50,000";
	

	public Nurse(String name, String id, String job) {
		super(name, id, job);

	}

	@Override
	public String calculatePay() {
		return nursePay;
	}

	private ArrayList<Patient> shiftAssignment = new ArrayList<Patient>();
	

	public int getShiftAssignment() {
		return shiftAssignment.size();
	}

	public void addAssignment(Patient patient) {
		shiftAssignment.add(patient);
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.decreaseBloodLevelByFive();

	}

	@Override
	public void careForPatient(Patient patient) {
		patient.healToFullHealth();

	}
	
	@Override
	public String toString() {
		return "|Name: " + getName() + ", >" + "  \tEmployee ID: " + getId() + ", >" + "  \tTitle: " + getJob() + ", >" + "  \tShift Assignment: " + getShiftAssignment() + "|";
	}

//	It has beaten me for now
//	public void careForAllAssignedPatients(ArrayList<Patient> shiftAssignment) {
//		(ArrayList<Patient>).getShiftAssignment.healToFullHealth();
		
	
}
