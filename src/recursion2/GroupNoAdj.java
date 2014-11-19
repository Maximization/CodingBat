/**
 * created by Maxim Orlov on 19 Nov 2014
 */
package recursion2;

public class GroupNoAdj {
	public boolean groupNoAdj(int start, int[] nums, int target) {
		if (start >= nums.length) {
			return target == 0;
		} else if (groupNoAdj(start + 2, nums, target - nums[start])) {
			return true;
		} else if (groupNoAdj(start + 1, nums, target)) {
			return true;
		}

		return false;
	}
}
