package io;

import io.cache.Revision;

final class Class246_Sub6 extends Node {
	int anInt3925;
	static int anInt3926;
	int anInt3927;
	int anInt3928;
	int anInt3929;
	static int anInt3930;
	int anInt3931;
	int anInt3932;
	static int anInt3933;
	int anInt3934 = 0;
	static OutgoingPacket aClass201_3935 = new OutgoingPacket(48, 1);
	int anInt3936;
	int anInt3937;
	int anInt3938;
	int anInt3939;
	static OutgoingPacket aClass201_3940 = new OutgoingPacket(79, -1);
	int anInt3941;
	static int anInt3942;
	static int anInt3943;
	static int[][] anIntArrayArray3944;

	static final void method1817(int i) {
		try {
			if (i != -1)
				method1819(-60, (byte) 0, null);
			anInt3943++;
			Class2.method46();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ca.D(" + i + ')');
		}
	}

	static final boolean method1818(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = 9 / ((62 - i_1_) / 58);
			anInt3942++;
			if ((i_0_ & 0x800) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ca.A(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method1819(int i, byte i_3_, Entity class_r) {
		try {
			anInt3933++;
			int i_4_ = -1;
			int i_5_ = 0;
			if ((((Entity) class_r).anInt6422 ^ 0xffffffff) >= (Client.cycle ^ 0xffffffff)) {
				if ((((Entity) class_r).anInt6428 ^ 0xffffffff) <= (Client.cycle ^ 0xffffffff))
					Class96.method615(class_r, i_3_ ^ ~0x89);
				else {
					Class221.method1432(-81, false, class_r);
					i_5_ = Class_e.anInt1218;
					i_4_ = RuntimeException_Sub2.anInt7150;
				}
			} else
				Class14.method152(class_r, 24068);
			if ((((Class59_Sub3) class_r).x ^ 0xffffffff) > -129 || ((Class59_Sub3) class_r).y < 128 || (((Class59_Sub3) class_r).x >= -128 + 128 * Class38_Sub1_Sub1.anInt6770) || ((-128 + Class152.anInt2205 * 128 ^ 0xffffffff) >= (((Class59_Sub3) class_r).y ^ 0xffffffff))) {
				i_5_ = 0;
				((Entity) class_r).anInt6428 = 0;
				i_4_ = -1;
				((Entity) class_r).anInt6422 = 0;
				((Entity) class_r).f_pb = -1;
				((Entity) class_r).anInt6437 = -1;
				((Entity) class_r).current_sequence = -1;
				((Class59_Sub3) class_r).x = (((Entity) class_r).f_mc[0] * 128 + 64 * class_r.method2670((byte) 127));
				((Class59_Sub3) class_r).y = (128 * ((Entity) class_r).f_nc[0] + class_r.method2670((byte) 127) * 64);
				class_r.method2661(i_3_ ^ ~0x159c);
			}
			if (Client.local_player == class_r && ((((Class59_Sub3) class_r).x ^ 0xffffffff) > -1537 || ((Class59_Sub3) class_r).y < 1536 || ((-1536 + Class38_Sub1_Sub1.anInt6770 * 128 ^ 0xffffffff) >= (((Class59_Sub3) class_r).x ^ 0xffffffff)) || (128 * (Class152.anInt2205 - 12) <= ((Class59_Sub3) class_r).y))) {
				i_4_ = -1;
				((Entity) class_r).f_pb = -1;
				((Entity) class_r).current_sequence = -1;
				i_5_ = 0;
				((Entity) class_r).anInt6428 = 0;
				((Entity) class_r).anInt6422 = 0;
				((Entity) class_r).anInt6437 = -1;
				((Class59_Sub3) class_r).x = (128 * ((Entity) class_r).f_mc[0] + class_r.method2670((byte) 127) * 64);
				((Class59_Sub3) class_r).y = (((Entity) class_r).f_nc[0] * 128 - -(class_r.method2670((byte) 127) * 64));
				class_r.method2661(i_3_ ^ ~0x159c);
			}
			int i_6_ = Class246_Sub41_Sub1.method2585((byte) -17, class_r);
			if (i_3_ == -10) {
				Class128_Sub2.method2334(class_r, i_4_, i_5_, i_6_, -119);
				FloorDefinition.method1360(class_r, -121);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ca.E(" + i + ',' + i_3_ + ',' + (class_r != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1820(byte i) {
		try {
			if (i != 58)
				anIntArrayArray3944 = null;
			anIntArrayArray3944 = null;
			aClass201_3935 = null;
			aClass201_3940 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ca.B(" + i + ')');
		}
	}

	static final String method1821(int i, long l) {
		try {
			anInt3930++;
			if ((l ^ 0xffffffffffffffffL) >= -1L || (l ^ 0xffffffffffffffffL) <= -6582952005840035282L)
				return null;
			if (l % 37L == 0L)
				return null;
			if (i <= 91)
				return null;
			int i_7_ = 0;
			for (long l_8_ = l; l_8_ != 0L; l_8_ /= 37L)
				i_7_++;
			StringBuffer stringbuffer = new StringBuffer(i_7_);
			while ((l ^ 0xffffffffffffffffL) != -1L) {
				long l_9_ = l;
				l /= 37L;
				stringbuffer.append(Class9.aCharArray106[(int) (-(37L * l) + l_9_)]);
			}
			return stringbuffer.reverse().toString();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ca.C(" + i + ',' + l + ')');
		}
	}

	public Class246_Sub6() {
		((Class246_Sub6) this).anInt3931 = -1;
	}
}
