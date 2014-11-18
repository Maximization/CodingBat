/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array3;

public class MaxSpan {
	public int maxSpan(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i] == nums[j] && j - i + 1 > count) {
					count = j - i + 1;
				}
			}
		}

		return count;
	}
}
