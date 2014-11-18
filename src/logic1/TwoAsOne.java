/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class TwoAsOne {
	public boolean twoAsOne(int a, int b, int c) {
		return (a + b == c || a + c == b || c + b == a);
	}
}
