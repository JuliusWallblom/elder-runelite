package io;

final class Class230 {
	private boolean aBool3143 = true;
	private Class2 aClass2_3144;
	private int anInt3145;
	static int anInt3146;
	static int anInt3147;
	static int anInt3148;
	private int anInt3149;
	static int anInt3150;
	static int[] anIntArray3151;
	private int anInt3152;
	static int anInt3153;
	static Class63_Sub1[] aClass63_Sub1Array3154;
	private int anInt3155 = -1;
	private AbstractSprite aClass_l3156;
	private Class2[] aClass2Array3157;
	private int anInt3158;
	static int anInt3159;
	static int anInt3160 = 0;
	static int anInt3161;
	private int texture_id;
	private Class2[] aClass2Array3163;
	private int anInt3164;
	static int anInt3165;
	static int anInt3166;
	static int anInt3167;

	static final void method1470(int i, byte i_0_, int i_1_, boolean bool, int i_2_, int i_3_) {
		do {
			try {
				anInt3166++;
				if (Class106.tiles == null)
					Client.sprite_loader.method1734(i, i_1_, i_2_, (byte) 58, -16777216, i_3_);
				else if ((((Class59_Sub3) Client.local_player).x < 0) || (128
						* Class38_Sub1_Sub1.anInt6770 <= (((Class59_Sub3) Client.local_player).x))
						|| ((((Class59_Sub3) Client.local_player).y) ^ 0xffffffff) > -1
						|| (((((Class59_Sub3) Client.local_player).y)
								^ 0xffffffff) <= (128 * Class152.anInt2205 ^ 0xffffffff)))
					Client.sprite_loader.method1734(i, i_1_, i_2_, (byte) 58, -16777216, i_3_);
				else {
					Class64_Sub1.anInt5236++;
					if (Client.local_player != null
							&& (((((Class59_Sub3) Client.local_player).x)
									+ -(64 * (-1 + Client.local_player.method2670((byte) 127)))) >> 7
									^ 0xffffffff) == (Class188.anInt2658 ^ 0xffffffff)
							&& ((((Class59_Sub3) Client.local_player).y)
									+ -(64 * (Client.local_player.method2670((byte) 127)
											- 1))) >> 7 == Class34.anInt451) {
						Class188.anInt2658 = -1;
						Class34.anInt451 = -1;
						Class43.method294((byte) -31);
					}
					Class21_Sub2.method2014(-11841);
					if (!bool)
						Class246_Sub28_Sub6.method2553(25861);
					Class257.method1667(0);
					GameEngine.method2944(i_2_, i_1_, (byte) -21, i, true, i_3_);
					i_1_ = Class179.anInt2512;
					i_3_ = Class59_Sub1_Sub2.anInt6133;
					i_2_ = Class_g.anInt6482;
					i = Class_g.f_ib;
					if ((Class130_Sub3.anInt4417 ^ 0xffffffff) == -2) {
						int i_4_ = (int) Camera.camera_pitch;
						if ((Stream_Sub2.anInt6188 >> 8 ^ 0xffffffff) < (i_4_ ^ 0xffffffff))
							i_4_ = Stream_Sub2.anInt6188 >> 8;
						if (Class246_Sub28_Sub29.aBoolArray6817[4]
								&& (Class59_Sub5_Sub1.anIntArray5827[4] + 128 > i_4_))
							i_4_ = 128 + Class59_Sub5_Sub1.anIntArray5827[4];
						int i_5_ = 0x3fff & ((int) Camera.camera_yaw + Tile.anInt2147);
						Class246_Sub28_Sub15.method2646(0, Class_c_Sub1.anInt5366,
								Client.gameZoom - -(3 * (i_4_ >> 3)) << 0, Class246_Sub34.anInt5135, i_5_,
								(-50 + Class6.getAverageHeight((((Class59_Sub3) Client.local_player).x),
										59, Class246_Sub28_Sub24.anInt6681,
										(((Class59_Sub3) Client.local_player).y))),
								i_3_, i_4_);
					} else if (Class130_Sub3.anInt4417 == 4) {
						int i_6_ = (int) Camera.camera_pitch;
						if ((Stream_Sub2.anInt6188 >> 8 ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
							i_6_ = Stream_Sub2.anInt6188 >> 8;
						if (Class246_Sub28_Sub29.aBoolArray6817[4]
								&& ((i_6_ ^ 0xffffffff) > (128 + Class59_Sub5_Sub1.anIntArray5827[4] ^ 0xffffffff)))
							i_6_ = 128 + Class59_Sub5_Sub1.anIntArray5827[4];
						int i_7_ = (int) Camera.camera_yaw & 0x3fff;
						Class246_Sub28_Sub15
								.method2646(0, Class_c_Sub1.anInt5366, 600 + 3 * (i_6_ >> 3) << 0,
										Class246_Sub34.anInt5135, i_7_, Class6.getAverageHeight(Class242.anInt3424, 125,
												Class246_Sub28_Sub24.anInt6681, Class246_Sub43.anInt5606) - 50,
										i_3_, i_6_);
					} else if ((Class130_Sub3.anInt4417 ^ 0xffffffff) == -6)
						Class246_Sub1_Sub10.method2606(i_3_, (byte) 24);
					int i_8_ = Class246_Sub16.aInt92;
					int i_9_ = Class246_Sub28_Sub8.anInt6077;
					int i_10_ = Class259_Sub1.anInt4509;
					int i_11_ = Class244.anInt3456;
					int i_12_ = FontMetric.anInt961;
					for (int i_13_ = 0; i_13_ < 5; i_13_++) {
						if (Class246_Sub28_Sub29.aBoolArray6817[i_13_]) {
							int i_14_ = (int) ((Math.random() * (double) (1 + 2 * (Class56.anIntArray795[i_13_])))
									- (double) (Class56.anIntArray795[i_13_])
									+ ((Math.sin((double) (Class35.anIntArray481[i_13_]) / 100.0
											* (double) (Class259_Sub3.anIntArray5358[i_13_])))
											* (double) (Class59_Sub5_Sub1.anIntArray5827[i_13_])));
							if ((i_13_ ^ 0xffffffff) == -4)
								FontMetric.anInt961 = 0x3fff & FontMetric.anInt961 + i_14_;
							if (i_13_ == 1)
								Class246_Sub28_Sub8.anInt6077 += i_14_;
							if (i_13_ == 0)
								Class246_Sub16.aInt92 += i_14_;
							if ((i_13_ ^ 0xffffffff) == -5) {
								Class244.anInt3456 += i_14_;
								if (Class244.anInt3456 < 1024)
									Class244.anInt3456 = 1024;
								else if ((Class244.anInt3456 ^ 0xffffffff) < -3073)
									Class244.anInt3456 = 3072;
							}
							if (i_13_ == 2)
								Class259_Sub1.anInt4509 += i_14_;
						}
					}
					if (Class246_Sub16.aInt92 < 0)
						Class246_Sub16.aInt92 = 0;
					if ((Class246_Sub16.aInt92 ^ 0xffffffff) < (-1 + (Class240.xSize << 7) ^ 0xffffffff))
						Class246_Sub16.aInt92 = -1 + (Class240.xSize << 7);
					if (Class259_Sub1.anInt4509 < 0)
						Class259_Sub1.anInt4509 = 0;
					if ((HDModel.ySize << 7) - 1 < Class259_Sub1.anInt4509)
						Class259_Sub1.anInt4509 = (HDModel.ySize << 7) - 1;
					Class130.method887(-11572);
					InputStream_Sub1.method2101(-12388);
					Client.sprite_loader.OA(i, i_2_, i + i_1_, i_2_ + i_3_);
					Client.sprite_loader.method1707();
					int i_15_ = Settings.fog_color;
					if (i_0_ > 40) {
						if (Class_u_Sub1.aClass230_5685 != null)
							Class_u_Sub1.aClass230_5685.method1478(Class246_Sub28_Sub8.anInt6076 << 3, i, i_2_,
									FontMetric.anInt961, Class244.anInt3456, Client.sprite_loader, 16383, i_1_,
									i_15_, i_3_);
						else
							Client.sprite_loader.p(i_15_);
						IterableNodeHashTable.method545((byte) -109);
						Class130_Sub3.aClass_c4413.s(Class246_Sub16.aInt92, Class246_Sub28_Sub8.anInt6077,
								Class259_Sub1.anInt4509, 0x3fff & -Class244.anInt3456, 0x3fff & -FontMetric.anInt961,
								-Class106_Sub1.anInt4179 & 0x3fff);
						Client.sprite_loader.ea(Class130_Sub3.aClass_c4413);
						Client.sprite_loader.H(i_1_ / 2 + i, i_2_ + i_3_ / 2, Font.anInt1617 << 1,
								Font.anInt1617 << 1);
						Class246_Sub28_Sub8.method2558(Font.anInt1617 << 1, i_1_ / 2 + i, (byte) 118,
								i_3_ / 2 + i_2_, (Font.anInt1617 << 1));
						Class256.method1663(0x3fff & -FontMetric.anInt961, -Class106_Sub1.anInt4179 & 0x3fff,
								Class246_Sub16.aInt92, Class259_Sub1.anInt4509, 0x3fff & -Class244.anInt3456,
								Class246_Sub28_Sub8.anInt6077, 121);
						byte i_16_ = (Client.current_renderer.method2049(Buffer.anInt5656,
								-68) == 2 ? (byte) Class64_Sub1.anInt5236 : (byte) 1);
						Class50.method332(Client.sprite_loader, Client.cycle,
								Texture.anInt6562, Class130_Sub3.aClass_c4413, Class246_Sub16.aInt92,
								Class246_Sub28_Sub8.anInt6077, Class259_Sub1.anInt4509, Class5.aByteArrayArrayArray56,
								Class166.anIntArray2354, Class246_Sub1_Sub3.anIntArray5715, MapScenes.anIntArray3625,
								Class173.anIntArray2442, Class29.anIntArray395,
								(((Class59_Sub3) Client.local_player).current_plane) + 1, i_16_,
								(((Class59_Sub3) Client.local_player).x) >> 7,
								(((Class59_Sub3) Client.local_player).y) >> 7,
								!((Renderer) (Client.current_renderer)).aBool576);
						IterableNodeHashTable.method545((byte) -109);
						if ((Client.gameState ^ 0xffffffff) == -31) {
							Class75.method476(i_3_, 256, 125, 256, i_2_, i_1_, i);
							Class210.method1382(i_1_, 256, 10, i_2_, 256, i, i_3_);
							Class246_Sub34.method2199((byte) 56, 256, i_2_, i_1_, i_3_, 256, i);
							Class169.method1121(i_3_, i_1_, i, i_2_, (byte) -106);
						}
						GameEngine.method2939();
						Class246_Sub16.aInt92 = i_8_;
						Class246_Sub28_Sub8.anInt6077 = i_9_;
						Class259_Sub1.anInt4509 = i_10_;
						FontMetric.anInt961 = i_12_;
						Class244.anInt3456 = i_11_;
						if (Class250.aBool3534 && (MapFunction.aClass242_2036.method1558(0) ^ 0xffffffff) == -1)
							Class250.aBool3534 = false;
						if (!Class250.aBool3534)
							break;
						Client.sprite_loader.method1734(i, i_1_, i_2_, (byte) 58, -16777216, i_3_);
						Class_w.method2650(false, (Class250.aClass67_3531.get(Preferences.language_code)),
								FontCache.regular_font, 13);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	final boolean method1471(byte i, int i_17_, SceneGraph class260) {
		try {
			anInt3167++;
			if ((anInt3155 ^ 0xffffffff) != (i_17_ ^ 0xffffffff)) {
				anInt3155 = i_17_;
				int i_18_ = Class206.method1350(i_17_, 269173057);
				if (i_18_ > i_17_)
					i_18_ = IterableNodeHashTable.method540(i_17_, false);
				if ((i_18_ ^ 0xffffffff) < -513)
					i_18_ = 512;
				if (i_18_ != anInt3152) {
					aClass_l3156 = null;
					anInt3152 = i_18_;
				}
				if (aClass2Array3157 != null) {
					anInt3149 = 0;
					int[] is = new int[aClass2Array3157.length];
					for (int i_19_ = 0; i_19_ < aClass2Array3157.length; i_19_++) {
						Class2 class2 = aClass2Array3157[i_19_];
						if (class2.method42(anInt3145, anInt3164, anInt3158, anInt3155)) {
							is[anInt3149] = ((Class2) class2).anInt8;
							aClass2Array3163[anInt3149++] = class2;
						}
					}
					Class246_Sub25.method2114(is, anInt3149 - 1, 0, aClass2Array3163, -126);
				}
				aBool3143 = true;
			}
			int i_20_ = -61 % ((-75 - i) / 34);
			boolean bool = false;
			if (aBool3143) {
				aBool3143 = false;
				for (int i_21_ = -1 + anInt3149; (i_21_ ^ 0xffffffff) <= -1; i_21_--) {
					boolean bool_22_ = aClass2Array3163[i_21_].method48(class260, aClass2_3144);
					Class230 class230_23_ = this;
					class230_23_.aBool3143 = class230_23_.aBool3143 | !bool_22_;
					bool |= bool_22_;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("un.E(" + i + ',' + i_17_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1472(int i, int i_24_, byte i_25_, boolean bool, int i_26_, boolean bool_27_, int i_28_) {
		do {
			try {
				anInt3153++;
				if ((i ^ 0xffffffff) > (i_26_ ^ 0xffffffff)) {
					int i_29_ = (i + i_26_) / 2;
					int i_30_ = i;
					Class63_Sub1 class63_sub1 = Class220.aClass63_Sub1Array3056[i_29_];
					Class220.aClass63_Sub1Array3056[i_29_] = Class220.aClass63_Sub1Array3056[i_26_];
					Class220.aClass63_Sub1Array3056[i_26_] = class63_sub1;
					for (int i_31_ = i; (i_26_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
						if ((Class168.method1119(i_28_, (Class220.aClass63_Sub1Array3056[i_31_]), bool, class63_sub1,
								i_24_, bool_27_, (byte) -85) ^ 0xffffffff) >= -1) {
							Class63_Sub1 class63_sub1_32_ = Class220.aClass63_Sub1Array3056[i_31_];
							Class220.aClass63_Sub1Array3056[i_31_] = Class220.aClass63_Sub1Array3056[i_30_];
							Class220.aClass63_Sub1Array3056[i_30_++] = class63_sub1_32_;
						}
					}
					Class220.aClass63_Sub1Array3056[i_26_] = Class220.aClass63_Sub1Array3056[i_30_];
					Class220.aClass63_Sub1Array3056[i_30_] = class63_sub1;
					method1472(i, i_24_, (byte) 59, bool, -1 + i_30_, bool_27_, i_28_);
					method1472(i_30_ + 1, i_24_, (byte) 126, bool, i_26_, bool_27_, i_28_);
				}
				if (i_25_ > 40)
					break;
				anInt3160 = -29;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("un.A(" + i + ',' + i_24_ + ',' + i_25_ + ',' + bool + ','
						+ i_26_ + ',' + bool_27_ + ',' + i_28_ + ')'));
			}
			break;
		} while (false);
	}

	static final Class63_Sub1 start_world_list(int i) {
		try {
			anInt3146++;
			Class187.anInt2652 = i;
			return Class150.getNextWorldListWorld(1405);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "un.H(" + i + ')');
		}
	}

	public static void method1474(int i) {
		try {
			if (i != 4096)
				anInt3160 = 124;
			anIntArray3151 = null;
			aClass63_Sub1Array3154 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "un.B(" + i + ')');
		}
	}

	static final int method1475(int i, int i_33_, int i_34_, int i_35_) {
		try {
			anInt3150++;
			i_33_ &= 0x3;
			if ((i_33_ ^ 0xffffffff) == -1)
				return i_35_;
			int i_36_ = -77 / ((9 - i_34_) / 41);
			if (i_33_ == 1)
				return i;
			if (i_33_ == 2)
				return 7 + -i_35_;
			return 7 + -i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("un.C(" + i + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ')'));
		}
	}

	final void method1476(int i) {
		try {
			if (aClass2Array3157 != null) {
				for (int i_37_ = 0; aClass2Array3157.length > i_37_; i_37_++)
					aClass2Array3157[i_37_].method40();
			}
			if (i != -4096)
				texture_id = -91;
			anInt3161++;
			aClass_l3156 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "un.F(" + i + ')');
		}
	}

	Class230(int i, Class2[] class2s, int i_38_, int i_39_, int i_40_, int i_41_) {
		try {
			aClass2Array3157 = class2s;
			texture_id = i;
			anInt3145 = i_39_;
			anInt3164 = i_40_;
			anInt3158 = i_41_;
			if (class2s != null) {
				aClass2Array3163 = new Class2[class2s.length];
				aClass2_3144 = i_38_ >= 0 ? class2s[i_38_] : null;
			} else {
				aClass2_3144 = null;
				aClass2Array3163 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("un.<init>(" + i + ',' + (class2s != null ? "{...}" : "null")
					+ ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ')'));
		}
	}

	static final void method1477(double d, byte i) {
		try {
			if (Class40_Sub3.aDouble4054 != d) {
				for (int i_42_ = 0; i_42_ < 256; i_42_++) {
					int i_43_ = (int) (255.0 * Math.pow((double) i_42_ / 255.0, d));
					Class59_Sub5.anIntArray5402[i_42_] = i_43_ <= 255 ? i_43_ : 255;
				}
				Class40_Sub3.aDouble4054 = d;
			}
			if (i > -4)
				anIntArray3151 = null;
			anInt3159++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "un.I(" + d + ',' + i + ')');
		}
	}

	final void method1478(int i, int i_44_, int i_45_, int i_46_, int i_47_, SceneGraph class260, int i_48_, int i_49_,
			int i_50_, int i_51_) {
		try {
			anInt3148++;
			i_46_ = i_46_ - -i & i_48_;
			if (texture_id == -1) {
				class260.O(i_44_, i_45_, i_49_, i_51_, i_50_, 0);
			} else {
				Material class238 = Class246_Sub28_Sub33.anInterface6_6967.get_material(-31305, texture_id);
				if (aClass_l3156 == null && Class246_Sub28_Sub33.anInterface6_6967.method13(texture_id, 19378)) {
					int[] is = (!((Material) class238).aBool3340
							? (Class246_Sub28_Sub33.anInterface6_6967.method16(false, texture_id, false, 0.7F,
									anInt3152,
									anInt3152))
							: (Class246_Sub28_Sub33.anInterface6_6967.method14(false, i_48_ - 10629, texture_id, 0.7F,
									anInt3152, anInt3152)));
					aClass_l3156 = class260.method1706(is, 0, anInt3152, anInt3152, anInt3152);
				}
				if (!((Material) class238).aBool3340)
					class260.O(i_44_, i_45_, i_49_, i_51_, i_50_, 0);
				if (aClass_l3156 != null) {
					int i_52_ = ((Material) class238).aBool3340 ? 0 : 1;
					int i_53_ = i_47_ * i_51_ / -4096;
					int i_54_;
					for (i_54_ = (i_49_ - i_51_) / 2
							+ i_51_ * i_46_ / 4096; (i_51_ ^ 0xffffffff) > (i_54_ ^ 0xffffffff); i_54_ -= i_51_) {
						/* empty */
					}
					for (/**/; (i_54_ ^ 0xffffffff) > -1; i_54_ += i_51_) {
						/* empty */
					}
					for (/**/; i_51_ < i_53_; i_53_ -= i_51_) {
						/* empty */
					}
					for (/**/; i_53_ < 0; i_53_ += i_51_) {
						/* empty */
					}
					for (int i_55_ = i_54_ + -i_51_; i_49_ > i_55_; i_55_ += i_51_) {
						for (int i_56_ = -i_51_ + i_53_; i_51_ > i_56_; i_56_ += i_51_)
							aClass_l3156.s(i_44_ + i_55_, i_56_ + i_45_, i_51_, i_51_, 1, 0, i_52_);
					}
				}
			}
			for (int i_57_ = anInt3149 - 1; i_57_ >= 0; i_57_--)
				aClass2Array3163[i_57_].method47(class260, i_44_, i_45_, i_49_, i_51_, i_47_, i_46_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("un.G(" + i + ',' + i_44_ + ',' + i_45_ + ',' + i_46_ + ',' + i_47_ + ','
							+ (class260 != null ? "{...}" : "null") + ',' + i_48_ + ',' + i_49_ + ',' + i_50_ + ','
							+ i_51_ + ')'));
		}
	}

	static {
		anInt3147 = 0;
		anIntArray3151 = new int[4096];
	}
}
