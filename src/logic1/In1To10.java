/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class In1To10 {
	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode) {
			return (n <= 1 || n >= 10);
		}

		return (n >= 1 && n <= 10);
	}
}
