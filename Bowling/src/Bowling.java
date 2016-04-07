
public class Bowling {
	private int[] mScores = new int[21];
	private int play;
	boolean spare;

	public void roll(int pins) {
		if (pins < 0 || pins > 10){
			throw new IllegalArgumentException();
		}
		mScores[play++] = pins;
		
		if (play % 2 == 0) {
			if (mScores[play-1] + mScores[play] == 10) {
				spare = true;
			}
		}
		
	}

	public int score() {
		int score = 0;
		
		return score;
	}

}
