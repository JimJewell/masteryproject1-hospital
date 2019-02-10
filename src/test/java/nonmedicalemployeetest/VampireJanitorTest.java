package nonmedicalemployeetest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.Patient;
import nonmedicalemployee.VampireJanitor;

public class VampireJanitorTest {

	VampireJanitor underTest;
	Patient b = new Patient("biggie", "1997", 15, 5);

	@Before
	public void setup() {
		underTest = new VampireJanitor("Count", "666", "Vampire Janitor");

	}

	@Test
	public void shouldBeAbleToSuckBlood() {
		underTest.drawBlood(b);
		int bloodLevelAfter = b.getBloodLevel();
		assertEquals(0 , bloodLevelAfter);

	}
}
