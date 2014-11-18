/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class LoneTeen {
	public boolean loneTeen(int a, int b) {
		if (a <= 19 && a >= 13) {
			if (b <= 19 && b >= 13) {
				return false;
			}
			
			return true;
		} else if (b <= 19 && b >= 13) {
			if (a <= 19 && a >= 13) {
				return false;
			}
			
			return true;
		}
		
		return false;
	}
}
