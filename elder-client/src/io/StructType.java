package io;

final class StructType extends NodeSub {
	private IterableNodeHashTable aClass85_6854;
	static int[] anIntArray6855;
	static int anInt6856;
	static int anInt6857;
	static IncomingPacket aClass13_6858 = new IncomingPacket(76, 7);
	static int anInt6859 = 0;
	static CacheIndex aClass_fs6860;
	static int anInt6861;
	static int anInt6862;
	IterableHashTable osrs_params;

	public static int method28(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	static final IterableHashTable decodeParams(Buffer packet, IterableHashTable target) {
		int var2 = packet.g1();
		int var3;
		if (target == null) {
			var3 = method28(var2);
			target = new IterableHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = packet.g1() == 1;
			int var5 = packet.g3();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(packet.gjstr());
			} else {
				var6 = new IntegerNode(packet.readInt());
			}

			target.put((Node) var6, (long) var5);
		}

		return target;
	}
	
	public int getIntParam(int param, int defaultVal) {
		return AuthProt.getOrDefaultInt(this.osrs_params, param, defaultVal);
	}

	public String getStringParam(int param, String defaultVal) {
		return AuthProt.getOrDefaultString(this.osrs_params, param, defaultVal);
	}
	
	static final boolean method5220(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	private final void process_op(Buffer stream, int opcode, int i_0_, boolean osrs) {
		if (osrs) {
			if (opcode == 249) {
				this.osrs_params = decodeParams(stream, this.osrs_params);
			}
		} else {
			do {
				try {
					anInt6861++;
					if (opcode != i_0_)
						break;
					int i_1_ = stream.readUnsignedByte();
					if (aClass85_6854 == null) {
						int i_2_ = Class206.method1350(i_1_, i_0_ + 269172808);
						aClass85_6854 = new IterableNodeHashTable(i_2_);
					}
					for (int i_3_ = 0; i_1_ > i_3_; i_3_++) {
						boolean bool = stream.readUnsignedByte() == 1;
						int i_4_ = stream.read24BitInteger((byte) 29);
						Node class246;
						if (bool)
							class246 = new Class246_Sub4(stream.readString((byte) -40));
						else
							class246 = new SwitchInt(stream.readInt((byte) 90));
						aClass85_6854.method547((long) i_4_, -2301, class246);
					}
				} catch (RuntimeException runtimeexception) {
					throw Class193.method1272(runtimeexception,
							("rk.B(" + (stream != null ? "{...}" : "null") + ',' + opcode + ',' + i_0_ + ')'));
				}
				break;
			} while (false);
		}
	}

	final void decode(int i, Buffer stream, boolean osrs) {
		try {
			for (;;) {
				int opcode = stream.readUnsignedByte();
				if (opcode == 0)
					break;
				process_op(stream, opcode, 249, osrs);
			}
			anInt6862++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("rk.D(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2829(int i) {
		do {
			try {
				aClass13_6858 = null;
				anIntArray6855 = null;
				aClass_fs6860 = null;
				if (i == 7)
					break;
				aClass13_6858 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rk.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method2830(int i, int i_6_, int i_7_) {
		try {
			anInt6856++;
			if (aClass85_6854 == null)
				return i;
			SwitchInt class246_sub33 = (SwitchInt) aClass85_6854.get((long) i_7_);
			if (class246_sub33 == null)
				return i;
			return ((SwitchInt) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rk.A(" + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	public StructType() {
		/* empty */
	}

	final String method2831(int i, String string, int i_8_) {
		try {
			anInt6857++;
			if (i != -16471)
				anIntArray6855 = null;
			if (aClass85_6854 == null)
				return string;
			Class246_Sub4 class246_sub4 = (Class246_Sub4) aClass85_6854.get((long) i_8_);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("rk.C(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_8_ + ')'));
		}
	}
}
