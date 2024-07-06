package io;

import io.cache.Revision;

final class UnderlayLoader {
	private HashMap underlay_cache = new HashMap(64), underlay_cache_OSRS = new HashMap(64);
	static int anInt1459;
	static int anInt1460;
	int anInt1461;
	static int anInt1462;
	private CacheIndex config_data, config_data_OSRS;
	static int anInt1464;
	static int anInt1465;
	static IncomingPacket aClass13_1466;
	int anInt1467 = 0;
	static boolean aBool1468;
	static int anInt1469;

	static final void method701(int i) {
		try {
			Class246_Sub28_Sub13.anInt6293 = 0;
			if (i != 4)
				aClass13_1466 = null;
			Class34.anInt451 = -1;
			anInt1464++;
			Class188.anInt2658 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kb.C(" + i + ')');
		}
	}

	final void method702(byte i) {
		try {
			synchronized (underlay_cache) {
				underlay_cache.method369(false);
			}
			synchronized (underlay_cache_OSRS) {
				underlay_cache_OSRS.method369(false);
			}
			if (i == -128)
				anInt1465++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kb.D(" + i + ')');
		}
	}

	final PacketsDecoder method703(int i, int i_0_) {
		try {
			anInt1462++;
			PacketsDecoder class_is;
			if (MapRegion.get_revision_by_region() == Revision.OSRS) {
				synchronized (underlay_cache_OSRS) {
					class_is = (PacketsDecoder) underlay_cache_OSRS.method379((long) i_0_, (byte) 58);
				}
			} else {
				synchronized (underlay_cache) {
					class_is = (PacketsDecoder) underlay_cache.method379((long) i_0_, (byte) 58);
				}
			}
			if (class_is != null)
				return class_is;
			byte[] is = null;
			if (MapRegion.get_revision_by_region() == Revision.OSRS) {
				is = config_data_OSRS.get_file(i_0_, i);
			} else {
				is = config_data.get_file(i_0_, i);
			}
			class_is = new PacketsDecoder();
			((PacketsDecoder) class_is).aClass105_272 = this;
			((PacketsDecoder) class_is).anInt288 = i_0_;
			if (is != null)
				class_is.decode(i - 90, new Buffer(is));
			class_is.method181(false);
			if (MapRegion.get_revision_by_region() == Revision.OSRS) {
				synchronized (underlay_cache_OSRS) {
					underlay_cache_OSRS.method371(i ^ 0x5, (long) i_0_, class_is);
				}
			} else {
				synchronized (underlay_cache) {
					underlay_cache.method371(i ^ 0x5, (long) i_0_, class_is);
				}
			}
			return class_is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kb.B(" + i + ',' + i_0_ + ')');
		}
	}

	final void method704(int i) {
		try {
			synchronized (underlay_cache) {
				underlay_cache.method383(116);
			}
			synchronized (underlay_cache_OSRS) {
				underlay_cache_OSRS.method383(116);
			}
			if (i != -1)
				aBool1468 = true;
			anInt1460++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kb.F(" + i + ')');
		}
	}

	final void method705(int i, boolean bool) {
		try {
			synchronized (underlay_cache) {
				underlay_cache.method380(i, -50);
				if (bool != false)
					method704(57);
			}
			synchronized (underlay_cache_OSRS) {
				underlay_cache_OSRS.method380(i, -50);
				if (bool != false)
					method704(57);
			}
			anInt1459++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kb.A(" + i + ',' + bool + ')');
		}
	}

	public static void method706(int i) {
		do {
			try {
				aClass13_1466 = null;
				if (i == 4)
					break;
				aClass13_1466 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "kb.E(" + i + ')');
			}
			break;
		} while (false);
	}

	UnderlayLoader(Class101 class101, int i, CacheIndex class_fs, CacheIndex class_fs2) {
		try {
			config_data = class_fs;
			config_data_OSRS = class_fs2;
			((UnderlayLoader) this).anInt1461 = config_data.child_count(4);
			((UnderlayLoader) this).anInt1461 = config_data_OSRS.child_count(4);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kb.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		new MultilingualString("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es sp\u00e4ter erneut.", "Impossible de participer \u00e0 une discussion de clan pour le moment - veuillez r\u00e9essayer ult\u00e9rieurement.", "N\u00e3o foi poss\u00edvel entrar no bate-papo do cl\u00e3 dessa vez. Tente de novo depois!");
		aClass13_1466 = new IncomingPacket(37, 8);
		aBool1468 = false;
	}
}
