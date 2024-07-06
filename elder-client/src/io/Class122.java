package io;

/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class122 {
	static int anInt1679;
	static int anInt1680;
	static int anInt1681;
	short[] aShortArray1682;
	byte[] aByteArray1683;
	static int anInt1684;
	static OutgoingPacket aClass201_1685;
	static float aFloat1686;
	short[] aShortArray1687;
	short[] aShortArray1689;

	static final void decompileAll() {

	}

	static CS2Script decode(byte[] var0) {
		CS2Script var1 = new CS2Script(); // L: 112
		Buffer var2 = new Buffer(var0); // L: 113
		var2.position = var2.buffer.length - 2; // L: 114
		int var3 = var2.readUnsignedShort(); // L: 115
		int var4 = var2.buffer.length - 2 - var3 - 12; // L: 116
		var2.position = var4; // L: 117
		int var5 = var2.readInt(); // L: 118
		var1.int_var_count = var2.readUnsignedShort(); // L: 119
		var1.string_var_count = var2.readUnsignedShort(); // L: 120
		var1.int_param_count = var2.readUnsignedShort(); // L: 121
		var1.string_param_count = var2.readUnsignedShort(); // L: 122
		int var6 = var2.readUnsignedByte(); // L: 123
		int var7;
		int var8;
		if (var6 > 0) { // L: 124
			var1.switches = var1.newSwitchTable(var6); // L: 125

			for (var7 = 0; var7 < var6; ++var7) { // L: 126
				var8 = var2.readUnsignedShort(); // L: 127
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? method3362(var8) : 1); // L: 128
				var1.switches[var7] = var9; // L: 129

				while (var8-- > 0) { // L: 130
					int var10 = var2.readInt(); // L: 131
					int var11 = var2.readInt(); // L: 132
					var9.method547((long) var10, -2301, new SwitchInt(var11));
				}
			}
		}

		var2.position = 0; // L: 137
		var1.name = var2.method2379(2113195248);
		var1.opcodes = new int[var5]; // L: 139
		var1.integer_operands = new int[var5]; // L: 140
		var1.string_operands = new String[var5]; // L: 141

		for (var7 = 0; var2.position < var4; var1.opcodes[var7++] = var8) { // L: 142 143 148
			var8 = var2.readUnsignedShort(); // L: 144
			if (var8 == 3) { // L: 145
				var1.string_operands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.integer_operands[var7] = var2.readInt(); // L: 146
			} else {
				var1.integer_operands[var7] = var2.readUnsignedByte(); // L: 147
			}
		}

		return var1; // L: 150
	}

	public static int method3362(int var0) {
		--var0; // L: 64
		var0 |= var0 >>> 1; // L: 65
		var0 |= var0 >>> 2; // L: 66
		var0 |= var0 >>> 4; // L: 67
		var0 |= var0 >>> 8; // L: 68
		var0 |= var0 >>> 16; // L: 69
		return var0 + 1; // L: 70
	}

	public static CS2Script decodeold(byte[] clientScripts) {
		if (clientScripts == null) {
			return null;
		}
		CS2Script script = new CS2Script();
		Buffer buf = new Buffer(clientScripts);
		buf.position = buf.buffer.length - 2;
		int switchLength = buf.readUnsignedShort();
		int endIdx = buf.buffer.length - 2 - switchLength - 12;
		buf.position = endIdx;
		int opcodeCount = buf.readInt();
		script.int_var_count = buf.readUnsignedShort();
		script.string_var_count = buf.readUnsignedShort();
		script.int_param_count = buf.readUnsignedShort();
		script.string_param_count = buf.readUnsignedShort();
		int numSwitches = buf.readUnsignedByte();
		if (numSwitches > 0) {
			script.switches = script.newSwitchTable(numSwitches);
			for (int var7 = 0; var7 < numSwitches; ++var7) {
				int var8 = buf.readUnsignedShort();
				int var9;
				int var11;
				if (var8 > 0) {
					var11 = var8 - 1;
					var11 |= var11 >>> 1;
					var11 |= var11 >>> 2;
					var11 |= var11 >>> 4;
					var11 |= var11 >>> 8;
					var11 |= var11 >>> 16;
					int var10 = var11 + 1;
					var9 = var10;
				} else {
					var9 = 1;
				}
				IterableNodeHashTable switchTable = new IterableNodeHashTable(var9);
				script.switches[var7] = switchTable;
				while (var8-- > 0) {
					var11 = buf.readInt();
					int var12 = buf.readInt();
					switchTable.method547((long) var11, -2301, new SwitchInt(var12));
				}
			}
		}
		buf.position = 0;
		script.name = buf.method2379(2113195248);
		script.opcodes = new int[opcodeCount];
		script.string_operands = new String[opcodeCount];
		script.integer_operands = new int[opcodeCount];
		int opcodeId;
		for (int i = 0; buf.position < endIdx; script.opcodes[i++] = opcodeId) {
			opcodeId = buf.readUnsignedShort();
			if (opcodeId != 3) {
				if (opcodeId < 100 && opcodeId != 21 && opcodeId != 38 && opcodeId != 39) {
					script.integer_operands[i] = buf.readInt();
				} else {
					script.integer_operands[i] = buf.readUnsignedByte();
				}
			} else {
				script.string_operands[i] = buf.readString();
			}
		}
		return script;
	}

	static final CS2Script decode(byte i, byte[] is) {
		try {
			anInt1684++;
			CS2Script cs2Script = new CS2Script();
			Buffer stream = new Buffer(is);
			(stream).position = -2 + (stream).buffer.length;
			int pos = stream.readUnsignedShort();
			int i_1_ = -12 + (-pos + ((stream).buffer.length - 2));
			(stream).position = i_1_;
			int instructionCount = stream.readInt((byte) 95);
			(cs2Script).int_var_count = stream.readUnsignedShort();
			(cs2Script).string_var_count = stream.readUnsignedShort();
			(cs2Script).int_param_count = stream.readUnsignedShort();
			(cs2Script).string_param_count = stream.readUnsignedShort();
			int i_3_ = stream.readUnsignedByte();
			if ((i_3_ ^ 0xffffffff) < -1) {
				(cs2Script).switches = new IterableNodeHashTable[i_3_];
				for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
					int i_5_ = stream.readUnsignedShort();
					IterableNodeHashTable class85 = new IterableNodeHashTable(Class206.method1350(i_5_, 269173057));
					(cs2Script).switches[i_4_] = class85;
					while (i_5_-- > 0) {
						int i_6_ = stream.readInt((byte) 107);
						int i_7_ = stream.readInt((byte) 118);
						class85.method547((long) i_6_, -2301, new SwitchInt(i_7_));
					}
				}
			}
			(stream).position = 0;
			(cs2Script).name = stream.method2379(2113195248);
			(cs2Script).opcodes = new int[instructionCount];
			(cs2Script).string_operands = new String[instructionCount];
			(cs2Script).integer_operands = new int[instructionCount];
			int i_9_ = 0;
			while ((stream).position < i_1_) {
				int opcode = stream.readUnsignedShort();
				if ((opcode ^ 0xffffffff) == -4)
					(cs2Script).string_operands[i_9_] = stream.readString((byte) -40).intern();
				else if (opcode < 100 && (opcode ^ 0xffffffff) != -22 && (opcode ^ 0xffffffff) != -39 && opcode != 39)
					(cs2Script).integer_operands[i_9_] = stream.readInt((byte) 77);
				else
					(cs2Script).integer_operands[i_9_] = stream.readUnsignedByte();
				(cs2Script).opcodes[i_9_++] = opcode;
			}
			return cs2Script;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ll.A(" + i + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	static final void method825(int i) {
		try {
			anInt1679++;
			if (!Class15.aBool231) {
				if (i > -113)
					Client.frame = null;
				Class15.aBool231 = true;
				do {
					if (((Renderer) Client.current_renderer).aBool605) {
						Camera.camera_pitch = (float) (47 + (int) Camera.camera_pitch & ~0xf);
						if (!Client.f_ob)
							break;
					}
					Class24.aFloat341 += (-Class24.aFloat341 + 12.0F) / 2.0F;
				} while (false);
				RenderAnimation.aBool1929 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ll.C(" + i + ')');
		}
	}

	static final int method826(byte i, Random random, int i_11_) {
		try {
			anInt1681++;
			if (i_11_ <= 0)
				throw new IllegalArgumentException();
			if (i != 94)
				method826((byte) -11, null, -37);
			if (WidgetParent.method2313(200, i_11_))
				return (int) (((0xffffffffL & (long) random.nextInt()) * (long) i_11_) >> 32);
			int i_12_ = -(int) (4294967296L % (long) i_11_) + -2147483648;
			int i_13_;
			do
				i_13_ = random.nextInt();
			while ((i_13_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff));
			return Class246_Sub11.method1868(i_11_, (byte) 81, i_13_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("ll.B(" + i + ',' + (random != null ? "{...}" : "null") + ',' + i_11_ + ')'));
		}
	}

	public static void method827(int i) {
		try {
			if (i != -7782)
				method827(-27);
			aClass201_1685 = null;
			Client.frame = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ll.D(" + i + ')');
		}
	}

	static {
		new MultilingualString("You are not currently in a clan channel.",
				"Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'\u00eates pas dans un canal de clan.",
				"No momento voc\u00ea n\u00e3o est\u00e1 em um canal de cl\u00e3.");
		aClass201_1685 = new OutgoingPacket(49, 6);
	}
}
