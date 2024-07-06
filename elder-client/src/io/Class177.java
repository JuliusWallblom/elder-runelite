package io;

/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.zip.CRC32;

import io.cache.Revision;

public final class Class177 {
	static int anInt2483;
	CacheIndex spot_anim_model_index;
	CacheIndex osrs_spot_anim_model_index;
	
	public CacheIndex get_spot_anim_model_index(SpotAnimType gfx) {
		System.out.println("get gfx model index for rev " + gfx.revision.name());
		if (gfx.revision == Revision.OSRS) {
			return osrs_spot_anim_model_index;
		} else {
			return spot_anim_model_index;
		}
	}
	
	private CacheIndex spot_anim_data_index;
	private CacheIndex osrs_spot_anim_data_index;
	static int anInt2486;
	static int anInt2487;
	static int anInt2488;
	static int anInt2489;
	static int anInt2490;
	static int anInt2491;
	private HashMap spot_anim_cache = new HashMap(64), spot_anim_cache_osrs = new HashMap(64);
	static OutgoingPacket aClass201_2493 = new OutgoingPacket(15, -1);
	HashMap spot_anim_model_cache = new HashMap(30), spot_anim_model_cache_osrs = new HashMap(30);
	static long aLong2495;
	static CRC32 aCRC32_2496 = new CRC32();
	int anInt2497;
	static int anInt2498 = -1;

	static final Object method1159(byte i, boolean bool, byte[] is) {
		try {
			anInt2487++;
			if (is == null)
				return null;
			if (i != 109)
				aLong2495 = 94L;
			if ((is.length ^ 0xffffffff) < -137 && !TextureOperation.aBool4934) {
				try {
					Class82 class82 = (Class82) Class.forName("Class82_Sub1").newInstance();
					class82.method525(i - 107, is);
					return class82;
				} catch (Throwable throwable) {
					TextureOperation.aBool4934 = true;
				}
			}
			if (!bool)
				return is;
			return RuntimeException_Sub2.method2922(is, 1727);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qj.C(" + i + ',' + bool + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1160(int i, boolean bool) {
		try {
			anInt2490++;
			((Class177) this).anInt2497 = i;
			synchronized (((Class177) this).spot_anim_model_cache) {
				((Class177) this).spot_anim_model_cache.method369(bool);
			}
			synchronized (((Class177) this).spot_anim_model_cache_osrs) {
				((Class177) this).spot_anim_model_cache_osrs.method369(bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.A(" + i + ',' + bool + ')');
		}
	}

	final void method1161(int i, int i_0_) {
		try {
			anInt2486++;
			synchronized (spot_anim_cache) {
				spot_anim_cache.method380(i, -50);
				if (i_0_ != 64)
					aCRC32_2496 = null;
			}
			synchronized (spot_anim_cache_osrs) {
				spot_anim_cache_osrs.method380(i, -50);
				if (i_0_ != 64)
					aCRC32_2496 = null;
			}
			synchronized (((Class177) this).spot_anim_model_cache) {
				((Class177) this).spot_anim_model_cache.method380(i, -50);
			}
			synchronized (((Class177) this).spot_anim_model_cache_osrs) {
				((Class177) this).spot_anim_model_cache_osrs.method380(i, -50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.H(" + i + ',' + i_0_ + ')');
		}
	}

	final void method1162(int i) {
		try {
			synchronized (spot_anim_cache) {
				spot_anim_cache.method383(100);
			}
			synchronized (spot_anim_cache_osrs) {
				spot_anim_cache_osrs.method383(100);
			}
			anInt2483++;
			synchronized (((Class177) this).spot_anim_model_cache) {
				((Class177) this).spot_anim_model_cache.method383(101);
			}
			synchronized (((Class177) this).spot_anim_model_cache_osrs) {
				((Class177) this).spot_anim_model_cache_osrs.method383(101);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.B(" + i + ')');
		}
	}

	public static void method1163(byte i) {
		try {
			if (i == 109) {
				aCRC32_2496 = null;
				aClass201_2493 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.G(" + i + ')');
		}
	}
	
	final SpotAnimType list(int rand, int spot_anim_id, int revision, int from) {
		try {
			anInt2489++;
			SpotAnimType spot_anim_type;
			if (revision < 200) {
				synchronized (spot_anim_cache_osrs) {
					spot_anim_type = (SpotAnimType) spot_anim_cache_osrs.method379((long) spot_anim_id, (byte) 58);
				}
			} else {
				synchronized (spot_anim_cache) {
					spot_anim_type = (SpotAnimType) spot_anim_cache.method379((long) spot_anim_id, (byte) 58);
				}
			}
			if (spot_anim_type != null)
				return spot_anim_type;
			byte[] data;
			if (revision < 200) {
				data = osrs_spot_anim_data_index.get_file(spot_anim_id, 13);
			} else {
				data = spot_anim_data_index.get_file(Buffer.method2393(spot_anim_id, (byte) 80), Class_m.method749(79, spot_anim_id));
			}
			spot_anim_type = new SpotAnimType();
			((SpotAnimType) spot_anim_type).id = spot_anim_id;
			spot_anim_type.revision = revision < 200 ? Revision.OSRS : Revision.PRE_EOC_634;
			((SpotAnimType) spot_anim_type).aClass177_2077 = this;
			if (data != null)
				spot_anim_type.decode((byte) 3, new Buffer(data), revision < 200 ? Revision.OSRS : Revision.PRE_EOC_634);
			if (revision < 200) {
				synchronized (spot_anim_cache_osrs) {
					spot_anim_cache_osrs.method371(rand ^ ~0x89, (long) spot_anim_id, spot_anim_type);
				}
			} else {
				synchronized (spot_anim_cache) {
					spot_anim_cache.method371(rand ^ ~0x89, (long) spot_anim_id, spot_anim_type);
				}
			}
			return spot_anim_type;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.D(" + rand + ',' + spot_anim_id + ')');
		}
	}

	static final void method1165(byte i, boolean bool, int revision) {
		try {
			if (i <= -7) {
				Class221.method1433(-1, bool, Client.client_height, Widget.root_interface, Client.client_width, revision);
				anInt2491++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.E(" + i + ',' + bool + ')');
		}
	}

	final void method1166(boolean bool) {
		try {
			anInt2488++;
			synchronized (spot_anim_cache) {
				if (bool != true)
					aLong2495 = -36L;
				spot_anim_cache.method369(false);
			}
			synchronized (spot_anim_cache_osrs) {
				if (bool != true)
					aLong2495 = -36L;
				spot_anim_cache_osrs.method369(false);
			}
			synchronized (((Class177) this).spot_anim_model_cache) {
				((Class177) this).spot_anim_model_cache.method369(false);
			}
			synchronized (((Class177) this).spot_anim_model_cache_osrs) {
				((Class177) this).spot_anim_model_cache_osrs.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.F(" + bool + ')');
		}
	}

	Class177(Class101 class101, int i, CacheIndex data_index, CacheIndex model_index, CacheIndex osrs_data_index, CacheIndex osrs_model_index) {
		try {
			spot_anim_data_index = data_index;
			osrs_spot_anim_data_index = osrs_data_index;
			spot_anim_model_index = model_index;
			osrs_spot_anim_model_index = osrs_model_index;
			int i_3_ = -1 + spot_anim_data_index.method87((byte) 39);
			spot_anim_data_index.child_count(i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qj.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (data_index != null ? "{...}" : "null") + ',' + (model_index != null ? "{...}" : "null") + ')'));
		}
	}
}
