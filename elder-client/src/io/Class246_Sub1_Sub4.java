package io;

import io.cache.Cache;
import io.cache.IndexConstants;

public abstract class Class246_Sub1_Sub4 extends NodeSub {
	static IncomingPacket SEND_VAR_BYTE = new IncomingPacket(40, 3);
	static int anInt5751;
	public static void method2445(int i) {
		try {
			SEND_VAR_BYTE = null;
			int i_0_ = 10 % ((-44 - i) / 60);
			TitleScreen.loading_message = null;
			Cache.client_cache.set(IndexConstants.PRE_EOC_634_MATERIALS_INDEX, null);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ba.H(" + i + ')');
		}
	}

	static final int method2446(int i, int i_1_) {
		try {
			if (i != 255)
				SEND_VAR_BYTE = null;
			anInt5751++;
			return 0xff & i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ba.G(" + i + ',' + i_1_ + ')');
		}
	}

	public Class246_Sub1_Sub4() {
		/* empty */
	}
}
