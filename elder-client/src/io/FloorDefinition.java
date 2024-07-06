package io;

/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;

import io.cache.Revision;

final class FloorDefinition {
	int saturation;
	int blendHueMultiplier;
	int luminance;
	static int anInt2912;
	boolean aBool2913 = true;
	int texture = -1;
	static int anInt2915;
	private int secondary_color = 0;
	int blendHue;
	static int anInt2918;
	static MultilingualString aClass67_2920 = new MultilingualString(" has logged out.", " loggt sich aus.",
			" s'est d\u00e9connect\u00e9.", " saiu do jogo.");
	static int anInt2921;
	static int anInt2922;
	static CacheIndex aClass_fs2923;
	int anInt2924 = 128;

	private final void rgbToHsl(byte i, int rgb) {
		try {
			anInt2912++;
			double d = (double) ((rgb & 0xff0e1b) >> 16) / 256.0;
			double d_1_ = (double) ((0xff0f & rgb) >> 8) / 256.0;
			double d_2_ = (double) (0xff & rgb) / 256.0;
			double d_3_ = d;
			if (d_3_ > d_1_)
				d_3_ = d_1_;
			if (d_2_ < d_3_)
				d_3_ = d_2_;
			double d_4_ = d;
			if (d_4_ < d_1_)
				d_4_ = d_1_;
			if (i <= -124) {
				if (d_2_ > d_4_)
					d_4_ = d_2_;
				double d_5_ = 0.0;
				double d_6_ = 0.0;
				double d_7_ = (d_3_ + d_4_) / 2.0;
				if (d_3_ != d_4_) {
					if (d_7_ < 0.5)
						d_6_ = (-d_3_ + d_4_) / (d_3_ + d_4_);
					if (d != d_4_) {
						if (d_4_ != d_1_) {
							if (d_2_ == d_4_)
								d_5_ = 4.0 + (d - d_1_) / (-d_3_ + d_4_);
						} else
							d_5_ = 2.0 + (-d + d_2_) / (d_4_ - d_3_);
					} else
						d_5_ = (-d_2_ + d_1_) / (-d_3_ + d_4_);
					if (d_7_ >= 0.5)
						d_6_ = (-d_3_ + d_4_) / (-d_4_ + 2.0 - d_3_);
				}
				((FloorDefinition) this).saturation = (int) (256.0 * d_6_);
				((FloorDefinition) this).luminance = (int) (256.0 * d_7_);
				d_5_ /= 6.0;
				if ((((FloorDefinition) this).luminance ^ 0xffffffff) > -1)
					((FloorDefinition) this).luminance = 0;
				else if ((((FloorDefinition) this).luminance ^ 0xffffffff) < -256)
					((FloorDefinition) this).luminance = 255;
				if (!(d_7_ > 0.5))
					((FloorDefinition) this).blendHueMultiplier = (int) (d_7_ * d_6_ * 512.0);
				else
					((FloorDefinition) this).blendHueMultiplier = (int) (512.0 * (d_6_ * (-d_7_ + 1.0)));
				if (((FloorDefinition) this).saturation >= 0) {
					if ((((FloorDefinition) this).saturation ^ 0xffffffff) < -256)
						((FloorDefinition) this).saturation = 255;
				} else
					((FloorDefinition) this).saturation = 0;
				if ((((FloorDefinition) this).blendHueMultiplier ^ 0xffffffff) > -2)
					((FloorDefinition) this).blendHueMultiplier = 1;
				((FloorDefinition) this).blendHue = (int) (d_5_ * (double) ((FloorDefinition) this).blendHueMultiplier);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sr.F(" + i + ',' + rgb + ')');
		}
	}

	public static void method1358(int i) {
		try {
			int i_8_ = 26 % ((i - 11) / 40);
			aClass67_2920 = null;
			aClass_fs2923 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sr.B(" + i + ')');
		}
	}

	static final int method1359(int i) {
		try {
			anInt2915++;
			SceneGraph class260 = Client.sprite_loader;
			boolean bool = false;
			if (Buffer.anInt5656 != 0) {
				Canvas canvas = new Canvas();
				canvas.setSize(100, 100);
				class260 = SceneGraph.method1682(null, 0, canvas, 0, (byte) 59, null);
				bool = true;
			}
			long l = TimeUtility.time();
			for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -10001; i_9_++)
				class260.method1717(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
			int i_10_ = 102 % ((i - 36) / 55);
			int i_11_ = (int) (-l + TimeUtility.time());
			class260.method1734(0, 100, 0, (byte) 58, -16777216, 100);
			if (bool)
				class260.method1708(true);
			return i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sr.E(" + i + ')');
		}
	}

	static final void method1360(Entity class_r, int i) {
		do {
			try {
				((Entity) class_r).aBool6419 = false;
				anInt2921++;
				do {
					if ((((Entity) class_r).anInt6470 ^ 0xffffffff) != 0) {
						SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, ((Entity) class_r).anInt6470,
								class_r.revision); // TODO afaka
						if (class124 == null || ((SequenceType) class124).frameIDs == null) {
							((Entity) class_r).anInt6470 = -1;
							((Entity) class_r).aBool6450 = false;
						} else {
							((Entity) class_r).anInt6457++;
							if ((((Entity) class_r).anInt6420 < ((SequenceType) class124).frameIDs.length)
									&& (((((SequenceType) class124).frameLenghts[((Entity) class_r).anInt6420])
											^ 0xffffffff) > (((Entity) class_r).anInt6457 ^ 0xffffffff))) {
								((Entity) class_r).anInt6457 = 1;
								((Entity) class_r).f_cb++;
								((Entity) class_r).anInt6420++;
								Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).x, ((Entity) class_r).anInt6420,
										((Class59_Sub3) class_r).current_plane, ((Class59_Sub3) class_r).y, true,
										class124, class_r == Client.local_player);
							}
							if (((Entity) class_r).anInt6420 >= (((SequenceType) class124).frameIDs).length) {
								((Entity) class_r).anInt6420 = 0;
								((Entity) class_r).anInt6457 = 0;
								if (((Entity) class_r).aBool6450) {
									((Entity) class_r).anInt6470 = class_r.get_render_sequence(-1, null)
											.get_stand_sequence(true);
									if (((Entity) class_r).anInt6470 == -1) {
										((Entity) class_r).aBool6450 = false;
										break;
									}
									class124 = (Class59_Sub3_Sub3.aClass45_6275.list(3, ((Entity) class_r).anInt6470));
								}
								Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).x, ((Entity) class_r).anInt6420,
										((Class59_Sub3) class_r).current_plane, ((Class59_Sub3) class_r).y, true,
										class124, Client.local_player == class_r);
							}
							((Entity) class_r).f_cb = 1 + ((Entity) class_r).anInt6420;
							if ((((SequenceType) class124).frameIDs.length ^ 0xffffffff) >= (((Entity) class_r).f_cb
									^ 0xffffffff))
								((Entity) class_r).f_cb = 0;
						}
					}
				} while (false);
				do {
					if ((((Entity) class_r).anInt6437 ^ 0xffffffff) != 0
							&& ((((Entity) class_r).anInt6448 ^ 0xffffffff) >= (Client.cycle ^ 0xffffffff))) {
						SpotAnimType class144 = Class195.aClass177_2745.list(-137, (((Entity) class_r).anInt6437),
								class_r.gfx_revision, 5);
						int i_12_ = ((SpotAnimType) class144).animationId;
						if (i_12_ == -1)
							((Entity) class_r).anInt6437 = -1;
						else {
							SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, i_12_,
									class_r.gfx_revision < 200 ? Revision.OSRS
											: class_r.gfx_revision == 550 ? Revision.PRE_EOC_550
													: Revision.PRE_EOC_634);
							if (((SpotAnimType) class144).aBool2087) {
								if ((((SequenceType) class124).precedenceAnimating ^ 0xffffffff) == -4) {
									if ((((Entity) class_r).f_sc ^ 0xffffffff) < -1
											&& (Client.cycle >= ((Entity) class_r).anInt6422)
											&& (Client.cycle > ((Entity) class_r).anInt6428)) {
										((Entity) class_r).anInt6437 = -1;
										break;
									}
								} else if ((((SequenceType) class124).precedenceAnimating ^ 0xffffffff) == -2
										&& ((Entity) class_r).f_sc > 0 && ((Client.cycle
												^ 0xffffffff) <= ((((Entity) class_r).anInt6422) ^ 0xffffffff))
										&& (Client.cycle > (((Entity) class_r).anInt6428))) {
									((Entity) class_r).anInt6448 = 1 + Client.cycle;
									break;
								}
							}
							if (class124 != null && (((SequenceType) class124).frameIDs != null)) {
								if ((((Entity) class_r).anInt6433 ^ 0xffffffff) > -1) {
									((Entity) class_r).anInt6433 = 0;
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).x, 0,
											((Class59_Sub3) class_r).current_plane, ((Class59_Sub3) class_r).y, true,
											class124, (Client.local_player == class_r));
								}
								((Entity) class_r).anInt6442++;
								if (((((SequenceType) class124).frameIDs).length > ((Entity) class_r).anInt6433)
										&& ((((Entity) class_r).anInt6442
												^ 0xffffffff) < ((((SequenceType) class124).frameLenghts[((Entity) class_r).anInt6433])
														^ 0xffffffff))) {
									((Entity) class_r).anInt6433++;
									((Entity) class_r).anInt6442 = 1;
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).x,
											((Entity) class_r).anInt6433, ((Class59_Sub3) class_r).current_plane,
											((Class59_Sub3) class_r).y, true, class124,
											(class_r == Client.local_player));
								}
								if ((((Entity) class_r).anInt6433
										^ 0xffffffff) <= ((((SequenceType) class124).frameIDs).length ^ 0xffffffff)) {
									if (((SpotAnimType) class144).aBool2087) {
										((Entity) class_r).anInt6433 -= ((SequenceType) class124).frameStep;
										((Entity) class_r).f_ub++;
										if ((((SequenceType) class124).maxLoops ^ 0xffffffff) < (((Entity) class_r).f_ub
												^ 0xffffffff)) {
											if ((((Entity) class_r).anInt6433 ^ 0xffffffff) <= -1
													&& ((((Entity) class_r).anInt6433) < (((SequenceType) class124).frameIDs).length))
												Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r).x),
														(((Entity) class_r).anInt6433),
														(((Class59_Sub3) class_r).current_plane),
														(((Class59_Sub3) class_r).y), true, class124,
														((Client.local_player) == class_r));
											else
												((Entity) class_r).anInt6437 = -1;
										} else
											((Entity) class_r).anInt6437 = -1;
									} else
										((Entity) class_r).anInt6437 = -1;
								}
								((Entity) class_r).f_fc = 1 + ((Entity) class_r).anInt6433;
								if (((Entity) class_r).f_fc >= (((SequenceType) class124).frameIDs).length) {
									if (((SpotAnimType) class144).aBool2087) {
										((Entity) class_r).f_fc -= ((SequenceType) class124).frameStep;
										if (((SequenceType) class124).maxLoops > 1 + ((Entity) class_r).f_ub) {
											if ((((Entity) class_r).f_fc ^ 0xffffffff) > -1
													|| ((((SequenceType) class124).frameIDs).length <= (((Entity) class_r).f_fc)))
												((Entity) class_r).f_fc = -1;
										} else
											((Entity) class_r).f_fc = -1;
									} else
										((Entity) class_r).f_fc = -1;
								}
							} else
								((Entity) class_r).anInt6437 = -1;
						}
					}
				} while (false);
				do {
					if ((((Entity) class_r).f_pb ^ 0xffffffff) != 0 && (((Entity) class_r).anInt6458 <= Client.cycle)) {
						SpotAnimType class144 = Class195.aClass177_2745.list(-137, ((Entity) class_r).f_pb, 634, 6);
						int i_13_ = ((SpotAnimType) class144).animationId;
						if (i_13_ != -1) {
							SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, i_13_);
							if (((SpotAnimType) class144).aBool2087) {
								if (((SequenceType) class124).precedenceAnimating != 3) {
									if ((((SequenceType) class124).precedenceAnimating ^ 0xffffffff) == -2
											&& ((Entity) class_r).f_sc > 0 && ((Client.cycle
													^ 0xffffffff) <= (((Entity) class_r).anInt6422 ^ 0xffffffff))
											&& (((Entity) class_r).anInt6428 < Client.cycle)) {
										((Entity) class_r).anInt6458 = Client.cycle + 1;
										break;
									}
								} else if (((Entity) class_r).f_sc > 0 && ((Client.cycle
										^ 0xffffffff) <= ((((Entity) class_r).anInt6422) ^ 0xffffffff))
										&& (Client.cycle > (((Entity) class_r).anInt6428))) {
									((Entity) class_r).f_pb = -1;
									break;
								}
							}
							if (class124 != null && (((SequenceType) class124).frameIDs != null)) {
								if ((((Entity) class_r).anInt6427 ^ 0xffffffff) > -1) {
									((Entity) class_r).anInt6427 = 0;
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).x, 0,
											((Class59_Sub3) class_r).current_plane, ((Class59_Sub3) class_r).y, true,
											class124, (Client.local_player == class_r));
								}
								((Entity) class_r).anInt6454++;
								if (((((Entity) class_r).anInt6427
										^ 0xffffffff) > ((((SequenceType) class124).frameIDs).length ^ 0xffffffff))
										&& ((((Entity) class_r).anInt6454
												^ 0xffffffff) < ((((SequenceType) class124).frameLenghts[((Entity) class_r).anInt6427])
														^ 0xffffffff))) {
									((Entity) class_r).anInt6427++;
									((Entity) class_r).anInt6454 = 1;
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).x,
											((Entity) class_r).anInt6427, ((Class59_Sub3) class_r).current_plane,
											((Class59_Sub3) class_r).y, true, class124,
											(class_r == Client.local_player));
								}
								if ((((Entity) class_r).anInt6427
										^ 0xffffffff) <= ((((SequenceType) class124).frameIDs).length ^ 0xffffffff)) {
									if (((SpotAnimType) class144).aBool2087) {
										((Entity) class_r).anInt6427 -= ((SequenceType) class124).frameStep;
										((Entity) class_r).anInt6439++;
										if (((Entity) class_r).anInt6439 >= ((SequenceType) class124).maxLoops)
											((Entity) class_r).f_pb = -1;
										else if ((((Entity) class_r).anInt6427 < 0)
												|| ((((SequenceType) class124).frameIDs).length <= (((Entity) class_r).anInt6427)))
											((Entity) class_r).f_pb = -1;
										else
											Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r).x),
													((Entity) class_r).anInt6427,
													(((Class59_Sub3) class_r).current_plane),
													(((Class59_Sub3) class_r).y), true, class124,
													(class_r == (Client.local_player)));
									} else
										((Entity) class_r).f_pb = -1;
								}
								((Entity) class_r).anInt6461 = 1 + ((Entity) class_r).anInt6427;
								if (((((SequenceType) class124).frameIDs).length
										^ 0xffffffff) >= (((Entity) class_r).anInt6461 ^ 0xffffffff)) {
									if (((SpotAnimType) class144).aBool2087) {
										((Entity) class_r).anInt6461 -= ((SequenceType) class124).frameStep;
										if ((1 + ((Entity) class_r).anInt6439
												^ 0xffffffff) > (((SequenceType) class124).maxLoops ^ 0xffffffff)) {
											if ((((Entity) class_r).anInt6461 ^ 0xffffffff) > -1
													|| (((((SequenceType) class124).frameIDs).length
															^ 0xffffffff) >= ((((Entity) class_r).anInt6461)
																	^ 0xffffffff)))
												((Entity) class_r).anInt6461 = -1;
										} else
											((Entity) class_r).anInt6461 = -1;
									} else
										((Entity) class_r).anInt6461 = -1;
								}
							} else
								((Entity) class_r).f_pb = -1;
						} else
							((Entity) class_r).f_pb = -1;
					}
				} while (false);
				if ((((Entity) class_r).current_sequence ^ 0xffffffff) != 0
						&& (((Entity) class_r).f_qb ^ 0xffffffff) >= -2) {
					SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3,
							((Entity) class_r).current_sequence);
					if ((((SequenceType) class124).precedenceAnimating ^ 0xffffffff) != -4) {
						if (((((SequenceType) class124).precedenceAnimating ^ 0xffffffff) == -2)
								&& (((Entity) class_r).f_sc ^ 0xffffffff) < -1
								&& ((((Entity) class_r).anInt6422 ^ 0xffffffff) >= (Client.cycle ^ 0xffffffff))
								&& ((Client.cycle ^ 0xffffffff) < (((Entity) class_r).anInt6428 ^ 0xffffffff)))
							((Entity) class_r).f_qb = 2;
					} else if (((Entity) class_r).f_sc > 0
							&& ((((Entity) class_r).anInt6422 ^ 0xffffffff) >= (Client.cycle ^ 0xffffffff))
							&& (Client.cycle > ((Entity) class_r).anInt6428)) {
						((Entity) class_r).current_sequence = -1;
					}
				}
				if ((((Entity) class_r).current_sequence ^ 0xffffffff) != 0
						&& (((Entity) class_r).f_qb ^ 0xffffffff) == -1) {
					SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3,
							((Entity) class_r).current_sequence);
					if (class124 == null || ((SequenceType) class124).frameIDs == null) {
						((Entity) class_r).current_sequence = -1;
					} else {
						((Entity) class_r).anInt6465++;
						if ((((Entity) class_r).anInt6452 < ((SequenceType) class124).frameIDs.length)
								&& (((Entity) class_r).anInt6465 > (((SequenceType) class124).frameLenghts[((Entity) class_r).anInt6452]))) {
							((Entity) class_r).anInt6465 = 1;
							((Entity) class_r).anInt6452++;
							Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).x, ((Entity) class_r).anInt6452,
									((Class59_Sub3) class_r).current_plane, ((Class59_Sub3) class_r).y, true, class124,
									class_r == Client.local_player);
						}
						if (((Entity) class_r).anInt6452 >= ((SequenceType) class124).frameIDs.length) {
							((Entity) class_r).anInt6452 -= ((SequenceType) class124).frameStep;
							((Entity) class_r).anInt6415++;
							if (((SequenceType) class124).maxLoops > ((Entity) class_r).anInt6415) {
								if ((((Entity) class_r).anInt6452 ^ 0xffffffff) <= -1 && ((((Entity) class_r).anInt6452
										^ 0xffffffff) > ((((SequenceType) class124).frameIDs).length ^ 0xffffffff))) {
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).x,
											((Entity) class_r).anInt6452, ((Class59_Sub3) class_r).current_plane,
											((Class59_Sub3) class_r).y, true, class124,
											(class_r == Client.local_player));
								} else {
									((Entity) class_r).current_sequence = -1;
								}
							} else {
								((Entity) class_r).current_sequence = -1;
							}
						}
						((Entity) class_r).anInt6449 = 1 + ((Entity) class_r).anInt6452;
						if (((Entity) class_r).anInt6449 >= ((SequenceType) class124).frameIDs.length) {
							((Entity) class_r).anInt6449 -= ((SequenceType) class124).frameStep;
							if ((((Entity) class_r).anInt6415 + 1 ^ 0xffffffff) > (((SequenceType) class124).maxLoops
									^ 0xffffffff)) {
								if ((((Entity) class_r).anInt6449 ^ 0xffffffff) > -1 || ((((Entity) class_r).anInt6449
										^ 0xffffffff) <= ((((SequenceType) class124).frameIDs).length ^ 0xffffffff)))
									((Entity) class_r).anInt6449 = -1;
							} else
								((Entity) class_r).anInt6449 = -1;
						}
						((Entity) class_r).aBool6419 = ((SequenceType) class124).stretches;
					}
				}
				if (((Entity) class_r).f_qb > 0)
					((Entity) class_r).f_qb--;
				for (int i_14_ = 0; ((((Entity) class_r).aClass148Array6467.length ^ 0xffffffff) < (i_14_
						^ 0xffffffff)); i_14_++) {
					Class148 class148 = ((Entity) class_r).aClass148Array6467[i_14_];
					if (class148 != null) {
						if (((Class148) class148).anInt2181 > 0)
							((Class148) class148).anInt2181--;
						else {
							SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(3,
									((Class148) class148).anInt2179));
							if (class124 == null || (((SequenceType) class124).frameIDs == null))
								((Entity) class_r).aClass148Array6467[i_14_] = null;
							else {
								((Class148) class148).anInt2182++;
								if ((((((SequenceType) class124).frameIDs).length
										^ 0xffffffff) < (((Class148) class148).anInt2177 ^ 0xffffffff))
										&& (((((SequenceType) class124).frameLenghts[((Class148) class148).anInt2177])
												^ 0xffffffff) > (((Class148) class148).anInt2182 ^ 0xffffffff))) {
									((Class148) class148).anInt2177++;
									((Class148) class148).anInt2182 = 1;
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).x,
											((Class148) class148).anInt2177, ((Class59_Sub3) class_r).current_plane,
											((Class59_Sub3) class_r).y, true, class124,
											(Client.local_player == class_r));
								}
								if (((Class148) class148).anInt2177 >= (((SequenceType) class124).frameIDs).length) {
									((Class148) class148).anInt2177 -= ((SequenceType) class124).frameStep;
									((Class148) class148).anInt2183++;
									if ((((Class148) class148).anInt2183
											^ 0xffffffff) <= (((SequenceType) class124).maxLoops ^ 0xffffffff))
										((Entity) class_r).aClass148Array6467[i_14_] = null;
									else if ((((Class148) class148).anInt2177 >= 0)
											&& ((((SequenceType) class124).frameIDs).length > (((Class148) class148).anInt2177)))
										Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r).x),
												((Class148) class148).anInt2177,
												(((Class59_Sub3) class_r).current_plane), (((Class59_Sub3) class_r).y),
												true, class124, (Client.local_player == class_r));
									else
										((Entity) class_r).aClass148Array6467[i_14_] = null;
								}
								((Class148) class148).anInt2180 = 1 + ((Class148) class148).anInt2177;
								if (((SequenceType) class124).frameIDs.length <= ((Class148) class148).anInt2180) {
									((Class148) class148).anInt2180 -= ((SequenceType) class124).frameStep;
									if (((Class148) class148).anInt2183 + 1 >= ((SequenceType) class124).maxLoops)
										((Class148) class148).anInt2180 = -1;
									else if ((((Class148) class148).anInt2180 ^ 0xffffffff) > -1
											|| ((((SequenceType) class124).frameIDs).length <= (((Class148) class148).anInt2180)))
										((Class148) class148).anInt2180 = -1;
								}
							}
						}
					}
				}
				if (i < -36)
					break;
				aClass67_2920 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("sr.D(" + (class_r != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void decode(int i, Buffer stream) {
		for (;;) {
			int opcode = stream.readUnsignedByte();
			if ((opcode ^ 0xffffffff) == -1)
				break;
			process_op(stream, opcode, i + 129);
		}
	}

	private final void process_op(Buffer stream, int opcode, int i_16_) {
		do {
			try {
				anInt2918++;
				if (opcode == 1) {
					secondary_color = stream.read24BitInteger((byte) 29);
					rgbToHsl((byte) -127, secondary_color);
				} else if (opcode == 2) {
					((FloorDefinition) this).texture = stream.readUnsignedShort();
					if ((((FloorDefinition) this).texture ^ 0xffffffff) == -65536)
						((FloorDefinition) this).texture = -1;
				} else if (opcode == 3) {
					((FloorDefinition) this).anInt2924 = stream.readUnsignedShort() << 0;
				} else if (opcode == 4) {
					((FloorDefinition) this).aBool2913 = false;
				}
				if (i_16_ == 128)
					break;
				process_op(null, 126, -96);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("sr.C(" + (stream != null ? "{...}" : "null") + ',' + opcode + ',' + i_16_ + ')'));
			}
			break;
		} while (false);
	}

	static final int hsl24to16(int i, int i_11_, int i_12_, int i_13_) {
		try {
			if (i_12_ != 2)
				return -122;
			Class40_Sub4.anInt4118++;
			if (i_13_ > 243)
				i >>= 4;
			else if ((i_13_ ^ 0xffffffff) >= -218) {
				if (i_13_ > 192)
					i >>= 2;
				else if ((i_13_ ^ 0xffffffff) < -180)
					i >>= 1;
			} else
				i >>= 3;
			return ((i_13_ >> 1) + (((0x3f & i_11_ >> 2) << 10) - -(i >> 5 << 7)));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ei.F(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	static final int method1363(int i, int i_17_, String string) {
		try {
			if (i_17_ > -13)
				return 18;
			anInt2922++;
			return Class248.method1583(false, i, true, string);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("sr.G(" + i + ',' + i_17_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public FloorDefinition() {
		/* empty */
	}
}
