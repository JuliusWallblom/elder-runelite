package io;

public final class IterableNodeHashTable {
	int anInt1115;
	static int anInt1116;
	static int anInt1117;
	Node[] aClass246Array1118;
	static int[][] anIntArrayArray1119 = new int[128][128];
	static int anInt1120;
	static int anInt1121;
	static int anInt1122;
	static int anInt1124;
	static int anInt1125;
	static int anInt1126;
	private Node currentGet;
	private long aLong1128;
	static int anInt1129;
	static int anInt1130;
	static int anInt1131;
	private int anInt1132 = 0;
	private Node aClass246_1133;
	static int anInt1134;
	static float aFloat1135 = 1.0F;

	static final int method540(int i, boolean bool) {
		try {
			anInt1125++;
			if (bool != false)
				TitleScreen.loading_core_fonts_ms = null;
			int i_0_ = i >>> 1;
			i_0_ |= i_0_ >>> 1;
			i_0_ |= i_0_ >>> 2;
			i_0_ |= i_0_ >>> 4;
			i_0_ |= i_0_ >>> 8;
			i_0_ |= i_0_ >>> 16;
			return (i_0_ ^ 0xffffffff) & i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ib.C(" + i + ',' + bool + ')');
		}
	}

	final Node method541(int i) {
		try {
			anInt1116++;
			if (currentGet == null)
				return null;
			for (Node var3 = (((IterableNodeHashTable) this).aClass246Array1118[(int) ((long) (i + ((IterableNodeHashTable) this).anInt1115)
					& aLong1128)]); var3 != currentGet; currentGet = ((Node) currentGet).next) {
				if (aLong1128 == ((Node) currentGet).hash) {
					Node class246_1_ = currentGet;
					currentGet = ((Node) currentGet).next;
					return class246_1_;
				}
			}
			currentGet = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ib.F(" + i + ')');
		}
	}

	final int method542(int i) {
		try {
			anInt1121++;
			int i_2_ = 0;
			for (int i_3_ = 0; ((IterableNodeHashTable) this).anInt1115 > i_3_; i_3_++) {
				Node class246 = ((IterableNodeHashTable) this).aClass246Array1118[i_3_];
				Node class246_4_ = ((Node) class246).next;
				while (class246 != class246_4_) {
					class246_4_ = ((Node) class246_4_).next;
					i_2_++;
				}
			}
			if (i != -5)
				anInt1132 = 112;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ib.E(" + i + ')');
		}
	}

	final void method543(int i) {
		try {
			for (int i_5_ = i; ((i_5_ ^ 0xffffffff) > (((IterableNodeHashTable) this).anInt1115 ^ 0xffffffff)); i_5_++) {
				Node class246 = ((IterableNodeHashTable) this).aClass246Array1118[i_5_];
				for (;;) {
					Node class246_6_ = ((Node) class246).next;
					if (class246_6_ == class246)
						break;
					class246_6_.remove();
				}
			}
			anInt1129++;
			currentGet = null;
			aClass246_1133 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ib.I(" + i + ')');
		}
	}

	public final Node get(long l) {
		try {
			anInt1117++;
			aLong1128 = l;
			Node class246 = (((IterableNodeHashTable) this).aClass246Array1118[(int) (l & (long) (((IterableNodeHashTable) this).anInt1115 - 1))]);
			for (currentGet = ((Node) class246).next; class246 != currentGet; currentGet = ((Node) currentGet).next) {
				if (l == ((Node) currentGet).hash) {
					Node class246_7_ = currentGet;
					currentGet = ((Node) currentGet).next;
					return class246_7_;
				}
			}
			currentGet = null;
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	static final void method545(byte i) {
		do {
			try {
				if (WidgetParent.aClass123_5522 != null)
					WidgetParent.aClass123_5522.method835(0);
				if (i != -109)
					method545((byte) 17);
				anInt1131++;
				if (Class246_Sub28_Sub26.aClass123_6716 == null)
					break;
				Class246_Sub28_Sub26.aClass123_6716.method835(0);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ib.G(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method546(Stream_Sub1 stream_sub1, int i, byte i_8_) {
		do {
			try {
				anInt1122++;
				boolean bool = (stream_sub1.readBits(-51, 1) ^ 0xffffffff) == -2;
				if (bool)
					Class218.anIntArray3025[Class252.anInt3567++] = i;
				int i_9_ = stream_sub1.readBits(-91, 2);
				Player class_r_sub1 = Class143.players[i];
				if (i_9_ == 0) {
					if (bool)
						((Player) class_r_sub1).aBool7142 = false;
					else {
						if ((Class109.anInt1567 ^ 0xffffffff) == (i ^ 0xffffffff))
							throw new RuntimeException("s:lr");
						Class240 class240 = Class166.aClass240Array2365[i] = new Class240();
						((Class240) class240).anInt3383 = (((((Entity) class_r_sub1).f_nc[0] + Client.base_y) >> 6)
								+ (((Class59_Sub3) class_r_sub1).current_plane << 28)
								+ ((Client.base_x + ((Entity) class_r_sub1).f_mc[0]) >> 6 << 14));
						if ((((Player) class_r_sub1).anInt7133 ^ 0xffffffff) != 0)
							((Class240) class240).anInt3380 = ((Player) class_r_sub1).anInt7133;
						else
							((Class240) class240).anInt3380 = ((Entity) class_r_sub1).f_fb.method203(-108);
						((Class240) class240).anInt3379 = ((Entity) class_r_sub1).faceEntity;
						((Class240) class240).aBool3378 = ((Player) class_r_sub1).aBool7129;
						if ((((Player) class_r_sub1).f_dd ^ 0xffffffff) < -1)
							Class191.method1253(class_r_sub1, (byte) 70);
						Class143.players[i] = null;
						if (stream_sub1.readBits(i_8_ - 4, 1) != 0)
							Class232.method1489(stream_sub1, i_8_ + 159, i);
					}
				} else if ((i_9_ ^ 0xffffffff) == -2) {
					int i_10_ = stream_sub1.readBits(i_8_ - 17, 3);
					int i_11_ = ((Entity) class_r_sub1).f_mc[0];
					int i_12_ = ((Entity) class_r_sub1).f_nc[0];
					if ((i_10_ ^ 0xffffffff) != -1) {
						if ((i_10_ ^ 0xffffffff) != -2) {
							if (i_10_ != 2) {
								if (i_10_ != 3) {
									if ((i_10_ ^ 0xffffffff) != -5) {
										if (i_10_ != 5) {
											if (i_10_ == 6)
												i_12_++;
											else if ((i_10_ ^ 0xffffffff) == -8) {
												i_11_++;
												i_12_++;
											}
										} else {
											i_11_--;
											i_12_++;
										}
									} else
										i_11_++;
								} else
									i_11_--;
							} else {
								i_12_--;
								i_11_++;
							}
						} else
							i_12_--;
					} else {
						i_11_--;
						i_12_--;
					}
					if (bool) {
						((Player) class_r_sub1).aBool7142 = true;
						((Player) class_r_sub1).f_ed = i_11_;
						((Player) class_r_sub1).anInt7122 = i_12_;
					} else
						class_r_sub1.method2910(Class234.movementTypes[i], i_12_, i_11_, 1);
				} else if (i_9_ == 2) {
					int i_13_ = stream_sub1.readBits(-64, 4);
					int i_14_ = ((Entity) class_r_sub1).f_mc[0];
					int i_15_ = ((Entity) class_r_sub1).f_nc[0];
					if (i_13_ != 0) {
						if (i_13_ == 1) {
							i_15_ -= 2;
							i_14_--;
						} else if (i_13_ != 2) {
							if (i_13_ == 3) {
								i_14_++;
								i_15_ -= 2;
							} else if ((i_13_ ^ 0xffffffff) != -5) {
								if ((i_13_ ^ 0xffffffff) != -6) {
									if (i_13_ == 6) {
										i_14_ += 2;
										i_15_--;
									} else if ((i_13_ ^ 0xffffffff) != -8) {
										if (i_13_ == 8)
											i_14_ += 2;
										else if ((i_13_ ^ 0xffffffff) == -10) {
											i_15_++;
											i_14_ -= 2;
										} else if ((i_13_ ^ 0xffffffff) == -11) {
											i_14_ += 2;
											i_15_++;
										} else if (i_13_ != 11) {
											if ((i_13_ ^ 0xffffffff) == -13) {
												i_14_--;
												i_15_ += 2;
											} else if (i_13_ == 13)
												i_15_ += 2;
											else if (i_13_ == 14) {
												i_15_ += 2;
												i_14_++;
											} else if (i_13_ == 15) {
												i_15_ += 2;
												i_14_ += 2;
											}
										} else {
											i_14_ -= 2;
											i_15_ += 2;
										}
									} else
										i_14_ -= 2;
								} else {
									i_15_--;
									i_14_ -= 2;
								}
							} else {
								i_14_ += 2;
								i_15_ -= 2;
							}
						} else
							i_15_ -= 2;
					} else {
						i_15_ -= 2;
						i_14_ -= 2;
					}
					if (!bool)
						class_r_sub1.method2910(Class234.movementTypes[i], i_15_, i_14_, 1);
					else {
						((Player) class_r_sub1).f_ed = i_14_;
						((Player) class_r_sub1).aBool7142 = true;
						((Player) class_r_sub1).anInt7122 = i_15_;
					}
				} else {
					int i_16_ = stream_sub1.readBits(-124, 1);
					if ((i_16_ ^ 0xffffffff) == -1) {
						int i_17_ = stream_sub1.readBits(i_8_ - 40, 12);
						int i_18_ = i_17_ >> 10;
						int i_19_ = (i_17_ & 0x3ef) >> 5;
						if (i_19_ > 15)
							i_19_ -= 32;
						int i_20_ = 0x1f & i_17_;
						if ((i_20_ ^ 0xffffffff) < -16)
							i_20_ -= 32;
						int i_21_ = ((Entity) class_r_sub1).f_mc[0] - -i_19_;
						int i_22_ = ((Entity) class_r_sub1).f_nc[0] - -i_20_;
						if (!bool)
							class_r_sub1.method2910(Class234.movementTypes[i], i_22_, i_21_, i_8_ + 65);
						else {
							((Player) class_r_sub1).anInt7122 = i_22_;
							((Player) class_r_sub1).aBool7142 = true;
							((Player) class_r_sub1).f_ed = i_21_;
						}
						((Class59_Sub3) class_r_sub1).current_plane = (byte) (0x3
								& (((Class59_Sub3) class_r_sub1).current_plane) + i_18_);
						if (Class109.anInt1567 == i)
							Class246_Sub28_Sub24.anInt6681 = ((Class59_Sub3) class_r_sub1).current_plane;
					} else {
						int i_23_ = stream_sub1.readBits(-58, 30);
						if (i_8_ != -64)
							aFloat1135 = 1.8926141F;
						int i_24_ = i_23_ >> 28;
						int i_25_ = (i_23_ & 0xfffe2b4) >> 14;
						int i_26_ = 0x3fff & i_23_;
						int i_27_ = (-Client.base_x
								+ (0x3fff & (i_25_ + Client.base_x + ((Entity) class_r_sub1).f_mc[0])));
						int i_28_ = (-Client.base_y
								+ (0x3fff & (Client.base_y + ((Entity) class_r_sub1).f_nc[0] + i_26_)));
						if (!bool)
							class_r_sub1.method2910(Class234.movementTypes[i], i_28_, i_27_, 1);
						else {
							((Player) class_r_sub1).f_ed = i_27_;
							((Player) class_r_sub1).aBool7142 = true;
							((Player) class_r_sub1).anInt7122 = i_28_;
						}
						((Class59_Sub3) class_r_sub1).current_plane = (byte) (0x3
								& (((Class59_Sub3) class_r_sub1).current_plane) + i_24_);
						if (i != Class109.anInt1567)
							break;
						Class246_Sub28_Sub24.anInt6681 = ((Class59_Sub3) class_r_sub1).current_plane;
					}
				}
			} catch (Exception runtimeexception) {
				;
			}
			break;
		} while (false);
	}

	final void method547(long l, int i, Node class246) {
		try {
			if (i != -2301)
				method551(-104);
			if (((Node) class246).prev != null)
				class246.remove();
			anInt1124++;
			Node class246_29_ = (((IterableNodeHashTable) this).aClass246Array1118[(int) (l
					& (long) (((IterableNodeHashTable) this).anInt1115 - 1))]);
			((Node) class246).next = class246_29_;
			((Node) class246).prev = ((Node) class246_29_).prev;
			((Node) ((Node) class246).prev).next = class246;
			((Node) class246).hash = l;
			((Node) ((Node) class246).next).prev = class246;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("ib.M(" + l + ',' + i + ',' + (class246 != null ? "{...}" : "null") + ')'));
		}
	}

	final Node next(byte i) {
		try {
			anInt1130++;
			if (anInt1132 > 0 && (aClass246_1133 != ((IterableNodeHashTable) this).aClass246Array1118[anInt1132 - 1])) {
				Node class246 = aClass246_1133;
				aClass246_1133 = ((Node) class246).next;
				return class246;
			}
			while (anInt1132 < ((IterableNodeHashTable) this).anInt1115) {
				Node class246 = (((Node) ((IterableNodeHashTable) this).aClass246Array1118[anInt1132++]).next);
				if (((IterableNodeHashTable) this).aClass246Array1118[anInt1132 - 1] != class246) {
					aClass246_1133 = ((Node) class246).next;
					return class246;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ib.B(" + i + ')');
		}
	}

	final Node first(byte i) {
		try {
			anInt1132 = 0;
			anInt1134++;
			return next((byte) -20);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ib.L(" + i + ')');
		}
	}

	public IterableNodeHashTable(int i) {
		try {
			((IterableNodeHashTable) this).aClass246Array1118 = new Node[i];
			((IterableNodeHashTable) this).anInt1115 = i;
			for (int i_30_ = 0; i_30_ < i; i_30_++) {
				Node class246 = (((IterableNodeHashTable) this).aClass246Array1118[i_30_] = new Node());
				((Node) class246).next = class246;
				((Node) class246).prev = class246;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ib.<init>(" + i + ')');
		}
	}

	final int method550(int i) {
		try {
			if (i != -14891)
				aLong1128 = -35L;
			anInt1120++;
			return ((IterableNodeHashTable) this).anInt1115;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ib.H(" + i + ')');
		}
	}

	public static void method551(int i) {
		try {
			if (i != 31)
				method546(null, 8, (byte) -98);
			TitleScreen.loading_core_fonts_ms = null;
			anIntArrayArray1119 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ib.J(" + i + ')');
		}
	}

	final int method552(int i, Node[] class246s) {
		try {
			anInt1126++;
			int i_31_ = 59 % ((i - 57) / 52);
			int i_32_ = 0;
			for (int i_33_ = 0; ((IterableNodeHashTable) this).anInt1115 > i_33_; i_33_++) {
				Node class246 = ((IterableNodeHashTable) this).aClass246Array1118[i_33_];
				for (Node class246_34_ = ((Node) class246).next; class246_34_ != class246; class246_34_ = ((Node) class246_34_).next)
					class246s[i_32_++] = class246_34_;
			}
			return i_32_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("ib.K(" + i + ',' + (class246s != null ? "{...}" : "null") + ')'));
		}
	}
}
