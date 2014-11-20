/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class ScoresIncreasing {
	public boolean scoresIncreasing(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] > scores[i + 1]) {
				return false;
			}
		}

		return true;
	}
}
