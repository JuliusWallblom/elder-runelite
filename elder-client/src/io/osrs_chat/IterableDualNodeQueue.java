package io.osrs_chat;

import java.util.Iterator;

import io.NodeSub;

public class IterableDualNodeQueue implements Iterable {
	public NodeSub sentinel;
	NodeSub head;

	public IterableDualNodeQueue() {
		this.sentinel = new NodeSub();
		this.sentinel.previousDual = this.sentinel;
		this.sentinel.nextDual = this.sentinel;
	}

	public void clear() {
		while (this.sentinel.previousDual != this.sentinel) {
			this.sentinel.previousDual.removeDual();
		}

	}

	public void add(NodeSub var1) {
		if (var1.nextDual != null) {
			var1.removeDual();
		}

		var1.nextDual = this.sentinel.nextDual;
		var1.previousDual = this.sentinel;
		var1.nextDual.previousDual = var1;
		var1.previousDual.nextDual = var1;
	}

	public NodeSub removeLast() {
		NodeSub var1 = this.sentinel.previousDual;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.removeDual();
			return var1;
		}
	}

	public NodeSub last() {
		return this.previousOrLast((NodeSub) null);
	}

	NodeSub previousOrLast(NodeSub var1) {
		NodeSub var2;
		if (var1 == null) {
			var2 = this.sentinel.previousDual;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.head = null;
			return null;
		} else {
			this.head = var2.previousDual;
			return var2;
		}
	}

	public NodeSub previous() {
		NodeSub var1 = this.head;
		if (var1 == this.sentinel) {
			this.head = null;
			return null;
		} else {
			this.head = var1.previousDual;
			return var1;
		}
	}

	public Iterator iterator() {
		return new IterableDualNodeQueueIterator(this);
	}

	public static void DualNodeDeque_addBefore(NodeSub var0, NodeSub var1) {
		if (var0.nextDual != null) {
			var0.removeDual();
		}

		var0.nextDual = var1;
		var0.previousDual = var1.previousDual;
		var0.nextDual.previousDual = var0;
		var0.previousDual.nextDual = var0;
	}
}
