/**
 * created by Maxim Orlov on 19 Nov 2014
 */
package recursion2;

public class GroupSum6 {
	public boolean groupSum6(int start, int[] nums, int target) {
		if (start >= nums.length) {
			return (target == 0);
		} else if (nums[start] == 6) {
			return groupSum6(start + 1, nums, target - nums[start]);
		} else if (groupSum6(start + 1, nums, target - nums[start])) {
			return true;
		} else if (groupSum6(start + 1, nums, target)) {
			return true;
		}

		return false;
	}
}
