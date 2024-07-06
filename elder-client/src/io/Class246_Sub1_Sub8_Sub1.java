package io;

final class Class246_Sub1_Sub8_Sub1 extends Class246_Sub1_Sub8 {
	static int anInt7155;
	static int anInt7156;
	static int anInt7157 = -1;
	static int[][] anIntArrayArray7158;
	static int anInt7159;
	static int anInt7160;
	static int anInt7161;
	static int anInt7162;
	private Object anObject7163;
	static short[] aShortArray7164 = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	static final char method2923(int i, byte i_0_) {
		try {
			anInt7162++;
			int i_1_ = 0xff & i_0_;
			if ((i_1_ ^ 0xffffffff) == -1)
				throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(i_1_, 16) + " provided");
			if ((i_1_ ^ 0xffffffff) <= -129 && i_1_ < 160) {
				int i_2_ = Class40_Sub9.aCharArray5496[-128 + i_1_];
				if ((i_2_ ^ 0xffffffff) == -1)
					i_2_ = 63;
				i_1_ = i_2_;
			}
			if (i != 32404)
				method2923(127, (byte) 14);
			return (char) i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ne.E(" + i + ',' + i_0_ + ')');
		}
	}

	final boolean method2566(byte i) {
		try {
			if (i <= 57)
				return false;
			anInt7160++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ne.A(" + i + ')');
		}
	}

	static final void method2924(int i) {
		try {
			for (Class130_Sub2 class130_sub2 = ((Class130_Sub2) Class216.aClass68_3008.method445(i + 60)); class130_sub2 != null; class130_sub2 = (Class130_Sub2) Class216.aClass68_3008.method442((byte) -45))
				class130_sub2.method1778();
			if (i != 2)
				anInt7159 = 29;
			anInt7161++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ne.D(" + i + ')');
		}
	}

	public static void method2926(boolean bool) {
		try {
			anIntArrayArray7158 = null;
			if (bool != true)
				method2923(-91, (byte) 15);
			aShortArray7164 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ne.G(" + bool + ')');
		}
	}

	Class246_Sub1_Sub8_Sub1(Object object, int i) {
		super(i);
		try {
			anObject7163 = object;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ne.<init>(" + (object != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Object method2568(int i) {
		try {
			anInt7155++;
			if (i != 250)
				aShortArray7164 = null;
			return anObject7163;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ne.B(" + i + ')');
		}
	}

	static {
		anIntArrayArray7158 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
	}
}
