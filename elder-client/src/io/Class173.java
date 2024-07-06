package io;

final class Class173 {
	static int anInt2434;
	static int anInt2435;
	static int anInt2436;
	int anInt2437;
	static IncomingPacket aClass13_2438;
	static int anInt2439;
	int anInt2440 = 0;
	static int anInt2441;
	static int[] anIntArray2442;
	int anInt2443;
	static int anInt2444;
	int anInt2445;
	static int anInt2446;

	static final void method1136(int i) {
		try {
			anInt2446++;
			Class192 class192 = null;
			if (i == -22125) {
				try {
					Class182 class182 = Client.sign_link.method365((byte) -93, "2");
					while (class182.anInt2539 == 0)
						Class247.method1580(1L, -5184);
					if (class182.anInt2539 == 1) {
						class192 = (Class192) class182.anObject2535;
						Buffer stream = new Buffer(SpotAnimType.anInt2085 * 6 + 3);
						stream.writeByte(i + 22380, 1);
						stream.writeShort((byte) 67, SpotAnimType.anInt2085);
						for (int i_0_ = 0; Varc.varcs_634.length > i_0_; i_0_++) {
							if (Class59_Sub3_Sub1.varcs_loaded_634[i_0_]) {
								stream.writeShort((byte) 67, i_0_);
								stream.writeInt((Varc.varcs_634[i_0_]), (byte) 112);
							}
						}
						class192.method1265(0, ((Buffer) stream).position, ((Buffer) stream).buffer, 1);
					}
				} catch (Exception exception) {
					/* empty */
				}
				try {
					if (class192 != null)
						class192.method1262(i + 22124);
				} catch (Exception exception) {
					/* empty */
				}
				PacketsDecoder.aLong273 = TimeUtility.time();
				Class246_Sub28_Sub10.aBool6159 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pu.A(" + i + ')');
		}
	}

	static final void method1137(boolean bool) {
		try {
			synchronized (SomeClass.aClass68Array1822) {
				if (bool != false)
					aClass13_2438 = null;
				for (int i = 0; ((i ^ 0xffffffff) > (SomeClass.aClass68Array1822.length ^ 0xffffffff)); i++) {
					SomeClass.aClass68Array1822[i] = new Class68();
					Class246_Sub1_Sub7.anIntArray6027[i] = 0;
				}
			}
			anInt2435++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pu.F(" + bool + ')');
		}
	}

	final void method1138(boolean bool, Buffer stream) {
		do {
			try {
				for (;;) {
					int i = stream.readUnsignedByte();
					if ((i ^ 0xffffffff) == -1)
						break;
					method1140(i, (byte) 120, stream);
				}
				anInt2436++;
				if (bool == false)
					break;
				anIntArray2442 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("pu.G(" + bool + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method1139(byte i) {
		try {
			if (i < 93)
				anInt2444 = -35;
			aClass13_2438 = null;
			anIntArray2442 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pu.E(" + i + ')');
		}
	}

	private final void method1140(int i, byte i_1_, Buffer stream) {
		try {
			if (i_1_ != 120)
				method1141(62, 36, -56);
			if (i != 1) {
				if ((i ^ 0xffffffff) == -3)
					((Class173) this).anInt2445 = stream.readUnsignedShort();
				else if (i == 3)
					((Class173) this).anInt2443 = stream.readUnsignedShort();
				else if (i == 4)
					((Class173) this).anInt2437 = stream.method2375((byte) 1);
			} else
				((Class173) this).anInt2440 = stream.readUnsignedByte();
			anInt2439++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pu.B(" + i + ',' + i_1_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1141(int i, int i_2_, int i_3_) {
		try {
			anInt2441++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_2_, (byte) 122, i);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pu.C(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final Class205 method1142(int i, boolean bool) {
		try {
			anInt2434++;
			Class205[] class205s = Class246_Sub1_Sub2.method2425(0);
			for (int i_4_ = 0; i_4_ < class205s.length; i_4_++) {
				Class205 class205 = class205s[i_4_];
				if (i == ((Class205) class205).anInt2882)
					return class205;
			}
			if (bool != true)
				anIntArray2442 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pu.D(" + i + ',' + bool + ')');
		}
	}

	public Class173() {
		((Class173) this).anInt2437 = 0;
		((Class173) this).anInt2445 = 2048;
		((Class173) this).anInt2443 = 2048;
	}

	static {
		new MultilingualString("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es sp\u00e4ter erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez r\u00e9essayer ult\u00e9rieurement.", "Erro ao enviar mensagem ao canal de cl\u00e3. Tente de novo depois!");
		anIntArray2442 = new int[2];
		anInt2444 = 0;
	}
}
