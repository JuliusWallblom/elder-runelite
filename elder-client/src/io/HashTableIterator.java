package io;

import java.util.Iterator;

public class HashTableIterator implements Iterator {
	IterableHashTable table;
	Node tail;
	int index;
	Node head;

	HashTableIterator(IterableHashTable var1) {
		this.head = null;
		this.table = var1;
		this.reset();
	}

	void reset() {
		this.tail = this.table.buckets[0].next;
		this.index = 1;
		this.head = null;
	}

	public boolean hasNext() {
		if (this.table.buckets[this.index - 1] != this.tail) {
			return true;
		} else {
			while (this.index < this.table.size) {
				if (this.table.buckets[this.index++].next != this.table.buckets[this.index - 1]) {
					this.tail = this.table.buckets[this.index - 1].next;
					return true;
				}

				this.tail = this.table.buckets[this.index - 1];
			}

			return false;
		}
	}

	public Object next() {
		Node var1;
		if (this.table.buckets[this.index - 1] != this.tail) {
			var1 = this.tail;
			this.tail = var1.next;
			this.head = var1;
			return var1;
		} else {
			do {
				if (this.index >= this.table.size) {
					return null;
				}

				var1 = this.table.buckets[this.index++].next;
			} while (var1 == this.table.buckets[this.index - 1]);

			this.tail = var1.next;
			this.head = var1;
			return var1;
		}
	}

	public void remove() {
		this.head.remove();
		this.head = null;
	}
}
