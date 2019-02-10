package hospital;

import java.util.Collection;
import java.util.HashMap;

import employeesuper.Employee;

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
//	Getters
	public int getHospitalSize() {
		return patientsInHospital.size();

	}
	public int getStaffSize() {
		return employeesInHospital.size();
	}

	public Patient getPatient(String patientID) {
		return patientsInHospital.get(patientID);

	}

	public Employee getEmployee(String id) {
		return employeesInHospital.get(id);
	}

	public int getCleanliness() {
		if (cleanliness < 0) {
			cleanliness = 0;
		}
		return cleanliness;
	}

	public void addPatient(Patient person) {
		patientsInHospital.put(person.getPatientID(), person);

	}
	public void removePatient(Patient person) {
		patientsInHospital.remove(person.getPatientID(), person);
		
	}

	public Collection<Patient> getPatientList() {
		return patientsInHospital.values();
	}

	public void addEmployee(Employee employee) {
		employeesInHospital.put(employee.getId(), employee);
	}
	

	public Collection<Employee> getEmployeeList() {
		return employeesInHospital.values();
	}


	public void sanitizeHospital() {
		cleanliness = 100;

	}

	public void dirtyHospital(int turnCount) {
		if (turnCount % 5 == 0)
			cleanliness -= 10;

	}

	public void removeEmployee(Employee employee) {
		employeesInHospital.remove(employee.getId(), employee);
		
	}
	
	public String toString() {
		return null;
		
	}


//	public void returnAllEmployeeStats() {
//		System.out.println("Staff Report - Current status \n");
//		for (Employee)
//	}


}
