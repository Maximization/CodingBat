/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic2;

public class RoundSum {
	public int round10(int num) {
		if (num % 10 >= 5) {
			return num + 10 - (num % 10);
		}

		return num - (num % 10);
	}

	public int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);
	}
}
