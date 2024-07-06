package io;

/* Class39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

import java.io.IOException;

import io.cache.Revision;

final class Class39_Sub1 extends Renderer {
	static int anInt4667;
	static float aFloat4668;
	static int anInt4669;
	boolean aBool4671 = false;
	static int anInt4673;
	static int anInt4674;
	static int anInt4675;
	static int f_ab;
	static int f_bb;
	boolean f_cb = false;
	static int f_db;
	static int f_eb = 0;
	static int[] f_gb;

	final void save_preferences(Signlink class52) {
		do {
			Class192 class192 = null;
			try {
				Class182 class182 = class52.method365((byte) -127, "");
				while (class182.anInt2539 == 0)
					Class247.method1580(1L, -5184);
				if (class182.anInt2539 == 1) {
					class192 = (Class192) class182.anObject2535;
					Buffer stream = get_preference_buffer();
					class192.method1265(0, ((Buffer) stream).position, ((Buffer) stream).buffer, 1);
				}
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (class192 == null)
					break;
				class192.method1262(-1);
			} catch (Exception exception) {
				/* empty */
			}
			break;
		} while (false);
	}

	final boolean method2048(int i, int i_1_) {
		try {
			if (i >= -52)
				return false;
			f_bb++;
			if ((i_1_ ^ 0xffffffff) != -1)
				return true;
			return ((Renderer) this).aBool568;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.L(" + i + ',' + i_1_ + ')');
		}
	}

	final int method2049(int i, int i_2_) {
		try {
			int i_3_ = -28 / ((i_2_ - 74) / 46);
			anInt4674++;
			if (((Class39_Sub1) this).f_cb)
				return 0;
			if (!method2052(i, 116))
				return 1;
			if (Settings.show_roofs)
				return 2;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.H(" + i + ',' + i_2_ + ')');
		}
	}

	final void method2050(int i, boolean bool) {
		do {
			try {
				((Renderer) this).aBool568 = bool;
				anInt4673++;
				if (Class143.aClass251_2067 != null)
					Class143.aClass251_2067.method1612((byte) 114, !method2052(Buffer.anInt5656, i ^ ~0x71));
				if (i == -2)
					break;
				MathUtils.SINE = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jb.M(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method2051(int i, byte i_4_) {
		try {
			if (Class5.aByteArrayArrayArray56 == null)
				Class5.aByteArrayArrayArray56 = (new byte[4][Class38_Sub1_Sub1.anInt6770][Class152.anInt2205]);
			f_ab++;
			if (i <= -87) {
				for (int i_5_ = 0; i_5_ < 4; i_5_++) {
					for (int i_6_ = 0; ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++) {
						for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (Class152.anInt2205 ^ 0xffffffff)); i_7_++)
							Class5.aByteArrayArrayArray56[i_5_][i_6_][i_7_] = i_4_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.O(" + i + ',' + i_4_ + ')');
		}
	}

	final boolean method2052(int i, int i_8_) {
		try {
			if (i_8_ <= 104)
				return false;
			anInt4675++;
			if ((i ^ 0xffffffff) != -1 || ((Class39_Sub1) this).aBool4671)
				return true;
			return ((Renderer) this).aBool568;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.G(" + i + ',' + i_8_ + ')');
		}
	}

	private final void load_preference_buffer(Buffer stream, int i) {
		do {
			try {
				f_db++;
				if (((((Buffer) stream).buffer.length + -((Buffer) stream).position) ^ 0xffffffff) <= -2) {
					int i_9_ = stream.readUnsignedByte();
					if ((i_9_ ^ 0xffffffff) <= -1 && (i_9_ ^ 0xffffffff) >= -18) {
						int i_10_;
						if (i_9_ != 17) {
							if ((i_9_ ^ 0xffffffff) == -17)
								i_10_ = 38;
							else if ((i_9_ ^ 0xffffffff) != -16) {
								if (i_9_ == 14)
									i_10_ = 36;
								else if ((i_9_ ^ 0xffffffff) == -14)
									i_10_ = 35;
								else if ((i_9_ ^ 0xffffffff) == -13)
									i_10_ = 34;
								else if ((i_9_ ^ 0xffffffff) != -12) {
									if (i_9_ == 10)
										i_10_ = 32;
									else if ((i_9_ ^ 0xffffffff) == -10)
										i_10_ = 31;
									else if ((i_9_ ^ 0xffffffff) != -9) {
										if (i_9_ == 7)
											i_10_ = 29;
										else if ((i_9_ ^ 0xffffffff) != -7) {
											if (i_9_ != 5) {
												if (i_9_ != 4) {
													if (i_9_ != 3) {
														if (i_9_ != 2) {
															if ((i_9_ ^ 0xffffffff) == -2)
																i_10_ = 23;
															else
																i_10_ = 19;
														} else
															i_10_ = 22;
													} else
														i_10_ = 23;
												} else
													i_10_ = 24;
											} else
												i_10_ = 28;
										} else
											i_10_ = 28;
									} else
										i_10_ = 30;
								} else
									i_10_ = 33;
							} else
								i_10_ = 37;
						} else
							i_10_ = 40;
						if (((-((Buffer) stream).position + ((Buffer) stream).buffer.length) ^ 0xffffffff) <= (i_10_
								^ 0xffffffff)) {
							int gameframe_revision_identifier = stream.readInt();
							Settings.gameframe = gameframe_revision_identifier == 193 ? Revision.OSRS
									: gameframe_revision_identifier == 550 ? Revision.PRE_EOC_550
											: Revision.PRE_EOC_634;
							LoginScreen.disable_music = stream.readUnsignedByte() == 1;
							LoginScreen.remember_username = stream.readUnsignedByte() == 1;
							LoginScreen.hide_username = stream.readUnsignedByte() == 1;
							((Renderer) this).brightness = stream.readUnsignedByte();
							if (((Renderer) this).brightness < 1)
								((Renderer) this).brightness = 1;
							else if ((((Renderer) this).brightness ^ 0xffffffff) < -5)
								((Renderer) this).brightness = 4;
							method2050(-2, stream.readUnsignedByte() == 1);
							Settings.show_roofs = (stream.readUnsignedByte() ^ 0xffffffff) == -2;
							Settings.ground_decorations = stream.readUnsignedByte() == 1;
							((Renderer) this).aBool586 = stream.readUnsignedByte() == 1;
							((Renderer) this).anInt580 = stream.readUnsignedByte() != 1 ? 0 : 1;
							((Renderer) this).aBool576 = stream.readUnsignedByte() == 1;
							((Renderer) this).aBool573 = (stream.readUnsignedByte() ^ 0xffffffff) == -2;
							((Renderer) this).aBool601 = stream.readUnsignedByte() == 1;
							((Renderer) this).anInt582 = stream.readUnsignedByte();
							if ((((Renderer) this).anInt582 ^ 0xffffffff) < -3)
								((Renderer) this).anInt582 = 2;
							if ((i_9_ ^ 0xffffffff) <= -18)
								((Renderer) this).anInt575 = stream.readUnsignedByte();
							if (i_9_ < 2) {
								((Renderer) this).aBool593 = ((stream.readUnsignedByte() ^ 0xffffffff) == -2);
								stream.readUnsignedByte();
							} else {
								((Renderer) this).aBool593 = ((stream.readUnsignedByte() ^ 0xffffffff) == -2);
								if (i_9_ >= 17)
									((Renderer) this).aBool597 = stream.readUnsignedByte() == 1;
							}
							((Renderer) this).aBool574 = stream.readUnsignedByte() == 1;
							Settings.force_tweening = stream.readUnsignedByte() == 1;
							Settings.draw_fog = stream.readUnsignedByte() == 1;
							Settings.fog_color = stream.readInt();
							Settings.osrs_hit_bars = stream.readUnsignedByte() == 1;
							Settings.osrs_hit_marks = stream.readUnsignedByte() == 1;
							Settings.osrs_context_menus = stream.readUnsignedByte() == 1;
							Settings.middle_mouse_camera_control = stream.readUnsignedByte() == 1;
							Settings.hd_minimap = stream.readUnsignedByte() == 1;
							int data_revision = stream.readInt();
							if (data_revision < 200) {
								Settings.data = Revision.OSRS;
							} else if (data_revision == 550) {
								Settings.data = Revision.PRE_EOC_550;
							} else {
								Settings.data = Revision.PRE_EOC_634;
							}
							int gamefont_revision = stream.readInt();
							if (gamefont_revision < 200) {
								Settings.gamefonts = Revision.OSRS;
							} else if (gamefont_revision == 550) {
								Settings.gamefonts = Revision.PRE_EOC_550;
							} else {
								Settings.gamefonts = Revision.PRE_EOC_634;
							}
							((Renderer) this).anInt590 = stream.readUnsignedByte();
							if ((((Renderer) this).anInt590 ^ 0xffffffff) < -3)
								((Renderer) this).anInt590 = 2;
							((Renderer) this).anInt588 = ((Renderer) this).anInt590;
							((Renderer) this).aBool570 = stream.readUnsignedByte() == 1;
							((Renderer) this).anInt602 = stream.readUnsignedByte();
							if (((Renderer) this).anInt602 > 127)
								((Renderer) this).anInt602 = 127;
							((Renderer) this).anInt587 = stream.readUnsignedByte();
							((Renderer) this).anInt603 = stream.readUnsignedByte();
							if (((Renderer) this).anInt603 > 127)
								((Renderer) this).anInt603 = 127;
							if ((i_9_ ^ 0xffffffff) <= -2) {
								((Renderer) this).anInt577 = stream.readUnsignedShort();
								((Renderer) this).anInt604 = stream.readUnsignedShort();
							}
							if (i_9_ >= 3 && i_9_ < 6)
								stream.readUnsignedByte();
							if (i_9_ >= 4) {
								int i_11_ = stream.readUnsignedByte();
								if ((i_11_ ^ 0xffffffff) > -1 || i_11_ > 2)
									i_11_ = 0;
								if (Class40_Sub2.anInt4047 < 96)
									i_11_ = 0;
								Class83.method531(i_11_, 9060);
							}
							if (i_9_ >= 5)
								((Renderer) this).anInt569 = stream.readInt((byte) 126);
							int i_12_ = -12 / ((i + 27) / 49);
							int i_13_ = 0;
							if ((i_9_ ^ 0xffffffff) <= -7)
								((Renderer) this).frame_mode = i_13_ = stream.readUnsignedByte();
							if (((Renderer) this).frame_mode != 1 && ((Renderer) this).frame_mode != 2)
								((Renderer) this).frame_mode = 2;
							if ((i_9_ ^ 0xffffffff) <= -8)
								((Renderer) this).safe_mode = stream.readUnsignedByte() == 1;
							if ((i_9_ ^ 0xffffffff) <= -9)
								((Renderer) this).aBool605 = stream.readUnsignedByte() == 1;
							if (i_9_ >= 9)
								((Renderer) this).anInt581 = stream.readUnsignedByte();
							if ((((Renderer) this).anInt581 ^ 0xffffffff) > -1 || ((((Renderer) this).anInt581
									^ 0xffffffff) < (Client.method2969((Class40_Sub2.anInt4047), (byte) 101)
											^ 0xffffffff)))
								((Renderer) this).anInt581 = 0;
							if (i_9_ >= 10)
								((Renderer) this).aBool596 = ((stream.readUnsignedByte() ^ 0xffffffff) != -1);
							if ((i_9_ ^ 0xffffffff) <= -12)
								((Renderer) this).aBool606 = ((stream.readUnsignedByte() ^ 0xffffffff) != -1);
							if (i_9_ >= 12)
								((Renderer) this).anInt580 = stream.readUnsignedByte();
							if ((((Renderer) this).anInt580 ^ 0xffffffff) > -1 || ((Renderer) this).anInt580 > 2)
								((Renderer) this).anInt580 = 1;
							if (i_9_ >= 13) {
								Settings.ground_blending = stream.readUnsignedByte() == 1;
							}
							if (i_9_ >= 14)
								((Renderer) this).anInt598 = stream.readUnsignedByte();
							else if (i_13_ == 0)
								((Renderer) this).anInt598 = 2;
							else
								((Renderer) this).anInt598 = 1;
							if ((((Renderer) this).anInt598 ^ 0xffffffff) > -1 || ((Renderer) this).anInt598 > 3)
								((Renderer) this).anInt598 = 2;
							if (i_9_ >= 15) {
								((Renderer) this).anInt584 = stream.readUnsignedByte();
								if (((Renderer) this).anInt584 < 0 || ((Renderer) this).anInt584 > 4)
									((Renderer) this).anInt584 = (RuntimeException_Sub2.anInt7153 == 1 ? 2 : 4);
							}
							if (i_9_ >= 16) {
								((Renderer) this).texture = stream.readUnsignedByte() == 1;
								try {
									if ((jagmisc.getTotalPhysicalMemory() ^ 0xffffffffffffffffL) >= -268435457L)
										((Renderer) this).texture = false;
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							LoginScreen.remembered_username = stream.readString();
							if (i_9_ >= 17 || ((Renderer) this).anInt598 != 0)
								break;
							((Renderer) this).anInt598 = 2;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("jb.I(" + (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final Buffer get_preference_buffer() {
		Buffer stream = new Buffer(100);
		stream.writeByte(255, 17);
		stream.writeInt(
				Settings.gameframe == Revision.OSRS ? 193 : Settings.gameframe == Revision.PRE_EOC_550 ? 550 : 634,
				(byte) 121);
		stream.writeByte(255, LoginScreen.disable_music ? 1 : 0);
		stream.writeByte(255, LoginScreen.remember_username ? 1 : 0);
		stream.writeByte(255, LoginScreen.hide_username ? 1 : 0);
		stream.writeByte(255, ((Renderer) this).brightness);
		stream.writeByte(255, ((Renderer) this).aBool568 ? 1 : 0);
		stream.writeByte(255, Settings.show_roofs ? 1 : 0);
		stream.writeByte(255, Settings.ground_decorations ? 1 : 0);
		stream.writeByte(255, ((Renderer) this).aBool586 ? 1 : 0);
		stream.writeByte(255, 0);
		stream.writeByte(255, ((Renderer) this).aBool576 ? 1 : 0);
		stream.writeByte(255, !((Renderer) this).aBool573 ? 0 : 1);
		stream.writeByte(255, !((Renderer) this).aBool601 ? 0 : 1);
		stream.writeByte(255, ((Renderer) this).anInt582);
		stream.writeByte(255, ((Renderer) this).anInt575);
		stream.writeByte(255, !((Renderer) this).aBool593 ? 0 : 1);
		stream.writeByte(255, !((Renderer) this).aBool597 ? 0 : 1);
		stream.writeByte(255, ((Renderer) this).aBool574 ? 1 : 0);
		stream.writeByte(255, Settings.force_tweening ? 1 : 0);
		stream.writeByte(255, Settings.draw_fog ? 1 : 0);
		stream.writeInt(Settings.fog_color, (byte) 121);
		stream.writeByte(255, Settings.osrs_hit_bars ? 1 : 0);
		stream.writeByte(255, Settings.osrs_hit_marks ? 1 : 0);
		stream.writeByte(255, Settings.osrs_context_menus ? 1 : 0);
		stream.writeByte(255, Settings.middle_mouse_camera_control ? 1 : 0);
		stream.writeByte(255, Settings.hd_minimap ? 1 : 0);
		stream.writeInt(Settings.data == Revision.OSRS ? 193 : Settings.data == Revision.PRE_EOC_550 ? 550 : 634,
				(byte) 121);
		stream.writeInt(
				Settings.gamefonts == Revision.OSRS ? 193 : Settings.gamefonts == Revision.PRE_EOC_550 ? 550 : 634,
				(byte) 121);
		stream.writeByte(255, ((Renderer) this).anInt590);
		stream.writeByte(255, !((Renderer) this).aBool570 ? 0 : 1);
		stream.writeByte(255, ((Renderer) this).anInt602);
		stream.writeByte(255, ((Renderer) this).anInt587);
		stream.writeByte(255, ((Renderer) this).anInt603);
		stream.writeShort((byte) 67, ((Renderer) this).anInt577);
		stream.writeShort((byte) 67, ((Renderer) this).anInt604);
		stream.writeByte(255, Texture.method2699(8458));
		stream.writeInt(((Renderer) this).anInt569, (byte) 121);
		stream.writeByte(255, ((Renderer) this).frame_mode);
		stream.writeByte(255, ((Renderer) this).safe_mode ? 1 : 0);
		stream.writeByte(255, ((Renderer) this).aBool605 ? 1 : 0);
		stream.writeByte(255, ((Renderer) this).anInt581);
		stream.writeByte(255, ((Renderer) this).aBool596 ? 1 : 0);
		stream.writeByte(255, !((Renderer) this).aBool606 ? 0 : 1);
		stream.writeByte(255, ((Renderer) this).anInt580);
		stream.writeByte(255, Settings.ground_blending ? 1 : 0);
		stream.writeByte(255, ((Renderer) this).anInt598);
		stream.writeByte(255, ((Renderer) this).anInt584);
		stream.writeByte(255, !((Renderer) this).texture ? 0 : 1);
		stream.writeString(101, LoginScreen.remembered_username);
		return stream;
	}

	Class39_Sub1(Signlink class52) {
		do {
			try {
				((Renderer) this).brightness = 3;
				method2050(-2, true);
				((Renderer) this).aBool576 = true;
				((Renderer) this).aBool573 = true;
				((Renderer) this).anInt587 = 255;
				Settings.ground_decorations = true;
				((Renderer) this).anInt582 = 2;
				((Renderer) this).anInt604 = 0;
				Settings.show_roofs = true;
				((Renderer) this).anInt603 = 127;
				((Renderer) this).anInt577 = 0;
				((Renderer) this).anInt602 = 127;
				((Renderer) this).aBool586 = true;
				((Renderer) this).aBool574 = true;
				((Renderer) this).anInt588 = 0;
				((Renderer) this).anInt590 = 0;
				((Renderer) this).anInt575 = 0;
				((Renderer) this).aBool593 = true;
				((Renderer) this).aBool570 = true;
				((Renderer) this).aBool597 = false;
				((Renderer) this).aBool601 = true;
				((Renderer) this).anInt580 = 1;
				if (Class40_Sub2.anInt4047 >= 96)
					Class83.method531(2, 9060);
				else
					Class83.method531(0, 9060);
				((Renderer) this).anInt581 = 0;
				((Renderer) this).aBool605 = false;
				((Renderer) this).aBool606 = true;
				((Renderer) this).frame_mode = 2;
				((Renderer) this).safe_mode = false;
				((Renderer) this).anInt598 = 2;
				((Renderer) this).anInt584 = ((RuntimeException_Sub2.anInt7153 ^ 0xffffffff) != -2 ? 4 : 2);
				((Renderer) this).anInt569 = 0;
				((Renderer) this).aBool596 = false;
				Class192 class192 = null;
				try {
					Class182 class182 = class52.method365((byte) -69, "");
					while (class182.anInt2539 == 0)
						Class247.method1580(1L, -5184);
					if (class182.anInt2539 == 1) {
						class192 = (Class192) class182.anObject2535;
						byte[] is = new byte[(int) class192.method1266(74)];
						int i;
						for (int i_14_ = 0; is.length > i_14_; i_14_ += i) {
							i = class192.method1261(i_14_, -i_14_ + is.length, is, (byte) -119);
							if (i == -1)
								throw new IOException("EOF");
						}
						load_preference_buffer(new Buffer(is), 93);
					}
				} catch (Exception exception) {
					/* empty */
				}
				try {
					if (class192 == null)
						break;
					class192.method1262(-1);
				} catch (Exception exception) {
					/* empty */
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jb.<init>(" + (class52 != null ? "{...}" : "null") + ')');
			}
		} while (false);
	}

	public static void method2055(int i) {
		try {
			f_gb = null;
			MathUtils.SINE = null;
			if (i != 1)
				method2055(-116);
			MathUtils.COSINE = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.J(" + i + ')');
		}
	}

	static {
		MathUtils.COSINE = new int[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; (i ^ 0xffffffff) > -16385; i++) {
			MathUtils.SINE[i] = (int) (Math.sin(d * (double) i) * 32768.0);
			MathUtils.COSINE[i] = (int) (32768.0 * Math.cos((double) i * d));
		}
		f_gb = new int[] { 104, 120, 136, 168 };
	}
}
