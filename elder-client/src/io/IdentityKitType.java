package io;

import io.cache.Cache;
import io.cache.Revision;

final class IdentityKitType {
	static int anInt2273;
	static int anInt2274;
	private short[] aShortArray2275;
	static int anInt2276;
	IdentityKitLoader aClass92_2277;
	static int anInt2278;
	static int anInt2279;
	private int[] anIntArray2280 = { -1, -1, -1, -1, -1 };
	private short[] aShortArray2281;
	static IncomingPacket INCOMING_PACKET = null;
	static int anInt2283;
	private short[] aShortArray2284;
	private short[] aShortArray2285;
	static int anInt2286;
	private int[] anIntArray2287;
	static int anInt2288;

	final void decode(int i, Buffer stream) {
		do {
			try {
				anInt2286++;
				for (;;) {
					int i_0_ = stream.readUnsignedByte();
					if ((i_0_ ^ 0xffffffff) == -1)
						break;
					method1070(i_0_, (byte) 16, stream);
				}
				if (i == -1)
					break;
				aShortArray2285 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("pd.F(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final WidgetParent method1064(int i, int i_1_, boolean bool, byte i_2_, int widget_id, final int revision) {
		try {
			anInt2274++;
			WidgetParent class246_sub40 = new WidgetParent();
			((WidgetParent) class246_sub40).type = i_1_;
			((WidgetParent) class246_sub40).anInt5517 = i;
			Widget.get_widget_parents(revision).method547((long) widget_id, -2301, class246_sub40);
			Class241.method1546(i, 2652, revision);
			Widget class235 = Widget.get_widget(widget_id, revision);
			if (class235 != null)
				Widget.redraw_widget(class235);
			if (Client.meslayerContinueWidget != null) {
				Widget.redraw_widget(Client.meslayerContinueWidget);
				Client.meslayerContinueWidget = null;
			}
			Class115.method780(22);
			if (class235 != null)
				Widget.update_layer(class235, -1, !bool);
			if (!bool)
				ScriptExecutor.execute_on_load_script(i, revision);
			if (!bool && (Widget.root_interface ^ 0xffffffff) != 0)
				SwitchInt.method2180(Widget.root_interface, -1, 1, revision);
			return class246_sub40;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	final boolean method1065(byte i) {
		try {
			anInt2276++;
			int i_5_ = 101 % ((27 - i) / 59);
			boolean bool = true;
			synchronized (((IdentityKitLoader) ((IdentityKitType) this).aClass92_2277).get_identity_kit_model_index()) {
				for (int i_6_ = 0; i_6_ < 5; i_6_++) {
					if ((anIntArray2280[i_6_] ^ 0xffffffff) != 0
							&& !(((IdentityKitLoader) ((IdentityKitType) this).aClass92_2277)
									.get_identity_kit_model_index().method85(0, (byte) -124, anIntArray2280[i_6_])))
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pd.G(" + i + ')');
		}
	}

	static final void draw_map_scenes(SceneGraph class260, int i, int i_7_, LocType class185, int i_8_, int i_9_) {
		try {
			anInt2273++;
			Sprite class32 = Client.map_scenes.method1638(1409, ((LocType) class185).map_scene);
			if ((((Sprite) class32).map_scene_sprite_id ^ 0xffffffff) != 0) {
				do {
					if (!((LocType) class185).aBool2619) {
						i = 0;
						if (!Client.f_ob)
							break;
					}
					i += ((LocType) class185).anInt2597;
					i &= 0x3;
				} while (false);
				AbstractSprite class_l = class32.method240(((LocType) class185).aBool2604, class260, i, 16306,
						class185);
				if (class_l != null) {
					int i_10_ = ((LocType) class185).size_x;
					int i_11_ = ((LocType) class185).size_y;
					if ((0x1 & i ^ 0xffffffff) == -2) {
						i_10_ = ((LocType) class185).size_y;
						i_11_ = ((LocType) class185).size_x;
					}
					int i_12_ = class_l.j();
					int i_13_ = class_l.T();
					if (((Sprite) class32).aBool440) {
						i_12_ = 4 * i_10_;
						i_13_ = i_11_ * 4;
					}
					if ((((Sprite) class32).anInt437 ^ 0xffffffff) != -1) {
						class_l.s(i_9_, -(i_11_ * 4) + 4 + i_8_, i_12_, i_13_, 0,
								~0xffffff | ((Sprite) class32).anInt437, 1);
					} else {
						class_l.method732(i_9_, 4 - i_11_ * 4 + i_8_, i_12_, i_13_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pd.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ','
					+ i_7_ + ',' + (class185 != null ? "{...}" : "null") + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	final boolean method1067(byte i) {
		try {
			anInt2279++;
			if (anIntArray2287 == null)
				return true;
			if (i <= 53)
				method1065((byte) 30);
			boolean bool = true;
			synchronized (((IdentityKitLoader) ((IdentityKitType) this).aClass92_2277).get_identity_kit_model_index()) {
				for (int i_14_ = 0; ((anIntArray2287.length ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++) {
					if (!((IdentityKitLoader) ((IdentityKitType) this).aClass92_2277).get_identity_kit_model_index()
							.method85(0, (byte) -124, anIntArray2287[i_14_]))
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pd.D(" + i + ')');
		}
	}

	final Model method1068(byte i, Revision revision) {
		try {
			anInt2288++;
			if (anIntArray2287 == null)
				return null;
			Model[] class103s = new Model[anIntArray2287.length];
			synchronized (((IdentityKitLoader) ((IdentityKitType) this).aClass92_2277).get_identity_kit_model_index()) {
				for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (anIntArray2287.length ^ 0xffffffff)); i_15_++)
					class103s[i_15_] = Model.get_model(0,
							(((IdentityKitLoader) (((IdentityKitType) this).aClass92_2277))
									.get_identity_kit_model_index()),
							anIntArray2287[i_15_], revision);
			}
			for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (anIntArray2287.length ^ 0xffffffff); i_16_++) {
				if ((((Model) class103s[i_16_]).anInt1358 ^ 0xffffffff) > -14)
					class103s[i_16_].method646(0, (byte) -118);
			}
			Model class103;
			if ((class103s.length ^ 0xffffffff) == -2)
				class103 = class103s[0];
			else
				class103 = new Model(class103s, class103s.length);
			if (i != -63)
				aShortArray2284 = null;
			if (class103 == null)
				return null;
			if (aShortArray2281 != null) {
				for (int i_17_ = 0; aShortArray2281.length > i_17_; i_17_++)
					class103.method662(aShortArray2281[i_17_], aShortArray2285[i_17_], false);
			}
			if (aShortArray2284 != null) {
				for (int i_18_ = 0; i_18_ < aShortArray2284.length; i_18_++)
					class103.method645(aShortArray2275[i_18_], i ^ ~0x3e, aShortArray2284[i_18_]);
			}
			return class103;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pd.B(" + i + ')');
		}
	}

	public static void method1069(int i) {
		do {
			try {
				INCOMING_PACKET = null;
				if (i == 4)
					break;
				INCOMING_PACKET = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "pd.A(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method1070(int i, byte i_19_, Buffer stream) {
		do {
			try {
				if (i != 1) {
					if ((i ^ 0xffffffff) == -3) {
						int i_20_ = stream.readUnsignedByte();
						anIntArray2287 = new int[i_20_];
						for (int i_21_ = 0; i_20_ > i_21_; i_21_++)
							anIntArray2287[i_21_] = stream.readUnsignedShort();
					} else if (i != 3) {
						if ((i ^ 0xffffffff) == -41) {
							int i_22_ = stream.readUnsignedByte();
							aShortArray2281 = new short[i_22_];
							aShortArray2285 = new short[i_22_];
							for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
								aShortArray2281[i_23_] = (short) stream.readUnsignedShort();
								aShortArray2285[i_23_] = (short) stream.readUnsignedShort();
							}
						} else if ((i ^ 0xffffffff) != -42) {
							if (i >= 60 && i < 70)
								anIntArray2280[-60 + i] = stream.readUnsignedShort();
						} else {
							int i_24_ = stream.readUnsignedByte();
							aShortArray2275 = new short[i_24_];
							aShortArray2284 = new short[i_24_];
							for (int i_25_ = 0; (i_24_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
								aShortArray2284[i_25_] = (short) stream.readUnsignedShort();
								aShortArray2275[i_25_] = (short) stream.readUnsignedShort();
							}
						}
					}
				} else
					stream.readUnsignedByte();
				anInt2278++;
				if (i_19_ == 16)
					break;
				anIntArray2280 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("pd.E(" + i + ',' + i_19_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Model method1071(int i, Revision revision) {
		try {
			anInt2283++;
			Model[] class103s = new Model[5];
			int i_26_ = 0;
			synchronized (((IdentityKitLoader) ((IdentityKitType) this).aClass92_2277).get_identity_kit_model_index()) {
				for (int i_27_ = 0; i_27_ < 5; i_27_++) {
					if ((anIntArray2280[i_27_] ^ 0xffffffff) != 0)
						class103s[i_26_++] = Model.get_model(0,
								Cache.get_index(revision, "models"),
								anIntArray2280[i_27_], revision);
				}
			}
			for (int i_28_ = i; (i_28_ ^ 0xffffffff) > -6; i_28_++) {
				if (class103s[i_28_] != null && ((Model) class103s[i_28_]).anInt1358 < 13)
					class103s[i_28_].method646(0, (byte) -37);
			}
			Model class103 = new Model(class103s, i_26_);
			if (aShortArray2281 != null) {
				for (int i_29_ = 0; ((aShortArray2281.length ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++)
					class103.method662(aShortArray2281[i_29_], aShortArray2285[i_29_], false);
			}
			if (aShortArray2284 != null) {
				for (int i_30_ = 0; aShortArray2284.length > i_30_; i_30_++)
					class103.method645(aShortArray2275[i_30_], i, aShortArray2284[i_30_]);
			}
			return class103;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pd.I(" + i + ')');
		}
	}

	public IdentityKitType() {
		/* empty */
	}
}
