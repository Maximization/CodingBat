/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class ScoresAverage {
	public int scoresAverage(int[] scores) {
		int average1 = average(scores, 0, scores.length / 2);
		int average2 = average(scores, scores.length / 2, scores.length);

		return Math.max(average1, average2);
	}

	public int average(int[] scores, int start, int end) {
		int sum = 0;

		for (int i = start; i < end; i++) {
			sum += scores[i];
		}

		return sum / (end - start);
	}
}
