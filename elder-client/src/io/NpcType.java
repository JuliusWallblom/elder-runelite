package io;

import io.cache.Revision;

final class NpcType {
	public int height = -1;
	public int[] stats = {1, 1, 1, 1, 1, 1};
	private byte[] aByteArray3568;
	boolean drawMinimapDot;
	private short[] retextureToReplace;
	boolean aBool3571;
	static int anInt3572;
	private short[] recolourTarget;
	int size;
	int duno3;
	static int anInt3576;
	int anInt3577;
	int headIcon;
	private short[] retextureToFind;
	int anInt3580;
	boolean priorityRender;
	private byte aByte3582 = 0;
	int duno2;
	static int anInt3584;
	int anInt3585;
	int duno;
	int id;
	private int[][] anIntArrayArray3588;
	int duno4;
	private int[][] anIntArrayArray3590;
	private int varBitID;
	int anInt3592;
	static int anInt3593;
	int[] childrenIDs;
	static int anInt3595;
	boolean aBool3596;
	static int anInt3597;
	private byte aByte3598;
	private IterableNodeHashTable aClass85_3599;
	static HashMap aClass54_3600 = new HashMap(260);
	private byte aByte3601;
	int anInt3602;
	byte aByte3603;
	String[] actions;
	private int[] modelId;
	int anInt3606;
	private int scaleXZ;
	int degreesToTurn;
	byte aByte3609;
	byte aByte3610;
	static int anInt3611;
	static int anInt3612;
	private int scaleY;
	static int anInt3614;
	short aShort3615;
	byte aByte3616;
	static int anInt3617;
	boolean clickable;
	static int anInt3619;
	private int lightModifier;
	int f_bb;
	static int f_cb;
	String name;
	private int settingId;
	private int shadowModifier;
	static int f_gb;
	private short[] recolourOriginal;
	int f_ib;
	int f_jb;
	private int[] f_kb;
	int combatLevel;
	static int f_mb;
	static long f_nb = 0L;
	int[] f_ob;
	int f_pb;
	boolean f_qb;
	private byte f_rb;
	int f_sb;
	short f_tb;
	int f_ub;
	boolean f_vb;
	static int f_wb = 0;
	Class228 aClass228_3620;
	int render_emote, walk_animation;
	public Revision revision;

	public void create_stance(RenderAnimation config, NpcType npc) {
		config.stand_sequence = npc.render_emote;
		config.walk_sequence = npc.walk_animation;
	}

	final boolean method1622(Interface11 interface11, int i) {
		try {
			f_mb++;
			if (((NpcType) this).childrenIDs == null)
				return true;
			int i_0_ = -1;
			do {
				if (varBitID != -1) {
					i_0_ = interface11.getVarBitValue((byte) 45, varBitID, this.revision == Revision.OSRS ? 193 : 634);
					if (!Client.f_ob)
						break;
				}
				if (settingId != -1)
					i_0_ = interface11.method35(settingId, 0, this.revision == Revision.OSRS ? 193 : 634);
			} while (false);
			if (i != -14095)
				method1622(null, 45);
			if (i_0_ < 0 || (i_0_ >= ((NpcType) this).childrenIDs.length - 1)
					|| (((NpcType) this).childrenIDs[i_0_] == -1)) {
				int i_1_ = (((NpcType) this).childrenIDs[-1 + ((NpcType) this).childrenIDs.length]);
				if (i_1_ != -1)
					return true;
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"wh.D(" + (interface11 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method1623(int i, int i_2_, int i_3_) {
		try {
			anInt3595++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(0, (byte) 125, 15);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210 = i_3_;
			if (i != 132)
				f_wb = 69;
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.M(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final NpcType method1624(boolean bool, Interface11 interface11) {
		try {
			anInt3611++;
			if (bool != false)
				method1634(106, 39, -68, 29, null, 30, null, null, null);
			int i = -1;
			do {
				if (varBitID != -1) {
					i = interface11.getVarBitValue((byte) 45, varBitID, this.revision == Revision.OSRS ? 193 : 634);
					if (!Client.f_ob)
						break;
				}
				if (settingId != -1)
					i = interface11.method35(settingId, 0, this.revision == Revision.OSRS ? 193 : 634);
			} while (false);
			if (i < 0 || i >= -1 + ((NpcType) this).childrenIDs.length || ((NpcType) this).childrenIDs[i] == -1) {
				int i_4_ = (((NpcType) this).childrenIDs[((NpcType) this).childrenIDs.length - 1]);
				if (i_4_ != -1)
					return ((NpcType) this).aClass228_3620.list(i_4_);
				return null;
			}
			return ((NpcType) this).aClass228_3620.list(((NpcType) this).childrenIDs[i]);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wh.N(" + bool + ',' + (interface11 != null ? "{...}" : "null") + ')'));
		}
	}

	final AbstractModel method1625(int i, int i_5_, SequenceType class124, Interface11 interface11, int i_6_, int i_7_,
			int i_8_, int i_9_, SceneGraph class260, int i_10_, int i_11_, Class148[] class148s,
			SequenceType class124_12_, Class45 class45, RenderSequenceLoader class_v) {
		try {
			anInt3612++;
			if (((NpcType) this).childrenIDs != null) {
				NpcType class253_13_ = method1624(false, interface11);
				if (class253_13_ == null)
					return null;
				return class253_13_.method1625(i, -126, class124, interface11, i_6_, i_7_, i_8_, i_9_, class260, i_10_,
						i_11_, class148s, class124_12_, class45, class_v);
			}
			int i_14_ = i_7_;
			if (scaleY != 128)
				i_14_ |= 0x2;
			if (scaleXZ != 128)
				i_14_ |= 0x5;
			boolean bool = class124 != null || class124_12_ != null;
			boolean bool_15_ = false;
			boolean bool_16_ = false;
			boolean bool_17_ = false;
			boolean bool_18_ = false;
			int i_19_ = class148s != null ? class148s.length : 0;
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
				Class16.aClass246_Sub1_Sub17Array239[i_20_] = null;
				if (class148s[i_20_] != null) {
					SequenceType class124_21_ = class45.list(3, (((Class148) class148s[i_20_]).anInt2179),
							this.revision);
					if (((SequenceType) class124_21_).frameIDs != null) {
						bool = true;
						Class222.aClass124Array3067[i_20_] = class124_21_;
						int i_22_ = ((Class148) class148s[i_20_]).anInt2177;
						int i_23_ = ((Class148) class148s[i_20_]).anInt2180;
						int i_24_ = ((SequenceType) class124_21_).frameIDs[i_22_];
						Class16.aClass246_Sub1_Sub17Array239[i_20_] = class45.method298(i_24_ >>> 16, 1,
								class124_21_.id, class124_21_.revision);
						i_24_ &= 0xffff;
						Class40_Sub6.anIntArray5102[i_20_] = i_24_;
						if (Class16.aClass246_Sub1_Sub17Array239[i_20_] != null) {
							bool_16_ |= Class16.aClass246_Sub1_Sub17Array239[i_20_].method2757((byte) -111, i_24_);
							bool_15_ |= Class16.aClass246_Sub1_Sub17Array239[i_20_].method2764(-6210, i_24_);
							bool_18_ |= Class16.aClass246_Sub1_Sub17Array239[i_20_].method2765(i_24_, (byte) 95);
							bool_17_ |= ((SequenceType) class124_21_).aBool1743;
						}
						if ((((SequenceType) class124_21_).aBool1732 || Settings.force_tweening) && i_23_ != -1
								&& i_23_ < ((SequenceType) class124_21_).frameIDs.length) {
							Class193.anIntArray2713[i_20_] = (((SequenceType) class124_21_).frameLenghts[i_22_]);
							Class_e.anIntArray1215[i_20_] = ((Class148) class148s[i_20_]).anInt2182;
							int i_25_ = (((SequenceType) class124_21_).frameIDs[i_23_]);
							Class40.aClass246_Sub1_Sub17Array611[i_20_] = class45.method298(i_25_ >>> 16, 1,
									class124_21_.id, class124_21_.revision);
							i_25_ &= 0xffff;
							Class99.anIntArray1286[i_20_] = i_25_;
							if (Class40.aClass246_Sub1_Sub17Array611[i_20_] != null) {
								bool_16_ |= Class40.aClass246_Sub1_Sub17Array611[i_20_].method2757((byte) -96, i_25_);
								bool_15_ |= Class40.aClass246_Sub1_Sub17Array611[i_20_].method2764(-6210, i_25_);
								bool_18_ |= Class40.aClass246_Sub1_Sub17Array611[i_20_].method2765(i_25_, (byte) 114);
							}
						} else {
							Class193.anIntArray2713[i_20_] = 0;
							Class_e.anIntArray1215[i_20_] = 0;
							Class40.aClass246_Sub1_Sub17Array611[i_20_] = null;
							Class99.anIntArray1286[i_20_] = -1;
						}
					}
				}
			}
			int i_26_ = -1;
			int i_27_ = -1;
			int i_28_ = 0;
			SequenceLoader class246_sub1_sub17 = null;
			SequenceLoader class246_sub1_sub17_29_ = null;
			int i_30_ = -1;
			int i_31_ = -1;
			int i_32_ = 0;
			SequenceLoader class246_sub1_sub17_33_ = null;
			SequenceLoader class246_sub1_sub17_34_ = null;
			if (bool) {
				if (class124 != null) {
					i_26_ = ((SequenceType) class124).frameIDs[i_10_];
					int i_35_ = i_26_ >>> 16;
					i_26_ &= 0xffff;
					class246_sub1_sub17 = class45.method298(i_35_, 1, class124.id, class124.revision);
					if (class246_sub1_sub17 != null) {
						bool_16_ |= class246_sub1_sub17.method2757((byte) -100, i_26_);
						bool_15_ |= class246_sub1_sub17.method2764(-6210, i_26_);
						bool_18_ |= class246_sub1_sub17.method2765(i_26_, (byte) 96);
						bool_17_ |= ((SequenceType) class124).aBool1743;
					}
					if ((((SequenceType) class124).aBool1732 || Settings.force_tweening) && i_6_ != -1
							&& (((SequenceType) class124).frameIDs.length > i_6_)) {
						i_27_ = ((SequenceType) class124).frameIDs[i_6_];
						i_28_ = ((SequenceType) class124).frameLenghts[i_10_];
						int i_36_ = i_27_ >>> 16;
						if (i_35_ == i_36_)
							class246_sub1_sub17_29_ = class246_sub1_sub17;
						else
							class246_sub1_sub17_29_ = class45.method298(i_36_, 1, class124.id, class124.revision);
						i_27_ &= 0xffff;
						if (class246_sub1_sub17_29_ != null) {
							bool_16_ |= class246_sub1_sub17_29_.method2757((byte) -121, i_27_);
							bool_15_ |= class246_sub1_sub17_29_.method2764(-6210, i_27_);
							bool_18_ |= class246_sub1_sub17_29_.method2765(i_27_, (byte) 96);
						}
					}
				}
				i_14_ |= 0x20;
				if (class124_12_ != null) {
					i_30_ = ((SequenceType) class124_12_).frameIDs[i_9_];
					int i_37_ = i_30_ >>> 16;
					i_30_ &= 0xffff;
					class246_sub1_sub17_33_ = class45.method298(i_37_, 1, class124_12_.id, class124_12_.revision);
					if (class246_sub1_sub17_33_ != null) {
						bool_16_ |= class246_sub1_sub17_33_.method2757((byte) -97, i_30_);
						bool_15_ |= class246_sub1_sub17_33_.method2764(-6210, i_30_);
						bool_18_ |= class246_sub1_sub17_33_.method2765(i_30_, (byte) 94);
						bool_17_ |= ((SequenceType) class124_12_).aBool1743;
					}
					if ((((SequenceType) class124_12_).aBool1732 || Settings.force_tweening) && i_11_ != -1
							&& (((SequenceType) class124_12_).frameIDs.length > i_11_)) {
						i_31_ = ((SequenceType) class124_12_).frameIDs[i_11_];
						i_32_ = ((SequenceType) class124_12_).frameLenghts[i_9_];
						int i_38_ = i_31_ >>> 16;
						i_31_ &= 0xffff;
						if (i_37_ != i_38_)
							class246_sub1_sub17_34_ = class45.method298(i_38_, 1, class124_12_.id,
									class124_12_.revision);
						else
							class246_sub1_sub17_34_ = class246_sub1_sub17_33_;
						if (class246_sub1_sub17_34_ != null) {
							bool_16_ |= class246_sub1_sub17_34_.method2757((byte) -90, i_31_);
							bool_15_ |= class246_sub1_sub17_34_.method2764(-6210, i_31_);
							bool_18_ |= class246_sub1_sub17_34_.method2765(i_31_, (byte) 117);
						}
					}
				}
				if (bool_16_)
					i_14_ |= 0x80;
				if (bool_15_)
					i_14_ |= 0x100;
				if (bool_17_)
					i_14_ |= 0x200;
				if (bool_18_)
					i_14_ |= 0x400;
			}
			AbstractModel class_t;
			synchronized (((Class228) ((NpcType) this).aClass228_3620).aClass54_3136) {
				class_t = (AbstractModel) (((Class228) ((NpcType) this).aClass228_3620).aClass54_3136
						.method379((long) (((SceneGraph) class260).anInt3719 << 16 | ((NpcType) this).id), (byte) 58));
			}
			if (class_t == null || i_14_ != (class_t.P() & i_14_)) {
				if (class_t != null)
					i_14_ |= class_t.P();
				int i_39_ = i_14_;
				boolean bool_40_ = false;
				synchronized (this.get_npc_model_index()) {
					for (int i_41_ = 0; i_41_ < modelId.length; i_41_++) {
						if (modelId[i_41_] != -1
								&& !(this.get_npc_model_index().method85(0, (byte) -124, modelId[i_41_])))
							bool_40_ = true;
					}
				}
				if (bool_40_)
					return null;
				Model[] class103s = new Model[modelId.length];
				for (int i_42_ = 0; (i_42_ < modelId.length); i_42_++) {
					if (modelId[i_42_] != -1) {
						synchronized (this.get_npc_model_index()) {
							class103s[i_42_] = Model.get_model(0,
									(this.get_npc_model_index()),
									modelId[i_42_], this.revision);
						}
						if (class103s[i_42_] != null) {
							if (((Model) class103s[i_42_]).anInt1358 < 13)
								class103s[i_42_].method646(0, (byte) -85);
							if (anIntArrayArray3588 != null && anIntArrayArray3588[i_42_] != null)
								class103s[i_42_].method648(anIntArrayArray3588[i_42_][1], anIntArrayArray3588[i_42_][0],
										anIntArrayArray3588[i_42_][2], -62);
						}
					}
				}
				RenderAnimation render_animation = null;
				if (((NpcType) this).render_emote != -1) {
					render_animation = class_v.list(false, ((NpcType) this).render_emote);
				}
				create_stance(render_animation, this);
				if (render_animation != null && ((RenderAnimation) render_animation).anIntArrayArray1905 != null) {
					for (int i_43_ = 0; (i_43_ < ((RenderAnimation) render_animation).anIntArrayArray1905.length); i_43_++) {
						if ((((RenderAnimation) render_animation).anIntArrayArray1905[i_43_] != null)
								&& class103s.length > i_43_
								&& class103s[i_43_] != null) {
							int i_44_ = (((RenderAnimation) render_animation).anIntArrayArray1905[i_43_][0]);
							int i_45_ = (((RenderAnimation) render_animation).anIntArrayArray1905[i_43_][1]);
							int i_46_ = (((RenderAnimation) render_animation).anIntArrayArray1905[i_43_][2]);
							int i_47_ = ((((RenderAnimation) render_animation).anIntArrayArray1905[i_43_][3]) << 3);
							int i_48_ = ((((RenderAnimation) render_animation).anIntArrayArray1905[i_43_][4]) << 3);
							int i_49_ = ((((RenderAnimation) render_animation).anIntArrayArray1905[i_43_][5]) << 3);
							if (anIntArrayArray3590 == null)
								anIntArrayArray3590 = new int[(((RenderAnimation) render_animation).anIntArrayArray1905).length][];
							if (anIntArrayArray3590[i_43_] == null) {
								int[] is = anIntArrayArray3590[i_43_] = new int[15];
								if (i_47_ == 0 && i_48_ == 0 && i_49_ == 0) {
									is[14] = -i_46_;
									is[0] = is[4] = is[8] = 32768;
									is[13] = -i_45_;
									is[12] = -i_44_;
								} else {
									int i_50_ = MathUtils.COSINE[i_47_];
									int i_51_ = MathUtils.SINE[i_47_];
									int i_52_ = MathUtils.COSINE[i_48_];
									int i_53_ = MathUtils.SINE[i_48_];
									int i_54_ = MathUtils.COSINE[i_49_];
									int i_55_ = MathUtils.SINE[i_49_];
									int i_56_ = i_54_ * i_51_ + 16384 >> 15;
									int i_57_ = 16384 + i_55_ * i_51_ >> 15;
									is[3] = 16384 + i_50_ * i_55_ >> 15;
									is[5] = -i_51_;
									is[1] = (16384 + i_52_ * -i_55_ - -(i_53_ * i_56_)) >> 15;
									is[8] = i_52_ * i_50_ + 16384 >> 15;
									is[7] = i_56_ * i_52_ + (-i_53_ * -i_55_ + 16384) >> 15;
									is[0] = (16384 + i_54_ * i_52_ + i_53_ * i_57_) >> 15;
									is[2] = 16384 + i_53_ * i_50_ >> 15;
									is[4] = 16384 + i_50_ * i_54_ >> 15;
									is[6] = (16384 + i_57_ * i_52_ + -i_53_ * i_54_) >> 15;
									is[13] = 16384 + (is[4] * -i_45_ + is[1] * -i_44_ + -i_46_ * is[7]) >> 15;
									is[14] = 16384 + (is[8] * -i_46_ + (-i_44_ * is[2] + is[5] * -i_45_)) >> 15;
									is[12] = 16384 + (-i_44_ * is[0] + -i_45_ * is[3] + is[6] * -i_46_) >> 15;
								}
								is[11] = i_46_;
								is[10] = i_45_;
								is[9] = i_44_;
							}
							if (i_47_ != 0 || i_48_ != 0 || i_49_ != 0)
								class103s[i_43_].method660(i_47_, i_48_, i_49_, (byte) 111);
							if (i_44_ != 0 || i_45_ != 0 || i_46_ != 0)
								class103s[i_43_].method648(i_45_, i_44_, i_46_, -17);
						}
					}
				}

				Model class103;
				if (class103s.length == 1)
					class103 = class103s[0];
				else
					class103 = new Model(class103s, class103s.length);
				if (recolourOriginal != null)
					i_39_ |= 0x4000;
				if (retextureToFind != null)
					i_39_ |= 0x8000;
				if (aByte3582 != 0)
					i_39_ |= 0x80000;
				class_t = class260.method1695(class103, i_39_,
						(((Class228) (((NpcType) this).aClass228_3620)).anInt3139), 64 + lightModifier,
						850 + shadowModifier);
				if (recolourOriginal != null) {
					for (int i_58_ = 0; i_58_ < recolourOriginal.length; i_58_++) {
						if (aByteArray3568 == null || (i_58_ >= aByteArray3568.length))
							class_t.BA(recolourOriginal[i_58_], recolourTarget[i_58_]);
						else
							class_t.BA(recolourOriginal[i_58_], (Class44.aShortArray641[aByteArray3568[i_58_] & 0xff]));
					}
				}
				if (retextureToFind != null) {
					for (int i_59_ = 0; (retextureToFind.length > i_59_); i_59_++)
						class_t.I(retextureToFind[i_59_], retextureToReplace[i_59_]);
				}
				if (aByte3582 != 0)
					class_t.method684(aByte3598, aByte3601, f_rb, aByte3582 & 0xff);
				class_t.UA(i_14_);
				synchronized (((Class228) ((NpcType) this).aClass228_3620).aClass54_3136) {
					((Class228) ((NpcType) this).aClass228_3620).aClass54_3136.method371(1,
							(long) (((SceneGraph) class260).anInt3719 << 16 | ((NpcType) this).id), class_t);
				}
			}
			AbstractModel class_t_60_ = class_t.method678((byte) 4, i_14_, true);
			if (!bool)
				return class_t_60_;
			int i_61_ = -55 / ((-15 - i_5_) / 42);
			int i_62_ = 0;
			int i_63_ = 1;
			while (i_19_ > i_62_) {
				if (Class16.aClass246_Sub1_Sub17Array239[i_62_] != null)
					class_t_60_.method688(Class99.anIntArray1286[i_62_], Class40.aClass246_Sub1_Sub17Array611[i_62_],
							anIntArrayArray3590[i_62_], (((SequenceType) Class222.aClass124Array3067[i_62_]).aBool1743),
							0, Class40_Sub6.anIntArray5102[i_62_], 127, Class193.anIntArray2713[i_62_],
							Class16.aClass246_Sub1_Sub17Array239[i_62_], -1 + Class_e.anIntArray1215[i_62_], i_63_,
							class124.id, class124);
				i_62_++;
				i_63_ <<= 1;
			}
			if (class246_sub1_sub17 != null && class246_sub1_sub17_33_ != null)
				class_t_60_.method690(i_26_, i_28_, class246_sub1_sub17_34_,
						(((SequenceType) class124_12_).aBool1743 | ((SequenceType) class124).aBool1743), i_32_, -1 + i,
						i_30_, class246_sub1_sub17_33_, class246_sub1_sub17, i_31_,
						((SequenceType) class124).interleaveLeave, class246_sub1_sub17_29_, -1 + i_8_, i_27_, -122,
						class124.id, class124);
			else if (class246_sub1_sub17 != null)
				class_t_60_.method674(0, i_28_, ((SequenceType) class124).aBool1743, i_26_, i_27_, class246_sub1_sub17,
						class246_sub1_sub17_29_, i_8_ - 1, 0, class124.id, class124);
			else if (class246_sub1_sub17_33_ != null)
				class_t_60_.method674(0, i_32_, ((SequenceType) class124_12_).aBool1743, i_30_, i_31_,
						class246_sub1_sub17_33_, class246_sub1_sub17_34_, i - 1, 0, class124_12_.id, class124_12_);
			for (int i_64_ = 0; i_64_ < i_19_; i_64_++) {
				Class16.aClass246_Sub1_Sub17Array239[i_64_] = null;
				Class40.aClass246_Sub1_Sub17Array611[i_64_] = null;
				Class222.aClass124Array3067[i_64_] = null;
			}
			if (scaleXZ != 128 || scaleY != 128)
				class_t_60_.H(scaleXZ, scaleY, scaleXZ);
			class_t_60_.UA(i_7_);
			return class_t_60_;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	final void post_decode(boolean bool) {
		do {
			try {
				anInt3576++;
				if (modelId == null)
					modelId = new int[0];
				if (bool == false)
					break;
				recolourOriginal = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wh.K(" + bool + ')');
			}
			break;
		} while (false);
	}

	public static void method1627(int i) {
		try {
			if (i == 0)
				aClass54_3600 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wh.E(" + i + ')');
		}
	}

	final boolean method1628(int i) {
		try {
			f_cb++;
			int i_65_ = 64 % ((i - 33) / 52);
			if (((NpcType) this).childrenIDs == null) {
				if (((NpcType) this).duno == -1 && ((NpcType) this).duno3 == -1
						&& ((NpcType) this).duno4 == -1)
					return false;
				return true;
			}
			for (int i_66_ = 0; ((NpcType) this).childrenIDs.length > i_66_; i_66_++) {
				if (((NpcType) this).childrenIDs[i_66_] != -1) {
					NpcType class253_67_ = (((NpcType) this).aClass228_3620.list(((NpcType) this).childrenIDs[i_66_]));
					if (((NpcType) class253_67_).duno != -1 || (((NpcType) class253_67_).duno3 != -1)
							|| (((NpcType) class253_67_).duno4 != -1))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wh.C(" + i + ')');
		}
	}

	final String method1629(byte i, String string, int i_68_) {
		try {
			anInt3617++;
			if (aClass85_3599 == null)
				return string;
			Class246_Sub4 class246_sub4 = (Class246_Sub4) aClass85_3599.get((long) i_68_);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wh.G(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_68_ + ')'));
		}
	}

	public void process_op_osrs(Buffer stream, int opcode) {
		do {
			try {
				if (opcode == 1) {
					int j = stream.readUnsignedByte();
					modelId = new int[j];
					for (int j1 = 0; j1 < j; j1++)
						modelId[j1] = stream.readUnsignedShort();
				} else if (opcode == 2) {
					name = stream.readNullTerminatedString();
				} else if (opcode == 12) {
					size = stream.readUnsignedByte();
				} else if (opcode == 13) {
					render_emote = stream.readUnsignedShort();
				} else if (opcode == 14) {
					walk_animation = stream.readUnsignedShort();
				} else if (opcode == 15) {
					int duno3 = stream.readUnsignedShort();
				} else if (opcode == 16) {
					int duno4 = stream.readUnsignedShort();
				} else if (opcode == 17) {
					render_emote = stream.readUnsignedShort();
					walk_animation = stream.readUnsignedShort();
					int duno3 = stream.readUnsignedShort();
					int duno4 = stream.readUnsignedShort();
				} else if (opcode == 18) {
					int category = stream.readUnsignedShort();
				} else if (opcode >= 30 && opcode < 40) {
					if (actions == null)
						actions = new String[5];
					actions[opcode - 30] = stream.readString();
					if (actions[opcode - 30].equalsIgnoreCase("hidden"))
						actions[opcode - 30] = null;
				} else if (opcode == 40) {
					int colours = stream.readUnsignedByte();
					recolourOriginal = new short[colours];
					recolourTarget = new short[colours];
					for (int k1 = 0; k1 < colours; k1++) {
						recolourOriginal[k1] = (short) stream.readUnsignedShort();
						recolourTarget[k1] = (short) stream.readUnsignedShort();
					}
				} else if (opcode == 41) {
					int i_72_ = stream.readUnsignedByte();
					retextureToReplace = new short[i_72_];
					retextureToFind = new short[i_72_];
					for (int i_73_ = 0; i_72_ > i_73_; i_73_++) {
						retextureToFind[i_73_] = (short) (stream.readUnsignedShort());
						retextureToReplace[i_73_] = (short) (stream.readUnsignedShort());
					}
				} else if (opcode == 60) {
					int additionalModelLen = stream.readUnsignedByte();
					int[] aditionalModels = new int[additionalModelLen];
					for (int l1 = 0; l1 < additionalModelLen; l1++)
						aditionalModels[l1] = stream.readUnsignedShort();
				}else if (opcode == 74)
				{
					stats[0] = stream.readUnsignedShort();
				}
				else if (opcode == 75)
				{
					stats[1] = stream.readUnsignedShort();
				}
				else if (opcode == 76)
				{
					stats[2] = stream.readUnsignedShort();
				}
				else if (opcode == 77)
				{
					stats[3] = stream.readUnsignedShort();
				}
				else if (opcode == 78)
				{
					stats[4] = stream.readUnsignedShort();
				}
				else if (opcode == 79)
				{
					stats[5] = stream.readUnsignedShort();

				} else if (opcode == 93)
					drawMinimapDot = false;
				else if (opcode == 95)
					combatLevel = stream.readUnsignedShort();
				else if (opcode == 97)
					scaleXZ = stream.readUnsignedShort();
				else if (opcode == 98)
					scaleY = stream.readUnsignedShort();
				else if (opcode == 99)
					priorityRender = true;
				else if (opcode == 100)
					lightModifier = stream.readByte();
				else if (opcode == 101)
					shadowModifier = stream.readByte();
				else if (opcode == 102)
					headIcon = stream.readUnsignedShort();
				else if (opcode == 103)
					degreesToTurn = stream.readUnsignedShort();
				else if (opcode == 106 || opcode == 118) {
					varBitID = stream.readUnsignedShort();
					if (varBitID == 65535)
						varBitID = -1;
					settingId = stream.readUnsignedShort();
					if (settingId == 65535)
						settingId = -1;
					int value = -1;

					if (opcode == 118) {
						value = stream.readUnsignedShort();
					}
					int childCount = stream.readUnsignedByte();
					childrenIDs = new int[childCount + 2];
					for (int i2 = 0; i2 <= childCount; i2++) {
						childrenIDs[i2] = stream.readUnsignedShort();
						if (childrenIDs[i2] == 65535)
							childrenIDs[i2] = -1;
					}
					childrenIDs[childCount + 1] = value;
				} else if (opcode == 107) {
					boolean interactable = false;
				} else if (opcode == 109) {
					clickable = false;
				} else if (opcode == 111) {
					boolean is_pet = true;
				}
				else if (opcode == 124)
				{
					height = stream.readUnsignedShort();
				} else if (opcode == 249) {
					int i_81_ = stream.readUnsignedByte();
					if (aClass85_3599 == null) {
						int i_82_ = Class206.method1350(i_81_, 269173057);
						aClass85_3599 = new IterableNodeHashTable(i_82_);
					}
					for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
						boolean bool = stream.readUnsignedByte() == 1;
						int i_84_ = stream.read24BitInteger((byte) 29);
						Node class246;
						if (bool)
							class246 = new Class246_Sub4(stream.readString((byte) -40));
						else
							class246 = new SwitchInt(stream.readInt((byte) 114));
						aClass85_3599.method547((long) i_84_, 41 - 2300, class246);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} while (false);
	}

	private final void process_op(Buffer stream, int i, int i_69_) {
		do {
			try {
				if (i == 1) {
					int i_90_ = stream.readUnsignedByte();
					modelId = new int[i_90_];
					for (int i_91_ = 0; i_91_ < i_90_; i_91_++) {
						modelId[i_91_] = stream.readUnsignedShort();
						if (modelId[i_91_] == 65535)
							modelId[i_91_] = -1;
					}
				} else if (i == 2) {
					((NpcType) this).name = stream.readString((byte) -40);
				} else if (i == 12) {
					((NpcType) this).size = stream.readUnsignedByte();
				} else if (i >= 30 && i < 35) {
					((NpcType) this).actions[-30 + i] = stream.readString((byte) -40);
				} else if (i == 40) {
					int i_70_ = stream.readUnsignedByte();
					recolourOriginal = new short[i_70_];
					recolourTarget = new short[i_70_];
					for (int i_71_ = 0; i_71_ < i_70_; i_71_++) {
						recolourOriginal[i_71_] = (short) (stream.readUnsignedShort());
						recolourTarget[i_71_] = (short) (stream.readUnsignedShort());
					}
				} else if (i == 41) {
					int i_72_ = stream.readUnsignedByte();
					retextureToReplace = new short[i_72_];
					retextureToFind = new short[i_72_];
					for (int i_73_ = 0; i_72_ > i_73_; i_73_++) {
						retextureToFind[i_73_] = (short) (stream.readUnsignedShort());
						retextureToReplace[i_73_] = (short) (stream.readUnsignedShort());
					}
				} else if (i == 42) {
					int i_74_ = stream.readUnsignedByte();
					aByteArray3568 = new byte[i_74_];
					for (int i_75_ = 0; (i_74_ > i_75_); i_75_++)
						aByteArray3568[i_75_] = stream.readByte();
				} else if (i == 60) {
					int i_88_ = stream.readUnsignedByte();
					f_kb = new int[i_88_];
					for (int i_89_ = 0; i_88_ > i_89_; i_89_++)
						f_kb[i_89_] = stream.readUnsignedShort();
				} else if (i == 93)
					((NpcType) this).drawMinimapDot = false;
				else if (i == 95)
					((NpcType) this).combatLevel = stream.readUnsignedShort();
				else if (i == 97) {
					scaleXZ = stream.readUnsignedShort();
				} else if (i == 98)
					scaleY = stream.readUnsignedShort();
				else if (i == 99)
					((NpcType) this).priorityRender = true;
				else if (i == 100) {
					lightModifier = stream.readByte();
				} else if (i == 101) {
					shadowModifier = (stream.readByte() * 5);
				} else if (i == 102) {
					((NpcType) this).headIcon = (stream.readUnsignedShort());
				} else if (i == 103)
					((NpcType) this).degreesToTurn = (stream.readUnsignedShort());
				else if (i == 106 || (i == 118)) {
					varBitID = (stream.readUnsignedShort());
					if (varBitID == 65535)
						varBitID = -1;
					settingId = (stream.readUnsignedShort());
					if (settingId == 65535)
						settingId = -1;
					int i_85_ = -1;
					if (i == 118) {
						i_85_ = (stream.readUnsignedShort());
						if (i_85_ == 65535)
							i_85_ = -1;
					}
					int i_86_ = (stream.readUnsignedByte());
					((NpcType) this).childrenIDs = (new int[i_86_ + 2]);
					for (int i_87_ = 0; i_86_ >= i_87_; i_87_++) {
						((NpcType) this).childrenIDs[i_87_] = (stream.readUnsignedShort());
						if ((((NpcType) this).childrenIDs[i_87_]) == 65535)
							((NpcType) this).childrenIDs[i_87_] = -1;
					}
					((NpcType) this).childrenIDs[1 + i_86_] = i_85_;
				} else if (i == 107)
					((NpcType) this).aBool3596 = false;
				else if (i == 109) {
					((NpcType) this).clickable = false;
				} else if (i == 111)
					((NpcType) this).f_qb = false;
				else if (i == 113) {
					((NpcType) this).f_tb = (short) stream.readUnsignedShort();
					((NpcType) this).aShort3615 = (short) stream.readUnsignedShort();
				} else if (i == 114) {
					((NpcType) this).aByte3603 = (stream.readByte());
					((NpcType) this).aByte3610 = (stream.readByte());
				} else if (i == 115) {
					stream.readUnsignedByte();
					stream.readUnsignedByte();
				} else if (i == 119)
					((NpcType) this).aByte3609 = stream.readByte();
				else if (i == 121) {
					anIntArrayArray3588 = new int[modelId.length][];
					int i_76_ = stream.readUnsignedByte();
					for (int i_77_ = 0; i_76_ > i_77_; i_77_++) {
						int i_78_ = stream.readUnsignedByte();
						int[] is = anIntArrayArray3588[i_78_] = new int[3];
						is[0] = stream.readByte();
						is[1] = stream.readByte();
						is[2] = stream.readByte();
					}
				} else if (i == 122) {
					((NpcType) this).anInt3577 = stream.readUnsignedShort();
				} else if (i == 123) {
					((NpcType) this).f_ib = stream.readUnsignedShort();
				} else if (i == 125)
					((NpcType) this).aByte3616 = stream.readByte();
				else if (i == 127)
					((NpcType) this).render_emote = stream.readUnsignedShort();
				else if (i == 128)
					stream.readUnsignedByte();
				else if (i == 134) {
					((NpcType) this).duno = stream.readUnsignedShort();
					if (((NpcType) this).duno == 65535)
						((NpcType) this).duno = -1;
					((NpcType) this).duno2 = stream.readUnsignedShort();
					if (((NpcType) this).duno2 == 65535)
						((NpcType) this).duno2 = -1;
					((NpcType) this).duno3 = stream.readUnsignedShort();
					if (((NpcType) this).duno3 == 65535)
						((NpcType) this).duno3 = -1;
					((NpcType) this).duno4 = stream.readUnsignedShort();
					if (((NpcType) this).duno4 == 65535)
						((NpcType) this).duno4 = -1;
					((NpcType) this).f_sb = stream.readUnsignedByte();
				} else if (i == 135) {
					((NpcType) this).anInt3580 = stream.readUnsignedByte();
					((NpcType) this).f_pb = stream.readUnsignedShort();
				} else if (i == 136) {
					((NpcType) this).anInt3606 = stream.readUnsignedByte();
					((NpcType) this).f_bb = stream.readUnsignedShort();
				} else if (i == 137)
					((NpcType) this).anInt3592 = stream.readUnsignedShort();
				else if (i == 138) {
					((NpcType) this).anInt3585 = stream.readUnsignedShort();
				} else if (i == 139)
					((NpcType) this).anInt3602 = stream.readUnsignedShort();
				else if (i == 140) {
					((NpcType) this).f_jb = stream.readUnsignedByte();
				} else if (i == 141) {
					((NpcType) this).f_vb = true;
				} else if (i == 142) {
					((NpcType) this).f_ub = stream.readUnsignedShort();
				} else if (i == 143) {
					((NpcType) this).aBool3571 = true;
				} else if (i >= 150 && i < 155) {
					((NpcType) this).actions[i - 150] = stream.readString((byte) -40);
					if (!((Class228) ((NpcType) this).aClass228_3620).aBool3131)
						((NpcType) this).actions[-150 + i] = null;
				} else if (i == 155) {
					aByte3598 = stream.readByte();
					aByte3601 = stream.readByte();
					f_rb = stream.readByte();
					aByte3582 = stream.readByte();
				} else if (i == 160) {
					int i_79_ = stream.readUnsignedByte();
					((NpcType) this).f_ob = new int[i_79_];
					for (int i_80_ = 0; i_80_ < i_79_; i_80_++)
						((NpcType) this).f_ob[i_80_] = stream.readUnsignedShort();
				} else if (i == 249) {
					int i_81_ = stream.readUnsignedByte();
					if (aClass85_3599 == null) {
						int i_82_ = Class206.method1350(i_81_, 269173057);
						aClass85_3599 = new IterableNodeHashTable(i_82_);
					}
					for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
						boolean bool = stream.readUnsignedByte() == 1;
						int i_84_ = stream.read24BitInteger((byte) 29);
						Node class246;
						if (bool)
							class246 = new Class246_Sub4(stream.readString((byte) -40));
						else
							class246 = new SwitchInt(stream.readInt((byte) 114));
						aClass85_3599.method547((long) i_84_, i_69_ - 2300, class246);
					}
				}
				anInt3584++;
				if (i_69_ == -1)
					break;
				aClass54_3600 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("wh.L(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_69_ + ')'));
			}
			break;
		} while (false);
	}

	public CacheIndex get_npc_model_index() {
		if (this.revision == Revision.OSRS) {
			return Class228.osrs_npc_model_index;
		} else {
			return Class228.npc_model_index;
		}
	}

	final void decode(int i, Buffer stream, Revision revision) {
		try {
			for (;;) {
				int op = stream.readUnsignedByte();
				if (op == 0)
					break;
				if (revision == Revision.OSRS) {
					process_op_osrs(stream, op);
				} else {
					process_op(stream, op, -1);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wh.J(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final int method1632(int i, int i_93_, int i_94_) {
		try {
			anInt3619++;
			if (i_94_ != 0)
				return 78;
			if (aClass85_3599 == null)
				return i;
			SwitchInt class246_sub33 = ((SwitchInt) aClass85_3599.get((long) i_93_));
			if (class246_sub33 == null)
				return i;
			return ((SwitchInt) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.A(" + i + ',' + i_93_ + ',' + i_94_ + ')'));
		}
	}

	static final boolean method1633(boolean bool, byte[] is) {
		try {
			anInt3593++;
			if (bool != false)
				method1635(-95, false, null, null, null, 112, -27, -117);
			Buffer stream = new Buffer(is);
			int i = stream.readUnsignedByte();
			if (i != 1)
				return false;
			boolean bool_95_ = stream.readUnsignedByte() == 1;
			if (bool_95_)
				Class75.method472(stream, (byte) 13);
			Class186.method1221((byte) -47, stream);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.B(" + bool + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final AbstractModel method1634(int i, int i_96_, int i_97_, int i_98_, SequenceType class124, int i_99_,
			Interface11 interface11, SceneGraph class260, Class45 class45) {
		try {
			f_gb++;
			if (i_97_ <= 29)
				((NpcType) this).childrenIDs = null;
			if (((NpcType) this).childrenIDs != null) {
				NpcType class253_100_ = method1624(false, interface11);
				if (class253_100_ == null)
					return null;
				return class253_100_.method1634(i, i_96_, 41, i_98_, class124, i_99_, interface11, class260, class45);
			}
			if (f_kb == null)
				return null;
			int i_101_ = i_98_;
			if (class124 != null && i_99_ != -1)
				i_101_ |= class124.method847(i_99_, 256, i, true);
			AbstractModel class_t;
			synchronized (((Class228) ((NpcType) this).aClass228_3620).aClass54_3138) {
				class_t = ((AbstractModel) (((Class228) ((NpcType) this).aClass228_3620).aClass54_3138
						.method379((long) (((NpcType) this).id | ((SceneGraph) class260).anInt3719 << 16), (byte) 58)));
			}
			if (class_t == null || i_101_ != (i_101_ & class_t.P())) {
				if (class_t != null)
					i_101_ |= class_t.P();
				int i_102_ = i_101_;
				boolean bool = false;
				synchronized (this.get_npc_model_index()) {
					for (int i_103_ = 0; i_103_ < f_kb.length; i_103_++) {
						if (!this.get_npc_model_index().method85(0,
								(byte) -124, f_kb[i_103_]))
							bool = true;
					}
				}
				if (bool)
					return null;
				Model[] class103s = new Model[f_kb.length];
				synchronized (this.get_npc_model_index()) {
					for (int i_104_ = 0; i_104_ < f_kb.length; i_104_++)
						class103s[i_104_] = Model.get_model(0,
								(this.get_npc_model_index()),
								f_kb[i_104_], this.revision);
				}
				for (int i_105_ = 0; i_105_ < f_kb.length; i_105_++) {
					if (class103s[i_105_] != null && ((Model) class103s[i_105_]).anInt1358 < 13)
						class103s[i_105_].method646(0, (byte) -100);
				}
				Model class103;
				if (class103s.length != 1)
					class103 = new Model(class103s, class103s.length);
				else
					class103 = class103s[0];
				if (recolourOriginal != null)
					i_102_ |= 0x4000;
				if (retextureToFind != null)
					i_102_ |= 0x8000;
				if (aByte3582 != 0)
					i_102_ |= 0x80000;
				class_t = class260.method1695(class103, i_102_,
						(((Class228) (((NpcType) this).aClass228_3620)).anInt3139), 64, 768);
				if (recolourOriginal != null) {
					for (int i_106_ = 0; i_106_ < recolourOriginal.length; i_106_++) {
						if (aByteArray3568 == null || aByteArray3568.length <= i_106_)
							class_t.BA(recolourOriginal[i_106_], recolourTarget[i_106_]);
						else
							class_t.BA(recolourOriginal[i_106_],
									(Class44.aShortArray641[0xff & aByteArray3568[i_106_]]));
					}
				}
				if (retextureToFind != null) {
					for (int i_107_ = 0; (retextureToFind.length > i_107_); i_107_++)
						class_t.I(retextureToFind[i_107_], retextureToReplace[i_107_]);
				}
				if (aByte3582 != 0)
					class_t.method684(aByte3598, aByte3601, f_rb, aByte3582 & 0xff);
				class_t.UA(i_101_);
				synchronized (((Class228) ((NpcType) this).aClass228_3620).aClass54_3138) {
					((Class228) ((NpcType) this).aClass228_3620).aClass54_3138.method371(1,
							(long) (((NpcType) this).id | ((SceneGraph) class260).anInt3719 << 16), class_t);
				}
			}
			if (class124 != null && i_99_ != -1)
				class_t = class124.method846(i_96_, i_101_, i, i_99_, class_t, -105);
			class_t.UA(i_98_);
			return class_t;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wh.H(" + i + ',' + i_96_ + ',' + i_97_ + ',' + i_98_ + ',' + (class124 != null ? "{...}" : "null")
							+ ',' + i_99_ + ',' + (interface11 != null ? "{...}" : "null") + ','
							+ (class260 != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null")
							+ ')'));
		}
	}

	static final void method1635(int i, boolean bool, AbstractSprite class_l, Widget class235, Class128 class128,
			int i_108_,
			int i_109_, int i_110_) {
		try {
			if (bool != true)
				aClass54_3600 = null;
			anInt3597++;
			if (class_l != null) {
				int i_111_;
				do {
					if (Class130_Sub3.anInt4417 != 4) {
						i_111_ = 0x3fff & (Class95.anInt1253 + (int) Camera.camera_yaw);
						if (!Client.f_ob)
							break;
					}
					i_111_ = 0x3fff & (int) Camera.camera_yaw;
				} while (false);
				int i_112_ = (Math.max(((Widget) class235).screen_width / 2, ((Widget) class235).screen_height / 2)
						+ 10);
				int i_113_ = i_109_ * i_109_ + i_108_ * i_108_;
				if (i_112_ * i_112_ >= i_113_) {
					int i_114_ = MathUtils.SINE[i_111_];
					int i_115_ = MathUtils.COSINE[i_111_];
					if (Class130_Sub3.anInt4417 != 4) {
						i_114_ = 256 * i_114_ / (Class246_Sub12.anInt4405 + 256);
						i_115_ = i_115_ * 256 / (Class246_Sub12.anInt4405 + 256);
					}
					int i_116_ = i_108_ * i_114_ + i_109_ * i_115_ >> 15;
					int i_117_ = -(i_114_ * i_109_) + i_115_ * i_108_ >> 15;
					class_l.method737((i_116_ + ((Widget) class235).screen_width / 2 + (i - class_l.j() / 2)),
							(-i_117_ + ((Widget) class235).screen_height / 2 + i_110_ + -(class_l.T() / 2)), class128,
							i, i_110_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wh.F(" + i + ',' + bool + ',' + (class_l != null ? "{...}" : "null") + ','
							+ (class235 != null ? "{...}" : "null") + ',' + (class128 != null ? "{...}" : "null") + ','
							+ i_108_ + ',' + i_109_ + ',' + i_110_ + ')'));
		}
	}

	static final void method1636(int i, CacheIndex widget_index, CacheIndex font_index, CacheIndex model_index,
			CacheIndex sprite_index, CacheIndex osrs_widget_index, CacheIndex custom_osrs_widget_index,
			CacheIndex osrs_model_index, CacheIndex osrs_sprite_index, CacheIndex pre_eoc_550_widget_index,
			CacheIndex pre_eoc_550_sprite_index, CacheIndex custom_pre_eoc_550_widget_index,
			CacheIndex custom_pre_eoc_550_sprite_index) {
		try {
			if (i != -1)
				f_nb = -107L;
			anInt3572++;

			Widget.widget_data_index = widget_index;
			Widget.pre_eoc_634_sprite_index = sprite_index;
			Widget.widget_font_index = font_index;
			Widget.widget_model_index = model_index;

			Widget.pre_eoc_550_widget_index = pre_eoc_550_widget_index;
			Widget.pre_eoc_550_sprite_index = pre_eoc_550_sprite_index;

			Widget.osrs_widget_data_index = osrs_widget_index;
			Widget.osrs_sprite_index = osrs_sprite_index;
			Widget.osrs_widget_model_index = osrs_model_index;

			Widget.custom_osrs_widget_data_index = custom_osrs_widget_index;

			Widget.custom_pre_eoc_550_widget_data_index = custom_pre_eoc_550_widget_index;
			Widget.custom_pre_eoc_550_sprite_index = custom_pre_eoc_550_sprite_index;

			Widget.widgets = (new Widget[Widget.widget_data_index.method87((byte) 39)][]);
			Widget.widgets_550 = (new Widget[Widget.pre_eoc_550_widget_index.method87((byte) 39)][]);
			Widget.widgets_osrs = (new Widget[Widget.osrs_widget_data_index.method87((byte) 39)][]);
			Widget.loaded_widgets = new boolean[Widget.widget_data_index.method87((byte) 39)];
			Widget.loaded_widgets_550 = new boolean[Widget.pre_eoc_550_widget_index.method87((byte) 39)];
			Widget.loaded_widgets_osrs = new boolean[Widget.osrs_widget_data_index.method87((byte) 39)];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wh.O(" + i + ',' + (widget_index != null ? "{...}" : "null") + ','
							+ (font_index != null ? "{...}" : "null") + ',' + (model_index != null ? "{...}" : "null")
							+ ',' + (sprite_index != null ? "{...}" : "null") + ')'));
		}
	}

	public NpcType() {
		((NpcType) this).headIcon = -1;
		((NpcType) this).anInt3577 = -1;
		((NpcType) this).anInt3602 = -1;
		((NpcType) this).drawMinimapDot = true;
		varBitID = -1;
		scaleXZ = 128;
		((NpcType) this).aBool3571 = false;
		((NpcType) this).degreesToTurn = 32;
		((NpcType) this).duno3 = -1;
		((NpcType) this).aByte3609 = (byte) 0;
		((NpcType) this).aByte3616 = (byte) 4;
		((NpcType) this).anInt3592 = -1;
		((NpcType) this).priorityRender = false;
		((NpcType) this).clickable = true;
		settingId = -1;
		((NpcType) this).f_bb = -1;
		((NpcType) this).duno4 = -1;
		((NpcType) this).aByte3610 = (byte) -16;
		((NpcType) this).actions = new String[5];
		((NpcType) this).aBool3596 = true;
		((NpcType) this).name = "null";
		((NpcType) this).aShort3615 = (short) 0;
		((NpcType) this).duno = -1;
		((NpcType) this).anInt3580 = -1;
		((NpcType) this).f_sb = 0;
		((NpcType) this).combatLevel = -1;
		shadowModifier = 0;
		((NpcType) this).size = 1;
		((NpcType) this).duno2 = -1;
		((NpcType) this).f_pb = -1;
		((NpcType) this).f_tb = (short) 0;
		((NpcType) this).anInt3606 = -1;
		((NpcType) this).f_qb = true;
		((NpcType) this).aByte3603 = (byte) -96;
		scaleY = 128;
		((NpcType) this).f_jb = 255;
		((NpcType) this).f_ib = -1;
		((NpcType) this).f_ub = -1;
		((NpcType) this).render_emote = -1;
		((NpcType) this).f_vb = false;
		((NpcType) this).anInt3585 = -1;
		lightModifier = 0;
	}
}
