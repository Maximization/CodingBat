/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic2;

public class MakeBricks {
	public boolean makeBricks(int small, int big, int goal) {
		if (goal > big * 5 + small) {
			return false;
		}

		if (goal % 5 > small) {
			return false;
		}

		return true;
	}
}
