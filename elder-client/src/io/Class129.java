package io;

import io.cache.Cache;
import io.cache.IndexConstants;

final class Class129 {
	static int anInt1800;
	static int anInt1801;
	Class220 aClass220_1802 = new Class220();
	static int anInt1803;
	int anInt1804;
	static int anInt1805;
	static Class198 aClass198_1806;
	static int anInt1807;
	static int anInt1808;
	public static int anInt1809;
	int anInt1810;
	static IncomingPacket PLAY_MUSIC_EFFECTS_IN;
	boolean aBool1812 = false;

	static final FontMetric method878(int i, int i_0_, int i_1_, CacheIndex font_metrics) {
		try {
			if (i != 6)
				PLAY_MUSIC_EFFECTS_IN = null;
			anInt1807++;
			byte[] is = font_metrics.get_file(i_0_, i_1_);
			if (is == null)
				return null;
			return new FontMetric(is);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mc.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (font_metrics != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method879(Class246_Sub37 class246_sub37, int i) {
		try {
			anInt1800++;
			if (((Class246_Sub37) class246_sub37).aClass246_Sub3_5324 != null)
				((Class246_Sub3) (((Class246_Sub37) class246_sub37).aClass246_Sub3_5324)).anInt3824 = 0;
			((Class246_Sub37) class246_sub37).aBool5323 = false;
			if (i != 7582)
				method883(102, (byte) -84);
			for (Class246_Sub37 class246_sub37_2_ = class246_sub37.method2259(); class246_sub37_2_ != null; class246_sub37_2_ = class246_sub37.method2256())
				method879(class246_sub37_2_, 7582);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mc.F(" + (class246_sub37 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method880(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, byte i_9_) {
		try {
			anInt1803++;
			int i_10_ = 0;
			int i_11_ = i_6_;
			int i_12_ = 0;
			int i_13_ = -i_8_ + i_4_;
			int i_14_ = i_6_ + -i_8_;
			int i_15_ = i_4_ * i_4_;
			int i_16_ = i_6_ * i_6_;
			int i_17_ = i_13_ * i_13_;
			int i_18_ = i_14_ * i_14_;
			int i_19_ = i_16_ << 1;
			int i_20_ = i_15_ << 1;
			int i_21_ = i_18_ << 1;
			int i_22_ = i_17_ << 1;
			int i_23_ = i_6_ << 1;
			if (i_9_ > -70)
				method881(null, true);
			int i_24_ = i_14_ << 1;
			int i_25_ = (1 + -i_23_) * i_15_ + i_19_;
			int i_26_ = i_16_ - i_20_ * (-1 + i_23_);
			int i_27_ = i_17_ * (-i_24_ + 1) - -i_21_;
			int i_28_ = i_18_ + -(i_22_ * (i_24_ - 1));
			int i_29_ = i_15_ << 2;
			int i_30_ = i_16_ << 2;
			int i_31_ = i_17_ << 2;
			int i_32_ = i_18_ << 2;
			int i_33_ = 3 * i_19_;
			int i_34_ = (-3 + i_23_) * i_20_;
			int i_35_ = 3 * i_21_;
			int i_36_ = (i_24_ - 3) * i_22_;
			int i_37_ = i_30_;
			int i_38_ = i_29_ * (i_6_ - 1);
			int i_39_ = i_32_;
			int i_40_ = (i_14_ - 1) * i_31_;
			if ((i_7_ ^ 0xffffffff) <= (AbstractModel.anInt1442 ^ 0xffffffff) && Class109_Sub4.anInt4570 >= i_7_) {
				int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_7_];
				int i_41_ = Class180.method1176(Class110.anInt1573, -24309, -i_4_ + i, ObjType.anInt2818);
				int i_42_ = Class180.method1176(Class110.anInt1573, -24309, i - -i_4_, ObjType.anInt2818);
				int i_43_ = Class180.method1176(Class110.anInt1573, -24309, i + -i_13_, ObjType.anInt2818);
				int i_44_ = Class180.method1176(Class110.anInt1573, -24309, i - -i_13_, ObjType.anInt2818);
				RenderAnimation.method918(i_41_, -117, i_3_, i_43_, is);
				RenderAnimation.method918(i_43_, -59, i_5_, i_44_, is);
				RenderAnimation.method918(i_44_, -88, i_3_, i_42_, is);
			}
			while (i_11_ > 0) {
				boolean bool = (i_11_ ^ 0xffffffff) >= (i_14_ ^ 0xffffffff);
				if ((i_25_ ^ 0xffffffff) > -1) {
					while (i_25_ < 0) {
						i_25_ += i_33_;
						i_26_ += i_37_;
						i_10_++;
						i_33_ += i_30_;
						i_37_ += i_30_;
					}
				}
				if (bool) {
					if (i_27_ < 0) {
						while ((i_27_ ^ 0xffffffff) > -1) {
							i_27_ += i_35_;
							i_28_ += i_39_;
							i_12_++;
							i_35_ += i_32_;
							i_39_ += i_32_;
						}
					}
					if (i_28_ < 0) {
						i_27_ += i_35_;
						i_28_ += i_39_;
						i_35_ += i_32_;
						i_12_++;
						i_39_ += i_32_;
					}
					i_28_ += -i_36_;
					i_27_ += -i_40_;
					i_36_ -= i_31_;
					i_40_ -= i_31_;
				}
				if ((i_26_ ^ 0xffffffff) > -1) {
					i_25_ += i_33_;
					i_26_ += i_37_;
					i_37_ += i_30_;
					i_10_++;
					i_33_ += i_30_;
				}
				i_25_ += -i_38_;
				i_26_ += -i_34_;
				i_38_ -= i_29_;
				i_11_--;
				i_34_ -= i_29_;
				int i_45_ = i_7_ + -i_11_;
				int i_46_ = i_7_ - -i_11_;
				if (i_46_ >= AbstractModel.anInt1442 && ((Class109_Sub4.anInt4570 ^ 0xffffffff) <= (i_45_ ^ 0xffffffff))) {
					int i_47_ = Class180.method1176(Class110.anInt1573, -24309, i - -i_10_, ObjType.anInt2818);
					int i_48_ = Class180.method1176(Class110.anInt1573, -24309, i + -i_10_, ObjType.anInt2818);
					if (bool) {
						int i_49_ = Class180.method1176(Class110.anInt1573, -24309, i_12_ + i, ObjType.anInt2818);
						int i_50_ = Class180.method1176(Class110.anInt1573, -24309, i + -i_12_, ObjType.anInt2818);
						if (i_45_ >= AbstractModel.anInt1442) {
							int[] is = (Class246_Sub28_Sub6.anIntArrayArray6042[i_45_]);
							RenderAnimation.method918(i_48_, 122, i_3_, i_50_, is);
							RenderAnimation.method918(i_50_, 118, i_5_, i_49_, is);
							RenderAnimation.method918(i_49_, -48, i_3_, i_47_, is);
						}
						if (Class109_Sub4.anInt4570 >= i_46_) {
							int[] is = (Class246_Sub28_Sub6.anIntArrayArray6042[i_46_]);
							RenderAnimation.method918(i_48_, -17, i_3_, i_50_, is);
							RenderAnimation.method918(i_50_, -14, i_5_, i_49_, is);
							RenderAnimation.method918(i_49_, -29, i_3_, i_47_, is);
						}
					} else {
						if ((i_45_ ^ 0xffffffff) <= (AbstractModel.anInt1442 ^ 0xffffffff))
							RenderAnimation.method918(i_48_, -42, i_3_, i_47_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_45_]));
						if ((Class109_Sub4.anInt4570 ^ 0xffffffff) <= (i_46_ ^ 0xffffffff))
							RenderAnimation.method918(i_48_, 120, i_3_, i_47_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_46_]));
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mc.C(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	static final boolean method881(String string, boolean bool) {
		try {
			if (bool != false)
				PLAY_MUSIC_EFFECTS_IN = null;
			anInt1805++;
			if (string == null)
				return false;
			for (int i = 0; Widget.anInt3266 > i; i++) {
				if (string.equalsIgnoreCase(Class55.aStringArray784[i]))
					return true;
				if (string.equalsIgnoreCase(Class246_Sub41_Sub1.aStringArray6172[i]))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mc.E(" + (string != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	public static void method882(int i) {
		do {
			try {
				PLAY_MUSIC_EFFECTS_IN = null;
				aClass198_1806 = null;
				if (i == 1)
					break;
				method881(null, true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "mc.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method883(int i, byte i_51_) {
		try {
			anInt1801++;
			if (i_51_ <= 43)
				anInt1809 = 103;
			Class24.method205(0);
			Class75.method473((byte) 56);
			Class251.method1611(-27345, true, i);
			Class19.method189(Client.sprite_loader, Cache.get_index(Settings.gamefonts, "sprites"), -101, Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
			Class246_Sub28_Sub7.method2556(Cache.get_index(Settings.gamefonts, "sprites"), Cache.get_index(Settings.gamefonts, "sprites"), false, Client.sprite_loader);
			Class176.method1158(Class243.aClass_lArray3448, 10);
			Class246_Sub23.method2099((byte) 107);
			Class205.method1341(-11712);
			if ((Client.gameState ^ 0xffffffff) != -11) {
				if ((Client.gameState ^ 0xffffffff) != -31) {
					if ((Client.gameState ^ 0xffffffff) == -6)
						MapScenes.method1642();
				} else
					Class99.updateGameState((byte) -119, 25);
			} else
				LoginScreen.prepare(false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mc.D(" + i + ',' + i_51_ + ')');
		}
	}

	public Class129() {
		/* empty */
	}

	static {
		new MultilingualString("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 na sua lista de amigos.");
		anInt1808 = 0;
		PLAY_MUSIC_EFFECTS_IN = new IncomingPacket(21, 6);
	}
}
