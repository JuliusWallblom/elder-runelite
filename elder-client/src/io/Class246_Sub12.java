package io;

import io.cache.Cache;
import io.cache.IndexConstants;
import io.cache.Revision;

final class Class246_Sub12 extends Node {
	int anInt4394;
	int anInt4395;
	int anInt4396;
	static int anInt4397 = 1;
	static int anInt4398;
	static int anInt4399;
	int anInt4400;
	int anInt4401;
	boolean aBool4402;
	static OutgoingPacket OBJECT_EXAMINE_PACKET;
	static short aShort4404;
	static int anInt4405;

	public static void method1979(int i) {
		try {
			if (i <= -33)
				OBJECT_EXAMINE_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fj.B(" + i + ')');
		}
	}

	static final void method1980(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_0_, int i_1_, boolean[] bools) {
		if (Class59_Sub3_Sub4.aClass210Array6993 != Class154.aClass210Array2215) {
			int i_2_ = Class246_Sub28_Sub3.aClass210Array5899[i].a(i_0_, i_1_);
			for (int i_3_ = 0; i_3_ <= i; i_3_++) {
				if (bools == null || bools[i_3_]) {
					Class210 class210 = Class246_Sub28_Sub3.aClass210Array5899[i_3_];
					if (class210 != null)
						class210.p(class246_sub1_sub4, i_0_, i_2_ - class210.a(i_0_, i_1_), i_1_, 0, false);
				}
			}
		}
	}

	Class246_Sub12(int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool) {
		try {
			((Class246_Sub12) this).anInt4395 = i_10_;
			((Class246_Sub12) this).anInt4396 = i_7_;
			((Class246_Sub12) this).anInt4394 = i_9_;
			((Class246_Sub12) this).anInt4400 = i;
			((Class246_Sub12) this).aBool4402 = bool;
			((Class246_Sub12) this).anInt4401 = i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fj.<init>(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ')'));
		}
	}

	static final void method1982(boolean bool, int i, int i_11_, int i_12_, Class246_Sub5 class246_sub5, int i_13_) {
		do {
			try {
				anInt4399++;
				if (((Class246_Sub5) class246_sub5).anInt3882 != -1 || (((Class246_Sub5) class246_sub5).anIntArray3878 != null)) {
					int i_14_ = 0;
					if (bool != true)
						Widget.update_dynamic_components(null);
					int i_15_ = ((((Class246_Sub5) class246_sub5).anInt3887 * ((Renderer) (Client.current_renderer)).anInt603) >> 8);
					if (((Class246_Sub5) class246_sub5).anInt3880 >= i_12_) {
						if ((((Class246_Sub5) class246_sub5).anInt3879 ^ 0xffffffff) < (i_12_ ^ 0xffffffff))
							i_14_ += (((Class246_Sub5) class246_sub5).anInt3879 - i_12_);
					} else
						i_14_ += (-((Class246_Sub5) class246_sub5).anInt3880 + i_12_);
					if ((i_11_ ^ 0xffffffff) < (((Class246_Sub5) class246_sub5).anInt3872 ^ 0xffffffff))
						i_14_ += (-((Class246_Sub5) class246_sub5).anInt3872 + i_11_);
					else if (((Class246_Sub5) class246_sub5).anInt3876 > i_11_)
						i_14_ += (((Class246_Sub5) class246_sub5).anInt3876 + -i_11_);
					if (((Class246_Sub5) class246_sub5).anInt3870 == 0 || ((i_14_ - 64 ^ 0xffffffff) < (((Class246_Sub5) class246_sub5).anInt3870 ^ 0xffffffff)) || (((Renderer) Client.current_renderer).anInt603) == 0 || (((Class246_Sub5) class246_sub5).anInt3886 ^ 0xffffffff) != (i ^ 0xffffffff)) {
						if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893) != null) {
							Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893);
							((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 = null;
						}
						if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874) != null) {
							Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874);
							((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874 = null;
						}
					} else {
						i_14_ -= 64;
						if (i_14_ < 0)
							i_14_ = 0;
						int i_16_ = ((-i_14_ + ((Class246_Sub5) class246_sub5).anInt3870) * i_15_ / ((Class246_Sub5) class246_sub5).anInt3870);
						if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893) == null) {
							if (((Class246_Sub5) class246_sub5).anInt3882 >= 0) {
								Class229 class229 = Class229.method1467((Cache.get_index(Revision.PRE_EOC_634, "sound_effects")), (((Class246_Sub5) class246_sub5).anInt3882), 0);
								if (class229 != null) {
									Class246_Sub3_Sub1 class246_sub3_sub1 = (class229.method1468().method2655(Class148.aClass250_2178));
									Class246_Sub37_Sub3 class246_sub37_sub3 = (Class246_Sub37_Sub3.method2809(class246_sub3_sub1, 100, i_16_));
									class246_sub37_sub3.method2781(-1);
									Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2626(class246_sub37_sub3);
									((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 = class246_sub37_sub3;
								}
							}
						} else
							((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893.method2798(i_16_);
						if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874) == null) {
							if ((((Class246_Sub5) class246_sub5).anIntArray3878 != null) && (((Class246_Sub5) class246_sub5).anInt3884 -= i_13_) <= 0) {
								int i_17_ = (int) (Math.random() * (double) (((Class246_Sub5) class246_sub5).anIntArray3878).length);
								Class229 class229 = Class229.method1467((Cache.get_index(Revision.PRE_EOC_634, "sound_effects")), (((Class246_Sub5) class246_sub5).anIntArray3878[i_17_]), 0);
								if (class229 != null) {
									Class246_Sub3_Sub1 class246_sub3_sub1 = (class229.method1468().method2655(Class148.aClass250_2178));
									Class246_Sub37_Sub3 class246_sub37_sub3 = (Class246_Sub37_Sub3.method2809(class246_sub3_sub1, 100, i_16_));
									class246_sub37_sub3.method2781(0);
									Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2626(class246_sub37_sub3);
									((Class246_Sub5) class246_sub5).anInt3884 = ((int) ((double) (-(((Class246_Sub5) class246_sub5).anInt3890) + (((Class246_Sub5) class246_sub5).anInt3889)) * Math.random()) + (((Class246_Sub5) class246_sub5).anInt3890));
									((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874 = class246_sub37_sub3;
								}
							}
						} else {
							((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874.method2798(i_16_);
							if (((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874.method1576(75))
								break;
							((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874 = null;
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	static {
		new MultilingualString(null, "Mitglieder k\u00f6nnen 200 Freunde hinzuf\u00fcgen, freie Spieler nur 100.", null, null);
		OBJECT_EXAMINE_PACKET = new OutgoingPacket(73, 2);
		aShort4404 = (short) 32767;
		anInt4405 = 0;
	}
}
