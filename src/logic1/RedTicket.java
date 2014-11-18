/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class RedTicket {
	public int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2) {
			return 10;
		}

		if (a == b && c == b) {
			return 5;
		}

		if (c != a && b != a) {
			return 1;
		}

		return 0;
	}
}
