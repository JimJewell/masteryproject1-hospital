package hospital;

import java.util.Collection;
import java.util.HashMap;

import employeesuper.Employee;





public class Hospital {

	private int cleanliness = 100;

	public Hospital(int cleanliness) {
		this.cleanliness = cleanliness;
	}

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

	public Patient getPatient(String patientName) {
		return patientsInHospital.get(patientName);

	}
	public Patient findPatient(String patientID) {
		return patientsInHospital.get(patientID);
	}

	public Employee getEmployee(String id) {
		return employeesInHospital.get(id);
	}

// remove the ability to go negative on hospital cleanliness
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
		this.cleanliness = 100;

	}

	public void hospitalGettingDirty() {
			cleanliness -= 5;
		return;

	}

	public void removeEmployee(Employee employee) {
		employeesInHospital.remove(employee.getId(), employee);

	}

////	public String toString() {
////		return null;
//
//	}
	public void getPatientNames() {
		for (Patient patient : patientsInHospital.values()) {
			System.out.println(patient.getPatientName());
			}
		}
	public void healAllPatients() {
		Collection<Patient> patientsInHospital = getPatientsInHospital().values();
		for (Patient patient : patientsInHospital) {
			patient.healToFullHealth();
		}
	}

	public void returnAllPatients() {
		System.out.println("******PATIENT STATISTICS******");
		for (Patient patient : patientsInHospital.values()) {
			if (patient instanceof Patient) {
				System.out.println(patient.toString());
				patient.tick();
			}
		}
		hospitalGettingDirty();
		getCleanliness();
		System.out.println("Hospital cleanliness: " + getCleanliness() + "%");
		System.out.println(" ");
	}

	public void returnAllEmployees() {
		System.out.println("******EMPLOYEE MASTER LIST******");
//		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); don't like the format break for now
		for (Employee employee : employeesInHospital.values()) {
			if (employee instanceof Employee) {
				System.out.println(employee.toString());
////				employee.tick();  I don't need an employee tick right now
			}
		}
		hospitalGettingDirty();
		getCleanliness();
		System.out.println("Hospital cleanliness: " + getCleanliness() + "%");
		System.out.println(" ");
	}
//	public void returnAllEmployeeStats() {
//		System.out.println("Staff Report - Current status \n");
//		for (Employee)
//	}

}
