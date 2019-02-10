package hospital;

import java.util.Collection;
import java.util.HashMap;


public class Hospital {

	private int cleanliness = 100;
	
	private HashMap<String, Patient> patientsInHospital = new HashMap<String, Patient>();
	private HashMap<String, Employee> employeesInHospital = new HashMap<String, Employee>();

	public HashMap<String, Patient> getPatientsInHospital() {
		return patientsInHospital;
	}

	public HashMap<String, Employee> getEmployeesInHospital() {
		return employeesInHospital;
	}

	public void addPatient(Patient person) {
		patientsInHospital.put(person.getPatientID(), person);

	}

	public int getHospitalSize() {
		return patientsInHospital.size();

	}

	public Patient getPatient(String patientID) {
		return patientsInHospital.get(patientID);

	}

	public Collection<Patient> getPatientList() {
		return patientsInHospital.values();
	}

	public void removePatient(Patient person) {
		patientsInHospital.remove(person.getPatientID(), person);

	}

	public int getCleanliness() {
		if (cleanliness < 0) {
			cleanliness = 0;
		}
		return cleanliness;
	}

	public void sanitizeHospital() {
		cleanliness = 100;
		
	}

	public void dirtyHospital(int turnCount) {
		if (turnCount % 5 == 0)
			cleanliness -= 5;
		
	}
	
	

//	public void decreaseBloodLevelByTWO() {
//		return patientBloodLevel -= 2;
//	}
}
