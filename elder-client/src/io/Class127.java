package io;

final class Class127 {
	static int anInt1783;
	static int anInt1784;
	static int anInt1785;
	static int anInt1786;
	static int anInt1787;
	private NodeSub aClass246_Sub1_1788 = new NodeSub();
	static int anInt1789;
	static IncomingPacket FRIENDS_LIST_PACKET = new IncomingPacket(2, -2);
	static IncomingPacket aClass13_1791 = new IncomingPacket(23, 8);
	private Class217 aClass217_1792 = new Class217();
	private int anInt1793;
	private int anInt1794;
	private IterableNodeHashTable aClass85_1795;

	static final void method867(String string, boolean bool) {
		try {
			anInt1785++;
			if (string != null) {
				if (Client.anInt3969 >= 100 && !Class246_Sub23.aBool4817 || Client.anInt3969 >= 200)
					Client.add_game_message((byte) -99, Class211_Sub1.aClass67_5350.get(Preferences.language_code));
				else {
					String string_0_ = Class64.method424(string, (byte) -93);
					if (string_0_ != null) {
						if (bool != false)
							FRIENDS_LIST_PACKET = null;
						for (int i = 0; ((Client.anInt3969 ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
							String string_1_ = Class64.method424(Model.f_gb[i], (byte) -72);
							if (string_1_ != null && string_1_.equals(string_0_)) {
								Client.add_game_message((byte) -99,
										(string + (Class246_Sub30.aClass67_5029.get(Preferences.language_code))));
								return;
							}
							if (Class33.aStringArray446[i] != null) {
								String string_2_ = Class64.method424((Class33.aStringArray446[i]), (byte) -42);
								if (string_2_ != null && string_2_.equals(string_0_)) {
									Client.add_game_message((byte) -99,
											string + (Class246_Sub30.aClass67_5029.get(Preferences.language_code)));
									return;
								}
							}
						}
						for (int i = 0; ((i ^ 0xffffffff) > (Widget.anInt3266 ^ 0xffffffff)); i++) {
							String string_3_ = Class64.method424((Class38_Sub1_Sub1.aStringArray6762[i]), (byte) -83);
							if (string_3_ != null && string_3_.equals(string_0_)) {
								Client.add_game_message((byte) -99,
										(Camera.aClass67_2879.get(Preferences.language_code) + string
												+ (Class240.aClass67_3382.get(Preferences.language_code))));
								return;
							}
							if (SequenceLoader.aStringArray6745[i] != null) {
								String string_4_ = Class64.method424((SequenceLoader.aStringArray6745[i]), (byte) -85);
								if (string_4_ != null && string_4_.equals(string_0_)) {
									Client.add_game_message((byte) -99,
											((Camera.aClass67_2879.get(Preferences.language_code)) + string
													+ (Class240.aClass67_3382.get(Preferences.language_code))));
									return;
								}
							}
						}
						if (Class64.method424((((Player) Client.local_player).aString7140), (byte) -84)
								.equals(string_0_))
							Client.add_game_message((byte) -99,
									Class246_Sub2.aClass67_3809.get(Preferences.language_code));
						else {
							Class100.anInt1297++;
							Class243.writePacket(-96, Class113.ADD_FRIEND_PACKET);
							Class130_Sub1.stream.writeByte(255, Class145.method978(string, (byte) -102));
							Class130_Sub1.stream.writeString(93, string);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"lt.F(" + (string != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	static final int method868(int i, byte i_5_, int i_6_, int i_7_) {
		try {
			if (i_5_ < 52)
				return -115;
			anInt1784++;
			if ((Class45.tileRenderFlags[i_6_][i_7_][i] & 0x8 ^ 0xffffffff) != -1)
				return 0;
			if ((i_6_ ^ 0xffffffff) < -1 && (0x2 & Class45.tileRenderFlags[1][i_7_][i] ^ 0xffffffff) != -1)
				return -1 + i_6_;
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lt.A(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	final void method869(long l, NodeSub class246_sub1, int i) {
		try {
			anInt1787++;
			do {
				if (anInt1793 == 0) {
					NodeSub class246_sub1_8_ = aClass217_1792.method1410((byte) -87);
					class246_sub1_8_.remove();
					class246_sub1_8_.removeDual();
					if (class246_sub1_8_ != aClass246_Sub1_1788)
						break;
					class246_sub1_8_ = aClass217_1792.method1410((byte) -95);
					class246_sub1_8_.remove();
					class246_sub1_8_.removeDual();
					if (!Client.f_ob)
						break;
				}
				anInt1793--;
			} while (false);
			if (i != -8869)
				get(77L);
			aClass85_1795.method547(l, i ^ 0x2a58, class246_sub1);
			aClass217_1792.method1407(i ^ 0x22dd, class246_sub1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("lt.B(" + l + ',' + (class246_sub1 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final boolean method870(char c, int i) {
		try {
			anInt1786++;
			if (i < 15)
				FRIENDS_LIST_PACKET = null;
			if (c != '\u00a0' && c != ' ' && c != '_' && c != '-')
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lt.G(" + c + ',' + i + ')');
		}
	}

	public static void method871(int i) {
		try {
			FRIENDS_LIST_PACKET = null;
			aClass13_1791 = null;
			int i_9_ = 108 / ((-9 - i) / 61);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lt.E(" + i + ')');
		}
	}

	final NodeSub get(long l) {
		try {
			anInt1789++;
			NodeSub class246_sub1 = (NodeSub) aClass85_1795.get(l);
			if (class246_sub1 != null) {
				aClass217_1792.method1407(-123, class246_sub1);
			}
			return class246_sub1;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	final void method873(byte i) {
		do {
			try {
				anInt1783++;
				aClass217_1792.method1406((byte) 99);
				aClass85_1795.method543(0);
				aClass246_Sub1_1788 = new NodeSub();
				anInt1793 = anInt1794;
				if (i == -63)
					break;
				aClass246_Sub1_1788 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lt.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class127(int i) {
		try {
			anInt1794 = i;
			anInt1793 = i;
			int i_10_;
			for (i_10_ = 1; i > i_10_ + i_10_; i_10_ += i_10_) {
				/* empty */
			}
			aClass85_1795 = new IterableNodeHashTable(i_10_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lt.<init>(" + i + ')');
		}
	}
}
