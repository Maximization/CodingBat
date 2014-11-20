/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class ScoresClump {
	public boolean scoresClump(int[] scores) {
		for (int i = 0; i < scores.length - 2; i++) {
			if (scores[i + 2] - scores[i] <= 2) {
				return true;
			}
		}

		return false;
	}
}
