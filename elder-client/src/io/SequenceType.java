package io;

import java.util.Arrays;
import java.util.Map;

import io.cache.Revision;

public final class SequenceType {
	int[] frameIDs;
	boolean aBool1725;
	static int anInt1726;
	int precedenceAnimating = -1;
	static int anInt1728;
	static int anInt1729;
	static int anInt1730;
	int frameStep;
	boolean aBool1732;
	static AbstractSprite aClass_l1733;
	int[][] frameSounds;
	static Class205 aClass205_1735;
	Class45 aClass45_1736;
	int replyMode;
	static int anInt1738 = 0;
	int leftHandItem;
	static int anInt1740;
	int priority;
	int id;
	Revision revision;
	boolean aBool1743 = false;
	boolean stretches;
	int[] frameLenghts;
	int maxLoops;
	public static boolean field1820 = false;
	public int animMayaID = -1;
	public Map<Integer, Integer> animMayaFrameSounds;
	public int animMayaStart;
	public int animMayaEnd;
	public boolean[] animMayaMasks;
	int forcedPriority;
	static int anInt1748;
	int rightHandItem;
	private int[] chatFrameIds;
	boolean[] interleaveLeave;
	static int anInt1752;
	public animstuff[] osrssoundEffects;
	public Map field1844;

	private final void process_op_osrs(Buffer stream, int opcode, int i_0_) {
		try {
			if (i_0_ != -15734)
				method848(-111);
			anInt1740++;
			if (opcode == 1) {
				int i_10_ = stream.readUnsignedShort();
				((SequenceType) this).frameLenghts = new int[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
					((SequenceType) this).frameLenghts[i_11_] = stream.readUnsignedShort();
				}
				((SequenceType) this).frameIDs = new int[i_10_];
				for (int i_12_ = 0; i_10_ > i_12_; i_12_++) {
					((SequenceType) this).frameIDs[i_12_] = stream.readUnsignedShort();
				}
				for (int i_13_ = 0; i_13_ < i_10_; i_13_++) {
					((SequenceType) this).frameIDs[i_13_] += stream.readUnsignedShort() << 16;
				}
			} else if (opcode == 2) {
				((SequenceType) this).frameStep = stream.readUnsignedShort();
			} else if (opcode == 3) {
				((SequenceType) this).interleaveLeave = new boolean[256];
				int i_1_ = stream.readUnsignedByte();
				for (int i_2_ = 0; i_1_ > i_2_; i_2_++)
					((SequenceType) this).interleaveLeave[stream.readUnsignedByte()] = true;
			} else if (opcode == 4) {
				((SequenceType) this).stretches = true;
			} else if (opcode == 5) {
				((SequenceType) this).forcedPriority = stream.readUnsignedByte();
			} else if (opcode == 6)
				((SequenceType) this).leftHandItem = stream.readUnsignedShort();
			else if (opcode == 7)
				((SequenceType) this).rightHandItem = stream.readUnsignedShort();
			else if (opcode == 8)
				((SequenceType) this).maxLoops = stream.readUnsignedByte();
			else if (opcode == 9)
				((SequenceType) this).precedenceAnimating = stream.readUnsignedByte();
			else if (opcode == 10)
				((SequenceType) this).priority = stream.readUnsignedByte();
			else if (opcode == 11)
				((SequenceType) this).replyMode = stream.readUnsignedByte();
			else if (opcode == 12) {
				int i_7_ = stream.readUnsignedByte();
				chatFrameIds = new int[i_7_];
				for (int i_8_ = 0; i_7_ > i_8_; i_8_++)
					chatFrameIds[i_8_] = stream.readUnsignedShort();
				for (int i_9_ = 0; i_9_ < i_7_; i_9_++)
					chatFrameIds[i_9_] = ((stream.readUnsignedShort() << 16) - -chatFrameIds[i_9_]);
			} else if (opcode == 13) {
				boolean var8;
				boolean var9;
				int var11;
				int var17;
				int var18;
				int var19;
				int var3 = stream.readUnsignedByte();
				this.osrssoundEffects = new animstuff[var3];

				for (int var4 = 0; var4 < var3; ++var4) {
					animstuff var13;
					animstuff[] var14;
					label132: {
						var14 = this.osrssoundEffects;
						if (stream != null) {
							var8 = false;
							var9 = false;
							boolean var10 = false;
							var11 = 0;
							if (false) {
								int var12 = stream.readMedium();
								var19 = var12 & 15;
								var17 = var12 >> 8;
								var18 = var12 >> 4 & 7;
							} else {
								var17 = stream.readUnsignedShort();
								var18 = stream.readUnsignedByte();
								var19 = stream.readUnsignedByte();
								var11 = stream.readUnsignedByte();
							}

							if (var17 >= 1 && var18 >= 1 && var19 >= 0 && var11 >= 0) {
								var13 = new animstuff(var17, var18, var19, var11);
								break label132;
							}
						}

						var13 = null;
					}

					var14[var4] = var13;
				}
			} else if (opcode == 14) {
				animMayaID = stream.readInt();
			} else if (opcode == 15) {
				boolean var8;
				boolean var9;
				int var11;
				int var17;
				int var18;
				int var19;
				int var3 = stream.readUnsignedShort();
				this.field1844 = new java.util.HashMap();

				for (int var4 = 0; var4 < var3; ++var4) {
					int var5;
					animstuff var6;
					label146: {
						var5 = stream.readUnsignedShort();
						if (stream != null) {
							boolean var7 = false;
							var8 = false;
							var9 = false;
							var19 = 0;
							int var16;
							if (false) {
								var11 = stream.readMedium();
								var18 = var11 & 15;
								var16 = var11 >> 8;
								var17 = var11 >> 4 & 7;
							} else {
								var16 = stream.readUnsignedShort();
								var17 = stream.readUnsignedByte();
								var18 = stream.readUnsignedByte();
								var19 = stream.readUnsignedByte();
							}

							if (var16 >= 1 && var17 >= 1 && var18 >= 0 && var19 >= 0) {
								var6 = new animstuff(var16, var17, var18, var19);
								break label146;
							}
						}

						var6 = null;
					}

					this.field1844.put(var5, var6);
				}
			} else if (opcode == 16) {
				animMayaStart = stream.readUnsignedShort();
				animMayaEnd = stream.readUnsignedShort();
			} else if (opcode == 17) {
				animMayaMasks = new boolean[256];

				int var3 = stream.readUnsignedByte();

				for (int var4 = 0; var4 < var3; ++var4) {
					animMayaMasks[stream.readUnsignedByte()] = true;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isCachedModelIdSet() {
		return this.animMayaID >= 0;
	}

	private final void process_op(Buffer stream, int opcode, int i_0_) {
		try {
			if (i_0_ != -15734)
				method848(-111);
			anInt1740++;
			if (opcode == 1) {
				int i_10_ = stream.readUnsignedShort();
				((SequenceType) this).frameLenghts = new int[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
					((SequenceType) this).frameLenghts[i_11_] = stream.readUnsignedShort();
				((SequenceType) this).frameIDs = new int[i_10_];
				for (int i_12_ = 0; i_10_ > i_12_; i_12_++)
					((SequenceType) this).frameIDs[i_12_] = stream.readUnsignedShort();
				for (int i_13_ = 0; i_13_ < i_10_; i_13_++) {
					((SequenceType) this).frameIDs[i_13_] = ((stream.readUnsignedShort() << 16)
							+ ((SequenceType) this).frameIDs[i_13_]);
				}
			} else if (opcode == 2) {
				((SequenceType) this).frameStep = stream.readUnsignedShort();
			} else if (opcode == 3) {
				((SequenceType) this).interleaveLeave = new boolean[256];
				int i_1_ = stream.readUnsignedByte();
				for (int i_2_ = 0; i_1_ > i_2_; i_2_++)
					((SequenceType) this).interleaveLeave[stream.readUnsignedByte()] = true;
			} else if (opcode == 4) {
				((SequenceType) this).stretches = true;
			} else if (opcode == 5) {
				((SequenceType) this).forcedPriority = stream.readUnsignedByte();
			} else if (opcode == 6)
				((SequenceType) this).leftHandItem = stream.readUnsignedShort();
			else if (opcode == 7)
				((SequenceType) this).rightHandItem = stream.readUnsignedShort();
			else if (opcode == 8)
				((SequenceType) this).maxLoops = stream.readUnsignedByte();
			else if (opcode == 9)
				((SequenceType) this).precedenceAnimating = stream.readUnsignedByte();
			else if (opcode == 10)
				((SequenceType) this).priority = stream.readUnsignedByte();
			else if (opcode == 11)
				((SequenceType) this).replyMode = stream.readUnsignedByte();
			else if (opcode == 12) {
				int i_7_ = stream.readUnsignedByte();
				chatFrameIds = new int[i_7_];
				for (int i_8_ = 0; i_7_ > i_8_; i_8_++)
					chatFrameIds[i_8_] = stream.readUnsignedShort();
				for (int i_9_ = 0; i_9_ < i_7_; i_9_++)
					chatFrameIds[i_9_] = ((stream.readUnsignedShort() << 16) - -chatFrameIds[i_9_]);
			} else if (opcode == 13) {
				int i_3_ = stream.readUnsignedShort();
				((SequenceType) this).frameSounds = new int[i_3_][];
				for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
					int i_5_ = stream.readUnsignedByte();
					if (i_5_ > 0) {
						((SequenceType) this).frameSounds[i_4_] = new int[i_5_];
						((SequenceType) this).frameSounds[i_4_][0] = stream.read24BitInteger();
						for (int i_6_ = 1; (i_6_ < i_5_); i_6_++)
							((SequenceType) this).frameSounds[i_4_][i_6_] = stream.readUnsignedShort();
					}
				}
			} else if (opcode == 14)
				((SequenceType) this).aBool1743 = true;
			else if (opcode == 15)
				((SequenceType) this).aBool1732 = true;
			else if (opcode == 16) {
				((SequenceType) this).aBool1725 = true;
			} else if (opcode == 17) {
				int anInt701 = stream.readUnsignedByte();
			} else if (opcode == 18) {
				boolean aBool704 = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int translate_duplicates_645(int id) {
		switch (id) {

			case 11973:
				return 808;
			case 11975:
				return 1660;
			case 11976:
				return 1661;
			case 11974:
				return 1659;

			case 11982:
				return 7053;
			case 11983:
				return 7052;
			case 11984:
				return 7043;
			case 11979: // attack anim
				return 7045;
			case 11980: // attack anim
				return 7054;
			case 11981: // attack anim
				return 7046;
			case 11989: // spec attack anim
				return 7644;
			case 7050: // spec attack anim
				return 7056;
			default:
				return -1;
		}
	}

	public static int translate_duplicates_550(int id) {
		switch (id) {

			case 11973:
				return 808;
			case 11975:
				return 1660;
			case 11976:
				return 1661;
			case 11974:
				return 1659;
			case 11982:
				return 7053;
			case 11983:
				return 7052;
			case 11984:
				return 7043;
			case 11979: // attack anim
				return 7045;
			case 11980: // attack anim
				return 7054;
			case 11981: // attack anim
				return 7046;
			case 11989: // spec attack anim
				return 7644;
			case 7050: // spec attack anim
				return 7056;
			default:
				return -1;
		}
	}

	public static int translate_duplicates_osrs(int id) {
		switch (id) {

			default:
				return -1;
		}
	}

	final void decode(Buffer stream, int i, Revision revision) {
		try {
			for (;;) {
				int op = stream.readUnsignedByte();
				if (op == 0)
					break;
				if (revision == Revision.OSRS) {
					process_op_osrs(stream, op, -15734);
				} else {
					process_op(stream, op, -15734);
				}
			}
			anInt1748++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	final AbstractModel method846(int i, int i_16_, int i_17_, int i_18_, AbstractModel class_t, int i_19_) {
		try {
			if (i_19_ >= -102)
				((SequenceType) this).frameIDs = null;
			anInt1729++;
			int i_20_ = ((SequenceType) this).frameLenghts[i_18_];
			int i_21_ = ((SequenceType) this).frameIDs[i_18_];
			SequenceLoader class246_sub1_sub17 = ((SequenceType) this).aClass45_1736.method298(i_21_ >> 16, 1, this.id,
					this.revision);
			i_21_ &= 0xffff;
			if (class246_sub1_sub17 == null)
				return class_t.method678((byte) 1, i_16_, true);
			SequenceLoader class246_sub1_sub17_22_ = null;
			if ((((SequenceType) this).aBool1732 || Settings.force_tweening) && i_17_ != -1
					&& ((SequenceType) this).frameIDs.length > i_17_) {
				i_17_ = ((SequenceType) this).frameIDs[i_17_];
				class246_sub1_sub17_22_ = ((SequenceType) this).aClass45_1736.method298(i_17_ >> 16, 1, this.id,
						this.revision);
				i_17_ &= 0xffff;
			}
			SequenceLoader class246_sub1_sub17_23_ = null;
			SequenceLoader class246_sub1_sub17_24_ = null;
			int i_25_ = 0;
			int i_26_ = 0;
			if (chatFrameIds != null) {
				if (chatFrameIds.length > i_18_) {
					i_25_ = chatFrameIds[i_18_];
					if (i_25_ != 65535) {
						class246_sub1_sub17_23_ = ((SequenceType) this).aClass45_1736.method298(i_25_ >> 16, 1, this.id,
								this.revision);
						i_25_ &= 0xffff;
					}
				}
				if ((((SequenceType) this).aBool1732 || Settings.force_tweening) && i_17_ != -1
						&& chatFrameIds.length > i_17_) {
					i_26_ = chatFrameIds[i_17_];
					if (i_26_ != 65535) {
						class246_sub1_sub17_24_ = ((SequenceType) this).aClass45_1736.method298(i_26_ >> 16, 1, this.id,
								this.revision);
						i_26_ &= 0xffff;
					}
				}
			}
			if (((SequenceType) this).aBool1743)
				i_16_ |= 0x200;
			if (class246_sub1_sub17.method2757((byte) -103, i_21_))
				i_16_ |= 0x80;
			if (class246_sub1_sub17.method2764(-6210, i_21_))
				i_16_ |= 0x100;
			if (class246_sub1_sub17.method2765(i_21_, (byte) 105))
				i_16_ |= 0x400;
			if (class246_sub1_sub17_23_ != null) {
				if (class246_sub1_sub17_23_.method2757((byte) -119, i_25_))
					i_16_ |= 0x80;
				if (class246_sub1_sub17_23_.method2764(-6210, i_25_))
					i_16_ |= 0x100;
				if (class246_sub1_sub17_23_.method2765(i_25_, (byte) 119))
					i_16_ |= 0x400;
			}
			if (class246_sub1_sub17_22_ != null) {
				if (class246_sub1_sub17_22_.method2757((byte) -110, i_17_))
					i_16_ |= 0x80;
				if (class246_sub1_sub17_22_.method2764(-6210, i_17_))
					i_16_ |= 0x100;
				if (class246_sub1_sub17_22_.method2765(i_17_, (byte) 95))
					i_16_ |= 0x400;
			}
			if (class246_sub1_sub17_24_ != null) {
				if (class246_sub1_sub17_24_.method2757((byte) -125, i_26_))
					i_16_ |= 0x80;
				if (class246_sub1_sub17_24_.method2764(-6210, i_26_))
					i_16_ |= 0x100;
				if (class246_sub1_sub17_24_.method2765(i_26_, (byte) 116))
					i_16_ |= 0x400;
			}
			i_16_ |= 0x20;
			AbstractModel class_t_27_ = class_t.method678((byte) 1, i_16_, true);
			class_t_27_.method674(0, i_20_, ((SequenceType) this).aBool1743, i_21_, i_17_, class246_sub1_sub17,
					class246_sub1_sub17_22_, -1 + i, 0, this.id, this);
			if (class246_sub1_sub17_23_ != null)
				class_t_27_.method674(0, i_20_, ((SequenceType) this).aBool1743, i_25_, i_26_, class246_sub1_sub17_23_,
						class246_sub1_sub17_24_, i - 1, 0, this.id, this);
			return class_t_27_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lp.B(" + i + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ','
					+ (class_t != null ? "{...}" : "null") + ',' + i_19_ + ')'));
		}
	}

	final int method847(int i, int i_28_, int i_29_, boolean bool) {
		int i_30_ = 0;
		int i_31_ = 0;
		int i_32_ = ((SequenceType) this).frameIDs[i];
		SequenceLoader class246_sub1_sub17 = null;
		SequenceLoader class246_sub1_sub17_33_ = ((SequenceType) this).aClass45_1736.method298(i_32_ >> 16, 1, this.id,
				this.revision);
		i_32_ &= 0xffff;
		if (class246_sub1_sub17_33_ == null)
			return i_30_;
		if ((((SequenceType) this).aBool1732 || Settings.force_tweening) && i_29_ != -1
				&& i_29_ < ((SequenceType) this).frameIDs.length) {
			i_31_ = ((SequenceType) this).frameIDs[i_29_];
			class246_sub1_sub17 = ((SequenceType) this).aClass45_1736.method298(i_31_ >> 16, 1, this.id, this.revision);
			i_31_ &= 0xffff;
		}
		if (((SequenceType) this).aBool1743)
			i_30_ |= 0x200;
		if (class246_sub1_sub17_33_.method2757((byte) -88, i_32_))
			i_30_ |= 0x80;
		if (class246_sub1_sub17_33_.method2764(-6210, i_32_))
			i_30_ |= 0x100;
		if (class246_sub1_sub17_33_.method2765(i_32_, (byte) 115))
			i_30_ |= 0x400;
		if (class246_sub1_sub17 != null) {
			if (class246_sub1_sub17.method2757((byte) -108, i_31_))
				i_30_ |= 0x80;
			if (class246_sub1_sub17.method2764(-6210, i_31_))
				i_30_ |= 0x100;
			if (class246_sub1_sub17.method2765(i_31_, (byte) 109))
				i_30_ |= 0x400;
		}
		if (chatFrameIds != null && bool) {
			if (i < chatFrameIds.length) {
				int i_34_ = chatFrameIds[i];
				if (i_34_ != 65535) {
					SequenceLoader class246_sub1_sub17_35_ = ((SequenceType) this).aClass45_1736.method298(i_34_ >> 16,
							1, this.id, this.revision);
					i_34_ &= 0xffff;
					if (class246_sub1_sub17_35_ != null) {
						if (class246_sub1_sub17_35_.method2757((byte) -55, i_34_))
							i_30_ |= 0x80;
						if (class246_sub1_sub17_35_.method2764(-6210, i_34_))
							i_30_ |= 0x100;
						if (class246_sub1_sub17_35_.method2765(i_34_, (byte) 95))
							i_30_ |= 0x400;
					}
				}
			}
			if ((((SequenceType) this).aBool1732 || Settings.force_tweening) && i_29_ != -1
					&& i_29_ < chatFrameIds.length) {
				int i_36_ = chatFrameIds[i_29_];
				if (i_36_ != 65535) {
					SequenceLoader class246_sub1_sub17_37_ = ((SequenceType) this).aClass45_1736.method298(i_36_ >> 16,
							1, this.id, this.revision);
					i_36_ &= 0xffff;
					if (class246_sub1_sub17_37_ != null) {
						if (class246_sub1_sub17_37_.method2757((byte) -55, i_36_))
							i_30_ |= 0x80;
						if (class246_sub1_sub17_37_.method2764(-6210, i_36_))
							i_30_ |= 0x100;
						if (class246_sub1_sub17_37_.method2765(i_36_, (byte) 109))
							i_30_ |= 0x400;
					}
				}
			}
		}
		return 0x20 | i_30_;
	}

	static final void method848(int i) {
		try {
			if (i > -41)
				aClass205_1735 = null;
			anInt1730++;
			int i_38_ = Class246_Sub4.anInt3869;
			int[] is = Class53.anIntArray755;
			for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
				Player class_r_sub1 = Class143.players[is[i_39_]];
				if (class_r_sub1 != null)
					Class246_Sub6.method1819(class_r_sub1.method2670((byte) 127), (byte) -10, class_r_sub1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lp.E(" + i + ')');
		}
	}

	final AbstractModel method849(int i, byte i_40_, AbstractModel class_t, int i_41_, int i_42_, int i_43_, int i_44_,
			int i_45_) {
		int i_46_ = ((SequenceType) this).frameLenghts[i];
		i = ((SequenceType) this).frameIDs[i];
		SequenceLoader class246_sub1_sub17 = ((SequenceType) this).aClass45_1736.method298(i >> 16, i_45_ ^ 0x101,
				this.id, this.revision);
		i &= 0xffff;
		if (class246_sub1_sub17 == null)
			return class_t.method678(i_40_, i_44_, true);
		SequenceLoader class246_sub1_sub17_47_ = null;
		if ((((SequenceType) this).aBool1732 || Settings.force_tweening) && i_42_ != -1
				&& i_42_ < ((SequenceType) this).frameIDs.length) {
			i_42_ = ((SequenceType) this).frameIDs[i_42_];
			class246_sub1_sub17_47_ = ((SequenceType) this).aClass45_1736.method298(i_42_ >> 16, i_45_ ^ 0x101, this.id,
					this.revision);
			i_42_ &= 0xffff;
		}
		if (((SequenceType) this).aBool1743)
			i_44_ |= 0x200;
		if (i_45_ != 256)
			((SequenceType) this).aBool1725 = false;
		if (class246_sub1_sub17.method2757((byte) -45, i))
			i_44_ |= 0x80;
		if (class246_sub1_sub17.method2764(i_45_ - 6466, i))
			i_44_ |= 0x100;
		if (class246_sub1_sub17.method2765(i, (byte) 96))
			i_44_ |= 0x400;
		if (class246_sub1_sub17_47_ != null) {
			if (class246_sub1_sub17_47_.method2757((byte) -92, i_42_))
				i_44_ |= 0x80;
			if (class246_sub1_sub17_47_.method2764(-6210, i_42_))
				i_44_ |= 0x100;
			if (class246_sub1_sub17_47_.method2765(i_42_, (byte) 94))
				i_44_ |= 0x400;
		}
		i_44_ |= 0x20;
		AbstractModel class_t_48_ = class_t.method678(i_40_, i_44_, true);
		class_t_48_.method674(i_43_, i_46_, ((SequenceType) this).aBool1743, i, i_42_, class246_sub1_sub17,
				class246_sub1_sub17_47_, i_41_ - 1, 0, this.id, this);
		return class_t_48_;
	}

	final void post_decode(int i) {
		do {
			try {
				do {
					if (((SequenceType) this).precedenceAnimating == -1) {
						if (((SequenceType) this).interleaveLeave == null) {
							((SequenceType) this).precedenceAnimating = 0;
							if (!Client.f_ob)
								break;
						}
						((SequenceType) this).precedenceAnimating = 2;
					}
				} while (false);
				if (i != 2)
					((SequenceType) this).priority = -63;
				anInt1752++;
				if (((SequenceType) this).priority != -1)
					break;
				if (((SequenceType) this).interleaveLeave != null)
					((SequenceType) this).priority = 2;
				else
					((SequenceType) this).priority = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lp.F(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method851(byte i) {
		try {
			aClass_l1733 = null;
			aClass205_1735 = null;
			int i_49_ = 114 / ((i - 44) / 38);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lp.A(" + i + ')');
		}
	}

	public SequenceType() {
		((SequenceType) this).leftHandItem = -1;
		((SequenceType) this).maxLoops = 99;
		((SequenceType) this).aBool1732 = false;
		((SequenceType) this).forcedPriority = 5;
		((SequenceType) this).stretches = false;
		((SequenceType) this).frameStep = -1;
		((SequenceType) this).aBool1725 = false;
		((SequenceType) this).replyMode = 2;
		((SequenceType) this).rightHandItem = -1;
		((SequenceType) this).priority = -1;
	}

	static {
		aClass205_1735 = new Class205("WTI", 5);
	}
}
