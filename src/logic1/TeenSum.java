/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class TeenSum {
	public int teenSum(int a, int b) {
		int sum = a + b;

		if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
			return 19;
		}

		return sum;
	}
}
