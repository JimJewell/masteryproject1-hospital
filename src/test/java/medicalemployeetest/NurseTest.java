package medicalemployeetest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.Patient;
import medicalemployees.Nurse;

public class NurseTest {

	
	
	
	Nurse underTest;
	Patient b = new Patient("biggie", "1997", 15, 5);
	@Before
	public void setup() {
		underTest = new Nurse("Danielle", "6774", "RN");
	}

	@Test
	public void shouldBeAbleToDrawBlood() {
		int bloodLevelBefore = b.getBloodLevel();
		underTest.drawBlood(b);
		int bloodLevelAfter = b.getBloodLevel();
		assertEquals(bloodLevelBefore - 5 , bloodLevelAfter);
	}
}
