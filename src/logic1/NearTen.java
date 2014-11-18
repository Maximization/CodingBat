/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class NearTen {
	public boolean nearTen(int num) {
		return (num % 10 <= 2 || num % 10 >= 8);
	}
}
