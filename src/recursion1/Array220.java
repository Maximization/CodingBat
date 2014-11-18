/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class Array220 {
	public boolean array220(int[] nums, int index) {
		if (nums.length < 2 || index == nums.length - 1) {
			return false;
		} else if (nums[index] * 10 == nums[index + 1]) {
			return true;
		}

		return array220(nums, index + 1);
	}
}
