/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class TwoTwo {
	public boolean twoTwo(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 2) {
				continue;
			}

			if (i >= 1 && nums[i - 1] == 2) {
				continue;
			}

			if (i < (nums.length - 1) && nums[i + 1] == 2) {
				continue;
			}

			return false;
		}

		return true;
	}
}
