/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class Max1020 {
	public int max1020(int a, int b) {
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;
		}

		if (a <= 20 && a >= 10) {
			return a;
		} else if (b <= 20 && b >= 10) {
			return b;
		}

		return 0;
	}
}
