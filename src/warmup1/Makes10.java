/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class Makes10 {
	public boolean makes10(int a, int b) {
		int sum = a + b;
		
		if (sum == 10 || a == 10 | b == 10) {
			return true;
		}
		
		return false;
	}
}
