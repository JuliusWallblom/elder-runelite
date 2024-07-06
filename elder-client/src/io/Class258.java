package io;

final class Class258 {
	static int anInt3691;
	Class246_Sub37_Sub3 aClass246_Sub37_Sub3_3692;
	Class246_Sub9 aClass246_Sub9_3693;
	Class246_Sub3_Sub1 aClass246_Sub3_Sub1_3694;
	int anInt3695;
	Class229 aClass229_3696;
	int anInt3697;
	static int anInt3698;
	static int anInt3699;
	int anInt3700;
	int anInt3701;
	byte aByte3702;
	int anInt3703;
	static int anInt3704;
	static int anInt3705;
	static int anInt3706;

	static final void draw_minimap(Widget widget, int i, int i_0_, int i_1_, SceneGraph class260) {
		do {
			try {
				anInt3705++;
				Class128 class128 = widget.method1514(0, class260);
				if (i_0_ > -14)
					anInt3699 = 31;
				if (class128 != null) {
					class260.OA(i, i_1_, i - -((Widget) widget).screen_width, ((Widget) widget).screen_height + i_1_);
					if (Class246_Sub28_Sub13.anInt6293 == 2 || (Class246_Sub28_Sub13.anInt6293 ^ 0xffffffff) == -6
							|| Class123.aClass_l1710 == null) {
						class260.ca(-16777216, class128, i, i_1_);
					} else {
						int i_2_;
						int i_3_;
						int i_4_;
						int i_5_;
						if (Class130_Sub3.anInt4417 != 4) {
							i_3_ = (((Class59_Sub3) Client.local_player).y);
							i_2_ = 4096 - Class246_Sub12.anInt4405 * 16;
							i_5_ = (((Class59_Sub3) Client.local_player).x);
							i_4_ = 0x3fff & ((int) -Camera.camera_yaw - -Class95.anInt1253);
						} else {
							i_2_ = 4096;
							i_3_ = Class246_Sub43.anInt5606;
							i_4_ = (int) -Camera.camera_yaw & 0x3fff;
							i_5_ = Class242.anInt3424;
						}
						int i_6_ = (208 - 2 * Class38_Sub1_Sub1.anInt6770 + (i_5_ / 32 + 48));
						int i_7_ = (208 + -(2 * Class152.anInt2205) + (-(i_3_ / 32) + 48) - -(4 * Class152.anInt2205));
						Class123.aClass_l1710.method733(((float) i + (float) ((Widget) widget).screen_width / 2.0F),
								((float) i_1_ + (float) ((Widget) widget).screen_height / 2.0F), (float) i_6_,
								(float) i_7_,
								i_2_, i_4_ << 2, class128, i, i_1_);
						for (SwitchInt class246_sub33 = ((SwitchInt) Class97.aClass166_1260.method1104(
								71)); class246_sub33 != null; class246_sub33 = ((SwitchInt) Class97.aClass166_1260
										.method1108((byte) -112))) {
							int i_8_ = ((SwitchInt) class246_sub33).value;
							int i_9_ = (-Client.base_x
									+ ((((Class178) ScriptEvent.aClass178_4966).anIntArray2505[i_8_]) >> 14 & 0x3fff));
							int i_10_ = (-Client.base_y
									+ (0x3fff & (((Class178) ScriptEvent.aClass178_4966).anIntArray2505[i_8_])));
							int i_11_ = -(i_5_ / 32) + (2 + i_9_ * 4);
							int i_12_ = -(i_3_ / 32) + 2 + 4 * i_10_;
							Class59_Sub3_Sub1.method2440(i_11_, -14698, class260,
									(((Class178) ScriptEvent.aClass178_4966).anIntArray2499[i_8_]), widget, i_12_,
									class128, i, i_1_);
						}

						// Draw map functions
						MapFunctions.draw(i, i_1_, i_3_, i_5_, class260, widget, class128);

						// Draw red item dots.
						for (Class246_Sub13 class246_sub13 = (Class246_Sub13) Class251.aClass85_3551.first(
								(byte) -23); class246_sub13 != null; class246_sub13 = ((Class246_Sub13) Class251.aClass85_3551
										.next((byte) -20))) {
							int i_16_ = (int) ((((Node) class246_sub13).hash >> 28) & 0x3L);
							if ((Class211_Sub1.anInt5343 ^ 0xffffffff) == (i_16_ ^ 0xffffffff)) {
								int i_17_ = (-(i_5_ / 32) + (2 + (int) ((((Node) class246_sub13).hash) & 0x3fffL) * 4));
								int i_18_ = (-(i_3_ / 32) + 2
										+ 4 * (int) ((((Node) class246_sub13).hash) >> 14 & 0x3fffL));
								NpcType.method1635(i, true, (Class66.aClass_lArray882[0]), widget, class128, i_18_,
										i_17_, i_1_);
							}
						}

						// Draw yellow NPC dots.
						for (int i_19_ = 0; ((Class5.anInt55 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++) {
							Npc class_r_sub2 = (VarcLoader.aClass_r_Sub2Array1002[(Class246_Sub28_Sub29.anIntArray6815[i_19_])]);
							if (class_r_sub2 != null && class_r_sub2.method2930(104)
									&& (((Class59_Sub3) class_r_sub2).current_plane == (((Class59_Sub3) Client.local_player).current_plane))) {
								NpcType class253 = (((Npc) class_r_sub2).aClass253_7184);
								if (class253 != null && (((NpcType) class253).childrenIDs != null))
									class253 = (class253.method1624(false, (Varbit.aClass95_6658)));
								if (class253 != null && ((NpcType) class253).drawMinimapDot
										&& ((NpcType) class253).aBool3596) {
									int i_20_ = ((((Class59_Sub3) class_r_sub2).x) / 32 - i_5_ / 32);
									int i_21_ = ((((Class59_Sub3) class_r_sub2).y) / 32 + -(i_3_ / 32));
									if (((NpcType) class253).f_ub == -1)
										NpcType.method1635(i, true, (Class66.aClass_lArray882[1]), widget, class128,
												i_21_, i_20_, i_1_);
									else
										Class59_Sub3_Sub1.method2440(i_20_, -14698, class260, ((NpcType) class253).f_ub,
												widget, i_21_, class128, i, i_1_);
								}
							}
						}
						int i_22_ = Class246_Sub4.anInt3869;
						int[] is = Class53.anIntArray755;
						for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
							Player class_r_sub1 = Class143.players[is[i_23_]];
							if (class_r_sub1 != null && class_r_sub1.method2912(52)
									&& class_r_sub1 != Client.local_player
									&& ((((Class59_Sub3) Client.local_player).current_plane
											^ 0xffffffff) == (((Class59_Sub3) class_r_sub1).current_plane
													^ 0xffffffff))) {
								int i_24_ = (-(i_5_ / 32) + (((Class59_Sub3) class_r_sub1).x) / 32);
								int i_25_ = (-(i_3_ / 32) + (((Class59_Sub3) class_r_sub1).y) / 32);
								boolean bool = false;
								for (int i_26_ = 0; i_26_ < Client.anInt3969; i_26_++) {
									if (((Player) class_r_sub1).aString7140.equals(Model.f_gb[i_26_])
											&& (Class40.anIntArray615[i_26_] ^ 0xffffffff) != -1) {
										bool = true;
										break;
									}
								}
								boolean bool_27_ = false;
								for (int i_28_ = 0; i_28_ < Clan.clanMembersAmount; i_28_++) {
									if (((Player) class_r_sub1).aString7140
											.equals(((Class9) (Clan.clanMembers[i_28_])).aString109)) {
										bool_27_ = true;
										break;
									}
								}
								boolean bool_29_ = false;
								if ((((Player) Client.local_player).anInt7138 ^ 0xffffffff) != -1
										&& (((Player) class_r_sub1).anInt7138 ^ 0xffffffff) != -1
										&& (((Player) class_r_sub1).anInt7138 == (((Player) Client.local_player).anInt7138)))
									bool_29_ = true;
								if (!((Player) class_r_sub1).aBool7129) {
									if (bool)
										NpcType.method1635(i, true, (Class66.aClass_lArray882[3]), widget, class128,
												i_25_, i_24_, i_1_);
									else if (!bool_27_) {
										if (bool_29_)
											NpcType.method1635(i, true, Class66.aClass_lArray882[4], widget, class128,
													i_25_, i_24_, i_1_);
										else
											NpcType.method1635(i, true, Class66.aClass_lArray882[2], widget, class128,
													i_25_, i_24_, i_1_);
									} else
										NpcType.method1635(i, true, (Class66.aClass_lArray882[5]), widget, class128,
												i_25_, i_24_, i_1_);
								} else
									NpcType.method1635(i, true, (Class66.aClass_lArray882[6]), widget, class128,
											i_25_, i_24_, i_1_);
							}
						}
						Class29[] class29s = Class166.aClass29Array2347;
						for (int i_30_ = 0; i_30_ < class29s.length; i_30_++) {
							Class29 class29 = class29s[i_30_];
							if (class29 != null && ((((Class29) class29).anInt391 ^ 0xffffffff) != -1)
									&& Client.cycle % 20 < 10) {
								if ((((Class29) class29).anInt391 ^ 0xffffffff) == -2
										&& (((Class29) class29).anInt384 ^ 0xffffffff) <= -1
										&& ((VarcLoader.aClass_r_Sub2Array1002.length
												^ 0xffffffff) < (((Class29) class29).anInt384 ^ 0xffffffff))) {
									Npc class_r_sub2 = (VarcLoader.aClass_r_Sub2Array1002[((Class29) class29).anInt384]);
									if (class_r_sub2 != null) {
										int i_31_ = ((((Class59_Sub3) class_r_sub2).x) / 32 + -(i_5_ / 32));
										int i_32_ = (-(i_3_ / 32) + (((Class59_Sub3) class_r_sub2).y) / 32);
										Class232.method1483(widget, class128, i_31_, i, ((Class29) class29).anInt385,
												256, i_1_, i_32_, 360000L);
									}
								}
								if ((((Class29) class29).anInt391 ^ 0xffffffff) == -3) {
									int i_33_ = (-(i_5_ / 32) + (((Class29) class29).anInt392 / 32));
									int i_34_ = (((Class29) class29).anInt394 / 32 - i_3_ / 32);
									long l = (long) (((Class29) class29).anInt389 << 5);
									l *= l;
									Class232.method1483(widget, class128, i_33_, i, (((Class29) class29).anInt385),
											256, i_1_, i_34_, l);
								}
								if ((((Class29) class29).anInt391 ^ 0xffffffff) == -11
										&& ((Class29) class29).anInt384 >= 0
										&& (Class143.players.length > ((Class29) class29).anInt384)) {
									Player class_r_sub1 = (Class143.players[((Class29) class29).anInt384]);
									if (class_r_sub1 != null) {
										int i_35_ = (-(i_5_ / 32) + (((Class59_Sub3) class_r_sub1).x) / 32);
										int i_36_ = (-(i_3_ / 32) + (((Class59_Sub3) class_r_sub1).y) / 32);
										Class232.method1483(widget, class128, i_35_, i, ((Class29) class29).anInt385,
												256, i_1_, i_36_, 360000L);
									}
								}
							}
						}
						if (Class130_Sub3.anInt4417 == 4)
							break;
						if ((Class188.anInt2658 ^ 0xffffffff) != -1) {
							int i_37_ = (-(i_5_ / 32) + (4 * Class188.anInt2658
									+ (2 - -(2 * Client.local_player.method2670((byte) 127))) - 2));
							int i_38_ = (-(i_3_ / 32) + (2 + (Class34.anInt451 * 4
									+ 2 * (Client.local_player.method2670((byte) 127) - 1))));
							NpcType.method1635(i, true, (Class40_Sub7.aClass_lArray5179[Class193.aBool2712 ? 1 : 0]),
									widget, class128, i_38_, i_37_, i_1_);
						}

						// Draw white local-player dot.
						class260.method1734(i - (-(((Widget) widget).screen_width / 2) + 1), 3,
								(((Widget) widget).screen_height / 2 + i_1_ - 1), (byte) 58, -1, 3);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	static final int method1671(int i, boolean bool) {
		try {
			anInt3706++;
			if (bool != true)
				Client.get_frame_mode((byte) 124);
			int i_39_ = (i * i >> 12) * i >> 12;
			int i_40_ = 6 * i - 61440;
			int i_41_ = (i_40_ * i >> 12) + 40960;
			return i_41_ * i_39_ >> 12;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wq.B(" + i + ',' + bool + ')');
		}
	}

	static final void method1672(int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		try {
			RenderAnimation.method918(i_45_, -25, i_44_, i_42_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_43_++]));
			anInt3698++;
			RenderAnimation.method918(i_45_, 120, i_44_, i_42_, Class246_Sub28_Sub6.anIntArrayArray6042[i--]);
			int i_47_ = 75 % ((i_46_ + 21) / 33);
			for (int i_48_ = i_43_; i_48_ <= i; i_48_++) {
				int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_48_];
				is[i_45_] = is[i_42_] = i_44_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wq.A(" + i + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + i_45_ + ',' + i_46_ + ')'));
		}
	}

	Class258(byte i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_) {
		try {
			((Class258) this).anInt3695 = i_51_;
			((Class258) this).anInt3703 = i_50_;
			((Class258) this).anInt3697 = i_52_;
			((Class258) this).anInt3700 = i_49_;
			((Class258) this).anInt3701 = i_53_;
			((Class258) this).aByte3702 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wq.<init>(" + i + ',' + i_49_ + ',' + i_50_ + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ')'));
		}
	}
}
