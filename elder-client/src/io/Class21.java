package io;

/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

import io.cache.Cache;
import io.cache.Revision;

abstract class Class21 {
	int anInt317;
	static int anInt318;
	int anInt319;
	static Class81 aClass81_320 = new Class81(6, 0, 4, 2);
	int anInt321;
	static int anInt322;

	abstract void method195(int i, int i_0_, int i_1_);

	abstract void method196(int i, int i_2_, int i_3_);

	public static void method197(byte i) {
		try {
			aClass81_320 = null;
			Cache.reset_index(Revision.PRE_EOC_634, "music");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cc.A(" + i + ')');
		}
	}

	static final void method198(boolean bool) {
		try {
			anInt318++;
			if (Class38_Sub1.aFrame5114 == null) {
				java.awt.Container container;
				if (Client.frame == null)
					container = Client.sign_link.anApplet733;
				else
					container = Client.frame;
				Class246_Sub28_Sub35.anInt7014 = container.getSize().width;
				Class8.anInt101 = container.getSize().height;
				if (Client.frame == container) {
					Insets insets = Client.frame.getInsets();
					Class246_Sub28_Sub35.anInt7014 -= insets.left + insets.right;
					Class8.anInt101 -= insets.bottom + insets.top;
				}
				if (bool != false)
					method198(false);
				if (Client.get_frame_mode((byte) -123) == 1) {
					Client.client_height = Class83.anInt1090;
					Client.client_width = Class196.anInt2757;
					Class125.anInt1768 = (-Class196.anInt2757 + Class246_Sub28_Sub35.anInt7014) / 2;
					Class100_Sub1.anInt5075 = 0;
				} else if ((Class40_Sub2.anInt4047 ^ 0xffffffff) <= -97 || (Buffer.anInt5656 ^ 0xffffffff) != -1) {
					Client.client_height = Class8.anInt101;
					Client.client_width = Class246_Sub28_Sub35.anInt7014;
					Class100_Sub1.anInt5075 = 0;
					Class125.anInt1768 = 0;
				} else {
					int i = (((Class246_Sub28_Sub35.anInt7014 ^ 0xffffffff) < -1025) ? 1024
							: Class246_Sub28_Sub35.anInt7014);
					Client.client_width = i;
					int i_4_ = Class8.anInt101 <= 768 ? Class8.anInt101 : 768;
					Class125.anInt1768 = (-i + Class246_Sub28_Sub35.anInt7014) / 2;
					Client.client_height = i_4_;
					Class100_Sub1.anInt5075 = 0;
				}
				if (Class260_Sub2.aClass205_4297 != Class208.aClass205_2930) {
					if ((Client.client_width ^ 0xffffffff) > -1025 && Client.client_height < 768) {
						/* empty */
					}
				}
				GameEngine.canvas.setSize(Client.client_width, Client.client_height);
				if (Client.sprite_loader != null)
					Client.sprite_loader.method1713(GameEngine.canvas);
				if (container == Client.frame) {
					Insets insets = Client.frame.getInsets();
					GameEngine.canvas.setLocation(Class125.anInt1768 + insets.left,
							insets.top - -Class100_Sub1.anInt5075);
				} else
					GameEngine.canvas.setLocation(Class125.anInt1768, Class100_Sub1.anInt5075);
				if ((Widget.root_interface ^ 0xffffffff) != 0)
					Class177.method1165((byte) -34, true, 193);
				Class246_Sub28_Sub30.method2834((byte) 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cc.C(" + bool + ')');
		}
	}

	abstract void method199(int i, int i_5_, int i_6_);

	Class21(int i, int i_7_, int i_8_) {
		try {
			((Class21) this).anInt317 = i_7_;
			((Class21) this).anInt319 = i_8_;
			((Class21) this).anInt321 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cc.<init>(" + i + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static {
		new MultilingualString("Unable to add friend - system busy.",
				"Der Freund konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
				"Impossible d'ajouter un ami - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel adicionar o amigo. O sistema est\u00e1 ocupado.");
	}
}
