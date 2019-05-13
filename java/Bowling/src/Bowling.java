
public class Bowling {
	private int[] plays = new int[21];
	private int currentPlay;

	public void roll(int pins) {
		if (pins < 0 || pins > 10) {
			throw new IllegalArgumentException();
		}
		plays[currentPlay++] = pins;
		if (pins == 10 && currentPlay % 2 != 0)
			plays[currentPlay++] = 0;
	}

	private boolean isStrike(int i) {
		return plays[i - 2] == 10;
	}

	private boolean isSpare(int i) {
		return plays[i - 2] + plays[i - 1] == 10;
	}

	public int score() {
		int score = 0;

		for (int i = 2; i < plays.length; i += 2) {
			score += (plays[i - 2]) + (plays[i - 1]);

			if (isStrike(i)) {
				score += plays[i] + plays[i + 1];
			} else if (isSpare(i)) {
				score += plays[i];
			}
		}

		return score;
	}

}
