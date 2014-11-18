/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic2;

public class LuckySum {
	public int luckySum(int a, int b, int c) {
		int sum = 0;

		if (a != 13) {
			sum += a;
		} else {
			return sum;
		}

		if (b != 13) {
			sum += b;
		} else {
			return sum;
		}

		if (c != 13) {
			sum += c;
		} else {
			return sum;
		}

		return sum;
	}
}
