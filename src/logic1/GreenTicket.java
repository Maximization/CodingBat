/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class GreenTicket {
	public int greenTicket(int a, int b, int c) {
		if (a == b && c == b) {
			return 20;
		} else if (a == b || a == c || b == c) {
			return 10;
		} else {
			return 0;
		}
	}
}
