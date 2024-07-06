package io;

final class Class246_Sub28_Sub7 extends TextureOperation {
	static int anInt6047;
	static int anInt6048;
	static int anInt6049;
	static int anInt6050;
	private Class21[] aClass21Array6051;
	static int anInt6052;
	static int anInt6053;
	static int anInt6054;
	static int anInt6055;

	final int[][] method2139(byte i, int i_0_) {
		try {
			anInt6055++;
			int[][] is = ((TextureOperation) this).aClass136_4933.method922((byte) -121, i_0_);
			if (i < 33)
				aClass21Array6051 = null;
			if (((Class136) ((TextureOperation) this).aClass136_4933).aBool1946) {
				int i_1_ = Class246_Sub37_Sub1.f_gb;
				int i_2_ = EnumLoader.anInt2044;
				int[][] is_3_ = new int[i_2_][i_1_];
				int[][][] is_4_ = ((TextureOperation) this).aClass136_4933.method923((byte) 112);
				method2555(is_3_, (byte) 2);
				for (int i_5_ = 0; EnumLoader.anInt2044 > i_5_; i_5_++) {
					int[] is_6_ = is_3_[i_5_];
					int[][] is_7_ = is_4_[i_5_];
					int[] is_8_ = is_7_[0];
					int[] is_9_ = is_7_[1];
					int[] is_10_ = is_7_[2];
					for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_11_++) {
						int i_12_ = is_6_[i_11_];
						is_10_[i_11_] = PacketsDecoder.method184(255, i_12_) << 4;
						is_9_[i_11_] = PacketsDecoder.method184(65280, i_12_) >> 4;
						is_8_[i_11_] = PacketsDecoder.method184(16711680, i_12_) >> 12;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "er.J(" + i + ',' + i_0_ + ')');
		}
	}

	final int[] method2135(int i, int i_13_) {
		try {
			anInt6052++;
			int[] is = ((TextureOperation) this).aClass66_4938.method435((byte) -112, i_13_);
			int i_14_ = 22 / ((67 - i) / 50);
			if (((Class66) ((TextureOperation) this).aClass66_4938).aBool887)
				method2555(((TextureOperation) this).aClass66_4938.method433(10), (byte) 2);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "er.E(" + i + ',' + i_13_ + ')');
		}
	}

	private final void method2555(int[][] is, byte i) {
		do {
			try {
				anInt6054++;
				if (i == 2) {
					int i_15_ = Class246_Sub37_Sub1.f_gb;
					int i_16_ = EnumLoader.anInt2044;
					Class188.method1234(is, (byte) 85);
					Class259.method1676(0, Class63_Sub1.anInt4719, (byte) -65, Class113.anInt1594, 0);
					if (aClass21Array6051 == null)
						break;
					for (int i_17_ = 0; ((aClass21Array6051.length ^ 0xffffffff) < (i_17_ ^ 0xffffffff)); i_17_++) {
						Class21 class21 = aClass21Array6051[i_17_];
						int i_18_ = ((Class21) class21).anInt321;
						int i_19_ = ((Class21) class21).anInt317;
						if ((i_18_ ^ 0xffffffff) > -1) {
							if ((i_19_ ^ 0xffffffff) <= -1)
								class21.method195(24245, i_16_, i_15_);
						} else if ((i_19_ ^ 0xffffffff) <= -1)
							class21.method196(-125, i_16_, i_15_);
						else
							class21.method199(i_16_, 4, i_15_);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("er.H(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method2556(CacheIndex class_fs, CacheIndex class_fs2, boolean bool, SceneGraph class260) {
		try {
			anInt6049++;
			LDSprite[] sprites = LDSprite.method129(class_fs, Class59_Sub4.anInt5187, 0);
			Class191.hit_mark_sprites_592 = new AbstractSprite[sprites.length];
			Class191.hit_mark_sprites_osrs = new AbstractSprite[6];
			Class246_Sub28_Sub12.osrs_hit_bars = new AbstractSprite[2];

			if (bool == false) {
				for (int i = 0; i < sprites.length; i++) {
					Class191.hit_mark_sprites_592[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				}
				for (int i = 0; i < 6; i++) {
					Class191.hit_mark_sprites_osrs[i] = class260
							.ld_to_abstract_sprite(LDSprite.method129(class_fs2, 1358 + i, 0)[0], true);
				}
				sprites = LDSprite.method129(class_fs2, 317, 0);
				Class191.osrs_mapscenes = new AbstractSprite[sprites.length];
				for (int i = 0; i < sprites.length; i++) {
					Class191.osrs_mapscenes[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				}
				sprites = LDSprite.method129(class_fs2, Class_c_Sub1.osrs_red_hit_bar, 0);
				Class246_Sub28_Sub12.osrs_hit_bars[0] = class260.ld_to_abstract_sprite(sprites[0], true);
				sprites = LDSprite.method129(class_fs2, Class_c_Sub1.osrs_green_hit_bar, 0);
				Class246_Sub28_Sub12.osrs_hit_bars[1] = class260.ld_to_abstract_sprite(sprites[0], true);
				sprites = LDSprite.method129(class_fs, Class_c_Sub1.new_hit_bars, 0);
				Class246_Sub28_Sub12.new_hit_bars = new AbstractSprite[sprites.length];
				for (int i = 0; sprites.length > i; i++)
					Class246_Sub28_Sub12.new_hit_bars[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				sprites = LDSprite.method129(class_fs, Class43.anInt636, 0);
				Class233.aClass_lArray3188 = new AbstractSprite[sprites.length];
				for (int i = 0; i < sprites.length; i++)
					Class233.aClass_lArray3188[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				sprites = LDSprite.method129(class_fs, Class130_Sub1_Sub1.anInt7045, 0);
				Class98.aClass_lArray1279 = new AbstractSprite[sprites.length];
				for (int i = 0; (i ^ 0xffffffff) > (sprites.length ^ 0xffffffff); i++)
					Class98.aClass_lArray1279[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				sprites = LDSprite.method129(class_fs, Class259_Sub1.anInt4506, 0);
				Class58.aClass_lArray814 = new AbstractSprite[sprites.length];
				for (int i = 0; sprites.length > i; i++)
					Class58.aClass_lArray814[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				sprites = LDSprite.method129(class_fs, Class246_Sub1_Sub8_Sub1.anInt7159, 0);
				Class_cs.aClass_lArray7146 = new AbstractSprite[sprites.length];
				for (int i = 0; (i ^ 0xffffffff) > (sprites.length ^ 0xffffffff); i++)
					Class_cs.aClass_lArray7146[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				sprites = LDSprite.method129(class_fs, Class194_Sub2.anInt4954, 0);
				SceneGraph.aClass_lArray3726 = new AbstractSprite[sprites.length];
				for (int i = 0; i < sprites.length; i++)
					SceneGraph.aClass_lArray3726[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				sprites = LDSprite.method129(class_fs, OutgoingPacket.anInt2862, 0);
				Class40_Sub7.aClass_lArray5179 = new AbstractSprite[sprites.length];
				for (int i = 0; sprites.length > i; i++)
					Class40_Sub7.aClass_lArray5179[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				sprites = LDSprite.method129(class_fs, Player.f_nd, 0);
				Class246_Sub28_Sub29.aClass_lArray6820 = new AbstractSprite[sprites.length];
				for (int i = 0; i < sprites.length; i++)
					Class246_Sub28_Sub29.aClass_lArray6820[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				sprites = LDSprite.method129(class_fs, Class21_Sub1.anInt3900, 0);
				Class66.aClass_lArray882 = new AbstractSprite[sprites.length];
				for (int i = 0; i < sprites.length; i++)
					Class66.aClass_lArray882[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				sprites = LDSprite.method129(class_fs, AbstractModel.anInt1439, 0);
				Class_ds.aClass_lArray6718 = new AbstractSprite[sprites.length];
				for (int i = 0; (i ^ 0xffffffff) > (sprites.length ^ 0xffffffff); i++)
					Class_ds.aClass_lArray6718[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				sprites = LDSprite.method129(class_fs, Class107.anInt1507, 0);
				Class243.aClass_lArray3448 = new AbstractSprite[sprites.length];
				for (int i = 0; sprites.length > i; i++)
					Class243.aClass_lArray3448[i] = class260.ld_to_abstract_sprite(sprites[i], true);
				Class246_Sub16.aClass_l4521 = (class260
						.ld_to_abstract_sprite(LDSprite.get_sprite(class_fs, Class246_Sub19_Sub2.anInt6805, 0), true));
				Class246_Sub28_Sub32.aClass_l6928 = class260
						.ld_to_abstract_sprite(LDSprite.get_sprite(class_fs, Class233.anInt3182, 0), true);
				sprites = LDSprite.method129(class_fs, Class95.anInt1246, 0);
				Class169.aClass_lArray2410 = new AbstractSprite[sprites.length];
				for (int i = 0; (i ^ 0xffffffff) > (sprites.length ^ 0xffffffff); i++)
					Class169.aClass_lArray2410[i] = class260.ld_to_abstract_sprite(sprites[i], true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	final void method2143(int i, int i_20_, Buffer stream) {
		try {
			anInt6050++;
			if ((i_20_ ^ 0xffffffff) != -1) {
				if ((i_20_ ^ 0xffffffff) == -2)
					((TextureOperation) this).aBool4947 = stream.readUnsignedByte() == 1;
			} else {
				aClass21Array6051 = new Class21[stream.readUnsignedByte()];
				int i_21_ = 0;
				while_76_: for (/**/; ((aClass21Array6051.length ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++) {
					int i_22_ = stream.readUnsignedByte();
					int i_23_ = i_22_;
					while_74_: do {
						do {
							if ((i_23_ ^ 0xffffffff) != -1) {
								if (i_23_ != 1) {
									if (i_23_ != 2) {
										if (i_23_ != 3)
											continue while_76_;
									} else
										break;
									break while_74_;
								}
							} else {
								aClass21Array6051[i_21_] = Class35.method251(18002, stream);
								continue while_76_;
							}
							aClass21Array6051[i_21_] = Class59_Sub4_Sub3.method2858(stream, (byte) 95);
							continue while_76_;
						} while (false);
						aClass21Array6051[i_21_] = Class44.method296((byte) 119, stream);
						continue while_76_;
					} while (false);
					aClass21Array6051[i_21_] = Class211_Sub1.method2268(2, stream);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("er.G(" + i + ',' + i_20_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final int preload_title_screen(CacheIndex class_fs, CacheIndex class_fs2, int i) {
		try {
			int preload_state = 0;
			if (class_fs2.method112(-1, SpriteConstants.TITLE_SCREEN_BACKGROUND)) {
				preload_state++;
			}
			if (class_fs2.method112(-1, SpriteConstants.TITLE_SCREEN_LOGO)) {
				preload_state++;
			}
			if (class_fs2.method112(-1, SpriteConstants.LOGIN_BOX)) {
				preload_state++;
			}
			if (class_fs2.method112(-1, SpriteConstants.LOGIN_BUTTON)) {
				preload_state++;
			}
			if (class_fs.method112(-1, SpriteConstants.UNCHECKED_CHECKBOX_IMAGE)) {
				preload_state++;
			}
			if (class_fs.method112(-1, SpriteConstants.UNCHECKED_CHECKBOX_HOVER_IMAGE)) {
				preload_state++;
			}
			if (class_fs.method112(-1, SpriteConstants.CHECKED_CHECKBOX_IMAGE)) {
				preload_state++;
			}
			if (class_fs.method112(-1, SpriteConstants.CHECKED_CHECKBOX_HOVER_IMAGE)) {
				preload_state++;
			}
			if (class_fs.method112(-1, SpriteConstants.WORLD_SELECT_IMAGE)) {
				preload_state++;
			}
			if (class_fs.method112(-1, SpriteConstants.MUSIC_GROUP_IMAGE)) {
				preload_state++;
			}
			return preload_state;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"er.I(" + (class_fs != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public Class246_Sub28_Sub7() {
		super(0, true);
	}
}
