/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class InOrder {
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		return (c > b && (b > a || bOk));
	}
}
