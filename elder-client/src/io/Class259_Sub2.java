package io;

class Class259_Sub2 extends Class259 {
	static SequenceType[] aClass124Array4958 = new SequenceType[14];
	static int[] anIntArray4959;
	static int anInt4960 = -1;
	static int anInt4962;
	static int anInt4963;

	static final void method2147(byte i, Widget class235, int i_0_, int i_1_) {
		do {
			try {
				anInt4962++;
				if (!Class187.aBool2653) {
					for (int i_2_ = 9; (i_2_ ^ 0xffffffff) <= -6; i_2_--) {
						String string = Material.get_if3_action(i_2_, false, class235);
						if (string != null) {
							Class59_Sub2_Sub2.anInt6026++;
							Class259_Sub2_Sub1.method2846(1002, (byte) -55, false, (long) (1 + i_2_),
									((Widget) class235).index, ((Widget) class235).data_text, true, string,
									((Widget) class235).hash, ((Widget) class235).item_id,
									Class40_Sub3.method1860(i_2_, class235, -119));
						}
					}
					String string = Class179.method1174(class235, (byte) 120);
					if (string != null) {
						Class246_Sub1_Sub3.anInt5706++;
						Class259_Sub2_Sub1.method2846(9, (byte) -55, false, 0L, ((Widget) class235).index,
								((Widget) class235).data_text, true, string, ((Widget) class235).hash,
								((Widget) class235).item_id, ((Widget) class235).anInt3284);
					}
					for (int i_3_ = 4; (i_3_ ^ 0xffffffff) <= -1; i_3_--) {
						String string_4_ = Material.get_if3_action(i_3_, false, class235);
						if (string_4_ != null) {
							Class59_Sub2_Sub2.anInt6026++;
							Class259_Sub2_Sub1.method2846(48, (byte) -55, false, (long) (1 + i_3_),
									((Widget) class235).index, ((Widget) class235).data_text, true, string_4_,
									((Widget) class235).hash, ((Widget) class235).item_id,
									Class40_Sub3.method1860(i_3_, class235, -113));
						}
					}
					if (Widget.get_active_properties(class235).method2121(1)) {
						NodeSub.anInt3737++;
						if (((Widget) class235).aString3229 == null)
							Class259_Sub2_Sub1.method2846(60, (byte) -55, false, 0L, ((Widget) class235).index, "",
									true, Class_l_Sub2.aClass67_5478.get(Preferences.language_code),
									((Widget) class235).hash, ((Widget) class235).item_id, -1);
						else
							Class259_Sub2_Sub1.method2846(60, (byte) -55, false, 0L, ((Widget) class235).index, "",
									true, ((Widget) class235).aString3229, ((Widget) class235).hash,
									((Widget) class235).item_id, -1);
					}
				} else {
					ParamType class118 = ((Class109_Sub1.anInt3754 ^ 0xffffffff) == 0 ? null
							: (ParamType.list(Class109_Sub1.anInt3754)));
					if (Widget.get_active_properties(class235).method2118(i + 16339) && (0x20 & Node.anInt3469) != 0
							&& (class118 == null || (class235.method1501(i - 119, (((ParamType) class118).default_int),
									Class109_Sub1.anInt3754) != ((ParamType) class118).default_int))) {
						Class259_Sub2_Sub1.method2846(47, (byte) -55, false, 0L, ((Widget) class235).index,
								(Class246_Sub7.aString3964 + " -> " + ((Widget) class235).data_text), true,
								Class218.aString3026, ((Widget) class235).hash, ((Widget) class235).item_id,
								Tile.anInt2148);
						Class149.anInt2188++;
					}
				}
				if (i == 118)
					break;
				anInt4960 = 79;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("on.C(" + i + ',' + (class235 != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final int preload_sprites(CacheIndex sprite_index) {
		anInt4963++;
		int i_5_ = 0;
		if (sprite_index.method112(-1, Class59_Sub4.anInt5187))
			i_5_++;
		if (sprite_index.method112(-1, Class_c_Sub1.new_hit_bars))
			i_5_++;
		if (sprite_index.method112(-1, Class43.anInt636))
			i_5_++;
		if (sprite_index.method112(-1, Class130_Sub1_Sub1.anInt7045))
			i_5_++;
		if (sprite_index.method112(-1, Class259_Sub1.anInt4506))
			i_5_++;
		if (sprite_index.method112(-1, Class246_Sub1_Sub8_Sub1.anInt7159))
			i_5_++;
		if (sprite_index.method112(-1, Class194_Sub2.anInt4954))
			i_5_++;
		if (sprite_index.method112(-1, OutgoingPacket.anInt2862))
			i_5_++;
		if (sprite_index.method112(-1, Player.f_nd))
			i_5_++;
		if (sprite_index.method112(-1, Class21_Sub1.anInt3900))
			i_5_++;
		if (sprite_index.method112(-1, AbstractModel.anInt1439))
			i_5_++;
		if (sprite_index.method112(-1, Class107.anInt1507))
			i_5_++;
		if (sprite_index.method112(-1, Class_ds.anInt6722))
			i_5_++;
		if (sprite_index.method112(-1, Class246_Sub19_Sub2.anInt6805))
			i_5_++;
		if (sprite_index.method112(-1, Class233.anInt3182))
			i_5_++;
		if (sprite_index.method112(-1, Class95.anInt1246))
			i_5_++;
		return i_5_;
	}

	static final int preload_550_sprites(CacheIndex sprite_index) {
		anInt4963++;
		int i_5_ = 0;
		if (sprite_index.method112(-1, Class59_Sub4.anInt5187))
			i_5_++;
		if (sprite_index.method112(-1, Class_c_Sub1.new_hit_bars))
			i_5_++;
		if (sprite_index.method112(-1, Class43.anInt636))
			i_5_++;
		if (sprite_index.method112(-1, Class130_Sub1_Sub1.anInt7045))
			i_5_++;
		if (sprite_index.method112(-1, Class259_Sub1.anInt4506))
			i_5_++;
		if (sprite_index.method112(-1, Class246_Sub1_Sub8_Sub1.anInt7159))
			i_5_++;
		if (sprite_index.method112(-1, Class194_Sub2.anInt4954))
			i_5_++;
		if (sprite_index.method112(-1, OutgoingPacket.anInt2862))
			i_5_++;
		if (sprite_index.method112(-1, Player.f_nd))
			i_5_++;
		if (sprite_index.method112(-1, Class21_Sub1.anInt3900))
			i_5_++;
		if (sprite_index.method112(-1, AbstractModel.anInt1439))
			i_5_++;
		if (sprite_index.method112(-1, Class107.anInt1507))
			i_5_++;
		if (sprite_index.method112(-1, Class_ds.anInt6722))
			i_5_++;
		if (sprite_index.method112(-1, Class246_Sub19_Sub2.anInt6805))
			i_5_++;
		if (sprite_index.method112(-1, Class233.anInt3182))
			i_5_++;
		if (sprite_index.method112(-1, Class95.anInt1246))
			i_5_++;
		if (sprite_index.method112(-1, 494))
			i_5_++;
		if (sprite_index.method112(-1, 495))
			i_5_++;
		if (sprite_index.method112(-1, 496))
			i_5_++;
		if (sprite_index.method112(-1, 497))
			i_5_++;
		if (sprite_index.method112(-1, 645))
			i_5_++;
		if (sprite_index.method112(-1, 646))
			i_5_++;
		if (sprite_index.method112(-1, 647))
			i_5_++;
		if (sprite_index.method112(-1, 648))
			i_5_++;
		if (sprite_index.method112(-1, 764))
			i_5_++;
		if (sprite_index.method112(-1, 819))
			i_5_++;
		if (sprite_index.method112(-1, 1442))
			i_5_++;
		if (sprite_index.method112(-1, 1443))
			i_5_++;
		if (sprite_index.method112(-1, 1444))
			i_5_++;
		if (sprite_index.method112(-1, 1445))
			i_5_++;
		if (sprite_index.method112(-1, 1446))
			i_5_++;
		if (sprite_index.method112(-1, 1447))
			i_5_++;
		return i_5_;
	}

	static final int preload_osrs_sprites(CacheIndex osrs_sprite_index) {
		anInt4963++;
		int i_5_ = 0;
		if (osrs_sprite_index.method112(-1, Class_c_Sub1.osrs_green_hit_bar))
			i_5_++;
		if (osrs_sprite_index.method112(-1, Class_c_Sub1.osrs_red_hit_bar))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 317))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 1358))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 1359))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 1360))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 1361))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 1362))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 1363))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 494))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 495))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 496))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 497))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 645))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 646))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 647))
			i_5_++;
		if (osrs_sprite_index.method112(-1, 648))
			i_5_++;
		return i_5_;
	}

	public static void method2149(int i) {
		try {
			anIntArray4959 = null;
			aClass124Array4958 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "on.B(" + i + ')');
		}
	}

	static {
		new MultilingualString("That user is not in this channel.",
				"Dieser Benutzer befindet sich nicht in diesem Chatraum.",
				"Cet utilisateur n'est pas dans ce canal.", "Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.");
	}
}
