/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class In3050 {
	public boolean in3050(int a, int b) {
		boolean range1 = (a >= 30 && a <= 40 && b >= 30 && b <= 40);
		boolean range2 = (a >= 40 && a <= 50 && b >= 40 && b <= 50);
		return (range1 || range2);
	}
}
