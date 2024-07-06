package io;

import io.cache.Revision;

final class Sequence {
	private static byte[] aByteArray1389;
	private static short[] bufferX = new short[500];
	short[] vertexX;
	private static short[] aShortArray1392 = new short[500];
	TransformList transformList;
	private static short[] bufferY;
	short[] vertexY;
	short[] aShortArray1387;
	short[] ids;
	private static short[] opcodes = new short[500];
	boolean aBoolean2646 = false;
	private static short[] bufferZ = new short[500];
	int length;
	byte[] aByteArray1393;
	boolean hasAlpha;
	short[] vertexZ;
	boolean hasColor;

	public static void method457() {
		opcodes = null;
		bufferX = null;
		bufferY = null;
		bufferZ = null;
		aShortArray1392 = null;
		aByteArray1389 = null;
	}

	Sequence(byte[] data, TransformList transform_list, Revision revision) {
		((Sequence) this).transformList = null;
		((Sequence) this).hasAlpha = false;
		((Sequence) this).hasColor = false;
		((Sequence) this).length = 0;
		((Sequence) this).transformList = transform_list;
		try {
			if (revision == Revision.OSRS || revision == Revision.PRE_EOC_550) {
				try {
					Buffer var3 = new Buffer(data);
					Buffer var4 = new Buffer(data);
					var3.position = 2;
					int var5 = var3.readUnsignedByte();
					int translateIdx = 0;
					int var7 = -1;
					int var8 = -1;
					var4.position = var3.position + var5;

					for (int var9 = 0; var9 < var5; ++var9) {
						int var10 = transformList.types[var9];
						if (var10 == 0) {
							var7 = var9;
						}

						int var11 = var3.readUnsignedByte();
						if (var11 > 0) {

							if (var10 == 0) {
								var8 = var9;
							}

							opcodes[translateIdx] = (short) var9;
							short var12 = 0;
							if (var10 == 3) {
								var12 = 128;
							}

							if ((var11 & 0x1) != 0) {
								bufferX[translateIdx] = (short) var4.readShortSmart();
							} else {
								bufferX[translateIdx] = var12;
							}

							if ((var11 & 0x2) != 0) {
								bufferY[translateIdx] = (short) var4.readShortSmart();
							} else {
								bufferY[translateIdx] = var12;
							}

							if ((var11 & 0x4) != 0) {
								bufferZ[translateIdx] = (short) var4.readShortSmart();
							} else {
								bufferZ[translateIdx] = var12;
							}

							aByteArray1389[translateIdx] = (byte) (var11 >>> 3 & 0x3);
							if (var10 == 2) {
								bufferX[translateIdx] = (short) (((bufferX[translateIdx] & 255) << 3) + (bufferX[translateIdx] >> 8 & 7));
								bufferY[translateIdx] = (short) (((bufferY[translateIdx] & 255) << 3) + (bufferY[translateIdx] >> 8 & 7));
								bufferZ[translateIdx] = (short) (((bufferZ[translateIdx] & 255) << 3) + (bufferZ[translateIdx] >> 8 & 7));
							}
							aShortArray1392[translateIdx] = -1;
							if (var10 == 1 || var10 == 2 || var10 == 3) {
								if (var7 > var8) {
									aShortArray1392[translateIdx] = (short) var7;
									var8 = var7;
								}
							} else if (var10 == 5) {
								hasAlpha = true;
							} else if (var10 == 7) {
								hasColor = true;
							}

							translateIdx++;
						}
					}

					if (var4.position != data.length) {
						throw new RuntimeException();
					} else {
						length = translateIdx;
						ids = new short[translateIdx];
						vertexX = new short[translateIdx];
						vertexY = new short[translateIdx];
						vertexZ = new short[translateIdx];
						aShortArray1387 = new short[translateIdx];
						aByteArray1393 = new byte[translateIdx];

						for (int var9 = 0; var9 < translateIdx; ++var9) {
							ids[var9] = opcodes[var9];
							vertexX[var9] = bufferX[var9];
							vertexY[var9] = bufferY[var9];
							vertexZ[var9] = bufferZ[var9];
							aShortArray1387[var9] = aShortArray1392[var9];
							aByteArray1393[var9] = aByteArray1389[var9];
						}

					}
				} catch (Exception e) {
					e.printStackTrace();
					length = 0;
					hasAlpha = false;
					hasColor = false;
				}
			} else {
				Buffer flagsBuffer = new Buffer(data);
				Buffer dataBuffer = new Buffer(data);
				flagsBuffer.readUnsignedByte();
				((Buffer) flagsBuffer).position += 2;
				int i = flagsBuffer.readUnsignedByte();
				int used = 0;
				int i_2_ = -1;
				int i_3_ = -1;
				((Buffer) dataBuffer).position = ((Buffer) flagsBuffer).position + i;
				for (int i_4_ = 0; i_4_ < i; i_4_++) {
					int i_5_ = (((TransformList) ((Sequence) this).transformList).types[i_4_]);
					if (i_5_ == 0)
						i_2_ = i_4_;
					int i_6_ = flagsBuffer.readUnsignedByte();
					if (i_6_ > 0) {
						if (i_5_ == 0)
							i_3_ = i_4_;
						opcodes[used] = (short) i_4_;
						int scale = i_5_ == 1 ? 4 : 1;
						short i_7_ = 0;
						if (i_5_ == 3 || i_5_ == 10)
							i_7_ = (short) 128;
						if ((i_6_ & 0x1) != 0)
							bufferX[used] = (short) (dataBuffer.readSmart() / scale);
						else//try pls
							bufferX[used] = i_7_;
						if ((i_6_ & 0x2) != 0)
							bufferY[used] = (short) (dataBuffer.readSmart() / scale);
						else
							bufferY[used] = i_7_;
						if ((i_6_ & 0x4) != 0)
							bufferZ[used] = (short) (dataBuffer.readSmart() / scale);
						else
							bufferZ[used] = i_7_;//test
						aByteArray1389[used] = (byte) (i_6_ >>> 3 & 0x3);
						if (i_5_ == 2 || i_5_ == 9) {
							bufferX[used] = (short) (bufferX[used] << 2 & 0x3fff);
							bufferY[used] = (short) (bufferY[used] << 2 & 0x3fff);
							bufferZ[used] = (short) (bufferZ[used] << 2 & 0x3fff);
						}
						aShortArray1392[used] = (short) -1;
						if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
							if (i_2_ > i_3_) {
								aShortArray1392[used] = (short) i_2_;
								i_3_ = i_2_;
							}
						} else if (i_5_ == 5)
							((Sequence) this).hasAlpha = true;
						else if (i_5_ == 7)
							((Sequence) this).hasColor = true;
						else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
							((Sequence) this).aBoolean2646 = true;
						used++;
					}
				}
				if (((Buffer) dataBuffer).position != data.length)
					throw new RuntimeException();
				((Sequence) this).length = used;
				((Sequence) this).ids = new short[used];
				((Sequence) this).vertexX = new short[used];
				((Sequence) this).vertexY = new short[used];
				((Sequence) this).vertexZ = new short[used];
				((Sequence) this).aShortArray1387 = new short[used];
				((Sequence) this).aByteArray1393 = new byte[used];
				for (int i_8_ = 0; i_8_ < used; i_8_++) {
					((Sequence) this).ids[i_8_] = opcodes[i_8_];
					((Sequence) this).vertexX[i_8_] = bufferX[i_8_];
					((Sequence) this).vertexY[i_8_] = bufferY[i_8_];
					((Sequence) this).vertexZ[i_8_] = bufferZ[i_8_];
					((Sequence) this).aShortArray1387[i_8_] = aShortArray1392[i_8_];
					((Sequence) this).aByteArray1393[i_8_] = aByteArray1389[i_8_];
				}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			((Sequence) this).length = 0;
			((Sequence) this).hasAlpha = false;
			((Sequence) this).hasColor = false;
		}
	}

	static {
		aByteArray1389 = new byte[500];
		bufferY = new short[500];
	}
}
