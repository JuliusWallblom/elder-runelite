package io;

final class Class246_Sub1_Sub2 extends NodeSub {
	static String[] aStringArray5688 = new String[100];
	static int anInt5689;
	static int anInt5690;
	static int[] anIntArray5691 = { 16, 32, 64, 128 };
	static int anInt5692;
	static short[][] aShortArrayArray5693;
	static float aFloat5694 = 1.0F;
	static int anInt5695;
	static int anInt5696;
	int anInt5697 = 0;
	static boolean aBool5698 = false;

	final void method2422(int i, Buffer stream) {
		try {
			if (i != 1439100504)
				aShortArrayArray5693 = null;
			anInt5695++;
			for (;;) {
				int i_0_ = stream.readUnsignedByte();
				if ((i_0_ ^ 0xffffffff) == -1)
					break;
				method2427(i_0_, -22, stream);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("an.B(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2423(int i) {
		try {
			aShortArrayArray5693 = null;
			anIntArray5691 = null;
			if (i != -14495)
				method2424(-57, 50, 81, -3, true, null, false);
			aStringArray5688 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "an.A(" + i + ')');
		}
	}

	static final void method2424(int i, int i_1_, int i_2_, int i_3_, boolean bool, SequenceType class124, boolean bool_4_) {
		try {
			anInt5690++;
			if ((Class59.anInt819 ^ 0xffffffff) > -51 && (class124 != null && ((SequenceType) class124).frameSounds != null && i_1_ < ((SequenceType) class124).frameSounds.length && (((SequenceType) class124).frameSounds[i_1_] != null))) {
				int i_5_ = ((SequenceType) class124).frameSounds[i_1_][0];
				int i_6_ = i_5_ >> 8;
				int i_7_ = (0xee & i_5_) >> 5;
				int i_8_ = i_5_ & 0x1f;
				if ((((SequenceType) class124).frameSounds[i_1_].length ^ 0xffffffff) < -2) {
					int i_9_ = (int) ((double) (((SequenceType) class124).frameSounds[i_1_]).length * Math.random());
					if (i_9_ > 0)
						i_6_ = (((SequenceType) class124).frameSounds[i_1_][i_9_]);
				}
				if (i_8_ == 0) {
					if (bool_4_)
						Client.queue_sound_effect(i_6_, 0, i_7_, 255, 0);
				} else {
					if (bool != true)
						method2426(-40, (byte) -8, 12);
					if ((((Renderer) Client.current_renderer).anInt603) != 0) {
						int i_10_ = i - 64 >> 7;
						int i_11_ = -64 + i_3_ >> 7;
						Class47.aClass258Array684[Class59.anInt819++] = new Class258((byte) 1, i_6_, i_7_, 0, 255, ((i_10_ << 16) + (i_2_ << 24) - -(i_11_ << 8) + i_8_));
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("an.D(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ',' + (class124 != null ? "{...}" : "null") + ',' + bool_4_ + ')'));
		}
	}

	static final Class205[] method2425(int i) {
		try {
			anInt5696++;
			if (i != 0)
				aFloat5694 = -0.30582246F;
			return (new Class205[] { Class208.aClass205_2930, Client.f_fb, Class130_Sub4.aClass205_4740, Material.aClass205_3351, Class155.aClass205_2228, SequenceType.aClass205_1735 });
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "an.F(" + i + ')');
		}
	}

	static final int method2426(int i, byte i_12_, int i_13_) {
		try {
			anInt5689++;
			if (i_13_ == -2)
				return 12345678;
			if (i_12_ != 66)
				return -1;
			if ((i_13_ ^ 0xffffffff) == 0) {
				if (i < 2)
					i = 2;
				else if ((i ^ 0xffffffff) < -127)
					i = 126;
				return i;
			}
			i = i * (0x7f & i_13_) >> 7;
			if ((i ^ 0xffffffff) > -3)
				i = 2;
			else if ((i ^ 0xffffffff) < -127)
				i = 126;
			return (i_13_ & 0xff80) - -i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("an.E(" + i + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	private final void method2427(int i, int i_14_, Buffer stream) {
		do {
			try {
				if ((i ^ 0xffffffff) == -3)
					((Class246_Sub1_Sub2) this).anInt5697 = stream.readUnsignedShort();
				anInt5692++;
				if (i_14_ < -13)
					break;
				aFloat5694 = -1.2130574F;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("an.C(" + i + ',' + i_14_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class246_Sub1_Sub2() {
		/* empty */
	}
}
