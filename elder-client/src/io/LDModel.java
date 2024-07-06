package io;

import io.cache.Revision;

final class LDModel extends AbstractModel {
	private int[] anIntArray5248;
	private LDModel aClass_t_Sub2_5249;
	private short aShort5250;
	private int[] anIntArray5251;
	private int originY;
	private int anInt5253;
	private int anInt5254 = 0;
	private int[] anIntArray5255;
	private Class19[] aClass19Array5256;
	private Class303[] aClass162Array5257;
	private Rasterizer3D aClass184_5258;
	private short aShort5259;
	private int[] texture_edge_a;
	private int originX;
	private int anInt5262;
	private Class112[] aClass112Array5263;
	private int originZ;
	private int[] anIntArray5265;
	static int anInt5266 = 4096;
	private short aShort5267;
	private int[] anIntArray5268;
	private short[] aShortArray5269;
	private int[][] anIntArrayArray5270;
	private short aShort5271;
	private Class36 aClass36_5272;
	private Class130_Sub1_Sub1[] aClass130_Sub1_Sub1Array5273;
	private LDModel aClass_t_Sub2_5274;
	private int[] anIntArray5275;
	private int[] render_type;
	private int[] texture_edge_c;
	private int anInt5278;
	private int[] anIntArray5279;
	private int[] anIntArray5280;
	private LDModel aClass_t_Sub2_5281;
	private LDModel aClass_t_Sub2_5282;
	private LDModel aClass_t_Sub2_5283;
	private int[] anIntArray5284;
	private boolean f_ab;
	private int[] f_bb;
	private int[] texture_edge_b;
	private LDModel f_db;
	private boolean f_eb;
	private int[] vertex_position_x;
	private int[] vertex_position_y;
	private int f_hb;
	private int[][] facesByLabel;
	private boolean f_jb;
	private int f_kb = 0;
	private Class145[] f_lb;
	private byte f_mb;
	private byte[] f_nb;
	private short f_ob;
	private Vertex[] aClass33Array1425;
	private int[] f_qb;
	private static int f_rb;
	private byte[] f_sb;
	private int[][] f_tb;
	private Class260_Sub1 f_ub;
	private short f_vb;
	private boolean[] f_wb;
	private LDModel aClass_t_Sub2_5285;
	private short[] facesColors;
	private short[] faceMaterials;
	private int[] vertex_position_z;
	private int[] anIntArray5288;
	private int[] anIntArray5289;
	private boolean aBool5290;
	private int vertices;
	private int[] anIntArray5292;
	private int[] anIntArray5293;
	private int[] anIntArray5294;
	private int[] anIntArray5295;
	private int[][] anIntArrayArray5296;
	private Class_c_Sub2 aClass_c_Sub2_5297;
	private int[] anIntArray5298;
	private Class36 aClass36_5299;
	private short aShort5300;
	private int[] anIntArray5301;
	private LDModel aClass_t_Sub2_5302;
	private int[] anIntArray5303;
	private int[] anIntArray5304;
	private int[] anIntArray5305;
	private int contrast;
	private int[] alpha;
	private int[] anIntArray5308;
	private Class89[] aClass89Array5309;
	static int anInt5310 = 4096;
	private int[] anIntArray5311;
	private int[][] verticesByLabel;
	private int faces;
	private int[] f_ac;
	private short[] f_bc;
	private Vertex[] f_cc;
	private short[] texture_faces;
	private int[] f_ec;
	private int[] f_fc;
	private boolean aBool5314;
	private int[] hue_c;
	private int[] f_ic;
	private int[] f_jc;
	private LDModel f_kc;
	private int[][] f_lc;
	private int[] f_mc;
	private LDModel f_nc;
	private int[] f_oc;
	private int[] f_pc;
	private boolean[] f_qc;
	private static int[] f_rc;
	private static int f_sc;

	final int NA() {
		if (!aBool5314)
			method2244();
		return aShort5267;
	}

	final int MA() {
		if (!aBool5314)
			method2244();
		return aShort5300;
	}

	final void method2225(Class_c class_c, Class130_Sub5 class130_sub5, Class129 class129, int i) {
		method2240(class_c, class130_sub5, class129, -1, i);
	}

	final int HA() {
		if (!aBool5314)
			method2244();
		return aShort5271;
	}

	final boolean method685(int i, int i_0_, Class_c class_c, boolean bool) {
		aClass_c_Sub2_5297 = (Class_c_Sub2) class_c;
		Class_c_Sub2 class_c_sub2 = ((Class260_Sub1) f_ub).aClass_c_Sub2_3857;
		int i_1_ = (((Class_c_Sub2) class_c_sub2).anInt5589 + (((((Class_c_Sub2) class_c_sub2).anInt5594
				* ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5589)
				+ (((Class_c_Sub2) class_c_sub2).anInt5588 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5584)
				+ (((Class_c_Sub2) class_c_sub2).anInt5592 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5593)) >> 15));
		int i_2_ = (((Class_c_Sub2) class_c_sub2).anInt5584 + (((((Class_c_Sub2) class_c_sub2).anInt5591
				* ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5589)
				+ (((Class_c_Sub2) class_c_sub2).anInt5586 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5584)
				+ (((Class_c_Sub2) class_c_sub2).anInt5587 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5593)) >> 15));
		int i_3_ = (((Class_c_Sub2) class_c_sub2).anInt5593 + (((((Class_c_Sub2) class_c_sub2).anInt5583
				* ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5589)
				+ (((Class_c_Sub2) class_c_sub2).anInt5590 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5584)
				+ (((Class_c_Sub2) class_c_sub2).anInt5585 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5593)) >> 15));
		int i_4_ = (((((Class_c_Sub2) class_c_sub2).anInt5594 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5594)
				+ (((Class_c_Sub2) class_c_sub2).anInt5588 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5591)
				+ (((Class_c_Sub2) class_c_sub2).anInt5592 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5583)) >> 15);
		int i_5_ = (((((Class_c_Sub2) class_c_sub2).anInt5594 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5588)
				+ (((Class_c_Sub2) class_c_sub2).anInt5588 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5586)
				+ (((Class_c_Sub2) class_c_sub2).anInt5592 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5590)) >> 15);
		int i_6_ = (((((Class_c_Sub2) class_c_sub2).anInt5594 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5592)
				+ (((Class_c_Sub2) class_c_sub2).anInt5588 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5587)
				+ (((Class_c_Sub2) class_c_sub2).anInt5592 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5585)) >> 15);
		int i_7_ = (((((Class_c_Sub2) class_c_sub2).anInt5591 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5594)
				+ (((Class_c_Sub2) class_c_sub2).anInt5586 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5591)
				+ (((Class_c_Sub2) class_c_sub2).anInt5587 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5583)) >> 15);
		int i_8_ = (((((Class_c_Sub2) class_c_sub2).anInt5591 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5588)
				+ (((Class_c_Sub2) class_c_sub2).anInt5586 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5586)
				+ (((Class_c_Sub2) class_c_sub2).anInt5587 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5590)) >> 15);
		int i_9_ = (((((Class_c_Sub2) class_c_sub2).anInt5591 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5592)
				+ (((Class_c_Sub2) class_c_sub2).anInt5586 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5587)
				+ (((Class_c_Sub2) class_c_sub2).anInt5587 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5585)) >> 15);
		int i_10_ = (((((Class_c_Sub2) class_c_sub2).anInt5583 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5594)
				+ (((Class_c_Sub2) class_c_sub2).anInt5590 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5591)
				+ (((Class_c_Sub2) class_c_sub2).anInt5585 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5583)) >> 15);
		int i_11_ = (((((Class_c_Sub2) class_c_sub2).anInt5583 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5588)
				+ (((Class_c_Sub2) class_c_sub2).anInt5590 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5586)
				+ (((Class_c_Sub2) class_c_sub2).anInt5585 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5590)) >> 15);
		int i_12_ = (((((Class_c_Sub2) class_c_sub2).anInt5583 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5592)
				+ (((Class_c_Sub2) class_c_sub2).anInt5590 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5587)
				+ (((Class_c_Sub2) class_c_sub2).anInt5585 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5585)) >> 15);
		boolean bool_13_ = false;
		int i_14_ = ((Class260_Sub1) f_ub).f_cb;
		int i_15_ = ((Class260_Sub1) f_ub).anInt3858;
		int i_16_ = ((Class260_Sub1) f_ub).anInt3851;
		int i_17_ = ((Class260_Sub1) f_ub).anInt3852;
		int i_18_ = 2147483647;
		int i_19_ = -2147483648;
		int i_20_ = 2147483647;
		int i_21_ = -2147483648;
		method2238(Thread.currentThread());
		if (!aBool5314)
			method2244();
		f_fc[0] = aShort5271;
		anIntArray5292[0] = aShort5300;
		anIntArray5295[0] = f_ob;
		f_fc[1] = aShort5267;
		anIntArray5292[1] = aShort5300;
		anIntArray5295[1] = f_ob;
		f_fc[2] = aShort5271;
		anIntArray5292[2] = f_vb;
		anIntArray5295[2] = f_ob;
		f_fc[3] = aShort5267;
		anIntArray5292[3] = f_vb;
		anIntArray5295[3] = f_ob;
		f_fc[4] = aShort5271;
		anIntArray5292[4] = aShort5300;
		anIntArray5295[4] = aShort5250;
		f_fc[5] = aShort5267;
		anIntArray5292[5] = aShort5300;
		anIntArray5295[5] = aShort5250;
		f_fc[6] = aShort5271;
		anIntArray5292[6] = f_vb;
		anIntArray5295[6] = aShort5250;
		f_fc[7] = aShort5267;
		anIntArray5292[7] = f_vb;
		anIntArray5295[7] = aShort5250;
		for (int i_22_ = 0; i_22_ < 8; i_22_++) {
			int i_23_ = f_fc[i_22_];
			int i_24_ = anIntArray5292[i_22_];
			int i_25_ = anIntArray5295[i_22_];
			int i_26_ = i_1_ + (i_4_ * i_23_ + i_5_ * i_24_ + i_6_ * i_25_ >> 15);
			int i_27_ = i_2_ + (i_7_ * i_23_ + i_8_ * i_24_ + i_9_ * i_25_ >> 15);
			int i_28_ = i_3_ + (i_10_ * i_23_ + i_11_ * i_24_ + i_12_ * i_25_ >> 15);
			if (i_28_ >= ((Class260_Sub1) f_ub).anInt3839) {
				int i_29_ = i_14_ + i_26_ * i_16_ / i_28_;
				int i_30_ = i_15_ + i_27_ * i_17_ / i_28_;
				if (i_29_ < i_18_)
					i_18_ = i_29_;
				if (i_29_ > i_19_)
					i_19_ = i_29_;
				if (i_30_ < i_20_)
					i_20_ = i_30_;
				if (i_30_ > i_21_)
					i_21_ = i_30_;
				bool_13_ = true;
			}
		}
		if (bool_13_ && i > i_18_ && i < i_19_ && i_0_ > i_20_ && i_0_ < i_21_) {
			if (bool)
				return true;
			for (int i_31_ = 0; i_31_ < anInt5254; i_31_++) {
				int i_32_ = vertex_position_x[i_31_];
				int i_33_ = vertex_position_y[i_31_];
				int i_34_ = vertex_position_z[i_31_];
				int i_35_ = i_1_ + (i_4_ * i_32_ + i_5_ * i_33_ + i_6_ * i_34_ >> 15);
				int i_36_ = i_2_ + (i_7_ * i_32_ + i_8_ * i_33_ + i_9_ * i_34_ >> 15);
				int i_37_ = i_3_ + (i_10_ * i_32_ + i_11_ * i_33_ + i_12_ * i_34_ >> 15);
				if (i_37_ >= ((Class260_Sub1) f_ub).anInt3839) {
					f_ic[i_31_] = i_14_ + i_35_ * i_16_ / i_37_;
					anIntArray5279[i_31_] = i_15_ + i_36_ * i_17_ / i_37_;
				} else
					f_ic[i_31_] = -999999;
			}
			for (int i_38_ = 0; i_38_ < faces; i_38_++) {
				if (f_ic[texture_edge_a[i_38_]] != -999999 && f_ic[texture_edge_b[i_38_]] != -999999
						&& f_ic[texture_edge_c[i_38_]] != -999999
						&& method2246(i, i_0_, anIntArray5279[texture_edge_a[i_38_]],
								anIntArray5279[texture_edge_b[i_38_]], anIntArray5279[texture_edge_c[i_38_]],
								f_ic[texture_edge_a[i_38_]], f_ic[texture_edge_b[i_38_]], f_ic[texture_edge_c[i_38_]]))
					return true;
			}
		}
		return false;
	}

	final void animate_0(int opcode, int[] data, int var3, int var4, int var5, boolean flag, int var7, int[] var8,
			int sequence_id, SequenceType sequence_type) {
		int i_44_ = data.length;
		if (opcode == 0) {
			var3 <<= 4;
			var4 <<= 4;
			var5 <<= 4;
			if (!f_eb) {
				for (int i_45_ = 0; i_45_ < anInt5254; i_45_++) {
					vertex_position_x[i_45_] <<= 4;
					vertex_position_y[i_45_] <<= 4;
					vertex_position_z[i_45_] <<= 4;
				}
				f_eb = true;
			}
			int i_46_ = 0;
			originX = 0;
			originY = 0;
			originZ = 0;
			for (int i_47_ = 0; i_47_ < i_44_; i_47_++) {
				int i_48_ = data[i_47_];
				if (i_48_ < verticesByLabel.length) {
					int[] is_49_ = verticesByLabel[i_48_];
					for (int i_50_ = 0; i_50_ < is_49_.length; i_50_++) {
						int i_51_ = is_49_[i_50_];
						if (f_bc == null || (var7 & f_bc[i_51_]) != 0) {
							originX += vertex_position_x[i_51_];
							originY += vertex_position_y[i_51_];
							originZ += vertex_position_z[i_51_];
							i_46_++;
						}
					}
				}
			}
			if (i_46_ > 0) {
				originX = originX / i_46_ + var3;
				originY = originY / i_46_ + var4;
				originZ = originZ / i_46_ + var5;
				f_jb = true;
			} else {
				originX = var3;
				originY = var4;
				originZ = var5;
			}
		} else if (opcode == 1) {
			if (var8 != null) {
				int i_52_ = ((var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192) >> 14);
				int i_53_ = ((var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192) >> 14);
				int i_54_ = ((var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192) >> 14);
				var3 = i_52_;
				var4 = i_53_;
				var5 = i_54_;
			}
			var3 <<= 4;
			var4 <<= 4;
			var5 <<= 4;
			if (!f_eb) {
				for (int i_55_ = 0; i_55_ < anInt5254; i_55_++) {
					vertex_position_x[i_55_] <<= 4;
					vertex_position_y[i_55_] <<= 4;
					vertex_position_z[i_55_] <<= 4;
				}
				f_eb = true;
			}
			for (int i_56_ = 0; i_56_ < i_44_; i_56_++) {
				int i_57_ = data[i_56_];
				if (i_57_ < verticesByLabel.length) {
					int[] is_58_ = verticesByLabel[i_57_];
					for (int i_59_ = 0; i_59_ < is_58_.length; i_59_++) {
						int i_60_ = is_58_[i_59_];
						if (f_bc == null || (var7 & f_bc[i_60_]) != 0) {
							vertex_position_x[i_60_] += var3;
							vertex_position_y[i_60_] += var4;
							vertex_position_z[i_60_] += var5;
						}
					}
				}
			}
		} else if (opcode == 2) {
			if (var8 != null) {
				if (!f_eb) {
					for (int i_61_ = 0; i_61_ < anInt5254; i_61_++) {
						vertex_position_x[i_61_] <<= 4;
						vertex_position_y[i_61_] <<= 4;
						vertex_position_z[i_61_] <<= 4;
					}
					f_eb = true;
				}
				int i_62_ = var8[9] << 4;
				int i_63_ = var8[10] << 4;
				int i_64_ = var8[11] << 4;
				int i_65_ = var8[12] << 4;
				int i_66_ = var8[13] << 4;
				int i_67_ = var8[14] << 4;
				if (f_jb) {
					int i_68_ = ((var8[0] * originX + var8[3] * originY + var8[6] * originZ + 8192) >> 14);
					int i_69_ = ((var8[1] * originX + var8[4] * originY + var8[7] * originZ + 8192) >> 14);
					int i_70_ = ((var8[2] * originX + var8[5] * originY + var8[8] * originZ + 8192) >> 14);
					i_68_ += i_65_;
					i_69_ += i_66_;
					i_70_ += i_67_;
					originX = i_68_;
					originY = i_69_;
					originZ = i_70_;
					f_jb = false;
				}
				int[] is_71_ = new int[9];
				int i_72_ = MathUtils.COSINE[var3];
				int i_73_ = MathUtils.SINE[var3];
				int i_74_ = MathUtils.COSINE[var4];
				int i_75_ = MathUtils.SINE[var4];
				int i_76_ = MathUtils.COSINE[var5];
				int i_77_ = MathUtils.SINE[var5];
				int i_78_ = i_73_ * i_76_ + 8192 >> 14;
				int i_79_ = i_73_ * i_77_ + 8192 >> 14;
				is_71_[0] = i_74_ * i_76_ + i_75_ * i_79_ + 8192 >> 14;
				is_71_[1] = -i_74_ * i_77_ + i_75_ * i_78_ + 8192 >> 14;
				is_71_[2] = i_75_ * i_72_ + 8192 >> 14;
				is_71_[3] = i_72_ * i_77_ + 8192 >> 14;
				is_71_[4] = i_72_ * i_76_ + 8192 >> 14;
				is_71_[5] = -i_73_;
				is_71_[6] = -i_75_ * i_76_ + i_74_ * i_79_ + 8192 >> 14;
				is_71_[7] = i_75_ * i_77_ + i_74_ * i_78_ + 8192 >> 14;
				is_71_[8] = i_74_ * i_72_ + 8192 >> 14;
				int i_80_ = ((is_71_[0] * -originX + is_71_[1] * -originY + is_71_[2] * -originZ + 8192) >> 14);
				int i_81_ = ((is_71_[3] * -originX + is_71_[4] * -originY + is_71_[5] * -originZ + 8192) >> 14);
				int i_82_ = ((is_71_[6] * -originX + is_71_[7] * -originY + is_71_[8] * -originZ + 8192) >> 14);
				int i_83_ = i_80_ + originX;
				int i_84_ = i_81_ + originY;
				int i_85_ = i_82_ + originZ;
				int[] is_86_ = new int[9];
				for (int i_87_ = 0; i_87_ < 3; i_87_++) {
					for (int i_88_ = 0; i_88_ < 3; i_88_++) {
						int i_89_ = 0;
						for (int i_90_ = 0; i_90_ < 3; i_90_++)
							i_89_ += (is_71_[i_87_ * 3 + i_90_] * var8[i_88_ * 3 + i_90_]);
						is_86_[i_87_ * 3 + i_88_] = i_89_ + 8192 >> 14;
					}
				}
				int i_91_ = ((is_71_[0] * i_65_ + is_71_[1] * i_66_ + is_71_[2] * i_67_ + 8192) >> 14);
				int i_92_ = ((is_71_[3] * i_65_ + is_71_[4] * i_66_ + is_71_[5] * i_67_ + 8192) >> 14);
				int i_93_ = ((is_71_[6] * i_65_ + is_71_[7] * i_66_ + is_71_[8] * i_67_ + 8192) >> 14);
				i_91_ += i_83_;
				i_92_ += i_84_;
				i_93_ += i_85_;
				int[] is_94_ = new int[9];
				for (int i_95_ = 0; i_95_ < 3; i_95_++) {
					for (int i_96_ = 0; i_96_ < 3; i_96_++) {
						int i_97_ = 0;
						for (int i_98_ = 0; i_98_ < 3; i_98_++)
							i_97_ += (var8[i_95_ * 3 + i_98_] * is_86_[i_96_ + i_98_ * 3]);
						is_94_[i_95_ * 3 + i_96_] = i_97_ + 8192 >> 14;
					}
				}
				int i_99_ = ((var8[0] * i_91_ + var8[1] * i_92_ + var8[2] * i_93_ + 8192) >> 14);
				int i_100_ = ((var8[3] * i_91_ + var8[4] * i_92_ + var8[5] * i_93_ + 8192) >> 14);
				int i_101_ = ((var8[6] * i_91_ + var8[7] * i_92_ + var8[8] * i_93_ + 8192) >> 14);
				i_99_ += i_62_;
				i_100_ += i_63_;
				i_101_ += i_64_;
				for (int i_102_ = 0; i_102_ < i_44_; i_102_++) {
					int i_103_ = data[i_102_];
					if (i_103_ < verticesByLabel.length) {
						int[] is_104_ = verticesByLabel[i_103_];
						for (int i_105_ = 0; i_105_ < is_104_.length; i_105_++) {
							int i_106_ = is_104_[i_105_];
							if (f_bc == null || (var7 & f_bc[i_106_]) != 0) {
								int i_107_ = ((is_94_[0] * vertex_position_x[i_106_]
										+ is_94_[1] * vertex_position_y[i_106_] + is_94_[2] * vertex_position_z[i_106_]
										+ 8192) >> 14);
								int i_108_ = ((is_94_[3] * vertex_position_x[i_106_]
										+ is_94_[4] * vertex_position_y[i_106_] + is_94_[5] * vertex_position_z[i_106_]
										+ 8192) >> 14);
								int i_109_ = ((is_94_[6] * vertex_position_x[i_106_]
										+ is_94_[7] * vertex_position_y[i_106_] + is_94_[8] * vertex_position_z[i_106_]
										+ 8192) >> 14);
								i_107_ += i_99_;
								i_108_ += i_100_;
								i_109_ += i_101_;
								vertex_position_x[i_106_] = i_107_;
								vertex_position_y[i_106_] = i_108_;
								vertex_position_z[i_106_] = i_109_;
							}
						}
					}
				}
			} else {
				for (int i_110_ = 0; i_110_ < i_44_; i_110_++) {
					int i_111_ = data[i_110_];
					if (i_111_ < verticesByLabel.length) {
						int[] is_112_ = verticesByLabel[i_111_];
						for (int i_113_ = 0; i_113_ < is_112_.length; i_113_++) {
							int i_114_ = is_112_[i_113_];
							if (f_bc == null || (var7 & f_bc[i_114_]) != 0) {
								vertex_position_x[i_114_] -= originX;
								vertex_position_y[i_114_] -= originY;
								vertex_position_z[i_114_] -= originZ;
								int sin, cos, tan;
								if (sequence_type.revision == Revision.OSRS
										|| sequence_type.revision == Revision.PRE_EOC_550) {
									sin = (var3 & 0xffff) << 3;
									cos = (var4 & 0xffff) << 3;
									tan = (var5 & 0xffff) << 3;
								} else {
									sin = var3;
									cos = var4;
									tan = var5;
								}
								if (tan != 0) {
									int i_115_ = MathUtils.SINE[tan];
									int i_116_ = MathUtils.COSINE[tan];
									int i_117_ = ((vertex_position_y[i_114_] * i_115_
											+ vertex_position_x[i_114_] * i_116_ + 16383) >> 14);
									vertex_position_y[i_114_] = (vertex_position_y[i_114_] * i_116_
											- vertex_position_x[i_114_] * i_115_ + 16383) >> 14;
									vertex_position_x[i_114_] = i_117_;
								}
								if (sin != 0) {
									int i_118_ = MathUtils.SINE[sin];
									int i_119_ = MathUtils.COSINE[sin];
									int i_120_ = ((vertex_position_y[i_114_] * i_119_
											- vertex_position_z[i_114_] * i_118_ + 16383) >> 14);
									vertex_position_z[i_114_] = (vertex_position_y[i_114_] * i_118_
											+ vertex_position_z[i_114_] * i_119_ + 16383) >> 14;
									vertex_position_y[i_114_] = i_120_;
								}
								if (cos != 0) {
									int i_121_ = MathUtils.SINE[cos];
									int i_122_ = MathUtils.COSINE[cos];
									int i_123_ = ((vertex_position_z[i_114_] * i_121_
											+ vertex_position_x[i_114_] * i_122_ + 16383) >> 14);
									vertex_position_z[i_114_] = ((vertex_position_z[i_114_] * i_122_
											- vertex_position_x[i_114_] * i_121_ + 16383) >> 14);
									vertex_position_x[i_114_] = i_123_;
								}
								vertex_position_x[i_114_] += originX;
								vertex_position_y[i_114_] += originY;
								vertex_position_z[i_114_] += originZ;
							}
						}
					}
				}
			}
		} else if (opcode == 3) {
			if (var8 != null) {
				if (!f_eb) {
					for (int i_124_ = 0; i_124_ < anInt5254; i_124_++) {
						vertex_position_x[i_124_] <<= 4;
						vertex_position_y[i_124_] <<= 4;
						vertex_position_z[i_124_] <<= 4;
					}
					f_eb = true;
				}
				int i_125_ = var8[9] << 4;
				int i_126_ = var8[10] << 4;
				int i_127_ = var8[11] << 4;
				int i_128_ = var8[12] << 4;
				int i_129_ = var8[13] << 4;
				int i_130_ = var8[14] << 4;
				if (f_jb) {
					int i_131_ = (var8[0] * originX + var8[3] * originY + var8[6] * originZ + 16384) >> 15;
					int i_132_ = (var8[1] * originX + var8[4] * originY + var8[7] * originZ + 16384) >> 15;
					int i_133_ = (var8[2] * originX + var8[5] * originY + var8[8] * originZ + 16384) >> 15;
					i_131_ += i_128_;
					i_132_ += i_129_;
					i_133_ += i_130_;
					originX = i_131_;
					originY = i_132_;
					originZ = i_133_;
					f_jb = false;
				}
				int i_134_ = var3 << 15 >> 7;
				int i_135_ = var4 << 15 >> 7;
				int i_136_ = var5 << 15 >> 7;
				int i_137_ = i_134_ * -originX + 16384 >> 15;
				int i_138_ = i_135_ * -originY + 16384 >> 15;
				int i_139_ = i_136_ * -originZ + 16384 >> 15;
				int i_140_ = i_137_ + originX;
				int i_141_ = i_138_ + originY;
				int i_142_ = i_139_ + originZ;
				int[] is_143_ = new int[9];
				is_143_[0] = i_134_ * var8[0] + 16384 >> 15;
				is_143_[1] = i_134_ * var8[3] + 16384 >> 15;
				is_143_[2] = i_134_ * var8[6] + 16384 >> 15;
				is_143_[3] = i_135_ * var8[1] + 16384 >> 15;
				is_143_[4] = i_135_ * var8[4] + 16384 >> 15;
				is_143_[5] = i_135_ * var8[7] + 16384 >> 15;
				is_143_[6] = i_136_ * var8[2] + 16384 >> 15;
				is_143_[7] = i_136_ * var8[5] + 16384 >> 15;
				is_143_[8] = i_136_ * var8[8] + 16384 >> 15;
				int i_144_ = i_134_ * i_128_ + 16384 >> 15;
				int i_145_ = i_135_ * i_129_ + 16384 >> 15;
				int i_146_ = i_136_ * i_130_ + 16384 >> 15;
				i_144_ += i_140_;
				i_145_ += i_141_;
				i_146_ += i_142_;
				int[] is_147_ = new int[9];
				for (int i_148_ = 0; i_148_ < 3; i_148_++) {
					for (int i_149_ = 0; i_149_ < 3; i_149_++) {
						int i_150_ = 0;
						for (int i_151_ = 0; i_151_ < 3; i_151_++)
							i_150_ += (var8[i_148_ * 3 + i_151_] * is_143_[i_149_ + i_151_ * 3]);
						is_147_[i_148_ * 3 + i_149_] = i_150_ + 16384 >> 15;
					}
				}
				int i_152_ = ((var8[0] * i_144_ + var8[1] * i_145_ + var8[2] * i_146_ + 16384) >> 15);
				int i_153_ = ((var8[3] * i_144_ + var8[4] * i_145_ + var8[5] * i_146_ + 16384) >> 15);
				int i_154_ = ((var8[6] * i_144_ + var8[7] * i_145_ + var8[8] * i_146_ + 16384) >> 15);
				i_152_ += i_125_;
				i_153_ += i_126_;
				i_154_ += i_127_;
				for (int i_155_ = 0; i_155_ < i_44_; i_155_++) {
					int i_156_ = data[i_155_];
					if (i_156_ < verticesByLabel.length) {
						int[] is_157_ = verticesByLabel[i_156_];
						for (int i_158_ = 0; i_158_ < is_157_.length; i_158_++) {
							int i_159_ = is_157_[i_158_];
							if (f_bc == null || (var7 & f_bc[i_159_]) != 0) {
								int i_160_ = ((is_147_[0] * vertex_position_x[i_159_]
										+ is_147_[1] * vertex_position_y[i_159_]
										+ is_147_[2] * vertex_position_z[i_159_] + 16384) >> 15);
								int i_161_ = ((is_147_[3] * vertex_position_x[i_159_]
										+ is_147_[4] * vertex_position_y[i_159_]
										+ is_147_[5] * vertex_position_z[i_159_] + 16384) >> 15);
								int i_162_ = ((is_147_[6] * vertex_position_x[i_159_]
										+ is_147_[7] * vertex_position_y[i_159_]
										+ is_147_[8] * vertex_position_z[i_159_] + 16384) >> 15);
								i_160_ += i_152_;
								i_161_ += i_153_;
								i_162_ += i_154_;
								vertex_position_x[i_159_] = i_160_;
								vertex_position_y[i_159_] = i_161_;
								vertex_position_z[i_159_] = i_162_;
							}
						}
					}
				}
			} else {
				for (int i_163_ = 0; i_163_ < i_44_; i_163_++) {
					int i_164_ = data[i_163_];
					if (i_164_ < verticesByLabel.length) {
						int[] is_165_ = verticesByLabel[i_164_];
						for (int i_166_ = 0; i_166_ < is_165_.length; i_166_++) {
							int i_167_ = is_165_[i_166_];
							if (f_bc == null || (var7 & f_bc[i_167_]) != 0) {
								vertex_position_x[i_167_] -= originX;
								vertex_position_y[i_167_] -= originY;
								vertex_position_z[i_167_] -= originZ;
								vertex_position_x[i_167_] = vertex_position_x[i_167_] * var3 / 128;
								vertex_position_y[i_167_] = vertex_position_y[i_167_] * var4 / 128;
								vertex_position_z[i_167_] = vertex_position_z[i_167_] * var5 / 128;
								vertex_position_x[i_167_] += originX;
								vertex_position_y[i_167_] += originY;
								vertex_position_z[i_167_] += originZ;
							}
						}
					}
				}
			}
		} else if (opcode == 5) {
			if (facesByLabel != null && alpha != null) {
				for (int i_168_ = 0; i_168_ < i_44_; i_168_++) {
					int i_169_ = data[i_168_];
					if (i_169_ < facesByLabel.length) {
						int[] is_170_ = facesByLabel[i_169_];
						for (int i_171_ = 0; i_171_ < is_170_.length; i_171_++) {
							int i_172_ = is_170_[i_171_];
							if (aShortArray5269 == null || (var7 & aShortArray5269[i_172_]) != 0) {
								int i_173_ = ((alpha[i_172_] & 0xff) + var3 * 8);
								if (i_173_ < 0)
									i_173_ = 0;
								else if (i_173_ > 255)
									i_173_ = 255;
								alpha[i_172_] = (byte) i_173_;
							}
						}
					}
				}
				if (aClass112Array5263 != null) {
					for (int i_174_ = 0; i_174_ < anInt5262; i_174_++) {
						Class112 class112 = aClass112Array5263[i_174_];
						Class145 class145 = f_lb[i_174_];
						((Class145) class145).anInt2106 = (((Class145) class145).anInt2106 & 0xffffff
								| 255 - ((alpha[((Class112) class112).anInt1586]) & 0xff) << 24);
					}
				}
			}
		} else if (opcode == 7) {
			if (facesByLabel != null) {
				for (int i_175_ = 0; i_175_ < i_44_; i_175_++) {
					int i_176_ = data[i_175_];
					if (i_176_ < facesByLabel.length) {
						int[] is_177_ = facesByLabel[i_176_];
						for (int i_178_ = 0; i_178_ < is_177_.length; i_178_++) {
							int i_179_ = is_177_[i_178_];
							if (aShortArray5269 == null || (var7 & aShortArray5269[i_179_]) != 0) {
								int i_180_ = facesColors[i_179_] & 0xffff;
								int i_181_ = i_180_ >> 10 & 0x3f;
								int i_182_ = i_180_ >> 7 & 0x7;
								int i_183_ = i_180_ & 0x7f;
								i_181_ = i_181_ + var3 & 0x3f;
								i_182_ += var4;
								if (i_182_ < 0)
									i_182_ = 0;
								else if (i_182_ > 7)
									i_182_ = 7;
								i_183_ += var5;
								if (i_183_ < 0)
									i_183_ = 0;
								else if (i_183_ > 127)
									i_183_ = 127;
								facesColors[i_179_] = (short) (i_181_ << 10 | i_182_ << 7 | i_183_);
							}
						}
						f_ab = true;
					}
				}
				if (aClass112Array5263 != null) {
					for (int i_184_ = 0; i_184_ < anInt5262; i_184_++) {
						Class112 class112 = aClass112Array5263[i_184_];
						Class145 class145 = f_lb[i_184_];
						((Class145) class145).anInt2106 = (((Class145) class145).anInt2106 & ~0xffffff
								| (Entity.f_eb[Class_e.method594(124,
										((facesColors[(((Class112) class112).anInt1586)]) & 0xffff))]) & 0xffffff);
					}
				}
			}
		} else if (opcode == 8) {
			if (anIntArrayArray5296 != null) {
				for (int i_185_ = 0; i_185_ < i_44_; i_185_++) {
					int i_186_ = data[i_185_];
					if (i_186_ < anIntArrayArray5296.length) {
						int[] is_187_ = anIntArrayArray5296[i_186_];
						for (int i_188_ = 0; i_188_ < is_187_.length; i_188_++) {
							Class145 class145 = f_lb[is_187_[i_188_]];
							((Class145) class145).anInt2109 += var3;
							((Class145) class145).anInt2101 += var4;
						}
					}
				}
			}
		} else if (opcode == 10) {
			if (anIntArrayArray5296 != null) {
				for (int i_189_ = 0; i_189_ < i_44_; i_189_++) {
					int i_190_ = data[i_189_];
					if (i_190_ < anIntArrayArray5296.length) {
						int[] is_191_ = anIntArrayArray5296[i_190_];
						for (int i_192_ = 0; i_192_ < is_191_.length; i_192_++) {
							Class145 class145 = f_lb[is_191_[i_192_]];
							((Class145) class145).anInt2098 = ((Class145) class145).anInt2098 * var3 >> 7;
							((Class145) class145).anInt2102 = ((Class145) class145).anInt2102 * var4 >> 7;
						}
					}
				}
			}
		} else if (opcode == 9) {
			if (anIntArrayArray5296 != null) {
				for (int i_193_ = 0; i_193_ < i_44_; i_193_++) {
					int i_194_ = data[i_193_];
					if (i_194_ < anIntArrayArray5296.length) {
						int[] is_195_ = anIntArrayArray5296[i_194_];
						for (int i_196_ = 0; i_196_ < is_195_.length; i_196_++) {
							Class145 class145 = f_lb[is_195_[i_196_]];
							((Class145) class145).anInt2113 = (((Class145) class145).anInt2113 + var3 & 0x3fff);
						}
					}
				}
			}
		}
	}

	private final void method2226() {
		if (anInt5278 == 0)
			method2243(false);
		else {
			for (int i = 0; i < faces; i++) {
				short i_197_ = texture_faces != null ? texture_faces[i] : (short) -1;
				if (i_197_ == -1) {
					int i_198_ = facesColors[i] & 0xffff;
					int i_199_ = (i_198_ & 0x7f) * f_hb >> 7;
					short i_200_ = Class_e.method594(126, i_198_ & ~0x7f | i_199_);
					if (hue_c[i] == -1) {
						int i_201_ = f_bb[i] & ~0x1ffff;
						f_bb[i] = i_201_ | Class109_Sub3.method1825(i_200_, i_201_ >> 17);
					} else if (hue_c[i] != -2) {
						int i_202_ = f_bb[i] & ~0x1ffff;
						f_bb[i] = i_202_ | Class109_Sub3.method1825(i_200_, i_202_ >> 17);
						i_202_ = anIntArray5280[i] & ~0x1ffff;
						anIntArray5280[i] = i_202_ | Class109_Sub3.method1825(i_200_, i_202_ >> 17);
						i_202_ = hue_c[i] & ~0x1ffff;
						hue_c[i] = i_202_ | Class109_Sub3.method1825(i_200_, i_202_ >> 17);
					}
				}
			}
			anInt5278 = 2;
		}
	}

	private final void method2227() {
		for (int i = 0; i < vertices; i++) {
			int i_203_ = vertex_position_x[i];
			vertex_position_x[i] = vertex_position_z[i];
			vertex_position_z[i] = -i_203_;
			if (aClass33Array1425[i] != null) {
				i_203_ = ((Vertex) aClass33Array1425[i]).normalized_normal_x;
				((Vertex) aClass33Array1425[i]).normalized_normal_x = ((Vertex) aClass33Array1425[i]).normalized_normal_z;
				((Vertex) aClass33Array1425[i]).normalized_normal_z = -i_203_;
			}
		}
		if (aClass89Array5309 != null) {
			for (int i = 0; i < faces; i++) {
				if (aClass89Array5309[i] != null) {
					int i_204_ = ((Class89) aClass89Array5309[i]).anInt1159;
					((Class89) aClass89Array5309[i]).anInt1159 = ((Class89) aClass89Array5309[i]).anInt1157;
					((Class89) aClass89Array5309[i]).anInt1157 = -i_204_;
				}
			}
		}
		for (int i = vertices; i < anInt5254; i++) {
			int i_205_ = vertex_position_x[i];
			vertex_position_x[i] = vertex_position_z[i];
			vertex_position_z[i] = -i_205_;
		}
		anInt5278 = 0;
		aBool5314 = false;
	}

	private final void method2228() {
		aClass33Array1425 = null;
		f_cc = null;
		aClass89Array5309 = null;
		aBool5314 = false;
	}

	final void method677() {
		/* empty */
	}

	private final void method2229() {
		for (int i = 0; i < anInt5254; i++) {
			int i_206_ = vertex_position_z[i];
			vertex_position_z[i] = vertex_position_x[i];
			vertex_position_x[i] = -i_206_;
		}
		method2228();
	}

	private final void method2230(int i) {
		int i_207_ = 0;
		int i_208_ = ((Class260_Sub1) f_ub).anInt3839;
		int i_209_ = texture_edge_a[i];
		int i_210_ = texture_edge_b[i];
		int i_211_ = texture_edge_c[i];
		int i_212_ = anIntArray5303[i_209_];
		int i_213_ = anIntArray5303[i_210_];
		int i_214_ = anIntArray5303[i_211_];
		if (alpha == null)
			((Rasterizer3D) aClass184_5258).alpha = 0;
		else
			((Rasterizer3D) aClass184_5258).alpha = alpha[i] & 0xff;
		if (i_212_ >= i_208_) {
			anIntArray5289[i_207_] = f_ic[i_209_];
			f_mc[i_207_] = anIntArray5279[i_209_];
			anIntArray5255[i_207_++] = f_bb[i] & 0xffff;
		} else {
			int i_215_ = anIntArray5288[i_209_];
			int i_216_ = anIntArray5304[i_209_];
			int i_217_ = f_bb[i] & 0xffff;
			if (i_214_ >= i_208_) {
				int i_218_ = (i_208_ - i_212_) * f_rc[i_214_ - i_212_];
				anIntArray5289[i_207_] = (((Class36) aClass36_5272).anInt517
						+ ((i_215_ + ((anIntArray5288[i_211_] - i_215_) * i_218_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3851 / i_208_));
				f_mc[i_207_] = (((Class36) aClass36_5272).anInt522
						+ ((i_216_ + ((anIntArray5304[i_211_] - i_216_) * i_218_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3852 / i_208_));
				anIntArray5255[i_207_++] = i_217_ + (((hue_c[i] & 0xffff) - i_217_) * i_218_ >> 16);
			}
			if (i_213_ >= i_208_) {
				int i_219_ = (i_208_ - i_212_) * f_rc[i_213_ - i_212_];
				anIntArray5289[i_207_] = (((Class36) aClass36_5272).anInt517
						+ ((i_215_ + ((anIntArray5288[i_210_] - i_215_) * i_219_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3851 / i_208_));
				f_mc[i_207_] = (((Class36) aClass36_5272).anInt522
						+ ((i_216_ + ((anIntArray5304[i_210_] - i_216_) * i_219_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3852 / i_208_));
				anIntArray5255[i_207_++] = (i_217_ + (((anIntArray5280[i] & 0xffff) - i_217_) * i_219_ >> 16));
			}
		}
		if (i_213_ >= i_208_) {
			anIntArray5289[i_207_] = f_ic[i_210_];
			f_mc[i_207_] = anIntArray5279[i_210_];
			anIntArray5255[i_207_++] = anIntArray5280[i] & 0xffff;
		} else {
			int i_220_ = anIntArray5288[i_210_];
			int i_221_ = anIntArray5304[i_210_];
			int i_222_ = anIntArray5280[i] & 0xffff;
			if (i_212_ >= i_208_) {
				int i_223_ = (i_208_ - i_213_) * f_rc[i_212_ - i_213_];
				anIntArray5289[i_207_] = (((Class36) aClass36_5272).anInt517
						+ ((i_220_ + ((anIntArray5288[i_209_] - i_220_) * i_223_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3851 / i_208_));
				f_mc[i_207_] = (((Class36) aClass36_5272).anInt522
						+ ((i_221_ + ((anIntArray5304[i_209_] - i_221_) * i_223_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3852 / i_208_));
				anIntArray5255[i_207_++] = i_222_ + (((f_bb[i] & 0xffff) - i_222_) * i_223_ >> 16);
			}
			if (i_214_ >= i_208_) {
				int i_224_ = (i_208_ - i_213_) * f_rc[i_214_ - i_213_];
				anIntArray5289[i_207_] = (((Class36) aClass36_5272).anInt517
						+ ((i_220_ + ((anIntArray5288[i_211_] - i_220_) * i_224_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3851 / i_208_));
				f_mc[i_207_] = (((Class36) aClass36_5272).anInt522
						+ ((i_221_ + ((anIntArray5304[i_211_] - i_221_) * i_224_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3852 / i_208_));
				anIntArray5255[i_207_++] = i_222_ + (((hue_c[i] & 0xffff) - i_222_) * i_224_ >> 16);
			}
		}
		if (i_214_ >= i_208_) {
			anIntArray5289[i_207_] = f_ic[i_211_];
			f_mc[i_207_] = anIntArray5279[i_211_];
			anIntArray5255[i_207_++] = hue_c[i] & 0xffff;
		} else {
			int i_225_ = anIntArray5288[i_211_];
			int i_226_ = anIntArray5304[i_211_];
			int i_227_ = hue_c[i] & 0xffff;
			if (i_213_ >= i_208_) {
				int i_228_ = (i_208_ - i_214_) * f_rc[i_213_ - i_214_];
				anIntArray5289[i_207_] = (((Class36) aClass36_5272).anInt517
						+ ((i_225_ + ((anIntArray5288[i_210_] - i_225_) * i_228_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3851 / i_208_));
				f_mc[i_207_] = (((Class36) aClass36_5272).anInt522
						+ ((i_226_ + ((anIntArray5304[i_210_] - i_226_) * i_228_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3852 / i_208_));
				anIntArray5255[i_207_++] = (i_227_ + (((anIntArray5280[i] & 0xffff) - i_227_) * i_228_ >> 16));
			}
			if (i_212_ >= i_208_) {
				int i_229_ = (i_208_ - i_214_) * f_rc[i_212_ - i_214_];
				anIntArray5289[i_207_] = (((Class36) aClass36_5272).anInt517
						+ ((i_225_ + ((anIntArray5288[i_209_] - i_225_) * i_229_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3851 / i_208_));
				f_mc[i_207_] = (((Class36) aClass36_5272).anInt522
						+ ((i_226_ + ((anIntArray5304[i_209_] - i_226_) * i_229_ >> 16))
								* ((Class260_Sub1) f_ub).anInt3852 / i_208_));
				anIntArray5255[i_207_++] = i_227_ + (((f_bb[i] & 0xffff) - i_227_) * i_229_ >> 16);
			}
		}
		int i_230_ = anIntArray5289[0];
		int i_231_ = anIntArray5289[1];
		int i_232_ = anIntArray5289[2];
		int i_233_ = f_mc[0];
		int i_234_ = f_mc[1];
		int i_235_ = f_mc[2];
		((Rasterizer3D) aClass184_5258).aBool2560 = false;
		if (i_207_ == 3) {
			if (i_230_ < 0 || i_231_ < 0 || i_232_ < 0 || i_230_ > ((Class36) aClass36_5272).anInt530
					|| i_231_ > ((Class36) aClass36_5272).anInt530 || i_232_ > ((Class36) aClass36_5272).anInt530) {
				((Rasterizer3D) aClass184_5258).aBool2560 = true;
			}
			if (texture_faces == null || texture_faces[i] == -1) {
				if (hue_c[i] == -1) {
					aClass184_5258.drawTexturedTriangle(i_233_, i_234_, i_235_, i_230_, i_231_, i_232_,
							Entity.f_eb[f_bb[i] & 0xffff]);
				} else {
					aClass184_5258.method1194(i_233_, i_234_, i_235_, i_230_, i_231_, i_232_, anIntArray5255[0],
							anIntArray5255[1], anIntArray5255[2]);
				}
			} else {
				int i_236_;
				int i_237_;
				int i_238_;
				if (f_nb != null && f_nb[i] != -1) {
					int i_239_ = f_nb[i] & 0xff;
					i_236_ = f_ac[i_239_];
					i_237_ = anIntArray5275[i_239_];
					i_238_ = anIntArray5248[i_239_];
				} else {
					i_236_ = i_209_;
					i_237_ = i_210_;
					i_238_ = i_211_;
				}
				if (hue_c[i] == -1) {
					aClass184_5258.drawFlatTriangle1(texture_faces[i], i_233_, i_234_, i_235_, i_230_, i_231_, i_232_,
							f_bb[i], f_bb[i], f_bb[i], anIntArray5288[i_236_], anIntArray5288[i_237_],
							anIntArray5288[i_238_], anIntArray5304[i_236_], anIntArray5304[i_237_],
							anIntArray5304[i_238_], anIntArray5303[i_236_], anIntArray5303[i_237_],
							anIntArray5303[i_238_]);
				} else {
					aClass184_5258.drawFlatTriangle1(texture_faces[i], i_233_, i_234_, i_235_, i_230_, i_231_, i_232_,
							anIntArray5255[0], anIntArray5255[1], anIntArray5255[2], anIntArray5288[i_236_],
							anIntArray5288[i_237_], anIntArray5288[i_238_], anIntArray5304[i_236_],
							anIntArray5304[i_237_], anIntArray5304[i_238_], anIntArray5303[i_236_],
							anIntArray5303[i_237_], anIntArray5303[i_238_]);
				}
			}
		}
		if (i_207_ == 4) {
			if (i_230_ < 0 || i_231_ < 0 || i_232_ < 0 || i_230_ > ((Class36) aClass36_5272).anInt530
					|| i_231_ > ((Class36) aClass36_5272).anInt530 || i_232_ > ((Class36) aClass36_5272).anInt530
					|| anIntArray5289[3] < 0 || anIntArray5289[3] > ((Class36) aClass36_5272).anInt530)
				((Rasterizer3D) aClass184_5258).aBool2560 = true;
			if (texture_faces == null || texture_faces[i] == -1) {
				if (hue_c[i] == -1) {
					int i_240_ = Entity.f_eb[f_bb[i] & 0xffff];
					aClass184_5258.drawTexturedTriangle(i_233_, i_234_, i_235_, i_230_, i_231_, i_232_, i_240_);
					aClass184_5258.drawTexturedTriangle(i_233_, i_235_, f_mc[3], i_230_, i_232_, anIntArray5289[3],
							i_240_);
				} else {
					aClass184_5258.method1194(i_233_, i_234_, i_235_, i_230_, i_231_, i_232_, anIntArray5255[0],
							anIntArray5255[1], anIntArray5255[2]);
					aClass184_5258.method1194(i_233_, i_235_, f_mc[3], i_230_, i_232_, anIntArray5289[3],
							anIntArray5255[0], anIntArray5255[2], anIntArray5255[3]);
				}
			} else {
				int i_241_;
				int i_242_;
				int i_243_;
				if (f_nb != null && f_nb[i] != -1) {
					int i_244_ = f_nb[i] & 0xff;
					i_241_ = f_ac[i_244_];
					i_242_ = anIntArray5275[i_244_];
					i_243_ = anIntArray5248[i_244_];
				} else {
					i_241_ = i_209_;
					i_242_ = i_210_;
					i_243_ = i_211_;
				}
				short i_245_ = texture_faces[i];
				if (hue_c[i] == -1) {
					aClass184_5258.drawFlatTriangle1(i_245_, i_233_, i_234_, i_235_, i_230_, i_231_, i_232_, f_bb[i],
							f_bb[i], f_bb[i], anIntArray5288[i_241_], anIntArray5288[i_242_], anIntArray5288[i_243_],
							anIntArray5304[i_241_], anIntArray5304[i_242_], anIntArray5304[i_243_],
							anIntArray5303[i_241_], anIntArray5303[i_242_], anIntArray5303[i_243_]);
					aClass184_5258.drawFlatTriangle1(i_245_, i_233_, i_235_, f_mc[3], i_230_, i_232_, anIntArray5289[3],
							f_bb[i], f_bb[i], f_bb[i], anIntArray5288[i_241_], anIntArray5288[i_242_],
							anIntArray5288[i_243_], anIntArray5304[i_241_], anIntArray5304[i_242_],
							anIntArray5304[i_243_], anIntArray5303[i_241_], anIntArray5303[i_242_],
							anIntArray5303[i_243_]);
				} else {
					aClass184_5258.drawFlatTriangle1(i_245_, i_233_, i_234_, i_235_, i_230_, i_231_, i_232_,
							anIntArray5255[0], anIntArray5255[1], anIntArray5255[2], anIntArray5288[i_241_],
							anIntArray5288[i_242_], anIntArray5288[i_243_], anIntArray5304[i_241_],
							anIntArray5304[i_242_], anIntArray5304[i_243_], anIntArray5303[i_241_],
							anIntArray5303[i_242_], anIntArray5303[i_243_]);
					aClass184_5258.drawFlatTriangle1(i_245_, i_233_, i_235_, f_mc[3], i_230_, i_232_, anIntArray5289[3],
							anIntArray5255[0], anIntArray5255[2], anIntArray5255[3], anIntArray5288[i_241_],
							anIntArray5288[i_242_], anIntArray5288[i_243_], anIntArray5304[i_241_],
							anIntArray5304[i_242_], anIntArray5304[i_243_], anIntArray5303[i_241_],
							anIntArray5303[i_242_], anIntArray5303[i_243_]);
				}
			}
		}
	}

	private final void method2231(Thread thread) {
		Class36 class36 = f_ub.method1798(thread);
		if (class36 != aClass36_5299) {
			aClass36_5299 = class36;
			aClass_t_Sub2_5302 = ((Class36) aClass36_5299).f_db;
			aClass_t_Sub2_5274 = ((Class36) aClass36_5299).aClass_t_Sub2_513;
			aClass_t_Sub2_5285 = ((Class36) aClass36_5299).aClass_t_Sub2_500;
			aClass_t_Sub2_5282 = ((Class36) aClass36_5299).aClass_t_Sub2_519;
			f_db = ((Class36) aClass36_5299).aClass_t_Sub2_499;
			aClass_t_Sub2_5283 = ((Class36) aClass36_5299).f_eb;
			f_nc = ((Class36) aClass36_5299).aClass_t_Sub2_511;
			f_kc = ((Class36) aClass36_5299).f_ab;
			aClass_t_Sub2_5249 = ((Class36) aClass36_5299).aClass_t_Sub2_521;
			aClass_t_Sub2_5281 = ((Class36) aClass36_5299).aClass_t_Sub2_501;
		}
	}

	final boolean animateStart() {
		if (verticesByLabel == null)
			return false;
		originX = 0;
		originY = 0;
		originZ = 0;
		return true;
	}

	final int U() {
		if (!aBool5314)
			method2244();
		return aShort5259;
	}

	final void UA(int i) {
		if ((anInt5253 & 0x10000) == 65536 && (i & 0x10000) == 0)
			method2243(true);
		anInt5253 = i;
	}

	final void E(int i) {
		if ((anInt5253 & 0x1000) != 4096)
			throw new IllegalStateException();
		f_hb = i;
		anInt5278 = 0;
	}

	final void N(int i, int i_246_, int i_247_, int i_248_) {
		if (i == 0) {
			int i_249_ = 0;
			originX = 0;
			originY = 0;
			originZ = 0;
			for (int i_250_ = 0; i_250_ < anInt5254; i_250_++) {
				originX += vertex_position_x[i_250_];
				originY += vertex_position_y[i_250_];
				originZ += vertex_position_z[i_250_];
				i_249_++;
			}
			if (i_249_ > 0) {
				originX = originX / i_249_ + i_246_;
				originY = originY / i_249_ + i_247_;
				originZ = originZ / i_249_ + i_248_;
			} else {
				originX = i_246_;
				originY = i_247_;
				originZ = i_248_;
			}
		} else if (i == 1) {
			for (int i_251_ = 0; i_251_ < anInt5254; i_251_++) {
				vertex_position_x[i_251_] += i_246_;
				vertex_position_y[i_251_] += i_247_;
				vertex_position_z[i_251_] += i_248_;
			}
		} else if (i == 2) {
			for (int i_252_ = 0; i_252_ < anInt5254; i_252_++) {
				vertex_position_x[i_252_] -= originX;
				vertex_position_y[i_252_] -= originY;
				vertex_position_z[i_252_] -= originZ;

				if (i_248_ != 0) {
					int i_253_ = MathUtils.SINE[i_248_];
					int i_254_ = MathUtils.COSINE[i_248_];
					int i_255_ = ((vertex_position_y[i_252_] * i_253_ + vertex_position_x[i_252_] * i_254_
							+ 32767) >> 15);
					vertex_position_y[i_252_] = (vertex_position_y[i_252_] * i_254_ - vertex_position_x[i_252_] * i_253_
							+ 32767) >> 15;
					vertex_position_x[i_252_] = i_255_;
				}
				if (i_246_ != 0) {
					int i_256_ = MathUtils.SINE[i_246_];
					int i_257_ = MathUtils.COSINE[i_246_];
					int i_258_ = ((vertex_position_y[i_252_] * i_257_ - vertex_position_z[i_252_] * i_256_
							+ 32767) >> 15);
					vertex_position_z[i_252_] = (vertex_position_y[i_252_] * i_256_ + vertex_position_z[i_252_] * i_257_
							+ 32767) >> 15;
					vertex_position_y[i_252_] = i_258_;
				}
				if (i_247_ != 0) {
					int i_259_ = MathUtils.SINE[i_247_];
					int i_260_ = MathUtils.COSINE[i_247_];
					int i_261_ = ((vertex_position_z[i_252_] * i_259_ + vertex_position_x[i_252_] * i_260_
							+ 32767) >> 15);
					vertex_position_z[i_252_] = (vertex_position_z[i_252_] * i_260_ - vertex_position_x[i_252_] * i_259_
							+ 32767) >> 15;
					vertex_position_x[i_252_] = i_261_;
				}
				vertex_position_x[i_252_] += originX;
				vertex_position_y[i_252_] += originY;
				vertex_position_z[i_252_] += originZ;
			}
		} else if (i == 3) {
			for (int i_262_ = 0; i_262_ < anInt5254; i_262_++) {
				vertex_position_x[i_262_] -= originX;
				vertex_position_y[i_262_] -= originY;
				vertex_position_z[i_262_] -= originZ;
				vertex_position_x[i_262_] = vertex_position_x[i_262_] * i_246_ / 128;
				vertex_position_y[i_262_] = vertex_position_y[i_262_] * i_247_ / 128;
				vertex_position_z[i_262_] = vertex_position_z[i_262_] * i_248_ / 128;
				vertex_position_x[i_262_] += originX;
				vertex_position_y[i_262_] += originY;
				vertex_position_z[i_262_] += originZ;
			}
		} else if (i == 5) {
			for (int i_263_ = 0; i_263_ < faces; i_263_++) {
				int i_264_ = (alpha[i_263_] & 0xff) + i_246_ * 8;
				if (i_264_ < 0)
					i_264_ = 0;
				else if (i_264_ > 255)
					i_264_ = 255;
				alpha[i_263_] = (byte) i_264_;
			}
			if (aClass112Array5263 != null) {
				for (int i_265_ = 0; i_265_ < anInt5262; i_265_++) {
					Class112 class112 = aClass112Array5263[i_265_];
					Class145 class145 = f_lb[i_265_];
					((Class145) class145).anInt2106 = (((Class145) class145).anInt2106 & 0xffffff
							| 255 - ((alpha[((Class112) class112).anInt1586]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_266_ = 0; i_266_ < faces; i_266_++) {
				int i_267_ = facesColors[i_266_] & 0xffff;
				int i_268_ = i_267_ >> 10 & 0x3f;
				int i_269_ = i_267_ >> 7 & 0x7;
				int i_270_ = i_267_ & 0x7f;
				i_268_ = i_268_ + i_246_ & 0x3f;
				i_269_ += i_247_;
				if (i_269_ < 0)
					i_269_ = 0;
				else if (i_269_ > 7)
					i_269_ = 7;
				i_270_ += i_248_;
				if (i_270_ < 0)
					i_270_ = 0;
				else if (i_270_ > 127)
					i_270_ = 127;
				facesColors[i_266_] = (short) (i_268_ << 10 | i_269_ << 7 | i_270_);
			}
			f_ab = true;
			if (aClass112Array5263 != null) {
				for (int i_271_ = 0; i_271_ < anInt5262; i_271_++) {
					Class112 class112 = aClass112Array5263[i_271_];
					Class145 class145 = f_lb[i_271_];
					((Class145) class145).anInt2106 = (((Class145) class145).anInt2106 & ~0xffffff
							| ((Entity.f_eb[Class_e.method594(-19,
									(facesColors[(((Class112) class112).anInt1586)]) & 0xffff)]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_272_ = 0; i_272_ < anInt5262; i_272_++) {
				Class145 class145 = f_lb[i_272_];
				((Class145) class145).anInt2109 += i_246_;
				((Class145) class145).anInt2101 += i_247_;
			}
		} else if (i == 10) {
			for (int i_273_ = 0; i_273_ < anInt5262; i_273_++) {
				Class145 class145 = f_lb[i_273_];
				((Class145) class145).anInt2098 = ((Class145) class145).anInt2098 * i_246_ >> 7;
				((Class145) class145).anInt2102 = ((Class145) class145).anInt2102 * i_247_ >> 7;
			}
		} else if (i == 9) {
			for (int i_274_ = 0; i_274_ < anInt5262; i_274_++) {
				Class145 class145 = f_lb[i_274_];
				((Class145) class145).anInt2113 = ((Class145) class145).anInt2113 + i_246_ & 0x3fff;
			}
		}
	}

	private final void method2232(Class_c_Sub2 class_c_sub2) {
		if (aClass19Array5256 != null) {
			for (int i = 0; i < aClass19Array5256.length; i++) {
				Class19 class19 = aClass19Array5256[i];
				Class19 class19_275_ = class19;
				if (((Class19) class19).aClass19_297 != null)
					class19_275_ = ((Class19) class19).aClass19_297;
				((Class19) class19_275_).anInt293 = (((Class_c_Sub2) class_c_sub2).anInt5589
						+ (((((Class_c_Sub2) class_c_sub2).anInt5594 * vertex_position_x[((Class19) class19).anInt301])
								+ (((Class_c_Sub2) class_c_sub2).anInt5588
										* vertex_position_y[((Class19) class19).anInt301])
								+ (((Class_c_Sub2) class_c_sub2).anInt5592
										* vertex_position_z[((Class19) class19).anInt301])) >> 15));
				((Class19) class19_275_).anInt294 = (((Class_c_Sub2) class_c_sub2).anInt5584
						+ (((((Class_c_Sub2) class_c_sub2).anInt5591 * vertex_position_x[((Class19) class19).anInt301])
								+ (((Class_c_Sub2) class_c_sub2).anInt5586
										* vertex_position_y[((Class19) class19).anInt301])
								+ (((Class_c_Sub2) class_c_sub2).anInt5587
										* vertex_position_z[((Class19) class19).anInt301])) >> 15));
				((Class19) class19_275_).anInt306 = (((Class_c_Sub2) class_c_sub2).anInt5593
						+ (((((Class_c_Sub2) class_c_sub2).anInt5583 * vertex_position_x[((Class19) class19).anInt301])
								+ (((Class_c_Sub2) class_c_sub2).anInt5590
										* vertex_position_y[((Class19) class19).anInt301])
								+ (((Class_c_Sub2) class_c_sub2).anInt5585
										* vertex_position_z[((Class19) class19).anInt301])) >> 15));
				((Class19) class19_275_).anInt295 = (((Class_c_Sub2) class_c_sub2).anInt5589
						+ (((((Class_c_Sub2) class_c_sub2).anInt5594 * vertex_position_x[((Class19) class19).anInt309])
								+ (((Class_c_Sub2) class_c_sub2).anInt5588
										* vertex_position_y[((Class19) class19).anInt309])
								+ (((Class_c_Sub2) class_c_sub2).anInt5592
										* vertex_position_z[((Class19) class19).anInt309])) >> 15));
				((Class19) class19_275_).anInt296 = (((Class_c_Sub2) class_c_sub2).anInt5584
						+ (((((Class_c_Sub2) class_c_sub2).anInt5591 * vertex_position_x[((Class19) class19).anInt309])
								+ (((Class_c_Sub2) class_c_sub2).anInt5586
										* vertex_position_y[((Class19) class19).anInt309])
								+ (((Class_c_Sub2) class_c_sub2).anInt5587
										* vertex_position_z[((Class19) class19).anInt309])) >> 15));
				((Class19) class19_275_).anInt302 = (((Class_c_Sub2) class_c_sub2).anInt5593
						+ (((((Class_c_Sub2) class_c_sub2).anInt5583 * vertex_position_x[((Class19) class19).anInt309])
								+ (((Class_c_Sub2) class_c_sub2).anInt5590
										* vertex_position_y[((Class19) class19).anInt309])
								+ (((Class_c_Sub2) class_c_sub2).anInt5585
										* vertex_position_z[((Class19) class19).anInt309])) >> 15));
				((Class19) class19_275_).anInt303 = (((Class_c_Sub2) class_c_sub2).anInt5589
						+ (((((Class_c_Sub2) class_c_sub2).anInt5594 * vertex_position_x[((Class19) class19).anInt292])
								+ (((Class_c_Sub2) class_c_sub2).anInt5588
										* vertex_position_y[((Class19) class19).anInt292])
								+ (((Class_c_Sub2) class_c_sub2).anInt5592
										* vertex_position_z[((Class19) class19).anInt292])) >> 15));
				((Class19) class19_275_).anInt298 = (((Class_c_Sub2) class_c_sub2).anInt5584
						+ (((((Class_c_Sub2) class_c_sub2).anInt5591 * vertex_position_x[((Class19) class19).anInt292])
								+ (((Class_c_Sub2) class_c_sub2).anInt5586
										* vertex_position_y[((Class19) class19).anInt292])
								+ (((Class_c_Sub2) class_c_sub2).anInt5587
										* vertex_position_z[((Class19) class19).anInt292])) >> 15));
				((Class19) class19_275_).anInt304 = (((Class_c_Sub2) class_c_sub2).anInt5593
						+ (((((Class_c_Sub2) class_c_sub2).anInt5583 * vertex_position_x[((Class19) class19).anInt292])
								+ (((Class_c_Sub2) class_c_sub2).anInt5590
										* vertex_position_y[((Class19) class19).anInt292])
								+ (((Class_c_Sub2) class_c_sub2).anInt5585
										* vertex_position_z[((Class19) class19).anInt292])) >> 15));
			}
		}
		if (aClass162Array5257 != null) {
			for (int i = 0; i < aClass162Array5257.length; i++) {
				Class303 class162 = aClass162Array5257[i];
				Class303 class162_276_ = class162;
				if (((Class303) class162).aClass162_2296 != null)
					class162_276_ = ((Class303) class162).aClass162_2296;
				if (((Class303) class162).aClass_c2291 != null)
					((Class303) class162).aClass_c2291.za(class_c_sub2);
				else
					((Class303) class162).aClass_c2291 = class_c_sub2.method582();
				((Class303) class162_276_).anInt2294 = (((Class_c_Sub2) class_c_sub2).anInt5589
						+ (((((Class_c_Sub2) class_c_sub2).anInt5594
								* vertex_position_x[((Class303) class162).anInt2289])
								+ (((Class_c_Sub2) class_c_sub2).anInt5588
										* vertex_position_y[((Class303) class162).anInt2289])
								+ (((Class_c_Sub2) class_c_sub2).anInt5592
										* (vertex_position_z[((Class303) class162).anInt2289]))) >> 15));
				((Class303) class162_276_).anInt2292 = (((Class_c_Sub2) class_c_sub2).anInt5584
						+ (((((Class_c_Sub2) class_c_sub2).anInt5591
								* vertex_position_x[((Class303) class162).anInt2289])
								+ (((Class_c_Sub2) class_c_sub2).anInt5586
										* vertex_position_y[((Class303) class162).anInt2289])
								+ (((Class_c_Sub2) class_c_sub2).anInt5587
										* (vertex_position_z[((Class303) class162).anInt2289]))) >> 15));
				((Class303) class162_276_).anInt2301 = (((Class_c_Sub2) class_c_sub2).anInt5593
						+ (((((Class_c_Sub2) class_c_sub2).anInt5583
								* vertex_position_x[((Class303) class162).anInt2289])
								+ (((Class_c_Sub2) class_c_sub2).anInt5590
										* vertex_position_y[((Class303) class162).anInt2289])
								+ (((Class_c_Sub2) class_c_sub2).anInt5585
										* (vertex_position_z[((Class303) class162).anInt2289]))) >> 15));
			}
		}
	}

	final void I(short i, short i_277_) {
		if (texture_faces != null) {
			for (int i_278_ = 0; i_278_ < faces; i_278_++) {
				if (texture_faces[i_278_] == i)
					texture_faces[i_278_] = i_277_;
			}
		}
	}

	final void Q(int i) {
		if ((anInt5253 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method2242();
		else if (i == 8192)
			method2239();
		else if (i == 12288)
			method2229();
		else {
			int i_279_ = MathUtils.SINE[i];
			int i_280_ = MathUtils.COSINE[i];
			for (int i_281_ = 0; i_281_ < anInt5254; i_281_++) {
				int i_282_ = (vertex_position_z[i_281_] * i_279_ + vertex_position_x[i_281_] * i_280_ >> 15);
				vertex_position_z[i_281_] = (vertex_position_z[i_281_] * i_280_
						- vertex_position_x[i_281_] * i_279_ >> 15);
				vertex_position_x[i_281_] = i_282_;
			}
			method2228();
		}
	}

	private final void apply_texture(int i) {
		if (f_qc[i])
			method2230(i);
		else {
			int i_283_ = texture_edge_a[i];
			int i_284_ = texture_edge_b[i];
			int i_285_ = texture_edge_c[i];
			((Rasterizer3D) aClass184_5258).aBool2560 = f_wb[i];
			if (alpha == null)
				((Rasterizer3D) aClass184_5258).alpha = 0;
			else
				((Rasterizer3D) aClass184_5258).alpha = alpha[i] & 0xff;
			if (texture_faces == null || texture_faces[i] == -1) {
				if (hue_c[i] == -1) {
					aClass184_5258.drawTexturedTriangle(anIntArray5279[i_283_], anIntArray5279[i_284_],
							anIntArray5279[i_285_], f_ic[i_283_], f_ic[i_284_], f_ic[i_285_],
							Entity.f_eb[f_bb[i] & 0xffff]);
				} else {
					aClass184_5258.method1194(anIntArray5279[i_283_], anIntArray5279[i_284_], anIntArray5279[i_285_],
							f_ic[i_283_], f_ic[i_284_], f_ic[i_285_], f_bb[i] & 0xffff, anIntArray5280[i] & 0xffff,
							hue_c[i] & 0xffff);
				}
			} else {
				int i_286_;
				int i_287_;
				int i_288_;
				if (f_nb != null && f_nb[i] != -1) {
					int i_289_ = f_nb[i] & 0xff;
					i_286_ = f_ac[i_289_];
					i_287_ = anIntArray5275[i_289_];
					i_288_ = anIntArray5248[i_289_];
				} else {
					i_286_ = i_283_;
					i_287_ = i_284_;
					i_288_ = i_285_;
				}
				if (hue_c[i] == -1) { // RENDER TEX
					aClass184_5258.drawFlatTriangle1(texture_faces[i], anIntArray5279[i_283_], anIntArray5279[i_284_],
							anIntArray5279[i_285_], f_ic[i_283_], f_ic[i_284_], f_ic[i_285_], f_bb[i], f_bb[i], f_bb[i],
							anIntArray5288[i_286_], anIntArray5288[i_287_], anIntArray5288[i_288_],
							anIntArray5304[i_286_], anIntArray5304[i_287_], anIntArray5304[i_288_],
							anIntArray5303[i_286_], anIntArray5303[i_287_], anIntArray5303[i_288_]);
				} else {
					aClass184_5258.drawFlatTriangle1(texture_faces[i], anIntArray5279[i_283_], anIntArray5279[i_284_],
							anIntArray5279[i_285_], f_ic[i_283_], f_ic[i_284_], f_ic[i_285_], f_bb[i],
							anIntArray5280[i], hue_c[i], anIntArray5288[i_286_], anIntArray5288[i_287_],
							anIntArray5288[i_288_], anIntArray5304[i_286_], anIntArray5304[i_287_],
							anIntArray5304[i_288_], anIntArray5303[i_286_], anIntArray5303[i_287_],
							anIntArray5303[i_288_]);
				}
			}
		}
	}

	final void R(int i) {
		if ((anInt5253 & 0x3) != 3)
			throw new IllegalStateException();
		int i_290_ = MathUtils.SINE[i];
		int i_291_ = MathUtils.COSINE[i];
		for (int i_292_ = 0; i_292_ < anInt5254; i_292_++) {
			int i_293_ = vertex_position_y[i_292_] * i_290_ + vertex_position_x[i_292_] * i_291_ >> 15;
			vertex_position_y[i_292_] = vertex_position_y[i_292_] * i_291_ - vertex_position_x[i_292_] * i_290_ >> 15;
			vertex_position_x[i_292_] = i_293_;
		}
		method2228();
	}

	final int WA() {
		if (!aBool5314)
			method2244();
		return f_vb;
	}

	final boolean method681() {
		if (texture_faces == null)
			return true;
		for (int i = 0; i < texture_faces.length; i++) {
			if (texture_faces[i] != -1 && !f_ub.method1796(texture_faces[i]))
				return false;
		}
		return true;
	}

	final void method680(Class_c class_c, Class130_Sub5 class130_sub5, int i) {
		method2240(class_c, class130_sub5, null, -1, i);
	}

	final int m() {
		if (!aBool5314)
			method2244();
		return aShort5250;
	}

	final void IA() {
		if ((anInt5253 & 0x10) != 16)
			throw new IllegalStateException();
		for (int i = 0; i < anInt5254; i++)
			vertex_position_z[i] = -vertex_position_z[i];
		if (aClass33Array1425 != null) {
			for (int i = 0; i < vertices; i++) {
				if (aClass33Array1425[i] != null)
					((Vertex) aClass33Array1425[i]).normalized_normal_z = -((Vertex) aClass33Array1425[i]).normalized_normal_z;
			}
		}
		if (f_cc != null) {
			for (int i = 0; i < vertices; i++) {
				if (f_cc[i] != null)
					((Vertex) f_cc[i]).normalized_normal_z = -((Vertex) f_cc[i]).normalized_normal_z;
			}
		}
		if (aClass89Array5309 != null) {
			for (int i = 0; i < faces; i++) {
				if (aClass89Array5309[i] != null)
					((Class89) aClass89Array5309[i]).anInt1157 = -((Class89) aClass89Array5309[i]).anInt1157;
			}
		}
		int[] is = texture_edge_a;
		texture_edge_a = texture_edge_c;
		texture_edge_c = is;
		aBool5314 = false;
		anInt5278 = 0;
	}

	final void method682(AbstractModel class_t, int i, int i_294_, int i_295_, boolean bool) {
		LDModel class_t_sub2_296_ = (LDModel) class_t;
		if ((anInt5253 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class_t_sub2_296_.anInt5253 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method2238(Thread.currentThread());
		method2244();
		lighting();
		class_t_sub2_296_.method2244();
		class_t_sub2_296_.lighting();
		f_sc++;
		int i_297_ = 0;
		int[] is = class_t_sub2_296_.vertex_position_x;
		int i_298_ = class_t_sub2_296_.vertices;
		for (int i_299_ = 0; i_299_ < vertices; i_299_++) {
			Vertex class70 = aClass33Array1425[i_299_];
			if (((Vertex) class70).anInt605 != 0) {
				int i_300_ = vertex_position_y[i_299_] - i_294_;
				if (i_300_ >= class_t_sub2_296_.aShort5300 && i_300_ <= class_t_sub2_296_.f_vb) {
					int i_301_ = vertex_position_x[i_299_] - i;
					if (i_301_ >= class_t_sub2_296_.aShort5271 && i_301_ <= class_t_sub2_296_.aShort5267) {
						int i_302_ = vertex_position_z[i_299_] - i_295_;
						if (i_302_ >= class_t_sub2_296_.f_ob && i_302_ <= class_t_sub2_296_.aShort5250) {
							for (int i_303_ = 0; i_303_ < i_298_; i_303_++) {
								Vertex class70_304_ = class_t_sub2_296_.aClass33Array1425[i_303_];
								if (i_301_ == is[i_303_] && i_302_ == (class_t_sub2_296_.vertex_position_z[i_303_])
										&& i_300_ == class_t_sub2_296_.vertex_position_y[i_303_]
										&& (((Vertex) class70_304_).anInt605 != 0)) {
									if (f_cc == null)
										f_cc = new Vertex[vertices];
									if (class_t_sub2_296_.f_cc == null)
										class_t_sub2_296_.f_cc = new Vertex[i_298_];
									Vertex class70_305_ = f_cc[i_299_];
									if (class70_305_ == null)
										class70_305_ = f_cc[i_299_] = new Vertex(class70);
									Vertex class70_306_ = class_t_sub2_296_.f_cc[i_303_];
									if (class70_306_ == null)
										class70_306_ = class_t_sub2_296_.f_cc[i_303_] = new Vertex(class70_304_);
									((Vertex) class70_305_).normalized_normal_x += ((Vertex) class70_304_).normalized_normal_x;
									((Vertex) class70_305_).normalized_normal_y += ((Vertex) class70_304_).normalized_normal_y;
									((Vertex) class70_305_).normalized_normal_z += ((Vertex) class70_304_).normalized_normal_z;
									((Vertex) class70_305_).anInt605 += ((Vertex) class70_304_).anInt605;
									((Vertex) class70_306_).normalized_normal_x += ((Vertex) class70).normalized_normal_x;
									((Vertex) class70_306_).normalized_normal_y += ((Vertex) class70).normalized_normal_y;
									((Vertex) class70_306_).normalized_normal_z += ((Vertex) class70).normalized_normal_z;
									((Vertex) class70_306_).anInt605 += ((Vertex) class70).anInt605;
									i_297_++;
									anIntArray5301[i_299_] = f_sc;
									anIntArray5284[i_303_] = f_sc;
								}
							}
						}
					}
				}
			}
		}
		if (i_297_ >= 3 && bool) {
			for (int i_307_ = 0; i_307_ < faces; i_307_++) {
				if (anIntArray5301[texture_edge_a[i_307_]] == f_sc && anIntArray5301[texture_edge_b[i_307_]] == f_sc
						&& anIntArray5301[texture_edge_c[i_307_]] == f_sc) {
					if (render_type == null)
						render_type = new int[faces];
					render_type[i_307_] = (byte) 2;
				}
			}
			for (int i_308_ = 0; i_308_ < class_t_sub2_296_.faces; i_308_++) {
				if ((anIntArray5284[class_t_sub2_296_.texture_edge_a[i_308_]] == f_sc)
						&& anIntArray5284[class_t_sub2_296_.texture_edge_b[i_308_]] == f_sc
						&& (anIntArray5284[class_t_sub2_296_.texture_edge_c[i_308_]]) == f_sc) {
					if (class_t_sub2_296_.render_type == null)
						class_t_sub2_296_.render_type = new int[class_t_sub2_296_.faces];
					class_t_sub2_296_.render_type[i_308_] = (byte) 2;
				}
			}
		}
	}

	final void aa(int i) {
		if ((anInt5253 & 0x2000) != 8192)
			throw new IllegalStateException();
		contrast = i;
		anInt5278 = 0;
	}

	final void c(int i) {
		if ((anInt5253 & 0xd) != 13)
			throw new IllegalStateException();
		if (aClass33Array1425 != null) {
			if (i == 4096)
				method2227();
			else if (i == 8192)
				method2248();
			else if (i == 12288)
				method2245();
			else {
				int i_309_ = MathUtils.SINE[i];
				int i_310_ = MathUtils.COSINE[i];
				for (int i_311_ = 0; i_311_ < vertices; i_311_++) {
					int i_312_ = ((vertex_position_z[i_311_] * i_309_ + vertex_position_x[i_311_] * i_310_) >> 15);
					vertex_position_z[i_311_] = (vertex_position_z[i_311_] * i_310_
							- vertex_position_x[i_311_] * i_309_) >> 15;
					vertex_position_x[i_311_] = i_312_;
					if (aClass33Array1425[i_311_] != null) {
						i_312_ = ((((Vertex) aClass33Array1425[i_311_]).normalized_normal_z * i_309_
								+ ((Vertex) aClass33Array1425[i_311_]).normalized_normal_x * i_310_) >> 15);
						((Vertex) aClass33Array1425[i_311_]).normalized_normal_z = ((((Vertex) aClass33Array1425[i_311_]).normalized_normal_z
								* i_310_ - ((Vertex) aClass33Array1425[i_311_]).normalized_normal_x * i_309_) >> 15);
						((Vertex) aClass33Array1425[i_311_]).normalized_normal_x = i_312_;
					}
				}
				if (aClass89Array5309 != null) {
					for (int i_313_ = 0; i_313_ < faces; i_313_++) {
						if (aClass89Array5309[i_313_] != null) {
							int i_314_ = (((((Class89) aClass89Array5309[i_313_]).anInt1157) * i_309_
									+ (((Class89) aClass89Array5309[i_313_]).anInt1159) * i_310_) >> 15);
							((Class89) aClass89Array5309[i_313_]).anInt1157 = ((((Class89) aClass89Array5309[i_313_]).anInt1157)
									* i_310_ - (((Class89) aClass89Array5309[i_313_]).anInt1159) * i_309_) >> 15;
							((Class89) aClass89Array5309[i_313_]).anInt1159 = i_314_;
						}
					}
				}
				for (int i_315_ = vertices; i_315_ < anInt5254; i_315_++) {
					int i_316_ = ((vertex_position_z[i_315_] * i_309_ + vertex_position_x[i_315_] * i_310_) >> 15);
					vertex_position_z[i_315_] = (vertex_position_z[i_315_] * i_310_
							- vertex_position_x[i_315_] * i_309_) >> 15;
					vertex_position_x[i_315_] = i_316_;
				}
				anInt5278 = 0;
				aBool5314 = false;
			}
		} else
			Q(i);
	}

	final void H(int i, int i_317_, int i_318_) {
		if (i != 128 && (anInt5253 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_317_ != 128 && (anInt5253 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_318_ != 128 && (anInt5253 & 0x4) != 4)
			throw new IllegalStateException();
		for (int i_319_ = 0; i_319_ < anInt5254; i_319_++) {
			vertex_position_x[i_319_] = vertex_position_x[i_319_] * i >> 7;
			vertex_position_y[i_319_] = vertex_position_y[i_319_] * i_317_ >> 7;
			vertex_position_z[i_319_] = vertex_position_z[i_319_] * i_318_ >> 7;
		}
		aBool5314 = false;
	}

	final void onFinishAnimating() {
		if (f_eb) {
			for (int i = 0; i < anInt5254; i++) {
				vertex_position_x[i] = vertex_position_x[i] + 7 >> 4;
				vertex_position_y[i] = vertex_position_y[i] + 7 >> 4;
				vertex_position_z[i] = vertex_position_z[i] + 7 >> 4;
			}
			f_eb = false;
		}
		if (f_ab) {
			method2226();
			f_ab = false;
		}
		aBool5314 = false;
	}

	final int P() {
		return anInt5253;
	}

	final void animate_1(int opcode, int[] data, int var3, int var4, int var5, int i_323_, boolean bool,
			int sequence_id, SequenceType sequence_type) {
		int i_324_ = data.length;
		if (opcode == 0) {
			var3 <<= 4;
			var4 <<= 4;
			var5 <<= 4;
			if (!f_eb) {
				for (int i_325_ = 0; i_325_ < anInt5254; i_325_++) {
					vertex_position_x[i_325_] <<= 4;
					vertex_position_y[i_325_] <<= 4;
					vertex_position_z[i_325_] <<= 4;
				}
				f_eb = true;
			}
			int i_326_ = 0;
			originX = 0;
			originY = 0;
			originZ = 0;
			for (int i_327_ = 0; i_327_ < i_324_; i_327_++) {
				int i_328_ = data[i_327_];
				if (i_328_ < verticesByLabel.length) {
					int[] is_329_ = verticesByLabel[i_328_];
					for (int i_330_ = 0; i_330_ < is_329_.length; i_330_++) {
						int i_331_ = is_329_[i_330_];
						originX += vertex_position_x[i_331_];
						originY += vertex_position_y[i_331_];
						originZ += vertex_position_z[i_331_];
						i_326_++;
					}
				}
			}
			if (i_326_ > 0) {
				originX = originX / i_326_ + var3;
				originY = originY / i_326_ + var4;
				originZ = originZ / i_326_ + var5;
			} else {
				originX = var3;
				originY = var4;
				originZ = var5;
			}
		} else if (opcode == 1) {
			var3 <<= 4;
			var4 <<= 4;
			var5 <<= 4;
			if (!f_eb) {
				for (int i_332_ = 0; i_332_ < anInt5254; i_332_++) {
					vertex_position_x[i_332_] <<= 4;
					vertex_position_y[i_332_] <<= 4;
					vertex_position_z[i_332_] <<= 4;
				}
				f_eb = true;
			}
			for (int i_333_ = 0; i_333_ < i_324_; i_333_++) {
				int i_334_ = data[i_333_];
				if (i_334_ < verticesByLabel.length) {
					int[] is_335_ = verticesByLabel[i_334_];
					for (int i_336_ = 0; i_336_ < is_335_.length; i_336_++) {
						int i_337_ = is_335_[i_336_];
						vertex_position_x[i_337_] += var3;
						vertex_position_y[i_337_] += var4;
						vertex_position_z[i_337_] += var5;
					}
				}
			}
		} else if (opcode == 2) {
			for (int i_338_ = 0; i_338_ < i_324_; i_338_++) {
				int i_339_ = data[i_338_];
				if (i_339_ < verticesByLabel.length) {
					int[] is_340_ = verticesByLabel[i_339_];
					if ((i_323_ & 0x1) == 0) {
						for (int i_341_ = 0; i_341_ < is_340_.length; i_341_++) {
							int i_342_ = is_340_[i_341_];
							vertex_position_x[i_342_] -= originX;
							vertex_position_y[i_342_] -= originY;
							vertex_position_z[i_342_] -= originZ;
							int sin, cos, tan;
							if (sequence_type.revision == Revision.OSRS
									|| sequence_type.revision == Revision.PRE_EOC_550) {
								sin = (var3 & 0xffff) << 3;
								cos = (var4 & 0xffff) << 3;
								tan = (var5 & 0xffff) << 3;
							} else {
								sin = var3;
								cos = var4;
								tan = var5;
							}
							if (tan != 0) {
								int i_343_ = MathUtils.SINE[tan];
								int i_344_ = MathUtils.COSINE[tan];
								int i_345_ = ((vertex_position_y[i_342_] * i_343_ + vertex_position_x[i_342_] * i_344_
										+ 32767) >> 15);
								vertex_position_y[i_342_] = (vertex_position_y[i_342_] * i_344_
										- vertex_position_x[i_342_] * i_343_ + 32767) >> 15;
								vertex_position_x[i_342_] = i_345_;
							}
							if (sin != 0) {
								int i_346_ = MathUtils.SINE[sin];
								int i_347_ = MathUtils.COSINE[sin];
								int i_348_ = (vertex_position_y[i_342_] * i_347_ - vertex_position_z[i_342_] * i_346_
										+ 32767) >> 15;
								vertex_position_z[i_342_] = (vertex_position_y[i_342_] * i_346_
										+ vertex_position_z[i_342_] * i_347_ + 32767) >> 15;
								vertex_position_y[i_342_] = i_348_;
							}
							if (cos != 0) {
								int i_349_ = MathUtils.SINE[cos];
								int i_350_ = MathUtils.COSINE[cos];
								int i_351_ = ((vertex_position_z[i_342_] * i_349_ + vertex_position_x[i_342_] * i_350_
										+ 32767) >> 15);
								vertex_position_z[i_342_] = (vertex_position_z[i_342_] * i_350_
										- vertex_position_x[i_342_] * i_349_ + 32767) >> 15;
								vertex_position_x[i_342_] = i_351_;
							}
							vertex_position_x[i_342_] += originX;
							vertex_position_y[i_342_] += originY;
							vertex_position_z[i_342_] += originZ;
						}
					} else {
						for (int i_352_ = 0; i_352_ < is_340_.length; i_352_++) {
							int i_353_ = is_340_[i_352_];
							vertex_position_x[i_353_] -= originX;
							vertex_position_y[i_353_] -= originY;
							vertex_position_z[i_353_] -= originZ;
							int sin, cos, tan;
							if (sequence_type.revision == Revision.OSRS
									|| sequence_type.revision == Revision.PRE_EOC_550) {
								sin = (var3 & 0xffff) >> 3;
								cos = (var4 & 0xffff) >> 3;
								tan = (var5 & 0xffff) >> 3;
							} else {
								sin = var3;
								cos = var4;
								tan = var5;
							}
							if (sin != 0) {
								int i_354_ = MathUtils.SINE[sin];
								int i_355_ = MathUtils.COSINE[sin];
								int i_356_ = (vertex_position_y[i_353_] * i_355_ - vertex_position_z[i_353_] * i_354_
										+ 32767) >> 15;
								vertex_position_z[i_353_] = (vertex_position_y[i_353_] * i_354_
										+ vertex_position_z[i_353_] * i_355_ + 32767) >> 15;
								vertex_position_y[i_353_] = i_356_;
							}
							if (tan != 0) {
								int i_357_ = MathUtils.SINE[tan];
								int i_358_ = MathUtils.COSINE[tan];
								int i_359_ = ((vertex_position_y[i_353_] * i_357_ + vertex_position_x[i_353_] * i_358_
										+ 32767) >> 15);
								vertex_position_y[i_353_] = (vertex_position_y[i_353_] * i_358_
										- vertex_position_x[i_353_] * i_357_ + 32767) >> 15;
								vertex_position_x[i_353_] = i_359_;
							}
							if (cos != 0) {
								int i_360_ = MathUtils.SINE[cos];
								int i_361_ = MathUtils.COSINE[cos];
								int i_362_ = ((vertex_position_z[i_353_] * i_360_ + vertex_position_x[i_353_] * i_361_
										+ 32767) >> 15);
								vertex_position_z[i_353_] = (vertex_position_z[i_353_] * i_361_
										- vertex_position_x[i_353_] * i_360_ + 32767) >> 15;
								vertex_position_x[i_353_] = i_362_;
							}
							vertex_position_x[i_353_] += originX;
							vertex_position_y[i_353_] += originY;
							vertex_position_z[i_353_] += originZ;
						}
					}
				}
			}
		} else if (opcode == 3) {
			for (int i_363_ = 0; i_363_ < i_324_; i_363_++) {
				int i_364_ = data[i_363_];
				if (i_364_ < verticesByLabel.length) {
					int[] is_365_ = verticesByLabel[i_364_];
					for (int i_366_ = 0; i_366_ < is_365_.length; i_366_++) {
						int i_367_ = is_365_[i_366_];
						vertex_position_x[i_367_] -= originX;
						vertex_position_y[i_367_] -= originY;
						vertex_position_z[i_367_] -= originZ;
						vertex_position_x[i_367_] = vertex_position_x[i_367_] * var3 / 128;
						vertex_position_y[i_367_] = vertex_position_y[i_367_] * var4 / 128;
						vertex_position_z[i_367_] = vertex_position_z[i_367_] * var5 / 128;
						vertex_position_x[i_367_] += originX;
						vertex_position_y[i_367_] += originY;
						vertex_position_z[i_367_] += originZ;
					}
				}
			}
		} else if (opcode == 5) {
			if (facesByLabel != null && alpha != null) {
				for (int i_368_ = 0; i_368_ < i_324_; i_368_++) {
					int i_369_ = data[i_368_];
					if (i_369_ < facesByLabel.length) {
						int[] is_370_ = facesByLabel[i_369_];
						for (int i_371_ = 0; i_371_ < is_370_.length; i_371_++) {
							int i_372_ = is_370_[i_371_];
							int i_373_ = (alpha[i_372_] & 0xff) + var3 * 8;
							if (i_373_ < 0)
								i_373_ = 0;
							else if (i_373_ > 255)
								i_373_ = 255;
							alpha[i_372_] = (byte) i_373_;
						}
					}
				}
				if (aClass112Array5263 != null) {
					for (int i_374_ = 0; i_374_ < anInt5262; i_374_++) {
						Class112 class112 = aClass112Array5263[i_374_];
						Class145 class145 = f_lb[i_374_];
						((Class145) class145).anInt2106 = (((Class145) class145).anInt2106 & 0xffffff
								| 255 - ((alpha[((Class112) class112).anInt1586]) & 0xff) << 24);
					}
				}
			}
		} else if (opcode == 7) {
			if (facesByLabel != null) {
				for (int i_375_ = 0; i_375_ < i_324_; i_375_++) {
					int i_376_ = data[i_375_];
					if (i_376_ < facesByLabel.length) {
						int[] is_377_ = facesByLabel[i_376_];
						for (int i_378_ = 0; i_378_ < is_377_.length; i_378_++) {
							int i_379_ = is_377_[i_378_];
							int i_380_ = facesColors[i_379_] & 0xffff;
							int i_381_ = i_380_ >> 10 & 0x3f;
							int i_382_ = i_380_ >> 7 & 0x7;
							int i_383_ = i_380_ & 0x7f;
							i_381_ = i_381_ + var3 & 0x3f;
							i_382_ += var4;
							if (i_382_ < 0)
								i_382_ = 0;
							else if (i_382_ > 7)
								i_382_ = 7;
							i_383_ += var5;
							if (i_383_ < 0)
								i_383_ = 0;
							else if (i_383_ > 127)
								i_383_ = 127;
							facesColors[i_379_] = (short) (i_381_ << 10 | i_382_ << 7 | i_383_);
						}
						f_ab = true;
					}
				}
				if (aClass112Array5263 != null) {
					for (int i_384_ = 0; i_384_ < anInt5262; i_384_++) {
						Class112 class112 = aClass112Array5263[i_384_];
						Class145 class145 = f_lb[i_384_];
						((Class145) class145).anInt2106 = (((Class145) class145).anInt2106 & ~0xffffff
								| ((Entity.f_eb[Class_e.method594(125,
										((facesColors[(((Class112) class112).anInt1586)]) & 0xffff)) & 0xffff])
										& 0xffffff));
					}
				}
			}
		} else if (opcode == 8) {
			if (anIntArrayArray5296 != null) {
				for (int i_385_ = 0; i_385_ < i_324_; i_385_++) {
					int i_386_ = data[i_385_];
					if (i_386_ < anIntArrayArray5296.length) {
						int[] is_387_ = anIntArrayArray5296[i_386_];
						for (int i_388_ = 0; i_388_ < is_387_.length; i_388_++) {
							Class145 class145 = f_lb[is_387_[i_388_]];
							((Class145) class145).anInt2109 += var3;
							((Class145) class145).anInt2101 += var4;
						}
					}
				}
			}
		} else if (opcode == 10) {
			if (anIntArrayArray5296 != null) {
				for (int i_389_ = 0; i_389_ < i_324_; i_389_++) {
					int i_390_ = data[i_389_];
					if (i_390_ < anIntArrayArray5296.length) {
						int[] is_391_ = anIntArrayArray5296[i_390_];
						for (int i_392_ = 0; i_392_ < is_391_.length; i_392_++) {
							Class145 class145 = f_lb[is_391_[i_392_]];
							((Class145) class145).anInt2098 = (((Class145) class145).anInt2098 * var3 >> 7);
							((Class145) class145).anInt2102 = (((Class145) class145).anInt2102 * var4 >> 7);
						}
					}
				}
			}
		} else if (opcode == 9) {
			if (anIntArrayArray5296 != null) {
				for (int i_393_ = 0; i_393_ < i_324_; i_393_++) {
					int i_394_ = data[i_393_];
					if (i_394_ < anIntArrayArray5296.length) {
						int[] is_395_ = anIntArrayArray5296[i_394_];
						for (int i_396_ = 0; i_396_ < is_395_.length; i_396_++) {
							Class145 class145 = f_lb[is_395_[i_396_]];
							((Class145) class145).anInt2113 = (((Class145) class145).anInt2113 + var3 & 0x3fff);
						}
					}
				}
			}
		}
	}

	public static void method2234() {
		f_rc = null;
	}

	final Class19[] method672() {
		return aClass19Array5256;
	}

	final void Z(int i) {
		if ((anInt5253 & 0x6) != 6)
			throw new IllegalStateException();
		int i_397_ = MathUtils.SINE[i];
		int i_398_ = MathUtils.COSINE[i];
		for (int i_399_ = 0; i_399_ < anInt5254; i_399_++) {
			int i_400_ = (vertex_position_y[i_399_] * i_398_ - vertex_position_z[i_399_] * i_397_ >> 15);
			vertex_position_z[i_399_] = (vertex_position_y[i_399_] * i_397_ + vertex_position_z[i_399_] * i_398_ >> 15);
			vertex_position_y[i_399_] = i_400_;
		}
		method2228();
	}

	final void h(int i, int contour, Class210 class210, Class210 class210_402_, int i_403_, int i_404_, int i_405_) {
		if (i == 3) {
			if ((anInt5253 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt5253 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool5314)
			method2244();
		int i_406_ = i_403_ + aShort5271;
		int i_407_ = i_403_ + aShort5267;
		int i_408_ = i_405_ + f_ob;
		int i_409_ = i_405_ + aShort5250;
		if (i == 4 || (i_406_ >= 0 && ((i_407_
				+ ((Class210) class210).anInt2955 >> ((Class210) class210).anInt2950) < ((Class210) class210).anInt2956)
				&& i_408_ >= 0 && ((i_409_
						+ ((Class210) class210).anInt2955 >> ((Class210) class210).anInt2950) < ((Class210) class210).anInt2952))) {
			int[][] is = (((Class210_Sub1) (Class210_Sub1) class210).anIntArrayArray4156);
			int[][] is_410_ = null;
			if (class210_402_ != null)
				is_410_ = (((Class210_Sub1) (Class210_Sub1) class210_402_).anIntArrayArray4156);
			if (i == 4 || i == 5) {
				if (class210_402_ == null || (i_406_ < 0 || ((i_407_
						+ ((Class210) class210_402_).anInt2955 >> ((Class210) class210_402_).anInt2950) >= ((Class210) class210_402_).anInt2956)
						|| i_408_ < 0 || ((i_409_
								+ ((Class210) class210_402_).anInt2955 >> ((Class210) class210_402_).anInt2950) >= ((Class210) class210_402_).anInt2952)))
					return;
			} else {
				i_406_ >>= ((Class210) class210).anInt2950;
				i_407_ = (i_407_ + (((Class210) class210).anInt2955 - 1) >> ((Class210) class210).anInt2950);
				i_408_ >>= ((Class210) class210).anInt2950;
				i_409_ = (i_409_ + (((Class210) class210).anInt2955 - 1) >> ((Class210) class210).anInt2950);
				if (is[i_406_][i_408_] == i_404_ && is[i_407_][i_408_] == i_404_ && is[i_406_][i_409_] == i_404_
						&& is[i_407_][i_409_] == i_404_)
					return;
			}
			if (i == 1) {
				int i_411_ = ((Class210) class210).anInt2955 - 1;
				for (int i_412_ = 0; i_412_ < vertices; i_412_++) {
					int i_413_ = vertex_position_x[i_412_] + i_403_;
					int i_414_ = vertex_position_z[i_412_] + i_405_;
					int i_415_ = i_413_ & i_411_;
					int i_416_ = i_414_ & i_411_;
					int i_417_ = i_413_ >> ((Class210) class210).anInt2950;
					int i_418_ = i_414_ >> ((Class210) class210).anInt2950;
					int i_419_ = (((is[i_417_][i_418_] * (((Class210) class210).anInt2955 - i_415_))
							+ is[i_417_ + 1][i_418_] * i_415_) >> ((Class210) class210).anInt2950);
					int i_420_ = (((is[i_417_][i_418_ + 1] * (((Class210) class210).anInt2955 - i_415_))
							+ is[i_417_ + 1][i_418_ + 1] * i_415_) >> ((Class210) class210).anInt2950);
					int i_421_ = (i_419_ * (((Class210) class210).anInt2955 - i_416_)
							+ i_420_ * i_416_ >> ((Class210) class210).anInt2950);
					vertex_position_y[i_412_] = vertex_position_y[i_412_] + i_421_ - i_404_;
				}
				for (int i_422_ = vertices; i_422_ < anInt5254; i_422_++) {
					int i_423_ = vertex_position_x[i_422_] + i_403_;
					int i_424_ = vertex_position_z[i_422_] + i_405_;
					int i_425_ = i_423_ & i_411_;
					int i_426_ = i_424_ & i_411_;
					int i_427_ = i_423_ >> ((Class210) class210).anInt2950;
					int i_428_ = i_424_ >> ((Class210) class210).anInt2950;
					if (i_427_ >= 0 && i_427_ < is.length - 1 && i_428_ >= 0 && i_428_ < is[0].length - 1) {
						int i_429_ = (((is[i_427_][i_428_] * (((Class210) class210).anInt2955 - i_425_))
								+ is[i_427_ + 1][i_428_] * i_425_) >> ((Class210) class210).anInt2950);
						int i_430_ = (((is[i_427_][i_428_ + 1] * (((Class210) class210).anInt2955 - i_425_))
								+ is[i_427_ + 1][i_428_ + 1] * i_425_) >> ((Class210) class210).anInt2950);
						int i_431_ = (i_429_ * (((Class210) class210).anInt2955 - i_426_)
								+ i_430_ * i_426_ >> ((Class210) class210).anInt2950);
						vertex_position_y[i_422_] = vertex_position_y[i_422_] + i_431_ - i_404_;
					}
				}
			} else if (i == 2) {
				int i_432_ = ((Class210) class210).anInt2955 - 1;
				for (int i_433_ = 0; i_433_ < vertices; i_433_++) {
					int i_434_ = (vertex_position_y[i_433_] << 16) / aShort5300;
					if (i_434_ < contour) {
						int i_435_ = vertex_position_x[i_433_] + i_403_;
						int i_436_ = vertex_position_z[i_433_] + i_405_;
						int i_437_ = i_435_ & i_432_;
						int i_438_ = i_436_ & i_432_;
						int i_439_ = i_435_ >> ((Class210) class210).anInt2950;
						int i_440_ = i_436_ >> ((Class210) class210).anInt2950;
						int i_441_ = (((is[i_439_][i_440_] * (((Class210) class210).anInt2955 - i_437_))
								+ is[i_439_ + 1][i_440_] * i_437_) >> ((Class210) class210).anInt2950);
						int i_442_ = (((is[i_439_][i_440_ + 1] * (((Class210) class210).anInt2955 - i_437_))
								+ is[i_439_ + 1][i_440_ + 1] * i_437_) >> ((Class210) class210).anInt2950);
						int i_443_ = (i_441_ * (((Class210) class210).anInt2955 - i_438_)
								+ i_442_ * i_438_ >> ((Class210) class210).anInt2950);
						vertex_position_y[i_433_] = vertex_position_y[i_433_]
								+ ((i_443_ - i_404_) * (contour - i_434_) / contour);
					} else
						vertex_position_y[i_433_] = vertex_position_y[i_433_];
				}
				for (int i_444_ = vertices; i_444_ < anInt5254; i_444_++) {
					int i_445_ = (vertex_position_y[i_444_] << 16) / aShort5300;
					if (i_445_ < contour) {
						int i_446_ = vertex_position_x[i_444_] + i_403_;
						int i_447_ = vertex_position_z[i_444_] + i_405_;
						int i_448_ = i_446_ & i_432_;
						int i_449_ = i_447_ & i_432_;
						int i_450_ = i_446_ >> ((Class210) class210).anInt2950;
						int i_451_ = i_447_ >> ((Class210) class210).anInt2950;
						if (i_450_ >= 0 && i_450_ < ((Class210) class210).anInt2956 - 1 && i_451_ >= 0
								&& i_451_ < ((Class210) class210).anInt2952 - 1) {
							int i_452_ = (((is[i_450_][i_451_] * (((Class210) class210).anInt2955 - i_448_))
									+ is[i_450_ + 1][i_451_] * i_448_) >> ((Class210) class210).anInt2950);
							int i_453_ = (((is[i_450_][i_451_ + 1] * (((Class210) class210).anInt2955 - i_448_))
									+ is[i_450_ + 1][i_451_ + 1] * i_448_) >> ((Class210) class210).anInt2950);
							int i_454_ = (i_452_ * (((Class210) class210).anInt2955 - i_449_)
									+ i_453_ * i_449_ >> ((Class210) class210).anInt2950);
							vertex_position_y[i_444_] = vertex_position_y[i_444_]
									+ ((i_454_ - i_404_) * (contour - i_445_) / contour);
						}
					} else
						vertex_position_y[i_444_] = vertex_position_y[i_444_];
				}
			} else if (i == 3) {
				int i_455_ = (contour & 0xff) * 4;
				int i_456_ = (contour >> 8 & 0xff) * 4;
				int i_457_ = (contour >> 16 & 0xff) << 6;
				int i_458_ = (contour >> 24 & 0xff) << 6;
				if (i_403_ - (i_455_ >> 1) < 0 || ((i_403_ + (i_455_ >> 1)
						+ ((Class210) class210).anInt2955) >= (((Class210) class210).anInt2956 << ((Class210) class210).anInt2950))
						|| i_405_ - (i_456_ >> 1) < 0 || ((i_405_ + (i_456_ >> 1)
								+ ((Class210) class210).anInt2955) >= (((Class210) class210).anInt2952 << ((Class210) class210).anInt2950)))
					return;
				this.method675(16384, i_403_, i_405_, i_456_, i_457_, class210, i_455_, i_458_, i_404_);
			} else if (i == 4) {
				int i_459_ = ((Class210) class210_402_).anInt2955 - 1;
				int i_460_ = f_vb - aShort5300;
				for (int i_461_ = 0; i_461_ < vertices; i_461_++) {
					int i_462_ = vertex_position_x[i_461_] + i_403_;
					int i_463_ = vertex_position_z[i_461_] + i_405_;
					int i_464_ = i_462_ & i_459_;
					int i_465_ = i_463_ & i_459_;
					int i_466_ = i_462_ >> ((Class210) class210_402_).anInt2950;
					int i_467_ = i_463_ >> ((Class210) class210_402_).anInt2950;
					int i_468_ = (((is_410_[i_466_][i_467_] * (((Class210) class210_402_).anInt2955 - i_464_))
							+ is_410_[i_466_ + 1][i_467_] * i_464_) >> ((Class210) class210_402_).anInt2950);
					int i_469_ = (((is_410_[i_466_][i_467_ + 1] * (((Class210) class210_402_).anInt2955 - i_464_))
							+ is_410_[i_466_ + 1][i_467_ + 1] * i_464_) >> ((Class210) class210_402_).anInt2950);
					int i_470_ = (i_468_ * (((Class210) class210_402_).anInt2955 - i_465_)
							+ i_469_ * i_465_ >> ((Class210) class210_402_).anInt2950);
					vertex_position_y[i_461_] = vertex_position_y[i_461_] + (i_470_ - i_404_) + i_460_;
				}
				for (int i_471_ = vertices; i_471_ < anInt5254; i_471_++) {
					int i_472_ = vertex_position_x[i_471_] + i_403_;
					int i_473_ = vertex_position_z[i_471_] + i_405_;
					int i_474_ = i_472_ & i_459_;
					int i_475_ = i_473_ & i_459_;
					int i_476_ = i_472_ >> ((Class210) class210_402_).anInt2950;
					int i_477_ = i_473_ >> ((Class210) class210_402_).anInt2950;
					if (i_476_ >= 0 && i_476_ < ((Class210) class210_402_).anInt2956 - 1 && i_477_ >= 0
							&& i_477_ < ((Class210) class210_402_).anInt2952 - 1) {
						int i_478_ = (((is_410_[i_476_][i_477_] * (((Class210) class210_402_).anInt2955 - i_474_))
								+ is_410_[i_476_ + 1][i_477_] * i_474_) >> ((Class210) class210_402_).anInt2950);
						int i_479_ = (((is_410_[i_476_][i_477_ + 1] * (((Class210) class210_402_).anInt2955 - i_474_))
								+ is_410_[i_476_ + 1][i_477_ + 1] * i_474_) >> ((Class210) class210_402_).anInt2950);
						int i_480_ = (i_478_ * (((Class210) class210_402_).anInt2955 - i_475_)
								+ i_479_ * i_475_ >> ((Class210) class210_402_).anInt2950);
						vertex_position_y[i_471_] = vertex_position_y[i_471_] + (i_480_ - i_404_) + i_460_;
					}
				}
			} else if (i == 5) {
				int i_481_ = ((Class210) class210_402_).anInt2955 - 1;
				int i_482_ = f_vb - aShort5300;
				for (int i_483_ = 0; i_483_ < vertices; i_483_++) {
					int i_484_ = vertex_position_x[i_483_] + i_403_;
					int i_485_ = vertex_position_z[i_483_] + i_405_;
					int i_486_ = i_484_ & i_481_;
					int i_487_ = i_485_ & i_481_;
					int i_488_ = i_484_ >> ((Class210) class210).anInt2950;
					int i_489_ = i_485_ >> ((Class210) class210).anInt2950;
					int i_490_ = (((is[i_488_][i_489_] * (((Class210) class210).anInt2955 - i_486_))
							+ is[i_488_ + 1][i_489_] * i_486_) >> ((Class210) class210).anInt2950);
					int i_491_ = (((is[i_488_][i_489_ + 1] * (((Class210) class210).anInt2955 - i_486_))
							+ is[i_488_ + 1][i_489_ + 1] * i_486_) >> ((Class210) class210).anInt2950);
					int i_492_ = (i_490_ * (((Class210) class210).anInt2955 - i_487_)
							+ i_491_ * i_487_ >> ((Class210) class210).anInt2950);
					i_490_ = (((is_410_[i_488_][i_489_] * (((Class210) class210_402_).anInt2955 - i_486_))
							+ is_410_[i_488_ + 1][i_489_] * i_486_) >> ((Class210) class210_402_).anInt2950);
					i_491_ = (((is_410_[i_488_][i_489_ + 1] * (((Class210) class210_402_).anInt2955 - i_486_))
							+ is_410_[i_488_ + 1][i_489_ + 1] * i_486_) >> ((Class210) class210_402_).anInt2950);
					int i_493_ = (i_490_ * (((Class210) class210_402_).anInt2955 - i_487_)
							+ i_491_ * i_487_ >> ((Class210) class210_402_).anInt2950);
					int i_494_ = i_492_ - i_493_;
					vertex_position_y[i_483_] = ((vertex_position_y[i_483_] << 8) / i_482_ * i_494_ >> 8)
							- (i_404_ - i_492_);
				}
				for (int i_495_ = vertices; i_495_ < anInt5254; i_495_++) {
					int i_496_ = vertex_position_x[i_495_] + i_403_;
					int i_497_ = vertex_position_z[i_495_] + i_405_;
					int i_498_ = i_496_ & i_481_;
					int i_499_ = i_497_ & i_481_;
					int i_500_ = i_496_ >> ((Class210) class210).anInt2950;
					int i_501_ = i_497_ >> ((Class210) class210).anInt2950;
					if (i_500_ >= 0 && i_500_ < ((Class210) class210).anInt2956 - 1
							&& i_500_ < ((Class210) class210_402_).anInt2956 - 1 && i_501_ >= 0
							&& i_501_ < ((Class210) class210).anInt2952 - 1
							&& i_501_ < ((Class210) class210_402_).anInt2952 - 1) {
						int i_502_ = (((is[i_500_][i_501_] * (((Class210) class210).anInt2955 - i_498_))
								+ is[i_500_ + 1][i_501_] * i_498_) >> ((Class210) class210).anInt2950);
						int i_503_ = (((is[i_500_][i_501_ + 1] * (((Class210) class210).anInt2955 - i_498_))
								+ is[i_500_ + 1][i_501_ + 1] * i_498_) >> ((Class210) class210).anInt2950);
						int i_504_ = (i_502_ * (((Class210) class210).anInt2955 - i_499_)
								+ i_503_ * i_499_ >> ((Class210) class210).anInt2950);
						i_502_ = (((is_410_[i_500_][i_501_] * (((Class210) class210_402_).anInt2955 - i_498_))
								+ is_410_[i_500_ + 1][i_501_] * i_498_) >> ((Class210) class210_402_).anInt2950);
						i_503_ = (((is_410_[i_500_][i_501_ + 1] * (((Class210) class210_402_).anInt2955 - i_498_))
								+ is_410_[i_500_ + 1][i_501_ + 1] * i_498_) >> ((Class210) class210_402_).anInt2950);
						int i_505_ = (i_502_ * (((Class210) class210_402_).anInt2955 - i_499_)
								+ i_503_ * i_499_ >> ((Class210) class210_402_).anInt2950);
						int i_506_ = i_504_ - i_505_;
						vertex_position_y[i_495_] = ((vertex_position_y[i_495_] << 8) / i_482_ * i_506_ >> 8)
								- (i_404_ - i_504_);
					}
				}
			}
			aBool5314 = false;
		}
	}

	private final void method2235(boolean bool, boolean bool_507_, int i, boolean bool_508_, int i_509_) {
		int i_510_;
		if (i + 2 > 2200) {
			i_510_ = 1 + Class179.method1169(i, (byte) -14) - f_rb;
			i = (i >> i_510_) + 2;
		} else {
			i_510_ = 0;
			i += 2;
		}
		for (int i_511_ = 0; i_511_ < 2200; i_511_++)
			f_jc[i_511_] = 0;
		int i_512_ = 0;
		if (aClass112Array5263 != null) {
			for (int i_513_ = 0; i_513_ < anInt5262; i_513_++) {
				Class112 class112 = aClass112Array5263[i_513_];
				f_ec[((Class112) class112).anInt1586] = i_513_;
			}
		}
		for (int i_514_ = 0; i_514_ < faces; i_514_++) {
			if (hue_c[i_514_] != -2) {
				int i_515_ = texture_edge_a[i_514_];
				int i_516_ = texture_edge_b[i_514_];
				int i_517_ = texture_edge_c[i_514_];
				int i_518_ = f_ic[i_515_];
				int i_519_ = f_ic[i_516_];
				int i_520_ = f_ic[i_517_];
				if (bool && (i_518_ == -5000 || i_519_ == -5000 || i_520_ == -5000)) {
					int i_521_ = anIntArray5288[i_515_];
					int i_522_ = anIntArray5288[i_516_];
					int i_523_ = anIntArray5288[i_517_];
					int i_524_ = anIntArray5304[i_515_];
					int i_525_ = anIntArray5304[i_516_];
					int i_526_ = anIntArray5304[i_517_];
					int i_527_ = anIntArray5303[i_515_];
					int i_528_ = anIntArray5303[i_516_];
					int i_529_ = anIntArray5303[i_517_];
					i_521_ -= i_522_;
					i_523_ -= i_522_;
					i_524_ -= i_525_;
					i_526_ -= i_525_;
					i_527_ -= i_528_;
					i_529_ -= i_528_;
					int i_530_ = i_524_ * i_529_ - i_527_ * i_526_;
					int i_531_ = i_527_ * i_523_ - i_521_ * i_529_;
					int i_532_ = i_521_ * i_526_ - i_524_ * i_523_;
					if (i_522_ * i_530_ + i_525_ * i_531_ + i_528_ * i_532_ > 0) {
						f_qc[i_514_] = true;
						int i_533_ = ((f_qb[i_515_] + f_qb[i_516_] + f_qb[i_517_]) / 3 >> i_510_);
						if (f_jc[i_533_] < 64)
							f_lc[i_533_][f_jc[i_533_]++] = i_514_;
						else {
							int i_534_ = f_jc[i_533_];
							if (i_534_ == 64) {
								if (i_512_ == 512)
									continue;
								anIntArray5308[i_512_] = 0;
								f_jc[i_533_] = i_534_ = 65 + i_512_++;
							}
							i_534_ -= 65;
							f_tb[i_534_][anIntArray5308[i_534_]++] = i_514_;
						}
					}
				} else if (f_ec[i_514_] != -1 || ((i_518_ - i_519_) * (anIntArray5279[i_517_] - anIntArray5279[i_516_])
						- ((anIntArray5279[i_515_] - anIntArray5279[i_516_]) * (i_520_ - i_519_))) > 0) {
					f_qc[i_514_] = false;
					if (i_518_ < 0 || i_519_ < 0 || i_520_ < 0 || i_518_ > ((Class36) aClass36_5272).anInt530
							|| i_519_ > ((Class36) aClass36_5272).anInt530
							|| i_520_ > ((Class36) aClass36_5272).anInt530)
						f_wb[i_514_] = true;
					else
						f_wb[i_514_] = false;
					int i_535_ = ((f_qb[i_515_] + f_qb[i_516_] + f_qb[i_517_]) / 3 >> i_510_);
					if (f_jc[i_535_] < 64)
						f_lc[i_535_][f_jc[i_535_]++] = i_514_;
					else {
						int i_536_ = f_jc[i_535_];
						if (i_536_ == 64) {
							if (i_512_ == 512)
								continue;
							anIntArray5308[i_512_] = 0;
							f_jc[i_535_] = i_536_ = 65 + i_512_++;
						}
						i_536_ -= 65;
						f_tb[i_536_][anIntArray5308[i_536_]++] = i_514_;
					}
				}
			}
		}
		if (bool_508_) {
			int i_537_ = 0;
			for (/**/; i_537_ < i_509_; i_537_++) {
				int i_538_ = anIntArray5251[i_537_] >> i_510_;
				if (i_538_ >= 0 && i_538_ < 2200) {
					if (f_jc[i_538_] < 64)
						f_lc[i_538_][f_jc[i_538_]++] = i_537_ + 1 << 16;
					else {
						int i_539_ = f_jc[i_538_];
						if (i_539_ == 64) {
							if (i_512_ == 512)
								continue;
							anIntArray5308[i_512_] = 0;
							f_jc[i_538_] = i_539_ = 65 + i_512_++;
						}
						i_539_ -= 65;
						f_tb[i_539_][anIntArray5308[i_539_]++] = i_537_ + 1 << 16;
					}
				}
			}
		}
		if (f_sb == null) {
			if (bool_508_ || aClass112Array5263 != null) {
				if (bool_507_) {
					for (int i_540_ = i - 1; i_540_ >= 0; i_540_--) {
						int i_541_ = f_jc[i_540_];
						if (i_541_ > 0) {
							int i_542_ = i_541_ > 64 ? 64 : i_541_;
							int[] is = f_lc[i_540_];
							for (int i_543_ = 0; i_543_ < i_542_; i_543_++) {
								int i_544_ = is[i_543_];
								if (i_544_ < 65536) {
									int i_545_ = f_ec[i_544_];
									if (i_545_ == -1 || !((Class112) (aClass112Array5263[i_545_])).aBool1578)
										method2241(i_544_);
								}
							}
						}
						if (i_541_ > 64) {
							int i_546_ = f_jc[i_540_] - 64 - 1;
							int[] is = f_tb[i_546_];
							for (int i_547_ = 0; i_547_ < anIntArray5308[i_546_]; i_547_++) {
								int i_548_ = is[i_547_];
								if (i_548_ < 65536) {
									int i_549_ = f_ec[i_548_];
									if (i_549_ == -1 || !((Class112) (aClass112Array5263[i_549_])).aBool1578)
										method2241(i_548_);
								}
							}
						}
					}
				} else {
					for (int i_550_ = i - 1; i_550_ >= 0; i_550_--) {
						int i_551_ = f_jc[i_550_];
						if (i_551_ > 0) {
							int i_552_ = i_551_ > 64 ? 64 : i_551_;
							int[] is = f_lc[i_550_];
							for (int i_553_ = 0; i_553_ < i_552_; i_553_++) {
								int i_554_ = is[i_553_];
								if (i_554_ < 65536) {
									int i_555_ = f_ec[i_554_];
									if (i_555_ != -1) {
										Class112 class112 = aClass112Array5263[i_555_];
										Class145 class145 = f_lb[i_555_];
										if (!((Class112) class112).aBool1578)
											apply_texture(i_554_);
										f_ub.method1804(((Class145) class145).anInt2100,
												((Class145) class145).anInt2111, ((Class145) class145).anInt2103,
												((Class145) class145).anInt2105, ((Class145) class145).anInt2113,
												(((Class112) class112).aShort1583 & 0xffff),
												((Class145) class145).anInt2106, ((Class112) class112).aByte1590,
												((Class112) class112).aByte1584);
									} else
										apply_texture(is[i_553_]);
								} else {
									int i_556_ = (i_554_ >> 16) - 1;
									Class130_Sub1_Sub1 class130_sub1_sub1 = aClass130_Sub1_Sub1Array5273[i_556_];
									int i_557_ = anIntArray5294[i_556_];
									if (i_557_ == 0)
										i_557_ = 1;
									f_ub.method1801(class130_sub1_sub1, f_oc[i_556_], f_pc[i_556_],
											((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038) >> 2) / i_557_);
								}
							}
						}
						if (i_551_ > 64) {
							int i_558_ = f_jc[i_550_] - 64 - 1;
							int[] is = f_tb[i_558_];
							for (int i_559_ = 0; i_559_ < anIntArray5308[i_558_]; i_559_++) {
								int i_560_ = is[i_559_];
								if (i_560_ < 65536) {
									int i_561_ = f_ec[i_560_];
									if (i_561_ != -1) {
										Class112 class112 = aClass112Array5263[i_561_];
										Class145 class145 = f_lb[i_561_];
										if (!((Class112) class112).aBool1578)
											apply_texture(i_560_);
										f_ub.method1804(((Class145) class145).anInt2100,
												((Class145) class145).anInt2111, ((Class145) class145).anInt2103,
												((Class145) class145).anInt2105, ((Class145) class145).anInt2113,
												(((Class112) class112).aShort1583 & 0xffff),
												((Class145) class145).anInt2106, ((Class112) class112).aByte1590,
												((Class112) class112).aByte1584);
									} else
										apply_texture(is[i_559_]);
								} else {
									int i_562_ = (i_560_ >> 16) - 1;
									Class130_Sub1_Sub1 class130_sub1_sub1 = aClass130_Sub1_Sub1Array5273[i_562_];
									int i_563_ = anIntArray5294[i_562_];
									if (i_563_ == 0)
										i_563_ = 1;
									f_ub.method1801(class130_sub1_sub1, f_oc[i_562_], f_pc[i_562_],
											((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038) >> 2) / i_563_);
								}
							}
						}
					}
				}
			} else if (bool_507_) {
				for (int i_564_ = i - 1; i_564_ >= 0; i_564_--) {
					int i_565_ = f_jc[i_564_];
					if (i_565_ > 0) {
						int i_566_ = i_565_ > 64 ? 64 : i_565_;
						int[] is = f_lc[i_564_];
						for (int i_567_ = 0; i_567_ < i_566_; i_567_++)
							method2241(is[i_567_]);
					}
					if (i_565_ > 64) {
						int i_568_ = f_jc[i_564_] - 64 - 1;
						int[] is = f_tb[i_568_];
						for (int i_569_ = 0; i_569_ < anIntArray5308[i_568_]; i_569_++)
							method2241(is[i_569_]);
					}
				}
			} else {
				for (int i_570_ = i - 1; i_570_ >= 0; i_570_--) {
					int i_571_ = f_jc[i_570_];
					if (i_571_ > 0) {
						int i_572_ = i_571_ > 64 ? 64 : i_571_;
						int[] is = f_lc[i_570_];
						for (int i_573_ = 0; i_573_ < i_572_; i_573_++)
							apply_texture(is[i_573_]);
					}
					if (i_571_ > 64) {
						int i_574_ = f_jc[i_570_] - 64 - 1;
						int[] is = f_tb[i_574_];
						for (int i_575_ = 0; i_575_ < anIntArray5308[i_574_]; i_575_++)
							apply_texture(is[i_575_]);
					}
				}
			}
		} else {
			for (int i_576_ = 0; i_576_ < 12; i_576_++) {
				anIntArray5268[i_576_] = 0;
				anIntArray5305[i_576_] = 0;
			}
			if (bool_508_) {
				for (int i_577_ = i - 1; i_577_ >= 0; i_577_--) {
					int i_578_ = f_jc[i_577_];
					if (i_578_ > 0) {
						int i_579_;
						if (i_578_ > 64)
							i_579_ = 64;
						else
							i_579_ = i_578_;
						int[] is = f_lc[i_577_];
						for (int i_580_ = 0; i_580_ < i_579_; i_580_++) {
							int i_581_ = is[i_580_];
							if (i_581_ < 65536) {
								byte i_582_ = f_sb[i_581_];
								int i_583_ = anIntArray5268[i_582_]++;
								anIntArrayArray5270[i_582_][i_583_] = i_581_;
								if (i_582_ < 10)
									anIntArray5305[i_582_] += i_577_;
								else if (i_582_ == 10)
									anIntArray5293[i_583_] = i_577_;
								else
									anIntArray5311[i_583_] = i_577_;
							} else {
								byte i_584_ = (((Class130_Sub1_Sub1) (aClass130_Sub1_Sub1Array5273[(i_581_ >> 16)
										- 1])).aByte7041);
								int i_585_ = anIntArray5268[i_584_]++;
								anIntArrayArray5270[i_584_][i_585_] = i_581_;
								if (i_584_ < 10)
									anIntArray5305[i_584_] += i_577_;
								else if (i_584_ == 10)
									anIntArray5293[i_585_] = i_577_;
								else
									anIntArray5311[i_585_] = i_577_;
							}
						}
					}
					if (i_578_ > 64) {
						int i_586_ = f_jc[i_577_] - 64 - 1;
						int[] is = f_tb[i_586_];
						for (int i_587_ = 0; i_587_ < anIntArray5308[i_586_]; i_587_++) {
							int i_588_ = is[i_587_];
							if (i_588_ < 65536) {
								byte i_589_ = f_sb[i_588_];
								int i_590_ = anIntArray5268[i_589_]++;
								anIntArrayArray5270[i_589_][i_590_] = i_588_;
								if (i_589_ < 10)
									anIntArray5305[i_589_] += i_577_;
								else if (i_589_ == 10)
									anIntArray5293[i_590_] = i_577_;
								else
									anIntArray5311[i_590_] = i_577_;
							} else {
								byte i_591_ = (((Class130_Sub1_Sub1) (aClass130_Sub1_Sub1Array5273[(i_588_ >> 16)
										- 1])).aByte7041);
								int i_592_ = anIntArray5268[i_591_]++;
								anIntArrayArray5270[i_591_][i_592_] = i_588_;
								if (i_591_ < 10)
									anIntArray5305[i_591_] += i_577_;
								else if (i_591_ == 10)
									anIntArray5293[i_592_] = i_577_;
								else
									anIntArray5311[i_592_] = i_577_;
							}
						}
					}
				}
			} else {
				for (int i_593_ = i - 1; i_593_ >= 0; i_593_--) {
					int i_594_ = f_jc[i_593_];
					if (i_594_ > 0) {
						int i_595_;
						if (i_594_ > 64)
							i_595_ = 64;
						else
							i_595_ = i_594_;
						int[] is = f_lc[i_593_];
						for (int i_596_ = 0; i_596_ < i_595_; i_596_++) {
							int i_597_ = is[i_596_];
							byte i_598_ = f_sb[i_597_];
							int i_599_ = anIntArray5268[i_598_]++;
							anIntArrayArray5270[i_598_][i_599_] = i_597_;
							if (i_598_ < 10)
								anIntArray5305[i_598_] += i_593_;
							else if (i_598_ == 10)
								anIntArray5293[i_599_] = i_593_;
							else
								anIntArray5311[i_599_] = i_593_;
						}
					}
					if (i_594_ > 64) {
						int i_600_ = f_jc[i_593_] - 64 - 1;
						int[] is = f_tb[i_600_];
						for (int i_601_ = 0; i_601_ < anIntArray5308[i_600_]; i_601_++) {
							int i_602_ = is[i_601_];
							byte i_603_ = f_sb[i_602_];
							int i_604_ = anIntArray5268[i_603_]++;
							anIntArrayArray5270[i_603_][i_604_] = i_602_;
							if (i_603_ < 10)
								anIntArray5305[i_603_] += i_593_;
							else if (i_603_ == 10)
								anIntArray5293[i_604_] = i_593_;
							else
								anIntArray5311[i_604_] = i_593_;
						}
					}
				}
			}
			int i_605_ = 0;
			if (anIntArray5268[1] > 0 || anIntArray5268[2] > 0)
				i_605_ = ((anIntArray5305[1] + anIntArray5305[2]) / (anIntArray5268[1] + anIntArray5268[2]));
			int i_606_ = 0;
			if (anIntArray5268[3] > 0 || anIntArray5268[4] > 0)
				i_606_ = ((anIntArray5305[3] + anIntArray5305[4]) / (anIntArray5268[3] + anIntArray5268[4]));
			int i_607_ = 0;
			if (anIntArray5268[6] > 0 || anIntArray5268[8] > 0)
				i_607_ = ((anIntArray5305[6] + anIntArray5305[8]) / (anIntArray5268[6] + anIntArray5268[8]));
			int i_608_ = 0;
			int i_609_ = anIntArray5268[10];
			int[] is = anIntArrayArray5270[10];
			int[] is_610_ = anIntArray5293;
			if (i_608_ == i_609_) {
				i_608_ = 0;
				i_609_ = anIntArray5268[11];
				is = anIntArrayArray5270[11];
				is_610_ = anIntArray5311;
			}
			int i_611_;
			if (i_608_ < i_609_)
				i_611_ = is_610_[i_608_];
			else
				i_611_ = -1000;
			for (int i_612_ = 0; i_612_ < 10; i_612_++) {
				if (bool_507_) {
					while (i_612_ == 0) {
						if (i_611_ <= i_605_)
							break;
						int i_613_ = is[i_608_++];
						if (i_613_ < 65536) {
							int i_614_ = f_ec[i_613_];
							if (i_614_ == -1 || !(((Class112) aClass112Array5263[i_614_]).aBool1578))
								method2241(i_613_);
						}
						if (i_608_ == i_609_ && is != anIntArrayArray5270[11]) {
							i_608_ = 0;
							i_609_ = anIntArray5268[11];
							is = anIntArrayArray5270[11];
							is_610_ = anIntArray5311;
						}
						if (i_608_ < i_609_)
							i_611_ = is_610_[i_608_];
						else
							i_611_ = -1000;
					}
					while (i_612_ == 3) {
						if (i_611_ <= i_606_)
							break;
						int i_615_ = is[i_608_++];
						if (i_615_ < 65536) {
							int i_616_ = f_ec[i_615_];
							if (i_616_ == -1 || !(((Class112) aClass112Array5263[i_616_]).aBool1578))
								method2241(i_615_);
						}
						if (i_608_ == i_609_ && is != anIntArrayArray5270[11]) {
							i_608_ = 0;
							i_609_ = anIntArray5268[11];
							is = anIntArrayArray5270[11];
							is_610_ = anIntArray5311;
						}
						if (i_608_ < i_609_)
							i_611_ = is_610_[i_608_];
						else
							i_611_ = -1000;
					}
					while (i_612_ == 5) {
						if (i_611_ <= i_607_)
							break;
						int i_617_ = is[i_608_++];
						if (i_617_ < 65536) {
							int i_618_ = f_ec[i_617_];
							if (i_618_ == -1 || !(((Class112) aClass112Array5263[i_618_]).aBool1578))
								method2241(i_617_);
						}
						if (i_608_ == i_609_ && is != anIntArrayArray5270[11]) {
							i_608_ = 0;
							i_609_ = anIntArray5268[11];
							is = anIntArrayArray5270[11];
							is_610_ = anIntArray5311;
						}
						if (i_608_ < i_609_)
							i_611_ = is_610_[i_608_];
						else
							i_611_ = -1000;
					}
				} else {
					while (i_612_ == 0) {
						if (i_611_ <= i_605_)
							break;
						int i_619_ = is[i_608_++];
						if (i_619_ < 65536) {
							int i_620_ = f_ec[i_619_];
							if (i_620_ != -1) {
								Class112 class112 = aClass112Array5263[i_620_];
								Class145 class145 = f_lb[i_620_];
								if (!((Class112) class112).aBool1578)
									apply_texture(i_619_);
								f_ub.method1804(((Class145) class145).anInt2100, ((Class145) class145).anInt2111,
										((Class145) class145).anInt2103, ((Class145) class145).anInt2105,
										((Class145) class145).anInt2113, ((Class112) class112).aShort1583 & 0xffff,
										((Class145) class145).anInt2106, ((Class112) class112).aByte1590,
										((Class112) class112).aByte1584);
							} else
								apply_texture(i_619_);
						} else {
							int i_621_ = (i_619_ >> 16) - 1;
							Class130_Sub1_Sub1 class130_sub1_sub1 = aClass130_Sub1_Sub1Array5273[i_621_];
							int i_622_ = anIntArray5294[i_621_];
							if (i_622_ == 0)
								i_622_ = 1;
							f_ub.method1801(class130_sub1_sub1, f_oc[i_621_], f_pc[i_621_],
									(((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038 >> 2) / i_622_);
						}
						if (i_608_ == i_609_ && is != anIntArrayArray5270[11]) {
							i_608_ = 0;
							i_609_ = anIntArray5268[11];
							is = anIntArrayArray5270[11];
							is_610_ = anIntArray5311;
						}
						if (i_608_ < i_609_)
							i_611_ = is_610_[i_608_];
						else
							i_611_ = -1000;
					}
					while (i_612_ == 3) {
						if (i_611_ <= i_606_)
							break;
						int i_623_ = is[i_608_++];
						if (i_623_ < 65536) {
							int i_624_ = f_ec[i_623_];
							if (i_624_ != -1) {
								Class112 class112 = aClass112Array5263[i_624_];
								Class145 class145 = f_lb[i_624_];
								if (!((Class112) class112).aBool1578)
									apply_texture(i_623_);
								f_ub.method1804(((Class145) class145).anInt2100, ((Class145) class145).anInt2111,
										((Class145) class145).anInt2103, ((Class145) class145).anInt2105,
										((Class145) class145).anInt2113, ((Class112) class112).aShort1583 & 0xffff,
										((Class145) class145).anInt2106, ((Class112) class112).aByte1590,
										((Class112) class112).aByte1584);
							} else
								apply_texture(i_623_);
						} else {
							int i_625_ = (i_623_ >> 16) - 1;
							Class130_Sub1_Sub1 class130_sub1_sub1 = aClass130_Sub1_Sub1Array5273[i_625_];
							int i_626_ = anIntArray5294[i_625_];
							if (i_626_ == 0)
								i_626_ = 1;
							f_ub.method1801(class130_sub1_sub1, f_oc[i_625_], f_pc[i_625_],
									(((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038 >> 2) / i_626_);
						}
						if (i_608_ == i_609_ && is != anIntArrayArray5270[11]) {
							i_608_ = 0;
							i_609_ = anIntArray5268[11];
							is = anIntArrayArray5270[11];
							is_610_ = anIntArray5311;
						}
						if (i_608_ < i_609_)
							i_611_ = is_610_[i_608_];
						else
							i_611_ = -1000;
					}
					while (i_612_ == 5 && i_611_ > i_607_) {
						int i_627_ = is[i_608_++];
						if (i_627_ < 65536) {
							int i_628_ = f_ec[i_627_];
							if (i_628_ != -1) {
								Class112 class112 = aClass112Array5263[i_628_];
								Class145 class145 = f_lb[i_628_];
								if (!((Class112) class112).aBool1578)
									apply_texture(i_627_);
								f_ub.method1804(((Class145) class145).anInt2100, ((Class145) class145).anInt2111,
										((Class145) class145).anInt2103, ((Class145) class145).anInt2105,
										((Class145) class145).anInt2113, ((Class112) class112).aShort1583 & 0xffff,
										((Class145) class145).anInt2106, ((Class112) class112).aByte1590,
										((Class112) class112).aByte1584);
							} else
								apply_texture(i_627_);
						} else {
							int i_629_ = (i_627_ >> 16) - 1;
							Class130_Sub1_Sub1 class130_sub1_sub1 = aClass130_Sub1_Sub1Array5273[i_629_];
							int i_630_ = anIntArray5294[i_629_];
							if (i_630_ == 0)
								i_630_ = 1;
							f_ub.method1801(class130_sub1_sub1, f_oc[i_629_], f_pc[i_629_],
									(((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038 >> 2) / i_630_);
						}
						if (i_608_ == i_609_ && is != anIntArrayArray5270[11]) {
							i_608_ = 0;
							i_609_ = anIntArray5268[11];
							is = anIntArrayArray5270[11];
							is_610_ = anIntArray5311;
						}
						if (i_608_ < i_609_)
							i_611_ = is_610_[i_608_];
						else
							i_611_ = -1000;
					}
				}
				int i_631_ = anIntArray5268[i_612_];
				int[] is_632_ = anIntArrayArray5270[i_612_];
				if (bool_508_ || aClass112Array5263 != null) {
					if (bool_507_) {
						for (int i_633_ = 0; i_633_ < i_631_; i_633_++) {
							int i_634_ = is_632_[i_633_];
							if (i_634_ < 65536) {
								int i_635_ = f_ec[i_634_];
								if (i_635_ == -1 || !((Class112) aClass112Array5263[i_635_]).aBool1578)
									method2241(i_634_);
							}
						}
					} else {
						for (int i_636_ = 0; i_636_ < i_631_; i_636_++) {
							int i_637_ = is_632_[i_636_];
							if (i_637_ < 65536) {
								int i_638_ = f_ec[i_637_];
								if (i_638_ != -1) {
									Class112 class112 = aClass112Array5263[i_638_];
									Class145 class145 = f_lb[i_638_];
									if (!((Class112) class112).aBool1578)
										apply_texture(i_637_);
									f_ub.method1804(((Class145) class145).anInt2100, ((Class145) class145).anInt2111,
											((Class145) class145).anInt2103, ((Class145) class145).anInt2105,
											((Class145) class145).anInt2113,
											(((Class112) class112).aShort1583 & 0xffff),
											((Class145) class145).anInt2106, ((Class112) class112).aByte1590,
											((Class112) class112).aByte1584);
								} else
									apply_texture(i_637_);
							} else {
								int i_639_ = (i_637_ >> 16) - 1;
								Class130_Sub1_Sub1 class130_sub1_sub1 = aClass130_Sub1_Sub1Array5273[i_639_];
								int i_640_ = anIntArray5294[i_639_];
								if (i_640_ == 0)
									i_640_ = 1;
								f_ub.method1801(class130_sub1_sub1, f_oc[i_639_], f_pc[i_639_],
										(((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038 >> 2) / i_640_);
							}
						}
					}
				} else if (bool_507_) {
					for (int i_641_ = 0; i_641_ < i_631_; i_641_++)
						method2241(is_632_[i_641_]);
				} else {
					for (int i_642_ = 0; i_642_ < i_631_; i_642_++)
						apply_texture(is_632_[i_642_]);
				}
			}
			if (bool_508_ || aClass112Array5263 != null) {
				if (bool_507_) {
					while (i_611_ != -1000) {
						int i_643_ = is[i_608_++];
						if (i_643_ < 65536) {
							int i_644_ = f_ec[i_643_];
							if (i_644_ == -1 || !(((Class112) aClass112Array5263[i_644_]).aBool1578))
								method2241(i_643_);
						}
						if (i_608_ == i_609_ && is != anIntArrayArray5270[11]) {
							i_608_ = 0;
							is = anIntArrayArray5270[11];
							i_609_ = anIntArray5268[11];
							is_610_ = anIntArray5311;
						}
						if (i_608_ < i_609_)
							i_611_ = is_610_[i_608_];
						else
							i_611_ = -1000;
					}
				} else {
					while (i_611_ != -1000) {
						int i_645_ = is[i_608_++];
						if (i_645_ < 65536) {
							int i_646_ = f_ec[i_645_];
							if (i_646_ != -1) {
								Class112 class112 = aClass112Array5263[i_646_];
								Class145 class145 = f_lb[i_646_];
								if (!((Class112) class112).aBool1578)
									apply_texture(i_645_);
								f_ub.method1804(((Class145) class145).anInt2100, ((Class145) class145).anInt2111,
										((Class145) class145).anInt2103, ((Class145) class145).anInt2105,
										((Class145) class145).anInt2113, ((Class112) class112).aShort1583 & 0xffff,
										((Class145) class145).anInt2106, ((Class112) class112).aByte1590,
										((Class112) class112).aByte1584);
							} else
								apply_texture(i_645_);
						} else {
							int i_647_ = (i_645_ >> 16) - 1;
							Class130_Sub1_Sub1 class130_sub1_sub1 = aClass130_Sub1_Sub1Array5273[i_647_];
							int i_648_ = anIntArray5294[i_647_];
							if (i_648_ == 0)
								i_648_ = 1;
							f_ub.method1801(class130_sub1_sub1, f_oc[i_647_], f_pc[i_647_],
									(((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038 >> 2) / i_648_);
						}
						if (i_608_ == i_609_ && is != anIntArrayArray5270[11]) {
							i_608_ = 0;
							is = anIntArrayArray5270[11];
							i_609_ = anIntArray5268[11];
							is_610_ = anIntArray5311;
						}
						if (i_608_ < i_609_)
							i_611_ = is_610_[i_608_];
						else
							i_611_ = -1000;
					}
				}
			} else if (bool_507_) {
				while (i_611_ != -1000) {
					method2241(is[i_608_++]);
					if (i_608_ == i_609_ && is != anIntArrayArray5270[11]) {
						i_608_ = 0;
						is = anIntArrayArray5270[11];
						i_609_ = anIntArray5268[11];
						is_610_ = anIntArray5311;
					}
					if (i_608_ < i_609_)
						i_611_ = is_610_[i_608_];
					else
						i_611_ = -1000;
				}
			} else {
				while (i_611_ != -1000) {
					apply_texture(is[i_608_++]);
					if (i_608_ == i_609_ && is != anIntArrayArray5270[11]) {
						i_608_ = 0;
						is = anIntArrayArray5270[11];
						i_609_ = anIntArray5268[11];
						is_610_ = anIntArray5311;
					}
					if (i_608_ < i_609_)
						i_611_ = is_610_[i_608_];
					else
						i_611_ = -1000;
				}
			}
		}
	}

	private final int method2236(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	static final LDModel method2237(Class260_Sub1 class260_sub1, LDModel[] class_t_sub2s) {
		int i = 0;
		LDModel class_t_sub2 = null;
		for (int i_649_ = 0; i_649_ < class_t_sub2s.length; i_649_++) {
			if (class_t_sub2s[i_649_] != null) {
				i++;
				class_t_sub2 = class_t_sub2s[i_649_];
			}
		}
		if (i == 1)
			return class_t_sub2;
		return new LDModel(class260_sub1, class_t_sub2s);
	}

	final int l() {
		return contrast;
	}

	private final void method2238(Thread thread) {
		Class36 class36 = f_ub.method1798(thread);
		aClass184_5258 = ((Class36) class36).aClass184_494;
		if (class36 != aClass36_5272) {
			aClass36_5272 = class36;
			f_wb = ((Class36) aClass36_5272).aBoolArray497;
			f_qc = ((Class36) aClass36_5272).f_hb;
			anIntArray5265 = ((Class36) aClass36_5272).anIntArray537;
			anIntArray5288 = ((Class36) aClass36_5272).anIntArray527;
			anIntArray5304 = ((Class36) aClass36_5272).anIntArray531;
			anIntArray5303 = ((Class36) aClass36_5272).f_gb;
			f_ic = ((Class36) aClass36_5272).anIntArray518;
			anIntArray5279 = ((Class36) aClass36_5272).anIntArray538;
			anIntArray5298 = ((Class36) aClass36_5272).anIntArray508;
			f_fc = ((Class36) aClass36_5272).f_cb;
			anIntArray5292 = ((Class36) aClass36_5272).anIntArray535;
			anIntArray5295 = ((Class36) aClass36_5272).anIntArray534;
			f_oc = ((Class36) aClass36_5272).anIntArray502;
			f_pc = ((Class36) aClass36_5272).anIntArray520;
			anIntArray5294 = ((Class36) aClass36_5272).anIntArray507;
			aClass130_Sub1_Sub1Array5273 = ((Class36) aClass36_5272).aClass130_Sub1_Sub1Array514;
			anIntArray5251 = ((Class36) aClass36_5272).anIntArray503;
			f_qb = ((Class36) aClass36_5272).anIntArray528;
			f_jc = ((Class36) aClass36_5272).anIntArray505;
			f_lc = ((Class36) aClass36_5272).anIntArrayArray498;
			anIntArray5308 = ((Class36) aClass36_5272).anIntArray523;
			f_tb = ((Class36) aClass36_5272).anIntArrayArray509;
			anIntArray5268 = ((Class36) aClass36_5272).anIntArray536;
			anIntArrayArray5270 = ((Class36) aClass36_5272).anIntArrayArray540;
			anIntArray5293 = ((Class36) aClass36_5272).f_bb;
			anIntArray5311 = ((Class36) aClass36_5272).anIntArray529;
			anIntArray5305 = ((Class36) aClass36_5272).anIntArray515;
			anIntArray5289 = ((Class36) aClass36_5272).f_fb;
			f_mc = ((Class36) aClass36_5272).anIntArray524;
			anIntArray5255 = ((Class36) aClass36_5272).anIntArray533;
			anIntArray5301 = ((Class36) aClass36_5272).anIntArray532;
			anIntArray5284 = ((Class36) aClass36_5272).anIntArray525;
			f_ec = ((Class36) aClass36_5272).anIntArray526;
		}
	}

	private final void method2239() {
		for (int i = 0; i < anInt5254; i++) {
			vertex_position_x[i] = -vertex_position_x[i];
			vertex_position_z[i] = -vertex_position_z[i];
		}
		method2228();
	}

	final void method671(Class_c class_c, Class130_Sub5 class130_sub5, int i, int i_650_) {
		method2240(class_c, class130_sub5, null, i, i_650_);
	}

	final void JA(int i, int i_651_, int i_652_) {
		if (i != 0 && (anInt5253 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_651_ != 0 && (anInt5253 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_652_ != 0 && (anInt5253 & 0x4) != 4)
			throw new IllegalStateException();
		for (int i_653_ = 0; i_653_ < anInt5254; i_653_++) {
			vertex_position_x[i_653_] += i;
			vertex_position_y[i_653_] += i_651_;
			vertex_position_z[i_653_] += i_652_;
		}
	}

	private final void method2240(Class_c class_c, Class130_Sub5 class130_sub5, Class129 class129, int i, int i_654_) {
		if (vertices >= 1) {
			aClass_c_Sub2_5297 = (Class_c_Sub2) class_c;
			Class_c_Sub2 class_c_sub2 = ((Class260_Sub1) f_ub).aClass_c_Sub2_3857;
			if (!aBool5314)
				method2244();
			method2232(aClass_c_Sub2_5297);
			boolean bool = false;
			if (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5594 == 32768
					&& ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5588 == 0
					&& ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5592 == 0
					&& ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5591 == 0
					&& ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5586 == 32768
					&& ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5587 == 0
					&& ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5583 == 0
					&& ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5590 == 0
					&& ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5585 == 32768)
				bool = true;
			int i_655_ = ((((Class_c_Sub2) class_c_sub2).anInt5593 << 15)
					+ (((Class_c_Sub2) class_c_sub2).anInt5583 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5589)
					+ (((Class_c_Sub2) class_c_sub2).anInt5590 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5584)
					+ (((Class_c_Sub2) class_c_sub2).anInt5585 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5593));
			int i_656_ = (bool ? ((Class_c_Sub2) class_c_sub2).anInt5590
					: (((((Class_c_Sub2) class_c_sub2).anInt5583 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5588)
							+ (((Class_c_Sub2) class_c_sub2).anInt5590 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5586)
							+ (((Class_c_Sub2) class_c_sub2).anInt5585
									* ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5590)) >> 15));
			int i_657_ = i_655_ + aShort5300 * i_656_ >> 15;
			int i_658_ = i_655_ + f_vb * i_656_ >> 15;
			int i_659_;
			int i_660_;
			if (i_657_ > i_658_) {
				i_659_ = i_658_ - aShort5259;
				i_660_ = i_657_ + aShort5259;
			} else {
				i_659_ = i_657_ - aShort5259;
				i_660_ = i_658_ + aShort5259;
			}
			if (i_659_ < ((Class260_Sub1) f_ub).anInt3833 && i_660_ > ((Class260_Sub1) f_ub).anInt3839) {
				int i_661_ = ((((Class_c_Sub2) class_c_sub2).anInt5589 << 15)
						+ (((Class_c_Sub2) class_c_sub2).anInt5594 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5589)
						+ (((Class_c_Sub2) class_c_sub2).anInt5588 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5584)
						+ (((Class_c_Sub2) class_c_sub2).anInt5592 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5593));
				int i_662_ = (bool ? ((Class_c_Sub2) class_c_sub2).anInt5588
						: (((((Class_c_Sub2) class_c_sub2).anInt5594 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5588)
								+ (((Class_c_Sub2) class_c_sub2).anInt5588
										* ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5586)
								+ (((Class_c_Sub2) class_c_sub2).anInt5592
										* ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5590)) >> 15));
				int i_663_ = i_661_ + aShort5300 * i_662_ >> 15;
				int i_664_ = i_661_ + f_vb * i_662_ >> 15;
				int i_665_;
				int i_666_;
				if (i_663_ > i_664_) {
					i_665_ = ((i_664_ - aShort5259) * ((Class260_Sub1) f_ub).anInt3851);
					i_666_ = ((i_663_ + aShort5259) * ((Class260_Sub1) f_ub).anInt3851);
				} else {
					i_665_ = ((i_663_ - aShort5259) * ((Class260_Sub1) f_ub).anInt3851);
					i_666_ = ((i_664_ + aShort5259) * ((Class260_Sub1) f_ub).anInt3851);
				}
				if (i == -1) {
					if (i_665_ / i_660_ >= ((Class260_Sub1) f_ub).f_ib
							|| i_666_ / i_660_ <= ((Class260_Sub1) f_ub).f_ab)
						return;
				} else if (i_665_ / i >= ((Class260_Sub1) f_ub).f_ib || i_666_ / i <= ((Class260_Sub1) f_ub).f_ab)
					return;
				int i_667_ = ((((Class_c_Sub2) class_c_sub2).anInt5584 << 15)
						+ (((Class_c_Sub2) class_c_sub2).anInt5591 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5589)
						+ (((Class_c_Sub2) class_c_sub2).anInt5586 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5584)
						+ (((Class_c_Sub2) class_c_sub2).anInt5587 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5593));
				int i_668_ = (bool ? ((Class_c_Sub2) class_c_sub2).anInt5586
						: (((((Class_c_Sub2) class_c_sub2).anInt5591 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5588)
								+ (((Class_c_Sub2) class_c_sub2).anInt5586
										* ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5586)
								+ (((Class_c_Sub2) class_c_sub2).anInt5587
										* ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5590)) >> 15));
				int i_669_ = i_667_ + aShort5300 * i_668_ >> 15;
				int i_670_ = i_667_ + f_vb * i_668_ >> 15;
				int i_671_;
				int i_672_;
				if (i_669_ > i_670_) {
					i_671_ = ((i_670_ - aShort5259) * ((Class260_Sub1) f_ub).anInt3852);
					i_672_ = ((i_669_ + aShort5259) * ((Class260_Sub1) f_ub).anInt3852);
				} else {
					i_671_ = ((i_669_ - aShort5259) * ((Class260_Sub1) f_ub).anInt3852);
					i_672_ = ((i_670_ + aShort5259) * ((Class260_Sub1) f_ub).anInt3852);
				}
				if (i == -1) {
					if (i_671_ / i_660_ >= ((Class260_Sub1) f_ub).anInt3842
							|| i_672_ / i_660_ <= ((Class260_Sub1) f_ub).anInt3850)
						return;
				} else if (i_671_ / i >= ((Class260_Sub1) f_ub).anInt3842
						|| i_672_ / i <= ((Class260_Sub1) f_ub).anInt3850)
					return;
				int i_673_;
				int i_674_;
				int i_675_;
				int i_676_;
				int i_677_;
				int i_678_;
				if (bool) {
					i_673_ = ((Class_c_Sub2) class_c_sub2).anInt5594;
					i_674_ = ((Class_c_Sub2) class_c_sub2).anInt5591;
					i_675_ = ((Class_c_Sub2) class_c_sub2).anInt5583;
					i_676_ = ((Class_c_Sub2) class_c_sub2).anInt5592;
					i_677_ = ((Class_c_Sub2) class_c_sub2).anInt5587;
					i_678_ = ((Class_c_Sub2) class_c_sub2).anInt5585;
				} else {
					i_673_ = ((((Class_c_Sub2) class_c_sub2).anInt5594 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5594)
							+ (((Class_c_Sub2) class_c_sub2).anInt5588 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5591)
							+ (((Class_c_Sub2) class_c_sub2).anInt5592
									* (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5583))) >> 15;
					i_674_ = ((((Class_c_Sub2) class_c_sub2).anInt5591 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5594)
							+ (((Class_c_Sub2) class_c_sub2).anInt5586 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5591)
							+ (((Class_c_Sub2) class_c_sub2).anInt5587
									* (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5583))) >> 15;
					i_675_ = ((((Class_c_Sub2) class_c_sub2).anInt5583 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5594)
							+ (((Class_c_Sub2) class_c_sub2).anInt5590 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5591)
							+ (((Class_c_Sub2) class_c_sub2).anInt5585
									* (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5583))) >> 15;
					i_676_ = ((((Class_c_Sub2) class_c_sub2).anInt5594 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5592)
							+ (((Class_c_Sub2) class_c_sub2).anInt5588 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5587)
							+ (((Class_c_Sub2) class_c_sub2).anInt5592
									* (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5585))) >> 15;
					i_677_ = ((((Class_c_Sub2) class_c_sub2).anInt5591 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5592)
							+ (((Class_c_Sub2) class_c_sub2).anInt5586 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5587)
							+ (((Class_c_Sub2) class_c_sub2).anInt5587
									* (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5585))) >> 15;
					i_678_ = ((((Class_c_Sub2) class_c_sub2).anInt5583 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5592)
							+ (((Class_c_Sub2) class_c_sub2).anInt5590 * ((Class_c_Sub2) aClass_c_Sub2_5297).anInt5587)
							+ (((Class_c_Sub2) class_c_sub2).anInt5585
									* (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5585))) >> 15;
				}
				if (((Class260_Sub1) f_ub).anInt3855 > 1) {
					synchronized (this) {
						while (aBool5290) {
							try {
								this.wait();
							} catch (InterruptedException interruptedexception) {
								/* empty */
							}
						}
						aBool5290 = true;
					}
				}
				method2238(Thread.currentThread());
				boolean bool_679_ = false;
				boolean bool_680_ = i_659_ <= ((Class260_Sub1) f_ub).anInt3839;
				boolean bool_681_ = (bool_680_ || f_kb > 0 || aClass19Array5256 != null || aClass162Array5257 != null);
				((Class36) aClass36_5272).anInt530 = ((Rasterizer3D) aClass184_5258).anInt2557;
				((Class36) aClass36_5272).anInt517 = ((Rasterizer3D) aClass184_5258).anInt2562;
				((Class36) aClass36_5272).anInt522 = ((Rasterizer3D) aClass184_5258).anInt2568;
				int i_682_ = ((Class260_Sub1) f_ub).anInt3851;
				int i_683_ = ((Class260_Sub1) f_ub).anInt3852;
				int i_684_ = ((Class260_Sub1) f_ub).anInt3839;
				if (i == -1) {
					for (int i_685_ = 0; i_685_ < anInt5254; i_685_++) {
						int i_686_ = vertex_position_x[i_685_];
						int i_687_ = vertex_position_y[i_685_];
						int i_688_ = vertex_position_z[i_685_];
						int i_689_ = ((i_661_ + i_673_ * i_686_ + i_662_ * i_687_ + i_676_ * i_688_) >> 15);
						int i_690_ = ((i_667_ + i_674_ * i_686_ + i_668_ * i_687_ + i_677_ * i_688_) >> 15);
						int i_691_ = ((i_655_ + i_675_ * i_686_ + i_656_ * i_687_ + i_678_ * i_688_) >> 15);
						f_qb[i_685_] = i_691_ - i_659_;
						anIntArray5298[i_685_] = i_691_;
						if (i_691_ >= i_684_) {
							f_ic[i_685_] = (((Class36) aClass36_5272).anInt517 + i_689_ * i_682_ / i_691_);
							anIntArray5279[i_685_] = (((Class36) aClass36_5272).anInt522 + i_690_ * i_683_ / i_691_);
						} else {
							f_ic[i_685_] = -5000;
							bool_679_ = true;
						}
						if (bool_681_) {
							anIntArray5288[i_685_] = i_689_;
							anIntArray5304[i_685_] = i_690_;
							anIntArray5303[i_685_] = i_691_;
						}
						if (((Class260_Sub1) f_ub).aBool3840)
							anIntArray5265[i_685_] = ((((Class_c_Sub2) aClass_c_Sub2_5297).anInt5584)
									+ (((((Class_c_Sub2) aClass_c_Sub2_5297).anInt5591) * i_686_
											+ (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5586) * i_687_
											+ (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5587) * i_688_) >> 15));
					}
					if (aClass112Array5263 != null) {
						for (int i_692_ = 0; i_692_ < anInt5262; i_692_++) {
							Class112 class112 = aClass112Array5263[i_692_];
							Class145 class145 = f_lb[i_692_];
							int i_693_ = (texture_edge_a[((Class112) class112).anInt1586]);
							int i_694_ = texture_edge_b[((Class112) class112).anInt1586];
							int i_695_ = (texture_edge_c[((Class112) class112).anInt1586]);
							int i_696_ = ((vertex_position_x[i_693_] + vertex_position_x[i_694_]
									+ vertex_position_x[i_695_]) / 3);
							int i_697_ = ((vertex_position_y[i_693_] + vertex_position_y[i_694_]
									+ vertex_position_y[i_695_]) / 3);
							int i_698_ = ((vertex_position_z[i_693_] + vertex_position_z[i_694_]
									+ vertex_position_z[i_695_]) / 3);
							int i_699_ = (((Class145) class145).anInt2109
									+ ((i_661_ + i_673_ * i_696_ + i_662_ * i_697_ + i_676_ * i_698_) >> 15));
							int i_700_ = (((Class145) class145).anInt2101
									+ ((i_667_ + i_674_ * i_696_ + i_668_ * i_697_ + i_677_ * i_698_) >> 15));
							int i_701_ = ((i_655_ + i_675_ * i_696_ + i_656_ * i_697_ + i_678_ * i_698_) >> 15);
							if (i_701_ > ((Class260_Sub1) f_ub).anInt3839) {
								((Class145) class145).anInt2100 = (((Class36) aClass36_5272).anInt517
										+ i_699_ * i_682_ / i_701_);
								((Class145) class145).anInt2111 = (((Class36) aClass36_5272).anInt522
										+ i_700_ * i_683_ / i_701_);
								((Class145) class145).anInt2103 = (((Class145) class145).anInt2098
										* ((Class112) class112).aShort1580 * i_682_ / (i_701_ << 7));
								((Class145) class145).anInt2105 = (((Class145) class145).anInt2102
										* ((Class112) class112).aShort1579 * i_683_ / (i_701_ << 7));
							} else
								((Class145) class145).anInt2103 = ((Class145) class145).anInt2105 = 0;
						}
					}
				} else {
					for (int i_702_ = 0; i_702_ < anInt5254; i_702_++) {
						int i_703_ = vertex_position_x[i_702_];
						int i_704_ = vertex_position_y[i_702_];
						int i_705_ = vertex_position_z[i_702_];
						int i_706_ = ((i_661_ + i_673_ * i_703_ + i_662_ * i_704_ + i_676_ * i_705_) >> 15);
						int i_707_ = ((i_667_ + i_674_ * i_703_ + i_668_ * i_704_ + i_677_ * i_705_) >> 15);
						int i_708_ = ((i_655_ + i_675_ * i_703_ + i_656_ * i_704_ + i_678_ * i_705_) >> 15);
						f_qb[i_702_] = i_708_ - i_659_;
						anIntArray5298[i_702_] = i_708_;
						if (i_708_ >= i_684_) {
							f_ic[i_702_] = (((Class36) aClass36_5272).anInt517 + i_706_ * i_682_ / i);
							anIntArray5279[i_702_] = (((Class36) aClass36_5272).anInt522 + i_707_ * i_683_ / i);
						} else {
							f_ic[i_702_] = -5000;
							bool_679_ = true;
						}
						if (bool_681_) {
							anIntArray5288[i_702_] = i_706_;
							anIntArray5304[i_702_] = i_707_;
							anIntArray5303[i_702_] = i_708_;
						}
						if (((Class260_Sub1) f_ub).aBool3840)
							anIntArray5265[i_702_] = ((((Class_c_Sub2) aClass_c_Sub2_5297).anInt5584)
									+ (((((Class_c_Sub2) aClass_c_Sub2_5297).anInt5591) * i_703_
											+ (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5586) * i_704_
											+ (((Class_c_Sub2) aClass_c_Sub2_5297).anInt5587) * i_705_) >> 15));
					}
					if (aClass112Array5263 != null) {
						for (int i_709_ = 0; i_709_ < anInt5262; i_709_++) {
							Class112 class112 = aClass112Array5263[i_709_];
							Class145 class145 = f_lb[i_709_];
							int i_710_ = (texture_edge_a[((Class112) class112).anInt1586]);
							int i_711_ = texture_edge_b[((Class112) class112).anInt1586];
							int i_712_ = (texture_edge_c[((Class112) class112).anInt1586]);
							int i_713_ = ((vertex_position_x[i_710_] + vertex_position_x[i_711_]
									+ vertex_position_x[i_712_]) / 3);
							int i_714_ = ((vertex_position_y[i_710_] + vertex_position_y[i_711_]
									+ vertex_position_y[i_712_]) / 3);
							int i_715_ = ((vertex_position_z[i_710_] + vertex_position_z[i_711_]
									+ vertex_position_z[i_712_]) / 3);
							int i_716_ = ((i_661_ + i_673_ * i_713_ + i_662_ * i_714_ + i_676_ * i_715_) >> 15);
							int i_717_ = ((i_667_ + i_674_ * i_713_ + i_668_ * i_714_ + i_677_ * i_715_) >> 15);
							int i_718_ = ((i_655_ + i_675_ * i_713_ + i_656_ * i_714_ + i_678_ * i_715_) >> 15);
							if (i_718_ > ((Class260_Sub1) f_ub).anInt3839) {
								((Class145) class145).anInt2100 = (((Class36) aClass36_5272).anInt517
										+ i_716_ * i_682_ / i);
								((Class145) class145).anInt2111 = (((Class36) aClass36_5272).anInt522
										+ i_717_ * i_683_ / i);
								((Class145) class145).anInt2103 = (((Class145) class145).anInt2098
										* ((Class112) class112).aShort1580 * i_682_ / (i << 7));
								((Class145) class145).anInt2105 = (((Class145) class145).anInt2102
										* ((Class112) class112).aShort1579 * i_683_ / (i << 7));
							} else
								((Class145) class145).anInt2103 = ((Class145) class145).anInt2105 = 0;
						}
					}
				}
				int i_719_ = 0;
				if (class129 != null) {
					for (Class130_Sub1_Sub1 class130_sub1_sub1 = (Class130_Sub1_Sub1) ((Class129) class129).aClass220_1802
							.method1429(
									50); class130_sub1_sub1 != null; class130_sub1_sub1 = (Class130_Sub1_Sub1) ((Class129) class129).aClass220_1802
											.method1426(true)) {
						int i_720_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7037) >> 12;
						int i_721_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7048) >> 12;
						int i_722_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7044) >> 12;
						int i_723_ = (((Class_c_Sub2) class_c_sub2).anInt5589
								+ (((((Class_c_Sub2) class_c_sub2).anInt5594 * i_720_)
										+ (((Class_c_Sub2) class_c_sub2).anInt5588 * i_721_)
										+ (((Class_c_Sub2) class_c_sub2).anInt5592 * i_722_)) >> 15));
						int i_724_ = (((Class_c_Sub2) class_c_sub2).anInt5584
								+ (((((Class_c_Sub2) class_c_sub2).anInt5591 * i_720_)
										+ (((Class_c_Sub2) class_c_sub2).anInt5586 * i_721_)
										+ (((Class_c_Sub2) class_c_sub2).anInt5587 * i_722_)) >> 15));
						int i_725_ = (((Class_c_Sub2) class_c_sub2).anInt5593
								+ (((((Class_c_Sub2) class_c_sub2).anInt5583 * i_720_)
										+ (((Class_c_Sub2) class_c_sub2).anInt5590 * i_721_)
										+ (((Class_c_Sub2) class_c_sub2).anInt5585 * i_722_)) >> 15));
						if (i_725_ >= i_684_) {
							f_oc[i_719_] = (((Class260_Sub1) f_ub).f_cb + i_723_ * i_682_ / i_725_);
							f_pc[i_719_] = (((Class260_Sub1) f_ub).anInt3858 + i_724_ * i_683_ / i_725_);
							anIntArray5294[i_719_] = i_725_;
							anIntArray5251[i_719_] = i_725_ - i_659_;
							aClass130_Sub1_Sub1Array5273[i_719_] = class130_sub1_sub1;
						} else
							anIntArray5251[i_719_] = -2147483648;
						i_719_++;
					}
				}
				if (class130_sub5 != null) {
					boolean bool_726_ = false;
					boolean bool_727_ = true;
					int i_728_ = aShort5271 + aShort5267 >> 1;
					int i_729_ = f_ob + aShort5250 >> 1;
					int i_730_ = i_728_;
					int i_731_ = aShort5300;
					int i_732_ = i_729_;
					int i_733_ = ((i_661_ + i_673_ * i_730_ + i_662_ * i_731_ + i_676_ * i_732_) >> 15);
					int i_734_ = ((i_667_ + i_674_ * i_730_ + i_668_ * i_731_ + i_677_ * i_732_) >> 15);
					int i_735_ = ((i_655_ + i_675_ * i_730_ + i_656_ * i_731_ + i_678_ * i_732_) >> 15);
					if (i_735_ >= i_684_) {
						int i_736_ = i_735_;
						if (i != -1)
							i_736_ = i;
						((Class130_Sub5) class130_sub5).anInt4813 = (((Class260_Sub1) f_ub).f_cb
								+ i_733_ * i_682_ / i_736_);
						((Class130_Sub5) class130_sub5).anInt4811 = (((Class260_Sub1) f_ub).anInt3858
								+ i_734_ * i_683_ / i_736_);
					} else
						bool_726_ = true;
					i_730_ = i_728_;
					i_731_ = f_vb;
					i_732_ = i_729_;
					int i_737_ = ((i_661_ + i_673_ * i_730_ + i_662_ * i_731_ + i_676_ * i_732_) >> 15);
					int i_738_ = ((i_667_ + i_674_ * i_730_ + i_668_ * i_731_ + i_677_ * i_732_) >> 15);
					int i_739_ = ((i_655_ + i_675_ * i_730_ + i_656_ * i_731_ + i_678_ * i_732_) >> 15);
					if (i_739_ >= i_684_) {
						int i_740_ = i_739_;
						if (i != -1)
							i_740_ = i;
						((Class130_Sub5) class130_sub5).anInt4815 = (((Class260_Sub1) f_ub).f_cb
								+ i_737_ * i_682_ / i_740_);
						((Class130_Sub5) class130_sub5).anInt4812 = (((Class260_Sub1) f_ub).anInt3858
								+ i_738_ * i_683_ / i_740_);
					} else
						bool_726_ = true;
					if (bool_726_) {
						if (i_735_ < i_684_ && i_739_ < i_684_)
							bool_727_ = false;
						else if (i_735_ < i_684_) {
							int i_741_ = ((i_739_ - ((Class260_Sub1) f_ub).anInt3839 << 16) / (i_739_ - i_735_));
							int i_742_ = i_737_ + ((i_737_ - i_733_) * i_741_ >> 16);
							int i_743_ = i_738_ + ((i_738_ - i_734_) * i_741_ >> 16);
							int i_744_ = i_684_;
							if (i != -1)
								i_744_ = i;
							((Class130_Sub5) class130_sub5).anInt4813 = (((Class260_Sub1) f_ub).f_cb
									+ i_742_ * i_682_ / i_744_);
							((Class130_Sub5) class130_sub5).anInt4811 = (((Class260_Sub1) f_ub).anInt3858
									+ i_743_ * i_683_ / i_744_);
						} else if (i_739_ < i_684_) {
							int i_745_ = (i_735_ - i_684_ << 16) / (i_735_ - i_739_);
							int i_746_ = i_733_ + ((i_733_ - i_737_) * i_745_ >> 16);
							int i_747_ = i_734_ + ((i_734_ - i_738_) * i_745_ >> 16);
							int i_748_ = i_684_;
							if (i != -1)
								i_748_ = i;
							((Class130_Sub5) class130_sub5).anInt4813 = (((Class260_Sub1) f_ub).f_cb
									+ i_746_ * i_682_ / i_748_);
							((Class130_Sub5) class130_sub5).anInt4811 = (((Class260_Sub1) f_ub).anInt3858
									+ i_747_ * i_683_ / i_748_);
						}
					}
					if (bool_727_) {
						if (i_735_ > i_739_) {
							int i_749_ = i_735_;
							if (i != -1)
								i_749_ = i;
							((Class130_Sub5) class130_sub5).anInt4816 = (((Class260_Sub1) f_ub).f_cb
									+ (i_733_ + aShort5259) * i_682_ / i_749_
									- (((Class130_Sub5) class130_sub5).anInt4813));
						} else {
							int i_750_ = i_739_;
							if (i != -1)
								i_750_ = i;
							((Class130_Sub5) class130_sub5).anInt4816 = (((Class260_Sub1) f_ub).f_cb
									+ (i_737_ + aShort5259) * i_682_ / i_750_
									- (((Class130_Sub5) class130_sub5).anInt4815));
						}
						((Class130_Sub5) class130_sub5).aBool4814 = true;
					}
				}
				method2243(true);
				((Rasterizer3D) aClass184_5258).aBool2559 = (i_654_ & 0x1) == 0;
				try {
					method2235(bool_679_, ((((Class260_Sub1) f_ub).f_db && i_660_ > ((Class260_Sub1) f_ub).anInt3846)
							|| ((Class260_Sub1) f_ub).aBool3840), i_660_ - i_659_, class129 != null, i_719_);
				} catch (Exception exception) {
					/* empty */
				}
				if (aClass112Array5263 != null) {
					for (int i_751_ = 0; i_751_ < faces; i_751_++)
						f_ec[i_751_] = -1;
				}
				aClass184_5258 = null;
				if (((Class260_Sub1) f_ub).anInt3855 > 1) {
					synchronized (this) {
						aBool5290 = false;
						this.notifyAll();
					}
				}
			}
		}
	}

	final int PA() {
		if (!aBool5314)
			method2244();
		return f_ob;
	}

	final void method684(int i, int i_752_, int i_753_, int i_754_) {
		if ((anInt5253 & 0x80000) != 524288)
			throw new IllegalStateException("FMT");
		for (int i_755_ = 0; i_755_ < faces; i_755_++) {
			int i_756_ = facesColors[i_755_] & 0xffff;
			int i_757_ = i_756_ >> 10 & 0x3f;
			int i_758_ = i_756_ >> 7 & 0x7;
			int i_759_ = i_756_ & 0x7f;
			if (i != -1)
				i_757_ += (i - i_757_) * i_754_ >> 7;
			if (i_752_ != -1)
				i_758_ += (i_752_ - i_758_) * i_754_ >> 7;
			if (i_753_ != -1)
				i_759_ += (i_753_ - i_759_) * i_754_ >> 7;
			facesColors[i_755_] = (short) (i_757_ << 10 | i_758_ << 7 | i_759_);
		}
		if (aClass112Array5263 != null) {
			for (int i_760_ = 0; i_760_ < anInt5262; i_760_++) {
				Class112 class112 = aClass112Array5263[i_760_];
				Class145 class145 = f_lb[i_760_];
				((Class145) class145).anInt2106 = (((Class145) class145).anInt2106 & ~0xffffff | ((Entity.f_eb[Class_e
						.method594(-50, (facesColors[(((Class112) class112).anInt1586)]) & 0xffff)]) & 0xffffff));
			}
		}
		if (anInt5278 == 2)
			anInt5278 = 1;
	}

	final int D() {
		return f_hb;
	}

	private final void method2241(int i) {
		if (!((Class260_Sub1) f_ub).aBool3840) {
			int i_761_ = texture_edge_a[i];
			int i_762_ = texture_edge_b[i];
			int i_763_ = texture_edge_c[i];
			int i_764_ = anIntArray5298[i_761_] - ((Class260_Sub1) f_ub).anInt3846;
			if (i_764_ > 255)
				i_764_ = 255;
			else if (i_764_ < 0)
				i_764_ = 0;
			int i_765_ = anIntArray5298[i_762_] - ((Class260_Sub1) f_ub).anInt3846;
			if (i_765_ > 255)
				i_765_ = 255;
			else if (i_765_ < 0)
				i_765_ = 0;
			int i_766_ = anIntArray5298[i_763_] - ((Class260_Sub1) f_ub).anInt3846;
			if (i_766_ > 255)
				i_766_ = 255;
			else if (i_766_ < 0)
				i_766_ = 0;
			int i_767_ = i_764_ + i_765_ + i_766_;
			if (i_767_ != 765) {
				if (i_767_ == 0) {
					apply_texture(i);
				} else {
					if (alpha == null)
						((Rasterizer3D) aClass184_5258).alpha = 0;
					else
						((Rasterizer3D) aClass184_5258).alpha = alpha[i] & 0xff;
					((Rasterizer3D) aClass184_5258).aBool2560 = f_wb[i];
					if (texture_faces == null || texture_faces[i] == -1) {
						if (hue_c[i] == -1)
							aClass184_5258.method1195(anIntArray5279[i_761_], anIntArray5279[i_762_],
									anIntArray5279[i_763_], f_ic[i_761_], f_ic[i_762_], f_ic[i_763_],
									Buffer.method2402((byte) 70, (Entity.f_eb[f_bb[i] & 0xffff]),
											(i_764_ << 24 | (((Class260_Sub1) f_ub).anInt3843))),
									Buffer.method2402((byte) 70, (Entity.f_eb[f_bb[i] & 0xffff]),
											(i_765_ << 24 | (((Class260_Sub1) f_ub).anInt3843))),
									Buffer.method2402((byte) 70, (Entity.f_eb[f_bb[i] & 0xffff]),
											(i_766_ << 24 | (((Class260_Sub1) f_ub).anInt3843))));
						else
							aClass184_5258.method1195(anIntArray5279[i_761_], anIntArray5279[i_762_],
									anIntArray5279[i_763_], f_ic[i_761_], f_ic[i_762_], f_ic[i_763_],
									Buffer.method2402((byte) 70, (Entity.f_eb[f_bb[i] & 0xffff]),
											(i_764_ << 24 | (((Class260_Sub1) f_ub).anInt3843))),
									Buffer.method2402((byte) 70, (Entity.f_eb[(anIntArray5280[i] & 0xffff)]),
											(i_765_ << 24 | (((Class260_Sub1) f_ub).anInt3843))),
									Buffer.method2402((byte) 70, (Entity.f_eb[hue_c[i] & 0xffff]),
											(i_766_ << 24 | (((Class260_Sub1) f_ub).anInt3843))));
					} else {
						int i_768_;
						int i_769_;
						int i_770_;
						if (f_nb != null && f_nb[i] != -1) {
							int i_771_ = f_nb[i] & 0xff;
							i_768_ = f_ac[i_771_];
							i_769_ = anIntArray5275[i_771_];
							i_770_ = anIntArray5248[i_771_];
						} else {
							i_768_ = i_761_;
							i_769_ = i_762_;
							i_770_ = i_763_;
						}
						if (hue_c[i] == -1)
							aClass184_5258.method1189(texture_faces[i], anIntArray5279[i_761_], anIntArray5279[i_762_],
									anIntArray5279[i_763_], f_ic[i_761_], f_ic[i_762_], f_ic[i_763_],
									((Class260_Sub1) f_ub).anInt3843, i_764_, i_765_, i_766_, f_bb[i], f_bb[i], f_bb[i],
									anIntArray5288[i_768_], anIntArray5288[i_769_], anIntArray5288[i_770_],
									anIntArray5304[i_768_], anIntArray5304[i_769_], anIntArray5304[i_770_],
									anIntArray5303[i_768_], anIntArray5303[i_769_], anIntArray5303[i_770_]);
						else
							aClass184_5258.method1189(texture_faces[i], anIntArray5279[i_761_], anIntArray5279[i_762_],
									anIntArray5279[i_763_], f_ic[i_761_], f_ic[i_762_], f_ic[i_763_],
									((Class260_Sub1) f_ub).anInt3843, i_764_, i_765_, i_766_, f_bb[i],
									anIntArray5280[i], hue_c[i], anIntArray5288[i_768_], anIntArray5288[i_769_],
									anIntArray5288[i_770_], anIntArray5304[i_768_], anIntArray5304[i_769_],
									anIntArray5304[i_770_], anIntArray5303[i_768_], anIntArray5303[i_769_],
									anIntArray5303[i_770_]);
					}
				}
			}
		} else if (!f_qc[i]) {
			int i_772_ = texture_edge_a[i];
			int i_773_ = texture_edge_b[i];
			int i_774_ = texture_edge_c[i];
			int i_775_ = 0;
			int i_776_ = 0;
			int i_777_ = 0;
			if (anIntArray5265[i_772_] > ((Class260_Sub1) f_ub).f_fb)
				i_775_ = 255;
			else if (anIntArray5265[i_772_] > ((Class260_Sub1) f_ub).anInt3845)
				i_775_ = ((((Class260_Sub1) f_ub).anInt3845 - anIntArray5265[i_772_]) * 255
						/ (((Class260_Sub1) f_ub).anInt3845 - ((Class260_Sub1) f_ub).f_fb));
			if (anIntArray5265[i_773_] > ((Class260_Sub1) f_ub).f_fb)
				i_776_ = 255;
			else if (anIntArray5265[i_773_] > ((Class260_Sub1) f_ub).anInt3845)
				i_776_ = ((((Class260_Sub1) f_ub).anInt3845 - anIntArray5265[i_773_]) * 255
						/ (((Class260_Sub1) f_ub).anInt3845 - ((Class260_Sub1) f_ub).f_fb));
			if (anIntArray5265[i_774_] > ((Class260_Sub1) f_ub).f_fb)
				i_777_ = 255;
			else if (anIntArray5265[i_774_] > ((Class260_Sub1) f_ub).anInt3845)
				i_777_ = ((((Class260_Sub1) f_ub).anInt3845 - anIntArray5265[i_774_]) * 255
						/ (((Class260_Sub1) f_ub).anInt3845 - ((Class260_Sub1) f_ub).f_fb));
			if (alpha == null)
				((Rasterizer3D) aClass184_5258).alpha = 0;
			else
				((Rasterizer3D) aClass184_5258).alpha = alpha[i] & 0xff;
			((Rasterizer3D) aClass184_5258).aBool2560 = f_wb[i];
			if (texture_faces == null || texture_faces[i] == -1) {
				if (hue_c[i] == -1)
					aClass184_5258.method1195(anIntArray5279[i_772_], anIntArray5279[i_773_], anIntArray5279[i_774_],
							f_ic[i_772_], f_ic[i_773_], f_ic[i_774_],
							Buffer.method2402((byte) 70, Entity.f_eb[f_bb[i] & 0xffff],
									i_775_ << 24 | ((Class260_Sub1) f_ub).anInt3843),
							Buffer.method2402((byte) 70, Entity.f_eb[f_bb[i] & 0xffff],
									i_776_ << 24 | ((Class260_Sub1) f_ub).anInt3843),
							Buffer.method2402((byte) 70, Entity.f_eb[f_bb[i] & 0xffff],
									i_777_ << 24 | ((Class260_Sub1) f_ub).anInt3843));
				else
					aClass184_5258.method1195(anIntArray5279[i_772_], anIntArray5279[i_773_], anIntArray5279[i_774_],
							f_ic[i_772_], f_ic[i_773_], f_ic[i_774_],
							Buffer.method2402((byte) 70, Entity.f_eb[f_bb[i] & 0xffff],
									i_775_ << 24 | ((Class260_Sub1) f_ub).anInt3843),
							Buffer.method2402((byte) 70, (Entity.f_eb[anIntArray5280[i] & 0xffff]),
									i_776_ << 24 | ((Class260_Sub1) f_ub).anInt3843),
							Buffer.method2402((byte) 70, Entity.f_eb[hue_c[i] & 0xffff],
									i_777_ << 24 | ((Class260_Sub1) f_ub).anInt3843));
			} else {
				int i_778_;
				int i_779_;
				int i_780_;
				if (f_nb != null && f_nb[i] != -1) {
					int i_781_ = f_nb[i] & 0xff;
					i_778_ = f_ac[i_781_];
					i_779_ = anIntArray5275[i_781_];
					i_780_ = anIntArray5248[i_781_];
				} else {
					i_778_ = i_772_;
					i_779_ = i_773_;
					i_780_ = i_774_;
				}
				if (hue_c[i] == -1)
					aClass184_5258.method1189(texture_faces[i], anIntArray5279[i_772_], anIntArray5279[i_773_],
							anIntArray5279[i_774_], f_ic[i_772_], f_ic[i_773_], f_ic[i_774_],
							((Class260_Sub1) f_ub).anInt3843, i_775_, i_776_, i_777_, f_bb[i], f_bb[i], f_bb[i],
							anIntArray5288[i_778_], anIntArray5288[i_779_], anIntArray5288[i_780_],
							anIntArray5304[i_778_], anIntArray5304[i_779_], anIntArray5304[i_780_],
							anIntArray5303[i_778_], anIntArray5303[i_779_], anIntArray5303[i_780_]);
				else
					aClass184_5258.method1189(texture_faces[i], anIntArray5279[i_772_], anIntArray5279[i_773_],
							anIntArray5279[i_774_], f_ic[i_772_], f_ic[i_773_], f_ic[i_774_],
							((Class260_Sub1) f_ub).anInt3843, i_775_, i_776_, i_777_, f_bb[i], anIntArray5280[i],
							hue_c[i], anIntArray5288[i_778_], anIntArray5288[i_779_], anIntArray5288[i_780_],
							anIntArray5304[i_778_], anIntArray5304[i_779_], anIntArray5304[i_780_],
							anIntArray5303[i_778_], anIntArray5303[i_779_], anIntArray5303[i_780_]);
			}
		}
	}

	private final void method2242() {
		for (int i = 0; i < anInt5254; i++) {
			int i_782_ = vertex_position_x[i];
			vertex_position_x[i] = vertex_position_z[i];
			vertex_position_z[i] = -i_782_;
		}
		method2228();
	}

	private final void method2243(boolean bool) {
		synchronized (this) {
			if (anInt5278 == 1)
				method2226();
			else if (anInt5278 == 2) {
				if ((anInt5253 & 0x97298) == 0)
					facesColors = null;
				if (bool)
					render_type = null;
			} else {
				lighting();
				int i = ((Class260_Sub1) f_ub).anInt3831;
				int i_783_ = ((Class260_Sub1) f_ub).anInt3847;
				int i_784_ = ((Class260_Sub1) f_ub).anInt3854;
				int i_785_ = ((Class260_Sub1) f_ub).anInt3836 >> 8;
				int i_786_ = ((Class260_Sub1) f_ub).f_hb * 768 / contrast;
				int i_787_ = ((Class260_Sub1) f_ub).anInt3848 * 768 / contrast;
				if (f_bb == null) {
					f_bb = new int[faces];
					anIntArray5280 = new int[faces];
					hue_c = new int[faces];
				}
				for (int i_788_ = 0; i_788_ < faces; i_788_++) {
					int i_789_;
					if (render_type == null)
						i_789_ = (byte) 0;
					else
						i_789_ = render_type[i_788_];
					int i_790_;
					if (alpha == null)
						i_790_ = (byte) 0;
					else
						i_790_ = alpha[i_788_];
					short i_791_;
					if (texture_faces == null)
						i_791_ = (short) -1;
					else
						i_791_ = texture_faces[i_788_];
					if (i_790_ == -2)
						i_789_ = (byte) 3;
					if (i_790_ == -1)
						i_789_ = (byte) 2;
					if (i_791_ == -1) {
						if (i_789_ == 0) {
							int i_792_ = facesColors[i_788_] & 0xffff;
							int i_793_ = (i_792_ & 0x7f) * f_hb >> 7;
							short i_794_ = Class_e.method594(-63, i_792_ & ~0x7f | i_793_);
							Vertex class70;
							if (f_cc != null && f_cc[texture_edge_a[i_788_]] != null)
								class70 = f_cc[texture_edge_a[i_788_]];
							else
								class70 = aClass33Array1425[texture_edge_a[i_788_]];
							int i_795_ = (((i * ((Vertex) class70).normalized_normal_x
									+ i_783_ * ((Vertex) class70).normalized_normal_y
									+ i_784_ * ((Vertex) class70).normalized_normal_z)
									/ ((Vertex) class70).anInt605) >> 16);
							int i_796_ = i_795_ > 256 ? i_786_ : i_787_;
							int i_797_ = (i_785_ >> 1) + (i_796_ * i_795_ >> 17);
							f_bb[i_788_] = (i_797_ << 17 | Class109_Sub3.method1825(i_794_, i_797_));
							if (f_cc != null && f_cc[texture_edge_b[i_788_]] != null)
								class70 = f_cc[texture_edge_b[i_788_]];
							else
								class70 = aClass33Array1425[texture_edge_b[i_788_]];
							i_795_ = ((i * ((Vertex) class70).normalized_normal_x
									+ i_783_ * ((Vertex) class70).normalized_normal_y
									+ i_784_ * ((Vertex) class70).normalized_normal_z)
									/ ((Vertex) class70).anInt605) >> 16;
							i_796_ = i_795_ > 256 ? i_786_ : i_787_;
							i_797_ = (i_785_ >> 1) + (i_796_ * i_795_ >> 17);
							anIntArray5280[i_788_] = (i_797_ << 17 | Class109_Sub3.method1825(i_794_, i_797_));
							if (f_cc != null && f_cc[texture_edge_c[i_788_]] != null)
								class70 = f_cc[texture_edge_c[i_788_]];
							else
								class70 = aClass33Array1425[texture_edge_c[i_788_]];
							i_795_ = ((i * ((Vertex) class70).normalized_normal_x
									+ i_783_ * ((Vertex) class70).normalized_normal_y
									+ i_784_ * ((Vertex) class70).normalized_normal_z)
									/ ((Vertex) class70).anInt605) >> 16;
							i_796_ = i_795_ > 256 ? i_786_ : i_787_;
							i_797_ = (i_785_ >> 1) + (i_796_ * i_795_ >> 17);
							hue_c[i_788_] = (i_797_ << 17 | Class109_Sub3.method1825(i_794_, i_797_));
						} else if (i_789_ == 1) {
							int i_798_ = facesColors[i_788_] & 0xffff;
							int i_799_ = (i_798_ & 0x7f) * f_hb >> 7;
							short i_800_ = Class_e.method594(124, i_798_ & ~0x7f | i_799_);
							Class89 class89 = aClass89Array5309[i_788_];
							int i_801_ = ((i * ((Class89) class89).anInt1159 + i_783_ * ((Class89) class89).anInt1158
									+ i_784_ * ((Class89) class89).anInt1157) >> 16);
							int i_802_ = i_801_ > 256 ? i_786_ : i_787_;
							int i_803_ = (i_785_ >> 1) + (i_802_ * i_801_ >> 17);
							f_bb[i_788_] = (i_803_ << 17 | Class109_Sub3.method1825(i_800_, i_803_));
							hue_c[i_788_] = -1;
						} else if (i_789_ == 3) {
							f_bb[i_788_] = 128;
							hue_c[i_788_] = -1;
						} else
							hue_c[i_788_] = -2;
					} else if (i_789_ == 0) {
						Vertex class70;
						if (f_cc != null && f_cc[texture_edge_a[i_788_]] != null)
							class70 = f_cc[texture_edge_a[i_788_]];
						else
							class70 = aClass33Array1425[texture_edge_a[i_788_]];
						int i_804_ = ((i * ((Vertex) class70).normalized_normal_x
								+ i_783_ * ((Vertex) class70).normalized_normal_y
								+ i_784_ * ((Vertex) class70).normalized_normal_z) / ((Vertex) class70).anInt605) >> 16;
						int i_805_ = i_804_ > 256 ? i_786_ : i_787_;
						int i_806_ = (i_785_ >> 2) + (i_805_ * i_804_ >> 18);
						f_bb[i_788_] = method2236(i_806_);
						if (f_cc != null && f_cc[texture_edge_b[i_788_]] != null)
							class70 = f_cc[texture_edge_b[i_788_]];
						else
							class70 = aClass33Array1425[texture_edge_b[i_788_]];
						i_804_ = ((i * ((Vertex) class70).normalized_normal_x
								+ i_783_ * ((Vertex) class70).normalized_normal_y
								+ i_784_ * ((Vertex) class70).normalized_normal_z) / ((Vertex) class70).anInt605) >> 16;
						i_805_ = i_804_ > 256 ? i_786_ : i_787_;
						i_806_ = (i_785_ >> 2) + (i_805_ * i_804_ >> 18);
						anIntArray5280[i_788_] = method2236(i_806_);
						if (f_cc != null && f_cc[texture_edge_c[i_788_]] != null)
							class70 = f_cc[texture_edge_c[i_788_]];
						else
							class70 = aClass33Array1425[texture_edge_c[i_788_]];
						i_804_ = ((i * ((Vertex) class70).normalized_normal_x
								+ i_783_ * ((Vertex) class70).normalized_normal_y
								+ i_784_ * ((Vertex) class70).normalized_normal_z) / ((Vertex) class70).anInt605) >> 16;
						i_805_ = i_804_ > 256 ? i_786_ : i_787_;
						i_806_ = (i_785_ >> 2) + (i_805_ * i_804_ >> 18);
						hue_c[i_788_] = method2236(i_806_);
					} else if (i_789_ == 1) {
						Class89 class89 = aClass89Array5309[i_788_];
						int i_807_ = ((i * ((Class89) class89).anInt1159 + i_783_ * ((Class89) class89).anInt1158
								+ i_784_ * ((Class89) class89).anInt1157) >> 16);
						int i_808_ = i_807_ > 256 ? i_786_ : i_787_;
						int i_809_ = (i_785_ >> 2) + (i_808_ * i_807_ >> 18);
						f_bb[i_788_] = method2236(i_809_);
						hue_c[i_788_] = -1;
					} else
						hue_c[i_788_] = -2;
				}
				aClass33Array1425 = null;
				f_cc = null;
				aClass89Array5309 = null;
				if ((anInt5253 & 0x97298) == 0)
					facesColors = null;
				if (bool)
					render_type = null;
				anInt5278 = 2;
			}
		}
	}

	final void BA(short i, short i_810_) {
		for (int i_811_ = 0; i_811_ < faces; i_811_++) {
			if (facesColors[i_811_] == i)
				facesColors[i_811_] = i_810_;
		}
		if (aClass112Array5263 != null) {
			for (int i_812_ = 0; i_812_ < anInt5262; i_812_++) {
				Class112 class112 = aClass112Array5263[i_812_];
				Class145 class145 = f_lb[i_812_];
				((Class145) class145).anInt2106 = (((Class145) class145).anInt2106 & ~0xffffff
						| ((Entity.f_eb[Class_e.method594(125, (facesColors[(((Class112) class112).anInt1586)]))
								& 0xffff]) & 0xffffff));
			}
		}
		if (anInt5278 == 2)
			anInt5278 = 1;
	}

	private final void method2244() {
		if (!aBool5314) {
			int i = 0;
			int i_813_ = 0;
			int i_814_ = 32767;
			int i_815_ = 32767;
			int i_816_ = 32767;
			int i_817_ = -32768;
			int i_818_ = -32768;
			int i_819_ = -32768;
			for (int i_820_ = 0; i_820_ < vertices; i_820_++) {
				int i_821_ = vertex_position_x[i_820_];
				int i_822_ = vertex_position_y[i_820_];
				int i_823_ = vertex_position_z[i_820_];
				if (i_821_ < i_814_)
					i_814_ = i_821_;
				if (i_821_ > i_817_)
					i_817_ = i_821_;
				if (i_822_ < i_815_)
					i_815_ = i_822_;
				if (i_822_ > i_818_)
					i_818_ = i_822_;
				if (i_823_ < i_816_)
					i_816_ = i_823_;
				if (i_823_ > i_819_)
					i_819_ = i_823_;
				int i_824_ = i_821_ * i_821_ + i_823_ * i_823_;
				if (i_824_ > i)
					i = i_824_;
				i_824_ += i_822_ * i_822_;
				if (i_824_ > i_813_)
					i_813_ = i_824_;
			}
			aShort5271 = (short) i_814_;
			aShort5267 = (short) i_817_;
			aShort5300 = (short) i_815_;
			f_vb = (short) i_818_;
			f_ob = (short) i_816_;
			aShort5250 = (short) i_819_;
			aShort5259 = (short) (int) (Math.sqrt((double) i) + 0.99);
			Math.sqrt((double) i_813_);
			aBool5314 = true;
		}
	}

	private final void method2245() {
		for (int i = 0; i < vertices; i++) {
			int i_825_ = vertex_position_z[i];
			vertex_position_z[i] = vertex_position_x[i];
			vertex_position_x[i] = -i_825_;
			if (aClass33Array1425[i] != null) {
				i_825_ = ((Vertex) aClass33Array1425[i]).normalized_normal_z;
				((Vertex) aClass33Array1425[i]).normalized_normal_z = ((Vertex) aClass33Array1425[i]).normalized_normal_x;
				((Vertex) aClass33Array1425[i]).normalized_normal_x = -i_825_;
			}
		}
		if (aClass89Array5309 != null) {
			for (int i = 0; i < faces; i++) {
				if (aClass89Array5309[i] != null) {
					int i_826_ = ((Class89) aClass89Array5309[i]).anInt1157;
					((Class89) aClass89Array5309[i]).anInt1157 = ((Class89) aClass89Array5309[i]).anInt1159;
					((Class89) aClass89Array5309[i]).anInt1159 = -i_826_;
				}
			}
		}
		for (int i = vertices; i < anInt5254; i++) {
			int i_827_ = vertex_position_z[i];
			vertex_position_z[i] = vertex_position_x[i];
			vertex_position_x[i] = -i_827_;
		}
		anInt5278 = 0;
		aBool5314 = false;
	}

	private final boolean method2246(int i, int i_828_, int i_829_, int i_830_, int i_831_, int i_832_, int i_833_,
			int i_834_) {
		if (i_828_ < i_829_ && i_828_ < i_830_ && i_828_ < i_831_)
			return false;
		if (i_828_ > i_829_ && i_828_ > i_830_ && i_828_ > i_831_)
			return false;
		if (i < i_832_ && i < i_833_ && i < i_834_)
			return false;
		if (i > i_832_ && i > i_833_ && i > i_834_)
			return false;
		return true;
	}

	final AbstractModel method678(byte i, int i_835_, boolean bool) {
		method2231(Thread.currentThread());
		LDModel class_t_sub2_836_;
		LDModel class_t_sub2_837_;
		if (i == 1) {
			class_t_sub2_836_ = aClass_t_Sub2_5283;
			class_t_sub2_837_ = aClass_t_Sub2_5302;
		} else if (i == 2) {
			class_t_sub2_836_ = f_nc;
			class_t_sub2_837_ = aClass_t_Sub2_5274;
		} else if (i == 3) {
			class_t_sub2_836_ = f_kc;
			class_t_sub2_837_ = aClass_t_Sub2_5285;
		} else if (i == 4) {
			class_t_sub2_836_ = aClass_t_Sub2_5249;
			class_t_sub2_837_ = aClass_t_Sub2_5282;
		} else if (i == 5) {
			class_t_sub2_836_ = aClass_t_Sub2_5281;
			class_t_sub2_837_ = f_db;
		} else
			class_t_sub2_837_ = class_t_sub2_836_ = new LDModel(f_ub);
		return method2247(class_t_sub2_837_, class_t_sub2_836_, i_835_, i != 0, bool);
	}

	private final AbstractModel method2247(LDModel class_t_sub2_838_, LDModel class_t_sub2_839_, int i, boolean bool,
			boolean bool_840_) {
		class_t_sub2_838_.aBool5314 = aBool5314;
		if (aBool5314) {
			class_t_sub2_838_.aShort5267 = aShort5267;
			class_t_sub2_838_.f_vb = f_vb;
			class_t_sub2_838_.aShort5250 = aShort5250;
			class_t_sub2_838_.aShort5271 = aShort5271;
			class_t_sub2_838_.aShort5300 = aShort5300;
			class_t_sub2_838_.f_ob = f_ob;
			class_t_sub2_838_.aShort5259 = aShort5259;
		}
		class_t_sub2_838_.f_hb = f_hb;
		class_t_sub2_838_.contrast = contrast;
		class_t_sub2_838_.anInt5254 = anInt5254;
		class_t_sub2_838_.vertices = vertices;
		class_t_sub2_838_.faces = faces;
		class_t_sub2_838_.anInt5262 = anInt5262;
		boolean bool_841_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_842_ = bool_841_ || (i & 0x1) != 0;
		boolean bool_843_ = bool_841_ || (i & 0x2) != 0;
		boolean bool_844_ = bool_841_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_842_ || bool_843_ || bool_844_) {
			if (bool_842_) {
				if (class_t_sub2_839_.vertex_position_x == null
						|| class_t_sub2_839_.vertex_position_x.length < anInt5254)
					class_t_sub2_838_.vertex_position_x = class_t_sub2_839_.vertex_position_x = new int[anInt5254];
				else
					class_t_sub2_838_.vertex_position_x = class_t_sub2_839_.vertex_position_x;
				for (int i_845_ = 0; i_845_ < anInt5254; i_845_++)
					class_t_sub2_838_.vertex_position_x[i_845_] = vertex_position_x[i_845_];
			} else
				class_t_sub2_838_.vertex_position_x = vertex_position_x;
			if (bool_843_) {
				if (class_t_sub2_839_.vertex_position_y == null
						|| class_t_sub2_839_.vertex_position_y.length < anInt5254)
					class_t_sub2_838_.vertex_position_y = class_t_sub2_839_.vertex_position_y = new int[anInt5254];
				else
					class_t_sub2_838_.vertex_position_y = class_t_sub2_839_.vertex_position_y;
				for (int i_846_ = 0; i_846_ < anInt5254; i_846_++)
					class_t_sub2_838_.vertex_position_y[i_846_] = vertex_position_y[i_846_];
			} else
				class_t_sub2_838_.vertex_position_y = vertex_position_y;
			if (bool_844_) {
				if (class_t_sub2_839_.vertex_position_z == null
						|| class_t_sub2_839_.vertex_position_z.length < anInt5254)
					class_t_sub2_838_.vertex_position_z = class_t_sub2_839_.vertex_position_z = new int[anInt5254];
				else
					class_t_sub2_838_.vertex_position_z = class_t_sub2_839_.vertex_position_z;
				for (int i_847_ = 0; i_847_ < anInt5254; i_847_++)
					class_t_sub2_838_.vertex_position_z[i_847_] = vertex_position_z[i_847_];
			} else
				class_t_sub2_838_.vertex_position_z = vertex_position_z;
		} else {
			class_t_sub2_838_.vertex_position_x = vertex_position_x;
			class_t_sub2_838_.vertex_position_y = vertex_position_y;
			class_t_sub2_838_.vertex_position_z = vertex_position_z;
		}
		if ((i & 0x84080) != 0) {
			if (class_t_sub2_839_.facesColors == null || class_t_sub2_839_.facesColors.length < faces) {
				int i_848_ = faces;
				class_t_sub2_838_.facesColors = class_t_sub2_839_.facesColors = new short[i_848_];
			} else
				class_t_sub2_838_.facesColors = class_t_sub2_839_.facesColors;
			for (int i_849_ = 0; i_849_ < faces; i_849_++)
				class_t_sub2_838_.facesColors[i_849_] = facesColors[i_849_];
		} else
			class_t_sub2_838_.facesColors = facesColors;
		if ((i & 0x97218) != 0) {
			class_t_sub2_838_.anInt5278 = 0;
			class_t_sub2_838_.f_bb = class_t_sub2_838_.anIntArray5280 = class_t_sub2_838_.hue_c = null;
		} else if ((i & 0x80) != 0) {
			if (bool_840_)
				method2243(false);
			if (f_bb != null) {
				if (class_t_sub2_839_.f_bb == null || class_t_sub2_839_.f_bb.length < faces) {
					int i_850_ = faces;
					class_t_sub2_838_.f_bb = class_t_sub2_839_.f_bb = new int[i_850_];
					class_t_sub2_838_.anIntArray5280 = class_t_sub2_839_.anIntArray5280 = new int[i_850_];
					class_t_sub2_838_.hue_c = class_t_sub2_839_.hue_c = new int[i_850_];
				} else {
					class_t_sub2_838_.f_bb = class_t_sub2_839_.f_bb;
					class_t_sub2_838_.anIntArray5280 = class_t_sub2_839_.anIntArray5280;
					class_t_sub2_838_.hue_c = class_t_sub2_839_.hue_c;
				}
				for (int i_851_ = 0; i_851_ < faces; i_851_++) {
					class_t_sub2_838_.f_bb[i_851_] = f_bb[i_851_];
					class_t_sub2_838_.anIntArray5280[i_851_] = anIntArray5280[i_851_];
					class_t_sub2_838_.hue_c[i_851_] = hue_c[i_851_];
				}
			}
			class_t_sub2_838_.anInt5278 = anInt5278;
		} else {
			if (bool_840_)
				method2243(false);
			class_t_sub2_838_.f_bb = f_bb;
			class_t_sub2_838_.anIntArray5280 = anIntArray5280;
			class_t_sub2_838_.hue_c = hue_c;
			class_t_sub2_838_.anInt5278 = anInt5278;
		}
		if ((i & 0x100) != 0) {
			if (class_t_sub2_839_.alpha == null || class_t_sub2_839_.alpha.length < faces) {
				int i_852_ = faces;
				class_t_sub2_838_.alpha = class_t_sub2_839_.alpha = new int[i_852_];
			} else
				class_t_sub2_838_.alpha = class_t_sub2_839_.alpha;
			if (alpha != null) {
				for (int i_853_ = 0; i_853_ < faces; i_853_++)
					class_t_sub2_838_.alpha[i_853_] = alpha[i_853_];
			} else {
				for (int i_854_ = 0; i_854_ < faces; i_854_++)
					class_t_sub2_838_.alpha[i_854_] = (byte) 0;
			}
		} else
			class_t_sub2_838_.alpha = alpha;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (class_t_sub2_839_.aClass33Array1425 == null || class_t_sub2_839_.aClass33Array1425.length < vertices) {
				int i_855_ = vertices;
				class_t_sub2_838_.aClass33Array1425 = class_t_sub2_839_.aClass33Array1425 = new Vertex[i_855_];
			} else
				class_t_sub2_838_.aClass33Array1425 = class_t_sub2_839_.aClass33Array1425;
			if (aClass33Array1425 != null) {
				for (int i_856_ = 0; i_856_ < vertices; i_856_++)
					class_t_sub2_838_.aClass33Array1425[i_856_] = new Vertex(aClass33Array1425[i_856_]);
			} else
				class_t_sub2_838_.aClass33Array1425 = null;
			if (aClass89Array5309 != null) {
				if (class_t_sub2_839_.aClass89Array5309 == null
						|| (class_t_sub2_839_.aClass89Array5309.length < faces)) {
					int i_857_ = faces;
					class_t_sub2_838_.aClass89Array5309 = class_t_sub2_839_.aClass89Array5309 = new Class89[i_857_];
				} else
					class_t_sub2_838_.aClass89Array5309 = class_t_sub2_839_.aClass89Array5309;
				for (int i_858_ = 0; i_858_ < faces; i_858_++)
					class_t_sub2_838_.aClass89Array5309[i_858_] = (aClass89Array5309[i_858_] != null
							? new Class89(aClass89Array5309[i_858_])
							: null);
			} else
				class_t_sub2_838_.aClass89Array5309 = null;
		} else {
			if (bool_840_)
				lighting();
			class_t_sub2_838_.aClass33Array1425 = aClass33Array1425;
			class_t_sub2_838_.aClass89Array5309 = aClass89Array5309;
		}
		if ((i & 0x8000) != 0) {
			if (texture_faces == null)
				class_t_sub2_838_.texture_faces = null;
			else {
				if (class_t_sub2_839_.texture_faces == null || class_t_sub2_839_.texture_faces.length < faces) {
					int i_859_ = faces;
					class_t_sub2_838_.texture_faces = class_t_sub2_839_.texture_faces = new short[i_859_];
				} else
					class_t_sub2_838_.texture_faces = class_t_sub2_839_.texture_faces;
				for (int i_860_ = 0; i_860_ < faces; i_860_++)
					class_t_sub2_838_.texture_faces[i_860_] = texture_faces[i_860_];
			}
		} else
			class_t_sub2_838_.texture_faces = texture_faces;
		if ((i & 0x10000) != 0) {
			if (render_type == null)
				class_t_sub2_838_.render_type = null;
			else {
				if (class_t_sub2_839_.render_type == null || class_t_sub2_839_.render_type.length < faces) {
					int i_861_ = bool ? faces + 100 : faces;
					class_t_sub2_838_.render_type = class_t_sub2_839_.render_type = new int[i_861_];
				} else
					class_t_sub2_838_.render_type = class_t_sub2_839_.render_type;
				for (int i_862_ = 0; i_862_ < faces; i_862_++)
					class_t_sub2_838_.render_type[i_862_] = render_type[i_862_];
			}
		} else
			class_t_sub2_838_.render_type = render_type;
		if ((i & 0x580) != 0) {
			if (class_t_sub2_839_.f_lb == null || class_t_sub2_839_.f_lb.length < anInt5262) {
				int i_863_ = anInt5262;
				class_t_sub2_838_.f_lb = class_t_sub2_839_.f_lb = new Class145[i_863_];
				for (int i_864_ = 0; i_864_ < anInt5262; i_864_++)
					class_t_sub2_838_.f_lb[i_864_] = f_lb[i_864_].method974(-21447);
			} else {
				class_t_sub2_838_.f_lb = class_t_sub2_839_.f_lb;
				for (int i_865_ = 0; i_865_ < anInt5262; i_865_++)
					class_t_sub2_838_.f_lb[i_865_].method979(262144, f_lb[i_865_]);
			}
		} else
			class_t_sub2_838_.f_lb = f_lb;
		class_t_sub2_838_.verticesByLabel = verticesByLabel;
		class_t_sub2_838_.facesByLabel = facesByLabel;
		class_t_sub2_838_.anIntArrayArray5296 = anIntArrayArray5296;
		class_t_sub2_838_.f_bc = f_bc;
		class_t_sub2_838_.aShortArray5269 = aShortArray5269;
		class_t_sub2_838_.f_nb = f_nb;
		class_t_sub2_838_.f_sb = f_sb;
		class_t_sub2_838_.f_mb = f_mb;
		class_t_sub2_838_.f_kb = f_kb;
		class_t_sub2_838_.f_ac = f_ac;
		class_t_sub2_838_.anIntArray5275 = anIntArray5275;
		class_t_sub2_838_.anIntArray5248 = anIntArray5248;
		class_t_sub2_838_.texture_edge_a = texture_edge_a;
		class_t_sub2_838_.texture_edge_b = texture_edge_b;
		class_t_sub2_838_.texture_edge_c = texture_edge_c;
		class_t_sub2_838_.aClass19Array5256 = aClass19Array5256;
		class_t_sub2_838_.aClass162Array5257 = aClass162Array5257;
		class_t_sub2_838_.aClass112Array5263 = aClass112Array5263;
		class_t_sub2_838_.anInt5253 = i;
		return class_t_sub2_838_;
	}

	private final void method2248() {
		for (int i = 0; i < vertices; i++) {
			vertex_position_x[i] = -vertex_position_x[i];
			vertex_position_z[i] = -vertex_position_z[i];
			if (aClass33Array1425[i] != null) {
				((Vertex) aClass33Array1425[i]).normalized_normal_x = -((Vertex) aClass33Array1425[i]).normalized_normal_x;
				((Vertex) aClass33Array1425[i]).normalized_normal_z = -((Vertex) aClass33Array1425[i]).normalized_normal_z;
			}
		}
		if (aClass89Array5309 != null) {
			for (int i = 0; i < faces; i++) {
				if (aClass89Array5309[i] != null) {
					((Class89) aClass89Array5309[i]).anInt1159 = -((Class89) aClass89Array5309[i]).anInt1159;
					((Class89) aClass89Array5309[i]).anInt1157 = -((Class89) aClass89Array5309[i]).anInt1157;
				}
			}
		}
		for (int i = vertices; i < anInt5254; i++) {
			vertex_position_x[i] = -vertex_position_x[i];
			vertex_position_z[i] = -vertex_position_z[i];
		}
		anInt5278 = 0;
		aBool5314 = false;
	}

	private final void lighting() {
		if (anInt5278 == 0) {
			aClass33Array1425 = new Vertex[vertices];
			for (int index = 0; index < vertices; index++) {
				aClass33Array1425[index] = new Vertex();
			}
			for (int face = 0; face < faces; face++) {
				int point_a = texture_edge_a[face];
				int point_b = texture_edge_b[face];
				int point_c = texture_edge_c[face];
				int b_a_position_x = vertex_position_x[point_b] - vertex_position_x[point_a];
				int b_a_position_y = vertex_position_y[point_b] - vertex_position_y[point_a];
				int b_a_position_z = vertex_position_z[point_b] - vertex_position_z[point_a];
				int c_a_position_x = vertex_position_x[point_c] - vertex_position_x[point_a];
				int c_a_position_y = vertex_position_y[point_c] - vertex_position_y[point_a];
				int c_a_position_z = vertex_position_z[point_c] - vertex_position_z[point_a];
				int normalized_normal_x = b_a_position_y * c_a_position_z - c_a_position_y * b_a_position_z;
				int normalized_normal_y = b_a_position_z * c_a_position_x - c_a_position_z * b_a_position_x;
				int normalized_normal_z;
				for (normalized_normal_z = b_a_position_x * c_a_position_y
						- c_a_position_x * b_a_position_y; (normalized_normal_x > 8192 || normalized_normal_y > 8192
								|| normalized_normal_z > 8192 || normalized_normal_x < -8192
								|| normalized_normal_y < -8192
								|| normalized_normal_z < -8192); normalized_normal_z >>= 1) {
					normalized_normal_x >>= 1;
					normalized_normal_y >>= 1;
				}
				int directional_light_length = (int) Math.sqrt((double) (normalized_normal_x * normalized_normal_x
						+ normalized_normal_y * normalized_normal_y + normalized_normal_z * normalized_normal_z));
				if (directional_light_length <= 0)
					directional_light_length = 1;
				normalized_normal_x = normalized_normal_x * 256 / directional_light_length;
				normalized_normal_y = normalized_normal_y * 256 / directional_light_length;
				normalized_normal_z = normalized_normal_z * 256 / directional_light_length;
				int type;
				if (render_type == null) {
					type = 0;
				} else {
					type = render_type[face];
				}
				if (this.revision == Revision.OSRS) {
					int transparent;
					if (alpha == null)
						transparent = 0;
					else
						transparent = alpha[face];

					short material_id;
					if (faceMaterials == null)
						material_id = -1;
					else
						material_id = faceMaterials[face];

					if (transparent == -2) {
						type = 3;
					}
					if (transparent == -1) {
						type = 2;
					}
				}
				if (type == 0) {
					Vertex class70 = aClass33Array1425[point_a];
					((Vertex) class70).normalized_normal_x += normalized_normal_x;
					((Vertex) class70).normalized_normal_y += normalized_normal_y;
					((Vertex) class70).normalized_normal_z += normalized_normal_z;
					((Vertex) class70).anInt605++;
					class70 = aClass33Array1425[point_b];
					((Vertex) class70).normalized_normal_x += normalized_normal_x;
					((Vertex) class70).normalized_normal_y += normalized_normal_y;
					((Vertex) class70).normalized_normal_z += normalized_normal_z;
					((Vertex) class70).anInt605++;
					class70 = aClass33Array1425[point_c];
					((Vertex) class70).normalized_normal_x += normalized_normal_x;
					((Vertex) class70).normalized_normal_y += normalized_normal_y;
					((Vertex) class70).normalized_normal_z += normalized_normal_z;
					((Vertex) class70).anInt605++;
				} else if (type == 1) {
					if (aClass89Array5309 == null)
						aClass89Array5309 = new Class89[faces];
					Class89 class89 = aClass89Array5309[face] = new Class89();
					((Class89) class89).anInt1159 = normalized_normal_x;
					((Class89) class89).anInt1158 = normalized_normal_y;
					((Class89) class89).anInt1157 = normalized_normal_z;
				}
			}
		}
	}

	LDModel(Class260_Sub1 class260_sub1) {
		f_jb = false;
		anInt5278 = 0;
		f_eb = false;
		faces = 0;
		f_mb = (byte) -1;
		aBool5314 = false;
		vertices = 0;
		aBool5290 = false;
		f_ub = class260_sub1;
	}

	final Class246_Sub1_Sub4 fa(Class246_Sub1_Sub4 class246_sub1_sub4) {
		return null;
	}

	Revision revision;

	LDModel(Class260_Sub1 class260_sub1, Model class103, int i, int i_880_, int i_881_, int i_882_) {
		f_jb = false;
		anInt5278 = 0;
		f_eb = false;
		faces = 0;
		f_mb = (byte) -1;
		aBool5314 = false;
		vertices = 0;
		aBool5290 = false;
		f_ub = class260_sub1;
		anInt5253 = i;
		f_hb = i_880_;
		contrast = i_881_;
		revision = class103.revision;
		anInt5254 = ((Model) class103).vertices;
		vertices = ((Model) class103).anInt1573;
		vertex_position_x = ((Model) class103).verticesX;
		vertex_position_y = ((Model) class103).verticesY;
		vertex_position_z = ((Model) class103).verticesZ;
		faces = ((Model) class103).faces;

		texture_edge_a = ((Model) class103).indices1;
		texture_edge_b = ((Model) class103).indices2;
		texture_edge_c = ((Model) class103).indices3;
		f_mb = ((Model) class103).priority;
		f_sb = ((Model) class103).faceRenderPriorities;
		faceMaterials = ((Model) class103).faceTextures;
		facesColors = ((Model) class103).faceColors;
		alpha = ((Model) class103).faceAlphas;
		aShortArray5269 = ((Model) class103).aShortArray1338;
		render_type = ((Model) class103).faceRenderTypes;
		aClass19Array5256 = ((Model) class103).aClass19Array1364;
		aClass162Array5257 = ((Model) class103).aClass303Array1547;
		f_bc = ((Model) class103).aShortArray1351;
		if (((Model) class103).aClass125Array1583 != null) {
			anInt5262 = ((Model) class103).aClass125Array1583.length;
			aClass112Array5263 = new Class112[anInt5262];
			f_lb = new Class145[anInt5262];
			for (int i_883_ = 0; i_883_ < ((Model) class103).aClass125Array1583.length; i_883_++) {
				SomeClass class131 = ((Model) class103).aClass125Array1583[i_883_];
				Class98 class98 = Class247.method1578(true, ((SomeClass) class131).anInt1828);
				int i_884_ = (Entity.f_eb[((((Model) class103).faceColors[((SomeClass) class131).anInt1823]) & 0xffff)]
						& 0xffffff);
				i_884_ = (i_884_ | 255 - (((Model) class103).faceAlphas != null
						? (((Model) class103).faceAlphas[((SomeClass) class131).anInt1823]) & 0xff
						: 0) << 24);
				aClass112Array5263[i_883_] = new Class112(((SomeClass) class131).anInt1823,
						(((Model) class103).indices1[((SomeClass) class131).anInt1823]),
						(((Model) class103).indices2[((SomeClass) class131).anInt1823]),
						(((Model) class103).indices3[((SomeClass) class131).anInt1823]),
						((Class98) class98).anInt1271, ((Class98) class98).anInt1278, ((Class98) class98).anInt1269,
						((Class98) class98).anInt1268, ((Class98) class98).anInt1276, ((Class98) class98).aBool1277);
				f_lb[i_883_] = new Class145(i_884_);
			}
		}
		if (((Model) class103).vertexSkins != null && (anInt5253 & 0x20) != 0)
			verticesByLabel = class103.method657((byte) -62);
		if (((Model) class103).faceSkins != null && (anInt5253 & 0x180) != 0)
			facesByLabel = class103.method652(true);
		if (((Model) class103).aClass125Array1583 != null && (anInt5253 & 0x400) != 0)
			anIntArrayArray5296 = class103.method644((byte) 56);
		if (((Model) class103).faceTextures != null) {
			texture_faces = new short[faces];
			boolean bool = false;
			for (int i_885_ = 0; i_885_ < faces; i_885_++) {
				short material_id = ((Model) class103).faceTextures[i_885_];
				if (material_id != -1 && (TextureLoader.osrs(material_id)
						|| !((Material) ((SceneGraph) f_ub).anInterface6_3714.get_material(-31305,
								material_id)).aBool3339)) {
					texture_faces[i_885_] = material_id;
					bool = true;
				} else
					texture_faces[i_885_] = (short) -1;
			}
			if (!bool)
				texture_faces = null;
		} else
			texture_faces = null;
		if (texture_faces != null && ((Model) class103).texture_faces > 0 && ((Model) class103).textureCoords != null) {
			int[] is = new int[((Model) class103).texture_faces];
			for (int i_887_ = 0; i_887_ < faces; i_887_++) {
				if (((Model) class103).textureCoords[i_887_] != -1)
					is[((Model) class103).textureCoords[i_887_] & 0xff]++;
			}
			f_kb = 0;
			for (int i_888_ = 0; i_888_ < ((Model) class103).texture_faces; i_888_++) {
				if (is[i_888_] > 0 && ((Model) class103).textureRenderTypes[i_888_] == 0)
					f_kb++;
			}
			f_ac = new int[f_kb];
			anIntArray5275 = new int[f_kb];
			anIntArray5248 = new int[f_kb];
			int i_889_ = 0;
			for (int i_890_ = 0; i_890_ < ((Model) class103).texture_faces; i_890_++) {
				if (is[i_890_] > 0 && ((Model) class103).textureRenderTypes[i_890_] == 0) {
					f_ac[i_889_] = (((Model) class103).texIndices1[i_890_] & 0xffff);
					anIntArray5275[i_889_] = (((Model) class103).texIndices2[i_890_] & 0xffff);
					anIntArray5248[i_889_] = (((Model) class103).texIndices3[i_890_] & 0xffff);
					is[i_890_] = i_889_++;
				} else
					is[i_890_] = -1;
			}
			f_nb = new byte[faces];
			for (int i_891_ = 0; i_891_ < faces; i_891_++) {
				if (((Model) class103).textureCoords[i_891_] != -1) {
					f_nb[i_891_] = (byte) is[((Model) class103).textureCoords[i_891_] & 0xff];
					if (f_nb[i_891_] == -1 && texture_faces != null)
						texture_faces[i_891_] = (short) -1;
				} else
					f_nb[i_891_] = (byte) -1;
			}
		}
	}

	private LDModel(Class260_Sub1 class260_sub1, LDModel[] class_t_sub2s) {
		f_jb = false;
		anInt5278 = 0;
		f_eb = false;
		faces = 0;
		f_mb = (byte) -1;
		aBool5314 = false;
		vertices = 0;
		aBool5290 = false;
		f_ub = class260_sub1;
		boolean bool = false;
		boolean bool_892_ = false;
		boolean bool_893_ = false;
		boolean bool_894_ = false;
		anInt5254 = 0;
		faces = 0;
		f_kb = 0;
		anInt5262 = 0;
		int i = 0;
		int i_895_ = 0;
		f_mb = (byte) -1;
		for (int i_896_ = 0; i_896_ < class_t_sub2s.length; i_896_++) {
			LDModel class_t_sub2_897_ = class_t_sub2s[i_896_];
			if (class_t_sub2_897_ != null) {
				anInt5254 += class_t_sub2_897_.anInt5254;
				faces += class_t_sub2_897_.faces;
				f_kb += class_t_sub2_897_.f_kb;
				if (class_t_sub2_897_.f_sb != null)
					bool = true;
				else {
					if (f_mb == -1)
						f_mb = class_t_sub2_897_.f_mb;
					if (f_mb != class_t_sub2_897_.f_mb)
						bool = true;
				}
				bool_892_ = bool_892_ | class_t_sub2_897_.alpha != null;
				bool_893_ = bool_893_ | class_t_sub2_897_.texture_faces != null;
				bool_894_ = bool_894_ | class_t_sub2_897_.f_nb != null;
				if (class_t_sub2_897_.aClass19Array5256 != null)
					i += class_t_sub2_897_.aClass19Array5256.length;
				if (class_t_sub2_897_.aClass162Array5257 != null)
					i_895_ += class_t_sub2_897_.aClass162Array5257.length;
				if (class_t_sub2_897_.aClass112Array5263 != null)
					anInt5262 += class_t_sub2_897_.anInt5262;
			}
		}

		vertex_position_x = new int[anInt5254];
		vertex_position_y = new int[anInt5254];
		vertex_position_z = new int[anInt5254];
		texture_edge_a = new int[faces];
		texture_edge_b = new int[faces];
		texture_edge_c = new int[faces];
		f_bb = new int[faces];
		anIntArray5280 = new int[faces];
		hue_c = new int[faces];
		if (bool)
			f_sb = new byte[faces];
		if (bool_892_)
			alpha = new int[faces];
		if (bool_893_)
			texture_faces = new short[faces];
		if (bool_894_)
			f_nb = new byte[faces];
		if (f_kb > 0) {
			f_ac = new int[f_kb];
			anIntArray5275 = new int[f_kb];
			anIntArray5248 = new int[f_kb];
		}
		if (i > 0)
			aClass19Array5256 = new Class19[i];
		if (i_895_ > 0)
			aClass162Array5257 = new Class303[i_895_];
		if (anInt5262 > 0) {
			aClass112Array5263 = new Class112[anInt5262];
			f_lb = new Class145[anInt5262];
		}
		anInt5254 = 0;
		int i_898_ = faces;
		faces = 0;
		f_kb = 0;
		i_895_ = 0;
		i = 0;
		anInt5262 = 0;
		for (int i_899_ = 0; i_899_ < class_t_sub2s.length; i_899_++) {
			LDModel class_t_sub2_900_ = class_t_sub2s[i_899_];
			if (class_t_sub2_900_ != null) {
				class_t_sub2_900_.method2243(false);
				if (class_t_sub2_900_.facesColors != null && facesColors == null)
					facesColors = new short[i_898_];
				if (class_t_sub2_900_.aClass112Array5263 != null) {
					for (int i_901_ = 0; i_901_ < class_t_sub2_900_.anInt5262; i_901_++) {
						Class112 class112 = class_t_sub2_900_.aClass112Array5263[i_901_];
						aClass112Array5263[anInt5262] = (class112.method769(
								((class_t_sub2_900_.texture_edge_c[((Class112) class112).anInt1586]) + anInt5254),
								faces + ((Class112) class112).anInt1586, 125,
								((class_t_sub2_900_.texture_edge_b[((Class112) class112).anInt1586]) + anInt5254),
								((class_t_sub2_900_.texture_edge_a[((Class112) class112).anInt1586]) + anInt5254)));
						f_lb[anInt5262] = class_t_sub2_900_.f_lb[i_901_].method974(-21447);
						anInt5262++;
					}
				}
				for (int i_902_ = 0; i_902_ < class_t_sub2_900_.faces; i_902_++) {
					texture_edge_a[faces] = (short) (class_t_sub2_900_.texture_edge_a[i_902_] + anInt5254);
					texture_edge_b[faces] = (short) (class_t_sub2_900_.texture_edge_b[i_902_] + anInt5254);
					texture_edge_c[faces] = (short) (class_t_sub2_900_.texture_edge_c[i_902_] + anInt5254);
					f_bb[faces] = class_t_sub2_900_.f_bb[i_902_];
					anIntArray5280[faces] = class_t_sub2_900_.anIntArray5280[i_902_];
					hue_c[faces] = class_t_sub2_900_.hue_c[i_902_];
					if (class_t_sub2_900_.facesColors != null)
						facesColors[faces] = class_t_sub2_900_.facesColors[i_902_];
					if (bool) {
						if (class_t_sub2_900_.f_sb != null)
							f_sb[faces] = class_t_sub2_900_.f_sb[i_902_];
						else if (class_t_sub2_900_.f_mb != -1)
							f_sb[faces] = class_t_sub2_900_.f_mb;
						else
							f_sb[faces] = (byte) 10;
					}
					if (bool_892_ && class_t_sub2_900_.alpha != null)
						alpha[faces] = class_t_sub2_900_.alpha[i_902_];
					if (bool_893_) {
						if (class_t_sub2_900_.texture_faces != null)
							texture_faces[faces] = class_t_sub2_900_.texture_faces[i_902_];
						else
							texture_faces[faces] = (short) -1;
					}
					if (bool_894_)
						f_nb[faces] = (byte) ((class_t_sub2_900_.f_nb != null && class_t_sub2_900_.f_nb[i_902_] != -1)
								? class_t_sub2_900_.f_nb[i_902_] + f_kb
								: -1);
					faces++;
				}
				if (class_t_sub2_900_.aClass19Array5256 != null) {
					for (int i_903_ = 0; i_903_ < class_t_sub2_900_.aClass19Array5256.length; i_903_++) {
						Class19 class19 = class_t_sub2_900_.aClass19Array5256[i_903_];
						aClass19Array5256[i] = new Class19(class19, anInt5254);
						i++;
					}
				}
				if (class_t_sub2_900_.aClass162Array5257 != null) {
					for (int i_904_ = 0; i_904_ < class_t_sub2_900_.aClass162Array5257.length; i_904_++) {
						Class303 class162 = class_t_sub2_900_.aClass162Array5257[i_904_];
						aClass162Array5257[i_895_] = new Class303(class162, anInt5254);
						i_895_++;
					}
				}
				for (int i_905_ = 0; i_905_ < class_t_sub2_900_.f_kb; i_905_++) {
					if (class_t_sub2_900_.f_ac[i_905_] < class_t_sub2_900_.vertices)
						f_ac[f_kb] = class_t_sub2_900_.f_ac[i_905_] + anInt5254;
					if (class_t_sub2_900_.anIntArray5275[i_905_] < class_t_sub2_900_.vertices)
						anIntArray5275[f_kb] = (class_t_sub2_900_.anIntArray5275[i_905_] + anInt5254);
					if (class_t_sub2_900_.anIntArray5248[i_905_] < class_t_sub2_900_.vertices)
						anIntArray5248[f_kb] = (class_t_sub2_900_.anIntArray5248[i_905_] + anInt5254);
					f_kb++;
				}
				for (int i_906_ = 0; i_906_ < class_t_sub2_900_.vertices; i_906_++) {
					vertex_position_x[anInt5254] = class_t_sub2_900_.vertex_position_x[i_906_];
					vertex_position_y[anInt5254] = class_t_sub2_900_.vertex_position_y[i_906_];
					vertex_position_z[anInt5254] = class_t_sub2_900_.vertex_position_z[i_906_];
					anInt5254++;
				}
			}
		}
		anInt5278 = 2;
		int i_907_ = 0;
		vertices = anInt5254;
		for (int i_908_ = 0; i_908_ < class_t_sub2s.length; i_908_++) {
			LDModel class_t_sub2_909_ = class_t_sub2s[i_908_];
			if (class_t_sub2_909_ != null) {
				for (int i_910_ = 0; i_910_ < class_t_sub2_909_.f_kb; i_910_++) {
					if (class_t_sub2_909_.f_ac[i_910_] >= class_t_sub2_909_.vertices)
						f_ac[i_907_] = (class_t_sub2_909_.f_ac[i_910_] - class_t_sub2_909_.vertices + anInt5254);
					if (class_t_sub2_909_.anIntArray5275[i_910_] >= class_t_sub2_909_.vertices)
						anIntArray5275[i_907_] = (class_t_sub2_909_.anIntArray5275[i_910_] - class_t_sub2_909_.vertices
								+ anInt5254);
					if (class_t_sub2_909_.anIntArray5248[i_910_] >= class_t_sub2_909_.vertices)
						anIntArray5248[i_907_] = (class_t_sub2_909_.anIntArray5248[i_910_] - class_t_sub2_909_.vertices
								+ anInt5254);
					i_907_++;
				}
				for (int i_911_ = class_t_sub2_909_.vertices; i_911_ < class_t_sub2_909_.anInt5254; i_911_++) {
					vertex_position_x[anInt5254] = class_t_sub2_909_.vertex_position_x[i_911_];
					vertex_position_y[anInt5254] = class_t_sub2_909_.vertex_position_y[i_911_];
					vertex_position_z[anInt5254] = class_t_sub2_909_.vertex_position_z[i_911_];
					anInt5254++;
				}
			}
		}
	}

	final Class303[] method676() {
		return aClass162Array5257;
	}

	static {
		f_rb = Class179.method1169(2200, (byte) -14);
		f_sc = 0;
		f_rc = new int[4096];
		for (int i = 1; i < 4096; i++)
			f_rc[i] = 65536 / i;
	}
}
