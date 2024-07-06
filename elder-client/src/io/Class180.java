package io;

final class Class180 {
	static int anInt2520;
	static float aFloat2521;
	static Class81 aClass81_2522 = new Class81(14, 0, 4, 1);
	static IncomingPacket aClass13_2523 = new IncomingPacket(49, 4);
	private CacheIndex aClass_fs2524, aClass_fs2524_2;
	static int anInt2525;
	int anInt2526, anInt2526_2;

	public static void method1175(int i) {
		try {
			if (i > -57)
				method1177((byte) 69);
			aClass13_2523 = null;
			aClass81_2522 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qq.B(" + i + ')');
		}
	}

	static final int method1176(int i, int i_0_, int i_1_, int i_2_) {
		try {
			if (i_0_ != -24309)
				aFloat2521 = -1.2560716F;
			anInt2520++;
			if (i_2_ > i_1_)
				return i_2_;
			if (i >= i_1_)
				return i_1_;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qq.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method1177(byte i) {
		try {
			Class59_Sub3_Sub3.aClass54_6277.method383(80);
			if (i == 30)
				anInt2525++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qq.C(" + i + ')');
		}
	}

	Class180(Class101 class101, int i, CacheIndex class_fs, CacheIndex class_fs2) {
		new HashMap(64);
		try {
			aClass_fs2524 = class_fs;
			aClass_fs2524_2 = class_fs2;
			((Class180) this).anInt2526 = aClass_fs2524.child_count(15);
			((Class180) this).anInt2526_2 = aClass_fs2524_2.child_count(15);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qq.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}
}
