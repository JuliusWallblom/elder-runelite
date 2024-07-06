package io;

public class Node {
	static int anInt3464;
	Node prev;
	static short[] aShortArray3466;
	long hash;
	static boolean shift_click_use = false;
	static int anInt3469;
	static float aFloat3470;
	Node next;
	static IncomingPacket aClass13_3472 = new IncomingPacket(65, 2);
	static int anInt3473;
	static int anInt3474;

	public static void method1575(byte i) {
		try {
			if (i < 13)
				shift_click_use = false;
			aShortArray3466 = null;
			aClass13_3472 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vu.IC(" + i + ')');
		}
	}

	final boolean method1576(int i) {
		try {
			anInt3474++;
			if (((Node) this).prev == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vu.HC(" + i + ')');
		}
	}

	public Node() {
		/* empty */
	}

	public final void remove() {
		anInt3464++;
		if (((Node) this).prev != null) {
			((Node) ((Node) this).prev).next = ((Node) this).next;
			((Node) ((Node) this).next).prev = ((Node) this).prev;
			((Node) this).next = null;
			((Node) this).prev = null;
		}
	}
}
