package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SurgeonTest {

Surgeon underTest;
	
	@Before
	public void setup() {
		underTest = new Surgeon("Dr. Claw", "123", false);
	}
//	@Test
//	public void shouldPerformSurgery() {
//	}
	
	@Test
	public void shouldHaveId () {
		String actual = underTest.getId();
		assertEquals ("123", actual);
	}
	@Test
	public void calculatePay () {
		String actual = underTest.calculatePay();
		assertEquals("$120,000", actual);
	}
	@Test
	public void performingSurgery () {
		underTest.toggleSurgery();
		boolean surgery = underTest.getPerformingSurgery();
		assertTrue(surgery);
	}
	@Test
	public void stopPerformingSurgery () {
		underTest.toggleSurgery();
		underTest.toggleSurgery();
		boolean surgery = underTest.getPerformingSurgery();
		assertFalse(surgery);
	}
	}
	

