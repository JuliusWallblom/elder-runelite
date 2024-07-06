package io;

final class Class_q_Sub1 extends Class_q {
	static int anInt6659;
	static int anInt6660;
	static int anInt6661;
	private byte[] aByteArray6662;
	static int anInt6664 = -1;
	static int anInt6665;
	static int anInt6666;
	static int anInt6667;
	static int anInt6668;
	static int[] texture_array = new int[6];
	static int anInt6670 = 0;
	static long aLong6671;

	final void method2060(byte i, int i_0_, int i_1_) {
		try {
			anInt6661++;
			int i_2_ = i_0_ * 2;
			int i_3_ = 0xff & i;
			aByteArray6662[i_2_++] = (byte) (3 * i_3_ >> 5);
			int i_4_ = 101 / ((i_1_ + 21) / 51);
			aByteArray6662[i_2_] = (byte) (3 * i_3_ >> 5);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nd.E(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2731(int i, Widget class235, SceneGraph class260) {
		do {
			try {
				anInt6667++;
				boolean bool = (MapRegion.aClass191_3663.method1248(class260, ((Widget) class235).item_id, i + 16777101,
						(((Widget) class235).f_db ? (((Player) Client.local_player).appearance) : null),
						((Widget) class235).item_quantity_mode, ((Widget) class235).item_quantity,
						((Widget) class235).border_width, ((Widget) class235).border_color | i)) == null;
				if (!bool)
					break;
				Class213.aClass166_2982
						.push_head(new Class246_Sub12(((Widget) class235).item_id, ((Widget) class235).item_quantity,
								((Widget) class235).border_width, (~0xffffff | ((Widget) class235).border_color),
								((Widget) class235).item_quantity_mode, ((Widget) class235).f_db));
				Widget.redraw_widget(class235);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("nd.B(" + i + ',' + (class235 != null ? "{...}" : "null")
						+ ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2732(int i) {
		do {
			try {
				Widget.custom_pre_eoc_550_sprite_cache = null;
				Widget.pre_eoc_550_sprite_cache = null;
				Widget.osrs_widget_sprite_cache = null;
				Widget.pre_eoc_634_sprite_cache = null;
				texture_array = null;
				if (i == -11878)
					break;
				method2731(-124, null, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "nd.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2733(Class255_Sub1 class255_sub1, int flag, byte[][] regionsData) {
		try {
			anInt6665++;

			// Check if the method should proceed
			if (flag == 8) {
				// Initialize an array to track loading state
				int[] loadingState = { -1, 0, 0, 0, 0 };

				// Iterate over the map layers
				for (int layer = 0; layer < class255_sub1.anInt3670; layer++) {
					IterableNodeHashTable.method545((byte) -109);

					// Iterate over x and y sectors (each sector is 8x8 units)
					for (int sectorX = 0; sectorX < Class38_Sub1_Sub1.anInt6770 / 8; sectorX++) {
						for (int sectorY = 0; sectorY < Class152.anInt2205 / 8; sectorY++) {
							boolean regionLoaded = false;

							// Get region code from map
							int regionCode = Class172.anIntArrayArrayArray2431[layer][sectorX][sectorY];

							// Check if region code is valid
							if (regionCode != -1) {
								int rotation = (regionCode >> 24) & 0x3;
								int orientation = (regionCode >> 1) & 0x3;
								int mapX = (regionCode >> 14) & 0x3FF;
								int mapY = (regionCode >> 3) & 0x7FF;
								int regionId = (mapX / 8 << 8) + mapY / 8;

								// Load region data if available
								if (!class255_sub1.aBool3658 || rotation == 0) {
									for (int i = 0; i < MapRegion.region_ids.length; i++) {
										if (MapRegion.region_ids[i] == regionId && regionsData[i] != null) {
											Buffer stream = new Buffer(regionsData[i]);

											// Load terrain and other data for the region
											class255_sub1.method1657(orientation, stream, rotation,
													Class95.aClass199Array1235,
													(byte) -12, mapY, layer, sectorY * 8, sectorX * 8, mapX);

											class255_sub1.method2339(layer, sectorY * 8, stream,
													(loadingState[0] == -1) ? loadingState : null, Client.sprite_loader,
													mapY, mapX, orientation, flag, rotation, sectorX * 8);

											regionLoaded = true;
											break;
										}
									}
								}
							}

							// If no region data was found or loaded, use a default loading method
							if (!regionLoaded) {
								class255_sub1.method1648(true, 8, layer, 8, sectorY * 8, sectorX * 8);
							}
						}
					}
				}

				// Check if loading state has been updated and set global state accordingly
				if (loadingState[0] != -1) {
					Class_u_Sub1.aClass230_5685 = Class246_Sub31.aClass203_5038.method1335(
							loadingState[1], loadingState[0], 118, loadingState[2], loadingState[3],
							Class246_Sub1_Sub14.aClass214_6597);
					Class246_Sub28_Sub8.anInt6076 = loadingState[4];
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Class_q_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	static final void method2734(int[] is, Npc class_r_sub2, int[] is_16_, boolean bool, int[] is_17_) {
		do {
			try {
				for (int i = 0; (i ^ 0xffffffff) > (is_16_.length ^ 0xffffffff); i++) {
					int i_18_ = is_16_[i];
					int i_19_ = is_17_[i];
					int i_20_ = is[i];
					for (int i_21_ = 0; i_19_ != 0
							&& (((Entity) class_r_sub2).aClass148Array6467).length > i_21_; i_21_++) {
						if ((0x1 & i_19_) != 0) {
							if (i_18_ == -1)
								((Entity) class_r_sub2).aClass148Array6467[i_21_] = null;
							else {
								SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, i_18_);
								int i_22_ = ((SequenceType) class124).replyMode;
								Class148 class148 = (((Entity) class_r_sub2).aClass148Array6467[i_21_]);
								if (class148 != null) {
									if (i_18_ != ((Class148) class148).anInt2179) {
										if (((SequenceType) class124).forcedPriority >= ((SequenceType) (Class59_Sub3_Sub3.aClass45_6275
												.list(3, (((Class148) class148).anInt2179)))).forcedPriority)
											class148 = ((Entity) class_r_sub2).aClass148Array6467[i_21_] = null;
									} else if (i_22_ != 0) {
										if (i_22_ != 1) {
											if ((i_22_ ^ 0xffffffff) == -3)
												((Class148) class148).anInt2183 = 0;
										} else {
											((Class148) class148).anInt2180 = 1;
											((Class148) class148).anInt2177 = 0;
											((Class148) class148).anInt2182 = 0;
											((Class148) class148).anInt2183 = 0;
											((Class148) class148).anInt2181 = i_20_;
											Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r_sub2).x), 0,
													(((Class59_Sub3) class_r_sub2).current_plane),
													(((Class59_Sub3) class_r_sub2).y), !bool, class124, false);
										}
									} else
										class148 = ((Entity) class_r_sub2).aClass148Array6467[i_21_] = null;
								}
								if (class148 == null) {
									class148 = ((Entity) class_r_sub2).aClass148Array6467[i_21_] = new Class148();
									((Class148) class148).anInt2180 = 1;
									((Class148) class148).anInt2181 = i_20_;
									((Class148) class148).anInt2179 = i_18_;
									((Class148) class148).anInt2182 = 0;
									((Class148) class148).anInt2177 = 0;
									((Class148) class148).anInt2183 = 0;
									Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r_sub2).x), 0,
											(((Class59_Sub3) class_r_sub2).current_plane),
											(((Class59_Sub3) class_r_sub2).y), !bool, class124, false);
								}
							}
						}
						i_19_ >>>= 1;
					}
				}
				anInt6659++;
				if (bool == false)
					break;
				Widget.custom_pre_eoc_550_sprite_cache = null;
				Widget.pre_eoc_550_sprite_cache = null;
				Widget.pre_eoc_634_sprite_cache = null;
				Widget.osrs_widget_sprite_cache = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("nd.C(" + (is != null ? "{...}" : "null") + ',' + (class_r_sub2 != null ? "{...}" : "null")
								+ ',' + (is_16_ != null ? "{...}" : "null") + ',' + bool + ','
								+ (is_17_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final byte[] method2735(int i, int i_23_, int i_24_, int i_25_) {
		try {
			anInt6660++;
			aByteArray6662 = new byte[i_24_ * i_25_ * (i * 2)];
			if (i_23_ != -201)
				anInt6670 = -74;
			this.method263((byte) -95, i_24_, i, i_25_);
			return aByteArray6662;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nd.F(" + i + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
		}
	}

	static {
		new MultilingualString("Unable to add name - unknown player.",
				"Name konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
				"Impossible d'ajouter le nom - joueur inconnu.",
				"N\u00e3o foi poss\u00edvel adicionar um nome - jogador desconhecido.");
		aLong6671 = -1L;
	}
}
