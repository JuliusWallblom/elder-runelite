package io;

public final class RenderSequenceLoader {
	static int anInt1443;
	static int anInt1444;
	static int anInt1445;
	static int anInt1446;
	static MultilingualString aClass67_1447 = new MultilingualString("white:", "weiss:", "blanc:", "branco:");
	static int anInt1448;
	private CacheIndex render_index_634;
	private CacheIndex render_index_osrs;
	private HashMap aClass54_1450 = new HashMap(64);
	static boolean aBool1451 = false;
	static boolean aBool1452 = false;
	static float aFloat1453;

	final void method691(byte i, int i_0_) {
		try {
			synchronized (aClass54_1450) {
				if (i != -51)
					aFloat1453 = 0.2750447F;
				aClass54_1450.method380(i_0_, -50);
			}
			anInt1443++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "v.C(" + i + ',' + i_0_ + ')');
		}
	}

	final void method693(int i) {
		try {
			if (i > -22)
				method695(-71);
			synchronized (aClass54_1450) {
				aClass54_1450.method383(91);
			}
			anInt1446++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "v.B(" + i + ')');
		}
	}

	final RenderAnimation list(boolean bool, int i) {
		try {
			anInt1448++;
			RenderAnimation class135;
			synchronized (aClass54_1450) {
				class135 = (RenderAnimation) aClass54_1450.method379((long) i, (byte) 58);
			}
			if (class135 != null)
				return class135;
			byte[] is = render_index_634.get_file(i, 32);
			class135 = new RenderAnimation();
			if (is != null)
				class135.decode(65535, new Buffer(is));
			synchronized (aClass54_1450) {
				aClass54_1450.method371(1, (long) i, class135);
			}
			return class135;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "v.A(" + bool + ',' + i + ')');
		}
	}

	public static void method695(int i) {
		try {
			if (i != -25819)
				aClass67_1447 = null;
			aClass67_1447 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "v.D(" + i + ')');
		}
	}

	final void method696(int i) {
		try {
			synchronized (aClass54_1450) {
				if (i > -51)
					return;
				aClass54_1450.method369(false);
			}
			anInt1444++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "v.E(" + i + ')');
		}
	}

	RenderSequenceLoader(Class101 class101, int i, CacheIndex render_data_634, CacheIndex render_data_osrs) {
		try {
			render_index_634 = render_data_634;
			render_index_634.child_count(32);
			render_index_osrs = render_data_osrs;
			render_index_osrs.child_count(32);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("v.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (render_data_634 != null ? "{...}" : "null") + ')'));
		}
	}
}
