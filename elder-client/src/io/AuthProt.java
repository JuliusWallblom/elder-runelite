package io;

public enum AuthProt implements Enumerated {
	field1967(2, 0), field1965(0, 1), field1964(1, 2), field1966(3, 3);

	public static boolean[] validInterfaces;
	public final int field1968;
	final int field1969;

	AuthProt(int var3, int var4) {
		this.field1968 = var3;
		this.field1969 = var4;
	}

	public int getId() {
		return this.field1969;
	}

	static int getOrDefaultInt(IterableHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode) var0.get((long) var1);
			return var3 == null ? var2 : var3.value;
		}
	}

	static String getOrDefaultString(IterableHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode) var0.get((long) var1);
			return var3 == null ? var2 : (String) var3.value;
		}
	}
}
