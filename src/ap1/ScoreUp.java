/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class ScoreUp {
	public int scoreUp(String[] key, String[] answers) {
		int score = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i].equals(key[i])) {
				score += 4;
			} else if (answers[i].equals("?")) {
				score += 0;
			} else {
				score -= 1;
			}
		}

		return score;
	}
}
