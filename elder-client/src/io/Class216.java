package io;

final class Class216 {
	static MultilingualString aClass67_3006 = new MultilingualString("shake:", "sch\u00fctteln:", "tremblement:", "tremor:");
	static HashMap font_cache = new HashMap(20);
	static HashMap font_cache_550 = new HashMap(20);
	static HashMap osrs_font_cache = new HashMap(20);
	static Class68 aClass68_3008;
	static Class232 aClass232_3009;
	static int anInt3010;

	public static void method1403(boolean bool) {
		try {
			aClass232_3009 = null;
			aClass67_3006 = null;
			if (bool == true) {
				aClass68_3008 = null;
				font_cache = null;
				font_cache_550 = null;
				osrs_font_cache = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tk.A(" + bool + ')');
		}
	}
}
