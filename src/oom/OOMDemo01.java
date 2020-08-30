package oom;

/**
 * 当分配内存超过GC 得到的空间的时候，就会OOM
 */
public class OOMDemo01 {

	/**
	 * -Xms10m -Xmx10m
	 */
	public static void main(String[] args) {
		case1();
		case2();
	}

	public static void case1() {
		//// Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		String str = "arguigu";

		while (true) {
			str += str + "CCCCC";
			str.intern();
		}
	}

	public static void case2() {
		// Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		Byte[] bytes = new Byte[8 * 1024 * 1024];
	}
}
