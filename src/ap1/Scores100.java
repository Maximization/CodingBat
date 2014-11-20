/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class Scores100 {
	public boolean scores100(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] == scores[i + 1] && scores[i] == 100) {
				return true;
			}
		}

		return false;
	}
}
