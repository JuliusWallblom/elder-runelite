package io;

/* Class_t - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import io.cache.Revision;

public abstract class AbstractModel {
	static int anInt1428;
	static int anInt1430;
	static boolean aBool1431 = false;
	static int anInt1432;
	static int anInt1433;
	static int anInt1434;
	static int anInt1435;
	static int anInt1436;
	static int anInt1437;
	static int anInt1438;
	static int anInt1439;
	static IncomingPacket SEND_SKILLS_IN;
	static int anInt1442;

	abstract void method671(Class_c class_c, Class130_Sub5 class130_sub5, int i, int i_0_);

	abstract void Z(int i);

	abstract Class19[] method672();
 //thuis is so slow it hurts
	static final Class102 method673(int i, boolean bool, Component component) {
		try {
			anInt1432++;
			int i_1_ = 65 % ((11 - i) / 58);
			return new MouseHandler(component, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.DA(" + i + ',' + bool + ',' + (component != null ? "{...}" : "null") + ')'));
		}
	}

	abstract int MA();

	final void method674(int new_val, int i_2_, boolean bool, int var2, int var4, SequenceLoader loader, SequenceLoader var3, int i_6_, int i_7_, int sequence_id, SequenceType sequence_type) {
		try {
			if (var2 != -1 && animateStart()) {
				Sequence animation = loader.animations[var2];
				TransformList transform_list = animation.transformList;
				Sequence next_anim = null;
				if (var3 != null) {
					next_anim = var3.animations[var4];
					if (next_anim.transformList != transform_list) {
						next_anim = null;
					}
				}
				if (sequence_type.revision == Revision.OSRS || sequence_type.revision == Revision.PRE_EOC_550) {
					this.interpolate_frames(transform_list, animation, next_anim, i_6_, i_2_, (boolean[]) null, false, bool, '\uffff',
							(int[]) null, sequence_id, sequence_type);
				} else {
					this.interpolate_frames(transform_list, animation, next_anim, false, bool, null, null, 65535, new_val, i_6_, i_2_, sequence_id, sequence_type);
				}
				onFinishAnimating();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.KA(" + new_val + ',' + i_2_ + ',' + bool + ',' + var2 + ',' + var4 + ',' + (loader != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	final void method675(int i, int i_9_, int i_10_, int i_11_, int i_12_, Class210 class210, int i_13_, int i_14_, int i_15_) {
		do {
			try {
				anInt1434++;
				boolean bool = false;
				boolean bool_16_ = false;
				boolean bool_17_ = false;
				if (i != 16384)
					Client.anInt1429 = 101;
				int i_18_ = -i_13_ / 2;
				int i_19_ = -i_11_ / 2;
				int i_20_ = class210.a(i_18_ + i_9_, i_19_ + i_10_);
				int i_21_ = i_13_ / 2;
				int i_22_ = -i_11_ / 2;
				int i_23_ = class210.a(i_21_ + i_9_, i_22_ + i_10_);
				int i_24_ = -i_13_ / 2;
				int i_25_ = i_11_ / 2;
				int i_26_ = class210.a(i_24_ + i_9_, i_10_ + i_25_);
				int i_27_ = i_13_ / 2;
				int i_28_ = i_11_ / 2;
				int i_29_ = class210.a(i_9_ - -i_27_, i_28_ + i_10_);
				int i_30_ = ((i_23_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff) ? i_20_ : i_23_);
				int i_31_ = i_26_ >= i_29_ ? i_29_ : i_26_;
				int i_32_ = i_23_ >= i_29_ ? i_29_ : i_23_;
				int i_33_ = i_26_ > i_20_ ? i_20_ : i_26_;
				if (i_11_ != 0) {
					int i_34_ = (0x3fff & (int) (2607.5945876176133 * Math.atan2((double) (i_30_ + -i_31_), (double) i_11_)));
					if (i_34_ != 0) {
						if (i_12_ != 0) {
							if (i_34_ > 8192) {
								int i_35_ = 16384 - i_12_;
								if (i_35_ > i_34_)
									i_34_ = i_35_;
							} else if ((i_34_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff))
								i_34_ = i_12_;
						}
						Z(i_34_);
					}
				}
				int i_36_ = i_20_ + i_29_;
				if ((i_13_ ^ 0xffffffff) != -1) {
					int i_37_ = 0x3fff & (int) (Math.atan2((double) (-i_32_ + i_33_), (double) i_13_) * 2607.5945876176133);
					if (i_37_ != 0) {
						if ((i_14_ ^ 0xffffffff) != -1) {
							if (i_37_ <= 8192) {
								if (i_37_ > i_14_)
									i_37_ = i_14_;
							} else {
								int i_38_ = -i_14_ + 16384;
								if ((i_37_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff))
									i_37_ = i_38_;
							}
						}
						R(i_37_);
					}
				}
				if ((i_36_ ^ 0xffffffff) < (i_23_ + i_26_ ^ 0xffffffff))
					i_36_ = i_23_ + i_26_;
				i_36_ = -i_15_ + (i_36_ >> 1);
				if (i_36_ == 0)
					break;
				JA(0, i_36_, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("t.FA(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + (class210 != null ? "{...}" : "null") + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
			}
			break;
		} while (false);
	}

	abstract int PA();

	abstract void JA(int i, int i_39_, int i_40_);

	abstract void E(int i);

	abstract Class303[] method676();

	abstract void method677();

	abstract void IA();

	abstract AbstractModel method678(byte i, int i_41_, boolean bool);

	private final void method679(int i, int[] is, int i_42_, int i_43_, int i_44_, boolean bool, int i_45_, int[] is_46_, int i_47_, int i_48_, int sequence_id, SequenceType sequence_type) {
		try {
			if (i_45_ != 3)
				UA(-15);
			anInt1438++;
			if ((i_44_ ^ 0xffffffff) != -2) {
				if ((i_44_ ^ 0xffffffff) == -3) {
					if ((i ^ 0xffffffff) == -1 || (i ^ 0xffffffff) == -2) {
						i_42_ = -i_42_;
						i_48_ = -i_48_;
					} else if ((i ^ 0xffffffff) == -3) {
						i_42_ = -i_42_ & 0x3fff;
						i_48_ = 0x3fff & -i_48_;
					}
				} else if ((i_44_ ^ 0xffffffff) == -4) {
					if (i != 0 && i != 1) {
						if (i == 3) {
							int i_49_ = i_48_;
							i_48_ = i_42_;
							i_42_ = i_49_;
						} else if (i == 2) {
							int i_50_ = i_48_;
							i_48_ = 0x3fff & i_42_;
							i_42_ = 0x3fff & -i_50_;
						}
					} else {
						int i_51_ = i_48_;
						i_48_ = -i_42_;
						i_42_ = i_51_;
					}
				}
			} else if ((i ^ 0xffffffff) == -1 || i == 1) {
				int i_52_ = -i_48_;
				i_48_ = i_42_;
				i_42_ = i_52_;
			} else if ((i ^ 0xffffffff) != -4) {
				if (i == 2) {
					int i_53_ = i_48_;
					i_48_ = -i_42_ & 0x3fff;
					i_42_ = i_53_ & 0x3fff;
				}
			} else {
				int i_54_ = i_48_;
				i_48_ = i_42_;
				i_42_ = i_54_;
			}
			if (i_43_ != 65535)
				animate_0(i, is_46_, i_48_, i_47_, i_42_, bool, i_43_, is, sequence_id, sequence_type);
			else
				animate_1(i, is_46_, i_48_, i_47_, i_42_, i_44_, bool, sequence_id, sequence_type);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.W(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + bool + ',' + i_45_ + ',' + (is_46_ != null ? "{...}" : "null") + ',' + i_47_ + ',' + i_48_ + ')'));
		}
	}

	abstract void method680(Class_c class_c, Class130_Sub5 class130_sub5, int i);

	abstract void animate_1(int i, int[] is, int i_55_, int i_56_, int i_57_, int i_58_, boolean bool, int sequence_id, SequenceType sequence_type);

	abstract int l();

	abstract void animate_0(int i, int[] is, int i_59_, int i_60_, int i_61_, boolean bool, int i_62_, int[] is_63_, int sequence_id, SequenceType sequence_type);

	abstract Class246_Sub1_Sub4 fa(Class246_Sub1_Sub4 class246_sub1_sub4);

	abstract int P();

	abstract boolean method681();

	abstract int HA();

	abstract void method682(AbstractModel class_t_64_, int i, int i_65_, int i_66_, boolean bool);

	abstract int NA();

	abstract int m();

	abstract void BA(short i, short i_67_);

	abstract void R(int i);

	final void method683(int i, int animFrameId, SequenceLoader class246_sub1_sub17, int sequence_id, SequenceType sequence_type) {
		do {
			try {
				anInt1436++;
				if (animFrameId != -1 && animateStart()) {
					Sequence animation = (((SequenceLoader) class246_sub1_sub17).animations[animFrameId]);
					TransformList transform_list = animation.transformList;
					for (int i_69_ = 0; ((Sequence) animation).length > i_69_; i_69_++) {
						short i_70_ = ((Sequence) animation).ids[i_69_];
						if (((TransformList) transform_list).aBoolArray4884[i_70_]) {
							if (((Sequence) animation).aShortArray1387[i_69_] != -1)
								N(0, 0, 0, 0);
							N((((TransformList) transform_list).types[i_70_]), ((Sequence) animation).vertexX[i_69_], ((Sequence) animation).vertexY[i_69_], ((Sequence) animation).vertexZ[i_69_]);
						}
					}
					interpolate_frames(null, null, null, false, true, null, null, -73, 12, 91, 73, sequence_id, sequence_type);
					onFinishAnimating();
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("t.V(" + i + ',' + animFrameId + ',' + (class246_sub1_sub17 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	abstract void method684(int i, int i_71_, int i_72_, int i_73_);

	abstract void c(int i);

	abstract void h(int i, int i_74_, Class210 class210, Class210 class210_75_, int i_76_, int i_77_, int i_78_);

	abstract void aa(int i);

	abstract boolean method685(int i, int i_79_, Class_c class_c, boolean bool);

	static final void method686(int i, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_) {
		do {
			try {
				do {
					if (i_85_ < ObjType.anInt2818 || i_85_ > Class110.anInt1573 || (ObjType.anInt2818 ^ 0xffffffff) < (i_83_ ^ 0xffffffff) || Class110.anInt1573 < i_83_ || (ObjType.anInt2818 ^ 0xffffffff) < (i_80_ ^ 0xffffffff) || (Class110.anInt1573 ^ 0xffffffff) > (i_80_ ^ 0xffffffff) || (ObjType.anInt2818 ^ 0xffffffff) < (i ^ 0xffffffff) || (Class110.anInt1573 ^ 0xffffffff) > (i ^ 0xffffffff) || anInt1442 > i_87_ || i_87_ > Class109_Sub4.anInt4570 || (i_81_ ^ 0xffffffff) > (anInt1442 ^ 0xffffffff) || ((Class109_Sub4.anInt4570 ^ 0xffffffff) > (i_81_ ^ 0xffffffff)) || (anInt1442 ^ 0xffffffff) < (i_84_ ^ 0xffffffff) || (i_84_ ^ 0xffffffff) < (Class109_Sub4.anInt4570 ^ 0xffffffff) || (i_82_ ^ 0xffffffff) > (anInt1442 ^ 0xffffffff) || Class109_Sub4.anInt4570 < i_82_) {
						Class59_Sub2.method2019(i, i_86_, i_83_, i_84_, i_85_, i_81_, (byte) 72, i_82_, i_80_, i_87_);
						if (!Client.f_ob)
							break;
					}
					Class_e.method592(i_87_, i_86_, i_82_, i_88_ ^ 0x1d, i_81_, i_84_, i, i_83_, i_85_, i_80_);
				} while (false);
				anInt1433++;
				if (i_88_ == -1)
					break;
				anInt1439 = 67;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("t.LA(" + i + ',' + i_80_ + ',' + i_81_ + ',' + i_82_ + ',' + i_83_ + ',' + i_84_ + ',' + i_85_ + ',' + i_86_ + ',' + i_87_ + ',' + i_88_ + ')'));
			}
			break;
		} while (false);
	}

	abstract void UA(int i);

	abstract void H(int i, int i_89_, int i_90_);

	public AbstractModel() {
		/* empty */
	}

	abstract void Q(int i);
	
	private final void interpolate_frames(TransformList var1, Sequence var2, Sequence var3, int var4, int var5,
			boolean[] var6, boolean var7, boolean var8, int var9, int[] ai, int sequence_id, SequenceType sequence_type) {
		int var11;
		if (var3 != null && var4 != 0) {
			var11 = 0;
			int var34 = 0;

			for (int var35 = 0; var35 < var1.amount; ++var35) {
				boolean var36 = false;
				if (var11 < var2.length && var2.ids[var11] == var35) {
					var36 = true;
				}

				boolean var15 = false;
				if (var34 < var3.length && var3.ids[var34] == var35) {
					var15 = true;
				}

				if (var36 || var15) {
					if (var6 != null && var6[var35] != var7 && var1.types[var35] != 0) {
						if (var36) {
							++var11;
						}

						if (var15) {
							++var34;
						}
					} else {
						short var16 = 0;
						int var17 = var1.types[var35];
						if (var17 == 3) {
							var16 = 128;
						}

						short var19;
						short var18;
						short var21;
						short var20;
						byte var22;
						if (var36) {
							var18 = var2.vertexX[var11];
							var19 = var2.vertexY[var11];
							var20 = var2.vertexZ[var11];
							var21 = var2.aShortArray1387[var11];
							var22 = var2.aByteArray1393[var11];
							++var11;
						} else {
							var18 = var16;
							var19 = var16;
							var20 = var16;
							var21 = -1;
							var22 = 0;
						}

						short var23;
						short var25;
						short var24;
						byte var27;
						short var26;
						if (var15) {
							var23 = var3.vertexX[var34];
							var24 = var3.vertexY[var34];
							var25 = var3.vertexZ[var34];
							var26 = var3.aShortArray1387[var34];
							var27 = var3.aByteArray1393[var34];
							++var34;
						} else {
							var23 = var16;
							var24 = var16;
							var25 = var16;
							var26 = -1;
							var27 = 0;
						}

						int var29;
						int var28;
						int var31;
						int var30;
						if ((var22 & 2) == 0 && (var27 & 1) == 0) {
							if (var17 == 2) {
								var31 = var23 - var18 & 2047;
								int var32 = var24 - var19 & 2047;
								int var33 = var25 - var20 & 2047;
								if (var31 >= 1024) {
									var31 -= 2048;
								}

								if (var32 >= 1024) {
									var32 -= 2048;
								}

								if (var33 >= 1024) {
									var33 -= 2048;
								}

								var28 = var18 + var31 * var4 / var5 & 2047;
								var29 = var19 + var32 * var4 / var5 & 2047;
								var30 = var20 + var33 * var4 / var5 & 2047;
							} else if (var17 == 7) {
								var31 = var23 - var18 & 63;
								if (var31 >= 32) {
									var31 -= 64;
								}

								var28 = var18 + var31 * var4 / var5 & 63;
								var29 = var19 + (var24 - var19) * var4 / var5;
								var30 = var20 + (var25 - var20) * var4 / var5;
							} else {
								var28 = var18 + (var23 - var18) * var4 / var5;
								var29 = var19 + (var24 - var19) * var4 / var5;
								var30 = var20 + (var25 - var20) * var4 / var5;
							}
						} else {
							var28 = var18;
							var29 = var19;
							var30 = var20;
						}

						if (var21 != -1) {
							var31 = var9 & var1.anIntArray2455[var21];
							if (var31 != '\uffff') {
								this.animate_0(0, var1.skins[var21], 0, 0, 0, var8, var31, ai, sequence_id, sequence_type);
							} else {
								this.animate_1(0, var1.skins[var21], 0, 0, 0, 0, var8, sequence_id, sequence_type);
							}
						} else if (var26 != -1) {
							var31 = var9 & var1.anIntArray2455[var26];
							if (var31 != '\uffff') {
								this.animate_0(0, var1.skins[var26], 0, 0, 0, var8, var31, ai, sequence_id, sequence_type);
							} else {
								this.animate_1(0, var1.skins[var26], 0, 0, 0, 0, var8, sequence_id, sequence_type);
							}
						}

						var31 = var9 & var1.anIntArray2455[var35];
						if (var31 != '\uffff') {
							this.animate_0(var17, var1.skins[var35], var28, var29, var30, var8, var31, ai, sequence_id, sequence_type);
						} else {
							this.animate_1(var17, var1.skins[var35], var28, var29, var30, 0, var8, sequence_id, sequence_type);
						}
					}
				}
			}

		} else {
			for (var11 = 0; var11 < var2.length; ++var11) {
				short var12 = var2.ids[var11];// TODO this chicken causes problem
				if (var6 == null || var6[var12] == var7 || var1.types[var12] == 0) {
					short var13 = var2.aShortArray1387[var11];
					int var14;
					if (var13 != -1) {
						var14 = var9 & var1.anIntArray2455[var13];
						if (var14 != '\uffff') {
							this.animate_0(0, var1.skins[var13], 0, 0, 0, var8, var14, ai, sequence_id, sequence_type);
						} else {
							this.animate_1(0, var1.skins[var13], 0, 0, 0, 0, var8, sequence_id, sequence_type);
						}
					}

					var14 = var9 & var1.anIntArray2455[var12];
					try {
						if (var14 != '\uffff') {// this to be exact
							this.animate_0(var1.types[var12], var1.skins[var12], var2.vertexX[var11],
									var2.vertexY[var11], var2.vertexZ[var11], var8, var14, ai, sequence_id, sequence_type);
						} else {
							this.animate_1(var1.types[var12], var1.skins[var12], var2.vertexX[var11],
									var2.vertexY[var11], var2.vertexZ[var11], 0, var8, sequence_id, sequence_type);
						}
					} catch (Exception e) {
						//e.printStackTrace();
					}
				}
			}

		}
	}

	private final void interpolate_frames(TransformList transform_list, Sequence animation, Sequence animation_1, boolean bool_94_, boolean bool, boolean[] bools, int[] ai, int i_96_, int i_91_, int i, int i_95_, int sequence_id, SequenceType sequence_type) {
		try {
			anInt1435++;
			if (animation_1 == null || i == 0) {
				for (int i_97_ = 0; i_97_ < ((Sequence) animation).length; i_97_++) {
					short i_98_ = ((Sequence) animation).ids[i_97_];
					if (bools == null || !bools[i_98_] == !bool_94_ || (((TransformList) transform_list).types[i_98_]) == 0) {
						short i_99_ = ((Sequence) animation).aShortArray1387[i_97_];
						if (i_99_ != -1)
							method679(0, ai, 0, (((TransformList) transform_list).anIntArray2455[i_99_]) & i_96_, i_91_, bool, 3, (((TransformList) transform_list).skins[i_99_]), 0, 0, sequence_id, sequence_type);
						method679((((TransformList) transform_list).types[i_98_]), ai, ((Sequence) animation).vertexZ[i_97_], i_96_ & (((TransformList) transform_list).anIntArray2455[i_98_]), i_91_, bool, -1707 ^ ~0x6a9, (((TransformList) transform_list).skins[i_98_]), ((Sequence) animation).vertexY[i_97_], ((Sequence) animation).vertexX[i_97_], sequence_id, sequence_type);
					}
				}
			} else {
				int i_100_ = 0;
				int i_101_ = 0;
				for (int i_102_ = 0; ((((TransformList) transform_list).amount ^ 0xffffffff) < (i_102_ ^ 0xffffffff)); i_102_++) {
					boolean bool_103_ = false;
					if (((i_100_ ^ 0xffffffff) > (((Sequence) animation).length ^ 0xffffffff)) && (i_102_ == ((Sequence) animation).ids[i_100_]))
						bool_103_ = true;
					boolean bool_104_ = false;
					if (((((Sequence) animation_1).length ^ 0xffffffff) < (i_101_ ^ 0xffffffff)) && (((Sequence) animation_1).ids[i_101_] == i_102_))
						bool_104_ = true;
					if (bool_103_ || bool_104_) {
						if (bools != null && bools[i_102_] != bool_94_ && (((TransformList) transform_list).types[i_102_]) != 0) {
							if (bool_104_)
								i_101_++;
							if (bool_103_)
								i_100_++;
						} else {
							int i_105_ = 0;
							int i_106_ = (((TransformList) transform_list).types[i_102_]);
							if (i_106_ == 3 || (i_106_ ^ 0xffffffff) == -11)
								i_105_ = 128;
							byte i_107_;
							int i_108_;
							int i_109_;
							short i_110_;
							int i_111_;
							if (bool_103_) {
								i_111_ = (((Sequence) animation).vertexY[i_100_]);
								i_107_ = (((Sequence) animation).aByteArray1393[i_100_]);
								i_109_ = (((Sequence) animation).vertexZ[i_100_]);
								i_110_ = (((Sequence) animation).aShortArray1387[i_100_]);
								i_108_ = (((Sequence) animation).vertexX[i_100_]);
								i_100_++;
							} else {
								i_107_ = (byte) 0;
								i_108_ = i_105_;
								i_109_ = i_105_;
								i_110_ = (short) -1;
								i_111_ = i_105_;
							}
							short i_112_;
							int i_113_;
							int i_114_;
							int i_115_;
							byte i_116_;
							if (!bool_104_) {
								i_116_ = (byte) 0;
								i_114_ = i_105_;
								i_112_ = (short) -1;
								i_115_ = i_105_;
								i_113_ = i_105_;
							} else {
								i_112_ = (((Sequence) animation_1).aShortArray1387[i_101_]);
								i_113_ = (((Sequence) animation_1).vertexZ[i_101_]);
								i_114_ = (((Sequence) animation_1).vertexY[i_101_]);
								i_115_ = (((Sequence) animation_1).vertexX[i_101_]);
								i_116_ = (((Sequence) animation_1).aByteArray1393[i_101_]);
								i_101_++;
							}
							if (i_110_ == -1) {
								if (i_112_ != -1)
									method679(0, ai, 0, i_96_ & (((TransformList) transform_list).anIntArray2455[i_112_]), i_91_, bool, 3, (((TransformList) transform_list).skins[i_112_]), 0, 0, sequence_id, sequence_type);
							} else
								method679(0, ai, 0, (((TransformList) transform_list).anIntArray2455[i_110_]) & i_96_, i_91_, bool, -1707 ^ ~0x6a9, (((TransformList) transform_list).skins[i_110_]), 0, 0, sequence_id, sequence_type);
							int i_117_;
							int i_118_;
							int i_119_;
							if ((i_107_ & 0x2 ^ 0xffffffff) == -1 && (i_116_ & 0x1 ^ 0xffffffff) == -1) {
								if ((i_106_ ^ 0xffffffff) == -3) {
									int i_120_ = 0x3fff & i_115_ + -i_108_;
									int i_121_ = 0x3fff & i_114_ + -i_111_;
									if ((i_120_ ^ 0xffffffff) <= -8193)
										i_120_ -= 16384;
									int i_122_ = 0x3fff & -i_109_ + i_113_;
									if (i_121_ >= 8192)
										i_121_ -= 16384;
									i_118_ = i_108_ + i_120_ * i / i_95_ & 0x3fff;
									if ((i_122_ ^ 0xffffffff) <= -8193)
										i_122_ -= 16384;
									i_117_ = 0x3fff & i_111_ + i * i_121_ / i_95_;
									i_119_ = i_109_ + i_122_ * i / i_95_ & 0x3fff;
								} else if ((i_106_ ^ 0xffffffff) == -10) {
									int i_123_ = 0x3fff & i_115_ + -i_108_;
									if ((i_123_ ^ 0xffffffff) <= -8193)
										i_123_ -= 16384;
									i_117_ = i_119_ = 0;
									i_118_ = 0x3fff & i_123_ * i / i_95_ + i_108_;
								} else if ((i_106_ ^ 0xffffffff) == -8) {
									int i_124_ = 0x3f & -i_108_ + i_115_;
									if (i_124_ >= 32)
										i_124_ -= 64;
									i_117_ = i_111_ + (i * (-i_111_ + i_114_) / i_95_);
									i_119_ = (i * (i_113_ - i_109_) / i_95_ + i_109_);
									i_118_ = 0x3f & i_124_ * i / i_95_ + i_108_;
								} else {
									i_119_ = i_109_ + (i * (-i_109_ + i_113_) / i_95_);
									i_117_ = i_111_ - -((-i_111_ + i_114_) * i / i_95_);
									i_118_ = i_108_ - -((-i_108_ + i_115_) * i / i_95_);
								}
							} else {
								i_117_ = i_111_;
								i_118_ = i_108_;
								i_119_ = i_109_;
							}
							method679(i_106_, ai, i_119_, (((TransformList) transform_list).anIntArray2455[i_102_]) & i_96_, i_91_, bool, 3, (((TransformList) transform_list).skins[i_102_]), i_117_, i_118_, sequence_id, sequence_type);
						}
					}
				}
			}
		} catch (Exception e) {
			;
		}
	}

	abstract void I(short i, short i_125_);

	final void method688(int i, SequenceLoader class246_sub1_sub17, int[] is, boolean bool, int i_126_, int i_127_, int i_128_, int i_129_, SequenceLoader class246_sub1_sub17_130_, int i_131_, int i_132_, int sequence_id, SequenceType sequence_type) {
		try {
			anInt1430++;
			if ((i_127_ ^ 0xffffffff) != 0 && animateStart()) {
				Sequence class72 = (((SequenceLoader) class246_sub1_sub17_130_).animations[i_127_]);
				TransformList class246_sub26 = ((Sequence) class72).transformList;
				int i_133_ = 10 % ((83 - i_128_) / 43);
				Sequence class72_134_ = null;
				if (class246_sub1_sub17 != null) {
					class72_134_ = (((SequenceLoader) class246_sub1_sub17).animations[i]);
					if (((Sequence) class72_134_).transformList != class246_sub26)
						class72_134_ = null;
				}
				interpolate_frames(class246_sub26, class72, class72_134_, false, bool, null, is, i_132_, i_126_, i_131_, i_129_, sequence_id, sequence_type);
				onFinishAnimating();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.CA(" + i + ',' + (class246_sub1_sub17 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + i_126_ + ',' + i_127_ + ',' + i_128_ + ',' + i_129_ + ',' + (class246_sub1_sub17_130_ != null ? "{...}" : "null") + ',' + i_131_ + ',' + i_132_ + ')'));
		}
	}

	abstract int WA();

	abstract int D();

	abstract boolean animateStart();

	abstract void onFinishAnimating();

	abstract int U();

	public static void method689(byte i) {
		try {
			MapRegion.xteas = null;
			if (i != 55)
				method689((byte) -2);
			SEND_SKILLS_IN = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "t.OA(" + i + ')');
		}
	}

	abstract void N(int i, int i_135_, int i_136_, int i_137_);

	final void method690(int animFrameId, int animFrameDelay, SequenceLoader idleNextFrameGroup, boolean bool, int idleFrameDelay, int idleDelay, int idleFrameId, SequenceLoader idleFrameGroup, SequenceLoader animLoader, int idleNextFrameId, boolean[] bools, SequenceLoader nextAnimLoader, int animDelay, int nextFrame, int i_148_, int sequence_id, SequenceType sequence_type) {
		try {
			anInt1437++;
			if (animFrameId != -1) {
				if (bools == null || idleFrameId == -1) {
					method674(0, animFrameDelay, bool, animFrameId, nextFrame, animLoader, nextAnimLoader, animDelay, 0, sequence_id, sequence_type);
				} else if (animateStart()) {
					Sequence anim = animLoader.animations[animFrameId];
					TransformList transform_list = ((Sequence) anim).transformList;
					Sequence nextAnim = null;
					if (nextAnimLoader != null) {
						nextAnim = nextAnimLoader.animations[nextFrame];
						if (((Sequence) nextAnim).transformList != transform_list)
							nextAnim = null;
					}
					Sequence idleAnim = idleFrameGroup.animations[idleFrameId];
					Sequence nextIdleAnim = null;
					if (idleNextFrameGroup != null) {
						nextIdleAnim = idleNextFrameGroup.animations[idleNextFrameId];
						if (transform_list != ((Sequence) nextIdleAnim).transformList)
							nextIdleAnim = null;
					}
					if (sequence_type.revision == Revision.OSRS || sequence_type.revision == Revision.PRE_EOC_550) {
						this.interpolate_frames(transform_list, anim, nextAnim, animDelay, animFrameDelay, bools, false,
								bool, '\uffff', (int[]) null, sequence_id, sequence_type);
					} else {
						this.interpolate_frames(transform_list, anim, nextAnim, false, bool, bools, null, 65535, 0,
								animDelay, idleFrameDelay, sequence_id, sequence_type);
					}					
					animate_1(0, new int[0], 0, 0, 0, 0, bool, sequence_id, sequence_type);
					if (sequence_type.revision == Revision.OSRS || sequence_type.revision == Revision.PRE_EOC_550) {
						this.interpolate_frames(transform_list, idleAnim, nextIdleAnim, idleDelay, idleFrameDelay,
								bools, true, bool, '\uffff', (int[]) null, sequence_id, sequence_type);
					} else {
						this.interpolate_frames(((Sequence) idleAnim).transformList, idleAnim, nextIdleAnim, true, bool, bools, null, 65535, 0, idleDelay, idleFrameDelay, sequence_id, sequence_type);
					}
					onFinishAnimating();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.GA(" + animFrameId + ',' + animFrameDelay + ',' + (idleNextFrameGroup != null ? "{...}" : "null") + ',' + bool + ',' + idleFrameDelay + ',' + idleDelay + ',' + idleFrameId + ',' + (idleFrameGroup != null ? "{...}" : "null") + ',' + (animLoader != null ? "{...}" : "null") + ',' + idleNextFrameId + ',' + (bools != null ? "{...}" : "null") + ',' + (nextAnimLoader != null ? "{...}" : "null") + ',' + animDelay + ',' + nextFrame + ',' + i_148_ + ')'));
		}
	}

	static {
		Client.anInt1429 = 0;
		new MultilingualString("You will be un-muted within 24 hours.", "Du wirst innerhalb der n\u00e4chsten 24 Stunden wieder sprechen k\u00f6nnen.", "Vous aurez \u00e0 nouveau acc\u00e8s \u00e0 la messagerie instantan\u00e9e dans 24 heures.", "O veto ser\u00e1 retirado dentro de 24 horas.");
		SEND_SKILLS_IN = new IncomingPacket(9, 6);
		anInt1442 = 0;
	}
}
