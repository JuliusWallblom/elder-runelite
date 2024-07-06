package io;

import java.net.http.HttpResponse;

import io.cache.Cache;
import io.cache.Revision;

class MapRegion {

	static int anInt3639;
	static int anInt3640;
	byte[][][] tileLighting;
	static int anInt3642;
	int regionSizeY;
	static int anInt3644;
	static int anInt3645;
	private byte[][][] tileShapes;
	static MultilingualString aClass67_3647 = new MultilingualString("Connection lost.", "Verbindung abgebrochen.",
			"Connexion perdue.", "Conex\u00e3o perdida.");
	static long[][][] aLongArrayArrayArray3648;
	short[][][] aByteArrayArrayArray3649;
	private int[] anIntArray3650;
	private short[][][] tileOverlays;
	static int anInt3652;
	static int anInt3653;
	static float aFloat3654;
	private short[][][] tileUnderlays;
	private byte[][][] tileTypes;
	private int[] anIntArray3657 = { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };
	boolean aBool3658;
	private OverlayLoader aClass175_3659;
	static int anInt3660;
	int regionSizeX;
	static int anInt3662;
	static Class191 aClass191_3663;
	int[][][] tileHeights;
	static int anInt3665 = 1;
	static int anInt3666;
	private UnderlayLoader aClass105_3667;
	static int anInt3668;
	static int anInt3669;
	int anInt3670;
	static int[][] xteas;
	static IncomingPacket DECODE_MAP_REGION_IN = new IncomingPacket(13, -2);
	static IncomingPacket DYNAMIC_MAP_REGION_PACKET = new IncomingPacket(59, -2);
	static int[] map_ul;
	static int[] map_um;
	static int[] map_l;
	static int[] map_m;
	static int[] region_ids;
	static boolean aBool6180 = true;
	static boolean[][] aBoolArrayArray6312;
	static int[] anIntArray2717 = new int[6];
	static int[] chromas;
	static int[] anIntArray128;
	static int[] luminances;
	static int[] saturations;
	static int[] hues;
	static int anInt3671;
	static int anInt3672;

	public static CacheIndex get_map_index(final int revision, final int region_id) {
		if (revision == 193) {
			return Cache.get_index(Revision.OSRS, "maps");
		} else {
			return Cache.get_index(Revision.PRE_EOC_634, "maps");
		}
	}

	public static CacheIndex get_map_index(final int region_id) {
		return Cache.get_index(Revision.OSRS, "maps");
	}

	public static Revision get_revision_by_region() {
		return Revision.OSRS;
	}

	final void method1647(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				for (int i_4_ = 0; i_4_ < anInt3670; i_4_++)
					method1648(true, i_3_, i_4_, i_2_, i_1_, i);
				anInt3644++;
				if (i_0_ == 228)
					break;
				method1651(84, -38, -54, null, -91, null, -103);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("wj.H(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1648(boolean bool, int width, int level, int height, int startX, int startY) {
		try {
			// Iterate over the specified tile range
			for (int x = startX; x < startX + width; x++) {
				for (int y = startY; y < startY + height; y++) {
					// Check if the coordinates are within bounds
					if (isValidCoordinate(x, y)) {
						// Set the tile height based on the level
						tileHeights[level][y][x] = (level <= 0) ? 0 : tileHeights[level - 1][y][x] - 240;
					}
				}
			}

			anInt3671++; // Increment some internal counter, presumably for tracking purposes

			// Adjust the heights at the boundaries if necessary
			adjustBoundaryHeights(level, startX, startY, width, height);

			// Handle special cases based on position and level
			if (isValidCoordinate(startX, startY)) {
				if (level > 0) {
					handleSpecialCasesForNonZeroLevel(level, startX, startY);
				} else {
					handleSpecialCasesForZeroLevel(level, startX, startY);
				}
			}
		} catch (RuntimeException runtimeException) {
			// Handle any exceptions by rethrowing a wrapped exception
			throw Class193.method1272(runtimeException,
					"wj.B(" + bool + ',' + width + ',' + level + ',' + height + ',' + startX + ',' + startY + ')');
		}
	}

	/**
	 * Helper method to check if the given coordinates are within valid bounds.
	 */
	private boolean isValidCoordinate(int x, int y) {
		return x >= 0 && x < regionSizeX && y >= 0 && y < regionSizeY;
	}

	/**
	 * Adjusts the heights at the boundaries if they fall within the bounds.
	 */
	private void adjustBoundaryHeights(int level, int startX, int startY, int width, int height) {
		if (startY > 0 && startY < regionSizeX) {
			// Adjust heights for the left boundary (startX + width, all y)
			for (int x = startX + 1; x < startX + width; x++) {
				if (isValidCoordinate(x, startY)) {
					tileHeights[level][startY][x] = tileHeights[level][startY - 1][x];
				}
			}
		}
		if (startX > 0 && startX < regionSizeY) {
			// Adjust heights for the top boundary (startY + height, all x)
			for (int y = startY + 1; y < startY + height; y++) {
				if (isValidCoordinate(startX, y)) {
					tileHeights[level][y][startX] = tileHeights[level][y][startX - 1];
				}
			}
		}
	}

	/**
	 * Handles special cases for non-zero levels.
	 */
	private void handleSpecialCasesForNonZeroLevel(int level, int startX, int startY) {
		if (startX > 0 && tileHeights[level - 1][startX - 1][startY] != tileHeights[level][startX - 1][startY]) {
			tileHeights[level][startX][startY] = tileHeights[level][startX - 1][startY];
		} else if (startY > 0 && tileHeights[level - 1][startX][startY - 1] != tileHeights[level][startX][startY - 1]) {
			tileHeights[level][startX][startY] = tileHeights[level][startX][startY - 1];
		} else if (startX > 0 && startY > 0
				&& tileHeights[level - 1][startX - 1][startY - 1] != tileHeights[level][startX - 1][startY - 1]) {
			tileHeights[level][startX][startY] = tileHeights[level][startX - 1][startY - 1];
		}
	}

	/**
	 * Handles special cases for the zero level.
	 */
	private void handleSpecialCasesForZeroLevel(int level, int startX, int startY) {
		if (startX > 0 && tileHeights[level][startX - 1][startY] != 0) {
			tileHeights[level][startX][startY] = tileHeights[level][startX - 1][startY];
		} else if (startY > 0 && tileHeights[level][startX][startY - 1] != 0) {
			tileHeights[level][startX][startY] = tileHeights[level][startX][startY - 1];
		} else if (startX > 0 && startY > 0 && tileHeights[level][startX - 1][startY - 1] != 0) {
			tileHeights[level][startX][startY] = tileHeights[level][startX - 1][startY - 1];
		}
	}

	static final int method1649(byte i, CacheIndex class_fs, CacheIndex class_fs_13_) {
		try {
			anInt3653++;
			int i_14_ = 0;
			if (class_fs_13_.method112(-1, Buffer.f_eb))
				i_14_++;
			if (class_fs_13_.method112(-1, Class36.f_ib))
				i_14_++;
			if (i > -42)
				return 1;
			if (class_fs_13_.method112(-1, Class259_Sub1.anInt4510))
				i_14_++;
			if (class_fs.method112(-1, Buffer.f_eb))
				i_14_++;
			if (class_fs.method112(-1, Class36.f_ib))
				i_14_++;
			if (class_fs.method112(-1, Class259_Sub1.anInt4510))
				i_14_++;
			return i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.G(" + i + ',' + (class_fs != null ? "{...}" : "null") + ','
					+ (class_fs_13_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1650(int i, int[][] is, int i_15_) {
		try {
			anInt3666++;
			int[][] is_16_ = tileHeights[i_15_];
			if (i != -1)
				method1648(false, -67, 54, -32, -82, 123);
			for (int i_17_ = 0; ((regionSizeX + 1 ^ 0xffffffff) < (i_17_ ^ 0xffffffff)); i_17_++) {
				for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (1 + regionSizeY ^ 0xffffffff)); i_18_++)
					is_16_[i_17_][i_18_] += is[i_17_][i_18_];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wj.C(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_15_ + ')'));
		}
	}

	final void method1651(int i, int offsetX, int offsetY, Buffer stream, int baseX, CollisionMap[] collisionMaps,
			int baseY) {
		try {
			// Incrementing the method call counter (presumably for debugging or tracking)
			anInt3640++;

			// Checking the input parameter and avoiding unnecessary code execution
			if (i > -75) {
				aByteArrayArrayArray3649 = null;
			}

			// If aBool3658 is false, perform the collision map setup
			if (!aBool3658) {
				for (int layer = 0; layer < 4; layer++) {
					CollisionMap collisionMap = collisionMaps[layer];
					for (int x = 0; x < 64; x++) {
						for (int y = 0; y < 64; y++) {
							int globalX = baseX + x;
							int globalY = baseY + y;
							if (globalX >= 0 && globalX < regionSizeX && globalY >= 0 && globalY < regionSizeY) {
								collisionMap.method1309(globalX, globalY, 99);
							}
						}
					}
				}
			}

			// Calculate the new base coordinates with offsets
			int newBaseX = baseX + offsetX;
			int newBaseY = baseY + offsetY;

			// Load terrain for each layer
			for (int layer = 0; layer < anInt3670; layer++) {
				for (int x = 0; x < 64; x++) {
					for (int y = 0; y < 64; y++) {
						loadTerrain(baseY + y, newBaseY + y, baseX + x, newBaseX + x, 0, false, layer, 0, 0, 19108,
								stream);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	final void method1652(int[][][] tileHeightOverrides, byte someByte, CollisionMap[] collisionMaps,
			SceneGraph sceneGraph) {
		try {
			// First part: Handle tile render flags
			if (!aBool3658) {
				processTileRenderFlags(collisionMaps);
			}

			anInt3660++; // Increment some internal counter, presumably for tracking purposes

			// Second part: Process layers
			for (int layer = 0; layer < anInt3670; layer++) {
				int layerFlags1 = 0;
				int layerFlags2 = 0;

				// Calculate layer-specific flags based on various conditions
				if (!aBool3658) {
					if (Class174.aBool2462) {
						layerFlags2 |= 0x8; // Specific flag for a certain condition
					}
					if (Class132.aBool1833) {
						layerFlags1 |= 0x2; // Another specific flag for a different condition
					}
					if (Stream_Sub1.anInt5855 != 0) {
						if (layer == 0 || Class59_Sub5_Sub1.aBool5828) {
							layerFlags2 |= 0x10; // Additional flag when specific conditions are met
						}
						layerFlags1 |= 0x1; // General flag
					}
				}

				// Add more flags based on other conditions
				if (Class132.aBool1833) {
					layerFlags2 |= 0x7; // Composite flag for another condition
				}
				if (!Class_w.aBool6387) {
					layerFlags2 |= 0x20; // Composite flag for another condition
				}

				// Get the height map to use for this layer, falling back to default if
				// necessary
				int[][] heightMap = (tileHeightOverrides != null && layer < tileHeightOverrides.length)
						? tileHeightOverrides[layer]
						: tileHeights[layer];

				// Generate the scene for this layer with the calculated flags and the height
				// map
				Class246_Sub28_Sub24.method2739(layer,
						sceneGraph.method1738(regionSizeX, regionSizeY, tileHeights[layer], heightMap, 128, layerFlags1,
								layerFlags2));
			}

			// Error handling and other necessary code
		} catch (RuntimeException runtimeException) {
			throw Class193.method1272(runtimeException,
					"wj.A(" + (tileHeightOverrides != null ? "{...}" : "null") + ',' + someByte + ','
							+ (collisionMaps != null ? "{...}" : "null") + ',' + (sceneGraph != null ? "{...}" : "null")
							+ ')');
		}
	}

	/**
	 * Processes tile render flags to update collision maps.
	 */
	private void processTileRenderFlags(CollisionMap[] collisionMaps) {
		for (int level = 0; level < 4; level++) {
			for (int x = 0; x < regionSizeX; x++) {
				for (int y = 0; y < regionSizeY; y++) {
					// Check if the current tile has the specific render flag set
					if ((Class45.tileRenderFlags[level][x][y] & 0x1) != 0) {
						int adjustedLevel = level;
						// Adjust the level if a certain condition is met
						if ((Class45.tileRenderFlags[1][x][y] & 0x2) != 0) {
							adjustedLevel--;
						}
						// Update the collision map for the adjusted level if it's valid
						if (adjustedLevel >= 0) {
							collisionMaps[adjustedLevel].method1323(y, 2097152, x);
						}
					}
				}
			}
		}
	}

	final void createRegionScene(int i, Class210 class210, Class210 class210_41_, SceneGraph class260) {
		try {
			anInt3642++;
			if (hues == null || (hues.length != regionSizeY)) {
				saturations = new int[regionSizeY];
				luminances = new int[regionSizeY];
				anIntArray128 = new int[regionSizeY];
				chromas = new int[regionSizeY];
				hues = new int[regionSizeY];
			}
			int[][] paletteIndices = (new int[regionSizeX][regionSizeY]);
			for (int l = 0; ((anInt3670 ^ 0xffffffff) < (l ^ 0xffffffff)); l++) {
				for (int i_43_ = 0; ((i_43_ ^ 0xffffffff) > (regionSizeY ^ 0xffffffff)); i_43_++) {
					hues[i_43_] = 0;
					saturations[i_43_] = 0;
					luminances[i_43_] = 0;
					chromas[i_43_] = 0;
					anIntArray128[i_43_] = 0;
				}
				for (int x = -5; ((x ^ 0xffffffff) > (regionSizeX ^ 0xffffffff)); x++) {
					for (int z = 0; ((z ^ 0xffffffff) > (regionSizeY ^ 0xffffffff)); z++) {
						int xForwardOffset = x + 5;
						if (regionSizeX > xForwardOffset) {
							int underlayId = ((tileUnderlays[l][xForwardOffset][z]) & 0x7fff);
							if (underlayId > 0) {
								FloorDefinition flo = aClass175_3659.list(-18411, underlayId - 1);
								hues[z] += flo.blendHue;
								saturations[z] += flo.saturation;
								luminances[z] += flo.luminance;
								chromas[z] += flo.blendHueMultiplier;
								anIntArray128[z]++;
							}
						}
						int xBackwardOffset = -5 + x;
						if (xBackwardOffset >= 0) {
							int underlayId = 0x7fff & (tileUnderlays[l][xBackwardOffset][z]);
							if ((underlayId ^ 0xffffffff) < -1) {
								FloorDefinition flo = aClass175_3659.list(i + -39890, underlayId - 1);
								hues[z] -= flo.blendHue;
								saturations[z] -= flo.saturation;
								luminances[z] -= flo.luminance;
								chromas[z] -= flo.blendHueMultiplier;
								anIntArray128[z]--;
							}
						}
					}
					if ((x ^ 0xffffffff) <= -1) {
						int hueSum = 0;
						int saturationSum = 0;
						int lightnessSum = 0;
						int dividerSum = 0;
						int sizeSum = 0;
						for (int z = -5; regionSizeY > z; z++) {
							int i_56_ = 5 + z;
							if ((i_56_ ^ 0xffffffff) > (regionSizeY ^ 0xffffffff)) {
								saturationSum += saturations[i_56_];
								sizeSum += anIntArray128[i_56_];
								hueSum += hues[i_56_];
								dividerSum += chromas[i_56_];
								lightnessSum += luminances[i_56_];
							}
							int zBackwardOffset = -5 + z;
							if (zBackwardOffset >= 0) {
								dividerSum -= chromas[zBackwardOffset];
								hueSum -= hues[zBackwardOffset];
								sizeSum -= anIntArray128[zBackwardOffset];
								saturationSum -= saturations[zBackwardOffset];
								lightnessSum -= luminances[zBackwardOffset];
							}
							if (z >= 0 && (dividerSum ^ 0xffffffff) < -1 && (sizeSum ^ 0xffffffff) < -1)
								paletteIndices[x][z] = FloorDefinition.hsl24to16(saturationSum / sizeSum,
										(hueSum * 256 / dividerSum), i - 21477, lightnessSum / sizeSum);
						}
					}
				}
				if (Class31.blend_ground)
					method1656(l, l == 0 ? class210 : null, paletteIndices, class260, (byte) -73,
							Class59_Sub3_Sub4.aClass210Array6993[l], ((l ^ 0xffffffff) == -1 ? class210_41_ : null));
				else
					method1655(class260, ((l ^ 0xffffffff) != -1 ? null : class210_41_), l != 0 ? null : class210,
							paletteIndices, 8228, l, Class59_Sub3_Sub4.aClass210Array6993[l]);

				tileUnderlays[l] = null;
				tileOverlays[l] = null;
				tileShapes[l] = null;
				tileTypes[l] = null;
			}
			if (!aBool3658) {
				if (Stream_Sub1.anInt5855 != 0)
					Class246_Sub28_Sub25.method2750();
				if (Class132.aBool1833)
					Class104.method670();
			}
			if (i == 21479) {
				for (int i_58_ = 0; anInt3670 > i_58_; i_58_++)
					Class59_Sub3_Sub4.aClass210Array6993[i_58_].ca();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.M(" + i + ',' + (class210 != null ? "{...}" : "null") + ','
					+ (class210_41_ != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1103(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	static final int method305(int var0, int var1) {
		int var2 = method1103(var0 - 1, var1 - 1) + method1103(var0 + 1, var1 - 1) + method1103(var0 - 1, 1 + var1)
				+ method1103(var0 + 1, 1 + var1);
		int var3 = method1103(var0 - 1, var1) + method1103(var0 + 1, var1) + method1103(var0, var1 - 1)
				+ method1103(var0, 1 + var1);
		int var4 = method1103(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	static final int method700(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - MathUtils.COSINE[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}

	static final int method66(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = method305(var3, var5);
		int var8 = method305(var3 + 1, var5);
		int var9 = method305(var3, var5 + 1);
		int var10 = method305(var3 + 1, var5 + 1);
		int var11 = method700(var7, var8, var4, var2);
		int var12 = method700(var9, var10, var4, var2);
		return method700(var11, var12, var6, var2);
	}

	static boolean method973(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104;
	}

	private final void loadTerrain(int var3, int i_59_, int var2, int i_61_, int i_62_, boolean bool, int var1,
			int i_64_,
			int i_65_, int i_66_, Buffer stream) {
		try {
			int attribute;
			if (i_66_ != 19108)
				aClass175_3659 = null;
			anInt3652++;
			if (i_62_ == 1)
				i_64_ = 1;
			else if ((i_62_ ^ 0xffffffff) == -3) {
				i_65_ = 1;
				i_64_ = 1;
			} else if (i_62_ == 3)
				i_65_ = 1;
			// Check if var2 and var3 are out of the valid region bounds
			if (var2 < 0 || var2 >= regionSizeX || var3 < 0 || var3 >= regionSizeY) {
				// Process stream attributes until a stopping condition is met
				while (true) {
					attribute = stream.readUnsignedShort();

					if (attribute == 0) {
						// Exit the loop if attribute is 0
						break;
					} else if (attribute == 1) {
						// Read an additional byte and exit the loop if attribute is 1
						stream.readUnsignedByte();
						break;
					} else if (attribute <= 49) {
						// Read a short value for attributes between 2 and 49
						stream.readShort();
					}
				}
			} else {
				if (method973(var1, var2, var3)) {
					Class45.tileRenderFlags[var1][var2][var3] = (byte) 0;
					while (true) {
						attribute = stream.readUnsignedShort();
						if (attribute == 0) {
							if (var1 == 0) {
								int[] var8 = tileHeights[0][var2];
								int var11 = i_61_ + 932731;
								int var12 = i_59_ + 556238;
								int var13 = method66(var11 + 45365, var12 + 91923, 4) - 128
										+ (method66(var11 + 10294, 37821 + var12, 2) - 128 >> 1)
										+ (method66(var11, var12, 1) - 128 >> 2);
								var13 = (int) (0.3D * (double) var13) + 35;
								if (var13 < 10) {
									var13 = 10;
								} else if (var13 > 60) {
									var13 = 60;
								}

								var8[var3] = -var13 * 8;
							} else {
								tileHeights[var1][var2][var3] = tileHeights[var1 - 1][var2][var3] - 240;
							}
							break;
						}
						if (attribute == 1) {
							int var14 = stream.readUnsignedByte();
							if (var14 == 1) {
								var14 = 0;
							}
							if (var1 == 0) {
								tileHeights[0][var2][var3] = -var14 * 8;
							} else {
								tileHeights[var1][var2][var3] = tileHeights[var1 - 1][var2][var3] - var14 * 8;
							}
							break;
						}
						if (attribute <= 49) {
							tileOverlays[var1][var2][var3] = (short) stream.readShort();
							tileShapes[var1][var2][var3] = (byte) ((attribute - 2) / 4);
							tileTypes[var1][var2][var3] = (byte) (attribute - 2 & 3);
						} else if (attribute <= 81) {
							Class45.tileRenderFlags[var1][var2][var3] = (byte) (attribute - 49);
						} else if (!bool) {
							tileUnderlays[var1][var2][var3] = (short) (attribute - 81);
						}
					}
				} else {
					while (true) {
						attribute = stream.readUnsignedShort();
						if (attribute == 0) {
							break;
						}

						if (attribute == 1) {
							stream.readUnsignedByte();
							break;
						}

						if (attribute <= 49) {
							stream.readShort();
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private final void method1655(SceneGraph class260, Class210 class210, Class210 class210_70_, int[][] is, int i,
			int i_71_, Class210 class210_72_) {
		try {
			anInt3639++;
			if (i != 8228)
				aFloat3654 = 0.76392615F;
			for (int x = 0; ((x ^ 0xffffffff) > (regionSizeX ^ 0xffffffff)); x++) {
				for (int z = 0; ((z ^ 0xffffffff) > (regionSizeY ^ 0xffffffff)); z++) {
					if ((Class_q_Sub1.anInt6664 ^ 0xffffffff) == 0
							|| SwitchInt.method2179(x, Class_q_Sub1.anInt6664, (byte) 56, i_71_, z)) {
						byte i_75_ = tileShapes[i_71_][x][z];
						byte i_76_ = tileTypes[i_71_][x][z];
						int i_77_ = 0x7fff & (tileOverlays[i_71_][x][z]);
						int i_78_ = (tileUnderlays[i_71_][x][z] & 0x7fff);
						PacketsDecoder class_is = ((i_77_ ^ 0xffffffff) == -1 ? null
								: aClass105_3667.method703(4, i_77_ - 1));
						FloorDefinition flo = (i_78_ == 0 ? null : aClass175_3659.list(i ^ ~0x67ce, -1 + i_78_));
						int i_79_ = 0;
						int i_80_ = 0;
						if ((i_75_ ^ 0xffffffff) != -1) {
							i_80_ = (class_is == null ? 0 : Class260_Sub2.f_be[i_75_]);
							i_79_ = (flo != null ? Class120.anIntArray1652[i_75_] : 0);
						} else if (class_is == null) {
							if (flo != null)
								i_79_ = Class260_Sub2.f_be[i_75_];
						} else
							i_80_ = Class260_Sub2.f_be[i_75_];
						int i_81_ = i_79_ + i_80_;
						int i_82_ = 0;
						if (i_81_ != 0) {
							int[] is_83_ = new int[i_81_];
							int[] is_84_ = new int[i_81_];
							int[] is_85_ = new int[i_81_];
							int[] is_86_ = new int[i_81_];
							boolean bool = false;
							if (class_is == null || ((((PacketsDecoder) class_is).anInt284 ^ 0xffffffff) == 0
									&& (((PacketsDecoder) class_is).anInt271 ^ 0xffffffff) == 0
									&& (((PacketsDecoder) class_is).anInt279 ^ 0xffffffff) == 0)) {
								for (int i_87_ = 0; ((i_87_ ^ 0xffffffff) > (i_80_ ^ 0xffffffff)); i_87_++) {
									is_83_[i_82_] = -1;
									i_82_++;
								}
							} else {
								int i_88_ = (!class260.method1684() ? ((PacketsDecoder) class_is).anInt276
										: ((PacketsDecoder) class_is).anInt279);
								if (MapRegion.aBool6180)
									i_88_ = -1;
								for (int i_89_ = 0; ((i_89_ ^ 0xffffffff) > (i_80_ ^ 0xffffffff)); i_89_++) {
									is_85_[i_82_] = i_88_;
									is_86_[i_82_] = ((PacketsDecoder) class_is).anInt275;
									if ((((PacketsDecoder) class_is).anInt284 ^ 0xffffffff) != 0)
										is_83_[i_82_] = ((PacketsDecoder) class_is).anInt284;
									else
										is_83_[i_82_] = -1;
									if ((((PacketsDecoder) class_is).anInt271 ^ 0xffffffff) == 0)
										is_84_[i_82_] = -1;
									else {
										is_84_[i_82_] = ((PacketsDecoder) class_is).anInt271;
										bool = true;
									}
									i_82_++;
								}
								if (!aBool3658 && (i_71_ ^ 0xffffffff) == -1)
									Class41.method287(x, z, ((PacketsDecoder) class_is).anInt277,
											8 * ((PacketsDecoder) class_is).anInt286,
											((PacketsDecoder) class_is).anInt287);
							}
							if (!bool)
								is_84_ = null;
							if (flo == null) {
								for (int i_90_ = 0; i_90_ < i_79_; i_90_++) {
									is_83_[i_82_] = -1;
									i_82_++;
								}
							} else {
								int i_91_ = ((FloorDefinition) flo).texture;
								if (MapRegion.aBool6180)
									i_91_ = -1;
								for (int i_92_ = 0; i_79_ > i_92_; i_92_++) {
									is_85_[i_82_] = i_91_;
									is_86_[i_82_] = ((FloorDefinition) flo).anInt2924;
									is_83_[i_82_] = is[x][z];
									if (is_84_ != null)
										is_84_[i_82_] = -1;
									i_82_++;
								}
							}
							int i_93_ = anIntArray3650.length;
							int[] is_94_ = new int[i_93_];
							int[] is_95_ = new int[i_93_];
							int[] is_96_ = class210_70_ != null ? new int[i_93_] : null;
							int[] is_97_ = (class210_70_ == null && class210 == null ? null : new int[i_93_]);
							for (int i_98_ = 0; (i_93_ ^ 0xffffffff) < (i_98_ ^ 0xffffffff); i_98_++) {
								int i_99_ = anIntArray3650[i_98_];
								int i_100_ = anIntArray3657[i_98_];
								if ((i_76_ ^ 0xffffffff) != -1) {
									if ((i_76_ ^ 0xffffffff) == -2) {
										int i_101_ = i_99_;
										is_94_[i_98_] = i_100_;
										is_95_[i_98_] = 128 + -i_101_;
									} else if (i_76_ != 2) {
										if (i_76_ == 3) {
											int i_102_ = i_99_;
											is_94_[i_98_] = -i_100_ + 128;
											is_95_[i_98_] = i_102_;
										}
									} else {
										is_94_[i_98_] = -i_99_ + 128;
										is_95_[i_98_] = -i_100_ + 128;
									}
								} else {
									is_94_[i_98_] = i_99_;
									is_95_[i_98_] = i_100_;
								}
								if (is_96_ != null && (MapRegion.aBoolArrayArray6312 != null
										&& MapRegion.aBoolArrayArray6312[i_75_][i_98_])) {
									int i_103_ = (x << 7) - -i_99_;
									int i_104_ = i_99_ + (z << 7);
									is_96_[i_98_] = (class210_70_.a(i_103_, i_104_) + -class210_72_.a(i_103_, i_104_));
								}
								if (is_97_ != null) {
									if (class210_70_ == null || (MapRegion.aBoolArrayArray6312[i_75_][i_98_])) {
										if (class210 != null && !(Class213.aBoolArrayArray2983[i_75_][i_98_])) {
											int i_105_ = (x << 7) - -i_99_;
											int i_106_ = i_99_ + (z << 7);
											is_97_[i_98_] = (class210.a(i_105_, i_106_)
													- class210_72_.a(i_105_, i_106_));
										}
									} else {
										int i_107_ = i_99_ + (x << 7);
										int i_108_ = (z << 7) + i_99_;
										is_97_[i_98_] = (class210_72_.a(i_107_, i_108_)
												- class210_70_.a(i_107_, i_108_));
									}
								}
							}
							int i_109_ = class210_72_.l(x, z);
							int i_110_ = class210_72_.l(1 + x, z);
							int i_111_ = class210_72_.l(1 + x, z + 1);
							int i_112_ = class210_72_.l(x, 1 + z);
							if (i_71_ > 0) {
								boolean bool_113_ = true;
								if ((i_78_ ^ 0xffffffff) == -1 && i_75_ != 0)
									bool_113_ = false;
								if (i_77_ > 0 && class_is != null && !((PacketsDecoder) class_is).aBool290)
									bool_113_ = false;
								if (bool_113_ && (i_110_ ^ 0xffffffff) == (i_109_ ^ 0xffffffff) && i_109_ == i_111_
										&& i_112_ == i_109_)
									tileLighting[i_71_][x][z] = (byte) (Class236.method1523((tileLighting[i_71_][x][z]),
											4));
							}
							int i_114_ = 0;
							int i_115_ = 0;
							int i_116_ = 0;
							if (aBool3658) {
								i_114_ = Entity.method2672(x, z);
								i_115_ = Class133.method899(x, z);
								i_116_ = Class59_Sub4_Sub1.method2638(x, z);
							}
							class210_72_.method1378(x, z, is_94_, is_96_, is_95_, is_97_,
									Class205.anIntArrayArray2889[i_75_], Class246_Sub7_Sub1.anIntArrayArray6081[i_75_],
									Class128_Sub2.anIntArrayArray5566[i_75_], is_83_, is_84_, is_85_, is_86_, i_114_,
									i_115_, i_116_, false);
							VarpType.method596(i_71_, x, z);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private final void method1656(int i, Class210 class210, int[][] paletteIndices, SceneGraph class260, byte i_117_,
			Class210 class210_118_, Class210 class210_119_) {
		try {
			anInt3672++;
			byte[][] overlay_data = tileShapes[i];
			if (i_117_ > -54)
				method1652(null, (byte) 24, null, null);
			byte[][] overlay_type_data = tileTypes[i];
			short[][] underlay_data = tileUnderlays[i];
			short[][] overlay_orientation_data = tileOverlays[i];
			for (int x = 0; ((x ^ 0xffffffff) > (regionSizeX ^ 0xffffffff)); x++) {
				int next_x = (((-1 + regionSizeX ^ 0xffffffff) < (x ^ 0xffffffff)) ? 1 + x : x);
				for (int z = 0; ((z ^ 0xffffffff) > (regionSizeY ^ 0xffffffff)); z++) {
					int next_z = (z >= regionSizeY - 1 ? z : z + 1);
					if (Class_q_Sub1.anInt6664 == -1
							|| SwitchInt.method2179(x, Class_q_Sub1.anInt6664, (byte) 56, i, z)) {
						boolean bool = false;
						boolean bool_128_ = false;
						boolean[] bools = new boolean[4];
						short current_overlay_data = overlay_data[x][z];
						int current_overlay_type_data = overlay_type_data[x][z];
						int next_overlay_orientation_data = 0x7fff & overlay_orientation_data[x][z];
						int current_underlay_data = underlay_data[x][z] & 0x7fff;
						int next_underlay_data = underlay_data[x][next_z] & 0x7fff;
						int last_underlay_data = 0x7fff & underlay_data[next_x][next_z];
						int extra_underlay_data = underlay_data[next_x][z] & 0x7fff;
						if ((next_overlay_orientation_data ^ 0xffffffff) != -1 || current_underlay_data != 0) {
							PacketsDecoder class_is = (next_overlay_orientation_data != 0
									? aClass105_3667.method703(4, -1 + next_overlay_orientation_data)
									: null);
							FloorDefinition class207 = (current_underlay_data != 0
									? aClass175_3659.list(-18411, -1 + current_underlay_data)
									: null);
							if (current_overlay_data == 0 && class_is == null)
								current_overlay_data = (short) 12;
							PacketsDecoder class_is_136_ = class_is;
							if (class_is != null) {
								if (((PacketsDecoder) class_is).anInt284 != -1
										|| ((PacketsDecoder) class_is).anInt271 != -1) {
									if (class207 != null && current_overlay_data != 0)
										bool_128_ = Settings.ground_blending;
								} else {
									class_is_136_ = class_is;
									class_is = null;
								}
							}

							for (int i_143_ = 0; i_143_ < 13; i_143_++) { // vital
								Class82.anIntArray1076[i_143_] = -1;
								Class160.anIntArray2267[i_143_] = 1;
							}
							boolean[] bools_144_ = ((class_is == null || !Settings.ground_blending)
									? IdentityKitLoader.aBoolArrayArray1207[current_overlay_data]
									: Class_a.aBoolArrayArray1182[current_overlay_data]);

							// vital for some edges
							method1659(regionSizeY, 22245, overlay_orientation_data, current_overlay_data, z,
									current_overlay_type_data, bools, regionSizeX, x, class_is, overlay_data, class207,
									overlay_type_data, class260);
							boolean bool_145_ = (class_is != null && ((((PacketsDecoder) class_is).anInt284
									^ 0xffffffff) != (((PacketsDecoder) class_is).anInt271 ^ 0xffffffff)));
							if (!bool_145_) {
								for (int i_146_ = 0; (i_146_ ^ 0xffffffff) > -9; i_146_++) {
									if ((Class82.anIntArray1076[i_146_] ^ 0xffffffff) <= -1
											&& ((InvTypeLoader.anIntArray845[i_146_]
													^ 0xffffffff) != ((Class38_Sub1_Sub1.anIntArray6769[i_146_])
															^ 0xffffffff))) {
										bool_145_ = true;
										break;
									}
								}
							}
							if (!bools_144_[1 - -current_overlay_type_data & 0x3])
								bools[1] = (Class113.method774(bools[1], PacketsDecoder
										.method184((Class160.anIntArray2267[2]), (Class160.anIntArray2267[4])) == 0));
							if (!bools_144_[0x3 & 3 + current_overlay_type_data])
								bools[3] = (Class113.method774(bools[3],
										(PacketsDecoder.method184((Class160.anIntArray2267[6]),
												(Class160.anIntArray2267[0])) ^ 0xffffffff) == -1));
							if (!bools_144_[current_overlay_type_data & 0x3])
								bools[0] = (Class113.method774(bools[0], PacketsDecoder
										.method184((Class160.anIntArray2267[0]), (Class160.anIntArray2267[2])) == 0));
							if (!bools_144_[current_overlay_type_data + 2 & 0x3])
								bools[2] = (Class113.method774(bools[2], PacketsDecoder
										.method184((Class160.anIntArray2267[4]), (Class160.anIntArray2267[6])) == 0));
							if (!bool_128_ && (current_overlay_data == 0 || current_overlay_data == 12)) {
								if (!bools[0] || bools[1] || bools[2] || !bools[3]) {
									if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
										current_overlay_type_data = 3;
										bools[0] = bools[1] = false;
										current_overlay_data = (current_overlay_data != 0 ? (byte) 14 : (byte) 13);
									} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
										current_overlay_type_data = 2;
										current_overlay_data = ((current_overlay_data ^ 0xffffffff) != -1 ? (byte) 14
												: (byte) 13);
										bools[1] = bools[2] = false;
									} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
										current_overlay_type_data = 1;
										current_overlay_data = (current_overlay_data == 0 ? (byte) 13 : (byte) 14);
										bools[2] = bools[3] = false;
									}
								} else {
									bools[0] = bools[3] = false;
									current_overlay_data = ((current_overlay_data ^ 0xffffffff) == -1 ? (byte) 13
											: (byte) 14);
									current_overlay_type_data = 0;
								}
							}
							boolean bool_147_ = (!bool_128_ && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
							int[] is_148_ = null;
							int i_149_;
							int[] is_150_;
							int[] is_151_;
							int i_152_;
							int[] is_153_;

							// vital, crashes without it
							if (!bool_147_) {
								if (!bool_128_) {
									is_148_ = Class102.anIntArrayArray1325[current_overlay_data];
									is_150_ = Class251.anIntArrayArray3555[current_overlay_data];
									is_153_ = (Class246_Sub43.anIntArrayArray5602[current_overlay_data]);
									is_151_ = Class200.anIntArrayArray2853[current_overlay_data];
									i_152_ = (class_is == null ? 0 : (NodeSub.anIntArray3738[current_overlay_data]));
									i_149_ = (class207 == null ? 0
											: (Class246_Sub28_Sub25.anIntArray6706[current_overlay_data]));
								} else {
									i_152_ = class_is != null ? (Class260_Sub2.anIntArray4277[current_overlay_data])
											: 0;
									is_150_ = (Class246_Sub10.anIntArrayArray4083[current_overlay_data]);
									is_151_ = (Class59_Sub2.anIntArrayArray4545[current_overlay_data]);
									is_153_ = (Class59_Sub4_Sub1.anIntArrayArray6315[current_overlay_data]);
									i_149_ = (class207 == null ? 0
											: (Class59_Sub2_Sub2.anIntArray6023[current_overlay_data]));
									is_148_ = (Class246_Sub1_Sub8_Sub1.anIntArrayArray7158[current_overlay_data]);
								}
							} else {
								i_149_ = (class207 == null ? 0 : Class120.anIntArray1652[current_overlay_data]);
								is_150_ = Class205.anIntArrayArray2889[current_overlay_data];
								is_151_ = (Class246_Sub7_Sub1.anIntArrayArray6081[current_overlay_data]);
								i_152_ = (class_is != null ? Class260_Sub2.f_be[current_overlay_data] : 0);
								is_153_ = (Class128_Sub2.anIntArrayArray5566[current_overlay_data]);
							}
							int i_154_ = i_152_ + i_149_;
							if (i_154_ <= 0) {
								VarpType.method596(i, x, z);
							} else {
								if (bools[0])
									i_154_++;
								if (bools[2])
									i_154_++;
								if (bools[1])
									i_154_++;
								if (bools[3])
									i_154_++;
								int i_155_ = 0;
								int i_156_ = 0;
								int i_157_ = i_154_ * 3;
								int[] is_158_ = !bool_145_ ? null : new int[i_157_];
								int[] is_159_ = new int[i_157_];
								int[] is_160_ = new int[i_157_];
								int[] is_161_ = new int[i_157_];
								int[] is_162_ = new int[i_157_];
								int[] is_163_ = new int[i_157_];
								int[] is_164_ = (class210 == null ? null : new int[i_157_]);
								int[] is_165_ = ((class210 == null && class210_119_ == null) ? null : new int[i_157_]);
								int i_166_ = -1;
								int i_167_ = -1;
								int i_168_ = 256;

								// vital
								if (class_is != null) {
									i_166_ = ((PacketsDecoder) class_is).anInt284;
									i_167_ = (!class260.method1684() ? ((PacketsDecoder) class_is).anInt276
											: ((PacketsDecoder) class_is).anInt279);
									i_168_ = ((PacketsDecoder) class_is).anInt275;
									int i_169_ = (Class246_Sub41_Sub2.method2681(class_is, class260, (byte) -31));
									for (int i_170_ = 0; ((i_170_ ^ 0xffffffff) > (i_152_ ^ 0xffffffff)); i_170_++) {
										boolean bool_171_ = false;
										int i_172_;
										if (bools[-current_overlay_type_data & 0x3] && i_155_ == is_148_[0]) {
											MapRegion.anIntArray2717[0] = is_150_[i_155_];
											MapRegion.anIntArray2717[1] = 1;
											MapRegion.anIntArray2717[2] = is_153_[i_155_];
											MapRegion.anIntArray2717[3] = 1;
											MapRegion.anIntArray2717[4] = is_151_[i_155_];
											i_172_ = 6;
											MapRegion.anIntArray2717[5] = is_153_[i_155_];
										} else if (!bools[2 + -current_overlay_type_data & 0x3]
												|| ((is_148_[2] ^ 0xffffffff) != (i_155_ ^ 0xffffffff))) {
											if (!bools[-current_overlay_type_data + 1 & 0x3]
													|| ((i_155_ ^ 0xffffffff) != (is_148_[1] ^ 0xffffffff))) {
												if (bools[3 - current_overlay_type_data & 0x3]
														&& is_148_[3] == i_155_) {
													MapRegion.anIntArray2717[0] = is_150_[i_155_];
													MapRegion.anIntArray2717[1] = 7;
													MapRegion.anIntArray2717[2] = is_153_[i_155_];
													MapRegion.anIntArray2717[3] = 7;
													MapRegion.anIntArray2717[4] = is_151_[i_155_];
													MapRegion.anIntArray2717[5] = is_153_[i_155_];
													i_172_ = 6;
												} else {
													MapRegion.anIntArray2717[0] = is_150_[i_155_];
													MapRegion.anIntArray2717[1] = is_151_[i_155_];
													MapRegion.anIntArray2717[2] = is_153_[i_155_];
													i_172_ = 3;
												}
											} else {
												MapRegion.anIntArray2717[0] = is_150_[i_155_];
												MapRegion.anIntArray2717[1] = 3;
												MapRegion.anIntArray2717[2] = is_153_[i_155_];
												MapRegion.anIntArray2717[3] = 3;
												MapRegion.anIntArray2717[4] = is_151_[i_155_];
												i_172_ = 6;
												MapRegion.anIntArray2717[5] = is_153_[i_155_];
											}
										} else {
											MapRegion.anIntArray2717[0] = is_150_[i_155_];
											MapRegion.anIntArray2717[1] = 5;
											MapRegion.anIntArray2717[2] = is_153_[i_155_];
											MapRegion.anIntArray2717[3] = 5;
											MapRegion.anIntArray2717[4] = is_151_[i_155_];
											MapRegion.anIntArray2717[5] = is_153_[i_155_];
											i_172_ = 6;
										}
										for (int i_173_ = 0; ((i_172_ ^ 0xffffffff) < (i_173_
												^ 0xffffffff)); i_173_++) {
											int i_174_ = (MapRegion.anIntArray2717[i_173_]);
											int i_175_ = 0x7 & -(2 * current_overlay_type_data) + i_174_;
											int i_176_ = anIntArray3650[i_174_];
											int i_177_ = anIntArray3657[i_174_];
											int i_178_;
											int i_179_;
											if (current_overlay_type_data != 1) {
												if ((current_overlay_type_data ^ 0xffffffff) != -3) {
													if ((current_overlay_type_data ^ 0xffffffff) == -4) {
														i_178_ = -i_177_ + 128;
														i_179_ = i_176_;
													} else {
														i_178_ = i_176_;
														i_179_ = i_177_;
													}
												} else {
													i_179_ = -i_177_ + 128;
													i_178_ = -i_176_ + 128;
												}
											} else {
												i_178_ = i_177_;
												i_179_ = -i_176_ + 128;
											}
											is_159_[i_156_] = i_178_;
											is_160_[i_156_] = i_179_;
											if (is_164_ != null
													&& (MapRegion.aBoolArrayArray6312[current_overlay_data][i_174_])) {
												int i_180_ = (x << 7) - -i_178_;
												int i_181_ = i_179_ + (z << 7);
												is_164_[i_156_] = (class210.a(i_180_, i_181_)
														+ -(class210_118_.a(i_180_, i_181_)));
											}
											if (is_165_ != null) {
												if (class210 == null
														|| (MapRegion.aBoolArrayArray6312[current_overlay_data][i_174_])) {
													if (class210_119_ != null
															&& !(Class213.aBoolArrayArray2983[current_overlay_data][i_174_])) {
														int i_182_ = i_178_ + (x << 7);
														int i_183_ = ((z << 7) - -i_179_);
														is_165_[i_156_] = ((class210_119_.a(i_182_, i_183_))
																- (class210_118_.a(i_182_, i_183_)));
													}
												} else {
													int i_184_ = (i_178_ + (x << 7));
													int i_185_ = (i_179_ + (z << 7));
													is_165_[i_156_] = ((class210_118_.a(i_184_, i_185_))
															+ -(class210.a(i_184_, i_185_)));
												}
											}
											if ((i_174_ ^ 0xffffffff) <= -9
													|| ((Class82.anIntArray1076[i_175_]) <= (((PacketsDecoder) class_is).anInt274))) {
												if (is_158_ != null)
													is_158_[i_156_] = i_169_;
												is_162_[i_156_] = (class260.method1684()
														? (((PacketsDecoder) class_is).anInt279)
														: (((PacketsDecoder) class_is).anInt276));
												is_163_[i_156_] = (((PacketsDecoder) class_is).anInt275);
												is_161_[i_156_] = i_166_;
											} else {
												if (is_158_ != null)
													is_158_[i_156_] = (InvTypeLoader.anIntArray845[i_175_]);
												is_163_[i_156_] = (Class112.anIntArray1589[i_175_]);
												is_162_[i_156_] = (Class59_Sub4_Sub1.anIntArray6313[i_175_]);
												is_161_[i_156_] = (Class38_Sub1_Sub1.anIntArray6769[i_175_]);
											}
											i_156_++;
										}
										i_155_++;
									}
									if (!aBool3658 && i == 0)
										Class41.method287(x, z, ((PacketsDecoder) class_is).anInt277,
												(((PacketsDecoder) class_is).anInt286 * 8),
												((PacketsDecoder) class_is).anInt287);
									if ((current_overlay_data ^ 0xffffffff) != -13
											&& ((PacketsDecoder) class_is).anInt284 != -1
											&& ((PacketsDecoder) class_is).aBool283)
										bool = true;
								} else if (!bool_147_) {
									if (!bool_128_)
										i_155_ += (NodeSub.anIntArray3738[current_overlay_data]);
									else
										i_155_ += (Class260_Sub2.anIntArray4277[current_overlay_data]);
								} else
									i_155_ += Class260_Sub2.f_be[current_overlay_data];
								if (class207 != null) {
									if (extra_underlay_data == 0)
										extra_underlay_data = current_underlay_data;
									if (last_underlay_data == 0)
										last_underlay_data = current_underlay_data;
									if ((next_underlay_data ^ 0xffffffff) == -1)
										next_underlay_data = current_underlay_data;
									FloorDefinition class207_186_ = aClass175_3659.list(-18411,
											current_underlay_data - 1);
									FloorDefinition class207_187_ = aClass175_3659.list(-18411,
											-1 + next_underlay_data);
									FloorDefinition class207_188_ = aClass175_3659.list(-18411,
											-1 + last_underlay_data);
									FloorDefinition class207_189_ = aClass175_3659.list(-18411,
											extra_underlay_data - 1);
									// vital
									for (int i_190_ = 0; ((i_149_ ^ 0xffffffff) < (i_190_ ^ 0xffffffff)); i_190_++) {
										boolean bool_191_ = false;
										int i_192_;
										if (!bools[0x3 & -current_overlay_type_data] || i_155_ != is_148_[0]) {
											if (!bools[0x3 & -current_overlay_type_data + 2]
													|| ((is_148_[2] ^ 0xffffffff) != (i_155_ ^ 0xffffffff))) {
												if (!bools[0x3 & -current_overlay_type_data + 1]
														|| i_155_ != is_148_[1]) {
													if ((bools[0x3 & 3 + -current_overlay_type_data])
															&& ((i_155_ ^ 0xffffffff) == (is_148_[3] ^ 0xffffffff))) {
														MapRegion.anIntArray2717[0] = is_150_[i_155_];
														MapRegion.anIntArray2717[1] = 7;
														MapRegion.anIntArray2717[2] = is_153_[i_155_];
														MapRegion.anIntArray2717[3] = 7;
														MapRegion.anIntArray2717[4] = is_151_[i_155_];
														i_192_ = 6;
														MapRegion.anIntArray2717[5] = is_153_[i_155_];
													} else {
														MapRegion.anIntArray2717[0] = is_150_[i_155_];
														MapRegion.anIntArray2717[1] = is_151_[i_155_];
														i_192_ = 3;
														MapRegion.anIntArray2717[2] = is_153_[i_155_];
													}
												} else {
													MapRegion.anIntArray2717[0] = is_150_[i_155_];
													MapRegion.anIntArray2717[1] = 3;
													MapRegion.anIntArray2717[2] = is_153_[i_155_];
													MapRegion.anIntArray2717[3] = 3;
													MapRegion.anIntArray2717[4] = is_151_[i_155_];
													MapRegion.anIntArray2717[5] = is_153_[i_155_];
													i_192_ = 6;
												}
											} else {
												MapRegion.anIntArray2717[0] = is_150_[i_155_];
												MapRegion.anIntArray2717[1] = 5;
												MapRegion.anIntArray2717[2] = is_153_[i_155_];
												MapRegion.anIntArray2717[3] = 5;
												MapRegion.anIntArray2717[4] = is_151_[i_155_];
												i_192_ = 6;
												MapRegion.anIntArray2717[5] = is_153_[i_155_];
											}
										} else {
											MapRegion.anIntArray2717[0] = is_150_[i_155_];
											MapRegion.anIntArray2717[1] = 1;
											MapRegion.anIntArray2717[2] = is_153_[i_155_];
											MapRegion.anIntArray2717[3] = 1;
											MapRegion.anIntArray2717[4] = is_151_[i_155_];
											MapRegion.anIntArray2717[5] = is_153_[i_155_];
											i_192_ = 6;
										}
										for (int i_193_ = 0; ((i_193_ ^ 0xffffffff) > (i_192_
												^ 0xffffffff)); i_193_++) {
											int i_194_ = (MapRegion.anIntArray2717[i_193_]);
											int i_195_ = i_194_ - 2 * current_overlay_type_data & 0x7;
											int i_196_ = anIntArray3650[i_194_];
											int i_197_ = anIntArray3657[i_194_];
											int i_198_;
											int i_199_;
											if (current_overlay_type_data != 1) {
												if (current_overlay_type_data != 2) {
													if (current_overlay_type_data == 3) {
														i_199_ = i_196_;
														i_198_ = -i_197_ + 128;
													} else {
														i_198_ = i_196_;
														i_199_ = i_197_;
													}
												} else {
													i_199_ = -i_197_ + 128;
													i_198_ = 128 - i_196_;
												}
											} else {
												i_198_ = i_197_;
												i_199_ = -i_196_ + 128;
											}
											is_159_[i_156_] = i_198_;
											is_160_[i_156_] = i_199_;
											if (is_164_ != null && (MapRegion.aBoolArrayArray6312 != null
													&& MapRegion.aBoolArrayArray6312[current_overlay_data][i_194_])) {
												int i_200_ = i_198_ + (x << 7);
												int i_201_ = i_199_ + (z << 7);
												is_164_[i_156_] = (class210.a(i_200_, i_201_)
														+ -(class210_118_.a(i_200_, i_201_)));
											}
											if (is_165_ != null) {
												if (class210 != null && !(MapRegion.aBoolArrayArray6312 != null
														&& MapRegion.aBoolArrayArray6312[current_overlay_data][i_194_])) {
													int i_202_ = (i_198_ + (x << 7));
													int i_203_ = ((z << 7) - -i_199_);
													is_165_[i_156_] = ((class210_118_.a(i_202_, i_203_))
															+ -(class210.a(i_202_, i_203_)));
												} else if ((class210_119_ != null)
														&& !(Class213.aBoolArrayArray2983[current_overlay_data][i_194_])) {
													int i_204_ = ((x << 7) + i_198_);
													int i_205_ = ((z << 7) + i_199_);
													is_165_[i_156_] = ((class210_119_.a(i_204_, i_205_))
															- (class210_118_.a(i_204_, i_205_)));
												}
											}
											if ((i_194_ ^ 0xffffffff) <= -9 || (Class82.anIntArray1076[i_195_]) < 0) {
												if (!bool_128_ || !(MapRegion.aBoolArrayArray6312 != null
														&& MapRegion.aBoolArrayArray6312[current_overlay_data][i_194_])) {
													if (((i_198_ ^ 0xffffffff) != -1)
															|| ((i_199_ ^ 0xffffffff) != -1)) {
														if (i_198_ != 0 || i_199_ != 128) {
															if (i_198_ == 128 && (i_199_ == 128)) {
																is_161_[i_156_] = (paletteIndices[next_x][next_z]);
																is_162_[i_156_] = (((FloorDefinition) class207_188_).texture);
																is_163_[i_156_] = (((FloorDefinition) class207_188_).anInt2924);
															} else if (((i_198_ ^ 0xffffffff) != -129)
																	|| ((i_199_ ^ 0xffffffff) != -1)) {
																if ((i_198_ ^ 0xffffffff) > -65) {
																	if (i_199_ >= 64) {
																		is_162_[i_156_] = ((FloorDefinition) class207_187_).texture;
																		is_163_[i_156_] = ((FloorDefinition) class207_187_).anInt2924;
																	} else {
																		is_162_[i_156_] = ((FloorDefinition) class207_186_).texture;
																		is_163_[i_156_] = ((FloorDefinition) class207_186_).anInt2924;
																	}
																} else if ((i_199_ ^ 0xffffffff) > -65) {
																	is_162_[i_156_] = (((FloorDefinition) class207_189_).texture);
																	is_163_[i_156_] = (((FloorDefinition) class207_189_).anInt2924);
																} else {
																	is_162_[i_156_] = (((FloorDefinition) class207_188_).texture);
																	is_163_[i_156_] = (((FloorDefinition) class207_188_).anInt2924);
																}
																int i_206_ = (MapRegion.method290((byte) 86,
																		(i_198_ << 7 >> 7), (paletteIndices[x][z]),
																		(paletteIndices[next_x][z])));
																int i_207_ = (MapRegion.method290((byte) 86,
																		(i_198_ << 7 >> 7), (paletteIndices[x][next_z]),
																		(paletteIndices[next_x][next_z])));
																is_161_[i_156_] = (MapRegion.method290((byte) 86,
																		(i_199_ << 7 >> 7), i_206_, i_207_));
															} else {
																is_161_[i_156_] = (paletteIndices[next_x][z]);
																is_162_[i_156_] = (((FloorDefinition) class207_189_).texture);
																is_163_[i_156_] = (((FloorDefinition) class207_189_).anInt2924);
															}
														} else {
															is_161_[i_156_] = (paletteIndices[x][next_z]);
															is_162_[i_156_] = (((FloorDefinition) class207_187_).texture);
															is_163_[i_156_] = (((FloorDefinition) class207_187_).anInt2924);
														}
													} else {
														is_161_[i_156_] = (paletteIndices[x][z]);
														is_162_[i_156_] = (((FloorDefinition) class207_186_).texture);
														is_163_[i_156_] = (((FloorDefinition) class207_186_).anInt2924);
													}
												} else {
													is_162_[i_156_] = i_167_;
													is_163_[i_156_] = i_168_;
													is_161_[i_156_] = i_166_;
												}
												if (is_158_ != null)
													is_158_[i_156_] = is_161_[i_156_];
											} else {
												if (is_158_ != null)
													is_158_[i_156_] = (InvTypeLoader.anIntArray845[i_195_]);
												is_163_[i_156_] = (Class112.anIntArray1589[i_195_]);
												is_162_[i_156_] = (Class59_Sub4_Sub1.anIntArray6313[i_195_]);
												is_161_[i_156_] = (Class38_Sub1_Sub1.anIntArray6769[i_195_]);
											}
											i_156_++;
										}
										i_155_++;
									}
									if ((current_overlay_data ^ 0xffffffff) != -1
											&& ((FloorDefinition) class207).aBool2913)
										bool = true;
								}
								int i_208_ = class210_118_.l(x, z);
								int i_209_ = class210_118_.l(next_x, z);
								int i_210_ = class210_118_.l(next_x, next_z);
								int i_211_ = class210_118_.l(x, next_z);
								if (i > 0) {
									boolean bool_212_ = true;
									if (current_underlay_data == 0 && current_overlay_data != 0)
										bool_212_ = false;
									if (next_overlay_orientation_data > 0 && class_is_136_ != null
											&& !(((PacketsDecoder) class_is_136_).aBool290))
										bool_212_ = false;
									if (bool_212_ && i_208_ == i_209_ && i_210_ == i_208_
											&& ((i_211_ ^ 0xffffffff) == (i_208_ ^ 0xffffffff)))
										tileLighting[i][x][z] = (byte) (Class236.method1523((tileLighting[i][x][z]),
												4));
								}
								int i_213_ = 0;
								int i_214_ = 0;
								int i_215_ = 0;
								if (aBool3658) {
									i_213_ = Entity.method2672(x, z);
									i_214_ = Class133.method899(x, z);
									i_215_ = Class59_Sub4_Sub1.method2638(x, z);
								}
								class210_118_.B(x, z, is_159_, is_164_, is_160_, is_165_, is_161_, is_158_, is_162_,
										is_163_, i_213_, i_214_, i_215_, bool);
								VarpType.method596(i, x, z);
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	final void method1657(int rotation, Buffer stream, int currentLayer, CollisionMap[] collisionMaps, byte unused,
			int mapXOffset, int mapY, int mapYOffset, int baseX, int baseY) {
		try {
			anInt3668++;

			int localX = (mapY & 0x7) * 8;

			if (!aBool3658) {
				CollisionMap collisionMap = collisionMaps[mapYOffset];
				for (int x = 0; x < 8; x++) {
					for (int y = 0; y < 8; y++) {
						int transformedX = baseX + Class230.method1475(y & 0x7, rotation, 103, x & 0x7);
						int transformedY = mapYOffset
								+ RenderAnimation.method914(rotation, (byte) -122, x & 0x7, y & 0x7);
						if (transformedX > 0 && transformedX < regionSizeX - 1 && transformedY > 0
								&& transformedY < regionSizeY - 1) {
							collisionMap.method1309(transformedX, transformedY, -48);
						}
					}
				}
			}

			int localY = (mapXOffset & 0x7) * 8;
			int mapYShifted = (mapY & ~0x7) << 3;
			int mapXShifted = (mapXOffset << 3) & ~0x3F;

			int xOffset = 0;
			int yOffset = 0;

			if (rotation == 1) {
				yOffset = 1;
			} else if (rotation == 2) {
				xOffset = 1;
				yOffset = 1;
			} else if (rotation == 3) {
				xOffset = 1;
			}

			for (int layer = 0; layer < anInt3670; layer++) {
				for (int x = 0; x < 64; x++) {
					for (int y = 0; y < 64; y++) {
						if (layer == currentLayer && x >= localX && x <= localX + 8 && y >= localY && y <= localY + 8) {
							if (x == localX + 8 || y == localY + 8) {
								int finalX;
								int finalY;

								switch (rotation) {
									case 0:
										finalX = mapYOffset + y - localY;
										finalY = baseX + x - localX;
										break;
									case 1:
										finalX = mapYOffset + 8 + x - localX;
										finalY = baseX + y - localY;
										break;
									case 2:
										finalX = mapYOffset + 8 - y + localY;
										finalY = baseX + 8 - x + localX;
										break;
									case 3:
										finalX = mapYOffset + 8 - x + localX;
										finalY = baseX + 8 - y + localY;
										break;
									default:
										finalX = y - localY + mapYOffset;
										finalY = baseX + x - localX;
										break;
								}

								loadTerrain(finalX, mapXShifted + y, finalY, x + mapYShifted, 0, true, mapYOffset, 0, 0,
										19108, stream);
							} else {
								int transformedX = baseX + Class230.method1475(y & 0x7, rotation, 108, x & 0x7);
								int transformedY = mapYOffset
										+ RenderAnimation.method914(rotation, (byte) -113, x & 0x7, y & 0x7);
								loadTerrain(transformedY, mapXShifted + y, transformedX, x + mapYShifted, rotation,
										false, mapYOffset, yOffset, xOffset, 19108, stream);

								if (x == 63 || y == 63) {
									int maxX = (x == 63) ? 64 : x;
									int maxY = (y == 63) ? 64 : y;
									int finalX, finalY;

									switch (rotation) {
										case 0:
											finalY = maxX + baseX - localX;
											finalX = maxY + mapYOffset - localY;
											break;
										case 1:
											finalY = baseX + maxY - localY;
											finalX = maxX + mapYOffset + 8 - localX;
											break;
										case 2:
											finalY = baseX + 8 - maxX + localX;
											finalX = mapYOffset + 8 + localY - maxY;
											break;
										case 3:
											finalY = baseX + 8 + localX - maxY;
											finalX = mapYOffset + 8 - maxX + localY;
											break;
										default:
											finalY = maxX + baseX - localX;
											finalX = maxY + mapYOffset - localY;
											break;
									}

									if (finalX >= 0 && finalX < regionSizeX && finalY >= 0 && finalY < regionSizeY) {
										tileHeights[mapYOffset][finalX][finalY] = tileHeights[mapYOffset][transformedX
												+ xOffset][transformedY + yOffset];
									}
								}
							}
						} else {
							loadTerrain(-1, 0, -1, 0, 0, false, 0, 0, 0, 19108, stream);
						}
					}
				}
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	static final boolean method1658(int i, int i_244_) {
		try {
			if (i != 4)
				return false;
			anInt3669++;
			if ((i_244_ ^ 0xffffffff) != -49 && (i_244_ ^ 0xffffffff) != -48 && (i_244_ ^ 0xffffffff) != -1003
					&& (i_244_ ^ 0xffffffff) != -10 && (i_244_ ^ 0xffffffff) != -61)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wj.E(" + i + ',' + i_244_ + ')');
		}
	}

	private final void method1659(int i, int i_245_, short[][] is, int i_246_, int i_247_, int i_248_, boolean[] bools,
			int i_249_, int i_250_, PacketsDecoder class_is, byte[][] is_251_, FloorDefinition class207,
			byte[][] is_252_, SceneGraph class260) {
		do {
			try {
				anInt3645++;
				if (class_is != null && class207 != null || class207 != null && i_246_ == 12
						|| class_is != null && (i_246_ ^ 0xffffffff) == -1) {
					boolean[] bools_253_ = (class_is == null || !Settings.ground_blending
							? IdentityKitLoader.aBoolArrayArray1207[i_246_]
							: Class_a.aBoolArrayArray1182[i_246_]);
					if (i_247_ > 0) {
						if ((i_250_ ^ 0xffffffff) < -1) {
							int i_254_ = 0xff & is[-1 + i_250_][-1 + i_247_];
							if ((i_254_ ^ 0xffffffff) < -1) {
								PacketsDecoder class_is_255_ = aClass105_3667.method703(i_245_ ^ 0x56e1, -1 + i_254_);
								if (((PacketsDecoder) class_is_255_).anInt284 != -1
										&& Settings.ground_blending) {
									short i_256_ = is_251_[i_250_ - 1][i_247_ - 1];
									int i_257_ = 0x7 & 2 * (is_252_[-1 + i_250_][-1 + i_247_]) + 4;
									int i_258_ = (Class246_Sub41_Sub2.method2681(class_is_255_, class260, (byte) -31));
									if (MapRegion.aBoolArrayArray6312 != null
											&& MapRegion.aBoolArrayArray6312[i_256_][i_257_]) {
										Class38_Sub1_Sub1.anIntArray6769[0] = (((PacketsDecoder) class_is_255_).anInt284);
										InvTypeLoader.anIntArray845[0] = i_258_;
										Class59_Sub4_Sub1.anIntArray6313[0] = (class260.method1684()
												? (((PacketsDecoder) class_is_255_).anInt279)
												: (((PacketsDecoder) class_is_255_).anInt276));
										Class112.anIntArray1589[0] = (((PacketsDecoder) class_is_255_).anInt275);
										Class82.anIntArray1076[0] = (((PacketsDecoder) class_is_255_).anInt274);
										Class160.anIntArray2267[0] = 256;
									}
								}
							}
						}
						if ((i_249_ - 1 ^ 0xffffffff) < (i_250_ ^ 0xffffffff)) {
							int i_259_ = 0xff & is[1 + i_250_][-1 + i_247_];
							if (i_259_ > 0) {
								PacketsDecoder class_is_260_ = aClass105_3667.method703(i_245_ ^ 0x56e1, -1 + i_259_);
								if ((((PacketsDecoder) class_is_260_).anInt284 ^ 0xffffffff) != 0
										&& Settings.ground_blending) {
									short i_261_ = is_251_[1 + i_250_][-1 + i_247_];
									int i_262_ = (2 * is_252_[1 + i_250_][-1 + i_247_] + 6) & 0x7;
									int i_263_ = (Class246_Sub41_Sub2.method2681(class_is_260_, class260, (byte) -31));
									if (MapRegion.aBoolArrayArray6312 != null
											&& MapRegion.aBoolArrayArray6312[i_261_][i_262_]) {
										Class38_Sub1_Sub1.anIntArray6769[2] = (((PacketsDecoder) class_is_260_).anInt284);
										InvTypeLoader.anIntArray845[2] = i_263_;
										Class59_Sub4_Sub1.anIntArray6313[2] = (!class260.method1684()
												? (((PacketsDecoder) class_is_260_).anInt276)
												: (((PacketsDecoder) class_is_260_).anInt279));
										Class112.anIntArray1589[2] = (((PacketsDecoder) class_is_260_).anInt275);
										Class82.anIntArray1076[2] = (((PacketsDecoder) class_is_260_).anInt274);
										Class160.anIntArray2267[2] = 512;
									}
								}
							}
						}
					}
					if ((i_247_ ^ 0xffffffff) > (-1 + i ^ 0xffffffff)) {
						if (i_250_ > 0) {
							int i_264_ = 0xff & is[i_250_ - 1][i_247_ + 1];
							if (i_264_ > 0) {
								PacketsDecoder class_is_265_ = aClass105_3667.method703(4, i_264_ - 1);
								if (((PacketsDecoder) class_is_265_).anInt284 != -1
										&& Settings.ground_blending) {
									short i_266_ = is_251_[-1 + i_250_][1 + i_247_];
									int i_267_ = ((2 * is_252_[i_250_ - 1][i_247_ + 1] + 2) & 0x7);
									int i_268_ = (Class246_Sub41_Sub2.method2681(class_is_265_, class260, (byte) -31));
									if (MapRegion.aBoolArrayArray6312 != null
											&& MapRegion.aBoolArrayArray6312[i_266_][i_267_]) {
										Class38_Sub1_Sub1.anIntArray6769[6] = (((PacketsDecoder) class_is_265_).anInt284);
										InvTypeLoader.anIntArray845[6] = i_268_;
										Class59_Sub4_Sub1.anIntArray6313[6] = (!class260.method1684()
												? (((PacketsDecoder) class_is_265_).anInt276)
												: (((PacketsDecoder) class_is_265_).anInt279));
										Class112.anIntArray1589[6] = (((PacketsDecoder) class_is_265_).anInt275);
										Class82.anIntArray1076[6] = (((PacketsDecoder) class_is_265_).anInt274);
										Class160.anIntArray2267[6] = 64;
									}
								}
							}
						}
						if ((i_250_ ^ 0xffffffff) > (-1 + i_249_ ^ 0xffffffff)) {
							int i_269_ = 0xff & is[1 + i_250_][1 + i_247_];
							if ((i_269_ ^ 0xffffffff) < -1) {
								PacketsDecoder class_is_270_ = aClass105_3667.method703(i_245_ ^ 0x56e1, i_269_ - 1);
								if ((((PacketsDecoder) class_is_270_).anInt284 ^ 0xffffffff) != 0
										&& Settings.ground_blending) {
									short i_271_ = is_251_[i_250_ + 1][i_247_ + 1];
									int i_272_ = (2 * is_252_[1 + i_250_][1 + i_247_] & 0x7);
									int i_273_ = (Class246_Sub41_Sub2.method2681(class_is_270_, class260, (byte) -31));
									if (MapRegion.aBoolArrayArray6312 != null
											&& MapRegion.aBoolArrayArray6312[i_271_][i_272_]) {
										Class38_Sub1_Sub1.anIntArray6769[4] = (((PacketsDecoder) class_is_270_).anInt284);
										InvTypeLoader.anIntArray845[4] = i_273_;
										Class59_Sub4_Sub1.anIntArray6313[4] = (class260.method1684()
												? (((PacketsDecoder) class_is_270_).anInt279)
												: (((PacketsDecoder) class_is_270_).anInt276));
										Class112.anIntArray1589[4] = (((PacketsDecoder) class_is_270_).anInt275);
										Class82.anIntArray1076[4] = (((PacketsDecoder) class_is_270_).anInt274);
										Class160.anIntArray2267[4] = 128;
									}
								}
							}
						}
					}
					if ((i_247_ ^ 0xffffffff) < -1) {
						int i_274_ = 0xff & is[i_250_][i_247_ - 1];
						if ((i_274_ ^ 0xffffffff) < -1) {
							PacketsDecoder class_is_275_ = aClass105_3667.method703(4, -1 + i_274_);
							if ((((PacketsDecoder) class_is_275_).anInt284 ^ 0xffffffff) != 0) {
								short i_276_ = is_251_[i_250_][-1 + i_247_];
								int i_277_ = is_252_[i_250_][i_247_ - 1];
								if (Settings.ground_blending) {
									int i_278_ = 2;
									int i_279_ = 4 - -(2 * i_277_);
									int i_280_ = (Class246_Sub41_Sub2.method2681(class_is_275_, class260, (byte) -31));
									for (int i_281_ = 0; i_281_ < 3; i_281_++) {
										i_278_ = 0x7 & i_278_;
										i_279_ = 0x7 & i_279_;
										if ((MapRegion.aBoolArrayArray6312 != null
												&& MapRegion.aBoolArrayArray6312[i_276_][i_279_])
												&& ((Class82.anIntArray1076[i_278_]
														^ 0xffffffff) >= ((((PacketsDecoder) class_is_275_).anInt274)
																^ 0xffffffff))) {
											Class38_Sub1_Sub1.anIntArray6769[i_278_] = (((PacketsDecoder) class_is_275_).anInt284);
											InvTypeLoader.anIntArray845[i_278_] = i_280_;
											Class59_Sub4_Sub1.anIntArray6313[i_278_] = (class260.method1684()
													? ((PacketsDecoder) class_is_275_).anInt279
													: ((PacketsDecoder) class_is_275_).anInt276);
											Class112.anIntArray1589[i_278_] = (((PacketsDecoder) class_is_275_).anInt275);
											if (Class82.anIntArray1076[i_278_] != (((PacketsDecoder) class_is_275_).anInt274))
												Class160.anIntArray2267[i_278_] = 32;
											else
												Class160.anIntArray2267[i_278_] = (Class236
														.method1523((Class160.anIntArray2267[i_278_]), 32));
											Class82.anIntArray1076[i_278_] = (((PacketsDecoder) class_is_275_).anInt274);
										}
										i_279_++;
										i_278_--;
									}
									if (!bools_253_[0x3 & i_248_])
										bools[0] = (Class_a.aBoolArrayArray1182[i_276_][PacketsDecoder
												.method184(i_277_ + 2, 3)]);
								} else if (!bools_253_[0x3 & --i_248_])
									bools[0] = (IdentityKitLoader.aBoolArrayArray1207[i_276_][PacketsDecoder.method184(
											3,
											i_277_ + 2)]);
							}
						}
					}
					if (i_247_ < -1 + i) {
						int i_282_ = 0xff & is[i_250_][i_247_ + 1];
						if ((i_282_ ^ 0xffffffff) < -1) {
							PacketsDecoder class_is_283_ = aClass105_3667.method703(i_245_ ^ 0x56e1, -1 + i_282_);
							if ((((PacketsDecoder) class_is_283_).anInt284 ^ 0xffffffff) != 0) {
								short i_284_ = is_251_[i_250_][i_247_ + 1];
								int i_285_ = is_252_[i_250_][1 + i_247_];
								if (!Settings.ground_blending) {
									if (!bools_253_[0x3 & 2 + i_248_])
										bools[2] = (IdentityKitLoader.aBoolArrayArray1207[i_284_][PacketsDecoder
												.method184(3,
														i_285_)]);
								} else {
									int i_286_ = 4;
									int i_287_ = 2 + 2 * i_285_;
									int i_288_ = (Class246_Sub41_Sub2.method2681(class_is_283_, class260, (byte) -31));
									for (int i_289_ = 0; i_289_ < 3; i_289_++) {
										i_287_ &= 0x7;
										i_286_ &= 0x7;
										if ((MapRegion.aBoolArrayArray6312 != null
												&& MapRegion.aBoolArrayArray6312[i_284_][i_287_])
												&& ((((PacketsDecoder) class_is_283_).anInt274) >= (Class82.anIntArray1076[i_286_]))) {
											Class38_Sub1_Sub1.anIntArray6769[i_286_] = (((PacketsDecoder) class_is_283_).anInt284);
											InvTypeLoader.anIntArray845[i_286_] = i_288_;
											Class59_Sub4_Sub1.anIntArray6313[i_286_] = (!class260.method1684()
													? ((PacketsDecoder) class_is_283_).anInt276
													: ((PacketsDecoder) class_is_283_).anInt279);
											Class112.anIntArray1589[i_286_] = (((PacketsDecoder) class_is_283_).anInt275);
											if ((Class82.anIntArray1076[i_286_]
													^ 0xffffffff) != ((((PacketsDecoder) class_is_283_).anInt274)
															^ 0xffffffff))
												Class160.anIntArray2267[i_286_] = 16;
											else
												Class160.anIntArray2267[i_286_] = (Class236
														.method1523((Class160.anIntArray2267[i_286_]), 16));
											Class82.anIntArray1076[i_286_] = (((PacketsDecoder) class_is_283_).anInt274);
										}
										i_286_++;
										i_287_--;
									}
									if (!bools_253_[0x3 & i_248_ + 2])
										bools[2] = (Class_a.aBoolArrayArray1182[i_284_][PacketsDecoder.method184(i_285_,
												3)]);
								}
							}
						}
					}
					if (i_250_ > 0) {
						int i_290_ = 0xff & is[i_250_ - 1][i_247_];
						if (i_290_ > 0) {
							PacketsDecoder class_is_291_ = aClass105_3667.method703(i_245_ - 22241, -1 + i_290_);
							if (((PacketsDecoder) class_is_291_).anInt284 != -1) {
								short i_292_ = is_251_[-1 + i_250_][i_247_];
								int i_293_ = is_252_[-1 + i_250_][i_247_];
								if (Settings.ground_blending) {
									int i_294_ = 6;
									int i_295_ = 4 + 2 * i_293_;
									int i_296_ = (Class246_Sub41_Sub2.method2681(class_is_291_, class260, (byte) -31));
									for (int i_297_ = 0; (i_297_ ^ 0xffffffff) > -4; i_297_++) {
										i_294_ = 0x7 & i_294_;
										i_295_ = 0x7 & i_295_;
										if ((MapRegion.aBoolArrayArray6312 != null
												&& MapRegion.aBoolArrayArray6312[i_292_][i_295_])
												&& ((((PacketsDecoder) class_is_291_).anInt274) >= (Class82.anIntArray1076[i_294_]))) {
											Class38_Sub1_Sub1.anIntArray6769[i_294_] = (((PacketsDecoder) class_is_291_).anInt284);
											InvTypeLoader.anIntArray845[i_294_] = i_296_;
											Class59_Sub4_Sub1.anIntArray6313[i_294_] = (!class260.method1684()
													? ((PacketsDecoder) class_is_291_).anInt276
													: ((PacketsDecoder) class_is_291_).anInt279);
											Class112.anIntArray1589[i_294_] = (((PacketsDecoder) class_is_291_).anInt275);
											if (((((PacketsDecoder) class_is_291_).anInt274)
													^ 0xffffffff) != ((Class82.anIntArray1076[i_294_]) ^ 0xffffffff))
												Class160.anIntArray2267[i_294_] = 8;
											else
												Class160.anIntArray2267[i_294_] = (Class236
														.method1523((Class160.anIntArray2267[i_294_]), 8));
											Class82.anIntArray1076[i_294_] = (((PacketsDecoder) class_is_291_).anInt274);
										}
										i_295_--;
										i_294_++;
									}
									if (!bools_253_[0x3 & i_248_ + 3])
										bools[3] = (Class_a.aBoolArrayArray1182[i_292_][PacketsDecoder
												.method184(1 - -i_293_, 3)]);
								} else if (!bools_253_[i_248_ + 3 & 0x3])
									bools[3] = (IdentityKitLoader.aBoolArrayArray1207[i_292_][PacketsDecoder.method184(
											3,
											i_293_ + 1)]);
							}
						}
					}
					if (i_250_ < i_249_ - 1) {
						int i_298_ = 0xff & is[i_250_ + 1][i_247_];
						if ((i_298_ ^ 0xffffffff) < -1) {
							PacketsDecoder class_is_299_ = aClass105_3667.method703(4, i_298_ - 1);
							if (((PacketsDecoder) class_is_299_).anInt284 != -1) {
								short i_300_ = is_251_[i_250_ + 1][i_247_];
								int i_301_ = is_252_[1 + i_250_][i_247_];
								if (Settings.ground_blending) {
									int i_302_ = 4;
									int i_303_ = i_301_ * 2 + 6;
									int i_304_ = (Class246_Sub41_Sub2.method2681(class_is_299_, class260, (byte) -31));
									for (int i_305_ = 0; i_305_ < 3; i_305_++) {
										i_302_ &= 0x7;
										i_303_ = 0x7 & i_303_;
										if ((MapRegion.aBoolArrayArray6312 != null
												&& MapRegion.aBoolArrayArray6312[i_300_][i_303_])
												&& ((Class82.anIntArray1076[i_302_]
														^ 0xffffffff) >= ((((PacketsDecoder) class_is_299_).anInt274)
																^ 0xffffffff))) {
											Class38_Sub1_Sub1.anIntArray6769[i_302_] = (((PacketsDecoder) class_is_299_).anInt284);
											InvTypeLoader.anIntArray845[i_302_] = i_304_;
											Class59_Sub4_Sub1.anIntArray6313[i_302_] = (!class260.method1684()
													? ((PacketsDecoder) class_is_299_).anInt276
													: ((PacketsDecoder) class_is_299_).anInt279);
											Class112.anIntArray1589[i_302_] = (((PacketsDecoder) class_is_299_).anInt275);
											if ((((PacketsDecoder) class_is_299_).anInt274) == (Class82.anIntArray1076[i_302_]))
												Class160.anIntArray2267[i_302_] = (Class236
														.method1523((Class160.anIntArray2267[i_302_]), 4));
											else
												Class160.anIntArray2267[i_302_] = 4;
											Class82.anIntArray1076[i_302_] = (((PacketsDecoder) class_is_299_).anInt274);
										}
										i_302_--;
										i_303_++;
									}
									if (!bools_253_[i_248_ + 1 & 0x3])
										bools[1] = (Class_a.aBoolArrayArray1182[i_300_][(PacketsDecoder.method184(3,
												3 - -i_301_))]);
								} else if (!bools_253_[1 - -i_248_ & 0x3])
									bools[1] = (IdentityKitLoader.aBoolArrayArray1207[i_300_][PacketsDecoder.method184(
											i_301_ + 3,
											3)]);
							}
						}
					}
				}
				if (i_245_ == 22245) {
					if (class_is == null)
						break;
					int i_306_ = Class246_Sub41_Sub2.method2681(class_is, class260, (byte) -31);
					if (!Settings.ground_blending)
						break;
					for (int i_307_ = 0; i_307_ < 8; i_307_++) {
						int i_308_ = i_307_ + -(i_248_ * 2) & 0x7;
						if ((MapRegion.aBoolArrayArray6312 != null && MapRegion.aBoolArrayArray6312[i_246_][i_307_])
								&& ((((PacketsDecoder) class_is).anInt274
										^ 0xffffffff) <= (Class82.anIntArray1076[i_308_] ^ 0xffffffff))) {
							Class38_Sub1_Sub1.anIntArray6769[i_308_] = ((PacketsDecoder) class_is).anInt284;
							InvTypeLoader.anIntArray845[i_308_] = i_306_;
							Class59_Sub4_Sub1.anIntArray6313[i_308_] = (!class260.method1684()
									? ((PacketsDecoder) class_is).anInt276
									: ((PacketsDecoder) class_is).anInt279);
							Class112.anIntArray1589[i_308_] = ((PacketsDecoder) class_is).anInt275;
							if (Class82.anIntArray1076[i_308_] != ((PacketsDecoder) class_is).anInt274)
								Class160.anIntArray2267[i_308_] = 2;
							else
								Class160.anIntArray2267[i_308_] = Class236.method1523((Class160.anIntArray2267[i_308_]),
										2);
							Class82.anIntArray1076[i_308_] = ((PacketsDecoder) class_is).anInt274;
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	static final void render_objects(byte i, Class255_Sub1 class255_sub1, byte[][] data_array) {
		int current_regions = Class211_Sub1.current_regions.length;
		for (int region_index = 0; region_index < current_regions; region_index++) {
			byte[] data = data_array[region_index];
			if (data != null) {
				int i_5_ = (64 * (region_ids[region_index] >> 8) - Client.base_x);
				int i_6_ = (-Client.base_y + 64 * (0xff & region_ids[region_index]));
				IterableNodeHashTable.method545((byte) -109);
				class255_sub1.load(Class95.aClass199Array1235, i_6_, data, i_5_, Client.sprite_loader,
						Revision.OSRS);
			}
		}
	}

	static final void decode_dynamic_region(int i) {
		try {
			Class255_Sub1.anInt5573 = Class78.packetStream.readUnsignedByte();
			if (i != 10094)
				Class113.ADD_FRIEND_PACKET = null;
			Class113.anInt1592++;
			int chunkY = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			boolean forceRefresh = Class78.packetStream.readUnsigned128Byte() == 1;
			int chunkX = Class78.packetStream.readUnsignedShort128(i + 952958514);
			int mapSize = Class78.packetStream.readUnsigned128Byte();
			Class246_Sub28_Sub24.method2740((byte) 52, mapSize);
			Class78.packetStream.method2477(-934);
			for (int i_5_ = 0; i_5_ < 4; i_5_++) {
				for (int i_6_ = 0; Class38_Sub1_Sub1.anInt6770 >> 3 > i_6_; i_6_++) {
					for (int i_7_ = 0; ((Class152.anInt2205 >> 3 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
						int i_8_ = Class78.packetStream.readBits(-126, 1);
						if (i_8_ == 1)
							Class172.anIntArrayArrayArray2431[i_5_][i_6_][i_7_] = Class78.packetStream.readBits(-120,
									26);
						else
							Class172.anIntArrayArrayArray2431[i_5_][i_6_][i_7_] = -1;
					}
				}
			}
			Class78.packetStream.method2476((byte) -120);
			int regions = ((Class130_Sub1_Sub1.anInt7046 - ((Buffer) Class78.packetStream).position) / 16);
			MapRegion.xteas = new int[regions][4];
			for (int region_index = 0; regions > region_index; region_index++) {
				for (int key_index = 0; key_index < 4; key_index++) {
					MapRegion.xteas[region_index][key_index] = Class78.packetStream.readInt((byte) 98);
				}
			}
			Class95.anIntArray1251 = null;
			region_ids = new int[regions];
			Class211_Sub1.current_regions = new byte[regions][];
			Class246_Sub5.aByteArrayArray3885 = null;
			map_m = new int[regions];
			map_um = new int[regions];
			Class134.potential_objects = new byte[regions][];
			map_ul = new int[regions];
			Class247.aByteArrayArray3478 = new byte[regions][];
			Class59_Sub1_Sub3.aByteArrayArray6347 = new byte[regions][];
			map_l = new int[regions];
			regions = 0;
			for (int i_12_ = 0; i_12_ < 4; i_12_++) {
				for (int i_13_ = 0; ((Class38_Sub1_Sub1.anInt6770 >> 3 ^ 0xffffffff) < (i_13_ ^ 0xffffffff)); i_13_++) {
					for (int i_14_ = 0; ((Class152.anInt2205 >> 3 ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++) {
						int i_15_ = (Class172.anIntArrayArrayArray2431[i_12_][i_13_][i_14_]);
						if ((i_15_ ^ 0xffffffff) != 0) {
							int i_16_ = (i_15_ & 0xffe53f) >> 14;
							int i_17_ = (0x3ffd & i_15_) >> 3;
							int i_18_ = i_17_ / 8 + (i_16_ / 8 << 8);
							for (int i_19_ = 0; regions > i_19_; i_19_++) {
								if (region_ids[i_19_] == i_18_) {
									i_18_ = -1;
									break;
								}
							}
							if ((i_18_ ^ 0xffffffff) != 0) {
								region_ids[regions] = i_18_;
								int i_20_ = (0xffc5 & i_18_) >> 8;
								int i_21_ = 0xff & i_18_;
								map_m[regions] = (get_map_index(region_ids[regions])
										.method86("m" + i_20_ + "_" + i_21_));
								map_l[regions] = (get_map_index(region_ids[regions])
										.method86("l" + i_20_ + "_" + i_21_));
								map_um[regions] = (get_map_index(region_ids[regions])
										.method86("um" + i_20_ + "_" + i_21_));
								map_ul[regions] = (get_map_index(region_ids[regions])
										.method86("ul" + i_20_ + "_" + i_21_));
								regions++;
							}
						}
					}
				}
			}
			Class170.method1125(false, (byte) 104, chunkY, chunkX, forceRefresh);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kn.B(" + i + ')');
		}
	}

	static final int method290(byte i, int i_11_, int i_12_, int i_13_) {
		try {
			ISAAC.anInt627++;
			if (i_12_ == i_13_)
				return i_12_;
			if (i != 86)
				return 6;
			int i_14_ = -i_11_ + 128;
			int i_15_ = i_11_ * (i_13_ & 0x7f) + i_14_ * (i_12_ & 0x7f) >> 7;
			int i_16_ = i_11_ * (i_13_ & 0x380) + i_14_ * (i_12_ & 0x380) >> 7;
			int i_17_ = i_14_ * (0xfc00 & i_12_) + (i_13_ & 0xfc00) * i_11_ >> 7;
			return i_17_ & 0xfc00 | 0x380 & i_16_ | i_15_ & 0x7f;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dp.B(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	public static void method1660(byte i) {
		try {
			aClass191_3663 = null;
			aLongArrayArrayArray3648 = null;
			if (i == 119)
				aClass67_3647 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wj.K(" + i + ')');
		}
	}

	MapRegion(int i, int i_309_, int i_310_, boolean bool, UnderlayLoader class105, OverlayLoader class175) {
		anIntArray3650 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };
		try {
			aBool3658 = bool;
			aClass105_3667 = class105;
			regionSizeX = i_309_;
			aClass175_3659 = class175;
			regionSizeY = i_310_;
			anInt3670 = i;
			tileShapes = (new byte[anInt3670][regionSizeX][regionSizeY]);
			tileTypes = (new byte[anInt3670][regionSizeX][regionSizeY]);
			tileOverlays = (new short[anInt3670][regionSizeX][regionSizeY]);
			tileHeights = (new int[anInt3670][1 + regionSizeX][regionSizeY + 1]);
			tileLighting = (new byte[anInt3670][1 + regionSizeX][regionSizeY + 1]);
			tileUnderlays = (new short[anInt3670][regionSizeX][regionSizeY]);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.<init>(" + i + ',' + i_309_ + ',' + i_310_ + ',' + bool
					+ ',' + (class105 != null ? "{...}" : "null") + ',' + (class175 != null ? "{...}" : "null") + ')'));
		}
	}
}
