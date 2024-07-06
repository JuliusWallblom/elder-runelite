package io;

final class Class58 {
	static IncomingPacket WORLD_TILE_PACKET = new IncomingPacket(28, 3);
	static int anInt813;
	static AbstractSprite[] aClass_lArray814;
	static int anInt816 = 1;

	static final Class246_Sub1_Sub5 method398(byte i) {
		try {
			anInt813++;
			if (i != -83)
				return null;
			return Class79.aClass246_Sub1_Sub5_1020;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fg.B(" + i + ')');
		}
	}

	public static void method399(int i) {
		try {
			if (i == 12) {
				aClass_lArray814 = null;
				WORLD_TILE_PACKET = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fg.A(" + i + ')');
		}
	}
}
