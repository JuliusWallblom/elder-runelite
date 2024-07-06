package io;

final class EnumLoader {
	static int anInt2041;
	static IncomingPacket aClass13_2042;
	static Class198 aClass198_2043;
	static int anInt2044;
	private CacheIndex enum_cache_index_634, enum_cache_index_osrs, enum_cache_index_550;
	static int anInt2046 = 205;
	public static HashMap enum_cache_634 = new HashMap(128);
	static HashMap enum_cache_osrs = new HashMap(128);
	public static HashMap enum_cache_550 = new HashMap(128);

	public static void method953(int i) {
		do {
			try {
				aClass13_2042 = null;
				aClass198_2043 = null;
				if (i == 1)
					break;
				method953(-122);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ng.B(" + i + ')');
			}
			break;
		} while (false);
	}
	
	final EnumType list(int enum_id, int i_0_, int revision) {
		try {
			anInt2041++;
			EnumType class183;
			if (revision < 200) {
				synchronized (enum_cache_osrs) {
					class183 = (EnumType) enum_cache_osrs.method379((long) enum_id, (byte) 58);
				}
			} else if (revision == 550) {
				synchronized (enum_cache_550) {
					class183 = (EnumType) enum_cache_550.method379((long) enum_id, (byte) 58);
				}
			} else {
				synchronized (enum_cache_634) {
					class183 = (EnumType) enum_cache_634.method379((long) enum_id, (byte) 58);
				}
			}
			if (class183 != null)
				return class183;
			byte[] is;
			if (revision < 200) {
				is = enum_cache_index_osrs.get_file(enum_id, 8);
			} else if (revision == 550) {
				is = enum_cache_index_550.get_file(Class91.method580(enum_id, false), Class109_Sub1.method1761(false, enum_id));
			} else {
				is = enum_cache_index_634.get_file(Class91.method580(enum_id, false), Class109_Sub1.method1761(false, enum_id));
			}
			class183 = new EnumType();
			if (is != null)
				class183.method1181(19207, new Buffer(is), revision);
			if (revision < 200) {
				synchronized (enum_cache_osrs) {
					enum_cache_osrs.method371(1, (long) enum_id, class183);
				}
			} else if (revision == 550) {
				synchronized (enum_cache_550) {
					enum_cache_550.method371(1, (long) enum_id, class183);
				}
			} else {
				synchronized (enum_cache_634) {
					enum_cache_634.method371(1, (long) enum_id, class183);
				}
			}
			
			return class183;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ng.A(" + enum_id + ',' + i_0_ + ')');
		}
	}

	final EnumType list(int enum_id, int i_0_) {
		return list(enum_id, i_0_, 634);
	}

	EnumLoader(Class101 class101, int i, CacheIndex class_fs, CacheIndex class_fs2, CacheIndex class_fs3) {
		do {
			try {
				enum_cache_index_634 = class_fs;
				enum_cache_index_osrs = class_fs2;
				enum_cache_index_550 = class_fs3;
				int i_2_ = -1 + enum_cache_index_634.method87((byte) 39);
				enum_cache_index_634.child_count(i_2_);
				i_2_ = -1 + enum_cache_index_osrs.method87((byte) 39);
				enum_cache_index_osrs.child_count(i_2_);
				i_2_ = -1 + enum_cache_index_550.method87((byte) 39);
				enum_cache_index_550.child_count(i_2_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ng.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass13_2042 = new IncomingPacket(38, 1);
	}
}
