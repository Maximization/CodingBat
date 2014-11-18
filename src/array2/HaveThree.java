/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class HaveThree {
	public boolean haveThree(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				if (i != nums.length - 1 && nums[i + 1] == 3) {
					return false;
				} else {
					count++;
				}
			}
		}

		return count == 3;
	}
}
