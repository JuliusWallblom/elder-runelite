package io;

import io.cache.Cache;
import io.cache.IndexConstants;

final class Class234 {
	static int anInt3189;
	static int anInt3190 = 0;
	static int[] anIntArray3191 = { 1, 2, 4, 8 };
	static int anInt3192;
	static byte[] movementTypes = new byte[2048];

	public static void method1495(int i) {
		try {
			movementTypes = null;
			int i_0_ = -39 % ((i + 54) / 56);
			anIntArray3191 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ur.D(" + i + ')');
		}
	}

	static final Class130_Sub4 method1496(int i) {
		try {
			anInt3189++;
			if (i != 8)
				return null;
			Class130_Sub4 class130_sub4 = ((Class130_Sub4) Class246_Sub34.aClass68_5141.method439((byte) 112));
			if (class130_sub4 != null) {
				Class246_Sub28_Sub32.anInt6932--;
				return class130_sub4;
			}
			return new Class130_Sub4();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ur.C(" + i + ')');
		}
	}

	static final void method1497(int i, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				anInt3192++;
				if (i_1_ != 0)
					method1495(21);
				i = (((Renderer) Client.current_renderer).anInt587) * i >> 8;
				if ((i ^ 0xffffffff) == -1 || i_3_ == -1)
					break;
				Class15.method158(i, i_3_, 0, Cache.client_cache.get(IndexConstants.PRE_EOC_634_EMPTY_11_INDEX),
						i_1_ - 15727, false);
				Class_w.aBool6383 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ur.B(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	static final Class59_Sub5 method1498(int i, int i_4_, int i_5_) {
		Tile class147 = Class106.tiles[i][i_4_][i_5_];
		if (class147 == null)
			return null;
		Class59_Sub5 class59_sub5 = ((Tile) class147).aClass59_Sub5_2158;
		((Tile) class147).aClass59_Sub5_2158 = null;
		return class59_sub5;
	}
}
