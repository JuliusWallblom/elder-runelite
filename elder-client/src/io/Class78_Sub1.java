package io;

/* Class78_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class Class78_Sub1 extends Class78 implements MouseWheelListener {
	private int anInt3823 = 0;

	final synchronized int method493(byte i) {
		int i_0_;
		try {
			int i_1_ = anInt3823;
			if (i < 92)
				return -3;
			anInt3823 = 0;
			i_0_ = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_0_;
	}

	public final synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		try {
			anInt3823 += mousewheelevent.getWheelRotation();

			Client.handleGameZoomScroll(anInt3823);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method490(byte i, Component component) {
		try {
			component.addMouseWheelListener(this);
			if (i < 85)
				anInt3823 = -3;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method494(Component component, int i) {
		try {
			component.removeMouseWheelListener(this);
			if (i != 0)
				method494(null, 28);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
