package io;

public enum FillMode implements MouseWheel {
	SOLID(0, 0),
	field4552(1, 1),
	field4553(2, 2);

	public final int field4554;
	final int field4551;

	FillMode(int var3, int var4) {
		this.field4554 = var3; // L: 19
		this.field4551 = var4; // L: 20
	} // L: 21

	public int rsOrdinal() {
		return this.field4551; // L: 25
	}
}
