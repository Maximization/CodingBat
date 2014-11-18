/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class BunnyEars {
	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}

		return 2 + bunnyEars(bunnies - 1);
	}
}
