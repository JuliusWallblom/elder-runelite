package io;

final class Class46 {
	int anInt657;
	static int anInt658;
	static int anInt659;
	static int anInt660;
	int anInt661;
	static int anInt662;
	static volatile long aLong663 = 0L;
	static int anInt664;
	int anInt665;
	static int anInt667;
	int anInt668;
	static boolean aBool669 = false;
	int anInt670;
	int anInt671 = 8;
	int anInt672 = 16777215;
	boolean aBool673;

	private final void method308(int i, Buffer stream, byte i_0_) {
		try {
			anInt658++;
			if (i != 1) {
				if ((i ^ 0xffffffff) != -3) {
					if (i == 3) {
						((Class46) this).anInt670 = stream.method2375((byte) 1);
						((Class46) this).anInt665 = stream.method2375((byte) 1);
						((Class46) this).anInt668 = stream.method2375((byte) 1);
					} else if (i != 4) {
						if (i == 5)
							((Class46) this).anInt661 = stream.readUnsignedShort();
						else if ((i ^ 0xffffffff) == -7)
							((Class46) this).anInt672 = stream.read24BitInteger((byte) 29);
					} else
						((Class46) this).anInt657 = stream.readUnsignedByte();
				} else
					((Class46) this).aBool673 = true;
			} else
				((Class46) this).anInt671 = stream.readUnsignedShort();
			int i_1_ = 111 / ((i_0_ + 44) / 39);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("eb.D(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final void method309(Buffer stream, byte i) {
		do {
			try {
				for (;;) {
					int i_2_ = stream.readUnsignedByte();
					if ((i_2_ ^ 0xffffffff) == -1)
						break;
					method308(i_2_, stream, (byte) -116);
				}
				anInt664++;
				if (i <= -13)
					break;
				method311((byte) 114);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("eb.C(" + (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method310(byte i, int i_3_, int i_4_) {
		try {
			anInt662++;
			if (i != 101)
				return true;
			if ((i_3_ & 0x34 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eb.A(" + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method311(byte i) {
		try {
			if (i == 34)
				TitleScreen.logo_image = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eb.B(" + i + ')');
		}
	}

	static final void method312(Widget class235, boolean bool, Widget class235_5_) {
		try {
			Class243.writePacket(-110, MapFunction.SWITCH_INTERFACE_COMPONENTS_OUT);
			anInt660++;
			SomeClass.anInt1827++;
			Class130_Sub1.stream.writeInt(((Widget) class235).hash, (byte) -76);
			if (bool != true)
				method312(null, true, null);
			Class130_Sub1.stream.writeShortLE128((byte) -57, ((Widget) class235).index);
			Class130_Sub1.stream.writeIntV1(((Widget) class235_5_).hash, 690087856);
			Class130_Sub1.stream.writeShortLE128((byte) -87, ((Widget) class235_5_).index);
			Class130_Sub1.stream.writeShortLE(((Widget) class235_5_).item_id, (byte) 121);
			Class130_Sub1.stream.writeShortLE(((Widget) class235).item_id, (byte) 98);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eb.E(" + (class235 != null ? "{...}" : "null") + ',' + bool
					+ ',' + (class235_5_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class3 method313(byte i, int i_6_, Class59_Sub3 class59_sub3) {
		try {
			anInt659++;
			Class3 class3;
			do {
				if (Class246_Sub4.aClass3_3860 != null) {
					class3 = Class246_Sub4.aClass3_3860;
					Class246_Sub4.aClass3_3860 = ((Class3) Class246_Sub4.aClass3_3860).aClass3_28;
					((Class3) class3).aClass3_28 = null;
					Class246_Sub1_Sub10.f_cb--;
					if (!Client.f_ob)
						break;
				}
				class3 = new Class3();
			} while (false);
			((Class3) class3).aClass59_Sub3_24 = class59_sub3;
			((Class3) class3).anInt31 = i_6_;
			int i_7_ = -56 / ((69 - i) / 36);
			return class3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("eb.F(" + i + ',' + i_6_ + ',' + (class59_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class46() {
		/* empty */
	}
}
