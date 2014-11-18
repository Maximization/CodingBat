/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class SortaSum {
	public int sortaSum(int a, int b) {
		int sum = a + b;

		if (sum <= 19 && sum >= 10) {
			return 20;
		}

		return sum;
	}
}
