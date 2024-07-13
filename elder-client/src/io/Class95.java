package io;

import io.cache.Revision;

final class Class95 implements Interface11 {
	static CollisionMap[] aClass199Array1235 = new CollisionMap[4];
	static int anInt1236;
	static int anInt1237;
	static int anInt1238;
	static int anInt1239;
	static Class81 aClass81_1241 = new Class81(4, 1, 1, 1);
	public int[] updated_varps_634, updated_varps_550, updated_varps_osrs;
	private IterableNodeHashTable aClass85_1243 = new IterableNodeHashTable(128);
	static int anInt1245;
	static int anInt1246;
	static int anInt1247;
	static int anInt1248;
	static int anInt1249;
	static int anInt1250;
	static int[] anIntArray1251;
	static int anInt1252;
	static int anInt1253 = 0;

	public int[] get_updated_varps(int revision) {
		if (revision == 0) {
			return updated_varps_osrs;
		} else if (revision == 1) {
			return updated_varps_550;
		} else if (revision < 200) {
			return updated_varps_osrs;
		} else if (revision == 550) {
			return updated_varps_550;
		} else {
			return updated_varps_634;
		}
	}

	public static void method603(boolean bool) {
		do {
			try {
				aClass199Array1235 = null;
				anIntArray1251 = null;
				aClass81_1241 = null;
				if (bool == false)
					break;
				anInt1252 = -42;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "it.I(" + bool + ')');
			}
			break;
		} while (false);
	}

	final void method604(int i, int i_0_, int i_1_, int revision) {
		try {
			anInt1248++;
			Varbit class108 = Class246_Sub30_Sub1.aClass17_5761.list(i_0_, i_1_ ^ ~0xff, revision);
			int i_2_ = ((Varbit) class108).index;
			int i_3_ = ((Varbit) class108).least_significant_bit;
			int i_4_ = ((Varbit) class108).most_significant_bit;
			int i_5_ = Class246_Sub1_Sub3.anIntArray5702[i_4_ + -i_3_];
			if (i_1_ > i || (i_5_ ^ 0xffffffff) > (i ^ 0xffffffff))
				i = 0;
			i_5_ <<= i_3_;
			method606(114, i_2_, i_5_ & i << i_3_ | ((i_5_ ^ 0xffffffff) & get_updated_varps(revision)[i_2_]),
					revision);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("it.A(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void reset(int i, Revision revision) {
		try {
			anInt1239++;
			for (int i_6_ = 0; (((Class209) SubIncomingPacket.aClass209_7085).varp_size_550 ^ 0xffffffff) < (i_6_
					^ 0xffffffff); i_6_++) {
				VarpType class93 = SubIncomingPacket.aClass209_7085.list(i_6_, -10231, Revision.PRE_EOC_550);
				if (class93 != null && (((VarpType) class93).clientCode ^ 0xffffffff) == -1) {
					updated_varps_550[i_6_] = 0;
					VarpType.varp_cache_550[i_6_] = 0;
				}
			}
			for (int i_6_ = 0; (((Class209) SubIncomingPacket.aClass209_7085).varp_size_634 ^ 0xffffffff) < (i_6_
					^ 0xffffffff); i_6_++) {
				VarpType class93 = SubIncomingPacket.aClass209_7085.list(i_6_, -10231, Revision.PRE_EOC_634);
				if (class93 != null && (((VarpType) class93).clientCode ^ 0xffffffff) == -1) {
					updated_varps_634[i_6_] = 0;
					VarpType.varp_cache_634[i_6_] = 0;
				}
			}
			for (int i_6_ = 0; (((Class209) SubIncomingPacket.aClass209_7085).varp_size_osrs ^ 0xffffffff) < (i_6_
					^ 0xffffffff); i_6_++) {
				VarpType class93 = SubIncomingPacket.aClass209_7085.list(i_6_, -10231, Revision.OSRS);
				if (class93 != null && (((VarpType) class93).clientCode ^ 0xffffffff) == -1) {
					updated_varps_osrs[i_6_] = 0;
					VarpType.varp_cache_osrs[i_6_] = 0;
				}
			}
			aClass85_1243 = new IterableNodeHashTable(128);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.E(" + i + ')');
		}
	}

	final void method606(int i, int i_8_, int i_9_, int revision) {
		try {
			get_updated_varps(revision)[i_8_] = i_9_;
			anInt1245++;
			int i_10_ = -105 % ((-64 - i) / 44);
			Class246_Sub23 class246_sub23 = (Class246_Sub23) aClass85_1243.get((long) i_8_);
			if (class246_sub23 != null) {
				if (((Class246_Sub23) class246_sub23).aLong4822 != 4611686018427387905L)
					((Class246_Sub23) class246_sub23).aLong4822 = (500L + TimeUtility.time() | 0x4000000000000000L);
			} else {
				class246_sub23 = new Class246_Sub23(4611686018427387905L);
				aClass85_1243.method547((long) i_8_, -2301, class246_sub23);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("it.F(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	final void setIntVarp(int id, int value, int revision) {
		if (revision == 0) {
			VarpType.varp_cache_osrs[id] = value;
		} else if (revision == 1) {
			VarpType.varp_cache_550[id] = value;
		} else if (revision < 200) {
			VarpType.varp_cache_osrs[id] = value;
		} else if (revision == 550) {
			VarpType.varp_cache_550[id] = value;
		} else {
			VarpType.varp_cache_634[id] = value;
		}
		Class246_Sub23 class246_sub23 = (Class246_Sub23) aClass85_1243.get((long) id);
		if (class246_sub23 != null) {
			((Class246_Sub23) class246_sub23).aLong4822 = 500L + TimeUtility.time();
		} else {
			class246_sub23 = new Class246_Sub23(TimeUtility.time() + 500L);
			aClass85_1243.method547((long) id, -2301, class246_sub23);
		}
	}

	public final int getVarBitValue(byte i, int varbit_id, int revision) {
		try {
			anInt1237++;
			if (i != 45)
				anInt1246 = -23;
			Varbit class108 = Class246_Sub30_Sub1.aClass17_5761.list(varbit_id, i - 301, revision);
			int i_14_ = ((Varbit) class108).index;
			int i_15_ = ((Varbit) class108).least_significant_bit;
			int i_16_ = ((Varbit) class108).most_significant_bit;
			int i_17_ = Class246_Sub1_Sub3.anIntArray5702[i_16_ - i_15_];
			return VarpType.getVarpCache(revision)[i_14_] >> i_15_
					& i_17_;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	final int method608(boolean bool, int i) {
		try {
			anInt1238++;
			long l = TimeUtility.time();
			Class246_Sub23 class246_sub23 = (!bool ? (Class246_Sub23) aClass85_1243.next((byte) -20)
					: (Class246_Sub23) aClass85_1243.first((byte) -23));
			for (/**/; class246_sub23 != null; class246_sub23 = (Class246_Sub23) aClass85_1243.next((byte) -20)) {
				if (((0x3fffffffffffffffL & ((Class246_Sub23) class246_sub23).aLong4822) ^ 0xffffffffffffffffL) > (l
						^ 0xffffffffffffffffL)) {
					if ((((Class246_Sub23) class246_sub23).aLong4822 & 0x4000000000000000L) != 0L) {
						int index = (int) ((Node) class246_sub23).hash;
						VarpType.varp_cache_osrs[index] = updated_varps_osrs[index];
						class246_sub23.remove();
						return index;
					}
					class246_sub23.remove();
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.J(" + bool + ',' + i + ')');
		}
	}

	static final void method609(int i) {
		try {
			if (i != 1)
				method609(29);
			Class33.aClass260_444.method1698(Class126.aFloat1782, Class31.aFloat420, Class259_Sub3_Sub1.aFloat6901);
			anInt1250++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.G(" + i + ')');
		}
	}

	static final Class246_Sub18 method610(int i, boolean bool, int i_19_) {
		try {
			anInt1249++;
			if (i <= 18)
				method603(false);
			long l = (long) (i_19_ | (!bool ? 0 : -2147483648));
			return (Class246_Sub18) Class110.aClass85_1572.get(l);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("it.H(" + i + ',' + bool + ',' + i_19_ + ')'));
		}
	}

	final void method611(int i, byte i_20_, int i_21_, int revision) {
		try {
			anInt1236++;
			int i_22_ = 45 % ((28 - i_20_) / 59);
			Varbit class108 = Class246_Sub30_Sub1.aClass17_5761.list(i, -256, revision);
			int i_23_ = ((Varbit) class108).index;
			int i_24_ = ((Varbit) class108).least_significant_bit;
			int i_25_ = ((Varbit) class108).most_significant_bit;
			int i_26_ = Class246_Sub1_Sub3.anIntArray5702[i_25_ + -i_24_];
			if (i_21_ < 0 || (i_21_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff))
				i_21_ = 0;
			i_26_ <<= i_24_;
			setIntVarp(i_23_,
					(i_26_ & i_21_ << i_24_ | ((i_26_ ^ 0xffffffff) & VarpType.getVarpCache((revision))[i_23_]
							)),
					revision);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("it.D(" + i + ',' + i_20_ + ',' + i_21_ + ')'));
		}
	}

	public final int method35(int i, int i_27_, int revision) {
		try {
			anInt1247++;
			return VarpType.getVarpCache(revision)[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.B(" + i + ',' + i_27_ + ')');
		}
	}

	public Class95() {
		try {
			updated_varps_634 = new int[(((Class209) SubIncomingPacket.aClass209_7085).varp_size_634)];
			updated_varps_550 = new int[(((Class209) SubIncomingPacket.aClass209_7085).varp_size_550)];
			updated_varps_osrs = new int[(((Class209) SubIncomingPacket.aClass209_7085).varp_size_osrs)];
			VarpType.varp_cache_634 = new int[(((Class209) SubIncomingPacket.aClass209_7085).varp_size_634)];
			VarpType.varp_cache_550 = new int[(((Class209) SubIncomingPacket.aClass209_7085).varp_size_550)];
			VarpType.varp_cache_osrs = new int[(((Class209) SubIncomingPacket.aClass209_7085).varp_size_osrs)];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.<init>(" + ')');
		}
	}

	static {
		anInt1252 = 0;
	}
}
