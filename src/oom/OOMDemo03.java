package oom;

import java.nio.ByteBuffer;

public class OOMDemo03 {

	/**
	 * -Xms11m -Xmx11m -Xlog:gc* -XX:MaxDirectMemorySize=5m
	 * 
	 * 其中 MaxDirectMemorySize 的意思是说允许使用的默认内存
	 */
	public static void main(String[] args) {
		case1();
	}

	public static void case1() {
		//java.lang.OutOfMemoryError: Cannot reserve 5242881 bytes of direct buffer memory (allocated: 0, limit: 5242880)
		ByteBuffer.allocateDirect(5 * 1024 * 1024 + 1);
	}
}
