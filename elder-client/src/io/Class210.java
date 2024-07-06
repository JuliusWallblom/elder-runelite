package io;

import io.cache.Cache;
import io.cache.IndexConstants;
import io.cache.Revision;

public abstract class Class210 {

	int anInt2950;
	static int anInt2951;
	int anInt2952;
	static int anInt2953;
	static int anInt2954;
	int anInt2955;
	int anInt2956;
	static int anInt2957;

	abstract int l(int var1, int var2);

	abstract Class246_Sub1_Sub4 k(int var1, int var2, Class246_Sub1_Sub4 var3);

	abstract void ca();

	abstract boolean method1377(Class246_Sub1_Sub4 var1, int var2, int var3, int var4, int var5, boolean var6);

	abstract void method1378(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8,
			int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, int var14, int var15, int var16,
			boolean var17);

	abstract int a(int var1, int var2);

	abstract void method1379(Class246_Sub41 var1, int[] var2);

	abstract void i(int var1, int var2, int var3);

	abstract void method1380(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

	static final void method1381(int var0, boolean var1, Player var2) {
		try {
			++anInt2951;
			if (~Class230.anInt3147 > -401) {
				int var3 = 67 / ((var0 - 17) / 56);
				if (Client.local_player == var2) {
					if (Class187.aBool2653 && ~(Node.anInt3469 & 16) != -1) {
						++Class59_Sub3_Sub3.anInt6276;
						Class259_Sub2_Sub1.method2846(8, (byte) -55, false, 0L, 0,
								Class246_Sub7.aString3964 + " -> <col=ffffff>"
										+ Player.aClass67_7125.get(Preferences.language_code),
								true, Class218.aString3026, 0, -1, Tile.anInt2148);
					}

				} else {
					String var4;
					int var8;
					if (var2.f_fd != 0) {
						var4 = var2.get_name(56, true) + " (" + Class66.aClass67_878.get(Preferences.language_code)
								+ var2.f_fd + ")";
					} else {
						boolean var5 = true;
						if (~Client.local_player.anInt7141 != 0 && ~var2.anInt7141 != 0) {
							int var6 = ~Client.local_player.f_qd < ~var2.f_qd ? Client.local_player.f_qd : var2.f_qd;
							int var7 = ~var2.anInt7141 < ~Client.local_player.anInt7141 ? Client.local_player.anInt7141
									: var2.anInt7141;
							var8 = 10 * var6 / 100 + 5 + var7;
							int var9 = -var2.f_qd + Client.local_player.f_qd;
							if (~var9 > -1) {
								var9 = -var9;
							}

							if (~var9 < ~var8) {
								var5 = false;
							}
						}

						String var11 = Class40_Sub6.aClass101_5092 != Class59_Sub4_Sub3.aClass101_6943
								? Class38_Sub1.aClass67_5105.get(Preferences.language_code)
								: NodeSub.aClass67_3748.get(Preferences.language_code);
						if (~var2.f_qd <= ~var2.f_bd) {
							var4 = var2.get_name(33, true)
									+ (var5 ? ClickMaskNode.method2122(Client.local_player.f_qd, true, var2.f_qd)
											: "<col=ffffff>")
									+ " (" + var11 + var2.f_qd + ")";
						} else {
							var4 = var2.get_name(-124, true)
									+ (var5 ? ClickMaskNode.method2122(Client.local_player.f_qd, true, var2.f_qd)
											: "<col=ffffff>")
									+ " (" + var11 + var2.f_qd + "+" + (-var2.f_qd + var2.f_bd) + ")";
						}
					}

					if (!Class187.aBool2653) {
						if (var1) {
							Class259_Sub2_Sub1.method2846(-1, (byte) -55, true, 0L, 0, "", false, "<col=cccccc>" + var4,
									0, 0, -1);
						} else {
							for (int var12 = 7; ~var12 <= -1; --var12) {
								if (Class191.aStringArray2682[var12] != null) {
									short var13 = 0;
									if (Class59_Sub4_Sub3.aClass101_6943 == Class246_Sub28_Sub16.aClass101_6394
											&& Class191.aStringArray2682[var12].equalsIgnoreCase(
													Class246_Sub11.aClass67_4107.get(Preferences.language_code))) {
										if (~var2.f_qd < ~Client.local_player.f_qd) {
											var13 = 2000;
										}

										if (~Client.local_player.anInt7138 != -1 && ~var2.anInt7138 != -1) {
											if (Client.local_player.anInt7138 != var2.anInt7138) {
												var13 = 0;
											} else {
												var13 = 2000;
											}
										}
									} else if (Class130_Sub4.aBoolArray4742[var12]) {
										var13 = 2000;
									}

									short var15 = (short) (var13 + Class106_Sub2.aShortArray5328[var12]);
									var8 = ~ClickMaskNode.anIntArray4903[var12] != 0
											? ClickMaskNode.anIntArray4903[var12]
											: Class109.anInt1568;
									Class259_Sub2_Sub1.method2846(var15, (byte) -55, false, (long) var2.f_db, 0,
											"<col=ffffff>" + var4, true, Class191.aStringArray2682[var12], 0, -1, var8);
									++Class130_Sub8.anInt5614;
								}
							}
						}
					} else if (!var1 && ~(Node.anInt3469 & 8) != -1) {
						Class259_Sub2_Sub1.method2846(46, (byte) -55, false, (long) var2.f_db, 0,
								Class246_Sub7.aString3964 + " -> <col=ffffff>" + var4, true, Class218.aString3026, 0,
								-1, Tile.anInt2148);
						++Class115.anInt1604;
					}

					if (!var1) {
						for (Class246_Sub35 var14 = (Class246_Sub35) Varbit.aClass166_1525
								.method1104(74); var14 != null; var14 = (Class246_Sub35) Varbit.aClass166_1525
										.method1108((byte) -112)) {
							if (var14.anInt5156 == 44) {
								var14.aString5152 = "<col=ffffff>" + var4;
								return;
							}
						}

					}
				}
			}
		} catch (RuntimeException var10) {
			throw Class193.method1272(var10,
					"ta.P(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method1382(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			++anInt2954;
			int var7 = Class246_Sub4.anInt3869;
			Class121.anInt1677 = 0;
			int[] var8 = Class53.anIntArray755;

			int var12;
			int var18;
			int color;
			int var26;
			Object var29;
			int var33;
			int var36;
			int var37;
			for (int var9 = 0; Class5.anInt55 + var7 > var9; ++var9) {
				NpcType var10 = null;
				Object entity;
				if (~var7 < ~var9) {
					entity = Class143.players[var8[var9]];
				} else {
					entity = VarcLoader.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[var9 + -var7]];
					var10 = ((Npc) entity).aClass253_7184;
					if (var10.childrenIDs != null) {
						var10 = var10.method1624(false, Varbit.aClass95_6658);
						if (var10 == null) {
							continue;
						}
					}
				}

				if (~((Entity) entity).anInt6431 <= -1 && (~((Entity) entity).anInt6453 == ~Class64_Sub1.anInt5236
						|| ~((Class59_Sub3) entity).current_plane == ~Client.local_player.current_plane)) {
					Class205.method1340(var0 >> 1, var2 ^ 10, var6 >> 1, var4, var1, ((Entity) entity).method2674(0),
							(Entity) entity);
					if (~Class257.anIntArray3689[0] <= -1) {
						if (((Entity) entity).aString6429 != null
								&& (~var9 <= ~var7 || ~Client.public_chat_mode == -1 || ~Client.public_chat_mode == -4
										|| Client.public_chat_mode == 1
												&& Class246_Sub1_Sub9.method2586(117, ((Player) entity).aString7140))
								&& VarcType.anInt3109 > Class121.anInt1677) {
							VarcType.anIntArray3101[Class121.anInt1677] = CacheIndex.aClass73_148.method459(-1,
									((Entity) entity).aString6429) / 2;
							VarcType.anIntArray3110[Class121.anInt1677] = Class257.anIntArray3689[0];
							VarcType.anIntArray3102[Class121.anInt1677] = Class257.anIntArray3689[1];
							VarcType.anIntArray3097[Class121.anInt1677] = ((Entity) entity).f_hc;
							VarcType.anIntArray3104[Class121.anInt1677] = ((Entity) entity).anInt6456;
							VarcType.anIntArray3111[Class121.anInt1677] = ((Entity) entity).anInt6471;
							VarcType.aStringArray3106[Class121.anInt1677] = ((Entity) entity).aString6429;
							++Class121.anInt1677;
						}

						var12 = Class257.anIntArray3689[1] + var3;
						Object var16;
						LDSprite[] var17;
						if (!((Entity) entity).aBool6441 && ~((Entity) entity).anInt6464 < ~Client.cycle) {
							boolean var13 = true;
							byte var14 = 1;
							if (var7 > var9) {
								Player var15 = Class143.players[var8[var9]];
								var26 = ((Entity) entity).get_render_sequence(-1, null).anInt1922;
								if (var15.aBool7129) {
									var14 = 2;
								}
							} else {
								var26 = var10.anInt3577;
								if (var26 == -1) {
									var26 = ((Entity) entity).get_render_sequence(var2 ^ -11, null).anInt1922;
								}
							}
							// draw hp bars
							Object var28 = Settings.osrs_hit_bars ? Class246_Sub28_Sub12.osrs_hit_bars
									: Class246_Sub28_Sub12.new_hit_bars;
							if (var26 != -1) {
								var16 = MapFunction.aClass54_2034.method379((long) var26, (byte) 58);
								if (var16 == null) {
									var17 = LDSprite.method129(Cache.get_index(Revision.PRE_EOC_634, "sprites"), var26,
											0);
									if (var17 != null) {
										var16 = new AbstractSprite[var17.length];

										for (var18 = 0; var18 < var17.length; ++var18) {
											((Object[]) var16)[var18] = Client.sprite_loader
													.ld_to_abstract_sprite(var17[var18], true);
										}

										MapFunction.aClass54_2034.method371(var2 - 9, (long) 0, var16);
									}
								}

								if (var16 != null && ~((Object[]) var16).length <= -3) {
									var28 = var16;
								}
							}

							if (var14 >= ((Object[]) var28).length) {
								var14 = 1;
							}

							var16 = ((Object[]) var28)[0];
							Object var35 = ((Object[]) var28)[var14];
							var12 -= Math.max(CacheIndex.aClass73_148.anInt951, ((AbstractSprite) var16).ma());
							var18 = Class257.anIntArray3689[0] + var5 - (((AbstractSprite) var16).la() >> 1);
							color = ((AbstractSprite) var16).la() * ((Entity) entity).anInt6432 / 255;
							if (~((Entity) entity).anInt6432 < -1 && color < 2) {
								color = 2;
							}

							((AbstractSprite) var16).draw_sprite(var18, var12);
							Client.sprite_loader.fa(var18, var12, var18 - -color,
									((AbstractSprite) var16).ma() + var12);
							((AbstractSprite) var35).draw_sprite(var18, var12);
							Client.sprite_loader.OA(var5, var3, var0 + var5, var3 + var6);
						} else {
							var12 -= Math.max(CacheIndex.aClass73_148.anInt951,
									Class246_Sub28_Sub12.new_hit_bars[0].ma());
						}

						var12 -= 2;
						if (!((Entity) entity).aBool6441) {
							if (Client.cycle < ((Entity) entity).f_bb) {
								Object var27 = Class233.aClass_lArray3188[!((Entity) entity).aBool6414 ? 0 : 2];
								var29 = Class233.aClass_lArray3188[!((Entity) entity).aBool6414 ? 1 : 3];
								boolean var30 = true;
								if (!(entity instanceof Npc)) {
									var33 = var10.render_emote;
								} else {
									var33 = var10.anInt3602;
									if (var33 == -1) {
										var33 = var10.render_emote;
									}
								}

								if (~var33 != 0) {
									var16 = Class246_Sub41_Sub2.aClass54_6474.method379((long) var33, (byte) 58);
									if (var16 == null) {
										var17 = LDSprite.method129(Cache.get_index(Revision.PRE_EOC_634, "sprites"),
												var33, 0);
										if (var17 != null) {
											var16 = new AbstractSprite[var17.length];

											for (var18 = 0; ~var18 > ~var17.length; ++var18) {
												((Object[]) var16)[var18] = Client.sprite_loader
														.ld_to_abstract_sprite(var17[var18], true);
											}

											Class246_Sub41_Sub2.aClass54_6474.method371(var2 - 9, (long) var33, var16);
										}
									}

									if (var16 != null && ~((Object[]) var16).length == -5) {
										var27 = ((Object[]) var16)[!((Entity) entity).aBool6414 ? 0 : 2];
										var29 = ((Object[]) var16)[((Entity) entity).aBool6414 ? 3 : 1];
									}
								}

								int var38 = ((Entity) entity).f_bb + -Client.cycle;
								if (((Entity) entity).f_vb < var38) {
									var38 -= ((Entity) entity).f_vb;
									var18 = ((Entity) entity).anInt6444 != 0
											? ((Entity) entity).anInt6444
													* ((-var38 + ((Entity) entity).f_jb) / ((Entity) entity).anInt6444)
											: 0;
									var37 = ((AbstractSprite) var27).la() * var18 / ((Entity) entity).f_jb;
								} else {
									var37 = ((AbstractSprite) var27).la();
								}

								var18 = ((AbstractSprite) var27).ma();
								var12 -= var18;
								color = Class257.anIntArray3689[0] + (var5 - (((AbstractSprite) var27).la() >> 1));
								((AbstractSprite) var27).draw_sprite(color, var12);
								Client.sprite_loader.fa(color, var12, color - -var37, var18 + var12);
								((AbstractSprite) var29).draw_sprite(color, var12);
								var12 -= 2;
								Client.sprite_loader.OA(var5, var3, var5 + var0, var3 - -var6);
							}

							if (var9 < var7) {
								Player var31 = (Player) entity;
								if (var31.f_jd != -1) {
									var12 -= 25;
									Class98.aClass_lArray1279[var31.f_jd]
											.draw_sprite(-12 + Class257.anIntArray3689[0] + var5, var12);
									var12 -= 2;
								}

								if (~var31.f_td != 0) {
									var12 -= 25;
									Class58.aClass_lArray814[var31.f_td]
											.draw_sprite(var5 + Class257.anIntArray3689[0] - 12, var12);
									var12 -= 2;
								}
							} else if (var10.headIcon >= 0 && var10.headIcon < Class58.aClass_lArray814.length) {
								AbstractSprite var34 = Class58.aClass_lArray814[var10.headIcon];
								var12 -= 25;
								var34.draw_sprite(Class257.anIntArray3689[0] + var5 + -(var34.la() >> 1), var12);
								var12 -= 2;
							}
						}

						int var10000;
						Class29[] var32;
						Class29 var40;
						AbstractSprite var41;
						if (!(entity instanceof Player)) {
							var26 = 0;
							var32 = Class166.aClass29Array2347;

							for (var33 = 0; var32.length > var33; ++var33) {
								var40 = var32[var33];
								if (var40 != null && ~var40.anInt391 == -2
										&& Class246_Sub28_Sub29.anIntArray6815[var9 - var7] == var40.anInt384) {
									var41 = Class_cs.aClass_lArray7146[var40.anInt385];
									if (var41.ma() > var26) {
										var26 = var41.ma();
									}

									if (~(Client.cycle % 20) > -11) {
										var41.draw_sprite(-12 + var5 - -Class257.anIntArray3689[0],
												var12 + -var41.ma());
									}
								}
							}

							if (~var26 < -1) {
								var10000 = var12 - (var26 + 2);
							}
						} else if (var9 >= 0) {
							var26 = 0;
							var32 = Class166.aClass29Array2347;

							for (var33 = 0; ~var33 > ~var32.length; ++var33) {
								var40 = var32[var33];
								if (var40 != null && var40.anInt391 == 10 && ~var8[var9] == ~var40.anInt384) {
									var41 = Class_cs.aClass_lArray7146[var40.anInt385];
									if (~var26 > ~var41.ma()) {
										var26 = var41.ma();
									}

									var41.draw_sprite(-12 + Class257.anIntArray3689[0] + var5, var12 - var41.ma());
								}
							}

							if (var26 > 0) {
								var10000 = var12 - (var26 + 2);
							}
						}
						// Draw hitmarks
						for (var26 = 0; ~var26 > -5; ++var26) {
							if (Client.cycle < ((Entity) entity).anIntArray6447[var26]) {
								var36 = ((Entity) entity).method2674(var2 ^ 10) / 2;
								Class205.method1340(var0 >> 1, var2 ^ 10, var6 >> 1, var4, var1, var36,
										(Entity) entity);
								if (~Class257.anIntArray3689[0] < 0) {
									if (var26 == 1) {
										Class257.anIntArray3689[1] -= 20;
									}

									if (var26 == 2) {
										Class257.anIntArray3689[1] -= 10;
										Class257.anIntArray3689[0] -= 15;
									}

									if (var26 == 3) {
										Class257.anIntArray3689[1] -= 10;
										Class257.anIntArray3689[0] += 15;
									}

									(Settings.osrs_hit_marks
											? Class191.hit_mark_sprites_osrs[((Entity) entity).anIntArray6472[var26]]
											: Class191.hit_mark_sprites_592[((Entity) entity).anIntArray6472[var26]
													+ (((Entity) entity).anIntArray6472[var26] > 1 ? 2 : 1)])
											.draw_sprite(-12 + var5 - -Class257.anIntArray3689[0],
													-12 + Class257.anIntArray3689[1] + var3);
									FontCache.small_font.draw_centered_text(
											Integer.toString(((Entity) entity).anIntArray6434[var26]),
											var5 + Class257.anIntArray3689[0] - 1,
											3 + var3 - -Class257.anIntArray3689[1], -1, -16777216,
											var2 - 10);
								}
							}
						}
					}
				}
			}

			if (var2 == 10) {
				int var25;
				for (int var24 = 0; var24 < ParamLoader.anInt2308; ++var24) {
					var25 = Class121.anIntArray1663[var24];
					Object var39;
					if (var25 < 2048) {
						var39 = Class143.players[var25];
					} else {
						var39 = VarcLoader.aClass_r_Sub2Array1002[-2048 + var25];
					}

					var26 = Class236.anIntArray3315[var24];
					if (~var26 <= -2049) {
						var29 = VarcLoader.aClass_r_Sub2Array1002[var26 - 2048];
					} else {
						var29 = Class143.players[var26];
					}

					method1385(false, var1, var3, var5, (Entity) var29, (Entity) var39, --((Entity) var39).anInt6463,
							var0, var6, var4);
				}

				var25 = 2 + CacheIndex.aClass73_148.anInt946 + CacheIndex.aClass73_148.anInt951;

				for (var12 = 0; ~var12 > ~Class121.anInt1677; ++var12) {
					var26 = VarcType.anIntArray3110[var12];
					var36 = VarcType.anIntArray3102[var12];
					var33 = VarcType.anIntArray3101[var12];
					boolean var42 = true;

					while (var42) {
						var42 = false;

						for (var37 = 0; ~var37 > ~var12; ++var37) {
							if (~(-var25 + VarcType.anIntArray3102[var37]) > ~(var36 + 2)
									&& VarcType.anIntArray3102[var37] + 2 > var36 - var25
									&& VarcType.anIntArray3101[var37] + VarcType.anIntArray3110[var37] > var26 - var33
									&& ~(VarcType.anIntArray3110[var37] + -VarcType.anIntArray3101[var37]) > ~(var33
											+ var26)
									&& ~var36 < ~(VarcType.anIntArray3102[var37] + -var25)) {
								var36 = -var25 + VarcType.anIntArray3102[var37];
								var42 = true;
							}
						}
					}

					VarcType.anIntArray3102[var12] = var36;
					String string = VarcType.aStringArray3106[var12];
					if (Class101.anInt1313 == 0) {
						var18 = 16776960;
						if (VarcType.anIntArray3097[var12] < 6) {
							var18 = Player.f_id[VarcType.anIntArray3097[var12]];
						}

						if (~VarcType.anIntArray3097[var12] == -7) {
							var18 = Class64_Sub1.anInt5236 % 20 >= 10 ? 16776960 : 16711680;
						}

						if (~VarcType.anIntArray3097[var12] == -8) {
							var18 = ~(Class64_Sub1.anInt5236 % 20) <= -11 ? '\uffff' : 255;
						}

						if (~VarcType.anIntArray3097[var12] == -9) {
							var18 = ~(Class64_Sub1.anInt5236 % 20) <= -11 ? 8454016 : '\ub000';
						}

						if (~VarcType.anIntArray3097[var12] == -10) {
							color = -VarcType.anIntArray3111[var12] + 150;
							if (~color > -51) {
								var18 = 16711680 - -(color * 1280);
							} else if (~color > -101) {
								var18 = -(327680 * (color - 50)) + 16776960;
							} else if (~color > -151) {
								var18 = '\uff00' + 5 * (color - 100);
							}
						}

						if (~VarcType.anIntArray3097[var12] == -11) {
							color = -VarcType.anIntArray3111[var12] + 150;
							if (~color <= -51) {
								if (~color <= -101) {
									if (color < 150) {
										var18 = 255 + 327680 * (color - 100) - (-500 + color * 5);
									}
								} else {
									var18 = -((color - 50) * 327680) + 16711935;
								}
							} else {
								var18 = color * 5 + 16711680;
							}
						}

						if (~VarcType.anIntArray3097[var12] == -12) {
							color = -VarcType.anIntArray3111[var12] + 150;
							if (~color <= -51) {
								if (~color <= -101) {
									if (~color > -151) {
										var18 = 32768000 + -(327680 * color) + 16777215;
									}
								} else {
									var18 = -16384250 + color * 327685 + '\uff00';
								}
							} else {
								var18 = 16777215 - color * 327685;
							}
						}

						color = -16777216 | var18;
						if (~VarcType.anIntArray3104[var12] == -1) {
							FontCache.bold_font.draw_centered_text(string, var5 + var26, var36 + var3, color, -16777216,
									0);
						}

						if (~VarcType.anIntArray3104[var12] == -2) {
							FontCache.bold_font.method786(color, string, -58, var36 + var3, var26 + var5,
									Class64_Sub1.anInt5236, -16777216);
						}

						if (~VarcType.anIntArray3104[var12] == -3) {
							FontCache.bold_font.method782(var3 + var36, -16777216, var26 + var5, string,
									Class64_Sub1.anInt5236, color, var2 ^ -120);
						}

						if (VarcType.anIntArray3104[var12] == 3) {
							FontCache.bold_font.method800(-16777216, color, var3 + var36, string, 124, var5 - -var26,
									Class64_Sub1.anInt5236, -VarcType.anIntArray3111[var12] + 150);
						}

						int var20;
						if (~VarcType.anIntArray3104[var12] == -5) {
							var20 = (150 + -VarcType.anIntArray3111[var12])
									* (CacheIndex.aClass73_148.method459(-1, string) + 100) / 150;
							Client.sprite_loader.fa(-50 + var5 + var26, var3, var5 - (-var26 - 50), var3 - -var6);
							FontCache.bold_font.draw_text(-16777216, color, string, 50 + var5 + var26 - var20,
									var3 - -var36, 0);
							Client.sprite_loader.OA(var5, var3, var0 + var5, var6 + var3);
						}

						if (VarcType.anIntArray3104[var12] == 5) {
							var20 = 150 - VarcType.anIntArray3111[var12];
							int var21 = 0;
							if (~var20 <= -26) {
								if (~var20 < -126) {
									var21 = var20 - 125;
								}
							} else {
								var21 = -25 + var20;
							}

							int var22 = CacheIndex.aClass73_148.anInt951 + CacheIndex.aClass73_148.anInt946;
							Client.sprite_loader.fa(var5, -var22 + var36 + var3 - 1, var5 - -var0, 5 + var36 + var3);
							FontCache.bold_font.draw_centered_text(string, var26 + var5, var36 + var3 - -var21, color,
									-16777216, 0);
							Client.sprite_loader.OA(var5, var3, var0 + var5, var6 + var3);
						}
					} else {
						FontCache.bold_font.draw_centered_text(string, var5 - -var26, var36 + var3, -256, -16777216, 0);
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	abstract void B(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8,
			int[] var9, int[] var10, int var11, int var12, int var13, boolean var14);

	abstract void drawShadedTriangle(int var1, int var2);

	abstract void method1384(int var1, int var2, int var3, boolean[][] var4, boolean var5);

	Class210(int var1, int var2, int var3) {
		try {
			for (this.anInt2956 = var1; var3 > 1; ++this.anInt2950) {
				var3 >>= 1;
			}

			this.anInt2952 = var2;
			this.anInt2955 = 1 << this.anInt2950;
		} catch (RuntimeException var5) {
			throw Class193.method1272(var5, "ta.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	private static final void method1385(boolean var0, int var1, int var2, int var3, Entity var4, Entity var5, int var6,
			int var7, int var8, int var9) {
		try {
			++anInt2957;
			int var10 = var4.method2675((byte) 18);
			if (var10 != -1) {
				AbstractSprite var11 = null;
				var11 = (AbstractSprite) Class211_Sub1.aClass54_5351.method379((long) var10, (byte) 58);
				if (var11 == null) {
					LDSprite[] var12 = LDSprite.method129(Cache.get_index(Revision.PRE_EOC_634, "sprites"), var10, 0);
					if (var12 == null) {
						return;
					}

					var11 = Client.sprite_loader.ld_to_abstract_sprite(var12[0], true);
					Class211_Sub1.aClass54_5351.method371(1, (long) var10, var11);
				}

				Class211.method1386(var1, var5.x, var5.y, var9, 64 * var5.method2670((byte) 127), var7 >> 1, 0, 503,
						var5.current_plane, var8 >> 1);
				int var16 = Class257.anIntArray3689[0] + (var3 - 18);
				var16 += 18 * (var6 / 4);
				int var13 = -54 + -16 + Class257.anIntArray3689[1] + var2;
				var13 += 18 * (var6 % 4);
				var11.draw_sprite(var16, var13);
				if (var5 == var4) {
					Client.sprite_loader.method1736(-1 + var16, -256, 18, 8, 18, -1 + var13);
				}

				Class130_Sub4 var14 = Class234.method1496(8);
				var14.anInt4737 = var16;
				if (!var0) {
					var14.anInt4743 = var13;
					var14.anInt4741 = 16 + var16;
					var14.aClass_r4744 = var4;
					var14.anInt4739 = var13 + 16;
					HashMap.aClass68_762.method438(83, var14);
				}
			}
		} catch (RuntimeException var15) {
			throw Class193.method1272(var15,
					"ta.N(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null")
							+ ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ',' + var8 + ','
							+ var9 + ')');
		}
	}

	abstract void b(Class246_Sub1_Sub4 var1, int var2, int var3, int var4, int var5, boolean var6);

	abstract void p(Class246_Sub1_Sub4 var1, int var2, int var3, int var4, int var5, boolean var6);
}
