package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SurgeonTest {

Surgeon underTest;
	
	@Before
	public void setup() {
		underTest = new Surgeon("Dr. Claw", "123");
	}
	
//	@Test
//	public void shouldPerformSurgery() {
//		
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
	}
	

