package io;

final class Varc extends NodeSub {
	Class303 aClass162_6236;
	Class4 aClass4_6237;
	int anInt6238;
	static int anInt6239;
	int anInt6240;
	int anInt6241;
	int anInt6242;
	static int anInt6243;
	static int anInt6244;
	static int[] anIntArray6245;
	static int[] varcs_634, varcs_550, varcs_osrs;
	int anInt6247;

	public static void method2613(boolean bool) {
		do {
			try {
				varcs_634 = null;
				varcs_550 = null;
				varcs_osrs = null;
				anIntArray6245 = null;
				if (bool == true)
					break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ij.D(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method2614(CacheIndex class_fs, int i) {
		do {
			try {
				Class166.aClass_fs2344 = class_fs;
				anInt6243++;
				if (i == 23028)
					break;
				method2614(null, -111);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ij.B(" + (class_fs != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method2615(byte i) {
		try {
			if (i <= 81)
				anIntArray6245 = null;
			anInt6239++;
			if ((Class246_Sub1_Sub7.anInt6030 ^ 0xffffffff) < -1)
				RenderAnimation.logout(2700);
			else {
				IdentityKitLoader.aClass6_1208 = Class65.aClass6_864;
				Class65.aClass6_864 = null;
				Class99.updateGameState((byte) 1, 40);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ij.A(" + i + ')');
		}
	}

	final void method2616(int i) {
		try {
			((Varc) this).anInt6242 = (((Class303) ((Varc) this).aClass162_6236).anInt2292);
			((Varc) this).anInt6240 = (((Class303) ((Varc) this).aClass162_6236).anInt2294);
			anInt6244++;
			((Varc) this).anInt6247 = (((Class303) ((Varc) this).aClass162_6236).anInt2301);
			if ((((Class303) ((Varc) this).aClass162_6236).aClass_c2291) != null)
				((Class303) ((Varc) this).aClass162_6236).aClass_c2291.p((((Class4) ((Varc) this).aClass4_6237).anInt44), (((Class4) ((Varc) this).aClass4_6237).anInt40), (((Class4) ((Varc) this).aClass4_6237).anInt48), Class59_Sub4_Sub2.anIntArray6832);
			((Varc) this).anInt6241 = Class59_Sub4_Sub2.anIntArray6832[i];
			((Varc) this).anInt6238 = Class59_Sub4_Sub2.anIntArray6832[0];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ij.C(" + i + ')');
		}
	}

	Varc(Class303 class162, Class130_Sub2 class130_sub2) {
		try {
			((Varc) this).aClass162_6236 = class162;
			((Varc) this).aClass4_6237 = ((Varc) this).aClass162_6236.method1078((byte) 125);
			method2616(2);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ij.<init>(" + (class162 != null ? "{...}" : "null") + ',' + (class130_sub2 != null ? "{...}" : "null") + ')'));
		}
	}
}
