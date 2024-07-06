package io;

import io.cache.Revision;

final class Class209 {
	static int anInt2938;
	static Class81 aClass81_2939 = new Class81(12, 0, 1, 0);
	static int anInt2940;
	static int anInt2941;
	static int anInt2942;
	private CacheIndex varp_data_634, varp_data_550, varp_data_OSRS;
	static int anInt2944;
	int varp_size_634, varp_size_550, varp_size_osrs;
	static int anInt2946;
	static int anInt2947;
	static int anInt2948;
	private HashMap varp_cache = new HashMap(64), varp_cache_OSRS = new HashMap(64), varp_cache_550 = new HashMap(64);

	static final void method1369(int i) {
		try {
			anInt2946++;
			if (Class5.aBool60) {
				if (i != 0)
					method1371(95, -66, 41, -128, -126, -58);
				while ((Class109_Sub4.anInt4572 ^ 0xffffffff) > (Class220.aClass63_Sub1Array3056.length ^ 0xffffffff)) {
					Class63_Sub1 class63_sub1 = (Class220.aClass63_Sub1Array3056[Class109_Sub4.anInt4572]);
					if (class63_sub1 == null || ((Class63_Sub1) class63_sub1).anInt4723 != -1)
						Class109_Sub4.anInt4572++;
					else {
						if (Class109_Sub1.aClass246_Sub39_3762 == null)
							Class109_Sub1.aClass246_Sub39_3762 = (Class246_Sub28_Sub33.aClass243_6959.method1568(109, (((Class63_Sub1) class63_sub1).aString4717)));
						int i_0_ = (((Class246_Sub39) Class109_Sub1.aClass246_Sub39_3762).anInt5485);
						if ((i_0_ ^ 0xffffffff) == 0)
							break;
						Class109_Sub4.anInt4572++;
						Class109_Sub1.aClass246_Sub39_3762 = null;
						((Class63_Sub1) class63_sub1).anInt4723 = i_0_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sv.G(" + i + ')');
		}
	}

	static final void method1370(int[] is, int[] is_1_, Player class_r_sub1, int i, int[] is_2_) {
		try {
			if (i > -60)
				aClass81_2939 = null;
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (is_2_.length ^ 0xffffffff); i_3_++) {
				int i_4_ = is_2_[i_3_];
				int i_5_ = is[i_3_];
				int i_6_ = is_1_[i_3_];
				for (int i_7_ = 0; (i_5_ != 0 && ((i_7_ ^ 0xffffffff) > (((Entity) class_r_sub1).aClass148Array6467.length ^ 0xffffffff))); i_5_ >>>= 1) {
					if ((0x1 & i_5_ ^ 0xffffffff) != -1) {
						if (i_4_ == -1)
							((Entity) class_r_sub1).aClass148Array6467[i_7_] = null;
						else {
							SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, i_4_);
							int i_8_ = ((SequenceType) class124).replyMode;
							Class148 class148 = (((Entity) class_r_sub1).aClass148Array6467[i_7_]);
							if (class148 != null) {
								if (((Class148) class148).anInt2179 != i_4_) {
									if (((SequenceType) class124).forcedPriority >= ((SequenceType) (Class59_Sub3_Sub3.aClass45_6275.list(3, (((Class148) class148).anInt2179)))).forcedPriority)
										class148 = ((Entity) class_r_sub1).aClass148Array6467[i_7_] = null;
								} else if (i_8_ == 0)
									class148 = ((Entity) class_r_sub1).aClass148Array6467[i_7_] = null;
								else if ((i_8_ ^ 0xffffffff) == -2) {
									((Class148) class148).anInt2177 = 0;
									((Class148) class148).anInt2182 = 0;
									((Class148) class148).anInt2180 = 1;
									((Class148) class148).anInt2183 = 0;
									((Class148) class148).anInt2181 = i_6_;
									Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r_sub1).x), 0, (((Class59_Sub3) class_r_sub1).current_plane), (((Class59_Sub3) class_r_sub1).y), true, class124, (class_r_sub1 == Client.local_player));
								} else if ((i_8_ ^ 0xffffffff) == -3)
									((Class148) class148).anInt2183 = 0;
							}
							if (class148 == null) {
								class148 = ((Entity) class_r_sub1).aClass148Array6467[i_7_] = new Class148();
								((Class148) class148).anInt2177 = 0;
								((Class148) class148).anInt2183 = 0;
								((Class148) class148).anInt2179 = i_4_;
								((Class148) class148).anInt2182 = 0;
								((Class148) class148).anInt2180 = 1;
								((Class148) class148).anInt2181 = i_6_;
								Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r_sub1).x, 0, ((Class59_Sub3) class_r_sub1).current_plane, ((Class59_Sub3) class_r_sub1).y, true, class124, (class_r_sub1 == Client.local_player));
							}
						}
					}
					i_7_++;
				}
			}
			anInt2944++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sv.C(" + (is != null ? "{...}" : "null") + ',' + (is_1_ != null ? "{...}" : "null") + ',' + (class_r_sub1 != null ? "{...}" : "null") + ',' + i + ',' + (is_2_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1371(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		do {
			try {
				anInt2940++;
				if (i_12_ <= Class109_Sub4.anInt4570 && i_9_ >= AbstractModel.anInt1442) {
					boolean bool;
					if (ObjType.anInt2818 > i_13_) {
						bool = false;
						i_13_ = ObjType.anInt2818;
					} else if (i_13_ > Class110.anInt1573) {
						i_13_ = Class110.anInt1573;
						bool = false;
					} else
						bool = true;
					boolean bool_14_;
					if (i < ObjType.anInt2818) {
						i = ObjType.anInt2818;
						bool_14_ = false;
					} else if ((Class110.anInt1573 ^ 0xffffffff) > (i ^ 0xffffffff)) {
						i = Class110.anInt1573;
						bool_14_ = false;
					} else
						bool_14_ = true;
					if ((AbstractModel.anInt1442 ^ 0xffffffff) < (i_12_ ^ 0xffffffff))
						i_12_ = AbstractModel.anInt1442;
					else
						RenderAnimation.method918(i_13_, 123, i_10_, i, (Class246_Sub28_Sub6.anIntArrayArray6042[i_12_++]));
					if (i_9_ > Class109_Sub4.anInt4570)
						i_9_ = Class109_Sub4.anInt4570;
					else
						RenderAnimation.method918(i_13_, 121, i_10_, i, (Class246_Sub28_Sub6.anIntArrayArray6042[i_9_--]));
					if (bool && bool_14_) {
						for (int i_15_ = i_12_; i_15_ <= i_9_; i_15_++) {
							int[] is = (Class246_Sub28_Sub6.anIntArrayArray6042[i_15_]);
							is[i_13_] = is[i] = i_10_;
						}
					} else if (bool) {
						for (int i_16_ = i_12_; (i_16_ ^ 0xffffffff) >= (i_9_ ^ 0xffffffff); i_16_++)
							Class246_Sub28_Sub6.anIntArrayArray6042[i_16_][i_13_] = i_10_;
					} else if (bool_14_) {
						for (int i_17_ = i_12_; i_9_ >= i_17_; i_17_++)
							Class246_Sub28_Sub6.anIntArrayArray6042[i_17_][i] = i_10_;
					}
				}
				if (i_11_ <= -47)
					break;
				method1369(-81);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("sv.H(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1372(byte i) {
		do {
			try {
				anInt2948++;
				synchronized (varp_cache) {
					varp_cache.method369(false);
				}
				synchronized (varp_cache_OSRS) {
					varp_cache_OSRS.method369(false);
				}
				if (i <= -19)
					break;
				method1370(null, null, null, -32, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "sv.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1373(int i) {
		do {
			try {
				anInt2938++;
				synchronized (varp_cache) {
					varp_cache.method383(104);
				}
				synchronized (varp_cache_OSRS) {
					varp_cache_OSRS.method383(104);
				}
				if (i == 16)
					break;
				aClass81_2939 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "sv.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final VarpType list(int i, int i_18_, Revision revision) {
		try {
			anInt2941++;
			VarpType class93;
			if (revision == Revision.OSRS) {
				synchronized (varp_cache_OSRS) {
					class93 = (VarpType) varp_cache_OSRS.method379((long) i, (byte) 58);
				}
			} else if (revision == Revision.PRE_EOC_550) {
				synchronized (varp_cache_550) {
					class93 = (VarpType) varp_cache_550.method379((long) i, (byte) 58);
				}
			} else {
				synchronized (varp_cache) {
					class93 = (VarpType) varp_cache.method379((long) i, (byte) 58);
				}
			}
			if (class93 != null)
				return class93;
			byte[] is = null;
			if (revision == Revision.OSRS) {
				is = varp_data_OSRS.get_file(i, 16);
			} else if (revision == Revision.PRE_EOC_550) {
				is = varp_data_550.get_file(i, 16);
			} else {
				is = varp_data_634.get_file(i, 16);
			}
			class93 = new VarpType();
			if (is != null)
				class93.decode(new Buffer(is), true);
			if (revision == Revision.OSRS) {
				synchronized (varp_cache_OSRS) {
					varp_cache_OSRS.method371(i_18_ + 10232, (long) i, class93);
				}
			} else if (revision == Revision.PRE_EOC_550) {
				synchronized (varp_cache_550) {
					varp_cache_550.method371(i_18_ + 10232, (long) i, class93);
				}
			} else {
				synchronized (varp_cache_OSRS) {
					varp_cache_OSRS.method371(i_18_ + 10232, (long) i, class93);
				}
			}
			if (i_18_ != -10231)
				method1370(null, null, null, -95, null);
			return class93;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sv.B(" + i + ',' + i_18_ + ')');
		}
	}

	final void method1375(int i, int i_19_) {
		do {
			try {
				synchronized (varp_cache) {
					varp_cache.method380(i, -50);
				}
				synchronized (varp_cache_OSRS) {
					varp_cache_OSRS.method380(i, -50);
				}
				anInt2942++;
				if (i_19_ == -3)
					break;
				list(107, 18, MapRegion.get_revision_by_region());
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "sv.E(" + i + ',' + i_19_ + ')');
			}
			break;
		} while (false);
	}

	public static void method1376(int i) {
		do {
			try {
				aClass81_2939 = null;
				if (i < -79)
					break;
				aClass81_2939 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "sv.D(" + i + ')');
			}
			break;
		} while (false);
	}

	Class209(Class101 class101, int i, CacheIndex class_fs, CacheIndex class_fs2, CacheIndex class_fs3) {
		try {
			varp_data_634 = class_fs;
			varp_data_OSRS = class_fs2;
			varp_data_550 = class_fs3;
			if (varp_data_634!= null) {
				((Class209) this).varp_size_634 = varp_data_634.child_count(16);
			} else {
				((Class209) this).varp_size_634 = 0;
			}
			if (varp_data_550!= null) {
				((Class209) this).varp_size_550 = varp_data_550.child_count(16);
			} else {
				((Class209) this).varp_size_550 = 0;
			}
			if (varp_data_OSRS!= null) {
				((Class209) this).varp_size_osrs = varp_data_OSRS.child_count(16);
			} else {
				((Class209) this).varp_size_osrs = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sv.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}
}
