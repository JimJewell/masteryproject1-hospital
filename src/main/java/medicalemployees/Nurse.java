package medicalemployees;

import employeesuper.Employee;
import hospital.Patient;

public class Nurse extends Employee implements CanCareForPatient, CanDrawBlood {

	String nursePay = "$50,000";

	public Nurse(String name, String id) {
		super(name, id);
		
	}

	@Override
	public String calculatePay() {
		return nursePay;
	}
//	Patient p1 = new Patient("Betty", "001", 10, 5);
//	Patient p2 = new Patient("Frank", "002", 15, 6);
//	
//	ArrayList<Patient> assignedPatients = new ArrayList<Patient>();
//	assignedPatients.add(p1)
//	assignedPatients.add(p2);

	@Override
	public void drawBlood(Patient patient) {
		patient.decreaseBloodLevelByFive();
		
	}

	@Override
	public void careForPatient() {
		// TODO Auto-generated method stub
		
	}
}

