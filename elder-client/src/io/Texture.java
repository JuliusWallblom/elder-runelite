package io;

import io.cache.Cache;
import io.cache.IndexConstants;
import io.cache.Revision;

final class Texture extends NodeSub {

	private int[] anIntArray6551;
	int animationDirection, animationSpeed;
	private TextureOperation alternative_texture_op;
	static int anInt6553;
	static int anInt6554;
	static int anInt6555;
	static int anInt6556;
	static int anInt6557;
	private TextureOperation[] texture_ops;
	static int anInt6559;
	static int anInt6560;
	static int anInt6561;
	static int anInt6562 = 1;
	private TextureOperation primary_texture_op;
	static int anInt6564;
	private int[] anIntArray6565;
	static int anInt6566;
	static MultilingualString aClass67_6567;
	private TextureOperation secondary_texture_op;
	static int spriteId = -1;

	static final void method2695(byte i) {
		try {
			anInt6559++;
			Class160.method1059(-126, false);
			Class246_Sub28_Sub8.anInt6072 = 0;
			boolean bool = true;
			for (int i_0_ = 0; ((Class211_Sub1.current_regions.length ^ 0xffffffff) < (i_0_
					^ 0xffffffff)); i_0_++) {
				if (MapRegion.map_m[i_0_] != -1 && Class211_Sub1.current_regions[i_0_] == null) {
					Class211_Sub1.current_regions[i_0_] = MapRegion.get_map_index(MapRegion.region_ids[i_0_]).get_file(
							0,
							MapRegion.map_m[i_0_]);
					if (Class211_Sub1.current_regions[i_0_] == null) {
						Class246_Sub28_Sub8.anInt6072++;
						bool = false;
					}
				}
				if (MapRegion.map_l[i_0_] != -1 && Class134.potential_objects[i_0_] == null) {
					Class134.potential_objects[i_0_] = (MapRegion.get_map_index(MapRegion.region_ids[i_0_]).method108(
							MapRegion.map_l[i_0_], 0,
							MapRegion.xteas[i_0_], (byte) -103));
					if (Class134.potential_objects[i_0_] == null) {
						Class246_Sub28_Sub8.anInt6072++;
						bool = false;
					}
				}
				if (MapRegion.map_um[i_0_] != -1 && Class247.aByteArrayArray3478[i_0_] == null) {
					Class247.aByteArrayArray3478[i_0_] = (MapRegion.get_map_index(MapRegion.region_ids[i_0_]).get_file(
							0,
							MapRegion.map_um[i_0_]));
					if (Class247.aByteArrayArray3478[i_0_] == null) {
						Class246_Sub28_Sub8.anInt6072++;
						bool = false;
					}
				}
				if (MapRegion.map_ul[i_0_] != -1 && Class59_Sub1_Sub3.aByteArrayArray6347[i_0_] == null) {
					Class59_Sub1_Sub3.aByteArrayArray6347[i_0_] = MapRegion.get_map_index(MapRegion.region_ids[i_0_])
							.get_file(0,
									MapRegion.map_ul[i_0_]);
					if (Class59_Sub1_Sub3.aByteArrayArray6347[i_0_] == null) {
						Class246_Sub28_Sub8.anInt6072++;
						bool = false;
					}
				}
				if (Class95.anIntArray1251 != null && Class246_Sub5.aByteArrayArray3885[i_0_] == null
						&& Class95.anIntArray1251[i_0_] != -1) {
					Class246_Sub5.aByteArrayArray3885[i_0_] = (MapRegion.get_map_index(MapRegion.region_ids[i_0_])
							.method108(Class95.anIntArray1251[i_0_],
									0, MapRegion.xteas[i_0_], (byte) -104));
					if (Class246_Sub5.aByteArrayArray3885[i_0_] == null) {
						Class246_Sub28_Sub8.anInt6072++;
						bool = false;
					}
				}
			}
			if (ScriptEvent.aClass178_4966 == null) {
				if (Class246_Sub28_Sub17.aClass246_Sub1_Sub5_6409 != null && (Cache.client_cache
						.get(IndexConstants.PRE_EOC_634_WORLD_MAP_INDEX)
						.method94((((Class246_Sub1_Sub5) Class246_Sub28_Sub17.aClass246_Sub1_Sub5_6409).aString5846)
								+ "_staticelements", -1))) {
					if (Cache.client_cache.get(IndexConstants.PRE_EOC_634_WORLD_MAP_INDEX).method90(-1,
							(((Class246_Sub1_Sub5) Class246_Sub28_Sub17.aClass246_Sub1_Sub5_6409).aString5846)
									+ "_staticelements"))
						ScriptEvent.aClass178_4966 = (Class259_Sub2_Sub1.method2847(
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_WORLD_MAP_INDEX), 28,
								(((Class246_Sub1_Sub5) (Class246_Sub28_Sub17.aClass246_Sub1_Sub5_6409)).aString5846
										+ "_staticelements"),
								Client.members_world));
					else {
						bool = false;
						Class246_Sub28_Sub8.anInt6072++;
					}
				} else
					ScriptEvent.aClass178_4966 = new Class178(0);
			}
			if (!bool)
				PlayerComposition.anInt379 = 1;
			else {
				bool = true;
				Class148.anInt2184 = 0;
				for (int i_1_ = 0; ((Class211_Sub1.current_regions.length ^ 0xffffffff) < (i_1_
						^ 0xffffffff)); i_1_++) {
					byte[] is = Class134.potential_objects[i_1_];
					if (is != null) {
						int i_2_ = ((MapRegion.region_ids[i_1_] >> 8) * 64 - Client.base_x);
						int i_3_ = (64 * (0xff & MapRegion.region_ids[i_1_]) - Client.base_y);
						if ((Class255_Sub1.anInt5573 ^ 0xffffffff) != -1) {
							i_2_ = 10;
							i_3_ = 10;
						}
						bool &= Class64_Sub1.method2220((Class38_Sub1_Sub1.anInt6770), i_2_, Class152.anInt2205, is,
								i_3_, i + 130);
					}
					is = Class59_Sub1_Sub3.aByteArrayArray6347[i_1_];
					if (is != null) {
						int i_4_ = ((MapRegion.region_ids[i_1_] >> 8) * 64 + -Client.base_x);
						int i_5_ = (-Client.base_y + 64 * (0xff & MapRegion.region_ids[i_1_]));
						if ((Class255_Sub1.anInt5573 ^ 0xffffffff) != -1) {
							i_4_ = 10;
							i_5_ = 10;
						}
						bool &= Class64_Sub1.method2220((Class38_Sub1_Sub1.anInt6770), i_4_, Class152.anInt2205, is,
								i_5_, i + 130);
					}
				}
				if (!bool)
					PlayerComposition.anInt379 = 2;
				else {
					if ((PlayerComposition.anInt379 ^ 0xffffffff) != -1)
						Class_w.method2650(true,
								((Class250.aClass67_3531.get(Preferences.language_code)) + "<br>(100%)"),
								FontCache.regular_font, 13);
					IterableNodeHashTable.method545((byte) -109);
					Class232.method1484((byte) 68);
					boolean bool_6_ = false;
					if (Client.sprite_loader.method1702()
							&& (((Renderer) Client.current_renderer).aBool574)) {
						for (int i_7_ = 0; ((Class211_Sub1.current_regions.length ^ 0xffffffff) < (i_7_
								^ 0xffffffff)); i_7_++) {
							if ((Class59_Sub1_Sub3.aByteArrayArray6347[i_7_] != null)
									|| (Class247.aByteArrayArray3478[i_7_] != null)) {
								bool_6_ = true;
								break;
							}
						}
					}
					int i_8_;
					if (Settings.draw_fog)
						i_8_ = Stream_Sub2.anIntArray6184[TextureLoader.anInt980];
					else
						i_8_ = Class59_Sub2.anIntArray4559[TextureLoader.anInt980];
					if (Client.sprite_loader.method1727())
						i_8_++;
					Class246_Sub28_Sub22.method2725(7, 4, Class38_Sub1_Sub1.anInt6770, Class152.anInt2205, i_8_,
							bool_6_, Client.sprite_loader.method1701() > 0);
					for (int i_9_ = 0; i_9_ < 4; i_9_++)
						Class95.aClass199Array1235[i_9_].method1324(-121);
					SomeClass.method891((byte) 18);
					Class218.method1413(false, i - 31518);
					Filestore.method957((byte) 60);
					Class_u_Sub1.aClass230_5685 = null;
					IterableNodeHashTable.method545((byte) -109);
					System.gc();
					Class160.method1059(-120, true);
					MapFunction.method952((byte) 103);
					Stream_Sub1.anInt5855 = Client.current_renderer.method271(Buffer.anInt5656,
							(byte) -28);
					Class59_Sub5_Sub1.aBool5828 = Class40_Sub2.anInt4047 >= 96;
					Class174.aBool2462 = (((Renderer) Client.current_renderer).aBool574);
					Class132.aBool1833 = Client.current_renderer.method275(29083,
							Buffer.anInt5656);
					MapRegion.aBool6180 = !(((Renderer) Client.current_renderer).aBool573);
					Class_q_Sub1.anInt6664 = (Client.current_renderer.method2052(Buffer.anInt5656,
							i + 1) ? -1 : Class40_Sub6.anInt5103);
					Class_w.aBool6387 = (((Renderer) Client.current_renderer).texture);
					Class31.blend_ground = Settings.ground_blending;
					Class246_Sub28_Sub3.aClass255_Sub1_5900 = new Class255_Sub1(4, Class38_Sub1_Sub1.anInt6770,
							Class152.anInt2205, false);
					if (Class255_Sub1.anInt5573 == 0)
						Class154_Sub1.method2093((Class246_Sub28_Sub3.aClass255_Sub1_5900),
								(Class211_Sub1.current_regions), -32652);
					else
						Class_q_Sub1.method2733((Class246_Sub28_Sub3.aClass255_Sub1_5900), 8,
								(Class211_Sub1.current_regions));
					Class109_Sub1.method1765((byte) 121, Class38_Sub1_Sub1.anInt6770 >> 4, Class152.anInt2205 >> 4);
					InputStream_Sub1.method2101(-12388);
					if (bool_6_) {
						Class47.method317(true);
						VarcLoader.aClass255_Sub1_1001 = new Class255_Sub1(1, Class38_Sub1_Sub1.anInt6770,
								Class152.anInt2205, true);
						if ((Class255_Sub1.anInt5573 ^ 0xffffffff) == -1) {
							Class154_Sub1.method2093((VarcLoader.aClass255_Sub1_1001), (Class247.aByteArrayArray3478),
									-32652);
							Class160.method1059(-110, true);
						} else {
							Class_q_Sub1.method2733((VarcLoader.aClass255_Sub1_1001), 8,
									(Class247.aByteArrayArray3478));
							Class160.method1059(-104, true);
						}
						VarcLoader.aClass255_Sub1_1001.method1650(i - 126,
								(((MapRegion) (Class246_Sub28_Sub3.aClass255_Sub1_5900)).tileHeights[0]),
								0);
						VarcLoader.aClass255_Sub1_1001.method1652(null, (byte) -70, null, Client.sprite_loader);
						Class47.method317(false);
					}
					Class246_Sub28_Sub3.aClass255_Sub1_5900.method1652(
							bool_6_ ? (((MapRegion) VarcLoader.aClass255_Sub1_1001).tileHeights) : null,
							(byte) -82, Class95.aClass199Array1235, Client.sprite_loader);
					if ((Class255_Sub1.anInt5573 ^ 0xffffffff) == -1) {
						Class160.method1059(-112, true);
						MapRegion.render_objects((byte) -77, Class246_Sub28_Sub3.aClass255_Sub1_5900,
								Class134.potential_objects);
						if (Class246_Sub5.aByteArrayArray3885 != null)
							Model.method651(i - 8407);
					} else {
						Class160.method1059(-108, true);
						Class259_Sub3.method2272((Class246_Sub28_Sub3.aClass255_Sub1_5900),
								Class134.potential_objects, (byte) 102);
					}
					Class232.method1484((byte) 113);
					Class160.method1059(-95, true);
					Class246_Sub28_Sub3.aClass255_Sub1_5900.createRegionScene(i + 21354, null,
							bool_6_ ? Class154.aClass210Array2215[0] : null, Client.sprite_loader);
					Class246_Sub28_Sub3.aClass255_Sub1_5900.method2343(119, Client.sprite_loader);
					if (i != 125)
						method2699(72);
					Class160.method1059(-34, true);
					if (bool_6_) {
						Class47.method317(true);
						Class160.method1059(-119, true);
						if (Class255_Sub1.anInt5573 != 0)
							Class259_Sub3.method2272((VarcLoader.aClass255_Sub1_1001),
									(Class59_Sub1_Sub3.aByteArrayArray6347), (byte) 105);
						else
							MapRegion.render_objects((byte) -102, VarcLoader.aClass255_Sub1_1001,
									Class59_Sub1_Sub3.aByteArrayArray6347);
						Class232.method1484((byte) 56);
						Class160.method1059(-38, true);
						VarcLoader.aClass255_Sub1_1001.createRegionScene(21479,
								Class246_Sub28_Sub3.aClass210Array5899[0], null,
								Client.sprite_loader);
						VarcLoader.aClass255_Sub1_1001.method2343(122, Client.sprite_loader);
						Class160.method1059(-112, true);
						Class47.method317(false);
					}
					Class246_Sub1_Sub16.method2741((byte) 120);
					int i_10_ = (((Class255_Sub1) Class246_Sub28_Sub3.aClass255_Sub1_5900).anInt5578);
					if (i_10_ > Class246_Sub28_Sub24.anInt6681)
						i_10_ = Class246_Sub28_Sub24.anInt6681;
					if ((-1 + Class246_Sub28_Sub24.anInt6681 ^ 0xffffffff) < (i_10_ ^ 0xffffffff))
						i_10_ = Class246_Sub28_Sub24.anInt6681 - 1;
					if (!Client.current_renderer.method2052(Buffer.anInt5656, i - 12))
						GameEngine.method2948(i_10_);
					else
						GameEngine.method2948(0);
					for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -5; i_11_++) {
						for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class38_Sub1_Sub1.anInt6770
								^ 0xffffffff)); i_12_++) {
							for (int i_13_ = 0; i_13_ < Class152.anInt2205; i_13_++)
								MapScenes.method1645(i_11_, i + 1546660522, i_12_, i_13_);
						}
					}
					Class211_Sub1_Sub2.method2689(i - 125);
					IterableNodeHashTable.method545((byte) -109);
					Class_a.method572(0);
					Class232.method1484((byte) 121);
					UnderlayLoader.aBool1468 = false;
					Class40_Sub6.method2182((byte) -98);
					if (Client.frame != null && Class65.aClass6_864 != null && VarcType.anInt3103 == 25) {
						Class222.anInt3068++;
						Class243.writePacket(-117, (Class246_Sub28_Sub36.aClass201_7033));
						Class130_Sub1.stream.writeInt(1057001181, (byte) -62);
					}
					if (Class255_Sub1.anInt5573 == 0) {
						int i_14_ = ((-(Class38_Sub1_Sub1.anInt6770 >> 4) + IdentityKitLoader.anInt1206) / 8);
						int i_15_ = ((IdentityKitLoader.anInt1206 + (Class38_Sub1_Sub1.anInt6770 >> 4)) / 8);
						int i_16_ = ((Class130_Sub8.anInt5618 - (Class152.anInt2205 >> 4)) / 8);
						int i_17_ = ((Class130_Sub8.anInt5618 + (Class152.anInt2205 >> 4)) / 8);
						for (int i_18_ = -1 + i_14_; i_15_ + 1 >= i_18_; i_18_++) {
							for (int i_19_ = i_16_ - 1; ((i_19_ ^ 0xffffffff) >= (i_17_ + 1 ^ 0xffffffff)); i_19_++) {
								if (i_14_ > i_18_ || (i_15_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff) || i_19_ < i_16_
										|| (i_17_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff)) {
									Cache.get_index(Revision.PRE_EOC_634, "maps").method113(i ^ 0x19,
											"m" + i_18_ + "_" + i_19_);
									Cache.get_index(Revision.PRE_EOC_634, "maps").method113(100,
											"l" + i_18_ + "_" + i_19_);
								}
							}
						}
					}
					if (VarcType.anInt3103 == 28)
						Class99.method622((byte) 29, 10);
					else {
						Class99.method622((byte) 84, 30);
						if (Class65.aClass6_864 != null)
							Class243.writePacket(i ^ ~0x16, Class_l_Sub2.REGION_DONE_LOADING_PACKET);
					}
					Class66.method432(126);
					IterableNodeHashTable.method545((byte) -109);
					Class187_Sub1.method2109((byte) 124);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	final boolean sprite_method_1(byte i, CacheIndex sprite_data, TextureInterface tex_interface) {
		try {
			anInt6553++;
			if (Texture.spriteId < 0) {
				for (int i2 = 0; i2 < anIntArray6551.length; i2++) {
					// Check if the sprite data method returns false
					if (!sprite_data.method112(-1, anIntArray6551[i2])) {
						return false;
					}
				}
			} else {
				for (int i2 = 0; i2 < anIntArray6551.length; i2++) {
					// Check if the sprite data method returns false with Texture.spriteId
					if (!sprite_data.method85(anIntArray6551[i2], (byte) -124, Texture.spriteId)) {
						return false;
					}
				}
			}

			// Loop through anIntArray6565 and check if tex_interface method returns false
			for (int i2 = 0; i2 < anIntArray6565.length; i2++) {
				if (!tex_interface.method13(anIntArray6565[i2], 19378)) {
					return false;
				}
			}

			int i_23_ = -15 % ((i + 72) / 53);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	final int[] texture_object(TextureInterface interface6, int i, boolean bool, boolean bool_24_,
			CacheIndex sprite_data, double d, int i_25_, int i_26_) {
		try {
			Class19.sprite_data = sprite_data;
			Class79_Sub1.anInterface6_5163 = interface6;
			anInt6564++;
			for (int i_27_ = 0; i_27_ < texture_ops.length; i_27_++)
				texture_ops[i_27_].method2138(i_25_, (byte) -54, i_26_);
			Class230.method1477(d, (byte) -38);
			Class155.method1028(i_25_, 9188, i_26_);
			int[] is = new int[i_26_ * i_25_];
			int i_28_;
			int i_29_;
			int i_30_;
			if (bool) {
				i_29_ = -1;
				i_30_ = i_26_ - 1;
				i_28_ = -1;
			} else {
				i_28_ = 1;
				i_29_ = i_26_;
				i_30_ = 0;
			}
			int i_31_ = 0;
			for (int i_32_ = 0; i_32_ < i_25_; i_32_++) {
				int[] is_33_;
				int[] is_34_;
				int[] is_35_;
				if (!((TextureOperation) primary_texture_op).aBool4947) {
					int[][] is_36_ = primary_texture_op.method2139((byte) 45, i_32_);
					is_33_ = is_36_[0];
					is_35_ = is_36_[2];
					is_34_ = is_36_[1];
				} else {
					int[] is_37_ = primary_texture_op.method2135(125, i_32_);
					is_33_ = is_37_;
					is_34_ = is_37_;
					is_35_ = is_37_;
				}
				if (bool_24_)
					i_31_ = i_32_;
				for (int i_38_ = i_30_; i_29_ != i_38_; i_38_ += i_28_) {
					int i_39_ = is_33_[i_38_] >> 4;
					if ((i_39_ ^ 0xffffffff) < -256)
						i_39_ = 255;
					if ((i_39_ ^ 0xffffffff) > -1)
						i_39_ = 0;
					int i_40_ = is_34_[i_38_] >> 4;
					if ((i_40_ ^ 0xffffffff) < -256)
						i_40_ = 255;
					if (i_40_ < 0)
						i_40_ = 0;
					int i_41_ = is_35_[i_38_] >> 4;
					if (i_41_ > 255)
						i_41_ = 255;
					i_39_ = Class59_Sub5.anIntArray5402[i_39_];
					if (i_41_ < 0)
						i_41_ = 0;
					i_40_ = Class59_Sub5.anIntArray5402[i_40_];
					i_41_ = Class59_Sub5.anIntArray5402[i_41_];
					int i_42_ = i_41_ + (i_39_ << 16) + (i_40_ << 8);
					if (i_42_ != 0)
						i_42_ |= ~0xffffff;
					is[i_31_++] = i_42_;
					if (bool_24_)
						i_31_ += i_26_ - 1;
				}
			}
			for (int i_43_ = 0; texture_ops.length > i_43_; i_43_++)
				texture_ops[i_43_].method2142(126);
			if (i >= -34)
				aClass67_6567 = null;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("kv.D(" + (interface6 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + bool_24_ + ','
							+ (sprite_data != null ? "{...}" : "null") + ',' + d + ',' + i_25_ + ',' + i_26_ + ')'));
		}
	}

	static final int method2699(int i) {
		try {
			anInt6556++;
			if (i != 8458)
				anInt6561 = -3;
			return Class246_Sub28_Sub19.anInt6541;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kv.J(" + i + ')');
		}
	}

	static final boolean method2700(int i, char c) {
		try {
			anInt6554++;
			if (i > -105)
				method2704(52);
			if ((c < 48 || c > 57) && ((c ^ 0xffffffff) > -66 || c > 90)
					&& ((c ^ 0xffffffff) > -98 || (c ^ 0xffffffff) < -123))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kv.C(" + i + ',' + c + ')');
		}
	}

	static final void method2701(boolean bool, int i, boolean bool_48_) {
		try {
			if (bool_48_) {
				Class24.anInt337--;
				if ((Class24.anInt337 ^ 0xffffffff) == -1)
					Class40_Sub3.anIntArray4064 = null;
			}
			if (bool) {
				Class246_Sub18.anInt4681--;
				if ((Class246_Sub18.anInt4681 ^ 0xffffffff) == -1)
					Entity.f_eb = null;
			}
			if (i != 478210754)
				anInt6561 = -106;
			anInt6555++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kv.G(" + bool + ',' + i + ',' + bool_48_ + ')'));
		}
	}

	final int[] sprite_method_4(int i, byte i_49_, CacheIndex class_fs, TextureInterface interface6, int i_50_,
			double d, boolean bool) {
		try {
			Class79_Sub1.anInterface6_5163 = interface6;
			Class19.sprite_data = class_fs;
			anInt6557++;
			if (i_49_ != 110)
				sprite_method_3(true, null, null, -27, true, 80);
			for (int i_51_ = 0; ((texture_ops.length ^ 0xffffffff) < (i_51_ ^ 0xffffffff)); i_51_++)
				texture_ops[i_51_].method2138(i_50_, (byte) -54, i);
			Class230.method1477(d, (byte) -85);
			Class155.method1028(i_50_, 9188, i);
			int[] is = new int[i_50_ * (i * 4)];
			int i_52_ = 0;
			for (int i_53_ = 0; i_50_ > i_53_; i_53_++) {
				int[] is_54_;
				int[] is_55_;
				int[] is_56_;
				if (((TextureOperation) primary_texture_op).aBool4947) {
					int[] is_57_ = primary_texture_op.method2135(i_49_ + 15, i_53_);
					is_56_ = is_57_;
					is_55_ = is_57_;
					is_54_ = is_57_;
				} else {
					int[][] is_58_ = primary_texture_op.method2139((byte) 35, i_53_);
					is_54_ = is_58_[0];
					is_55_ = is_58_[1];
					is_56_ = is_58_[2];
				}
				if (bool)
					i_52_ = i_53_;
				int[] is_59_;
				if (!((TextureOperation) secondary_texture_op).aBool4947)
					is_59_ = secondary_texture_op.method2139((byte) 40, i_53_)[0];
				else
					is_59_ = secondary_texture_op.method2135(126, i_53_);
				for (int i_60_ = i - 1; i_60_ >= 0; i_60_--) {
					int i_61_ = is_54_[i_60_] >> 4;
					if (i_61_ > 255)
						i_61_ = 255;
					if (i_61_ < 0)
						i_61_ = 0;
					int i_62_ = is_55_[i_60_] >> 4;
					if (i_62_ > 255)
						i_62_ = 255;
					if ((i_62_ ^ 0xffffffff) > -1)
						i_62_ = 0;
					int i_63_ = is_56_[i_60_] >> 4;
					if ((i_63_ ^ 0xffffffff) < -256)
						i_63_ = 255;
					if ((i_63_ ^ 0xffffffff) > -1)
						i_63_ = 0;
					i_61_ = Class59_Sub5.anIntArray5402[i_61_];
					i_62_ = Class59_Sub5.anIntArray5402[i_62_];
					i_63_ = Class59_Sub5.anIntArray5402[i_63_];
					int i_64_;
					if ((i_61_ ^ 0xffffffff) == -1 && i_62_ == 0 && (i_63_ ^ 0xffffffff) == -1)
						i_64_ = 0;
					else {
						i_64_ = is_59_[i_60_] >> 4;
						if (i_64_ > 255)
							i_64_ = 255;
						if (i_64_ < 0)
							i_64_ = 0;
					}
					is[i_52_++] = i_63_ + ((i_62_ << 8) + ((i_64_ << 24) - -(i_61_ << 16)));
					if (bool)
						i_52_ += i - 1;
				}
			}
			for (int i_65_ = 0; texture_ops.length > i_65_; i_65_++)
				texture_ops[i_65_].method2142(125);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("kv.A(" + i + ',' + i_49_ + ',' + (class_fs != null ? "{...}" : "null") + ','
							+ (interface6 != null ? "{...}" : "null") + ',' + i_50_ + ',' + d + ',' + bool + ')'));
		}
	}

	final float[] sprite_method_3(boolean bool, TextureInterface interface6, CacheIndex class_fs, int i,
			boolean bool_66_, int i_67_) {
		try {
			anInt6560++;
			if (bool != false)
				method2701(false, -57, false);
			Class19.sprite_data = class_fs;
			Class79_Sub1.anInterface6_5163 = interface6;
			for (int i_68_ = 0; ((i_68_ ^ 0xffffffff) > (texture_ops.length ^ 0xffffffff)); i_68_++)
				texture_ops[i_68_].method2138(i_67_, (byte) -54, i);
			Class155.method1028(i_67_, 9188, i);
			float[] fs = new float[4 * i * i_67_];
			int i_69_ = 0;
			for (int i_70_ = 0; i_70_ < i_67_; i_70_++) {
				int[] is;
				int[] is_71_;
				int[] is_72_;
				if (!((TextureOperation) primary_texture_op).aBool4947) {
					int[][] is_73_ = primary_texture_op.method2139((byte) 37, i_70_);
					is = is_73_[2];
					is_72_ = is_73_[0];
					is_71_ = is_73_[1];
				} else {
					int[] is_74_ = primary_texture_op.method2135(-101, i_70_);
					is = is_74_;
					is_71_ = is_74_;
					is_72_ = is_74_;
				}
				int[] is_75_;
				if (((TextureOperation) secondary_texture_op).aBool4947)
					is_75_ = secondary_texture_op.method2135(124, i_70_);
				else
					is_75_ = secondary_texture_op.method2139((byte) 35, i_70_)[0];
				if (bool_66_)
					i_69_ = i_70_ << 2;
				int[] is_76_;
				if (((TextureOperation) alternative_texture_op).aBool4947)
					is_76_ = alternative_texture_op.method2135(127, i_70_);
				else
					is_76_ = (alternative_texture_op.method2139((byte) 111, i_70_)[0]);
				for (int i_77_ = -1 + i; i_77_ >= 0; i_77_--) {
					float f = (float) is_75_[i_77_] / 4096.0F;
					float f_78_ = ((1.0F + (float) is_76_[i_77_] * 31.0F / 4096.0F) / 4096.0F);
					if (!(f < 0.0F)) {
						if (f > 1.0F)
							f = 1.0F;
					} else
						f = 0.0F;
					fs[i_69_++] = (float) is_72_[i_77_] * f_78_;
					fs[i_69_++] = f_78_ * (float) is_71_[i_77_];
					fs[i_69_++] = f_78_ * (float) is[i_77_];
					fs[i_69_++] = f;
					if (bool_66_)
						i_69_ += -4 + (i << 2);
				}
			}
			for (int i_79_ = 0; i_79_ < texture_ops.length; i_79_++)
				texture_ops[i_79_].method2142(125);
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kv.F(" + bool + ',' + (interface6 != null ? "{...}" : "null")
					+ ',' + (class_fs != null ? "{...}" : "null") + ',' + i + ',' + bool_66_ + ',' + i_67_ + ')'));
		}
	}

	public static void method2704(int i) {
		do {
			try {
				aClass67_6567 = null;
				if (i == 26270)
					break;
				method2704(60);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "kv.I(" + i + ')');
			}
			break;
		} while (false);
	}

	Texture(Buffer stream, int texture_id, Revision revision) {
		try {
			if (revision == Revision.OSRS) {
				int field1641 = stream.readUnsignedShort();
				boolean field1638 = stream.readUnsignedByte() == 1;
				int var2 = stream.readUnsignedByte();
				int[] field1640;
				int[] fileIds;
				int[] field1633;
				int[] field1634;
				int field1643;
				int field1644;
				int[] field1637;
				if (var2 >= 1 && var2 <= 4) {
					fileIds = new int[var2];

					int var3;
					for (var3 = 0; var3 < var2; ++var3) {
						fileIds[var3] = stream.readUnsignedShort();
					}

					if (var2 > 1) {
						field1640 = new int[var2 - 1];

						for (var3 = 0; var3 < var2 - 1; ++var3) {
							field1640[var3] = stream.readUnsignedByte();

						}
					}

					if (var2 > 1) {
						field1633 = new int[var2 - 1];

						for (var3 = 0; var3 < var2 - 1; ++var3) {
							field1633[var3] = stream.readUnsignedByte();
						}
					}

					field1634 = new int[var2];

					for (var3 = 0; var3 < var2; ++var3) {
						field1634[var3] = stream.readInt();
					}

					animationDirection = stream.readUnsignedByte();
					animationSpeed = stream.readUnsignedByte();
					field1637 = null;
					anIntArray6565 = new int[0];
					anIntArray6551 = fileIds;
					alternative_texture_op = new Class246_Sub28_Sub20();
					((TextureOperation) alternative_texture_op).anInt4932 = 2;
					primary_texture_op = new Class246_Sub28_Sub5(fileIds[0]);
					((TextureOperation) primary_texture_op).anInt4932 = 2;
					secondary_texture_op = new Class246_Sub28_Sub20();
					((TextureOperation) secondary_texture_op).anInt4932 = 2;
					texture_ops = new TextureOperation[] { primary_texture_op, secondary_texture_op,
							alternative_texture_op };
				} else {
					throw new RuntimeException();
				}
			} else {
				int i = stream.readUnsignedByte();
				int i_80_ = 0;
				int i_81_ = 0;
				int[][] is = new int[i][];
				texture_ops = new TextureOperation[i];
				for (int i_82_ = 0; (i_82_ ^ 0xffffffff) > (i ^ 0xffffffff); i_82_++) {
					TextureOperation class246_sub28 = Class84.method538(stream, (byte) -121);
					if (class246_sub28.method2136(-1) >= 0)
						i_80_++;
					if ((class246_sub28.method2137(3) ^ 0xffffffff) <= -1)
						i_81_++;
					int i_83_ = (((TextureOperation) class246_sub28).texture_ops).length;
					is[i_82_] = new int[i_83_];
					for (int i_84_ = 0; i_84_ < i_83_; i_84_++)
						is[i_82_][i_84_] = stream.readUnsignedByte();
					texture_ops[i_82_] = class246_sub28;
				}
				anIntArray6551 = new int[i_80_];
				i_80_ = 0;
				anIntArray6565 = new int[i_81_];
				i_81_ = 0;
				for (int op = 0; (op ^ 0xffffffff) > (i ^ 0xffffffff); op++) {
					TextureOperation texture_op = texture_ops[op];
					int i_86_ = (((TextureOperation) texture_op).texture_ops).length;
					for (int i_87_ = 0; i_86_ > i_87_; i_87_++)
						((TextureOperation) texture_op).texture_ops[i_87_] = texture_ops[is[op][i_87_]];
					int i_88_ = texture_op.method2136(-1);
					int i_89_ = texture_op.method2137(3);
					if (i_88_ > 0) {
						anIntArray6551[i_80_++] = i_88_;
					}
					if (i_89_ > 0) {
						anIntArray6565[i_81_++] = i_89_;
					}
					is[op] = null;
				}
				int primary_texture_op_index = stream.readUnsignedByte();
				int secondary_texture_op_index = stream.readUnsignedByte();
				int alternative_texture_op_index = stream.readUnsignedByte();
				primary_texture_op = texture_ops[primary_texture_op_index];
				secondary_texture_op = texture_ops[secondary_texture_op_index];
				alternative_texture_op = texture_ops[alternative_texture_op_index];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kv.<init>(" + (stream != null ? "{...}" : "null") + ')');
		}
	}

	static {
		anInt6561 = 0;
		aClass67_6567 = new MultilingualString("Face here", "Hierhin drehen", "Regarder dans cette direction",
				"Virar para c\u00e1");
	}
}
