/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class Lucky13 {
	public boolean lucky13(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3) {
				return false;
			}
		}

		return true;
	}
}
