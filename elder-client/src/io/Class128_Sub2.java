package io;

final class Class128_Sub2 extends Class128 {
	static int[][] anIntArrayArray5565;
	static int[][] anIntArrayArray5566 = { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 },
			{ 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 },
			{ 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
	int[] anIntArray5567;
	int[] anIntArray5568;
	static int anInt5569;
	static int anInt5570;

	public static void method2333(byte i) {
		try {
			anIntArrayArray5566 = null;
			anIntArrayArray5565 = null;
			int i_0_ = 102 % ((i + 79) / 39);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wm.G(" + i + ')');
		}
	}

	static final void method2334(Entity class_r, int i, int i_1_, int i_2_, int i_3_) {
		try {
			if (i_3_ < -99) {
				anInt5569++;
				RenderAnimation class135 = class_r.get_render_sequence(-1, null);
				int i_4_ = (0x3fff & (((Entity) class_r).anInt6455 - ((Class24) ((Entity) class_r).f_fb).anInt344));
				if (i == -1) {
					if (i_4_ != 0 || (((Entity) class_r).anInt6435 ^ 0xffffffff) < -26) {
						((Entity) class_r).aBool6450 = false;
						if ((i_2_ ^ 0xffffffff) > -1 && ((((RenderAnimation) class135).anInt1887 ^ 0xffffffff) != 0))
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1887;
						else if ((i_2_ ^ 0xffffffff) < -1 && (((RenderAnimation) class135).anInt1918 ^ 0xffffffff) != 0)
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1918;
						else
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).walk_sequence;
					} else if (!((Entity) class_r).aBool6450
							|| !class135.method920((byte) 8, (((Entity) class_r).anInt6470))) {
						((Entity) class_r).anInt6470 = class135.get_stand_sequence(true);
						((Entity) class_r).aBool6450 = ((((Entity) class_r).anInt6470 ^ 0xffffffff) != 0);
					}
				} else if (((Entity) class_r).faceEntity != -1 && ((i_4_ ^ 0xffffffff) <= -10241 || i_4_ <= 2048)) {
					int i_5_ = ((-((Class24) ((Entity) class_r).f_fb).anInt344 + Class213.anIntArray2984[i_1_])
							& 0x3fff);
					((Entity) class_r).aBool6450 = false;
					if ((i ^ 0xffffffff) != -3 || ((((RenderAnimation) class135).anInt1894 ^ 0xffffffff) == 0)) {
						if ((i ^ 0xffffffff) == -1 && ((RenderAnimation) class135).anInt1892 != -1) {
							if (i_5_ <= 2048 || (i_5_ ^ 0xffffffff) < -6145
									|| (((RenderAnimation) class135).anInt1917 ^ 0xffffffff) == 0) {
								if (i_5_ < 10240 || (i_5_ ^ 0xffffffff) <= -14337
										|| ((RenderAnimation) class135).anInt1900 == -1) {
									if ((i_5_ ^ 0xffffffff) >= -6145 || (i_5_ ^ 0xffffffff) <= -10241
											|| (((RenderAnimation) class135).anInt1908 == -1))
										((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1892;
									else
										((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1908;
								} else
									((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1900;
							} else
								((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1917;
						} else if (i_5_ <= 2048 || i_5_ > 6144
								|| (((RenderAnimation) class135).anInt1882 ^ 0xffffffff) == 0) {
							if ((i_5_ ^ 0xffffffff) <= -10241 && (i_5_ ^ 0xffffffff) > -14337
									&& ((RenderAnimation) class135).anInt1907 != -1)
								((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1907;
							else if (i_5_ > 6144 && i_5_ < 10240
									&& (((RenderAnimation) class135).f_bb ^ 0xffffffff) != 0)
								((Entity) class_r).anInt6470 = ((RenderAnimation) class135).f_bb;
							else
								((Entity) class_r).anInt6470 = ((RenderAnimation) class135).walk_sequence;
						} else
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1882;
					} else if (i_5_ > 2048 && i_5_ <= 6144
							&& (((RenderAnimation) class135).anInt1890 ^ 0xffffffff) != 0)
						((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1890;
					else if (i_5_ >= 10240 && i_5_ < 14336 && ((RenderAnimation) class135).anInt1914 != -1)
						((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1914;
					else if (i_5_ <= 6144 || i_5_ >= 10240
							|| ((((RenderAnimation) class135).anInt1880 ^ 0xffffffff) == 0))
						((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1894;
					else
						((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1880;
				} else if ((i_4_ ^ 0xffffffff) != -1 || ((Entity) class_r).anInt6435 > 25) {
					((Entity) class_r).aBool6450 = false;
					if ((i ^ 0xffffffff) == -3 && ((((RenderAnimation) class135).anInt1894 ^ 0xffffffff) != 0)) {
						if (i_2_ < 0 && (((RenderAnimation) class135).anInt1915 ^ 0xffffffff) != 0)
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1915;
						else if ((i_2_ ^ 0xffffffff) >= -1
								|| (((RenderAnimation) class135).anInt1903 ^ 0xffffffff) == 0)
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1894;
						else
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1903;
					} else if (i != 0 || (((RenderAnimation) class135).anInt1892 ^ 0xffffffff) == 0) {
						if ((i_2_ ^ 0xffffffff) > -1 && ((RenderAnimation) class135).anInt1893 != -1)
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1893;
						else if (i_2_ > 0 && ((RenderAnimation) class135).anInt1909 != -1)
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1909;
						else
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).walk_sequence;
					} else if ((i_2_ ^ 0xffffffff) <= -1
							|| (((RenderAnimation) class135).anInt1881 ^ 0xffffffff) == 0) {
						if ((i_2_ ^ 0xffffffff) >= -1 || ((RenderAnimation) class135).anInt1897 == -1)
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1892;
						else
							((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1897;
					} else
						((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1881;
				} else {
					((Entity) class_r).aBool6450 = false;
					if ((i ^ 0xffffffff) == -3 && ((RenderAnimation) class135).anInt1894 != -1)
						((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1894;
					else if (i == 0 && (((RenderAnimation) class135).anInt1892 ^ 0xffffffff) != 0)
						((Entity) class_r).anInt6470 = ((RenderAnimation) class135).anInt1892;
					else
						((Entity) class_r).anInt6470 = ((RenderAnimation) class135).walk_sequence;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wm.E(" + (class_r != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	Class128_Sub2(int i, int i_6_, int[] is, int[] is_7_) {
		try {
			((Class128_Sub2) this).anIntArray5567 = is_7_;
			((Class128_Sub2) this).anIntArray5568 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wm.<init>(" + i + ',' + i_6_ + ','
					+ (is != null ? "{...}" : "null") + ',' + (is_7_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2335(int i, byte i_8_, int revision) {
		try {
			if (i_8_ < -14) {
				for (Node class246 = Widget.get_widget_flags(revision).first(
						(byte) -23); class246 != null; class246 = Widget.get_widget_flags(revision).next((byte) -20)) {
					if ((long) i == (((Node) class246).hash >> 48 & 0xffffL))
						class246.remove();
				}
				anInt5570++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wm.F(" + i + ',' + i_8_ + ')');
		}
	}
}
