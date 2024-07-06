package io;

import io.cache.Cache;
import io.cache.IndexConstants;
import io.cache.Revision;

final class Class221 {
	static String aString3061 = null;
	static int anInt3062;
	static int anInt3063;
	static int anInt3064;
	static int anInt3065;

	static final int method1431(int i, int i_0_, int i_1_) {
		try {
			anInt3065++;
			if ((i ^ 0xffffffff) == 0)
				return 12345678;
			i_0_ = i_0_ * (0x7f & i) >> 7;
			do {
				if ((i_0_ ^ 0xffffffff) <= -3) {
					if ((i_0_ ^ 0xffffffff) >= -127)
						break;
					i_0_ = 126;
					if (!Client.f_ob)
						break;
				}
				i_0_ = 2;
			} while (false);
			return i_0_ + (i & 0xff80);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tv.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method1432(int i, boolean bool, Entity class_r) {
		try {
			anInt3063++;
			RenderAnimation class135 = class_r.get_render_sequence(-1, null);
			if ((((Entity) class_r).f_oc ^ 0xffffffff) == -1) {
				RuntimeException_Sub2.anInt7150 = -1;
				Class_e.anInt1218 = 0;
				((Entity) class_r).f_kc = 0;
			} else {
				if ((((Entity) class_r).current_sequence ^ 0xffffffff) != 0
						&& (((Entity) class_r).f_qb ^ 0xffffffff) == -1) {
					SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, ((Entity) class_r).current_sequence,
							Settings.data);
					if ((((Entity) class_r).f_sc ^ 0xffffffff) < -1
							&& ((SequenceType) class124).precedenceAnimating == 0) {
						((Entity) class_r).f_kc++;
						Class_e.anInt1218 = 0;
						RuntimeException_Sub2.anInt7150 = -1;
						return;
					}
					if ((((Entity) class_r).f_sc ^ 0xffffffff) >= -1 && ((SequenceType) class124).priority == 0) {
						((Entity) class_r).f_kc++;
						RuntimeException_Sub2.anInt7150 = -1;
						Class_e.anInt1218 = 0;
						return;
					}
				}
				if (((Entity) class_r).anInt6437 != -1
						&& ((((Entity) class_r).anInt6448 ^ 0xffffffff) >= (Client.cycle ^ 0xffffffff))) {
					SpotAnimType class144 = Class195.aClass177_2745.list(-137, ((Entity) class_r).anInt6437, 634, 7);
					if (((SpotAnimType) class144).aBool2087
							&& ((((SpotAnimType) class144).animationId ^ 0xffffffff) != 0)) {
						SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(3,
								((SpotAnimType) class144).animationId, Settings.data));
						if (((Entity) class_r).f_sc > 0 && ((SequenceType) class124).precedenceAnimating == 0) {
							Class_e.anInt1218 = 0;
							RuntimeException_Sub2.anInt7150 = -1;
							((Entity) class_r).f_kc++;
							return;
						}
						if ((((Entity) class_r).f_sc ^ 0xffffffff) >= -1
								&& ((((SequenceType) class124).priority ^ 0xffffffff) == -1)) {
							Class_e.anInt1218 = 0;
							RuntimeException_Sub2.anInt7150 = -1;
							((Entity) class_r).f_kc++;
							return;
						}
					}
				}
				if (((Entity) class_r).anInt6437 != -1
						&& ((((Entity) class_r).anInt6448 ^ 0xffffffff) >= (Client.cycle ^ 0xffffffff))) {
					SpotAnimType class144 = Class195.aClass177_2745.list(-137, ((Entity) class_r).anInt6437, 634, 8);
					if (((SpotAnimType) class144).aBool2087
							&& ((((SpotAnimType) class144).animationId ^ 0xffffffff) != 0)) {
						SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(3,
								((SpotAnimType) class144).animationId));
						if ((((Entity) class_r).f_sc ^ 0xffffffff) < -1
								&& ((((SequenceType) class124).precedenceAnimating ^ 0xffffffff) == -1)) {
							RuntimeException_Sub2.anInt7150 = -1;
							((Entity) class_r).f_kc++;
							Class_e.anInt1218 = 0;
							return;
						}
						if ((((Entity) class_r).f_sc ^ 0xffffffff) >= -1
								&& ((((SequenceType) class124).priority ^ 0xffffffff) == -1)) {
							((Entity) class_r).f_kc++;
							RuntimeException_Sub2.anInt7150 = -1;
							Class_e.anInt1218 = 0;
							return;
						}
					}
				}
				int i_2_ = ((Class59_Sub3) class_r).x;
				int i_3_ = ((Class59_Sub3) class_r).y;
				int i_4_ = ((((Entity) class_r).f_mc[-1 + ((Entity) class_r).f_oc] * 128)
						+ 64 * class_r.method2670((byte) 127));
				int i_5_ = ((((Entity) class_r).f_nc[-1 + ((Entity) class_r).f_oc] * 128)
						- -(class_r.method2670((byte) 127) * 64));
				if ((i_4_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
					if (i_5_ <= i_3_) {
						if ((i_3_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff))
							class_r.method2662(12288, false);
						else
							class_r.method2662(14336, false);
					} else
						class_r.method2662(10240, false);
				} else if (i_4_ >= i_2_) {
					if (i_3_ >= i_5_) {
						if (i_3_ > i_5_)
							class_r.method2662(0, false);
					} else
						class_r.method2662(8192, false);
				} else if (i_5_ <= i_3_) {
					if (i_3_ <= i_5_)
						class_r.method2662(4096, false);
					else
						class_r.method2662(2048, false);
				} else
					class_r.method2662(6144, false);
				byte i_6_ = ((Entity) class_r).f_rc[-1 + ((Entity) class_r).f_oc];
				if (!bool && ((i_4_ - i_2_ ^ 0xffffffff) < -257 || i_4_ + -i_2_ < -256
						|| (-i_3_ + i_5_ ^ 0xffffffff) < -257 || (i_5_ - i_3_ ^ 0xffffffff) > 255)) {
					((Class59_Sub3) class_r).x = i_4_;
					((Class59_Sub3) class_r).y = i_5_;
					class_r.method2664(113, ((Entity) class_r).anInt6455);
					if ((((Entity) class_r).f_sc ^ 0xffffffff) < -1)
						((Entity) class_r).f_sc--;
					RuntimeException_Sub2.anInt7150 = -1;
					Class_e.anInt1218 = 0;
					((Entity) class_r).f_oc--;
				} else {
					int i_7_ = 4;
					boolean bool_8_ = true;
					if (class_r instanceof Npc)
						bool_8_ = ((NpcType) ((Npc) (Npc) class_r).aClass253_7184).clickable;
					if (bool_8_) {
						int i_9_ = (((Entity) class_r).anInt6455 + -(((Class24) ((Entity) class_r).f_fb).anInt344));
						if (i_9_ != 0 && (((Entity) class_r).faceEntity ^ 0xffffffff) == 0
								&& ((Entity) class_r).f_cc != 0)
							i_7_ = 2;
						if (!bool && (((Entity) class_r).f_oc ^ 0xffffffff) < -3)
							i_7_ = 6;
						if (!bool && (((Entity) class_r).f_oc ^ 0xffffffff) < -4)
							i_7_ = 8;
					} else {
						if (!bool && ((Entity) class_r).f_oc > 1)
							i_7_ = 6;
						if (!bool && (((Entity) class_r).f_oc ^ 0xffffffff) < -3)
							i_7_ = 8;
					}
					if ((((Entity) class_r).f_kc ^ 0xffffffff) < -1 && (((Entity) class_r).f_oc ^ 0xffffffff) < -2) {
						i_7_ = 8;
						((Entity) class_r).f_kc--;
					}
					if (i >= -39)
						aString3061 = null;
					if ((i_6_ ^ 0xffffffff) != -3) {
						if (i_6_ == 0)
							i_7_ >>= 1;
					} else
						i_7_ <<= 1;
					if ((((RenderAnimation) class135).anInt1889 ^ 0xffffffff) != 0) {
						i_7_ <<= 7;
						if ((((Entity) class_r).f_oc ^ 0xffffffff) == -2) {
							int i_10_ = (((Entity) class_r).f_tc * ((Entity) class_r).f_tc);
							int i_11_ = ((((i_4_ ^ 0xffffffff) <= (((Class59_Sub3) class_r).x ^ 0xffffffff))
									? i_4_ - ((Class59_Sub3) class_r).x
									: (((Class59_Sub3) class_r).x - i_4_)) << 7);
							int i_12_ = ((((Class59_Sub3) class_r).y ^ 0xffffffff) < (i_5_ ^ 0xffffffff)
									? ((Class59_Sub3) class_r).y + -i_5_
									: i_5_ + -(((Class59_Sub3) class_r).y)) << 7;
							int i_13_ = ((i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff) ? i_11_ : i_12_);
							int i_14_ = (i_13_ * (((RenderAnimation) class135).anInt1889 * 2));
							if (i_14_ >= i_10_) {
								if ((i_10_ / 2 ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
									((Entity) class_r).f_tc -= ((RenderAnimation) class135).anInt1889;
									if ((((Entity) class_r).f_tc ^ 0xffffffff) > -1)
										((Entity) class_r).f_tc = 0;
								} else if (((Entity) class_r).f_tc < i_7_) {
									((Entity) class_r).f_tc += ((RenderAnimation) class135).anInt1889;
									if ((i_7_ ^ 0xffffffff) > (((Entity) class_r).f_tc ^ 0xffffffff))
										((Entity) class_r).f_tc = i_7_;
								}
							} else
								((Entity) class_r).f_tc /= 2;
						} else if ((((Entity) class_r).f_tc ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
							((Entity) class_r).f_tc += ((RenderAnimation) class135).anInt1889;
							if (i_7_ < ((Entity) class_r).f_tc)
								((Entity) class_r).f_tc = i_7_;
						} else if ((((Entity) class_r).f_tc ^ 0xffffffff) < -1) {
							((Entity) class_r).f_tc -= ((RenderAnimation) class135).anInt1889;
							if ((((Entity) class_r).f_tc ^ 0xffffffff) > -1)
								((Entity) class_r).f_tc = 0;
						}
						i_7_ = ((Entity) class_r).f_tc >> 7;
						if ((i_7_ ^ 0xffffffff) > -2)
							i_7_ = 1;
					}
					Class_e.anInt1218 = 0;
					if ((i_2_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
						((Class59_Sub3) class_r).x += i_7_;
						Class_e.anInt1218 |= 0x4;
						if (((Class59_Sub3) class_r).x > i_4_)
							((Class59_Sub3) class_r).x = i_4_;
					} else if ((i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
						((Class59_Sub3) class_r).x -= i_7_;
						Class_e.anInt1218 |= 0x8;
						if (i_4_ > ((Class59_Sub3) class_r).x)
							((Class59_Sub3) class_r).x = i_4_;
					}
					if ((i_5_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
						((Class59_Sub3) class_r).y += i_7_;
						Class_e.anInt1218 |= 0x1;
						if (i_5_ < ((Class59_Sub3) class_r).y)
							((Class59_Sub3) class_r).y = i_5_;
					} else if ((i_5_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
						((Class59_Sub3) class_r).y -= i_7_;
						Class_e.anInt1218 |= 0x2;
						if (((Class59_Sub3) class_r).y < i_5_)
							((Class59_Sub3) class_r).y = i_5_;
					}
					if (((((Class59_Sub3) class_r).x ^ 0xffffffff) == (i_4_ ^ 0xffffffff))
							&& i_5_ == ((Class59_Sub3) class_r).y) {
						((Entity) class_r).f_oc--;
						if ((((Entity) class_r).f_sc ^ 0xffffffff) < -1)
							((Entity) class_r).f_sc--;
					}
					if (i_7_ >= 8)
						RuntimeException_Sub2.anInt7150 = 2;
					else
						RuntimeException_Sub2.anInt7150 = i_6_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("tv.C(" + i + ',' + bool + ',' + (class_r != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1433(int i, boolean bool, int i_15_, int widget_id, int i_17_, int revision) {
		try {
			anInt3064++;
			if (Widget.load_widget(widget_id, revision, 3)) {
				Widget.resize_interface(((Widget.get_widget_cache(revision))[widget_id]), i_17_, i_15_, 22611, i, bool);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static final int method1434(int i) {
		try {
			anInt3062++;
			return 9;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tv.E(" + i + ')');
		}
	}

	public static void method1435(byte i) {
		try {
			if (i <= 37)
				method1432(-47, false, null);
			Player.skill_levels = null;
			Cache.reset_index(Revision.PRE_EOC_634, "skeletons");
			Cache.reset_index(Revision.OSRS, "skeletons");
			Cache.reset_index(Revision.PRE_EOC_550, "skeletons");
			aString3061 = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
