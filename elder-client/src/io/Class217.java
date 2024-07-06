package io;

/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class Class217 {
	static int anInt3011;
	static int anInt3012;
	static int anInt3013;
	private NodeSub aClass246_Sub1_3014 = new NodeSub();
	static int anInt3015;
	static int anInt3016;
	static int anInt3017;
	static OutgoingPacket ACTION_BUTTON2 = new OutgoingPacket(38, 8);
	static int anInt3019;
	static int anInt3020;
	private NodeSub aClass246_Sub1_3021;
	static FontMetric aClass73_3022;

	public static void method1404(int i) {
		try {
			if (i > -90)
				method1409(false);
			aClass73_3022 = null;
			ACTION_BUTTON2 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tn.A(" + i + ')');
		}
	}

	static final void method1405(int i, boolean bool) {
		try {
			if (bool == true) {
				anInt3011++;
				Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 122, 4);
				class246_sub1_sub10.method2604((byte) -110);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tn.H(" + i + ',' + bool + ')');
		}
	}

	final void method1406(byte i) {
		try {
			for (;;) {
				NodeSub class246_sub1 = (((NodeSub) aClass246_Sub1_3014).previousDual);
				if (aClass246_Sub1_3014 == class246_sub1)
					break;
				class246_sub1.removeDual();
			}
			int i_0_ = 110 / ((i - 27) / 52);
			anInt3020++;
			aClass246_Sub1_3021 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tn.D(" + i + ')');
		}
	}

	final void method1407(int i, NodeSub class246_sub1) {
		try {
			anInt3013++;
			if (((NodeSub) class246_sub1).nextDual != null)
				class246_sub1.removeDual();
			((NodeSub) class246_sub1).previousDual = aClass246_Sub1_3014;
			((NodeSub) class246_sub1).nextDual = ((NodeSub) aClass246_Sub1_3014).nextDual;
			((NodeSub) (((NodeSub) class246_sub1).nextDual)).previousDual = class246_sub1;
			((NodeSub) (((NodeSub) class246_sub1).previousDual)).nextDual = class246_sub1;
			int i_1_ = 114 / ((-67 - i) / 47);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	final NodeSub method1408(byte i) {
		try {
			anInt3019++;
			if (i != 87)
				aClass73_3022 = null;
			NodeSub class246_sub1 = ((NodeSub) aClass246_Sub1_3014).previousDual;
			if (class246_sub1 == aClass246_Sub1_3014) {
				aClass246_Sub1_3021 = null;
				return null;
			}
			aClass246_Sub1_3021 = ((NodeSub) class246_sub1).previousDual;
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tn.F(" + i + ')');
		}
	}

	static final void method1409(boolean bool) {
		try {
			anInt3016++;
			if ((ObjType.anInt2815 ^ 0xffffffff) != -1) {
				try {
					if (++Class246_Sub28_Sub30.anInt6875 > 2000) {
						if (Class65.aClass6_864 != null) {
							Class65.aClass6_864.method72(false);
							Class65.aClass6_864 = null;
						}
						if ((Class59_Sub1_Sub2.anInt6125 ^ 0xffffffff) > -2) {
							ObjType.anInt2815 = 1;
							Class246_Sub28_Sub30.anInt6875 = 0;
							if ((Class172.anInt2433 ^ 0xffffffff) != (Class230.anInt3165 ^ 0xffffffff))
								Class230.anInt3165 = Class172.anInt2433;
							else
								Class230.anInt3165 = Class246_Sub28_Sub7.anInt6047;
							Class59_Sub1_Sub2.anInt6125++;
						} else {
							ObjType.anInt2815 = 0;
							RuntimeException_Sub2.anInt7154 = -5;
							return;
						}
					}
					if (ObjType.anInt2815 == 1) {
						Class17.aClass182_242 = Client.sign_link.method364(0, (Class174.aString2449),
								(Class230.anInt3165));
						ObjType.anInt2815 = 2;
					}
					if (bool != true)
						method1409(false);
					if ((ObjType.anInt2815 ^ 0xffffffff) == -3) {
						if ((Class17.aClass182_242.anInt2539 ^ 0xffffffff) == -3)
							throw new IOException();
						if ((Class17.aClass182_242.anInt2539 ^ 0xffffffff) != -2)
							return;
						Class65.aClass6_864 = new Class6(((Socket) Class17.aClass182_242.anObject2535),
								Client.sign_link);
						Class17.aClass182_242 = null;
						Class65.aClass6_864.method76(((Buffer) Class130_Sub1.stream).position, 0,
								(((Buffer) Class130_Sub1.stream).buffer), 126);
						Class179.method1170((byte) 83);
						int i = Class65.aClass6_864.method73(89);
						Class179.method1170((byte) 67);
						if ((i ^ 0xffffffff) != -22) {
							RuntimeException_Sub2.anInt7154 = i;
							ObjType.anInt2815 = 0;
							Class65.aClass6_864.method72(!bool);
							Class65.aClass6_864 = null;
							return;
						}
						ObjType.anInt2815 = 3;
					}
					if (ObjType.anInt2815 == 3) {
						if ((Class65.aClass6_864.method67(3) ^ 0xffffffff) > -2)
							return;
						Varbit.aStringArray1533 = new String[Class65.aClass6_864.method73(122)];
						ObjType.anInt2815 = 4;
					}
					if (ObjType.anInt2815 == 4) {
						if (Class65.aClass6_864.method67(3) >= 8 * Varbit.aStringArray1533.length) {
							((Buffer) Class78.packetStream).position = 0;
							Class65.aClass6_864.method65(0, (byte) 113, 8 * Varbit.aStringArray1533.length,
									(((Buffer) Class78.packetStream).buffer));
							for (int i = 0; Varbit.aStringArray1533.length > i; i++)
								Varbit.aStringArray1533[i] = (Class246_Sub6.method1821(104,
										Class78.packetStream.method2364(true)));
							RuntimeException_Sub2.anInt7154 = 21;
							ObjType.anInt2815 = 0;
							Class65.aClass6_864.method72(false);
							Class65.aClass6_864 = null;
						}
					}
				} catch (IOException ioexception) {
					if (Class65.aClass6_864 != null) {
						Class65.aClass6_864.method72(false);
						Class65.aClass6_864 = null;
					}
					if (Class59_Sub1_Sub2.anInt6125 >= 1) {
						ObjType.anInt2815 = 0;
						RuntimeException_Sub2.anInt7154 = -4;
					} else {
						ObjType.anInt2815 = 1;
						if (Class230.anInt3165 != Class172.anInt2433)
							Class230.anInt3165 = Class172.anInt2433;
						else
							Class230.anInt3165 = Class246_Sub28_Sub7.anInt6047;
						Class59_Sub1_Sub2.anInt6125++;
						Class246_Sub28_Sub30.anInt6875 = 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tn.G(" + bool + ')');
		}
	}

	final NodeSub method1410(byte i) {
		try {
			anInt3012++;
			NodeSub class246_sub1 = ((NodeSub) aClass246_Sub1_3014).previousDual;
			if (aClass246_Sub1_3014 == class246_sub1)
				return null;
			int i_2_ = -76 % ((i - 2) / 56);
			class246_sub1.removeDual();
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tn.E(" + i + ')');
		}
	}

	final NodeSub method1411(boolean bool) {
		try {
			anInt3017++;
			if (bool != true)
				return null;
			NodeSub class246_sub1 = aClass246_Sub1_3021;
			if (aClass246_Sub1_3014 == class246_sub1) {
				aClass246_Sub1_3021 = null;
				return null;
			}
			aClass246_Sub1_3021 = ((NodeSub) class246_sub1).previousDual;
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tn.B(" + bool + ')');
		}
	}

	final int method1412(boolean bool) {
		try {
			anInt3015++;
			if (bool != true)
				aClass246_Sub1_3014 = null;
			int i = 0;
			NodeSub class246_sub1 = ((NodeSub) aClass246_Sub1_3014).previousDual;
			while (class246_sub1 != aClass246_Sub1_3014) {
				class246_sub1 = ((NodeSub) class246_sub1).previousDual;
				i++;
			}
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tn.I(" + bool + ')');
		}
	}

	public Class217() {
		try {
			((NodeSub) aClass246_Sub1_3014).nextDual = aClass246_Sub1_3014;
			((NodeSub) aClass246_Sub1_3014).previousDual = aClass246_Sub1_3014;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tn.<init>(" + ')');
		}
	}
}
