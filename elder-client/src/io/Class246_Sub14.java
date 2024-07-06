package io;

final class Class246_Sub14 extends Node {
	static int[] anIntArray4435 = { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
			99, 99, 99, 99 };
	byte[] aByteArray4436;
	static Class198 aClass198_4437;
	static String aString4438;

	public static void method1996(int i) {
		try {
			aClass198_4437 = null;
			if (i != -7799)
				aClass198_4437 = null;
			anIntArray4435 = null;
			aString4438 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fr.B(" + i + ')');
		}
	}

	Class246_Sub14(byte[] is) {
		try {
			((Class246_Sub14) this).aByteArray4436 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fr.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	static final Class59_Sub1 method1997(int i, int i_0_, int i_1_) {
		Tile class147 = Class106.tiles[i][i_0_][i_1_];
		if (class147 == null || ((Tile) class147).floorDecorationIThink == null) {
			return null;
		}
		return ((Tile) class147).floorDecorationIThink;
	}

	static {
		new MultilingualString("Invalid channel name entered!", "Ung\u00fcltiger Chatraum-Name angegeben.",
				"Nom de canal incorrect !", "Nome de canal inv\u00e1lido!");
		aString4438 = "";
	}
}
