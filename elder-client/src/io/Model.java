package io;

import io.cache.Revision;

public final class Model {
	short[] texIndices2;
	static int anInt1327;
	int[] verticesY;
	int[] indices3;
	byte[] aByteArray1330;
	int vertices = 0;
	byte[] faceRenderPriorities;
	short[] texIndices1;
	int[] indices2;
	int[] anIntArray1335;
	static int anInt1336;
	int[] indices1;
	short[] aShortArray1338;
	static int anInt1339;
	static int anInt1340;
	byte priority = 0;
	static int anInt1342;
	int[] verticesX;
	static int anInt1344;
	int[] faceRenderTypes;
	Class303[] aClass303Array1547;
	int[] faceSkins;
	SomeClass[] aClass125Array1583;
	static int anInt1349;
	static int anInt1350;
	short[] aShortArray1351;
	static int anInt1352;
	short[] faceColors;
	int anInt1573 = 0;
	static int anInt1355;
	static int anInt1356;
	static int anInt1357;
	int anInt1358 = 12;
	static int anInt1359;
	static int anInt1360;
	int[] vertexSkins;
	short[] texIndices3;
	static int anInt1363;
	Class19[] aClass19Array1364;
	static int anInt1365;
	int[] anIntArray1366;
	int[] texTriangleY;
	int faces = 0;
	static IncomingPacket aClass13_1369;
	int[] texTriangleX;
	int[] faceAlphas;
	static int anInt1372;
	int[] texTriangleZ;
	static int anInt1374;
	int[] verticesZ;
	byte[] f_ab;
	byte[] textureCoords;
	Revision revision;
	short[] faceTextures;
	int texture_faces = 0;
	byte[] textureRenderTypes;
	int[] f_fb;
	private int[][] animayaGroups;
	private int[][] animayaScales;
	static String[] f_gb;
	static int f_hb;
	static int f_ib;

	final int[][] method644(byte i) {
		try {
			int i_0_ = -40 % ((i + 11) / 56);
			anInt1350++;
			int[] is = new int[256];
			int i_1_ = 0;
			for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (this.aClass125Array1583.length
					^ 0xffffffff)); i_2_++) {
				int i_3_ = (((SomeClass) this.aClass125Array1583[i_2_]).anInt1829);
				if (i_3_ >= 0) {
					if (i_1_ < i_3_)
						i_1_ = i_3_;
					is[i_3_]++;
				}
			}
			int[][] is_4_ = new int[i_1_ + 1][];
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) >= (i_1_ ^ 0xffffffff); i_5_++) {
				is_4_[i_5_] = new int[is[i_5_]];
				is[i_5_] = 0;
			}
			for (int i_6_ = 0; ((this.aClass125Array1583.length ^ 0xffffffff) < (i_6_
					^ 0xffffffff)); i_6_++) {
				int i_7_ = (((SomeClass) this.aClass125Array1583[i_6_]).anInt1829);
				if (i_7_ >= 0)
					is_4_[i_7_][is[i_7_]++] = i_6_;
			}
			return is_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.A(" + i + ')');
		}
	}

	final void method645(short i, int i_8_, short i_9_) {
		try {
			anInt1372++;
			if (this.faceTextures != null) {
				for (int i_10_ = i_8_; this.faces > i_10_; i_10_++) {
					if (this.faceTextures[i_10_] == i_9_)
						this.faceTextures[i_10_] = i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.D(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	final void method646(int i, byte i_11_) {
		do {
			try {
				if (i_11_ < -33) {
					for (int i_12_ = 0; ((this.vertices ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
						this.verticesX[i_12_] <<= i;
						this.verticesY[i_12_] <<= i;
						this.verticesZ[i_12_] <<= i;
					}
					anInt1357++;
					if ((this.texture_faces ^ 0xffffffff) >= -1 || this.texTriangleX == null)
						break;
					for (int i_13_ = 0; ((i_13_ ^ 0xffffffff) > (this.texTriangleX.length
							^ 0xffffffff)); i_13_++) {
						this.texTriangleX[i_13_] <<= i;
						this.texTriangleY[i_13_] <<= i;
						if (this.textureRenderTypes[i_13_] != 1)
							this.texTriangleZ[i_13_] <<= i;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jq.Q(" + i + ',' + i_11_ + ')');
			}
			break;
		} while (false);
	}

	final int method647(int i, int i_14_, int i_15_, int i_16_) {
		try {
			anInt1342++;
			for (int i_17_ = i_16_; i_17_ < this.vertices; i_17_++) {
				if (((i_15_ ^ 0xffffffff) == (this.verticesX[i_17_] ^ 0xffffffff))
						&& ((i_14_ ^ 0xffffffff) == (this.verticesY[i_17_] ^ 0xffffffff))
						&& i == this.verticesZ[i_17_])
					return i_17_;
			}
			this.verticesX[this.vertices] = i_15_;
			this.verticesY[this.vertices] = i_14_;
			this.verticesZ[this.vertices] = i;
			this.anInt1573 = 1 + this.vertices;
			return this.vertices++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.R(" + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	final void method648(int i, int i_18_, int i_19_, int i_20_) {
		try {
			if (i_20_ > -3)
				method644((byte) -13);
			f_ib++;
			for (int i_21_ = 0; ((i_21_ ^ 0xffffffff) > (this.vertices ^ 0xffffffff)); i_21_++) {
				this.verticesX[i_21_] += i_18_;
				this.verticesY[i_21_] += i;
				this.verticesZ[i_21_] += i_19_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.M(" + i + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	final byte method649(byte i, short i_22_, byte i_23_, short i_24_, int i_25_, short i_26_, short i_27_, byte i_28_,
			short i_29_, short i_30_) {
		try {
			anInt1349++;
			if ((this.texture_faces ^ 0xffffffff) <= -256)
				throw new IllegalStateException();
			this.textureRenderTypes[this.texture_faces] = (byte) 3;
			this.texIndices1[this.texture_faces] = i_29_;
			this.texIndices2[this.texture_faces] = i_30_;
			if (i_25_ != 25543)
				method647(-122, -37, -54, -24);
			this.texIndices3[this.texture_faces] = i_24_;
			this.texTriangleX[this.texture_faces] = i_27_;
			this.texTriangleY[this.texture_faces] = i_26_;
			this.texTriangleZ[this.texture_faces] = i_22_;
			this.aByteArray1330[this.texture_faces] = i_23_;
			this.f_ab[this.texture_faces] = i_28_;
			this.f_fb[this.texture_faces] = i;
			return (byte) this.texture_faces++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.E(" + i + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ','
					+ i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ')'));
		}
	}

	private final int method650(Model class103_31_, int i, int i_32_, short i_33_) {
		anInt1352++;
		int i_34_ = ((Model) class103_31_).verticesX[i];
		int i_35_ = -37 / ((41 - i_32_) / 59);
		int i_36_ = ((Model) class103_31_).verticesY[i];
		int i_37_ = ((Model) class103_31_).verticesZ[i];
		for (int i_38_ = 0; ((i_38_ ^ 0xffffffff) > (this.vertices ^ 0xffffffff)); i_38_++) {
			if (((i_34_ ^ 0xffffffff) == (this.verticesX[i_38_] ^ 0xffffffff))
					&& ((i_36_ ^ 0xffffffff) == (this.verticesY[i_38_] ^ 0xffffffff))
					&& this.verticesZ[i_38_] == i_37_) {
				this.aShortArray1351[i_38_] = (short) Class236
						.method1523((this.aShortArray1351[i_38_]), i_33_);
				return i_38_;
			}
		}
		this.verticesX[this.vertices] = i_34_;
		this.verticesY[this.vertices] = i_36_;
		this.verticesZ[this.vertices] = i_37_;
		this.aShortArray1351[this.vertices] = i_33_;
		this.vertexSkins[this.vertices] = (((Model) class103_31_).vertexSkins != null
				? ((Model) class103_31_).vertexSkins[i]
				: -1);
		return this.vertices++;
	}

	static final void method651(int i) {
		try {
			f_hb++;
			if (i != -8282)
				method663((byte) 35, -27, 21);
			int i_39_ = Class246_Sub5.aByteArrayArray3885.length;
			for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (i_39_ ^ 0xffffffff); i_40_++) {
				if (Class246_Sub5.aByteArrayArray3885[i_40_] != null) {
					int i_41_ = -1;
					for (int i_42_ = 0; Class41.anInt618 > i_42_; i_42_++) {
						if (MapRegion.region_ids[i_40_] == Class102.anIntArray1324[i_42_]) {
							i_41_ = i_42_;
							break;
						}
					}
					if (i_41_ == -1) {
						Class102.anIntArray1324[Class41.anInt618] = MapRegion.region_ids[i_40_];
						i_41_ = Class41.anInt618++;
					}
					Buffer stream = new Buffer(Class246_Sub5.aByteArrayArray3885[i_40_]);
					int i_43_ = 0;
					while (((Buffer) stream).position < Class246_Sub5.aByteArrayArray3885[i_40_].length) {
						if ((i_43_ ^ 0xffffffff) <= -512 || (Class5.anInt55 ^ 0xffffffff) <= -1024)
							break;
						int i_44_ = i_41_ | i_43_++ << 6;
						int i_45_ = stream.readUnsignedShort();
						int i_46_ = i_45_ >> 14;
						int i_47_ = i_45_ >> 7 & 0x3f;
						int i_48_ = 0x3f & i_45_;
						int i_49_ = (-Client.base_x + 64 * (MapRegion.region_ids[i_40_] >> 8) + i_47_);
						int i_50_ = (64 * (MapRegion.region_ids[i_40_] & 0xff) + -Client.base_y - -i_48_);
						NpcType class253 = (Class179.aClass228_2518.list(stream.readUnsignedShort()));
						if (VarcLoader.aClass_r_Sub2Array1002[i_44_] == null
								&& (0x1 & ((NpcType) class253).aByte3609) > 0 && i_46_ == Class40_Sub6.anInt5103
								&& i_49_ >= 0 && (i_49_ + ((NpcType) class253).size < Class38_Sub1_Sub1.anInt6770)
								&& (i_50_ ^ 0xffffffff) <= -1
								&& (Class152.anInt2205 > ((NpcType) class253).size + i_50_)) {
							VarcLoader.aClass_r_Sub2Array1002[i_44_] = new Npc();
							((Entity) VarcLoader.aClass_r_Sub2Array1002[i_44_]).f_db = i_44_;
							Npc class_r_sub2 = VarcLoader.aClass_r_Sub2Array1002[i_44_];
							Class246_Sub28_Sub29.anIntArray6815[Class5.anInt55++] = i_44_;
							((Entity) class_r_sub2).anInt6418 = Client.cycle;
							class_r_sub2.method2934((byte) -121, class253);
							class_r_sub2.method2673((((NpcType) (((Npc) class_r_sub2).aClass253_7184)).size),
									(byte) -120);
							((Entity) class_r_sub2).f_cc = (((NpcType) (((Npc) class_r_sub2).aClass253_7184)).degreesToTurn << 3);
							if (((Entity) class_r_sub2).f_cc == 0)
								class_r_sub2.method2664(123, 0);
							else
								class_r_sub2.method2664(i + 8364,
										(4 + ((NpcType) (((Npc) class_r_sub2).aClass253_7184)).aByte3616
												& 0x5e600007) << 11);
							class_r_sub2.method2928(i_46_, -20437, i_49_, class_r_sub2.method2670((byte) 127), true,
									i_50_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.L(" + i + ')');
		}
	}

	final int[][] method652(boolean bool) {
		try {
			if (bool != true)
				return null;
			anInt1359++;
			int[] is = new int[256];
			int i = 0;
			for (int i_51_ = 0; ((this.faces ^ 0xffffffff) < (i_51_ ^ 0xffffffff)); i_51_++) {
				int i_52_ = this.faceSkins[i_51_];
				if ((i_52_ ^ 0xffffffff) <= -1) {
					if ((i_52_ ^ 0xffffffff) < (i ^ 0xffffffff))
						i = i_52_;
					is[i_52_]++;
				}
			}
			int[][] is_53_ = new int[1 + i][];
			for (int i_54_ = 0; (i_54_ ^ 0xffffffff) >= (i ^ 0xffffffff); i_54_++) {
				is_53_[i_54_] = new int[is[i_54_]];
				is[i_54_] = 0;
			}
			for (int i_55_ = 0; ((i_55_ ^ 0xffffffff) > (this.faces ^ 0xffffffff)); i_55_++) {
				int i_56_ = this.faceSkins[i_55_];
				if ((i_56_ ^ 0xffffffff) <= -1)
					is_53_[i_56_][is[i_56_]++] = i_55_;
			}
			return is_53_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.G(" + bool + ')');
		}
	}

	static final void method653(int i, int i_57_, int i_58_, Class var_class) {
		Tile class147 = Class106.tiles[i][i_57_][i_58_];
		if (class147 != null) {
			for (Class3 class3 = ((Tile) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
				Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
				if (var_class.isAssignableFrom(class59_sub3.getClass())
						&& ((Class59_Sub3) class59_sub3).aShort5057 == i_57_
						&& ((Class59_Sub3) class59_sub3).aShort5064 == i_58_) {
					Class246_Sub28_Sub14.method2636(class59_sub3);
					break;
				}
			}
		}
	}

	final int method654(int i, short i_59_, byte i_60_, int i_61_, int i_62_, int i_63_, short i_64_, byte i_65_,
			byte i_66_) {
		try {
			this.indices1[this.faces] = (short) i_61_;
			if (i_62_ > -118)
				return -82;
			anInt1355++;
			this.indices2[this.faces] = (short) i_63_;
			this.indices3[this.faces] = (short) i;
			this.faceRenderTypes[this.faces] = i_65_;
			this.textureCoords[this.faces] = i_60_;
			this.faceColors[this.faces] = i_64_;
			this.faceAlphas[this.faces] = i_66_;
			this.faceTextures[this.faces] = i_59_;
			return this.faces++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.T(" + i + ',' + i_59_ + ',' + i_60_ + ',' + i_61_ + ','
					+ i_62_ + ',' + i_63_ + ',' + i_64_ + ',' + i_65_ + ',' + i_66_ + ')'));
		}
	}

	static final int method655(boolean bool) {
		try {
			anInt1360++;
			if ((double) Class79.aFloat1036 == 3.0)
				return 37;
			if (bool != true)
				return 79;
			if ((double) Class79.aFloat1036 == 4.0)
				return 50;
			if ((double) Class79.aFloat1036 == 6.0)
				return 75;
			if ((double) Class79.aFloat1036 == 8.0)
				return 100;
			return 200;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.K(" + bool + ')');
		}
	}

	public static void method656(int i) {
		try {
			aClass13_1369 = null;
			if (i != 0)
				method655(false);
			f_gb = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.F(" + i + ')');
		}
	}

	final int[][] method657(byte i) {
		try {
			anInt1336++;
			int[] is = new int[256];
			int i_67_ = 0;
			int i_68_ = 0;
			int i_69_ = 69 / ((i + 4) / 42);
			for (/**/; ((this.anInt1573 ^ 0xffffffff) < (i_68_ ^ 0xffffffff)); i_68_++) {
				int i_70_ = this.vertexSkins[i_68_];
				if ((i_70_ ^ 0xffffffff) <= -1) {
					if (i_70_ > i_67_)
						i_67_ = i_70_;
					is[i_70_]++;
				}
			}
			int[][] is_71_ = new int[1 + i_67_][];
			for (int i_72_ = 0; (i_67_ ^ 0xffffffff) <= (i_72_ ^ 0xffffffff); i_72_++) {
				is_71_[i_72_] = new int[is[i_72_]];
				is[i_72_] = 0;
			}
			for (int i_73_ = 0; ((i_73_ ^ 0xffffffff) > (this.anInt1573 ^ 0xffffffff)); i_73_++) {
				int i_74_ = this.vertexSkins[i_73_];
				if (i_74_ >= 0)
					is_71_[i_74_][is[i_74_]++] = i_73_;
			}
			return is_71_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.P(" + i + ')');
		}
	}

	void decode_new(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var2.position = var1.length - 23;
		int var9 = var2.readUnsignedShort();
		int var10 = var2.readUnsignedShort();
		int var11 = var2.readUnsignedByte();
		int var12 = var2.readUnsignedByte();
		int var13 = var2.readUnsignedByte();
		int var14 = var2.readUnsignedByte();
		int var15 = var2.readUnsignedByte();
		int var16 = var2.readUnsignedByte();
		int var17 = var2.readUnsignedByte();
		int var18 = var2.readUnsignedShort();
		int var19 = var2.readUnsignedShort();
		int var20 = var2.readUnsignedShort();
		int var21 = var2.readUnsignedShort();
		int var22 = var2.readUnsignedShort();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.textureRenderTypes = new byte[var11];
			var2.position = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.textureRenderTypes[var26] = var2.readByte();
				if (var27 == 0) {
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) {
					++var24;
				}

				if (var27 == 2) {
					++var25;
				}
			}
		}

		var26 = var11 + var9;
		int var28 = var26;
		if (var12 == 1) {
			var26 += var10;
		}

		int var29 = var26;
		var26 += var10;
		int var30 = var26;
		if (var13 == 255) {
			var26 += var10;
		}

		int var31 = var26;
		if (var15 == 1) {
			var26 += var10;
		}

		int var32 = var26;
		if (var17 == 1) {
			var26 += var9;
		}

		int var33 = var26;
		if (var14 == 1) {
			var26 += var10;
		}

		int var34 = var26;
		var26 += var21;
		int var35 = var26;
		if (var16 == 1) {
			var26 += var10 * 2;
		}

		int var36 = var26;
		var26 += var22;
		int var37 = var26;
		var26 += var10 * 2;
		int var38 = var26;
		var26 += var18;
		int var39 = var26;
		var26 += var19;
		int var40 = var26;
		var26 += var20;
		int var41 = var26;
		var26 += var23 * 6;
		int var42 = var26;
		var26 += var24 * 6;
		int var43 = var26;
		var26 += var24 * 6;
		int var44 = var26;
		var26 += var24 * 2;
		int var45 = var26;
		var26 += var24;
		int var46 = var26;
		var26 += var24 * 2 + var25 * 2;
		this.vertices = var9;
		this.faces = var10;
		this.texture_faces = var11;
		this.verticesX = new int[var9];
		this.verticesY = new int[var9];
		this.verticesZ = new int[var9];
		this.indices1 = new int[var10];
		this.indices2 = new int[var10];
		this.indices3 = new int[var10];
		if (var17 == 1) {
			this.vertexSkins = new int[var9];
		}

		if (var12 == 1) {
			this.faceRenderTypes = new int[var10];
		}

		if (var13 == 255) {
			this.faceRenderPriorities = new byte[var10];
		} else {
			this.priority = (byte) var13;
		}

		if (var14 == 1) {
			this.faceAlphas = new int[var10];
		}

		if (var15 == 1) {
			this.faceSkins = new int[var10];
		}

		if (var16 == 1) {
			this.faceTextures = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.textureCoords = new byte[var10];
		}

		this.faceColors = new short[var10];
		if (var11 > 0) {
			this.texIndices1 = new short[var11];
			this.texIndices2 = new short[var11];
			this.texIndices3 = new short[var11];
		}

		var2.position = var11;
		var3.position = var38;
		var4.position = var39;
		var5.position = var40;
		var6.position = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.readUnsignedByte();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.readShortSmart();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.readShortSmart();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.readShortSmart();
			}

			this.verticesX[var51] = var48 + var53;
			this.verticesY[var51] = var49 + var54;
			this.verticesZ[var51] = var50 + var55;
			var48 = this.verticesX[var51];
			var49 = this.verticesY[var51];
			var50 = this.verticesZ[var51];
			if (var17 == 1) {
				this.vertexSkins[var51] = var6.readUnsignedByte();
			}
		}

		var2.position = var37;
		var3.position = var28;
		var4.position = var30;
		var5.position = var33;
		var6.position = var31;
		var7.position = var35;
		var8.position = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			this.faceColors[var51] = (short) var2.readUnsignedShort();
			if (var12 == 1) {
				this.faceRenderTypes[var51] = var3.readByte();
			}

			if (var13 == 255) {
				this.faceRenderPriorities[var51] = var4.readByte();
			}

			if (var14 == 1) {
				this.faceAlphas[var51] = var5.readByte();
			}

			if (var15 == 1) {
				this.faceSkins[var51] = var6.readUnsignedByte();
			}

			if (var16 == 1) {
				this.faceTextures[var51] = (short) (var7.readUnsignedShort() - 1);
			}

			if (this.textureCoords != null && this.faceTextures[var51] != -1) {
				this.textureCoords[var51] = (byte) (var8.readUnsignedByte() - 1);
			}
		}

		var2.position = var34;
		var3.position = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.readUnsignedByte();
			if (var56 == 1) {
				var51 = var2.readShortSmart() + var54;
				var52 = var2.readShortSmart() + var51;
				var53 = var2.readShortSmart() + var52;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var52;
				this.indices3[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.readShortSmart() + var54;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var52;
				this.indices3[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.readShortSmart() + var54;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var52;
				this.indices3[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.readShortSmart() + var54;
				var54 = var53;
				this.indices1[var55] = var51;
				this.indices2[var55] = var57;
				this.indices3[var55] = var53;
			}
		}

		var2.position = var41;
		var3.position = var42;
		var4.position = var43;
		var5.position = var44;
		var6.position = var45;
		var7.position = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.textureRenderTypes[var55] & 255;
			if (var56 == 0) {
				this.texIndices1[var55] = (short) var2.readUnsignedShort();
				this.texIndices2[var55] = (short) var2.readUnsignedShort();
				this.texIndices3[var55] = (short) var2.readUnsignedShort();
			}
		}

		var2.position = var26;
		var55 = var2.readUnsignedByte();
		if (var55 != 0) {
			// new ModelData0();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readInt();
		}

	}

	void decode_new_osrs(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var2.position = var1.length - 26;
		int vertices = var2.readUnsignedShort();
		int faces = var2.readUnsignedShort();
		int texture_faces = var2.readUnsignedByte();
		int var12 = var2.readUnsignedByte();
		int var13 = var2.readUnsignedByte();
		int var14 = var2.readUnsignedByte();
		int var15 = var2.readUnsignedByte();
		int var16 = var2.readUnsignedByte();
		int var17 = var2.readUnsignedByte();
		int var18 = var2.readUnsignedByte();
		int var19 = var2.readUnsignedShort();
		int var20 = var2.readUnsignedShort();
		int var21 = var2.readUnsignedShort();
		int var22 = var2.readUnsignedShort();
		int var23 = var2.readUnsignedShort();
		int var24 = var2.readUnsignedShort();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (texture_faces > 0) {
			this.textureRenderTypes = new byte[texture_faces];
			var2.position = 0;

			for (var28 = 0; var28 < texture_faces; ++var28) {
				byte var29 = this.textureRenderTypes[var28] = var2.readByte();
				if (var29 == 0) {
					++var25;
				}

				if (var29 >= 1 && var29 <= 3) {
					++var26;
				}

				if (var29 == 2) {
					++var27;
				}
			}
		}

		var28 = texture_faces + vertices;
		int var30 = var28;
		if (var12 == 1) {
			var28 += faces;
		}

		int var31 = var28;
		var28 += faces;
		int var32 = var28;
		if (var13 == 255) {
			var28 += faces;
		}

		int var33 = var28;
		if (var15 == 1) {
			var28 += faces;
		}

		int var34 = var28;
		var28 += var24;
		int var35 = var28;
		if (var14 == 1) {
			var28 += faces;
		}

		int var36 = var28;
		var28 += var22;
		int var37 = var28;
		if (var16 == 1) {
			var28 += faces * 2;
		}

		int var38 = var28;
		var28 += var23;
		int var39 = var28;
		var28 += faces * 2;
		int var40 = var28;
		var28 += var19;
		int var41 = var28;
		var28 += var20;
		int var42 = var28;
		var28 += var21;
		int var43 = var28;
		var28 += var25 * 6;
		int var44 = var28;
		var28 += var26 * 6;
		int var45 = var28;
		var28 += var26 * 6;
		int var46 = var28;
		var28 += var26 * 2;
		int var47 = var28;
		var28 += var26;
		int var48 = var28;
		var28 += var26 * 2 + var27 * 2;
		this.vertices = vertices;
		this.faces = faces;
		this.texture_faces = texture_faces;
		this.verticesX = new int[vertices];
		this.verticesY = new int[vertices];
		this.verticesZ = new int[vertices];
		this.indices1 = new int[faces];
		this.indices2 = new int[faces];
		this.indices3 = new int[faces];
		if (var17 == 1) {
			this.vertexSkins = new int[vertices];
		}

		if (var12 == 1) {
			this.faceRenderTypes = new int[faces];
		}

		if (var13 == 255) {
			this.faceRenderPriorities = new byte[faces];
		} else {
			this.priority = (byte) var13;
		}

		if (var14 == 1) {
			this.faceAlphas = new int[faces];
		}

		if (var15 == 1) {
			this.faceSkins = new int[faces];
		}

		if (var16 == 1) {
			this.faceTextures = new short[faces];
		}

		if (var16 == 1 && texture_faces > 0) {
			this.textureCoords = new byte[faces];
		}

		if (var18 == 1) {
			this.animayaGroups = new int[vertices][];
			this.animayaScales = new int[vertices][];
		}

		this.faceColors = new short[faces];
		if (texture_faces > 0) {
			this.texTriangleX = new int[texture_faces];
			this.texTriangleY = new int[texture_faces];
			this.texTriangleZ = new int[texture_faces];
		}

		var2.position = texture_faces;
		var3.position = var40;
		var4.position = var41;
		var5.position = var42;
		var6.position = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;

		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < vertices; ++var53) {
			var54 = var2.readUnsignedByte();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.readShortSmart();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.readShortSmart();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.readShortSmart();
			}

			this.verticesX[var53] = var50 + var55;
			this.verticesY[var53] = var51 + var56;
			this.verticesZ[var53] = var52 + var57;
			var50 = this.verticesX[var53];
			var51 = this.verticesY[var53];
			var52 = this.verticesZ[var53];
			if (var17 == 1) {
				this.vertexSkins[var53] = var6.readUnsignedByte();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < vertices; ++var53) {
				var54 = var6.readUnsignedByte();
				this.animayaGroups[var53] = new int[var54];
				this.animayaScales[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.animayaGroups[var53][var55] = var6.readUnsignedByte();
					this.animayaScales[var53][var55] = var6.readUnsignedByte();
				}
			}
		}

		var2.position = var39;
		var3.position = var30;
		var4.position = var32;
		var5.position = var35;
		var6.position = var33;
		var7.position = var37;
		var8.position = var38;

		for (var53 = 0; var53 < faces; ++var53) {
			this.faceColors[var53] = (short) var2.readUnsignedShort();
			if (var12 == 1) {
				this.faceRenderTypes[var53] = var3.readByte();
			}

			if (var13 == 255) {
				this.faceRenderPriorities[var53] = var4.readByte();
			}

			if (var14 == 1) {
				this.faceAlphas[var53] = var5.readByte();
			}

			if (var15 == 1) {
				this.faceSkins[var53] = var6.readUnsignedByte();
			}

			if (var16 == 1) {
				this.faceTextures[var53] = (short) (var7.readUnsignedShort() - 1);
			}

			if (this.textureCoords != null && this.faceTextures[var53] != -1) {
				this.textureCoords[var53] = (byte) (var8.readUnsignedByte() - 1);
			}
		}

		var2.position = var36;
		var3.position = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		for (var57 = 0; var57 < faces; ++var57) {
			var58 = var3.readUnsignedByte();
			if (var58 == 1) {
				var53 = var2.readShortSmart() + var56;
				var54 = var2.readShortSmart() + var53;
				var55 = var2.readShortSmart() + var54;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var54;
				this.indices3[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.readShortSmart() + var56;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var54;
				this.indices3[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.readShortSmart() + var56;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var54;
				this.indices3[var57] = var55;
			}

			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.readShortSmart() + var56;
				var56 = var55;
				this.indices1[var57] = var53;
				this.indices2[var57] = var59;
				this.indices3[var57] = var55;
			}
		}

		var2.position = var43;
		var3.position = var44;
		var4.position = var45;
		var5.position = var46;
		var6.position = var47;
		var7.position = var48;

		for (var57 = 0; var57 < texture_faces; ++var57) {
			var58 = this.textureRenderTypes[var57] & 255;
			if (var58 == 0) {
				this.texIndices1[var57] = (short) var2.readUnsignedShort();
				this.texIndices2[var57] = (short) var2.readUnsignedShort();
				this.texIndices3[var57] = (short) var2.readUnsignedShort();
			}
		}

		var2.position = var28;
		var57 = var2.readUnsignedByte();
		if (var57 != 0) {
			// new ModelData0();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readUnsignedShort();
			var2.readInt();
		}

	}

	private final void decodeType3(byte[] data) {
		try {
			anInt1339++;
			Buffer var2 = new Buffer(data);
			Buffer var3 = new Buffer(data);
			Buffer var4 = new Buffer(data);
			Buffer var5 = new Buffer(data);
			Buffer var6 = new Buffer(data);
			Buffer var7 = new Buffer(data);
			Buffer var8 = new Buffer(data);
			var2.position = data.length - 26;
			this.vertices = var2.readUnsignedShort();
			this.faces = var2.readUnsignedShort();
			this.texture_faces = var2.readUnsignedByte();
			int var12 = var2.readUnsignedByte();
			int var13 = var2.readUnsignedByte();
			int var14 = var2.readUnsignedByte();
			int var15 = var2.readUnsignedByte();
			int var16 = var2.readUnsignedByte();
			int var17 = var2.readUnsignedByte();
			int var18 = var2.readUnsignedByte();
			int var19 = var2.readUnsignedShort();
			int var20 = var2.readUnsignedShort();
			int var21 = var2.readUnsignedShort();
			int var22 = var2.readUnsignedShort();
			int var23 = var2.readUnsignedShort();
			int var24 = var2.readUnsignedShort();
			int var25 = 0;
			int var26 = 0;
			int var27 = 0;
			int var28;
			if (this.texture_faces > 0) {
				var2.position = 0;
				this.textureRenderTypes = new byte[this.texture_faces];
				for (var28 = 0; var28 < this.texture_faces; var28++) {
					byte var29 = (this.textureRenderTypes[var28] = var2.readByte());
					if (var29 == 2) {
						var27++;
					}
					if (var29 >= 1 && var29 <= 3) {
						var26++;
					}
					if (var29 == 0) {
						var25++;
					}
				}
			}
			var28 = this.texture_faces + this.vertices;
			int var30 = var28;
			if (var12 == 1) {
				var28 += faces;
			}

			int var31 = var28;
			var28 += faces;
			int var32 = var28;
			if (var13 == 255) {
				var28 += faces;
			}

			int var33 = var28;
			if (var15 == 1) {
				var28 += faces;
			}

			int var34 = var28;
			var28 += var24;
			int var35 = var28;
			if (var14 == 1) {
				var28 += faces;
			}

			int var36 = var28;
			var28 += var22;
			int var37 = var28;
			if (var16 == 1) {
				var28 += faces * 2;
			}

			int var38 = var28;
			var28 += var23;
			int var39 = var28;
			var28 += faces * 2;
			int var40 = var28;
			var28 += var19;
			int var41 = var28;
			var28 += var20;
			int var42 = var28;
			var28 += var21;
			int var43 = var28;
			var28 += var25 * 6;
			int var44 = var28;
			var28 += var26 * 6;
			int var45 = var28;
			var28 += var26 * 6;
			int var46 = var28;
			var28 += var26 * 2;
			int var47 = var28;
			var28 += var26;
			int var48 = var28;
			var28 += var26 * 2 + var27 * 2;
			this.indices1 = new int[this.faces];
			this.indices2 = new int[this.faces];
			this.indices3 = new int[this.faces];
			if (var13 == 255)
				this.faceRenderPriorities = new byte[this.faces];
			else
				this.priority = (byte) var13;
			if (var15 == 1)
				this.faceSkins = new int[this.faces];
			this.verticesY = new int[this.vertices];
			this.faceColors = new short[this.faces];
			if (var16 == 1)
				this.faceTextures = new short[this.faces];
			if (var12 == 1)
				this.faceRenderTypes = new int[this.faces];
			if (var17 == 1) {
				this.vertexSkins = new int[this.vertices];
			}
			this.verticesX = new int[this.vertices];
			if (var14 == 1)
				this.faceAlphas = new int[this.faces];
			if (var18 == 1) {
				this.animayaGroups = new int[vertices][];
				this.animayaScales = new int[vertices][];
			}
			if (this.texture_faces > 0) {
				this.texIndices2 = new short[this.texture_faces];
				if (var26 > 0) {
					this.texTriangleX = new int[var26];
					this.f_ab = new byte[var26];
					this.aByteArray1330 = new byte[var26];
					this.texTriangleZ = new int[var26];
					this.texTriangleY = new int[var26];
					this.f_fb = new int[var26];
				}
				if (var27 > 0) {
					this.anIntArray1335 = new int[var27];
					this.anIntArray1366 = new int[var27];
				}
				this.texIndices1 = new short[this.texture_faces];
				this.texIndices3 = new short[this.texture_faces];
				this.texTriangleX = new int[this.texture_faces];
				this.texTriangleY = new int[this.texture_faces];
				this.texTriangleZ = new int[this.texture_faces];
			}
			if (var16 == 1 && this.texture_faces > 0) {
				this.textureCoords = new byte[this.faces];
			}
			var2.position = this.texture_faces;
			this.verticesZ = new int[this.vertices];
			((Buffer) var3).position = var40;
			var4.position = var41;
			((Buffer) var5).position = var42;
			((Buffer) var6).position = var34;
			int i_123_ = 0;
			int i_124_ = 0;
			int i_125_ = 0;
			for (int i_126_ = 0; i_126_ < this.vertices; i_126_++) {
				int i_127_ = var2.readUnsignedByte();
				int i_128_ = 0;
				if ((i_127_ & 0x1) != 0) {
					i_128_ = var3.readShortSmart();
				}
				int i_129_ = 0;
				if ((i_127_ & 0x2) != 0) {
					i_129_ = var4.readShortSmart();
				}
				int i_130_ = 0;
				if ((i_127_ & 0x4) != 0) {
					i_130_ = var5.readShortSmart();
				}
				this.verticesX[i_126_] = i_128_ + i_123_;
				this.verticesY[i_126_] = i_129_ + i_124_;
				this.verticesZ[i_126_] = i_125_ + i_130_;
				i_123_ = this.verticesX[i_126_];
				i_124_ = this.verticesY[i_126_];
				i_125_ = this.verticesZ[i_126_];
				if (var17 == 1) {
					this.vertexSkins[i_126_] = var6.readUnsignedByte();
				}
			}
			if (var18 == 1) {
				for (int temp2 = 0; temp2 < vertices; ++temp2) {
					int temp3 = var6.readUnsignedByte();
					this.animayaGroups[temp2] = new int[temp3];
					this.animayaScales[temp2] = new int[temp3];
					for (int temp4 = 0; temp4 < temp3; ++temp4) {
						this.animayaGroups[temp2][temp4] = var6.readUnsignedByte();
						this.animayaScales[temp2][temp4] = var6.readUnsignedByte();
					}
				}
			}
			var2.position = var39;
			((Buffer) var3).position = var30;
			var4.position = var32;
			((Buffer) var5).position = var35;
			((Buffer) var6).position = var33;
			((Buffer) var7).position = var37;
			((Buffer) var8).position = var38;
			for (int var53 = 0; var53 < this.faces; var53++) {
				this.faceColors[var53] = (short) var2.readUnsignedShort();
				if (var12 == 1) {
					this.faceRenderTypes[var53] = var3.readByte();
				}
				if (var13 == 255) {
					this.faceRenderPriorities[var53] = var4.readByte();
				}
				if (var14 == 1) {
					this.faceAlphas[var53] = var5.readByte();
				}
				if (var15 == 1) {
					this.faceSkins[var53] = var6.readUnsignedByte();
				}
				if (var16 == 1) {
					this.faceTextures[var53] = (short) (var7.readUnsignedShort() - 1);
				}
				if (this.textureCoords != null && this.faceTextures[var53] != -1) {
					this.textureCoords[var53] = (byte) (var8.readUnsignedByte() - 1);
				}
			}
			this.anInt1573 = -1;
			var2.position = var36;
			((Buffer) var3).position = var31;
			short i_132_ = 0;
			short i_133_ = 0;
			short i_134_ = 0;
			int i_135_ = 0;
			for (int i_136_ = 0; i_136_ < this.faces; i_136_++) {
				int i_137_ = var3.readUnsignedByte();
				if (i_137_ == 1) {
					i_132_ = (short) (i_135_ + var2.readShortSmart());
					i_135_ = i_132_;
					i_133_ = (short) (var2.readShortSmart() + i_135_);
					i_135_ = i_133_;
					i_134_ = (short) (var2.readShortSmart() + i_135_);
					this.indices1[i_136_] = i_132_;
					i_135_ = i_134_;
					this.indices2[i_136_] = i_133_;
					this.indices3[i_136_] = i_134_;
					if (this.anInt1573 < i_132_) {
						this.anInt1573 = i_132_;
					}
					if (this.anInt1573 < i_133_)
						this.anInt1573 = i_133_;
					if (i_134_ > this.anInt1573)
						this.anInt1573 = i_134_;
				}
				if (i_137_ == 2) {
					i_133_ = i_134_;
					i_134_ = (short) (i_135_ + var2.readShortSmart());
					this.indices1[i_136_] = i_132_;
					i_135_ = i_134_;
					this.indices2[i_136_] = i_133_;
					this.indices3[i_136_] = i_134_;
					if (this.anInt1573 < i_134_) {
						this.anInt1573 = i_134_;
					}
				}
				if (i_137_ == 3) {
					i_132_ = i_134_;
					i_134_ = (short) (var2.readShortSmart() + i_135_);
					i_135_ = i_134_;
					this.indices1[i_136_] = i_132_;
					this.indices2[i_136_] = i_133_;
					this.indices3[i_136_] = i_134_;
					if (this.anInt1573 < i_134_) {
						this.anInt1573 = i_134_;
					}
				}
				if (i_137_ == 4) {
					short i_138_ = i_132_;
					i_132_ = i_133_;
					i_133_ = i_138_;
					i_134_ = (short) (i_135_ + var2.readShortSmart());
					i_135_ = i_134_;
					this.indices1[i_136_] = i_132_;
					this.indices2[i_136_] = i_133_;
					this.indices3[i_136_] = i_134_;
					if (i_134_ > this.anInt1573)
						this.anInt1573 = i_134_;
				}
			}
			var2.position = var43;
			this.anInt1573++;
			((Buffer) var3).position = var44;
			var4.position = var45;
			((Buffer) var5).position = var46;
			((Buffer) var6).position = var47;
			((Buffer) var7).position = var48;
			for (int i_139_ = 0; i_139_ < this.texture_faces; i_139_++) {
				int i_140_ = 0xff & this.textureRenderTypes[i_139_];
				if (i_140_ == 0) {
					this.texIndices1[i_139_] = (short) var2.readUnsignedShort();
					this.texIndices2[i_139_] = (short) var2.readUnsignedShort();
					this.texIndices3[i_139_] = (short) var2.readUnsignedShort();
				}
				if (i_140_ == 1) {
					this.texIndices1[i_139_] = (short) var3.readUnsignedShort();
					this.texIndices2[i_139_] = (short) var3.readUnsignedShort();
					this.texIndices3[i_139_] = (short) var3.readUnsignedShort();
					this.texTriangleX[i_139_] = var4.readUnsignedShort();
					if ((this.anInt1358 ^ 0xffffffff) > -15)
						this.texTriangleY[i_139_] = var4.readUnsignedShort();
					else
						this.texTriangleY[i_139_] = var4.read24BitInteger((byte) 29);
					this.texTriangleZ[i_139_] = var4.readUnsignedShort();
					this.aByteArray1330[i_139_] = var5.readByte();
					this.f_ab[i_139_] = var6.readByte();
					this.f_fb[i_139_] = var7.readByte();
				}
				if (i_140_ == 2) {
					this.texIndices1[i_139_] = (short) var3.readUnsignedShort();
					this.texIndices2[i_139_] = (short) var3.readUnsignedShort();
					this.texIndices3[i_139_] = (short) var3.readUnsignedShort();
					this.texTriangleX[i_139_] = var4.readUnsignedShort();
					if (this.anInt1358 < 14)
						this.texTriangleY[i_139_] = var4.readUnsignedShort();
					else
						this.texTriangleY[i_139_] = var4.read24BitInteger((byte) 29);
					this.texTriangleZ[i_139_] = var4.readUnsignedShort();
					this.aByteArray1330[i_139_] = var5.readByte();
					this.f_ab[i_139_] = var6.readByte();
					this.f_fb[i_139_] = var7.readByte();
					this.anIntArray1335[i_139_] = var7.readByte();
					this.anIntArray1366[i_139_] = var7.readByte();
				}
				if (i_140_ == 3) {
					this.texIndices1[i_139_] = (short) var3.readUnsignedShort();
					this.texIndices2[i_139_] = (short) var3.readUnsignedShort();
					this.texIndices3[i_139_] = (short) var3.readUnsignedShort();
					this.texTriangleX[i_139_] = var4.readUnsignedShort();
					if ((this.anInt1358 ^ 0xffffffff) > -15)
						this.texTriangleY[i_139_] = var4.readUnsignedShort();
					else
						this.texTriangleY[i_139_] = var4.read24BitInteger((byte) 29);
					this.texTriangleZ[i_139_] = var4.readUnsignedShort();
					this.aByteArray1330[i_139_] = var5.readByte();
					this.f_ab[i_139_] = var6.readByte();
					this.f_fb[i_139_] = var7.readByte();
				}
				if (i_140_ == 4) {
					/*
					 * int var59 = var53;
					 * var53 = var54;
					 * var54 = var59;
					 * var55 = var2.readShortSmart() + var56;
					 * var56 = var55;
					 * this.indices1[var57] = var53;
					 * this.indices2[var57] = var59;
					 * this.indices3[var57] = var55;
					 */
					var2.readShortSmart();
				}
			}
			for (int var57 = 0; var57 < texture_faces; ++var57) {
				int var58 = this.textureRenderTypes[var57] & 255;
				if (var58 == 0) {
					this.texTriangleX[var57] = (short) var2.readUnsignedShort();
					this.texTriangleY[var57] = (short) var2.readUnsignedShort();
					this.texTriangleZ[var57] = (short) var2.readUnsignedShort();
				}
			}
			var2.position = var28;
			/*
			 * if (bool_82_) {
			 * int i_141_ = var2.readUnsignedByte();
			 * if ((i_141_ ^ 0xffffffff) < -1) {
			 * this.aClass19Array1364 = new Class19[i_141_];
			 * for (int i_142_ = 0; i_141_ > i_142_; i_142_++) {
			 * int i_143_ = var2.readUnsignedShort();
			 * int i_144_ = var2.readUnsignedShort();
			 * byte i_145_;
			 * if ((var13 ^ 0xffffffff) != -256)
			 * i_145_ = (byte) var13;
			 * else
			 * i_145_ = (this.faceRenderPriorities[i_144_]);
			 * this.aClass19Array1364[i_142_] = new Class19(i_143_,
			 * (this.indices1[i_144_]),
			 * (this.indices2[i_144_]),
			 * (this.indices3[i_144_]), i_145_);
			 * }
			 * }
			 * int i_146_ = var2.readUnsignedByte();
			 * if (i_146_ > 0) {
			 * this.aClass303Array1547 = new Class303[i_146_];
			 * for (int i_147_ = 0; i_147_ < i_146_; i_147_++) {
			 * int i_148_ = var2.readUnsignedShort();
			 * int i_149_ = var2.readUnsignedShort();
			 * this.aClass303Array1547[i_147_] = new Class303(i_148_, i_149_);
			 * }
			 * }
			 * }
			 * if (!bool_83_)
			 * break;
			 * int i_150_ = var2.readUnsignedByte();
			 * if ((i_150_ ^ 0xffffffff) >= -1)
			 * break;
			 * this.aClass125Array1583 = new SomeClass[i_150_];
			 * for (int i_151_ = 0; (i_151_ ^ 0xffffffff) > (i_150_ ^ 0xffffffff); i_151_++)
			 * {
			 * int i_152_ = var2.readUnsignedShort();
			 * int i_153_ = var2.readUnsignedShort();
			 * int i_154_ = var2.readUnsignedByte();
			 * byte i_155_ = var2.readByte();
			 * this.aClass125Array1583[i_151_] = new SomeClass(i_152_, i_153_, i_154_,
			 * i_155_);
			 * }
			 */
			int var57 = var2.readUnsignedByte();
			if (var57 != 0) {
				// new ModelData0();
				var2.readUnsignedShort();
				var2.readUnsignedShort();
				var2.readUnsignedShort();
				var2.readInt();
			}
		} catch (Exception runtimeexception) {
			runtimeexception.printStackTrace();
		}
	}

	private final void decode_new2(byte[] is) {
		do {
			try {
				anInt1339++;
				Buffer stream = new Buffer(is);
				Buffer stream_75_ = new Buffer(is);
				Buffer stream_76_ = new Buffer(is);
				Buffer stream_77_ = new Buffer(is);
				Buffer stream_78_ = new Buffer(is);
				Buffer stream_79_ = new Buffer(is);
				Buffer stream_80_ = new Buffer(is);
				((Buffer) stream).position = -23 + is.length;
				this.vertices = stream.readUnsignedShort();
				this.faces = stream.readUnsignedShort();
				this.texture_faces = stream.readUnsignedByte();
				int i_81_ = stream.readUnsignedByte();
				boolean bool = (i_81_ & 0x1 ^ 0xffffffff) == -2;
				boolean bool_82_ = (i_81_ & 0x2) == 2;
				boolean bool_83_ = (0x4 & i_81_) == 4;
				boolean bool_84_ = (0x8 & i_81_) == 8;
				if (bool_84_) {
					((Buffer) stream).position -= 7;
					this.anInt1358 = stream.readUnsignedByte();
					((Buffer) stream).position += 6;
				}
				int i_85_ = stream.readUnsignedByte();
				int i_86_ = stream.readUnsignedByte();
				int i_87_ = stream.readUnsignedByte();
				int i_88_ = stream.readUnsignedByte();
				int i_89_ = stream.readUnsignedByte();
				int i_90_ = stream.readUnsignedShort();
				int i_91_ = stream.readUnsignedShort();
				int i_92_ = stream.readUnsignedShort();
				int i_93_ = stream.readUnsignedShort();
				int i_94_ = stream.readUnsignedShort();
				int i_95_ = 0;
				int i_96_ = 0;
				int i_97_ = 0;
				if (this.texture_faces > 0) {
					((Buffer) stream).position = 0;
					this.textureRenderTypes = new byte[this.texture_faces];
					for (int i_98_ = 0; i_98_ < this.texture_faces; i_98_++) {
						byte i_99_ = (this.textureRenderTypes[i_98_] = stream.readByte());
						if ((i_99_ ^ 0xffffffff) == -3)
							i_97_++;
						if ((i_99_ ^ 0xffffffff) <= -2 && (i_99_ ^ 0xffffffff) >= -4)
							i_96_++;
						if (i_99_ == 0)
							i_95_++;
					}
				}
				int i_100_ = this.texture_faces;
				int i_101_ = i_100_;
				i_100_ += this.vertices;
				int i_102_ = i_100_;
				if (bool)
					i_100_ += this.faces;
				int i_103_ = i_100_;
				i_100_ += this.faces;
				int i_104_ = i_100_;
				if (i_85_ == 255)
					i_100_ += this.faces;
				int i_105_ = i_100_;
				if (i_87_ == 1)
					i_100_ += this.faces;
				int i_106_ = i_100_;
				if ((i_89_ ^ 0xffffffff) == -2)
					i_100_ += this.vertices;
				int i_107_ = i_100_;
				if ((i_86_ ^ 0xffffffff) == -2)
					i_100_ += this.faces;
				int i_108_ = i_100_;
				i_100_ += i_93_;
				int i_109_ = i_100_;
				if ((i_88_ ^ 0xffffffff) == -2)
					i_100_ += this.faces * 2;
				int i_110_ = i_100_;
				i_100_ += i_94_;
				int i_111_ = i_100_;
				i_100_ += this.faces * 2;
				int i_112_ = i_100_;
				i_100_ += i_90_;
				int i_113_ = i_100_;
				i_100_ += i_91_;
				int i_114_ = i_100_;
				i_100_ += i_92_;
				int i_115_ = i_100_;
				i_100_ += 6 * i_95_;
				int i_116_ = i_100_;
				i_100_ += 6 * i_96_;
				if (true) {
					int i_117_ = this.anInt1358 < 14 ? 6 : 7;
					int i_118_ = i_100_;
					i_100_ += i_96_ * i_117_;
					int i_119_ = i_100_;
					i_100_ += i_96_;
					int i_120_ = i_100_;
					i_100_ += i_96_;
					int i_121_ = i_100_;
					i_100_ += i_96_ + 2 * i_97_;
					int i_122_ = i_100_;
					this.indices1 = new int[this.faces];
					this.indices2 = new int[this.faces];
					this.indices3 = new int[this.faces];
					if (i_85_ == 255)
						this.faceRenderPriorities = new byte[this.faces];
					else
						this.priority = (byte) i_85_;
					if (i_87_ == 1)
						this.faceSkins = new int[this.faces];
					this.verticesY = new int[this.vertices];
					this.faceColors = new short[this.faces];
					if (i_88_ == 1)
						this.faceTextures = new short[this.faces];
					if (bool)
						this.faceRenderTypes = new int[this.faces];
					if ((i_89_ ^ 0xffffffff) == -2)
						this.vertexSkins = new int[this.vertices];
					this.verticesX = new int[this.vertices];
					if (i_86_ == 1)
						this.faceAlphas = new int[this.faces];
					if (this.texture_faces > 0) {
						this.texIndices2 = new short[this.texture_faces];
						if (i_96_ > 0) {
							this.texTriangleX = new int[i_96_];
							this.f_ab = new byte[i_96_];
							this.aByteArray1330 = new byte[i_96_];
							this.texTriangleZ = new int[i_96_];
							this.texTriangleY = new int[i_96_];
							this.f_fb = new int[i_96_];
						}
						if (i_97_ > 0) {
							this.anIntArray1335 = new int[i_97_];
							this.anIntArray1366 = new int[i_97_];
						}
						this.texIndices1 = new short[this.texture_faces];
						this.texIndices3 = new short[this.texture_faces];
					}
					if ((i_88_ ^ 0xffffffff) == -2 && (this.texture_faces ^ 0xffffffff) < -1)
						this.textureCoords = new byte[this.faces];
					((Buffer) stream).position = i_101_;
					this.verticesZ = new int[this.vertices];
					((Buffer) stream_75_).position = i_112_;
					((Buffer) stream_76_).position = i_113_;
					((Buffer) stream_77_).position = i_114_;
					((Buffer) stream_78_).position = i_106_;
					int i_123_ = 0;
					int i_124_ = 0;
					int i_125_ = 0;
					for (int i_126_ = 0; ((i_126_ ^ 0xffffffff) > (this.vertices ^ 0xffffffff)); i_126_++) {
						int i_127_ = stream.readUnsignedByte();
						int i_128_ = 0;
						if ((i_127_ & 0x1 ^ 0xffffffff) != -1)
							i_128_ = stream_75_.readSmart();
						int i_129_ = 0;
						if ((0x2 & i_127_) != 0)
							i_129_ = stream_76_.readSmart();
						int i_130_ = 0;
						if ((i_127_ & 0x4) != 0)
							i_130_ = stream_77_.readSmart();
						this.verticesX[i_126_] = i_128_ + i_123_;
						this.verticesY[i_126_] = i_129_ + i_124_;
						this.verticesZ[i_126_] = i_125_ - -i_130_;
						i_123_ = this.verticesX[i_126_];
						i_124_ = this.verticesY[i_126_];
						i_125_ = this.verticesZ[i_126_];
						if (i_89_ == 1)
							this.vertexSkins[i_126_] = stream_78_.readUnsignedByte();
					}
					((Buffer) stream).position = i_111_;
					((Buffer) stream_75_).position = i_102_;
					((Buffer) stream_76_).position = i_104_;
					((Buffer) stream_77_).position = i_107_;
					((Buffer) stream_78_).position = i_105_;
					((Buffer) stream_79_).position = i_109_;
					((Buffer) stream_80_).position = i_110_;
					for (int i_131_ = 0; ((i_131_ ^ 0xffffffff) > (this.faces ^ 0xffffffff)); i_131_++) {
						this.faceColors[i_131_] = (short) stream.readUnsignedShort();
						if (bool)
							this.faceRenderTypes[i_131_] = stream_75_.readByte();
						if ((i_85_ ^ 0xffffffff) == -256)
							this.faceRenderPriorities[i_131_] = stream_76_.readByte();
						if (i_86_ == 1)
							this.faceAlphas[i_131_] = stream_77_.readByte();
						if (i_87_ == 1)
							this.faceSkins[i_131_] = stream_78_.readUnsignedByte();
						if (i_88_ == 1)
							this.faceTextures[i_131_] = (short) (stream_79_.readUnsignedShort() - 1);
						if (this.textureCoords != null) {
							if ((this.faceTextures[i_131_] ^ 0xffffffff) == 0)
								this.textureCoords[i_131_] = (byte) -1;
							else
								this.textureCoords[i_131_] = (byte) (stream_80_.readUnsignedByte() - 1);
						}
					}
					this.anInt1573 = -1;
					((Buffer) stream).position = i_108_;
					((Buffer) stream_75_).position = i_103_;
					short i_132_ = 0;
					short i_133_ = 0;
					short i_134_ = 0;
					int i_135_ = 0;
					for (int i_136_ = 0; i_136_ < this.faces; i_136_++) {
						int i_137_ = stream_75_.readUnsignedByte();
						if (i_137_ == 1) {
							i_132_ = (short) (i_135_ + stream.readSmart());
							i_135_ = i_132_;
							i_133_ = (short) (stream.readSmart() + i_135_);
							i_135_ = i_133_;
							i_134_ = (short) (stream.readSmart() + i_135_);
							this.indices1[i_136_] = i_132_;
							i_135_ = i_134_;
							this.indices2[i_136_] = i_133_;
							this.indices3[i_136_] = i_134_;
							if ((this.anInt1573 ^ 0xffffffff) > (i_132_ ^ 0xffffffff))
								this.anInt1573 = i_132_;
							if (this.anInt1573 < i_133_)
								this.anInt1573 = i_133_;
							if (i_134_ > this.anInt1573)
								this.anInt1573 = i_134_;
						}
						if (i_137_ == 2) {
							i_133_ = i_134_;
							i_134_ = (short) (i_135_ + stream.readSmart());
							this.indices1[i_136_] = i_132_;
							i_135_ = i_134_;
							this.indices2[i_136_] = i_133_;
							this.indices3[i_136_] = i_134_;
							if ((this.anInt1573 ^ 0xffffffff) > (i_134_ ^ 0xffffffff))
								this.anInt1573 = i_134_;
						}
						if (i_137_ == 3) {
							i_132_ = i_134_;
							i_134_ = (short) (stream.readSmart() + i_135_);
							i_135_ = i_134_;
							this.indices1[i_136_] = i_132_;
							this.indices2[i_136_] = i_133_;
							this.indices3[i_136_] = i_134_;
							if ((this.anInt1573 ^ 0xffffffff) > (i_134_ ^ 0xffffffff))
								this.anInt1573 = i_134_;
						}
						if (i_137_ == 4) {
							short i_138_ = i_132_;
							i_132_ = i_133_;
							i_133_ = i_138_;
							i_134_ = (short) (i_135_ + stream.readSmart());
							i_135_ = i_134_;
							this.indices1[i_136_] = i_132_;
							this.indices2[i_136_] = i_133_;
							this.indices3[i_136_] = i_134_;
							if (i_134_ > this.anInt1573)
								this.anInt1573 = i_134_;
						}
					}
					((Buffer) stream).position = i_115_;
					this.anInt1573++;
					((Buffer) stream_75_).position = i_116_;
					((Buffer) stream_76_).position = i_118_;
					((Buffer) stream_77_).position = i_119_;
					((Buffer) stream_78_).position = i_120_;
					((Buffer) stream_79_).position = i_121_;
					for (int i_139_ = 0; i_139_ < this.texture_faces; i_139_++) {
						int i_140_ = 0xff & this.textureRenderTypes[i_139_];
						if (i_140_ == 0) {
							this.texIndices1[i_139_] = (short) stream.readUnsignedShort();
							this.texIndices2[i_139_] = (short) stream.readUnsignedShort();
							this.texIndices3[i_139_] = (short) stream.readUnsignedShort();
						}
						if (i_140_ == 1) {
							this.texIndices1[i_139_] = (short) stream_75_.readUnsignedShort();
							this.texIndices2[i_139_] = (short) stream_75_.readUnsignedShort();
							this.texIndices3[i_139_] = (short) stream_75_.readUnsignedShort();
							this.texTriangleX[i_139_] = stream_76_.readUnsignedShort();
							if ((this.anInt1358 ^ 0xffffffff) > -15)
								this.texTriangleY[i_139_] = stream_76_.readUnsignedShort();
							else
								this.texTriangleY[i_139_] = stream_76_.read24BitInteger((byte) 29);
							this.texTriangleZ[i_139_] = stream_76_.readUnsignedShort();
							this.aByteArray1330[i_139_] = stream_77_.readByte();
							this.f_ab[i_139_] = stream_78_.readByte();
							this.f_fb[i_139_] = stream_79_.readByte();
						}
						if (i_140_ == 2) {
							this.texIndices1[i_139_] = (short) stream_75_.readUnsignedShort();
							this.texIndices2[i_139_] = (short) stream_75_.readUnsignedShort();
							this.texIndices3[i_139_] = (short) stream_75_.readUnsignedShort();
							this.texTriangleX[i_139_] = stream_76_.readUnsignedShort();
							if (this.anInt1358 < 14)
								this.texTriangleY[i_139_] = stream_76_.readUnsignedShort();
							else
								this.texTriangleY[i_139_] = stream_76_.read24BitInteger((byte) 29);
							this.texTriangleZ[i_139_] = stream_76_.readUnsignedShort();
							this.aByteArray1330[i_139_] = stream_77_.readByte();
							this.f_ab[i_139_] = stream_78_.readByte();
							this.f_fb[i_139_] = stream_79_.readByte();
							this.anIntArray1335[i_139_] = stream_79_.readByte();
							this.anIntArray1366[i_139_] = stream_79_.readByte();
						}
						if (i_140_ == 3) {
							this.texIndices1[i_139_] = (short) stream_75_.readUnsignedShort();
							this.texIndices2[i_139_] = (short) stream_75_.readUnsignedShort();
							this.texIndices3[i_139_] = (short) stream_75_.readUnsignedShort();
							this.texTriangleX[i_139_] = stream_76_.readUnsignedShort();
							if ((this.anInt1358 ^ 0xffffffff) > -15)
								this.texTriangleY[i_139_] = stream_76_.readUnsignedShort();
							else
								this.texTriangleY[i_139_] = stream_76_.read24BitInteger((byte) 29);
							this.texTriangleZ[i_139_] = stream_76_.readUnsignedShort();
							this.aByteArray1330[i_139_] = stream_77_.readByte();
							this.f_ab[i_139_] = stream_78_.readByte();
							this.f_fb[i_139_] = stream_79_.readByte();
						}
					}
					((Buffer) stream).position = i_122_;
					if (bool_82_) {
						int i_141_ = stream.readUnsignedByte();
						if ((i_141_ ^ 0xffffffff) < -1) {
							this.aClass19Array1364 = new Class19[i_141_];
							for (int i_142_ = 0; i_141_ > i_142_; i_142_++) {
								int i_143_ = stream.readUnsignedShort();
								int i_144_ = stream.readUnsignedShort();
								byte i_145_;
								if ((i_85_ ^ 0xffffffff) != -256)
									i_145_ = (byte) i_85_;
								else
									i_145_ = (this.faceRenderPriorities[i_144_]);
								this.aClass19Array1364[i_142_] = new Class19(i_143_,
										(this.indices1[i_144_]),
										(this.indices2[i_144_]),
										(this.indices3[i_144_]), i_145_);
							}
						}
						int i_146_ = stream.readUnsignedByte();
						if (i_146_ > 0) {
							this.aClass303Array1547 = new Class303[i_146_];
							for (int i_147_ = 0; i_147_ < i_146_; i_147_++) {
								int i_148_ = stream.readUnsignedShort();
								int i_149_ = stream.readUnsignedShort();
								this.aClass303Array1547[i_147_] = new Class303(i_148_, i_149_);
							}
						}
					}
					if (!bool_83_)
						break;
					int i_150_ = stream.readUnsignedByte();
					if ((i_150_ ^ 0xffffffff) >= -1)
						break;
					this.aClass125Array1583 = new SomeClass[i_150_];
					for (int i_151_ = 0; (i_151_ ^ 0xffffffff) > (i_150_ ^ 0xffffffff); i_151_++) {
						int i_152_ = stream.readUnsignedShort();
						int i_153_ = stream.readUnsignedShort();
						int i_154_ = stream.readUnsignedByte();
						byte i_155_ = stream.readByte();
						this.aClass125Array1583[i_151_] = new SomeClass(i_152_, i_153_, i_154_, i_155_);
					}
				}
			} catch (Exception runtimeexception) {
				runtimeexception.printStackTrace();
			}
			break;
		} while (false);
	}

	static final void method659(long l, byte i) {
		try {
			if (i != 1)
				method651(32);
			anInt1356++;
			int i_156_ = Class242.anInt3424;
			int i_157_ = Class246_Sub43.anInt5606;
			if ((Class_c_Sub1.anInt5366 ^ 0xffffffff) != (i_156_ ^ 0xffffffff)) {
				int i_158_ = i_156_ + -Class_c_Sub1.anInt5366;
				int i_159_ = (int) ((long) i_158_ * l / 320L);
				if (i_158_ > 0) {
					if (i_159_ != 0) {
						if (i_158_ < i_159_)
							i_159_ = i_158_;
					} else
						i_159_ = 1;
				} else if (i_159_ != 0) {
					if (i_158_ > i_159_)
						i_159_ = i_158_;
				} else
					i_159_ = -1;
				Class_c_Sub1.anInt5366 += i_159_;
			}
			if (Class246_Sub34.anInt5135 != i_157_) {
				int i_160_ = i_157_ - Class246_Sub34.anInt5135;
				int i_161_ = (int) ((long) i_160_ * l / 320L);
				if ((i_160_ ^ 0xffffffff) >= -1) {
					if ((i_161_ ^ 0xffffffff) != -1) {
						if (i_160_ > i_161_)
							i_161_ = i_160_;
					} else
						i_161_ = -1;
				} else if ((i_161_ ^ 0xffffffff) == -1)
					i_161_ = 1;
				else if ((i_160_ ^ 0xffffffff) > (i_161_ ^ 0xffffffff))
					i_161_ = i_160_;
				Class246_Sub34.anInt5135 += i_161_;
			}
			if (!((Renderer) Client.current_renderer).aBool605) {
				Camera.camera_yaw += (Class259_Sub2_Sub1.aFloat6906 * (float) l / 40.0F * 8.0F);
				Camera.camera_pitch += 8.0F * ((float) l * Class24.aFloat341 / 40.0F);
			}
			Class145.method977(-61);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.J(" + l + ',' + i + ')');
		}
	}

	final void method660(int i, int i_162_, int i_163_, byte i_164_) {
		do {
			try {
				anInt1340++;
				if (i_163_ != 0) {
					int i_165_ = MathUtils.SINE[i_163_];
					int i_166_ = MathUtils.COSINE[i_163_];
					for (int i_167_ = 0; i_167_ < this.vertices; i_167_++) {
						int i_168_ = (((i_166_ * this.verticesX[i_167_])
								+ (this.verticesY[i_167_] * i_165_)) >> 15);
						this.verticesY[i_167_] = ((this.verticesY[i_167_] * i_166_)
								+ -(i_165_ * (this.verticesX[i_167_]))) >> 15;
						this.verticesX[i_167_] = i_168_;
					}
				}
				if ((i ^ 0xffffffff) != -1) {
					int i_169_ = MathUtils.SINE[i];
					int i_170_ = MathUtils.COSINE[i];
					for (int i_171_ = 0; this.vertices > i_171_; i_171_++) {
						int i_172_ = ((-(i_169_ * this.verticesZ[i_171_])
								+ (this.verticesY[i_171_] * i_170_)) >> 15);
						this.verticesZ[i_171_] = ((this.verticesY[i_171_] * i_169_)
								- -(this.verticesZ[i_171_] * i_170_)) >> 15;
						this.verticesY[i_171_] = i_172_;
					}
				}
				if (i_162_ != 0) {
					int i_173_ = MathUtils.SINE[i_162_];
					int i_174_ = MathUtils.COSINE[i_162_];
					for (int i_175_ = 0; this.vertices > i_175_; i_175_++) {
						int i_176_ = (((this.verticesX[i_175_] * i_174_)
								+ (this.verticesZ[i_175_] * i_173_)) >> 15);
						this.verticesZ[i_175_] = ((i_174_ * this.verticesZ[i_175_])
								+ -(this.verticesX[i_175_] * i_173_)) >> 15;
						this.verticesX[i_175_] = i_176_;
					}
				}
				if (i_164_ > 105)
					break;
				this.priority = (byte) 108;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("jq.H(" + i + ',' + i_162_ + ',' + i_163_ + ',' + i_164_ + ')'));
			}
			break;
		} while (false);
	}

	private final void decode_old(byte[] is) {
		do {
			try {
				anInt1327++;
				boolean bool = false;
				boolean bool_177_ = false;
				Buffer first = new Buffer(is);
				Buffer second = new Buffer(is);
				Buffer third = new Buffer(is);
				Buffer fourth = new Buffer(is);
				Buffer fifth = new Buffer(is);
				((Buffer) first).position = -18 + is.length;
				this.vertices = first.readUnsignedShort();
				this.faces = first.readUnsignedShort();
				this.texture_faces = first.readUnsignedByte();
				int model_render_type_opcode = first.readUnsignedByte();
				int model_render_priority_opcode = first.readUnsignedByte();
				int hasFaceTransparencies = first.readUnsignedByte();
				int hasPackedTransparencyVertexGroups = first.readUnsignedByte();
				int hasPackedVertexGroups = first.readUnsignedByte();
				int model_vertex_x = first.readUnsignedShort();
				int model_vertex_y = first.readUnsignedShort();
				int model_vertex_z = first.readUnsignedShort();
				int model_vertex_points = first.readUnsignedShort();
				int pos = 0;
				int vertex_flag_offset = pos;
				pos += this.vertices;
				int model_face_compress_type_offset = pos;
				pos += this.faces;
				int model_face_priorities_offset = pos;
				if (model_render_priority_opcode == 255)
					pos += this.faces;
				int model_muscle_offset = pos;
				if ((hasPackedTransparencyVertexGroups ^ 0xffffffff) == -2)
					pos += this.faces;
				int model_render_type_offset = pos;
				if ((model_render_type_opcode ^ 0xffffffff) == -2)
					pos += this.faces;
				int model_bones_offset = pos;
				if (hasPackedVertexGroups == 1)
					pos += this.vertices;
				int model_alpha_offset = pos;
				if (hasFaceTransparencies == 1)
					pos += this.faces;
				int model_points_offset = pos;
				pos += model_vertex_points;
				int model_color_offset = pos;
				pos += this.faces * 2;
				int model_simple_texture_offset = pos;
				pos += this.texture_faces * 6;
				int model_vertex_x_offset = pos;
				pos += model_vertex_x;
				int model_vertex_y_offset = pos;
				pos += model_vertex_y;
				int model_vertex_z_offset = pos;
				this.indices1 = new int[this.faces];
				this.indices2 = new int[this.faces];
				this.indices3 = new int[this.faces];
				if ((hasPackedVertexGroups ^ 0xffffffff) == -2)
					this.vertexSkins = new int[this.vertices];
				if (hasFaceTransparencies == 1)
					this.faceAlphas = new int[this.faces];
				if ((this.texture_faces > 0)) {
					this.texIndices3 = new short[this.texture_faces];
					this.texIndices2 = new short[this.texture_faces];
					this.textureRenderTypes = new byte[this.texture_faces];
					this.texIndices1 = new short[this.texture_faces];
				}
				this.verticesZ = new int[this.vertices];
				this.faceColors = new short[this.faces];
				pos += model_vertex_z;
				this.verticesY = new int[this.vertices];
				((Buffer) first).position = vertex_flag_offset;
				this.verticesX = new int[this.vertices];
				if ((hasPackedTransparencyVertexGroups ^ 0xffffffff) == -2)
					this.faceSkins = new int[this.faces];
				if ((model_render_type_opcode ^ 0xffffffff) == -2) {
					this.textureCoords = new byte[this.faces];
					this.faceRenderTypes = new int[this.faces];
					this.faceTextures = new short[this.faces];
				}
				if ((model_render_priority_opcode ^ 0xffffffff) != -256)
					this.priority = (byte) model_render_priority_opcode;
				else
					this.faceRenderPriorities = new byte[this.faces];
				((Buffer) second).position = model_vertex_x_offset;
				((Buffer) third).position = model_vertex_y_offset;
				((Buffer) fourth).position = model_vertex_z_offset;
				((Buffer) fifth).position = model_bones_offset;
				int i_205_ = 0;
				int i_206_ = 0;
				int i_207_ = 0;
				for (int i_208_ = 0; ((this.vertices ^ 0xffffffff) < (i_208_ ^ 0xffffffff)); i_208_++) {
					int i_209_ = first.readUnsignedByte();
					int i_210_ = 0;
					if ((0x1 & i_209_) != 0)
						i_210_ = second.readSmart();
					int i_211_ = 0;
					if ((i_209_ & 0x2 ^ 0xffffffff) != -1)
						i_211_ = third.readSmart();
					int i_212_ = 0;
					if ((i_209_ & 0x4) != 0)
						i_212_ = fourth.readSmart();
					this.verticesX[i_208_] = i_205_ - -i_210_;
					this.verticesY[i_208_] = i_206_ - -i_211_;
					this.verticesZ[i_208_] = i_212_ + i_207_;
					i_205_ = this.verticesX[i_208_];
					i_206_ = this.verticesY[i_208_];
					i_207_ = this.verticesZ[i_208_];
					if ((hasPackedVertexGroups ^ 0xffffffff) == -2)
						this.vertexSkins[i_208_] = fifth.readUnsignedByte();
				}
				((Buffer) first).position = model_color_offset;
				((Buffer) second).position = model_render_type_offset;
				((Buffer) third).position = model_face_priorities_offset;
				((Buffer) fourth).position = model_alpha_offset;
				((Buffer) fifth).position = model_muscle_offset;
				for (int i_213_ = 0; i_213_ < this.faces; i_213_++) {
					this.faceColors[i_213_] = (short) first.readUnsignedShort();
					if ((model_render_type_opcode ^ 0xffffffff) == -2) {
						int i_214_ = second.readUnsignedByte();
						if ((0x1 & i_214_) == 1) {
							bool = true;
							this.faceRenderTypes[i_213_] = (byte) 1;
						} else
							this.faceRenderTypes[i_213_] = (byte) 0;
						if ((0x2 & i_214_) != 2) {
							this.textureCoords[i_213_] = (byte) -1;
							this.faceTextures[i_213_] = (short) -1;
						} else {
							this.textureCoords[i_213_] = (byte) (i_214_ >> 2);
							this.faceTextures[i_213_] = (this.faceColors[i_213_]);
							this.faceColors[i_213_] = (short) 127;
							if (this.faceTextures[i_213_] != -1)
								bool_177_ = true;
						}
					}
					if ((model_render_priority_opcode ^ 0xffffffff) == -256)
						this.faceRenderPriorities[i_213_] = third.readByte();
					if ((hasFaceTransparencies ^ 0xffffffff) == -2)
						this.faceAlphas[i_213_] = fourth.readByte();
					if (hasPackedTransparencyVertexGroups == 1)
						this.faceSkins[i_213_] = fifth.readUnsignedByte();
				}
				((Buffer) first).position = model_points_offset;
				this.anInt1573 = -1;
				((Buffer) second).position = model_face_compress_type_offset;
				short i_215_ = 0;
				short i_216_ = 0;
				short i_217_ = 0;
				int offset = 0;
				for (int i_219_ = 0; this.faces > i_219_; i_219_++) {
					int opcode = second.readUnsignedByte();
					if (opcode == 1) {
						i_215_ = (short) (first.readSmart() + offset);
						offset = i_215_;
						i_216_ = (short) (first.readSmart() + offset);
						offset = i_216_;
						i_217_ = (short) (first.readSmart() + offset);
						this.indices1[i_219_] = i_215_;
						offset = i_217_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if ((i_215_ ^ 0xffffffff) < (this.anInt1573 ^ 0xffffffff))
							this.anInt1573 = i_215_;
						if (i_216_ > this.anInt1573)
							this.anInt1573 = i_216_;
						if ((this.anInt1573 ^ 0xffffffff) > (i_217_ ^ 0xffffffff))
							this.anInt1573 = i_217_;
					}
					if ((opcode ^ 0xffffffff) == -3) {
						i_216_ = i_217_;
						i_217_ = (short) (first.readSmart() + offset);
						offset = i_217_;
						this.indices1[i_219_] = i_215_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if ((this.anInt1573 ^ 0xffffffff) > (i_217_ ^ 0xffffffff))
							this.anInt1573 = i_217_;
					}
					if (opcode == 3) {
						i_215_ = i_217_;
						i_217_ = (short) (offset + first.readSmart());
						offset = i_217_;
						this.indices1[i_219_] = i_215_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if (this.anInt1573 < i_217_)
							this.anInt1573 = i_217_;
					}
					if ((opcode ^ 0xffffffff) == -5) {
						short i_221_ = i_215_;
						i_215_ = i_216_;
						i_216_ = i_221_;
						i_217_ = (short) (first.readSmart() + offset);
						offset = i_217_;
						this.indices1[i_219_] = i_215_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if (this.anInt1573 < i_217_)
							this.anInt1573 = i_217_;
					}
				}
				((Buffer) first).position = model_simple_texture_offset;
				this.anInt1573++;
				for (int i_222_ = 0; ((this.texture_faces ^ 0xffffffff) < (i_222_ ^ 0xffffffff)); i_222_++) {
					this.textureRenderTypes[i_222_] = (byte) 0;
					this.texIndices1[i_222_] = (short) first.readUnsignedShort();
					this.texIndices2[i_222_] = (short) first.readUnsignedShort();
					this.texIndices3[i_222_] = (short) first.readUnsignedShort();
				}
				if (this.textureCoords != null) {
					boolean bool_223_ = false;
					for (int i_224_ = 0; this.faces > i_224_; i_224_++) {
						int i_225_ = this.textureCoords[i_224_] & 0xff;
						if (i_225_ != 255) {
							if (((this.texIndices1[i_225_]
									& 0xffff) == (this.indices1[i_224_]))
									&& (((this.texIndices2[i_225_])
											& 0xffff) == (this.indices2[i_224_]))
									&& ((this.indices3[i_224_]) == (0xffff
											& (this.texIndices3[i_225_]))))
								this.textureCoords[i_224_] = (byte) -1;
							else
								bool_223_ = true;
						}
					}
					if (!bool_223_)
						this.textureCoords = null;
				}
				if (!bool_177_)
					this.faceTextures = null;
				if (bool)
					break;
				this.faceRenderTypes = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	void decode_old2(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var4.position = var1.length - 18;
		int var9 = var4.readUnsignedShort();
		int var10 = var4.readUnsignedShort();
		int var11 = var4.readUnsignedByte();
		int var12 = var4.readUnsignedByte();
		int var13 = var4.readUnsignedByte();
		int var14 = var4.readUnsignedByte();
		int var15 = var4.readUnsignedByte();
		int var16 = var4.readUnsignedByte();
		int var17 = var4.readUnsignedShort();
		int var18 = var4.readUnsignedShort();
		int var19 = var4.readUnsignedShort();
		int var20 = var4.readUnsignedShort();
		byte var21 = 0;
		int var45 = var21 + var9;
		int var23 = var45;
		var45 += var10;
		int var24 = var45;
		if (var13 == 255) {
			var45 += var10;
		}

		int var25 = var45;
		if (var15 == 1) {
			var45 += var10;
		}

		int var26 = var45;
		if (var12 == 1) {
			var45 += var10;
		}

		int var27 = var45;
		if (var16 == 1) {
			var45 += var9;
		}

		int var28 = var45;
		if (var14 == 1) {
			var45 += var10;
		}

		int var29 = var45;
		var45 += var20;
		int var30 = var45;
		var45 += var10 * 2;
		int var31 = var45;
		var45 += var11 * 6;
		int var32 = var45;
		var45 += var17;
		int var33 = var45;
		var45 += var18;
		int var10000 = var45 + var19;
		this.vertices = var9;
		this.faces = var10;
		this.texture_faces = var11;
		this.verticesX = new int[var9];
		this.verticesY = new int[var9];
		this.verticesZ = new int[var9];
		this.indices1 = new int[var10];
		this.indices2 = new int[var10];
		this.indices3 = new int[var10];
		if (var11 > 0) {
			this.textureRenderTypes = new byte[var11];
			this.texTriangleX = new int[var11];
			this.texTriangleY = new int[var11];
			this.texTriangleZ = new int[var11];
		}

		if (var16 == 1) {
			this.vertexSkins = new int[var9];
		}

		if (var12 == 1) {
			this.faceRenderTypes = new int[var10];
			this.textureCoords = new byte[var10];
			this.faceTextures = new short[var10];
		}

		if (var13 == 255) {
			this.faceRenderPriorities = new byte[var10];
		} else {
			this.priority = (byte) var13;
		}

		if (var14 == 1) {
			this.faceAlphas = new int[var10];
		}

		if (var15 == 1) {
			this.faceSkins = new int[var10];
		}

		this.faceColors = new short[var10];
		var4.position = var21;
		var5.position = var32;
		var6.position = var33;
		var7.position = var45;
		var8.position = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.readUnsignedByte();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.readShortSmart();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.readShortSmart();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.readShortSmart();
			}

			this.verticesX[var38] = var35 + var40;
			this.verticesY[var38] = var36 + var41;
			this.verticesZ[var38] = var37 + var42;
			var35 = this.verticesX[var38];
			var36 = this.verticesY[var38];
			var37 = this.verticesZ[var38];
			if (var16 == 1) {
				this.vertexSkins[var38] = var8.readUnsignedByte();
			}
		}

		var4.position = var30;
		var5.position = var26;
		var6.position = var24;
		var7.position = var28;
		var8.position = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			this.faceColors[var38] = (short) var4.readUnsignedShort();
			if (var12 == 1) {
				var39 = var5.readUnsignedByte();
				if ((var39 & 1) == 1) {
					this.faceRenderTypes[var38] = 1;
					var2 = true;
				} else {
					this.faceRenderTypes[var38] = 0;
				}

				if ((var39 & 2) == 2) {
					this.textureCoords[var38] = (byte) (var39 >> 2);
					this.faceTextures[var38] = this.faceColors[var38];
					this.faceColors[var38] = 127;
					if (this.faceTextures[var38] != -1) {
						var3 = true;
					}
				} else {
					this.textureCoords[var38] = -1;
					this.faceTextures[var38] = -1;
				}
			}

			if (var13 == 255) {
				this.faceRenderPriorities[var38] = var6.readByte();
			}

			if (var14 == 1) {
				this.faceAlphas[var38] = var7.readByte();
			}

			if (var15 == 1) {
				this.faceSkins[var38] = var8.readUnsignedByte();
			}
		}

		var4.position = var29;
		var5.position = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.readUnsignedByte();
			if (var43 == 1) {
				var38 = var4.readShortSmart() + var41;
				var39 = var4.readShortSmart() + var38;
				var40 = var4.readShortSmart() + var39;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var39;
				this.indices3[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.readShortSmart() + var41;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var39;
				this.indices3[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.readShortSmart() + var41;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var39;
				this.indices3[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.readShortSmart() + var41;
				var41 = var40;
				this.indices1[var42] = var38;
				this.indices2[var42] = var44;
				this.indices3[var42] = var40;
			}
		}

		var4.position = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			this.textureRenderTypes[var42] = 0;
			this.texTriangleX[var42] = (short) var4.readUnsignedShort();
			this.texTriangleY[var42] = (short) var4.readUnsignedShort();
			this.texTriangleZ[var42] = (short) var4.readUnsignedShort();
		}

		if (this.textureCoords != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.textureCoords[var43] & 255;
				if (var44 != 255) {
					if (this.indices1[var43] == (this.texTriangleX[var44] & '\uffff')
							&& this.indices2[var43] == (this.texTriangleY[var44] & '\uffff')
							&& this.indices3[var43] == (this.texTriangleZ[var44] & '\uffff')) {
						this.textureCoords[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				this.textureCoords = null;
			}
		}

		if (!var3) {
			this.faceTextures = null;
		}

		if (!var2) {
			this.faceRenderTypes = null;
		}

	}

	private final void decodeType2(byte[] data) {
		do {
			try {
				anInt1327++;
				boolean var2 = false;
				boolean var3 = false;
				Buffer var4 = new Buffer(data);
				Buffer var5 = new Buffer(data);
				Buffer var6 = new Buffer(data);
				Buffer var7 = new Buffer(data);
				Buffer var8 = new Buffer(data);
				var4.position = data.length - 23;
				int var9 = var4.readUnsignedShort();
				this.vertices = var9;
				int var10 = var4.readUnsignedShort();
				this.faces = var10;
				int var11 = var4.readUnsignedByte();
				this.texture_faces = var11;
				int var12 = var4.readUnsignedByte();
				int var13 = var4.readUnsignedByte();
				int var14 = var4.readUnsignedByte();
				int var15 = var4.readUnsignedByte();
				int var16 = var4.readUnsignedByte();
				int var17 = var4.readUnsignedByte();
				int var18 = var4.readUnsignedShort();
				int var19 = var4.readUnsignedShort();
				int var20 = var4.readUnsignedShort();
				int var21 = var4.readUnsignedShort();
				int var22 = var4.readUnsignedShort();
				byte var23 = 0;
				int var47 = var23 + var9;
				int var25 = var47;
				var47 += var10;
				int var26 = var47;
				if (var13 == 255) {
					var47 += var10;
				}

				int var27 = var47;
				if (var15 == 1) {
					var47 += var10;
				}

				int var28 = var47;
				if (var12 == 1) {
					var47 += var10;
				}

				int var29 = var47;
				var47 += var22;
				int var30 = var47;
				if (var14 == 1) {
					var47 += var10;
				}

				int var31 = var47;
				var47 += var21;
				int var32 = var47;
				var47 += var10 * 2;
				int var33 = var47;
				var47 += var11 * 6;
				int var34 = var47;
				var47 += var18;
				int var35 = var47;
				var47 += var19;
				int var10000 = var47 + var20;
				this.verticesX = new int[var9];
				this.verticesY = new int[var9];
				this.verticesZ = new int[var9];
				this.indices1 = new int[var10];
				this.indices2 = new int[var10];
				this.indices3 = new int[var10];
				if (var11 > 0) {
					this.textureRenderTypes = new byte[var11];
					this.texTriangleX = new int[var11];
					this.texTriangleY = new int[var11];
					this.texIndices1 = new short[var11];
					this.texIndices2 = new short[var11];
					this.texIndices3 = new short[var11];
					this.texTriangleZ = new int[var11];
				}

				if (var16 == 1) {
					this.vertexSkins = new int[var9];
				}

				if (var12 == 1) {
					this.faceRenderTypes = new int[var10];
					this.textureCoords = new byte[var10];
					this.faceTextures = new short[var10];
				}

				if (var13 == 255) {
					this.faceRenderPriorities = new byte[var10];
				} else {
					this.priority = (byte) var13;
				}

				if (var14 == 1) {
					this.faceAlphas = new int[var10];
				}

				if (var15 == 1) {
					this.faceSkins = new int[var10];
				}

				if (var17 == 1) {
					this.animayaGroups = new int[var9][];
					this.animayaScales = new int[var9][];
				}

				this.faceColors = new short[var10];
				var4.position = var23;
				var5.position = var34;
				var6.position = var35;
				var7.position = var47;
				var8.position = var29;
				int var37 = 0;
				int var38 = 0;
				int var39 = 0;

				int var40;
				int var41;
				int var42;
				int var43;
				int var44;
				for (var40 = 0; var40 < var9; ++var40) {
					var41 = var4.readUnsignedByte();
					var42 = 0;
					if ((var41 & 1) != 0) {
						var42 = var5.readShortSmart();
					}

					var43 = 0;
					if ((var41 & 2) != 0) {
						var43 = var6.readShortSmart();
					}

					var44 = 0;
					if ((var41 & 4) != 0) {
						var44 = var7.readShortSmart();
					}

					this.verticesX[var40] = var37 + var42;
					this.verticesY[var40] = var38 + var43;
					this.verticesZ[var40] = var39 + var44;
					var37 = this.verticesX[var40];
					var38 = this.verticesY[var40];
					var39 = this.verticesZ[var40];
					if (var16 == 1) {
						this.vertexSkins[var40] = var8.readUnsignedByte();
					}
				}
				if (var17 == 1) {
					for (int temp1 = 0; temp1 < vertices; ++temp1) {
						int temp2 = var8.readUnsignedByte();
						this.animayaGroups[temp1] = new int[temp2];
						this.animayaScales[temp1] = new int[temp2];
						for (int temp3 = 0; temp3 < temp2; ++temp3) {
							this.animayaGroups[temp1][temp3] = var8.readUnsignedByte();
							this.animayaScales[temp1][temp3] = var8.readUnsignedByte();
						}
					}
				}
				var4.position = var32;
				var5.position = var28;
				var6.position = var26;
				var7.position = var30;
				var8.position = var27;
				for (int i_213_ = 0; i_213_ < this.faces; i_213_++) {
					this.faceColors[i_213_] = (short) var4.readUnsignedShort();
					if ((var12 ^ 0xffffffff) == -2) {
						int i_214_ = var5.readUnsignedByte();
						if ((0x1 & i_214_) == 1) {
							var2 = true;
							this.faceRenderTypes[i_213_] = (byte) 1;
						} else
							this.faceRenderTypes[i_213_] = (byte) 0;
						if ((0x2 & i_214_) != 2) {
							this.textureCoords[i_213_] = (byte) -1;
							this.faceTextures[i_213_] = (short) -1;
						} else {
							this.textureCoords[i_213_] = (byte) (i_214_ >> 2);
							this.faceTextures[i_213_] = (this.faceColors[i_213_]);
							this.faceColors[i_213_] = (short) 127;
							if (this.faceTextures[i_213_] != -1)
								var3 = true;
						}
					}
					if ((var13 ^ 0xffffffff) == -256)
						this.faceRenderPriorities[i_213_] = var6.readByte();
					if ((var14 ^ 0xffffffff) == -2)
						this.faceAlphas[i_213_] = var7.readByte();
					if (var15 == 1)
						this.faceSkins[i_213_] = var8.readUnsignedByte();
				}
				this.anInt1573 = -1;
				var4.position = var31;
				var5.position = var25;
				short i_215_ = 0;
				short i_216_ = 0;
				short i_217_ = 0;
				int offset = 0;
				for (int i_219_ = 0; this.faces > i_219_; i_219_++) {
					int opcode = var5.readUnsignedByte();
					if (opcode == 1) {
						i_215_ = (short) (var4.readSmart() + offset);
						offset = i_215_;
						i_216_ = (short) (var4.readSmart() + offset);
						offset = i_216_;
						i_217_ = (short) (var4.readSmart() + offset);
						this.indices1[i_219_] = i_215_;
						offset = i_217_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if ((i_215_ ^ 0xffffffff) < (this.anInt1573 ^ 0xffffffff))
							this.anInt1573 = i_215_;
						if (i_216_ > this.anInt1573)
							this.anInt1573 = i_216_;
						if ((this.anInt1573 ^ 0xffffffff) > (i_217_ ^ 0xffffffff))
							this.anInt1573 = i_217_;
					}
					if ((opcode ^ 0xffffffff) == -3) {
						i_216_ = i_217_;
						i_217_ = (short) (var4.readSmart() + offset);
						offset = i_217_;
						this.indices1[i_219_] = i_215_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if ((this.anInt1573 ^ 0xffffffff) > (i_217_ ^ 0xffffffff))
							this.anInt1573 = i_217_;
					}
					if (opcode == 3) {
						i_215_ = i_217_;
						i_217_ = (short) (offset + var4.readSmart());
						offset = i_217_;
						this.indices1[i_219_] = i_215_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if (this.anInt1573 < i_217_)
							this.anInt1573 = i_217_;
					}
					if ((opcode ^ 0xffffffff) == -5) {
						short i_221_ = i_215_;
						i_215_ = i_216_;
						i_216_ = i_221_;
						i_217_ = (short) (var4.readSmart() + offset);
						offset = i_217_;
						this.indices1[i_219_] = i_215_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if (this.anInt1573 < i_217_)
							this.anInt1573 = i_217_;
					}
				}
				var4.position = var33;
				this.anInt1573++;
				for (int i_222_ = 0; ((this.texture_faces ^ 0xffffffff) < (i_222_ ^ 0xffffffff)); i_222_++) {
					this.textureRenderTypes[i_222_] = (byte) 0;
					this.texIndices1[i_222_] = (short) var4.readUnsignedShort();
					this.texIndices2[i_222_] = (short) var4.readUnsignedShort();
					this.texIndices3[i_222_] = (short) var4.readUnsignedShort();
					this.texTriangleX[i_222_] = this.texIndices1[i_222_];
					this.texTriangleY[i_222_] = this.texIndices2[i_222_];
					this.texTriangleZ[i_222_] = this.texIndices3[i_222_];
				}
				if (this.textureCoords != null) {
					boolean bool_223_ = false;
					for (int i_224_ = 0; this.faces > i_224_; i_224_++) {
						int i_225_ = this.textureCoords[i_224_] & 0xff;
						if (i_225_ != 255) {
							if (((this.texIndices1[i_225_]
									& 0xffff) == (this.indices1[i_224_]))
									&& (((this.texIndices2[i_225_])
											& 0xffff) == (this.indices2[i_224_]))
									&& ((this.indices3[i_224_]) == (0xffff
											& (this.texIndices3[i_225_]))))
								this.textureCoords[i_224_] = (byte) -1;
							else
								bool_223_ = true;
						}
					}
					if (!bool_223_)
						this.textureCoords = null;
				}
				if (!var3)
					this.faceTextures = null;
				if (var2)
					break;
				this.faceRenderTypes = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	private final void decodeType2orig(byte[] data) {
		do {
			try {
				anInt1327++;
				boolean var2 = false;
				boolean var3 = false;
				Buffer var4 = new Buffer(data);
				Buffer var5 = new Buffer(data);
				Buffer var6 = new Buffer(data);
				Buffer var7 = new Buffer(data);
				Buffer var8 = new Buffer(data);
				var4.position = data.length - 23;
				this.vertices = var4.readUnsignedShort();
				this.faces = var4.readUnsignedShort();
				this.texture_faces = var4.readUnsignedByte();
				int var12 = var4.readUnsignedByte();
				int var13 = var4.readUnsignedByte();
				int var14 = var4.readUnsignedByte();
				int var15 = var4.readUnsignedByte();
				int var16 = var4.readUnsignedByte();
				int var17 = var4.readUnsignedByte();
				int var18 = var4.readUnsignedShort();
				int var19 = var4.readUnsignedShort();
				int var20 = var4.readUnsignedShort();
				int var21 = var4.readUnsignedShort();
				int var22 = var4.readUnsignedShort();
				int pos = 0;
				int vertex_flag_offset = pos;
				pos += this.vertices;
				int model_face_compress_type_offset = pos;
				pos += this.faces;
				int model_face_priorities_offset = pos;
				if (var13 == 255)
					pos += this.faces;
				int model_muscle_offset = pos;
				if ((var15 ^ 0xffffffff) == -2)
					pos += this.faces;
				int model_render_type_offset = pos;
				vertex_flag_offset += var22;
				if ((var12 ^ 0xffffffff) == -2)
					pos += this.faces;
				int model_bones_offset = pos;
				if (var16 == 1)
					pos += this.vertices;
				int model_alpha_offset = pos;
				if (var14 == 1)
					pos += this.faces;
				if (var17 == 1) {
					this.animayaGroups = new int[this.vertices][];
					this.animayaScales = new int[this.vertices][];
				}
				int model_points_offset = pos;
				pos += var21;
				int model_color_offset = pos;
				pos += this.faces * 2;
				int model_simple_texture_offset = pos;
				pos += this.texture_faces * 6;
				int model_vertex_x_offset = pos;
				pos += var18;
				int model_vertex_y_offset = pos;
				pos += var19;
				int model_vertex_z_offset = pos;
				this.indices1 = new int[this.faces];
				this.indices2 = new int[this.faces];
				this.indices3 = new int[this.faces];
				if ((var16 ^ 0xffffffff) == -2)
					this.vertexSkins = new int[this.vertices];
				if (var14 == 1)
					this.faceAlphas = new int[this.faces];
				if ((this.texture_faces ^ 0xffffffff) < -1) {
					this.texIndices3 = new short[this.texture_faces];
					this.texIndices2 = new short[this.texture_faces];
					this.textureRenderTypes = new byte[this.texture_faces];
					this.texIndices1 = new short[this.texture_faces];
				}
				this.verticesZ = new int[this.vertices];
				this.faceColors = new short[this.faces];
				pos += var20;
				this.verticesY = new int[this.vertices];
				var4.position = vertex_flag_offset;
				this.verticesX = new int[this.vertices];
				if ((var15 ^ 0xffffffff) == -2)
					this.faceSkins = new int[this.faces];
				if ((var12 ^ 0xffffffff) == -2) {
					this.textureCoords = new byte[this.faces];
					this.faceRenderTypes = new int[this.faces];
					this.faceTextures = new short[this.faces];
				}
				if ((var13 ^ 0xffffffff) != -256)
					this.priority = (byte) var13;
				else
					this.faceRenderPriorities = new byte[this.faces];
				((Buffer) var5).position = model_vertex_x_offset;
				((Buffer) var6).position = model_vertex_y_offset;
				((Buffer) var7).position = model_vertex_z_offset;
				((Buffer) var8).position = model_bones_offset;
				int i_205_ = 0;
				int i_206_ = 0;
				int i_207_ = 0;
				for (int i_208_ = 0; ((this.vertices ^ 0xffffffff) < (i_208_ ^ 0xffffffff)); i_208_++) {
					int i_209_ = var4.readUnsignedByte();
					int i_210_ = 0;
					if ((0x1 & i_209_) != 0)
						i_210_ = var5.readSmart();
					int i_211_ = 0;
					if ((i_209_ & 0x2 ^ 0xffffffff) != -1)
						i_211_ = var6.readSmart();
					int i_212_ = 0;
					if ((i_209_ & 0x4) != 0)
						i_212_ = var7.readSmart();
					this.verticesX[i_208_] = i_205_ - -i_210_;
					this.verticesY[i_208_] = i_206_ - -i_211_;
					this.verticesZ[i_208_] = i_212_ + i_207_;
					i_205_ = this.verticesX[i_208_];
					i_206_ = this.verticesY[i_208_];
					i_207_ = this.verticesZ[i_208_];
					if ((var16 ^ 0xffffffff) == -2)
						this.vertexSkins[i_208_] = var8.readUnsignedByte();
				}
				if (var17 == 1) {
					for (int temp1 = 0; temp1 < vertices; ++temp1) {
						int temp2 = var8.readUnsignedByte();
						this.animayaGroups[temp1] = new int[temp2];
						this.animayaScales[temp1] = new int[temp2];
						for (int temp3 = 0; temp3 < temp2; ++temp3) {
							this.animayaGroups[temp1][temp3] = var8.readUnsignedByte();
							this.animayaScales[temp1][temp3] = var8.readUnsignedByte();
						}
					}
				}
				var4.position = model_color_offset;
				((Buffer) var5).position = model_render_type_offset;
				((Buffer) var6).position = model_face_priorities_offset;
				((Buffer) var7).position = model_alpha_offset;
				((Buffer) var8).position = model_muscle_offset;
				for (int i_213_ = 0; i_213_ < this.faces; i_213_++) {
					this.faceColors[i_213_] = (short) var4.readUnsignedShort();
					if ((var12 ^ 0xffffffff) == -2) {
						int i_214_ = var5.readUnsignedByte();
						if ((0x1 & i_214_) == 1) {
							var2 = true;
							this.faceRenderTypes[i_213_] = (byte) 1;
						} else
							this.faceRenderTypes[i_213_] = (byte) 0;
						if ((0x2 & i_214_) != 2) {
							this.textureCoords[i_213_] = (byte) -1;
							this.faceTextures[i_213_] = (short) -1;
						} else {
							this.textureCoords[i_213_] = (byte) (i_214_ >> 2);
							this.faceTextures[i_213_] = (this.faceColors[i_213_]);
							this.faceColors[i_213_] = (short) 127;
							if (this.faceTextures[i_213_] != -1)
								var3 = true;
						}
					}
					if ((var13 ^ 0xffffffff) == -256)
						this.faceRenderPriorities[i_213_] = var6.readByte();
					if ((var14 ^ 0xffffffff) == -2)
						this.faceAlphas[i_213_] = var7.readByte();
					if (var15 == 1)
						this.faceSkins[i_213_] = var8.readUnsignedByte();
				}
				var4.position = model_points_offset;
				this.anInt1573 = -1;
				((Buffer) var5).position = model_face_compress_type_offset;
				short i_215_ = 0;
				short i_216_ = 0;
				short i_217_ = 0;
				int offset = 0;
				for (int i_219_ = 0; this.faces > i_219_; i_219_++) {
					int opcode = var5.readUnsignedByte();
					if (opcode == 1) {
						i_215_ = (short) (var4.readSmart() + offset);
						offset = i_215_;
						i_216_ = (short) (var4.readSmart() + offset);
						offset = i_216_;
						i_217_ = (short) (var4.readSmart() + offset);
						this.indices1[i_219_] = i_215_;
						offset = i_217_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if ((i_215_ ^ 0xffffffff) < (this.anInt1573 ^ 0xffffffff))
							this.anInt1573 = i_215_;
						if (i_216_ > this.anInt1573)
							this.anInt1573 = i_216_;
						if ((this.anInt1573 ^ 0xffffffff) > (i_217_ ^ 0xffffffff))
							this.anInt1573 = i_217_;
					}
					if ((opcode ^ 0xffffffff) == -3) {
						i_216_ = i_217_;
						i_217_ = (short) (var4.readSmart() + offset);
						offset = i_217_;
						this.indices1[i_219_] = i_215_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if ((this.anInt1573 ^ 0xffffffff) > (i_217_ ^ 0xffffffff))
							this.anInt1573 = i_217_;
					}
					if (opcode == 3) {
						i_215_ = i_217_;
						i_217_ = (short) (offset + var4.readSmart());
						offset = i_217_;
						this.indices1[i_219_] = i_215_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if (this.anInt1573 < i_217_)
							this.anInt1573 = i_217_;
					}
					if ((opcode ^ 0xffffffff) == -5) {
						short i_221_ = i_215_;
						i_215_ = i_216_;
						i_216_ = i_221_;
						i_217_ = (short) (var4.readSmart() + offset);
						offset = i_217_;
						this.indices1[i_219_] = i_215_;
						this.indices2[i_219_] = i_216_;
						this.indices3[i_219_] = i_217_;
						if (this.anInt1573 < i_217_)
							this.anInt1573 = i_217_;
					}
				}
				var4.position = model_simple_texture_offset;
				this.anInt1573++;
				for (int i_222_ = 0; ((this.texture_faces ^ 0xffffffff) < (i_222_ ^ 0xffffffff)); i_222_++) {
					this.textureRenderTypes[i_222_] = (byte) 0;
					this.texIndices1[i_222_] = (short) var4.readUnsignedShort();
					this.texIndices2[i_222_] = (short) var4.readUnsignedShort();
					this.texIndices3[i_222_] = (short) var4.readUnsignedShort();
				}
				if (this.textureCoords != null) {
					boolean bool_223_ = false;
					for (int i_224_ = 0; this.faces > i_224_; i_224_++) {
						int i_225_ = this.textureCoords[i_224_] & 0xff;
						if (i_225_ != 255) {
							if (((this.texIndices1[i_225_]
									& 0xffff) == (this.indices1[i_224_]))
									&& (((this.texIndices2[i_225_])
											& 0xffff) == (this.indices2[i_224_]))
									&& ((this.indices3[i_224_]) == (0xffff
											& (this.texIndices3[i_225_]))))
								this.textureCoords[i_224_] = (byte) -1;
							else
								bool_223_ = true;
						}
					}
					if (!bool_223_)
						this.textureCoords = null;
				}
				if (!var3)
					this.faceTextures = null;
				if (var2)
					break;
				this.faceRenderTypes = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	final void method662(short i, short i_226_, boolean bool) {
		try {
			anInt1344++;
			if (bool == false) {
				for (int i_227_ = 0; ((i_227_ ^ 0xffffffff) > (this.faces ^ 0xffffffff)); i_227_++) {
					if ((this.faceColors[i_227_] ^ 0xffffffff) == (i ^ 0xffffffff))
						this.faceColors[i_227_] = i_226_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.C(" + i + ',' + i_226_ + ',' + bool + ')'));
		}
	}

	static final Model get_model(int i, CacheIndex model_data_index, int model_id) {
		return get_model(i, model_data_index, model_id, Revision.PRE_EOC_634);
	}

	static final Model get_model(int i, CacheIndex model_data_index, int model_id, Revision revision) {
		try {
			byte[] model_data = model_data_index.get_file(i, model_id);
			if (model_data == null) {
				return null;
			}
			return new Model(model_data, model_id, revision);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	static final int method663(byte i, int i_228_, int i_229_) {
		try {
			anInt1363++;
			int i_230_ = (-128 + Class260_Sub2.method1972(-95, 4, 91923 + i_229_, i_228_ + 45365)
					- (-(Class260_Sub2.method1972(-121, 2, i_229_ + 37821, 10294 + i_228_) - 128 >> 1)
							+ -((Class260_Sub2.method1972(-93, 1, i_229_, i_228_) - 128) >> 2)));
			i_230_ = 35 + (int) (0.3 * (double) i_230_);
			if (i >= -16)
				anInt1374 = -59;
			do {
				if ((i_230_ ^ 0xffffffff) <= -11) {
					if ((i_230_ ^ 0xffffffff) >= -61)
						break;
					i_230_ = 60;
					if (!Client.f_ob)
						break;
				}
				i_230_ = 10;
			} while (false);
			return i_230_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.I(" + i + ',' + i_228_ + ',' + i_229_ + ')'));
		}
	}

	Model(final byte[] data, final int model_id, final Revision revision) {
		this.revision = revision;
		if (this.revision == Revision.OSRS && data[data.length - 1] == -3 && data[data.length - 2] == -1) {
			decodeType3(data);
		} else if (this.revision == Revision.OSRS && data[data.length - 1] == -2 && data[data.length - 2] == -1) {
			decodeType2(data);
		} else if (data[data.length - 1] == -1 && data[data.length - 2] == -1) {
			decode_new2(data);
		} else {
			decode_old(data);
		}
		if (anInt1358 > 12) {
			scaleDown(2);
		}
	}

	void decode_old_osrs(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Buffer var4 = new Buffer(var1);
		Buffer var5 = new Buffer(var1);
		Buffer var6 = new Buffer(var1);
		Buffer var7 = new Buffer(var1);
		Buffer var8 = new Buffer(var1);
		var4.position = var1.length - 23;
		int var9 = var4.readUnsignedShort();
		int var10 = var4.readUnsignedShort();
		int var11 = var4.readUnsignedByte();
		int var12 = var4.readUnsignedByte();
		int var13 = var4.readUnsignedByte();
		int var14 = var4.readUnsignedByte();
		int var15 = var4.readUnsignedByte();
		int var16 = var4.readUnsignedByte();
		int var17 = var4.readUnsignedByte();
		int var18 = var4.readUnsignedShort();
		int var19 = var4.readUnsignedShort();
		int var20 = var4.readUnsignedShort();
		int var21 = var4.readUnsignedShort();
		int var22 = var4.readUnsignedShort();
		byte var23 = 0;
		int var47 = var23 + var9;
		int var25 = var47;
		var47 += var10;
		int var26 = var47;
		if (var13 == 255) {
			var47 += var10;
		}

		int var27 = var47;
		if (var15 == 1) {
			var47 += var10;
		}

		int var28 = var47;
		if (var12 == 1) {
			var47 += var10;
		}

		int var29 = var47;
		var47 += var22;
		int var30 = var47;
		if (var14 == 1) {
			var47 += var10;
		}

		int var31 = var47;
		var47 += var21;
		int var32 = var47;
		var47 += var10 * 2;
		int var33 = var47;
		var47 += var11 * 6;
		int var34 = var47;
		var47 += var18;
		int var35 = var47;
		var47 += var19;
		int var10000 = var47 + var20;
		this.vertices = var9;
		this.faces = var10;
		this.texture_faces = var11;
		this.verticesX = new int[var9];
		this.verticesY = new int[var9];
		this.verticesZ = new int[var9];
		this.indices1 = new int[var10];
		this.indices2 = new int[var10];
		this.indices3 = new int[var10];
		if (var11 > 0) {
			this.textureRenderTypes = new byte[var11];
			this.texIndices1 = new short[var11];
			this.texIndices2 = new short[var11];
			this.texIndices3 = new short[var11];
		}

		if (var16 == 1) {
			this.vertexSkins = new int[var9];
		}

		if (var12 == 1) {
			this.faceRenderTypes = new int[var10];
			this.textureCoords = new byte[var10];
			this.faceTextures = new short[var10];
		}

		if (var13 == 255) {
			this.faceRenderPriorities = new byte[var10];
		} else {
			this.priority = (byte) var13;
		}

		if (var14 == 1) {
			this.faceAlphas = new int[var10];
		}

		if (var15 == 1) {
			this.faceSkins = new int[var10];
		}

		if (var17 == 1) {
			this.animayaGroups = new int[var9][];
			this.animayaScales = new int[var9][];
		}

		this.faceColors = new short[var10];
		var4.position = var23;
		var5.position = var34;
		var6.position = var35;
		var7.position = var47;
		var8.position = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;

		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.readUnsignedByte();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.readShortSmart();
			}

			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.readShortSmart();
			}

			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.readShortSmart();
			}

			this.verticesX[var40] = var37 + var42;
			this.verticesY[var40] = var38 + var43;
			this.verticesZ[var40] = var39 + var44;
			var37 = this.verticesX[var40];
			var38 = this.verticesY[var40];
			var39 = this.verticesZ[var40];
			if (var16 == 1) {
				this.vertexSkins[var40] = var8.readUnsignedByte();
			}
		}

		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.readUnsignedByte();
				this.animayaGroups[var40] = new int[var41];
				this.animayaScales[var40] = new int[var41];

				for (var42 = 0; var42 < var41; ++var42) {
					this.animayaGroups[var40][var42] = var8.readUnsignedByte();
					this.animayaScales[var40][var42] = var8.readUnsignedByte();
				}
			}
		}

		var4.position = var32;
		var5.position = var28;
		var6.position = var26;
		var7.position = var30;
		var8.position = var27;

		for (var40 = 0; var40 < var10; ++var40) {
			this.faceColors[var40] = (short) var4.readUnsignedShort();
			if (var12 == 1) {
				var41 = var5.readUnsignedByte();
				if ((var41 & 1) == 1) {
					this.faceRenderTypes[var40] = 1;
					var2 = true;
				} else {
					this.faceRenderTypes[var40] = 0;
				}

				if ((var41 & 2) == 2) {
					this.textureCoords[var40] = (byte) (var41 >> 2);
					this.faceTextures[var40] = this.faceColors[var40];
					this.faceColors[var40] = 127;
					if (this.faceTextures[var40] != -1) {
						var3 = true;
					}
				} else {
					this.textureCoords[var40] = -1;
					this.faceTextures[var40] = -1;
				}
			}

			if (var13 == 255) {
				this.faceRenderPriorities[var40] = var6.readByte();
			}

			if (var14 == 1) {
				this.faceAlphas[var40] = var7.readByte();
			}

			if (var15 == 1) {
				this.faceSkins[var40] = var8.readUnsignedByte();
			}
		}

		var4.position = var31;
		var5.position = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;

		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.readUnsignedByte();
			if (var45 == 1) {
				var40 = var4.readShortSmart() + var43;
				var41 = var4.readShortSmart() + var40;
				var42 = var4.readShortSmart() + var41;
				var43 = var42;
				this.indices1[var44] = var40;
				this.indices2[var44] = var41;
				this.indices3[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.readShortSmart() + var43;
				var43 = var42;
				this.indices1[var44] = var40;
				this.indices2[var44] = var41;
				this.indices3[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.readShortSmart() + var43;
				var43 = var42;
				this.indices1[var44] = var40;
				this.indices2[var44] = var41;
				this.indices3[var44] = var42;
			}

			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.readShortSmart() + var43;
				var43 = var42;
				this.indices1[var44] = var40;
				this.indices2[var44] = var46;
				this.indices3[var44] = var42;
			}
		}

		var4.position = var33;

		for (var44 = 0; var44 < var11; ++var44) {
			this.textureRenderTypes[var44] = 0;
			this.texIndices1[var44] = (short) var4.readUnsignedShort();
			this.texIndices2[var44] = (short) var4.readUnsignedShort();
			this.texIndices3[var44] = (short) var4.readUnsignedShort();
		}

		if (this.textureCoords != null) {
			boolean var48 = false;

			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.textureCoords[var45] & 255;
				if (var46 != 255) {
					if (this.indices1[var45] == (this.texIndices1[var46] & '\uffff')
							&& this.indices2[var45] == (this.texIndices2[var46] & '\uffff')
							&& this.indices3[var45] == (this.texIndices3[var46] & '\uffff')) {
						this.textureCoords[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}

			if (!var48) {
				this.textureCoords = null;
			}
		}

		if (!var3) {
			this.faceTextures = null;
		}

		if (!var2) {
			this.faceRenderTypes = null;
		}

	}

	public void scaleDown(int bits) {
		for (int i = 0; i < vertices; i++) {
			verticesX[i] >>= bits;
			verticesY[i] >>= bits;
			verticesZ[i] >>= bits;
		}
		if (texture_faces > 0 && texTriangleX != null) {
			for (int i = 0; i < texTriangleX.length; i++) {
				// this bug is elsew here, hthis code is correc, but temp fix to just check for
				// range
				texTriangleX[i] >>= bits;
				texTriangleY[i] >>= bits;
				if (textureRenderTypes[i] != 1) {
					texTriangleZ[i] >>= bits;
				}
			}
		}
	}

	Model(int i, int i_231_, int i_232_) {
		this.textureCoords = new byte[i_231_];
		this.indices2 = new int[i_231_];
		this.faceColors = new short[i_231_];
		this.indices1 = new int[i_231_];
		this.verticesZ = new int[i];
		this.vertexSkins = new int[i];
		this.faceRenderTypes = new int[i_231_];
		this.faceAlphas = new int[i_231_];
		this.faceTextures = new short[i_231_];
		if ((i_232_ ^ 0xffffffff) < -1) {
			this.anIntArray1366 = new int[i_232_];
			this.texIndices3 = new short[i_232_];
			this.texTriangleZ = new int[i_232_];
			this.anIntArray1335 = new int[i_232_];
			this.aByteArray1330 = new byte[i_232_];
			this.f_fb = new int[i_232_];
			this.textureRenderTypes = new byte[i_232_];
			this.texTriangleY = new int[i_232_];
			this.f_ab = new byte[i_232_];
			this.texIndices1 = new short[i_232_];
			this.texTriangleX = new int[i_232_];
			this.texIndices2 = new short[i_232_];
		}
		this.faceRenderPriorities = new byte[i_231_];
		this.faceSkins = new int[i_231_];
		this.indices3 = new int[i_231_];
		this.verticesY = new int[i];
		this.verticesX = new int[i];
	}

	Model(Model[] model_segments, int total) {
		try {
			this.vertices = 0;
			this.texture_faces = 0;
			this.faces = 0;
			int i_233_ = 0;
			int i_234_ = 0;
			int i_235_ = 0;
			boolean bool = false;
			boolean bool_236_ = false;
			boolean bool_237_ = false;
			boolean bool_238_ = false;
			boolean bool_239_ = false;
			this.priority = (byte) -1;
			boolean bool_240_ = false;
			for (int i_241_ = 0; i_241_ < total; i_241_++) {
				Model constructed_model = model_segments[i_241_];
				if (constructed_model != null) {
					this.texture_faces += ((Model) constructed_model).texture_faces;
					this.vertices += ((Model) constructed_model).vertices;
					this.faces += ((Model) constructed_model).faces;
					if (((Model) constructed_model).aClass125Array1583 != null)
						i_235_ += (((Model) constructed_model).aClass125Array1583).length;
					bool = bool | (((Model) constructed_model).faceRenderTypes != null);
					if (((Model) constructed_model).aClass303Array1547 != null)
						i_234_ += (((Model) constructed_model).aClass303Array1547).length;
					if (((Model) constructed_model).aClass19Array1364 != null)
						i_233_ += (((Model) constructed_model).aClass19Array1364).length;
					bool_239_ = bool_239_ | ((Model) constructed_model).faceTextures != null;
					bool_240_ = bool_240_ | (((Model) constructed_model).faceSkins) != null;
					bool_238_ = bool_238_ | ((Model) constructed_model).textureCoords != null;
					bool_237_ = bool_237_ | (((Model) constructed_model).faceAlphas) != null;
					if (((Model) constructed_model).faceRenderPriorities != null)
						bool_236_ = true;
					else {
						if ((this.priority ^ 0xffffffff) == 0)
							this.priority = ((Model) constructed_model).priority;
						if ((this.priority ^ 0xffffffff) != (((Model) constructed_model).priority
								^ 0xffffffff))
							bool_236_ = true;
					}
				}
			}
			if (bool_240_)
				this.faceSkins = new int[this.faces];
			if (bool_239_)
				this.faceTextures = new short[this.faces];
			this.vertexSkins = new int[this.vertices];
			this.aShortArray1338 = new short[this.faces];
			if ((i_233_ ^ 0xffffffff) < -1)
				this.aClass19Array1364 = new Class19[i_233_];
			this.verticesZ = new int[this.vertices];
			if (bool_237_)
				this.faceAlphas = new int[this.faces];
			if ((i_235_ ^ 0xffffffff) < -1)
				this.aClass125Array1583 = new SomeClass[i_235_];
			this.indices3 = new int[this.faces];
			this.verticesY = new int[this.vertices];
			this.indices2 = new int[this.faces];
			if (bool_236_)
				this.faceRenderPriorities = new byte[this.faces];
			if (bool_238_)
				this.textureCoords = new byte[this.faces];
			if ((this.texture_faces ^ 0xffffffff) < -1) {
				this.f_ab = new byte[this.texture_faces];
				this.texIndices3 = new short[this.texture_faces];
				this.texTriangleX = new int[this.texture_faces];
				this.anIntArray1366 = new int[this.texture_faces];
				this.aByteArray1330 = new byte[this.texture_faces];
				this.texTriangleY = new int[this.texture_faces];
				this.texTriangleZ = new int[this.texture_faces];
				this.texIndices2 = new short[this.texture_faces];
				this.texIndices1 = new short[this.texture_faces];
				this.f_fb = new int[this.texture_faces];
				this.textureRenderTypes = new byte[this.texture_faces];
				this.anIntArray1335 = new int[this.texture_faces];
			}
			this.aShortArray1351 = new short[this.vertices];
			if (i_234_ > 0)
				this.aClass303Array1547 = new Class303[i_234_];
			if (bool)
				this.faceRenderTypes = new int[this.faces];
			this.indices1 = new int[this.faces];
			this.verticesX = new int[this.vertices];
			this.faceColors = new short[this.faces];
			i_234_ = 0;
			this.vertices = 0;
			this.texture_faces = 0;
			i_233_ = 0;
			this.faces = 0;
			i_235_ = 0;
			for (int i_243_ = 0; total > i_243_; i_243_++) {
				short i_244_ = (short) (1 << i_243_);
				Model class103_245_ = model_segments[i_243_];
				if (class103_245_ != null) {
					if (((Model) class103_245_).aClass125Array1583 != null) {
						for (int i_246_ = 0; i_246_ < (((Model) class103_245_).aClass125Array1583).length; i_246_++) {
							SomeClass class131 = (((Model) class103_245_).aClass125Array1583[i_246_]);
							this.aClass125Array1583[i_235_++] = class131.method890(true,
									((this.faces) + (((SomeClass) class131).anInt1823)));
						}
					}
					for (int i_247_ = 0; i_247_ < ((Model) class103_245_).faces; i_247_++) {
						if (bool && (((Model) class103_245_).faceRenderTypes != null))
							this.faceRenderTypes[(this.faces)] = (((Model) class103_245_).faceRenderTypes[i_247_]);
						if (bool_236_) {
							if (((Model) class103_245_).faceRenderPriorities != null)
								this.faceRenderPriorities[this.faces] = (((Model) class103_245_).faceRenderPriorities[i_247_]);
							else
								this.faceRenderPriorities[this.faces] = ((Model) class103_245_).priority;
						}
						if (bool_237_ && (((Model) class103_245_).faceAlphas != null))
							this.faceAlphas[(this.faces)] = (((Model) class103_245_).faceAlphas[i_247_]);
						if (bool_239_) {
							if (((Model) class103_245_).faceTextures == null)
								this.faceTextures[(this.faces)] = (short) -1;
							else
								this.faceTextures[(this.faces)] = ((Model) class103_245_).faceTextures[i_247_];
						}
						if (bool_240_) {
							if (((Model) class103_245_).faceSkins == null)
								this.faceSkins[this.faces] = -1;
							else
								this.faceSkins[this.faces] = (((Model) class103_245_).faceSkins[i_247_]);
						}
						this.indices1[(this.faces)] = (short) method650(class103_245_,
								(((Model) class103_245_).indices1[i_247_]), 107, i_244_);
						this.indices2[(this.faces)] = (short) method650(class103_245_,
								(((Model) class103_245_).indices2[i_247_]), -78, i_244_);
						this.indices3[(this.faces)] = (short) method650(class103_245_,
								(((Model) class103_245_).indices3[i_247_]), -58, i_244_);
						this.aShortArray1338[(this.faces)] = i_244_;
						this.faceColors[(this.faces)] = (((Model) class103_245_).faceColors[i_247_]);
						this.faces++;
					}
					if (((Model) class103_245_).aClass19Array1364 != null) {
						for (int i_248_ = 0; ((((Model) class103_245_).aClass19Array1364).length > i_248_); i_248_++) {
							int i_249_ = method650(class103_245_,
									((Class19) (((Model) class103_245_).aClass19Array1364[i_248_])).anInt301, -127,
									i_244_);
							int i_250_ = method650(class103_245_,
									((Class19) (((Model) class103_245_).aClass19Array1364[i_248_])).anInt309, -95,
									i_244_);
							int i_251_ = method650(class103_245_,
									((Class19) (((Model) class103_245_).aClass19Array1364[i_248_])).anInt292, 113,
									i_244_);
							this.aClass19Array1364[i_233_] = ((Model) class103_245_).aClass19Array1364[i_248_]
									.method187(i_249_, i_250_, i_251_, -128);
							i_233_++;
						}
					}
					if (((Model) class103_245_).aClass303Array1547 != null) {
						for (int i_252_ = 0; i_252_ < (((Model) class103_245_).aClass303Array1547).length; i_252_++) {
							int i_253_ = method650(class103_245_,
									((Class303) (((Model) class103_245_).aClass303Array1547[i_252_])).anInt2289, 111,
									i_244_);
							this.aClass303Array1547[i_234_] = ((Model) class103_245_).aClass303Array1547[i_252_]
									.method1076(i_253_, false);
							i_234_++;
						}
					}
				}
			}
			this.anInt1573 = this.vertices;
			int i_254_ = 0;
			for (int i_255_ = 0; i_255_ < total; i_255_++) {
				short i_256_ = (short) (1 << i_255_);
				Model class103_257_ = model_segments[i_255_];
				if (class103_257_ != null) {
					for (int i_258_ = 0; ((i_258_ ^ 0xffffffff) > (((Model) class103_257_).faces
							^ 0xffffffff)); i_258_++) {
						if (bool_238_)
							this.textureCoords[i_254_++] = (byte) (((((Model) class103_257_).textureCoords == null)
									|| (((Model) class103_257_).textureCoords[i_258_]) == -1) ? -1
											: ((((Model) class103_257_).textureCoords[i_258_])
													+ this.texture_faces));
					}
					for (int i_259_ = 0; ((Model) class103_257_).texture_faces > i_259_; i_259_++) {
						byte i_260_ = (this.textureRenderTypes[this.texture_faces] = ((Model) class103_257_).textureRenderTypes[i_259_]);
						if ((i_260_ ^ 0xffffffff) == -1) {
							this.texIndices1[this.texture_faces] = (short) method650(
									class103_257_, (((Model) class103_257_).texIndices1[i_259_]), -55,
									i_256_);
							this.texIndices2[this.texture_faces] = (short) method650(
									class103_257_, (((Model) class103_257_).texIndices2[i_259_]), -46,
									i_256_);
							this.texIndices3[this.texture_faces] = (short) method650(
									class103_257_, (((Model) class103_257_).texIndices3[i_259_]), 103,
									i_256_);
						}
						if ((i_260_ ^ 0xffffffff) <= -2 && (i_260_ ^ 0xffffffff) >= -4) {
							this.texIndices1[this.texture_faces] = (((Model) class103_257_).texIndices1[i_259_]);
							this.texIndices2[this.texture_faces] = (((Model) class103_257_).texIndices2[i_259_]);
							this.texIndices3[this.texture_faces] = (((Model) class103_257_).texIndices3[i_259_]);
							this.texTriangleX[(this.texture_faces)] = (((Model) class103_257_).texTriangleX[i_259_]);
							this.texTriangleY[(this.texture_faces)] = (((Model) class103_257_).texTriangleY[i_259_]);
							this.texTriangleZ[(this.texture_faces)] = (((Model) class103_257_).texTriangleZ[i_259_]);
							this.aByteArray1330[(this.texture_faces)] = (((Model) class103_257_).aByteArray1330[i_259_]);
							this.f_ab[this.texture_faces] = ((Model) class103_257_).f_ab[i_259_];
							this.f_fb[this.texture_faces] = ((Model) class103_257_).f_fb[i_259_];
						}
						if ((i_260_ ^ 0xffffffff) == -3) {
							this.anIntArray1335[(this.texture_faces)] = (((Model) class103_257_).anIntArray1335[i_259_]);
							this.anIntArray1366[(this.texture_faces)] = (((Model) class103_257_).anIntArray1366[i_259_]);
						}
						this.texture_faces++;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static {
		new MultilingualString("From", "Von:", "De", "De");
		anInt1365 = 0;
		anInt1374 = 0;
		f_gb = new String[200];
		aClass13_1369 = new IncomingPacket(67, 10);
	}
}
