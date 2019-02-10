package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DoctorTest {

	Doctor underTest;

	@Before
	public void setup() {
		underTest = new Doctor("Dr. Joe", "121", "Cardiac");
	}
	@Test
	public void shouldHaveSpecialty() {
		String actual = underTest.getSpecialty();
		assertEquals("Cardiac" , actual);
	}

}
