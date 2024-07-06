package io;

public final class TimeUtility {
	
	private static long aLong2199;
	private static long aLong2200;

	public static final synchronized long time() {
		long time;
		long current_time = System.currentTimeMillis();
		if ((current_time ^ 0xffffffffffffffffL) > (aLong2199 ^ 0xffffffffffffffffL))
			aLong2200 += aLong2199 - current_time;
		aLong2199 = current_time;
		time = aLong2200 + current_time;
		return time;
	}

	private TimeUtility() {
		/* empty */
	}
}
