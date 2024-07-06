package io;

final class SomeClass {
	static Class68[] aClass68Array1822 = new Class68[5];
	int anInt1823;
	static int anInt1824;
	static int anInt1825;
	static int anInt1826;
	static int anInt1827;
	int anInt1828;
	int anInt1829;
	int anInt1830;

	static final void decodeLocalNPCMasks(byte i) {
		do {
			try {
				anInt1824++;
				for (int i_0_ = 0; Class59_Sub5_Sub1.anInt5826 > i_0_; i_0_++) {
					int i_1_ = Class251.anIntArray3552[i_0_];
					Npc npc = VarcLoader.aClass_r_Sub2Array1002[i_1_];
					int i_2_ = Class78.packetStream.readUnsignedByte();
					if ((0x40 & i_2_ ^ 0xffffffff) != -1)
						i_2_ += Class78.packetStream.readUnsignedByte() << 8;

					if ((0x1000 & i_2_) != 0) { // 1
						int i_3_ = Class78.packetStream.readUnsignedByteC(-101);
						int[] is = new int[i_3_];
						int[] is_4_ = new int[i_3_];
						int[] is_5_ = new int[i_3_];
						for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
							int i_7_ = Class78.packetStream.readUnsignedShort();
							if (i_7_ == 65535)
								i_7_ = -1;
							is[i_6_] = i_7_;
							is_4_[i_6_] = Class78.packetStream.readUnsignedByte128(27574);
							is_5_[i_6_] = Class78.packetStream.readUnsignedShort();
						}
						Class_q_Sub1.method2734(is_4_, npc, is, false, is_5_);
					}

					if ((0x10 & i_2_ ^ 0xffffffff) != -1) { // 2 transformation
						if (((Npc) npc).aClass253_7184.method1628(-61))
							Class246_Sub28_Sub35.method2874(npc, 16777216);
						npc.method2934((byte) -121,
								(Class179.aClass228_2518.list(Class78.packetStream.readUnsignedShort())));
						npc.method2673(((NpcType) (((Npc) npc).aClass253_7184)).size, (byte) -120);
						((Entity) npc).f_cc = ((NpcType) (((Npc) npc).aClass253_7184)).degreesToTurn << 3;
						if (((Npc) npc).aClass253_7184.method1628(112))
							Class66.method434(((Entity) npc).f_mc[0], -1, npc, null, ((Entity) npc).f_nc[0], 0,
									(((Class59_Sub3) npc).current_plane), null);
					}
					if ((0x2 & i_2_) != 0) { // 3 hits 2
						int i_8_ = Class78.packetStream.readSmart((byte) 74);
						int i_9_ = Class78.packetStream.readUnsignedByte128(27574);
						npc.method2665(68, i_8_, Client.cycle, i_9_);
					}
					if ((i_2_ & 0x400 ^ 0xffffffff) != -1) { // 4 face tile
						((Npc) npc).f_vc = Class78.packetStream.readUnsignedShort128(952968608);
						((Npc) npc).anInt7171 = Class78.packetStream.readUnsignedShortLE(119);
					}
					if ((0x100 & i_2_ ^ 0xffffffff) != -1) { // 5 force movement
						((Entity) npc).f_nb = Class78.packetStream.read128Byte(128);
						((Entity) npc).f_wb = Class78.packetStream.read128Byte(128);
						((Entity) npc).f_ob = Class78.packetStream.readByteC(0);
						((Entity) npc).anInt6466 = Class78.packetStream.read128Byte(128);
						((Entity) npc).anInt6422 = (Class78.packetStream.readUnsignedShort() + Client.cycle);
						((Entity) npc).anInt6428 = (Class78.packetStream.readUnsignedShort128(952968608)
								+ Client.cycle);
						((Entity) npc).f_lb = Class78.packetStream.readUnsigned128Byte();
						((Entity) npc).f_wb += ((Entity) npc).f_nc[0];
						((Entity) npc).anInt6466 += ((Entity) npc).f_nc[0];
						((Entity) npc).f_nb += ((Entity) npc).f_mc[0];
						((Entity) npc).f_ob += ((Entity) npc).f_mc[0];
						((Entity) npc).f_oc = 1;
						((Entity) npc).f_sc = 0;
					}
					if ((0x800 & i_2_) != 0) { // 6 gfx 2
						int i_10_ = Class78.packetStream.readUnsignedShort();
						int revision = Class78.packetStream.readInt();
						int i_11_ = Class78.packetStream.readIntV1(-99);
						if (i_10_ == 65535)
							i_10_ = -1;
						int i_12_ = Class78.packetStream.readUnsigned128Byte();
						npc.sendSpotAnimation(0, i_12_, i_11_, true, i_10_, revision);
					}
					if ((i_2_ & 0x4) != 0) { // 7 animation
						int revision = Class78.packetStream.readInt();
						int i_13_ = Class78.packetStream.readUnsignedShortLE(123);
						if ((i_13_ ^ 0xffffffff) == -65536)
							i_13_ = -1;
						int i_14_ = Class78.packetStream.readUnsigned128Byte();
						Class246_Sub4.method1808(i_13_, i_14_, 1, npc, revision);
					}
					if ((i_2_ & 0x2000 ^ 0xffffffff) != -1) { // 8 color change
						((Entity) npc).aByte6468 = Class78.packetStream.readByte128(-109);
						((Entity) npc).aByte6436 = Class78.packetStream.readByte128(-98);
						((Entity) npc).f_mb = Class78.packetStream.readByte128(-70);
						((Entity) npc).aByte6425 = (byte) Class78.packetStream.readUnsignedByteC(-123);
						((Entity) npc).anInt6424 = (Client.cycle
								- -Class78.packetStream.readUnsignedShortLE128((byte) 55));
						((Entity) npc).anInt6460 = (Client.cycle + Class78.packetStream.readUnsignedShort());
					}
					if ((i_2_ & 0x1 ^ 0xffffffff) != -1) { // 9 gfx 1
						int i_15_ = Class78.packetStream.readUnsignedShort128(952968608);
						if ((i_15_ ^ 0xffffffff) == -65536)
							i_15_ = -1;
						int revision = Class78.packetStream.readInt();
						int i_16_ = Class78.packetStream.readIntV2(97);
						int i_17_ = Class78.packetStream.readUnsigned128Byte();
						npc.sendSpotAnimation(0, i_17_, i_16_, false, i_15_, revision);
					}
					if ((0x200 & i_2_) != 0) { // 10 secondary hp bar
						int i_18_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
						((Entity) npc).f_vb = Class78.packetStream.readUnsignedByte128(27574);
						((Entity) npc).anInt6444 = Class78.packetStream.readUnsignedByte();
						System.out.println("idk: " + ((Entity) npc).anInt6444);

						((Entity) npc).f_jb = 0x7fff & i_18_;
						((Entity) npc).aBool6414 = (0x8000 & i_18_) != 0;
						((Entity) npc).f_bb = (((Entity) npc).f_vb + Client.cycle + ((Entity) npc).f_jb);
					}
					if ((i_2_ & 0x8 ^ 0xffffffff) != -1) { // 11 face entity
						((Entity) npc).faceEntity = Class78.packetStream.readUnsignedShort128(952968608);
						if ((((Entity) npc).faceEntity ^ 0xffffffff) == -65536)
							((Entity) npc).faceEntity = -1;
					}
					if ((i_2_ & 0x80 ^ 0xffffffff) != -1) { // 12 force talk
						((Entity) npc).aString6429 = Class78.packetStream.readString((byte) -40);
						((Entity) npc).anInt6471 = 100;
					}
					if ((0x20 & i_2_ ^ 0xffffffff) != -1) { // 13 hits mask 1
						int i_19_ = Class78.packetStream.readSmart((byte) 94);
						int i_20_ = Class78.packetStream.readUnsignedByte128(27574);
						npc.method2665(69, i_19_, Client.cycle, i_20_);
						((Entity) npc).anInt6464 = Client.cycle + 300;
						((Entity) npc).anInt6432 = Class78.packetStream.readUnsignedByte128(27574);
					}
				}
				if (i >= 123)
					break;
				method889(-125);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "me.D(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method889(int i) {
		do {
			try {
				aClass68Array1822 = null;
				if (i == 1)
					break;
				decodeLocalNPCMasks((byte) 85);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "me.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final SomeClass method890(boolean bool, int i) {
		try {
			if (bool != true)
				return null;
			anInt1825++;
			return new SomeClass(((SomeClass) this).anInt1828, i, ((SomeClass) this).anInt1829,
					((SomeClass) this).anInt1830);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "me.A(" + bool + ',' + i + ')');
		}
	}

	static final void method891(byte i) {
		try {
			for (int i_21_ = 0; Class45.tileRenderFlags.length > i_21_; i_21_++) {
				for (int i_22_ = 0; ((Class45.tileRenderFlags[0].length ^ 0xffffffff) < (i_22_
						^ 0xffffffff)); i_22_++) {
					for (int i_23_ = 0; i_23_ < Class45.tileRenderFlags[0][0].length; i_23_++)
						Class45.tileRenderFlags[i_21_][i_22_][i_23_] = (byte) 0;
				}
			}
			if (i > 7)
				anInt1826++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "me.C(" + i + ')');
		}
	}

	SomeClass(int i, int i_24_, int i_25_, int i_26_) {
		try {
			((SomeClass) this).anInt1823 = i_24_;
			((SomeClass) this).anInt1830 = i_26_;
			((SomeClass) this).anInt1828 = i;
			((SomeClass) this).anInt1829 = i_25_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("me.<init>(" + i + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
		}
	}

	static {
		for (int i = 0; (aClass68Array1822.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			aClass68Array1822[i] = new Class68();
		new MultilingualString("Unable to send message - system busy.",
				"Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.",
				"Impossible d'envoyer un message - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel enviar a mensagem. O sistema est\u00e1 ocupado.");
	}
}
