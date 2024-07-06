package io;

import io.cache.Cache;
import io.cache.IndexConstants;

final class Class111 {
	static int anInt1576;

	public static void method768(boolean bool) {
		try {
			if (bool != true)
				method768(true);
			Cache.client_cache.set(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX, null);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kl.A(" + bool + ')');
		}
	}
}
