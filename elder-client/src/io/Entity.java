package io;

import io.cache.Revision;

abstract class Entity extends Class59_Sub3 {

	int gfx_revision;

	public Revision revision;

	static int anInt6413;
	boolean aBool6414;
	int anInt6415 = 0;
	static int anInt6416;
	int anInt6417;
	int anInt6418 = 0;
	boolean aBool6419;
	int anInt6420;
	int anInt6421;
	int anInt6422;
	static int anInt6423;
	int anInt6424;
	byte aByte6425;
	int current_sequence = -1;
	int anInt6427;
	int anInt6428;
	String aString6429;
	static int anInt6430;
	int anInt6431;
	int anInt6432;
	int anInt6433;
	int[] anIntArray6434;
	int anInt6435;
	byte aByte6436;
	int anInt6437;
	int anInt6438;
	int anInt6439;
	static int anInt6440;
	boolean aBool6441;
	int anInt6442;
	int faceEntity;
	int f_bb;
	int f_cb;
	int f_db;
	static int[] f_eb;
	Class24 f_fb;
	static int f_gb;
	static int f_hb;
	int f_ib;
	int f_jb;
	int f_kb;
	int f_lb;
	byte f_mb;
	int f_nb;
	int f_ob;
	int f_pb;
	int f_qb;
	static int f_rb;
	int f_sb;
	static int f_tb;
	int f_ub;
	int f_vb;
	int f_wb;
	int anInt6443;
	int anInt6444;
	static int anInt6445;
	int anInt6446;
	int[] anIntArray6447;
	int anInt6448;
	int anInt6449;
	boolean aBool6450;
	static int anInt6451;
	int anInt6452;
	int anInt6453;
	int anInt6454;
	int anInt6455;
	int anInt6456;
	int anInt6457;
	int anInt6458;
	static int anInt6459;
	int anInt6460;
	int anInt6461;
	int anInt6462;
	int anInt6463;
	int anInt6464;
	int anInt6465;
	int anInt6466;
	Class148[] aClass148Array6467;
	byte aByte6468;
	static int anInt6469;
	int anInt6470;
	int anInt6471;
	private int f_ac;
	static int f_bc;
	int f_cc;
	static int f_dc;
	static int f_ec;
	int f_fc;
	int[] anIntArray6472;
	int f_hc;
	private Class24 f_ic;
	private Class24 f_jc;
	int f_kc;
	Class130_Sub2 f_lc;
	int[] f_mc;
	int[] f_nc;
	int f_oc;
	Class246_Sub16 f_pc;
	AbstractModel[] f_qc;
	byte[] f_rc;
	int f_sc;
	int f_tc;
	boolean f_uc;

	final void method2660(boolean bool, AbstractModel[] class_ts, int i, SceneGraph class260) {
		do {
			try {
				anInt6469++;
				if (i == 0) {
					do {
						if (bool) {
							if (((Entity) this).f_lc == null)
								break;
							((Entity) this).f_lc.method1776((long) Client.cycle);
							if (!Client.f_ob)
								break;
						}
						AbstractModel class_t = class_ts[0];
						AbstractModel class_t_0_ = class_ts[1];
						AbstractModel class_t_1_ = class_ts[3];
						if (class_t != null) {
							int i_2_ = 0;
							int i_3_ = 0;
							int i_4_ = 0;
							int i_5_ = 0;
							Class19[] class19s = class_t.method672();
							Class303[] class162s = class_t.method676();
							if (class19s != null) {
								i_3_++;
								i_2_ += class19s.length;
							}
							if (class162s != null) {
								i_4_ += class162s.length;
								i_5_++;
							}
							Class19[] class19s_6_ = null;
							Class303[] class162s_7_ = null;
							if (class_t_0_ != null) {
								class19s_6_ = class_t_0_.method672();
								class162s_7_ = class_t_0_.method676();
							}
							if (class162s_7_ != null) {
								i_4_ += class162s_7_.length;
								i_5_++;
							}
							if (class19s_6_ != null) {
								i_2_ += class19s_6_.length;
								i_3_++;
							}
							Class19[] class19s_8_ = null;
							Class303[] class162s_9_ = null;
							if (class_t_1_ != null) {
								class19s_8_ = class_t_1_.method672();
								class162s_9_ = class_t_1_.method676();
							}
							if (class162s_9_ != null) {
								i_4_ += class162s_9_.length;
								i_5_++;
							}
							if (class19s_8_ != null) {
								i_2_ += class19s_8_.length;
								i_3_++;
							}
							if ((((Entity) this).f_lc == null || (((Class130_Sub2) ((Entity) this).f_lc).aBool3789))
									&& (i_3_ > 0 || i_5_ > 0))
								((Entity) this).f_lc = new Class130_Sub2(Client.cycle);
							if (((Entity) this).f_lc != null) {
								Object object = null;
								Class19[] class19s_10_;
								if (i_3_ == 1) {
									if (class19s_6_ == null) {
										if (class19s_8_ == null)
											class19s_10_ = class19s;
										else
											class19s_10_ = class19s_8_;
									} else
										class19s_10_ = class19s_6_;
								} else {
									class19s_10_ = new Class19[i_2_];
									int i_11_ = 0;
									if (class19s != null) {
										Class117.method807(class19s, 0, class19s_10_, i_11_, class19s.length);
										i_11_ += class19s.length;
									}
									if (class19s_6_ != null) {
										Class117.method807(class19s_6_, 0, class19s_10_, i_11_, class19s_6_.length);
										i_11_ += class19s_6_.length;
									}
									if (class19s_8_ != null)
										Class117.method807(class19s_8_, 0, class19s_10_, i_11_, class19s_8_.length);
								}
								Object object_12_ = null;
								Class303[] class162s_13_;
								if ((i_5_ ^ 0xffffffff) == -2) {
									if (class162s_7_ == null) {
										if (class162s_9_ != null)
											class162s_13_ = class162s_9_;
										else
											class162s_13_ = class162s;
									} else
										class162s_13_ = class162s_7_;
								} else {
									class162s_13_ = new Class303[i_4_];
									int i_14_ = 0;
									if (class162s != null) {
										Class117.method807(class162s, 0, class162s_13_, i_14_, class162s.length);
										i_14_ += class162s.length;
									}
									if (class162s_7_ != null) {
										Class117.method807(class162s_7_, 0, class162s_13_, i_14_, class162s_7_.length);
										i_14_ += class162s_7_.length;
									}
									if (class162s_9_ != null)
										Class117.method807(class162s_9_, 0, class162s_13_, i_14_, class162s_9_.length);
								}
								((Entity) this).f_lc.method1777(class260, (long) Client.cycle, class19s_10_,
										class162s_13_, false);
							}
							((Entity) this).f_uc = true;
						}
					} while (false);
					if (((Entity) this).f_lc == null)
						break;
					((Entity) this).f_lc.method1782(((Class59_Sub3) this).current_plane,
							((Class59_Sub3) this).aShort5057, ((Class59_Sub3) this).aShort5065,
							((Class59_Sub3) this).aShort5064, ((Class59_Sub3) this).aShort5062);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("r.RA(" + bool + ',' + (class_ts != null ? "{...}" : "null") + ',' + i + ','
								+ (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method2661(int i) {
		try {
			((Entity) this).f_oc = 0;
			if (i != 5525)
				((Entity) this).f_lb = 83;
			((Entity) this).f_sc = 0;
			anInt6423++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "r.BB(" + i + ')');
		}
	}

	final void method2662(int i, boolean bool) {
		try {
			((Entity) this).f_fb.method207(bool);
			anInt6451++;
			int i_15_ = 0x3fff & -((Class24) ((Entity) this).f_fb).anInt344 + i;
			if ((i_15_ ^ 0xffffffff) < -8193)
				((Entity) this).anInt6455 = (-16384 - -i_15_ + ((Class24) ((Entity) this).f_fb).anInt344);
			else
				((Entity) this).anInt6455 = i_15_ + ((Class24) ((Entity) this).f_fb).anInt344;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "r.DB(" + i + ',' + bool + ')');
		}
	}

	static final void method2663(boolean bool) {
		do {
			try {
				anInt6416++;
				if (bool == true) {
					if (VarcType.anInt3103 == 10)
						Class99.method622((byte) -119, 28);
					if ((VarcType.anInt3103 ^ 0xffffffff) != -31)
						break;
					Class99.method622((byte) -125, 25);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "r.WA(" + bool + ')');
			}
			break;
		} while (false);
	}

	protected final void finalize() {
		do {
			try {
				f_bc++;
				if (((Entity) this).f_lc == null)
					break;
				((Entity) this).f_lc.method1774();
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "r.finalize(" + ')');
			}
			break;
		} while (false);
	}

	final void method2664(int i, int i_16_) {
		try {
			if (i <= 75)
				((Entity) this).aByte6468 = (byte) 125;
			f_dc++;
			((Entity) this).anInt6455 = 0x3fff & i_16_;
			((Entity) this).f_fb.method204(((Entity) this).anInt6455, -7);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "r.CB(" + i + ',' + i_16_ + ')');
		}
	}

	public Entity() {
		super(0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		((Entity) this).aBool6414 = false;
		((Entity) this).anInt6439 = 0;
		((Entity) this).aString6429 = null;
		((Entity) this).anInt6424 = -1;
		((Entity) this).anInt6431 = 0;
		((Entity) this).f_bb = -1000;
		((Entity) this).f_sb = -1;
		((Entity) this).faceEntity = -1;
		((Entity) this).anInt6438 = -32768;
		((Entity) this).f_cb = -1;
		((Entity) this).anInt6437 = -1;
		((Entity) this).anIntArray6447 = new int[4];
		((Entity) this).f_pb = -1;
		((Entity) this).anInt6442 = 0;
		((Entity) this).anInt6427 = 0;
		((Entity) this).anInt6433 = 0;
		((Entity) this).aBool6419 = false;
		((Entity) this).anInt6452 = 0;
		((Entity) this).f_qb = 0;
		((Entity) this).anInt6420 = 0;
		((Entity) this).aBool6441 = true;
		((Entity) this).aByte6425 = (byte) 0;
		((Entity) this).anInt6449 = -1;
		((Entity) this).anInt6457 = 0;
		((Entity) this).anInt6461 = -1;
		((Entity) this).anInt6435 = 0;
		((Entity) this).aBool6450 = false;
		((Entity) this).anInt6456 = 0;
		((Entity) this).anInt6471 = 100;
		((Entity) this).anInt6470 = -1;
		((Entity) this).anInt6454 = 0;
		f_ac = 1;
		((Entity) this).anInt6463 = 0;
		((Entity) this).anInt6464 = -1000;
		((Entity) this).f_cc = 256;
		((Entity) this).anInt6465 = 0;
		((Entity) this).f_fc = -1;
		((Entity) this).aClass148Array6467 = new Class148[12];
		((Entity) this).f_ub = 0;
		((Entity) this).anIntArray6472 = new int[4];
		((Entity) this).anInt6460 = -1;
		((Entity) this).f_hc = 0;
		((Entity) this).anIntArray6434 = new int[4];
		((Entity) this).f_fb = new Class24();
		f_ic = new Class24();
		f_jc = new Class24();
		((Entity) this).f_mc = new int[10];
		((Entity) this).f_nc = new int[10];
		((Entity) this).f_kc = 0;
		((Entity) this).f_rc = new byte[10];
		((Entity) this).f_oc = 0;
		((Entity) this).f_sc = 0;
		((Entity) this).f_tc = 0;
		((Entity) this).f_qc = new AbstractModel[4];
		((Entity) this).f_uc = false;
	}

	final void method2665(int i, int i_17_, int i_18_, int i_19_) {
		try {
			anInt6459++;
			if (i <= 34)
				method2675((byte) -106);
			for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -5; i_20_++) {
				if ((((Entity) this).anIntArray6447[i_20_] ^ 0xffffffff) >= (i_18_ ^ 0xffffffff)) {
					((Entity) this).anIntArray6434[i_20_] = i_17_;
					((Entity) this).anIntArray6472[i_20_] = i_19_;
					((Entity) this).anIntArray6447[i_20_] = i_18_ + 70;
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("r.SA(" + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	final void method2666(byte i, AbstractModel class_t) {
		try {
			f_gb++;
			int i_21_ = ((Class24) f_ic).anInt344;
			int i_22_ = ((Class24) f_jc).anInt344;
			if (i_21_ != 0 || i_22_ != 0) {
				int i_23_ = class_t.MA() / 2;
				class_t.JA(0, -i_23_, 0);
				class_t.R(i_21_ & 0x3fff);
				class_t.Z(0x3fff & i_22_);
				class_t.JA(0, i_23_, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("r.TA(" + i + ',' + (class_t != null ? "{...}" : "null") + ')'));
		}
	}

	final void sendSpotAnimation(int i, int i_24_, int i_25_, boolean bool, int i_26_, int revision) {
		do {
			try {
				f_tb++;
				if (i == 0) {
					int i_27_ = (!bool ? ((Entity) this).anInt6437 : ((Entity) this).f_pb);
					if (i_26_ != -1 && i_27_ != -1) {
						if ((i_26_ ^ 0xffffffff) == (i_27_ ^ 0xffffffff)) {
							SpotAnimType class144 = Class195.aClass177_2745.list(-137, i_26_, revision, 30);
							if (((SpotAnimType) class144).aBool2087 && ((SpotAnimType) class144).animationId != -1) {
								SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(3,
										((SpotAnimType) class144).animationId));
								int i_28_ = ((SequenceType) class124).replyMode;
								if (i_28_ == 0)
									break;
								if ((i_28_ ^ 0xffffffff) == -3) {
									if (bool)
										((Entity) this).anInt6439 = 0;
									else {
										((Entity) this).f_ub = 0;
										break;
									}
									break;
								}
							}
						} else {
							SpotAnimType class144 = Class195.aClass177_2745.list(-137, i_26_, revision, 31);
							SpotAnimType class144_29_ = Class195.aClass177_2745.list(i ^ ~0x88, i_27_, revision, 32);
							if (((SpotAnimType) class144).animationId != -1
									&& (((SpotAnimType) class144_29_).animationId ^ 0xffffffff) != 0) {
								SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(3,
										((SpotAnimType) class144).animationId));
								SequenceType class124_30_ = (Class59_Sub3_Sub3.aClass45_6275.list(3,
										((SpotAnimType) class144_29_).animationId));
								if (((SequenceType) class124).forcedPriority < ((SequenceType) class124_30_).forcedPriority)
									break;
							}
						}
					}
					int i_31_ = Client.cycle;
					if (bool) {
						((Entity) this).anInt6454 = 0;
						((Entity) this).anInt6427 = 0;
						((Entity) this).anInt6446 = i_24_;
						((Entity) this).f_pb = i_26_;
						((Entity) this).anInt6443 = i_25_ >> 16;
						((Entity) this).anInt6461 = 1;
						((Entity) this).anInt6458 = i_31_ - -(i_25_ & 0xffff);
						if ((i_31_ ^ 0xffffffff) > (((Entity) this).anInt6458 ^ 0xffffffff))
							((Entity) this).anInt6427 = -1;
						if ((((Entity) this).f_pb ^ 0xffffffff) != 0 && i_31_ == ((Entity) this).anInt6458) {
							int i_32_ = (((SpotAnimType) (Class195.aClass177_2745.list(-137, ((Entity) this).f_pb,
									revision, 33))).animationId);
							if (i_32_ != -1) {
								SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(i ^ 0x3, i_32_);
								if (class124 != null && (((SequenceType) class124).frameIDs != null))
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) this).x, 0,
											((Class59_Sub3) this).current_plane, ((Class59_Sub3) this).y, true,
											class124, this == Client.local_player);
							}
						}
					} else {
						((Entity) this).anInt6442 = 0;
						((Entity) this).f_fc = 1;
						((Entity) this).anInt6437 = i_26_;
						((Entity) this).gfx_revision = revision;
						((Entity) this).anInt6421 = i_24_;
						((Entity) this).anInt6417 = i_25_ >> 16;
						((Entity) this).anInt6433 = 0;
						((Entity) this).anInt6448 = (i_25_ & 0xffff) + i_31_;
						if (((Entity) this).anInt6448 > i_31_)
							((Entity) this).anInt6433 = -1;
						if (((Entity) this).anInt6437 == -1 || ((Entity) this).anInt6448 != i_31_)
							break;
						int i_33_ = (((SpotAnimType) (Class195.aClass177_2745.list(-137, this.anInt6437, revision,
								34))).animationId);
						if (i_33_ == -1)
							break;
						SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, i_33_);
						if (class124 == null || ((SequenceType) class124).frameIDs == null)
							break;
						Class246_Sub1_Sub2.method2424(((Class59_Sub3) this).x, 0, ((Class59_Sub3) this).current_plane,
								((Class59_Sub3) this).y, true, class124, this == Client.local_player);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("r.PA(" + i + ',' + i_24_ + ',' + i_25_ + ',' + bool + ',' + i_26_ + ')'));
			}
			break;
		} while (false);
	}

	abstract int get_npc_render_emote(byte i, NpcType npc_type);

	final void method2172(int i) {
		do {
			try {
				anInt6430++;
				if (i == 11264) {
					int i_34_ = 60 + (f_ac - 1 << 6);
					((Class59_Sub3) this).aShort5062 = (short) (i_34_ + ((Class59_Sub3) this).y >> 7);
					((Class59_Sub3) this).aShort5065 = (short) (((Class59_Sub3) this).x + i_34_ >> 7);
					((Class59_Sub3) this).aShort5064 = (short) (-i_34_ + ((Class59_Sub3) this).y >> 7);
					((Class59_Sub3) this).aShort5057 = (short) (((Class59_Sub3) this).x + -i_34_ >> 7);
					if (((Entity) this).aBool6419) {
						int i_35_ = ((Entity) this).f_fb.method203(-94);
						if ((i_35_ ^ 0xffffffff) < -1025 && i_35_ < 7168)
							((Class59_Sub3) this).aShort5057--;
						if (i_35_ > 13312 || i_35_ < 3072)
							((Class59_Sub3) this).aShort5064--;
						if ((i_35_ ^ 0xffffffff) < -9217 && i_35_ < 15360)
							((Class59_Sub3) this).aShort5065++;
						if (i_35_ > 5120 && i_35_ < 11264)
							((Class59_Sub3) this).aShort5062++;
					}
					if (((Entity) this).f_pc == null)
						break;
					if ((((Class59_Sub3) this).aShort5057
							^ 0xffffffff) < (((Class246_Sub16) ((Entity) this).f_pc).anInt4533 ^ 0xffffffff))
						((Class59_Sub3) this).aShort5057 = (short) (((Class246_Sub16) ((Entity) this).f_pc).anInt4533);
					if ((((Class59_Sub3) this).aShort5062
							^ 0xffffffff) > (((Class246_Sub16) ((Entity) this).f_pc).anInt4532 ^ 0xffffffff))
						((Class59_Sub3) this).aShort5062 = (short) (((Class246_Sub16) ((Entity) this).f_pc).anInt4532);
					if (((Class59_Sub3) this).aShort5064 > ((Class246_Sub16) ((Entity) this).f_pc).anInt4524)
						((Class59_Sub3) this).aShort5064 = (short) (((Class246_Sub16) ((Entity) this).f_pc).anInt4524);
					if ((((Class59_Sub3) this).aShort5065
							^ 0xffffffff) <= (((Class246_Sub16) ((Entity) this).f_pc).anInt4537 ^ 0xffffffff))
						break;
					((Class59_Sub3) this).aShort5065 = (short) (((Class246_Sub16) ((Entity) this).f_pc).anInt4537);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "r.S(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method2669(boolean bool) {
		try {
			f_rb++;
			if (bool != true)
				return 60;
			RenderAnimation class135 = get_render_sequence(-1, null);
			int i = ((Class24) ((Entity) this).f_fb).anInt344;
			boolean bool_36_;
			if ((((RenderAnimation) class135).anInt1901 ^ 0xffffffff) == -1)
				bool_36_ = ((Entity) this).f_fb.method208(((Entity) this).f_cc, ((Entity) this).f_cc, 122,
						(((Entity) this).anInt6455));
			else
				bool_36_ = (((Entity) this).f_fb.method208(((RenderAnimation) class135).anInt1901,
						((RenderAnimation) class135).anInt1926, 120, ((Entity) this).anInt6455));
			int i_37_ = ((Class24) ((Entity) this).f_fb).anInt344 - i;
			if (i_37_ == 0) {
				((Entity) this).anInt6435 = 0;
				((Entity) this).f_fb.method204(((Entity) this).anInt6455, 115);
			} else
				((Entity) this).anInt6435++;
			if (bool_36_) {
				if (((RenderAnimation) class135).anInt1931 != 0) {
					if ((i_37_ ^ 0xffffffff) < -1)
						f_ic.method208(((RenderAnimation) class135).anInt1931, ((RenderAnimation) class135).anInt1913,
								125, ((RenderAnimation) class135).anInt1899);
					else
						f_ic.method208(((RenderAnimation) class135).anInt1931, ((RenderAnimation) class135).anInt1913,
								115, -((RenderAnimation) class135).anInt1899);
				}
				if (((RenderAnimation) class135).anInt1911 != 0)
					f_jc.method208(((RenderAnimation) class135).anInt1911, ((RenderAnimation) class135).anInt1920, 124,
							((RenderAnimation) class135).anInt1884);
			} else {
				if ((((RenderAnimation) class135).anInt1931 ^ 0xffffffff) == -1)
					f_ic.method204(0, -5);
				else
					f_ic.method208(((RenderAnimation) class135).anInt1931, ((RenderAnimation) class135).anInt1913, 118,
							0);
				if ((((RenderAnimation) class135).anInt1911 ^ 0xffffffff) == -1)
					f_jc.method204(0, 121);
				else
					f_jc.method208(((RenderAnimation) class135).anInt1911, ((RenderAnimation) class135).anInt1920, 123,
							0);
			}
			return i_37_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "r.EB(" + bool + ')');
		}
	}

	int method2670(byte i) {
		try {
			if (i != 127)
				return -28;
			anInt6413++;
			return f_ac;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "r.GA(" + i + ')');
		}
	}

	final void method2671(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		try {
			anInt6440++;
			int i_43_ = ((((Class59_Sub3) this).aShort5065 - -((Class59_Sub3) this).aShort5057) >> 1);
			int i_44_ = ((((Class59_Sub3) this).aShort5062 - -((Class59_Sub3) this).aShort5064) >> 1);
			int i_45_ = MathUtils.SINE[i_40_];
			int i_46_ = MathUtils.COSINE[i_40_];
			int i_47_ = -i / 2;
			int i_48_ = -i_41_ / 2;
			int i_49_ = i_47_ * i_46_ + i_48_ * i_45_ >> 15;
			int i_50_ = i_46_ * i_48_ - i_47_ * i_45_ >> 15;
			int i_51_ = (Class130_Sub1_Sub1.method2880(i_43_, i_49_ + ((Class59_Sub3) this).x, i_44_, (byte) 80,
					((Class59_Sub3) this).y + i_50_, ((Class59_Sub3) this).current_plane));
			int i_52_ = i / 2;
			int i_53_ = -i_41_ / 2;
			int i_54_ = i_53_ * i_45_ + i_52_ * i_46_ >> 15;
			int i_55_ = i_46_ * i_53_ - i_52_ * i_45_ >> 15;
			int i_56_ = (Class130_Sub1_Sub1.method2880(i_43_, ((Class59_Sub3) this).x - -i_54_, i_44_, (byte) 80,
					((Class59_Sub3) this).y - -i_55_, ((Class59_Sub3) this).current_plane));
			if (i_42_ >= -43)
				method2669(false);
			int i_57_ = -i / 2;
			int i_58_ = i_41_ / 2;
			int i_59_ = i_45_ * i_58_ + i_46_ * i_57_ >> 15;
			int i_60_ = i_46_ * i_58_ + -(i_45_ * i_57_) >> 15;
			int i_61_ = (Class130_Sub1_Sub1.method2880(i_43_, ((Class59_Sub3) this).x - -i_59_, i_44_, (byte) 80,
					((Class59_Sub3) this).y - -i_60_, ((Class59_Sub3) this).current_plane));
			int i_62_ = i / 2;
			int i_63_ = i_41_ / 2;
			int i_64_ = i_46_ * i_62_ + i_63_ * i_45_ >> 15;
			int i_65_ = -(i_62_ * i_45_) + i_46_ * i_63_ >> 15;
			int i_66_ = (Class130_Sub1_Sub1.method2880(i_43_, ((Class59_Sub3) this).x - -i_64_, i_44_, (byte) 80,
					i_65_ + ((Class59_Sub3) this).y, ((Class59_Sub3) this).current_plane));
			int i_67_ = (i_51_ ^ 0xffffffff) <= (i_56_ ^ 0xffffffff) ? i_56_ : i_51_;
			int i_68_ = i_66_ <= i_61_ ? i_66_ : i_61_;
			int i_69_ = (i_56_ ^ 0xffffffff) > (i_66_ ^ 0xffffffff) ? i_56_ : i_66_;
			int i_70_ = i_51_ >= i_61_ ? i_61_ : i_51_;
			((Entity) this).anInt6462 = 0x3fff
					& (int) (Math.atan2((double) (i_67_ - i_68_), (double) i_41_) * 2607.5945876176133);
			((Entity) this).f_kb = (int) (Math.atan2((double) (-i_69_ + i_70_), (double) i) * 2607.5945876176133)
					& 0x3fff;
			if (((Entity) this).anInt6462 != 0 && (i_38_ ^ 0xffffffff) != -1) {
				int i_71_ = -i_38_ + 16384;
				if ((((Entity) this).anInt6462 ^ 0xffffffff) >= -8193) {
					if (((Entity) this).anInt6462 > i_38_)
						((Entity) this).anInt6462 = i_38_;
				} else if ((((Entity) this).anInt6462 ^ 0xffffffff) > (i_71_ ^ 0xffffffff))
					((Entity) this).anInt6462 = i_71_;
			}
			((Entity) this).f_ib = i_66_ + i_51_;
			if (((Entity) this).f_kb != 0 && (i_39_ ^ 0xffffffff) != -1) {
				int i_72_ = 16384 - i_39_;
				if ((((Entity) this).f_kb ^ 0xffffffff) >= -8193) {
					if ((i_39_ ^ 0xffffffff) > (((Entity) this).f_kb ^ 0xffffffff))
						((Entity) this).f_kb = i_39_;
				} else if ((((Entity) this).f_kb ^ 0xffffffff) > (i_72_ ^ 0xffffffff))
					((Entity) this).f_kb = i_72_;
			}
			if (i_56_ + i_61_ < ((Entity) this).f_ib)
				((Entity) this).f_ib = i_61_ + i_56_;
			((Entity) this).f_ib = ((((Entity) this).f_ib >> 1) - ((Class59_Sub3) this).anInt5052);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("r.UA(" + i + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ',' + i_42_ + ')'));
		}
	}

	static final int method2672(int i, int i_73_) {
		if (Class128_Sub2.anIntArrayArray5565 != null)
			return Class128_Sub2.anIntArrayArray5565[i][i_73_] & 0xffffff;
		return 0;
	}

	final void method2673(int i, byte i_74_) {
		try {
			if (i_74_ != -120)
				method2675((byte) -6);
			anInt6445++;
			f_ac = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "r.OA(" + i + ',' + i_74_ + ')');
		}
	}

	int method2674(int i) {
		try {
			f_ec++;
			RenderAnimation class135 = get_render_sequence(i - 1, null);
			if ((((RenderAnimation) class135).anInt1912 ^ 0xffffffff) != i)
				return ((RenderAnimation) class135).anInt1912;
			if ((((Entity) this).anInt6438 ^ 0xffffffff) == 32767)
				return 200;
			return -((Entity) this).anInt6438;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "r.U(" + i + ')');
		}
	}

	abstract int method2675(byte i);

	final RenderAnimation get_render_sequence(int i, NpcType npc_type) {
		try {
			f_hb++;
			int i_75_ = get_npc_render_emote((byte) 112, npc_type);
			if (i == i_75_)
				return Class242.aClass135_3416;
			return ParamType.aClass_v1641.list(false, i_75_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "r.AB(" + i + ')');
		}
	}

	public static void method2677(int i) {
		try {
			f_eb = null;
			int i_76_ = 41 / ((-61 - i) / 47);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "r.QA(" + i + ')');
		}
	}
}
