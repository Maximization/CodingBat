/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class Unlucky1 {
	public boolean unlucky1(int[] nums) {
		if (nums.length < 2) {
			return false;
		}

		int last = nums.length - 1;

		if (nums[0] == 1 && nums[1] == 3) {
			return true;
		} else if (nums[1] == 1 && nums[2] == 3) {
			return true;
		}

		if (nums[last - 1] == 1 && nums[last] == 3) {
			return true;
		}

		return false;
	}
}
