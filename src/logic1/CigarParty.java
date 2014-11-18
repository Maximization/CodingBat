/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class CigarParty {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			return (cigars >= 40);
		}

		if (!isWeekend) {
			return (cigars >= 40 && cigars <= 60);
		}

		return false;
	}
}
