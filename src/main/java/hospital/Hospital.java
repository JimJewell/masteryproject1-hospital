package hospital;

import java.util.HashMap;

public class Hospital {

	private HashMap<String, Patient>patientsInHospital = new HashMap<String, Patient>();

	public HashMap<String, Patient> getPatientsInHospital() {
		return patientsInHospital;
	}

	public void addPatient(Patient person) {
		patientsInHospital.put(person.getId(), person);
		
	}
	public int getHospitalSize() {
		return patientsInHospital.size();
	}
}
