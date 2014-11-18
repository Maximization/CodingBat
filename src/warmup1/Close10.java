/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class Close10 {
	public int close10(int a, int b) {
		if (Math.abs(10 - a) < Math.abs(10 - b)) {
			return a;
		} else if (Math.abs(10 - a) > Math.abs(10 - b)) {
			return b;
		}
		
		return 0;
	}
}
