package io;

final class Class1 {
	static float[] aFloatArray1 = new float[4];
	static int anInt2;
	static Tile[][][] aClass147ArrayArrayArray4;

	static final Class87 method36(int i, int i_0_) {
		try {
			anInt2++;
			Class87[] class87s = Class69.method452((byte) -100);
			for (int i_1_ = i; i_1_ < class87s.length; i_1_++) {
				Class87 class87 = class87s[i_1_];
				if ((((Class87) class87).field4597 ^ 0xffffffff) == (i_0_ ^ 0xffffffff))
					return class87;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "aa.B(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method37(int i) {
		try {
			if (i != 0)
				method37(-115);
			aFloatArray1 = null;
			LoginScreen.username = null;
			aClass147ArrayArrayArray4 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "aa.A(" + i + ')');
		}
	}
}
