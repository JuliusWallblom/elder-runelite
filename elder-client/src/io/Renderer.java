package io;

import io.cache.Revision;

abstract class Renderer {

	boolean aBool568;
	int anInt569 = 0;
	boolean aBool570;
	static int anInt571;
	static boolean aBool572 = false;
	boolean aBool573;
	boolean aBool574;
	int anInt575;
	boolean aBool576;
	int anInt577;
	static int anInt578;
	static float aFloat579;
	int anInt580;
	int anInt581;
	int anInt582;
	int brightness;
	int anInt584;
	static int anInt585;
	boolean aBool586;
	int anInt587;
	int anInt588;
	static int anInt589;
	int anInt590;
	boolean safe_mode;
	boolean aBool593;
	static int anInt594;
	static int anInt595;
	boolean aBool596;
	boolean aBool597;
	int anInt598;
	static int anInt599;
	int frame_mode;
	boolean aBool601;
	int anInt602;
	int anInt603;
	int anInt604;
	boolean aBool605;
	boolean aBool606;
	boolean texture;

	final int method271(int i, byte i_0_) {
		try {
			if (i_0_ != -28)
				aFloat579 = 0.75827694F;
			anInt585++;
			if ((i ^ 0xffffffff) == -2 || i == 3)
				return ((Renderer) this).anInt582;
			return ((Renderer) this).anInt575;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dj.E(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method272(Widget class235, int i) {
		try {
			if (i != 2)
				aBool572 = false;
			if (((Widget) class235).type == 5 && ((Widget) class235).item_id != -1)
				Class_q_Sub1.method2731(i + -16777218, class235, Client.sprite_loader);
			anInt578++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"dj.A(" + (class235 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method273(int i, int i_1_, int i_2_) {
		do {
			try {
				do {
					if (i != 1 && (i ^ 0xffffffff) != -4) {
						((Renderer) this).anInt575 = i_2_;
						if (!Client.f_ob)
							break;
					}
					((Renderer) this).anInt582 = i_2_;
				} while (false);
				anInt599++;
				if (i_1_ == -4)
					break;
				((Renderer) this).safe_mode = false;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dj.B(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	static final int method274(int i, boolean bool, int i_3_, int i_4_) {
		try {
			anInt594++;
			Class246_Sub18 class246_sub18 = Class95.method610(38, bool, i_3_);
			if (class246_sub18 == null)
				return 0;
			if (i_4_ == -1)
				return 0;
			if (i != -10077)
				anInt571 = 13;
			int i_5_ = 0;
			for (int i_6_ = 0; (((Class246_Sub18) class246_sub18).anIntArray4679.length > i_6_); i_6_++) {
				if ((i_4_ ^ 0xffffffff) == (((Class246_Sub18) class246_sub18).anIntArray4682[i_6_] ^ 0xffffffff))
					i_5_ += (((Class246_Sub18) class246_sub18).anIntArray4679[i_6_]);
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dj.D(" + i + ',' + bool + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	final boolean method275(int i, int i_7_) {
		try {
			anInt589++;
			if (i != 29083)
				((Renderer) this).aBool601 = true;
			if ((i_7_ ^ 0xffffffff) != -2 && (i_7_ ^ 0xffffffff) != -4)
				return ((Renderer) this).aBool597;
			return ((Renderer) this).aBool593;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dj.C(" + i + ',' + i_7_ + ')');
		}
	}

	final void method276(boolean bool, int i, int i_8_) {
		try {
			if (i > -63)
				method272(null, -102);
			anInt595++;
			if ((i_8_ ^ 0xffffffff) != -2 && i_8_ != 3)
				((Renderer) this).aBool597 = bool;
			else
				((Renderer) this).aBool593 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dj.F(" + bool + ',' + i + ',' + i_8_ + ')'));
		}
	}

	public Renderer() {
		((Renderer) this).aBool570 = true;
		((Renderer) this).aBool573 = true;
		((Renderer) this).aBool568 = true;
		((Renderer) this).aBool576 = true;
		((Renderer) this).anInt580 = 1;
		((Renderer) this).anInt584 = 2;
		((Renderer) this).anInt590 = 0;
		((Renderer) this).anInt581 = 0;
		((Renderer) this).safe_mode = false;
		((Renderer) this).anInt575 = 0;
		((Renderer) this).anInt577 = 0;
		((Renderer) this).aBool586 = true;
		((Renderer) this).anInt588 = 0;
		((Renderer) this).aBool596 = false;
		((Renderer) this).anInt582 = 2;
		((Renderer) this).anInt587 = 255;
		((Renderer) this).brightness = 3;
		((Renderer) this).anInt603 = 127;
		((Renderer) this).frame_mode = 2;
		((Renderer) this).anInt598 = 2;
		((Renderer) this).anInt604 = 0;
		((Renderer) this).anInt602 = 127;
		((Renderer) this).aBool574 = true;
		((Renderer) this).texture = false;
		Settings.ground_decorations = true;
		Settings.show_roofs = true;
		((Renderer) this).aBool606 = true;
		((Renderer) this).aBool601 = true;
	}

	static {
		anInt571 = 0;
	}
}
