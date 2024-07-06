package io;

/* Class_b - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class SubScript {
	CS2Script script;
	static int anInt1161 = -1;
	static int anInt1162;
	int[] int_local_variables;
	String[] string_local_variables;
	int opcode_index = -1;
	static SubScript[] subscripts;
	static int subscript_pos;
	static int anInt1166;

	static final SceneGraph method567(Canvas canvas, int i, int i_0_, TextureInterface interface6) {
		try {
			anInt1166++;
			if (i != 23932)
				method567(null, -44, 2, null);
			return new Class260_Sub1(i_0_, canvas, interface6);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("b.B(" + (canvas != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + (interface6 != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method568(int i, int i_1_, byte i_2_) {
		try {
			anInt1162++;
			int i_3_ = -9 % ((i_2_ - 4) / 41);
			return (Class152.method1012(i, -24, i_1_) & Class3.method51(i, i_1_, -125));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("b.A(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}
}
