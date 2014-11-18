/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic2;

public class Blackjack {
	public int blackjack(int a, int b) {
		if (a > 21) {
			a = 0;
		}

		if (b > 21) {
			b = 0;
		}

		if (a > b) {
			return a;
		}

		return b;
	}
}
