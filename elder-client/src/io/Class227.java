package io;

final class Class227 {
	private static Class166 aClass166_3120 = new Class166();

	static final void method1452(boolean bool) {
		try {
			if (bool == true) {
				for (;;) {
					Class246_Sub20 class246_sub20 = (Class246_Sub20) aClass166_3120.method1100(4095);
					if (class246_sub20 == null)
						break;
					((Class246_Sub20) class246_sub20).aClass_d4736.EA();
					class246_sub20.remove();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final synchronized void method1453(byte i, Class_d class_d) {
		try {
			Class246_Sub20 class246_sub20 = new Class246_Sub20();
			if (i == 50) {
				((Class246_Sub20) class246_sub20).aClass_d4736 = class_d;
				aClass166_3120.push_head(class246_sub20);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
