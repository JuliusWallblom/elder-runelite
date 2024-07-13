package io;

final class IncomingPacket {
	static int anInt183;
	static int anInt184;
	static int anInt185 = 0;
	static int anInt186;
	static int anInt187;
	private int anInt188;
	int anInt189;
	static int anInt190;

	public final String toString() {
		try {
			anInt184++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bg.toString(" + ')');
		}
	}

	static final int method141(boolean bool, int i) {
		try {
			anInt190++;
			if (Class65.aClass6_864 != null) {
				Class65.aClass6_864.method72(false);
				Class65.aClass6_864 = null;
			}
			Class40_Sub5.anInt4913++;
			if (Class40_Sub5.anInt4913 > 4) {
				Class40_Sub5.anInt4913 = 0;
				Class24.anInt349 = 0;
				return i;
			}
			do {
				if ((Class71.anInt925 ^ 0xffffffff) == (Class172.anInt2432 ^ 0xffffffff)) {
					Class172.anInt2432 = Class40_Sub1.anInt3767;
					if (!Client.f_ob)
						break;
				}
				Class172.anInt2432 = Class71.anInt925;
			} while (false);
			Class24.anInt349 = 0;
			if (bool != false)
				return -39;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bg.D(" + bool + ',' + i + ')');
		}
	}

	final int method142(int i) {
		try {
			anInt187++;
			if (i >= -95)
				return 75;
			return anInt188;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bg.C(" + i + ')');
		}
	}

	static final void method143(Class246_Sub43 class246_sub43, int i, int i_0_, byte i_1_, int i_2_) {
		try {
			anInt183++;
			if (i_1_ > 87) {
				long l = (long) (i | (i_2_ << 28 | i_0_ << 14));
				Class246_Sub13 class246_sub13 = ((Class246_Sub13) Class251.aClass85_3551.get(l));
				if (class246_sub13 == null) {
					class246_sub13 = new Class246_Sub13();
					Class251.aClass85_3551.method547(l, -2301, class246_sub13);
					((Class246_Sub13) class246_sub13).aClass166_4423.push_head(class246_sub43);
				} else {
					ObjType class197 = MapRegion.aClass191_3663.list(22883,
							(((Class246_Sub43) class246_sub43).anInt5596));
					int i_3_ = ((ObjType) class197).cost;
					if ((((ObjType) class197).stackability ^ 0xffffffff) == -2)
						i_3_ *= ((Class246_Sub43) class246_sub43).anInt5597 + 1;
					for (Class246_Sub43 class246_sub43_4_ = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423
							.method1104(
									74)); class246_sub43_4_ != null; class246_sub43_4_ = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423
											.method1108((byte) -112))) {
						class197 = (MapRegion.aClass191_3663.list(22883,
								(((Class246_Sub43) class246_sub43_4_).anInt5596)));
						int i_5_ = ((ObjType) class197).cost;
						if ((((ObjType) class197).stackability ^ 0xffffffff) == -2)
							i_5_ *= (((Class246_Sub43) class246_sub43_4_).anInt5597) + 1;
						if (i_3_ > i_5_) {
							Class59_Sub2_Sub3.method2723(class246_sub43_4_, class246_sub43, 47);
							return;
						}
					}
					((Class246_Sub13) class246_sub13).aClass166_4423.push_head(class246_sub43);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bg.A(" + (class246_sub43 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method144(int i) {
		do {
			try {
				Widget.widgets = (new Widget[Widget.widget_data_index.method87((byte) 39)][]);
				anInt186++;
				Widget.some_634_widgets = (new Widget[Widget.widget_data_index.method87((byte) 39)][]);
				Widget.loaded_widgets = (new boolean[Widget.widget_data_index.method87((byte) 39)]);
				if (i == -19181)
					break;
				anInt185 = -1;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bg.B(" + i + ')');
			}
			break;
		} while (false);
	}

	IncomingPacket(int i, int i_6_) {
		try {
			((IncomingPacket) this).anInt189 = i_6_;
			anInt188 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bg.<init>(" + i + ',' + i_6_ + ')');
		}
	}
}
