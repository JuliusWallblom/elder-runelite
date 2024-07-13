package io;

final class EnumType {
	static int anInt2541;
	static int anInt2542;
	static int anInt2543;
	char input_type;
	static int anInt2545;
	static int anInt2546;
	char output_type;
	String default_string = "null";
	int default_int;
	IterableNodeHashTable aClass85_2551;
	static int anInt2552;
	private IterableNodeHashTable aClass85_2553;
	static int anInt2554;
	static int anInt2555;
	static int anInt2556;
	
	public int size() {
		return this.output_count; // L: 69
	}

	private final void method1179(byte i) {
		try {
			aClass85_2553 = new IterableNodeHashTable(((EnumType) this).aClass85_2551.method550(-14891));
			anInt2556++;
			if (i != -107)
				((EnumType) this).output_type = '\uffb8';
			for (Class246_Sub4 class246_sub4 = ((Class246_Sub4) ((EnumType) this).aClass85_2551.first(
					(byte) -23)); class246_sub4 != null; class246_sub4 = (Class246_Sub4) ((EnumType) this).aClass85_2551
							.next((byte) -20)) {
				Class246_Sub31 class246_sub31 = new Class246_Sub31((((Class246_Sub4) class246_sub4).aString3862),
						(int) (((Node) class246_sub4).hash));
				aClass85_2553.method547(Class128.method876(0, (((Class246_Sub4) class246_sub4).aString3862)), -2301,
						class246_sub31);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qu.H(" + i + ')');
		}
	}

	final int getIntegerParamValue(int i, int i_0_) {
		try {
			anInt2555++;
			if (i_0_ != -6)
				method1183(false, -7);
			if (((EnumType) this).aClass85_2551 == null)
				return default_int;
			SwitchInt class246_sub33 = ((SwitchInt) ((EnumType) this).aClass85_2551.get((long) i));
			if (class246_sub33 == null)
				return default_int;
			return ((SwitchInt) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qu.B(" + i + ',' + i_0_ + ')');
		}
	}

	final void decode(int i, Buffer stream, int revision) {
		try {
			for (;;) {
				int i_1_ = stream.readUnsignedByte();
				if (i_1_ == 0)
					break;
				process_op(stream, i_1_, 22409, revision);
			}
			if (i != 19207)
				method1186(-22);
			anInt2546++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("qu.A(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1182(int i, String string) {
		try {
			anInt2542++;
			if (((EnumType) this).aClass85_2551 == null)
				return false;
			if (i != 2)
				return true;
			if (aClass85_2553 == null)
				method1179((byte) -107);
			for (Class246_Sub31 class246_sub31 = ((Class246_Sub31) aClass85_2553.get(Class128.method876(0,
					string))); class246_sub31 != null; class246_sub31 = (Class246_Sub31) aClass85_2553.method541(-1)) {
				if (((Class246_Sub31) class246_sub31).aString5035.equals(string))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("qu.E(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1183(boolean bool, int i) {
		try {
			anInt2543++;
			if (((EnumType) this).aClass85_2551 == null)
				return false;
			if (aClass85_2553 == null)
				method1186(25131);
			SwitchInt class246_sub33 = (SwitchInt) aClass85_2553.get((long) i);
			if (class246_sub33 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qu.G(" + bool + ',' + i + ')');
		}
	}

	// OSRS enum stuff
	public int output_count;
	public int[] keys;
	public int[] integer_values;
	public String[] string_values;

	private final void process_op(Buffer stream, int i, int i_2_, int revision) {
		do {
			try {
				anInt2554++;
				if (i == 1) {
					((EnumType) this).input_type = Class246_Sub1_Sub8_Sub1.method2923(32404, stream.readByte());
				} else if (i == 2) {
					((EnumType) this).output_type = Class246_Sub1_Sub8_Sub1.method2923(32404, stream.readByte());
				} else if (i == 3) {
					default_string = stream.readString((byte) -40);
				} else if (i == 4) {
					default_int = stream.readInt((byte) 94);
				}
				if (revision != 1 && revision < 200) {
					int var3;
					if (i == 5) { // L: 47
						this.output_count = stream.readUnsignedShort(); // L: 48
						this.keys = new int[this.output_count]; // L: 49
						this.string_values = new String[this.output_count]; // L: 50

						for (var3 = 0; var3 < this.output_count; ++var3) { // L: 51
							this.keys[var3] = stream.readInt(); // L: 52
							this.string_values[var3] = stream.readStringCp1252NullTerminated(); // L: 53
						}
					} else if (i == 6) { // L: 56
						this.output_count = stream.readUnsignedShort(); // L: 57
						this.keys = new int[this.output_count]; // L: 58
						this.integer_values = new int[this.output_count]; // L: 59

						for (var3 = 0; var3 < this.output_count; ++var3) { // L: 60
							this.keys[var3] = stream.readInt(); // L: 61
							this.integer_values[var3] = stream.readInt(); // L: 62
						}
					}
				} else {
					if (i == 5 || i == 6) {
						int i_3_ = stream.readUnsignedShort();
						((EnumType) this).aClass85_2551 = new IterableNodeHashTable(
								Class206.method1350(i_3_, i_2_ + 269150648));
						for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
							int i_5_ = stream.readInt((byte) 125);
							Node class246;
							if (i != 5) {
								class246 = (new SwitchInt(stream.readInt((byte) 77)));
							} else {
								class246 = (new Class246_Sub4(stream.readString((byte) -40)));
							}
							((EnumType) this).aClass85_2551.method547((long) i_5_, -2301, class246);
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("qu.F(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	final String getStringParamValue(int i, int i_6_) {
		try {
			anInt2552++;
			if (((EnumType) this).aClass85_2551 == null)
				return default_string;
			Class246_Sub4 class246_sub4 = ((Class246_Sub4) ((EnumType) this).aClass85_2551.get((long) i_6_));
			if (i <= 100)
				return null;
			if (class246_sub4 == null)
				return default_string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qu.D(" + i + ',' + i_6_ + ')');
		}
	}

	private final void method1186(int i) {
		try {
			aClass85_2553 = new IterableNodeHashTable(((EnumType) this).aClass85_2551.method550(-14891));
			anInt2545++;
			if (i == 25131) {
				for (SwitchInt class246_sub33 = (SwitchInt) ((EnumType) this).aClass85_2551.first(
						(byte) -23); class246_sub33 != null; class246_sub33 = (SwitchInt) ((EnumType) this).aClass85_2551
								.next((byte) -20)) {
					SwitchInt class246_sub33_7_ = new SwitchInt((int) ((Node) class246_sub33).hash);
					aClass85_2553.method547((long) ((SwitchInt) class246_sub33).value, -2301, class246_sub33_7_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qu.C(" + i + ')');
		}
	}

	public EnumType() {
		/* empty */
	}

	static {
		anInt2541 = 0;
	}
}
