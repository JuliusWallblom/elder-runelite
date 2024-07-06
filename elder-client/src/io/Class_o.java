package io;

/* Class_o - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Class_o extends Applet implements Runnable, FocusListener, WindowListener {
	private boolean aBool7185 = false;
	static int anInt7186;
	static int anInt7187;
	static int anInt7188;
	static int anInt7189;
	private boolean aBool7190 = false;
	static int anInt7191;
	static int anInt7192;
	static int anInt7193;
	static int anInt7194;
	static int anInt7195;
	static int anInt7196;
	static int anInt7197;
	static int anInt7198;
	static int anInt7199;
	static int anInt7200;
	static int anInt7201;
	static int anInt7202;
	static int anInt7203;
	static int anInt7204;
	static int anInt7205;
	static int anInt7206;
	static int anInt7207;
	static Class68 aClass68_7208 = new Class68();
	static int anInt7209;
	static int anInt7210;
	static int anInt7211;
	static int anInt7212;
	static int anInt7213;
	static int anInt7214;
	static int anInt7215;
	static int anInt7216;
	static int anInt7217;
	static int anInt7218;
	static int anInt7219;
	static int anInt7220;
	static int anInt7221;
	static int anInt7222;
	static Class169 aClass169_7223;
	static int anInt7225 = 0;
	static float aFloat7226;
	public static int anInt7227;
	public static int anInt7228;
	public static int anInt7229;
	public static boolean aBool7230;
	public static boolean aBool7231;

	private final void method2936(int i) {
		try {
			anInt7204++;
			if (i != 8101)
				aClass68_7208 = null;
			long l = TimeUtility.time();
			long l_1_ = Class75.aLongArray987[Class246_Sub1_Sub3.anInt5710];
			Class75.aLongArray987[Class246_Sub1_Sub3.anInt5710] = l;
			if ((l_1_ ^ 0xffffffffffffffffL) != -1L && (l_1_ ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
				/* empty */
			}
			Class246_Sub1_Sub3.anInt5710 = 1 + Class246_Sub1_Sub3.anInt5710 & 0x1f;
			synchronized (this) {
				Filestore.aBool2049 = Class104.aBool1425;
			}
			method2938((byte) 57);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.R(" + i + ')');
		}
	}

	public final void focusGained(FocusEvent focusevent) {
		try {
			Class104.aBool1425 = true;
			anInt7187++;
			Class246_Sub28_Sub8.aBool6060 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"o.focusGained(" + (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	final void method2937(int i, String string) {
		try {
			anInt7211++;
			if (!aBool7185) {
				aBool7185 = true;
				if (i > 125) {
					System.out.println("error_game_" + string);
					try {
						Class80.method521(Client.sign_link.anApplet733, "loggedout", 84);
					} catch (Throwable throwable) {
						/* empty */
					}
					try {
						getAppletContext().showDocument(new URL(getCodeBase(), ("error_game_" + string + ".ws")),
								"_top");
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("o.A(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method2938(byte i);

	public final void start() {
		try {
			anInt7201++;
			if (Class248.aClass_o3488 == this && !Class249.aBool3522)
				Class94.aLong1232 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.start(" + ')');
		}
	}

	public final AppletContext getAppletContext() {
		try {
			anInt7212++;
			if (Client.frame != null)
				return null;
			if (Client.sign_link != null && this != Client.sign_link.anApplet733)
				return Client.sign_link.anApplet733.getAppletContext();
			return super.getAppletContext();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.getAppletContext(" + ')');
		}
	}

	static final void method2939() {
		for (int i = 0; i < Class_a.anInt1181; i++) {
			Class59_Sub3 class59_sub3 = Class246_Sub28_Sub36.aClass59_Sub3Array7018[i];
			Class246_Sub28_Sub14.method2636(class59_sub3);
			Class246_Sub28_Sub36.aClass59_Sub3Array7018[i] = null;
		}
		Class_a.anInt1181 = 0;
	}

	public abstract void init();

	final synchronized void method2940(byte i) {
		try {
			if (Tile.aCanvas2155 != null) {
				Tile.aCanvas2155.removeFocusListener(this);
				Tile.aCanvas2155.getParent().remove(Tile.aCanvas2155);
			}
			anInt7217++;
			Container container;
			if (Class38_Sub1.aFrame5114 != null)
				container = Class38_Sub1.aFrame5114;
			else if (Client.frame == null)
				container = Client.sign_link.anApplet733;
			else
				container = Client.frame;
			container.setLayout(null);
			Tile.aCanvas2155 = new Canvas_Sub1(this);
			container.add(Tile.aCanvas2155);
			Tile.aCanvas2155.setSize(Client.client_width, Client.client_height);
			Tile.aCanvas2155.setVisible(true);
			if (container != Client.frame)
				Tile.aCanvas2155.setLocation(Class125.anInt1768, Class100_Sub1.anInt5075);
			else {
				Insets insets = Client.frame.getInsets();
				Tile.aCanvas2155.setLocation((Class125.anInt1768 + insets.left),
						(insets.top + Class100_Sub1.anInt5075));
			}
			Tile.aCanvas2155.addFocusListener(this);
			Tile.aCanvas2155.requestFocus();
			Class104.aBool1425 = true;
			if (i >= -32)
				Clan.clanMembers = null;
			Filestore.aBool2049 = true;
			Class246_Sub28_Sub8.aBool6060 = true;
			Class246_Sub1_Sub6.aBool5963 = false;
			Class46.aLong663 = TimeUtility.time();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.J(" + i + ')');
		}
	}

	public final synchronized void paint(Graphics graphics) {
		do {
			try {
				anInt7218++;
				if (Class248.aClass_o3488 == this && !Class249.aBool3522) {
					Class246_Sub28_Sub8.aBool6060 = true;
					if (!Class246_Sub28_Sub24.aBool6676 || (-Class46.aLong663 + TimeUtility.time() <= 1000L))
						break;
					Rectangle rectangle = graphics.getClipBounds();
					if (rectangle == null || (Class246_Sub28_Sub35.anInt7014 <= rectangle.width
							&& Class8.anInt101 <= rectangle.height))
						Class246_Sub1_Sub6.aBool5963 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "o.paint(" + (graphics != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	public final String getParameter(String string) {
		try {
			anInt7198++;
			if (Client.frame != null)
				return null;
			if (Client.sign_link != null && this != Client.sign_link.anApplet733)
				return Client.sign_link.anApplet733.getParameter(string);
			return super.getParameter(string);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("o.getParameter(" + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public final void stop() {
		try {
			anInt7220++;
			if (this == Class248.aClass_o3488 && !Class249.aBool3522)
				Class94.aLong1232 = TimeUtility.time() - -4000L;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.stop(" + ')');
		}
	}

	public final void update(Graphics graphics) {
		try {
			anInt7213++;
			paint(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.update(" + (graphics != null ? "{...}" : "null") + ')');
		}
	}

	public final void windowActivated(WindowEvent windowevent) {
		try {
			anInt7200++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("o.windowActivated(" + (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final void windowDeactivated(WindowEvent windowevent) {
		try {
			anInt7189++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("o.windowDeactivated(" + (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2941(int i, float f, int i_2_, int i_3_, int i_4_, float[] fs, int i_5_, int i_6_,
			float f_7_, int i_8_, int i_9_) {
		try {
			i_4_ -= i_2_;
			anInt7216++;
			i_5_ -= i_6_;
			i -= i_9_;
			float f_10_ = ((float) i * fs[2] + ((float) i_4_ * fs[1] + fs[0] * (float) i_5_));
			float f_11_ = (fs[3] * (float) i_5_ + (float) i_4_ * fs[4] + fs[5] * (float) i);
			float f_12_ = (fs[7] * (float) i_4_ + (float) i_5_ * fs[6] + fs[i_3_] * (float) i);
			float f_13_ = (((float) Math.atan2((double) f_10_, (double) f_12_) / 6.2831855F) + 0.5F);
			if (f_7_ != 1.0F)
				f_13_ *= f_7_;
			float f_14_ = f + (0.5F + f_11_);
			if ((i_8_ ^ 0xffffffff) == -2) {
				float f_15_ = f_13_;
				f_13_ = -f_14_;
				f_14_ = f_15_;
			} else if ((i_8_ ^ 0xffffffff) != -3) {
				if ((i_8_ ^ 0xffffffff) == -4) {
					float f_16_ = f_13_;
					f_13_ = f_14_;
					f_14_ = -f_16_;
				}
			} else {
				f_13_ = -f_13_;
				f_14_ = -f_14_;
			}
			Class246_Sub1_Sub15.aFloat6601 = f_14_;
			VarcType.aFloat3098 = f_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("o.L(" + i + ',' + f + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (fs != null ? "{...}" : "null")
							+ ',' + i_5_ + ',' + i_6_ + ',' + f_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	private final void method2942(boolean bool, boolean bool_17_) {
		try {
			anInt7209++;
			synchronized (this) {
				if (Class249.aBool3522)
					return;
				Class249.aBool3522 = true;
			}
			if (Client.sign_link.anApplet733 != null)
				Client.sign_link.anApplet733.destroy();
			try {
				method2952(109);
			} catch (Exception exception) {
				/* empty */
			}
			if (aBool7190) {
				try {
					jagmisc.quit();
				} catch (Throwable throwable) {
					/* empty */
				}
				aBool7190 = false;
			}
			Class182 class182 = Client.sign_link.method349(Class248.aClass_o3488.getClass(), bool);
			while ((class182.anInt2539 ^ 0xffffffff) == -1)
				Class247.method1580(100L, -5184);
			if (bool != false)
				aFloat7226 = -0.70711446F;
			if (Tile.aCanvas2155 != null) {
				try {
					Tile.aCanvas2155.removeFocusListener(this);
					Tile.aCanvas2155.getParent().remove(Tile.aCanvas2155);
				} catch (Exception exception) {
					/* empty */
				}
			}
			if (Client.sign_link != null) {
				try {
					Client.sign_link.method347((byte) -117);
				} catch (Exception exception) {
					/* empty */
				}
			}
			method2946(true);
			if (Client.frame != null) {
				try {
					System.exit(0);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			System.out.println("Shutdown complete - clean:" + bool_17_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.B(" + bool + ',' + bool_17_ + ')');
		}
	}

	final void method2943(byte i) {
		try {
			int i_18_ = -90 % ((i + 26) / 46);
			anInt7194++;
			if (!aBool7190) {
				try {
					Class182 class182 = Client.sign_link.method356((byte) 72, Class248.aClass_o3488.getClass());
					while ((class182.anInt2539 ^ 0xffffffff) == -1)
						Class247.method1580(100L, -5184);
					if (class182.anObject2535 != null)
						throw (Throwable) class182.anObject2535;
					jagmisc.init();
					aBool7190 = true;
					Stream_Sub1.aClass110_5862 = Class246_Sub28_Sub28.method2813(-109);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.W(" + i + ')');
		}
	}

	public final void destroy() {
		try {
			anInt7210++;
			if (Class248.aClass_o3488 == this && !Class249.aBool3522) {
				Class94.aLong1232 = TimeUtility.time();
				Class247.method1580(5000L, -5184);
				Class211_Sub1.aClass52_5348 = null;
				method2942(false, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.destroy(" + ')');
		}
	}

	static final void method2944(int i, int i_19_, byte i_20_, int i_21_, boolean bool, int i_22_) {
		try {
			if ((i_19_ ^ 0xffffffff) > -2)
				i_19_ = 1;
			anInt7193++;
			if (i_22_ < 1)
				i_22_ = 1;
			int i_23_ = -334 + i_22_;
			if (i_23_ < 0)
				i_23_ = 0;
			else if (i_23_ > 100)
				i_23_ = 100;
			int i_24_ = ((MultilingualString.aShort888 + -Class159.aShort2260) * i_23_ / 100 + Class159.aShort2260);
			if (i_20_ == -21) {
				if (Class246_Sub28_Sub26.aShort6711 > i_24_)
					i_24_ = Class246_Sub28_Sub26.aShort6711;
				else if (i_24_ > Class246_Sub12.aShort4404)
					i_24_ = Class246_Sub12.aShort4404;
				int i_25_ = 512 * (i_22_ * i_24_) / (334 * i_19_);
				if ((Class60.aShort832 ^ 0xffffffff) >= (i_25_ ^ 0xffffffff)) {
					if (Class232.aShort3179 < i_25_) {
						i_25_ = Class232.aShort3179;
						i_24_ = 334 * (i_25_ * i_19_) / (i_22_ * 512);
						if (i_24_ < Class246_Sub28_Sub26.aShort6711) {
							i_24_ = Class246_Sub28_Sub26.aShort6711;
							int i_26_ = 334 * i_25_ * i_19_ / (i_24_ * 512);
							int i_27_ = (i_22_ - i_26_) / 2;
							if (bool) {
								Client.sprite_loader.e();
								Client.sprite_loader.method1734(i_21_, i_19_, i, (byte) 58, -16777216, i_27_);
								Client.sprite_loader.method1734(i_21_, i_19_, -i_27_ + (i_22_ + i), (byte) 58,
										-16777216, i_27_);
							}
							i_22_ -= 2 * i_27_;
							i += i_27_;
						}
					}
				} else {
					i_25_ = Class60.aShort832;
					i_24_ = i_19_ * (i_25_ * 334) / (i_22_ * 512);
					if (i_24_ > Class246_Sub12.aShort4404) {
						i_24_ = Class246_Sub12.aShort4404;
						int i_28_ = i_22_ * i_24_ * 512 / (334 * i_25_);
						int i_29_ = (i_19_ + -i_28_) / 2;
						if (bool) {
							Client.sprite_loader.e();
							Client.sprite_loader.method1734(i_21_, i_29_, i, (byte) 58, -16777216, i_22_);
							Client.sprite_loader.method1734(i_21_ - -i_19_ + -i_29_, i_29_, i, (byte) 58, -16777216,
									i_22_);
						}
						i_21_ += i_29_;
						i_19_ -= i_29_ * 2;
					}
				}
				Font.anInt1617 = i_24_ * i_22_ / 334;
				Class_g.anInt6482 = i;
				Class59_Sub1_Sub2.anInt6133 = (short) i_22_;
				Class179.anInt2512 = (short) i_19_;
				Class_g.f_ib = i_21_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("o.G(" + i + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + bool + ',' + i_22_ + ')'));
		}
	}

	public final void focusLost(FocusEvent focusevent) {
		try {
			Class104.aBool1425 = false;
			anInt7221++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.focusLost(" + (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	static final int method2945(byte i, int i_30_, byte[] is) {
		try {
			int i_31_ = -18 % ((-25 - i) / 58);
			anInt7192++;
			return Class96.method612(0, (byte) 102, is, i_30_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("o.O(" + i + ',' + i_30_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method2946(boolean bool);

	final void method2947(int i, int i_32_, int i_33_, int i_34_, byte i_35_) {
		try {
			anInt7195++;
			try {
				if (Class248.aClass_o3488 != null) {
					Class246_Sub38.anInt5449++;
					if ((Class246_Sub38.anInt5449 ^ 0xffffffff) <= -4)
						method2937(126, "alreadyloaded");
					else
						getAppletContext().showDocument(getDocumentBase(), "_self");
				} else {
					Class100_Sub1.anInt5075 = 0;
					Class125.anInt1768 = 0;
					Class248.aClass_o3488 = this;
					Class8.anInt101 = Client.client_height = i_33_;
					Class6.anInt77 = i;
					if (i_35_ > -30)
						destroy();
					Class246_Sub28_Sub35.anInt7014 = Client.client_width = i_34_;
					if (Client.sign_link == null)
						Class211_Sub1.aClass52_5348 = Client.sign_link = new Signlink(this, i_32_, null, 0);
					Class182 class182 = Client.sign_link.method354(127, 1, this);
					while ((class182.anInt2539 ^ 0xffffffff) == -1)
						Class247.method1580(10L, -5184);
				}
			} catch (Throwable throwable) {
				Class194_Sub1.method1883(throwable, null, -82);
				method2937(126, "crash");
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("o.F(" + i + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ')'));
		}
	}

	static final void method2948(int i) {
		Class246_Sub37_Sub4.anInt6880 = i;
		for (int i_36_ = 0; i_36_ < Class240.xSize; i_36_++) {
			for (int i_37_ = 0; i_37_ < HDModel.ySize; i_37_++) {
				if (Class106.tiles[i][i_36_][i_37_] == null)
					Class106.tiles[i][i_36_][i_37_] = new Tile(i, i_36_, i_37_);
			}
		}
	}

	public final void windowClosed(WindowEvent windowevent) {
		try {
			anInt7191++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"o.windowClosed(" + (windowevent != null ? "{...}" : "null") + ')');
		}
	}

	abstract void method2949(int i);

	public final void run() {
		try {
			anInt7214++;
			do {
				try {
					if (Signlink.aString747 != null) {
						String string = Signlink.aString747.toLowerCase();
						if ((string.indexOf("sun") ^ 0xffffffff) == 0 && string.indexOf("apple") == -1) {
							if (string.indexOf("ibm") != -1
									&& (Signlink.aString731 == null || Signlink.aString731.equals("1.4.2"))) {
								method2937(127, "wrongjava");
								break;
							}
						} else {
							String string_38_ = Signlink.aString731;
							if (string_38_.equals("1.1") || string_38_.startsWith("1.1.") || string_38_.equals("1.2")
									|| string_38_.startsWith("1.2.")) {
								method2937(126, "wrongjava");
								break;
							}
						}
					}
					if (Signlink.aString731 != null && Signlink.aString731.startsWith("1.")) {
						int i = 2;
						int i_39_ = 0;
						for (/**/; ((Signlink.aString731.length() ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
							int i_40_ = Signlink.aString731.charAt(i);
							if ((i_40_ ^ 0xffffffff) > -49 || i_40_ > 57)
								break;
							i_39_ = 10 * i_39_ + i_40_ - 48;
						}
						if (i_39_ >= 5)
							Class246_Sub28_Sub24.aBool6676 = true;
					}
					if (Client.sign_link.anApplet733 != null) {
						Method method = Signlink.aMethod751;
						if (method != null) {
							try {
								method.invoke((Client.sign_link.anApplet733), new Object[] { Boolean.TRUE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					}
					Class176.method1155((byte) -109);
					Class246_Sub13.method1994(27616);
					method2940((byte) -97);
					method2949(-22158);
					Stream_Sub1.aClass110_5862 = Class246_Sub28_Sub28.method2813(-67);
					method2943((byte) 47);
					while (Class94.aLong1232 == 0L || ((TimeUtility.time() ^ 0xffffffffffffffffL) > (Class94.aLong1232
							^ 0xffffffffffffffffL))) {
						Class234.anInt3194 = Stream_Sub1.aClass110_5862.method767(true, Class133.anInt1842);
						for (int i = 0; ((Class234.anInt3194 ^ 0xffffffff) < (i ^ 0xffffffff)); i++)
							method2936(8101);
						method2957(161363937);
						Class252.method1616(Client.sign_link, 93, Tile.aCanvas2155);
					}
				} catch (Throwable throwable) {
					Class194_Sub1.method1883(throwable, method2953((byte) -76), 68);
					method2937(127, "crash");
				}
			} while (false);
			method2942(false, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.run(" + ')');
		}
	}

	static final void method2950(byte i) {
		try {
			anInt7207++;
			if (i == -86) {
				for (int i_41_ = 0; Class5.anInt55 > i_41_; i_41_++) {
					int i_42_ = Class246_Sub28_Sub29.anIntArray6815[i_41_];
					Npc class_r_sub2 = VarcLoader.aClass_r_Sub2Array1002[i_42_];
					if (class_r_sub2 != null)
						Class246_Sub6.method1819(((NpcType) (((Npc) class_r_sub2).aClass253_7184)).size, (byte) -10,
								class_r_sub2);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.K(" + i + ')');
		}
	}

	final void create_frame(int i_43_, int i, boolean bool, int i_44_, int i_45_, String string, int i_46_, int i_47_) {
		try {
			try {
				Class246_Sub28_Sub35.anInt7014 = Client.client_width = i_46_;
				Class100_Sub1.anInt5075 = i_45_;
				Class125.anInt1768 = 0;
				Class6.anInt77 = i;
				Class8.anInt101 = Client.client_height = i_43_;
				Class248.aClass_o3488 = this;
				Client.frame = new Frame();
				Client.frame.setTitle(GameConstants.NAME);
				Client.frame.setResizable(true);
				Client.frame.addWindowListener(this);
				Client.frame.setVisible(true);
				Client.frame.toFront();
				Insets insets = Client.frame.getInsets();
				Client.frame.setSize((insets.right + Class246_Sub28_Sub35.anInt7014 + insets.left),
						(insets.bottom + Class8.anInt101 + insets.top));
				Class211_Sub1.aClass52_5348 = Client.sign_link = new Signlink(null, i_47_, string, i_44_);
				Class182 class182 = Client.sign_link.method354(-118, 1, this);
				while ((class182.anInt2539 ^ 0xffffffff) == -1)
					Class247.method1580(10L, -5184);
			} catch (Exception exception) {
				Class194_Sub1.method1883(exception, null, 120);
			}
			anInt7186++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("o.I(" + i + ',' + bool + ',' + i_43_ + ',' + i_44_ + ','
					+ i_45_ + ',' + (string != null ? "{...}" : "null") + ',' + i_46_ + ',' + i_47_ + ')'));
		}
	}

	abstract void method2952(int i);

	public final void windowIconified(WindowEvent windowevent) {
		try {
			anInt7215++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("o.windowIconified(" + (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	String method2953(byte i) {
		try {
			anInt7205++;
			if (i != -76)
				anInt7225 = 50;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.U(" + i + ')');
		}
	}

	public static final void providesignlink(Signlink class52) {
		try {
			anInt7203++;
			Class211_Sub1.aClass52_5348 = Client.sign_link = class52;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("o.providesignlink(" + (class52 != null ? "{...}" : "null") + ')'));
		}
	}

	public final URL getDocumentBase() {
		try {
			anInt7219++;
			if (Client.frame != null)
				return null;
			if (Client.sign_link != null && Client.sign_link.anApplet733 != this)
				return Client.sign_link.anApplet733.getDocumentBase();
			return super.getDocumentBase();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.getDocumentBase(" + ')');
		}
	}

	public final void windowOpened(WindowEvent windowevent) {
		try {
			anInt7199++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"o.windowOpened(" + (windowevent != null ? "{...}" : "null") + ')');
		}
	}

	static final void method2954(int i, byte i_48_) {
		try {
			Class109_Sub1_Sub1.anInt6731 = i;
			if (i_48_ != -94)
				aFloat7226 = -0.71957296F;
			anInt7188++;
			Class59_Sub3_Sub3.aClass54_6277.method369(false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.V(" + i + ',' + i_48_ + ')');
		}
	}

	public final void windowClosing(WindowEvent windowevent) {
		try {
			anInt7197++;
			destroy();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"o.windowClosing(" + (windowevent != null ? "{...}" : "null") + ')');
		}
	}

	public final URL getCodeBase() {
		try {
			anInt7202++;
			if (Client.frame != null)
				return null;
			if (Client.sign_link != null && Client.sign_link.anApplet733 != this)
				return Client.sign_link.anApplet733.getCodeBase();
			return super.getCodeBase();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void method2955(int i) {
		do {
			try {
				aClass68_7208 = null;
				aClass169_7223 = null;
				Clan.clanMembers = null;
				if (i == 19197)
					break;
				anInt7225 = 83;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "o.D(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract void method2956(int i);

	public final void windowDeiconified(WindowEvent windowevent) {
		try {
			anInt7206++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("o.windowDeiconified(" + (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2957(int i) {
		try {
			if (i == 161363937) {
				anInt7222++;
				long l = TimeUtility.time();
				long l_49_ = Class190.aLongArray2675[Class246_Sub38.anInt5450];
				Class190.aLongArray2675[Class246_Sub38.anInt5450] = l;
				if ((l_49_ ^ 0xffffffffffffffffL) != -1L && (l ^ 0xffffffffffffffffL) < (l_49_ ^ 0xffffffffffffffffL)) {
					int i_50_ = (int) (-l_49_ + l);
					Class246_Sub28_Sub18.anInt6517 = (32000 - -(i_50_ >> 1)) / i_50_;
				}
				Class246_Sub38.anInt5450 = 0x1f & 1 + Class246_Sub38.anInt5450;
				do {
					if (Class246_Sub43.anInt5599++ > 50) {
						Class246_Sub43.anInt5599 -= 50;
						Class246_Sub28_Sub8.aBool6060 = true;
						Tile.aCanvas2155.setSize((Client.client_width), Client.client_height);
						Tile.aCanvas2155.setVisible(true);
						if (Client.frame == null || Class38_Sub1.aFrame5114 != null) {
							Tile.aCanvas2155.setLocation((Class125.anInt1768), (Class100_Sub1.anInt5075));
							if (!Client.f_ob)
								break;
						}
						Insets insets = Client.frame.getInsets();
						Tile.aCanvas2155.setLocation(Class125.anInt1768 + insets.left,
								insets.top - -Class100_Sub1.anInt5075);
					}
				} while (false);
				method2956(6231);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "o.N(" + i + ')');
		}
	}

	static {
		aClass169_7223 = new Class169("", 14);
	}
}
