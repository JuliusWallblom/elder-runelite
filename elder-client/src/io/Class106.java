package io;

abstract class Class106 {
	int anInt1489;
	byte[] aByteArray1490 = new byte[5000];
	Object[] anObjectArray1491 = new Object[5000];
	int anInt1492 = 0;
	volatile int anInt1493;
	static Tile[][][] tiles;
	float[] aFloatArray1495;
	volatile int anInt1496 = 0;

	public static void method719(byte i) {
		do {
			try {
				tiles = null;
				if (i >= 116)
					break;
				tiles = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ke.O(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract void method720(int i);

	abstract void method721(int i);

	abstract void method722(int i, int i_0_);

	abstract void method723(Tile class147, byte i);

	abstract void method724(byte i, int i_1_);

	abstract void method725(byte i, Tile class147);

	abstract void method726(int i, boolean bool, Class210 class210, float f, byte i_2_);

	abstract void method727(Tile class147, int i);

	public Class106() {
		((Class106) this).anInt1489 = 0;
		((Class106) this).anInt1493 = 0;
		((Class106) this).aFloatArray1495 = new float[5000];
	}
}
