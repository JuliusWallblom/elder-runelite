package io;

final class StructLoader {
	static int anInt799;
	static int anInt800;
	static IncomingPacket aClass13_801 = new IncomingPacket(39, 8);
	static int anInt802;
	public static CacheIndex struct_data, osrs_struct_data;
	static int anInt804;
	public static HashMap struct_cache = new HashMap(256), osrs_struct_cache = new HashMap(256);
	static int anInt806;
	static int anInt807;
	static int anInt808;
	static Class12 aClass12_809 = new Class12(3, 7);
	static OutgoingPacket aClass201_810 = new OutgoingPacket(78, -1);
	static Class174[] aClass174Array811;

	static final boolean method390(int i, int i_0_) {
		try {
			anInt802++;
			if (i_0_ == 18 || (i_0_ ^ 0xffffffff) == -46 || (i_0_ ^ 0xffffffff) == -24 || (i_0_ ^ 0xffffffff) == -26 || i_0_ == 1007)
				return true;
			if (i > -96)
				return false;
			if (i_0_ == 30 || i_0_ == 1010)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.H(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method391(byte i) {
		try {
			if (i == 28) {
				anInt806++;
				Class246_Sub4.anInt3869 = 0;
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -2049; i_1_++) {
					ObjType.aStreamArray2770[i_1_] = null;
					Class234.movementTypes[i_1_] = (byte) 1;
					Class166.aClass240Array2365[i_1_] = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.E(" + i + ')');
		}
	}

	final void method392(byte i) {
		try {
			synchronized (struct_cache) {
				struct_cache.method369(false);
			}
			synchronized (osrs_struct_cache) {
				osrs_struct_cache.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.F(" + i + ')');
		}
	}

	final void method393(boolean bool, int i) {
		try {
			anInt807++;
			if (bool == true) {
				synchronized (struct_cache) {
					struct_cache.method380(i, -50);
				}
				synchronized (osrs_struct_cache) {
					osrs_struct_cache.method380(i, -50);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.A(" + bool + ',' + i + ')');
		}
	}

	static final void method394(byte i) {
		try {
			int i_3_ = -53 / ((58 - i) / 63);
			Sprite.aClass246_Sub37_Sub1_433.method2515(2);
			anInt800++;
			Class12.anInt182 = 1;
			Class_m.aClass_fs1545 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.B(" + i + ')');
		}
	}

	final void method395(int i) {
		try {
			anInt804++;
			if (i == -2049) {
				synchronized (struct_cache) {
					struct_cache.method383(115);
				}
				synchronized (osrs_struct_cache) {
					osrs_struct_cache.method383(115);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.G(" + i + ')');
		}
	}
	
	public static StructType list(int i, int i_4_, int revision) {
		try {
			anInt799++;
			StructType class246_sub1_sub18;
			if (revision < 200) {
				synchronized (osrs_struct_cache) {
					class246_sub1_sub18 = (StructType) osrs_struct_cache.method379((long) i, (byte) 58);
				}
			} else {
				synchronized (struct_cache) {
					class246_sub1_sub18 = (StructType) struct_cache.method379((long) i, (byte) 58);
				}
			}
			if (class246_sub1_sub18 != null)
				return class246_sub1_sub18;
			byte[] is;
			if (revision < 200) {
				is = osrs_struct_data.get_file(i, 34);
			} else {
				is = struct_data.get_file(i, 26);
			}
			class246_sub1_sub18 = new StructType();
			if (is != null) {
				class246_sub1_sub18.decode(76, new Buffer(is), revision < 200);
			}
			if (revision < 200) {
				synchronized (osrs_struct_cache) {
					osrs_struct_cache.method371(1, (long) i, class246_sub1_sub18);
				}
			} else {
				synchronized (struct_cache) {
					struct_cache.method371(1, (long) i, class246_sub1_sub18);
				}
			}
			return class246_sub1_sub18;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.C(" + i + ',' + i_4_ + ')');
		}
	}

	public static void method397(boolean bool) {
		do {
			try {
				aClass13_801 = null;
				aClass12_809 = null;
				aClass201_810 = null;
				aClass174Array811 = null;
				if (bool == false)
					break;
				aClass174Array811 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ff.D(" + bool + ')');
			}
			break;
		} while (false);
	}

	StructLoader(Class101 class101, int i, CacheIndex class_fs, CacheIndex class_fs_2) {
		try {
			struct_data = class_fs;
			struct_data.child_count(26);
			osrs_struct_data = class_fs_2;
			osrs_struct_data.child_count(26);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ff.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}
}
