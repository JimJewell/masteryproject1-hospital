package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PatientTest {

	Patient underTest;
	
	@Before
	public void setup() {
	underTest = new Patient("Betty", "001", 0, 0);
	}
	
	@Test
	public void checkBloodLevel() {
		int actual = Patient.getBloodLevel();
		assertEquals(20, actual);
	}
	@Test
	public void checkHealthLevel() {
		int actual = Patient.getHealthLevel();
		assertEquals(10, actual);
	}
	@Test
	public void shouldHaveName() {
		String actual = underTest.getName();
		assertEquals("Betty", actual);
	}
	@Test
	public void shouldHaveId() {
		String actual = underTest.getId();
		assertEquals("001", actual);
	}

	
}
