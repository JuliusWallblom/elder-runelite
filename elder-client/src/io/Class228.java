package io;

import io.cache.Revision;

final class Class228 {
	static int anInt3121;
	static int anInt3122;
	static int anInt3123;
	static int anInt3124;
	static int anInt3125;
	static int anInt3127;
	private HashMap npc_cache_634 = new HashMap(64);
	private HashMap npc_cache_osrs = new HashMap(64);
	static int anInt3129;
	private CacheIndex npc_data_index_634;
	private CacheIndex osrs_npc_data_index;
	boolean aBool3131;
	static Class189 aClass189_3132;
	static int anInt3133;
	static CacheIndex npc_model_index;
	static CacheIndex osrs_npc_model_index;

	static Class12 DESTROY_WORLD_OBJECT;
	HashMap aClass54_3136 = new HashMap(50);
	static int anInt3137;
	HashMap aClass54_3138 = new HashMap(5);
	int anInt3139;

	final void method1454(byte i) {
		try {
			synchronized (npc_cache_634) {
				npc_cache_634.method383(91);
			}
			synchronized (npc_cache_osrs) {
				npc_cache_osrs.method383(91);
			}
			if (i < 62)
				DESTROY_WORLD_OBJECT = null;
			anInt3129++;
			synchronized (((Class228) this).aClass54_3136) {
				((Class228) this).aClass54_3136.method383(110);
			}
			synchronized (((Class228) this).aClass54_3138) {
				((Class228) this).aClass54_3138.method383(125);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uk.J(" + i + ')');
		}
	}

	static final Class246_Sub1_Sub10 method1455(int widget, byte i_0_, int i_1_) {
		try {
			if (i_0_ <= 115)
				return null;
			anInt3121++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = ((Class246_Sub1_Sub10) Class246_Sub5.aClass85_3877
					.get((long) i_1_ << 32 | (long) widget));
			if (class246_sub1_sub10 == null) {
				class246_sub1_sub10 = new Class246_Sub1_Sub10(i_1_, widget);
				Class246_Sub5.aClass85_3877.method547((((Node) class246_sub1_sub10).hash), -2301, class246_sub1_sub10);
			}
			return class246_sub1_sub10;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uk.I(" + widget + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method1456(int i) {
		try {
			anInt3123++;
			synchronized (((Class228) this).aClass54_3136) {
				((Class228) this).aClass54_3136.method369(false);
			}
			if (i != 3)
				method1464(true, -120);
			synchronized (((Class228) this).aClass54_3138) {
				((Class228) this).aClass54_3138.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uk.A(" + i + ')');
		}
	}

	static final void method1457(int i, int i_2_) {
		Tile class147 = Class106.tiles[0][i][i_2_];
		for (int i_3_ = 0; i_3_ < 3; i_3_++) {
			Tile class147_4_ = (Class106.tiles[i_3_][i][i_2_] = Class106.tiles[i_3_
					+ 1][i][i_2_]);
			if (class147_4_ != null) {
				((Tile) class147_4_).aByte2175--;
				for (Class3 class3 = ((Tile) class147_4_).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
					Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
					if (((Class59_Sub3) class59_sub3).aShort5057 == i
							&& ((Class59_Sub3) class59_sub3).aShort5064 == i_2_)
						((Class59_Sub3) class59_sub3).current_plane--;
				}
			}
		}
		if (Class106.tiles[0][i][i_2_] == null) {
			Class106.tiles[0][i][i_2_] = new Tile(0, i, i_2_);
			((Tile) Class106.tiles[0][i][i_2_]).aByte2174 = (byte) 1;
		}
		((Tile) Class106.tiles[0][i][i_2_]).aClass147_2165 = class147;
		Class106.tiles[3][i][i_2_] = null;
	}

	final void method1458(int i, int i_5_) {
		try {
			anInt3133++;
			((Class228) this).anInt3139 = i;
			synchronized (((Class228) this).aClass54_3136) {
				if (i_5_ != 1)
					method1454((byte) 46);
				((Class228) this).aClass54_3136.method369(false);
			}
			synchronized (((Class228) this).aClass54_3138) {
				((Class228) this).aClass54_3138.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uk.B(" + i + ',' + i_5_ + ')');
		}
	}

	final void method1459(boolean bool) {
		try {
			anInt3127++;
			synchronized (npc_cache_osrs) {
				npc_cache_osrs.method369(false);
			}
			synchronized (npc_cache_634) {
				npc_cache_634.method369(false);
			}
			synchronized (((Class228) this).aClass54_3136) {
				((Class228) this).aClass54_3136.method369(bool);
			}
			synchronized (((Class228) this).aClass54_3138) {
				((Class228) this).aClass54_3138.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uk.H(" + bool + ')');
		}
	}

	public static void method1460(int i) {
		try {
			aClass189_3132 = null;
			if (i > -114)
				method1464(false, -27);
			DESTROY_WORLD_OBJECT = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uk.L(" + i + ')');
		}
	}

	static final void method1461(int i, int i_6_) {
		Class246_Sub1_Sub4 class246_sub1_sub4 = null;
		for (int i_7_ = i; i_7_ < i_6_; i_7_++) {
			Class210 class210 = Class246_Sub28_Sub3.aClass210Array5899[i_7_];
			if (class210 != null) {
				for (int i_8_ = 0; i_8_ < HDModel.ySize; i_8_++) {
					for (int i_9_ = 0; i_9_ < Class240.xSize; i_9_++) {
						class246_sub1_sub4 = class210.k(i_9_, i_8_, class246_sub1_sub4);
						if (class246_sub1_sub4 != null) {
							int i_10_ = i_9_ << Class126.anInt1781;
							int i_11_ = i_8_ << Class126.anInt1781;
							for (int i_12_ = i_7_ - 1; i_12_ >= 0; i_12_--) {
								Class210 class210_13_ = (Class246_Sub28_Sub3.aClass210Array5899[i_12_]);
								if (class210_13_ != null) {
									int i_14_ = (class210.l(i_9_, i_8_) - class210_13_.l(i_9_, i_8_));
									int i_15_ = (class210.l(i_9_ + 1, i_8_) - class210_13_.l(i_9_ + 1, i_8_));
									int i_16_ = (class210.l(i_9_ + 1, i_8_ + 1) - class210_13_.l(i_9_ + 1, i_8_ + 1));
									int i_17_ = (class210.l(i_9_, i_8_ + 1) - class210_13_.l(i_9_, i_8_ + 1));
									class210_13_.b(class246_sub1_sub4, i_10_, (i_14_ + i_15_ + i_16_ + i_17_) / 4,
											i_11_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public boolean osrs(int npc_id) {
		return true;
	}

	final NpcType list(int npc_id) {
		Revision revision = osrs(npc_id) ? Revision.OSRS : Revision.PRE_EOC_634;
		NpcType npc_type;
		if (revision == Revision.OSRS) {
			synchronized (npc_cache_osrs) {
				npc_type = (NpcType) npc_cache_osrs.method379((long) npc_id, (byte) 58);
			}
		} else {
			synchronized (npc_cache_634) {
				npc_type = (NpcType) npc_cache_634.method379((long) npc_id, (byte) 58);
			}
		}
		if (npc_type != null)
			return npc_type;
		byte[] data;
		if (revision == Revision.OSRS) {
			data = osrs_npc_data_index.get_file(npc_id, 9);
		} else {
			data = npc_data_index_634.get_file(PacketsDecoder.method183((byte) -86, npc_id),
					ObjType.method1293(npc_id, (byte) -12));
		}
		npc_type = new NpcType();
		npc_type.id = npc_id;
		npc_type.revision = revision;
		npc_type.aClass228_3620 = this;
		if (data != null)
			npc_type.decode(0, new Buffer(data), revision);
		npc_type.post_decode(false);
		if (revision == Revision.OSRS) {
			synchronized (npc_cache_osrs) {
				npc_cache_osrs.method371(1, (long) npc_id, npc_type);
			}
		} else {
			synchronized (npc_cache_634) {
				npc_cache_634.method371(1, (long) npc_id, npc_type);
			}
		}
		return npc_type;
	}

	final void method1463(boolean bool, int i) {
		try {
			anInt3122++;
			if (i >= 26 && !bool != !((Class228) this).aBool3131) {
				((Class228) this).aBool3131 = bool;
				method1459(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uk.G(" + bool + ',' + i + ')');
		}
	}

	static final void method1464(boolean bool, int i) {
		try {
			TextureLoader.anInt966 = 3;
			anInt3124++;
			Class246_Sub28_Sub4.anInt5975 = i;
			Class246_Sub28_Sub33.anInt6968 = -1;
			if (bool != false)
				method1460(-45);
			Class40_Sub5.anInt4918 = 100;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uk.C(" + bool + ',' + i + ')');
		}
	}

	final void method1465(byte i, int i_19_) {
		try {
			anInt3125++;
			synchronized (npc_cache_osrs) {
				if (i != -127)
					method1458(-54, -85);
				npc_cache_osrs.method380(i_19_, -50);
			}
			synchronized (npc_cache_634) {
				if (i != -127)
					method1458(-54, -85);
				npc_cache_634.method380(i_19_, -50);
			}
			synchronized (((Class228) this).aClass54_3136) {
				((Class228) this).aClass54_3136.method380(i_19_, -50);
			}
			synchronized (((Class228) this).aClass54_3138) {
				((Class228) this).aClass54_3138.method380(i_19_, -50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uk.K(" + i + ',' + i_19_ + ')');
		}
	}

	Class228(Class101 class101, int i, boolean bool, CacheIndex data_index, CacheIndex model_index,
			CacheIndex osrs_data_index, CacheIndex osrs_model_index) {
		do {
			try {
				((Class228) this).aBool3131 = bool;
				npc_data_index_634 = data_index;
				osrs_npc_data_index = osrs_data_index;
				((Class228) this).npc_model_index = model_index;
				((Class228) this).osrs_npc_model_index = osrs_model_index;
				if (npc_data_index_634 == null)
					break;
				int i_21_ = -1 + npc_data_index_634.method87((byte) 39);
				npc_data_index_634.child_count(i_21_);
				if (osrs_npc_data_index == null)
					break;
				i_21_ = -1 + osrs_npc_data_index.method87((byte) 39);
				osrs_npc_data_index.child_count(i_21_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("uk.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + bool + ','
								+ (data_index != null ? "{...}" : "null") + ','
								+ (model_index != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		new MultilingualString("Login to a members' server to use this object.",
				"Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
				"Connectez-vous \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
				"Acesse um servidor para membros para usar este objeto.");
		DESTROY_WORLD_OBJECT = new Class12(9, 2);
		anInt3137 = 0;
	}
}
