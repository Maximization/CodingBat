/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package array3;

public class MaxMirror {
	public int maxMirror(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		for (int i = nums.length; i > 1; i--) {
			int len = i;

			for (int j = 0; j <= nums.length - len; j++) {
				int[] reverse = new int[len];
				int index = 0;

				for (int k = j; index < len; k++) {
					reverse[reverse.length - 1 - index] = nums[k];
					index++;
				}

				for (int k = 0; k <= nums.length - len; k++) {
					int position = 0;

					for (int m = k; position < len; m++) {
						if (reverse[position] != nums[m]) {
							break;
						}

						if (position == len - 1) {
							return len;
						}

						position++;
					}
				}
			}
		}

		return 1;
	}
}
