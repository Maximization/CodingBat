/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array3;

public class Fix34 {
	public int[] fix34(int[] nums) {
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				for (int j = index + 1; j < nums.length; j++) {
					if (nums[j] == 4) {
						nums[j] = nums[i + 1];
						nums[i + 1] = 4;
						index = i + 1;
						
						break;
					}
				}
			}
		}

		return nums;
	}
}
