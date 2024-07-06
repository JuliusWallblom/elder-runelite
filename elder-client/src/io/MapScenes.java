package io;

import io.cache.Cache;
import io.cache.Revision;

final class MapScenes {
	private HashMap mapscene_cache = new HashMap(64);
	private CacheIndex config_data, config_data_osrs;
	static int[] anIntArray3625 = new int[2];
	static int anInt3626;
	static int anInt3627;
	CacheIndex sprite_data, sprite_data_osrs;
	static int anInt3629;
	static int anInt3630;
	static int anInt3631;
	static int anInt3632;
	static int anInt3633;
	static int anInt3634;
	static int anInt3635;
	static IncomingPacket aClass13_3636 = new IncomingPacket(101, -1);
	static int anInt3637;
	HashMap aClass54_3638 = new HashMap(64);

	final void method1637(int i) {
		try {
			synchronized (mapscene_cache) {
				mapscene_cache.method369(false);
			}
			anInt3637++;
			synchronized (((MapScenes) this).aClass54_3638) {
				((MapScenes) this).aClass54_3638.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wi.B(" + i + ')');
		}
	}

	final Sprite method1638(int i, int i_0_) {
		try {
			anInt3626++;
			Sprite class32;
			synchronized (mapscene_cache) {
				class32 = (Sprite) mapscene_cache.method379((long) i_0_, (byte) 58);
			}
			if (class32 != null)
				return class32;
			byte[] is = null;
			if (MapRegion.get_revision_by_region() == Revision.OSRS) {
				is = config_data_osrs.get_file(i_0_, 34); // TODO was 34
			} else {
				is = config_data.get_file(i_0_, 34); // TODO was 34
			}
			class32 = new Sprite();
			((Sprite) class32).aClass254_443 = this;
			if (is != null)
				class32.decode(new Buffer(is), -8616);
			synchronized (mapscene_cache) {
				mapscene_cache.method371(1, (long) i_0_, class32);
			}
			return class32;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wi.H(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1639(int i, long l, int i_1_, int i_2_) {
		try {
			anInt3629++;
			int i_3_ = (int) l >> 14 & 0x1f;
			int i_4_ = (0x34ee89 & (int) l) >> 20;
			if (i == 22) {
				int i_5_ = 0x7fffffff & (int) (l >>> 32);
				if ((i_3_ ^ 0xffffffff) == -11 || i_3_ == 11 || i_3_ == 22) {
					LocType class185 = Class143.aClass251_2067.list(i_5_, i - 22);
					int i_6_;
					int i_7_;
					do {
						if ((i_4_ ^ 0xffffffff) == -1 || (i_4_ ^ 0xffffffff) == -3) {
							i_6_ = ((LocType) class185).size_y;
							i_7_ = ((LocType) class185).size_x;
							if (!Client.f_ob)
								break;
						}
						i_7_ = ((LocType) class185).size_y;
						i_6_ = ((LocType) class185).size_x;
					} while (false);
					int i_8_ = ((LocType) class185).blocking_mask;
					if (i_4_ != 0)
						i_8_ = (0xf & i_8_ << i_4_) + (i_8_ >> 4 - i_4_);
					Class90.method570(0, i_2_, i_1_, i_6_, true, i_7_, i_8_, 0, 108);
				} else
					Class90.method570(i_4_, i_2_, i_1_, 0, true, 0, 0, i_3_, i + 79);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wi.I(" + i + ',' + l + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method1640(boolean bool) {
		try {
			anIntArray3625 = null;
			aClass13_3636 = null;
			if (bool != false)
				method1639(-87, -67L, 95, -31);
			MapRegion.anIntArray128 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wi.G(" + bool + ')');
		}
	}

	final void method1641(int i, int i_9_, int i_10_) {
		try {
			if (i_10_ == 383137607) {
				mapscene_cache = new HashMap(i_9_);
				anInt3633++;
				((MapScenes) this).aClass54_3638 = new HashMap(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wi.D(" + i + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	static final void method1642() {
		if (!Class38_Sub1_Sub1.aBool6765) {
			Client.sprite_loader.p(0);
			TitleScreen.unpack();
			TitleScreen.draw();
			Class38_Sub1_Sub1.aBool6765 = true;
		}
	}

	static final void method1643(String string, int i, byte i_11_) {
		do {
			try {
				anInt3635++;
				int i_12_ = 117 / ((68 - i_11_) / 50);
				int i_13_ = Class246_Sub4.anInt3869;
				int[] is = Class53.anIntArray755;
				boolean bool = false;
				for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
					Player class_r_sub1 = Class143.players[is[i_14_]];
					if (class_r_sub1 != null && Client.local_player != class_r_sub1
							&& ((Player) class_r_sub1).aString7140 != null
							&& ((Player) class_r_sub1).aString7140.equalsIgnoreCase(string)) {
						if (i != 1) {
							if ((i ^ 0xffffffff) != -5) {
								if (i != 5) {
									if (i == 6) {
										Class243.writePacket(-62, (Class246_Sub15.aClass201_4442));
										Class104.anInt1394++;
										Class130_Sub1.stream.write128Byte(0, 0);
										Class130_Sub1.stream.writeShort128((byte) -127, is[i_14_]);
									} else if (i == 7) {
										Class243.writePacket(-85, (Class134.aClass201_1877));
										Class143.anInt2066++;
										Class130_Sub1.stream.method2358((byte) 23, 0);
										Class130_Sub1.stream.writeShort((byte) 67, is[i_14_]);
									}
								} else {
									KeyHandler.anInt5547++;
									Class243.writePacket(-76, (Class_e.aClass201_1214));
									Class130_Sub1.stream.writeShortLE128((byte) -88, is[i_14_]);
									Class130_Sub1.stream.write128Byte(0, 0);
								}
							} else {
								Class243.writePacket(-104, (Class246_Sub1_Sub4_Sub1.PLAYER_OPTION_4_PACKET));
								Class256.anInt3681++;
								Class130_Sub1.stream.write128Byte(0, 0);
								Class130_Sub1.stream.writeShortLE128((byte) -78, is[i_14_]);
							}
						} else {
							Class196.anInt2751++;
							Class243.writePacket(-54, Class130_Sub3.PLAYER_OPTION_1_PACKET);
							Class130_Sub1.stream.writeShort128((byte) -128, is[i_14_]);
							Class130_Sub1.stream.writeByte(255, 0);
						}
						bool = true;
						break;
					}
				}
				if (bool)
					break;
				Client.add_game_message((byte) -99,
						(Class246_Sub10.aClass67_4079.get(Preferences.language_code) + string));
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("wi.A(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1644(int i, int i_15_) {
		try {
			anInt3634++;
			synchronized (mapscene_cache) {
				mapscene_cache.method380(i, -50);
				int i_16_ = 120 % ((i_15_ + 94) / 32);
			}
			synchronized (((MapScenes) this).aClass54_3638) {
				((MapScenes) this).aClass54_3638.method380(i, -50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wi.E(" + i + ',' + i_15_ + ')');
		}
	}

	static final void method1645(int i, int i_17_, int i_18_, int i_19_) {
		try {
			anInt3631++;
			if (Class106.tiles != null) {
				long l = (long) (i_19_ << 14 | i << 28 | i_18_);
				Class246_Sub13 class246_sub13 = ((Class246_Sub13) Class251.aClass85_3551.get(l));
				if (class246_sub13 == null)
					Class234.method1498(i, i_18_, i_19_);
				else {
					Class246_Sub43 class246_sub43 = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423
							.method1104(i_17_ ^ 0x5c302b41));
					if (i_17_ != 1546660647)
						method1639(-12, -72L, 30, -54);
					if (class246_sub43 == null)
						Class234.method1498(i, i_18_, i_19_);
					else {
						Class59_Sub5_Sub1 class59_sub5_sub1 = ((Class59_Sub5_Sub1) Class234.method1498(i, i_18_,
								i_19_));
						if (class59_sub5_sub1 != null)
							((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5823 = ((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5810 = -1;
						else
							class59_sub5_sub1 = new Class59_Sub5_Sub1();
						((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5820 = ((Class246_Sub43) class246_sub43).anInt5596;
						((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5821 = ((Class246_Sub43) class246_sub43).anInt5597;
						while_30_: do {
							Class246_Sub43 class246_sub43_20_;
							do {
								class246_sub43_20_ = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423
										.method1108((byte) -112));
								if (class246_sub43_20_ == null)
									break while_30_;
							} while ((((Class246_Sub43) class246_sub43_20_).anInt5596) == ((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5820);
							((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5823 = (((Class246_Sub43) class246_sub43_20_).anInt5596);
							((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5817 = (((Class246_Sub43) class246_sub43_20_).anInt5597);
							for (;;) {
								Class246_Sub43 class246_sub43_21_ = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423
										.method1108((byte) -112));
								if (class246_sub43_21_ == null)
									break;
								if (((((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5820) != (((Class246_Sub43) class246_sub43_21_).anInt5596))
										&& ((((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5823
												^ 0xffffffff) != (((Class246_Sub43) class246_sub43_21_).anInt5596
														^ 0xffffffff))) {
									((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5810 = ((Class246_Sub43) class246_sub43_21_).anInt5596;
									((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5813 = ((Class246_Sub43) class246_sub43_21_).anInt5597;
								}
							}
						} while (false);
						int i_22_ = Class6.getAverageHeight((i_18_ << 7) + 64, 97, i, 64 + (i_19_ << 7));
						Class86.method554(i, i_18_, i_19_, i_22_, class59_sub5_sub1);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wi.J(" + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	final void method1646(byte i) {
		try {
			if (i <= -85) {
				synchronized (mapscene_cache) {
					mapscene_cache.method383(119);
				}
				anInt3630++;
				synchronized (((MapScenes) this).aClass54_3638) {
					((MapScenes) this).aClass54_3638.method383(107);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wi.F(" + i + ')');
		}
	}

	MapScenes(Class101 class101, int i, CacheIndex config_index, CacheIndex sprite_index, CacheIndex config_index2,
			CacheIndex sprite_index2) {
		try {
			((MapScenes) this).sprite_data = sprite_index;
			config_data = config_index;
			config_data.child_count(34);
			((MapScenes) this).sprite_data_osrs = sprite_index2;
			config_data_osrs = config_index2;
			config_data_osrs.child_count(34);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("wi.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ','
							+ (config_index != null ? "{...}" : "null") + ','
							+ (sprite_index != null ? "{...}" : "null")
							+ ')'));
		}
	}
}
