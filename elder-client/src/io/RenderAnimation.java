package io;

import io.cache.Cache;
import io.osrs_chat.Message;

final class RenderAnimation {
	int anInt1880;
	int anInt1881;
	int anInt1882;
	static int anInt1883;
	int anInt1884 = 0;
	int stand_sequence;
	int anInt1886;
	int anInt1887 = -1;
	static OutgoingPacket aClass201_1888 = new OutgoingPacket(4, -1);
	int anInt1889;
	int anInt1890;
	static int anInt1891;
	int anInt1892;
	int anInt1893;
	int anInt1894 = -1;
	int anInt1895;
	int anInt1896;
	int anInt1897;
	int anInt1898;
	int anInt1899;
	int anInt1900;
	int anInt1901;
	static int anInt1902;
	int anInt1903;
	static int anInt1904;
	int[][] anIntArrayArray1905;
	boolean aBool1906;
	int anInt1907;
	int anInt1908;
	int anInt1909;
	int[] anIntArray1910;
	int anInt1911;
	int anInt1912;
	int anInt1913;
	int anInt1914;
	int anInt1915;
	int[] anIntArray1916;
	int anInt1917;
	int anInt1918;
	int[] anIntArray1919;
	int anInt1920;
	private int anInt1921;
	int anInt1922;
	int anInt1923;
	static int anInt1924;
	static int anInt1925;
	int anInt1926;
	int walk_sequence;
	static int anInt1928;
	static boolean aBool1929 = true;
	static int anInt1930;
	int anInt1931;
	int f_bb;
	static byte[][] f_cb = new byte[50][];

	static final int method914(int i, byte i_0_, int i_1_, int i_2_) {
		try {
			anInt1928++;
			i &= 0x3;
			if (i == 0)
				return i_2_;
			if (i_0_ > -97)
				return -27;
			if (i == 1)
				return 7 - i_1_;
			if (i == 2)
				return 7 - i_2_;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mp.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final int get_stand_sequence(boolean bool) {
		try {
			if (bool != true)
				method919((byte) 94);
			anInt1925++;
			if (((RenderAnimation) this).stand_sequence != -1)
				return ((RenderAnimation) this).stand_sequence;
			if (((RenderAnimation) this).anIntArray1910 != null) {
				int i = (int) (Math.random() * (double) anInt1921);
				int i_3_;
				for (i_3_ = 0; ((RenderAnimation) this).anIntArray1916[i_3_] <= i; i_3_++)
					i -= ((RenderAnimation) this).anIntArray1916[i_3_];
				return ((RenderAnimation) this).anIntArray1910[i_3_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mp.D(" + bool + ')');
		}
	}

	final void decode(int i, Buffer stream) {
		try {
			anInt1904++;
			if (i != 65535)
				method918(89, 35, -45, -44, null);
			for (;;) {
				int i_4_ = stream.readUnsignedByte();
				if (i_4_ == 0)
					break;
				process_op(i_4_, 0, stream);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("mp.C(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final void logout(int i) {
		try {
			anInt1902++;
			LoginScreen.login_screen_state = 0;
			LoginScreen.loggedIn = false;
			if (Class65.aClass6_864 != null) {
				Class65.aClass6_864.method72(false);
				Class65.aClass6_864 = null;
			}
			Class232.method1484((byte) 114);
			Class246_Sub28_Sub4.method2537();
			for (int i_5_ = 0; i_5_ < 4; i_5_++)
				Class95.aClass199Array1235[i_5_].method1324(i - 2813);
			Class246_Sub4.method1809(4095, false);
			Message.messages = new IterableNodeHashTable(1024);
			if (i == 2700) {
				System.gc();
				Class59_Sub5.method2281(2, (byte) 35);
				Class_w.aBool6383 = false;
				Class36.anInt512 = -1;
				Class218.method1413(true, i + -34093);
				Class255_Sub1.anInt5573 = 0;
				Class130_Sub8.anInt5618 = 0;
				IdentityKitLoader.anInt1206 = 0;
				Client.base_x = 0;
				Client.base_y = 0;
				for (int i_6_ = 0; (Class166.aClass29Array2347.length > i_6_); i_6_++)
					Class166.aClass29Array2347[i_6_] = null;
				StructLoader.method391((byte) 28);
				for (int i_7_ = 0; i_7_ < 2048; i_7_++)
					Class143.players[i_7_] = null;
				Class5.anInt55 = 0;
				for (int i_8_ = 0; i_8_ < 32768; i_8_++)
					VarcLoader.aClass_r_Sub2Array1002[i_8_] = null;
				Class251.aClass85_3551.method543(i - 2700);
				Class31.method231(-18006);
				SubIncomingPacket.anInt7095 = 0;
				Varbit.aClass95_6658.reset(i - 2575, MapRegion.get_revision_by_region());
				Class246_Sub28_Sub3.method2494(2048);
				Class132.method893(125);
				LoginScreen.prepare(true);
				try {
					Class80.method521(Client.sign_link.anApplet733, "loggedout", 101);
				} catch (Throwable throwable) {
					/* empty */
				}
				Class_j.aClass246_Sub39_1488 = null;
				Class40_Sub9.aLong5507 = 0L;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mp.B(" + i + ')');
		}
	}

	static final void method918(int i, int i_9_, int i_10_, int i_11_, int[] is) {
		try {
			i--;
			anInt1883++;
			int i_12_ = --i_11_ - 7;
			while (i_12_ > i) {
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
			}
			int i_13_ = 108 / ((55 - i_9_) / 63);
			while (i < i_11_)
				is[++i] = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mp.H(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method919(byte i) {
		try {
			if (i == 4) {
				aClass201_1888 = null;
				Cache.f_ab = null;
				f_cb = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mp.E(" + i + ')');
		}
	}

	final boolean method920(byte i, int i_14_) {
		try {
			anInt1930++;
			if (i_14_ == -1)
				return false;
			if (i_14_ == ((RenderAnimation) this).stand_sequence)
				return true;
			if (i != 8)
				((RenderAnimation) this).anInt1931 = -33;
			if (((RenderAnimation) this).anIntArray1910 != null) {
				for (int i_15_ = 0; (((RenderAnimation) this).anIntArray1910.length > i_15_); i_15_++) {
					if (i_14_ == ((RenderAnimation) this).anIntArray1910[i_15_])
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mp.G(" + i + ',' + i_14_ + ')');
		}
	}

	private final void process_op(int opcode, int i_16_, Buffer stream) {
		try {
			if (i_16_ == 0) {
				anInt1924++;
				if (opcode == 1) {
					((RenderAnimation) this).stand_sequence = stream.readUnsignedShort();
					((RenderAnimation) this).walk_sequence = stream.readUnsignedShort();
					if (((RenderAnimation) this).walk_sequence == 65535)
						((RenderAnimation) this).walk_sequence = -1;
					if (((RenderAnimation) this).stand_sequence == 65535)
						((RenderAnimation) this).stand_sequence = -1;
				} else if (opcode == 2)
					((RenderAnimation) this).anInt1892 = stream.readUnsignedShort();
				else if (opcode == 3)
					((RenderAnimation) this).anInt1908 = stream.readUnsignedShort();
				else if (opcode == 4) {
					((RenderAnimation) this).anInt1900 = stream.readUnsignedShort();
				} else if (opcode == 5) {
					((RenderAnimation) this).anInt1917 = stream.readUnsignedShort();
				} else if (opcode == 6)
					((RenderAnimation) this).anInt1894 = stream.readUnsignedShort();
				else if (opcode == 7) {
					((RenderAnimation) this).anInt1880 = stream.readUnsignedShort();
				} else if (opcode == 8) {
					((RenderAnimation) this).anInt1914 = stream.readUnsignedShort();
				} else if (opcode == 9) {
					((RenderAnimation) this).anInt1890 = stream.readUnsignedShort();
				} else if (opcode == 26) {
					((RenderAnimation) this).anInt1886 = (short) (4 * stream.readUnsignedByte());
					((RenderAnimation) this).anInt1895 = (short) (stream.readUnsignedByte() * 4);
				} else if (opcode == 27) {
					if ((((RenderAnimation) this).anIntArrayArray1905) == null)
						((RenderAnimation) this).anIntArrayArray1905 = new int[12][];
					int i_21_ = stream.readUnsignedByte();
					((RenderAnimation) this).anIntArrayArray1905[i_21_] = new int[6];
					for (int i_22_ = 0; i_22_ < 6; i_22_++)
						((RenderAnimation) this).anIntArrayArray1905[i_21_][i_22_] = (stream.method2375((byte) 1));
				} else if (opcode == 28) {
					((RenderAnimation) this).anIntArray1919 = new int[12];
					for (int i_17_ = 0; i_17_ < 12; i_17_++) {
						((RenderAnimation) this).anIntArray1919[i_17_] = (stream.readUnsignedByte());
						if ((((RenderAnimation) this).anIntArray1919[i_17_]) == 255)
							((RenderAnimation) this).anIntArray1919[i_17_] = -1;
					}
				} else if (opcode == 29) {
					((RenderAnimation) this).anInt1901 = stream.readUnsignedByte();
				} else if (opcode == 30)
					((RenderAnimation) this).anInt1926 = (stream.readUnsignedShort());
				else if (opcode == 31) {
					((RenderAnimation) this).anInt1931 = (stream.readUnsignedByte());
				} else if (opcode == 32) {
					((RenderAnimation) this).anInt1913 = (stream.readUnsignedShort());
				} else if (opcode == 33) {
					((RenderAnimation) this).anInt1899 = (stream.method2375((byte) 1));
				} else if (opcode == 34)
					((RenderAnimation) this).anInt1911 = (stream.readUnsignedByte());
				else if (opcode == 35) {
					((RenderAnimation) this).anInt1920 = (stream.readUnsignedShort());
				} else if (opcode == 36) {
					((RenderAnimation) this).anInt1884 = (stream.method2375((byte) 1));
				} else if (opcode == 37) {
					((RenderAnimation) this).anInt1889 = stream.readUnsignedByte();
				} else if (opcode == 38) {
					((RenderAnimation) this).anInt1887 = stream.readUnsignedShort();
				} else if (opcode == 39) {
					((RenderAnimation) this).anInt1918 = stream.readUnsignedShort();
				} else if (opcode == 40)
					((RenderAnimation) this).f_bb = stream.readUnsignedShort();
				else if (opcode == 41) {
					((RenderAnimation) this).anInt1907 = stream.readUnsignedShort();
				} else if (opcode == 42)
					((RenderAnimation) this).anInt1882 = stream.readUnsignedShort();
				else if (opcode == 43) {
					((RenderAnimation) this).anInt1922 = stream.readUnsignedShort();
				} else if (opcode == 44) {
					((RenderAnimation) this).anInt1898 = stream.readUnsignedShort();
				} else if (opcode == 45)
					((RenderAnimation) this).anInt1912 = stream.readUnsignedShort();
				else if (opcode == 46)
					((RenderAnimation) this).anInt1881 = stream.readUnsignedShort();
				else if (opcode == 47)
					((RenderAnimation) this).anInt1897 = stream.readUnsignedShort();
				else if (opcode == 48) {
					((RenderAnimation) this).anInt1915 = stream.readUnsignedShort();
				} else if (opcode == 49)
					((RenderAnimation) this).anInt1903 = stream.readUnsignedShort();
				else if (opcode == 50) {
					((RenderAnimation) this).anInt1893 = stream.readUnsignedShort();
				} else if (opcode == 51) {
					((RenderAnimation) this).anInt1909 = stream.readUnsignedShort();
				} else if (opcode == 52) {
					int i_18_ = stream.readUnsignedByte();
					((RenderAnimation) this).anIntArray1916 = new int[i_18_];
					((RenderAnimation) this).anIntArray1910 = new int[i_18_];
					for (int i_19_ = 0; i_18_ > i_19_; i_19_++) {
						((RenderAnimation) this).anIntArray1910[i_19_] = stream.readUnsignedShort();
						int i_20_ = stream.readUnsignedByte();
						((RenderAnimation) this).anIntArray1916[i_19_] = i_20_;
						anInt1921 += i_20_;
					}
				} else if (opcode == 53) {
					((RenderAnimation) this).aBool1906 = false;
				} else if (opcode == 54) {
					((RenderAnimation) this).anInt1896 = stream.readUnsignedByte() << 6;
					((RenderAnimation) this).anInt1923 = stream.readUnsignedByte() << 6;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("mp.A(" + opcode + ',' + i_16_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public RenderAnimation() {
		((RenderAnimation) this).anInt1889 = -1;
		((RenderAnimation) this).anInt1895 = 0;
		((RenderAnimation) this).anInt1897 = -1;
		((RenderAnimation) this).aBool1906 = true;
		((RenderAnimation) this).anInt1901 = 0;
		((RenderAnimation) this).anInt1890 = -1;
		((RenderAnimation) this).anInt1899 = 0;
		((RenderAnimation) this).anInt1893 = -1;
		((RenderAnimation) this).anInt1900 = -1;
		((RenderAnimation) this).stand_sequence = -1;
		((RenderAnimation) this).anInt1882 = -1;
		((RenderAnimation) this).anInt1911 = 0;
		((RenderAnimation) this).anInt1907 = -1;
		((RenderAnimation) this).anInt1881 = -1;
		((RenderAnimation) this).anInt1892 = -1;
		((RenderAnimation) this).anInt1912 = -1;
		((RenderAnimation) this).anInt1886 = 0;
		((RenderAnimation) this).anInt1915 = -1;
		((RenderAnimation) this).anInt1896 = 0;
		((RenderAnimation) this).anIntArray1910 = null;
		((RenderAnimation) this).anInt1914 = -1;
		((RenderAnimation) this).anInt1898 = -1;
		((RenderAnimation) this).anInt1920 = 0;
		((RenderAnimation) this).anInt1880 = -1;
		((RenderAnimation) this).anInt1923 = 0;
		((RenderAnimation) this).anInt1903 = -1;
		((RenderAnimation) this).anInt1908 = -1;
		((RenderAnimation) this).anInt1909 = -1;
		((RenderAnimation) this).anInt1926 = 0;
		((RenderAnimation) this).anInt1918 = -1;
		((RenderAnimation) this).walk_sequence = -1;
		((RenderAnimation) this).anInt1917 = -1;
		((RenderAnimation) this).anInt1922 = -1;
		anInt1921 = 0;
		((RenderAnimation) this).anIntArray1916 = null;
		((RenderAnimation) this).anInt1913 = 0;
		((RenderAnimation) this).anInt1931 = 0;
		((RenderAnimation) this).f_bb = -1;
	}
}
