package io;

import io.cache.Cache;
import io.cache.IndexConstants;

final class Class202 {
	static int anInt2865;
	static int anInt2866;
	static Class246_Sub15 aClass246_Sub15_2867 = new Class246_Sub15(0, 0);
	public static void method1330(byte i) {
		try {
			Cache.client_cache.set(IndexConstants.PRE_EOC_634_CONFIG_BILLBOARD_INDEX, null);
			aClass246_Sub15_2867 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sm.A(" + i + ')');
		}
	}

	static final byte[] method1331(boolean bool, byte i, Object object) {
		try {
			anInt2866++;
			if (object == null)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				if (bool)
					return RuntimeException_Sub2.method2922(is, 1727);
				return is;
			}
			if (object instanceof Class82) {
				Class82 class82 = (Class82) object;
				return class82.method524((byte) 8);
			}
			if (i < 62)
				method1330((byte) -54);
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sm.B(" + bool + ',' + i + ',' + (object != null ? "{...}" : "null") + ')'));
		}
	}
}
