package io;

import io.cache.Cache;
import io.cache.IndexConstants;

abstract class Class82 {
	static IncomingPacket aClass13_1070 = new IncomingPacket(78, 2);
	static Buffer aStream1071 = new Buffer(new byte[5000]);
	static UnderlayLoader underlay_loader;
	static MultilingualString aClass67_1073 = new MultilingualString("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
	static int baseTileX;
	static int[] anIntArray1076 = new int[13];

	abstract byte[] method523(int i, int i_0_, int i_1_);

	abstract byte[] method524(byte i);

	abstract void method525(int i, byte[] is);

	public static void method526(int i) {
		try {
			aClass67_1073 = null;
			underlay_loader = null;
			aStream1071 = null;
			if (i != 13)
				underlay_loader = null;
			Cache.client_cache.set(IndexConstants.PRE_EOC_634_QUICK_CHAT_GLOBAL_INDEX, null);
			anIntArray1076 = null;
			aClass13_1070 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hq.D(" + i + ')');
		}
	}
}
