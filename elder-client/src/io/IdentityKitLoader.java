package io;

import io.cache.Revision;

final class IdentityKitLoader {
	private CacheIndex identity_kit_data_index;
	private CacheIndex osrs_identity_kit_data_index;
	private CacheIndex identity_kit_data_index_550;
	static int anInt1198;
	static int anInt1199;
	static int anInt1200;
	CacheIndex identity_kit_model_index;
	CacheIndex osrs_identity_kit_model_index;
	CacheIndex identity_kit_model_index_550;
	
	public CacheIndex get_identity_kit_model_index() {
		if (Settings.data == Revision.OSRS) {
			return osrs_identity_kit_model_index;
		} else if (Settings.data == Revision.PRE_EOC_550) {
			return identity_kit_model_index_550;
		} else {
			return identity_kit_model_index;
		}
	}
	static int anInt1202;
	static int anInt1203;
	static HashMap identity_kit_cache = new HashMap(64);
	static HashMap identity_kit_cache_OSRS = new HashMap(64);
	static HashMap identity_kit_cache_550 = new HashMap(64);
	static IncomingPacket GLOBAL_STRING_2_PACKET = new IncomingPacket(54, -2);
	static int anInt1206;
	static boolean[][] aBoolArrayArray1207 = { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
	static Class6 aClass6_1208;

	static final void method586(int i, int i_0_, int i_1_, byte i_2_, int i_3_) {
		try {
			anInt1202++;
			int i_4_ = 0;
			if (i_2_ < 46)
				method588((byte) 4);
			int i_5_ = i_0_;
			int i_6_ = -i_0_;
			RenderAnimation.method918(i + -i_0_, -65, i_3_, i - -i_0_, Class246_Sub28_Sub6.anIntArrayArray6042[i_1_]);
			int i_7_ = -1;
			while (i_5_ > i_4_) {
				i_7_ += 2;
				i_6_ += i_7_;
				i_4_++;
				if ((i_6_ ^ 0xffffffff) <= -1) {
					i_5_--;
					i_6_ -= i_5_ << 1;
					int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_5_ + i_1_];
					int[] is_8_ = Class246_Sub28_Sub6.anIntArrayArray6042[i_1_ - i_5_];
					int i_9_ = i + i_4_;
					int i_10_ = -i_4_ + i;
					RenderAnimation.method918(i_10_, 125, i_3_, i_9_, is);
					RenderAnimation.method918(i_10_, 118, i_3_, i_9_, is_8_);
				}
				int i_11_ = i - -i_5_;
				int i_12_ = -i_5_ + i;
				int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_1_ - -i_4_];
				int[] is_13_ = Class246_Sub28_Sub6.anIntArrayArray6042[i_1_ + -i_4_];
				RenderAnimation.method918(i_12_, -39, i_3_, i_11_, is);
				RenderAnimation.method918(i_12_, -99, i_3_, i_11_, is_13_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("in.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method587(byte i) {
		do {
			try {
				anInt1198++;
				synchronized (identity_kit_cache) {
					identity_kit_cache.method369(false);
				}
				synchronized (identity_kit_cache_550) {
					identity_kit_cache_550.method369(false);
				}
				synchronized (identity_kit_cache_OSRS) {
					identity_kit_cache_OSRS.method369(false);
				}
				if (i <= -93)
					break;
				((IdentityKitLoader) this).identity_kit_model_index = null;
				((IdentityKitLoader) this).osrs_identity_kit_model_index = null;
				((IdentityKitLoader) this).identity_kit_model_index_550 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "in.F(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method588(byte i) {
		try {
			int i_14_ = -113 % ((-53 - i) / 33);
			aBoolArrayArray1207 = null;
			GLOBAL_STRING_2_PACKET = null;
			aClass6_1208 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "in.A(" + i + ')');
		}
	}

	final IdentityKitType list(int i, int i_15_) {
		try {
			anInt1200++;
			IdentityKitType idk_type;
			if (Settings.data == Revision.OSRS) {
				synchronized (identity_kit_cache_OSRS) {
					idk_type = (IdentityKitType) identity_kit_cache_OSRS.method379((long) i, (byte) 58);
				}
			} else if (Settings.data == Revision.PRE_EOC_550) {
				synchronized (identity_kit_cache_550) {
					idk_type = (IdentityKitType) identity_kit_cache_550.method379((long) i, (byte) 58);
				}
			} else {
				synchronized (identity_kit_cache) {
					idk_type = (IdentityKitType) identity_kit_cache.method379((long) i, (byte) 58);
				}
			}
			if (idk_type != null)
				return idk_type;
			byte[] data;
			if (Settings.data == Revision.OSRS) {
				data = osrs_identity_kit_data_index.get_file(i, 3);
			} else if (Settings.data == Revision.PRE_EOC_550) {
				data = identity_kit_data_index_550.get_file(i, 3);
			} else {
				data = identity_kit_data_index.get_file(i, 3);
			}
			idk_type = new IdentityKitType();
			((IdentityKitType) idk_type).aClass92_2277 = this;
			if (data != null)
				idk_type.decode(-1, new Buffer(data));
			if (Settings.data == Revision.OSRS) {
				synchronized (identity_kit_cache_OSRS) {
					identity_kit_cache_OSRS.method371(1, (long) i, idk_type);
					if (i_15_ != -18653)
						identity_kit_cache_OSRS = null;
				}
			} else if (Settings.data == Revision.PRE_EOC_550) {
				synchronized (identity_kit_cache_550) {
					identity_kit_cache_550.method371(1, (long) i, idk_type);
					if (i_15_ != -18653)
						identity_kit_data_index_550 = null;
				}
			} else {
				synchronized (identity_kit_cache) {
					identity_kit_cache.method371(1, (long) i, idk_type);
					if (i_15_ != -18653)
						identity_kit_data_index = null;
				}
			}
			return idk_type;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "in.E(" + i + ',' + i_15_ + ')');
		}
	}

	IdentityKitLoader(Class101 class101, int i, CacheIndex data_index, CacheIndex model_index, CacheIndex osrs_data_index, CacheIndex osrs_model_index, CacheIndex data_index_550, CacheIndex model_index_550) {
		try {
			((IdentityKitLoader) this).identity_kit_model_index = model_index;
			((IdentityKitLoader) this).osrs_identity_kit_model_index = osrs_model_index;
			((IdentityKitLoader) this).identity_kit_model_index_550 = model_index_550;
			identity_kit_data_index = data_index;
			osrs_identity_kit_data_index = osrs_data_index;
			identity_kit_data_index_550 = data_index_550;
			identity_kit_data_index.child_count(3);
			osrs_identity_kit_data_index.child_count(3);
			identity_kit_data_index_550.child_count(3);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("in.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (data_index != null ? "{...}" : "null") + ',' + (model_index != null ? "{...}" : "null") + ')'));
		}
	}

	final void method590(boolean bool, int i) {
		try {
			anInt1203++;
			if (bool != true)
				method590(true, 102);
			synchronized (identity_kit_cache) {
				identity_kit_cache.method380(i, -50);
			}
			synchronized (identity_kit_cache_550) {
				identity_kit_cache_550.method380(i, -50);
			}
			synchronized (identity_kit_cache_OSRS) {
				identity_kit_cache_OSRS.method380(i, -50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "in.D(" + bool + ',' + i + ')');
		}
	}

	final void method591(boolean bool) {
		try {
			anInt1199++;
			synchronized (identity_kit_cache) {
				if (bool != false) {
					/* empty */
				} else
					identity_kit_cache.method383(87);
			}
			synchronized (identity_kit_cache_550) {
				if (bool != false) {
					/* empty */
				} else
					identity_kit_cache_550.method383(87);
			}
			synchronized (identity_kit_cache_OSRS) {
				if (bool != false) {
					/* empty */
				} else
					identity_kit_cache_OSRS.method383(87);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "in.B(" + bool + ')');
		}
	}
}
