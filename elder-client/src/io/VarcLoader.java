package io;

final class VarcLoader {
	static int anInt990;
	int varc_size_634, varc_size_550, varc_size_osrs;
	static Class166 aClass166_992;
	static AbstractSprite aClass_l993;
	private CacheIndex varc_data_634, varc_data_550, varc_data_osrs;
	private HashMap varc_cache_634 = new HashMap(64), varc_cache_550 = new HashMap(64), varc_cache_osrs = new HashMap(64);
	static int[] anIntArray996 = new int[32];
	static int anInt997;
	static int anInt998;
	static Class246_Sub24 aClass246_Sub24_999;
	static IncomingPacket aClass13_1000;
	static Class255_Sub1 aClass255_Sub1_1001;
	static Npc[] aClass_r_Sub2Array1002;

	final VarcType list(int i, int i_0_, int revision) {
		try {
			anInt990++;
			VarcType class225;
			if (revision < 200) {
				synchronized (varc_cache_osrs) {
					class225 = (VarcType) varc_cache_osrs.method379((long) i_0_, (byte) 58);
				}
			} else if (revision == 550) {
				synchronized (varc_cache_550) {
					class225 = (VarcType) varc_cache_550.method379((long) i_0_, (byte) 58);
				}
			} else {
				synchronized (varc_cache_634) {
					class225 = (VarcType) varc_cache_634.method379((long) i_0_, (byte) 58);
				}
			}
			if (class225 != null)
				return class225;
			byte[] is;
			if (revision < 200) {
				is = varc_data_osrs.get_file(i_0_, 19);
			} else if (revision == 550) {
				is = varc_data_550.get_file(i_0_, 19);
			} else {
				is = varc_data_634.get_file(i_0_, 19);
			}
			class225 = new VarcType();
			if (i <= 114)
				aClass_l993 = null;
			if (is != null)
				class225.method1447(new Buffer(is), (byte) -105);
			if (revision < 200) {
				synchronized (varc_cache_osrs) {
					varc_cache_osrs.method371(1, (long) i_0_, class225);
				}
			} else if (revision == 550) {
				synchronized (varc_cache_550) {
					varc_cache_550.method371(1, (long) i_0_, class225);
				}
			} else {
				synchronized (varc_cache_634) {
					varc_cache_634.method371(1, (long) i_0_, class225);
				}
			}
			return class225;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "he.A(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method478(byte i) {
		try {
			aClass166_992 = null;
			aClass13_1000 = null;
			if (i <= 115)
				method478((byte) 10);
			aClass_r_Sub2Array1002 = null;
			anIntArray996 = null;
			aClass255_Sub1_1001 = null;
			aClass246_Sub24_999 = null;
			aClass_l993 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "he.B(" + i + ')');
		}
	}

	VarcLoader(Class101 class101, int i, CacheIndex class_fs, CacheIndex class_fs2, CacheIndex class_fs3) {
		try {
			varc_data_634 = class_fs;
			varc_data_550 = class_fs2;
			varc_data_osrs = class_fs3;
			((VarcLoader) this).varc_size_634 = varc_data_634.child_count(19);
			((VarcLoader) this).varc_size_550 = varc_data_550.child_count(19);
			((VarcLoader) this).varc_size_osrs = varc_data_osrs.child_count(19);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("he.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass166_992 = new Class166();
		aClass13_1000 = new IncomingPacket(91, -1);
		aClass_r_Sub2Array1002 = new Npc[32768];
	}
}
