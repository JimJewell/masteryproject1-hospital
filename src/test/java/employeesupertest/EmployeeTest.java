package employeesupertest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import employeesuper.Employee;
import medicalemployees.Surgeon;

public class EmployeeTest {

	Employee underTest;

	@Before
	public void setup() {
		underTest = new Surgeon("Dr. Facelift", "123", "Plastic Surgeon", false);
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