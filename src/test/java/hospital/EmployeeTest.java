package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Employee underTest;

	@Before
	public void setup() {
		underTest = new Surgeon("Jack", "123", false);
	}

	@Test
	public void shouldHaveName() {
		String actual = underTest.getName();
		assertEquals("Jack", actual);
	}

	@Test
	public void shouldHaveId() {
		String actual = underTest.getId();
		assertEquals("123", actual);
	}
}