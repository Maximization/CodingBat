/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class NearHundred {
	public boolean nearHundred(int n) {
		return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10);
	}
}
