package oom;

import java.util.concurrent.TimeUnit;

public class OOMDemo04 {

	public static void main(String[] args) {
		case1();
	}

	/**
	 * unable to create native thread: possibly out of memory or process/resource
	 * limits reached
	 */
	public static void case1() {
		int i = 0;
		for (;; i++) {
			new Thread(() -> {
				try {
					TimeUnit.DAYS.sleep(1);
				} catch (Exception e) {
					e.printStackTrace(System.out);
				}
			}).start();
			System.out.println(i);
		}
	}

}
