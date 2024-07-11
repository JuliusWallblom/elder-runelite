package io;

final class Stream_Sub1 extends Buffer {
	static int anInt5851;
	static int anInt5852;
	private ISAAC aClass42_5853;
	static int anInt5854;
	static int anInt5855 = 0;
	static int anInt5856;
	static int anInt5857;
	static int anInt5858;
	static int anInt5859;
	static int anInt5860;
	static int anInt5861;
	static int anInt5863;
	private int anInt5864;
	static int anInt5865;

	final void method2473(int i, int i_0_, int i_1_, byte[] is) {
		try {
			int i_2_ = 36 % ((i + 41) / 58);
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_3_++)
				is[i_1_ + i_3_] = (byte) ((((Buffer) this).buffer[((Buffer) this).position++]) + -aClass42_5853.method291((byte) -85));
			anInt5856++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cw.CC(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2474(int i, int i_4_) {
		do {
			try {
				anInt5865++;
				((Buffer) this).buffer[((Buffer) this).position++] = (byte) (i + aClass42_5853.method291((byte) -127));
				if (i_4_ == 13127)
					break;
				method2477(-86);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "cw.FC(" + i + ',' + i_4_ + ')');
			}
			break;
		} while (false);
	}

	static final void method2475(int i) {
		try {
			Class246_Sub28_Sub24.method2740((byte) 46, (((Renderer) (Client.current_renderer)).anInt581));
			anInt5859++;
			int i_5_ = ((Client.base_x >> 3) + (Class246_Sub16.aInt92 >> 10));
			int i_6_ = (Client.base_y >> 3) + (Class259_Sub1.anInt4509 >> 10);
			Class246_Sub28_Sub24.anInt6681 = ((Class59_Sub3) Client.local_player).current_plane = (byte) 0;
			Client.local_player.method2913(8, i ^ i, 8);
			int regions = 18;
			Class246_Sub5.aByteArrayArray3885 = new byte[regions][];
			MapRegion.map_m = new int[regions];
			MapRegion.map_l = new int[regions];
			Class59_Sub1_Sub3.aByteArrayArray6347 = new byte[regions][];
			Class247.aByteArrayArray3478 = new byte[regions][];
			Class211_Sub1.current_regions = new byte[regions][];
			MapRegion.xteas = new int[regions][4];
			Class95.anIntArray1251 = new int[regions];
			MapRegion.map_um = new int[regions];
			MapRegion.region_ids = new int[regions];
			MapRegion.map_ul = new int[regions];
			Class134.potential_objects = new byte[regions][];
			regions = 0;
			for (int i_8_ = (-(Class38_Sub1_Sub1.anInt6770 >> 4) + i_5_) / 8; ((i_8_ ^ 0xffffffff) >= ((i_5_ + (Class38_Sub1_Sub1.anInt6770 >> 4)) / 8 ^ 0xffffffff)); i_8_++) {
				for (int i_9_ = (-(Class152.anInt2205 >> 4) + i_6_) / 8; ((((Class152.anInt2205 >> 4) + i_6_) / 8 ^ 0xffffffff) <= (i_9_ ^ 0xffffffff)); i_9_++) {
					int i_10_ = i_9_ + (i_8_ << 8);
					MapRegion.region_ids[regions] = i_10_;
					MapRegion.map_m[regions] = MapRegion.get_map_index(MapRegion.region_ids[regions]).method86("m" + i_8_ + "_" + i_9_);
					MapRegion.map_l[regions] = MapRegion.get_map_index(MapRegion.region_ids[regions]).method86("l" + i_8_ + "_" + i_9_);
					Class95.anIntArray1251[regions] = MapRegion.get_map_index(MapRegion.region_ids[regions]).method86("n" + i_8_ + "_" + i_9_);
					MapRegion.map_um[regions] = MapRegion.get_map_index(MapRegion.region_ids[regions]).method86("um" + i_8_ + "_" + i_9_);
					MapRegion.map_ul[regions] = MapRegion.get_map_index(MapRegion.region_ids[regions]).method86("ul" + i_8_ + "_" + i_9_);
					if ((Class95.anIntArray1251[regions] ^ 0xffffffff) == 0) {
						MapRegion.map_m[regions] = -1;
						MapRegion.map_l[regions] = -1;
						MapRegion.map_um[regions] = -1;
						MapRegion.map_ul[regions] = -1;
					}
					regions++;
				}
			}
			for (int i_11_ = regions; ((i_11_ ^ 0xffffffff) > (Class95.anIntArray1251.length ^ 0xffffffff)); i_11_++) {
				Class95.anIntArray1251[i_11_] = -1;
				MapRegion.map_m[i_11_] = -1;
				MapRegion.map_l[i_11_] = -1;
				MapRegion.map_um[i_11_] = -1;
				MapRegion.map_ul[i_11_] = -1;
			}
			Class170.method1125(true, (byte) 104, i_6_, i_5_, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.EC(" + i + ')');
		}
	}

	Stream_Sub1(int i) {
		super(i);
	}

	final void method2476(byte i) {
		try {
			int i_12_ = 14 % ((-17 - i) / 47);
			anInt5861++;
			((Buffer) this).position = (anInt5864 + 7) / 8;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.BC(" + i + ')');
		}
	}

	final void method2477(int i) {
		try {
			anInt5858++;
			if (i != -934)
				anInt5864 = 78;
			anInt5864 = ((Buffer) this).position * 8;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.DC(" + i + ')');
		}
	}

	final int method2478(int i, int i_13_) {
		try {
			if (i != 8)
				return -43;
			anInt5863++;
			return i_13_ * 8 - anInt5864;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.VB(" + i + ',' + i_13_ + ')');
		}
	}

	public static void method2479(boolean bool) {
		try {
			if (bool != false)
				Widget.redraw_widget(null);
			GameEngine.clock = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.SB(" + bool + ')');
		}
	}

	final void method2480(int[] is, int i) {
		try {
			anInt5851++;
			if (i != -938442011)
				GameEngine.clock = null;
			aClass42_5853 = new ISAAC(is);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.WB(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method2481(int i) {
		try {
			anInt5857++;
			int i_14_ = (((Buffer) this).buffer[((Buffer) this).position++] - aClass42_5853.method291((byte) -102)) & 0xff;
			if (i != 1941438248)
				return 47;
			if ((i_14_ ^ 0xffffffff) > -129)
				return i_14_;
			return (((((Buffer) this).buffer[((Buffer) this).position++] - aClass42_5853.method291((byte) -107)) & 0xff) + (-128 + i_14_ << 8));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.AC(" + i + ')');
		}
	}

	final boolean method2482(int i) {
		try {
			anInt5852++;
			if (i != -6742)
				anInt5855 = -30;
			int i_15_ = ((((Buffer) this).buffer[((Buffer) this).position] - aClass42_5853.method293(i + 855265080)) & 0xff);
			if ((i_15_ ^ 0xffffffff) > -129)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.TB(" + i + ')');
		}
	}

	final int readBits(int i, int i_16_) {
		try {
			anInt5854++;
			int i_17_ = anInt5864 >> 3;
			int i_18_ = 8 + -(anInt5864 & 0x7);
			int i_19_ = 0;
			anInt5864 += i_16_;
			if (i >= -46)
				GameEngine.clock = null;
			for (/**/; i_18_ < i_16_; i_18_ = 8) {
				i_19_ += (((Buffer) this).buffer[i_17_++] & Class9.anIntArray107[i_18_]) << -i_18_ + i_16_;
				i_16_ -= i_18_;
			}
			if ((i_16_ ^ 0xffffffff) == (i_18_ ^ 0xffffffff))
				i_19_ += (((Buffer) this).buffer[i_17_] & Class9.anIntArray107[i_18_]);
			else
				i_19_ += (((Buffer) this).buffer[i_17_] >> -i_16_ + i_18_ & Class9.anIntArray107[i_16_]);
			return i_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.UB(" + i + ',' + i_16_ + ')');
		}
	}
}
