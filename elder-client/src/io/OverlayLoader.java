package io;

import io.cache.Revision;

final class OverlayLoader {
	private HashMap floor_cache = new HashMap(128), floor_cache_OSRS = new HashMap(128);
	private CacheIndex floor_data, floor_data_OSRS;
	static int anInt2471;
	static int anInt2472;
	static int anInt2473;
	static int anInt2474;
	static int anInt2475;

	final void method1150(byte i, int i_0_) {
		try {
			int i_1_ = 126 / ((49 - i) / 39);
			anInt2472++;
			synchronized (floor_cache) {
				floor_cache.method380(i_0_, -50);
			}
			synchronized (floor_cache_OSRS) {
				floor_cache_OSRS.method380(i_0_, -50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qd.C(" + i + ',' + i_0_ + ')');
		}
	}

	final FloorDefinition list(int i, int i_2_) {
		try {
			anInt2473++;
			FloorDefinition class207;
			if (MapRegion.get_revision_by_region() == Revision.OSRS) {
				synchronized (floor_cache_OSRS) {
					class207 = (FloorDefinition) floor_cache_OSRS.method379((long) i_2_, (byte) 58);
				}
			} else {
				synchronized (floor_cache) {
					class207 = (FloorDefinition) floor_cache.method379((long) i_2_, (byte) 58);
				}
			}
			if (class207 != null)
				return class207;
			byte[] is = null;
			if (MapRegion.get_revision_by_region() == Revision.OSRS) {
				is = floor_data_OSRS.get_file(i_2_, 1);
			} else {
				is = floor_data.get_file(i_2_, 1);
			}
			class207 = new FloorDefinition();
			if (i != -18411)
				method1154(41);
			if (is != null)
				class207.decode(-1, new Buffer(is));
			if (MapRegion.get_revision_by_region() == Revision.OSRS) {
				synchronized (floor_cache_OSRS) {
					floor_cache_OSRS.method371(1, (long) i_2_, class207);
				}
			} else {
				synchronized (floor_cache) {
					floor_cache.method371(1, (long) i_2_, class207);
				}
			}
			return class207;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qd.B(" + i + ',' + i_2_ + ')');
		}
	}

	static final void method1152(int i, int i_3_, int i_4_, int i_5_) {
		Tile class147 = Class106.tiles[i][i_3_][i_4_];
		if (class147 != null) {
			Class59_Sub2 class59_sub2 = ((Tile) class147).aClass59_Sub2_2153;
			Class59_Sub2 class59_sub2_6_ = ((Tile) class147).aClass59_Sub2_2159;
			if (class59_sub2 != null) {
				((Class59_Sub2) class59_sub2).anInt4540 = (((Class59_Sub2) class59_sub2).anInt4540 * i_5_
						/ (16 << Class126.anInt1781 - 7));
				((Class59_Sub2) class59_sub2).anInt4541 = (((Class59_Sub2) class59_sub2).anInt4541 * i_5_
						/ (16 << Class126.anInt1781 - 7));
			}
			if (class59_sub2_6_ != null) {
				((Class59_Sub2) class59_sub2_6_).anInt4540 = (((Class59_Sub2) class59_sub2_6_).anInt4540 * i_5_
						/ (16 << Class126.anInt1781 - 7));
				((Class59_Sub2) class59_sub2_6_).anInt4541 = (((Class59_Sub2) class59_sub2_6_).anInt4541 * i_5_
						/ (16 << Class126.anInt1781 - 7));
			}
		}
	}

	final void method1153(int i) {
		try {
			synchronized (floor_cache) {
				if (i <= 87)
					method1154(71);
				floor_cache.method369(false);
			}
			synchronized (floor_cache_OSRS) {
				if (i <= 87)
					method1154(71);
				floor_cache_OSRS.method369(false);
			}
			anInt2471++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qd.E(" + i + ')');
		}
	}

	OverlayLoader(Class101 class101, int i, CacheIndex floor_data_index, CacheIndex floor_data_index2) {
		try {
			floor_data = floor_data_index;
			floor_data_OSRS = floor_data_index2;
			floor_data.child_count(1);
			floor_data_OSRS.child_count(1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qd.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i
					+ ',' + (floor_data_index != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1154(int i) {
		try {
			synchronized (floor_cache) {
				floor_cache.method383(80);
				if (i != 7)
					floor_cache = null;
			}
			synchronized (floor_cache_OSRS) {
				floor_cache_OSRS.method383(80);
				if (i != 7)
					floor_cache_OSRS = null;
			}
			anInt2474++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qd.A(" + i + ')');
		}
	}

	static {
		new MultilingualString("To prevent further mutes please read the rules.",
				"Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.",
				"Pour \u00e9viter un nouveau blocage, lisez le r\u00e8glement.",
				"Para evitar outros vetos, leia as regras.");
	}
}
