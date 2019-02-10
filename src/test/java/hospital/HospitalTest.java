package hospital;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class HospitalTest {

	Hospital underTest;
	Patient person;
//	Employee oneStaff; cannot exist due to class abstraction

	@Before
	public void setup() {
		underTest = new Hospital();
		person = new Patient("Sam", "001", 10, 5);
//		oneStaff = new Employee() cannot initiate employee due to class abstract
	}
	@Test
	public void shouldKnowCleanliness() {
		int cleanlinessPrior = underTest.getCleanliness();
		underTest.dirtyHospital(5);
//		underTest.sanitizeHospital();
		int cleanlinessAfter = underTest.getCleanliness();
		assertEquals(cleanlinessPrior - 5, cleanlinessAfter);
	}
	@Test
	public void shouldSanitize() {
		underTest.dirtyHospital(10);
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
		int initialPatients = underTest.getHospitalSize();
		underTest.addPatient(person);
		int patientCensus = underTest.getHospitalSize();
		assertEquals(initialPatients + 1, patientCensus);
	}
}