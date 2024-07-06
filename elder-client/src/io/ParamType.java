package io;

final class ParamType {
	String defaultStr;
	static int anInt1630;
	static int anInt1631;
	static int anInt1632;
	boolean aBool1633 = true;
	int default_int;
	static int anInt1635;
	static int anInt1636;
	static int anInt1637;
	static int anInt1638;
	static int anInt1639;
	private char aChar1640;
	static RenderSequenceLoader aClass_v1641;

	public static void method808(int i) {
		try {
			int i_0_ = 32 % ((-42 - i) / 45);
			aClass_v1641 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lg.E(" + i + ')');
		}
	}

	static final boolean method809(int i, int i_1_) {
		try {
			anInt1632++;
			if (i_1_ != -6)
				anInt1636 = -2;
			if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -8)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lg.D(" + i + ',' + i_1_ + ')');
		}
	}

	final boolean is_string(int i) {
		try {
			anInt1637++;
			if (i != 115)
				aChar1640 = '\uff9c';
			if (aChar1640 != 's')
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lg.B(" + i + ')');
		}
	}

	static final void method811(int i, byte i_2_) {
		try {
			Widget.custom_pre_eoc_550_sprite_cache.method380(i, -50);
			Widget.pre_eoc_550_sprite_cache.method380(i, -50);
			Widget.pre_eoc_634_sprite_cache.method380(i, -50);
			Widget.osrs_widget_sprite_cache.method380(i, -50);
			if (i_2_ != 55)
				aClass_v1641 = null;
			anInt1630++;
			Class_ls.aClass54_963.method380(i, -50);
			Class216.font_cache.method380(i, -50);
			Class216.font_cache_550.method380(i, -50);
			Class216.osrs_font_cache.method380(i, -50);
			Class29.aClass54_387.method380(i, -50);
			Class84.aClass54_1097.method380(i, i_2_ - 105);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lg.G(" + i + ',' + i_2_ + ')');
		}
	}

	private final void method812(int i, Buffer stream, int i_3_) {
		try {
			if (i == (i_3_ ^ 0xffffffff))
				aChar1640 = Class246_Sub1_Sub8_Sub1.method2923(32404, stream.readByte());
			else if ((i_3_ ^ 0xffffffff) == -3)
				((ParamType) this).default_int = stream.readInt((byte) 95);
			else if (i_3_ == 4)
				((ParamType) this).aBool1633 = false;
			else if ((i_3_ ^ 0xffffffff) == -6)
				((ParamType) this).defaultStr = stream.readString((byte) -40);
			anInt1635++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("lg.F(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	static final void method813(boolean bool, NodeSub class246_sub1, NodeSub class246_sub1_4_) {
		do {
			try {
				anInt1638++;
				if (((NodeSub) class246_sub1_4_).nextDual != null)
					class246_sub1_4_.removeDual();
				((NodeSub) class246_sub1_4_).nextDual = class246_sub1;
				((NodeSub) class246_sub1_4_).previousDual = ((NodeSub) class246_sub1).previousDual;
				((NodeSub) (((NodeSub) class246_sub1_4_).nextDual)).previousDual = class246_sub1_4_;
				((NodeSub) (((NodeSub) class246_sub1_4_).previousDual)).nextDual = class246_sub1_4_;
				if (bool == true)
					break;
				method808(102);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("lg.A(" + bool + ',' + (class246_sub1 != null ? "{...}" : "null") + ','
								+ (class246_sub1_4_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void decode(Buffer stream, byte i) {
		try {
			if (i != 71)
				((ParamType) this).defaultStr = null;
			anInt1631++;
			for (;;) {
				int i_5_ = stream.readUnsignedByte();
				if ((i_5_ ^ 0xffffffff) == -1)
					break;
				method812(-2, stream, i_5_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lg.H(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static ParamType list(int i_5_) {
		return list(i_5_, 634);
	}

	public static ParamType list(int i_5_, int revision) {
		try {
			ParamLoader.anInt2307++;
			ParamType class118;
			if (revision < 200) {
				synchronized (ParamLoader.param_cache_osrs) {
					class118 = (ParamType) ParamLoader.param_cache_osrs.method379((long) i_5_, (byte) 58);
				}
			} else if (revision == 550) {
				synchronized (ParamLoader.param_cache_550) {
					class118 = (ParamType) ParamLoader.param_cache_550.method379((long) i_5_, (byte) 58);
				}
			} else {
				synchronized (ParamLoader.param_cache_634) {
					class118 = (ParamType) ParamLoader.param_cache_634.method379((long) i_5_, (byte) 58);
				}
			}
			if (class118 != null)
				return class118;
			byte[] is;
			if (revision < 200) {
				is = ParamLoader.param_data_osrs.get_file(i_5_, 11);
			} else if (revision == 550) {
				is = ParamLoader.param_data_550.get_file(i_5_, 11);
			} else {
				is = ParamLoader.param_data_634.get_file(i_5_, 11);
			}
			class118 = new ParamType();
			if (is != null)
				class118.decode(new Buffer(is), (byte) 71);
			if (revision < 200) {
				synchronized (ParamLoader.param_cache_osrs) {
					ParamLoader.param_cache_osrs.method371(1, (long) i_5_, class118);
				}
			} else if (revision == 550) {
				synchronized (ParamLoader.param_cache_550) {
					ParamLoader.param_cache_550.method371(1, (long) i_5_, class118);
				}
			} else {
				synchronized (ParamLoader.param_cache_634) {
					ParamLoader.param_cache_634.method371(1, (long) i_5_, class118);
				}
			}

			return class118;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public ParamType() {
		/* empty */
	}

	static final void method815(byte i) {
		do {
			try {
				anInt1639++;
				Class59_Sub4.aBool5189 = true;
				if (i == -36)
					break;
				method815((byte) 60);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lg.C(" + i + ')');
			}
			break;
		} while (false);
	}
}
