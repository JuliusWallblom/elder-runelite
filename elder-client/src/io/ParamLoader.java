package io;

final class ParamLoader {
	static int anInt2304;
	static Class166 aClass166_2305 = new Class166();
	public static HashMap param_cache_634 = new HashMap(64), param_cache_osrs = new HashMap(64),
			param_cache_550 = new HashMap(64);
	static int anInt2307;
	static int anInt2308 = 0;
	static int anInt2309;
	static int anInt2310;
	public static CacheIndex param_data_634, param_data_osrs, param_data_550;
	static int anInt2313;
	static int anInt2314;

	static final void method1079(Class100 class100, int i, int i_0_, int i_1_, int i_2_) {
		if (i == 1 && i_1_ > 0)
			Class246_Sub22.method2081(class100, i_0_, i_1_ - 1, i_2_);
		else if (i == 4 && i_1_ <= Class240.xSize)
			Class246_Sub22.method2081(class100, i_0_, i_1_ + 1, i_2_);
		else if (i == 8 && i_2_ > 0)
			Class246_Sub22.method2081(class100, i_0_, i_1_, i_2_ - 1);
		else if (i == 2 && i_2_ <= HDModel.ySize)
			Class246_Sub22.method2081(class100, i_0_, i_1_, i_2_ + 1);
		else if (i == 16 && i_1_ > 0 && i_2_ <= HDModel.ySize)
			Class246_Sub22.method2081(class100, i_0_, i_1_ - 1, i_2_ + 1);
		else if (i == 32 && i_1_ <= Class240.xSize && i_2_ <= HDModel.ySize)
			Class246_Sub22.method2081(class100, i_0_, i_1_ + 1, i_2_ + 1);
		else if (i == 128 && i_1_ > 0 && i_2_ > 0)
			Class246_Sub22.method2081(class100, i_0_, i_1_ - 1, i_2_ - 1);
		else if (i == 64 && i_1_ <= Class240.xSize && i_2_ > 0)
			Class246_Sub22.method2081(class100, i_0_, i_1_ + 1, i_2_ - 1);
		else
			throw new RuntimeException("Unsupported wall shape " + i + " in world2.setclosestlights_wall");
	}

	final void method1080(byte i) {
		try {
			anInt2304++;
			int i_3_ = -69 / ((12 - i) / 45);
			synchronized (param_cache_634) {
				param_cache_634.method369(false);
			}
			synchronized (param_cache_550) {
				param_cache_550.method369(false);
			}
			synchronized (param_cache_osrs) {
				param_cache_osrs.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ph.G(" + i + ')');
		}
	}

	public static void method1081(int i) {
		try {
			aClass166_2305 = null;
			if (i != 1)
				Client.meslayerContinueWidget = null;
			Client.meslayerContinueWidget = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ph.F(" + i + ')');
		}
	}

	final void method1082(boolean bool) {
		do {
			try {
				synchronized (param_cache_634) {
					param_cache_634.method383(84);
				}
				synchronized (param_cache_550) {
					param_cache_550.method383(84);
				}
				synchronized (param_cache_osrs) {
					param_cache_osrs.method383(84);
				}
				anInt2309++;
				if (bool == false)
					break;
				aClass166_2305 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ph.A(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method1083(int i, boolean bool) {
		try {
			synchronized (NpcType.aClass54_3600) {
				NpcType.aClass54_3600.method380(i, -50);
			}
			anInt2310++;
			synchronized (Class246_Sub28_Sub14.aClass54_6304) {
				Class246_Sub28_Sub14.aClass54_6304.method380(i, -50);
			}
			if (bool != false)
				method1081(-4);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ph.C(" + i + ',' + bool + ')');
		}
	}

	final void method1084(int i, int i_4_) {
		do {
			try {
				synchronized (param_cache_634) {
					param_cache_634.method380(i, -50);
				}
				synchronized (param_cache_550) {
					param_cache_550.method380(i, -50);
				}
				synchronized (param_cache_osrs) {
					param_cache_osrs.method380(i, -50);
				}
				anInt2313++;
				if (i_4_ == 1)
					break;
				method1080((byte) -36);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ph.B(" + i + ',' + i_4_ + ')');
			}
			break;
		} while (false);
	}

	static final int method1086(int i, int i_7_) {
		try {
			anInt2314++;
			if ((i ^ 0xffffffff) == -6408 || i == 34843 || (i ^ 0xffffffff) == -34838)
				return 6407;
			if (i_7_ != 13519)
				Client.meslayerContinueWidget = null;
			if ((i ^ 0xffffffff) == -6409 || (i ^ 0xffffffff) == -34843 || i == 34836)
				return 6408;
			if (i == 6406 || (i ^ 0xffffffff) == -34845)
				return 6406;
			if ((i ^ 0xffffffff) == -6410 || i == 34846)
				return 6409;
			if (i == 6410 || i == 34847)
				return 6410;
			if ((i ^ 0xffffffff) == -6403)
				return 6402;
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ph.E(" + i + ',' + i_7_ + ')');
		}
	}

	ParamLoader(Class101 class101, int i, CacheIndex class_fs, CacheIndex class_fs_2, CacheIndex class_fs_3) {
		do {
			try {
				param_data_634 = class_fs;
				param_data_osrs = class_fs_2;
				param_data_550 = class_fs_3;
				if (param_data_634 == null)
					break;
				if (param_data_550 == null)
					break;
				if (param_data_osrs == null)
					break;
				param_data_634.child_count(11);
				param_data_osrs.child_count(11);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ph.<init>(" + (class101 != null ? "{...}" : "null") + ','
						+ i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
