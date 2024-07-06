package io;

import io.cache.Revision;

final class MapFunctions {
	static int anInt2326;
	CacheIndex sprite_data, sprite_data_OSRS;
	static int anInt2328;
	private CacheIndex config_data, config_data_OSRS;
	static int anInt2330;
	private HashMap map_function_cache = new HashMap(128), map_function_cache_OSRS = new HashMap(128);
	static int anInt2332;
	static int anInt2333;
	static int anInt2334;
	static int anInt2335 = 0;
	static int anInt2336;
	HashMap aClass54_2337 = new HashMap(64);
	static IncomingPacket aClass13_2338 = new IncomingPacket(105, -2);
	static float aFloat2339;
	static int anInt2340 = -1;
	static int anInt2341;
	static int anInt2342;

	static final void method1087(int i) {
		try {
			Class33.aClass260_444
					.B((0.7F + 0.1F * (float) (((Renderer) (Client.current_renderer)).brightness)) * 1.1523438F);
			anInt2336++;
			Class33.aClass260_444.T(Class37.anInt547, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
			if (i <= -97) {
				Class33.aClass260_444.UA(Settings.fog_color, -1, 256);
				Class33.aClass260_444.method1729(Filestore.aClass211_2064);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.H(" + i + ')');
		}
	}

	final MapFunction method1088(int i, byte i_0_) {
		try {
			if (i_0_ != -41)
				return null;
			anInt2328++;
			Revision revision = MapRegion.get_revision_by_region();
			MapFunction class140;
			if (revision == Revision.OSRS) {
				synchronized (map_function_cache_OSRS) {
					class140 = (MapFunction) map_function_cache_OSRS.method379((long) i, (byte) 58);
				}
			} else {
				synchronized (map_function_cache) {
					class140 = (MapFunction) map_function_cache.method379((long) i, (byte) 58);
				}
			}
			if (class140 != null)
				return class140;
			byte[] is = null;
			if (revision == Revision.OSRS) {
				is = config_data_OSRS.get_file(i, 35);
			} else {
				is = config_data.get_file(i, 36);
			}
			class140 = new MapFunction();
			((MapFunction) class140).anInt2006 = i;
			((MapFunction) class140).aClass165_2009 = this;
			if (is != null) {
				class140.decode(new Buffer(is), i_0_ ^ ~0x3a);
			}
			class140.method945((byte) 45);
			if (revision == Revision.OSRS) {
				synchronized (map_function_cache_OSRS) {
					map_function_cache_OSRS.method371(1, (long) i, class140);
				}
			} else {
				synchronized (map_function_cache) {
					map_function_cache.method371(1, (long) i, class140);
				}
			}
			return class140;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.A(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1089(int i, byte[] is, boolean bool, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				anInt2342++;
				if ((i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
					i_3_ += i_2_;
					i = i_1_ - i_2_ >> 2;
					while ((--i ^ 0xffffffff) <= -1) {
						is[i_3_++] = (byte) 1;
						is[i_3_++] = (byte) 1;
						is[i_3_++] = (byte) 1;
						is[i_3_++] = (byte) 1;
					}
					i = 0x3 & i_1_ + -i_2_;
					while ((--i ^ 0xffffffff) <= -1)
						is[i_3_++] = (byte) 1;
					if (bool == true)
						break;
					anInt2335 = 54;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("pj.B(" + i + ',' + (is != null ? "{...}" : "null") + ','
						+ bool + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1090(byte i) {
		do {
			try {
				aClass13_2338 = null;
				if (i == -16)
					break;
				aClass13_2338 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "pj.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1091(int i) {
		try {
			synchronized (map_function_cache) {
				map_function_cache.method369(false);
			}
			synchronized (map_function_cache_OSRS) {
				map_function_cache_OSRS.method369(false);
			}
			anInt2334++;
			if (i <= -84) {
				synchronized (((MapFunctions) this).aClass54_2337) {
					((MapFunctions) this).aClass54_2337.method369(false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.I(" + i + ')');
		}
	}

	final void method1092(int i, byte i_4_) {
		try {
			anInt2326++;
			synchronized (map_function_cache) {
				map_function_cache.method380(i, -50);
			}
			synchronized (map_function_cache_OSRS) {
				map_function_cache_OSRS.method380(i, -50);
			}
			synchronized (((MapFunctions) this).aClass54_2337) {
				((MapFunctions) this).aClass54_2337.method380(i, -50);
			}
			if (i_4_ <= 42)
				method1092(-29, (byte) 124);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.G(" + i + ',' + i_4_ + ')');
		}
	}

	public static void draw(int i, int i_1_, int i_3_, int i_5_, SceneGraph class260, Widget class235,
			Class128 class128) {
		for (int index = 0; index < Class39_Sub1.f_eb; index++) {
			int i_14_ = ((Class246_Sub28_Sub6.anIntArray6043[index] * 4) + 2 + -(i_5_ / 32));
			int i_15_ = (-(i_3_ / 32) + (2 + 4 * (Class59_Sub1_Sub1.anIntArray5991[index])));
			LocType class185 = (Class143.aClass251_2067.list(Class256.anIntArray3673[index], 0));
			if (((LocType) class185).f_bb != null) {
				class185 = class185.method1205((Varbit.aClass95_6658), (byte) -21);
				if (class185 == null || ((LocType) class185).map_function == -1)
					continue;
			}
			Class59_Sub3_Sub1.method2440(i_14_, -14698, class260, (((LocType) class185).map_function),
					class235, i_15_, class128, i, i_1_);
		}
	}

	static final void method1094(String string, int i) {
		do {
			try {
				anInt2333++;
				if (Class187.aBool2653) {
					boolean bool = false;
					if (i >= -95)
						method1087(33);
					int i_23_ = Class246_Sub4.anInt3869;
					int[] is = Class53.anIntArray755;
					for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
						Player class_r_sub1 = Class143.players[is[i_24_]];
						if (class_r_sub1 != null && Client.local_player != class_r_sub1
								&& (((Player) class_r_sub1).aString7140 != null)
								&& ((Player) class_r_sub1).aString7140.equalsIgnoreCase(string)) {
							Class243.writePacket(-76, (Class246_Sub19_Sub2.aClass201_6811));
							Class56.anInt794++;
							Class130_Sub1.stream.readIntV2(-1276441384, Class231.anInt3168);
							Class130_Sub1.stream.writeShortLE128((byte) -73, is[i_24_]);
							Class130_Sub1.stream.writeShort((byte) 67, Class87.anInt1145);
							Class130_Sub1.stream.writeShort((byte) 67, SubScript.anInt1161);
							Class130_Sub1.stream.method2358((byte) 23, 0);
							Class90.method570(0, ((Entity) class_r_sub1).f_nc[0], ((Entity) class_r_sub1).f_mc[0],
									class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0,
									-2, 115);
							bool = true;
							break;
						}
					}
					if (!bool)
						Client.add_game_message((byte) -99,
								Class246_Sub10.aClass67_4079.get(Preferences.language_code) + string);
					if (!Class187.aBool2653)
						break;
					Class59_Sub4.method2209((byte) 104);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("pj.D(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method1095(int i, boolean bool, int i_25_) {
		do {
			try {
				map_function_cache = new HashMap(i_25_);
				map_function_cache_OSRS = new HashMap(i_25_);
				anInt2341++;
				((MapFunctions) this).aClass54_2337 = new HashMap(i);
				if (bool == false)
					break;
				((MapFunctions) this).sprite_data = null;
				((MapFunctions) this).sprite_data_OSRS = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("pj.J(" + i + ',' + bool + ',' + i_25_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1096(int i) {
		try {
			synchronized (map_function_cache) {
				map_function_cache.method383(i ^ 0x677e);
			}
			synchronized (map_function_cache_OSRS) {
				map_function_cache_OSRS.method383(i ^ 0x677e);
			}
			anInt2330++;
			synchronized (((MapFunctions) this).aClass54_2337) {
				((MapFunctions) this).aClass54_2337.method383(i - 26298);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.E(" + i + ')');
		}
	}

	MapFunctions(Class101 class101, int i, CacheIndex config_index, CacheIndex sprite_index,
			CacheIndex config_index_osrs, CacheIndex sprite_index_osrs) {
		try {
			config_data = config_index;
			((MapFunctions) this).sprite_data = sprite_index;
			config_data_OSRS = config_index_osrs;
			((MapFunctions) this).sprite_data_OSRS = sprite_index_osrs;
			config_data.child_count(36);
			config_data_OSRS.child_count(35);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("pj.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ','
							+ (config_index != null ? "{...}" : "null") + ','
							+ (sprite_index != null ? "{...}" : "null") + ')'));
		}
	}
}
