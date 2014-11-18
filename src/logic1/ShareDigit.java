/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class ShareDigit {
	public boolean shareDigit(int a, int b) {
		int a1 = a / 10;
		int a2 = a % 10;
		int b1 = b / 10;
		int b2 = b % 10;

		return (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2);
	}
}
