package io;

import io.cache.Cache;
import io.cache.Revision;

final class ContextMenus extends TextureOperation {
	static int anInt6575;
	static MultilingualString aClass67_6576 = new MultilingualString("glow3:", "leuchten3:", "brillant3:", "brilho3:");
	static int anInt6577;
	static int anInt6578;
	static int anInt6579;
	static boolean context_menu_open = false;
	static int anInt6581;
	private int anInt6582 = 32768;
	static int anInt6583;
	static IncomingPacket INDEX_14_SOUND_IN;
	static int anInt6585;
	static float aFloat6586;
	static OverlayLoader overlay_loader;

	final int[] method2135(int i, int i_0_) {
		try {
			anInt6581++;
			int[] is = ((TextureOperation) this).aClass66_4938.method435((byte) -112, i_0_);
			int i_1_ = 42 % ((i - 67) / 50);
			if (((Class66) ((TextureOperation) this).aClass66_4938).aBool887) {
				int[] is_2_ = this.method2133(i_0_, 1, 0);
				int[] is_3_ = this.method2133(i_0_, 2, 0);
				for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_4_++) {
					int i_5_ = (0xff1 & is_2_[i_4_]) >> 4;
					int i_6_ = is_3_[i_4_] * anInt6582 >> 12;
					int i_7_ = (StructType.anIntArray6855[i_5_] * i_6_ >> 12);
					int i_8_ = i_6_ * Class149.anIntArray2191[i_5_] >> 12;
					int i_9_ = i_4_ + (i_7_ >> 12) & Class63_Sub1.anInt4719;
					int i_10_ = Class113.anInt1594 & (i_8_ >> 12) + i_0_;
					int[] is_11_ = this.method2133(i_10_, 0, 0);
					is[i_4_] = is_11_[i_9_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lu.E(" + i + ',' + i_0_ + ')');
		}
	}

	final void method2143(int i, int i_12_, Buffer stream) {
		try {
			int i_13_ = i_12_;
			do {
				if ((i_13_ ^ 0xffffffff) != -1) {
					if ((i_13_ ^ 0xffffffff) != -2)
						break;
				} else {
					anInt6582 = stream.readUnsignedShort() << 4;
					break;
				}
				((TextureOperation) this).aBool4947 = stream.readUnsignedByte() == 1;
			} while (false);
			if (i != 4)
				method2139((byte) 85, -90);
			anInt6577++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("lu.G(" + i + ',' + i_12_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public ContextMenus() {
		super(3, false);
	}

	static final boolean method2706(int i, int i_14_, int i_15_, int i_16_, int i_17_, CollisionMap class199, int i_18_,
			int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		try {
			anInt6575++;
			int i_24_ = i_17_;
			int i_25_ = i_19_;
			if (i != -1)
				aClass67_6576 = null;
			int i_26_ = 64;
			int i_27_ = 64;
			int i_28_ = i_17_ - i_26_;
			int i_29_ = i_19_ + -i_27_;
			IterableNodeHashTable.anIntArrayArray1119[i_26_][i_27_] = 99;
			Class7.anIntArrayArray94[i_26_][i_27_] = 0;
			int i_30_ = 0;
			int i_31_ = 0;
			Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_;
			Class246_Sub39.anIntArray5489[i_30_++] = i_25_;
			int[][] is = ((CollisionMap) class199).anIntArrayArray2829;
			while_109_: while (i_30_ != i_31_) {
				i_24_ = Class246_Sub28_Sub9.anIntArray6148[i_31_];
				i_25_ = Class246_Sub39.anIntArray5489[i_31_];
				i_27_ = i_25_ - i_29_;
				i_26_ = -i_28_ + i_24_;
				i_31_ = i_31_ + 1 & 0xfff;
				int i_32_ = i_24_ + -((CollisionMap) class199).anInt2836;
				int i_33_ = i_25_ + -((CollisionMap) class199).anInt2841;
				int i_34_ = i_23_;
				while_101_: do {
					while_100_: do {
						while_99_: do {
							while_98_: do {
								do {
									if ((i_34_ ^ 0xffffffff) != 3) {
										if (i_34_ != -3) {
											if ((i_34_ ^ 0xffffffff) != 1) {
												if ((i_34_ ^ 0xffffffff) != 0) {
													if (i_34_ == 0 || (i_34_ ^ 0xffffffff) == -2 || i_34_ == 2
															|| (i_34_ ^ 0xffffffff) == -4 || i_34_ == 9)
														break while_99_;
													break while_100_;
												}
											} else
												break;
											break while_98_;
										}
									} else {
										if (((i_24_ ^ 0xffffffff) == (i_14_ ^ 0xffffffff)) && i_25_ == i_18_) {
											Class55.anInt785 = i_25_;
											Class246_Sub28_Sub32.anInt6925 = i_24_;
											return true;
										}
										break while_101_;
									}
									if (SceneGraph.method1746(i_21_, i_18_, i_21_, i_15_, i_20_, i_25_, i_24_, i_14_,
											(byte) 119)) {
										Class246_Sub28_Sub32.anInt6925 = i_24_;
										Class55.anInt785 = i_25_;
										return true;
									}
									break while_101_;
								} while (false);
								if (class199.method1317(i_14_, i + 1, i_21_, i_15_, i_24_, i_16_, i_18_, i_25_, i_20_,
										i_21_)) {
									Class246_Sub28_Sub32.anInt6925 = i_24_;
									Class55.anInt785 = i_25_;
									return true;
								}
								break while_101_;
							} while (false);
							if (class199.method1313(i_20_, i_21_, i_14_, i_16_, i_15_, i_18_, i_24_, i ^ ~0x7c,
									i_25_)) {
								Class55.anInt785 = i_25_;
								Class246_Sub28_Sub32.anInt6925 = i_24_;
								return true;
							}
							break while_101_;
						} while (false);
						if (class199.method1315(i_25_, i_22_, i_18_, i_21_, i_24_, false, i_14_, i_23_)) {
							Class55.anInt785 = i_25_;
							Class246_Sub28_Sub32.anInt6925 = i_24_;
							return true;
						}
						break while_101_;
					} while (false);
					if (class199.method1322(i_22_, i_24_, false, i_23_, i_14_, i_25_, i_18_, i_21_)) {
						Class246_Sub28_Sub32.anInt6925 = i_24_;
						Class55.anInt785 = i_25_;
						return true;
					}
				} while (false);
				i_34_ = Class7.anIntArrayArray94[i_26_][i_27_] + 1;
				while_102_: do {
					if (i_26_ > 0 && (IterableNodeHashTable.anIntArrayArray1119[i_26_ - 1][i_27_] ^ 0xffffffff) == -1
							&& (0x43a40000 & is[i_32_ - 1][i_33_]) == 0
							&& (0x4e240000 & is[i_32_ - 1][-1 + i_33_ + i_21_] ^ 0xffffffff) == -1) {
						for (int i_35_ = 1; i_35_ < i_21_ - 1; i_35_++) {
							if ((is[-1 + i_32_][i_33_ - -i_35_] & 0x4fa40000) != 0)
								break while_102_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_ - 1;
						Class246_Sub39.anIntArray5489[i_30_] = i_25_;
						IterableNodeHashTable.anIntArrayArray1119[i_26_ - 1][i_27_] = 2;
						i_30_ = 1 + i_30_ & 0xfff;
						Class7.anIntArrayArray94[i_26_ - 1][i_27_] = i_34_;
					}
				} while (false);
				while_103_: do {
					if (i_26_ < -i_21_ + 128 && IterableNodeHashTable.anIntArrayArray1119[i_26_ + 1][i_27_] == 0
							&& (is[i_32_ + i_21_][i_33_] & 0x60e40000) == 0
							&& ((is[i_21_ + i_32_][i_33_ - (-i_21_ + 1)] & 0x78240000) ^ 0xffffffff) == -1) {
						for (int i_36_ = 1; i_36_ < i_21_ - 1; i_36_++) {
							if ((is[i_32_ - -i_21_][i_36_ + i_33_] & 0x78e40000) != 0)
								break while_103_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_ + 1;
						Class246_Sub39.anIntArray5489[i_30_] = i_25_;
						IterableNodeHashTable.anIntArrayArray1119[1 + i_26_][i_27_] = 8;
						i_30_ = 0xfff & i_30_ + 1;
						Class7.anIntArrayArray94[1 + i_26_][i_27_] = i_34_;
					}
				} while (false);
				while_104_: do {
					if ((i_27_ ^ 0xffffffff) < -1
							&& (IterableNodeHashTable.anIntArrayArray1119[i_26_][-1 + i_27_] ^ 0xffffffff) == -1
							&& (is[i_32_][i_33_ - 1] & 0x43a40000) == 0
							&& ((0x60e40000 & is[-1 + (i_21_ + i_32_)][-1 + i_33_]) == 0)) {
						for (int i_37_ = 1; i_21_ - 1 > i_37_; i_37_++) {
							if ((0x63e40000 & is[i_37_ + i_32_][i_33_ - 1]) != 0)
								break while_104_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_;
						Class246_Sub39.anIntArray5489[i_30_] = i_25_ - 1;
						IterableNodeHashTable.anIntArrayArray1119[i_26_][-1 + i_27_] = 1;
						i_30_ = 1 + i_30_ & 0xfff;
						Class7.anIntArrayArray94[i_26_][i_27_ - 1] = i_34_;
					}
				} while (false);
				while_105_: do {
					if ((i_27_ ^ 0xffffffff) > (-i_21_ + 128 ^ 0xffffffff)
							&& IterableNodeHashTable.anIntArrayArray1119[i_26_][i_27_ + 1] == 0
							&& (is[i_32_][i_33_ + i_21_] & 0x4e240000) == 0
							&& (is[i_32_ + i_21_ - 1][i_33_ + i_21_] & 0x78240000 ^ 0xffffffff) == -1) {
						for (int i_38_ = 1; i_21_ - 1 > i_38_; i_38_++) {
							if ((0x7e240000 & is[i_38_ + i_32_][i_21_ + i_33_] ^ 0xffffffff) != -1)
								break while_105_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_;
						Class246_Sub39.anIntArray5489[i_30_] = i_25_ + 1;
						IterableNodeHashTable.anIntArrayArray1119[i_26_][i_27_ + 1] = 4;
						i_30_ = 0xfff & i_30_ + 1;
						Class7.anIntArrayArray94[i_26_][1 + i_27_] = i_34_;
					}
				} while (false);
				while_106_: do {
					if ((i_26_ ^ 0xffffffff) < -1 && (i_27_ ^ 0xffffffff) < -1
							&& (IterableNodeHashTable.anIntArrayArray1119[-1 + i_26_][i_27_ - 1] == 0)
							&& (is[i_32_ - 1][i_33_ - 1] & 0x43a40000 ^ 0xffffffff) == -1) {
						for (int i_39_ = 1; i_21_ > i_39_; i_39_++) {
							if ((0x4fa40000 & is[-1 + i_32_][i_33_ - 1 - -i_39_]) != 0
									|| (is[i_32_ - 1 - -i_39_][i_33_ - 1] & 0x63e40000) != 0)
								break while_106_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = -1 + i_24_;
						Class246_Sub39.anIntArray5489[i_30_] = i_25_ - 1;
						IterableNodeHashTable.anIntArrayArray1119[-1 + i_26_][-1 + i_27_] = 3;
						i_30_ = 0xfff & i_30_ + 1;
						Class7.anIntArrayArray94[i_26_ - 1][-1 + i_27_] = i_34_;
					}
				} while (false);
				while_107_: do {
					if ((i_26_ ^ 0xffffffff) > (-i_21_ + 128 ^ 0xffffffff) && (i_27_ ^ 0xffffffff) < -1
							&& (IterableNodeHashTable.anIntArrayArray1119[i_26_ + 1][-1 + i_27_] == 0)
							&& (is[i_32_ - -i_21_][i_33_ - 1] & 0x60e40000 ^ 0xffffffff) == -1) {
						for (int i_40_ = 1; i_21_ > i_40_; i_40_++) {
							if ((is[i_32_ - -i_21_][i_40_ + (-1 + i_33_)] & 0x78e40000) != 0
									|| (is[i_32_ - -i_40_][-1 + i_33_] & 0x63e40000) != 0)
								break while_107_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_ + 1;
						Class246_Sub39.anIntArray5489[i_30_] = -1 + i_25_;
						i_30_ = 0xfff & 1 + i_30_;
						IterableNodeHashTable.anIntArrayArray1119[i_26_ + 1][-1 + i_27_] = 9;
						Class7.anIntArrayArray94[1 + i_26_][-1 + i_27_] = i_34_;
					}
				} while (false);
				while_108_: do {
					if ((i_26_ ^ 0xffffffff) < -1 && -i_21_ + 128 > i_27_
							&& (IterableNodeHashTable.anIntArrayArray1119[-1 + i_26_][i_27_ + 1] ^ 0xffffffff) == -1
							&& (0x4e240000 & is[i_32_ - 1][i_33_ - -i_21_]) == 0) {
						for (int i_41_ = 1; (i_21_ ^ 0xffffffff) < (i_41_ ^ 0xffffffff); i_41_++) {
							if ((0x4fa40000 & is[-1 + i_32_][i_33_ + i_41_] ^ 0xffffffff) != -1
									|| ((0x7e240000 & is[-1 + i_32_ - -i_41_][i_21_ + i_33_]) != 0))
								break while_108_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_ - 1;
						Class246_Sub39.anIntArray5489[i_30_] = 1 + i_25_;
						i_30_ = i_30_ + 1 & 0xfff;
						IterableNodeHashTable.anIntArrayArray1119[i_26_ - 1][i_27_ + 1] = 6;
						Class7.anIntArrayArray94[-1 + i_26_][i_27_ + 1] = i_34_;
					}
				} while (false);
				if (-i_21_ + 128 > i_26_ && -i_21_ + 128 > i_27_
						&& (IterableNodeHashTable.anIntArrayArray1119[1 + i_26_][1 + i_27_] ^ 0xffffffff) == -1
						&& (is[i_21_ + i_32_][i_21_ + i_33_] & 0x78240000) == 0) {
					for (int i_42_ = 1; (i_42_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_42_++) {
						if (((0x7e240000 & is[i_42_ + i_32_][i_21_ + i_33_]) != 0)
								|| (is[i_21_ + i_32_][i_33_ - -i_42_] & 0x78e40000) != 0)
							continue while_109_;
					}
					Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_ + 1;
					Class246_Sub39.anIntArray5489[i_30_] = 1 + i_25_;
					IterableNodeHashTable.anIntArrayArray1119[1 + i_26_][1 + i_27_] = 12;
					i_30_ = 0xfff & i_30_ + 1;
					Class7.anIntArrayArray94[1 + i_26_][1 + i_27_] = i_34_;
				}
			}
			Class246_Sub28_Sub32.anInt6925 = i_24_;
			Class55.anInt785 = i_25_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("lu.C(" + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ','
							+ (class199 != null ? "{...}" : "null") + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ','
							+ i_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	final void method2134(boolean bool) {
		try {
			if (bool == false) {
				anInt6578++;
				HashMap.method376(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lu.F(" + bool + ')');
		}
	}

	public static void method2707(int i) {
		do {
			try {
				aClass67_6576 = null;
				INDEX_14_SOUND_IN = null;
				overlay_loader = null;
				if (i == 1675886592)
					break;
				context_menu_open = false;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lu.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2708(byte i) {
		try {
			anInt6585++;
			Widget.custom_pre_eoc_550_sprite_cache.method383(75);
			Widget.pre_eoc_550_sprite_cache.method383(75);
			Widget.osrs_widget_sprite_cache.method383(75);
			Widget.pre_eoc_634_sprite_cache.method383(75);
			Class_ls.aClass54_963.method383(99);
			Class216.font_cache.method383(119);
			Class216.font_cache_550.method383(119);
			Class216.osrs_font_cache.method383(119);
			Class29.aClass54_387.method383(107);
			if (i <= 7)
				method2707(49);
			Class84.aClass54_1097.method383(91);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lu.A(" + i + ')');
		}
	}

	final int[][] method2139(byte i, int i_43_) {
		try {
			anInt6579++;
			int[][] is = ((TextureOperation) this).aClass136_4933.method922((byte) 126, i_43_);
			if (((Class136) ((TextureOperation) this).aClass136_4933).aBool1946) {
				int[] is_44_ = this.method2133(i_43_, 1, 0);
				int[] is_45_ = this.method2133(i_43_, 2, 0);
				int[] is_46_ = is[0];
				int[] is_47_ = is[1];
				int[] is_48_ = is[2];
				for (int i_49_ = 0; ((i_49_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_49_++) {
					int i_50_ = 0xff & is_44_[i_49_] * 255 >> 12;
					int i_51_ = anInt6582 * is_45_[i_49_] >> 12;
					int i_52_ = (StructType.anIntArray6855[i_50_] * i_51_ >> 12);
					int i_53_ = Class149.anIntArray2191[i_50_] * i_51_ >> 12;
					int i_54_ = Class63_Sub1.anInt4719 & i_49_ + (i_52_ >> 12);
					int i_55_ = Class113.anInt1594 & i_43_ + (i_53_ >> 12);
					int[][] is_56_ = this.method2141(3, 0, i_55_);
					is_46_[i_49_] = is_56_[0][i_54_];
					is_47_[i_49_] = is_56_[1][i_54_];
					is_48_[i_49_] = is_56_[2][i_54_];
				}
			}
			if (i < 33)
				method2706(5, -16, -89, 35, 67, null, 31, 94, -60, -10, -34, 98);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lu.J(" + i + ',' + i_43_ + ')');
		}
	}

	static final void draw_context_menu(SceneGraph class260) {
		try {
			Stream_Sub2.anInt6183++;
			if (Settings.osrs_context_menus)
				draw_osrs_context_menu((byte) -76, class260);
			else
				draw_context_menu(class260, 3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static final void draw_context_menu(SceneGraph class260, int i) {
		try {
			int i_5_ = SwitchInt.anInt5082;
			int i_6_ = VarpType.anInt1226;
			int i_7_ = Class94.anInt1233;
			int i_8_ = Class246_Sub13.context_menu_height;
			int i_9_ = 20;
			if (Class246_Sub1_Sub3.aClass_l5707 == null || Class246_Sub41.aClass_l5535 == null) {
				if (!Cache.get_index(Revision.PRE_EOC_634, "sprites").method112(-1, 2026)
						|| !Cache.get_index(Revision.PRE_EOC_634, "sprites").method112(i - 4, 2027))
					class260.O(i_5_, i_6_, i_7_, i_9_, (2828060 | 255 + -Class_ss.anInt7054 << 24), 1);
				else {
					Class246_Sub1_Sub3.aClass_l5707 = (class260.ld_to_abstract_sprite(
							LDSprite.get_sprite(Cache.get_index(Revision.PRE_EOC_634, "sprites"), 2026, 0), true));
					LDSprite class10 = LDSprite.get_sprite(Cache.get_index(Revision.PRE_EOC_634, "sprites"), 2027, 0);
					Class246_Sub41.aClass_l5535 = class260.ld_to_abstract_sprite(class10, true);
					class10.method118();
					Class160.aClass_l2266 = class260.ld_to_abstract_sprite(class10, true);
				}
			}
			if (Class246_Sub1_Sub3.aClass_l5707 != null && Class246_Sub41.aClass_l5535 != null) {
				int i_10_ = ((-(Class246_Sub41.aClass_l5535.la() * 2) + i_7_) / Class246_Sub1_Sub3.aClass_l5707.la());
				for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++)
					Class246_Sub1_Sub3.aClass_l5707.draw_sprite(
							(i_5_ + Class246_Sub41.aClass_l5535.la() + Class246_Sub1_Sub3.aClass_l5707.la() * i_11_),
							i_6_);
				Class246_Sub41.aClass_l5535.draw_sprite(i_5_, i_6_);
				Class160.aClass_l2266.draw_sprite(i_5_ + i_7_ - Class160.aClass_l2266.la(), i_6_);
			}
			FontCache.bold_font.draw_text(-1, 13023381 | ~0xffffff,
					Class219.aClass67_3039.get(Preferences.language_code), i + i_5_, 14 + i_6_, 0);
			class260.O(i_5_, i_9_ + i_6_, i_7_, i_8_ - i_9_, 2828060 | 255 - Class_ss.anInt7054 << 24, 1);
			int mouse_x = Material.aClass102_3360.method640((byte) 58);
			int mouse_y = Material.aClass102_3360.method636(3045);
			int i_14_ = 0;
			for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Varbit.aClass166_1525.method1104(
					i + 46)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Varbit.aClass166_1525
							.method1108((byte) -112))) {
				int i_15_ = ((-i_14_ + (-1 + Class230.anInt3147)) * 16 + 13 + (i_9_ + i_6_));
				i_14_++;
				if ((i_5_ ^ 0xffffffff) > (mouse_x ^ 0xffffffff) && (i_5_ + i_7_ ^ 0xffffffff) < (mouse_x ^ 0xffffffff)
						&& (-13 + i_15_ ^ 0xffffffff) > (mouse_y ^ 0xffffffff) && mouse_y < 4 + i_15_
						&& ((Class246_Sub35) class246_sub35).aBool5153)
					class260.O(i_5_, i_15_ - 12, i_7_, 16, (255 - Class68.anInt905 << 24 | 7301469), 1);
			}
			if ((Class246_Sub28_Sub23.aClass_l6656 == null || Class205.aClass_l2885 == null
					|| VarcLoader.aClass_l993 == null)
					&& Cache.get_index(Revision.PRE_EOC_634, "sprites").method112(-1, 2029)
					&& Cache.get_index(Revision.PRE_EOC_634, "sprites").method112(-1, 2028)
					&& Cache.get_index(Revision.PRE_EOC_634, "sprites").method112(-1, 2030)) {
				LDSprite class10 = LDSprite.get_sprite(Cache.get_index(Revision.PRE_EOC_634, "sprites"), 2028, 0);
				Class205.aClass_l2885 = class260.ld_to_abstract_sprite(class10, true);
				class10.method118();
				Class246_Sub37_Sub1.aClass_l5943 = class260.ld_to_abstract_sprite(class10, true);
				Class246_Sub28_Sub23.aClass_l6656 = (class260.ld_to_abstract_sprite(
						LDSprite.get_sprite(Cache.get_index(Revision.PRE_EOC_634, "sprites"), 2029, 0), true));
				LDSprite class10_16_ = LDSprite.get_sprite(Cache.get_index(Revision.PRE_EOC_634, "sprites"), 2030, 0);
				VarcLoader.aClass_l993 = class260.ld_to_abstract_sprite(class10_16_, true);
				class10_16_.method118();
				Class69.aClass_l907 = class260.ld_to_abstract_sprite(class10_16_, true);
			}
			if (Class246_Sub28_Sub23.aClass_l6656 != null && Class205.aClass_l2885 != null
					&& VarcLoader.aClass_l993 != null) {
				int i_17_ = ((-(VarcLoader.aClass_l993.la() * 2) + i_7_) / Class246_Sub28_Sub23.aClass_l6656.la());
				for (int i_18_ = 0; i_17_ > i_18_; i_18_++)
					Class246_Sub28_Sub23.aClass_l6656.draw_sprite(
							(VarcLoader.aClass_l993.la() + i_5_ - -(i_18_ * Class246_Sub28_Sub23.aClass_l6656.la())),
							i_8_ + (i_6_ + -Class246_Sub28_Sub23.aClass_l6656.ma()));
				int i_19_ = ((-VarcLoader.aClass_l993.ma() + (-i_9_ + i_8_)) / Class205.aClass_l2885.ma());
				for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
					Class205.aClass_l2885.draw_sprite(i_5_, (i_9_ + i_6_ - -(Class205.aClass_l2885.ma() * i_20_)));
					Class246_Sub37_Sub1.aClass_l5943.draw_sprite(-Class246_Sub37_Sub1.aClass_l5943.la() + (i_7_ + i_5_),
							i_6_ - (-i_9_ + -(Class205.aClass_l2885.ma() * i_20_)));
				}
				VarcLoader.aClass_l993.draw_sprite(i_5_, i_8_ + i_6_ - VarcLoader.aClass_l993.ma());
				Class69.aClass_l907.draw_sprite(i_7_ + (i_5_ + -VarcLoader.aClass_l993.la()),
						i_6_ + (i_8_ - VarcLoader.aClass_l993.ma()));
			}
			i_14_ = 0;
			for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Varbit.aClass166_1525.method1104(
					i + 76)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Varbit.aClass166_1525
							.method1108((byte) -112))) {
				int i_21_ = (i_6_ + i_9_ + (13 + (-1 + (Class230.anInt3147 + -i_14_)) * 16));
				int i_22_ = ~0xffffff | 13023381;
				if (i_5_ < mouse_x && (i_7_ + i_5_ ^ 0xffffffff) < (mouse_x ^ 0xffffffff)
						&& (mouse_y ^ 0xffffffff) < (i_21_ - 13 ^ 0xffffffff) && 4 + i_21_ > mouse_y
						&& ((Class246_Sub35) class246_sub35).aBool5153)
					i_22_ = ~0xffffff | 15656390;
				int[] is = null;
				if (Class252.method1619((((Class246_Sub35) class246_sub35).anInt5156), i ^ 0x3))
					is = ((ObjType) (MapRegion.aClass191_3663.list(22883,
							(int) (((Class246_Sub35) class246_sub35).aLong5157)))).anIntArray2772;
				else if ((((Class246_Sub35) class246_sub35).anInt5148 ^ 0xffffffff) == 0) {
					if (!Class246_Sub28_Sub27.method2767((((Class246_Sub35) class246_sub35).anInt5156), (byte) 78)) {
						if (StructLoader.method390(i ^ ~0x79, ((Class246_Sub35) class246_sub35).anInt5156)) {
							Object object = null;
							LocType class185;
							if (((Class246_Sub35) class246_sub35).anInt5156 != 1010)
								class185 = (Class143.aClass251_2067.list(
										(int) (0x7fffffffL & (((Class246_Sub35) class246_sub35).aLong5157) >>> 32), 0));
							else
								class185 = (Class143.aClass251_2067
										.list((int) ((Class246_Sub35) class246_sub35).aLong5157, 0));
							if (((LocType) class185).f_bb != null)
								class185 = class185.method1205((Varbit.aClass95_6658), (byte) 115);
							if (class185 != null)
								is = ((LocType) class185).f_nb;
						}
					} else {
						Npc class_r_sub2 = (VarcLoader.aClass_r_Sub2Array1002[(int) (((Class246_Sub35) class246_sub35).aLong5157)]);
						if (class_r_sub2 != null) {
							NpcType class253 = ((Npc) class_r_sub2).aClass253_7184;
							if (((NpcType) class253).childrenIDs != null)
								class253 = class253.method1624(false, (Varbit.aClass95_6658));
							if (class253 != null)
								is = ((NpcType) class253).f_ob;
						}
					}
				} else
					is = ((ObjType) (MapRegion.aClass191_3663.list(22883,
							(((Class246_Sub35) class246_sub35).anInt5148)))).anIntArray2772;
				String string = Class246_Sub41_Sub2.method2678(-104, class246_sub35);
				if (is != null)
					string += Class247.method1581(is, 124);
				FontCache.bold_font.draw_unshadowed_string((byte) -101, Class21_Sub4.anIntArray4924, 0,
						Class106_Sub2.aClass_lArray5340, i_22_, string, i_5_ + 3, i_21_);
				i_14_++;
				if (((Class246_Sub35) class246_sub35).aBool5147)
					Class246_Sub28_Sub32.aClass_l6928
							.draw_sprite((CacheIndex.aClass73_148.method459(-1, string) + 5 + i_5_), -12 + i_21_);
			}
			VarcType.method1449(Class94.anInt1233, Class246_Sub13.context_menu_height, VarpType.anInt1226, 0,
					SwitchInt.anInt5082);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"pj.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void draw_osrs_context_menu(byte i, SceneGraph class260) {
		try {
			Class210_Sub2.anInt5019++;
			int i_188_ = SwitchInt.anInt5082;
			int i_189_ = VarpType.anInt1226;
			int i_190_ = Class94.anInt1233;
			int i_191_ = Class246_Sub13.context_menu_height;
			int i_192_ = -10660793;
			class260.method1734(i_188_, i_190_, i_189_, (byte) 58, i_192_, i_191_);
			class260.method1734(1 + i_188_, i_190_ - 2, i_189_ + 1, (byte) 58, -16777216, 16);
			class260.method1736(i_188_ + 1, -16777216, -19 + i_191_, 8, i_190_ - 2, 18 + i_189_);
			FontCache.bold_font.draw_text(-1, i_192_, Class219.aClass67_3039.get(Preferences.language_code), 3 + i_188_,
					i_189_ + 14, 0);
			if (i != -76)
				Class210_Sub2.anInt5022 = -97;
			int i_193_ = Material.aClass102_3360.method640((byte) 58);
			int i_194_ = Material.aClass102_3360.method636(3045);
			int i_195_ = 0;
			for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Varbit.aClass166_1525.method1104(
					i ^ ~0x17)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Varbit.aClass166_1525
							.method1108((byte) -112))) {
				int i_196_ = (-1 + (Class230.anInt3147 + -i_195_)) * 16 + 31 + i_189_;
				int i_197_ = -1;
				if ((i_188_ ^ 0xffffffff) > (i_193_ ^ 0xffffffff)
						&& (i_188_ - -i_190_ ^ 0xffffffff) < (i_193_ ^ 0xffffffff)
						&& (i_194_ ^ 0xffffffff) < (i_196_ - 13 ^ 0xffffffff)
						&& (i_196_ + 3 ^ 0xffffffff) < (i_194_ ^ 0xffffffff)
						&& ((Class246_Sub35) class246_sub35).aBool5153)
					i_197_ = -256;
				int[] is = null;
				if (!Class252.method1619((((Class246_Sub35) class246_sub35).anInt5156), 0)) {
					if ((((Class246_Sub35) class246_sub35).anInt5148 ^ 0xffffffff) == 0) {
						if (!Class246_Sub28_Sub27.method2767((((Class246_Sub35) class246_sub35).anInt5156),
								(byte) -117)) {
							if (StructLoader.method390(-99, (((Class246_Sub35) class246_sub35).anInt5156))) {
								Object object = null;
								LocType class185;
								if (((Class246_Sub35) class246_sub35).anInt5156 != 1010)
									class185 = (Class143.aClass251_2067.list(
											(int) (0x7fffffffL & (((Class246_Sub35) class246_sub35).aLong5157) >>> 32),
											0));
								else
									class185 = (Class143.aClass251_2067
											.list((int) ((Class246_Sub35) class246_sub35).aLong5157, 0));
								if (((LocType) class185).f_bb != null)
									class185 = (class185.method1205(Varbit.aClass95_6658, (byte) -16));
								if (class185 != null)
									is = ((LocType) class185).f_nb;
							}
						} else {
							Npc class_r_sub2 = (VarcLoader.aClass_r_Sub2Array1002[(int) (((Class246_Sub35) class246_sub35).aLong5157)]);
							if (class_r_sub2 != null) {
								NpcType class253 = (((Npc) class_r_sub2).aClass253_7184);
								if (((NpcType) class253).childrenIDs != null)
									class253 = (class253.method1624(false, (Varbit.aClass95_6658)));
								if (class253 != null)
									is = ((NpcType) class253).f_ob;
							}
						}
					} else
						is = ((ObjType) (MapRegion.aClass191_3663.list(22883,
								(((Class246_Sub35) class246_sub35).anInt5148)))).anIntArray2772;
				} else
					is = ((ObjType) (MapRegion.aClass191_3663.list(22883,
							(int) (((Class246_Sub35) class246_sub35).aLong5157)))).anIntArray2772;
				String string = Class246_Sub41_Sub2.method2678(i + 12, class246_sub35);
				if (is != null)
					string += Class247.method1581(is, 126);
				FontCache.bold_font.draw_unshadowed_string((byte) -101, Class21_Sub4.anIntArray4924, 0,
						Class106_Sub2.aClass_lArray5340, ~0xfffffff, string.replaceAll("(?s)<col=.*?>", ""), i_188_ + 4,
						i_196_ + 1);
				FontCache.bold_font.draw_unshadowed_string((byte) -101, Class21_Sub4.anIntArray4924, 0,
						Class106_Sub2.aClass_lArray5340, i_197_, string, i_188_ + 3, i_196_);
				i_195_++;
				if (((Class246_Sub35) class246_sub35).aBool5147)
					Class246_Sub28_Sub32.aClass_l6928
							.draw_sprite((CacheIndex.aClass73_148.method459(-1, string) + i_188_ + 5), -12 + i_196_);
			}
			VarcType.method1449(Class94.anInt1233, Class246_Sub13.context_menu_height, VarpType.anInt1226, 0,
					SwitchInt.anInt5082);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("oq.K(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2709(int i, byte i_57_) {
		try {
			anInt6583++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 118, 14);
			if (i_57_ == -5)
				class246_sub1_sub10.method2604((byte) -118);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lu.B(" + i + ',' + i_57_ + ')');
		}
	}

	static {
		new MultilingualString(" left the channel.", " hat den Chatraum verlassen.", " a quitt\u00e9 le canal.",
				" deixou o canal.");
		INDEX_14_SOUND_IN = new IncomingPacket(19, 6);
		new MultilingualString("Your friendlist is full, max of 100 for free users, and 200 for members.",
				"Ihre Freunde-Liste ist voll!",
				"Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonn\u00e9s).",
				"Sua lista de amigos est\u00e1 cheia. O limite \u00e9 100 para usu\u00e1rios n\u00e3o pagantes, e 200 para membros.");
	}
}
