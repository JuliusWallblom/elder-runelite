package io;

final class Class20 {
	static int anInt314;
	static IncomingPacket aClass13_315 = new IncomingPacket(108, 8);
	static int anInt316;

	static final void method192(long l, int i) {
		try {
			if (Class106.tiles != null) {
				if (Class130_Sub3.anInt4417 != 1 && (Class130_Sub3.anInt4417 ^ 0xffffffff) != -6) {
					if (Class130_Sub3.anInt4417 == 4)
						Model.method659(l, (byte) 1);
				} else
					Class130_Sub4.method2080(115, l);
			}
			anInt316++;
			Class40_Sub2.method1858((long) Client.cycle, Client.sprite_loader, 99);
			if ((Widget.root_interface ^ 0xffffffff) != 0) {
				Class78.method489((byte) -10, Widget.root_interface, 634);
			}
			for (int i_0_ = 0; i_0_ < SequenceType.anInt1738; i_0_++) {
				if (Class246_Sub39.aBoolArray5488[i_0_])
					Class246_Sub28_Sub24.aBoolArray6673[i_0_] = true;
				Class37.aBoolArray546[i_0_] = Class246_Sub39.aBoolArray5488[i_0_];
				Class246_Sub39.aBoolArray5488[i_0_] = false;
			}
			Class130_Sub6.anInt4841 = Client.cycle;
			if (Client.sprite_loader.method1684())
				Class224.aBool3095 = true;
			if (Widget.root_interface != -1) {
				SequenceType.anInt1738 = 0;
				Class128_Sub1.method2329(-9410);
			}
			int i_1_ = -80 % ((i - 29) / 43);
			Client.sprite_loader.e();
			Class246_Sub28_Sub30.method2833((byte) -7, Client.sprite_loader);
			int i_2_ = Class38_Sub1.method2188(-29249);
			if (i_2_ == -1)
				i_2_ = Class83.anInt1089;
			if ((i_2_ ^ 0xffffffff) == 0)
				i_2_ = Class188.anInt2657;
			Camera.method1339(i_2_, (byte) 125);
			Class139.method938(((Class59_Sub3) Client.local_player).y, Class246_Sub17.anInt4663,
					((Class59_Sub3) Client.local_player).x, ((Class59_Sub3) Client.local_player).current_plane,
					(byte) -107);
			Class246_Sub17.anInt4663 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cb.C(" + l + ',' + i + ')');
		}
	}

	public static void method193(int i) {
		try {
			if (i >= -19)
				aClass13_315 = null;
			aClass13_315 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cb.B(" + i + ')');
		}
	}

	static final String method194(long l, int i) {
		try {
			anInt314++;
			if ((l ^ 0xffffffffffffffffL) >= -1L || l >= 6582952005840035281L)
				return null;
			if ((l % 37L ^ 0xffffffffffffffffL) == -1L)
				return null;
			int i_3_ = 0;
			if (i >= -71)
				aClass13_315 = null;
			for (long l_4_ = l; l_4_ != 0L; l_4_ /= 37L)
				i_3_++;
			StringBuffer stringbuffer = new StringBuffer(i_3_);
			while ((l ^ 0xffffffffffffffffL) != -1L) {
				long l_5_ = l;
				l /= 37L;
				char c = Class9.aCharArray106[(int) (l_5_ + -(l * 37L))];
				if ((c ^ 0xffffffff) == -96) {
					int i_6_ = -1 + stringbuffer.length();
					c = '\u00a0';
					stringbuffer.setCharAt(i_6_, Character.toUpperCase(stringbuffer.charAt(i_6_)));
				}
				stringbuffer.append(c);
			}
			stringbuffer.reverse();
			stringbuffer.setCharAt(0, Character.toUpperCase(stringbuffer.charAt(0)));
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cb.A(" + l + ',' + i + ')');
		}
	}
}
