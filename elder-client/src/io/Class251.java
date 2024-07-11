package io;

import io.cache.Cache;
/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import io.cache.IndexConstants;
import io.cache.Revision;
import jagex3.jagmisc.jagmisc;

public final class Class251 {
	static int anInt3536;
	static int anInt3537;
	static int anInt3538;
	boolean aBool3539;
	static int anInt3540;
	static int anInt3541;
	static int anInt3542;
	static int anInt3543;
	static int anInt3544;
	static int anInt3545;
	static String[] aStringArray3546;
	boolean aBool3547 = false;
	static int anInt3548;
	HashMap object_cache = new HashMap(64), object_cache_OSRS = new HashMap(64);
	CacheIndex object_model_cache;
	CacheIndex osrs_object_model_cache;

	public CacheIndex get_object_model_cache(int id) {
		if (list(id, -1).revision == Revision.OSRS) {
			return osrs_object_model_cache;
		} else {
			return object_model_cache;
		}
	}

	static IterableNodeHashTable aClass85_3551;
	static int[] anIntArray3552 = new int[250];
	private CacheIndex object_data_cache;
	private CacheIndex osrs_object_data_cache;
	HashMap aClass54_3554 = new HashMap(500);
	static int[][] anIntArrayArray3555 = { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 },
			{ 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 },
			{ 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
	static boolean[][] aBoolArrayArray3556;
	HashMap aClass54_3557 = new HashMap(30);
	HashMap aClass54_3558 = new HashMap(50);
	int anInt3559;

	final void method1605(byte i) {
		try {
			anInt3544++;
			synchronized (object_cache) {
				if (i != -24)
					method1608(25, true);
				object_cache.method369(false);
			}
			synchronized (object_cache_OSRS) {
				if (i != -24)
					method1608(25, true);
				object_cache_OSRS.method369(false);
			}
			synchronized (((Class251) this).aClass54_3554) {
				((Class251) this).aClass54_3554.method369(false);
			}
			synchronized (((Class251) this).aClass54_3557) {
				((Class251) this).aClass54_3557.method369(false);
			}
			synchronized (((Class251) this).aClass54_3558) {
				((Class251) this).aClass54_3558.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.I(" + i + ')');
		}
	}

	final void method1606(int i, int i_0_) {
		try {
			synchronized (object_cache) {
				object_cache.method380(i, -50);
			}
			synchronized (object_cache_OSRS) {
				object_cache_OSRS.method380(i, -50);
			}
			anInt3538++;
			synchronized (((Class251) this).aClass54_3554) {
				((Class251) this).aClass54_3554.method380(i, -50);
			}
			synchronized (((Class251) this).aClass54_3557) {
				((Class251) this).aClass54_3557.method380(i, i_0_ - 56);
			}
			synchronized (((Class251) this).aClass54_3558) {
				((Class251) this).aClass54_3558.method380(i, -50);
				if (i_0_ != 6)
					method1605((byte) 34);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.D(" + i + ',' + i_0_ + ')');
		}
	}

	final void method1607(byte i) {
		try {
			anInt3548++;
			synchronized (object_cache) {
				object_cache.method383(82);
			}
			synchronized (object_cache_OSRS) {
				object_cache_OSRS.method383(82);
			}
			synchronized (((Class251) this).aClass54_3554) {
				((Class251) this).aClass54_3554.method383(102);
			}
			synchronized (((Class251) this).aClass54_3557) {
				((Class251) this).aClass54_3557.method383(90);
				int i_1_ = 59 % ((i - 12) / 54);
			}
			synchronized (((Class251) this).aClass54_3558) {
				((Class251) this).aClass54_3558.method383(87);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.A(" + i + ')');
		}
	}

	final void method1608(int i, boolean bool) {
		try {
			anInt3536++;
			((Class251) this).anInt3559 = i;
			synchronized (((Class251) this).aClass54_3554) {
				((Class251) this).aClass54_3554.method369(bool);
			}
			synchronized (((Class251) this).aClass54_3557) {
				((Class251) this).aClass54_3557.method369(bool);
			}
			synchronized (((Class251) this).aClass54_3558) {
				((Class251) this).aClass54_3558.method369(bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.K(" + i + ',' + bool + ')');
		}
	}

	public static void method1609(boolean bool) {
		try {
			anIntArray3552 = null;
			if (bool != false)
				aClass85_3551 = null;
			aClass85_3551 = null;
			anIntArrayArray3555 = null;
			aBoolArrayArray3556 = null;
			aStringArray3546 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.E(" + bool + ')');
		}
	}

	public LocType list(int loc_id, int i_2_, Revision revision) {
		try {
			LocType loc_type;
			if (revision == Revision.OSRS) {
				synchronized (object_cache_OSRS) {
					loc_type = (LocType) object_cache_OSRS.method379((long) loc_id, (byte) 58);
				}
			} else {
				synchronized (object_cache) {
					loc_type = (LocType) object_cache.method379((long) loc_id, (byte) 58);
				}
			}
			if (loc_type != null)
				return loc_type;
			byte[] data;
			if (revision == Revision.OSRS) {
				data = osrs_object_data_cache.get_file(loc_id, 6);
			} else {
				data = object_data_cache.get_file(Class12.method138(loc_id, (byte) -98),
						Class166.method1106(loc_id, false));
			}
			loc_type = new LocType();
			((LocType) loc_type).aClass302_2963 = this;
			((LocType) loc_type).id = loc_id;
			loc_type.revision = revision;
			if (data != null) {
				loc_type.decode(new Buffer(data), revision == Revision.OSRS, loc_id);
			}
			if (revision == Revision.OSRS) {
				loc_type.post_decode();
				if (loc_type.hollow) {
					loc_type.interact_type = 0;
					loc_type.blocks_projectile = false;
				}
			} else {
				loc_type.post_decode((byte) -73);
				if (!((Class251) this).aBool3539 && ((LocType) loc_type).aBool2618) {
					((LocType) loc_type).actions = null;
					((LocType) loc_type).f_nb = null;
				}
				if (((LocType) loc_type).hollow) {
					((LocType) loc_type).interact_type = 0;
					((LocType) loc_type).blocks_projectile = false;
				}
			}
			if (revision == Revision.OSRS) {
				synchronized (object_cache_OSRS) {
					object_cache_OSRS.method371(1, (long) loc_id, loc_type);
				}
			} else {
				synchronized (object_cache) {
					object_cache.method371(1, (long) loc_id, loc_type);
				}
			}
			return loc_type;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public LocType list(int loc_id, int i_2_) {
		return list(loc_id, i_2_, Revision.OSRS);
	}

	static final void method1611(int i, boolean bool, int i_3_) {
		try {
			if (i_3_ != 0) {
				if (bool) {
					Client.sprite_loader = SceneGraph.method1682((Class246_Sub37_Sub1.textureLoader), 0,
							GameEngine.canvas, 0, (byte) 90, Client.sign_link);
					Client.sprite_loader.p(0);
					FontMetric class73 = Class129.method878(6, 0, Class36.f_ib,
							Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
					Font class116 = (Client.sprite_loader.method1716(class73,
							LDSprite.method129(Cache.get_index(Settings.gamefonts, "sprites"), Class36.f_ib, 0), true));
					Class_w.method2650(true, Class250.aClass67_3531.get(Preferences.language_code), class116, 13);
					Client.sprite_loader.method1688();
					Class246_Sub28_Sub30.method2834((byte) 118);
					Client.sprite_loader.method1708(true);
				}
				try {
					Client.sprite_loader = SceneGraph.method1682((Class246_Sub37_Sub1.textureLoader),
							(((Renderer) (Client.current_renderer)).anInt588 * 2), GameEngine.canvas,
							i_3_, (byte) -30, Client.sign_link);
					if (Client.sprite_loader.method1741()) {
						boolean bool_4_ = true;
						try {
							bool_4_ = (jagmisc.getTotalPhysicalMemory() > 268435456L);
						} catch (Throwable throwable) {
							/* empty */
						}
						Class_u class_u;
						if (bool_4_)
							class_u = Client.sprite_loader.method1725(146800640);
						else
							class_u = Client.sprite_loader.method1725(104857600);
						Client.sprite_loader.method1685(class_u);
					}
				} catch (Throwable throwable) {
					Client.sprite_loader = SceneGraph.method1682((Class246_Sub37_Sub1.textureLoader), 0,
							GameEngine.canvas, 0, (byte) 109, Client.sign_link);
					i_3_ = 0;
				}
			} else
				Client.sprite_loader = SceneGraph.method1682((Class246_Sub37_Sub1.textureLoader),
						2 * ((Renderer) (Client.current_renderer)).anInt588, GameEngine.canvas, i_3_,
						(byte) 62, Client.sign_link);
			anInt3540++;
			if (i != -27345)
				anIntArrayArray3555 = null;
			Buffer.anInt5656 = i_3_;
			Class106_Sub1.method1890((byte) 3);
			if (!Client.sprite_loader.method1705())
				Texture.anInt6562 = 1;
			Client.sprite_loader.method1724(Texture.anInt6562);
			Client.sprite_loader.method1714(0);
			Client.sprite_loader.MA(8);
			Class130_Sub3.aClass_c4413 = Client.sprite_loader.method1715();
			Class134.aClass_c1879 = Client.sprite_loader.method1715();
			Class246_Sub19.method2070(17569);
			Client.sprite_loader.method1678(!((Renderer) (Client.current_renderer)).aBool586);
			if (Client.sprite_loader.method1693())
				Class196.method1280(-14734, (((Renderer) (Client.current_renderer)).aBool596));
			Class136.method925(Class152.anInt2205 >> 3, Client.sprite_loader, Class38_Sub1_Sub1.anInt6770 >> 3,
					92);
			ParamType.method815((byte) -36);
			RuntimeException_Sub2.aBool7148 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wf.H(" + i + ',' + bool + ',' + i_3_ + ')'));
		}
	}

	final void method1612(byte i, boolean bool) {
		do {
			try {
				anInt3541++;
				if (!bool == ((Class251) this).aBool3547) {
					((Class251) this).aBool3547 = bool;
					method1605((byte) -24);
					if (i == 114)
						break;
					anIntArrayArray3555 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wf.B(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method1613(int i, int i_5_, SceneGraph class260, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_,
			int i_11_, int i_12_, int i_13_, int i_14_, byte[][][] is) {
		try {
			anInt3542++;
			if ((i_13_ ^ 0xffffffff) != -1 && i_5_ != 0) {
				if (i_6_ != 6)
					method1613(-11, -30, null, 82, -115, 83, -89, -83, -21, 111, 95, -96, null);
				if (i_13_ == 9) {
					i = i + 1 & 0x3;
					i_13_ = 1;
				}
				if ((i_13_ ^ 0xffffffff) == -11) {
					i = i + 3 & 0x3;
					i_13_ = 1;
				}
				if (i_13_ == 11) {
					i_13_ = 8;
					i = 3 + i & 0x3;
				}
				class260.DA(i_11_, i_12_, i_8_, i_9_, i_7_, i_14_, is[-1 + i_13_][i], i_5_, i_10_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wf.J(" + i + ',' + i_5_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_
							+ ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ','
							+ i_14_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1614(boolean bool, byte i) {
		try {
			anInt3545++;
			if (i > 119 && !bool == ((Class251) this).aBool3539) {
				((Class251) this).aBool3539 = bool;
				method1605((byte) -24);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.G(" + bool + ',' + i + ')');
		}
	}

	final void method1615(int i, int i_15_) {
		try {
			anInt3543++;
			if (i != -27578)
				((Class251) this).aBool3539 = true;
			object_cache = new HashMap(i_15_);
			object_cache_OSRS = new HashMap(i_15_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.C(" + i + ',' + i_15_ + ')');
		}
	}

	Class251(Class101 class101, int i, boolean bool, CacheIndex data_cache, CacheIndex model_cache,
			CacheIndex osrs_data_cache, CacheIndex osrs_model_cache) {
		do {
			try {
				object_data_cache = data_cache;
				osrs_object_data_cache = osrs_data_cache;
				((Class251) this).aBool3539 = bool;
				((Class251) this).object_model_cache = model_cache;
				((Class251) this).osrs_object_model_cache = osrs_model_cache;
				if (object_data_cache == null)
					break;
				int i_17_ = object_data_cache.method87((byte) 39) - 1;
				object_data_cache.child_count(i_17_);
				if (osrs_object_data_cache == null)
					break;
				i_17_ = osrs_object_data_cache.method87((byte) 39) - 1;
				osrs_object_data_cache.child_count(i_17_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("wf.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + bool + ','
								+ (data_cache != null ? "{...}" : "null") + ','
								+ (model_cache != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass85_3551 = new IterableNodeHashTable(64);
	}
}
