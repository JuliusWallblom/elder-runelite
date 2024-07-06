package io;

final class Class246_Sub28_Sub6 extends TextureOperation {
	static int anInt6035;
	static int anInt6036;
	static int anInt6037;
	static int anInt6038;
	static int anInt6039;
	static Class169 aClass169_6040 = new Class169("", 12);
	static int[][] anIntArrayArray6042;
	static int[] anIntArray6043 = new int[1000];
	static MultilingualString aClass67_6044 = new MultilingualString("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
	static int anInt6045;
	static int anInt6046;

	static final void method2551(Widget class235, int i) {
		try {
			anInt6037++;
			if (i == 18804) {
				if (Class100_Sub1.anInt5076 == ((Widget) class235).content_type) {
					if (((Player) Client.local_player).aString7140 == null) {
						((Widget) class235).anInt3289 = 0;
						((Widget) class235).model_id = 0;
					} else {
						((Widget) class235).model_rotation_x = 150;
						((Widget) class235).model_rotation_y = (0x7ff & (int) (256.0 * Math.sin((double) (Client.cycle) / 40.0)));
						((Widget) class235).model_type = 5;
						((Widget) class235).model_id = Class109.anInt1567;
						((Widget) class235).anInt3289 = (Class246_Sub1_Sub4_Sub1.method2893((byte) -93, (((Player) Client.local_player).aString7140)));
						((Widget) class235).anInt3221 = ((Entity) Client.local_player).f_cb;
						((Widget) class235).model_frame = ((Entity) Client.local_player).anInt6420;
						((Widget) class235).model_frame_cycle = 0;
						((Widget) class235).sequence_id = ((Entity) Client.local_player).anInt6470;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eq.B(" + (class235 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method2552(byte i) {
		try {
			anIntArray6043 = null;
			aClass169_6040 = null;
			anIntArrayArray6042 = null;
			if (i < 8)
				Widget.click_widget(null, 33, 91, -65);
			aClass67_6044 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eq.H(" + i + ')');
		}
	}

	static final void method2553(int i) {
		do {
			try {
				anInt6039++;
				for (Class246_Sub1_Sub7 class246_sub1_sub7 = ((Class246_Sub1_Sub7) Class12.aClass166_180.method1104(40)); class246_sub1_sub7 != null; class246_sub1_sub7 = ((Class246_Sub1_Sub7) Class12.aClass166_180.method1108((byte) -112))) {
					Class_g class_g = (((Class246_Sub1_Sub7) class246_sub1_sub7).aClass_g6034);
					if ((Class246_Sub28_Sub24.anInt6681 != ((Class59_Sub3) class_g).current_plane) || ((((Class_g) class_g).anInt6492 ^ 0xffffffff) > (Client.cycle ^ 0xffffffff))) {
						class246_sub1_sub7.remove();
						class_g.method2683((byte) -105);
					} else if ((((Class_g) class_g).f_hb ^ 0xffffffff) >= (Client.cycle ^ 0xffffffff)) {
						if ((((Class_g) class_g).anInt6503 ^ 0xffffffff) < -1) {
							Npc class_r_sub2 = (VarcLoader.aClass_r_Sub2Array1002[((Class_g) class_g).anInt6503 - 1]);
							if (class_r_sub2 != null && (((Class59_Sub3) class_r_sub2).x ^ 0xffffffff) <= -1 && ((128 * Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (((Class59_Sub3) class_r_sub2).x ^ 0xffffffff)) && (((Class59_Sub3) class_r_sub2).y ^ 0xffffffff) <= -1 && ((Class152.anInt2205 * 128 ^ 0xffffffff) < (((Class59_Sub3) class_r_sub2).y ^ 0xffffffff)))
								class_g.method2686(Client.cycle, ((Class59_Sub3) class_r_sub2).x, (Class6.getAverageHeight(((Class59_Sub3) class_r_sub2).x, 86, (((Class59_Sub3) class_g).current_plane), ((Class59_Sub3) class_r_sub2).y) - ((Class_g) class_g).anInt6502), ((Class59_Sub3) class_r_sub2).y, 16);
						}
						if (((Class_g) class_g).anInt6503 < 0) {
							int i_2_ = -1 + -((Class_g) class_g).anInt6503;
							Player class_r_sub1;
							if ((Class109.anInt1567 ^ 0xffffffff) == (i_2_ ^ 0xffffffff))
								class_r_sub1 = Client.local_player;
							else
								class_r_sub1 = Class143.players[i_2_];
							if (class_r_sub1 != null && (((Class59_Sub3) class_r_sub1).x ^ 0xffffffff) <= -1 && (((Class59_Sub3) class_r_sub1).x < 128 * Class38_Sub1_Sub1.anInt6770) && (((Class59_Sub3) class_r_sub1).y ^ 0xffffffff) <= -1 && (((Class59_Sub3) class_r_sub1).y < Class152.anInt2205 * 128))
								class_g.method2686(Client.cycle, ((Class59_Sub3) class_r_sub1).x, (Class6.getAverageHeight(((Class59_Sub3) class_r_sub1).x, i ^ 0x6569, (((Class59_Sub3) class_g).current_plane), ((Class59_Sub3) class_r_sub1).y) - ((Class_g) class_g).anInt6502), ((Class59_Sub3) class_r_sub1).y, 71);
						}
						class_g.method2687((byte) -51, Class246_Sub17.anInt4663);
						Class176.method1156(class_g, true);
					}
				}
				if (i == 25861)
					break;
				anIntArrayArray6042 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "eq.D(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class246_Sub28_Sub6() {
		super(0, true);
	}

	static final long method2554(int i, String string) {
		try {
			anInt6038++;
			long l = 0L;
			int i_3_ = string.length();
			if (i != 1)
				method2554(-9, null);
			for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
				l *= 37L;
				int i_5_ = string.charAt(i_4_);
				if ((i_5_ ^ 0xffffffff) <= -66 && i_5_ <= 90)
					l += (long) (i_5_ + 1 - 65);
				else if (i_5_ >= 97 && i_5_ <= 122)
					l += (long) (i_5_ + 1 - 97);
				else if ((i_5_ ^ 0xffffffff) <= -49 && (i_5_ ^ 0xffffffff) >= -58)
					l += (long) (-48 + i_5_ + 27);
				if ((l ^ 0xffffffffffffffffL) <= -177917621779460414L)
					break;
			}
			for (/**/; ((l % 37L ^ 0xffffffffffffffffL) == -1L && (l ^ 0xffffffffffffffffL) != -1L); l /= 37L) {
				/* empty */
			}
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eq.C(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method2135(int i, int i_6_) {
		try {
			anInt6035++;
			int[] is = ((TextureOperation) this).aClass66_4938.method435((byte) -112, i_6_);
			if (((Class66) ((TextureOperation) this).aClass66_4938).aBool887)
				Class117.method802(is, 0, Class246_Sub37_Sub1.f_gb, Varc.anIntArray6245[i_6_]);
			int i_7_ = -55 / ((67 - i) / 50);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eq.E(" + i + ',' + i_6_ + ')');
		}
	}
}
