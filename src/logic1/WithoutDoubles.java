/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class WithoutDoubles {
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (noDoubles && die1 == die2) {
			if (die1 == 6) {
				die1 = 1;
			} else {
				die1++;
			}
		}

		return die1 + die2;
	}
}
