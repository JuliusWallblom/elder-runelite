package io;

import io.cache.Revision;

final class MapFunction {
	static int anInt1989;
	static int anInt1990;
	boolean aBool1991 = true;
	private IterableNodeHashTable aClass85_1992;
	private int anInt1993;
	int anInt1994 = 0;
	static int anInt1995;
	boolean aBool1996;
	int anInt1997;
	String aString1998;
	int anInt1999;
	int anInt2000;
	private int anInt2001;
	private int anInt2002;
	static int anInt2003;
	private int anInt2004;
	int anInt2005 = -1;
	int anInt2006;
	static Class_c aClass_c2007;
	int anInt2008;
	MapFunctions aClass165_2009;
	static MultilingualString aClass67_2010 = new MultilingualString("Loaded world map", "Weltkarte geladen",
			"Mappemonde charg\u00e9e", "Mapa-m\u00fandi carregado");
	private int anInt2011;
	private int anInt2012;
	int anInt2013;
	int anInt2014;
	static int anInt2015;
	String aString2016;
	static int anInt2017;
	static int anInt2018;
	static int anInt2019;
	private int anInt2020;
	int anInt2021;
	int anInt2022;
	int anInt2023;
	static int anInt2024;
	private int anInt2025;
	int anInt2026;
	int[] anIntArray2027;
	boolean aBool2028;
	String[] aStringArray2029;
	static int anInt2030;
	static int anInt2031;
	int anInt2032;
	static int anInt2033;
	static HashMap aClass54_2034 = new HashMap(4);
	private int anInt2035;
	static Class242 aClass242_2036;
	boolean aBool2037;
	int anInt2038;
	static int anInt2039;
	static IncomingPacket aClass13_2040 = new IncomingPacket(84, 2);
	static OutgoingPacket SWITCH_INTERFACE_COMPONENTS_OUT = new OutgoingPacket(75, 16);

	static final void method939(byte i) {
		try {
			anInt2017++;
			for (Class246_Sub5 class246_sub5 = (Class246_Sub5) Class150.aClass166_2195
					.method1104(112); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) Class150.aClass166_2195
							.method1108((byte) -112))) {
				if (((Class246_Sub5) class246_sub5).aBool3873)
					class246_sub5.method1811(-2212);
			}
			for (Class246_Sub5 class246_sub5 = (Class246_Sub5) VarcLoader.aClass166_992
					.method1104(56); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) VarcLoader.aClass166_992
							.method1108((byte) -112))) {
				if (((Class246_Sub5) class246_sub5).aBool3873)
					class246_sub5.method1811(-2212);
			}
			int i_0_ = -11 % ((-87 - i) / 39);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.A(" + i + ')');
		}
	}

	static final String method940(boolean bool, Buffer stream) {
		try {
			if (bool != false)
				method951(null, null, -9, 97, 73);
			anInt2031++;
			return Class40_Sub8.method2211(0, stream, 32767);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nf.H(" + bool + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final String method941(int i, String string, int i_1_) {
		try {
			anInt2018++;
			if (i < 77)
				decode(null, 87);
			if (aClass85_1992 == null)
				return string;
			Class246_Sub4 class246_sub4 = (Class246_Sub4) aClass85_1992.get((long) i_1_);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nf.J(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	final boolean method942(int i, Interface11 interface11) {
		try {
			anInt2030++;
			int i_2_;
			if (anInt2012 != -1)
				i_2_ = interface11.method35(anInt2012, 0, 634);
			else {
				if (anInt2035 == -1)
					return true;
				i_2_ = interface11.getVarBitValue((byte) 45, anInt2035, 634);
			}
			if (i != -11247)
				((MapFunction) this).anInt1994 = 116;
			if ((i_2_ ^ 0xffffffff) > (anInt2020 ^ 0xffffffff) || anInt1993 < i_2_)
				return false;
			boolean bool = false;
			int i_3_;
			if (anInt2002 == -1) {
				if ((anInt2001 ^ 0xffffffff) == 0)
					return true;
				i_3_ = interface11.getVarBitValue((byte) 45, anInt2001, 634);
			} else
				i_3_ = interface11.method35(anInt2002, 0, 634);
			if ((anInt2025 ^ 0xffffffff) < (i_3_ ^ 0xffffffff) || anInt2011 < i_3_)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"nf.I(" + i + ',' + (interface11 != null ? "{...}" : "null") + ')');
		}
	}

	final int method943(int i, int i_4_, int i_5_) {
		try {
			anInt2033++;
			if (aClass85_1992 == null)
				return i_4_;
			SwitchInt class246_sub33 = (SwitchInt) aClass85_1992.get((long) i_5_);
			if (i < 47)
				method950((byte) 119);
			if (class246_sub33 == null)
				return i_4_;
			return ((SwitchInt) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nf.E(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final AbstractSprite method944(int i, SceneGraph class260) {
		try {
			anInt2019++;
			AbstractSprite class_l = (AbstractSprite) (((MapFunctions) ((MapFunction) this).aClass165_2009).aClass54_2337
					.method379((long) (anInt2004 | 0x20000 | ((SceneGraph) class260).anInt3719 << 29), (byte) 58));
			if (class_l != null)
				return class_l;
			(MapRegion.get_revision_by_region() == Revision.OSRS
					? ((MapFunctions) ((MapFunction) this).aClass165_2009).sprite_data_OSRS
					: ((MapFunctions) ((MapFunction) this).aClass165_2009).sprite_data).method112(-1, anInt2004);
			if (i < 64)
				return null;
			LDSprite class10 = LDSprite.get_sprite(
					((MapRegion.get_revision_by_region() == Revision.OSRS
							? ((MapFunctions) ((MapFunction) this).aClass165_2009).sprite_data_OSRS
							: ((MapFunctions) ((MapFunction) this).aClass165_2009).sprite_data)),
					anInt2004, 0);
			if (class10 != null) {
				class_l = class260.ld_to_abstract_sprite(class10, true);
				((MapFunctions) ((MapFunction) this).aClass165_2009).aClass54_2337.method371(1,
						(long) (((SceneGraph) class260).anInt3719 << 29 | (anInt2004 | 0x20000)), class_l);
			}
			return class_l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nf.K(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method945(byte i) {
		try {
			if (((MapFunction) this).anIntArray2027 != null) {
				for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (((MapFunction) this).anIntArray2027.length
						^ 0xffffffff)); i_6_ += 2) {
					if ((((MapFunction) this).anInt2038 ^ 0xffffffff) >= (((MapFunction) this).anIntArray2027[i_6_]
							^ 0xffffffff)) {
						if ((((MapFunction) this).anInt2032 ^ 0xffffffff) > (((MapFunction) this).anIntArray2027[i_6_]
								^ 0xffffffff))
							((MapFunction) this).anInt2032 = ((MapFunction) this).anIntArray2027[i_6_];
					} else
						((MapFunction) this).anInt2038 = ((MapFunction) this).anIntArray2027[i_6_];
					if (((MapFunction) this).anInt2008 <= ((MapFunction) this).anIntArray2027[i_6_ + 1]) {
						if (((MapFunction) this).anIntArray2027[1 + i_6_] > ((MapFunction) this).anInt2021)
							((MapFunction) this).anInt2021 = ((MapFunction) this).anIntArray2027[i_6_ + 1];
					} else
						((MapFunction) this).anInt2008 = ((MapFunction) this).anIntArray2027[i_6_ + 1];
				}
			}
			if (i != 45)
				method945((byte) -113);
			anInt2015++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.B(" + i + ')');
		}
	}

	static final void method946(byte[] is, float f, float f_7_, int i, int i_8_, int i_9_, float f_10_, float f_11_,
			int i_12_, int i_13_, int i_14_, float f_15_, Class64 class64) {
		try {
			anInt1989++;
			if (i_13_ > 0) {
				for (int i_16_ = 0; i_16_ < i_14_; i_16_++) {
					Class196.method1279(i_9_, i_8_, i_12_, f_7_, class64, f, f_11_, is, i_14_, i_16_, f_15_, i, f_10_,
							false);
					i += i_9_ * i_8_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nf.F(" + (is != null ? "{...}" : "null") + ',' + f + ',' + f_7_ + ',' + i + ',' + i_8_ + ','
							+ i_9_ + ',' + f_10_ + ',' + f_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + f_15_
							+ ',' + (class64 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void process_op(Buffer stream, byte i, int i_17_) {
		try {
			anInt1990++;
			int i_18_ = 69 / ((82 - i) / 32);
			if ((i_17_ ^ 0xffffffff) != -2) {
				if ((i_17_ ^ 0xffffffff) != -3) {
					if (i_17_ != 3) {
						if ((i_17_ ^ 0xffffffff) != -5) {
							if ((i_17_ ^ 0xffffffff) == -6)
								((MapFunction) this).anInt1999 = stream.read24BitInteger((byte) 29);
							else if ((i_17_ ^ 0xffffffff) != -7) {
								if (i_17_ != 7) {
									if (i_17_ != 8) {
										if (i_17_ == 9) {
											anInt2035 = stream.readUnsignedShort();
											if (anInt2035 == 65535)
												anInt2035 = -1;
											anInt2012 = stream.readUnsignedShort();
											if ((anInt2012 ^ 0xffffffff) == -65536)
												anInt2012 = -1;
											anInt2020 = stream.readInt((byte) 125);
											anInt1993 = stream.readInt((byte) 84);
										} else if ((i_17_ ^ 0xffffffff) > -11 || ((i_17_ ^ 0xffffffff) < -15)) {
											if (i_17_ != 15) {
												if ((i_17_ ^ 0xffffffff) != -17) {
													if ((i_17_ ^ 0xffffffff) != -18) {
														if (i_17_ != 18) {
															if ((i_17_ ^ 0xffffffff) != -20) {
																if (i_17_ == 20) {
																	anInt2001 = (stream.readUnsignedShort());
																	if (anInt2001 == 65535)
																		anInt2001 = -1;
																	anInt2002 = (stream.readUnsignedShort());
																	if (anInt2002 == 65535)
																		anInt2002 = -1;
																	anInt2025 = (stream.readInt((byte) 77));
																	anInt2011 = (stream.readInt((byte) 88));
																} else if (i_17_ == 21)
																	((MapFunction) this).anInt1997 = (stream
																			.readInt((byte) 85));
																else if (i_17_ == 22)
																	((MapFunction) this).anInt2013 = (stream
																			.readInt((byte) 88));
																else if ((i_17_ ^ 0xffffffff) == -250) {
																	int i_19_ = (stream.readUnsignedByte());
																	if (aClass85_1992 == null) {
																		int i_20_ = Class206.method1350(i_19_,
																				269173057);
																		aClass85_1992 = new IterableNodeHashTable(
																				i_20_);
																	}
																	for (int i_21_ = 0; (i_21_ < i_19_); i_21_++) {
																		boolean bool = stream
																				.readUnsignedByte() == 1;
																		int i_22_ = stream.read24BitInteger((byte) 29);
																		Node class246;
																		if (bool)
																			class246 = new Class246_Sub4(
																					stream.readString((byte) -40));
																		else
																			class246 = new SwitchInt(
																					stream.readInt((byte) 85));
																		aClass85_1992.method547((long) i_22_, -2301,
																				class246);
																	}
																}
															} else
																((MapFunction) this).anInt2014 = (stream
																		.readUnsignedShort());
														} else
															anInt2004 = (stream.readUnsignedShort());
													} else
														((MapFunction) this).aString2016 = (stream
																.readString((byte) -40));
												} else
													((MapFunction) this).aBool1991 = false;
											} else {
												int i_23_ = stream.readUnsignedByte();
												((MapFunction) this).anIntArray2027 = new int[i_23_ * 2];
												for (int i_24_ = 0; ((2 * i_23_ ^ 0xffffffff) < (i_24_
														^ 0xffffffff)); i_24_++)
													((MapFunction) this).anIntArray2027[i_24_] = (stream
															.method2375((byte) 1));
												((MapFunction) this).anInt2000 = (stream.readInt((byte) 75));
												((MapFunction) this).anInt2023 = (stream.readInt((byte) 116));
											}
										} else
											((MapFunction) this).aStringArray2029[i_17_ - 10] = stream
													.readString((byte) -40);
									} else
										((MapFunction) this).aBool2037 = stream.readUnsignedByte() == 1;
								} else {
									int i_25_ = stream.readUnsignedByte();
									if ((i_25_ & 0x1) == 0)
										((MapFunction) this).aBool1996 = false;
									if ((0x2 & i_25_ ^ 0xffffffff) == -3)
										((MapFunction) this).aBool2028 = true;
								}
							} else
								((MapFunction) this).anInt1994 = stream.readUnsignedByte();
						} else
							((MapFunction) this).anInt2022 = stream.read24BitInteger((byte) 29);
					} else
						((MapFunction) this).aString1998 = stream.readString((byte) -40);
				} else
					((MapFunction) this).anInt2005 = stream.readUnsignedShort();
			} else
				((MapFunction) this).anInt2026 = stream.readUnsignedShort();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nf.L(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_17_ + ')'));
		}
	}

	final void decode(Buffer stream, int i) {
		try {
			anInt2003++;
			for (;;) {
				int opcode = stream.readUnsignedByte();
				if (opcode == 0)
					break;
				process_op(stream, (byte) 120, opcode);
			}
			int i_27_ = -1 % ((66 - i) / 43);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.C(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final AbstractSprite method949(SceneGraph class260, boolean bool, byte i) {
		try {
			anInt1995++;
			int i_28_ = (!bool ? ((MapFunction) this).anInt2026 : ((MapFunction) this).anInt2005);
			int i_29_ = i_28_ | ((SceneGraph) class260).anInt3719 << 29;
			if (i < 44)
				return null;
			AbstractSprite class_l = ((AbstractSprite) ((MapFunctions) ((MapFunction) this).aClass165_2009).aClass54_2337
					.method379((long) i_29_, (byte) 58));
			if (class_l != null)
				return class_l;
			if (!(MapRegion.get_revision_by_region() == Revision.OSRS
					? ((MapFunctions) ((MapFunction) this).aClass165_2009).sprite_data_OSRS
					: ((MapFunctions) ((MapFunction) this).aClass165_2009).sprite_data).method112(-1, i_28_))
				return null;
			LDSprite class10 = LDSprite.get_sprite(
					((MapRegion.get_revision_by_region() == Revision.OSRS
							? ((MapFunctions) ((MapFunction) this).aClass165_2009).sprite_data_OSRS
							: ((MapFunctions) ((MapFunction) this).aClass165_2009).sprite_data)),
					i_28_, 0);
			if (class10 != null) {
				class_l = class260.ld_to_abstract_sprite(class10, true);
				((MapFunctions) ((MapFunction) this).aClass165_2009).aClass54_2337.method371(1, (long) i_29_, class_l);
			}
			return class_l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nf.N(" + (class260 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	public static void method950(byte i) {
		try {
			aClass13_2040 = null;
			SWITCH_INTERFACE_COMPONENTS_OUT = null;
			aClass_c2007 = null;
			aClass67_2010 = null;
			aClass242_2036 = null;
			if (i < 54)
				aClass13_2040 = null;
			aClass54_2034 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.D(" + i + ')');
		}
	}

	static final void method951(SceneGraph class260, Class59 class59, int i, int i_30_, int i_31_) {
		if (i_30_ < Class240.xSize) {
			Tile class147 = Class106.tiles[i][i_30_ + 1][i_31_];
			if (class147 != null && ((Tile) class147).floorDecorationIThink != null
					&& ((Tile) class147).floorDecorationIThink.method406((byte) 118))
				class59.method405(0, NodeSub.anInt3744, ((Tile) class147).floorDecorationIThink, (byte) -99, true,
						class260, 0);
		}
		if (i_31_ < Class240.xSize) {
			Tile class147 = Class106.tiles[i][i_30_][i_31_ + 1];
			if (class147 != null && ((Tile) class147).floorDecorationIThink != null
					&& ((Tile) class147).floorDecorationIThink.method406((byte) 114))
				class59.method405(NodeSub.anInt3744, 0, ((Tile) class147).floorDecorationIThink, (byte) -99, true,
						class260, 0);
		}
		if (i_30_ < Class240.xSize && i_31_ < HDModel.ySize) {
			Tile class147 = (Class106.tiles[i][i_30_ + 1][i_31_ + 1]);
			if (class147 != null && ((Tile) class147).floorDecorationIThink != null
					&& ((Tile) class147).floorDecorationIThink.method406((byte) 117))
				class59.method405(NodeSub.anInt3744, NodeSub.anInt3744, ((Tile) class147).floorDecorationIThink,
						(byte) -99, true, class260, 0);
		}
		if (i_30_ < Class240.xSize && i_31_ > 0) {
			Tile class147 = (Class106.tiles[i][i_30_ + 1][i_31_ - 1]);
			if (class147 != null && ((Tile) class147).floorDecorationIThink != null
					&& ((Tile) class147).floorDecorationIThink.method406((byte) 105))
				class59.method405(-NodeSub.anInt3744, NodeSub.anInt3744, ((Tile) class147).floorDecorationIThink,
						(byte) -99, true, class260, 0);
		}
	}

	static final void method952(byte i) {
		try {
			if (i < 3)
				method952((byte) 33);
			anInt2039++;
			Class168.aBool2394 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.M(" + i + ')');
		}
	}

	public MapFunction() {
		anInt2002 = -1;
		((MapFunction) this).anInt1999 = -1;
		((MapFunction) this).anInt2008 = 2147483647;
		anInt2012 = -1;
		((MapFunction) this).anInt2014 = -1;
		anInt2001 = -1;
		((MapFunction) this).aBool1996 = true;
		((MapFunction) this).anInt2021 = -2147483648;
		anInt2004 = -1;
		((MapFunction) this).aBool2028 = false;
		anInt2035 = -1;
		((MapFunction) this).anInt2026 = -1;
		((MapFunction) this).anInt2032 = -2147483648;
		((MapFunction) this).aStringArray2029 = new String[5];
		((MapFunction) this).aBool2037 = true;
		((MapFunction) this).anInt2038 = 2147483647;
	}
}
