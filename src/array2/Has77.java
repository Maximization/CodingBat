/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class Has77 {
	public boolean has77(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (i == nums.length - 2) {
				if (nums[i] == 7 && nums[i + 1] == 7) {
					return true;
				} else {
					return false;
				}
			}

			if (nums[i] == 7 && (nums[i + 1] == 7 || nums[i + 2] == 7)) {
				return true;
			}
		}

		return false;
	}
}
