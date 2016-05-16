import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingTest {

	private Bowling bowling;

	@Before
	public void bowling() {
		bowling = new Bowling();
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidMinInput() {
		bowling.roll(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidMaxInput() {
		bowling.roll(11);
	}

	@Test
	public void whenMissesAll_thenScoreIsZero() {
		repeatRoll(0, 20);
		assertEquals("Invalid score", 0, bowling.score());
	}

	@Test
	public void whenScoresOne20Times_thenScore20() {
		repeatRoll(1, 20);
		assertEquals("Invalid Score", 20, bowling.score());
	}

	@Test
	public void whenSpareOneTime_thenScoreIs12() {
		bowling.roll(6);
		bowling.roll(4);
		bowling.roll(1);
		repeatRoll(0, 17);
		assertEquals(12, bowling.score());
	}

	@Test
	public void whenStrikeOneTime_thenScoreIs12() {
		bowling.roll(10);
		bowling.roll(1);
		repeatRoll(0, 17);
		assertEquals(12, bowling.score());
	}

	@Test
	public void whenStrikeNotFirstTime_thenScoreIs14() {
		bowling.roll(0);
		bowling.roll(0);
		bowling.roll(10);
		bowling.roll(1);
		bowling.roll(1);
		repeatRoll(0, 15);
		assertEquals(14, bowling.score());
	}

	@Test
	public void whenTwoStrikeInARow_thenScoreIs35() {
		bowling.roll(10);
		bowling.roll(10);
		bowling.roll(1);
		bowling.roll(1);
		repeatRoll(0, 14);
		assertEquals(35, bowling.score());
	}

	private void repeatRoll(int score, int times) {
		for (int count = 0; count < times; count++) {
			bowling.roll(score);
		}
	}

}