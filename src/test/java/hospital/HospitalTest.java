package hospital;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import employeesuper.Employee;
import medicalemployees.Doctor;

public class HospitalTest {

	Hospital underTest;
	Patient person;
	Employee employee;

	@Before
	public void setup() {
		underTest = new Hospital(85);
		person = new Patient("Sam", "001", 10, 5);
		employee = new Doctor("Dr Happy", "145", "Doctor", "Neurology");
	}
	@Test
	public void shouldKnowCleanliness() {
		int cleanlinessPrior = underTest.getCleanliness();
		underTest.hospitalGettingDirty();
//		underTest.sanitizeHospital();
		int cleanlinessAfter = underTest.getCleanliness();
		assertEquals(cleanlinessPrior - 10, cleanlinessAfter);
	}
	@Test
	public void shouldSanitize() {
		underTest.hospitalGettingDirty();
		underTest.sanitizeHospital();
		int cleanlinessAfter = underTest.getCleanliness();
		assertEquals(100, cleanlinessAfter);
	}
	@Test
	public void shouldAddPatient() {
		int initialPatients = underTest.getHospitalSize();
		underTest.addPatient(person);
		int patientCensus = underTest.getHospitalSize();
		assertEquals(initialPatients + 1, patientCensus);
	}

	@Test
	public void shouldFindPatient() {
		underTest.addPatient(person);
		Patient person = underTest.getPatient("001");
		assertEquals(person.getPatientID(), "001");
	}

	@Test
	public void shouldRemovePatient() {
		underTest.addPatient(person);
		int initialPatients = underTest.getHospitalSize();
		underTest.removePatient(person);
		int patientsAfterRemoval = underTest.getHospitalSize();

		assertEquals(initialPatients - 1, patientsAfterRemoval);
	}

	@Test
	public void shouldAddEmployee() {
		int initialEmployees = underTest.getStaffSize();
		underTest.addEmployee(employee);
		int staffCensus = underTest.getStaffSize();
		assertEquals(initialEmployees + 1, staffCensus);
	}
	@Test
	public void shouldFindEmployee() {
		underTest.addEmployee(employee);
		Employee employee = underTest.getEmployee("145");
		assertEquals(employee.getId(), "145");
	}
	@Test
	public void shouldRemoveEmployee( ) {
		underTest.addEmployee(employee);
		int staffSize = underTest.getStaffSize();
		underTest.removeEmployee(employee);
		int staffSizeAfter = underTest.getStaffSize();
		assertEquals(staffSize - 1, staffSizeAfter);
				
	}
	
}