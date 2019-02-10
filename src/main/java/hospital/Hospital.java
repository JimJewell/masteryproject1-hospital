package hospital;

import java.util.Collection;
import java.util.HashMap;

public class Hospital {

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

	public Patient findPatient(String patientName) {
		return patientsInHospital.get(patientName);

	}

	public Collection<Patient> getPatientList() {
		return patientsInHospital.values();
	}

	public void removePatient(Patient person) {
		patientsInHospital.remove(person.getPatientID(), person);

	}
	
	

//	public void decreaseBloodLevelByTWO() {
//		return patientBloodLevel -= 2;
//	}
}
