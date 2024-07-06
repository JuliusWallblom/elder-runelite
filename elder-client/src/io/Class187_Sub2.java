package io;

/* Class187_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class187_Sub2 extends Class187 implements Interface10 {
	static int anInt5415;
	static int anInt5416;
	static int anInt5417;
	static int anInt5418;
	static int anInt5419;
	static int anInt5420;
	static int anInt5421;
	static int anInt5422;
	private int anInt5423;
	static int anInt5424;
	static int[] anIntArray5425 = new int[256];
	static OutgoingPacket aClass201_5426;
	static int anInt5427;
	public static void method2284(byte i) {
		try {
			anIntArray5425 = null;
			if (i <= 119)
				aClass201_5426 = null;
			aClass201_5426 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.B(" + i + ')');
		}
	}

	public final void method33(byte i, int i_0_, int i_1_, byte[] is) {
		try {
			anInt5415++;
			this.method1224(51, i_0_, is);
			anInt5423 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ue.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method2286(int i) {
		try {
			anInt5421++;
			if (Class106_Sub2.aBool5333) {
				try {
					Class80.method521(Client.sign_link.anApplet733, "showVideoAd", 111);
					return true;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.H(" + i + ')');
		}
	}

	final void method1226(byte i) {
		try {
			anInt5418++;
			if (i <= 113)
				anInt5423 = -53;
			((Class187) this).aClass260_Sub2_2643.method1944(this, -116);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.I(" + i + ')');
		}
	}

	public final long method32(int i) {
		try {
			if (i != 12786)
				aClass201_5426 = null;
			anInt5417++;
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.D(" + i + ')');
		}
	}

	static final int method2287(int i, int i_20_, int i_21_, int i_22_) {
		try {
			anInt5420++;
			i &= 0x3;
			if (i == 0)
				return i_22_;
			if ((i ^ 0xffffffff) == -2)
				return i_20_;
			if ((i ^ 0xffffffff) == -3)
				return -i_22_ + 1023;
			if (i_21_ != -32457)
				anIntArray5425 = null;
			return 1023 - i_20_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ue.G(" + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ')'));
		}
	}

	Class187_Sub2(Class260_Sub2 class260_sub2, int i, byte[] is, int i_23_, boolean bool) {
		super(class260_sub2, 34962, is, i_23_, bool);
		try {
			anInt5423 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ue.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_23_ + ',' + bool + ')'));
		}
	}

	static final void method2288(int i, int i_24_, int i_25_, int i_26_) {
		try {
			anInt5419++;
			if (i_26_ != -32509)
				anInt5427 = -18;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 119, 11);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210 = i_25_;
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ue.E(" + i + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
		}
	}

	public final int method21(boolean bool) {
		try {
			anInt5416++;
			if (bool != true)
				method32(117);
			return anInt5423;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.C(" + bool + ')');
		}
	}

	public final int method1(int i) {
		try {
			int i_27_ = 79 / ((17 - i) / 39);
			anInt5424++;
			return ((Class187) this).anInt2646;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.A(" + i + ')');
		}
	}

	Class187_Sub2(Class260_Sub2 class260_sub2, int i, Buffer nativebuffer, int i_28_, boolean bool) {
		super(class260_sub2, 34962, nativebuffer, i_28_, bool);
		try {
			anInt5423 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ue.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (nativebuffer != null ? "{...}" : "null") + ',' + i_28_ + ',' + bool + ')'));
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_29_ = i;
			for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -9; i_30_++) {
				if ((0x1 & i_29_) != 1)
					i_29_ >>>= 1;
				else
					i_29_ = i_29_ >>> 1 ^ ~0x12477cdf;
			}
			anIntArray5425[i] = i_29_;
		}
		aClass201_5426 = new OutgoingPacket(23, 3);
		anInt5427 = 2;
	}
}
