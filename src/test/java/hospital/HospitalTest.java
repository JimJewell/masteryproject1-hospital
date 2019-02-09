package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {

	Hospital underTest;
	Patient person;

	@Before
	public void setup() {
		underTest = new Hospital();
		person = new Patient ("Betty", "001");
	}

	@Test
	public void shouldAddPatient() {
		int initialPatients = underTest.getHospitalSize();
		underTest.addPatient(person);
		int patientCensus = underTest.getHospitalSize();
		assertEquals(initialPatients + 1, patientCensus);
	}

}
