/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class Array6 {
	public boolean array6(int[] nums, int index) {
		if (index == nums.length) {
			return false;
		} else if (nums[index] == 6) {
			return true;
		}

		return array6(nums, index + 1);
	}
}
