package io;

/* Class246_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;
import java.net.Socket;

final class Class246_Sub13 extends Node {
	static int context_menu_height;
	static int anInt4420;
	static int anInt4421;
	static int anInt4422;
	Class166 aClass166_4423 = new Class166();
	static int anInt4424;
	static int anInt4425;
	static int anInt4426;
	static int anInt4427;
	/* synthetic */static Class aClass4428;

	static final boolean method1987(int i, byte i_0_, int i_1_) {
		try {

			anInt4426++;
			if ((Class40_Sub3.method1863(i, 4, i_1_) | (0x10000 & i_1_ ^ 0xffffffff) != -1)
					|| Class125.method858(i, i_1_, 25926))
				return true;
			if ((i & 0x37 ^ 0xffffffff) != -1 || !Class6.method71(-20147, i, i_1_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fl.F(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final boolean method1988(int i, int i_2_, int i_3_) {
		int i_4_ = Class88.anIntArrayArrayArray1150[i][i_2_][i_3_];
		if (i_4_ == -VarcLoader.anInt997)
			return false;
		if (i_4_ == VarcLoader.anInt997)
			return true;
		int i_5_ = i_2_ << Class126.anInt1781;
		int i_6_ = i_3_ << Class126.anInt1781;
		if (Class160.method1060(i_5_ + 1, Class59_Sub3_Sub4.aClass210Array6993[i].l(i_2_, i_3_), i_6_ + 1)
				&& Class160.method1060(i_5_ + NodeSub.anInt3744 - 1,
						Class59_Sub3_Sub4.aClass210Array6993[i].l(i_2_ + 1, i_3_), i_6_ + 1)
				&& Class160.method1060(i_5_ + NodeSub.anInt3744 - 1,
						Class59_Sub3_Sub4.aClass210Array6993[i].l(i_2_ + 1, i_3_ + 1), i_6_ + NodeSub.anInt3744 - 1)
				&& Class160.method1060(i_5_ + 1, Class59_Sub3_Sub4.aClass210Array6993[i].l(i_2_, i_3_ + 1),
						i_6_ + NodeSub.anInt3744 - 1)
				&& Class160.method1060(i_5_ + Class40_Sub7.anInt5174,
						Class59_Sub3_Sub4.aClass210Array6993[i].l(i_2_, i_3_), i_6_ + 1)
				&& Class160.method1060(i_5_ + NodeSub.anInt3744 - 1,
						Class59_Sub3_Sub4.aClass210Array6993[i].l(i_2_ + 1, i_3_), i_6_ + Class40_Sub7.anInt5174)
				&& Class160.method1060(i_5_ + Class40_Sub7.anInt5174,
						Class59_Sub3_Sub4.aClass210Array6993[i].l(i_2_, i_3_ + 1), i_6_ + NodeSub.anInt3744 - 1)
				&& Class160.method1060(i_5_ + NodeSub.anInt3744 - 1,
						Class59_Sub3_Sub4.aClass210Array6993[i].l(i_2_, i_3_), i_6_ + Class40_Sub7.anInt5174)
				&& Class160.method1060(i_5_ + Class40_Sub7.anInt5174,
						Class59_Sub3_Sub4.aClass210Array6993[i].l(i_2_, i_3_), i_6_ + Class40_Sub7.anInt5174)) {
			Class88.anIntArrayArrayArray1150[i][i_2_][i_3_] = VarcLoader.anInt997;
			return true;
		}
		Class88.anIntArrayArrayArray1150[i][i_2_][i_3_] = -VarcLoader.anInt997;
		return false;
	}

	static final short[] method1989(short[] is, int i) {
		try {
			anInt4421++;
			if (i >= -78)
				method1989(null, 70);
			if (is == null)
				return null;
			short[] is_7_ = new short[is.length];
			Class117.method803(is, 0, is_7_, 0, is.length);
			return is_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fl.H(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method1990(Entity class_r, boolean bool) {
		do {
			try {
				do {
					if (!(class_r instanceof Npc)) {
						if (!(class_r instanceof Player))
							break;
						Player class_r_sub1 = (Player) class_r;
						Class210.method1381(112,
								((((Class59_Sub3) Client.local_player).current_plane) != (((Class59_Sub3) class_r_sub1).current_plane)),
								class_r_sub1);
						if (!Client.f_ob)
							break;
					}
					Npc class_r_sub2 = (Npc) class_r;
					if (((Npc) class_r_sub2).aClass253_7184 != null)
						Class246_Sub34.method2200(((((Class59_Sub3) class_r_sub2).current_plane
								^ 0xffffffff) != ((((Class59_Sub3) Client.local_player).current_plane) ^ 0xffffffff)),
								class_r_sub2, !bool);
				} while (false);
				anInt4424++;
				if (bool == true)
					break;
				context_menu_height = -70;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("fl.D(" + (class_r != null ? "{...}" : "null") + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	static final void method1991(int i, int i_8_, int i_9_) {
		try {
			if (i < -41) {
				anInt4427++;
				Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_9_, (byte) 121, 5);
				class246_sub1_sub10.method2600(-25852);
				((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_8_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fl.G(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	public Class246_Sub13() {
		/* empty */
	}

	static final int load_worlds(int i) {
		try {
			anInt4420++;
			try {
				if ((Class24.anInt349 ^ 0xffffffff) == -1) {
					if (Class88.aLong1147 > -5000L + TimeUtility.time())
						return 0;
					ScriptEvent.aClass182_4976 = Client.sign_link.method364(0, Class6.aString68, Class172.anInt2432);
					Class246_Sub2.aLong3811 = TimeUtility.time();
					Class24.anInt349 = 1;
				}
				if ((TimeUtility.time() ^ 0xffffffffffffffffL) < (30000L + Class246_Sub2.aLong3811
						^ 0xffffffffffffffffL))
					return IncomingPacket.method141(false, 1000);
				if ((Class24.anInt349 ^ 0xffffffff) == -2) {
					if (ScriptEvent.aClass182_4976.anInt2539 == 2)
						return IncomingPacket.method141(false, 1001);
					if ((ScriptEvent.aClass182_4976.anInt2539 ^ 0xffffffff) != -2)
						return -1;
					Class65.aClass6_864 = new Class6((Socket) (ScriptEvent.aClass182_4976.anObject2535),
							Client.sign_link);
					ScriptEvent.aClass182_4976 = null;
					int i_13_ = 0;
					if (Class194_Sub1.aBool4139)
						i_13_ = Class40_Sub2.anInt4048;
					((Buffer) Class130_Sub1.stream).position = 0;
					Class130_Sub1.stream.writeByte(i ^ 0xfc, (((Class48) Class246_Sub1_Sub10.aClass48_6221).anInt689));
					Class130_Sub1.stream.writeInt(i_13_, (byte) 125);
					Class65.aClass6_864.method76(((Buffer) Class130_Sub1.stream).position, 0,
							(((Buffer) Class130_Sub1.stream).buffer), 127);
					Class179.method1170((byte) 94);
					int i_14_ = Class65.aClass6_864.method73(28);
					Class179.method1170((byte) 69);
					if ((i_14_ ^ 0xffffffff) != -1)
						return IncomingPacket.method141(false, i_14_);
					Class24.anInt349 = 2;
				}
				if (Class24.anInt349 == 2) {
					if ((Class65.aClass6_864.method67(i) ^ 0xffffffff) > -3)
						return -1;
					Class240.anInt3384 = Class65.aClass6_864.method73(33);
					Class240.anInt3384 <<= 8;
					Class240.anInt3384 += Class65.aClass6_864.method73(117);
					Class24.anInt349 = 3;
					Tile.aByteArray2146 = new byte[Class240.anInt3384];
					Class211_Sub1_Sub2.anInt6531 = 0;
				}
				if (Class24.anInt349 == i) {
					int i_15_ = Class65.aClass6_864.method67(i);
					if ((i_15_ ^ 0xffffffff) > -2)
						return -1;
					if (i_15_ > Class240.anInt3384 + -Class211_Sub1_Sub2.anInt6531)
						i_15_ = (-Class211_Sub1_Sub2.anInt6531 + Class240.anInt3384);
					Class65.aClass6_864.method65(Class211_Sub1_Sub2.anInt6531, (byte) 113, i_15_, Tile.aByteArray2146);
					Class211_Sub1_Sub2.anInt6531 += i_15_;
					if (Class240.anInt3384 > Class211_Sub1_Sub2.anInt6531)
						return -1;
					if (!NpcType.method1633(false, Tile.aByteArray2146))
						return IncomingPacket.method141(false, 1002);
					Class220.aClass63_Sub1Array3056 = new Class63_Sub1[Class246_Sub4.anInt3863];
					int i_16_ = 0;
					for (int i_17_ = Class_u.anInt4702; Class246_Sub19_Sub2.anInt6810 >= i_17_; i_17_++) {
						Class63_Sub1 class63_sub1 = Varbit.method746(i_17_, (byte) -124);
						if (class63_sub1 != null)
							Class220.aClass63_Sub1Array3056[i_16_++] = class63_sub1;
					}
					Class109_Sub4.anInt4572 = 0;
					Class109_Sub1.aClass246_Sub39_3762 = null;
					Class65.aClass6_864.method72(false);
					Class65.aClass6_864 = null;
					Tile.aByteArray2146 = null;
					Class40_Sub5.anInt4913 = 0;
					Class24.anInt349 = 0;
					Class88.aLong1147 = TimeUtility.time();
					return 0;
				}
			} catch (java.io.IOException ioexception) {
				return IncomingPacket.method141(false, 1003);
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fl.A(" + i + ')');
		}
	}

	static final void method1994(int i) {
		try {
			try {
				if (i != 27616)
					return;
				Method method = (aClass4428 != null ? aClass4428
						: (aClass4428 = Client.getClassByName("java.lang.Runtime")))
						.getMethod("availableProcessors", new Class[0]);
				if (method != null) {
					try {
						Runtime runtime = Runtime.getRuntime();
						Integer integer = (Integer) method.invoke(runtime, null);
						RuntimeException_Sub2.anInt7153 = integer.intValue();
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt4422++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fl.B(" + i + ')');
		}
	}
}
