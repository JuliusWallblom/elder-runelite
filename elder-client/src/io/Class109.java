package io;

/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

abstract class Class109 implements Interface8 {
	static int anInt1547;
	static int anInt1548;
	static IncomingPacket aClass13_1549;
	static int anInt1550;
	static int anInt1551;
	Class260_Sub2 aClass260_Sub2_1552;
	int anInt1553;
	static int anInt1555;
	int anInt1556;
	static int anInt1557;
	static int anInt1558;
	static int anInt1559;
	static int anInt1560;
	private boolean aBool1561 = false;
	static int anInt1562;
	int anInt1563;
	private int anInt1564;
	static int anInt1565;
	private boolean aBool1566;
	static int anInt1567;
	static int anInt1568;
	static int anInt1569;

	private final void method751(byte i, int i_0_) {
		try {
			((Class260_Sub2) ((Class109) this).aClass260_Sub2_1552).anInt4312 -= i_0_;
			if (i != -19)
				aBool1566 = false;
			anInt1551++;
			((Class260_Sub2) ((Class109) this).aClass260_Sub2_1552).anInt4312 += method756(3);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kj.H(" + i + ',' + i_0_ + ')');
		}
	}

	private final void method752(byte i) {
		try {
			int i_1_ = -123 % ((-49 - i) / 53);
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			anInt1562++;
			if (aBool1561) {
				OpenGL.glTexParameteri(((Class109) this).anInt1553, 10241, !aBool1566 ? 9729 : 9987);
				OpenGL.glTexParameteri(((Class109) this).anInt1553, 10240, 9729);
			} else {
				OpenGL.glTexParameteri(((Class109) this).anInt1553, 10241, !aBool1566 ? 9728 : 9984);
				OpenGL.glTexParameteri(((Class109) this).anInt1553, 10240, 9728);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kj.K(" + i + ')');
		}
	}

	final void method753(int i, boolean bool) {
		do {
			try {
				anInt1565++;
				int i_2_ = -117 % ((48 - i) / 32);
				if (aBool1561 != !bool)
					break;
				aBool1561 = bool;
				method752((byte) -118);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "kj.J(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method754(Widget class235, int i) {
		try {
			anInt1558++;
			if (Class187.aBool2653) {
				if (((Widget) class235).on_mouse_repeat_listener_wrong != null) {
					Widget class235_3_ = Widget.get_component(Class231.anInt3168, SubScript.anInt1161, class235.revision);
					if (class235_3_ != null) {
						ScriptEvent class246_sub29 = new ScriptEvent();
						((ScriptEvent) class246_sub29).aClass235_4969 = class235_3_;
						((ScriptEvent) class246_sub29).source = class235;
						((ScriptEvent) class246_sub29).params = ((Widget) class235).on_mouse_repeat_listener_wrong;
						ScriptExecutor.excute_script_event(class246_sub29, class235);
					}
				}
				Class109_Sub2.anInt3819++;
				Class243.writePacket(-76, Class248.INTERFACE_ON_INTERFACE_PACKET);
				Class130_Sub1.stream.writeInt(((Widget) class235).hash, (byte) -100);
				Class130_Sub1.stream.writeShortLE(SubScript.anInt1161, (byte) 91);
				if (i != 27254)
					method759(-89);
				Class130_Sub1.stream.writeShort((byte) 67, ((Widget) class235).index);
				Class130_Sub1.stream.writeInt(Class231.anInt3168, (byte) 105);
				Class130_Sub1.stream.writeShortLE(((Widget) class235).item_id, (byte) 117);
				Class130_Sub1.stream.writeShort((byte) 67, Class87.anInt1145);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kj.C(" + (class235 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method755(int i) {
		try {
			if (((Class109) this).anInt1563 > 0) {
				((Class109) this).aClass260_Sub2_1552.method1978(((Class109) this).anInt1563, (byte) 112, method756(3));
				((Class109) this).anInt1563 = 0;
			}
			int i_4_ = -3 / ((-51 - i) / 47);
			anInt1560++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kj.A(" + i + ')');
		}
	}

	private final int method756(int i) {
		try {
			anInt1548++;
			int i_5_ = (((Class109) this).aClass260_Sub2_1552.method1920(((Class109) this).anInt1556, 2) * anInt1564);
			if (i != 3)
				method758(true);
			if (aBool1566)
				return 4 * i_5_ / 3;
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kj.G(" + i + ')');
		}
	}

	final void method757(boolean bool, boolean bool_6_) {
		do {
			try {
				anInt1557++;
				if (bool != false)
					((Class109) this).anInt1556 = 99;
				if (aBool1566 == bool_6_)
					break;
				int i = method756(3);
				aBool1566 = true;
				method752((byte) -119);
				method751((byte) -19, i);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("kj.D(" + bool + ',' + bool_6_ + ')'));
			}
			break;
		} while (false);
	}

	final int method758(boolean bool) {
		try {
			anInt1555++;
			if (bool != true)
				return -27;
			return ((Class109) this).anInt1563;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kj.E(" + bool + ')');
		}
	}

	public static void method759(int i) {
		try {
			if (i != 10241)
				aClass13_1549 = null;
			FontCache.regular_font = null;
			aClass13_1549 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kj.F(" + i + ')');
		}
	}

	protected final void finalize() throws Throwable {
		try {
			anInt1559++;
			method755(-115);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kj.finalize(" + ')');
		}
	}

	static final boolean method760(boolean bool) {
		try {
			if (bool != false)
				return false;
			return PacketsDecoder.method179(1);
		} catch (java.io.IOException ioexception) {
			Varc.method2615((byte) 86);
			return true;
		} catch (Exception exception) {
			String string = ("T2 - " + (IdentityKitType.INCOMING_PACKET != null ? IdentityKitType.INCOMING_PACKET.method142(-106) : -1) + "," + (Class259_Sub2_Sub1.aClass13_6907 == null ? -1 : Class259_Sub2_Sub1.aClass13_6907.method142(-128)) + "," + (Class173.aClass13_2438 != null ? Class173.aClass13_2438.method142(-119) : -1) + " - " + Class130_Sub1_Sub1.anInt7046 + "," + (((Entity) Client.local_player).f_mc[0] + Client.base_x) + "," + (Client.base_y + ((Entity) Client.local_player).f_nc[0]) + " - ");
			for (int i = 0; ((i ^ 0xffffffff) > (Class130_Sub1_Sub1.anInt7046 ^ 0xffffffff) && i < 50); i++)
				string += (((Buffer) Class78.packetStream).buffer[i]) + ",";
			Class194_Sub1.method1883(exception, string, 98);
			RenderAnimation.logout(2700);
			return true;
		}
	}

	final boolean method761(int i) {
		try {
			if (i >= -91)
				return true;
			anInt1547++;
			if (((Class260_Sub2) ((Class109) this).aClass260_Sub2_1552).aBool4322) {
				int i_7_ = method756(3);
				((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
				OpenGL.glGenerateMipmapEXT(((Class109) this).anInt1553);
				aBool1566 = true;
				method752((byte) -116);
				method751((byte) -19, i_7_);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kj.I(" + i + ')');
		}
	}

	Class109(Class260_Sub2 class260_sub2, int i, int i_8_, int i_9_, boolean bool) {
		try {
			((Class109) this).anInt1553 = i;
			anInt1564 = i_9_;
			((Class109) this).anInt1556 = i_8_;
			aBool1566 = bool;
			((Class109) this).aClass260_Sub2_1552 = class260_sub2;
			OpenGL.glGenTextures(1, Class19.anIntArray312, 0);
			((Class109) this).anInt1563 = Class19.anIntArray312[0];
			method751((byte) -19, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kj.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ',' + i_9_ + ',' + bool + ')'));
		}
	}

	public abstract void method8(int i);

	static {
		new MultilingualString("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires charg\u00e9es", "Fontes principais carregadas");
		anInt1567 = -1;
		aClass13_1549 = new IncomingPacket(83, 3);
		anInt1568 = -1;
	}
}
