/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package array3;

public class CountClumps {
	public int countClumps(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				count++;

				for (int j = i + 1; j < nums.length - 1; j++) {
					if (nums[j] != nums[j + 1]) {
						break;
					}

					i++;
				}
			}
		}

		return count;
	}
}
