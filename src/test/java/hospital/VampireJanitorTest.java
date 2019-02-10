package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VampireJanitorTest {

	VampireJanitor underTest;
	Patient b = new Patient("biggie", "1997", 15, 5);

	@Before
	public void setup() {
		underTest = new VampireJanitor("Count", "666");

	}

	@Test
	public void shouldBeAbleToSuckBlood() {
		underTest.drawBlood(b);
		int bloodLevelAfter = b.getBloodLevel();
		assertEquals(0 , bloodLevelAfter);

	}
}
