package io;

import java.applet.Applet;
import java.awt.*;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.util.List;
import java.util.function.IntPredicate;

import io.cache.Cache;
import io.cache.IndexConstants;
import io.cache.Revision;
import jagex3.jagmisc.jagmisc;
import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.clan.ClanChannel;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanSettings;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.dbtable.DBRowConfig;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.IsaacCipher;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.vars.AccountType;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.rs.api.*;

@SuppressWarnings("serial")
public final class Client extends GameEngine implements RSClient {

    public static int field677;
	public static int[] field775 = new int[20000];
	// Unidentified OSRS variables related to OSRS CS2 opcodes.
	static boolean field652 = false;
	static int client_type = -1;
	static int world_properties = 4;

	static int anInt7243;
	static int anInt7244;
	static int anInt7245;
	static int anInt7246;
	static int anInt7247;
	static int f_ab;
	static int f_bb;
	static int f_cb;
	static int f_db;
	static int f_eb;
	static Class205 f_fb = new Class205("WTRC", 1);
	static int f_gb;
	static int f_ib;
	static int f_jb;
	static int f_kb;
	static int f_lb;
	static Class169 f_mb = new Class169("", 11);

	static int gameZoom = 600;
	static int gamePos = 3;
	public static boolean f_ob;

	/*
	 * The current loading phase.
	 */
	static int loadingPhase = 0;
	static int gameState = 0;

	public static void handleGameZoomScroll(int rotation) {
		Client.gameZoom += rotation * 85;
		if (Client.gameZoom > 2800) {
			Client.gameZoom = 2800;
		} else if (Client.gameZoom < 100) {
			Client.gameZoom = 100;
		}
	}

	static Class166 low_priority_script_events;
	static Client instance;
	static Frame frame;
	static long allocated_gc_time = 0L;
	static long allocating_time = 0L;
	static Class39_Sub1 current_renderer;
	static Class188[] characters = new Class188[128];
	static int total_characters = 0;
	static MapFunctions map_functions;
	static MapScenes map_scenes;
	static int anInt1429;
	static int anInt3969;
	static Class18[] grand_exchange_objects;
	public static short field903;
	public static short field828;
	public static short field731;
	public static short field900;
	public static short zoom_width;
	public static int zoom_height;
	public static short field707;
	public static short field690;
	public static int cycle = 0;
	public static String message_filter;
	static int chatCycle;
	static int cycleCntr;
	static Signlink sign_link;
	static SceneGraph sprite_loader;
	static int client_width;
	static int client_height;
	static Player local_player;
	public static int oculusOrbNormalSpeed;
	public static int oculusOrbSlowedSpeed;
	static Widget meslayerContinueWidget = null;
	public static int field638;
	public static int field639;
	static int base_x;
	static int base_y;
	static boolean members_world = false;
	static int staff_level = 0;
	static int reboot_timer = 0;
	static int world_id = -1;
	public static int field483;
	public static int field746;
	static int public_chat_mode = 0;
	static int trade_chat_mode = 0;
	static Class87 private_chat_mode;
	public static boolean mobile;
	public static boolean followerOpsLowPriority;

	private final void method2964(int i) {
		do {
			try {
				f_bb++;
				if (i == 3000) {
					if (((Class242) MapFunction.aClass242_2036).anInt3434 > Class173.anInt2444) {
						Class220.anInt3058 = (50 * (((Class242) MapFunction.aClass242_2036).anInt3434) - 50) * 5;
						if ((Class230.anInt3165 ^ 0xffffffff) != (Class172.anInt2433 ^ 0xffffffff))
							Class230.anInt3165 = Class172.anInt2433;
						else
							Class230.anInt3165 = Class246_Sub28_Sub7.anInt6047;
						if (Class220.anInt3058 > 3000)
							Class220.anInt3058 = 3000;
						if (((Class242) MapFunction.aClass242_2036).anInt3434 >= 2
								&& (((Class242) MapFunction.aClass242_2036).anInt3436 ^ 0xffffffff) == -7) {
							this.error("js5connect_outofdate");
							setGameState(GameState.UNKNOWN);
							break;
						}
						if ((((Class242) MapFunction.aClass242_2036).anInt3434 ^ 0xffffffff) <= -5
								&& (((Class242) MapFunction.aClass242_2036).anInt3436 ^ 0xffffffff) == 0) {
							this.error("js5crc");
							setGameState(GameState.UNKNOWN);
							break;
						}
						if ((((Class242) MapFunction.aClass242_2036).anInt3434 ^ 0xffffffff) <= -5
								&& (gameState == 0 || (gameState ^ 0xffffffff) == -6)) {
							if ((((Class242) MapFunction.aClass242_2036).anInt3436 == 7)
									|| ((((Class242) MapFunction.aClass242_2036).anInt3436) ^ 0xffffffff) == -10)
								this.error("js5connect_full");
							else if (((((Class242) MapFunction.aClass242_2036).anInt3436) ^ 0xffffffff) >= -1)
								this.error("js5io");
							else
								this.error("js5connect");
							setGameState(GameState.UNKNOWN);
							break;
						}
					}
					Class173.anInt2444 = ((Class242) MapFunction.aClass242_2036).anInt3434;
					if ((Class220.anInt3058 ^ 0xffffffff) < -1)
						Class220.anInt3058--;
					else {
						try {
							if (Class44.anInt642 == 0) {
								Class14.aClass182_218 = (Client.sign_link.method364(0, Class174.aString2449,
										Class230.anInt3165));
								Class44.anInt642++;
							}
							if ((Class44.anInt642 ^ 0xffffffff) == -2) {
								if ((Class14.aClass182_218.anInt2539 ^ 0xffffffff) == -3) {
									method2974(-70, 1000);
									break;
								}
								if (Class14.aClass182_218.anInt2539 == 1)
									Class44.anInt642++;
							}
							if ((Class44.anInt642 ^ 0xffffffff) == -3) {
								Class130.aClass6_1817 = new Class6((Socket) (Class14.aClass182_218.anObject2535),
										Client.sign_link);
								Buffer stream = new Buffer(5);
								stream.writeByte(i ^ 0xb47, ((Class48) (Class246_Sub1_Sub10.aClass48_6213)).anInt689);
								stream.writeInt(592, (byte) 84);
								Class130.aClass6_1817.method76(5, 0, ((Buffer) stream).buffer, i - 2873);
								Class44.anInt642++;
								Class177.aLong2495 = TimeUtility.time();
							}
							if (Class44.anInt642 == 3) {
								if ((gameState ^ 0xffffffff) != -1 && (gameState ^ 0xffffffff) != -6
										&& Class130.aClass6_1817.method67(i - 2997) <= 0) {
									if ((-Class177.aLong2495 + TimeUtility.time()) > 30000L) {
										method2974(-59, 1001);
										break;
									}
								} else {
									int i_0_ = Class130.aClass6_1817.method73(i - 2894);
									if ((i_0_ ^ 0xffffffff) != -1) {
										method2974(-121, i_0_);
										break;
									}
									Class44.anInt642++;
								}
							}
							if (Class44.anInt642 != 4)
								break;
							boolean bool = ((gameState ^ 0xffffffff) == -6
									|| (gameState ^ 0xffffffff) == -11 || gameState == 28);
							MapFunction.aClass242_2036.method1550(i ^ 0xbb8, (Class130.aClass6_1817), !bool);
							Class14.aClass182_218 = null;
							Class44.anInt642 = 0;
							Class130.aClass6_1817 = null;
						} catch (java.io.IOException ioexception) {
							method2974(-106, 1002);
						}
						break;
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.CA(" + i + ')');
			}
		} while (false);
	}

	final void method2952(int i) {
		do {
			try {
				f_gb++;
				if (Class246_Sub28_Sub10.aBool6159)
					Class173.method1136(-22125);
				if (Client.sprite_loader != null)
					Client.sprite_loader.method1708(true);
				if (i >= 81) {
					if (Class38_Sub1.aFrame5114 != null) {
						Class256.method1662(Client.sign_link, (byte) -62, Class38_Sub1.aFrame5114);
						Class38_Sub1.aFrame5114 = null;
					}
					if (Class65.aClass6_864 != null) {
						Class65.aClass6_864.method72(false);
						Class65.aClass6_864 = null;
					}
					if (Player.f_rd != null)
						Player.f_rd.method494(GameEngine.canvas, 0);
					Player.f_rd = null;
					Class59_Sub3_Sub2.method2486(527);
					MapFunction.aClass242_2036.method1563(228742352);
					Class106_Sub2.aClass241_5339.method1540(-1);
					if (Class246_Sub28_Sub33.aClass243_6959 == null)
						break;
					Class246_Sub28_Sub33.aClass243_6959.method1564(-21509);
					Class246_Sub28_Sub33.aClass243_6959 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.M(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2965(int i) {
		do {
			try {
				callbacks.frame();
				anInt7244++;
				if ((gameState ^ 0xffffffff) != -1001) {
					long l = (Class246_Sub1_Sub10.method2603(-124) / 1000000L + -Class246_Sub1_Sub10.f_bb);
					Class246_Sub1_Sub10.f_bb = Class246_Sub1_Sub10.method2603(-118) / 1000000L;
					boolean bool = Class100_Sub1.method2175((byte) 124);
					if (bool && Class_w.aBool6383 && WidgetParent.aClass123_5522 != null)
						WidgetParent.aClass123_5522.method830(2000);
					if ((gameState ^ 0xffffffff) == -31 || gameState == 10) {
						if (Class130_Sub8.aLong5616 == 0L || ((TimeUtility.time()
								^ 0xffffffffffffffffL) >= (Class130_Sub8.aLong5616 ^ 0xffffffffffffffffL))) {
							if (!Client.sprite_loader.method1699() && Class246_Sub1_Sub6.aBool5963)
								Class191.method1259(-71);
						} else
							Class100.setWindowedMode(Client.get_frame_mode((byte) -123),
									((Renderer) (Client.current_renderer)).anInt604,
									((Renderer) (Client.current_renderer)).anInt577, false, false);
					}
					if (Class38_Sub1.aFrame5114 == null) {
						java.awt.Container container;
						if (Client.frame != null)
							container = Client.frame;
						else
							container = Client.sign_link.anApplet733;
						int i_2_ = container.getSize().width;
						int i_3_ = container.getSize().height;
						if (container == Client.frame) {
							Insets insets = Client.frame.getInsets();
							i_3_ -= insets.bottom + insets.top;
							i_2_ -= insets.left - -insets.right;
						}
						if (i_2_ != Class246_Sub28_Sub35.anInt7014
								|| ((Class8.anInt101 ^ 0xffffffff) != (i_3_ ^ 0xffffffff))) {
							if (Client.sprite_loader != null && !Client.sprite_loader.method1686()) {
								Class8.anInt101 = i_3_;
								Class246_Sub28_Sub35.anInt7014 = i_2_;
							} else
								Class21.method198(false);
							Class130_Sub8.aLong5616 = 500L + TimeUtility.time();
						}
					}
					if (Class38_Sub1.aFrame5114 != null && !Filestore.aBool2049
							&& ((gameState ^ 0xffffffff) == -31 || (gameState ^ 0xffffffff) == -11))
						Class100.setWindowedMode((((Renderer) (Client.current_renderer)).frame_mode), -1, -1, false,
								false);
					boolean bool_4_ = false;
					if (GameEngine.fullRedraw) {
						GameEngine.fullRedraw = false;
						bool_4_ = true;
					}
					if (bool_4_)
						Class246_Sub28_Sub30.method2834((byte) -125);
					if ((Client.sprite_loader != null && Client.sprite_loader.method1699())
							|| Client.get_frame_mode((byte) -123) != 1)
						Class205.method1341(-11712);
					if (gameState != 0) {
						if (gameState != 5) {
							if ((gameState ^ 0xffffffff) != -11) {
								if ((gameState ^ 0xffffffff) == -26 || gameState == 28) {
									if (PlayerComposition.anInt379 == 1) {
										if (Class246_Sub28_Sub8.anInt6072 > Class246_Sub30_Sub1.anInt5756)
											Class246_Sub30_Sub1.anInt5756 = (Class246_Sub28_Sub8.anInt6072);
										int i_5_ = ((-Class246_Sub28_Sub8.anInt6072 + (Class246_Sub30_Sub1.anInt5756))
												* 50 / (Class246_Sub30_Sub1.anInt5756));
										Class_w.method2650(true,
												((Class250.aClass67_3531.get(Preferences.language_code)) + "<br>("
														+ i_5_ + "%)"),
												FontCache.regular_font, 13);
									} else if (PlayerComposition.anInt379 == 2) {
										if ((MapRegion.anInt3665 ^ 0xffffffff) > (Class148.anInt2184 ^ 0xffffffff))
											MapRegion.anInt3665 = Class148.anInt2184;
										int i_6_ = ((50 * (MapRegion.anInt3665 - Class148.anInt2184)
												/ MapRegion.anInt3665) + 50);
										Class_w.method2650(true,
												((Class250.aClass67_3531.get(Preferences.language_code)) + "<br>("
														+ i_6_ + "%)"),
												FontCache.regular_font, 13);
									} else
										Class_w.method2650(true,
												(Class250.aClass67_3531.get(Preferences.language_code)),
												FontCache.regular_font, 13);
								} else if (gameState == 30)
									Class20.method192(l, -38);
								else if ((gameState ^ 0xffffffff) == -41)
									Class_w.method2650(true,
											((MapRegion.aClass67_3647.get(Preferences.language_code)) + "<br>"
													+ (Class109_Sub4.aClass67_4568.get(Preferences.language_code))),
											FontCache.regular_font, 13);
							} else
								Class159.method1057(false);
						} else
							TitleScreen.draw_loading_screen(Class59_Sub2.aColorArray4539[StructType.anInt6859].getRGB(),
									(byte) 91, bool_4_ | Client.sprite_loader.method1699(),
									Class59_Sub3_Sub2.f_cb[StructType.anInt6859].getRGB(),
									HDModel.aColorArray4641[StructType.anInt6859].getRGB(), FontCache.bold_font,
									Client.sprite_loader);
					} else
						Class246_Sub19.method2067((HDModel.aColorArray4641[StructType.anInt6859]), 115,
								(Class59_Sub2.aColorArray4539[StructType.anInt6859]),
								(Class59_Sub3_Sub2.f_cb[StructType.anInt6859]), TitleScreen.loading_percentage, bool_4_,
								TitleScreen.loading_message);
					if ((Class210_Sub2.anInt5022 ^ 0xffffffff) == -4) {
						for (int i_7_ = 0; i_7_ < SequenceType.anInt1738; i_7_++) {
							Rectangle rectangle = (Class246_Sub28_Sub22.aRectangleArray6629[i_7_]);
							if (!Class37.aBoolArray546[i_7_]) {
								if (Class246_Sub28_Sub24.aBoolArray6673[i_7_])
									Client.sprite_loader.method1734(rectangle.x, rectangle.width, rectangle.y,
											(byte) 58, -1996554240, rectangle.height);
							} else
								Client.sprite_loader.method1734(rectangle.x, rectangle.width, rectangle.y, (byte) 58,
										-1996553985, rectangle.height);
						}
					}
					if (Class241.method1547(-64))
						Class245.drawConsole(Client.sprite_loader, 8);
					if ((gameState != 30 && (gameState ^ 0xffffffff) != -11)
							|| (Class210_Sub2.anInt5022 ^ 0xffffffff) != -1 || Client.get_frame_mode((byte) -123) != 1
							|| bool_4_ || !Signlink.aString731.equals("1.1")) {
						if ((gameState ^ 0xffffffff) != -1) {
							Client.sprite_loader.method1688();
							for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (SequenceType.anInt1738 ^ 0xffffffff)); i_8_++)
								Class246_Sub28_Sub24.aBoolArray6673[i_8_] = false;
						}
					} else {
						int i_9_ = 0;
						for (int i_10_ = 0; i_10_ < SequenceType.anInt1738; i_10_++) {
							if (Class246_Sub28_Sub24.aBoolArray6673[i_10_]) {
								Class246_Sub28_Sub24.aBoolArray6673[i_10_] = false;
								Class203.aRectangleArray2878[i_9_++] = (Class246_Sub28_Sub22.aRectangleArray6629[i_10_]);
							}
						}
						Client.sprite_loader.method1731(Class203.aRectangleArray2878, i_9_);
						callbacks.drawAboveOverheads();
					}
					if (((((Renderer) Client.current_renderer).anInt584) ^ 0xffffffff) != -1) {
						if ((((Renderer) Client.current_renderer).anInt584 ^ 0xffffffff) != -2) {
							if (((Renderer) (Client.current_renderer)).anInt584 == 2)
								Class247.method1580(5L, -5184);
							else if (((((Renderer) (Client.current_renderer)).anInt584) ^ 0xffffffff) == -4)
								Class247.method1580(2L, -5184);
						} else
							Class247.method1580(10L, -5184);
					} else
						Class247.method1580(15L, -5184);
					if (Class4.aBool52)
						Class104.method669(-2);
					if (!(((Renderer) Client.current_renderer).safe_mode) || gameState != 10
							|| Widget.root_interface == -1)
						break;
					((Renderer) Client.current_renderer).safe_mode = false;
					Client.current_renderer.save_preferences(Client.sign_link);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.MA(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean hidden_widget(Widget class235) {
		if (RenderSequenceLoader.aBool1452) {
			if (((ClickMaskNode) Widget.get_active_properties(class235)).anInt4893 != 0)
				return false;
			if (class235.type == 0)
				return false;
		}
		return class235.hidden;
	}

	void processGameLoop(byte i) {
		try {
			callbacks.tick();
			anInt7247++;
			try {
				if (i == 57)
					method2970(i - 57);
			} catch (OutOfMemoryError outofmemoryerror) {
				if (outofmemoryerror.getMessage() != null && outofmemoryerror.getMessage().startsWith("native")) {
					Class129.method883(0, (byte) 51);
					Class194_Sub1.method1883(outofmemoryerror,
							(outofmemoryerror.getMessage() + " (Recovered) " + method2953((byte) -76)), -80);
				} else
					throw outofmemoryerror;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.P(" + i + ')');
		}
	}

	static final void method2967(int i) {
		int i_11_ = Class246_Sub4.anInt3869;
		int[] is = Class53.anIntArray755;
		int i_12_ = Class38.aBool563 ? i_11_ : i_11_ + Class5.anInt55;
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			Entity class_r;
			if (i_13_ < i_11_)
				class_r = Class143.players[is[i_13_]];
			else
				class_r = (VarcLoader.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i_13_ - i_11_]]);
			if (((Class59_Sub3) class_r).current_plane == i) {
				((Entity) class_r).anInt6463 = 0;
				if (((Entity) class_r).anInt6431 < 0)
					((Entity) class_r).aBool6441 = false;
				else {
					int i_14_ = class_r.method2670((byte) 127);
					if ((i_14_ & 0x1) == 0) {
						if ((((Class59_Sub3) class_r).x & 0x7f) != 0
								|| ((((Class59_Sub3) class_r).y & 0x7f) != 0)) {
							((Entity) class_r).aBool6441 = false;
							continue;
						}
					} else if (((((Class59_Sub3) class_r).x & 0x7f) != 64)
							|| ((((Class59_Sub3) class_r).y & 0x7f) != 64)) {
						((Entity) class_r).aBool6441 = false;
						continue;
					}
					if (i_14_ == 1) {
						int i_15_ = ((Class59_Sub3) class_r).x >> 7;
						int i_16_ = ((Class59_Sub3) class_r).y >> 7;
						if (((Entity) class_r).anInt6431 != Class24.anIntArrayArray348[i_15_][i_16_]) {
							((Entity) class_r).aBool6441 = true;
							continue;
						}
						if (Class246_Sub6.anIntArrayArray3944[i_15_][i_16_] > 1) {
							Class246_Sub6.anIntArrayArray3944[i_15_][i_16_]--;
							((Entity) class_r).aBool6441 = true;
							continue;
						}
					} else {
						int i_17_ = (i_14_ - 1) * 64 + 60;
						int i_18_ = ((Class59_Sub3) class_r).x - i_17_ >> 7;
						int i_19_ = ((Class59_Sub3) class_r).y - i_17_ >> 7;
						int i_20_ = ((Class59_Sub3) class_r).x + i_17_ >> 7;
						int i_21_ = ((Class59_Sub3) class_r).y + i_17_ >> 7;
						if (!Class159.method1055(i_21_, i_19_, i_20_, ((Entity) class_r).anInt6431, -2, i_18_)) {
							for (int i_22_ = i_18_; i_22_ <= i_20_; i_22_++) {
								for (int i_23_ = i_19_; i_23_ <= i_21_; i_23_++) {
									if (((Entity) class_r).anInt6431 == (Class24.anIntArrayArray348[i_22_][i_23_]))
										Class246_Sub6.anIntArrayArray3944[i_22_][i_23_]--;
								}
							}
							((Entity) class_r).aBool6441 = true;
							continue;
						}
					}
					if (class_r instanceof Player && ((Entity) class_r).f_pc != null
							&& (Client.cycle >= (((Class246_Sub16) ((Entity) class_r).f_pc).anInt4523))
							&& (Client.cycle < (((Class246_Sub16) ((Entity) class_r).f_pc).anInt4535)))
						((Player) (Player) class_r).f_ld = false;
					((Entity) class_r).aBool6441 = false;
					((Class59_Sub3) class_r).anInt5052 = Class6.getAverageHeight(((Class59_Sub3) class_r).x,
							107, ((Class59_Sub3) class_r).current_plane, ((Class59_Sub3) class_r).y);
					Class176.method1156(class_r, true);
				}
			}
		}
	}

	final String method2953(byte i) {
		try {
			f_ib++;
			String string = null;
			try {
				string = ("[1)" + Client.base_x + "," + Client.base_y + "," + Class38_Sub1_Sub1.anInt6770
						+ "," + Class152.anInt2205 + "|");
				if (Client.local_player != null)
					string += ("2)" + Class246_Sub28_Sub24.anInt6681 + ","
							+ (Client.base_x + (((Entity) Client.local_player).f_mc[0])) + ","
							+ (((Entity) Client.local_player).f_nc[0] + Client.base_y) + "|");
				string += ("3)" + Buffer.anInt5656 + "|4)" + (((Renderer) Client.current_renderer).anInt588) + "|5)"
						+ Client.get_frame_mode((byte) -123) + "|6)" + Client.client_width + "," + Client.client_height
						+ "|");
				string += "7)" + Client.current_renderer.method275(29083, Buffer.anInt5656) + "|";
				string += ("8)" + Client.current_renderer.method271(Buffer.anInt5656, (byte) -28) + "|");
				string += "9)" + ((Renderer) (Client.current_renderer)).aBool574 + "|";
				string += "10)" + (((Renderer) Client.current_renderer).texture) + "|";
				string += "11)" + (((Renderer) Client.current_renderer).aBool596) + "|";
				string += "12)" + Client.current_renderer.method2052(Buffer.anInt5656, 108) + "|";
				string += "13)" + Class40_Sub2.anInt4047 + "|";
				if (i != -76)
					f_fb = null;
				try {
					string += "|15)" + jagmisc.getTotalPhysicalMemory();
				} catch (Throwable throwable) {
					/* empty */
				}
				string += "]";
			} catch (Throwable throwable) {
				/* empty */
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.U(" + i + ')');
		}
	}

	private final void method2968(int i) {
		do {
			try {
				f_lb++;
				Class246_Sub17.anInt4663++;
				Class64_Sub1.method2219(-1, (byte) -82, null, -1);
				Class19.method190(i ^ 0x1248, null, -1, -1);
				Class59_Sub2.method2022(i ^ ~0x12a4);
				Client.cycleCntr++;
				for (int i_24_ = 0; i_24_ < 32768; i_24_++) {
					Npc class_r_sub2 = VarcLoader.aClass_r_Sub2Array1002[i_24_];
					if (class_r_sub2 != null) {
						byte i_25_ = ((NpcType) (((Npc) class_r_sub2).aClass253_7184)).aByte3609;
						if ((0x1 & i_25_) != 0) {
							int i_26_ = class_r_sub2.method2670((byte) 127);
							if ((i_25_ & 0x2 ^ 0xffffffff) != -1 && (((Entity) class_r_sub2).f_oc ^ 0xffffffff) == -1
									&& Math.random() * 1000.0 < 10.0) {
								int i_27_ = (int) Math.round(Math.random() * 10.0 - 5.0);
								int i_28_ = (int) Math.round(Math.random() * 10.0 - 5.0);
								if (i_27_ != 0 || (i_28_ ^ 0xffffffff) != -1) {
									int i_29_ = (((Entity) class_r_sub2).f_mc[0] - -i_27_);
									if ((i_29_ ^ 0xffffffff) <= -1) {
										if ((-1 + (-i_26_ + (Class38_Sub1_Sub1.anInt6770)) ^ 0xffffffff) > (i_29_
												^ 0xffffffff))
											i_29_ = -i_26_ + (Class38_Sub1_Sub1.anInt6770) - 1;
									} else
										i_29_ = 0;
									int i_30_ = (((Entity) class_r_sub2).f_nc[0] + i_28_);
									if (i_30_ >= 0) {
										if (i_30_ > -1 + -i_26_ + Class152.anInt2205)
											i_30_ = -1 + (-i_26_ + Class152.anInt2205);
									} else
										i_30_ = 0;
									int i_31_ = (CS2Script.method2416((byte) -69,
											(Class95.aClass199Array1235[(((Class59_Sub3) class_r_sub2).current_plane)]),
											((Entity) class_r_sub2).f_mc[0], i_29_, i_26_, i_30_, i_26_, 0,
											Class246_Sub4.anIntArray3865, 0, true, Class220.anIntArray3049,
											((Entity) class_r_sub2).f_nc[0], i_26_, -1));
									if ((i_31_ ^ 0xffffffff) < -1) {
										if (i_31_ > 9)
											i_31_ = 9;
										for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
											((Entity) class_r_sub2).f_mc[i_32_] = (Class220.anIntArray3049[-1
													+ (i_31_ - i_32_)]);
											((Entity) class_r_sub2).f_nc[i_32_] = (Class246_Sub4.anIntArray3865[i_31_
													- (i_32_ + 1)]);
											((Entity) class_r_sub2).f_rc[i_32_] = (byte) 1;
										}
										((Entity) class_r_sub2).f_oc = i_31_;
									}
								}
							}
							Class221.method1432(-47, true, class_r_sub2);
							int i_33_ = Class246_Sub41_Sub1.method2585((byte) -17, class_r_sub2);
							Class128_Sub2.method2334(class_r_sub2, (RuntimeException_Sub2.anInt7150), Class_e.anInt1218,
									i_33_, i + 4536);
							FloorDefinition.method1360(class_r_sub2, i + 4532);
						}
					}
				}
				if (i != -4645)
					method2980();
				if (LoginScreen.loginResponse == 0 && (ObjType.anInt2815 ^ 0xffffffff) == -1) {
					if (Class130_Sub3.anInt4417 != 2)
						Class246_Sub30.method2156(true);
					else
						Class179.method1173(488012003);
					if (Class246_Sub16.aInt92 >> 7 < 14
							|| (Class38_Sub1_Sub1.anInt6770 - 14 <= Class246_Sub16.aInt92 >> 7)
							|| (Class259_Sub1.anInt4509 >> 7 ^ 0xffffffff) > -15
							|| (Class259_Sub1.anInt4509 >> 7 >= -14 + Class152.anInt2205))
						Stream_Sub1.method2475(-12319);
				}
				for (;;) {
					ScriptEvent class246_sub29 = ((ScriptEvent) Class128.aClass166_1796.method1100(i ^ ~0x1ddb));
					if (class246_sub29 == null)
						break;
					Widget class235 = class246_sub29.source;
					if ((class235.index ^ 0xffffffff) <= -1) {
						Widget class235_34_ = Widget.get_widget((class235.parent_id), class235.revision);
						if (class235_34_ == null || ((Widget) class235_34_).components == null
								|| (((Widget) class235_34_).components.length <= class235.index)
								|| (((Widget) class235_34_).components[class235.index]) != class235)
							continue;
					}
					ScriptExecutor.excute_script_event(class246_sub29, class235);
				}
				for (;;) {
					ScriptEvent class246_sub29 = (ScriptEvent) Class246_Sub28_Sub2.aClass166_5809.method1100(4095);
					if (class246_sub29 == null)
						break;
					Widget class235 = class246_sub29.source;
					if (class235.index >= 0) {
						Widget class235_35_ = Widget.get_widget((class235.parent_id), class235.revision);
						if (class235_35_ == null || ((Widget) class235_35_).components == null
								|| ((((Widget) class235_35_).components.length ^ 0xffffffff) >= (class235.index
										^ 0xffffffff))
								|| class235 != (((Widget) class235_35_).components[class235.index]))
							continue;
					}
					ScriptExecutor.excute_script_event(class246_sub29, class235);
				}
				for (;;) {
					ScriptEvent script_event = (ScriptEvent) Client.low_priority_script_events.method1100(4095);
					if (script_event == null)
						break;
					Widget class235 = script_event.source;
					if ((class235.index ^ 0xffffffff) <= -1) {
						Widget class235_36_ = Widget.get_widget((class235.parent_id), class235.revision);
						if (class235_36_ == null || ((Widget) class235_36_).components == null
								|| ((class235.index ^ 0xffffffff) <= (((Widget) class235_36_).components.length
										^ 0xffffffff))
								|| class235 != (((Widget) class235_36_).components[class235.index]))
							continue;
					}
					ScriptExecutor.excute_script_event(script_event, class235);
				}
				if (Class150.aClass235_2196 != null)
					Class_a.method574(i + 4536);
				if (Client.cycle % 1500 == 0)
					Class188.method1231((byte) 105);
				Class209.method1369(0);
				if (!Class246_Sub28_Sub10.aBool6159 || ((-60000L + TimeUtility.time()
						^ 0xffffffffffffffffL) >= (PacketsDecoder.aLong273 ^ 0xffffffffffffffffL)))
					break;
				Class173.method1136(-22125);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	static final int method2969(int i, byte i_37_) {
		try {
			f_jb++;
			if ((i ^ 0xffffffff) > -97)
				return 0;
			if (i < 128)
				return 2;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.IA(" + i + ',' + i_37_ + ')');
		}
	}

	private final void method2970(int i) {
		try {
			f_eb++;
			if (gameState != 1000) {
				Client.cycle++;
				if ((Client.cycle % 1000 ^ 0xffffffff) == -2) {
					GregorianCalendar gregoriancalendar = new GregorianCalendar();
					Class129.anInt1809 = (gregoriancalendar.get(11) * 600
							- (-(gregoriancalendar.get(12) * 10) + -(gregoriancalendar.get(13) / 6)));
					Class246_Sub34.aRandom5144.setSeed((long) Class129.anInt1809);
				}
				if ((Client.cycle % 50) == 0) {

					Class257.anInt3686 = Class34.anInt454;
					Class246_Sub1_Sub5.anInt5847 = Class246_Sub28_Sub11.anInt6167;
					Class34.anInt454 = 0;
					Class246_Sub28_Sub11.anInt6167 = 0;
				}
				if ((Client.cycle % 25) == 0) {
					if (!LoginScreen.loggedIn) {
						LoginScreen.draw_current_state();
					}
				}
				method2983((byte) -64);
				if (Class194_Sub1.aClass142_4140 != null)
					Class194_Sub1.aClass142_4140.method960(93);
				Class121.method821((byte) 76);
				Class216.aClass232_3009.method1486(28);
				Material.aClass102_3360.method642(-126);
				if (Player.f_rd != null) {
					int i_39_ = Player.f_rd.method493((byte) 124);
					Class246_Sub41.anInt5531 = i_39_;
				}
				if (Client.sprite_loader != null)
					Client.sprite_loader.method1687((int) TimeUtility.time());
				Class246_Sub19.method2068(true);
				Client.total_characters = i;
				for (Class188 class188 = Class216.aClass232_3009.method1482(i ^ 0x68c1); (class188 != null
						&& (Client.total_characters ^ 0xffffffff) > -129); class188 = Class216.aClass232_3009
								.method1482(26817)) {
					if (class188.method1232(i + 69) != 1) {
						int i_40_ = class188.method1236();
						if (!Class246_Sub28_Sub34.method2872(true) || i_40_ != 96 && (i_40_ ^ 0xffffffff) != -168) {
							Client.characters[Client.total_characters] = class188;
							Client.total_characters++;
						} else if (Class241.method1547(-79))
							Class245.method1574(i ^ 0x23);
						else
							Class246_Sub28_Sub24.method2737(i - 86);
					}
				}
				for (Class246_Sub30 class246_sub30 = Material.aClass102_3360
						.method638((byte) -80); class246_sub30 != null; class246_sub30 = Material.aClass102_3360
								.method638((byte) -87)) {
					int i_41_ = class246_sub30.method2157((byte) 102);
					if (i_41_ != -1) {
						if (Class56.method389((byte) 126, i_41_))
							Widget.f_qb.push_head(class246_sub30);
					} else
						Class246_Sub28_Sub30.aClass166_6865.push_head(class246_sub30);
					if ((Widget.f_qb.method1112(0) ^ 0xffffffff) < -11)
						Widget.f_qb.method1100(4095);
				}
				if (Class241.method1547(-103))
					Class246_Sub28_Sub18.method2688((byte) 122);
				if ((gameState ^ 0xffffffff) != -1) {
					if ((gameState ^ 0xffffffff) == -6) {
						TitleScreen.start();
						Class187_Sub1.method2109((byte) 107);
					} else if ((gameState ^ 0xffffffff) == -26 || (gameState ^ 0xffffffff) == -29) {
						Texture.method2695((byte) 125);
					}
				} else {
					TitleScreen.start();
					Class187_Sub1.method2109((byte) 127);
				}
				if ((gameState ^ 0xffffffff) != -11) {
					if (gameState != 30) {
						if (gameState == 40) {
							Class246_Sub28_Sub35.login(i + 117);
							if ((Class246_Sub31.anInt5034 ^ 0xffffffff) != 2
									&& ((Class246_Sub31.anInt5034 ^ 0xffffffff) != -3)
									&& Class246_Sub31.anInt5034 != 15)
								RenderAnimation.logout(2700);
						}
					} else
						Class248.method1584(12362);
				} else {
					method2968(i ^ ~0x1224);
					Class217.method1409(true);
					Class154.method1017(i - 5);
					Class246_Sub28_Sub35.login(-50);
				}
				Class45.method307(Client.sprite_loader, false);
				Widget.f_qb.method1100(4095);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.TA(" + i + ')');
		}
	}

	public void supplyApplet(Applet applet) {
		try {
			Client.sign_link.anApplet733 = applet;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public final void init() {
		try {
			ClientParams.setWorld("1");
			ClientParams.setParams();
			final Signlink signlink = new Signlink(this, 32, GameConstants.NAME, io.Constants.MAX_INDEX_COUNT);
			RuneLiteApplet.elderApplet = this;
			GameEngine.providesignlink(signlink);
			f_cb++;
			Class58.anInt816 = Integer.parseInt((String) ClientParams.params.get("worldid"));
			Class260_Sub2.aClass205_4297 = (Class173.method1142(Integer.parseInt((String) ClientParams.params.get("modewhere")),
					true));
			if (!Class59_Sub1_Sub3.method2642(Class260_Sub2.aClass205_4297, (byte) -112)
					&& Class208.aClass205_2930 != Class260_Sub2.aClass205_4297)
				Class260_Sub2.aClass205_4297 = Class208.aClass205_2930;
			Class259.aClass97_3707 = (Class157.method1038(0, Integer.parseInt((String) ClientParams.params.get("modewhat"))));
			if (Class259.aClass97_3707 != Class37.aClass97_544 && Class259.aClass97_3707 != Class189.aClass97_2666
					&& (Class259.aClass97_3707 != SubIncomingPacket.aClass97_7088))
				Class259.aClass97_3707 = SubIncomingPacket.aClass97_7088;
			try {
				Preferences.language_code = Integer.parseInt((String) ClientParams.params.get("lang"));
			} catch (Exception exception) {
				Preferences.language_code = 0;
			}
			String string = (String) ClientParams.params.get("objecttag");
			if (string == null || !string.equals("1"))
				Class88.aBool1151 = false;
			else
				Class88.aBool1151 = true;
			String string_42_ = (String) ClientParams.params.get("js");
			if (string_42_ != null && string_42_.equals("1"))
				Class106_Sub2.aBool5333 = true;
			else
				Class106_Sub2.aBool5333 = false;
			String string_43_ = (String) ClientParams.params.get("advert");
			if (string_43_ != null && string_43_.equals("1"))
				Class166.aBool2357 = true;
			else
				Class166.aBool2357 = false;
			String string_44_ = (String) ClientParams.params.get("game");
			if (string_44_ == null || !string_44_.equals("1"))
				Class59_Sub4_Sub3.aClass101_6943 = Class246_Sub28_Sub16.aClass101_6394;
			else
				Class59_Sub4_Sub3.aClass101_6943 = Class40_Sub6.aClass101_5092;
			try {
				Class109_Sub4.anInt4573 = Integer.parseInt((String) ClientParams.params.get("affid"));
			} catch (Exception exception) {
				Class109_Sub4.anInt4573 = 0;
			}
			Class59_Sub2.aString4546 = (String) ClientParams.params.get("quiturl");
			Class246_Sub5.aString3891 = (String) ClientParams.params.get("settings");
			if (Class246_Sub5.aString3891 == null)
				Class246_Sub5.aString3891 = "";
			String string_45_ = (String) ClientParams.params.get("country");
			if (string_45_ != null) {
				try {
					Class122.anInt1680 = Integer.parseInt(string_45_);
				} catch (Exception exception) {
					Class122.anInt1680 = 0;
				}
			}
			StructType.anInt6859 = Integer.parseInt((String) ClientParams.params.get("colourid"));
			if (StructType.anInt6859 < 0
					|| ((Class59_Sub3_Sub2.f_cb.length ^ 0xffffffff) >= (StructType.anInt6859 ^ 0xffffffff)))
				StructType.anInt6859 = 0;
			if (Integer.parseInt((String) ClientParams.params.get("sitesettings_member")) == 1)
				Class246_Sub23.aBool4817 = AbstractModel.aBool1431 = true;
			Client.instance = this;
			if (Class246_Sub28_Sub16.aClass101_6394 == Class59_Sub4_Sub3.aClass101_6943) {
				Class196.anInt2757 = 765;
				Class83.anInt1090 = 503;
			} else if (Class40_Sub6.aClass101_5092 == Class59_Sub4_Sub3.aClass101_6943) {
				Class83.anInt1090 = 480;
				Class196.anInt2757 = 640;
			}
			this.startThread(592, Class259.aClass97_3707.method616(false) + 32, Class83.anInt1090, Class196.anInt2757,
					(byte) -107);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static final void render_widget(Widget[] class235s, int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_,
			int i_51_, int i_52_, int i_53_) {
		for (int child_index = 0; child_index < class235s.length; child_index++) {
			Widget widget = class235s[child_index];
			if (widget != null && widget.parent_id == i) {
				int i_55_ = widget.x + i_50_;
				int i_56_ = widget.y + i_51_;
				int i_57_;
				int i_58_;
				int i_59_;
				int i_60_;
				if (widget.type == 2) {
					i_57_ = i_46_;
					i_58_ = i_47_;
					i_59_ = i_48_;
					i_60_ = i_49_;
				} else {
					int i_61_ = i_55_ + widget.screen_width;
					int i_62_ = i_56_ + widget.screen_height;
					if (widget.type == 9) {
						i_61_++;
						i_62_++;
					}
					i_57_ = i_55_ > i_46_ ? i_55_ : i_46_;
					i_58_ = i_56_ > i_47_ ? i_56_ : i_47_;
					i_59_ = i_61_ < i_48_ ? i_61_ : i_48_;
					i_60_ = i_62_ < i_49_ ? i_62_ : i_49_;
				}
				if (widget.type != 0 && !widget.has_listener
						&& ((ClickMaskNode) Widget.get_active_properties(widget)).anInt4893 == 0
						&& widget != Class33.aClass235_445 && (widget.content_type != 1338)) {

					if (i_57_ < i_59_ && i_58_ < i_60_)
						Renderer.method272(widget, 2);
				} else if (!hidden_widget(widget)) {

					if (widget == Class150.aClass235_2196) {
						Class64_Sub1.aBool5240 = true;
						Class134.anInt1873 = i_55_;
						Class259_Sub3_Sub1.anInt6903 = i_56_;
					}

					if (widget.f_bd || i_57_ < i_59_ && i_58_ < i_60_) {

						if (widget.no_click_through && i_52_ >= i_57_ && i_53_ >= i_58_ && i_52_ < i_59_
								&& i_53_ < i_60_) {
							for (ScriptEvent script_event = (ScriptEvent) Client.low_priority_script_events.method1104(
									124); script_event != null; script_event = ((ScriptEvent) Client.low_priority_script_events
											.method1108((byte) -112))) {
								if (script_event.aBool4964) {
									script_event.remove();
									((Widget) (script_event.source)).aBool3219 = false;
								}
							}
							if (SequenceLoader.anInt6734 == 0) {
								Class150.aClass235_2196 = null;
								Class33.aClass235_445 = null;
							}
							Class59_Sub3_Sub2.f_db = 0;
							Class246_Sub28_Sub34.aBool7008 = false;
							Font.aBool1620 = false;
							if (!ContextMenus.context_menu_open)
								Class109_Sub1_Sub1.method2756(-19);
						}
						boolean bool;
						if ((Material.aClass102_3360.method640((byte) 58) >= i_57_)
								&& Material.aClass102_3360.method636(3045) >= i_58_
								&& (Material.aClass102_3360.method640((byte) 58) < i_59_)
								&& Material.aClass102_3360.method636(3045) < i_60_)
							bool = true;
						else
							bool = false;
						if (!Class187.aBool2653 && bool) {
							if (widget.anInt3233 >= 0)
								Class83.anInt1089 = widget.anInt3233;
							else if (widget.no_click_through)
								Class83.anInt1089 = -1;
						}
						if (!ContextMenus.context_menu_open && i_52_ >= i_57_ && i_53_ >= i_58_ && i_52_ < i_59_
								&& i_53_ < i_60_)
							Class259_Sub2.method2147((byte) 118, widget, i_52_ - i_55_, i_53_ - i_56_);
						boolean bool_63_ = false;
						if (Material.aClass102_3360.method641(2) && bool)
							bool_63_ = true;
						boolean bool_64_ = false;
						Class246_Sub30 class246_sub30 = (Class246_Sub30) Widget.f_qb.method1104(37);
						if (class246_sub30 != null && class246_sub30.method2157((byte) 102) == 0
								&& class246_sub30.method2160(65) >= i_57_
								&& class246_sub30.method2161((byte) -92) >= i_58_
								&& class246_sub30.method2160(44) < i_59_
								&& class246_sub30.method2161((byte) -81) < i_60_)
							bool_64_ = true;
						if (widget.aByteArray3214 != null) {
							for (int i_65_ = 0; i_65_ < (widget.aByteArray3214).length; i_65_++) {
								if (!Class216.aClass232_3009.method1488(-86, (widget.aByteArray3214[i_65_]))) {
									if (widget.anIntArray3202 != null)
										widget.anIntArray3202[i_65_] = 0;
								} else if ((widget.anIntArray3202) == null
										|| (Client.cycle >= (widget.anIntArray3202[i_65_]))) {
									byte i_66_ = (widget.aByteArray3291[i_65_]);
									if (i_66_ == 0
											|| (((i_66_ & 0x8) == 0 || (!Class216.aClass232_3009.method1488(-94, 86)
													&& !Class216.aClass232_3009.method1488(-128, 82)
													&& !Class216.aClass232_3009.method1488(-90, 81)))
													&& ((i_66_ & 0x2) == 0
															|| Class216.aClass232_3009.method1488(-73, 86))
													&& ((i_66_ & 0x1) == 0
															|| Class216.aClass232_3009.method1488(-85, 82))
													&& ((i_66_ & 0x4) == 0
															|| (Class216.aClass232_3009.method1488(-110, 81))))) {
										if (i_65_ < 10)
											Widget.some_widget(true, i_65_ + 1, "", (widget.hash), -1, widget.revision);
										else if (i_65_ == 10) {
											Class59_Sub4.method2209((byte) -97);
											ClickMaskNode class246_sub27 = Widget.get_active_properties(widget);
											Class155.method1029(((ClickMaskNode) class246_sub27).anInt4898,
													class246_sub27.get_widget_flags(16693), widget, (byte) -38);
											Class218.aString3026 = (Class179.method1174(widget, (byte) 120));
											if (Class218.aString3026 == null)
												Class218.aString3026 = "Null";
											Class246_Sub7.aString3964 = (widget.data_text + "<col=ffffff>");
										}
										int i_67_ = (widget.f_ed[i_65_]);
										if ((widget.anIntArray3202) == null)
											widget.anIntArray3202 = (new int[(widget.aByteArray3214).length]);
										if (i_67_ != 0)
											widget.anIntArray3202[i_65_] = (Client.cycle + i_67_);
										else
											widget.anIntArray3202[i_65_] = 2147483647;
									}
								}
							}
						}
						if (bool_64_)
							Widget.click_widget(widget, class246_sub30.method2160(92) - i_55_,
									class246_sub30.method2161((byte) -81) - i_56_,
									0);
						if (Class150.aClass235_2196 != null && Class150.aClass235_2196 != widget && bool
								&& Widget.get_active_properties(widget).method2119(109))
							Class_ls.aClass235_964 = widget;
						if (widget == Class33.aClass235_445) {
							Class259_Sub3.aBool5355 = true;
							SceneGraph.anInt3722 = i_55_;
							Class208.anInt2937 = i_56_;
						}
						if (widget.has_listener || widget.content_type != 0) {
							if (bool && Class246_Sub41.anInt5531 != 0 && widget.on_mouse_wheel_listener != null) {
								ScriptEvent class246_sub29 = new ScriptEvent();
								class246_sub29.aBool4964 = true;
								class246_sub29.source = widget;
								class246_sub29.mouse_y = Class246_Sub41.anInt5531;
								class246_sub29.params = widget.on_mouse_wheel_listener;
								Client.low_priority_script_events.push_head(class246_sub29);
							}
							if (Class150.aClass235_2196 != null || ContextMenus.context_menu_open
									|| ((widget.content_type != 1400) && Class59_Sub3_Sub2.f_db > 0)) {
								bool_64_ = false;
								bool_63_ = false;
								bool = false;
							}
							if (widget.content_type != 0) {
								if ((widget.content_type == Class246_Sub1_Sub3.anInt5719)
										|| (widget.content_type == Class18.anInt268)) {
									Class104.f_vb = widget;
									if (Class_u_Sub1.aClass230_5685 != null)
										Class_u_Sub1.aClass230_5685.method1471((byte) -10, widget.screen_height,
												Client.sprite_loader);
									if (widget.content_type == Class246_Sub1_Sub3.anInt5719) {
										if (!ContextMenus.context_menu_open && i_52_ >= i_57_ && i_53_ >= i_58_
												&& i_52_ < i_59_ && i_53_ < i_60_) {
											Class246_Sub28_Sub13.method2623(-1, Client.sprite_loader, i_52_, i_53_);
											for (Class130_Sub4 class130_sub4 = ((Class130_Sub4) HashMap.aClass68_762
													.method445(
															62)); class130_sub4 != null; class130_sub4 = ((Class130_Sub4) (HashMap.aClass68_762
																	.method442((byte) -115)))) {
												if (i_52_ >= (((Class130_Sub4) class130_sub4).anInt4737)
														&& (i_52_ < (((Class130_Sub4) class130_sub4).anInt4741))
														&& (i_53_ >= (((Class130_Sub4) class130_sub4).anInt4743))
														&& (i_53_ < (((Class130_Sub4) class130_sub4).anInt4739))) {
													Class109_Sub1_Sub1.method2756(-22);
													Class246_Sub13.method1990(
															(((Class130_Sub4) class130_sub4).aClass_r4744), true);
												}
											}
										}
										Class64_Sub1.method2219(i_56_, (byte) -82, widget, i_55_);
										continue;
									}
								}
								if (widget.content_type == 1338) {
									if ((true)
											&& (Class246_Sub28_Sub13.anInt6293 == 0
													|| (Class246_Sub28_Sub13.anInt6293 == 3))
											&& !ContextMenus.context_menu_open && i_52_ >= i_57_ && i_53_ >= i_58_
											&& i_52_ < i_59_ && i_53_ < i_60_) {
										int i_68_ = i_52_ - i_55_;
										int i_69_ = i_53_ - i_56_;
										int i_70_ = (widget.f_ld[i_69_]);
										if (i_68_ >= i_70_ && i_68_ <= i_70_ + (widget.f_hc[i_69_])) {
											i_68_ -= (widget.screen_width / 2);
											i_69_ -= (widget.screen_height / 2);
											int i_71_;
											if (Class130_Sub3.anInt4417 == 4)
												i_71_ = ((int) (Camera.camera_yaw) & 0x3fff);
											else
												i_71_ = (((int) (Camera.camera_yaw) + Class95.anInt1253) & 0x3fff);
											int i_72_ = MathUtils.SINE[i_71_];
											int i_73_ = (MathUtils.COSINE[i_71_]);
											if (Class130_Sub3.anInt4417 != 4) {
												i_72_ = i_72_ * ((Class246_Sub12.anInt4405) + 256) >> 8;
												i_73_ = i_73_ * ((Class246_Sub12.anInt4405) + 256) >> 8;
											}
											int i_74_ = ((i_69_ * i_72_ + i_68_ * i_73_) >> 15);
											int i_75_ = ((i_69_ * i_73_ - i_68_ * i_72_) >> 15);
											int i_76_;
											int i_77_;
											if (Class130_Sub3.anInt4417 == 4) {
												i_76_ = (Class242.anInt3424 >> 7) + (i_74_ >> 2);
												i_77_ = (Class246_Sub43.anInt5606 >> 7) - (i_75_ >> 2);
											} else {
												int i_78_ = ((Client.local_player.method2670((byte) 127)) - 1)
														* 64;
												i_76_ = ((((Class59_Sub3) (Client.local_player)).x)
														- i_78_ >> 7) + (i_74_ >> 2);
												i_77_ = ((((Class59_Sub3) (Client.local_player)).y)
														- i_78_ >> 7) - (i_75_ >> 2);
											}
											if (Class187.aBool2653 && ((Node.anInt3469 & 0x40) != 0)) {
												Widget class235_79_ = (Widget.get_component(Class231.anInt3168,
														SubScript.anInt1161, widget.revision));
												if (class235_79_ != null)
													Class259_Sub2_Sub1.method2846(19, (byte) -55, false, 1L, i_76_,
															" ->", true, Class218.aString3026, i_77_,
															(widget.item_id), Tile.anInt2148);
												else
													Class59_Sub4.method2209((byte) -85);
											} else {
												if ((Class59_Sub4_Sub3.aClass101_6943) == (Class40_Sub6.aClass101_5092))
													Class259_Sub2_Sub1.method2846(59, (byte) -55, false, 1L, i_76_, "",
															true,
															(Texture.aClass67_6567.get(Preferences.language_code)),
															i_77_, -1, -1);
												Class259_Sub2_Sub1.method2846(44, (byte) -55, false, 1L, i_76_, "",
														true, Class91.walk_here, i_77_, -1,
														(Class246_Sub28_Sub20.anInt6572));
											}
										}
									}
									continue;
								}
								if (widget.content_type == 1400) {
									Class246_Sub11.aClass235_4106 = widget;
									if (bool)
										Class246_Sub28_Sub34.aBool7008 = true;
									if (bool_64_) {
										int i_80_ = (int) ((double) ((class246_sub30.method2160(93)) - i_55_
												- (widget.screen_width) / 2) * 2.0 / (double) (Class79.aFloat1033));
										int i_81_ = (int) -((double) ((class246_sub30.method2161((byte) -84)) - i_56_
												- (widget.screen_height) / 2) * 2.0 / (double) (Class79.aFloat1033));
										int i_82_ = (Class109_Sub1_Sub1.anInt6725 + i_80_ + Class79.anInt1057);
										int i_83_ = (Class21.anInt322 + i_81_ + Class79.anInt1041);
										Class246_Sub1_Sub5 class246_sub1_sub5 = Class58.method398((byte) -83);
										if (class246_sub1_sub5 != null) {
											int[] is = new int[3];
											class246_sub1_sub5.method2466(i_82_, is, (byte) 111, i_83_);
											if (is != null) {
												if (Class216.aClass232_3009.method1488(-111, 82)
														&& (Client.staff_level > 0)) {
													Class246_Sub41_Sub2.method2680(is[0], 63, is[2], is[1]);
													continue;
												}
												Font.aBool1620 = true;
												Class59_Sub1.anInt4513 = is[0];
												Class246_Sub28_Sub24.anInt6675 = is[1];
												Class128_Sub1.anInt5560 = is[2];
											}
											Class59_Sub3_Sub2.f_db = 1;
											Class56.aBool791 = false;
											Class99.anInt1292 = Material.aClass102_3360.method640((byte) 58);
											Class246_Sub43.anInt5605 = Material.aClass102_3360.method636(3045);
										}
									} else if (bool_63_ && Class59_Sub3_Sub2.f_db > 0) {
										if (Class59_Sub3_Sub2.f_db == 1
												&& ((Class99.anInt1292 != Material.aClass102_3360.method640((byte) 58))
														|| (Class246_Sub43.anInt5605 != (Material.aClass102_3360
																.method636(3045))))) {
											Class258.anInt3699 = Class109_Sub1_Sub1.anInt6725;
											Class246_Sub28_Sub6.anInt6046 = Class21.anInt322;
											Class59_Sub3_Sub2.f_db = 2;
										}
										if (Class59_Sub3_Sub2.f_db == 2) {
											Class56.aBool791 = true;
											NodeSub.method1757(
													(Class258.anInt3699 + (int) ((double) ((Class99.anInt1292)
															- (Material.aClass102_3360.method640((byte) 58))) * 2.0
															/ (double) (Class79.aFloat1036))),
													107);
											Class130_Sub8.method2348(-1,
													(Class246_Sub28_Sub6.anInt6046
															- (int) ((double) ((Class246_Sub43.anInt5605)
																	- (Material.aClass102_3360.method636(3045))) * 2.0
																	/ (double) (Class79.aFloat1036))));
										}
									} else {
										if (Class59_Sub3_Sub2.f_db > 0 && !Class56.aBool791) {
											if (((Class59_Sub3_Sub2.anInt5889 == 1) || Class84.method535((byte) -20))
													&& Class230.anInt3147 > 2)
												Class55.method386(84, Class99.anInt1292, Class246_Sub43.anInt5605);
											else if (Class7.method77(128))
												Class55.method386(108, Class99.anInt1292, Class246_Sub43.anInt5605);
										}
										Class59_Sub3_Sub2.f_db = 0;
									}
									continue;
								}
								if (widget.content_type == Class246_Sub18.anInt4676) {
									if (bool_63_)
										Class45.method302(widget.screen_width,
												Material.aClass102_3360.method640((byte) 58) - i_55_,
												widget.screen_height, Material.aClass102_3360.method636(3045) - i_56_,
												(byte) 76);
									continue;
								}
								if (widget.content_type == 1406) {
									Class19.method190(-122, widget, i_56_, i_55_);
									continue;
								}
							}
							if (!widget.f_rc && bool_64_) {
								widget.f_rc = true;
								if (widget.on_click_listener != null) {
									ScriptEvent script_event = new ScriptEvent();
									script_event.aBool4964 = true;
									script_event.source = widget;
									script_event.mouse_x = (class246_sub30.method2160(110) - i_55_);
									script_event.mouse_y = class246_sub30.method2161((byte) -114) - i_56_;
									script_event.params = (widget.on_click_listener);
									Client.low_priority_script_events.push_head(script_event);
								}
							}
							if (widget.f_rc && bool_63_ && widget.on_click_repeat_listener != null) {
								ScriptEvent script_event = new ScriptEvent();
								script_event.aBool4964 = true;
								script_event.source = widget;
								script_event.mouse_x = Material.aClass102_3360.method640((byte) 58) - i_55_;
								script_event.mouse_y = (Material.aClass102_3360.method636(3045) - i_56_);
								script_event.params = widget.on_click_repeat_listener;
								Client.low_priority_script_events.push_head(script_event);
							}
							if (widget.f_rc && !bool_63_) {
								widget.f_rc = false;
								if (widget.on_release_listener != null) {
									ScriptEvent script_event = new ScriptEvent();
									script_event.aBool4964 = true;
									script_event.source = widget;
									script_event.mouse_x = Material.aClass102_3360.method640((byte) 58) - i_55_;
									script_event.mouse_y = Material.aClass102_3360.method636(3045) - i_56_;
									script_event.params = (widget.on_release_listener);
									Class246_Sub28_Sub2.aClass166_5809.push_head(script_event);
								}
							}
							if (bool_63_ && widget.on_hold_listener != null) {
								ScriptEvent script_event = new ScriptEvent();
								script_event.aBool4964 = true;
								script_event.source = widget;
								script_event.mouse_x = Material.aClass102_3360.method640((byte) 58) - i_55_;
								script_event.mouse_y = (Material.aClass102_3360.method636(3045) - i_56_);
								script_event.params = widget.on_hold_listener;
								Client.low_priority_script_events.push_head(script_event);
							}
							if (!widget.aBool3219 && bool) {
								widget.aBool3219 = true;
								if (widget.on_mouse_over_listener != null) {
									ScriptEvent script_event = new ScriptEvent();
									script_event.aBool4964 = true;
									script_event.source = widget;
									script_event.mouse_x = Material.aClass102_3360.method640((byte) 58) - i_55_;
									script_event.mouse_y = Material.aClass102_3360.method636(3045) - i_56_;
									script_event.params = (widget.on_mouse_over_listener);
									Client.low_priority_script_events.push_head(script_event);
								}
							}
							if (widget.aBool3219 && bool && (widget.on_mouse_repeat_listener != null)) {
								ScriptEvent script_event = new ScriptEvent();
								script_event.aBool4964 = true;
								script_event.source = widget;
								script_event.mouse_x = Material.aClass102_3360.method640((byte) 58) - i_55_;
								script_event.mouse_y = (Material.aClass102_3360.method636(3045) - i_56_);
								script_event.params = widget.on_mouse_repeat_listener;
								Client.low_priority_script_events.push_head(script_event);
							}
							if (widget.aBool3219 && !bool) {
								widget.aBool3219 = false;
								if (widget.on_mouse_leave_listener != null) {
									ScriptEvent script_event = new ScriptEvent();
									script_event.aBool4964 = true;
									script_event.source = widget;
									script_event.mouse_x = Material.aClass102_3360.method640((byte) 58) - i_55_;
									script_event.mouse_y = Material.aClass102_3360.method636(3045) - i_56_;
									script_event.params = (widget.on_mouse_leave_listener);
									Class246_Sub28_Sub2.aClass166_5809.push_head(script_event);
								}
							}
							if (widget.on_loop_cycle_listener != null) {
								ScriptEvent script_event = new ScriptEvent();
								script_event.source = widget;
								script_event.params = widget.on_loop_cycle_listener;
								Class128.aClass166_1796.push_head(script_event);
							}
							if (widget.varc_change_listener != null
									&& (Class109_Sub1_Sub1.anInt6728 > widget.anInt3272)) {
								if ((widget.varc_change_triggers == null)
										|| ((Class109_Sub1_Sub1.anInt6728 - widget.anInt3272) > 32)) {
									ScriptEvent script_event = new ScriptEvent();
									script_event.source = widget;
									script_event.params = widget.varc_change_listener;
									Client.low_priority_script_events.push_head(script_event);
								} else {
									while_25_: for (int i_84_ = widget.anInt3272; i_84_ < Class109_Sub1_Sub1.anInt6728; i_84_++) {
										int i_85_ = (VarcLoader.anIntArray996[i_84_ & 0x1f]);
										for (int i_86_ = 0; i_86_ < (widget.varc_change_triggers).length; i_86_++) {
											if ((widget.varc_change_triggers[i_86_]) == i_85_) {
												ScriptEvent class246_sub29 = new ScriptEvent();
												class246_sub29.source = widget;
												class246_sub29.params = (widget.varc_change_listener);
												Client.low_priority_script_events.push_head(class246_sub29);
												break while_25_;
											}
										}
									}
								}
								widget.anInt3272 = Class109_Sub1_Sub1.anInt6728;
							}
							if (widget.varc_str_change_listener != null && (Texture.anInt6561 > widget.f_tb)) {
								if ((widget.varc_str_change_triggers == null)
										|| (Texture.anInt6561 - widget.f_tb) > 32) {
									ScriptEvent class246_sub29 = new ScriptEvent();
									class246_sub29.source = widget;
									class246_sub29.params = (widget.varc_str_change_listener);
									Client.low_priority_script_events.push_head(class246_sub29);
								} else {
									while_26_: for (int i_87_ = widget.f_tb; i_87_ < Texture.anInt6561; i_87_++) {
										int i_88_ = (Class149.anIntArray2194[i_87_ & 0x1f]);
										for (int i_89_ = 0; i_89_ < (widget.varc_str_change_triggers).length; i_89_++) {
											if ((widget.varc_str_change_triggers[i_89_]) == i_88_) {
												ScriptEvent class246_sub29 = new ScriptEvent();
												class246_sub29.source = widget;
												class246_sub29.params = (widget.varc_str_change_listener);
												Client.low_priority_script_events.push_head(class246_sub29);
												break while_26_;
											}
										}
									}
								}
								widget.f_tb = Texture.anInt6561;
							}
							if (widget.on_varp_update_listener != null && (ScriptEvent.anInt4981 > widget.anInt3288)) {
								if ((widget.varp_listener_triggers == null)
										|| ((ScriptEvent.anInt4981 - widget.anInt3288) > 32)) {
									ScriptEvent class246_sub29 = new ScriptEvent();
									class246_sub29.source = widget;
									class246_sub29.params = (widget.on_varp_update_listener);
									Client.low_priority_script_events.push_head(class246_sub29);
								} else {
									while_27_: for (int i_90_ = widget.anInt3288; i_90_ < ScriptEvent.anInt4981; i_90_++) {
										int i_91_ = (Class3.anIntArray27[i_90_ & 0x1f]);
										for (int i_92_ = 0; i_92_ < (widget.varp_listener_triggers).length; i_92_++) {
											if ((widget.varp_listener_triggers[i_92_]) == i_91_) {
												ScriptEvent class246_sub29 = new ScriptEvent();
												class246_sub29.source = widget;
												class246_sub29.params = (widget.on_varp_update_listener);
												Client.low_priority_script_events.push_head(class246_sub29);
												break while_27_;
											}
										}
									}
								}
								widget.anInt3288 = ScriptEvent.anInt4981;
							}
							if (widget.on_inventory_update_listener != null && (TextureLoader.anInt973 > widget.f_qc)) {
								if (widget.inventory_listener_triggers == null
										|| (TextureLoader.anInt973 - widget.f_qc) > 32) {
									ScriptEvent class246_sub29 = new ScriptEvent();
									class246_sub29.source = widget;
									class246_sub29.params = (widget.on_inventory_update_listener);
									Client.low_priority_script_events.push_head(class246_sub29);
								} else {
									while_28_: for (int i_93_ = widget.f_qc; i_93_ < TextureLoader.anInt973; i_93_++) {
										int i_94_ = (Class59_Sub4_Sub3.anIntArray6948[i_93_ & 0x1f]);
										for (int i_95_ = 0; i_95_ < (widget.inventory_listener_triggers).length; i_95_++) {
											if ((widget.inventory_listener_triggers[i_95_]) == i_94_) {
												ScriptEvent class246_sub29 = new ScriptEvent();
												class246_sub29.source = widget;
												class246_sub29.params = (widget.on_inventory_update_listener);
												Client.low_priority_script_events.push_head(class246_sub29);
												break while_28_;
											}
										}
									}
								}
								widget.f_qc = TextureLoader.anInt973;
							}
							if (widget.skill_listener_triggers != null && (Class189.anInt2671 > widget.anInt3263)) {
								if ((widget.on_skill_update_listener == null)
										|| ((Class189.anInt2671 - widget.anInt3263) > 32)) {
									ScriptEvent class246_sub29 = new ScriptEvent();
									class246_sub29.source = widget;
									class246_sub29.params = widget.skill_listener_triggers;
									Client.low_priority_script_events.push_head(class246_sub29);
								} else {
									while_29_: for (int i_96_ = widget.anInt3263; i_96_ < Class189.anInt2671; i_96_++) {
										int i_97_ = (Class246_Sub28_Sub2.anIntArray5807[i_96_ & 0x1f]);
										for (int i_98_ = 0; i_98_ < (widget.on_skill_update_listener).length; i_98_++) {
											if ((widget.on_skill_update_listener[i_98_]) == i_97_) {
												ScriptEvent class246_sub29 = new ScriptEvent();
												class246_sub29.source = widget;
												class246_sub29.params = (widget.skill_listener_triggers);
												Client.low_priority_script_events.push_head(class246_sub29);
												break while_29_;
											}
										}
									}
								}
								widget.anInt3263 = Class189.anInt2671;
							}
							if ((Client.chatCycle > widget.anInt3267) && (widget.on_game_message_received != null)) {
								ScriptEvent class246_sub29 = new ScriptEvent();
								class246_sub29.source = widget;
								class246_sub29.params = widget.on_game_message_received;
								Client.low_priority_script_events.push_head(class246_sub29);
							}
							if ((Class246_Sub1_Sub15.anInt6602 > widget.anInt3267)
									&& (widget.private_chat_update_listener != null)) {
								ScriptEvent class246_sub29 = new ScriptEvent();
								class246_sub29.source = widget;
								class246_sub29.params = widget.private_chat_update_listener;
								Client.low_priority_script_events.push_head(class246_sub29);
							}
							if ((Class214.anInt2991 > widget.anInt3267)
									&& widget.on_clan_chat_update_listener != null) {
								ScriptEvent class246_sub29 = new ScriptEvent();
								class246_sub29.source = widget;
								class246_sub29.params = widget.on_clan_chat_update_listener;
								Client.low_priority_script_events.push_head(class246_sub29);
							}
							if ((Class246_Sub23.anInt4821 > widget.anInt3267)
									&& (widget.on_stock_update_listener != null)) {
								ScriptEvent class246_sub29 = new ScriptEvent();
								class246_sub29.source = widget;
								class246_sub29.params = widget.on_stock_update_listener;
								Client.low_priority_script_events.push_head(class246_sub29);
							}
							if ((Class168.anInt2399 > widget.anInt3267)
									&& (widget.misc_information_update_listener != null)) {
								ScriptEvent class246_sub29 = new ScriptEvent();
								class246_sub29.source = widget;
								class246_sub29.params = widget.misc_information_update_listener;
								Client.low_priority_script_events.push_head(class246_sub29);
							}
							widget.anInt3267 = Client.cycleCntr;
							if (widget.key_pressed_listener != null) {
								for (int i_99_ = 0; i_99_ < Client.total_characters; i_99_++) {
									ScriptEvent class246_sub29 = new ScriptEvent();
									class246_sub29.source = widget;
									class246_sub29.anInt4978 = Client.characters[i_99_].method1233((byte) 108);
									class246_sub29.anInt4973 = Client.characters[i_99_].method1236();
									class246_sub29.params = widget.key_pressed_listener;
									Client.low_priority_script_events.push_head(class246_sub29);
								}
							}
							if (Class59_Sub4_Sub2.aBool6844 && (widget.on_camera_finish != null)) {
								ScriptEvent class246_sub29 = new ScriptEvent();
								class246_sub29.source = widget;
								class246_sub29.params = widget.on_camera_finish;
								Client.low_priority_script_events.push_head(class246_sub29);
							}
						}
						if (widget.type == 5 && widget.anInt3213 != -1)
							widget.method1513(-118, Class246_Sub1_Sub14.aClass214_6597, Class246_Sub31.aClass203_5038)
									.method1471((byte) -122, widget.screen_height, Client.sprite_loader);
						Renderer.method272(widget, 2);
						if (widget.type == 0) {
							render_widget(class235s, widget.hash, i_57_, i_58_, i_59_, i_60_,
									i_55_ - widget.horizontal_scroll_position, i_56_ - widget.vertical_scroll_position,
									i_52_, i_53_);
							if (widget.components != null)
								render_widget(widget.components, widget.hash, i_57_, i_58_, i_59_, i_60_,
										(i_55_ - widget.horizontal_scroll_position),
										(i_56_ - widget.vertical_scroll_position), i_52_, i_53_);
							WidgetParent class246_sub40 = ((WidgetParent) (Widget.get_widget_parents(widget.revision)
									.get((long) widget.hash)));
							if (class246_sub40 != null) {
								if ((Class59_Sub4_Sub3.aClass101_6943 == Class246_Sub28_Sub16.aClass101_6394)
										&& (((WidgetParent) class246_sub40).type) == 0
										&& !ContextMenus.context_menu_open && bool && !RenderSequenceLoader.aBool1452)
									Class109_Sub1_Sub1.method2756(105);
								Class_cs.drawWidget(i_57_, i_56_, i_59_, ((WidgetParent) class246_sub40).anInt5517,
										29474, i_58_, i_55_, i_60_, i_53_, i_52_, widget);
							}
						}
					}
				}
			}
		}
	}

	final void method2956(int i) {
		do {
			try {
				anInt7243++;
				try {
					method2965(-122);
					if (i == 6231)
						break;
					f_mb = null;
				} catch (OutOfMemoryError outofmemoryerror) {
					if (outofmemoryerror.getMessage() != null && outofmemoryerror.getMessage().startsWith("native")) {
						Class129.method883(0, (byte) 70);
						Class194_Sub1.method1883(outofmemoryerror,
								(outofmemoryerror.getMessage() + " (Recovered) " + method2953((byte) -76)), -115);
					} else
						throw outofmemoryerror;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.E(" + i + ')');
			}
		} while (false);
	}

	final void method2946(boolean bool) {
		try {
			method2976(9);
			f_ab++;
			NativeLibraryManager.clean();
			NativeLibraryLoader.clean();
			Class231.method1480((byte) -10);
			Class246_Sub1_Sub10.method2608((byte) 2);
			Class98.method621(-2);
			Class232.method1487(-5631);
			Class102.method637(-20);
			MapRegion.method1660((byte) 119);
			NodeSub.method1759(99);
			Node.method1575((byte) 70);
			Class217.method1404(-91);
			IterableNodeHashTable.method551(31);
			method2955(19197);
			Class110.method765(false);
			Class97.method617(-15098);
			Class205.method1342(127);
			Class101.method631(-7325);
			Class_c.method584(!bool);
			SceneGraph.method1712(-127);
			Class39_Sub1.method2055(1);
			Class29.method229(14958);
			Class95.method603(!bool);
			Class166.method1107((byte) -84);
			Class78.method492((byte) 51);
			Class6.method68(-1);
			Class242.method1560(-15604);
			Class241.method1543(-128);
			Filestore.method956(3);
			Class154_Sub1.method2094(0);
			CacheIndex.method97(87);
			Class125.method859(22);
			Class208.method1364(3);
			HashMap.method372(24310);
			RenderSequenceLoader.method695(-25819);
			Cursors.method1037(56);
			EnumLoader.method953(1);
			UnderlayLoader.method706(4);
			IdentityKitLoader.method588((byte) 21);
			InvTypeLoader.method417(32);
			Class189.method1240((byte) -25);
			Class251.method1609(false);
			MapFunctions.method1090((byte) -16);
			MapScenes.method1640(false);
			Class228.method1460(-128);
			Class191.method1256(1);
			ParamLoader.method1081(1);
			Class193.method1267(89);
			Class45.method300(!bool);
			Class203.method1337((byte) 64);
			Class214.method1396(-119);
			Class177.method1163((byte) 109);
			StructLoader.method397(false);
			Class180.method1175(-94);
			VarcLoader.method478((byte) 124);
			Class17.method170((byte) -123);
			Class209.method1376(-84);
			Class65.method426(-7675);
			Npc.method2929(0);
			Stream_Sub1.method2479(false);
			Class243.method1569((byte) 117);
			Class246_Sub39.method2303((byte) -91);
			CollisionMap.method1316(3);
			Class246_Sub1_Sub5.method2472((byte) 110);
			Class230.method1474(4096);
			Class68.method444((byte) -45);
			Widget.method1515(-7975);
			Class86.method553((byte) 83);
			Player.method2911(false);
			Class87.method555((byte) -115);
			Class9.method83(3);
			Class18.method171(8);
			Buffer.method2361(-271907000);
			Entity.method2677(-114);
			Font.method785(1);
			Tile.method999(255);
			Class12.method140(-22964);
			Class246_Sub6.method1820((byte) 58);
			Class246_Sub43.method2346(1);
			WidgetParent.method2311(200);
			ClickMaskNode.method2124(0);
			OutgoingPacket.method1329((byte) -63);
			Class246_Sub1_Sub8.method2567(2048);
			Class71.method453((byte) 116);
			ISAAC.method288(1049069386);
			Class221.method1435((byte) 121);
			Class130.method884(true);
			Class111.method768(true);
			Class233.method1491((byte) 21);
			Class94.method602(22);
			Clan.method2906(0);
			SubIncomingPacket.method2900(-119);
			SequenceLoader.method2759((byte) 24);
			SequenceType.method851((byte) 93);
			Class148.method1000(7559);
			AbstractModel.method689((byte) 55);
			Class222.method1436((byte) -125);
			Class138.method934(false);
			Class211.method1388(false);
			Class172.method1135((byte) 121);
			LocType.method1207((byte) 17);
			Model.method656(0);
			Class133.method896((byte) 93);
			NpcType.method1627(0);
			ObjType.method1294(0);
			Class128.method875(-82);
			Class_u.method2063(bool);
			FontMetric.method467(-36);
			Class129.method882(1);
			Class246_Sub41.method2314(false);
			Class7.method78(0);
			Class246_Sub37_Sub1.method2517(-34);
			Class123.method829((byte) -57);
			Class250.method1596(false);
			Class115.method781((byte) -48);
			Class43.method295(0);
			Class152.method1011(1);
			Class155.method1025((byte) 116);
			Class215.method1401(127);
			Class168.method1120(false);
			Class247.method1579((byte) 98);
			Class150.method1008(-127);
			Class59.method400((byte) 54);
			Class130_Sub3.method1986(126);
			Class24.method202(2);
			Class130_Sub2.method1775();
			Class246_Sub16.method2018(28);
			RenderAnimation.method919((byte) 4);
			Class56.method387(bool);
			Class195.method1277(-14932);
			Class170.method1126(false);
			Class154.method1018(89);
			Class79_Sub1.method2206(false);
			ScriptExecutor.method986();
			Class79.method500();
			Class44.method297(0);
			Class246_Sub2.method1787(-128);
			Class198.method1301();
			Class51.method338(17);
			MapFunction.method950((byte) 66);
			Class48.method322(10);
			Class246_Sub1_Sub6.method2535(10);
			Class127.method871(-75);
			Material.method1532(0);
			Texture.method2704(26270);
			Class55.method385((byte) -122);
			ParamType.method808(11);
			Class60.method413(1);
			FloorDefinition.method1358(113);
			IdentityKitType.method1069(4);
			Class246_Sub1_Sub2.method2423(-14495);
			Class173.method1139((byte) 107);
			Sprite.method243(-61);
			Class206.method1348(8192);
			Class84.method533((byte) -82);
			Class46.method311((byte) 34);
			SpotAnimType.method967((byte) -120);
			StructType.method2829(7);
			VarcType.method1448((byte) -102);
			Varbit.method747(1);
			VarpType.method600(13815);
			Class246_Sub1_Sub16.method2749(true);
			Class81.method522(30068);
			Class246_Sub1_Sub3.method2432(124);
			Class1.method37(0);
			Class83.method530(-1);
			Class2.method44();
			Class200.method1325(125);
			Class99.method626(0);
			Class33.method245(2);
			Class_e.method593(63);
			Class113.method775((byte) -54);
			Class63_Sub1.method2075(23573);
			Class219.method1422((byte) 74);
			Class5.method63(false);
			Class244.method1570(3);
			ScriptEvent.method2151(-1);
			Class169.method1122((byte) -43);
			CS2Script.method2417((byte) 125);
			Class106.method719((byte) 123);
			Class121.method822(500);
			Class174.method1148((byte) -29);
			Class59_Sub5.method2282((byte) 94);
			Class59_Sub4.method2210(true);
			Class59_Sub2.method2021(6);
			Class3.method52(-26007);
			Class100.method630((byte) 123);
			Class246_Sub1_Sub4.method2445(-107);
			Class90.method569(-16641);
			Class257.method1669(7582);
			Class246_Sub18.method2057(false);
			Class202.method1330((byte) 92);
			Class20.method193(-114);
			Class240.method1537(94);
			Class159.method1056((byte) 104);
			Class246_Sub5.method1812(false);
			Class104.method668(22404);
			Class22.method200(false);
			Class176.method1157(-69);
			Class_ls.method469(-58);
			Class126.method866(-1);
			Class216.method1403(true);
			Class130_Sub4.method2079(-115);
			Class59_Sub3_Sub2.method2487(-12582);
			Class130_Sub8.method2350(0);
			Class143.method963(!bool);
			Class58.method399(12);
			Class59_Sub5_Sub1.method2463((byte) 81);
			Class59_Sub4_Sub3.method2859((byte) 75);
			Class14.method145(117);
			Class59_Sub2_Sub3.method2721(6);
			Class59_Sub3_Sub3.method2621(16299);
			Class59_Sub1_Sub2.method2570(30517);
			Class190.method1245((byte) -116);
			Class139.method937((byte) -66);
			TransformList.method2116(-25049);
			Sequence.method457();
			Class19.method186((byte) 7);
			Class303.method1072((byte) -124);
			Class16.method162(-87);
			MouseHandler.method2000(128);
			Canvas_Sub1.method2839(-29624);
			Class234.method1495(12);
			Class186.method1220((byte) -46);
			Class91.method578(20517);
			Class53.method367((byte) 1);
			SomeClass.method889(1);
			Class223.method1438(20253);
			Class82.method526(13);
			Class_h.method707();
			Class35.method250((byte) 109);
			Class246_Sub1_Sub8_Sub1.method2926(bool);
			Class248.method1585((byte) -57);
			Class_a.method575(-14407);
			Class246_Sub28_Sub9.method2577((byte) 26);
			Class59_Sub1_Sub3.method2644((byte) -114);
			Class59_Sub1_Sub1.method2540(95);
			Class59_Sub3_Sub4.method2868(-86);
			Class59_Sub3_Sub1.method2441(0);
			Class59_Sub4_Sub2.method2822(65535);
			Class59_Sub4_Sub1.method2639((byte) 85);
			Class59_Sub2_Sub1.method2452(0);
			Class59_Sub2_Sub2.method2546(65);
			Class246_Sub38.method2294(76);
			SwitchInt.method2181(0);
			Class246_Sub4.method1806(0);
			Class149.method1005(false);
			Class220.method1425(false);
			Class130_Sub1.method1755((byte) -32);
			Class246_Sub22.method2085((byte) -125);
			Class158.method1053();
			Class246_Sub34.method2195(32410);
			Class246_Sub9.method1856();
			Class167.method1115();
			Class237.method1525();
			Class246_Sub14.method1996(-7799);
			Class239.method1535(8);
			Class123_Sub2.method1995();
			Varc.method2613(true);
			Class130_Sub6.method2106(-1);
			Class130_Sub1_Sub1.method2881(-17);
			Class245.method1573(-16777216);
			Class77.method482();
			TextureOperation.method2140(-256);
			Class171.method1132((byte) 116);
			Class246_Sub28_Sub20.method2705((byte) -9);
			Class136.method924((byte) -58);
			Class66.method431(false);
			Class246_Sub28_Sub5.method2542(-5669);
			Class246_Sub28_Sub16.method2656(-106);
			Class246_Sub31.method2163(127);
			Class88.method558(1244216161);
			Class106_Sub2.method2261((byte) -91);
			Class38.method269(385672172);
			Class246_Sub32.method2167((byte) 86);
			Class246_Sub19.method2066((byte) -58);
			Class36.method256(true);
			Class260_Sub2.method1947(1);
			Class47.method314(true);
			Class236.method1522(9);
			Class249.method1590(118);
			Class246_Sub7_Sub1.method2565((byte) 22);
			Class31.method239((byte) 127);
			Class_c_Sub1.method2274(-70);
			Class37.method258(60);
			Class_l_Sub2.method2296(-114);
			Class134.method900((byte) -102);
			Class109.method759(10241);
			Class109_Sub1.method1763(-90);
			Class211_Sub1.method2270(true);
			HDModel.method2029(124);
			Class160.method1061((byte) -14);
			Class109_Sub4.method2026(-1);
			Class11.method136();
			Class246_Sub28_Sub1.method2454((byte) -50);
			Class246_Sub28_Sub25.method2751(119);
			Class246_Sub28_Sub6.method2552((byte) 108);
			Class246_Sub28_Sub23.method2729(-1);
			Class246_Sub28_Sub12.method2598(2);
			Class246_Sub28_Sub17.method2657(31444);
			Class246_Sub28_Sub2.method2458(0);
			Class246_Sub28_Sub13.method2624(true);
			Class246_Sub28_Sub4.method2539(10);
			Class246_Sub28_Sub31.method2853((byte) 93);
			Class246_Sub28_Sub14.method2635((byte) 90);
			Class246_Sub28_Sub3.method2492(0);
			Class246_Sub28_Sub32.method2857((byte) -104);
			Class246_Sub28_Sub22.method2726(1);
			Class246_Sub28_Sub36.method2879((byte) -108);
			Class_cs.method2920(true);
			ContextMenus.method2707(1675886592);
			Class_ss.method2884((byte) 57);
			Class246_Sub28_Sub29.method2819(-116);
			Class246_Sub28_Sub24.method2736((byte) -32);
			Class246_Sub28_Sub10.method2580(28);
			Class_ds.method2753((byte) 95);
			Class246_Sub28_Sub33.method2860(3);
			Class246_Sub28_Sub11.method2582((byte) -72);
			Class_w.method2654((byte) -48);
			Class246_Sub28_Sub8.method2561(-1);
			Class246_Sub28_Sub30.method2835(-1);
			Class246_Sub28_Sub26.method2752(-89);
			Class246_Sub28_Sub15.method2645(false);
			Class246_Sub28_Sub35.method2873((byte) -117);
			Class246_Sub28_Sub34.method2870(-969029332);
			Class246_Sub28_Sub19.method2692((byte) 18);
			Class246_Sub28_Sub27.method2766(255);
			Class246_Sub36.method2223();
			LDModel.method2234();
			Class128_Sub2.method2333((byte) -126);
			Class112.method772(-10933);
			Class246_Sub19_Sub2.method2817(2);
			Stream_Sub2.method2596(-8625);
			Class96.method613(0);
			Class196.method1278(-115);
			Class109_Sub3.method1826((byte) 76);
			Class246_Sub7.method1828(0);
			Class40.method281((byte) -15);
			Class_m.method750((byte) 100);
			Class40_Sub9.method2307(-261);
			Class_j.method717((byte) -27);
			Class69.method449(123);
			Class246_Sub1_Sub4_Sub1.method2891((byte) -77);
			Class_u_Sub1.method2420(-42);
			Class128_Sub1.method2330(19274);
			Class34.method249(4864);
			Class210_Sub2.method2152(false);
			Class246_Sub11.method1871(-128);
			Class224.method1446(31);
			Class213.method1392((byte) -10);
			Class246_Sub41_Sub1.method2584((byte) 55);
			Class211_Sub1_Sub2.method2690(-4);
			Class211_Sub1_Sub1.method2609(33985);
			Class187_Sub1.method2110(-11836);
			Class187.method1223(-5298);
			Class194_Sub1.method1880(true);
			Class187_Sub2.method2284((byte) 127);
			Class194_Sub2.method2144(11134);
			Class40_Sub6.method2186(true);
			Class40_Sub3.method1862(125);
			Class40_Sub8.method2212(-108);
			Class40_Sub7.method2208(0);
			Class40_Sub1.method1769((byte) 121);
			Class40_Sub2.method1859((byte) 95);
			Class256.method1661(0);
			Class132.method892(53);
			Camera.method1338((byte) 32);
			Class246_Sub41_Sub2.method2682(-7247);
			Class259_Sub3.method2271((byte) -59);
			Class259.method1674(true);
			Class259_Sub3_Sub1.method2843((byte) 114);
			Class259_Sub1.method2015((byte) -44);
			Class259_Sub2_Sub1.method2848(110);
			Class259_Sub2.method2149(99);
			Class_q.method2062((byte) -23);
			Class38_Sub1.method2190(-9160);
			Class120.method820((byte) -63);
			Class64_Sub1.method2218(!bool);
			Class64.method423(false);
			Class246_Sub1_Sub7.method2547((byte) 122);
			Class246_Sub1_Sub9.method2589(19293);
			Class246_Sub30.method2159(3);
			InputStream_Sub1.method2100(8301);
			Class137.method929((byte) 101);
			Class246_Sub12.method1979(-105);
			Class246_Sub10.method1867(-120);
			Class246_Sub35.method2203((byte) -3);
			Class188_Sub1.method1816(101);
			Class246_Sub30_Sub1.method2447((byte) -112);
			Class246_Sub1_Sub14.method2710(92);
			Class246_Sub15.method1998(-1);
			Class246_Sub8.method1842(31469);
			Class75.method474((byte) -92);
			Class179.method1171(true);
			Class218.method1418(1);
			Class122.method827(-7782);
			Class21.method197((byte) -74);
			Class21_Sub2.method2013((byte) -79);
			Class21_Sub1.method1813(255);
			Class21_Sub4.method2129(false);
			Class_q_Sub1.method2732(-11878);
			Class38_Sub1_Sub1.method2770(-20);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.Q(" + bool + ')');
		}
		if (anInt7227 != 0)
			f_ob = true;
	}

	static final void method2973(int i) {
		int i_100_ = Class246_Sub4.anInt3869;
		int[] is = Class53.anIntArray755;
		for (int i_101_ = 0; i_101_ < i_100_ + Class5.anInt55; i_101_++) {
			Entity class_r;
			if (i_101_ < i_100_)
				class_r = Class143.players[is[i_101_]];
			else
				class_r = (VarcLoader.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i_101_ - i_100_]]);
			if (((Class59_Sub3) class_r).current_plane == i && ((Entity) class_r).anInt6431 >= 0) {
				int i_102_ = class_r.method2670((byte) 127);
				if ((i_102_ & 0x1) == 0) {
					if ((((Class59_Sub3) class_r).x & 0x7f) != 0
							|| (((Class59_Sub3) class_r).y & 0x7f) != 0)
						continue;
				} else if ((((Class59_Sub3) class_r).x & 0x7f) != 64
						|| ((((Class59_Sub3) class_r).y & 0x7f) != 64))
					continue;
				if (i_102_ == 1) {
					int i_103_ = ((Class59_Sub3) class_r).x >> 7;
					int i_104_ = ((Class59_Sub3) class_r).y >> 7;
					if (((Entity) class_r).anInt6431 > Class24.anIntArrayArray348[i_103_][i_104_]) {
						Class24.anIntArrayArray348[i_103_][i_104_] = ((Entity) class_r).anInt6431;
						Class246_Sub6.anIntArrayArray3944[i_103_][i_104_] = 1;
					} else if (((Entity) class_r).anInt6431 == Class24.anIntArrayArray348[i_103_][i_104_])
						Class246_Sub6.anIntArrayArray3944[i_103_][i_104_]++;
				} else {
					int i_105_ = (i_102_ - 1) * 64 + 60;
					int i_106_ = ((Class59_Sub3) class_r).x - i_105_ >> 7;
					int i_107_ = ((Class59_Sub3) class_r).y - i_105_ >> 7;
					int i_108_ = ((Class59_Sub3) class_r).x + i_105_ >> 7;
					int i_109_ = ((Class59_Sub3) class_r).y + i_105_ >> 7;
					for (int i_110_ = i_106_; i_110_ <= i_108_; i_110_++) {
						for (int i_111_ = i_107_; i_111_ <= i_109_; i_111_++) {
							if (((Entity) class_r).anInt6431 > Class24.anIntArrayArray348[i_110_][i_111_]) {
								Class24.anIntArrayArray348[i_110_][i_111_] = ((Entity) class_r).anInt6431;
								Class246_Sub6.anIntArrayArray3944[i_110_][i_111_] = 1;
							} else if (((Entity) class_r).anInt6431 == (Class24.anIntArrayArray348[i_110_][i_111_]))
								Class246_Sub6.anIntArrayArray3944[i_110_][i_111_]++;
						}
					}
				}
			}
		}
	}

	public static final void main(String[] strings) {
		try {
			if ((strings.length ^ 0xffffffff) != -5)
				Class169.method1123("argument count", (byte) 117);
			Class58.anInt816 = Integer.parseInt(strings[0]);
			Class260_Sub2.aClass205_4297 = Class155.aClass205_2228;
			if (!strings[1].equals("live")) {
				if (strings[1].equals("rc"))
					Class259.aClass97_3707 = Class189.aClass97_2666;
				else if (!strings[1].equals("wip"))
					Class169.method1123("modewhat", (byte) 123);
				else
					Class259.aClass97_3707 = Class37.aClass97_544;
			} else
				Class259.aClass97_3707 = SubIncomingPacket.aClass97_7088;
			Preferences.language_code = Class41.method286(strings[2], -35);
			if (Preferences.language_code == -1) {
				if (!strings[2].equals("english")) {
					if (strings[2].equals("german"))
						Preferences.language_code = 1;
					else
						Class169.method1123("language", (byte) 117);
				} else
					Preferences.language_code = 0;
			}
			Class106_Sub2.aBool5333 = false;
			Class88.aBool1151 = false;
			if (!strings[3].equals("game0")) {
				if (!strings[3].equals("game1"))
					Class169.method1123("game", (byte) 127);
				else
					Class59_Sub4_Sub3.aClass101_6943 = Class40_Sub6.aClass101_5092;
			} else
				Class59_Sub4_Sub3.aClass101_6943 = Class246_Sub28_Sub16.aClass101_6394;
			Class246_Sub23.aBool4817 = AbstractModel.aBool1431 = true;
			Class246_Sub5.aString3891 = "";
			Class122.anInt1680 = 0;
			Class109_Sub4.anInt4573 = 0;
			StructType.anInt6859 = ((Class101) Class59_Sub4_Sub3.aClass101_6943).anInt1310;
			Client client = new Client();
			Client.instance = client;
			client.create_frame(768, 592, false, Constants.MAX_INDEX_COUNT, 0,
					((Class101) Class59_Sub4_Sub3.aClass101_6943).aString1315, 1024,
					Class259.aClass97_3707.method616(false) + 32);
			Client.frame.setLocation(40, 40);
		} catch (Exception exception) {
			Class194_Sub1.method1883(exception, null, 116);
		}
	}

	private final void method2974(int i, int i_112_) {
		try {
			Class130.aClass6_1817 = null;
			f_db++;
			Class14.aClass182_218 = null;
			if (i >= -33)
				method2970(-36);
			((Class242) MapFunction.aClass242_2036).anInt3434++;
			((Class242) MapFunction.aClass242_2036).anInt3436 = i_112_;
			Class44.anInt642 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.HA(" + i + ',' + i_112_ + ')');
		}
	}

	static final void method2975() {
		int i = Class246_Sub4.anInt3869;
		int[] is = Class53.anIntArray755;
		int i_113_ = Class38.aBool563 ? i : i + Class5.anInt55;
		for (int i_114_ = 0; i_114_ < i_113_; i_114_++) {
			Entity class_r;
			if (i_114_ < i)
				class_r = Class143.players[is[i_114_]];
			else
				class_r = (VarcLoader.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i_114_ - i]]);
			if (((Entity) class_r).anInt6431 >= 0) {
				int i_115_ = class_r.method2670((byte) 127);
				if ((i_115_ & 0x1) == 0) {
					if ((((Class59_Sub3) class_r).x & 0x7f) == 0
							&& (((Class59_Sub3) class_r).y & 0x7f) == 0)
						continue;
				} else if ((((Class59_Sub3) class_r).x & 0x7f) == 64
						&& ((((Class59_Sub3) class_r).y & 0x7f) == 64))
					continue;
				if (class_r instanceof Player && ((Entity) class_r).f_pc != null
						&& (Client.cycle >= (((Class246_Sub16) ((Entity) class_r).f_pc).anInt4523))
						&& (Client.cycle < (((Class246_Sub16) ((Entity) class_r).f_pc).anInt4535)))
					((Player) (Player) class_r).f_ld = false;
				((Class59_Sub3) class_r).anInt5052 = Class6.getAverageHeight(((Class59_Sub3) class_r).x, 51,
						((Class59_Sub3) class_r).current_plane, ((Class59_Sub3) class_r).y);
				Class176.method1156(class_r, true);
			}
		}
	}

	final void method2949(int i) {
		try {
			f_kb++;
			Frame frame = new Frame(GameConstants.NAME);
			frame.pack();
			frame.dispose();
			Class21.method198(false);
			Class106_Sub2.aClass241_5339 = new Class241(Client.sign_link);
			MapFunction.aClass242_2036 = new Class242();
			if (Class208.aClass205_2930 != Class260_Sub2.aClass205_4297)
				Class220.aByteArrayArray3051 = new byte[50][];
			Client.current_renderer = new Class39_Sub1(Client.sign_link);
			if (Class260_Sub2.aClass205_4297 == Class208.aClass205_2930) {
				Class6.aString68 = Constants.ADRESS;
				Class71.anInt925 = Constants.PORT;
				Class40_Sub1.anInt3767 = Constants.PORT;
			} else if (!Class59_Sub1_Sub3.method2642((Class260_Sub2.aClass205_4297), (byte) -52)) {
				if (Class260_Sub2.aClass205_4297 == Class155.aClass205_2228) {
					Class71.anInt925 = 40000 - -Class58.anInt816;
					Class6.aString68 = Constants.ADRESS;
					Class40_Sub1.anInt3767 = 50000 - -Class58.anInt816;
				}
			} else {
				Class6.aString68 = this.getCodeBase().getHost();
				Class71.anInt925 = 40000 - -Class58.anInt816;
				Class40_Sub1.anInt3767 = Class58.anInt816 + 50000;
			}

			Class172.anInt2432 = Class71.anInt925;
			Class174.aString2449 = Class6.aString68;
			Class246_Sub28_Sub7.anInt6047 = Class40_Sub1.anInt3767;
			Class172.anInt2433 = Class71.anInt925;

			// if (Signlink.anInt740 == 3)
			// Selected world = 1
			Client.world_id = Class58.anInt816;

			Class187_Sub1.aShortArray4872 = Class246_Sub35.aShortArray5161 = Class44.aShortArray641 = Class90.aShortArray1172 = new short[256];
			if (Class40_Sub6.aClass101_5092 == Class59_Sub4_Sub3.aClass101_6943) {
				Class246_Sub1_Sub2.aShortArrayArray5693 = Class44.aShortArrayArray640;
				Class160.aShortArray2270 = Class130.aShortArray1813;
				Class37.anInt547 = 16777215;
				Settings.fog_color = 0;
				Node.shift_click_use = true;
				Node.aShortArray3466 = Class40_Sub2.aShortArray4037;
				Class246_Sub30_Sub1.aShortArrayArray5767 = Class246_Sub1_Sub6.aShortArrayArray5965;
			} else {
				Class246_Sub30_Sub1.aShortArrayArray5767 = Class40_Sub2.aShortArrayArray4050;
				Class246_Sub1_Sub2.aShortArrayArray5693 = Class246_Sub7_Sub1.aShortArrayArray6094;
				Node.aShortArray3466 = Class210_Sub2.aShortArray4984;
				Class160.aShortArray2270 = ObjType.aShortArray2759;
			}
			Class230.anInt3165 = Class172.anInt2432;
			Class216.aClass232_3009 = TextureLoader.method471((byte) 16, GameEngine.canvas);
			Material.aClass102_3360 = AbstractModel.method673(-54, true, GameEngine.canvas);
			Player.f_rd = Class178.method1167(true);
			if (Player.f_rd != null)
				Player.f_rd.method490((byte) 93, GameEngine.canvas);
			Class246_Sub28_Sub6.anInt6045 = Signlink.anInt740;
			try {
				if (Client.sign_link.aClass192_743 != null) {
					Class48.aClass125_696 = new Class125(Client.sign_link.aClass192_743, 5200, 0);
					for (int i_116_ = 0; i_116_ < Constants.MAX_INDEX_COUNT; i_116_++)
						Class47.aClass125Array687[i_116_] = new Class125(Client.sign_link.aClass192Array727[i_116_],
								6000, 0);
					Class246_Sub28_Sub35.aClass125_7011 = new Class125(Client.sign_link.aClass192_737, 6000, 0);
					Class121.aClass208_1678 = new Class208(255, Class48.aClass125_696,
							Class246_Sub28_Sub35.aClass125_7011, 500000);
					Class_c_Sub1.aClass125_5392 = new Class125(Client.sign_link.aClass192_735, 24, 0);
					Client.sign_link.aClass192_737 = null;
					Client.sign_link.aClass192_735 = null;
					Client.sign_link.aClass192_743 = null;
					Client.sign_link.aClass192Array727 = null;
				}
			} catch (java.io.IOException ioexception) {
				Class_c_Sub1.aClass125_5392 = null;
				Class48.aClass125_696 = null;
				Class121.aClass208_1678 = null;
				Class246_Sub28_Sub35.aClass125_7011 = null;
			}
			if (Class208.aClass205_2930 != Class260_Sub2.aClass205_4297)
				Settings.display_fps = true;
			if (i != -22158)
				method2979(null, (byte) 80);
			Class246_Sub28_Sub9.aString6139 = ((Class246_Sub28_Sub16.aClass101_6394 == Class59_Sub4_Sub3.aClass101_6943)
					? SpotAnimType.aClass67_2088
					: Class259_Sub3_Sub1.aClass67_6902).get(Preferences.language_code);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.S(" + i + ')');
		}
	}

	public static CacheIndex get_font_sprite_index() {
		return Cache.get_index(Settings.gamefonts, "sprites");
	}

	public static void method2976(int i) {
		try {
			f_fb = null;
			if (i == 9)
				f_mb = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.NA(" + i + ')');
		}
	}

	static final Widget method2977(Widget class235) {
		int i = Widget.get_active_properties(class235).method2125(1861624);
		if (i == 0)
			return null;
		for (int i_117_ = 0; i_117_ < i; i_117_++) {
			class235 = Widget.get_widget(class235.parent_id, class235.revision);
			if (class235 == null)
				return null;
		}
		return class235;
	}

	static final void method2978() {
		ParamLoader.anInt2308 = 0;
		for (int i = 0; i < Class5.anInt55; i++) {
			Npc class_r_sub2 = (VarcLoader.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i]]);
			if (((Entity) class_r_sub2).aBool6441 && class_r_sub2.method2675((byte) 18) != -1) {
				int i_118_ = (class_r_sub2.method2670((byte) 127) - 1) * 64 + 60;
				int i_119_ = ((Class59_Sub3) class_r_sub2).x - i_118_ >> 7;
				int i_120_ = ((Class59_Sub3) class_r_sub2).y - i_118_ >> 7;
				Entity class_r = Class154.method1020(i_120_, i_119_, (byte) 119,
						(((Class59_Sub3) class_r_sub2).current_plane));
				if (class_r != null) {
					int i_121_ = ((Entity) class_r).f_db;
					if (class_r instanceof Npc)
						i_121_ += 2048;
					if (((Entity) class_r).anInt6463 == 0 && class_r.method2675((byte) 18) != -1) {
						Class121.anIntArray1663[ParamLoader.anInt2308] = i_121_;
						Class236.anIntArray3315[ParamLoader.anInt2308] = i_121_;
						ParamLoader.anInt2308++;
						((Entity) class_r).anInt6463++;
					}
					Class121.anIntArray1663[ParamLoader.anInt2308] = i_121_;
					Class236.anIntArray3315[ParamLoader.anInt2308] = ((Entity) class_r_sub2).f_db + 2048;
					ParamLoader.anInt2308++;
					((Entity) class_r).anInt6463++;
				}
			}
		}
		Class_ds.method2754(Class236.anIntArray3315, 0, Class121.anIntArray1663, ParamLoader.anInt2308 - 1, 0);
	}

	final void method2979(byte[] is, byte i) {
		try {
			anInt7245++;
			Buffer stream = new Buffer(is);
			if (i == 40) {
				for (;;) {
					int i_122_ = stream.readUnsignedByte();
					if (i_122_ == 0)
						break;
					if ((i_122_ ^ 0xffffffff) != -2) {
						if (i_122_ != 4) {
							if ((i_122_ ^ 0xffffffff) == -6) {
								int i_123_ = stream.readUnsignedByte();
								HDModel.f_vc = new int[i_123_];
								for (int i_124_ = 0; ((i_123_ ^ 0xffffffff) < (i_124_ ^ 0xffffffff)); i_124_++) {
									HDModel.f_vc[i_124_] = stream.readUnsignedShort();
									if (HDModel.f_vc[i_124_] == 65535)
										HDModel.f_vc[i_124_] = -1;
								}
							}
						} else {
							int i_125_ = stream.readUnsignedByte();
							Class259_Sub2.anIntArray4959 = new int[i_125_];
							for (int i_126_ = 0; i_126_ < i_125_; i_126_++) {
								Class259_Sub2.anIntArray4959[i_126_] = stream.readUnsignedShort();
								if (Class259_Sub2.anIntArray4959[i_126_] == 65535)
									Class259_Sub2.anIntArray4959[i_126_] = -1;
							}
						}
					} else {
						int[] is_127_ = Class246_Sub28_Sub31.anIntArray6913 = new int[6];
						is_127_[0] = stream.readUnsignedShort();
						is_127_[1] = stream.readUnsignedShort();
						is_127_[2] = stream.readUnsignedShort();
						is_127_[3] = stream.readUnsignedShort();
						is_127_[4] = stream.readUnsignedShort();
						is_127_[5] = stream.readUnsignedShort();
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("client.KA(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method2980() {
		for (int i = 0; i < Class38_Sub1_Sub1.anInt6770; i++) {
			int[] is = Class24.anIntArrayArray348[i];
			for (int i_128_ = 0; i_128_ < Class152.anInt2205; i_128_++)
				is[i_128_] = 0;
		}
	}

	static final void method2982() {
		int i = Class246_Sub4.anInt3869;
		int[] is = Class53.anIntArray755;
		boolean bool = ((((Renderer) Client.current_renderer).anInt580 == 1) && i > 200
				|| (((Renderer) Client.current_renderer).anInt580 == 0) && i > 50);
		for (int i_143_ = 0; i_143_ < i; i_143_++) {
			Player class_r_sub1 = Class143.players[is[i_143_]];
			if (!class_r_sub1.method2912(109))
				((Entity) class_r_sub1).anInt6431 = -1;
			else {
				class_r_sub1.method2172(11264);
				if (((Class59_Sub3) class_r_sub1).aShort5057 < 0 || ((Class59_Sub3) class_r_sub1).aShort5064 < 0
						|| (((Class59_Sub3) class_r_sub1).aShort5065 >= Class38_Sub1_Sub1.anInt6770)
						|| (((Class59_Sub3) class_r_sub1).aShort5062 >= Class152.anInt2205))
					((Entity) class_r_sub1).anInt6431 = -1;
				else {
					((Player) class_r_sub1).f_ld = ((Entity) class_r_sub1).aBool6450 ? bool : false;
					if (class_r_sub1 == Client.local_player)
						((Entity) class_r_sub1).anInt6431 = 2147483647;
					else {
						int i_144_ = 0;
						if (!((Entity) class_r_sub1).aBool6441)
							i_144_++;
						if (((Entity) class_r_sub1).anInt6464 > Client.cycle)
							i_144_ += 2;
						i_144_ += 5 - class_r_sub1.method2670((byte) 127) << 2;
						if (((Player) class_r_sub1).aBool7129)
							i_144_ += 512;
						else {
							if (SpotAnimType.anInt2074 == 0)
								i_144_ += 32;
							else
								i_144_ += 128;
							i_144_ += 256;
						}
						((Entity) class_r_sub1).anInt6431 = i_144_ + 1;
					}
				}
			}
		}
		for (int i_145_ = 0; i_145_ < Class5.anInt55; i_145_++) {
			Npc class_r_sub2 = (VarcLoader.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i_145_]]);
			if (!class_r_sub2.method2930(113)
					|| !(((Npc) class_r_sub2).aClass253_7184.method1622(Varbit.aClass95_6658, -14095)))
				((Entity) class_r_sub2).anInt6431 = -1;
			else {
				class_r_sub2.method2172(11264);
				if (((Class59_Sub3) class_r_sub2).aShort5057 < 0 || ((Class59_Sub3) class_r_sub2).aShort5064 < 0
						|| (((Class59_Sub3) class_r_sub2).aShort5065 >= Class38_Sub1_Sub1.anInt6770)
						|| (((Class59_Sub3) class_r_sub2).aShort5062 >= Class152.anInt2205))
					((Entity) class_r_sub2).anInt6431 = -1;
				else {
					int i_146_ = 0;
					if (!((Entity) class_r_sub2).aBool6441)
						i_146_++;
					if (((Entity) class_r_sub2).anInt6464 > Client.cycle)
						i_146_ += 2;
					i_146_ += 5 - class_r_sub2.method2670((byte) 127) << 2;
					if (SpotAnimType.anInt2074 == 0) {
						if (((NpcType) ((Npc) class_r_sub2).aClass253_7184).f_vb)
							i_146_ += 64;
						else
							i_146_ += 128;
					} else if (SpotAnimType.anInt2074 == 1) {
						if (((NpcType) ((Npc) class_r_sub2).aClass253_7184).f_vb)
							i_146_ += 32;
						else
							i_146_ += 64;
					}
					if (((NpcType) ((Npc) class_r_sub2).aClass253_7184).priorityRender)
						i_146_ += 1024;
					else if (!((NpcType) (((Npc) class_r_sub2).aClass253_7184)).aBool3571)
						i_146_ += 256;
					((Entity) class_r_sub2).anInt6431 = i_146_ + 1;
				}
			}
		}
		for (int i_147_ = 0; i_147_ < Class166.aClass29Array2347.length; i_147_++) {
			Class29 class29 = Class166.aClass29Array2347[i_147_];
			if (class29 != null) {
				if (((Class29) class29).anInt391 == 1) {
					Npc class_r_sub2 = (VarcLoader.aClass_r_Sub2Array1002[((Class29) class29).anInt384]);
					if (class_r_sub2 != null && ((Entity) class_r_sub2).anInt6431 >= 0)
						((Entity) class_r_sub2).anInt6431 += 2048;
				} else if (((Class29) class29).anInt391 == 10) {
					Player class_r_sub1 = (Class143.players[((Class29) class29).anInt384]);
					if (class_r_sub1 != null && class_r_sub1 != Client.local_player
							&& ((Entity) class_r_sub1).anInt6431 >= 0)
						((Entity) class_r_sub1).anInt6431 += 2048;
				}
			}
		}
	}

	private final void method2983(byte i) {
		do {
			try {
				anInt7246++;
				boolean bool = MapFunction.aClass242_2036.method1557(-118);
				if (i < -30) {
					if (bool)
						break;
					method2964(3000);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.DA(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void queue_sound_effect(int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			if ((((Renderer) current_renderer).anInt602 ^ 0xffffffff) != -1 && i_12_ != 0
					&& (Class59.anInt819 ^ 0xffffffff) > -51 && (i ^ 0xffffffff) != 0)
				Class47.aClass258Array684[Class59.anInt819++] = new Class258((byte) 1, i, i_12_, i_14_, i_13_, 0);
			if (i_11_ == 0)
				Class99.anInt1284++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("ji.D(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	static final void play_song(int i, int i_12_, int i_13_, int i_14_) {
		try {
			i_14_ = (((Renderer) current_renderer).anInt587 * i_14_) >> 8;
			int i_15_ = 20 % ((59 - i_12_) / 58);
			Class246_Sub28_Sub36.anInt7025++;
			do {
				if (i != -1 || Class_w.aBool6383) {
					if ((i ^ 0xffffffff) == 0 || (i == Class36.anInt512 && Class59.method404((byte) -89))
							|| (i_14_ ^ 0xffffffff) == -1 || Class_w.aBool6383)
						break;
					Class59_Sub3_Sub4.method2863(i_14_, Cache.get_index(Revision.PRE_EOC_634, "music"), (byte) -89,
							i_13_, false, 0, i);
					if (!f_ob)
						break;
				}
				StructLoader.method394((byte) 127);
			} while (false);
			Class36.anInt512 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vm.D(" + i + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	static final void add_game_message(byte i, String string) {
		try {
			MultilingualString.method437(0, 0, string, "", "", true);
			if (i != -99)
				RenderSequenceLoader.aClass67_1447 = null;
			RenderSequenceLoader.anInt1445++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("v.F(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void perform_player_animation(Player class_r_sub1, int animation_id, int i, int revision) {
		if (animation_id == ((Entity) class_r_sub1).current_sequence && (animation_id ^ 0xffffffff) != 0) {
			SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, animation_id, Settings.data);
			int i_23_ = ((SequenceType) class124).replyMode;
			if ((i_23_ ^ 0xffffffff) == -2) {
				((Entity) class_r_sub1).f_qb = i;
				((Entity) class_r_sub1).anInt6465 = 0;
				((Entity) class_r_sub1).anInt6415 = 0;
				((Entity) class_r_sub1).anInt6452 = 0;
				((Entity) class_r_sub1).anInt6449 = 1;
				Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r_sub1).x, ((Entity) class_r_sub1).anInt6452,
						((Class59_Sub3) class_r_sub1).current_plane, ((Class59_Sub3) class_r_sub1).y, true, class124,
						class_r_sub1 == local_player);
			}
			if (i_23_ == 2) {
				((Entity) class_r_sub1).anInt6415 = 0;
			}
		}
		if ((animation_id ^ 0xffffffff) == 0 || ((Entity) class_r_sub1).current_sequence == -1
				|| ((((SequenceType) Class59_Sub3_Sub3.aClass45_6275.list(3, animation_id,
						Settings.data)).forcedPriority
						^ 0xffffffff) <= ((((SequenceType) (Class59_Sub3_Sub3.aClass45_6275.list(3,
								((Entity) class_r_sub1).current_sequence, Settings.data))).forcedPriority)
								^ 0xffffffff))) {
			((Entity) class_r_sub1).anInt6452 = 0;
			((Entity) class_r_sub1).current_sequence = animation_id;
			((Entity) class_r_sub1).anInt6449 = 1;
			((Entity) class_r_sub1).anInt6415 = 0;
			((Entity) class_r_sub1).anInt6465 = 0;
			((Entity) class_r_sub1).f_qb = i;
			((Entity) class_r_sub1).f_sc = ((Entity) class_r_sub1).f_oc;
			if ((((Entity) class_r_sub1).current_sequence ^ 0xffffffff) != 0)
				Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r_sub1).x, ((Entity) class_r_sub1).anInt6452,
						((Class59_Sub3) class_r_sub1).current_plane, ((Class59_Sub3) class_r_sub1).y, true,
						(Class59_Sub3_Sub3.aClass45_6275.list(3, ((Entity) class_r_sub1).current_sequence,
								Settings.data)),
						class_r_sub1 == local_player);
		}
	}

	static final int get_frame_mode(byte i) {
		try {
			Class258.anInt3704++;
			if (Class38_Sub1.aFrame5114 != null)
				return 3;
			if (i != -123)
				Class258.anInt3699 = 76;
			if (!Class59_Sub5_Sub1.aBool5829)
				return 1;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wq.D(" + i + ')');
		}
	}

	public static Class<?> getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			try {
				return Class.forName("io." + string);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
	}

	static final void run_command(String command_input, boolean flag) {
		int i = 3;
		do {
			try {
				Class187_Sub2.anInt5422++;
				if (Class260_Sub2.aClass205_4297 != Class208.aClass205_2930 || Client.staff_level >= 2) {
					if (command_input.equalsIgnoreCase("errortest"))
						throw new RuntimeException();
					if (command_input.equals("nativememerror"))
						throw new OutOfMemoryError("native(MPR");
					try {
						if (command_input.equalsIgnoreCase("fpson")) {
							Settings.display_fps = true;
							Class252.printConsoleMessage(126, "fps debug enabled");
							break;
						}
						if (command_input.equalsIgnoreCase("fpsoff")) {
							Settings.display_fps = false;
							Class252.printConsoleMessage(i + 121, "fps debug disabled");
							break;
						}
						if (command_input.equals("systemmem")) {
							try {
								Class252.printConsoleMessage(121,
										("System memory: " + (jagmisc.getAvailablePhysicalMemory() / 1048576L) + "/"
												+ (jagmisc.getTotalPhysicalMemory() / 1048576L) + "Mb"));
							} catch (Throwable throwable) {
								/* empty */
							}
							break;
						}
						if (command_input.equalsIgnoreCase("cls")) {
							Class59_Sub2_Sub2.anInt6018 = 0;
							Class91.anInt1188 = 0;
							break;
						}
						if (command_input.equalsIgnoreCase("cleartext")) {
							aClass68_7208.method443(45);
							Class252.printConsoleMessage(122, "Text coords cleared");
							break;
						}
						if (command_input.equalsIgnoreCase("gc")) {
							Class106_Sub2.method2262(i ^ 0x4f99);
							for (int i_3_ = 0; i_3_ < 10; i_3_++)
								System.gc();
							Runtime runtime = Runtime.getRuntime();
							int i_4_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
							Class252.printConsoleMessage(123, "mem=" + i_4_ + "k");
							break;
						}
						if (command_input.equalsIgnoreCase("compact")) {
							Class106_Sub2.method2262(20378);
							for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -11; i_5_++)
								System.gc();
							Runtime runtime = Runtime.getRuntime();
							int i_6_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
							Class252.printConsoleMessage(i ^ 0x79, ("Memory before cleanup=" + i_6_ + "k"));
							Class188.method1230((byte) 113);
							Class106_Sub2.method2262(20378);
							for (int i_7_ = 0; i_7_ < 10; i_7_++)
								System.gc();
							i_6_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
							Class252.printConsoleMessage(125, ("Memory after cleanup=" + i_6_ + "k"));
							break;
						}
						if (command_input.equalsIgnoreCase("pcachesize")) {
							Class252.printConsoleMessage(125,
									("Number of player models in cache:" + Class40_Sub6.method2183((byte) -29)));
							break;
						}
						if (command_input.equalsIgnoreCase("clientdrop")) {
							Class252.printConsoleMessage(124, "Dropped client connection");
							if (gameState == 30)
								Varc.method2615((byte) 111);
							else {
								if ((gameState ^ 0xffffffff) == -26)
									Class59_Sub3_Sub1.aBool5746 = true;
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("clientjs5drop")) {
							MapFunction.aClass242_2036.method1563(228742352);
							Class252.printConsoleMessage(127, "Dropped client js5 net queue");
							break;
						}
						if (command_input.equalsIgnoreCase("serverjs5drop")) {
							MapFunction.aClass242_2036.method1556((byte) -81);
							Class252.printConsoleMessage(i + 120, "Dropped server js5 net queue");
							break;
						}
						if (command_input.equalsIgnoreCase("breakcon")) {
							Client.sign_link.method361((byte) 62);
							Class65.aClass6_864.method66(0);
							MapFunction.aClass242_2036.method1555((byte) -113);
							Class252.printConsoleMessage(122, "Breaking new connections for 5 seconds");
							break;
						}
						if (command_input.equalsIgnoreCase("rebuild")) {
							Entity.method2663(true);
							Class149.method1004(-114);
							Class252.printConsoleMessage(i ^ 0x79, "Rebuilding map");
							break;
						}
						if (command_input.equalsIgnoreCase("wm1")) {
							Class100.setWindowedMode(1, -1, -1, false, false);
							if ((Client.get_frame_mode((byte) -123) ^ 0xffffffff) != -2)
								Class252.printConsoleMessage(124, "wm1 failed");
							else {
								Class252.printConsoleMessage(123, "wm1 succeeded");
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("wm2")) {
							Class100.setWindowedMode(2, -1, -1, false, false);
							if ((Client.get_frame_mode((byte) -123) ^ 0xffffffff) != -3)
								Class252.printConsoleMessage(121, "wm2 failed");
							else {
								Class252.printConsoleMessage(i + 122, "wm2 succeeded");
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("wm3")) {
							Class100.setWindowedMode(3, 768, 1024, false, false);
							if (Client.get_frame_mode((byte) -123) != 3)
								Class252.printConsoleMessage(124, "wm3 failed");
							else {
								Class252.printConsoleMessage(125, "wm3 succeeded");
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("tk0")) {
							Class129.method883(0, (byte) 88);
							if (Buffer.anInt5656 == 0) {
								Class252.printConsoleMessage(126, "Entered tk0");
								((Renderer) (Client.current_renderer)).anInt598 = 0;
								Client.current_renderer.save_preferences(Client.sign_link);
								RuntimeException_Sub2.aBool7148 = false;
							} else {
								Class252.printConsoleMessage(121, "Failed to enter tk0");
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("tk1")) {
							Class129.method883(1, (byte) 91);
							if (Buffer.anInt5656 != 1)
								Class252.printConsoleMessage(121, "Failed to enter tk1");
							else {
								Class252.printConsoleMessage(127, "Entered tk1");
								((Renderer) (Client.current_renderer)).anInt598 = 1;
								Client.current_renderer.save_preferences(Client.sign_link);
								RuntimeException_Sub2.aBool7148 = false;
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("tk2")) {
							Class129.method883(2, (byte) 117);
							if (Buffer.anInt5656 == 2) {
								Class252.printConsoleMessage(127, "Entered tk2");
								((Renderer) (Client.current_renderer)).anInt598 = 2;
								Client.current_renderer.save_preferences(Client.sign_link);
								RuntimeException_Sub2.aBool7148 = false;
							} else {
								Class252.printConsoleMessage(i + 123, "Failed to enter tk2");
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("tk3")) {
							Class129.method883(3, (byte) 69);
							if ((Buffer.anInt5656 ^ 0xffffffff) == -4)
								Class252.printConsoleMessage(123, "Entered tk3");
							else {
								Class252.printConsoleMessage(122, "Failed to enter tk3");
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("bright")) {
							((Renderer) Client.current_renderer).brightness = 4;
							Entity.method2663(true);
							break;
						}
						if (command_input.equalsIgnoreCase("bright 3")) {
							((Renderer) Client.current_renderer).brightness = 3;
							Entity.method2663(true);
							break;
						}
						if (command_input.equalsIgnoreCase("bright 2")) {
							((Renderer) Client.current_renderer).brightness = 2;
							Entity.method2663(true);
							break;
						}
						if (command_input.equalsIgnoreCase("bright 1")) {
							((Renderer) Client.current_renderer).brightness = 1;
							Entity.method2663(true);
							break;
						}
						if (command_input.equalsIgnoreCase("bright 0")) {
							((Renderer) Client.current_renderer).brightness = 0;
							Entity.method2663(true);
							break;
						}
						if (command_input.equalsIgnoreCase("ot")) {
							((Renderer) Client.current_renderer).aBool573 = !((Renderer) (Client.current_renderer)).aBool573;
							Client.current_renderer.save_preferences(Client.sign_link);
							RuntimeException_Sub2.aBool7148 = false;
							Entity.method2663(true);
							Class252.printConsoleMessage(121,
									("ot=" + (((Renderer) (Client.current_renderer)).aBool573)));
							break;
						}
						if (command_input.equalsIgnoreCase("blend")) {
							Settings.ground_blending = !Settings.ground_blending;
							if (Settings.draw_fog && !Settings.ground_blending) {
								Settings.draw_fog = false;
								Settings.fog_color = 0;
							}
							Client.current_renderer.save_preferences(Client.sign_link);
							RuntimeException_Sub2.aBool7148 = false;
							Entity.method2663(true);
							Class252.printConsoleMessage(127, ("blend=" + Settings.ground_blending));
							break;
						}
						if (command_input.startsWith("shadows")) {
							if ((command_input.length() ^ 0xffffffff) > -9)
								Class252.printConsoleMessage(127, "Invalid shadows value");
							else {
								String string_8_ = command_input.substring(8);
								int i_9_ = (!Class48.method323(string_8_, 59) ? -1 : Class104.method665(string_8_, 10));
								if (i_9_ < 0 || i_9_ > 2)
									Class252.printConsoleMessage(127, "Invalid shadows value");
								else {
									Client.current_renderer.method273(Buffer.anInt5656, i ^ 0xffffffff, i_9_);
									Client.current_renderer.save_preferences(Client.sign_link);
									RuntimeException_Sub2.aBool7148 = false;
									Entity.method2663(true);
									Class252.printConsoleMessage(i ^ 0x79, "shadows=" + i_9_);
									break;
								}
								break;
							}
							break;
						}
						if (command_input.startsWith("fog")) {
							if (!Settings.ground_blending) {
								Class252.printConsoleMessage(127, ("Enable blending first."));
								return;
							}
							Settings.draw_fog = !Settings.draw_fog;
							Settings.fog_color = Settings.draw_fog ? 0xc8c0a8 : 0;
							Client.current_renderer.save_preferences(Client.sign_link);
							RuntimeException_Sub2.aBool7148 = false;
							Entity.method2663(true);
							Class252.printConsoleMessage(127, ("test=" + Settings.draw_fog));
						}
						if (command_input.startsWith("hdminimap")) {
							Settings.hd_minimap = !Settings.hd_minimap;
							Client.current_renderer.save_preferences(Client.sign_link);
							Client.map_scenes.method1637(34);
							Client.map_functions.method1091(-128);
							Class149.method1004(-128);
							Class252.printConsoleMessage(127, ("hdminimap=" + Settings.hd_minimap));
						}
						if (command_input.startsWith("grounddecor")) {
							Settings.ground_decorations = !Settings.ground_decorations;
							Client.current_renderer.save_preferences(Client.sign_link);
							RuntimeException_Sub2.aBool7148 = false;
							Entity.method2663(true);
							Class252.printConsoleMessage(127, ("grounddecor=" + Settings.ground_decorations));
						}
						if (command_input.startsWith("roofs")) {
							Settings.show_roofs = !Settings.show_roofs;
							Client.current_renderer.save_preferences(Client.sign_link);
							RuntimeException_Sub2.aBool7148 = false;
							Entity.method2663(true);
							Class252.printConsoleMessage(127, ("roofs=" + Settings.show_roofs));
						}
						if (command_input.startsWith("textures")) {
							((Renderer) Client.current_renderer).texture = !((Renderer) (Client.current_renderer)).texture;
							Client.current_renderer.save_preferences(Client.sign_link);
							RuntimeException_Sub2.aBool7148 = false;
							Class59_Sub1_Sub2.method2571(i - 10);
							Entity.method2663(true);
							Class252.printConsoleMessage(123,
									("textures=" + (((Renderer) (Client.current_renderer)).texture)));
							break;
						}
						if (command_input.startsWith("setba")) {
							if ((command_input.length() ^ 0xffffffff) > -7)
								Class252.printConsoleMessage(123, "Invalid buildarea value");
							else {
								int i_10_ = Class104.method665(command_input.substring(6), 10);
								if (i_10_ < 0
										|| ((i_10_ ^ 0xffffffff) < (method2969((Class40_Sub2.anInt4047), (byte) -91)
												^ 0xffffffff)))
									Class252.printConsoleMessage(121, "Invalid buildarea value");
								else {
									((Renderer) (Client.current_renderer)).anInt581 = i_10_;
									Client.current_renderer.save_preferences(Client.sign_link);
									RuntimeException_Sub2.aBool7148 = false;
									Class252.printConsoleMessage(125,
											("maxbuildarea=" + (((Renderer) (Client.current_renderer)).anInt581)));
									break;
								}
								break;
							}
							break;
						}
						if (command_input.startsWith("setparticles")) {
							if ((command_input.length() ^ 0xffffffff) > -14)
								Class252.printConsoleMessage(i + 118, "Invalid particles value");
							else {
								Class83.method531(Class104.method665(command_input.substring(13), 10), i + 9057);
								Client.current_renderer.save_preferences(Client.sign_link);
								RuntimeException_Sub2.aBool7148 = false;
								Class252.printConsoleMessage(i ^ 0x7e, ("particles=" + Texture.method2699(8458)));
								break;
							}
							break;
						}
						if (command_input.startsWith("rect_debug")) {
							if (command_input.length() < 10)
								Class252.printConsoleMessage(121, "Invalid rect_debug value");
							else {
								Class210_Sub2.anInt5022 = Class104.method665(command_input.substring(10).trim(), 10);
								Class252.printConsoleMessage(123, ("rect_debug=" + (Class210_Sub2.anInt5022)));
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("qa_op_test")) {
							RenderSequenceLoader.aBool1452 = true;
							Class252.printConsoleMessage(123, ("qa_op_test=" + RenderSequenceLoader.aBool1452));
							break;
						}
						if (command_input.equalsIgnoreCase("clipcomponents")) {
							Class257.aBool3683 = !Class257.aBool3683;
							Class252.printConsoleMessage(i + 120, ("clipcomponents=" + Class257.aBool3683));
							break;
						}
						if (command_input.startsWith("bloom")) {
							boolean bool_11_ = Client.sprite_loader.method1742();
							if (Class196.method1280(-14734, !bool_11_)) {
								if (!bool_11_)
									Class252.printConsoleMessage(122, "Bloom enabled");
								else
									Class252.printConsoleMessage(121, "Bloom disabled");
							} else {
								Class252.printConsoleMessage(i ^ 0x7c, "Failed to enable bloom");
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("tween")) {
							if (Settings.force_tweening) {
								Settings.force_tweening = false;
								Class252.printConsoleMessage(122, "Forced tweening disabled.");
							} else {
								Settings.force_tweening = true;
								Class252.printConsoleMessage(127, "Forced tweening ENABLED!");
								break;
							}
							Client.current_renderer.save_preferences(Client.sign_link);
							break;
						}
						if (command_input.equalsIgnoreCase("hitbars")) {
							Settings.osrs_hit_bars = !Settings.osrs_hit_bars;
							Class252.printConsoleMessage(127, "OSRS hit bars is now " + Settings.osrs_hit_bars);
							Client.current_renderer.save_preferences(Client.sign_link);
							break;
						}
						if (command_input.equalsIgnoreCase("hitmarks")) {
							Settings.osrs_hit_marks = !Settings.osrs_hit_marks;
							Class252.printConsoleMessage(127, "OSRS hit marks is now " + Settings.osrs_hit_marks);
							Client.current_renderer.save_preferences(Client.sign_link);
							break;
						}
						if (command_input.equalsIgnoreCase("550fonts")) {
							Settings.gamefonts = Revision.PRE_EOC_550;
							Class216.font_cache = new HashMap(20);
							Class216.font_cache_550 = new HashMap(20);
							Class216.osrs_font_cache = new HashMap(20);
							Class19.method189(Client.sprite_loader, Client.get_font_sprite_index(), 73,
									Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
							TitleScreen.loading_message = TitleScreen.opened_title_screen_ms
									.get(Preferences.language_code);
							Class99.updateGameState((byte) -125, 25);
							Client.current_renderer.save_preferences(Client.sign_link);
							break;
						}
						if (command_input.equalsIgnoreCase("634fonts")) {
							Settings.gamefonts = Revision.PRE_EOC_634;
							Class216.font_cache = new HashMap(20);
							Class216.font_cache_550 = new HashMap(20);
							Class216.osrs_font_cache = new HashMap(20);
							Class19.method189(Client.sprite_loader, Client.get_font_sprite_index(), 73,
									Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
							TitleScreen.loading_message = TitleScreen.opened_title_screen_ms
									.get(Preferences.language_code);
							Class99.updateGameState((byte) -125, 25);
							Client.current_renderer.save_preferences(Client.sign_link);
							break;
						}
						if (command_input.equalsIgnoreCase("osrsfonts")) {
							Settings.gamefonts = Revision.OSRS;
							Class216.font_cache = new HashMap(20);
							Class216.font_cache_550 = new HashMap(20);
							Class216.osrs_font_cache = new HashMap(20);
							Class19.method189(Client.sprite_loader, Client.get_font_sprite_index(), 73,
									Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
							TitleScreen.loading_message = TitleScreen.opened_title_screen_ms
									.get(Preferences.language_code);
							Class99.updateGameState((byte) -125, 25);
							Client.current_renderer.save_preferences(Client.sign_link);
							break;
						}
						if (command_input.equalsIgnoreCase("menus")) {
							Settings.osrs_context_menus = !Settings.osrs_context_menus;
							Client.current_renderer.save_preferences(Client.sign_link);
							Class252.printConsoleMessage(127,
									"OSRS context menus is now " + Settings.osrs_context_menus);
							ContextMenus.context_menu_open = false;
							break;
						}
						if (command_input.equalsIgnoreCase("shiftuse")) {
							if (!Node.shift_click_use) {
								Class252.printConsoleMessage(124, "Shift-click-use ENABLED!");
								Node.shift_click_use = true;
							} else {
								Class252.printConsoleMessage(123, "Shift-click-use disabled.");
								Node.shift_click_use = false;
								break;
							}
							break;
						}

						if (command_input.equalsIgnoreCase("getcgcoord")) {
							Class252.printConsoleMessage(122,
									("x:" + (((Class59_Sub3) Client.local_player).x >> 7) + " z:"
											+ (((Class59_Sub3) Client.local_player).y >> 7)));
							break;
						}
						if (command_input.equalsIgnoreCase("getheight")) {
							Class252.printConsoleMessage(126, ("Height: "
									+ (Class59_Sub3_Sub4.aClass210Array6993[(((Class59_Sub3) Client.local_player).current_plane)]
											.l((((Class59_Sub3) Client.local_player).x) >> 7,
													(((Class59_Sub3) Client.local_player).y) >> 7))));
							break;
						}
						if (command_input.equalsIgnoreCase("resetminimap")) {
							Cache.get_index(Revision.PRE_EOC_634, "sprites").method89((byte) 125);
							Cache.get_index(Revision.PRE_EOC_634, "sprites").destroy();
							Client.map_scenes.method1637(34);
							Client.map_functions.method1091(-128);
							Class149.method1004(-128);
							Class252.printConsoleMessage(i ^ 0x7c, "Minimap reset");
							break;
						}
						if (command_input.startsWith("mc")) {
							if (!Client.sprite_loader.method1705())
								Class252.printConsoleMessage(122, "Current toolkit doesn't support multiple cores");
							else {
								int i_12_ = Integer.parseInt(command_input.substring(3));
								if ((i_12_ ^ 0xffffffff) > -2)
									i_12_ = 1;
								else if (i_12_ > 4)
									i_12_ = 4;
								Texture.anInt6562 = i_12_;
								Client.sprite_loader.method1724(Texture.anInt6562);
								Client.sprite_loader.method1714(0);
								Class252.printConsoleMessage(126, ("Render cores now: " + (Texture.anInt6562)));
								break;
							}
							break;
						}
						if (command_input.equalsIgnoreCase("getcamerapos")) {
							Class252.printConsoleMessage(126,
									("Pos: " + ((Class59_Sub3) Client.local_player).current_plane + ","
											+ ((Client.base_x + (Class246_Sub16.aInt92 >> 7)) >> 6) + ","
											+ ((Client.base_y + (Class259_Sub1.anInt4509 >> 7)) >> 6) + ","
											+ ((Client.base_x + (Class246_Sub16.aInt92 >> 7)) & 0x3f) + ","
											+ (0x3f & ((Class259_Sub1.anInt4509 >> 7) - -Client.base_y))
											+ " Height: "
											+ (Class6.getAverageHeight(Class246_Sub16.aInt92, i ^ 0x57,
													(((Class59_Sub3) (Client.local_player)).current_plane),
													Class259_Sub1.anInt4509) - Class246_Sub28_Sub8.anInt6077)));
							Class252.printConsoleMessage(122,
									("Look: " + ((Class59_Sub3) Client.local_player).current_plane + ","
											+ ((Client.base_x + Class130_Sub3.anInt4406) >> 6) + ","
											+ (Class40_Sub9.anInt5497 - -Client.base_y >> 6) + ","
											+ ((Class130_Sub3.anInt4406 + Client.base_x) & 0x3f) + ","
											+ (Client.base_y + Class40_Sub9.anInt5497 & 0x3f) + " Height: "
											+ (Class6.getAverageHeight(Class130_Sub3.anInt4406, i ^ ~0x2f,
													(((Class59_Sub3) (Client.local_player)).current_plane),
													Class40_Sub9.anInt5497) + -Class246_Sub1_Sub14.anInt6593)));
							break;
						}
						if (command_input.equals("showocc")) {
							Material.aBool3361 = !Material.aBool3361;
							Entity.method2663(true);
							Class252.printConsoleMessage(127, ("showocc=" + Material.aBool3361));
							break;
						}
						if (command_input.equals("wallocc")) {
							VarpType.aBool1224 = !VarpType.aBool1224;
							Entity.method2663(true);
							Class252.printConsoleMessage(126, ("forcewallocc=" + VarpType.aBool1224));
							break;
						}
						if (command_input.equals("renderprofile") || command_input.equals("rp")) {
							Class248.aBool3487 = !Class248.aBool3487;
							Client.sprite_loader.method1696(Class248.aBool3487);
							Class22.method201(-81);
							Class252.printConsoleMessage(123, ("showprofiling=" + Class248.aBool3487));
							break;
						}
						if (command_input.equals("performancetest")) {
							Class252.printConsoleMessage(122,
									("Java toolkit: " + (WidgetParent.method2310(Client.sign_link, 0, 48))));
							Class252.printConsoleMessage(121,
									("GL toolkit:   " + (WidgetParent.method2310(Client.sign_link, 1, 115))));
							Class252.printConsoleMessage(127,
									("SSE toolkit:  " + (WidgetParent.method2310(Client.sign_link, 2, i - 90))));
							break;
						}
						if (command_input.equals("nonpcs")) {
							Class38.aBool563 = !Class38.aBool563;
							Class252.printConsoleMessage(i + 120, "nonpcs=" + Class38.aBool563);
							break;
						}
						if (command_input.equals("autoworld")) {
							Class246_Sub28_Sub9.method2578((byte) -105);
							Class252.printConsoleMessage(127, "auto world selected");
							break;
						}
						if (command_input.startsWith("pc")) {
							Class243.writePacket(-103, Class170.aClass201_2420);
							Class130_Sub1.stream.writeByte(255, 0);
							int i_13_ = (((Buffer) Class130_Sub1.stream).position);
							int i_14_ = command_input.indexOf(" ", 4);
							Class130_Sub1.stream.writeString(59, command_input.substring(3, i_14_));
							Class59_Sub3_Sub4.method2867(command_input.substring(i_14_), 0, (Class130_Sub1.stream));
							Class130_Sub1.stream.method2408(-1591647264,
									(-i_13_ + (((Buffer) Class130_Sub1.stream).position)));
							break;
						}
						if (command_input.equals("heap")) {
							Class252.printConsoleMessage(i + 121, ("Heap: " + Class40_Sub2.anInt4047 + "MB"));
							break;
						}
						if (command_input.equals("savevarcs")) {
							Class173.method1136(-22125);
							Class252.printConsoleMessage(126, "perm varcs saved");
							break;
						}
						if (command_input.equals("scramblevarcs")) {
							for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (Varc.varcs_634.length
									^ 0xffffffff)); i_15_++) {
								if (Class59_Sub3_Sub1.varcs_loaded_634[i_15_]) {
									Varc.varcs_634[i_15_] = (int) (99999.0 * Math.random());
									if (Math.random() > 0.5)
										Varc.varcs_634[i_15_] *= -1;
								}
							}
							Class173.method1136(-22125);
							Class252.printConsoleMessage(i + 122, "perm varcs scrambled");
							break;
						}
						if (command_input.equals("showcolmap")) {
							Class134.aBool1869 = true;
							Class149.method1004(i ^ ~0x6f);
							Class252.printConsoleMessage(124, "colmap is shown");
							break;
						}
						if (command_input.equals("hidecolmap")) {
							Class134.aBool1869 = false;
							Class149.method1004(-108);
							Class252.printConsoleMessage(127, "colmap is hidden");
							break;
						}
						if (command_input.equals("resetcache")) {
							Class232.method1484((byte) 108);
							Class252.printConsoleMessage(124, "Caches reset");
							break;
						}
						if (command_input.equals("disablemousedrag")) {
							Settings.middle_mouse_camera_control = false;
							break;
						}
						if (command_input.equals("enablemousedrag")) {
							Settings.middle_mouse_camera_control = true;
							break;
						}
						if (command_input.equals("profilecpu")) {
							Class252.printConsoleMessage(126, (String.valueOf(FloorDefinition.method1359(115)) + "ms"));
							break;
						}
						if (command_input.startsWith("cpuusage")) {
							int i_16_ = Integer.parseInt(command_input.substring(9));
							if (i_16_ >= 0 && (i_16_ ^ 0xffffffff) >= -5)
								((Renderer) (Client.current_renderer)).anInt584 = i_16_;
							Class252.printConsoleMessage(127,
									("cpuusage=" + (((Renderer) (Client.current_renderer)).anInt584)));
							break;
						}
						if (command_input.startsWith("getclientvarpbit")) {
							int i_17_ = Integer.parseInt(command_input.substring(17));
							Class252.printConsoleMessage(127,
									"varpbit=" + Varbit.aClass95_6658.getVarBitValue((byte) 45, i_17_, 634));
							break;
						}
						if (command_input.startsWith("getclientvarp")) {
							int i_18_ = Integer.parseInt(command_input.substring(14));
							Class252.printConsoleMessage(124, ("varp=" + Varbit.aClass95_6658.method35(i_18_, 0, 634)));
							break;
						}
						if (command_input.startsWith("csprofileclear")) {
							ScriptExecutor.method987();
							break;
						}
						if (command_input.startsWith("csprofileoutputc")) {
							ScriptExecutor.method989(100, false);
							break;
						}
						if (command_input.startsWith("csprofileoutputt")) {
							ScriptExecutor.method989(10, true);
							break;
						}
						if (command_input.startsWith("texsize")) {
							int i_19_ = Integer.parseInt(command_input.substring(8));
							Client.sprite_loader.method1747(i_19_);
							break;
						}
						if (command_input.equals("soundstreamcount")) {
							Class252.printConsoleMessage(126,
									("Active streams: " + Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2625()));
							break;
						}
						if ((gameState ^ 0xffffffff) == -31) {
							Class15.anInt233++;
							Class243.writePacket(-101, StructLoader.aClass201_810);
							Class130_Sub1.stream.writeByte(255, 2 + command_input.length());
							Class130_Sub1.stream.writeByte(255, !flag ? 0 : 1);
							Class130_Sub1.stream.writeString(113, command_input);
						}
						if (command_input.startsWith("fps ")
								&& (Class208.aClass205_2930 != Class260_Sub2.aClass205_4297)) {
							Class6.method70(Class104.method665(command_input.substring(4), 10), (byte) -112);
							break;
						}

						if (gameState != 30)
							Class252.printConsoleMessage(123,
									("Unrecogonised commmand when not logged in: " + command_input));
					} catch (Exception exception) {
						Class252.printConsoleMessage(123, "Whoops, something went wrong.");
					}
				}
				if (i == 3)
					break;
				run_command(null, true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("ue.J(" + (command_input != null ? "{...}" : "null") + ',' + flag + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public static void open_url(String url) {
		if (Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(new URI(url));
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			Runtime runtime = Runtime.getRuntime();
			try {
				runtime.exec("xdg-open " + url);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void trigger_gameframe_change(int rev) {
		Settings.gameframe = rev == 193 ? Revision.OSRS : rev == 550 ? Revision.PRE_EOC_550 : Revision.PRE_EOC_634;
		Client.current_renderer.save_preferences(Client.sign_link);
		for (WidgetParent class246_sub40 = (WidgetParent) Widget.get_widget_parents(rev).first(
				(byte) -23); class246_sub40 != null; class246_sub40 = (WidgetParent) Widget.get_widget_parents(rev)
						.next((byte) -20)) {
			Widget.close_widget(false, class246_sub40, false, -80, rev, "here3");
		}
		Widget.reset_widget(733);
		Widget.reset_widget(746);
		Widget.reset_widget(747);
		Widget.reset_widget(748);
		Widget.reset_widget(749);
		Widget.reset_widget(750);
		Widget.reset_widget(751);
		Widget.reset_widget(752);
		Widget.reset_widget(137);
		Widget.reset_widget(162);
		Widget.reset_widget(161);
		Widget.reset_widget(548);
		Class99.updateGameState((byte) -125, 25);
	}

	static int method7714() {
		/*
		 * if (Client.archiveLoaders != null && Client.archiveLoadersDone <
		 * Client.archiveLoaders.size()) { // L: 2159
		 * int var0 = 0; // L: 2160
		 * 
		 * for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 2161
		 * var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L:
		 * 2162
		 * }
		 * 
		 * return var0 * 10000 / Client.field753; // L: 2164
		 * } else {
		 * return 10000;
		 * }
		 */return 10000;
	}

	// RuneLite

	public DrawCallbacks drawCallbacks;
	@javax.inject.Inject
	private Callbacks callbacks;
	private int tickCount;
	private boolean gpu = false;

	@Override
	public Callbacks getCallbacks() {
		return callbacks;
	}

	@Override
	public DrawCallbacks getDrawCallbacks() {
		return drawCallbacks;
	}

	@Override
	public void setDrawCallbacks(DrawCallbacks drawCallbacks) {
		this.drawCallbacks = drawCallbacks;
	}

	@Override
	public String getBuildID() {
		return "592";
	}

	@Override
	public int getBoostedSkillLevel(Skill skill) {
		return 0;
	}

	@Override
	public int getRealSkillLevel(Skill skill) {
		return 0;
	}

	@Override
	public int getTotalLevel() {
		return 0;
	}

	@Override
	public MessageNode addChatMessage(ChatMessageType type, String name, String message, String sender) {
		return null;
	}

	@Override
	public MessageNode addChatMessage(ChatMessageType type, String name, String message, String sender, boolean postEvent) {
		return null;
	}

	@Override
	public GameState getGameState() {
		return GameState.of(gameState);
	}

	public String getLauncherDisplayName() {
		return "ELDER LAUNCHER";
	}

	@Override
	public int getCameraX() {
		return 0;
	}

	@Override
	public double getCameraFpX() {
		return 0;
	}

	@Override
	public int getCameraY() {
		return 0;
	}

	@Override
	public double getCameraFpY() {
		return 0;
	}

	@Override
	public int getCameraZ() {
		return 0;
	}

	@Override
	public double getCameraFpZ() {
		return 0;
	}

	@Override
	public int getCameraPitch() {
		return 0;
	}

	@Override
	public double getCameraFpPitch() {
		return 0;
	}

	@Override
	public void setCameraPitch(int cameraPitch) {

	}

	@Override
	public int getCameraYaw() {
		return 0;
	}

	@Override
	public double getCameraFpYaw() {
		return 0;
	}

	@Override
	public int getMouseCamClickedX() {
		return 0;
	}

	@Override
	public void setMouseCamClickedX(int mouseCamClickedX) {

	}

	@Override
	public int getMouseCamClickedY() {
		return 0;
	}

	@Override
	public void setMouseCamClickedY(int mouseCamClickedY) {

	}

	@Override
	public int getMouseHandlerX() {
		return 0;
	}

	@Override
	public void setMouseHandlerX(int mouseHandlerX) {

	}

	@Override
	public int getMouseHandlerY() {
		return 0;
	}

	@Override
	public void setMouseHandlerY(int mouseHandlerY) {

	}

	@Override
	public int getMouseWheelRotation() {
		return 0;
	}

	@Override
	public RSIndexCheck getIndexCheck() {
		return null;
	}

	@Override
	public int getWorld() {
		return 0;
	}

	@Override
	public int getFPS() {
		return 0;
	}

	@Override
	public int[] getServerVarps() {
		return new int[0];
	}

	@Override
	public Map<Integer, Object> getVarcMap() {
		return Map.of();
	}

	@Override
	public int getVar(int varbit) {
		return 0;
	}

	@Override
	public int getVarbitValue(int varbit) {
		return 0;
	}

	@Override
	public int getServerVarbitValue(int varbit) {
		return 0;
	}

	@Override
	public int getVarpValue(int varpId) {
		return 0;
	}

	@Override
	public int getServerVarpValue(int varpId) {
		return 0;
	}

	@Override
	public int getVarcIntValue(int var) {
		return 0;
	}

	@Override
	public String getVarcStrValue(int var) {
		return "";
	}

	@Override
	public void setVarcStrValue(int var, String value) {

	}

	@Override
	public void setVarcIntValue(int var, int value) {

	}

	@Override
	public void setVarbit(int varbit, int value) {

	}

	@Override
	public VarbitComposition getVarbit(int id) {
		return null;
	}

	@Override
	public int getVarbitValue(int[] varps, int varbitId) {
		return 0;
	}

	@Override
	public void setVarbitValue(int[] varps, int varbit, int value) {

	}

	@Override
	public void queueChangedVarp(int varp) {

	}

	@Override
	public WidgetNode openInterface(int componentId, int interfaceId, int modalMode) {
		return null;
	}

	@Override
	public void closeInterface(WidgetNode interfaceNode, boolean unload) {

	}

	@Override
	public int[] getVarps() {
		return new int[0];
	}

	@Override
	public int[] getVarpMasks() {
		return new int[0];
	}

	@Override
	public RSVarcs getVarcs() {
		return null;
	}

	@Override
	public int getEnergy() {
		return 0;
	}

	@Override
	public int getWeight() {
		return 0;
	}

	@Override
	public int[] getBoostedSkillLevels() {
		return new int[0];
	}

	@Override
	public int[] getRealSkillLevels() {
		return new int[0];
	}

	@Override
	public int[] getSkillExperiences() {
		return new int[0];
	}

	@Override
	public void queueChangedSkill(Skill skill) {

	}

	@Override
	public Map<Integer, SpritePixels> getSpriteOverrides() {
		return Map.of();
	}

	@Override
	public Map<Integer, SpritePixels> getWidgetSpriteOverrides() {
		return Map.of();
	}

	@Override
	public int[] getChangedSkills() {
		return new int[0];
	}

	@Override
	public int getChangedSkillsCount() {
		return 0;
	}

	@Override
	public void setChangedSkillsCount(int i) {

	}

	@Override
	public int getRSGameState() {
		return gameState;
	}

	@Override
	public void setGameState(GameState state) {
		gameState = state.getState();
		GameStateChanged event = new GameStateChanged();
		event.setGameState(state);
		if (callbacks != null) {
			callbacks.post(event);
		}
	}

	@Override
	public void stopNow() {

	}

	@Override
	public void setRSGameState(int state) {
		gameState = state;
	}

	@Override
	public int getMouseCurrentButton() {
		return 0;
	}

	@Override
	public boolean isDraggingWidget() {
		return false;
	}

	@Override
	public RSWidget getDraggedWidget() {
		return null;
	}

	@Override
	public RSWidget getDraggedOnWidget() {
		return null;
	}

	@Override
	public void setDraggedOnWidget(net.runelite.api.widgets.Widget widget) {

	}

	@Override
	public int getDragTime() {
		return 0;
	}

	@Override
	public RSWidgetDefinition getWidgetDefinition() {
		return null;
	}

	@Override
	public RSWidget[] getGroup(int groupId) {
		return new RSWidget[0];
	}

	@Override
	public RSPlayer getLocalPlayer() {
		return local_player;
	}

	@Override
	public int getLocalPlayerIndex() {
		return 0;
	}

	@Override
	public NPC getFollower() {
		return null;
	}

	@Override
	public ItemComposition getItemDefinition(int id) {
		return Objects.requireNonNull(MapRegion.aClass191_3663.list(22883, id));
	}

	@Override
	public SpritePixels createItemSprite(int itemId, int quantity, int border, int shadowColor, int stackable, boolean noted, int scale) {
		return null;
	}

	@Override
	public int getLocalInteractingIndex() {
		return 0;
	}

	@Override
	public void setLocalInteractingIndex(int idx) {

	}

	@Override
	public boolean isWorldSelectOpen() {
		return false;
	}

	@Override
	public void setWorldSelectOpen(boolean open) {

	}

	@Override
	public String getUsername() {
		return "";
	}

	@Override
	public void setUsername(String username) {

	}

	@Override
	public void setPassword(String password) {

	}

	@Override
	public void setOtp(String otp) {

	}

	@Override
	public void setAuthenticationScheme(boolean otp) {

	}

	@Override
	public void setLoginResponseString(String var0, String var1, String var2) {

	}

	@Override
	public int getLoginScreenXPadding() {
		return 0;
	}

	@Override
	public int getCurrentLoginField() {
		return 0;
	}

	@Override
	public int getLoginIndex() {
		return 0;
	}

	@Override
	public AccountType getAccountType() {
		return null;
	}

	@Override
	public String[] getPlayerOptions() {
		return new String[0];
	}

	@Override
	public boolean[] getPlayerOptionsPriorities() {
		return new boolean[0];
	}

	@Override
	public int[] getPlayerMenuTypes() {
		return new int[0];
	}

	@Override
	public int getMouseX() {
		return 0;
	}

	@Override
	public int getMouseY() {
		return 0;
	}

	@Override
	public boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		return false;
	}

	@Override
	public int getMenuOptionCount() {
		return 0;
	}

	@Override
	public void setMenuEntries(MenuEntry[] entries) {

	}

	@Override
	public void setMenuOptionCount(int menuOptionCount) {

	}

	@Override
	public RSMenuAction getTempMenuAction() {
		return null;
	}

	@Override
	public String[] getMenuOptions() {
		return new String[0];
	}

	@Override
	public String[] getMenuTargets() {
		return new String[0];
	}

	@Override
	public int[] getMenuIdentifiers() {
		return new int[0];
	}

	@Override
	public int[] getMenuOpcodes() {
		return new int[0];
	}

	@Override
	public int[] getMenuArguments1() {
		return new int[0];
	}

	@Override
	public int[] getMenuArguments2() {
		return new int[0];
	}

	@Override
	public int[] getMenuItemIds() {
		return new int[0];
	}

	@Override
	public boolean[] getMenuForceLeftClick() {
		return new boolean[0];
	}

	@Override
	public RSWorld[] getWorldList() {
		return new RSWorld[0];
	}

	@Override
	public MenuEntry createMenuEntry(int idx) {
		return null;
	}

	@Override
	public MenuEntry[] getMenuEntries() {
		return new MenuEntry[0];
	}

	@Override
	public void setWorldList(RSWorld[] worlds) {

	}

	@Override
	public void addRSChatMessage(int type, String name, String message, String sender) {

	}

	@Override
	public RSObjectComposition getRSObjectComposition(int objectId) {
		return null;
	}

	@Override
	public RSNPCComposition getRSNpcComposition(int npcId) {
		return null;
	}

	@Override
	public int getScale() {
		return 0;
	}

	@Override
	public Point getMouseCanvasPosition() {
		return null;
	}

	@Override
	public void setScale(int scale) {

	}

	@Override
	public int getCanvasHeight() {
		return 0;
	}

	@Override
	public int getCanvasWidth() {
		return 0;
	}

	@Override
	public int getViewportHeight() {
		return 0;
	}

	@Override
	public int getViewportWidth() {
		return 0;
	}

	@Override
	public int getViewportXOffset() {
		return 0;
	}

	@Override
	public int getViewportYOffset() {
		return 0;
	}

	@Override
	public boolean isResized() {
		return false;
	}

	@Override
	public int[] getWidgetPositionsX() {
		return new int[0];
	}

	@Override
	public int[] getWidgetPositionsY() {
		return new int[0];
	}

	@Override
	public int[] getWidgetWidths() {
		return new int[0];
	}

	@Override
	public int[] getWidgetHeights() {
		return new int[0];
	}

	@Override
	public boolean isMouseCam() {
		return false;
	}

	@Override
	public int getCamAngleDX() {
		return 0;
	}

	@Override
	public void setCamAngleDX(int angle) {

	}

	@Override
	public int getCamAngleDY() {
		return 0;
	}

	@Override
	public void setCamAngleDY(int angle) {

	}

	@Override
	public RSNodeHashTable getItemContainers() {
		return null;
	}

	@Override
	public RSItemComposition getRSItemDefinition(int itemId) {
		return null;
	}

	@Override
	public RSSpritePixels createRSItemSprite(int itemId, int quantity, int thickness, int borderColor, int stackable, boolean noted) {
		return null;
	}

	@Override
	public void sendMenuAction(int n2, int n3, int n4, int n5, int itemId, int worldViewId, String string, String string2, int n6, int n7) {

	}

	@Override
	public void decodeSprite(byte[] data) {

	}

	@Override
	public int getIndexedSpriteCount() {
		return 0;
	}

	@Override
	public int getIndexedSpriteWidth() {
		return 0;
	}

	@Override
	public int getIndexedSpriteHeight() {
		return 0;
	}

	@Override
	public int[] getIndexedSpriteOffsetXs() {
		return new int[0];
	}

	@Override
	public void setIndexedSpriteOffsetXs(int[] indexedSpriteOffsetXs) {

	}

	@Override
	public int[] getIndexedSpriteOffsetYs() {
		return new int[0];
	}

	@Override
	public void setIndexedSpriteOffsetYs(int[] indexedSpriteOffsetYs) {

	}

	@Override
	public int[] getIndexedSpriteWidths() {
		return new int[0];
	}

	@Override
	public void setIndexedSpriteWidths(int[] indexedSpriteWidths) {

	}

	@Override
	public int[] getIndexedSpriteHeights() {
		return new int[0];
	}

	@Override
	public void setIndexedSpriteHeights(int[] indexedSpriteHeights) {

	}

	@Override
	public byte[][] getSpritePixels() {
		return new byte[0][];
	}

	@Override
	public void setSpritePixels(byte[][] spritePixels) {

	}

	@Override
	public int[] getIndexedSpritePalette() {
		return new int[0];
	}

	@Override
	public void setIndexedSpritePalette(int[] indexedSpritePalette) {

	}

	@Override
	public RSArchive getIndexConfig() {
		return null;
	}

	@Override
	public IndexDataBase getIndex(int id) {
		return null;
	}

	@Override
	public RSArchive getMusicTracks() {
		return null;
	}

	@Override
	public RSArchive getIndexSprites() {
		return null;
	}

	@Override
	public RSArchive getIndexScripts() {
		return null;
	}

	@Override
	public RSInterfaceParent newInterfaceParent() {
		return null;
	}

	@Override
	public WidgetNode openRSInterface(int componentId, int interfaceId, int modalMode) {
		return null;
	}

	@Override
	public void closeRSInterface(WidgetNode interfaceNode, boolean unload) {

	}

	@Override
	public void runComponentCloseListeners(net.runelite.api.widgets.Widget[] var0, int var1) {

	}

	@Override
	public RSNodeHashTable getWidgetFlags() {
		return null;
	}

	@Override
	public RSNodeHashTable getComponentTable() {
		return null;
	}

	@Override
	public RSGrandExchangeOffer[] getGrandExchangeOffers() {
		return new RSGrandExchangeOffer[0];
	}

	@Override
	public boolean isPrayerActive(Prayer prayer) {
		return false;
	}

	@Override
	public int getSkillExperience(Skill skill) {
		return 0;
	}

	@Override
	public long getOverallExperience() {
		return 0;
	}

	@Override
	public void refreshChat() {

	}

	@Override
	public void setGeSearchResultCount(int count) {

	}

	@Override
	public void setGeSearchResultIds(short[] ids) {

	}

	@Override
	public void setGeSearchResultIndex(int index) {

	}

	@Override
	public void setLoginScreen(SpritePixels pixels) {

	}

	@Override
	public void setShouldRenderLoginScreenFire(boolean val) {

	}

	@Override
	public boolean isKeyPressed(int keycode) {
		return false;
	}

	@Override
	public boolean isMenuOpen() {
		return false;
	}

	@Override
	public boolean isMenuScrollable() {
		return false;
	}

	@Override
	public int getMenuScroll() {
		return 0;
	}

	@Override
	public void setMenuScroll(int scroll) {

	}

	@Override
	public void setMenuOpen(boolean open) {

	}

	@Override
	public int getGameCycle() {
		return 0;
	}

	@Override
	public int getServerCycle() {
		return 0;
	}

	@Override
	public Map getChatLineMap() {
		return Map.of();
	}

	@Override
	public RSIterableNodeHashTable getMessages() {
		return null;
	}

	@Override
	public ObjectComposition getObjectDefinition(int objectId) {
		return null;
	}

	@Override
	public NPCComposition getNpcDefinition(int npcId) {
		return null;
	}

	@Override
	public StructComposition getStructComposition(int structID) {
		return null;
	}

	@Override
	public NodeCache getStructCompositionCache() {
		return null;
	}

	@Override
	public int getRevision() {
		return 0;
	}

	@Override
	public int[] getMapRegions() {
		return new int[0];
	}

	@Override
	public int[][][] getInstanceTemplateChunks() {
		return new int[0][][];
	}

	@Override
	public int[][] getXteaKeys() {
		return new int[0][];
	}

	@Override
	public int getCycleCntr() {
		return 0;
	}

	@Override
	public void setChatCycle(int value) {

	}

	@Override
	public int getTopLevelInterfaceId() {
		return 0;
	}

	@Override
	public net.runelite.api.widgets.Widget[] getWidgetRoots() {
		return new net.runelite.api.widgets.Widget[0];
	}

	@Override
	public net.runelite.api.widgets.Widget getWidget(WidgetInfo widget) {
		return null;
	}

	@Override
	public net.runelite.api.widgets.Widget getWidget(int groupId, int childId) {
		return null;
	}

	@Override
	public net.runelite.api.widgets.Widget getWidget(int componentId) {
		return null;
	}

	@Override
	public RSWorldMapElement[] getMapElementConfigs() {
		return new RSWorldMapElement[0];
	}

	@Override
	public Object[] getDBTableField(int rowID, int column, int tupleIndex) {
		return new Object[0];
	}

	@Override
	public DBRowConfig getDBRowConfig(int rowID) {
		return null;
	}

	@Override
	public List<Integer> getDBRowsByValue(int table, int column, int tupleIndex, Object value) {
		return List.of();
	}

	@Override
	public RSWorldMapElement getMapElementConfig(int id) {
		return null;
	}

	@Override
	public RSIndexedSprite[] getMapScene() {
		return new RSIndexedSprite[0];
	}

	@Override
	public RSSpritePixels[] getMapIcons() {
		return new RSSpritePixels[0];
	}

	@Override
	public RSSpritePixels[] getMapDots() {
		return new RSSpritePixels[0];
	}

	@Override
	public RSIndexedSprite[] getModIcons() {
		return new RSIndexedSprite[0];
	}

	@Override
	public void setModIcons(IndexedSprite[] modIcons) {

	}

	@Override
	public void setRSModIcons(RSIndexedSprite[] modIcons) {

	}

	@Override
	public RSIndexedSprite createIndexedSprite() {
		return null;
	}

	@Override
	public RSSpritePixels createSpritePixels(int[] pixels, int width, int height) {
		return null;
	}

	@Override
	public LocalPoint getLocalDestinationLocation() {
		return null;
	}

	@Override
	public RuneLiteObject createRuneLiteObject() {
		return null;
	}

	@Override
	public ModelData loadModelData(int id) {
		return null;
	}

	@Override
	public ModelData mergeModels(ModelData[] models, int length) {
		return null;
	}

	@Override
	public ModelData mergeModels(ModelData... models) {
		return null;
	}

	@Override
	public net.runelite.api.Model loadModel(int id) {
		return null;
	}

	@Override
	public net.runelite.api.Model loadModel(int id, short[] colorToFind, short[] colorToReplace) {
		return null;
	}

	@Override
	public Animation loadAnimation(int id) {
		return null;
	}

	@Override
	public int getMusicVolume() {
		return 0;
	}

	@Override
	public void setMusicVolume(int volume) {

	}

	@Override
	public void playSoundEffect(int id) {

	}

	@Override
	public void playSoundEffect(int id, int x, int y, int range) {

	}

	@Override
	public void playSoundEffect(int id, int x, int y, int range, int delay) {

	}

	@Override
	public void playSoundEffect(int id, int volume) {

	}

	@Override
	public int getDestinationX() {
		return 0;
	}

	@Override
	public int getDestinationY() {
		return 0;
	}

	@Override
	public RSSoundEffect[] getAudioEffects() {
		return new RSSoundEffect[0];
	}

	@Override
	public int[] getQueuedSoundEffectIDs() {
		return new int[0];
	}

	@Override
	public int[] getSoundLocations() {
		return new int[0];
	}

	@Override
	public int[] getQueuedSoundEffectLoops() {
		return new int[0];
	}

	@Override
	public int[] getQueuedSoundEffectDelays() {
		return new int[0];
	}

	@Override
	public int getQueuedSoundEffectCount() {
		return 0;
	}

	@Override
	public void setQueuedSoundEffectCount(int queuedSoundEffectCount) {

	}

	@Override
	public void queueSoundEffect(int id, int numLoops, int delay) {

	}

	@Override
	public RSAbstractRasterProvider getBufferProvider() {
		return null;
	}

	@Override
	public int getMouseIdleTicks() {
		return 0;
	}

	@Override
	public void setMouseIdleTicks(int cycles) {

	}

	@Override
	public int getMouseLastPressedX() {
		return 0;
	}

	@Override
	public void setMouseLastPressedX(int x) {

	}

	@Override
	public int getMouseLastPressedY() {
		return 0;
	}

	@Override
	public void setMouseLastPressedY(int y) {

	}

	@Override
	public long getMouseLastPressedMillis() {
		return 0;
	}

	@Override
	public int getMouseLastButton() {
		return 0;
	}

	@Override
	public RSKeyHandler getKeyHandler() {
		return null;
	}

	@Override
	public void setKeyboardIdleTicks(int cycles) {

	}

	@Override
	public int getKeyboardIdleTicks() {
		return 0;
	}

	@Override
	public void changeMemoryMode(boolean lowMemory) {
		Settings.ground_decorations = !lowMemory;
		Client.current_renderer.save_preferences(Client.sign_link);
		RuntimeException_Sub2.aBool7148 = false;
		Entity.method2663(true);
	}

	@Override
	public ItemContainer getItemContainer(InventoryID inventory) {
		return null;
	}

	@Override
	public ItemContainer getItemContainer(int id) {
		return null;
	}

	@Override
	public boolean[] getPressedKeys() {
		return new boolean[0];
	}

	@Override
	public boolean isLowMemory() {
		return false;
	}

	@Override
	public void setLowMemory(boolean lowMemory) {

	}

	@Override
	public void setSceneLowMemory(boolean lowMemory) {

	}

	@Override
	public void setAudioHighMemory(boolean highMemory) {

	}

	@Override
	public void setObjectDefinitionLowDetail(boolean lowDetail) {

	}

	@Override
	public int getIntStackSize() {
		return 0;
	}

	@Override
	public void setIntStackSize(int stackSize) {

	}

	@Override
	public int[] getIntStack() {
		return new int[0];
	}

	@Override
	public int getStringStackSize() {
		return 0;
	}

	@Override
	public void setStringStackSize(int stackSize) {

	}

	@Override
	public String[] getStringStack() {
		return new String[0];
	}

	@Override
	public int getArraySizes(int arrayId) {
		return 0;
	}

	@Override
	public int[] getArray(int arrayId) {
		return new int[0];
	}

	@Override
	public int[] getArraySizes() {
		return new int[0];
	}

	@Override
	public int[][] getArrays() {
		return new int[0][];
	}

	@Override
	public RSFriendSystem getFriendManager() {
		return null;
	}

	@Override
	public RSFriendsChat getFriendsChatManager() {
		return null;
	}

	@Override
	public FriendContainer getFriendContainer() {
		return null;
	}

	@Override
	public NameableContainer<Ignore> getIgnoreContainer() {
		return null;
	}

	@Override
	public RSLoginType getLoginType() {
		return null;
	}

	@Override
	public RSUsername createName(String name, RSLoginType type) {
		return null;
	}

	@Override
	public int rs$getVarbit(int varbitId) {
		return 0;
	}

	@Override
	public RSEvictingDualNodeHashTable getVarbitCache() {
		return null;
	}

	@Override
	public RSClientPreferences getPreferences() {
		return null;
	}

	@Override
	public int getMapAngle() {
		return 0;
	}

	@Override
	public int getCameraYawTarget() {
		return 0;
	}

	@Override
	public void setCameraYawTarget(int cameraYawTarget) {

	}

	@Override
	public int getCameraPitchTarget() {
		return 0;
	}

	@Override
	public void setCameraPitchTarget(int pitch) {

	}

	@Override
	public void setCameraSpeed(float speed) {

	}

	@Override
	public void setCameraMouseButtonMask(int mask) {

	}

	@Override
	public void setCameraPitchRelaxerEnabled(boolean enabled) {

	}

	@Override
	public void setInvertYaw(boolean invertYaw) {

	}

	@Override
	public void setInvertPitch(boolean invertPitch) {

	}

	@Override
	public RenderOverview getRenderOverview() {
		return null;
	}

	@Override
	public int get3dZoom() {
		return 0;
	}

	@Override
	public void set3dZoom(int zoom) {

	}

	@Override
	public int getRasterizer3D_clipMidX2() {
		return 0;
	}

	@Override
	public int getRasterizer3D_clipNegativeMidX() {
		return 0;
	}

	@Override
	public int getRasterizer3D_clipNegativeMidY() {
		return 0;
	}

	@Override
	public int getRasterizer3D_clipMidY2() {
		return 0;
	}

	@Override
	public void checkClickbox(Projection projection, net.runelite.api.Model model, int orientation, int x, int y, int z, long hash) {

	}

	@Override
	public boolean isWidgetSelected() {
		return false;
	}

	@Override
	public void setWidgetSelected(boolean selected) {

	}

	@Override
	public net.runelite.api.widgets.Widget getSelectedWidget() {
		return null;
	}

	@Override
	public int getCenterX() {
		return 0;
	}

	@Override
	public int getCenterY() {
		return 0;
	}

	@Override
	public RSWorldMap getWorldMap() {
		return null;
	}

	@Override
	public boolean isStretchedEnabled() {
		return false;
	}

	@Override
	public void setStretchedEnabled(boolean state) {

	}

	@Override
	public boolean isStretchedFast() {
		return false;
	}

	@Override
	public void setStretchedFast(boolean state) {

	}

	@Override
	public void setStretchedIntegerScaling(boolean state) {

	}

	@Override
	public void setStretchedKeepAspectRatio(boolean state) {

	}

	@Override
	public void setScalingFactor(int factor) {

	}

	@Override
	public void invalidateStretching(boolean resize) {

	}

	@Override
	public Dimension getStretchedDimensions() {
		return null;
	}

	@Override
	public Dimension getRealDimensions() {
		return null;
	}

	@Override
	public void changeWorld(World world) {

	}

	@Override
	public RSWorld createWorld() {
		return null;
	}

	@Override
	public SpritePixels drawInstanceMap(int z) {
		return null;
	}

	@Override
	public void runScript(Object... args) {

	}

	@Override
	public net.runelite.api.ScriptEvent createScriptEvent(Object... args) {
		return null;
	}

	@Override
	public boolean hasHintArrow() {
		return false;
	}

	@Override
	public int getHintArrowType() {
		return 0;
	}

	@Override
	public void clearHintArrow() {

	}

	@Override
	public void setHintArrow(WorldPoint point) {

	}

	@Override
	public void setHintArrow(LocalPoint point) {

	}

	@Override
	public void setHintArrow(net.runelite.api.Player player) {

	}

	@Override
	public void setHintArrow(NPC npc) {

	}

	@Override
	public WorldPoint getHintArrowPoint() {
		return null;
	}

	@Override
	public net.runelite.api.Player getHintArrowPlayer() {
		return null;
	}

	@Override
	public NPC getHintArrowNpc() {
		return null;
	}

	@Override
	public IntPredicate getAnimationInterpolationFilter() {
		return value -> Settings.force_tweening;
	}

	@Override
	public void setAnimationInterpolationFilter(IntPredicate filter) {
		Settings.force_tweening = !Settings.force_tweening;
	}

	@Override
	public void setAnimOffsetX(int animOffsetX) {

	}

	@Override
	public void setAnimOffsetY(int animOffsetY) {

	}

	@Override
	public void setAnimOffsetZ(int animOffsetZ) {

	}

	@Override
	public RSFrames getFrames(int frameId) {
		return null;
	}

	@Override
	public RSSpritePixels getMinimapSprite() {
		return null;
	}

	@Override
	public void setMinimapSprite(SpritePixels spritePixels) {

	}

	@Override
	public void drawObject(int z, int x, int y, int randomColor1, int randomColor2) {

	}

	@Override
	public RSScriptEvent createScriptEvent() {
		return null;
	}

	@Override
	public void runScript(RSScriptEvent ev, int ex, int var2) {

	}

	@Override
	public void runScriptLogic(RSScriptEvent ev, RSScript s, int ex, int var2) {

	}

	@Override
	public void setHintArrowTargetType(int value) {

	}

	@Override
	public int getHintArrowTargetType() {
		return 0;
	}

	@Override
	public void setHintArrowX(int value) {

	}

	@Override
	public int getHintArrowX() {
		return 0;
	}

	@Override
	public void setHintArrowY(int value) {

	}

	@Override
	public int getHintArrowY() {
		return 0;
	}

	@Override
	public void setHintArrowOffsetX(int value) {

	}

	@Override
	public void setHintArrowOffsetY(int value) {

	}

	@Override
	public void setHintArrowNpcTargetIdx(int value) {

	}

	@Override
	public int getHintArrowNpcTargetIdx() {
		return 0;
	}

	@Override
	public void setHintArrowPlayerTargetIdx(int value) {

	}

	@Override
	public int getHintArrowPlayerTargetIdx() {
		return 0;
	}

	@Override
	public boolean isInInstancedRegion() {
		return false;
	}

	@Override
	public int getFlags() {
		return 0;
	}

	@Override
	public void setCompass(SpritePixels spritePixels) {

	}

	@Override
	public int getOculusOrbState() {
		return 0;
	}

	@Override
	public void setOculusOrbState(int state) {

	}

	@Override
	public void setOculusOrbNormalSpeed(int speed) {

	}

	@Override
	public int getOculusOrbFocalPointX() {
		return 0;
	}

	@Override
	public int getOculusOrbFocalPointY() {
		return 0;
	}

	@Override
	public int getOculusOrbFocalPointZ() {
		return 0;
	}

	@Override
	public void setOculusOrbFocalPointX(int x) {

	}

	@Override
	public void setOculusOrbFocalPointY(int y) {

	}

	@Override
	public void setOculusOrbFocalPointZ(int z) {

	}

	@Override
	public void openWorldHopper() {

	}

	@Override
	public void hopToWorld(World world) {

	}

	@Override
	public void setSkyboxColor(int skyboxColor) {
		Settings.fog_color = skyboxColor;
	}

	@Override
	public int getSkyboxColor() {
		return Settings.fog_color;
	}

	@Override
	public boolean isGpu() {
		return false;
	}

	@Override
	public void setGpuFlags(int gpuflags) {

	}

	@Override
	public void setExpandedMapLoading(int chunks) {

	}

	@Override
	public int getExpandedMapLoading() {
		return 0;
	}

	@Override
	public RSTileItem getLastItemDespawn() {
		return null;
	}

	@Override
	public void setLastItemDespawn(RSTileItem lastItemDespawn) {

	}

	@Override
	public RSWidget createWidget() {
		return null;
	}

	@Override
	public void revalidateWidget(net.runelite.api.widgets.Widget w) {

	}

	@Override
	public void revalidateWidgetScroll(net.runelite.api.widgets.Widget[] group, net.runelite.api.widgets.Widget w, boolean postEvent) {

	}

	@Override
	public int getEntitiesAtMouseCount() {
		return 0;
	}

	@Override
	public void setEntitiesAtMouseCount(int i) {

	}

	@Override
	public long[] getEntitiesAtMouse() {
		return new long[0];
	}

	@Override
	public int getViewportMouseX() {
		return 0;
	}

	@Override
	public int getViewportMouseY() {
		return 0;
	}

	@Override
	public RSTextureProvider getTextureProvider() {
		return null;
	}

	@Override
	public boolean getViewportContainsMouse() {
		return false;
	}

	@Override
	public int[] getGraphicsPixels() {
		return new int[0];
	}

	@Override
	public void drawOriginalMenu(int alpha) {

	}

	@Override
	public void resetHealthBarCaches() {

	}

	@Override
	public int getGraphicsPixelsWidth() {
		return 0;
	}

	@Override
	public int getGraphicsPixelsHeight() {
		return 0;
	}

	@Override
	public void rasterizerFillRectangle(int x, int y, int w, int h, int rgb) {

	}

	@Override
	public int getStartX() {
		return 0;
	}

	@Override
	public int getStartY() {
		return 0;
	}

	@Override
	public int getEndX() {
		return 0;
	}

	@Override
	public int getEndY() {
		return 0;
	}

	@Override
	public void setSpellSelected(boolean selected) {

	}

	@Override
	public RSEnumComposition getRsEnum(int id) {
		return null;
	}

	@Override
	public int getMenuX() {
		return 0;
	}

	@Override
	public int getMenuY() {
		return 0;
	}

	@Override
	public int getMenuHeight() {
		return 0;
	}

	@Override
	public int getMenuWidth() {
		return 0;
	}

	@Override
	public void setMenuX(int x) {

	}

	@Override
	public void setMenuY(int y) {

	}

	@Override
	public void setMenuHeight(int h) {

	}

	@Override
	public void setMenuWidth(int w) {

	}

	@Override
	public RSFont getFontBold12() {
		return null;
	}

	@Override
	public void rasterizerDrawHorizontalLine(int x, int y, int w, int rgb) {

	}

	@Override
	public void rasterizerDrawHorizontalLineAlpha(int x, int y, int w, int rgb, int a) {

	}

	@Override
	public void rasterizerDrawVerticalLine(int x, int y, int h, int rgb) {

	}

	@Override
	public void rasterizerDrawVerticalLineAlpha(int x, int y, int h, int rgb, int a) {

	}

	@Override
	public void rasterizerDrawGradient(int x, int y, int w, int h, int rgbTop, int rgbBottom) {

	}

	@Override
	public void rasterizerDrawGradientAlpha(int x, int y, int w, int h, int rgbTop, int rgbBottom, int alphaTop, int alphaBottom) {

	}

	@Override
	public void rasterizerFillRectangleAlpha(int x, int y, int w, int h, int rgb, int a) {

	}

	@Override
	public void rasterizerDrawRectangle(int x, int y, int w, int h, int rgb) {

	}

	@Override
	public void rasterizerDrawRectangleAlpha(int x, int y, int w, int h, int rgb, int a) {

	}

	@Override
	public void rasterizerDrawCircle(int x, int y, int r, int rgb) {

	}

	@Override
	public void rasterizerDrawCircleAlpha(int x, int y, int r, int rgb, int a) {

	}

	@Override
	public RSEvictingDualNodeHashTable getHealthBarCache() {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable getHealthBarSpriteCache() {
		return null;
	}

	@Override
	public boolean getRenderSelf() {
		return false;
	}

	@Override
	public void setRenderSelf(boolean enabled) {

	}

	@Override
	public RSMouseRecorder getMouseRecorder() {
		return null;
	}

	@Override
	public String getSelectedSpellName() {
		return "";
	}

	@Override
	public void setSelectedSpellName(String name) {

	}

	@Override
	public String getSelectedSpellActionName() {
		return "";
	}

	@Override
	public void setSelectedSpellActionName(String action) {

	}

	@Override
	public int getSelectedSpellFlags() {
		return 0;
	}

	@Override
	public void setSelectedSpellFlags(int var0) {

	}

	@Override
	public boolean getSpellSelected() {
		return false;
	}

	@Override
	public RSSoundEffect getTrack(RSAbstractArchive indexData, int id, int var0) {
		return null;
	}

	@Override
	public RSRawPcmStream createRawPcmStream(RSRawSound audioNode, int var0, int volume) {
		return null;
	}

	@Override
	public RSPcmStreamMixer getSoundEffectAudioQueue() {
		return null;
	}

	@Override
	public RSArchive getIndexCache4() {
		return null;
	}

	@Override
	public RSDecimator getSoundEffectResampler() {
		return null;
	}

	@Override
	public void playMusicTrack(int var0, RSAbstractArchive var1, int var2, int var3, int var4, boolean var5) {

	}

	@Override
	public RSSpritePixels[] getCrossSprites() {
		return new RSSpritePixels[0];
	}

	@Override
	public EnumComposition getEnum(int id) {
		return null;
	}

	@Override
	public void draw2010Menu(int alpha) {

	}

	@Override
	public void setModulus(BigInteger modulus) {

	}

	@Override
	public BigInteger getModulus() {
		return null;
	}

	@Override
	public int getItemCount() {
		return 0;
	}

	@Override
	public void setAllWidgetsAreOpTargetable(boolean value) {

	}

	@Override
	public void rsInsertMenuItem(String action, String target, int opcode, int identifier, int argument1, int argument2, int argument3, boolean forceLeftClick, int worldViewId) {

	}

	@Override
	public void invalidateWidgetsUnder(int var0, int var1, int var2, int var3) {

	}

	@Override
	public int getSelectedSpellWidget() {
		return 0;
	}

	@Override
	public int getSelectedSpellChildIndex() {
		return 0;
	}

	@Override
	public void setSelectedSpellChildIndex(int index) {

	}

	@Override
	public int getSelectedSpellItemId() {
		return 0;
	}

	@Override
	public void setSelectedSpellItemId(int itemId) {

	}

	@Override
	public void setSelectedSpellWidget(int widgetID) {

	}

	@Override
	public void scaleSprite(int[] canvas, int[] pixels, int color, int pixelX, int pixelY, int canvasIdx, int canvasOffset, int newWidth, int newHeight, int pixelWidth, int pixelHeight, int oldWidth) {

	}

	@Override
	public void promptCredentials(boolean clearPass) {

	}

	@Override
	public RSVarpDefinition getVarpDefinition(int id) {
		return null;
	}

	@Override
	public RSFloorOverlayDefinition newFloorOverlayDefinition() {
		return null;
	}

	@Override
	public RSTileItem newTileItem() {
		return null;
	}

	@Override
	public RSNodeDeque newNodeDeque() {
		return null;
	}

	@Override
	public void updateItemPile(int plane, int localX, int localY) {

	}

	@Override
	public void setShowMouseCross(boolean show) {

	}

	@Override
	public NodeCache getWidgetSpriteCache() {
		return null;
	}

	@Override
	public int getTickCount() {
		return 0;
	}

	@Override
	public void setTickCount(int tickCount) {

	}

	@Override
	public void setInventoryDragDelay(int delay) {

	}

	@Override
	public EnumSet<WorldType> getWorldType() {
		return null;
	}

	@Override
	public int getCameraMode() {
		return 0;
	}

	@Override
	public void setCameraMode(int mode) {

	}

	@Override
	public double getCameraFocalPointX() {
		return 0;
	}

	@Override
	public void setCameraFocalPointX(double x) {

	}

	@Override
	public double getCameraFocalPointY() {
		return 0;
	}

	@Override
	public void setCameraFocalPointY(double y) {

	}

	@Override
	public double getCameraFocalPointZ() {
		return 0;
	}

	@Override
	public void setCameraFocalPointZ(double z) {

	}

	@Override
	public void setFreeCameraSpeed(int speed) {

	}

	@Override
	public void setMouseCrossState(int state) {

	}

	@Override
	public int[] getChangedSkillLevels() {
		return new int[0];
	}

	@Override
	public void setMouseLastPressedMillis(long time) {

	}

	@Override
	public long getClientMouseLastPressedMillis() {
		return 0;
	}

	@Override
	public void setClientMouseLastPressedMillis(long time) {

	}

	@Override
	public int getRootWidgetCount() {
		return 0;
	}

	@Override
	public int getWidgetClickX() {
		return 0;
	}

	@Override
	public int getWidgetClickY() {
		return 0;
	}

	@Override
	public int getStaffModLevel() {
		return 0;
	}

	@Override
	public int getTradeChatMode() {
		return 0;
	}

	@Override
	public int getPublicChatMode() {
		return 0;
	}

	@Override
	public int getClientType() {
		return 0;
	}

	@Override
	public boolean isOnMobile() {
		return false;
	}

	@Override
	public boolean hadFocus() {
		return false;
	}

	@Override
	public int getMouseCrossColor() {
		return 0;
	}

	@Override
	public void setMouseCrossColor(int color) {

	}

	@Override
	public boolean getLeftClickOpensMenu() {
		return false;
	}

	@Override
	public boolean getShowMouseOverText() {
		return false;
	}

	@Override
	public void setShowMouseOverText(boolean showMouseOverText) {

	}

	@Override
	public boolean getShowLoadingMessages() {
		return false;
	}

	@Override
	public void setShowLoadingMessages(boolean showLoadingMessages) {

	}

	@Override
	public void setStopTimeMs(long time) {

	}

	@Override
	public void clearLoginScreen(boolean shouldClear) {

	}

	@Override
	public void setLeftTitleSprite(SpritePixels background) {

	}

	@Override
	public void setRightTitleSprite(SpritePixels background) {

	}

	@Override
	public RSBuffer newBuffer(byte[] bytes) {
		return null;
	}

	@Override
	public RSVarbitComposition newVarbitDefinition() {
		return null;
	}

	@Override
	public int getFollowerIndex() {
		return 0;
	}

	@Override
	public int isItemSelected() {
		return 0;
	}

	@Override
	public net.runelite.api.widgets.Widget getMessageContinueWidget() {
		return null;
	}

	@Override
	public boolean isPlayingJingle() {
		return false;
	}

	@Override
	public ArrayList<RSMusicSong> getMusicSongs() {
		return null;
	}

	@Override
	public void setRSMusicVolume(int var0) {

	}

	@Override
	public void setMusicPlayerStatus(int var0) {

	}

	@Override
	public int[] getChangedVarps() {
		return new int[0];
	}

	@Override
	public int getChangedVarpCount() {
		return 0;
	}

	@Override
	public void setChangedVarpCount(int changedVarpCount) {

	}

	@Override
	public RSWidget getScriptActiveWidget() {
		return null;
	}

	@Override
	public RSWidget getScriptDotWidget() {
		return null;
	}

	@Override
	public boolean isFriended(String name, boolean mustBeLoggedIn) {
		return false;
	}

	@Override
	public RSScriptEvent createRSScriptEvent(Object... args) {
		return null;
	}

	@Override
	public void runScriptEvent(RSScriptEvent event) {

	}

	@Override
	public RSEvictingDualNodeHashTable getScriptCache() {
		return null;
	}

	@Override
	public RSScript getScript(int scriptID) {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable getRSStructCompositionCache() {
		return null;
	}

	@Override
	public RSStructComposition getRSStructComposition(int id) {
		return null;
	}

	@Override
	public RSParamComposition getRSParamComposition(int id) {
		return null;
	}

	@Override
	public RSSequenceDefinition getSequenceDefinition(int id) {
		return null;
	}

	@Override
	public RSIntegerNode newIntegerNode(int contents) {
		return null;
	}

	@Override
	public RSObjectNode newObjectNode(Object contents) {
		return null;
	}

	@Override
	public RSIterableNodeHashTable newIterableNodeHashTable(int size) {
		return null;
	}

	@Override
	public RSVarbitComposition getVarbitComposition(int id) {
		return null;
	}

	@Override
	public RSAbstractArchive getSequenceDefinition_skeletonsArchive() {
		return null;
	}

	@Override
	public RSAbstractArchive getSequenceDefinition_archive() {
		return null;
	}

	@Override
	public RSAbstractArchive getSequenceDefinition_animationsArchive() {
		return null;
	}

	@Override
	public RSAbstractArchive getNpcDefinition_archive() {
		return null;
	}

	@Override
	public RSAbstractArchive getObjectDefinition_modelsArchive() {
		return null;
	}

	@Override
	public RSAbstractArchive getObjectDefinition_archive() {
		return null;
	}

	@Override
	public RSAbstractArchive getItemDefinition_archive() {
		return null;
	}

	@Override
	public RSAbstractArchive getKitDefinition_archive() {
		return null;
	}

	@Override
	public RSAbstractArchive getKitDefinition_modelsArchive() {
		return null;
	}

	@Override
	public RSAbstractArchive getSpotAnimationDefinition_archive() {
		return null;
	}

	@Override
	public RSAbstractArchive getSpotAnimationDefinition_modelArchive() {
		return null;
	}

	@Override
	public RSBuffer createBuffer(byte[] bytes) {
		return null;
	}

	@Override
	public RSSceneTilePaint createSceneTilePaint(int swColor, int seColor, int neColor, int nwColor, int texture, int rgb, boolean isFlat) {
		return null;
	}

	@Override
	public long[] getCrossWorldMessageIds() {
		return new long[0];
	}

	@Override
	public int getCrossWorldMessageIdsIndex() {
		return 0;
	}

	@Override
	public ClanChannel getClanChannel() {
		return null;
	}

	@Override
	public RSClanChannel[] getCurrentClanChannels() {
		return new RSClanChannel[0];
	}

	@Override
	public RSClanSettings[] getCurrentClanSettingsAry() {
		return new RSClanSettings[0];
	}

	@Override
	public RSClanChannel getGuestClanChannel() {
		return null;
	}

	@Override
	public ClanSettings getClanSettings() {
		return null;
	}

	@Override
	public RSClanSettings getGuestClanSettings() {
		return null;
	}

	@Override
	public ClanChannel getClanChannel(int clanId) {
		return null;
	}

	@Override
	public ClanSettings getClanSettings(int clanId) {
		return null;
	}

	@Override
	public void setUnlockedFps(boolean unlock) {

	}

	@Override
	public void setUnlockedFpsTarget(int fps) {

	}

	@Override
	public ClanRank getClanRankFromRs(int rank) {
		return null;
	}

	@Override
	public RSIterableNodeHashTable readStringIntParameters(RSBuffer buffer, RSIterableNodeHashTable table) {
		return null;
	}

	@Override
	public int getRndHue() {
		return 0;
	}

	@Override
	public short[][][] getTileUnderlays() {
		return new short[0][][];
	}

	@Override
	public short[][][] getTileOverlays() {
		return new short[0][][];
	}

	@Override
	public byte[][][] getTileShapes() {
		return new byte[0][][];
	}

	@Override
	public RSSpotAnimationDefinition getSpotAnimationDefinition(int id) {
		return null;
	}

	@Override
	public RSModelData getModelData(RSAbstractArchive var0, int var1, int var2) {
		return null;
	}

	@Override
	public boolean isCameraLocked() {
		return false;
	}

	@Override
	public boolean getCameraPitchRelaxerEnabled() {
		return false;
	}

	@Override
	public boolean isUnlockedFps() {
		return false;
	}

	@Override
	public long getUnlockedFpsTarget() {
		return 0;
	}

	@Override
	public void posToCameraAngle(int var0, int var1) {

	}

	@Override
	public RSNodeDeque getAmbientSoundEffects() {
		return null;
	}

	@Override
	public void setIdleTimeout(int ticks) {

	}

	@Override
	public int getIdleTimeout() {
		return 0;
	}

	@Override
	public boolean isMinimapZoom() {
		return false;
	}

	@Override
	public void setMinimapZoom(boolean minimapZoom) {

	}

	@Override
	public double getMinimapZoom() {
		return 0;
	}

	@Override
	public void setMinimapZoom(double zoom) {

	}

	@Override
	public void setMinimapTileDrawer(TileFunction drawTile) {

	}

	@Override
	public Rasterizer getRasterizer() {
		return null;
	}

	@Override
	public void menuAction(int p0, int p1, MenuAction action, int id, int itemId, String option, String target) {

	}

	@Override
	public WorldView getWorldView(int id) {
		return null;
	}

	@Override
	public RSAbstractArchive getFloorOverlayDefinitionArchive() {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable getFloorOverlayDefinitionCache() {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable getItemCompositionCache() {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable getObjectCompositionCache() {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable getObjectDefinitionModelsCache() {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable getAnimationCache() {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable getSequenceDefinitionCache() {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable getItemModelCache() {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable getItemSpriteCache() {
		return null;
	}

	@Override
	public SpritePixels[] getSprites(IndexDataBase source, int archiveId, int fileId) {
		return new SpritePixels[0];
	}

	@Override
	public RSEvictingDualNodeHashTable getArchive11() {
		return null;
	}

	@Override
	public RSIterableNodeHashTable createIterableNodeHashTable(int size) {
		return null;
	}

	@Override
	public RSRuneLiteClanMember runeliteClanMember(ClanSettings var1, int var2) {
		return null;
	}

	@Override
	public RSProjectile newProjectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		return null;
	}

	@Override
	public RSModelData newModelData(ModelData[] var1, int var2) {
		return null;
	}

	@Override
	public RSEvictingDualNodeHashTable newEvictingDualNodeHashTable(int var1) {
		return null;
	}

	@Override
	public RSDbTable getDbTable(int var0) {
		return null;
	}

	@Override
	public RSDbTableType getDbTableType(int var0) {
		return null;
	}

	@Override
	public RSDbRowType getDbRowType(int var0) {
		return null;
	}

	@Override
	public int getGraphicsCycle() {
		return 0;
	}

	@Override
	public void openMenu(int mouseX, int mouseY) {

	}

	@Override
	public RSClips getClips() {
		return null;
	}

	@Override
	public RSModelData[] getModelDataArray() {
		return new RSModelData[0];
	}

	@Override
	public boolean[] getValidRootWidgets() {
		return new boolean[0];
	}

	@Override
	public RSNodeDeque getScriptEvents() {
		return null;
	}

	@Override
	public RSNodeDeque getScriptEvents2() {
		return null;
	}

	@Override
	public RSNodeDeque getScriptEvents3() {
		return null;
	}

	@Override
	public String getLoginResponse0() {
		return "";
	}

	@Override
	public String getLoginResponse1() {
		return "";
	}

	@Override
	public String getLoginResponse2() {
		return "";
	}

	@Override
	public String getLoginResponse3() {
		return "";
	}

	@Override
	public int getBanType() {
		return 0;
	}

	@Override
	public RSPacketWriter getPacketWriter() {
		return null;
	}

	@Override
	public RSPacketBufferNode preparePacket(ClientPacket packet, IsaacCipher isaac) {
		return null;
	}

	@Override
	public PacketBufferNode preparePacket(ClientPacket packet) {
		return null;
	}

	@Override
	public boolean loadWorlds() {
		return false;
	}

	@Override
	public void processDialog(int widgetUid, int menuIndex) {

	}

	@Override
	public void setDestinationX(int sceneX) {

	}

	@Override
	public void setDestinationY(int sceneY) {

	}

	@Override
	public void setWindowedMode(int mode) {

	}

	@Override
	public int getWindowedMode() {
		return 0;
	}

	@Override
	public boolean isFocused() {
		return false;
	}

	@Override
	public void setFocused(boolean focused) {

	}

	@Override
	public void setClickCrossX(int x) {

	}

	@Override
	public void setClickCrossY(int y) {

	}

	@Override
	public void setLoginIndex(int index) {

	}

	@Override
	public RSLoginState getRSLoginState() {
		return null;
	}

	@Override
	public RSClientPacket createClientPacket(int opcode, int length) {
		return null;
	}

	@Override
	public RSServerPacket createServerPacket(int opcode, int length) {
		return null;
	}

	@Override
	public String getPassword() {
		return "";
	}

	@Override
	public long calculateTag(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		return 0;
	}

	@Override
	public void setDraggedWidget(net.runelite.api.widgets.Widget widget) {

	}

	@Override
	public void invokeWidgetAction(int identifier, int param1, int param0, int itemId, String target) {

	}

	@Override
	public RSServerPacket[] getServerPackets() {
		return new RSServerPacket[0];
	}

	@Override
	public void setStaffModLevel(int level) {

	}

	@Override
	public boolean isMembersWorld() {
		return false;
	}

	@Override
	public long getUserId() {
		return 0;
	}

	@Override
	public long getUserHash() {
		return 0;
	}

	@Override
	public RSWorldView getTopLevelWorldView() {
		return null;
	}

	@Override
	public RSWorldView getWorldView() {
		return null;
	}

	@Override
	public int[] getMenuWorldViewIds() {
		return new int[0];
	}

	@Override
	public String getAccessToken() {
		return "";
	}

	@Override
	public void setAccessToken(String accessToken) {

	}

	@Override
	public String getRefreshToken() {
		return "";
	}

	@Override
	public void setRefreshToken(String refreshToken) {

	}

	@Override
	public String getSessionId() {
		return "";
	}

	@Override
	public void setSessionId(String sessionId) {

	}

	@Override
	public String getCharacterId() {
		return "";
	}

	@Override
	public void setCharacterId(String characterId) {

	}

	@Override
	public String getDisplayName() {
		return "";
	}

	@Override
	public void setDisplayName(String displayName) {

	}

	@Override
	public boolean containsAccessAndRefreshToken() {
		return false;
	}

	@Override
	public boolean containsSessionAndCharacterId() {
		return false;
	}

	@Override
	public String getCredentialsProperty(String var1) {
		return "";
	}

	@Override
	public Properties getCredentialsProperties() {
		return null;
	}

	@Override
	public boolean storeCredentials() {
		return false;
	}

	@Override
	public void writeCredentials() {

	}

	@Override
	public byte[] getCachedRandomDatData(String username) {
		return new byte[0];
	}

	@Override
	public void writeCachedRandomDatData(String username, byte[] data) {

	}

	@Override
	public boolean useCachedRandomDat() {
		return false;
	}

	@Override
	public boolean useCachedUUID() {
		return false;
	}

	@Override
	public long getAccountHash() {
		return 0;
	}

	@Override
	public Canvas getCanvas() {
		return null;
	}

	@Override
	public Thread getClientThread() {
		return null;
	}

	@Override
	public void resizeCanvas() {

	}

	@Override
	public boolean isResizeCanvasNextFrame() {
		return false;
	}

	@Override
	public void setResizeCanvasNextFrame(boolean resize) {

	}

	@Override
	public boolean isReplaceCanvasNextFrame() {
		return false;
	}

	@Override
	public void setReplaceCanvasNextFrame(boolean replace) {

	}

	@Override
	public void setMaxCanvasWidth(int width) {

	}

	@Override
	public void setMaxCanvasHeight(int height) {

	}

	@Override
	public void setFullRedraw(boolean fullRedraw) {

	}
}
