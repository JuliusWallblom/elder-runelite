package io;

/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class169 implements Interface5 {
	static int anInt2401;
	static int anInt2402;
	static int anInt2403;
	static OutgoingPacket aClass201_2404 = new OutgoingPacket(25, 4);
	static int anInt2405;
	int anInt2406;
	static BigInteger RSA_MODULUS;
	static int[] key_codes = { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0,
			13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22,
			23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49,
			36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88,
			229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	static MultilingualString aClass67_2409;
	static AbstractSprite[] aClass_lArray2410;
	static long aLong2411;
	static Class12 SOME_PACKET_3;
	static float[] aFloatArray2413;
	static OutgoingPacket OBJECT_CLICK_2_PACKET;

	static final void method1121(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			if ((Class246_Sub28_Sub4.anInt5976 ^ 0xffffffff) == -2)
				Class246_Sub28_Sub29.aClass_lArray6820[Class246_Sub28_Sub19.anInt6547 / 100]
						.draw_sprite(Class7.anInt97 - 8, Class107.anInt1508 - 8);
			anInt2405++;
			if (i_3_ < -80) {
				if ((Class246_Sub28_Sub4.anInt5976 ^ 0xffffffff) == -3)
					Class246_Sub28_Sub29.aClass_lArray6820[Class246_Sub28_Sub19.anInt6547 / 100 + 4]
							.draw_sprite(Class7.anInt97 - 8, -8 + Class107.anInt1508);
				Class219.method1420(8714);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("pn.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public final String toString() {
		try {
			anInt2403++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pn.toString(" + ')');
		}
	}

	public static void method1122(byte i) {
		try {
			SOME_PACKET_3 = null;
			aFloatArray2413 = null;
			int i_4_ = 104 % ((i + 86) / 35);
			aClass_lArray2410 = null;
			aClass67_2409 = null;
			aClass201_2404 = null;
			OBJECT_CLICK_2_PACKET = null;
			key_codes = null;
			RSA_MODULUS = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pn.A(" + i + ')');
		}
	}

	static final void method1123(String string, byte i) {
		do {
			try {
				System.out
						.println("Bad " + string + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
				anInt2402++;
				System.exit(1);
				if (i >= 116)
					break;
				aClass67_2409 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("pn.C(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method1124(Widget class235, int i, int i_5_, int i_6_) {
		do {
			try {
				if (i_6_ != 2)
					method1123(null, (byte) -122);
				if ((((Widget) class235).alignment_y ^ 0xffffffff) != -1) {
					if (((Widget) class235).alignment_y == 1)
						((Widget) class235).y = ((i_5_ - ((Widget) class235).screen_height) / 2
								+ ((Widget) class235).original_y);
					else if ((((Widget) class235).alignment_y ^ 0xffffffff) != -3) {
						if ((((Widget) class235).alignment_y ^ 0xffffffff) == -4)
							((Widget) class235).y = ((Widget) class235).original_y * i_5_ >> 14;
						else if (((Widget) class235).alignment_y != 4)
							((Widget) class235).y = (-(i_5_ * ((Widget) class235).original_y >> 14) + i_5_
									- ((Widget) class235).screen_height);
						else
							((Widget) class235).y = ((i_5_ * ((Widget) class235).original_y >> 14)
									+ (i_5_ + -((Widget) class235).screen_height) / 2);
					} else
						((Widget) class235).y = (-((Widget) class235).screen_height
								+ (i_5_ + -((Widget) class235).original_y));
				} else
					((Widget) class235).y = ((Widget) class235).original_y;
				anInt2401++;
				if (((Widget) class235).alignment_x == 0)
					((Widget) class235).x = ((Widget) class235).original_x;
				else if ((((Widget) class235).alignment_x ^ 0xffffffff) == -2)
					((Widget) class235).x = ((i - ((Widget) class235).screen_width) / 2
							+ ((Widget) class235).original_x);
				else if (((Widget) class235).alignment_x == 2)
					((Widget) class235).x = (-((Widget) class235).original_x + (i - ((Widget) class235).screen_width));
				else if ((((Widget) class235).alignment_x ^ 0xffffffff) == -4)
					((Widget) class235).x = i * ((Widget) class235).original_x >> 14;
				else if (((Widget) class235).alignment_x == 4)
					((Widget) class235).x = ((((Widget) class235).original_x * i >> 14)
							+ (-((Widget) class235).screen_width + i) / 2);
				else
					((Widget) class235).x = (-(i * ((Widget) class235).original_x >> 14)
							+ -((Widget) class235).screen_width + i);
				if (!RenderSequenceLoader.aBool1452)
					break;
				if ((((ClickMaskNode) Widget.get_active_properties(class235)).anInt4893 != 0)
						|| ((Widget) class235).type == 0) {
					if ((((Widget) class235).y ^ 0xffffffff) <= -1) {
						if (((((Widget) class235).y - -((Widget) class235).screen_height) ^ 0xffffffff) < (i_5_
								^ 0xffffffff))
							((Widget) class235).y = -((Widget) class235).screen_height + i_5_;
					} else
						((Widget) class235).y = 0;
					if (((Widget) class235).x < 0)
						((Widget) class235).x = 0;
					else {
						if ((((Widget) class235).screen_width + ((Widget) class235).x) <= i)
							break;
						((Widget) class235).x = -((Widget) class235).screen_width + i;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("pn.D(" + (class235 != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	Class169(String string, int i) {
		try {
			((Class169) this).anInt2406 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("pn.<init>(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		RSA_MODULUS = (new BigInteger(
				"129792996338865251963126643988596996720072633146969539440281778959016153061754455583589842714770006380363039568659750973278228571148845466851600564516017951101034459842947540501966343376879636558259828889909314399933785798161654538562770788737383888023632830865777674023521713178116488997886496990330549017579"));
		aClass67_2409 = new MultilingualString("Prepared sound engine", "Musik-Engine vorbereitet.",
				"Moteur son pr\u00e9par\u00e9", "Mecanismo de som preparado");
		aFloatArray2413 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
				0.0F, 0.0F, 1.0F };
		aLong2411 = 0L;
		SOME_PACKET_3 = new Class12(7, 16);
		OBJECT_CLICK_2_PACKET = new OutgoingPacket(14, 7);
	}
}
