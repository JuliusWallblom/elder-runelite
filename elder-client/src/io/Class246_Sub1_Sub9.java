package io;

import io.cache.Revision;

final class Class246_Sub1_Sub9 extends NodeSub {
	Class59_Sub3_Sub2 aClass59_Sub3_Sub2_6173;
	static int anInt6174;
	static int anInt6175;
	static int anInt6176;
	static MultilingualString aClass67_6177 = new MultilingualString("flash3:", "blinken3:", "clignotant3:",
			"brilho3:");
	static MultilingualString aClass67_6178;
	static int anInt6179;

	static final boolean method2586(int i, String string) {
		try {
			anInt6175++;
			if (string == null)
				return false;
			for (int i_0_ = 0; (Client.anInt3969 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
				if (string.equalsIgnoreCase(Model.f_gb[i_0_]))
					return true;
			}
			if (i <= 109)
				return false;
			if (string.equalsIgnoreCase(((Player) Client.local_player).aString7140))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("hi.D(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final char method2587(int i, char c) {
		try {
			if (i != 234)
				aClass67_6177 = null;
			anInt6179++;
			int i_1_ = c;
			while_13_: do {
				while_12_: do {
					while_11_: do {
						while_10_: do {
							while_9_: do {
								while_8_: do {
									while_7_: do {
										while_6_: do {
											while_5_: do {
												while_4_: do {
													do {
														if (i_1_ != 32 && i_1_ != 160 && ((i_1_ ^ 0xffffffff) != -96)
																&& i_1_ != 45) {
															if (((i_1_ ^ 0xffffffff) == -92) || i_1_ == 93
																	|| i_1_ == 35)
																break;
															if (i_1_ == 224 || i_1_ == 225 || i_1_ == 226
																	|| ((i_1_ ^ 0xffffffff) == -229)
																	|| ((i_1_ ^ 0xffffffff) == -228)
																	|| ((i_1_ ^ 0xffffffff) == -193) || i_1_ == 193
																	|| i_1_ == 194 || i_1_ == 196
																	|| ((i_1_ ^ 0xffffffff) == -196))
																break while_4_;
															if (i_1_ == 232 || ((i_1_ ^ 0xffffffff) == -234)
																	|| i_1_ == 234 || i_1_ == 235 || i_1_ == 200
																	|| ((i_1_ ^ 0xffffffff) == -202)
																	|| ((i_1_ ^ 0xffffffff) == -203) || i_1_ == 203)
																break while_5_;
															if (i_1_ == 237 || i_1_ == 238 || i_1_ == 239
																	|| ((i_1_ ^ 0xffffffff) == -206)
																	|| ((i_1_ ^ 0xffffffff) == -207) || i_1_ == 207)
																break while_6_;
															if (((i_1_ ^ 0xffffffff) == -243)
																	|| ((i_1_ ^ 0xffffffff) == -244)
																	|| ((i_1_ ^ 0xffffffff) == -245)
																	|| ((i_1_ ^ 0xffffffff) == -247) || i_1_ == 245
																	|| i_1_ == 210 || i_1_ == 211
																	|| ((i_1_ ^ 0xffffffff) == -213) || i_1_ == 214
																	|| ((i_1_ ^ 0xffffffff) == -214))
																break while_7_;
															if (((i_1_ ^ 0xffffffff) == -250) || i_1_ == 250
																	|| i_1_ == 251 || ((i_1_ ^ 0xffffffff) == -253)
																	|| ((i_1_ ^ 0xffffffff) == -218)
																	|| ((i_1_ ^ 0xffffffff) == -219) || i_1_ == 219
																	|| i_1_ == 220)
																break while_8_;
															if (i_1_ == 231 || ((i_1_ ^ 0xffffffff) == -200))
																break while_9_;
															if (((i_1_ ^ 0xffffffff) == -256)
																	|| ((i_1_ ^ 0xffffffff) == -377))
																break while_10_;
															if (((i_1_ ^ 0xffffffff) == -242)
																	|| ((i_1_ ^ 0xffffffff) == -210))
																break while_11_;
															if (i_1_ != 223)
																break while_13_;
															if (!Client.f_ob)
																break while_12_;
														}
														return '_';
													} while (false);
													return c;
												} while (false);
												return 'a';
											} while (false);
											return 'e';
										} while (false);
										return 'i';
									} while (false);
									return 'o';
								} while (false);
								return 'u';
							} while (false);
							return 'c';
						} while (false);
						return 'y';
					} while (false);
					return 'n';
				} while (false);
				return 'b';
			} while (false);
			return Character.toLowerCase(c);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hi.E(" + i + ',' + c + ')');
		}
	}

	Class246_Sub1_Sub9(Class59_Sub3_Sub2 class59_sub3_sub2) {
		try {
			((Class246_Sub1_Sub9) this).aClass59_Sub3_Sub2_6173 = class59_sub3_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"hi.<init>(" + (class59_sub3_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method2588(int i, int i_2_, int i_3_, int i_4_, Widget[] class235s, int i_5_, int i_6_, int i_7_,
			int i_8_, int i_9_) {
		try {
			Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
			if (i_9_ == -1268043624) {
				anInt6174++;
				int i_10_ = 0;
				for (/**/; class235s.length > i_10_; i_10_++) {
					Widget class235 = class235s[i_10_];
					if (class235 != null && (((i_6_ ^ 0xffffffff) == (((Widget) class235).parent_id ^ 0xffffffff))
							|| (i_6_ == -1412584499 && class235 == Class150.aClass235_2196))) {
						int i_11_;
						if (i_4_ != -1)
							i_11_ = i_4_;
						else {
							Class246_Sub28_Sub22.aRectangleArray6629[SequenceType.anInt1738].setBounds(
									i_8_ + ((Widget) class235).x, ((Widget) class235).y + i_3_,
									((Widget) class235).screen_width, ((Widget) class235).screen_height);
							i_11_ = SequenceType.anInt1738++;
						}
						((Widget) class235).f_bb = Client.cycle;
						((Widget) class235).anInt3297 = i_11_;
						if (!Client.hidden_widget(class235)) {
							if (((Widget) class235).content_type != 0)
								Class246_Sub28_Sub6.method2551(class235, 18804);
							int i_12_ = ((Widget) class235).x + i_8_;
							int i_13_ = i_3_ + ((Widget) class235).y;
							int i_14_ = ((Widget) class235).top_transparency;
							if (RenderSequenceLoader.aBool1452
									&& ((((ClickMaskNode) Widget.get_active_properties(class235)).anInt4893 != 0)
											|| ((Widget) class235).type == 0)
									&& (i_14_ ^ 0xffffffff) < -128)
								i_14_ = 127;
							if (class235 == Class150.aClass235_2196) {
								if (i_6_ != -1412584499 && ((Class214.anInt2993 == ((Widget) class235).anInt3205)
										|| ((((Widget) class235).anInt3205 ^ 0xffffffff) == (ClickMaskNode.anInt4894
												^ 0xffffffff)))) {
									Class90.aClass235Array1168 = class235s;
									Class139.anInt1987 = i_3_;
									Class246_Sub28_Sub12.anInt6197 = i_8_;
									continue;
								}
								if (Class246_Sub1_Sub2.aBool5698 && Class259_Sub3.aBool5355) {
									int i_15_ = Material.aClass102_3360.method640((byte) 58);
									int i_16_ = Material.aClass102_3360.method636(i_9_ ^ ~0x4b94c482);
									i_15_ -= Class99.anInt1292;
									i_16_ -= Class246_Sub43.anInt5605;
									if (i_15_ < SceneGraph.anInt3722)
										i_15_ = SceneGraph.anInt3722;
									if (((Widget) class235).screen_width + i_15_ > (SceneGraph.anInt3722
											+ ((Widget) Class33.aClass235_445).screen_width))
										i_15_ = (-((Widget) class235).screen_width
												+ ((Widget) Class33.aClass235_445).screen_width + SceneGraph.anInt3722);
									if (Class208.anInt2937 > i_16_)
										i_16_ = Class208.anInt2937;
									i_12_ = i_15_;
									if (((((Widget) Class33.aClass235_445).screen_height) + Class208.anInt2937
											^ 0xffffffff) > (i_16_ - -((Widget) class235).screen_height ^ 0xffffffff))
										i_16_ = (((Widget) Class33.aClass235_445).screen_height
												+ (Class208.anInt2937 - (((Widget) class235).screen_height)));
									i_13_ = i_16_;
								}
								if (ClickMaskNode.anInt4894 == ((Widget) class235).anInt3205)
									i_14_ = 128;
							}
							int i_17_;
							int i_18_;
							int i_19_;
							int i_20_;
							if ((((Widget) class235).type ^ 0xffffffff) == -3) {
								i_18_ = i;
								i_20_ = i_7_;
								i_19_ = i_2_;
								i_17_ = i_5_;
							} else {
								int i_21_ = i_12_ - -((Widget) class235).screen_width;
								int i_22_ = ((Widget) class235).screen_height + i_13_;
								if (((Widget) class235).type == 9) {
									i_22_++;
									i_21_++;
								}
								i_17_ = ((i_12_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff) ? i_5_ : i_12_);
								i_18_ = ((i_13_ ^ 0xffffffff) >= (i ^ 0xffffffff) ? i : i_13_);
								i_19_ = i_2_ > i_21_ ? i_21_ : i_2_;
								i_20_ = i_7_ <= i_22_ ? i_7_ : i_22_;
							}
							if (i_19_ > i_17_ && i_18_ < i_20_) {
								if ((((Widget) class235).content_type ^ 0xffffffff) != -1) {
									if (((Class246_Sub1_Sub3.anInt5719
											^ 0xffffffff) == (((Widget) class235).content_type ^ 0xffffffff))
											|| (Class18.anInt268 == (((Widget) class235).content_type))) {
										Class230.method1470(i_12_, (byte) 86, ((Widget) class235).screen_width,
												(Class18.anInt268 == (((Widget) class235).content_type)), i_13_,
												((Widget) class235).screen_height);
										Class246_Sub39.aBoolArray5488[i_11_] = true;
										Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
										continue;
									}
									if (class235.content_type == 1338) {
										if (Settings.gameframe == Revision.OSRS) {
											if (class235.method1514(0, Client.sprite_loader, 1185) != null) {
												IterableNodeHashTable.method545((byte) -109);
												Class258.draw_minimap(class235, i_12_ - 1, -36, i_13_ - 1,
														(Client.sprite_loader));
												Class246_Sub28_Sub24.aBoolArray6673[i_11_] = true;
												Class246_Sub39.aBoolArray5488[i_11_] = true;
												Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
												continue;
											}
										} else {
											if (class235.method1514(0, Client.sprite_loader) != null) {
												IterableNodeHashTable.method545((byte) -109);
												Class258.draw_minimap(class235, i_12_, -36, i_13_,
														(Client.sprite_loader));
												Class246_Sub28_Sub24.aBoolArray6673[i_11_] = true;
												Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
											}
											continue;
										}
									}
									if (class235.content_type == 1339) {
										if (Settings.gameframe == Revision.OSRS) { // OSRS gameframe
											if (class235.method1514(0, Client.sprite_loader, 1186) != null) {
												Class79_Sub1.draw_compass((byte) -125, i_12_, i_13_, class235);
												Class246_Sub28_Sub24.aBoolArray6673[i_11_] = true;
												Class246_Sub39.aBoolArray5488[i_11_] = true;
												Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
												continue;
											}
										} else {
											if (class235.method1514(0, Client.sprite_loader) != null) {
												Class79_Sub1.draw_compass((byte) -125, i_12_, i_13_, class235);
												Class246_Sub28_Sub24.aBoolArray6673[i_11_] = true;
												Class246_Sub39.aBoolArray5488[i_11_] = true;
												Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
											}
											continue;
										}

									}
									if (class235.content_type == 1400) {
										SequenceLoader.method2758(i_12_, ((Widget) class235).screen_width,
												(Class246_Sub37_Sub1.textureLoader), Client.sprite_loader,
												((Widget) class235).screen_height, (byte) -125, i_13_);
										Class246_Sub39.aBoolArray5488[i_11_] = true;
										Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
										continue;
									}
									if (Class246_Sub18.anInt4676 == ((Widget) class235).content_type) {
										Class38.method262(((Widget) class235).screen_width, -117,
												Client.sprite_loader, i_12_, i_13_,
												((Widget) class235).screen_height);
										Class246_Sub39.aBoolArray5488[i_11_] = true;
										Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
										continue;
									}
									if (Class150.anInt2198 == ((Widget) class235).content_type) {
										if (Settings.display_fps || Class248.aBool3487) {
											int i_23_ = (i_12_ - -(((Widget) class235).screen_width));
											int i_24_ = i_13_ + 15;
											if (Settings.display_fps) {
												FontCache.regular_font.draw(-1, false,
														("Fps:" + (Class246_Sub28_Sub18.anInt6517)), i_24_, -256,
														i_23_);
												i_24_ += 15;
												Runtime runtime = Runtime.getRuntime();
												int i_25_ = (int) (((runtime.totalMemory()) + -(runtime.freeMemory()))
														/ 1024L);
												int i_26_ = -256;
												if (i_25_ > 65536)
													i_26_ = -65536;
												FontCache.regular_font.draw(-1, false, "Mem:" + i_25_ + "k",
														i_24_, i_26_, i_23_);
												i_24_ += 15;
												FontCache.regular_font
														.draw(-1, false,
																("In:" + (Class246_Sub1_Sub5.anInt5847) + "B/s Out:"
																		+ Class257.anInt3686 + "B/s"),
																i_24_, -256, i_23_);
												i_24_ += 15;
												int i_27_ = (Client.sprite_loader.IA() / 1024);
												FontCache.regular_font.draw(-1, false, "Offheap:" + i_27_ + "k",
														i_24_, (((i_27_ ^ 0xffffffff) >= -65537) ? -256 : -65536),
														i_23_);
												i_24_ += 15;
												int i_28_ = 0;
												int i_29_ = 0;
												int i_30_ = 0;
												for (int i_31_ = 0; ((i_31_
														^ 0xffffffff) > -Constants.MAX_INDEX_COUNT); i_31_++) {
													i_28_ += (Class59_Sub1_Sub2.aClass154_Sub1Array6127[i_31_]
															.method2087((byte) -8));
													i_29_ += (Class59_Sub1_Sub2.aClass154_Sub1Array6127[i_31_]
															.method2097(-104));
													i_30_ += (Class59_Sub1_Sub2.aClass154_Sub1Array6127[i_31_]
															.method2091(false));
												}
												int i_32_ = 100 * i_30_ / i_28_;
												int i_33_ = i_29_ * 10000 / i_28_;
												String string = ("Cache:"
														+ (Class188.method1235(true, (long) i_33_, 2, -113, 0)) + "% ("
														+ i_32_ + "%)");
												FontCache.small_font.draw(-1, false, string, i_24_, -256, i_23_);
												i_24_ += 12;
											}
											if ((Class247.anInt3480 ^ 0xffffffff) < -1)
												FontCache.small_font.draw(-1, false, ("Particles: "
														+ Class148.anInt2176 + " / " + Class247.anInt3480), i_24_, -256,
														i_23_);
											i_24_ += 12;
											if (Class248.aBool3487) {
												FontCache.small_font.draw(-1, false,
														("Polys: " + Client.sprite_loader.ZA() + " Models: "
																+ Client.sprite_loader.w()),
														i_24_, -256, i_23_);
												i_24_ += 12;
												FontCache.small_font.draw(-1, false,
														("Ls: " + Class_m.anInt1546 + " La: " + Class168.anInt2392
																+ " NPC: " + Class_l_Sub2.anInt5481 + " Pl: "
																+ IncomingPacket.anInt185),
														i_24_, -256, i_23_);
												i_24_ += 12;
												Class22.method201(-77);
											}
											Class246_Sub39.aBoolArray5488[i_11_] = true;
										}
										continue;
									}
								}
								if (((Widget) class235).type == 0) {
									if (((((Widget) class235).content_type
											^ 0xffffffff) == (Class246_Sub28_Sub29.anInt6814 ^ 0xffffffff))
											&& Client.sprite_loader.method1742())
										Client.sprite_loader.method1735(i_12_, i_13_,
												((Widget) class235).screen_width, ((Widget) class235).screen_height);
									method2588(i_18_, i_19_, -(((Widget) class235).vertical_scroll_position) + i_13_,
											i_11_, class235s, i_17_, ((Widget) class235).hash, i_20_,
											-(((Widget) class235).horizontal_scroll_position) + i_12_, -1268043624);
									if (((Widget) class235).components != null)
										method2588(i_18_, i_19_,
												i_13_ + -(((Widget) class235).vertical_scroll_position), i_11_,
												((Widget) class235).components, i_17_, ((Widget) class235).hash, i_20_,
												i_12_ - (((Widget) class235).horizontal_scroll_position), -1268043624);
									WidgetParent class246_sub40 = ((WidgetParent) (Widget
											.get_widget_parents(class235.revision)
											.get((long) (((Widget) class235).hash))));
									if (class246_sub40 != null)
										Class40_Sub1.method1771(i_17_, i_11_, i_18_, i_19_,
												(((WidgetParent) class246_sub40).anInt5517), i_20_, i_12_, (byte) 27,
												i_13_, class235.revision);
									if (((Class246_Sub28_Sub29.anInt6814
											^ 0xffffffff) == (((Widget) class235).content_type ^ 0xffffffff))
											&& Client.sprite_loader.method1742()) {
										Client.sprite_loader.method1719();
										Class224.aBool3095 = true;
									}
									Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
								}
								if (Class37.aBoolArray546[i_11_] || ((Class210_Sub2.anInt5022 ^ 0xffffffff) < -2)) {
									if ((((Widget) class235).type ^ 0xffffffff) == -4) {
										if ((i_14_ ^ 0xffffffff) == -1) { // draw box
											if (!((Widget) class235).filled)
												Client.sprite_loader.method1753(i_12_, i_13_,
														(((Widget) class235).screen_width),
														(((Widget) class235).screen_height),
														(((Widget) class235).color), 0);
											else
												Client.sprite_loader.O(i_12_, i_13_,
														(((Widget) class235).screen_width),
														(((Widget) class235).screen_height),
														(((Widget) class235).color), 0);
										} else if (!((Widget) class235).filled)
											Client.sprite_loader.method1753(i_12_, i_13_,
													((Widget) class235).screen_width, ((Widget) class235).screen_height,
													(-(0xff & i_14_) + 255 << 24
															| (0xffffff & (((Widget) class235).color))),
													1);
										else
											Client.sprite_loader.O(i_12_, i_13_,
													((Widget) class235).screen_width, ((Widget) class235).screen_height,
													((0xffffff & (((Widget) class235).color))
															| (-(0xff & i_14_) + 255 << 24)),
													1);
									} else if ((((Widget) class235).type ^ 0xffffffff) == -5) { // draw text
										Font class116 = (class235.method1512(Client.sprite_loader, -1));
										if (class116 == null) {
											if (Class_u_Sub1.aBool5687)
												Widget.redraw_widget(class235);
										} else {
											int i_34_ = (((Widget) class235).color);
											String string = (((Widget) class235).text);
											if (((((Widget) class235).item_id) ^ 0xffffffff) != 0) {
												ObjType class197 = (MapRegion.aClass191_3663.list(22883,
														(((Widget) class235).item_id)));
												string = (((ObjType) class197).name);
												if (string == null)
													string = "null";
												if (((((ObjType) class197).stackability) == 1
														|| ((((Widget) class235).item_quantity) ^ 0xffffffff) != -2)
														&& (((Widget) class235).item_quantity) != -1)
													string = ("<col=ff9040>" + string + "</col> x"
															+ (Class239.method1536(92,
																	(((Widget) class235).item_quantity))));
											}
											if (Client.meslayerContinueWidget == class235) {
												string = (Class82.aClass67_1073.get(Preferences.language_code));
												i_34_ = (((Widget) class235).color);
											}
											if (Class257.aBool3683)
												Client.sprite_loader.fa(i_12_, i_13_,
														i_12_ + ((Widget) class235).screen_width,
														(((Widget) class235).screen_height) + i_13_);
											class116.method784(i_12_, ((Widget) class235).screen_height,
													(255 + -(i_14_ & 0xff) << 24 | i_34_), Class243.aClass_lArray3448,
													null, false,
													(!((Widget) class235).text_shadow ? -1
															: (-(0xff & i_14_) + 255 << 24)),
													(((Widget) class235).line_height), 0, 0,
													((Widget) class235).vertical_text_alignment, string, i_13_,
													(((Widget) class235).anInt3259), null,
													((Widget) class235).horizontal_text_alignment,
													((Widget) class235).screen_width);
											if (Class257.aBool3683)
												Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
										}
									} else if ((((Widget) class235).type ^ 0xffffffff) == -6) { // draw sprite
										if (((Widget) class235).anInt3213 < 0) {
											AbstractSprite abstract_sprite;
											if (((Widget) class235).item_id != -1) {
												PlayerComposition class27 = ((((Widget) class235).f_db)
														? (((Player) (Client.local_player)).appearance)
														: null);
												abstract_sprite = (MapRegion.aClass191_3663.method1248(
														(Client.sprite_loader),
														(((Widget) class235).item_id), -113, class27,
														(((Widget) class235).item_quantity_mode),
														(((Widget) class235).item_quantity),
														(((Widget) class235).border_width),
														((((Widget) class235).border_color) | ~0xffffff)));
											} else
												abstract_sprite = (class235.getWidgetSprite((Client.sprite_loader),
														(byte) 1));
											if (abstract_sprite != null) {
												int i_35_ = abstract_sprite.j();
												int i_36_ = abstract_sprite.T();
												int i_37_ = ((((((Widget) class235).color) ^ 0xffffffff) != -1
														? (((Widget) class235).color & 0xffffff)
														: 16777215) | (255 + -(0xff & i_14_) << 24));
												if (((Widget) class235).sprite_tiling) {
													Client.sprite_loader.fa(i_12_, i_13_,
															(((Widget) class235).screen_width) + i_12_,
															i_13_ + (((Widget) class235).screen_height));
													if ((((Widget) class235).sprite_angle) != 0) {
														int i_38_ = ((-1 + i_35_ + (((Widget) class235).screen_width))
																/ i_35_);
														int i_39_ = ((-1 + i_36_ + (((Widget) class235).screen_height))
																/ i_36_);
														for (int i_40_ = 0; ((i_38_ ^ 0xffffffff) < (i_40_
																^ 0xffffffff)); i_40_++) {
															for (int i_41_ = 0; ((i_41_ ^ 0xffffffff) > (i_39_
																	^ 0xffffffff)); i_41_++) {
																if ((((Widget) class235).color) == 0)
																	abstract_sprite.method736(
																			(((float) i_35_ / 2.0F)
																					+ (float) (i_35_ * i_40_ + i_12_)),
																			(((float) i_36_ / 2.0F) + (float) (i_13_
																					- -(i_41_ * i_36_))),
																			4096, (((Widget) class235).sprite_angle));
																else
																	abstract_sprite.method731(
																			((float) (i_12_ - -(i_40_ * i_35_))
																					+ ((float) i_35_ / 2.0F)),
																			(((float) i_36_ / 2.0F)
																					+ (float) (i_36_ * i_41_ + i_13_)),
																			4096, (((Widget) class235).sprite_angle), 0,
																			i_37_, 1);
															}
														}
													} else if (((((Widget) class235).color) == 0)
															&& ((i_14_ ^ 0xffffffff) == -1))
														abstract_sprite.method734(i_12_, i_13_,
																((Widget) class235).screen_width,
																((Widget) class235).screen_height);
													else
														abstract_sprite.JA(i_12_, i_13_,
																(((Widget) class235).screen_width),
																(((Widget) class235).screen_height), 0, i_37_, 1);
													Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
												} else if (((((Widget) class235).color) ^ 0xffffffff) != -1
														|| i_14_ != 0) {
													if ((((Widget) class235).sprite_angle) != 0)
														abstract_sprite.method731(((float) i_12_
																+ ((float) (((Widget) class235).screen_width) / 2.0F)),
																(((float) (((Widget) class235).screen_height) / 2.0F)
																		+ (float) i_13_),
																(((Widget) class235).screen_width * 4096 / i_35_),
																(((Widget) class235).sprite_angle), 0, i_37_, 1);
													else if (((((Widget) class235).screen_width ^ 0xffffffff) != (i_35_
															^ 0xffffffff))
															|| ((i_36_
																	^ 0xffffffff) != ((((Widget) class235).screen_height)
																			^ 0xffffffff)))
														abstract_sprite.s(i_12_, i_13_,
																(((Widget) class235).screen_width),
																(((Widget) class235).screen_height), 0, i_37_, 1);
													else
														abstract_sprite.r(i_12_, i_13_, 0, i_37_, 1);
												} else if (((((Widget) class235).sprite_angle) ^ 0xffffffff) == -1) {
													if (i_35_ == (((Widget) class235).screen_width)
															&& ((((Widget) class235).screen_height
																	^ 0xffffffff) == (i_36_ ^ 0xffffffff)))
														abstract_sprite.draw_sprite(i_12_, i_13_);
													else
														abstract_sprite.method732(i_12_, i_13_,
																((Widget) class235).screen_width,
																((Widget) class235).screen_height);
												} else
													abstract_sprite.method736(
															(((float) (((Widget) class235).screen_width) / 2.0F)
																	+ (float) i_12_),
															(((float) (((Widget) class235).screen_height) / 2.0F)
																	+ (float) i_13_),
															(4096 * ((Widget) class235).screen_width / i_35_),
															(((Widget) class235).sprite_angle));
											} else if (Class_u_Sub1.aBool5687)
												Widget.redraw_widget(class235);
										} else
											class235.method1513(i_9_ ^ 0x4b94cf1a, (Class246_Sub1_Sub14.aClass214_6597),
													Class246_Sub31.aClass203_5038).method1478(0, i_12_, i_13_,
															(((Widget) class235).f_id << 3),
															(((Widget) class235).anInt3253) << 3,
															Client.sprite_loader, i_9_ ^ ~0x4b94f098,
															((Widget) class235).screen_width, 0,
															((Widget) class235).screen_height);
									} else if ((((Widget) class235).type ^ 0xffffffff) == -7) {
										MapFunctions.method1087(-109);
										AbstractModel class_t = null;
										int i_42_ = 0;
										if (((Widget) class235).item_id == -1) {
											if (((Widget) class235).model_type != 5) {
												if ((((Widget) class235).model_type) != 8
														&& ((((Widget) class235).model_type) ^ 0xffffffff) != -10) {
													if ((((Widget) class235).sequence_id) == -1) {
														class_t = (class235.method1509((MapRegion.aClass191_3663),
																(Client.sprite_loader),
																(Class179.aClass228_2518),
																(((Player) (Client.local_player)).appearance),
																(Class59_Sub3_Sub3.aClass45_6275), 2048, (byte) 102,
																null, -1, (Material.aClass92_3358), -1,
																(Varbit.aClass95_6658), 0, (ParamType.aClass_v1641)));
														if (class_t == null && (Class_u_Sub1.aBool5687))
															Widget.redraw_widget(class235);
													} else {
														SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(3,
																(((Widget) class235).sequence_id)));
														class_t = (class235.method1509((MapRegion.aClass191_3663),
																(Client.sprite_loader),
																(Class179.aClass228_2518),
																(((Player) (Client.local_player)).appearance),
																(Class59_Sub3_Sub3.aClass45_6275), 2048, (byte) 102,
																class124, (((Widget) class235).model_frame),
																(Material.aClass92_3358),
																(((Widget) class235).anInt3221), (Varbit.aClass95_6658),
																(((Widget) class235).model_frame_cycle),
																(ParamType.aClass_v1641)));
														if (class_t == null && (Class_u_Sub1.aBool5687))
															Widget.redraw_widget(class235);
													}
												} else {
													Class246_Sub18 class246_sub18 = (Class95.method610(
															i_9_ ^ ~0x4b94cf0c, false, (((Widget) class235).model_id)));
													SequenceType class124 = ((((Widget) class235).sequence_id) != -1
															? (Class59_Sub3_Sub3.aClass45_6275.list(3,
																	(((Widget) class235).sequence_id)))
															: null);
													if (class246_sub18 != null) {
														PlayerComposition class27 = (!((Widget) class235).f_db ? null
																: (((Player) (Client.local_player)).appearance));
														class_t = (class246_sub18.method2056(2048,
																((((Widget) class235).model_type) == 9), (byte) 117,
																(((Widget) class235).anInt3221), class124,
																(((Widget) class235).model_frame_cycle),
																(((Widget) class235).anInt3289), class27,
																(((Widget) class235).model_frame),
																(Client.sprite_loader)));
													}
												}
											} else {
												int i_43_ = (((Widget) class235).model_id);
												if (i_43_ >= 0 && ((i_43_ ^ 0xffffffff) > -2049)) {
													Player class_r_sub1 = (Class143.players[i_43_]);
													SequenceType class124 = (((((Widget) class235).sequence_id)
															^ 0xffffffff) != 0
																	? (Class59_Sub3_Sub3.aClass45_6275.list(3,
																			(((Widget) class235).sequence_id)))
																	: null);
													if (class_r_sub1 != null && ((i_43_ == (Class109.anInt1567))
															|| ((Class246_Sub1_Sub4_Sub1.method2893((byte) -33,
																	(((Player) class_r_sub1).aString7140))) == (((Widget) class235).anInt3289))))
														class_t = (((Player) class_r_sub1).appearance.method215(
																(ParamType.aClass_v1641), (Material.aClass92_3358),
																null, 2048, null, (Class179.aClass228_2518),
																(((Widget) class235).anInt3221),
																(((Widget) class235).model_frame), class124, (byte) 119,
																(Class59_Sub3_Sub3.aClass45_6275), -1, 0,
																(Client.sprite_loader),
																(MapRegion.aClass191_3663), 0, (Varbit.aClass95_6658),
																(((Widget) class235).model_frame_cycle), true));
												}
											}
										} else {
											ObjType class197 = (MapRegion.aClass191_3663.list(i_9_ + 1268066507,
													(((Widget) class235).item_id)));
											if (class197 != null) {
												class197 = (class197.method1296((((Widget) class235).item_quantity),
														4223));
												SequenceType class124 = ((((Widget) class235).sequence_id) != -1
														? (Class59_Sub3_Sub3.aClass45_6275.list(3,
																(((Widget) class235).sequence_id)))
														: null);
												PlayerComposition class27 = (!(((Widget) class235).f_db) ? null
														: (((Player) (Client.local_player)).appearance));
												class_t = (class197.method1281((((Widget) class235).model_frame_cycle),
														1,
														class124, 2048, (((Widget) class235).anInt3221), class27,
														(((Widget) class235).model_frame), -124,
														(Client.sprite_loader)));
												if (class_t == null)
													Widget.redraw_widget(class235);
												else
													i_42_ = -class_t.MA() >> 1;
											}
										}
										if (class_t != null) {
											int i_44_;
											if (((Widget) class235).dynamic_width <= 0)
												i_44_ = 512;
											else
												i_44_ = (((((Widget) class235).screen_width) << 9)
														/ (((Widget) class235).dynamic_width));
											int i_45_;
											if (((Widget) class235).dynamic_height > 0)
												i_45_ = (((((Widget) class235).screen_height) << 9)
														/ (((Widget) class235).dynamic_height));
											else
												i_45_ = 512;
											int i_46_ = ((((Widget) class235).screen_width / 2) + i_12_
													- -((((Widget) class235).translate_x) * i_44_ >> 9));
											int i_47_ = ((((Widget) class235).screen_height / 2)
													+ (i_13_ + (i_45_ * (((Widget) class235).translate_y) >> 9)));
											Class130_Sub3.aClass_c4413.xa();
											Client.sprite_loader.ea(Class130_Sub3.aClass_c4413);
											Client.sprite_loader.H(i_46_, i_47_, i_44_, i_45_);
											Client.sprite_loader.g(
													(float) (((Widget) class235).anInt3217 << 0),
													(!(((Widget) class235).model_orthogonal)
															? (float) (((Widget) class235).f_md << 0) * 1.5F
															: (float) (((Widget) class235).f_md << 0)));
											if (((i_6_ ^ 0xffffffff) == 1412584498) || Class224.aBool3095) {
												Client.sprite_loader.e();
												Client.sprite_loader.method1707();
												Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
												Class224.aBool3095 = false;
											}
											if (((Widget) class235).aBool3277)
												Client.sprite_loader.method1750(false);
											int i_48_ = (((((Widget) class235).model_zoom << 0)
													* (MathUtils.SINE[(((Widget) class235).model_rotation_x) << 3])) >> 15);
											int i_49_ = (((((Widget) class235).model_zoom << 0)
													* (MathUtils.COSINE[(((Widget) class235).model_rotation_x) << 3])) >> 15);
											Class134.aClass_c1879.O(-(((Widget) class235).model_rotation_z) << 3);
											Class134.aClass_c1879.ja(((Widget) class235).model_rotation_y << 3);
											Class134.aClass_c1879.o((((Widget) class235).anInt3255) << 0,
													(i_42_ + (i_48_ - -((((Widget) class235).anInt3271) << 0))),
													i_49_ - -(((Widget) class235).anInt3271 << 0));
											Class134.aClass_c1879.ka((((Widget) class235).model_rotation_x) << 3);
											if (Class257.aBool3683)
												Client.sprite_loader.fa(i_12_, i_13_,
														(((Widget) class235).screen_width) + i_12_,
														(((Widget) class235).screen_height) + i_13_);
											if (!((Widget) class235).model_orthogonal)
												class_t.method680(Class134.aClass_c1879, null, 1);
											else
												class_t.method671(Class134.aClass_c1879, null,
														(((Widget) class235).model_zoom) << 0, 1);
											if (Class257.aBool3683)
												Client.sprite_loader.OA(i_5_, i, i_2_, i_7_);
											if (((Widget) class235).aBool3277)
												Client.sprite_loader.method1750(true);
											Client.sprite_loader.g(0.0F, 0.0F);
										}
									} else if ((((Widget) class235).type ^ 0xffffffff) == -10) {
										int i_50_;
										int i_51_;
										int i_52_;
										int i_53_;
										if (((Widget) class235).line_direction) {
											i_50_ = i_12_;
											i_52_ = (((Widget) class235).screen_width + i_12_);
											i_51_ = i_13_;
											i_53_ = (((Widget) class235).screen_height + i_13_);
										} else {
											i_50_ = i_12_;
											i_51_ = (((Widget) class235).screen_height + i_13_);
											i_52_ = i_12_ - -((Widget) class235).screen_width;
											i_53_ = i_13_;
										}
										if ((((Widget) class235).line_width ^ 0xffffffff) == -2)
											Client.sprite_loader.method1743(i_50_, i_53_, i_52_, i_51_,
													(((Widget) class235).color), 0);
										else
											Client.sprite_loader.method1694(i_50_, i_53_, i_52_, i_51_,
													(((Widget) class235).color), (((Widget) class235).line_width), 0);
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method2589(int i) {
		try {
			aClass67_6178 = null;
			if (i != 19293)
				MapRegion.aBool6180 = false;
			aClass67_6177 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hi.B(" + i + ')');
		}
	}

	static final void method2590(boolean bool) {
		try {
			if (bool == true) {
				anInt6176++;
				Class59.anInt819 = 0;
				Class47.aClass258Array684 = new Class258[50];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hi.C(" + bool + ')');
		}
	}

	static {
		aClass67_6178 = new MultilingualString("Take", "Nehmen", "Prendre", "Pegar");
	}
}
