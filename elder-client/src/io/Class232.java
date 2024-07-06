package io;

import io.cache.Cache;
import io.cache.IndexConstants;
import io.cache.Revision;

abstract class Class232 {
	static int anInt3173;
	static IncomingPacket aClass13_3174 = new IncomingPacket(3, -1);
	static int anInt3175;
	static int anInt3176;
	static MultilingualString aClass67_3177 = new MultilingualString("Loaded defaults", "Standardeinstellungen geladen",
			"Param\u00e8tres par d\u00e9faut charg\u00e9s", "Padr\u00f5es carregados");
	static MultilingualString aClass67_3178 = new MultilingualString("red:", "rot:", "rouge:", "vermelho:");
	static short aShort3179 = 32767;

	abstract Class188 method1482(int i);

	public Class232() {
		/* empty */
	}

	static final void method1483(Widget class235, Class128 class128, int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, long l) {
		try {
			anInt3175++;
			int i_5_ = i_4_ * i_4_ + i * i;
			if (i_2_ == 256 && (long) i_5_ <= l) {
				int i_6_ = Math.min(((Widget) class235).screen_width / 2, ((Widget) class235).screen_height / 2);
				if (i_6_ * i_6_ < i_5_) {
					i_6_ -= 10;
					int i_7_;
					do {
						if ((Class130_Sub3.anInt4417 ^ 0xffffffff) == -5) {
							i_7_ = (int) Camera.camera_yaw & 0x3fff;
							if (!Client.f_ob)
								break;
						}
						i_7_ = 0x3fff & (Class95.anInt1253 + (int) Camera.camera_yaw);
					} while (false);
					int i_8_ = MathUtils.SINE[i_7_];
					int i_9_ = MathUtils.COSINE[i_7_];
					if ((Class130_Sub3.anInt4417 ^ 0xffffffff) != -5) {
						i_9_ = i_9_ * 256 / (256 + Class246_Sub12.anInt4405);
						i_8_ = 256 * i_8_ / (256 + Class246_Sub12.anInt4405);
					}
					int i_10_ = i * i_9_ + i_8_ * i_4_ >> 15;
					int i_11_ = -(i * i_8_) + i_4_ * i_9_ >> 15;
					double d = Math.atan2((double) i_10_, (double) i_11_);
					int i_12_ = (int) (Math.sin(d) * (double) i_6_);
					int i_13_ = (int) (Math.cos(d) * (double) i_6_);
					Class169.aClass_lArray2410[i_1_].method736(
							((float) ((Widget) class235).screen_width / 2.0F + (float) i_0_ + (float) i_12_),
							((float) -i_13_ + ((float) ((Widget) class235).screen_height / 2.0F + (float) i_3_)), 4096,
							(int) (65535.0 * (-d / 6.283185307179586)));
				} else
					NpcType.method1635(i_0_, true, SceneGraph.aClass_lArray3726[i_1_], class235, class128, i_4_, i,
							i_3_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("up.K(" + (class235 != null ? "{...}" : "null") + ',' + (class128 != null ? "{...}" : "null") + ','
							+ i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + l + ')'));
		}
	}

	static final void method1484(byte i) {
		try {
			anInt3176++;
			Class82.underlay_loader.method702((byte) -128);
			ContextMenus.overlay_loader.method1153(98);
			Material.aClass92_3358.method587((byte) -98);
			Class143.aClass251_2067.method1605((byte) -24);
			Class179.aClass228_2518.method1459(false);
			MapRegion.aClass191_3663.method1255((byte) -73);
			Class59_Sub3_Sub3.aClass45_6275.method303(2);
			Class195.aClass177_2745.method1166(true);
			Class246_Sub30_Sub1.aClass17_5761.method164(1068);
			SubIncomingPacket.aClass209_7085.method1372((byte) -79);
			ParamType.aClass_v1641.method696(-52);
			Client.map_scenes.method1637(34);
			Client.map_functions.method1091(-93);
			Class241.aClass193_3398.method1269((byte) 84);
			Class246_Sub1_Sub10.f_eb.method1080((byte) 122);
			Class246_Sub31.aClass203_5038.method1333(7569);
			Class246_Sub1_Sub14.aClass214_6597.method1395((byte) 25);
			Class228.aClass189_3132.method1238(64);
			CacheIndex.aClass156_150.method1033(true);
			Class246_Sub28_Sub25.struct_loader.method392((byte) 106);
			CollisionMap.method1319(8);
			Class252.method1621((byte) -107);
			Class109_Sub3.method1823(1);
			if (Class208.aClass205_2930 != Class260_Sub2.aClass205_4297) {
				for (int i_14_ = 0; Class220.aByteArrayArray3051.length > i_14_; i_14_++)
					Class220.aByteArrayArray3051[i_14_] = null;
				Class55.anInt781 = 0;
			}
			Class78.method491(-99);
			Class134.method901(51);
			Class246_Sub28_Sub5.method2543(false);
			PacketsDecoder.method180(-1);
			Class259.method1675(false);
			ScriptExecutor.aClass54_2139.method369(false);
			Client.sprite_loader.method1752();
			Class109_Sub3.cs2_cache.method873((byte) -63);
			Class109_Sub3.cs2_cache_550.method873((byte) -63);
			Class109_Sub3.cs2_cache_osrs.method873((byte) -63);
			Class106_Sub1.method1890((byte) 3);
			Cache.get_index(Revision.PRE_EOC_634, "skeletons").destroy();
			Cache.get_index(Revision.PRE_EOC_634, "skins").destroy();
			Cache.get_index(Revision.PRE_EOC_634, "config").destroy();
			Cache.get_index(Revision.PRE_EOC_634, "widgets").destroy();
			Cache.get_index(Revision.PRE_EOC_634, "sound_effects").destroy();
			Cache.get_index(Revision.PRE_EOC_634, "maps").destroy();
			Cache.get_index(Revision.PRE_EOC_634, "music").destroy();
			Cache.get_index(Revision.PRE_EOC_634, "models").destroy();
			Cache.get_index(Revision.PRE_EOC_634, "sprites").destroy();
			Cache.get_index(Revision.PRE_EOC_634, "textures").destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_BINARY_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_EMPTY_11_INDEX).destroy();
			Cache.get_index(Revision.PRE_EOC_634, "cs2").destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_MIDI_INSTRUMENTS_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_EMPTY_15_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_LOC_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_ENUM_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_NPC_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_OBJ_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_SEQ_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_SPOT_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_STRUCT_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_WORLD_MAP_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_QUICK_CHAT_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_QUICK_CHAT_GLOBAL_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_MATERIALS_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_PARTICLE_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_DEFAULTS_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_BILLBOARD_INDEX).destroy();
			Cache.client_cache.get(IndexConstants.NATIVE_LIBRARIES_INDEX).destroy();
			Cache.get_index(Revision.OSRS, "sprites").destroy();
			Cache.get_index(Revision.OSRS, "models").destroy();
			Cache.get_index(Revision.OSRS, "config").destroy();
			Cache.get_index(Revision.OSRS, "skeletons").destroy();
			Cache.get_index(Revision.OSRS, "skins").destroy();
			Cache.get_index(Revision.OSRS, "widgets").destroy();
			Cache.get_index(Revision.OSRS, "cs2").destroy();
			Cache.get_index(Revision.OSRS, "textures").destroy();
			Cache.get_index(Revision.OSRS, "maps").destroy();
			Cache.get_index(Revision.CUSTOM_OSRS, "widgets").destroy();
			Cache.get_index(Revision.PRE_EOC_550, "widgets").destroy();
			Cache.get_index(Revision.PRE_EOC_550, "sprites").destroy();
			Cache.get_index(Revision.PRE_EOC_550, "cs2").destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_ENUM_INDEX).destroy();
			Cache.get_index(Revision.PRE_EOC_550, "config").destroy();
			Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "widgets").destroy();
			Cache.get_index(Revision.PRE_EOC_550, "models").destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_OBJ_INDEX).destroy();
			Cache.get_index(Revision.PRE_EOC_550, "skeletons").destroy();
			Cache.get_index(Revision.PRE_EOC_550, "skins").destroy();
			Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_SEQ_INDEX).destroy();
			Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "sprites").destroy();
			MapFunction.aClass54_2034.method369(false);
			Class246_Sub41_Sub2.aClass54_6474.method369(false);
			Class211_Sub1.aClass54_5351.method369(false);
			Class56.aClass54_793.method369(false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "up.O(" + i + ')');
		}
	}

	abstract void method1485(int i);

	abstract void method1486(int i);

	public static void method1487(int i) {
		do {
			try {
				aClass67_3177 = null;
				aClass13_3174 = null;
				aClass67_3178 = null;
				if (i == -5631)
					break;
				method1483(null, null, -35, 96, -117, 84, 19, -50, -97L);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "up.M(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract boolean method1488(int i, int i_15_);

	static final boolean method1489(Stream_Sub1 stream_sub1, int i, int i_16_) {
		try {
			if (i < 76)
				aClass67_3177 = null;
			anInt3173++;
			int i_17_ = stream_sub1.readBits(-67, 2);
			if ((i_17_ ^ 0xffffffff) == -1) {
				if (stream_sub1.readBits(-117, 1) != 0)
					method1489(stream_sub1, 104, i_16_);
				int i_18_ = stream_sub1.readBits(-64, 6);
				int i_19_ = stream_sub1.readBits(-121, 6);
				boolean bool = (stream_sub1.readBits(-61, 1) ^ 0xffffffff) == -2;
				if (bool)
					Class218.anIntArray3025[Class252.anInt3567++] = i_16_;
				if (Class143.players[i_16_] != null)
					throw new RuntimeException("hr:lr");
				Class240 class240 = Class166.aClass240Array2365[i_16_];
				Player class_r_sub1 = (Class143.players[i_16_] = new Player());
				((Entity) class_r_sub1).f_db = i_16_;
				if (ObjType.aStreamArray2770[i_16_] != null)
					class_r_sub1.readAppearance(ObjType.aStreamArray2770[i_16_], -2147483648);
				class_r_sub1.method2664(125, ((Class240) class240).anInt3380);
				((Entity) class_r_sub1).faceEntity = ((Class240) class240).anInt3379;
				int i_20_ = ((Class240) class240).anInt3383;
				int i_21_ = i_20_ >> 28;
				int i_22_ = (0x3fd38e & i_20_) >> 14;
				((Player) class_r_sub1).aBool7129 = ((Class240) class240).aBool3378;
				int i_23_ = i_20_ & 0xff;
				((Entity) class_r_sub1).f_rc[0] = Class234.movementTypes[i_16_];
				((Class59_Sub3) class_r_sub1).current_plane = (byte) i_21_;
				class_r_sub1.method2913(-Client.base_y + (i_19_ + (i_23_ << 6)), 0,
						-Client.base_x + ((i_22_ << 6) - -i_18_));
				((Player) class_r_sub1).aBool7142 = false;
				Class166.aClass240Array2365[i_16_] = null;
				return true;
			}
			if ((i_17_ ^ 0xffffffff) == -2) {
				int i_24_ = stream_sub1.readBits(-121, 2);
				int i_25_ = (((Class240) Class166.aClass240Array2365[i_16_]).anInt3383);
				((Class240) Class166.aClass240Array2365[i_16_]).anInt3383 = (i_25_ & 0xfffffff)
						+ ((i_25_ >> 28) + i_24_ << 28 & 0x30000000);
				return false;
			}
			if ((i_17_ ^ 0xffffffff) == -3) {
				int i_26_ = stream_sub1.readBits(-49, 5);
				int i_27_ = i_26_ >> 3;
				int i_28_ = i_26_ & 0x7;
				int i_29_ = (((Class240) Class166.aClass240Array2365[i_16_]).anInt3383);
				int i_30_ = i_27_ + (i_29_ >> 28) & 0x3;
				int i_31_ = 0xff & i_29_ >> 14;
				int i_32_ = i_29_ & 0xff;
				if ((i_28_ ^ 0xffffffff) == -1) {
					i_31_--;
					i_32_--;
				}
				if ((i_28_ ^ 0xffffffff) == -2)
					i_32_--;
				if ((i_28_ ^ 0xffffffff) == -3) {
					i_32_--;
					i_31_++;
				}
				if ((i_28_ ^ 0xffffffff) == -4)
					i_31_--;
				if (i_28_ == 4)
					i_31_++;
				if ((i_28_ ^ 0xffffffff) == -6) {
					i_32_++;
					i_31_--;
				}
				if ((i_28_ ^ 0xffffffff) == -7)
					i_32_++;
				if (i_28_ == 7) {
					i_31_++;
					i_32_++;
				}
				((Class240) Class166.aClass240Array2365[i_16_]).anInt3383 = i_32_ + ((i_30_ << 28) - -(i_31_ << 14));
				return false;
			}
			int i_33_ = stream_sub1.readBits(-121, 18);
			int i_34_ = i_33_ >> 16;
			int i_35_ = (0xff14 & i_33_) >> 8;
			int i_36_ = i_33_ & 0xff;
			int i_37_ = ((Class240) Class166.aClass240Array2365[i_16_]).anInt3383;
			int i_38_ = i_34_ + (i_37_ >> 28) & 0x3;
			int i_39_ = (i_37_ >> 14) + i_35_ & 0xff;
			int i_40_ = i_37_ + i_36_ & 0xff;
			((Class240) Class166.aClass240Array2365[i_16_]).anInt3383 = i_40_ + (i_38_ << 28) - -(i_39_ << 14);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("up.L(" + (stream_sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_16_ + ')'));
		}
	}

	static final void method1490(int i, int i_41_, int i_42_) {
		Tile class147 = Class106.tiles[i][i_41_][i_42_];
		if (class147 != null) {
			if (((Tile) class147).floorDecorationIThink != null) {
				((Tile) class147).floorDecorationIThink = null;
			}
		}
	}
}
