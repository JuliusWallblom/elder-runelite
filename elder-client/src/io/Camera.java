package io;

/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Point;

final class Camera {
	static MultilingualString aClass67_2879 = new MultilingualString("Please remove ", "Bitte entferne ",
			"Veuillez commencer par supprimer ", "Remova ");
	static int anInt2880;
	static float camera_yaw = 0.0F;

	public static void method1338(byte i) {
		try {
			if (i != 32)
				camera_yaw = 1.4137807F;
			aClass67_2879 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "so.A(" + i + ')');
		}
	}

	static final void method1339(int i, byte i_0_) {
		do {
			try {
				if (!((Renderer) Client.current_renderer).aBool606)
					i = -1;
				anInt2880++;
				if ((i ^ 0xffffffff) != (CS2Script.anInt5674 ^ 0xffffffff)) {
					if (i_0_ <= 124)
						camera_yaw = 0.10947551F;
					do {
						if ((i ^ 0xffffffff) != 0) {
							Class60 class60 = CacheIndex.aClass156_150.method1032(i, -23);
							LDSprite class10 = class60.method415(0);
							if (class10 == null) {
								i = -1;
								if (!Client.f_ob)
									break;
							}
							Client.sign_link.method352(
									new Point(((Class60) class60).anInt827, ((Class60) class60).anInt826),
									GameEngine.canvas, class10.method126(), class10.get_pixels(), class10.method127(),
									-23853);
							CS2Script.anInt5674 = i;
						}
					} while (false);
					if (i != -1 || (CS2Script.anInt5674 ^ 0xffffffff) == 0)
						break;
					Client.sign_link.method352(new Point(), GameEngine.canvas, -1, null, -1, -23853);
					CS2Script.anInt5674 = -1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "so.B(" + i + ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	static float camera_pitch = 1024.0F;
}
