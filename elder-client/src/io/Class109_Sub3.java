package io;

/* Class109_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class109_Sub3 extends Class109 {
	static int anInt3946;
	int anInt3947;
	static int anInt3948;
	int anInt3949;
	static int anInt3950;
	private int anInt3951 = -1;
	private int anInt3952 = -1;
	static IncomingPacket aClass13_3953 = new IncomingPacket(30, 3);
	static int anInt3954;
	static int anInt3955;
	int anInt3956;
	static Class127 cs2_cache = new Class127(128), cs2_cache_550 = new Class127(128),
			cs2_cache_osrs = new Class127(128);

	Class109_Sub3(Class260_Sub2 class260_sub2, int i, int i_0_, int i_1_, int i_2_, byte[] is, int i_3_) {
		super(class260_sub2, 32879, i, i_0_ * (i_1_ * i_2_), false);
		try {
			((Class109_Sub3) this).anInt3956 = i_1_;
			((Class109_Sub3) this).anInt3949 = i_2_;
			((Class109_Sub3) this).anInt3947 = i_0_;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glTexImage3Dub(((Class109) this).anInt1553, 0, ((Class109) this).anInt1556,
					((Class109_Sub3) this).anInt3947, ((Class109_Sub3) this).anInt3956,
					((Class109_Sub3) this).anInt3949, 0, i_3_, 5121, is, 0);
			OpenGL.glPixelStorei(3317, 4);
			this.method753(85, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("cf.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ','
							+ i_2_ + ',' + (is != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	static final void method1823(int i) {
		do {
			try {
				anInt3950++;
				VarpType.aClass54_1229.method369(false);
				if (i == 1)
					break;
				method1823(-101);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "cf.O(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void method8(int i) {
		try {
			if (i >= 121) {
				OpenGL.glFramebufferTexture3DEXT(anInt3951, anInt3952, ((Class109) this).anInt1553, 0, 0, 0);
				anInt3946++;
				anInt3952 = -1;
				anInt3951 = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cf.P(" + i + ')');
		}
	}

	static final void method1824(int i, int i_4_, Widget[] class235s) {
		try {
			if (i_4_ < 35)
				aClass13_3953 = null;
			for (int i_5_ = 0; (class235s.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				Widget class235 = class235s[i_5_];
				if (class235 != null) {
					if ((((Widget) class235).type ^ 0xffffffff) == -1) {
						if (((Widget) class235).components != null)
							method1824(i, 122, ((Widget) class235).components);
						WidgetParent class246_sub40 = ((WidgetParent) (Widget.get_widget_parents(class235.revision)
								.get((long) ((Widget) class235).hash)));
						if (class246_sub40 != null)
							SwitchInt.method2180((((WidgetParent) class246_sub40).anInt5517), -1, i, class235.revision);
					}
					if (i == 0 && ((Widget) class235).on_dialog_abort_listener != null) {
						ScriptEvent class246_sub29 = new ScriptEvent();
						((ScriptEvent) class246_sub29).params = ((Widget) class235).on_dialog_abort_listener;
						((ScriptEvent) class246_sub29).source = class235;
						ScriptExecutor.excute_script_event(class246_sub29, class235);
					}
					if ((i ^ 0xffffffff) == -2 && ((Widget) class235).on_interface_overriding_update != null) {
						if (((Widget) class235).index >= 0) {
							Widget class235_6_ = Widget.get_widget((((Widget) class235).hash), class235.revision);
							if (class235_6_ == null || ((Widget) class235_6_).components == null
									|| (((Widget) class235).index >= ((Widget) class235_6_).components.length)
									|| (((Widget) class235_6_).components[((Widget) class235).index]) != class235)
								continue;
						}
						ScriptEvent class246_sub29 = new ScriptEvent();
						((ScriptEvent) class246_sub29).source = class235;
						((ScriptEvent) class246_sub29).params = ((Widget) class235).on_interface_overriding_update;
						ScriptExecutor.excute_script_event(class246_sub29, class235);
					}
				}
			}
			anInt3954++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("cf.N(" + i + ',' + i_4_ + ',' + (class235s != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1825(int hsl, int lightness) {
		lightness = lightness * (0x7f & hsl) >> 7;
		if (lightness > 126)
			lightness = 126;
		if (lightness < 2)
			lightness = 2;
		return (hsl & 0xff80) + lightness;
	}

	public static void method1826(byte i) {
		try {
			aClass13_3953 = null;
			if (i != 76)
				aClass13_3953 = null;
			cs2_cache = null;
			cs2_cache_550 = null;
			cs2_cache_osrs = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cf.M(" + i + ')');
		}
	}

	final void method1827(int i, int i_9_, int i_10_, int i_11_, int i_12_, byte i_13_, int i_14_, int i_15_) {
		try {
			anInt3955++;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			if (i_13_ != -9)
				method1827(64, 57, 63, 83, -112, (byte) 35, -38, 114);
			OpenGL.glCopyTexSubImage3D(((Class109) this).anInt1553, 0, i_9_, i, i_12_, i_15_, i_10_, i_11_, i_14_);
			OpenGL.glFlush();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cf.Q(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ','
					+ i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	Class109_Sub3(Class260_Sub2 class260_sub2, int i, int i_16_, int i_17_, int i_18_) {
		super(class260_sub2, 32879, i, i_18_ * (i_16_ * i_17_), false);
		try {
			((Class109_Sub3) this).anInt3949 = i_18_;
			((Class109_Sub3) this).anInt3947 = i_16_;
			((Class109_Sub3) this).anInt3956 = i_17_;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			OpenGL.glTexImage3Dub(((Class109) this).anInt1553, 0, ((Class109) this).anInt1556,
					((Class109_Sub3) this).anInt3947, ((Class109_Sub3) this).anInt3956,
					((Class109_Sub3) this).anInt3949, 0, ParamLoader.method1086((((Class109) this).anInt1556), 13519),
					5121, null, 0);
			this.method753(99, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cf.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ','
					+ i + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}
}
