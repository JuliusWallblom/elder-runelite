package io;

/* Class246_Sub28_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;
import java.net.URL;

import io.cache.Cache;
import io.cache.Revision;
import net.runelite.api.GameState;

final class Class246_Sub28_Sub35 extends TextureOperation {
	static int anInt7010;
	static Class125 aClass125_7011;
	static int anInt7012;
	static int anInt7013;
	static int anInt7014;
	private int anInt7015 = 4096;
	private boolean aBool7016 = true;
	static int anInt7017;

	public static void method2873(byte i) {
		do {
			try {
				aClass125_7011 = null;
				if (i <= -17)
					break;
				aClass125_7011 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "vk.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2143(int i, int i_0_, Buffer stream) {
		while_53_: do {
			try {
				if (i != 4)
					method2873((byte) -50);
				anInt7013++;
				int i_1_ = i_0_;
				do {
					if (i_1_ != 0) {
						if (i_1_ != 1)
							break while_53_;
						if (!Client.f_ob)
							break;
					}
					anInt7015 = stream.readUnsignedShort();
					return;
				} while (false);
				aBool7016 = stream.readUnsignedByte() == 1;
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("vk.G(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
		} while (false);
	}

	static final void method2874(Npc class_r_sub2, int i) {
		do {
			try {
				anInt7012++;
				for (Class246_Sub5 class246_sub5 = ((Class246_Sub5) VarcLoader.aClass166_992.method1104(49)); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) VarcLoader.aClass166_992.method1108((byte) -112))) {
					if (class_r_sub2 == (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)) {
						if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893) != null) {
							Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893);
							((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 = null;
						}
						class246_sub5.remove();
						return;
					}
				}
				if (i == 16777216)
					break;
				anInt7014 = 46;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("vk.B(" + (class_r_sub2 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void login(int i) {
		try {
			anInt7017++;
			if ((LoginScreen.loginResponse ^ 0xffffffff) != -1 && LoginScreen.loginResponse != 5) {
				try {
					if (++Class59_Sub3_Sub2.f_bb > 2000) {
						if (Class65.aClass6_864 != null) {
							Class65.aClass6_864.method72(false);
							Class65.aClass6_864 = null;
						}
						if ((Class114.anInt1598 ^ 0xffffffff) <= -2) {
							LoginScreen.loginResponse = 0;
							Class246_Sub31.anInt5034 = -5;
							return;
						}
						LoginScreen.loginResponse = 1;
						Class114.anInt1598++;
						if (Class172.anInt2433 == Class230.anInt3165)
							Class230.anInt3165 = Class246_Sub28_Sub7.anInt6047;
						else
							Class230.anInt3165 = Class172.anInt2433;
						Class59_Sub3_Sub2.f_bb = 0;
					}
					if (LoginScreen.loginResponse == 1) {
						Class17.aClass182_242 = Client.sign_link.method364(0, (Class174.aString2449), (Class230.anInt3165));
						LoginScreen.loginResponse = 2;
					}
					if ((LoginScreen.loginResponse ^ 0xffffffff) == -3) {
						if ((Class17.aClass182_242.anInt2539 ^ 0xffffffff) == -3)
							throw new IOException();
						if (Class17.aClass182_242.anInt2539 != 1)
							return;
						Class65.aClass6_864 = new Class6(((Socket) Class17.aClass182_242.anObject2535), Client.sign_link);
						Class17.aClass182_242 = null;
						long l = (Class155.aLong2221 = Class246_Sub28_Sub6.method2554(1, LoginScreen.username));
						(Class130_Sub1.stream).position = 0;
						int i_2_ = (int) (l >> 16 & 0x1fL);
						Class130_Sub1.stream.writeByte(255, (((Class48) Class246_Sub1_Sub10.aClass48_6204).anInt689));
						Class130_Sub1.stream.writeByte(255, i_2_);
						Class65.aClass6_864.method76(2, 0, (((Class130_Sub1.stream)).buffer), 127);
						Class179.method1170((byte) 73);
						int i_3_ = Class65.aClass6_864.method73(87);
						Class179.method1170((byte) 123);
						if ((i_3_ ^ 0xffffffff) != -1) {
							LoginScreen.loginResponse = 0;
							Class246_Sub31.anInt5034 = i_3_;
							Class65.aClass6_864.method72(false);
							Class65.aClass6_864 = null;
							return;
						}
						LoginScreen.loginResponse = 3;
						return;
					}
					if (LoginScreen.loginResponse == 3) {
						if ((Class65.aClass6_864.method67(3) ^ 0xffffffff) > -9)
							return;
						Class65.aClass6_864.method65(0, (byte) 113, 8, (((Class78.packetStream)).buffer));
						(Class78.packetStream).position = 0;
						Class169.aLong2411 = Class78.packetStream.method2364(true);
						Buffer stream = new Buffer(130);// was 70
						int[] is = new int[4];
						is[3] = (int) Class169.aLong2411;
						is[0] = (int) (Math.random() * 9.9999999E7);
						is[1] = (int) (Math.random() * 9.9999999E7);
						is[2] = (int) (Class169.aLong2411 >> 32);
						stream.writeByte(255, 10);
						stream.writeInt(is[0], (byte) -65);
						stream.writeInt(is[1], (byte) 85);
						stream.writeInt(is[2], (byte) -80);
						stream.writeInt(is[3], (byte) -126);
						stream.writeLong(Class246_Sub28_Sub6.method2554(1, LoginScreen.username), (byte) -48);
						stream.writeString(75, LoginScreen.password);
						stream.method2385(Class246_Sub28_Sub4.RSA_EXPONENT, (byte) -107, Class169.RSA_MODULUS);
						(Class130_Sub1.stream).position = 0;
						if (Client.gameState != 40)
							Class130_Sub1.stream.writeByte(255, (((Class48) Class246_Sub1_Sub10.aClass48_6215).anInt689));
						else
							Class130_Sub1.stream.writeByte(255, (((Class48) Class246_Sub1_Sub10.aClass48_6217).anInt689));
						Class130_Sub1.stream.writeShort((byte) 67, 0);

						int i_4_ = (Class130_Sub1.stream).position;
						Class130_Sub1.stream.writeInt(592, (byte) 89);// revision
						Class130_Sub1.stream.writeInt(Settings.gameframe == Revision.OSRS ? 193 : Settings.gameframe == Revision.PRE_EOC_550 ? 550 : 634, (byte) 84);
						Class130_Sub1.stream.writeInt(Settings.data == Revision.OSRS ? 193 : Settings.data == Revision.PRE_EOC_550 ? 550 : 634, (byte) 84);
						Class130_Sub1.stream.writeByte(255, LoginScreen.login_state);
						Class130_Sub1.stream.writeByte(255, Client.get_frame_mode((byte) -123));
						Class130_Sub1.stream.writeShort((byte) 67, Client.client_width);
						Class130_Sub1.stream.writeShort((byte) 67, Client.client_height);
						Class130_Sub1.stream.writeByte(255, ((Renderer) (Client.current_renderer)).anInt588);

						Class_e.method595((byte) -120, Class130_Sub1.stream);
						Class130_Sub1.stream.writeString(68, Class246_Sub5.aString3891);
						Class130_Sub1.stream.writeInt(Class109_Sub4.anInt4573, (byte) -8);

						// we skip this
						Buffer stream_5_ = Client.current_renderer.get_preference_buffer();
						Class130_Sub1.stream.writeByte(255, (stream_5_).position);
						Class130_Sub1.stream.writeBytes(0, true, (stream_5_).buffer, (stream_5_).position);

						RuntimeException_Sub2.aBool7148 = true;
						Class130_Sub1.stream.writeShort((byte) 67, SubIncomingPacket.anInt7095);
						
						/* CACHE CRCS */
						for (CacheIndex cache_index : Cache.client_cache) {
							Class130_Sub1.stream.writeInt(cache_index.method98(), (byte) -106);
						}
						
						/* CACHE CRCS END */
						Class130_Sub1.stream.writeBytes(0, true, (stream).buffer, (stream).position);
						Class130_Sub1.stream.method2410(-40, ((Class130_Sub1.stream).position - i_4_));
						Class65.aClass6_864.method76((Class130_Sub1.stream).position, 0, ((Class130_Sub1.stream).buffer), 127);
						Class130_Sub1.stream.method2480(is, -938442011);
						for (int i_6_ = 0; i_6_ < 4; i_6_++)
							is[i_6_] += 50;
						Class78.packetStream.method2480(is, -938442011);
						LoginScreen.loginResponse = 4;
						return;
					}
					if (LoginScreen.loginResponse == 4) {
						if (Class65.aClass6_864.method67(3) < 1)
							return;
						int response = Class65.aClass6_864.method73(5);
						if (response == 3) {
							LoginScreen.login_screen_state = 90;
						} else if (response == 4 || response == 26) {
							LoginScreen.login_screen_state = 91;
						} else if (response == 5) {
							LoginScreen.login_message_0 = "Your account has not logged out from its last";
							LoginScreen.login_message_1 = "session or the server is too busy right now.";
							LoginScreen.login_message_2 = "Please try again in a few minutes.";
							LoginScreen.login_screen_state = 1;
						} else if (response == 6) {
							LoginScreen.login_message_0 = "";
							LoginScreen.login_message_1 = GameConstants.NAME + " has been updated!";
							LoginScreen.login_message_2 = "Please restart your gameclient.";
							LoginScreen.login_screen_state = 1;
						} else if (response == 7) {
							LoginScreen.login_message_0 = "";
							LoginScreen.login_message_1 = "This world is full.";
							LoginScreen.login_message_2 = "Please try using a different world.";
							LoginScreen.login_screen_state = 1;
						} else if (response == 9) {
							LoginScreen.login_message_0 = "";
							LoginScreen.login_message_1 = "Too many login attempts from this address.";
							LoginScreen.login_message_2 = "Please try again in 5 minutes.";
							LoginScreen.login_screen_state = 1;
						} else if (response == 14) {
							LoginScreen.login_message_0 = "";
							LoginScreen.login_message_1 = GameConstants.NAME + " is being updated.";
							LoginScreen.login_message_2 = "Please try again in a few minutes.";
							LoginScreen.login_screen_state = 1;
						} else if (response == 20) {
							LoginScreen.login_message_0 = "";
							LoginScreen.login_message_1 = "Error loading your account.";
							LoginScreen.login_message_2 = "Please contact support.";
							LoginScreen.login_screen_state = 1;
						}
						if ((response ^ 0xffffffff) == -22)
							LoginScreen.loginResponse = 7;
						else if (response == 29)
							LoginScreen.loginResponse = 11;
						else if (response != 1) {
							if (response != 2) {
								if ((response ^ 0xffffffff) == -16) {
									Class130_Sub1_Sub1.anInt7046 = -2;
									LoginScreen.loginResponse = 12;
								} else {
									if ((response ^ 0xffffffff) == -24 && ((Class114.anInt1598 ^ 0xffffffff) > -2)) {
										Class59_Sub3_Sub2.f_bb = 0;
										LoginScreen.loginResponse = 1;
										Class114.anInt1598++;
										Class65.aClass6_864.method72(false);
										Class65.aClass6_864 = null;
									} else {
										LoginScreen.loginResponse = 0;
										Class246_Sub31.anInt5034 = response;
										Class65.aClass6_864.method72(false);
										Class65.aClass6_864 = null;
										return;
									}
									return;
								}
							} else
								LoginScreen.loginResponse = 8;
						} else {
							LoginScreen.loginResponse = 5;
							Class246_Sub31.anInt5034 = response;
							return;
						}
					}
					if ((LoginScreen.loginResponse ^ 0xffffffff) == -7) {
						(Class130_Sub1.stream).position = 0;
						Class130_Sub1.stream.method2474((((Class48) Class246_Sub1_Sub10.aClass48_6216).anInt689), 13127);
						Class65.aClass6_864.method76((Class130_Sub1.stream).position, 0, ((Class130_Sub1.stream).buffer), 127);
						LoginScreen.loginResponse = 4;
					} else if (LoginScreen.loginResponse == 7) {
						if (Class65.aClass6_864.method67(3) >= 1) {
							Class95.anInt1252 = 60 * (Class65.aClass6_864.method73(53) + 3);
							Class246_Sub31.anInt5034 = 21;
							LoginScreen.loginResponse = 0;
							Class65.aClass6_864.method72(false);
							Class65.aClass6_864 = null;
						}
					} else {
						int i_8_ = 14 % ((i - 53) / 58);
						if ((LoginScreen.loginResponse ^ 0xffffffff) == -12) {
							if ((Class65.aClass6_864.method67(3) ^ 0xffffffff) <= -2) {
								Class160.anInt2271 = Class65.aClass6_864.method73(52);
								LoginScreen.loginResponse = 0;
								Class246_Sub31.anInt5034 = 29;
								Class65.aClass6_864.method72(false);
								Class65.aClass6_864 = null;
							}
						} else {
							if ((LoginScreen.loginResponse ^ 0xffffffff) == -9) {
								LoginScreen.loggedIn = true;
								if ((Class65.aClass6_864.method67(3) ^ 0xffffffff) > -14)
									return;
								Class65.aClass6_864.method65(0, (byte) 113, 13, ((Class78.packetStream).buffer));
								(Class78.packetStream).position = 0;

								Client.staff_level = Class78.packetStream.readUnsignedByte();
								Player.moderator = Class78.packetStream.readUnsignedByte();
								Class59.aBool820 = (Class78.packetStream.readUnsignedByte() ^ 0xffffffff) == -2;
								Class_u.aBool4703 = (Class78.packetStream.readUnsignedByte() ^ 0xffffffff) == -2;
								Class_w.aBool6388 = (Class78.packetStream.readUnsignedByte() ^ 0xffffffff) == -2;
								Class168.aBool2395 = (Class78.packetStream.readUnsignedByte() ^ 0xffffffff) == -2;
								Class109.anInt1567 = Class78.packetStream.readUnsignedShort();
								Class246_Sub23.aBool4817 = Class78.packetStream.readUnsignedByte() == 1;
								Client.members_world = Class78.packetStream.readUnsignedByte() == 1;

								Class143.aClass251_2067.method1614(Client.members_world, (byte) 124);
								MapRegion.aClass191_3663.method1252(Client.members_world, true);
								Class179.aClass228_2518.method1463(Client.members_world, 115);
								if ((!Class59.aBool820 || Class_w.aBool6388) && !Class246_Sub23.aBool4817) {
									try {
										Class80.method521((Client.sign_link.anApplet733), "unzap", 60);
									} catch (Throwable throwable) {
										/* empty */
									}
								} else {
									try {
										Class80.method521((Client.sign_link.anApplet733), "zap", 43);
									} catch (Throwable throwable) {
										if (Class166.aBool2357) {
											try {
												Client.sign_link.anApplet733.getAppletContext().showDocument((new URL(Client.sign_link.anApplet733.getCodeBase(), "blank.ws")), "tbi");
											} catch (Exception exception) {
												/* empty */
											}
										}
									}
								}
								if (Class208.aClass205_2930 == Class260_Sub2.aClass205_4297) {
									try {
										Class80.method521((Client.sign_link.anApplet733), "loggedin", 93);
									} catch (Throwable throwable) {
										/* empty */
									}
								}
								LoginScreen.loginResponse = 10;
							}
							if ((LoginScreen.loginResponse ^ 0xffffffff) == -11) {
								if (Class78.packetStream.method2482(-6742)) {
									if (Class65.aClass6_864.method67(3) < 1)
										return;
									Class65.aClass6_864.method65(2 + (Class78.packetStream).position, (byte) 113, 1, ((Class78.packetStream).buffer));
								}
								IdentityKitType.INCOMING_PACKET = (Stream_Sub2.method2592(105)[Class78.packetStream.method2481(1941438248)]);
								Class130_Sub1_Sub1.anInt7046 = Class78.packetStream.readUnsignedShort();
								LoginScreen.loginResponse = 9;
							}
							if (LoginScreen.loginResponse == 9) {
								if (Class65.aClass6_864.method67(3) >= Class130_Sub1_Sub1.anInt7046) {
									Class65.aClass6_864.method65(0, (byte) 113, Class130_Sub1_Sub1.anInt7046, ((Class78.packetStream).buffer));
									(Class78.packetStream).position = 0;
									int i_9_ = Class130_Sub1_Sub1.anInt7046;
									LoginScreen.loginResponse = 0;
									Class246_Sub31.anInt5034 = 2;
									Class91.method577(126);
									Class219.method1419(-95, (Class78.packetStream));
									IdentityKitLoader.anInt1206 = -1;
									Class125.decodeReceivedMapRegions(false);
									if (i_9_ != (Class78.packetStream).position)
										throw new RuntimeException("lswp pos:" + (((Class78.packetStream)).position) + " psize:" + i_9_);
									IdentityKitType.INCOMING_PACKET = null;
								}
							} else if ((LoginScreen.loginResponse ^ 0xffffffff) == -13) {
								if ((Class130_Sub1_Sub1.anInt7046 ^ 0xffffffff) == 1) {
									if (Class65.aClass6_864.method67(3) < 2)
										return;
									Class65.aClass6_864.method65(0, (byte) 113, 2, ((Class78.packetStream).buffer));
									(Class78.packetStream).position = 0;
									Class130_Sub1_Sub1.anInt7046 = Class78.packetStream.readUnsignedShort();
								}
								if ((Class65.aClass6_864.method67(3) ^ 0xffffffff) <= (Class130_Sub1_Sub1.anInt7046 ^ 0xffffffff)) {
									Class65.aClass6_864.method65(0, (byte) 113, Class130_Sub1_Sub1.anInt7046, ((Class78.packetStream).buffer));
									(Class78.packetStream).position = 0;
									int i_10_ = Class130_Sub1_Sub1.anInt7046;
									LoginScreen.loginResponse = 0;
									Class246_Sub31.anInt5034 = 15;
									Class246_Sub32.method2164(30);
									Class219.method1419(-90, (Class78.packetStream));
									if ((i_10_ ^ 0xffffffff) != ((Class78.packetStream).position ^ 0xffffffff))
										throw new RuntimeException("lswpr pos:" + (((Class78.packetStream)).position) + " psize:" + i_10_);
									IdentityKitType.INCOMING_PACKET = null;
								}
							}
						}
					}
				} catch (IOException ioexception) {
					if (Class65.aClass6_864 != null) {
						Class65.aClass6_864.method72(false);
						Class65.aClass6_864 = null;
					}
					if ((Class114.anInt1598 ^ 0xffffffff) <= -2) {
						Class246_Sub31.anInt5034 = -4;
						LoginScreen.loginResponse = 0;
					} else {
						if ((Class172.anInt2433 ^ 0xffffffff) != (Class230.anInt3165 ^ 0xffffffff))
							Class230.anInt3165 = Class172.anInt2433;
						else
							Class230.anInt3165 = Class246_Sub28_Sub7.anInt6047;
						LoginScreen.loginResponse = 1;
						Class114.anInt1598++;
						Class59_Sub3_Sub2.f_bb = 0;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Class246_Sub28_Sub35() {
		super(1, false);
	}

	final int[][] method2139(byte i, int i_11_) {
		try {
			anInt7010++;
			int[][] is = ((TextureOperation) this).aClass136_4933.method922((byte) 92, i_11_);
			if (i < 33)
				return null;
			if (((Class136) ((TextureOperation) this).aClass136_4933).aBool1946) {
				int[] is_12_ = this.method2133(Class113.anInt1594 & i_11_ - 1, 0, 0);
				int[] is_13_ = this.method2133(i_11_, 0, 0);
				int[] is_14_ = this.method2133(Class113.anInt1594 & i_11_ + 1, 0, 0);
				int[] is_15_ = is[0];
				int[] is_16_ = is[1];
				int[] is_17_ = is[2];
				for (int i_18_ = 0; i_18_ < Class246_Sub37_Sub1.f_gb; i_18_++) {
					int i_19_ = (is_14_[i_18_] - is_12_[i_18_]) * anInt7015;
					int i_20_ = ((is_13_[i_18_ + 1 & Class63_Sub1.anInt4719] - is_13_[Class63_Sub1.anInt4719 & i_18_ - 1]) * anInt7015);
					int i_21_ = i_20_ >> 12;
					int i_22_ = i_19_ >> 12;
					int i_23_ = i_21_ * i_21_ >> 12;
					int i_24_ = i_22_ * i_22_ >> 12;
					int i_25_ = (int) (Math.sqrt((double) ((float) (4096 + (i_23_ - -i_24_)) / 4096.0F)) * 4096.0);
					int i_26_;
					int i_27_;
					int i_28_;
					if (i_25_ == 0) {
						i_26_ = 0;
						i_27_ = 0;
						i_28_ = 0;
					} else {
						i_26_ = i_19_ / i_25_;
						i_27_ = i_20_ / i_25_;
						i_28_ = 16777216 / i_25_;
					}
					if (aBool7016) {
						i_28_ = 2048 - -(i_28_ >> 1);
						i_26_ = 2048 - -(i_26_ >> 1);
						i_27_ = 2048 + (i_27_ >> 1);
					}
					is_15_[i_18_] = i_27_;
					is_16_[i_18_] = i_26_;
					is_17_[i_18_] = i_28_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vk.J(" + i + ',' + i_11_ + ')');
		}
	}
}
