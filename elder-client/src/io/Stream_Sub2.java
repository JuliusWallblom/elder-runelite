package io;

import jaclib.memory.Stream;

/* Stream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Stream_Sub2 extends Buffer {
	static int anInt6181;
	static int anInt6182;
	static int anInt6183;
	static int[] anIntArray6184 = { 32 + Settings.draw_distance, 39 + Settings.draw_distance,
			44 + Settings.draw_distance, 47 + Settings.draw_distance };
	static int anInt6185;
	static int anInt6186;
	static int anInt6187;
	static int anInt6188 = 0;
	static IncomingPacket INDEX_15_SOUND_IN_PACKET = new IncomingPacket(100, 6);
	static int anInt6190;

	final void method2591(float f, int i) {
		try {
			anInt6182++;
			if (i != 1739667504)
				method2594(null, 117);
			int i_0_ = Stream.floatToRawIntBits(f);
			((Buffer) this).buffer[((Buffer) this).position++] = (byte) i_0_;
			((Buffer) this).buffer[((Buffer) this).position++] = (byte) (i_0_ >> 8);
			((Buffer) this).buffer[((Buffer) this).position++] = (byte) (i_0_ >> 16);
			((Buffer) this).buffer[((Buffer) this).position++] = (byte) (i_0_ >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hk.AC(" + f + ',' + i + ')');
		}
	}

	static final IncomingPacket[] method2592(int i) {
		try {
			int i_1_ = 114 % ((-72 - i) / 46);
			anInt6185++;
			return (new IncomingPacket[] { Class40_Sub1.aClass13_3781, Class_e.INTERFACE_TEXT_IN,
					Class127.FRIENDS_LIST_PACKET, Class232.aClass13_3174, Class247.aClass13_3479,
					Class130_Sub1.aClass13_3729, Class_ss.aClass13_7056, Class176.aClass13_2476, Class125.aClass13_1756,
					AbstractModel.SEND_SKILLS_IN, Class303.aClass13_2302, Class259_Sub3.aClass13_5356,
					TextureOperation.GLOBAL_CONFIG_BYTE, MapRegion.DECODE_MAP_REGION_IN, Class5.SEND_VAR_BIT_BYTE,
					Class246_Sub28_Sub34.aClass13_7007, Class99.SEND_URL_PACKET, Class246_Sub28_Sub34.aClass13_7006,
					Class12.aClass13_177, ContextMenus.INDEX_14_SOUND_IN, Class59_Sub1_Sub2.aClass13_6132,
					Class129.PLAY_MUSIC_EFFECTS_IN, Class303.OPEN_INTERFACE_IN, Class127.aClass13_1791,
					Class246_Sub28_Sub10.aClass13_6157, Class239.SEND_IGNORE_PACKET, Class188_Sub1.aClass13_3923,
					Player.RUNSCRIPT_IN, Class58.WORLD_TILE_PACKET, Class246_Sub43.aClass13_5601,
					Class109_Sub3.aClass13_3953, Class240.aClass13_3388, InvTypeLoader.SEND_UPDATE_ITEMS_IN,
					Class246_Sub7.aClass13_3960, Class246_Sub31.SOME_PACKET_2, ISAAC.SEND_IGNORES_LIST_PACKET,
					Class115.aClass13_1602, UnderlayLoader.aClass13_1466, EnumLoader.aClass13_2042,
					StructLoader.aClass13_801, Class246_Sub1_Sub4.SEND_VAR_BYTE,
					Class38_Sub1.HIDE_INTERFACE_COMPONENT_IN, Class246_Sub19.aClass13_4708,
					Class112.REMOVE_GROUND_ITEMS_PACKET, Class121.CLOSE_INTERFACES_IN,
					Class_a.DESTROY_WORLD_OBJECT_PACKET, VarpType.aClass13_1221,
					Class78.SEND_GRAND_EXCHANGE_OFFER_PACKET, Class_j.aClass13_1479, Class180.aClass13_2523,
					Class244.aClass13_3455, Cursors.aClass13_2243, Class21_Sub4.GLOBAL_CONFIG_INT,
					Class213.GLOBAL_STRING_1_PACKET, IdentityKitLoader.GLOBAL_STRING_2_PACKET, SwitchInt.aClass13_5081,
					Cursors.aClass13_2238, Class59_Sub2.SEND_PROJECTILE_PACKET, Class240.aClass13_3386,
					MapRegion.DYNAMIC_MAP_REGION_PACKET, Class223.aClass13_3076, Class246_Sub28_Sub23.SEND_GRAPHICS,
					Class68.aClass13_904, Class195.PLAY_MUSIC_IN, Class_u.aClass13_4700, aClass13_3472,
					Class205.aClass13_2884, Model.aClass13_1369, Class179.SEND_GROUND_ITEM_PACKET,
					Class59_Sub5_Sub1.aClass13_5825, Class170.SPAWN_WORLD_OBJECT_PACKET, Class43.aClass13_637,
					Class59_Sub2_Sub3.aClass13_6614, WidgetParent.aClass13_5515, Class195.PLAYER_OPTION_PACKET,
					Class239.aClass13_3375, StructType.aClass13_6858, Class40_Sub3.aClass13_4058, Class82.aClass13_1070,
					Class101.SEND_VAR_INT, Class246_Sub35.aClass13_5159, NodeSub.SEND_CLAN_CHAT_CHANNEL_PACKET,
					Class3.aClass13_32, Class109.aClass13_1549, MapFunction.aClass13_2040, Class79_Sub1.aClass13_5167,
					Filestore.ANIMATION_ON_INTERFACE_PACKET, Class246_Sub30_Sub1.aClass13_5763, Class224.aClass13_3094,
					Class109_Sub1.aClass13_3765, Class246_Sub28_Sub13.aClass13_6292, VarcLoader.aClass13_1000,
					Class91.aClass13_1183, ClickMaskNode.SEND_CAMERA_SHAKE_PACKET, Class246_Sub38.aClass13_5444,
					Class56.PROCESS_NPC_UPDATING_IN, Class246_Sub38.aClass13_5433, Class_m.PLAYER_UPDATE_PACKET,
					Class149.aClass13_2190, Class34.aClass13_448, INDEX_15_SOUND_IN_PACKET, MapScenes.aClass13_3636,
					Class136.ROOT_INTER, Class245.aClass13_3463, Class60.aClass13_831, MapFunctions.aClass13_2338,
					Canvas_Sub1.aClass13_6890, Class245.RECEIVE_FRIEND_CHAT_MESSAGE_PACKET, Class20.aClass13_315,
					Class223.aClass13_3074, Class38_Sub1.SET_INTERFACE_SPRITE_IN, Class38_Sub1.SET_WIDGET_HEIGHT_IN });
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hk.UB(" + i + ')');
		}
	}

	static final void method2594(Player class_r_sub1, int i) {
		try {
			anInt6190++;
			Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class187.aClass85_2651
					.get((long) ((Entity) class_r_sub1).f_db));
			if (class246_sub5 != null)
				class246_sub5.method1811(-2212);
			else
				Class66.method434(((Entity) class_r_sub1).f_mc[0], -1, null, class_r_sub1,
						((Entity) class_r_sub1).f_nc[0], 0, ((Class59_Sub3) class_r_sub1).current_plane, null);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"hk.WB(" + (class_r_sub1 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method2595(float f, byte i) {
		try {
			anInt6181++;
			int i_2_ = Stream.floatToRawIntBits(f);
			((Buffer) this).buffer[((Buffer) this).position++] = (byte) (i_2_ >> 24);
			((Buffer) this).buffer[((Buffer) this).position++] = (byte) (i_2_ >> 16);
			((Buffer) this).buffer[((Buffer) this).position++] = (byte) (i_2_ >> 8);
			if (i == 98)
				((Buffer) this).buffer[((Buffer) this).position++] = (byte) i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hk.TB(" + f + ',' + i + ')');
		}
	}

	public static void method2596(int i) {
		try {
			anIntArray6184 = null;
			if (i == -8625)
				INDEX_15_SOUND_IN_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hk.VB(" + i + ')');
		}
	}

	Stream_Sub2(int i) {
		super(i);
	}

	static final void method2597(int i, int i_3_, int i_4_, int i_5_) {
		try {
			anInt6187++;
			if (i_5_ == 0) {
				Class138 class138 = Class_a.aClass138ArrayArray1175[i][i_3_];
				Player.method2918((class138 != null ? class138 : Class22.aClass138_328), i_4_, 103);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hk.SB(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}
}
