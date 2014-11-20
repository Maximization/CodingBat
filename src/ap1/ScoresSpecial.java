/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class ScoresSpecial {
	public int scoresSpecial(int[] a, int[] b) {
		return helper(a) + helper(b);
	}

	public int helper(int[] scores) {
		int max = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] % 10 == 0 && scores[i] > max) {
				max = scores[i];
			}
		}

		return max;
	}
}
