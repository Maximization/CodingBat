/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class LastDigit {
	public boolean lastDigit(int a, int b, int c) {
		int rightA = a % 10;
		int rightB = b % 10;
		int rightC = c % 10;

		return (rightA == rightB || rightB == rightC || rightA == rightC);
	}
}
