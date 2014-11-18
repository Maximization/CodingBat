/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class ParrotTrouble {
	public boolean parrotTrouble(boolean talking, int hour) {
		return (talking && (hour < 7 || hour > 20));
	}
}
