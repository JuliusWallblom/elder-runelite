package io;

import io.cache.Revision;

import java.util.Arrays;

final class Class255_Sub1 extends MapRegion {
	static int anInt5571;
	static int anInt5572;
	static int anInt5573 = 0;
	static int anInt5574;
	static float aFloat5575;
	static int anInt5576;
	static int anInt5577;
	int anInt5578 = 99;
	static int anInt5579;
	static int anInt5580;
	static int anInt5581;
	/* synthetic */ static Class aClass5582;

	final void method2336(int i, int[] is, int i_0_, SceneGraph class260, int i_1_, Buffer stream) {
		do {
			try {
				anInt5571++;
				if (!((MapRegion) this).aBool3658) {
					boolean bool = false;
					if (is != null)
						is[0] = -1;
					Class138 class138 = null;
					while (((Buffer) stream).position < ((Buffer) stream).buffer.length) {
						int i_2_ = stream.readUnsignedByte();
						if ((i_2_ ^ 0xffffffff) == -1)
							class138 = new Class138(stream);
						else if ((i_2_ ^ 0xffffffff) != -2) {
							if ((i_2_ ^ 0xffffffff) == -3) {
								if (class138 == null)
									class138 = new Class138();
								class138.method933((byte) -31, stream);
							} else if (i_2_ != 128) {
								if (i_2_ != 129)
									throw new IllegalStateException("");
								if (((MapRegion) this).aByteArrayArrayArray3649 == null)
									((MapRegion) this).aByteArrayArrayArray3649 = new short[4][][];
								bool = true;
								for (int i_3_ = 0; i_3_ < 4; i_3_++) {
									byte i_4_ = stream.readByte();
									if (i_4_ == 0 && (((MapRegion) this).aByteArrayArrayArray3649[i_3_]) != null) {
										int i_5_ = i_1_;
										int i_6_ = 64 + i_1_;
										int i_7_ = i_0_;
										if ((i_7_ ^ 0xffffffff) > -1)
											i_7_ = 0;
										else if ((((MapRegion) this).regionSizeY ^ 0xffffffff) >= (i_7_ ^ 0xffffffff))
											i_7_ = ((MapRegion) this).regionSizeY;
										if (i_5_ >= 0) {
											if (((MapRegion) this).regionSizeX <= i_5_)
												i_5_ = (((MapRegion) this).regionSizeX);
										} else
											i_5_ = 0;
										if (i_6_ < 0)
											i_6_ = 0;
										else if ((((MapRegion) this).regionSizeX ^ 0xffffffff) >= (i_6_ ^ 0xffffffff))
											i_6_ = ((MapRegion) this).regionSizeX;
										int i_8_ = 64 + i_0_;
										if ((i_8_ ^ 0xffffffff) > -1)
											i_8_ = 0;
										else if (i_8_ >= (((MapRegion) this).regionSizeY))
											i_8_ = ((MapRegion) this).regionSizeY;
										for (/**/; i_6_ > i_5_; i_5_++) {
											for (/**/; i_8_ > i_7_; i_7_++)
												((MapRegion) this).aByteArrayArrayArray3649[i_3_][i_5_][i_7_] = (short) 0;
										}
									} else if (i_4_ != 1) {
										if ((i_4_ ^ 0xffffffff) == -3) {
											if ((((MapRegion) this).aByteArrayArrayArray3649[i_3_]) == null)
												((MapRegion) this).aByteArrayArrayArray3649[i_3_] = (new short[1
														+ (((MapRegion) this).regionSizeX)][1
																+ (((MapRegion) this).regionSizeY)]);
											if (i_3_ > 0) {
												int i_9_ = i_1_;
												int i_10_ = i_1_ + 64;
												int i_11_ = i_0_;
												if (i_10_ < 0)
													i_10_ = 0;
												else if ((((MapRegion) this).regionSizeX) <= i_10_)
													i_10_ = (((MapRegion) this).regionSizeX);
												if ((i_11_ ^ 0xffffffff) <= -1) {
													if ((i_11_ ^ 0xffffffff) <= ((((MapRegion) this).regionSizeY)
															^ 0xffffffff))
														i_11_ = ((MapRegion) this).regionSizeY;
												} else
													i_11_ = 0;
												int i_12_ = i_0_ + 64;
												if ((i_9_ ^ 0xffffffff) > -1)
													i_9_ = 0;
												else if (((((MapRegion) this).regionSizeX) ^ 0xffffffff) >= (i_9_
														^ 0xffffffff))
													i_9_ = (((MapRegion) this).regionSizeX);
												if ((i_12_ ^ 0xffffffff) <= -1) {
													if ((i_12_ ^ 0xffffffff) <= ((((MapRegion) this).regionSizeY)
															^ 0xffffffff))
														i_12_ = ((MapRegion) this).regionSizeY;
												} else
													i_12_ = 0;
												for (/**/; ((i_9_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)); i_9_++) {
													for (/**/; i_12_ > i_11_; i_11_++)
														((MapRegion) this).aByteArrayArrayArray3649[i_3_][i_9_][i_11_] = (((MapRegion) this).aByteArrayArrayArray3649[i_3_
																- 1][i_9_][i_11_]);
												}
											}
										}
									} else {
										if ((((MapRegion) this).aByteArrayArrayArray3649[i_3_]) == null)
											((MapRegion) this).aByteArrayArrayArray3649[i_3_] = (new short[1
													+ (((MapRegion) this).regionSizeX)][(((MapRegion) this).regionSizeY)
															+ 1]);
										for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -65; i_13_ += 4) {
											for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -65; i_14_ += 4) {
												byte i_15_ = stream.readByte();
												for (int i_16_ = i_13_ - -i_1_; (i_16_ < 4 + (i_1_ + i_13_)); i_16_++) {
													for (int i_17_ = i_0_ + i_14_; ((i_14_ - -i_0_ + 4
															^ 0xffffffff) < (i_17_ ^ 0xffffffff)); i_17_++) {
														if (i_16_ >= 0 && ((((MapRegion) this).regionSizeX) > i_16_)
																&& i_17_ >= 0
																&& (i_17_ < (((MapRegion) this).regionSizeY)))
															((MapRegion) this).aByteArrayArrayArray3649[i_3_][i_16_][i_17_] = i_15_;
													}
												}
											}
										}
									}
								}
							} else if (is == null)
								((Buffer) stream).position += 10;
							else {
								is[0] = stream.readUnsignedShort();
								is[1] = stream.method2375((byte) 1);
								is[2] = stream.method2375((byte) 1);
								is[3] = stream.method2375((byte) 1);
								is[4] = stream.readUnsignedShort();
							}
						} else {
							int i_18_ = stream.readUnsignedByte();
							if (i_18_ > 0) {
								for (int i_19_ = 0; ((i_19_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff)); i_19_++) {
									Class174 class174 = new Class174(class260, stream, 0);
									if ((((Class174) class174).anInt2450 ^ 0xffffffff) == -32) {
										Class173 class173 = (Class228.aClass189_3132
												.method1243(stream.readUnsignedShort(), 70));
										class174.method1145(((Class173) class173).anInt2440,
												((Class173) class173).anInt2445, ((Class173) class173).anInt2443,
												((Class173) class173).anInt2437, (byte) -101);
									}
									if (class260.method1701() > 0) {
										Class246_Sub41 class246_sub41 = (((Class174) class174).aClass246_Sub41_2452);
										int i_20_ = ((i_1_ << 7) + class246_sub41.method2317(false));
										int i_21_ = (class246_sub41.method2321((byte) -56) - -(i_0_ << 7));
										int i_22_ = i_20_ >> 7;
										int i_23_ = i_21_ >> 7;
										if ((i_22_ ^ 0xffffffff) <= -1 && i_23_ >= 0
												&& (((MapRegion) this).regionSizeX > i_22_)
												&& (((MapRegion) this).regionSizeY > i_23_)) {
											class246_sub41.method2320(i_20_,
													((((MapRegion) this).tileHeights[(((Class174) class174).anInt2461)][i_22_][i_23_])
															- (class246_sub41.method2318((byte) 27))),
													i_21_, (byte) 21);
											if (class260.method1701() > 0)
												Class246_Sub28_Sub17.method2659(class174);
										}
									}
								}
							}
						}
					}
					if (class138 != null) {
						for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -9; i_24_++) {
							for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -9; i_25_++) {
								int i_26_ = (i_1_ >> 3) + i_24_;
								int i_27_ = i_25_ + (i_0_ >> 3);
								if (i_26_ >= 0 && i_26_ < ((MapRegion) this).regionSizeX >> 3
										&& (i_27_ ^ 0xffffffff) <= -1 && (i_27_ < ((MapRegion) this).regionSizeY >> 3))
									Class60.method411(class138, false, i_26_, i_27_);
							}
						}
					}
					if (i == 0) {
						if (bool || (((MapRegion) this).aByteArrayArrayArray3649 == null))
							break;
						for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -5; i_28_++) {
							if ((((MapRegion) this).aByteArrayArrayArray3649[i_28_]) != null) {
								for (int i_29_ = 0; i_29_ < 16; i_29_++) {
									for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -17; i_30_++) {
										int i_31_ = i_29_ + (i_1_ >> 2);
										int i_32_ = i_30_ + (i_0_ >> 2);
										if (i_31_ >= 0 && (i_31_ ^ 0xffffffff) > -27 && i_32_ >= 0 && i_32_ < 26)
											((MapRegion) this).aByteArrayArrayArray3649[i_28_][i_31_][i_32_] = (short) 0;
									}
								}
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	final void method2337(SceneGraph class260, int i, CollisionMap class199, int i_33_, int i_34_, int i_35_,
			int i_36_) {
		while_150_: do {
			do {
				try {
					anInt5577++;
					Class_f class_f = null;
					if (i_33_ == 0)
						class_f = (Class_f) Class246_Sub22.method2082(i_34_, i_36_, i_35_);
					if ((i_33_ ^ 0xffffffff) == -2)
						class_f = (Class_f) Class31.method236(i_34_, i_36_, i_35_);
					if ((i_33_ ^ 0xffffffff) == -3)
						class_f = (Class_f) (Class17.method168(i_34_, i_36_, i_35_,
								(aClass5582 != null ? aClass5582 : (aClass5582 = Client.getClassByName("Class_f")))));
					if (i == (i_33_ ^ 0xffffffff))
						class_f = (Class_f) Class246_Sub14.method1997(i_34_, i_36_, i_35_);
					if (class_f == null)
						break while_150_;
					LocType class185 = Class143.aClass251_2067.list(class_f.method21(true), 0);
					int i_37_ = class_f.method24(-45);
					int i_38_ = class_f.method18((byte) -70);
					if (class185.method1203(0))
						Class246_Sub1_Sub12.method2620(i_35_, i_36_, 36161, i_34_, class185);
					if (class_f.method22(10869))
						class_f.method20(true, class260);
					if (i_33_ == 0) {
						Class59_Sub4 class59_sub4 = Class246_Sub22.method2082(i_34_, i_36_, i_35_);
						if (!(class59_sub4 instanceof Class59_Sub4_Sub1))
							ObjType.method1285(i_34_, i_36_, i_35_);
						else
							((Class59_Sub4_Sub1) (Class59_Sub4_Sub1) class59_sub4).aClass59_Sub4_6317 = null;
						if (((LocType) class185).interact_type != 0) {
							class199.method1321(i ^ 0x56, i_38_, i_37_, i_35_, i_36_,
									(((LocType) class185).blocks_projectile), !(((LocType) class185).hollow));
							break;
						}
					} else {
						if (i_33_ != 1) {
							if ((i_33_ ^ 0xffffffff) == -3) {
								Class59_Sub3 class59_sub3 = (Class17.method168(i_34_, i_36_, i_35_,
										(aClass5582 != null ? aClass5582
												: (aClass5582 = Client.getClassByName("Class_f")))));
								if (class59_sub3 instanceof Class59_Sub3_Sub1 && ((i_36_
										^ 0xffffffff) == ((((Class59_Sub3) class59_sub3).aShort5057) ^ 0xffffffff))
										&& i_35_ == (((Class59_Sub3) class59_sub3).aShort5064))
									((Class59_Sub3_Sub1) (Class59_Sub3_Sub1) class59_sub3).aClass59_Sub3_5732 = null;
								else
									Model.method653(i_34_, i_36_, i_35_, (aClass5582 != null ? aClass5582
											: (aClass5582 = Client.getClassByName("Class_f"))));
								if (((LocType) class185).interact_type != 0
										&& (((MapRegion) this).regionSizeX > (((LocType) class185).size_x + i_36_))
										&& ((((MapRegion) this).regionSizeY
												^ 0xffffffff) < ((i_35_ + ((LocType) class185).size_x) ^ 0xffffffff))
										&& (((MapRegion) this).regionSizeX > (i_36_ - -((LocType) class185).size_y))
										&& ((((MapRegion) this).regionSizeY
												^ 0xffffffff) < ((i_35_ + ((LocType) class185).size_y) ^ 0xffffffff)))
									class199.method1310(i_35_, i_38_, ((LocType) class185).blocks_projectile,
											i ^ ~0x5981, ((LocType) class185).size_x, i_36_,
											!((LocType) class185).hollow, ((LocType) class185).size_y);
							} else {
								if ((i_33_ ^ 0xffffffff) != -4)
									break;
								Class59_Sub1 class59_sub1 = Class246_Sub14.method1997(i_34_, i_36_, i_35_);
								if (class59_sub1 instanceof Class59_Sub1_Sub1)
									((Class59_Sub1_Sub1) (Class59_Sub1_Sub1) class59_sub1).aClass59_Sub1_5982 = null;
								else
									Class232.method1490(i_34_, i_36_, i_35_);
								if ((((LocType) class185).interact_type ^ 0xffffffff) != -2)
									break;
								class199.method1320(i_36_, i_35_, false);
							}
							break;
						}
						Class59_Sub2 class59_sub2 = Class31.method236(i_34_, i_36_, i_35_);
						if (!(class59_sub2 instanceof Class59_Sub2_Sub2)) {
							Class40_Sub9.method2308(i_34_, i_36_, i_35_);
							break;
						}
						((Class59_Sub2_Sub2) (Class59_Sub2_Sub2) class59_sub2).aClass59_Sub2_6009 = null;
					}
				} catch (RuntimeException runtimeexception) {
					throw Class193.method1272(runtimeexception,
							("wn.P(" + (class260 != null ? "{...}" : "null") + ',' + i + ','
									+ (class199 != null ? "{...}" : "null") + ',' + i_33_ + ',' + i_34_ + ',' + i_35_
									+ ',' + i_36_ + ')'));
				}
			} while (false);
			break;
		} while (false);
	}

	final void load(CollisionMap[] map, int block_y, byte[] data, int block_x, SceneGraph scene,
			Revision revision) {
		Buffer buffer = new Buffer(data);
		int object_id = -1;
		for (;;) {
			int id_offset = buffer.readIncrSmallSmart();
			if (id_offset == 0)
				break;
			object_id += id_offset;
			int position = 0;
			for (;;) {
				int positionOffset = buffer.readUShortSmart();
				if (positionOffset == 0)
					break;
				position += positionOffset - 1;
				int tile_y = position & 0x3f;
				int tile_x = position >> 6 & 0x3f;
				int plane = position >> 12 & 0x3;
				int attributes = buffer.readUnsignedByte();
				int type = attributes >> 2;
				int orientation = 0x3 & attributes;
				int x = tile_x + block_x;
				int y = block_y + tile_y;
				if (x > 0 && y > 0 && x < 103 && y < 103 && plane >= 0 && plane < 4) {
					CollisionMap collision = null;
					int marking_plane = plane;
					if ((Class45.tileRenderFlags[1][x][y] & 2) == 2)
						marking_plane--;
					if (marking_plane >= 0 && marking_plane < 4)
						collision = map[marking_plane];
					render_objects(x, plane, orientation, -1, object_id, scene, type, y, plane, (byte) 26,
							collision, revision);
				}
			}
		}
	}

	final void method2339(int i, int i_54_, Buffer stream, int[] is, SceneGraph class260, int i_55_, int i_56_,
			int i_57_,
			int i_58_, int i_59_, int i_60_) {
		do {
			try {
				anInt5574++;
				if (!((MapRegion) this).aBool3658) {
					boolean bool = false;
					Class138 class138 = null;
					if (is != null)
						is[0] = -1;
					int i_61_ = (i_56_ & 0x7) * 8;
					int i_62_ = i_58_ * (0x7 & i_55_);
					while (((Buffer) stream).position < ((Buffer) stream).buffer.length) {
						int i_63_ = stream.readUnsignedByte();
						if ((i_63_ ^ 0xffffffff) != -1) {
							if ((i_63_ ^ 0xffffffff) != -2) {
								if (i_63_ != 2) {
									if (i_63_ != 128) {
										if ((i_63_ ^ 0xffffffff) != -130)
											throw new IllegalStateException("");
										if ((((MapRegion) this).aByteArrayArrayArray3649) == null)
											((MapRegion) this).aByteArrayArrayArray3649 = new short[4][][];
										for (int i_64_ = 0; i_64_ < 4; i_64_++) {
											byte i_65_ = stream.readByte();
											if (i_65_ != 0
													|| (((MapRegion) this).aByteArrayArrayArray3649[i]) == null) {
												if (i_65_ == 1) {
													if ((((MapRegion) this).aByteArrayArrayArray3649[i]) == null)
														((MapRegion) this).aByteArrayArrayArray3649[i] = (new short[((((MapRegion) this).regionSizeX)
																+ 1)][((((MapRegion) this).regionSizeY) + 1)]);
													for (int i_66_ = 0; ((i_66_ ^ 0xffffffff) > -65); i_66_ += 4) {
														for (int i_67_ = 0; i_67_ < 64; i_67_ += 4) {
															byte i_68_ = (stream.readByte());
															if (i_64_ <= i_59_) {
																for (int i_69_ = i_66_; (4 + i_66_ > i_69_); i_69_++) {
																	for (int i_70_ = i_67_; (i_70_ < 4
																			+ i_67_); i_70_++) {
																		if ((i_69_ >= i_61_) && 8 + i_61_ > i_69_
																				&& (i_70_ ^ 0xffffffff) <= (i_62_
																						^ 0xffffffff)
																				&& i_62_ + 8 > i_62_) {
																			int i_71_ = i_60_
																					- -Class230.method1475(i_70_ & 0x7,
																							i_57_, 64, 0x7 & i_69_);
																			int i_72_ = RenderAnimation.method914(i_57_,
																					(byte) -115, 0x7 & i_69_,
																					i_70_ & 0x7) + i_54_;
																			if (i_71_ >= 0
																					&& (((MapRegion) this).regionSizeX
																							^ 0xffffffff) < (i_71_
																									^ 0xffffffff)
																					&& (i_72_ ^ 0xffffffff) <= -1
																					&& (i_72_
																							^ 0xffffffff) > (((MapRegion) this).regionSizeY
																									^ 0xffffffff))
																				((MapRegion) this).aByteArrayArrayArray3649[i][i_71_][i_72_] = i_68_;
																		}
																	}
																}
															}
														}
													}
												}
											} else if (i_64_ <= i_59_) {
												int i_73_ = i_60_;
												int i_74_ = i_60_ + 7;
												int i_75_ = i_54_;
												if ((i_75_ ^ 0xffffffff) <= -1) {
													if (((((MapRegion) this).regionSizeY) ^ 0xffffffff) >= (i_75_
															^ 0xffffffff))
														i_75_ = ((MapRegion) this).regionSizeY;
												} else
													i_75_ = 0;
												if (i_74_ < 0)
													i_74_ = 0;
												else if (i_74_ >= (((MapRegion) this).regionSizeX))
													i_74_ = (((MapRegion) this).regionSizeX);
												int i_76_ = i_54_ + 7;
												if ((i_73_ ^ 0xffffffff) <= -1) {
													if ((((MapRegion) this).regionSizeX) <= i_73_)
														i_73_ = ((MapRegion) this).regionSizeX;
												} else
													i_73_ = 0;
												if (i_76_ < 0)
													i_76_ = 0;
												else if (((((MapRegion) this).regionSizeY) ^ 0xffffffff) >= (i_76_
														^ 0xffffffff))
													i_76_ = (((MapRegion) this).regionSizeY);
												for (/**/; ((i_73_ ^ 0xffffffff) > (i_74_ ^ 0xffffffff)); i_73_++) {
													for (/**/; ((i_76_ ^ 0xffffffff) < (i_75_ ^ 0xffffffff)); i_75_++)
														((MapRegion) this).aByteArrayArrayArray3649[i][i_73_][i_75_] = (short) 0;
												}
											}
										}
									} else if (is == null)
										((Buffer) stream).position += 10;
									else {
										is[0] = stream.readUnsignedShort();
										is[1] = stream.method2375((byte) 1);
										is[2] = stream.method2375((byte) 1);
										is[3] = stream.method2375((byte) 1);
										is[4] = stream.readUnsignedShort();
									}
								} else {
									if (class138 == null)
										class138 = new Class138();
									class138.method933((byte) -31, stream);
								}
							} else {
								int i_77_ = stream.readUnsignedByte();
								if (i_77_ > 0) {
									for (int i_78_ = 0; ((i_78_ ^ 0xffffffff) > (i_77_ ^ 0xffffffff)); i_78_++) {
										Class174 class174 = new Class174(class260, stream, 0);
										if ((((Class174) class174).anInt2450 ^ 0xffffffff) == -32) {
											Class173 class173 = (Class228.aClass189_3132
													.method1243(stream.readUnsignedShort(), 96));
											class174.method1145((((Class173) class173).anInt2440),
													(((Class173) class173).anInt2445),
													(((Class173) class173).anInt2443),
													(((Class173) class173).anInt2437), (byte) 124);
										}
										if ((class260.method1701() ^ 0xffffffff) < -1) {
											Class246_Sub41 class246_sub41 = (((Class174) class174).aClass246_Sub41_2452);
											int i_79_ = (class246_sub41.method2317(false) >> 7);
											int i_80_ = (class246_sub41.method2321((byte) -124) >> 7);
											if ((((Class174) class174).anInt2461) == i_59_
													&& ((i_79_ ^ 0xffffffff) <= (i_61_ ^ 0xffffffff))
													&& i_79_ < i_61_ + 8
													&& ((i_80_ ^ 0xffffffff) <= (i_62_ ^ 0xffffffff))
													&& ((8 + i_62_ ^ 0xffffffff) < (i_80_ ^ 0xffffffff))) {
												int i_81_ = ((i_60_ << 7) - -(Class187_Sub2.method2287(i_57_,
														((class246_sub41.method2321((byte) -52)) & 0x3ff), -32457,
														(0x3ff & (class246_sub41.method2317(false))))));
												int i_82_ = ((i_54_ << 7) - -(Class53.method366(
														(0x3ff & (class246_sub41.method2321((byte) -74))),
														(0x3ff & (class246_sub41.method2317(false))), false, i_57_)));
												i_79_ = i_81_ >> 7;
												i_80_ = i_82_ >> 7;
												if ((i_79_ ^ 0xffffffff) <= -1 && ((i_80_ ^ 0xffffffff) <= -1)
														&& (((MapRegion) this).regionSizeX) > i_79_
														&& (((MapRegion) this).regionSizeY) > i_80_) {
													class246_sub41.method2320(i_81_,
															((((MapRegion) this).tileHeights[i_59_][i_79_][i_80_])
																	- (class246_sub41.method2318((byte) 27))),
															i_82_, (byte) 21);
													if ((class260.method1701() ^ 0xffffffff) < -1)
														Class246_Sub28_Sub17.method2659(class174);
												}
											}
										}
									}
								}
							}
						} else
							class138 = new Class138(stream);
					}
					if (class138 != null)
						Class60.method411(class138, false, i_60_ >> 3, i_54_ >> 3);
					if (bool || ((MapRegion) this).aByteArrayArrayArray3649 == null
							|| (((MapRegion) this).aByteArrayArrayArray3649[i] == null))
						break;
					int i_83_ = 7 + i_60_;
					int i_84_ = i_54_ + 7;
					for (int i_85_ = i_60_; (i_85_ ^ 0xffffffff) > (i_83_ ^ 0xffffffff); i_85_++) {
						for (int i_86_ = i_54_; (i_86_ ^ 0xffffffff) > (i_84_ ^ 0xffffffff); i_86_++)
							((MapRegion) this).aByteArrayArrayArray3649[i][i_85_][i_86_] = (short) 0;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("wn.V(" + i + ',' + i_54_ + ',' + (stream != null ? "{...}" : "null") + ','
								+ (is != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ','
								+ i_55_ + ',' + i_56_ + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + i_60_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2340(byte[] is, int i, int i_87_, int i_88_, int i_89_, int i_90_, SceneGraph class260, int i_91_,
			CollisionMap[] class199s, int i_92_, byte i_93_, Revision revision) {
		try {

		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wn.Q(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_87_ + ',' + i_88_ + ',' + i_89_ + ','
							+ i_90_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_91_ + ','
							+ (class199s != null ? "{...}" : "null") + ',' + i_92_ + ',' + i_93_ + ')'));
		}
	}

	final void render_objects(int var2, int i_107_, int i_108_, int i_109_, int i_110_, SceneGraph class260, int var6,
			int var3, int i_113_, byte i_114_, CollisionMap class199, Revision revision) {
		try {
			// TODO render objects
			anInt5581++;
			if (Client.current_renderer.method2052(Buffer.anInt5656, 127)
					|| SwitchInt.method2179(var2, Class40_Sub6.anInt5103, (byte) 56, i_113_, var3)) {
				if (((Class255_Sub1) this).anInt5578 > i_107_)
					((Class255_Sub1) this).anInt5578 = i_107_;
				LocType class185 = Class143.aClass251_2067.list(i_110_, 0, revision);
				if (!class260.method1692() || !(((Renderer) Client.current_renderer).texture)
						|| !((LocType) class185).aBool2611) {
					int var10;
					int var11;
					if (i_108_ != 1 && i_108_ != 3) {
						var10 = ((LocType) class185).size_x;
						var11 = ((LocType) class185).size_y;
					} else {
						var10 = ((LocType) class185).size_y;
						var11 = ((LocType) class185).size_x;
					}
					int i_117_;
					int i_118_;
					if (((MapRegion) this).regionSizeX >= var2 + var10) {
						i_117_ = var2 + (var10 >> 1);
						i_118_ = (1 + var10 >> 1) + var2;
					} else {
						i_117_ = var2;
						i_118_ = var2 + 1;
					}
					if (i_114_ < 18)
						render_objects(-74, 32, 17, -72, 23, null, 4, 37, 72, (byte) -46, null, revision);
					int i_119_;
					int i_120_;
					if ((var3 - -var11 ^ 0xffffffff) < (((MapRegion) this).regionSizeY ^ 0xffffffff)) {
						i_119_ = var3 + 1;
						i_120_ = var3;
					} else {
						i_119_ = (1 + var11 >> 1) + var3;
						i_120_ = (var11 >> 1) + var3;
					}
					Class210 var16 = Class59_Sub3_Sub4.aClass210Array6993[i_113_];
					int var17 = ((var16.l(i_117_, i_120_) + (var16.l(i_118_, i_120_) + var16.l(i_117_, i_119_)
							- -var16.l(i_118_, i_119_))) >> 2);
					int var18 = (var2 << 7) - -(var10 << 6);
					int var19 = (var3 << 7) - -(var11 << 6);
					boolean bool = (Class168.aBool2394 && !((MapRegion) this).aBool3658
							&& ((LocType) class185).merge_normals);
					if (class185.method1203(0))
						Class66.method434(var2, -1, null, null, var3, i_108_, i_107_, class185);
					boolean bool_124_ = (i_109_ == -1 && (((LocType) class185).animation_id ^ 0xffffffff) == 0
							&& ((LocType) class185).transforms == null && ((LocType) class185).f_bb == null
							&& !((LocType) class185).f_qb);
					if (!Material.aBool3361 || ((!HashMap.method370(var6, (byte) -38)
							|| ((LocType) class185).occlude_type == 1)
							&& (!Class130_Sub6.method2104(85, var6) || ((LocType) class185).occlude_type != 0))) {
						if (var6 == 22) {
							if (Settings.ground_decorations || ((LocType) class185).wall_or_door != 0
									|| (((LocType) class185).interact_type ^ 0xffffffff) == -2
									|| ((LocType) class185).obstructs_ground) {
								Class59_Sub1 class59_sub1;
								if (bool_124_) {
									Class59_Sub1_Sub3 class59_sub1_sub3 = (new Class59_Sub1_Sub3(class260, class185,
											i_113_, var18, var17, var19, ((MapRegion) this).aBool3658, i_108_,
											bool));
									if (class59_sub1_sub3.method22(10869))
										class59_sub1_sub3.method19(class260, -12694);
									class59_sub1 = class59_sub1_sub3;
								} else {
									class59_sub1 = (new Class59_Sub1_Sub2(class260, class185, i_107_, i_113_, var18,
											var17, var19, ((MapRegion) this).aBool3658, i_108_, i_109_));
								}
								Class59_Sub1 class59_sub1_125_ = Class246_Sub14.method1997(i_107_, var2, var3);
								if (!(class59_sub1_125_ instanceof Class59_Sub1_Sub1)) {
									Class213.method1393(i_107_, var2, var3, class59_sub1, class185.id);
								} else {
									((Class59_Sub1_Sub1) (Class59_Sub1_Sub1) class59_sub1_125_).aClass59_Sub1_5982 = class59_sub1;
								}
								if ((((LocType) class185).interact_type ^ 0xffffffff) == -2 && class199 != null) {
									class199.method1308(-1, var3, var2);
								}
							}
						} else if ((var6 ^ 0xffffffff) == -11 || (var6 ^ 0xffffffff) == -12) {
							Class59_Sub3_Sub4 class59_sub3_sub4 = null;
							Class59_Sub3 class59_sub3;
							int i_126_;
							if (bool_124_) {
								Class59_Sub3_Sub4 class59_sub3_sub4_127_ = (new Class59_Sub3_Sub4(class260, class185,
										i_107_, i_113_, var18, var17, var19, ((MapRegion) this).aBool3658, var2,
										-1 + var10 + var2, var3, -1 + (var3 + var11), var6, i_108_, bool));
								class59_sub3 = class59_sub3_sub4_127_;
								class59_sub3_sub4 = class59_sub3_sub4_127_;
								i_126_ = class59_sub3_sub4_127_.method2866(20922);
							} else {
								class59_sub3 = (new Class59_Sub3_Sub3(class260, class185, i_107_, i_113_, var18,
										var17, var19, ((MapRegion) this).aBool3658, var2, -1 + (var2 + var10), var3,
										-1 + (var3 + var11), var6, i_108_, i_109_));
								i_126_ = 15;
							}
							Class59_Sub3 class59_sub3_128_ = (Class17.method168(i_107_, var2, var3,
									(aClass5582 != null ? aClass5582
											: (aClass5582 = Client.getClassByName("Class_f")))));
							boolean bool_129_ = false;
							if (class59_sub3_128_ instanceof Class59_Sub3_Sub1
									&& ((var2 ^ 0xffffffff) == ((((Class59_Sub3) class59_sub3_128_).aShort5057)
											^ 0xffffffff))
									&& ((var3 ^ 0xffffffff) == ((((Class59_Sub3) class59_sub3_128_).aShort5064)
											^ 0xffffffff))) {
								bool_129_ = true;
								((Class59_Sub3_Sub1) (Class59_Sub3_Sub1) class59_sub3_128_).aClass59_Sub3_5732 = class59_sub3;
							}
							if (bool_129_ || Class176.method1156(class59_sub3, false)) {
								if (class59_sub3_sub4 != null && class59_sub3_sub4.method22(10869)) {
									class59_sub3_sub4.method19(class260, -12694);
								}
								if (((LocType) class185).shadow && Class168.aBool2394) {
									if ((i_126_ ^ 0xffffffff) < -31)
										i_126_ = 30;
									for (int i_130_ = 0; ((var10 ^ 0xffffffff) <= (i_130_ ^ 0xffffffff)); i_130_++) {
										for (int i_131_ = 0; ((var11 ^ 0xffffffff) <= (i_131_
												^ 0xffffffff)); i_131_++) {
											var16.i(var2 - -i_130_, var3 - -i_131_, i_126_);
										}
									}
								}
							}
							if (((LocType) class185).interact_type != 0 && class199 != null)
								class199.method1314(var10, (((LocType) class185).blocks_projectile), 16624, var11,
										!(((LocType) class185).hollow), var2, var3);
						} else if (((var6 ^ 0xffffffff) <= -13 && (var6 ^ 0xffffffff) >= -18)
								|| ((var6 ^ 0xffffffff) <= -19 && (var6 ^ 0xffffffff) >= -22)) {
							Class59_Sub3 class59_sub3;
							if (bool_124_) {
								Class59_Sub3_Sub4 class59_sub3_sub4 = (new Class59_Sub3_Sub4(class260, class185, i_107_,
										i_113_, var18, var17, var19, ((MapRegion) this).aBool3658, var2,
										-1 + var2 + var10, var3, var3 + (var11 - 1), var6, i_108_, bool));
								class59_sub3 = class59_sub3_sub4;
								if (class59_sub3_sub4.method22(10869))
									class59_sub3_sub4.method19(class260, -12694);
							} else
								class59_sub3 = (new Class59_Sub3_Sub3(class260, class185, i_107_, i_113_, var18,
										var17, var19, ((MapRegion) this).aBool3658, var2, -1 + (var10 + var2), var3,
										-1 + (var3 + var11), var6, i_108_, i_109_));
							Class59_Sub3 class59_sub3_132_ = (Class17.method168(i_107_, var2, var3,
									(aClass5582 != null ? aClass5582
											: (aClass5582 = Client.getClassByName("Class_f")))));
							if (class59_sub3_132_ instanceof Class59_Sub3_Sub1
									&& ((((Class59_Sub3) class59_sub3_132_).aShort5057) ^ 0xffffffff) == (var2
											^ 0xffffffff)
									&& ((var3 ^ 0xffffffff) == ((((Class59_Sub3) class59_sub3_132_).aShort5064)
											^ 0xffffffff)))
								((Class59_Sub3_Sub1) (Class59_Sub3_Sub1) class59_sub3_132_).aClass59_Sub3_5732 = class59_sub3;
							else
								Class176.method1156(class59_sub3, false);
							if (Class168.aBool2394 && !((MapRegion) this).aBool3658 && var6 >= 12
									&& (var6 ^ 0xffffffff) >= -18 && (var6 ^ 0xffffffff) != -14 && i_107_ > 0
									&& (((LocType) class185).occlude_type ^ 0xffffffff) != -1)
								((MapRegion) this).tileLighting[i_107_][var2][var3] = (byte) (Class236
										.method1523((((MapRegion) this).tileLighting[i_107_][var2][var3]), 4));
							if (((((LocType) class185).interact_type ^ 0xffffffff) != -1) && class199 != null)
								class199.method1314(var10, (((LocType) class185).blocks_projectile), 16624, var11,
										!(((LocType) class185).hollow), var2, var3);
						} else if (var6 == 0) {
							int i_133_ = ((LocType) class185).occlude_type;
							if (VarpType.aBool1224 && (((LocType) class185).occlude_type ^ 0xffffffff) == 0)
								i_133_ = 1;
							Class59_Sub4 class59_sub4;
							if (!bool_124_)
								class59_sub4 = new Class59_Sub4_Sub3(class260, class185, i_107_, i_113_, var18, var17,
										var19, (((MapRegion) this).aBool3658), var6, i_108_, i_109_);
							else {
								Class59_Sub4_Sub2 class59_sub4_sub2 = new Class59_Sub4_Sub2(class260, class185, i_113_,
										var18, var17, var19, (((MapRegion) this).aBool3658), var6, i_108_, bool);
								class59_sub4 = class59_sub4_sub2;
								if (class59_sub4_sub2.method22(10869))
									class59_sub4_sub2.method19(class260, -12694);
							}
							Class59_Sub4 class59_sub4_134_ = Class246_Sub22.method2082(i_107_, var2, var3);
							if (!(class59_sub4_134_ instanceof Class59_Sub4_Sub1))
								Class246_Sub2.method1785(i_107_, var2, var3, class59_sub4, null);
							else
								((Class59_Sub4_Sub1) (Class59_Sub4_Sub1) class59_sub4_134_).aClass59_Sub4_6317 = class59_sub4;
							if (Class168.aBool2394) {
								if ((i_108_ ^ 0xffffffff) != -1) {
									if ((i_108_ ^ 0xffffffff) != -2) {
										if ((i_108_ ^ 0xffffffff) == -3) {
											if (((LocType) class185).shadow) {
												var16.i(var2 + 1, var3, 50);
												var16.i(1 + var2, var3 + 1, 50);
											}
											if ((i_133_ ^ 0xffffffff) == -2 && !(((MapRegion) this).aBool3658))
												((MapRegion) this).tileLighting[i_107_][1
														+ var2][var3] = (byte) (Class236
																.method1523((((MapRegion) this).tileLighting[i_107_][1
																		+ var2][var3]), 1));
										} else if (i_108_ == 3) {
											if (((LocType) class185).shadow) {
												var16.i(var2, var3, 50);
												var16.i(var2 + 1, var3, 50);
											}
											if (i_133_ == 1 && !(((MapRegion) this).aBool3658))
												((MapRegion) this).tileLighting[i_107_][var2][var3] = (byte) (Class236
														.method1523(
																(((MapRegion) this).tileLighting[i_107_][var2][var3]),
																2));
										}
									} else {
										if (((LocType) class185).shadow) {
											var16.i(var2, var3 + 1, 50);
											var16.i(1 + var2, var3 + 1, 50);
										}
										if (i_133_ == 1 && !((MapRegion) this).aBool3658)
											((MapRegion) this).tileLighting[i_107_][var2][var3
													+ 1] = (byte) (Class236.method1523(
															(((MapRegion) this).tileLighting[i_107_][var2][var3 + 1]),
															2));
									}
								} else {
									if (((LocType) class185).shadow) {
										var16.i(var2, var3, 50);
										var16.i(var2, 1 + var3, 50);
									}
									if ((i_133_ ^ 0xffffffff) == -2 && !((MapRegion) this).aBool3658)
										((MapRegion) this).tileLighting[i_107_][var2][var3] = (byte) (Class236
												.method1523((((MapRegion) this).tileLighting[i_107_][var2][var3]), 1));
								}
							}
							if (((((LocType) class185).interact_type ^ 0xffffffff) != -1) && class199 != null)
								class199.method1318(var3, ((LocType) class185).blocks_projectile, var2, 268435456,
										i_108_, !((LocType) class185).hollow, var6);
							if (((LocType) class185).decor_displacement != 16)
								OverlayLoader.method1152(i_107_, var2, var3, (((LocType) class185).decor_displacement));
						} else if (var6 == 1) {
							Class59_Sub4 class59_sub4;
							if (bool_124_) {
								Class59_Sub4_Sub2 class59_sub4_sub2 = new Class59_Sub4_Sub2(class260, class185, i_113_,
										var18, var17, var19, (((MapRegion) this).aBool3658), var6, i_108_, bool);
								if (class59_sub4_sub2.method22(10869))
									class59_sub4_sub2.method19(class260, -12694);
								class59_sub4 = class59_sub4_sub2;
							} else
								class59_sub4 = new Class59_Sub4_Sub3(class260, class185, i_107_, i_113_, var18, var17,
										var19, (((MapRegion) this).aBool3658), var6, i_108_, i_109_);
							Class59_Sub4 class59_sub4_135_ = Class246_Sub22.method2082(i_107_, var2, var3);
							if (!(class59_sub4_135_ instanceof Class59_Sub4_Sub1))
								Class246_Sub2.method1785(i_107_, var2, var3, class59_sub4, null);
							else
								((Class59_Sub4_Sub1) (Class59_Sub4_Sub1) class59_sub4_135_).aClass59_Sub4_6317 = class59_sub4;
							if (((LocType) class185).shadow && Class168.aBool2394) {
								if ((i_108_ ^ 0xffffffff) != -1) {
									if ((i_108_ ^ 0xffffffff) != -2) {
										if ((i_108_ ^ 0xffffffff) != -3) {
											if (i_108_ == 3)
												var16.i(var2, var3, 50);
										} else
											var16.i(1 + var2, var3, 50);
									} else
										var16.i(1 + var2, 1 + var3, 50);
								} else
									var16.i(var2, var3 + 1, 50);
							}
							if (((LocType) class185).interact_type != 0 && class199 != null)
								class199.method1318(var3, ((LocType) class185).blocks_projectile, var2, 268435456,
										i_108_, !((LocType) class185).hollow, var6);
						} else if ((var6 ^ 0xffffffff) == -3) {
							int i_136_ = i_108_ + 1 & 0x3;
							Class59_Sub4 class59_sub4;
							Class59_Sub4 class59_sub4_137_;
							if (bool_124_) {
								Class59_Sub4_Sub2 class59_sub4_sub2 = new Class59_Sub4_Sub2(class260, class185, i_113_,
										var18, var17, var19, (((MapRegion) this).aBool3658), var6, i_108_ + 4,
										bool);
								Class59_Sub4_Sub2 class59_sub4_sub2_138_ = new Class59_Sub4_Sub2(class260, class185,
										i_113_, var18, var17, var19, (((MapRegion) this).aBool3658), var6, i_136_,
										bool);
								if (class59_sub4_sub2.method22(10869))
									class59_sub4_sub2.method19(class260, -12694);
								class59_sub4_137_ = class59_sub4_sub2_138_;
								class59_sub4 = class59_sub4_sub2;
								if (class59_sub4_sub2_138_.method22(10869))
									class59_sub4_sub2_138_.method19(class260, -12694);
							} else {
								class59_sub4 = new Class59_Sub4_Sub3(class260, class185, i_107_, i_113_, var18, var17,
										var19, (((MapRegion) this).aBool3658), var6, i_108_ + 4, i_109_);
								class59_sub4_137_ = new Class59_Sub4_Sub3(class260, class185, i_107_, i_113_, var18,
										var17, var19, (((MapRegion) this).aBool3658), var6, i_136_, i_109_);
							}
							Class246_Sub2.method1785(i_107_, var2, var3, class59_sub4, class59_sub4_137_);
							if (((((LocType) class185).occlude_type ^ 0xffffffff) == -2) && Class168.aBool2394
									&& !((MapRegion) this).aBool3658) {
								if ((i_108_ ^ 0xffffffff) != -1) {
									if ((i_108_ ^ 0xffffffff) != -2) {
										if (i_108_ == 2) {
											((MapRegion) this).tileLighting[i_107_][1 + var2][var3] = (byte) (Class236
													.method1523(
															(((MapRegion) this).tileLighting[i_107_][1 + var2][var3]),
															1));
											((MapRegion) this).tileLighting[i_107_][var2][var3] = (byte) (Class236
													.method1523((((MapRegion) this).tileLighting[i_107_][var2][var3]),
															2));
										} else if ((i_108_ ^ 0xffffffff) == -4) {
											((MapRegion) this).tileLighting[i_107_][var2][var3] = (byte) (Class236
													.method1523((((MapRegion) this).tileLighting[i_107_][var2][var3]),
															2));
											((MapRegion) this).tileLighting[i_107_][var2][var3] = (byte) (Class236
													.method1523((((MapRegion) this).tileLighting[i_107_][var2][var3]),
															1));
										}
									} else {
										((MapRegion) this).tileLighting[i_107_][var2][1
												+ var3] = (byte) (Class236.method1523(
														(((MapRegion) this).tileLighting[i_107_][var2][1 + var3]), 2));
										((MapRegion) this).tileLighting[i_107_][1 + var2][var3] = (byte) (Class236
												.method1523((((MapRegion) this).tileLighting[i_107_][1 + var2][var3]),
														1));
									}
								} else {
									((MapRegion) this).tileLighting[i_107_][var2][var3] = (byte) (Class236
											.method1523((((MapRegion) this).tileLighting[i_107_][var2][var3]), 1));
									((MapRegion) this).tileLighting[i_107_][var2][var3 + 1] = (byte) (Class236
											.method1523((((MapRegion) this).tileLighting[i_107_][var2][var3 + 1]), 2));
								}
							}
							if (((LocType) class185).interact_type != 0 && class199 != null)
								class199.method1318(var3, ((LocType) class185).blocks_projectile, var2, 268435456,
										i_108_, !((LocType) class185).hollow, var6);
							if (((LocType) class185).decor_displacement != 16)
								OverlayLoader.method1152(i_107_, var2, var3, (((LocType) class185).decor_displacement));
						} else if ((var6 ^ 0xffffffff) == -4) {
							Class59_Sub4 class59_sub4;
							if (bool_124_) {
								Class59_Sub4_Sub2 class59_sub4_sub2 = new Class59_Sub4_Sub2(class260, class185, i_113_,
										var18, var17, var19, (((MapRegion) this).aBool3658), var6, i_108_, bool);
								if (class59_sub4_sub2.method22(10869))
									class59_sub4_sub2.method19(class260, -12694);
								class59_sub4 = class59_sub4_sub2;
							} else
								class59_sub4 = new Class59_Sub4_Sub3(class260, class185, i_107_, i_113_, var18, var17,
										var19, (((MapRegion) this).aBool3658), var6, i_108_, i_109_);
							Class59_Sub4 class59_sub4_139_ = Class246_Sub22.method2082(i_107_, var2, var3);
							if (class59_sub4_139_ instanceof Class59_Sub4_Sub1)
								((Class59_Sub4_Sub1) (Class59_Sub4_Sub1) class59_sub4_139_).aClass59_Sub4_6317 = class59_sub4;
							else
								Class246_Sub2.method1785(i_107_, var2, var3, class59_sub4, null);
							if (((LocType) class185).shadow && Class168.aBool2394) {
								if ((i_108_ ^ 0xffffffff) != -1) {
									if (i_108_ != 1) {
										if (i_108_ != 2) {
											if (i_108_ == 3)
												var16.i(var2, var3, 50);
										} else
											var16.i(1 + var2, var3, 50);
									} else
										var16.i(var2 + 1, 1 + var3, 50);
								} else
									var16.i(var2, 1 + var3, 50);
							}
							if (((((LocType) class185).interact_type ^ 0xffffffff) != -1) && class199 != null)
								class199.method1318(var3, ((LocType) class185).blocks_projectile, var2, 268435456,
										i_108_, !((LocType) class185).hollow, var6);
						} else if (var6 == 9) {
							Class59_Sub3 class59_sub3;
							if (!bool_124_)
								class59_sub3 = (new Class59_Sub3_Sub3(class260, class185, i_107_, i_113_, var18,
										var17, var19, ((MapRegion) this).aBool3658, var2, var2 + (var10 - 1), var3,
										-1 + (var3 + var11), var6, i_108_, i_109_));
							else {
								Class59_Sub3_Sub4 class59_sub3_sub4 = (new Class59_Sub3_Sub4(class260, class185, i_107_,
										i_113_, var18, var17, var19, ((MapRegion) this).aBool3658, var2, var2, var3,
										var3, var6, i_108_, bool));
								class59_sub3 = class59_sub3_sub4;
								if (class59_sub3_sub4.method22(10869))
									class59_sub3_sub4.method19(class260, -12694);
							}
							Class59_Sub3 class59_sub3_140_ = (Class17.method168(i_107_, var2, var3,
									(aClass5582 != null ? aClass5582
											: (aClass5582 = Client.getClassByName("Class_f")))));
							if (class59_sub3_140_ instanceof Class59_Sub3_Sub1
									&& ((((Class59_Sub3) class59_sub3_140_).aShort5057) ^ 0xffffffff) == (var2
											^ 0xffffffff)
									&& ((((Class59_Sub3) class59_sub3_140_).aShort5064) ^ 0xffffffff) == (var3
											^ 0xffffffff))
								((Class59_Sub3_Sub1) (Class59_Sub3_Sub1) class59_sub3_140_).aClass59_Sub3_5732 = class59_sub3;
							else
								Class176.method1156(class59_sub3, false);
							if (((((LocType) class185).interact_type ^ 0xffffffff) != -1) && class199 != null)
								class199.method1314(var10, (((LocType) class185).blocks_projectile), 16624, var11,
										!(((LocType) class185).hollow), var2, var3);
							if ((((LocType) class185).decor_displacement ^ 0xffffffff) != -17)
								OverlayLoader.method1152(i_107_, var2, var3, (((LocType) class185).decor_displacement));
						} else if (var6 == 4) {
							Class59_Sub2 class59_sub2;
							if (bool_124_) {
								Class59_Sub2_Sub1 class59_sub2_sub1 = new Class59_Sub2_Sub1(class260, class185, i_113_,
										var18, var17, var19, (((MapRegion) this).aBool3658), 0, 0, 0, var6,
										i_108_);
								if (class59_sub2_sub1.method22(10869))
									class59_sub2_sub1.method19(class260, -12694);
								class59_sub2 = class59_sub2_sub1;
							} else
								class59_sub2 = new Class59_Sub2_Sub3(class260, class185, i_107_, i_113_, var18, var17,
										var19, (((MapRegion) this).aBool3658), 0, 0, 0, var6, i_108_, i_109_);
							Class59_Sub2 class59_sub2_141_ = Class31.method236(i_107_, var2, var3);
							if (!(class59_sub2_141_ instanceof Class59_Sub2_Sub2))
								Class41.method285(i_107_, var2, var3, class59_sub2, null);
							else
								((Class59_Sub2_Sub2) (Class59_Sub2_Sub2) class59_sub2_141_).aClass59_Sub2_6009 = class59_sub2;
						} else if (var6 == 5) {
							int i_142_ = 17;
							Class_f class_f = ((Class_f) Class246_Sub22.method2082(i_107_, var2, var3));
							if (class_f != null)
								i_142_ = ((LocType) (Class143.aClass251_2067.list(class_f.method21(true), 0,
										revision))).decor_displacement + 1;
							Class59_Sub2 class59_sub2;
							if (bool_124_) {
								Class59_Sub2_Sub1 class59_sub2_sub1 = (new Class59_Sub2_Sub1(class260, class185, i_113_,
										var18, var17, var19, ((MapRegion) this).aBool3658, 0,
										(Class59_Sub3_Sub2.anIntArray5878[i_108_]) * i_142_,
										(i_142_ * Class189.anIntArray2673[i_108_]), var6, i_108_));
								if (class59_sub2_sub1.method22(10869))
									class59_sub2_sub1.method19(class260, -12694);
								class59_sub2 = class59_sub2_sub1;
							} else
								class59_sub2 = (new Class59_Sub2_Sub3(class260, class185, i_107_, i_113_, var18,
										var17, var19, ((MapRegion) this).aBool3658, 0,
										(Class59_Sub3_Sub2.anIntArray5878[i_108_]) * i_142_,
										(i_142_ * Class189.anIntArray2673[i_108_]), var6, i_108_, i_109_));
							Class59_Sub2 class59_sub2_143_ = Class31.method236(i_107_, var2, var3);
							if (!(class59_sub2_143_ instanceof Class59_Sub2_Sub2))
								Class41.method285(i_107_, var2, var3, class59_sub2, null);
							else
								((Class59_Sub2_Sub2) (Class59_Sub2_Sub2) class59_sub2_143_).aClass59_Sub2_6009 = class59_sub2;
						} else if (var6 == 6) {
							int i_144_ = 9;
							Class_f class_f = ((Class_f) Class246_Sub22.method2082(i_107_, var2, var3));
							if (class_f != null)
								i_144_ = 1 + ((LocType) (Class143.aClass251_2067.list(class_f.method21(true), 0,
										revision))).decor_displacement / 2;
							Class59_Sub2 class59_sub2;
							if (bool_124_) {
								Class59_Sub2_Sub1 class59_sub2_sub1 = (new Class59_Sub2_Sub1(class260, class185, i_113_,
										var18, var17, var19, ((MapRegion) this).aBool3658, i_108_,
										(Class59_Sub3_Sub2.anIntArray5878[i_108_]) * i_144_,
										(Class189.anIntArray2673[i_108_] * i_144_), var6, 4 + i_108_));
								class59_sub2 = class59_sub2_sub1;
								if (class59_sub2_sub1.method22(10869))
									class59_sub2_sub1.method19(class260, -12694);
							} else
								class59_sub2 = (new Class59_Sub2_Sub3(class260, class185, i_107_, i_113_, var18,
										var17, var19, ((MapRegion) this).aBool3658, i_108_,
										i_144_ * (Class246_Sub37_Sub1.anIntArray5936[i_108_]),
										i_144_ * Class59.anIntArray822[i_108_], var6, i_108_ + 4, i_109_));
							Class59_Sub2 class59_sub2_145_ = Class31.method236(i_107_, var2, var3);
							if (class59_sub2_145_ instanceof Class59_Sub2_Sub2)
								((Class59_Sub2_Sub2) (Class59_Sub2_Sub2) class59_sub2_145_).aClass59_Sub2_6009 = class59_sub2;
							else
								Class41.method285(i_107_, var2, var3, class59_sub2, null);
						} else if ((var6 ^ 0xffffffff) == -8) {
							int i_146_ = 0x3 & 2 + i_108_;
							Class59_Sub2 class59_sub2;
							if (!bool_124_)
								class59_sub2 = new Class59_Sub2_Sub3(class260, class185, i_107_, i_113_, var18, var17,
										var19, (((MapRegion) this).aBool3658), i_146_, 0, 0, var6, 4 + i_146_,
										i_109_);
							else {
								Class59_Sub2_Sub1 class59_sub2_sub1 = new Class59_Sub2_Sub1(class260, class185, i_113_,
										var18, var17, var19, (((MapRegion) this).aBool3658), i_146_, 0, 0, var6,
										i_146_ + 4);
								class59_sub2 = class59_sub2_sub1;
								if (class59_sub2_sub1.method22(10869))
									class59_sub2_sub1.method19(class260, -12694);
							}
							Class59_Sub2 class59_sub2_147_ = Class31.method236(i_107_, var2, var3);
							if (!(class59_sub2_147_ instanceof Class59_Sub2_Sub2))
								Class41.method285(i_107_, var2, var3, class59_sub2, null);
							else
								((Class59_Sub2_Sub2) (Class59_Sub2_Sub2) class59_sub2_147_).aClass59_Sub2_6009 = class59_sub2;
						} else if (var6 == 8) {
							int i_148_ = i_108_ + 2 & 0x3;
							int i_149_ = 9;
							Class_f class_f = ((Class_f) Class246_Sub22.method2082(i_107_, var2, var3));
							if (class_f != null)
								i_149_ = ((LocType) (Class143.aClass251_2067.list(class_f.method21(true), 0,
										revision))).decor_displacement / 2 + 1;
							Class59_Sub2 class59_sub2;
							Class59_Sub2 class59_sub2_150_;
							if (!bool_124_) {
								Class59_Sub2_Sub3 class59_sub2_sub3 = (new Class59_Sub2_Sub3(class260, class185, i_107_,
										i_113_, var18, var17, var19, ((MapRegion) this).aBool3658, i_108_,
										(Class246_Sub37_Sub1.anIntArray5936[i_108_]) * i_149_,
										Class59.anIntArray822[i_108_] * i_149_, var6, i_108_ + 4, i_109_));
								Class59_Sub2_Sub3 class59_sub2_sub3_151_ = (new Class59_Sub2_Sub3(class260, class185,
										i_107_, i_113_, var18, var17, var19, ((MapRegion) this).aBool3658, i_108_, 0,
										0, var6, i_148_ + 4, i_109_));
								class59_sub2_150_ = class59_sub2_sub3;
								class59_sub2 = class59_sub2_sub3_151_;
							} else {
								Class59_Sub2_Sub1 class59_sub2_sub1 = (new Class59_Sub2_Sub1(class260, class185, i_113_,
										var18, var17, var19, ((MapRegion) this).aBool3658, i_108_,
										i_149_ * (Class246_Sub37_Sub1.anIntArray5936[i_108_]),
										Class59.anIntArray822[i_108_] * i_149_, var6, i_108_ + 4));
								Class59_Sub2_Sub1 class59_sub2_sub1_152_ = new Class59_Sub2_Sub1(class260, class185,
										i_113_, var18, var17, var19, (((MapRegion) this).aBool3658), i_108_, 0, 0,
										var6, i_148_ + 4);
								if (class59_sub2_sub1.method22(10869))
									class59_sub2_sub1.method19(class260, -12694);
								class59_sub2 = class59_sub2_sub1_152_;
								if (class59_sub2_sub1_152_.method22(10869))
									class59_sub2_sub1_152_.method19(class260, -12694);
								class59_sub2_150_ = class59_sub2_sub1;
							}
							Class41.method285(i_107_, var2, var3, class59_sub2_150_, class59_sub2);
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static final Class12[] method2342(boolean bool) {
		try {
			anInt5572++;
			if (bool != true)
				anInt5573 = -81;
			return (new Class12[] { Class246_Sub30.SEND_PROJECTILE, Class233.aClass12_3185, Class81.aClass12_1066,
					StructLoader.aClass12_809, Class96.aClass12_1256, SubIncomingPacket.SOME_PACKET,
					Class16.aClass12_238, Class169.SOME_PACKET_3, Material.REMOVE_GROUND_ITEM,
					Class228.DESTROY_WORLD_OBJECT, Class71.SEND_GROUND_ITEM, Class18.aClass12_259,
					Class78.SEND_WORLD_OBJECT, Class247.aClass12_3482, SubIncomingPacket.aClass12_7094 });
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wn.T(" + bool + ')');
		}
	}

	Class255_Sub1(int i, int i_153_, int i_154_, boolean bool) {
		super(i, i_153_, i_154_, bool, Class82.underlay_loader, ContextMenus.overlay_loader);
	}

	final void method2343(int i, SceneGraph class260) {
		try {
			anInt5576++;
			Class21_Sub4.method2132(class260);
			if ((((MapRegion) this).anInt3670 ^ 0xffffffff) < -2) {
				for (int i_155_ = 0; ((((MapRegion) this).regionSizeX ^ 0xffffffff) < (i_155_
						^ 0xffffffff)); i_155_++) {
					for (int i_156_ = 0; ((((MapRegion) this).regionSizeY ^ 0xffffffff) < (i_156_
							^ 0xffffffff)); i_156_++) {
						if ((0x2 & (Class45.tileRenderFlags[1][i_155_][i_156_])) == 2)
							Class228.method1457(i_155_, i_156_);
					}
				}
			}
			int i_157_ = -115 / ((42 - i) / 46);
			for (int i_158_ = 0; ((i_158_ ^ 0xffffffff) > (((MapRegion) this).anInt3670 ^ 0xffffffff)); i_158_++) {
				for (int i_159_ = 0; i_159_ <= ((MapRegion) this).regionSizeY; i_159_++) {
					for (int i_160_ = 0; ((((MapRegion) this).regionSizeX ^ 0xffffffff) <= (i_160_
							^ 0xffffffff)); i_160_++) {
						if ((0x1 & (((MapRegion) this).tileLighting[i_158_][i_160_][i_159_]) ^ 0xffffffff) != -1) {
							int i_161_ = i_159_;
							int i_162_ = i_159_;
							int i_163_ = i_158_;
							for (/**/; ((((MapRegion) this).regionSizeY ^ 0xffffffff) < (i_162_
									^ 0xffffffff)); i_162_++) {
								if ((0x1 & (((MapRegion) this).tileLighting[i_158_][i_160_][i_162_ + 1])) == 0)
									break;
							}
							for (/**/; ((i_161_ ^ 0xffffffff) < -1
									&& ((((MapRegion) this).tileLighting[i_158_][i_160_][-1 + i_161_])
											& 0x1) != 0); i_161_--) {
								/* empty */
							}
							int i_164_ = i_158_;
							while_151_: for (/**/; (i_163_ ^ 0xffffffff) < -1; i_163_--) {
								for (int i_165_ = i_161_; i_162_ >= i_165_; i_165_++) {
									if (((((MapRegion) this).tileLighting[-1 + i_163_][i_160_][i_165_]) & 0x1) == 0)
										break while_151_;
								}
							}
							while_152_: for (/**/; i_164_ < 3; i_164_++) {
								for (int i_166_ = i_161_; i_162_ >= i_166_; i_166_++) {
									if ((0x1 & (((MapRegion) this).tileLighting[i_164_ + 1][i_160_][i_166_])) == 0)
										break while_152_;
								}
							}
							int i_167_ = ((1 + i_162_ - i_161_) * (-i_163_ + (1 + i_164_)));
							if ((i_167_ ^ 0xffffffff) <= -3) {
								int i_168_ = 240;
								int i_169_ = ((((MapRegion) this).tileHeights[i_164_][i_160_][i_161_]) - i_168_);
								int i_170_ = (((MapRegion) this).tileHeights[i_163_][i_160_][i_161_]);
								Class24.method206(1, i_160_ << 7, i_160_ << 7, i_161_ << 7, (i_162_ << 7) + 128, i_169_,
										i_170_);
								for (int i_171_ = i_163_; ((i_164_ ^ 0xffffffff) <= (i_171_ ^ 0xffffffff)); i_171_++) {
									for (int i_172_ = i_161_; i_172_ <= i_162_; i_172_++)
										((MapRegion) this).tileLighting[i_171_][i_160_][i_172_] = (byte) (PacketsDecoder
												.method184((((MapRegion) this).tileLighting[i_171_][i_160_][i_172_]),
														-2));
								}
							}
						}
						if (((((MapRegion) this).tileLighting[i_158_][i_160_][i_159_]) & 0x2) != 0) {
							int i_173_ = i_160_;
							int i_174_ = i_160_;
							int i_175_ = i_158_;
							for (/**/; i_174_ < ((MapRegion) this).regionSizeX; i_174_++) {
								if (((((MapRegion) this).tileLighting[i_158_][1 + i_174_][i_159_]) & 0x2
										^ 0xffffffff) == -1)
									break;
							}
							for (/**/; ((i_173_ ^ 0xffffffff) < -1
									&& ((((MapRegion) this).tileLighting[i_158_][-1 + i_173_][i_159_]) & 0x2
											^ 0xffffffff) != -1); i_173_--) {
								/* empty */
							}
							int i_176_ = i_158_;
							while_153_: for (/**/; i_175_ > 0; i_175_--) {
								for (int i_177_ = i_173_; i_177_ <= i_174_; i_177_++) {
									if ((0x2 & (((MapRegion) this).tileLighting[i_175_ - 1][i_177_][i_159_])
											^ 0xffffffff) == -1)
										break while_153_;
								}
							}
							while_154_: for (/**/; (i_176_ ^ 0xffffffff) > -4; i_176_++) {
								for (int i_178_ = i_173_; ((i_178_ ^ 0xffffffff) >= (i_174_ ^ 0xffffffff)); i_178_++) {
									if (((((MapRegion) this).tileLighting[i_176_ + 1][i_178_][i_159_]) & 0x2) == 0)
										break while_154_;
								}
							}
							int i_179_ = ((-i_175_ + (1 + i_176_)) * (-i_173_ + i_174_ + 1));
							if ((i_179_ ^ 0xffffffff) <= -3) {
								int i_180_ = 240;
								int i_181_ = ((((MapRegion) this).tileHeights[i_176_][i_173_][i_159_]) - i_180_);
								int i_182_ = (((MapRegion) this).tileHeights[i_175_][i_173_][i_159_]);
								Class24.method206(2, i_173_ << 7, (i_174_ << 7) + 128, i_159_ << 7, i_159_ << 7, i_181_,
										i_182_);
								for (int i_183_ = i_175_; i_176_ >= i_183_; i_183_++) {
									for (int i_184_ = i_173_; i_174_ >= i_184_; i_184_++)
										((MapRegion) this).tileLighting[i_183_][i_184_][i_159_] = (byte) (PacketsDecoder
												.method184((((MapRegion) this).tileLighting[i_183_][i_184_][i_159_]),
														-3));
								}
							}
						}
						if ((0x4 & (((MapRegion) this).tileLighting[i_158_][i_160_][i_159_])) != 0) {
							int i_185_ = i_160_;
							int i_186_ = i_160_;
							int i_187_;
							for (i_187_ = i_159_; ((i_187_ ^ 0xffffffff) < -1
									&& ((((MapRegion) this).tileLighting[i_158_][i_160_][-1 + i_187_])
											& 0x4) != 0); i_187_--) {
								/* empty */
							}
							int i_188_;
							for (i_188_ = i_159_; ((i_188_ ^ 0xffffffff) > (((MapRegion) this).regionSizeY
									^ 0xffffffff)); i_188_++) {
								if ((0x4 & (((MapRegion) this).tileLighting[i_158_][i_160_][1 + i_188_])) == 0)
									break;
							}
							while_155_: for (/**/; i_185_ > 0; i_185_--) {
								for (int i_189_ = i_187_; i_188_ >= i_189_; i_189_++) {
									if (((((MapRegion) this).tileLighting[i_158_][i_185_ - 1][i_189_]) & 0x4
											^ 0xffffffff) == -1)
										break while_155_;
								}
							}
							while_156_: for (/**/; ((i_186_ ^ 0xffffffff) > (((MapRegion) this).regionSizeX
									^ 0xffffffff)); i_186_++) {
								for (int i_190_ = i_187_; i_188_ >= i_190_; i_190_++) {
									if (((((MapRegion) this).tileLighting[i_158_][i_186_ + 1][i_190_]) & 0x4) == 0)
										break while_156_;
								}
							}
							if (((i_188_ - i_187_ + 1) * (-i_185_ + (i_186_ + 1)) ^ 0xffffffff) <= -5) {
								int i_191_ = (((MapRegion) this).tileHeights[i_158_][i_185_][i_187_]);
								Class24.method206(4, i_185_ << 7, 128 + (i_186_ << 7), i_187_ << 7, 128 + (i_188_ << 7),
										i_191_, i_191_);
								for (int i_192_ = i_185_; ((i_186_ ^ 0xffffffff) <= (i_192_ ^ 0xffffffff)); i_192_++) {
									for (int i_193_ = i_187_; i_193_ <= i_188_; i_193_++)
										((MapRegion) this).tileLighting[i_158_][i_192_][i_193_] = (byte) (PacketsDecoder
												.method184((((MapRegion) this).tileLighting[i_158_][i_192_][i_193_]),
														-5));
								}
							}
						}
					}
				}
			}
			((MapRegion) this).tileLighting = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wn.O(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}
}
