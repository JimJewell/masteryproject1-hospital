package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PatientTest {

	Patient underTest;

	@Before
	public void setup() {
		underTest = new Patient("Betty", "001", 10, 5);
	}

	@Test
	public void shouldHaveName() {
		String actual = underTest.getPatientName();
		assertEquals("Betty", actual);
	}

	@Test
	public void shouldHaveId() {
		String actual = underTest.getPatientID();
		assertEquals("001", actual);
	}

	@Test
	public void checkBloodLevel() {
		int actual = underTest.getBloodLevel();
		assertEquals(10, actual);
	}

	@Test
	public void checkHealthLevel() {
		int actual = underTest.getHealthLevel();
		assertEquals(5, actual);
	}
	@Test
	public void checkFinalBloodLevel() {
		int actual = Patient.getFinalBloodLevel();
		assertEquals(20, actual);
		}
	@Test
	public void checkFinalHealthLevel() {
		int actual = Patient.getFinalHealthLevel();
		assertEquals(10, actual);
	}
	@Test
	public void shouldDecreaseBloodLevelByFive() {
		int bloodLevelBefore = underTest.getBloodLevel();
		underTest.decreaseBloodLevelByFive();
		int bloodLevelAfter = underTest.getBloodLevel();
		assertEquals(bloodLevelBefore - 5, bloodLevelAfter);
		}
}
