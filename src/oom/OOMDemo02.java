package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * 当超过98%的时间被用来做GC, 并且回收不到2%的内存，那么也会爆出OOM
 */
public class OOMDemo02 {

	/**
	 * -Xms10m -Xmx10m -Xlog:gc*
	 */
	public static void main(String[] args) {
		case1();
	}
	
	public static void case1() {
		//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		int i = 0;
		List<OOEntity> list = new ArrayList<>();
		while(true) {
			list.add(new OOEntity());
		}
	}
	
	static class OOEntity {}

}
