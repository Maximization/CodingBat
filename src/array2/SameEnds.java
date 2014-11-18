/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class SameEnds {
	public boolean sameEnds(int[] nums, int len) {
		for (int i = 0; i < len; i++) {
			if (nums[i] != nums[nums.length - (len - i)]) {
				return false;
			}
		}

		return true;
	}
}
