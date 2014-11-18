/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic2;

public class MakeChocolate {
	public int makeChocolate(int small, int big, int goal) {
		if (goal > small + big * 5) {
			return -1;
		}

		if (goal % 5 > small) {
			return -1;
		}

		if (goal < big * 5) {
			return goal % 5;
		}

		return goal - big * 5;
	}
}
