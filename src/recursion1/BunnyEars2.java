/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class BunnyEars2 {
	public int bunnyEars2(int bunnies) {
		if (bunnies == 0) {
			return 0;
		} else if (bunnies % 2 != 0) {
			return 2 + bunnyEars2(bunnies - 1);
		}

		return 3 + bunnyEars2(bunnies - 1);
	}
}
