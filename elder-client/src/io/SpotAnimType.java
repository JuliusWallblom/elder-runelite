package io;

import io.cache.Revision;

/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class SpotAnimType {
	private short[] textureToFind;
	static int anInt2071;
	private int resizeY;
	private int resizeX;
	static int anInt2074 = 0;
	private short[] recolorToReplace;
	byte aByte2076 = 0;
	Class177 aClass177_2077;
	private short[] recolorToFind;
	static int anInt2079;
	static int anInt2080;
	static int anInt2081;
	static int anInt2082;
	private int modelId;
	private int rotation;
	static int anInt2085 = 0;
	static int anInt2086;
	boolean aBool2087;
	static MultilingualString aClass67_2088 = (new MultilingualString("RuneScape is loading - please wait...",
			"RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...",
			"RuneScape carregando. Aguarde..."));
	private int ambient;
	static int anInt2090;
	private short[] textureToReplace;
	int animationId;
	private int contrast;
	private int anInt2094;
	int id;
	public Revision revision;
	static int anInt2096 = 1;

	final AbstractModel method965(int i, int i_0_, Class45 class45, byte i_1_, int i_2_, int i_3_,
			SceneGraph class260) {
		try {
			anInt2080++;
			if (i_1_ > -86)
				return null;
			return method971(i, i_3_, class45, 0, null, false, class260, i_2_, (byte) 2, false, i_0_, 0, 0, null);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nm.B(" + i + ',' + i_0_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_
							+ ',' + i_3_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final void decode(byte i, Buffer stream, Revision revision) {
		try {
			anInt2079++;
			if (i != 3)
				method968(null, true, -4, -72, null, 127, -67, null, 11, true, null, -99, -41);
			for (;;) {
				int op = stream.readUnsignedByte();
				if (op == 0)
					break;
				if (revision == Revision.OSRS) {
					process_op_osrs((byte) -115, stream, op);
				} else {
					process_op((byte) -115, stream, op);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nm.A(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method967(byte i) {
		try {
			if (i == -120)
				aClass67_2088 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nm.D(" + i + ')');
		}
	}

	final AbstractModel method968(Class210 class210, boolean bool, int i, int i_5_, SceneGraph class260, int i_6_,
			int i_7_, Class210 class210_8_, int i_9_, boolean bool_10_, Class45 class45, int i_11_, int i_12_) {
		try {
			anInt2071++;
			if (bool_10_ != true)
				return null;
			return method971(i_7_, i_11_, class45, i, class210_8_, bool, class260, i_9_, (byte) 2, false, i_12_, i_5_,
					i_6_, class210);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nm.G(" + (class210 != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_5_ + ','
							+ (class260 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ','
							+ (class210_8_ != null ? "{...}" : "null") + ',' + i_9_ + ',' + bool_10_ + ','
							+ (class45 != null ? "{...}" : "null") + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	static final Class97[] method969(byte i) {
		try {
			anInt2082++;
			if (i <= 4)
				anInt2096 = 101;
			return (new Class97[] { SubIncomingPacket.aClass97_7088, Class189.aClass97_2666, Class37.aClass97_544 });
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nm.F(" + i + ')');
		}
	}

	private final void process_op(byte i, Buffer stream, int opcode) {
		try {
			anInt2090++;
			if (opcode == 1) {
				modelId = stream.readUnsignedShort();
			} else if (opcode == 2) {
				animationId = stream.readUnsignedShort();
			} else if (opcode == 4) {
				resizeX = stream.readUnsignedShort();
			} else if (opcode == 5) {
				resizeY = stream.readUnsignedShort();
			} else if (opcode == 6) {
				rotation = stream.readUnsignedShort();
			} else if (opcode == 7) {
				ambient = stream.readUnsignedByte();
			} else if (opcode == 8) {
				contrast = stream.readUnsignedByte();
			} else if (opcode == 9) {
				aByte2076 = (byte) 3;
				anInt2094 = 8224;
			} else if (opcode == 10) {
				aBool2087 = true;
			} else if (opcode == 11) {
				aByte2076 = (byte) 1;
			} else if (opcode == 12) {
				aByte2076 = (byte) 4;
			} else if (opcode == 13) {
				aByte2076 = (byte) 5;
			} else if (opcode == 14) {
				aByte2076 = (byte) 2;
				anInt2094 = 256 * stream.readUnsignedByte();
			} else if (opcode == 15) {
				aByte2076 = (byte) 3;
				anInt2094 = stream.readUnsignedShort();
			} else if (opcode == 16) {
				aByte2076 = (byte) 3;
				anInt2094 = stream.readInt((byte) 127);
			} else if (opcode == 40) {
				int i_15_ = stream.readUnsignedByte();
				recolorToReplace = new short[i_15_];
				recolorToFind = new short[i_15_];
				for (int i_16_ = 0; (i_15_ > i_16_); i_16_++) {
					recolorToFind[i_16_] = (short) (stream.readUnsignedShort());
					recolorToReplace[i_16_] = (short) (stream.readUnsignedShort());
				}
			} else if (opcode == 41) {
				int i_17_ = stream.readUnsignedByte();
				textureToFind = new short[i_17_];
				textureToReplace = new short[i_17_];
				for (int i_18_ = 0; (i_17_ > i_18_); i_18_++) {
					textureToFind[i_18_] = (short) (stream.readUnsignedShort());
					textureToReplace[i_18_] = (short) (stream.readUnsignedShort());
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nm.E(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + opcode + ')'));
		}
	}

	private final void process_op_osrs(byte i, Buffer stream, int opcode) {
		try {
			anInt2090++;
			if (opcode == 1) {
				modelId = stream.readUnsignedShort();
			} else if (opcode == 2) {
				animationId = stream.readUnsignedShort();
			} else if (opcode == 4) {
				resizeX = stream.readUnsignedShort();
			} else if (opcode == 5) {
				resizeY = stream.readUnsignedShort();
			} else if (opcode == 6) {
				rotation = stream.readUnsignedShort();
			} else if (opcode == 7) {
				ambient = stream.readUnsignedByte();
			} else if (opcode == 8) {
				contrast = stream.readUnsignedByte();
			} else if (opcode == 40) {
				int i_15_ = stream.readUnsignedByte();
				recolorToReplace = new short[i_15_];
				recolorToFind = new short[i_15_];
				for (int i_16_ = 0; (i_15_ > i_16_); i_16_++) {
					recolorToFind[i_16_] = (short) (stream.readUnsignedShort());
					recolorToReplace[i_16_] = (short) (stream.readUnsignedShort());
				}
			} else if (opcode == 41) {
				int i_17_ = stream.readUnsignedByte();
				textureToFind = new short[i_17_];
				textureToReplace = new short[i_17_];
				for (int i_18_ = 0; (i_17_ > i_18_); i_18_++) {
					textureToFind[i_18_] = (short) (stream.readUnsignedShort());
					textureToReplace[i_18_] = (short) (stream.readUnsignedShort());
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nm.E(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + opcode + ')'));
		}
	}

	private final AbstractModel method971(int i, int i_19_, Class45 class45, int i_20_, Class210 class210, boolean bool,
			SceneGraph class260, int i_21_, byte i_22_, boolean bool_23_, int i_24_, int i_25_, int i_26_,
			Class210 class210_27_) {
		try {
			anInt2086++;
			int i_28_ = i_19_;
			SequenceType class124 = (((SpotAnimType) this).animationId != -1 && i != -1
					? class45.list(3, ((SpotAnimType) this).animationId, this.revision)
					: null);
			bool = bool & ((SpotAnimType) this).aByte2076 != 0;
			if (class124 != null)
				i_28_ |= class124.method847(i, 256, i_21_, false);
			if (bool_23_ != false)
				return null;
			if (bool)
				i_28_ = i_28_ | (((SpotAnimType) this).aByte2076 == 3 ? 7 : 2);
			if (resizeY != 128)
				i_28_ |= 0x2;
			if (resizeX != 128 || rotation != 0)
				i_28_ |= 0x5;
			AbstractModel class_t = null;
			if (this.revision == Revision.OSRS) {
				synchronized (((Class177) ((SpotAnimType) this).aClass177_2077).spot_anim_model_cache_osrs) {
					class_t = ((AbstractModel) (((Class177) ((SpotAnimType) this).aClass177_2077).spot_anim_model_cache_osrs
							.method379((long) (((SpotAnimType) this).id |= ((SceneGraph) class260).anInt3719 << 29),
									(byte) 58)));
				}
			} else {
				synchronized (((Class177) ((SpotAnimType) this).aClass177_2077).spot_anim_model_cache) {
					class_t = ((AbstractModel) (((Class177) ((SpotAnimType) this).aClass177_2077).spot_anim_model_cache
							.method379((long) (((SpotAnimType) this).id |= ((SceneGraph) class260).anInt3719 << 29),
									(byte) 58)));
				}
			}
			if (class_t == null || class260.method1710(class_t.P(), i_28_) != 0) {
				if (class_t != null)
					i_28_ = class260.method1723(i_28_, class_t.P());
				int i_29_ = i_28_;
				if (recolorToFind != null)
					i_29_ |= 0x4000;
				if (textureToFind != null)
					i_29_ |= 0x8000;
				Model class103 = Model.get_model(0,
						(((Class177) ((SpotAnimType) this).aClass177_2077).get_spot_anim_model_index(this)), modelId,
						this.revision);
				if (class103 == null)
					return null;
				if (((Model) class103).anInt1358 < 13)
					class103.method646(0, (byte) -123);
				class_t = class260.method1695(class103, i_29_,
						(((Class177) (((SpotAnimType) this).aClass177_2077)).anInt2497), ambient + 64, 850 + contrast);
				if (recolorToFind != null) {
					for (int i_30_ = 0; i_30_ < recolorToFind.length; i_30_++)
						class_t.BA(recolorToFind[i_30_], recolorToReplace[i_30_]);
				}
				if (textureToFind != null) {
					for (int i_31_ = 0; (i_31_ < textureToFind.length); i_31_++)
						class_t.I(textureToFind[i_31_], textureToReplace[i_31_]);
				}
				class_t.UA(i_28_);
				if (this.revision == Revision.OSRS) {
					synchronized (((Class177) ((SpotAnimType) this).aClass177_2077).spot_anim_model_cache_osrs) {
						((Class177) ((SpotAnimType) this).aClass177_2077).spot_anim_model_cache_osrs.method371(1,
								(long) (((SpotAnimType) this).id |= ((SceneGraph) class260).anInt3719 << 29), class_t);
					}
				} else {
					synchronized (((Class177) ((SpotAnimType) this).aClass177_2077).spot_anim_model_cache) {
						((Class177) ((SpotAnimType) this).aClass177_2077).spot_anim_model_cache.method371(1,
								(long) (((SpotAnimType) this).id |= ((SceneGraph) class260).anInt3719 << 29), class_t);
					}
				}
			}
			AbstractModel class_t_32_ = (class124 != null
					? class124.method849(i, i_22_, class_t, i_24_, i_21_, 0, i_28_, 256)
					: class_t.method678(i_22_, i_28_, true));
			if (resizeX != 128 || resizeY != 128)
				class_t_32_.H(resizeX, resizeY, resizeX);
			if (rotation != 0) {
				if (rotation == 90)
					class_t_32_.Q(4096);
				if (rotation == 180)
					class_t_32_.Q(8192);
				if (rotation == 270)
					class_t_32_.Q(12288);
			}
			if (bool)
				class_t_32_.h(((SpotAnimType) this).aByte2076, anInt2094, class210, class210_27_, i_25_, i_20_, i_26_);
			class_t_32_.UA(i_19_);
			return class_t_32_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nm.H(" + i + ',' + i_19_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_20_ + ','
							+ (class210 != null ? "{...}" : "null") + ',' + bool + ','
							+ (class260 != null ? "{...}" : "null") + ',' + i_21_ + ',' + i_22_ + ',' + bool_23_ + ','
							+ i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + (class210_27_ != null ? "{...}" : "null")
							+ ')'));
		}
	}

	final AbstractModel method972(SceneGraph class260, byte i, int i_33_, Class45 class45, int i_34_, int i_35_,
			int i_36_) {
		try {
			if (i != -53)
				contrast = 17;
			anInt2081++;
			return method971(i_34_, i_35_, class45, 0, null, false, class260, i_36_, (byte) 5, false, i_33_, 0, 0,
					null);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("nm.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_33_ + ','
							+ (class45 != null ? "{...}" : "null") + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ')'));
		}
	}

	public SpotAnimType() {
		resizeX = 128;
		resizeY = 128;
		((SpotAnimType) this).aBool2087 = false;
		rotation = 0;
		ambient = 0;
		((SpotAnimType) this).animationId = -1;
		contrast = 0;
		anInt2094 = -1;
	}
}
