package io;

import io.cache.Cache;
import io.cache.IndexConstants;

final class Class171 {
	static int anInt2423;
	static Class169 aClass169_2425;
	static String[] aStringArray2426 = new String[100];

	static final byte method1130(int i, int i_0_, int i_1_) {
		try {
			anInt2423++;
			if ((i ^ 0xffffffff) != -10)
				return (byte) 0;
			if ((0x1 & i_1_ ^ 0xffffffff) != i_0_)
				return (byte) 2;
			return (byte) 1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pq.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final boolean method1131(int i, int i_2_, int i_3_) {
		try {
			if (!((0x60000 & i_2_ ^ 0xffffffff) != -1 | Class51.method335(i_2_, (byte) -53, i)) && !Class6.method71(-20147, i, i_2_) && !Class160.method1062(i_2_, i, 0))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pq.A(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public static void method1132(byte i) {
		try {
			aStringArray2426 = null;
			aClass169_2425 = null;
			if (i != 116)
				method1131(-30, 44, 97);
			Cache.client_cache.set(IndexConstants.PRE_EOC_634_MIDI_INSTRUMENTS_INDEX, null);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pq.C(" + i + ')');
		}
	}

	static {
		aClass169_2425 = new Class169("", 15);
	}
}
