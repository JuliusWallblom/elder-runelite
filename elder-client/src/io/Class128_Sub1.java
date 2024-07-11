package io;

final class Class128_Sub1 extends Class128 {
	static Class65 aClass65_5558;
	static int anInt5559;
	static int anInt5560;
	static float aFloat5561;
	static int anInt5562;
	Class109_Sub1_Sub1 aClass109_Sub1_Sub1_5563;

	static final void method2329(int i) {
		do {
			try {
				anInt5559++;
				if (i != -9410)
					anInt5560 = -125;
				Class90.aClass235Array1168 = null;
				Class40_Sub1.method1771(0, -1, 0, Client.client_width, Widget.root_interface, Client.client_height, 0,
						(byte) 27, 0, 634);
				if (Class90.aClass235Array1168 == null)
					break;
				Class246_Sub1_Sub9.method2588(0, Client.client_width, Class139.anInt1987,
						((Widget) Class33.aClass235_445).anInt3297, Class90.aClass235Array1168, 0, -1412584499,
						Client.client_height, Class246_Sub28_Sub12.anInt6197, -1268043624);
				Class90.aClass235Array1168 = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	public static void method2330(int i) {
		try {
			if (i == 19274)
				aClass65_5558 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wk.F(" + i + ')');
		}
	}

	static final void method2331(int i) {
		try {
			Class114.anInt1598 = 0;
			Class59_Sub3_Sub1.aBool5746 = false;
			Class160.anInt2271 = -1;
			Class95.anInt1252 = 0;
			anInt5562++;
			Class59_Sub3_Sub2.f_bb = 0;
			LoginScreen.loginResponse = i;
			Class246_Sub31.anInt5034 = -3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wk.E(" + i + ')');
		}
	}

	Class128_Sub1(Class260_Sub2 class260_sub2, int i, int i_0_, byte[] is) {
		try {
			((Class128_Sub1) this).aClass109_Sub1_Sub1_5563 = Class18.method176(false, (byte) -122, is, class260_sub2,
					i, i_0_, 6406, 6406);
			((Class128_Sub1) this).aClass109_Sub1_Sub1_5563.method1767(10497, false, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wk.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ','
					+ i + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}
}
