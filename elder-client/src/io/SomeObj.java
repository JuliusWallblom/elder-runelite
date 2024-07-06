package io;

public class SomeObj {

	public int field2549;
	public int field2546;
	public int field2547;

	public SomeObj(SomeObj var1) {
		this.field2549 = var1.field2549;
		this.field2546 = var1.field2546;
		this.field2547 = var1.field2547;
	}

	public SomeObj(int var1, int var2, int var3) {
		this.field2549 = var1;
		this.field2546 = var2;
		this.field2547 = var3;
	}

	public SomeObj(int var1) {
		if (var1 == -1) {
			this.field2549 = -1;
		} else {
			this.field2549 = var1 >> 28 & 3;
			this.field2546 = var1 >> 14 & 16383;
			this.field2547 = var1 & 16383;
		}

	}

	String method4006(String var1, int var2) {
		return this.field2549 + var1 + (this.field2546 >> 6) + var1 + (this.field2547 >> 6) + var1
				+ (this.field2546 & 63) + var1 + (this.field2547 & 63);
	}

	public int method3994(byte var1) {
		return this.field2549 << 28 | this.field2546 << 14 | this.field2547;
	}

	boolean method3995(SomeObj var1, int var2) {
		return this.field2549 != var1.field2549 ? false
				: (this.field2546 != var1.field2546 ? false : this.field2547 == var1.field2547);
	}

	public boolean equals(Object var1) {
		return this == var1 ? true
				: (!(var1 instanceof SomeObj) ? false : this.method3995((SomeObj) var1, 902297370));
	}

	public int hashCode() {
		return this.method3994((byte) -27);
	}

	public String toString() {
		return this.method4006(",", -1856185425);
	}

	public String abd() {
		return this.method4006(",", -1856185425);
	}

	public String aba() {
		return this.method4006(",", -1856185425);
	}
}
