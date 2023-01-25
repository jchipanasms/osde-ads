package timer;

public class TimersMobile {
	
	public static long start;
	public static long elapseTimer;

	public static void startTimer() {
		start = System.currentTimeMillis();
	}

	public static void endTimer() {
		elapseTimer = System.currentTimeMillis() - start;
	}

	public static String getTimer() {
		return String.valueOf(elapseTimer / 1000);
	}
}
