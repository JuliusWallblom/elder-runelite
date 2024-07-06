package io;

/* Class_is - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

import io.cache.Revision;

final class PacketsDecoder {
	static int anInt270;
	int anInt271;
	UnderlayLoader aClass105_272;
	static long aLong273 = -1L;
	int anInt274 = 8;
	int anInt275;
	int anInt276;
	int anInt277;
	static int anInt278;
	int anInt279;
	static int anInt280;
	boolean blend = false;
	static int anInt282;
	boolean aBool283 = true;
	int anInt284;
	static int anInt285;
	int anInt286;
	int anInt287;
	int anInt288;
	static int anInt289;
	boolean aBool290;

	static final boolean method179(int i) throws IOException {
		anInt280++;
		if (Class65.aClass6_864 == null)
			return false;
		int i_0_ = Class65.aClass6_864.method67(3);
		if (i_0_ == 0)
			return false;
		if (IdentityKitType.INCOMING_PACKET == null) {
			if (Class246_Sub35.aBool5160) {
				Class65.aClass6_864.method65(0, (byte) 113, 1, (((Buffer) Class78.packetStream).buffer));
				i_0_--;
				Class246_Sub35.aBool5160 = false;
				Class246_Sub28_Sub11.anInt6167++;
			}
			((Buffer) Class78.packetStream).position = 0;
			if (Class78.packetStream.method2482(-6742)) {
				if ((i_0_ ^ 0xffffffff) == -1)
					return false;
				i_0_--;
				Class65.aClass6_864.method65(1, (byte) 113, 1, (((Buffer) Class78.packetStream).buffer));
				Class246_Sub28_Sub11.anInt6167++;
			}
			Class246_Sub35.aBool5160 = true;
			IncomingPacket[] class13s = Stream_Sub2.method2592(-4);
			int i_1_ = Class78.packetStream.method2481(1941438248);
			if ((i_1_ ^ 0xffffffff) > -1 || i_1_ >= class13s.length)
				throw new IOException("invo:" + i_1_ + " ip:" + ((Buffer) Class78.packetStream).position);
			IdentityKitType.INCOMING_PACKET = class13s[i_1_];
			Class130_Sub1_Sub1.anInt7046 = ((IncomingPacket) IdentityKitType.INCOMING_PACKET).anInt189;
		}
		if (Class130_Sub1_Sub1.anInt7046 == -1) {
			if (i_0_ <= 0)
				return false;
			Class65.aClass6_864.method65(0, (byte) 113, 1, (((Buffer) Class78.packetStream).buffer));
			i_0_--;
			Class246_Sub28_Sub11.anInt6167++;
			Class130_Sub1_Sub1.anInt7046 = (((Buffer) Class78.packetStream).buffer[0] & 0xff);
		}
		if ((Class130_Sub1_Sub1.anInt7046 ^ 0xffffffff) == i) {
			if (i_0_ <= 1)
				return false;
			Class65.aClass6_864.method65(0, (byte) 113, 2, (((Buffer) Class78.packetStream).buffer));
			((Buffer) Class78.packetStream).position = 0;
			i_0_ -= 2;
			Class130_Sub1_Sub1.anInt7046 = Class78.packetStream.readUnsignedShort();
			Class246_Sub28_Sub11.anInt6167 += 2;
		}
		if (i_0_ < Class130_Sub1_Sub1.anInt7046)
			return false;
		((Buffer) Class78.packetStream).position = 0;
		Class65.aClass6_864.method65(0, (byte) 113, Class130_Sub1_Sub1.anInt7046,
				(((Buffer) Class78.packetStream).buffer));
		Class173.aClass13_2438 = Class259_Sub2_Sub1.aClass13_6907;
		Class246_Sub28_Sub11.anInt6167 += Class130_Sub1_Sub1.anInt7046;
		Class233.anInt3184 = 0;
		Class259_Sub2_Sub1.aClass13_6907 = Class16.aClass13_235;
		Class16.aClass13_235 = IdentityKitType.INCOMING_PACKET;
		if (Class109_Sub3.aClass13_3953 == IdentityKitType.INCOMING_PACKET) {
			Class246_Sub1_Sub15.method2719(75, Class247.aClass12_3482);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == VarcLoader.aClass13_1000) {
			boolean bool = Class78.packetStream.readUnsignedByte() == 1;
			String string = Class78.packetStream.readString((byte) -40);
			String string_2_ = string;
			if (bool)
				string_2_ = Class78.packetStream.readString((byte) -40);
			int i_3_ = Class78.packetStream.readUnsignedByte();
			int i_4_ = Class78.packetStream.readUnsignedShort();
			boolean bool_5_ = false;
			if (i_3_ <= 1 && Class129.method881(string_2_, false))
				bool_5_ = true;
			if (!bool_5_ && Class37.anInt551 == 0) {
				String string_6_ = Class128_Sub1.aClass65_5558.method428(i_4_, (byte) -99)
						.method2436(Class78.packetStream, -127);
				if ((i_3_ ^ 0xffffffff) != -3) {
					if ((i_3_ ^ 0xffffffff) == -2)
						Class241.method1545((byte) 123, i_4_, "<img=0>" + string_2_, string_6_, null, 0,
								"<img=0>" + string, 25);
					else
						Class241.method1545((byte) 95, i_4_, string_2_, string_6_, null, 0, string, 25);
				} else
					Class241.method1545((byte) 91, i_4_, "<img=1>" + string_2_, string_6_, null, 0, "<img=1>" + string,
							25);
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class109_Sub1.aClass13_3765) {
			int i_7_ = Class78.packetStream.readIntV1(-98);
			int i_8_ = Class78.packetStream.readUnsignedShort();
			int i_9_ = Class78.packetStream.readUnsignedShort();
			if (Class38_Sub1_Sub1.method2771(i_8_, -32291))
				Class133.method898(i_7_, i_9_, i + 11);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}

		if (IdentityKitType.INCOMING_PACKET == Player.RUNSCRIPT_IN) {
			int revision = Class78.packetStream.readInt();
			int script_id = Class78.packetStream.readUnsignedShort();
			String string = Class78.packetStream.readString((byte) -40);
			Object[] objects = new Object[1 + string.length()];
			for (int i_11_ = -1 + string.length(); i_11_ >= 0; i_11_--) {
				if ((string.charAt(i_11_) ^ 0xffffffff) == -116)
					objects[i_11_ + 1] = Class78.packetStream.readString((byte) -40);
				else
					objects[1 + i_11_] = new Integer(Class78.packetStream.readInt((byte) 89));
			}
			objects[0] = new Integer(Class78.packetStream.readInt((byte) 88));
			if (Class38_Sub1_Sub1.method2771(script_id, -32291)) {
				ScriptEvent class246_sub29 = new ScriptEvent();
				((ScriptEvent) class246_sub29).params = objects;
				ScriptExecutor.run_script(class246_sub29, 200000, -1, revision);
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class246_Sub31.SOME_PACKET_2 == IdentityKitType.INCOMING_PACKET) {
			Class246_Sub1_Sub15.method2719(i ^ 0x48, Class169.SOME_PACKET_3);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (MapRegion.DECODE_MAP_REGION_IN == IdentityKitType.INCOMING_PACKET) {
			Class125.decodeReceivedMapRegions(false);
			IdentityKitType.INCOMING_PACKET = null;
			return false;
		}
		if (Class195.PLAY_MUSIC_IN == IdentityKitType.INCOMING_PACKET) {
			int i_12_ = Class78.packetStream.readUnsignedByte128(27574);
			int i_13_ = Class78.packetStream.readUnsignedByte();
			int i_14_ = Class78.packetStream.readUnsignedShort128(i ^ 0x38cd25a1);
			if (i_14_ == 65535)
				i_14_ = -1;
			Client.play_song(i_14_, 118, i_13_, i_12_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class129.PLAY_MUSIC_EFFECTS_IN == IdentityKitType.INCOMING_PACKET) {
			int i_15_ = Class78.packetStream.read24BitInteger((byte) 29);
			int i_16_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			if (i_16_ == 65535)
				i_16_ = -1;
			int i_17_ = Class78.packetStream.readUnsignedByte();
			Class234.method1497(i_17_, 0, i_15_, i_16_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class195.PLAYER_OPTION_PACKET) {
			int slot = Class78.packetStream.readUnsigned128Byte();
			int i_19_ = Class78.packetStream.readUnsignedByteC(-86);
			int i_20_ = Class78.packetStream.readUnsignedShort128(952968608);
			if (i_20_ == 65535)
				i_20_ = -1;
			String option = Class78.packetStream.readString((byte) -40);
			if ((slot ^ 0xffffffff) <= -2 && slot <= 8) {
				if (option.equalsIgnoreCase("null"))
					option = null;
				Class191.aStringArray2682[-1 + slot] = option;
				ClickMaskNode.anIntArray4903[slot - 1] = i_20_;
				Class130_Sub4.aBoolArray4742[-1 + slot] = (i_19_ ^ 0xffffffff) == -1;
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (WidgetParent.aClass13_5515 == IdentityKitType.INCOMING_PACKET) {
			int i_21_ = Class78.packetStream.readUnsignedByte();
			int i_22_ = i_21_ >> 5;
			int i_23_ = i_21_ & 0x1f;
			if ((i_23_ ^ 0xffffffff) == -1) {
				Class166.aClass29Array2347[i_22_] = null;
				IdentityKitType.INCOMING_PACKET = null;
				return true;
			}
			Class29 class29 = new Class29();
			((Class29) class29).anInt391 = i_23_;
			((Class29) class29).anInt385 = Class78.packetStream.readUnsignedByte();
			if (((Class29) class29).anInt385 >= 0
					&& (((Class29) class29).anInt385 < Class_cs.aClass_lArray7146.length)) {
				if (((Class29) class29).anInt391 != 1 && ((Class29) class29).anInt391 != 10) {
					if ((((Class29) class29).anInt391 ^ 0xffffffff) <= -3 && ((Class29) class29).anInt391 <= 6) {
						if ((((Class29) class29).anInt391 ^ 0xffffffff) == -3) {
							((Class29) class29).anInt394 = 64;
							((Class29) class29).anInt392 = 64;
						}
						if ((((Class29) class29).anInt391 ^ 0xffffffff) == -4) {
							((Class29) class29).anInt394 = 64;
							((Class29) class29).anInt392 = 0;
						}
						if (((Class29) class29).anInt391 == 4) {
							((Class29) class29).anInt394 = 64;
							((Class29) class29).anInt392 = 128;
						}
						if (((Class29) class29).anInt391 == 5) {
							((Class29) class29).anInt394 = 0;
							((Class29) class29).anInt392 = 64;
						}
						if ((((Class29) class29).anInt391 ^ 0xffffffff) == -7) {
							((Class29) class29).anInt394 = 128;
							((Class29) class29).anInt392 = 64;
						}
						((Class29) class29).anInt391 = 2;
						((Class29) class29).anInt386 = Class78.packetStream.readUnsignedByte();
						((Class29) class29).anInt392 += (Class78.packetStream.readUnsignedShort()
								- Client.base_x) << 7;
						((Class29) class29).anInt394 += (Class78.packetStream.readUnsignedShort()
								+ -Client.base_y) << 7;
						((Class29) class29).anInt396 = Class78.packetStream.readUnsignedByte();
						((Class29) class29).anInt389 = Class78.packetStream.readUnsignedShort();
					}
				} else {
					((Class29) class29).anInt384 = Class78.packetStream.readUnsignedShort();
					((Buffer) Class78.packetStream).position += 6;
				}
				((Class29) class29).anInt388 = Class78.packetStream.readUnsignedShort();
				if ((((Class29) class29).anInt388 ^ 0xffffffff) == -65536)
					((Class29) class29).anInt388 = -1;
				Class166.aClass29Array2347[i_22_] = class29;
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class43.aClass13_637) {
			int i_24_ = Class78.packetStream.readUnsignedShort();
			int i_25_ = Class78.packetStream.readUnsignedShortLE(119);
			int i_26_ = Class78.packetStream.readUnsignedShort128(952968608);
			if (Class38_Sub1_Sub1.method2771(i_24_, -32291))
				Class246_Sub22.method2084(i_26_, (byte) -114, i_25_, 0);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class59_Sub5_Sub1.aClass13_5825) {
			String string = Class78.packetStream.readString((byte) -40);
			int i_27_ = Class78.packetStream.readUnsignedShort();
			String string_28_ = Class128_Sub1.aClass65_5558.method428(i_27_, (byte) -99)
					.method2436(Class78.packetStream, -127);
			Class241.method1545((byte) 112, i_27_, string, string_28_, null, 0, string, 19);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class21_Sub4.GLOBAL_CONFIG_INT == IdentityKitType.INCOMING_PACKET) {
			int i_29_ = Class78.packetStream.readUnsignedShort128(952968608);
			int i_30_ = Class78.packetStream.readUnsignedShortLE(i + 121);
			int i_31_ = Class78.packetStream.readIntLE(50);
			if (Class38_Sub1_Sub1.method2771(i_29_, -32291))
				Class173.method1141(1, i_30_, i_31_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Node.aClass13_3472) {
			Client.public_chat_mode = Class78.packetStream.readUnsignedByte128(27574);
			Client.trade_chat_mode = Class78.packetStream.readUnsignedByteC(-93);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class176.aClass13_2476) {
			if (Widget.root_interface != -1)
				SwitchInt.method2180(Widget.root_interface, i - 2, 0, 634);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class79_Sub1.aClass13_5167 == IdentityKitType.INCOMING_PACKET) {
			int revision = Class78.packetStream.readInt();
			int i_32_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			int i_33_ = Class78.packetStream.readIntLE(50);
			Varbit.aClass95_6658.method604(i_33_, i_32_, 0, revision);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class246_Sub7.aClass13_3960 == IdentityKitType.INCOMING_PACKET) {
			RenderAnimation.logout(i ^ 0xa8d);
			IdentityKitType.INCOMING_PACKET = null;
			return false;
		}
		if (MapFunction.aClass13_2040 == IdentityKitType.INCOMING_PACKET) {
			int i_34_ = Class78.packetStream.readUnsignedByte();
			int i_35_ = Class78.packetStream.readUnsignedByteC(i - 109);
			if ((i_34_ ^ 0xffffffff) == -256) {
				i_35_ = -1;
				i_34_ = -1;
			}
			NpcType.method1623(i + 131, i_34_, i_35_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == AbstractModel.SEND_SKILLS_IN) {
			int i_36_ = Class78.packetStream.readIntLE(i ^ 0x54);
			int i_37_ = Class78.packetStream.readUnsignedByte128(27574);
			int i_38_ = Class78.packetStream.readUnsigned128Byte();
			Player.experience[i_37_] = i_36_;
			Player.skill_levels[i_37_] = i_38_;
			Player.skill_base_levels[i_37_] = 1;
			int i_39_ = Class246_Sub14.anIntArray4435[i_37_] - 1;
			for (int i_40_ = 0; (i_39_ ^ 0xffffffff) < (i_40_ ^ 0xffffffff); i_40_++) {
				if ((i_36_ ^ 0xffffffff) <= (Varbit.anIntArray1532[i_40_] ^ 0xffffffff))
					Player.skill_base_levels[i_37_] = 2 + i_40_;
			}
			Class246_Sub28_Sub2.anIntArray5807[method184(31, Class189.anInt2671++)] = i_37_;
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class246_Sub28_Sub10.aClass13_6157) {
			int i_41_ = Class78.packetStream.readIntV2(86);
			int i_42_ = Class78.packetStream.readUnsignedShort();
			if (Class38_Sub1_Sub1.method2771(i_42_, -32291))
				Class31.method232(3, -97, i_41_, -1, -1);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class136.ROOT_INTER) {
			int revision = Class78.packetStream.readInt();
			int i_43_ = Class78.packetStream.readUnsignedByte();
			int i_44_ = Class78.packetStream.readUnsignedShortLE(i + 117);
			int widget_id = Class78.packetStream.readUnsignedShortLE(i + 115);
			if (Class38_Sub1_Sub1.method2771(i_44_, -32291)) {
				if (i_43_ == 2) {
					Class_w.method2651(98);
				}
				Widget.root_interface = widget_id;
				Class241.method1546(widget_id, i ^ 0xa5d, revision);
				Class177.method1165((byte) -27, false, revision);
				ScriptExecutor.execute_on_load_script(Widget.root_interface, revision);
				for (int i_46_ = 0; (i_46_ ^ 0xffffffff) > -101; i_46_++) {
					Class246_Sub39.aBoolArray5488[i_46_] = true;
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class59_Sub1_Sub2.aClass13_6132 == IdentityKitType.INCOMING_PACKET) {
			int i_47_ = Class78.packetStream.readIntV1(-100);
			int i_48_ = Class78.packetStream.readInt((byte) 74);
			int i_49_ = Class78.packetStream.readUnsignedShort();
			int i_50_ = Class78.packetStream.readUnsignedShort128(952968608);
			if (Class38_Sub1_Sub1.method2771(i_49_, i ^ ~0x7e23))
				Class31.method232(5, -98, i_47_, i_50_, i_48_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class224.aClass13_3094 == IdentityKitType.INCOMING_PACKET) {
			int i_51_ = Class78.packetStream.readUnsignedShort();
			int i_52_ = Class78.packetStream.readUnsignedShort();
			int i_53_ = Class78.packetStream.readUnsignedShort();
			int i_54_ = Class78.packetStream.readUnsignedShort();
			if (Class38_Sub1_Sub1.method2771(i_51_, -32291) && Widget.widgets[i_52_] != null) {
				for (int i_55_ = i_53_; (i_54_ ^ 0xffffffff) < (i_55_ ^ 0xffffffff); i_55_++) {
					int i_56_ = Class78.packetStream.read24BitInteger((byte) 29);
					if (i_55_ < (Widget.widgets[i_52_]).length && (Widget.widgets[i_52_][i_55_]) != null)
						((Widget) (Widget.widgets[i_52_][i_55_])).anInt3262 = i_56_;
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class246_Sub30_Sub1.aClass13_5763) {
			boolean bool = ((Class78.packetStream.readUnsignedByte() ^ 0xffffffff) == -2);
			String string = Class78.packetStream.readString((byte) -40);
			String string_57_ = string;
			if (bool)
				string_57_ = Class78.packetStream.readString((byte) -40);
			long l = (long) Class78.packetStream.readUnsignedShort();
			long l_58_ = (long) Class78.packetStream.read24BitInteger((byte) 29);
			int i_59_ = Class78.packetStream.readUnsignedByte();
			int i_60_ = Class78.packetStream.readUnsignedShort();
			long l_61_ = l_58_ + (l << 32);
			boolean bool_62_ = false;
			while_0_: do {
				for (int i_63_ = 0; i_63_ < 100; i_63_++) {
					if (Class246_Sub1_Sub16.aLongArray6694[i_63_] == l_61_) {
						bool_62_ = true;
						break while_0_;
					}
				}
				if (i_59_ <= 1 && Class129.method881(string_57_, false))
					bool_62_ = true;
			} while (false);
			if (!bool_62_ && Class37.anInt551 == 0) {
				Class246_Sub1_Sub16.aLongArray6694[Class230.anInt3160] = l_61_;
				Class230.anInt3160 = (Class230.anInt3160 + 1) % 100;
				String string_64_ = Class128_Sub1.aClass65_5558.method428(i_60_, (byte) -99)
						.method2436(Class78.packetStream, -127);
				if (i_59_ == 2)
					Class241.method1545((byte) 70, i_60_, "<img=1>" + string_57_, string_64_, null, 0,
							"<img=1>" + string, 18);
				else if ((i_59_ ^ 0xffffffff) == -2)
					Class241.method1545((byte) 89, i_60_, "<img=0>" + string_57_, string_64_, null, 0,
							"<img=0>" + string, 18);
				else
					Class241.method1545((byte) 126, i_60_, string_57_, string_64_, null, 0, string, 18);
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == InvTypeLoader.SEND_UPDATE_ITEMS_IN) {
			int i_65_ = Class78.packetStream.readUnsignedShort();
			int i_66_ = Class78.packetStream.readUnsignedByte();
			boolean bool = (i_66_ & 0x1) == 1;
			while (Class130_Sub1_Sub1.anInt7046 > ((Buffer) Class78.packetStream).position) {
				int i_67_ = Class78.packetStream.readSmart((byte) 104);
				int i_68_ = Class78.packetStream.readUnsignedShort();
				int i_69_ = 0;
				if ((i_68_ ^ 0xffffffff) != -1) {
					i_69_ = Class78.packetStream.readUnsignedByte();
					if ((i_69_ ^ 0xffffffff) == -256)
						i_69_ = Class78.packetStream.readInt((byte) 124);
				}
				Class246_Sub1_Sub10.method2599(i_67_, -1 + i_68_, -1, i_65_, i_69_, bool);
			}
			Class59_Sub4_Sub3.anIntArray6948[method184(31, TextureLoader.anInt973++)] = i_65_;
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class99.SEND_URL_PACKET == IdentityKitType.INCOMING_PACKET) {
			if (Class38_Sub1.aFrame5114 != null)
				Class100.setWindowedMode((((Renderer) (Client.current_renderer)).frame_mode), -1, -1, false, false);
			byte[] is = new byte[Class130_Sub1_Sub1.anInt7046];
			Class78.packetStream.method2473(97, Class130_Sub1_Sub1.anInt7046, 0, is);
			String string = Class_l_Sub2.method2299(11783, is, Class130_Sub1_Sub1.anInt7046, 0);
			Class148.method1001(Client.sign_link, string, (Buffer.anInt5656 ^ 0xffffffff) == -2, true, 103);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class179.SEND_GROUND_ITEM_PACKET) {
			Class246_Sub1_Sub15.method2719(i + 58, Class71.SEND_GROUND_ITEM);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class101.SEND_VAR_INT) {
			int i_70_ = Class78.packetStream.readIntV1(-128);
			int i_71_ = Class78.packetStream.readUnsignedShortLE(116);
			Varbit.aClass95_6658.method606(-114, i_71_, i_70_, 634);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class303.OPEN_INTERFACE_IN == IdentityKitType.INCOMING_PACKET) {
			int i_72_ = Class78.packetStream.readUnsigned128Byte();
			int i_73_ = Class78.packetStream.readUnsignedShort128(i + 952968607);
			int widget_id = Class78.packetStream.readInt((byte) 98);
			int revision = Class78.packetStream.readInt((byte) 98);
			int i_75_ = Class78.packetStream.readUnsignedShortLE(121);
			try {
				if (Class38_Sub1_Sub1.method2771(i_73_, -32291)) {
					WidgetParent class246_sub40 = ((WidgetParent) Widget.get_widget_parents(revision)
							.get((long) widget_id));
					if (class246_sub40 != null) {
						Widget.close_widget(i_75_ != ((WidgetParent) class246_sub40).anInt5517, class246_sub40, false,
								i - 118, revision, "here5");
					}
					IdentityKitType.method1064(i_75_, i_72_, false, (byte) 125, widget_id, revision);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class170.SPAWN_WORLD_OBJECT_PACKET == IdentityKitType.INCOMING_PACKET) {
			Class246_Sub1_Sub15.method2719(113, Class78.SEND_WORLD_OBJECT);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Filestore.ANIMATION_ON_INTERFACE_PACKET == IdentityKitType.INCOMING_PACKET) {
			int i_76_ = Class78.packetStream.readUnsignedShort128(952968608);
			int i_77_ = Class78.packetStream.method2372((byte) -120);
			int i_78_ = Class78.packetStream.readIntV2(29);
			if (Class38_Sub1_Sub1.method2771(i_76_, -32291))
				Class246_Sub13.method1991(-112, i_77_, i_78_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class244.aClass13_3455 == IdentityKitType.INCOMING_PACKET) {
			int i_79_ = Class78.packetStream.readUnsignedShort();
			int i_80_ = Class78.packetStream.readUnsigned128Byte();
			boolean bool = (0x1 & i_80_ ^ 0xffffffff) == -2;
			Class246_Sub1_Sub15_Sub2.method2896(21856, i_79_, bool);
			Class59_Sub4_Sub3.anIntArray6948[method184(31, TextureLoader.anInt973++)] = i_79_;
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class240.aClass13_3386 == IdentityKitType.INCOMING_PACKET) {
			boolean bool = ((Class78.packetStream.readUnsignedByte() ^ 0xffffffff) == -2);
			String string = Class78.packetStream.readString((byte) -40);
			String string_81_ = string;
			if (bool)
				string_81_ = Class78.packetStream.readString((byte) -40);
			int i_82_ = Class78.packetStream.readUnsignedByte();
			boolean bool_83_ = false;
			if (i_82_ <= 1) {
				if (Class59.aBool820 && !Class_u.aBool4703 || Class168.aBool2395)
					bool_83_ = true;
				else if ((i_82_ ^ 0xffffffff) >= -2 && Class129.method881(string_81_, false))
					bool_83_ = true;
			}
			if (!bool_83_ && Class37.anInt551 == 0) {
				String string_84_ = (Class59_Sub3_Sub1.method2443(MapFunction.method940(false, Class78.packetStream),
						(byte) 116));
				if (i_82_ == 2)
					Class241.method1545((byte) 89, -1, "<img=1>" + string_81_, string_84_, null, 0, "<img=1>" + string,
							24);
				else if (i_82_ != 1)
					Class241.method1545((byte) 83, -1, string_81_, string_84_, null, 0, string, 24);
				else
					Class241.method1545((byte) 117, -1, "<img=0>" + string_81_, string_84_, null, 0, "<img=0>" + string,
							24);
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class59_Sub2_Sub3.aClass13_6614) {
			Class246_Sub1_Sub15.method2719(121, SubIncomingPacket.aClass12_7094);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class127.FRIENDS_LIST_PACKET == IdentityKitType.INCOMING_PACKET) {
			while (((Buffer) Class78.packetStream).position < Class130_Sub1_Sub1.anInt7046) {
				boolean bool = Class78.packetStream.readUnsignedByte() == 1;
				String string = Class78.packetStream.readString((byte) -40);
				String string_85_ = Class78.packetStream.readString((byte) -40);
				int i_86_ = Class78.packetStream.readUnsignedShort();
				int i_87_ = Class78.packetStream.readUnsignedByte();
				String string_88_ = "";
				boolean bool_89_ = false;
				if (i_86_ > 0) {
					string_88_ = Class78.packetStream.readString((byte) -40);
					bool_89_ = Class78.packetStream.readUnsignedByte() == 1;
				}
				for (int i_90_ = 0; Client.anInt3969 > i_90_; i_90_++) {
					if (!bool) {
						if (string.equals(Model.f_gb[i_90_])) {
							if (Class40.anIntArray615[i_90_] != i_86_) {
								Class40.anIntArray615[i_90_] = i_86_;
								if (i_86_ > 0)
									MultilingualString.method437(0, 5, (string
											+ (Class246_Sub28_Sub11.aClass67_6160.get(Preferences.language_code))), "",
											"", true);
								if ((i_86_ ^ 0xffffffff) == -1)
									MultilingualString.method437(0, 5,
											string + (FloorDefinition.aClass67_2920.get(Preferences.language_code)), "",
											"", true);
							}
							Class33.aStringArray446[i_90_] = string_85_;
							Class245.aStringArray3461[i_90_] = string_88_;
							Class246_Sub28_Sub25.anIntArray6704[i_90_] = i_87_;
							string = null;
							WidgetParent.aBoolArray5520[i_90_] = bool_89_;
							break;
						}
					} else if (string_85_.equals(Model.f_gb[i_90_])) {
						Model.f_gb[i_90_] = string;
						string = null;
						Class33.aStringArray446[i_90_] = string_85_;
						break;
					}
				}
				if (string != null && Client.anInt3969 < 200) {
					Model.f_gb[Client.anInt3969] = string;
					Class33.aStringArray446[Client.anInt3969] = string_85_;
					Class40.anIntArray615[Client.anInt3969] = i_86_;
					Class245.aStringArray3461[Client.anInt3969] = string_88_;
					Class246_Sub28_Sub25.anIntArray6704[(Client.anInt3969)] = i_87_;
					WidgetParent.aBoolArray5520[Client.anInt3969] = bool_89_;
					Client.anInt3969++;
				}
			}
			Client.anInt1429 = 2;
			Class246_Sub1_Sub15.anInt6602 = Client.cycleCntr;
			boolean bool = false;
			int i_91_ = Client.anInt3969;
			while ((i_91_ ^ 0xffffffff) < -1) {
				i_91_--;
				bool = true;
				for (int i_92_ = 0; i_91_ > i_92_; i_92_++) {
					if ((((Class40.anIntArray615[i_92_] ^ 0xffffffff) != (Client.world_id ^ 0xffffffff))
							&& (Client.world_id == Class40.anIntArray615[i_92_ + 1]))
							|| (Class40.anIntArray615[i_92_] == 0
									&& (Class40.anIntArray615[1 + i_92_] ^ 0xffffffff) != -1)) {
						int i_93_ = Class40.anIntArray615[i_92_];
						Class40.anIntArray615[i_92_] = Class40.anIntArray615[1 + i_92_];
						Class40.anIntArray615[1 + i_92_] = i_93_;
						String string = Class245.aStringArray3461[i_92_];
						Class245.aStringArray3461[i_92_] = Class245.aStringArray3461[i_92_ + 1];
						Class245.aStringArray3461[1 + i_92_] = string;
						String string_94_ = Model.f_gb[i_92_];
						Model.f_gb[i_92_] = Model.f_gb[i_92_ + 1];
						Model.f_gb[i_92_ + 1] = string_94_;
						String string_95_ = Class33.aStringArray446[i_92_];
						Class33.aStringArray446[i_92_] = Class33.aStringArray446[i_92_ + 1];
						Class33.aStringArray446[i_92_ + 1] = string_95_;
						int i_96_ = Class246_Sub28_Sub25.anIntArray6704[i_92_];
						Class246_Sub28_Sub25.anIntArray6704[i_92_] = (Class246_Sub28_Sub25.anIntArray6704[1 + i_92_]);
						Class246_Sub28_Sub25.anIntArray6704[i_92_ + 1] = i_96_;
						boolean bool_97_ = WidgetParent.aBoolArray5520[i_92_];
						WidgetParent.aBoolArray5520[i_92_] = WidgetParent.aBoolArray5520[1 + i_92_];
						WidgetParent.aBoolArray5520[1 + i_92_] = bool_97_;
						bool = false;
					}
				}
				if (bool)
					break;
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class246_Sub28_Sub34.aClass13_7007) {
			int i_98_ = Class78.packetStream.readUnsignedShortLE(i + 121);
			if (i_98_ == 65535)
				i_98_ = -1;
			int i_99_ = Class78.packetStream.readInt((byte) 105);
			int i_100_ = Class78.packetStream.readUnsignedShort128(i + 952968607);
			if (Class38_Sub1_Sub1.method2771(i_100_, i ^ ~0x7e23))
				Class45.method306(i ^ 0x28ce, i_98_, i_99_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class_m.PLAYER_UPDATE_PACKET == IdentityKitType.INCOMING_PACKET) {
			Class101.decodePlayerUpdate(Class78.packetStream, -127, Class130_Sub1_Sub1.anInt7046);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class5.SEND_VAR_BIT_BYTE) {
			int revision = Class78.packetStream.readInt();
			int i_101_ = Class78.packetStream.readUnsignedShort();
			int i_102_ = Class78.packetStream.readUnsignedByte();
			Varbit.aClass95_6658.method611(i_101_, (byte) 108, i_102_, revision);
			Varbit.aClass95_6658.method604(i_102_, i_101_, 0, revision);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class239.aClass13_3375 == IdentityKitType.INCOMING_PACKET) {
			int fromSlot = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			if ((fromSlot ^ 0xffffffff) == -65536)
				fromSlot = -1;
			int i_104_ = Class78.packetStream.readIntV2(43);
			int i_105_ = Class78.packetStream.readUnsignedShort();
			int revision = Class78.packetStream.readInt();
			int i_106_ = Class78.packetStream.readInt((byte) 82);
			int i_107_ = Class78.packetStream.readUnsignedShortLE(124);
			if ((i_107_ ^ 0xffffffff) == -65536)
				i_107_ = -1;
			if (Class38_Sub1_Sub1.method2771(i_105_, i - 32292)) {
				for (int i_108_ = fromSlot; i_107_ >= i_108_; i_108_++) {
					long l = ((long) i_106_ << 32) + (long) i_108_;
					ClickMaskNode class246_sub27 = ((ClickMaskNode) Widget.get_widget_flags(revision).get(l));
					ClickMaskNode class246_sub27_109_;
					if (class246_sub27 == null) {
						if ((i_108_ ^ 0xffffffff) != 0)
							class246_sub27_109_ = new ClickMaskNode(i_104_, -1);
						else
							class246_sub27_109_ = (new ClickMaskNode(i_104_,
									((ClickMaskNode) (((Widget) Widget.get_widget(i_106_,
											revision)).click_mask)).anInt4898));
					} else {
						class246_sub27_109_ = new ClickMaskNode(i_104_, (((ClickMaskNode) class246_sub27).anInt4898));
						class246_sub27.remove();
					}
					Widget.get_widget_flags(revision).method547(l, i ^ ~0x8fd, class246_sub27_109_);
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class58.WORLD_TILE_PACKET == IdentityKitType.INCOMING_PACKET) {
			Class82.baseTileX = Class78.packetStream.read128Byte(128) << 3;
			Class106_Sub2.baseTileY = Class78.packetStream.readByte() << 3;
			Class60.basePlane = Class78.packetStream.readUnsignedByteC(-82);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class246_Sub38.aClass13_5433 == IdentityKitType.INCOMING_PACKET) {
			Player.weight = Class78.packetStream.method2375((byte) 1);
			Class168.anInt2399 = Client.cycleCntr;
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class_j.aClass13_1479) {
			int i_110_ = Class78.packetStream.readUnsigned128Byte();
			int i_111_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			if (Class38_Sub1_Sub1.method2771(i_111_, -32291))
				SpotAnimType.anInt2074 = i_110_;
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class_ss.aClass13_7056 == IdentityKitType.INCOMING_PACKET) {
			int i_112_ = Class78.packetStream.readUnsignedShortLE(118);
			int i_113_ = Class78.packetStream.readUnsignedShort128(i + 952968607);
			int i_114_ = Class78.packetStream.readIntV2(34);
			int i_115_ = Class78.packetStream.readUnsignedShort128(952968608);
			int i_116_ = Class78.packetStream.readUnsignedByte128(27574);
			boolean bool = (i_116_ & 0x80 ^ 0xffffffff) != -1;
			if (i_114_ >> 30 == 0) {
				if (i_114_ >> 29 != 0) {
					int i_117_ = i_114_ & 0xffff;
					Npc class_r_sub2 = VarcLoader.aClass_r_Sub2Array1002[i_117_];
					if (class_r_sub2 != null) {
						if (i_113_ == 65535)
							i_113_ = -1;
						boolean bool_118_ = true;
						int i_119_ = (!bool ? ((Entity) class_r_sub2).anInt6437 : ((Entity) class_r_sub2).f_pb);
						if ((i_113_ ^ 0xffffffff) != 0 && i_119_ != -1) {
							if ((i_113_ ^ 0xffffffff) != (i_119_ ^ 0xffffffff)) {
								SpotAnimType class144 = Class195.aClass177_2745.list(i - 138, i_113_, 634, 9);
								SpotAnimType class144_120_ = Class195.aClass177_2745.list(-137, i_119_, 634, 10);
								if ((((SpotAnimType) class144).animationId ^ 0xffffffff) != 0
										&& (((SpotAnimType) class144_120_).animationId) != -1) {
									SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(3,
											(((SpotAnimType) class144).animationId), class144.revision));
									SequenceType class124_121_ = (Class59_Sub3_Sub3.aClass45_6275.list(3,
											(((SpotAnimType) class144_120_).animationId)));
									if ((((SequenceType) class124_121_).forcedPriority) > ((SequenceType) class124).forcedPriority)
										bool_118_ = false;
								}
							} else {
								SpotAnimType class144 = Class195.aClass177_2745.list(i - 138, i_113_, 634, 11);
								if (((SpotAnimType) class144).aBool2087
										&& (((SpotAnimType) class144).animationId ^ 0xffffffff) != 0) {
									SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(i + 2,
											(((SpotAnimType) class144).animationId), class144.revision));
									int i_122_ = ((SequenceType) class124).replyMode;
									if (i_122_ != 0 && (i_122_ ^ 0xffffffff) != -3) {
										if ((i_122_ ^ 0xffffffff) == -2)
											bool_118_ = true;
									} else
										bool_118_ = false;
								}
							}
						}
						if (bool_118_) {
							if (!bool) {
								((Entity) class_r_sub2).anInt6417 = i_115_;
								((Entity) class_r_sub2).anInt6433 = 0;
								((Entity) class_r_sub2).f_fc = 1;
								((Entity) class_r_sub2).anInt6437 = i_113_;
								((Entity) class_r_sub2).anInt6421 = 0x7 & i_116_;
								((Entity) class_r_sub2).anInt6448 = (i_112_ + Client.cycle);
								((Entity) class_r_sub2).anInt6442 = 0;
								if (((Entity) class_r_sub2).anInt6448 > Client.cycle)
									((Entity) class_r_sub2).anInt6433 = -1;
								if ((((Entity) class_r_sub2).anInt6437 ^ 0xffffffff) != 0
										&& (Client.cycle == (((Entity) class_r_sub2).anInt6448))) {
									int i_123_ = (((SpotAnimType) (Class195.aClass177_2745.list(i - 138,
											(((Entity) class_r_sub2).anInt6437), 634, 11))).animationId);
									if ((i_123_ ^ 0xffffffff) != 0) {
										SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, i_123_);
										if (class124 != null && (((SequenceType) class124).frameIDs) != null)
											Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r_sub2).x, 0,
													((Class59_Sub3) class_r_sub2).current_plane,
													((Class59_Sub3) class_r_sub2).y, true, class124, false);
									}
								}
							} else {
								((Entity) class_r_sub2).anInt6427 = 0;
								((Entity) class_r_sub2).anInt6458 = (i_112_ + Client.cycle);
								((Entity) class_r_sub2).anInt6443 = i_115_;
								((Entity) class_r_sub2).anInt6461 = 1;
								((Entity) class_r_sub2).anInt6454 = 0;
								((Entity) class_r_sub2).anInt6446 = 0x7 & i_116_;
								((Entity) class_r_sub2).f_pb = i_113_;
								if (((Entity) class_r_sub2).anInt6458 > Client.cycle)
									((Entity) class_r_sub2).anInt6427 = -1;
								if ((((Entity) class_r_sub2).f_pb ^ 0xffffffff) != 0 && ((Client.cycle
										^ 0xffffffff) == ((((Entity) class_r_sub2).anInt6458) ^ 0xffffffff))) {
									int i_124_ = (((SpotAnimType) (Class195.aClass177_2745.list(i - 138,
											(((Entity) class_r_sub2).f_pb), 634, 12))).animationId);
									if ((i_124_ ^ 0xffffffff) != 0) {
										SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, i_124_);
										if (class124 != null && (((SequenceType) class124).frameIDs) != null)
											Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r_sub2).x, 0,
													((Class59_Sub3) class_r_sub2).current_plane,
													((Class59_Sub3) class_r_sub2).y, true, class124, false);
									}
								}
							}
						}
					}
				} else if (i_114_ >> 28 != 0) {
					int i_125_ = i_114_ & 0xffff;
					Player class_r_sub1;
					if ((Class109.anInt1567 ^ 0xffffffff) == (i_125_ ^ 0xffffffff))
						class_r_sub1 = Client.local_player;
					else
						class_r_sub1 = Class143.players[i_125_];
					if (class_r_sub1 != null) {
						if (i_113_ == 65535)
							i_113_ = -1;
						boolean bool_126_ = true;
						int i_127_ = (bool ? ((Entity) class_r_sub1).f_pb : ((Entity) class_r_sub1).anInt6437);
						if ((i_113_ ^ 0xffffffff) != 0 && (i_127_ ^ 0xffffffff) != 0) {
							if ((i_113_ ^ 0xffffffff) != (i_127_ ^ 0xffffffff)) {
								SpotAnimType class144 = Class195.aClass177_2745.list(i ^ ~0x89, i_113_, 634, 13);
								SpotAnimType class144_128_ = Class195.aClass177_2745.list(-137, i_127_, 634, 14);
								if (((SpotAnimType) class144).animationId != -1
										&& ((((SpotAnimType) class144_128_).animationId) ^ 0xffffffff) != 0) {
									SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(i ^ 0x2,
											(((SpotAnimType) class144).animationId)));
									SequenceType class124_129_ = (Class59_Sub3_Sub3.aClass45_6275.list(i + 2,
											(((SpotAnimType) class144_128_).animationId)));
									if (((((SequenceType) class124_129_).forcedPriority)
											^ 0xffffffff) < (((SequenceType) class124).forcedPriority ^ 0xffffffff))
										bool_126_ = false;
								}
							} else {
								SpotAnimType class144 = Class195.aClass177_2745.list(-137, i_113_, 634, 15);
								if (((SpotAnimType) class144).aBool2087
										&& (((SpotAnimType) class144).animationId != -1)) {
									SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(3,
											(((SpotAnimType) class144).animationId)));
									int i_130_ = ((SequenceType) class124).replyMode;
									if (i_130_ == 0 || i_130_ == 2)
										bool_126_ = false;
									else if (i_130_ == 1)
										bool_126_ = true;
								}
							}
						}
						if (bool_126_) {
							if (!bool) {
								((Entity) class_r_sub1).anInt6421 = 0x7 & i_116_;
								((Entity) class_r_sub1).anInt6442 = 0;
								((Entity) class_r_sub1).anInt6417 = i_115_;
								((Entity) class_r_sub1).f_fc = 1;
								((Entity) class_r_sub1).anInt6437 = i_113_;
								((Entity) class_r_sub1).anInt6448 = (Client.cycle + i_112_);
								((Entity) class_r_sub1).anInt6433 = 0;
								if (((Entity) class_r_sub1).anInt6437 == 65535)
									((Entity) class_r_sub1).anInt6437 = -1;
								if (((Entity) class_r_sub1).anInt6448 > Client.cycle)
									((Entity) class_r_sub1).anInt6433 = -1;
								if ((((Entity) class_r_sub1).anInt6437 ^ 0xffffffff) != 0
										&& (((Entity) class_r_sub1).anInt6448 == Client.cycle)) {
									int i_131_ = (((SpotAnimType) (Class195.aClass177_2745.list(i - 138,
											(((Entity) class_r_sub1).anInt6437), 634, 15))).animationId);
									if ((i_131_ ^ 0xffffffff) != 0) {
										SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, i_131_);
										if (class124 != null && (((SequenceType) class124).frameIDs) != null)
											Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r_sub1).x, 0,
													((Class59_Sub3) class_r_sub1).current_plane,
													((Class59_Sub3) class_r_sub1).y, true, class124,
													((Client.local_player) == class_r_sub1));
									}
								}
							} else {
								((Entity) class_r_sub1).anInt6446 = i_116_ & 0x7;
								((Entity) class_r_sub1).f_pb = i_113_;
								((Entity) class_r_sub1).anInt6443 = i_115_;
								((Entity) class_r_sub1).anInt6461 = 1;
								((Entity) class_r_sub1).anInt6458 = (i_112_ + Client.cycle);
								((Entity) class_r_sub1).anInt6427 = 0;
								((Entity) class_r_sub1).anInt6454 = 0;
								if ((((Entity) class_r_sub1).f_pb ^ 0xffffffff) == -65536)
									((Entity) class_r_sub1).f_pb = -1;
								if ((((Entity) class_r_sub1).anInt6458 ^ 0xffffffff) < (Client.cycle ^ 0xffffffff))
									((Entity) class_r_sub1).anInt6427 = -1;
								if ((((Entity) class_r_sub1).f_pb ^ 0xffffffff) != 0
										&& ((((Entity) class_r_sub1).anInt6458 ^ 0xffffffff) == (Client.cycle
												^ 0xffffffff))) {
									int i_132_ = (((SpotAnimType) (Class195.aClass177_2745.list(-137,
											(((Entity) class_r_sub1).f_pb), 634, 16))).animationId);
									if (i_132_ != -1) {
										SequenceType class124 = Class59_Sub3_Sub3.aClass45_6275.list(3, i_132_);
										if (class124 != null && (((SequenceType) class124).frameIDs) != null)
											Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r_sub1).x, 0,
													((Class59_Sub3) class_r_sub1).current_plane,
													((Class59_Sub3) class_r_sub1).y, true, class124,
													(class_r_sub1 == (Client.local_player)));
									}
								}
							}
						}
					}
				}
			} else {
				int i_133_ = 0x3 & i_114_ >> 28;
				int i_134_ = (i_114_ >> 14 & 0x3fff) + -Client.base_x;
				int i_135_ = -Client.base_y + (0x3fff & i_114_);
				if ((i_134_ ^ 0xffffffff) <= -1 && i_135_ >= 0
						&& ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i_134_ ^ 0xffffffff))
						&& Class152.anInt2205 > i_135_) {
					int i_136_ = 128 * i_134_ + 64;
					int i_137_ = 64 + 128 * i_135_;
					int i_138_ = i_133_;
					if ((i_138_ ^ 0xffffffff) > -4 && Class211.method1389(i_134_, -29792, i_135_))
						i_138_++;
					Class59_Sub3_Sub2 class59_sub3_sub2 = (new Class59_Sub3_Sub2(i_113_, 0, Client.cycle, i_133_,
							i_138_, i_136_, -i_115_ + Class6.getAverageHeight(i_136_, -117, i_133_, i_137_), i_137_,
							i_134_, i_134_, i_135_, i_135_, i_116_));
					ScriptEvent.aClass166_4968.push_head(new Class246_Sub1_Sub9(class59_sub3_sub2));
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class259_Sub3.aClass13_5356) {
			int i_139_ = Class78.packetStream.readUnsignedShort();
			int i_140_ = Class78.packetStream.readUnsignedByte();
			boolean bool = (0x1 & i_140_) == 1;
			HDModel.method2030(i_139_, 0, bool);
			int i_141_ = Class78.packetStream.readUnsignedShort();
			for (int i_142_ = 0; i_141_ > i_142_; i_142_++) {
				int i_143_ = Class78.packetStream.readUnsigned128Byte();
				if ((i_143_ ^ 0xffffffff) == -256)
					i_143_ = Class78.packetStream.readIntLE(72);
				int i_144_ = Class78.packetStream.readUnsignedShort();
				Class246_Sub1_Sub10.method2599(i_142_, -1 + i_144_, -1, i_139_, i_143_, bool);
			}
			Class59_Sub4_Sub3.anIntArray6948[method184(TextureLoader.anInt973++, 31)] = i_139_;
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class232.aClass13_3174) {
			String string = Class78.packetStream.readString((byte) -40);
			String string_145_ = (Class59_Sub3_Sub1.method2443(MapFunction.method940(false, Class78.packetStream),
					(byte) 89));
			MultilingualString.method437(0, 6, string_145_, string, string, true);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class303.aClass13_2302) {
			int i_146_ = Class78.packetStream.readUnsignedShortLE(i + 122);
			int i_147_ = Class78.packetStream.readUnsignedShort128(952968608);
			if (i_147_ == 65535)
				i_147_ = -1;
			int i_148_ = Class78.packetStream.readInt((byte) 93);
			int i_149_ = Class78.packetStream.readIntV1(-103);
			if (Class38_Sub1_Sub1.method2771(i_146_, -32291)) {
				Class59_Sub1_Sub2.method2572(i ^ ~0x76, i_149_, i_148_, i_147_);
				ObjType class197 = MapRegion.aClass191_3663.list(22883, i_147_);
				Class194_Sub1.method1881(i_149_, (byte) -63, ((ObjType) class197).yan2d, ((ObjType) class197).xan2d,
						((ObjType) class197).zoom2d);
				Class246_Sub28_Sub3.method2491((((ObjType) class197).offsetX2d), ((ObjType) class197).offsetY2d,
						(byte) 53, i_149_, (((ObjType) class197).zan2d));
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class246_Sub28_Sub13.aClass13_6292) {
			int i_150_ = Class78.packetStream.readUnsignedShortLE(125);
			int i_151_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			int i_152_ = Class78.packetStream.readUnsignedShort();
			int i_153_ = Class78.packetStream.readUnsignedShort128(952968608);
			int i_154_ = Class78.packetStream.readIntV1(i ^ ~0x75);
			if (Class38_Sub1_Sub1.method2771(i_153_, -32291))
				Class31.method232(7, -74, i_154_, i_151_ | i_152_ << 16, i_150_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class3.aClass13_32) {
			int i_155_ = Class78.packetStream.readUnsignedShort128(952968608);
			int i_156_ = Class78.packetStream.readUnsignedShort128(i + 952968607);
			int i_157_ = Class78.packetStream.readInt((byte) 86);
			int i_158_ = Class78.packetStream.readUnsignedShortLE(122);
			int i_159_ = Class78.packetStream.readUnsignedShort();
			if (Class38_Sub1_Sub1.method2771(i_155_, -32291))
				Class194_Sub1.method1881(i_157_, (byte) -60, i_159_, i_158_, i_156_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class56.PROCESS_NPC_UPDATING_IN) {
			MouseHandler.method2003((byte) -30, true);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class246_Sub1_Sub4.SEND_VAR_BYTE == IdentityKitType.INCOMING_PACKET) {
			int i_160_ = Class78.packetStream.readUnsignedShort();
			byte i_161_ = Class78.packetStream.readByteC(0);
			Varbit.aClass95_6658.method606(i - 119, i_160_, i_161_, 634);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class78.SEND_GRAND_EXCHANGE_OFFER_PACKET == IdentityKitType.INCOMING_PACKET) {
			int i_162_ = Class78.packetStream.readUnsignedByte();
			if (Class78.packetStream.readUnsignedByte() != 0) {
				((Buffer) Class78.packetStream).position--;
				Client.grand_exchange_objects[i_162_] = new Class18(Class78.packetStream);
			} else
				Client.grand_exchange_objects[i_162_] = new Class18();
			Class246_Sub23.anInt4821 = Client.cycleCntr;
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == VarpType.aClass13_1221) {
			boolean bool = Class78.packetStream.readUnsignedByte() == 1;
			String string = Class78.packetStream.readString((byte) -40);
			String string_163_ = string;
			if (bool)
				string_163_ = Class78.packetStream.readString((byte) -40);
			long l = (long) Class78.packetStream.readUnsignedShort();
			long l_164_ = (long) Class78.packetStream.read24BitInteger((byte) 29);
			int i_165_ = Class78.packetStream.readUnsignedByte();
			long l_166_ = (l << 32) + l_164_;
			boolean bool_167_ = false;
			while_1_: do {
				for (int i_168_ = 0; (i_168_ ^ 0xffffffff) > -101; i_168_++) {
					if (l_166_ == Class246_Sub1_Sub16.aLongArray6694[i_168_]) {
						bool_167_ = true;
						break while_1_;
					}
				}
				if (i_165_ <= 1) {
					if (Class59.aBool820 && !Class_u.aBool4703 || Class168.aBool2395)
						bool_167_ = true;
					else if (Class129.method881(string_163_, false))
						bool_167_ = true;
				}
			} while (false);
			if (!bool_167_ && Class37.anInt551 == 0) {
				Class246_Sub1_Sub16.aLongArray6694[Class230.anInt3160] = l_166_;
				Class230.anInt3160 = (1 + Class230.anInt3160) % 100;
				String string_169_ = (Class59_Sub3_Sub1.method2443(MapFunction.method940(false, Class78.packetStream),
						(byte) 111));
				if (i_165_ == 2)
					Class241.method1545((byte) 115, -1, "<img=1>" + string_163_, string_169_, null, 0,
							"<img=1>" + string, 7);
				else if (i_165_ == 1)
					Class241.method1545((byte) 82, -1, "<img=0>" + string_163_, string_169_, null, 0,
							"<img=0>" + string, 7);
				else
					Class241.method1545((byte) 70, -1, string_163_, string_169_, null, 0, string, 3);
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class246_Sub28_Sub23.SEND_GRAPHICS == IdentityKitType.INCOMING_PACKET) {
			int i_170_ = Class78.packetStream.readUnsignedShortLE(i ^ 0x7a);
			int i_171_ = Class78.packetStream.readUnsignedByte128(27574);
			int i_172_ = Class78.packetStream.readUnsignedShortLE(120);
			Npc class_r_sub2 = VarcLoader.aClass_r_Sub2Array1002[i_170_];
			if (class_r_sub2 != null)
				Class246_Sub4.method1808(i_172_, i_171_, 1, class_r_sub2, 634);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (ISAAC.SEND_IGNORES_LIST_PACKET == IdentityKitType.INCOMING_PACKET) {
			Widget.anInt3266 = Class78.packetStream.readUnsignedByte();
			for (int i_173_ = 0; i_173_ < Widget.anInt3266; i_173_++) {
				Class38_Sub1_Sub1.aStringArray6762[i_173_] = Class78.packetStream.readString((byte) -40);
				Class55.aStringArray784[i_173_] = Class78.packetStream.readString((byte) -40);
				if (Class55.aStringArray784[i_173_].equals(""))
					Class55.aStringArray784[i_173_] = Class38_Sub1_Sub1.aStringArray6762[i_173_];
				SequenceLoader.aStringArray6745[i_173_] = Class78.packetStream.readString((byte) -40);
				Class246_Sub41_Sub1.aStringArray6172[i_173_] = Class78.packetStream.readString((byte) -40);
				if (Class246_Sub41_Sub1.aStringArray6172[i_173_].equals(""))
					Class246_Sub41_Sub1.aStringArray6172[i_173_] = SequenceLoader.aStringArray6745[i_173_];
				Class236.aBoolArray3319[i_173_] = false;
			}
			IdentityKitType.INCOMING_PACKET = null;
			Class246_Sub1_Sub15.anInt6602 = Client.cycleCntr;
			return true;
		}
		if (Class247.aClass13_3479 == IdentityKitType.INCOMING_PACKET) {
			boolean bool = ((Class78.packetStream.readUnsignedByte() ^ 0xffffffff) == -2);
			String string = Class78.packetStream.readString((byte) -40);
			String string_174_ = string;
			if (bool)
				string_174_ = Class78.packetStream.readString((byte) -40);
			long l = Class78.packetStream.method2364(true);
			long l_175_ = (long) Class78.packetStream.readUnsignedShort();
			long l_176_ = (long) Class78.packetStream.read24BitInteger((byte) 29);
			int i_177_ = Class78.packetStream.readUnsignedByte();
			int i_178_ = Class78.packetStream.readUnsignedShort();
			long l_179_ = (l_175_ << 32) - -l_176_;
			boolean bool_180_ = false;
			while_2_: do {
				for (int i_181_ = 0; i_181_ < 100; i_181_++) {
					if ((Class246_Sub1_Sub16.aLongArray6694[i_181_] ^ 0xffffffffffffffffL) == (l_179_
							^ 0xffffffffffffffffL)) {
						bool_180_ = true;
						break while_2_;
					}
				}
				if (i_177_ <= 1 && Class129.method881(string_174_, false))
					bool_180_ = true;
			} while (false);
			if (!bool_180_ && Class37.anInt551 == 0) {
				Class246_Sub1_Sub16.aLongArray6694[Class230.anInt3160] = l_179_;
				Class230.anInt3160 = (1 + Class230.anInt3160) % 100;
				String string_182_ = Class128_Sub1.aClass65_5558.method428(i_178_, (byte) -99)
						.method2436(Class78.packetStream, i - 128);
				if (i_177_ != 2) {
					if ((i_177_ ^ 0xffffffff) != -2)
						Class241.method1545((byte) 120, i_178_, string_174_, string_182_, Class20.method194(l, -112), 0,
								string, 20);
					else
						Class241.method1545((byte) 126, i_178_, "<img=0>" + string_174_, string_182_,
								Class20.method194(l, -116), 0, "<img=0>" + string, 20);
				} else
					Class241.method1545((byte) 117, i_178_, "<img=1>" + string_174_, string_182_,
							Class20.method194(l, i ^ ~0x4a), 0, "<img=1>" + string, 20);
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class223.aClass13_3074 == IdentityKitType.INCOMING_PACKET) {
			for (int i_183_ = 0; ((i_183_ ^ 0xffffffff) > (Class143.players.length
					^ 0xffffffff)); i_183_++) {
				if (Class143.players[i_183_] != null) {
					((Entity) Class143.players[i_183_]).current_sequence = -1;
				}
			}
			for (int i_184_ = 0; ((i_184_ ^ 0xffffffff) > (VarcLoader.aClass_r_Sub2Array1002.length
					^ 0xffffffff)); i_184_++) {
				if (VarcLoader.aClass_r_Sub2Array1002[i_184_] != null) {
					((Entity) VarcLoader.aClass_r_Sub2Array1002[i_184_]).current_sequence = -1;
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (SwitchInt.aClass13_5081 == IdentityKitType.INCOMING_PACKET) {
			int i_185_ = Class78.packetStream.readUnsignedShort();
			if (Class38_Sub1_Sub1.method2771(i_185_, i - 32292))
				Class31.method231(-18006);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (NodeSub.SEND_CLAN_CHAT_CHANNEL_PACKET == IdentityKitType.INCOMING_PACKET) {
			Class214.anInt2991 = Client.cycleCntr;
			if (Class130_Sub1_Sub1.anInt7046 == 0) {
				Clan.clanName = null;
				IdentityKitType.INCOMING_PACKET = null;
				Clan.clanMembers = null;
				Clan.clanMembersAmount = 0;
				Class221.aString3061 = null;
				return true;
			}
			Class221.aString3061 = Class78.packetStream.readString((byte) -40);
			boolean bool = ((Class78.packetStream.readUnsignedByte() ^ 0xffffffff) == -2);
			if (bool)
				Class78.packetStream.readString((byte) -40);
			long l = Class78.packetStream.method2364(true);
			Clan.clanName = Class246_Sub6.method1821(i + 106, l);
			Clan.kickRank = Class78.packetStream.readByte();
			int i_186_ = Class78.packetStream.readUnsignedByte();
			if (i_186_ == 255) {
				IdentityKitType.INCOMING_PACKET = null;
				return true;
			}
			Clan.clanMembersAmount = i_186_;
			Class9[] class9s = new Class9[100];
			for (int i_187_ = 0; ((Clan.clanMembersAmount ^ 0xffffffff) < (i_187_ ^ 0xffffffff)); i_187_++) {
				class9s[i_187_] = new Class9();
				((Class9) class9s[i_187_]).name = Class78.packetStream.readString((byte) -40);
				bool = (Class78.packetStream.readUnsignedByte() ^ 0xffffffff) == -2;
				if (bool)
					((Class9) class9s[i_187_]).aString109 = Class78.packetStream.readString((byte) -40);
				else
					((Class9) class9s[i_187_]).aString109 = ((Class9) class9s[i_187_]).name;
				((Class9) class9s[i_187_]).aString108 = Class64.method424((((Class9) class9s[i_187_]).aString109),
						(byte) -49);
				((Class9) class9s[i_187_]).world = Class78.packetStream.readUnsignedShort();
				((Class9) class9s[i_187_]).rank = Class78.packetStream.readByte();
				((Class9) class9s[i_187_]).aString105 = Class78.packetStream.readString((byte) -40);
				if (((Class9) class9s[i_187_]).aString109.equals(((Player) Client.local_player).aString7140))
					Class86.aByte1136 = ((Class9) class9s[i_187_]).rank;
			}
			boolean bool_188_ = false;
			int i_189_ = Clan.clanMembersAmount;
			while (i_189_ > 0) {
				bool_188_ = true;
				i_189_--;
				for (int i_190_ = 0; (i_189_ ^ 0xffffffff) < (i_190_ ^ 0xffffffff); i_190_++) {
					if (((((Class9) class9s[i_190_]).aString108.compareTo(((Class9) class9s[i_190_ + 1]).aString108))
							^ 0xffffffff) < -1) {
						Class9 class9 = class9s[i_190_];
						class9s[i_190_] = class9s[1 + i_190_];
						bool_188_ = false;
						class9s[i_190_ + 1] = class9;
					}
				}
				if (bool_188_)
					break;
			}
			Clan.clanMembers = class9s;
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class246_Sub38.aClass13_5444 == IdentityKitType.INCOMING_PACKET) {
			Varbit.aClass95_6658.reset(126, MapRegion.get_revision_by_region());
			ScriptEvent.anInt4981 += 32;
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class127.aClass13_1791) {
			int i_191_ = Class78.packetStream.readUnsignedShortLE(117);
			int i_192_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			if ((i_192_ ^ 0xffffffff) == -65536)
				i_192_ = -1;
			int i_193_ = Class78.packetStream.readIntV2(44);
			if (Class38_Sub1_Sub1.method2771(i_191_, -32291))
				Class31.method232(1, -107, i_193_, i_192_, -1);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class245.aClass13_3463) {
			int i_194_ = Class78.packetStream.readInt((byte) 104);
			int i_195_ = Class78.packetStream.readUnsignedShort128(952968608);
			if (Class38_Sub1_Sub1.method2771(i_195_, i - 32292))
				Class31.method232(5, -101, i_194_, Class109.anInt1567, 0);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == UnderlayLoader.aClass13_1466) {
			int i_196_ = Class78.packetStream.readUnsignedShort();
			int i_197_ = Class78.packetStream.readUnsignedByte();
			int i_198_ = Class78.packetStream.readUnsignedByte();
			int i_199_ = Class78.packetStream.readUnsignedShort() << 0;
			int i_200_ = Class78.packetStream.readUnsignedByte();
			int i_201_ = Class78.packetStream.readUnsignedByte();
			if (Class38_Sub1_Sub1.method2771(i_196_, i - 32292))
				Class172.method1133(i_201_, i_199_, i_198_, i_200_, -115, i_197_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class246_Sub28_Sub34.aClass13_7006) {
			IdentityKitType.INCOMING_PACKET = null;
			Class246_Sub1_Sub15.anInt6602 = Client.cycleCntr;
			Client.anInt1429 = 1;
			return true;
		}
		if (Class239.SEND_IGNORE_PACKET == IdentityKitType.INCOMING_PACKET) {
			int i_202_ = Class78.packetStream.readUnsignedByte();
			boolean bool = (0x1 & i_202_ ^ 0xffffffff) == -2;
			String string = Class78.packetStream.readString((byte) -40);
			String string_203_ = Class78.packetStream.readString((byte) -40);
			if (string_203_.equals(""))
				string_203_ = string;
			String string_204_ = Class78.packetStream.readString((byte) -40);
			String string_205_ = Class78.packetStream.readString((byte) -40);
			if (string_205_.equals(""))
				string_205_ = string_204_;
			if (!bool) {
				Class38_Sub1_Sub1.aStringArray6762[Widget.anInt3266] = string;
				Class55.aStringArray784[Widget.anInt3266] = string_203_;
				SequenceLoader.aStringArray6745[Widget.anInt3266] = string_204_;
				Class246_Sub41_Sub1.aStringArray6172[Widget.anInt3266] = string_205_;
				Class236.aBoolArray3319[Widget.anInt3266] = method184(i_202_, 2) == 2;
				Widget.anInt3266++;
			} else {
				for (int i_206_ = 0; Widget.anInt3266 > i_206_; i_206_++) {
					if (Class55.aStringArray784[i_206_].equals(string_205_)) {
						Class38_Sub1_Sub1.aStringArray6762[i_206_] = string;
						Class55.aStringArray784[i_206_] = string_203_;
						SequenceLoader.aStringArray6745[i_206_] = string_204_;
						Class246_Sub41_Sub1.aStringArray6172[i_206_] = string_205_;
						break;
					}
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			Class246_Sub1_Sub15.anInt6602 = Client.cycleCntr;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class12.aClass13_177) {
			Player.energy = Class78.packetStream.readUnsignedByte();
			IdentityKitType.INCOMING_PACKET = null;
			Class168.anInt2399 = Client.cycleCntr;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class91.aClass13_1183) {
			Client.reboot_timer = Class78.packetStream.readUnsignedShort() * 30;
			IdentityKitType.INCOMING_PACKET = null;
			Class168.anInt2399 = Client.cycleCntr;
			return true;
		}
		if (Class_e.INTERFACE_TEXT_IN == IdentityKitType.INCOMING_PACKET) {
			String string = Class78.packetStream.readString((byte) -40);
			if (string.contains("toggle_gameframe_")) {
				String gameframe_identifier = string.split("toggle_gameframe_")[1];
				Client.trigger_gameframe_change(gameframe_identifier.equalsIgnoreCase("osrs") ? 193
						: gameframe_identifier.contains("550") ? 550 : 634);
			} else if (string.contains("toggle_data_")) {
				String data_identifier = string.split("toggle_data_")[1];
				Settings.data = data_identifier.equalsIgnoreCase("osrs") ? Revision.OSRS
						: data_identifier.contains("550") ? Revision.PRE_EOC_550 : Revision.PRE_EOC_634;
				Client.current_renderer.save_preferences(Client.sign_link);
				for (int i_183_ = 0; ((i_183_ ^ 0xffffffff) > (Class143.players.length
						^ 0xffffffff)); i_183_++) {
					if (Class143.players[i_183_] != null) {
						((Entity) Class143.players[i_183_]).revision = Settings.data;
					}
				}
				IdentityKitLoader.identity_kit_cache = new HashMap(64);
				IdentityKitLoader.identity_kit_cache_OSRS = new HashMap(64);
				IdentityKitLoader.identity_kit_cache_550 = new HashMap(64);
				Class45.sequence_cache = new HashMap(64);
				Class45.sequence_cache_osrs = new HashMap(64);
				Class45.sequence_cache_550 = new HashMap(64);
				Class191.obj_type_cache = new HashMap(64);
				Class191.obj_type_cache_OSRS = new HashMap(64);
				Class191.obj_type_cache_550 = new HashMap(64);
				Class246_Sub28_Sub14.aClass54_6304 = new HashMap(5);
				Class191.obj_type_cache = new HashMap(64);
				Class191.obj_type_cache_OSRS = new HashMap(64);
				Class191.obj_type_cache_550 = new HashMap(64);
				Entity.method2663(true);
			} else {
				int i_207_ = Class78.packetStream.readUnsignedShort();
				int revision = Class78.packetStream.readInt();
				int widget = Class78.packetStream.readIntV2(i ^ 0x7d);
				if (Class38_Sub1_Sub1.method2771(i_207_, i - 32292)) {
					Class45.method305(string, widget, 3, revision);
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class59_Sub2.SEND_PROJECTILE_PACKET) {
			Class246_Sub1_Sub15.method2719(44, Class246_Sub30.SEND_PROJECTILE);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitLoader.GLOBAL_STRING_2_PACKET == IdentityKitType.INCOMING_PACKET) {
			int i_209_ = Class78.packetStream.readUnsignedShort128(952968608);
			String string = Class78.packetStream.readString((byte) -40);
			int i_210_ = Class78.packetStream.readUnsignedShort();
			if (Class38_Sub1_Sub1.method2771(i_210_, i ^ ~0x7e23))
				Class246_Sub1_Sub15.method2716(-113, string, i_209_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class68.aClass13_904 == IdentityKitType.INCOMING_PACKET) {
			int i_211_ = Class78.packetStream.readInt((byte) 106);
			int i_212_ = Class78.packetStream.readUnsignedShort();
			int i_213_ = Class78.packetStream.readUnsignedShortLE(i + 123);
			if (Class38_Sub1_Sub1.method2771(i_213_, -32291))
				Class7.method79(i_211_, i_212_, (byte) -71);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (MapRegion.DYNAMIC_MAP_REGION_PACKET == IdentityKitType.INCOMING_PACKET) {
			MapRegion.decode_dynamic_region(10094);
			IdentityKitType.INCOMING_PACKET = null;
			return false;
		}
		if (IdentityKitType.INCOMING_PACKET == Class130_Sub1.aClass13_3729) {
			int i_214_ = Class78.packetStream.readUnsignedShort();
			int i_215_ = Class78.packetStream.readIntV2(87);
			int i_216_ = Class78.packetStream.readUnsignedShort128(952968608);
			if (Class38_Sub1_Sub1.method2771(i_214_, -32291))
				Class59_Sub2.method2025(false, i_216_, i_215_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class125.aClass13_1756) {
			Class82.baseTileX = Class78.packetStream.read128Byte(128) << 3;
			Class106_Sub2.baseTileY = Class78.packetStream.readByte() << 3;
			Class60.basePlane = Class78.packetStream.readUnsignedByteC(-105);
			while ((Class130_Sub1_Sub1.anInt7046 ^ 0xffffffff) < (((Buffer) Class78.packetStream).position
					^ 0xffffffff)) {
				Class12 class12 = (Class255_Sub1.method2342(true)[Class78.packetStream.readUnsignedByte()]);
				Class246_Sub1_Sub15.method2719(i ^ 0x5a, class12);
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == EnumLoader.aClass13_2042) {
			Class246_Sub28_Sub13.anInt6293 = Class78.packetStream.readUnsignedByte();
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class240.aClass13_3388) {
			Class246_Sub1_Sub15.method2719(100, Class18.aClass12_259);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class82.aClass13_1070) {
			int i_217_ = Class78.packetStream.readUnsignedShort();
			if (Class38_Sub1_Sub1.method2771(i_217_, -32291))
				Class246_Sub28_Sub8.method2559(true);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Model.aClass13_1369 == IdentityKitType.INCOMING_PACKET) {
			int i_218_ = Class78.packetStream.method2398(i + 65535);
			int i_219_ = Class78.packetStream.readInt((byte) 85);
			int i_220_ = Class78.packetStream.method2398(i + 65535);
			int i_221_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			if (Class38_Sub1_Sub1.method2771(i_221_, -32291))
				Class187_Sub2.method2288(i_219_, i_220_, i_218_, -32509);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == ContextMenus.INDEX_14_SOUND_IN) {
			int i_222_ = Class78.packetStream.readUnsignedShort();
			if (i_222_ == 65535)
				i_222_ = -1;
			int i_223_ = Class78.packetStream.readUnsignedByte();
			int i_224_ = Class78.packetStream.readUnsignedShort();
			int i_225_ = Class78.packetStream.readUnsignedByte();
			Client.queue_sound_effect(i_222_, 0, i_223_, i_225_, i_224_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class34.aClass13_448) {
			Class246_Sub1_Sub15.method2719(101, Class233.aClass12_3185);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class180.aClass13_2523 == IdentityKitType.INCOMING_PACKET) {
			Class246_Sub1_Sub15.method2719(i ^ 0x7b, Class16.aClass12_238);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class20.aClass13_315 == IdentityKitType.INCOMING_PACKET) {
			int i_226_ = Class78.packetStream.readUnsignedShort();
			int i_227_ = Class78.packetStream.readUnsignedByte();
			int i_228_ = Class78.packetStream.readUnsignedByte();
			int i_229_ = Class78.packetStream.readUnsignedShort() << 0;
			int i_230_ = Class78.packetStream.readUnsignedByte();
			int i_231_ = Class78.packetStream.readUnsignedByte();
			if (Class38_Sub1_Sub1.method2771(i_226_, -32291))
				Class59_Sub2_Sub3.method2722(i_229_, true, i_231_, i_228_, true, i_227_, i_230_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Stream_Sub2.INDEX_15_SOUND_IN_PACKET) {
			int i_232_ = Class78.packetStream.readUnsignedShort();
			if ((i_232_ ^ 0xffffffff) == -65536)
				i_232_ = -1;
			int i_233_ = Class78.packetStream.readUnsignedByte();
			int i_234_ = Class78.packetStream.readUnsignedShort();
			int i_235_ = Class78.packetStream.readUnsignedByte();
			Tile.method994(i_233_, i_234_, false, i_232_, i_235_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Cursors.aClass13_2243) {
			Class246_Sub1_Sub15.method2719(122, SubIncomingPacket.SOME_PACKET);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class40_Sub3.aClass13_4058 == IdentityKitType.INCOMING_PACKET) {
			MouseHandler.method2003((byte) -30, false);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class38_Sub1.HIDE_INTERFACE_COMPONENT_IN == IdentityKitType.INCOMING_PACKET) {
			int hidden = Class78.packetStream.readUnsigned128Byte();
			int child = Class78.packetStream.readInt();
			int widget = Class78.packetStream.readInt();
			int i_238_ = Class78.packetStream.readUnsignedShort128(i + 952968607);
			try {
				if (Class38_Sub1_Sub1.method2771(i_238_, -32291)) {
					Class137.method927(hidden, widget << 16, (byte) -109);
					Widget.widgets[widget][child].hidden = hidden > 0;
				}
			} catch (Exception e) { // just shit u gotta deal with when adding new packets out the blue
				e.printStackTrace();
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}

		if (Class38_Sub1.SET_INTERFACE_SPRITE_IN == IdentityKitType.INCOMING_PACKET) {
			int sprite = Class78.packetStream.readInt();
			int child = Class78.packetStream.readInt();
			int widget = Class78.packetStream.readInt();
			int i_238_ = Class78.packetStream.readUnsignedShort128(i + 952968607);
			if (Class38_Sub1_Sub1.method2771(i_238_, -32291)) {
				try {
					Widget.widgets[widget][child].disabled_sprite = sprite;
				} catch (Exception e) { // just shit u gotta deal with when adding new packets out the blue
					e.printStackTrace();
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class38_Sub1.SET_WIDGET_HEIGHT_IN == IdentityKitType.INCOMING_PACKET) {
			int height = Class78.packetStream.readInt();
			int child = Class78.packetStream.readInt();
			int widget = Class78.packetStream.readInt();
			int i_238_ = Class78.packetStream.readUnsignedShort128(i + 952968607);
			try {
				if (Class38_Sub1_Sub1.method2771(i_238_, -32291)) {
					Widget.widgets[widget][child].original_height = height;
					Widget.widgets[widget][child].dynamic_height = height;
					Widget.widgets[widget][child].forced_height = height;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (MapScenes.aClass13_3636 == IdentityKitType.INCOMING_PACKET) {
			String string = Class78.packetStream.readString((byte) -40);
			boolean bool = Class78.packetStream.readUnsignedByte() == 1;
			String string_239_;
			if (!bool)
				string_239_ = string;
			else
				string_239_ = Class78.packetStream.readString((byte) -40);
			int i_240_ = Class78.packetStream.readUnsignedShort();
			byte i_241_ = Class78.packetStream.readByte();
			boolean bool_242_ = false;
			if ((i_241_ ^ 0xffffffff) == 127)
				bool_242_ = true;
			if (!bool_242_) {
				String string_243_ = Class78.packetStream.readString((byte) -40);
				Class9 class9 = new Class9();
				((Class9) class9).name = string;
				((Class9) class9).aString109 = string_239_;
				((Class9) class9).aString108 = Class64.method424(((Class9) class9).aString109, (byte) -47);
				((Class9) class9).rank = i_241_;
				((Class9) class9).world = i_240_;
				((Class9) class9).aString105 = string_243_;
				int i_244_;
				for (i_244_ = -1 + Clan.clanMembersAmount; i_244_ >= 0; i_244_--) {
					int i_245_ = ((Class9) Clan.clanMembers[i_244_]).aString108.compareTo(((Class9) class9).aString108);
					if ((i_245_ ^ 0xffffffff) == -1) {
						((Class9) Clan.clanMembers[i_244_]).world = i_240_;
						((Class9) Clan.clanMembers[i_244_]).rank = i_241_;
						((Class9) Clan.clanMembers[i_244_]).aString105 = string_243_;
						if (string_239_.equals(((Player) Client.local_player).aString7140))
							Class86.aByte1136 = i_241_;
						Class214.anInt2991 = Client.cycleCntr;
						IdentityKitType.INCOMING_PACKET = null;
						return true;
					}
					if ((i_245_ ^ 0xffffffff) > -1)
						break;
				}
				if (Clan.clanMembers == null) {
					IdentityKitType.INCOMING_PACKET = null;
					return true;
				}
				if (Clan.clanMembersAmount >= Clan.clanMembers.length) {
					IdentityKitType.INCOMING_PACKET = null;
					return true;
				}
				for (int i_246_ = Clan.clanMembersAmount - 1; (i_244_ ^ 0xffffffff) > (i_246_ ^ 0xffffffff); i_246_--)
					Clan.clanMembers[i_246_ + 1] = Clan.clanMembers[i_246_];
				if ((Clan.clanMembersAmount ^ 0xffffffff) == -1)
					Clan.clanMembers = new Class9[100];
				Clan.clanMembers[i_244_ + 1] = class9;
				Clan.clanMembersAmount++;
				if (string_239_.equals(((Player) Client.local_player).aString7140))
					Class86.aByte1136 = i_241_;
			} else {
				if ((Clan.clanMembersAmount ^ 0xffffffff) == -1) {
					IdentityKitType.INCOMING_PACKET = null;
					return true;
				}
				boolean bool_247_ = false;
				int i_248_;
				for (i_248_ = 0; Clan.clanMembersAmount > i_248_; i_248_++) {
					if (((Class9) Clan.clanMembers[i_248_]).aString109.equals(string_239_)
							&& ((((Class9) Clan.clanMembers[i_248_]).world) ^ 0xffffffff) == (i_240_ ^ 0xffffffff))
						break;
				}
				if ((i_248_ ^ 0xffffffff) > (Clan.clanMembersAmount ^ 0xffffffff)) {
					for (/**/; ((i_248_ ^ 0xffffffff) > (-1 + Clan.clanMembersAmount ^ 0xffffffff)); i_248_++)
						Clan.clanMembers[i_248_] = Clan.clanMembers[i_248_ + 1];
					Clan.clanMembersAmount--;
					Clan.clanMembers[Clan.clanMembersAmount] = null;
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			Class214.anInt2991 = Client.cycleCntr;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class_a.DESTROY_WORLD_OBJECT_PACKET) {
			Class246_Sub1_Sub15.method2719(125, Class228.DESTROY_WORLD_OBJECT);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class246_Sub19.aClass13_4708) {
			Class246_Sub1_Sub15.method2719(83, Class96.aClass12_1256);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class115.aClass13_1602 == IdentityKitType.INCOMING_PACKET) {
			int i_249_ = Class78.packetStream.readUnsignedShort();
			if (i_249_ == 65535)
				i_249_ = -1;
			int i_250_ = Class78.packetStream.readUnsignedShort128(952968608);
			int i_251_ = Class78.packetStream.readIntLE(55);
			int i_252_ = Class78.packetStream.readUnsignedShortLE(126);
			int i_253_ = Class78.packetStream.readUnsignedShort();
			if ((i_253_ ^ 0xffffffff) == -65536)
				i_253_ = -1;
			if (Class38_Sub1_Sub1.method2771(i_250_, i - 32292)) {
				for (int i_254_ = i_253_; i_249_ >= i_254_; i_254_++) {
					long l = ((long) i_251_ << 32) - -(long) i_254_;
					ClickMaskNode class246_sub27 = ((ClickMaskNode) Widget.get_widget_flags(634).get(l));
					ClickMaskNode class246_sub27_255_;
					if (class246_sub27 != null) {
						class246_sub27_255_ = new ClickMaskNode((((ClickMaskNode) class246_sub27).anInt4893), i_252_);
						class246_sub27.remove();
					} else if ((i_254_ ^ 0xffffffff) != 0)
						class246_sub27_255_ = new ClickMaskNode(0, i_252_);
					else
						class246_sub27_255_ = (new ClickMaskNode(
								((ClickMaskNode) (((Widget) Widget.get_widget(i_251_, 634)).click_mask)).anInt4893,
								i_252_));
					Widget.get_widget_flags(634).method547(l, -2301, class246_sub27_255_);
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class213.GLOBAL_STRING_1_PACKET) {
			int i_256_ = Class78.packetStream.readUnsignedShort128(952968608);
			String string = Class78.packetStream.readString((byte) -40);
			int i_257_ = Class78.packetStream.readUnsignedShort128(i + 952968607);
			if (Class38_Sub1_Sub1.method2771(i_256_, -32291))
				Class246_Sub1_Sub15.method2716(122, string, i_257_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class149.aClass13_2190 == IdentityKitType.INCOMING_PACKET) {
			Class250.method1603((byte) -69, Class78.packetStream.readString((byte) -40));
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class109.aClass13_1549 == IdentityKitType.INCOMING_PACKET) {
			Class60.basePlane = Class78.packetStream.readUnsignedByteC(-86);
			Class82.baseTileX = Class78.packetStream.read128Byte(128) << 3;
			Class106_Sub2.baseTileY = Class78.packetStream.readByteC(0) << 3;
			for (Class246_Sub13 class246_sub13 = ((Class246_Sub13) Class251.aClass85_3551.first(
					(byte) -23)); class246_sub13 != null; class246_sub13 = ((Class246_Sub13) Class251.aClass85_3551
							.next((byte) -20))) {
				int i_258_ = (int) (((Node) class246_sub13).hash & 0x3fffL);
				int i_259_ = (int) (((Node) class246_sub13).hash >> 14 & 0x3fffL);
				int i_260_ = (int) (((Node) class246_sub13).hash >> 28 & 0x3L);
				if ((i_260_ ^ 0xffffffff) == (Class60.basePlane ^ 0xffffffff) && i_258_ >= Class82.baseTileX
						&& ((8 + Class82.baseTileX ^ 0xffffffff) < (i_258_ ^ 0xffffffff))
						&& ((Class106_Sub2.baseTileY ^ 0xffffffff) >= (i_259_ ^ 0xffffffff))
						&& Class106_Sub2.baseTileY + 8 > i_259_) {
					class246_sub13.remove();
					MapScenes.method1645(Class60.basePlane, 1546660647, i_258_, i_259_);
				}
			}
			for (Class246_Sub6 class246_sub6 = ((Class246_Sub6) InvTypeLoader.aClass166_846.method1104(
					38)); class246_sub6 != null; class246_sub6 = ((Class246_Sub6) InvTypeLoader.aClass166_846
							.method1108((byte) -112))) {
				if (((Class82.baseTileX ^ 0xffffffff) >= (((Class246_Sub6) class246_sub6).anInt3928 ^ 0xffffffff))
						&& ((Class82.baseTileX + 8 ^ 0xffffffff) < (((Class246_Sub6) class246_sub6).anInt3928
								^ 0xffffffff))
						&& (((Class246_Sub6) class246_sub6).anInt3925 >= Class106_Sub2.baseTileY)
						&& ((8 + Class106_Sub2.baseTileY ^ 0xffffffff) < (((Class246_Sub6) class246_sub6).anInt3925
								^ 0xffffffff))
						&& (Class60.basePlane == ((Class246_Sub6) class246_sub6).anInt3936))
					((Class246_Sub6) class246_sub6).anInt3931 = 0;
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == StructLoader.aClass13_801) {
			int i_261_ = Class78.packetStream.readIntLE(111);
			int i_262_ = Class78.packetStream.readUnsignedShort();
			int i_263_ = Class78.packetStream.readUnsignedShort128(952968608);
			if (i_263_ == 65535)
				i_263_ = -1;
			if (Class38_Sub1_Sub1.method2771(i_262_, i - 32292))
				Class31.method232(2, -73, i_261_, i_263_, -1);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class188_Sub1.aClass13_3923 == IdentityKitType.INCOMING_PACKET) {
			int type = Class78.packetStream.readSmart((byte) 99);
			int i_265_ = Class78.packetStream.readInt((byte) 98);
			int i_266_ = Class78.packetStream.readUnsignedByte();
			String string = "";
			String string_267_ = string;
			if ((i_266_ & 0x1) != 0) {
				string = Class78.packetStream.readString((byte) -40);
				if ((i_266_ & 0x2) != 0)
					string_267_ = Class78.packetStream.readString((byte) -40);
				else
					string_267_ = string;
			}
			String string_268_ = Class78.packetStream.readString((byte) -40);
			if (type == 99)
				Class252.printConsoleMessage(i + 121, string_268_);
			else {
				if (!string_267_.equals("") && Class129.method881(string_267_, false)) {
					IdentityKitType.INCOMING_PACKET = null;
					return true;
				}
				MultilingualString.method437(i_265_, type, string_268_, string, string_267_, true);
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class205.aClass13_2884) {
			Widget.method1503(i + 7);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class246_Sub35.aClass13_5159 == IdentityKitType.INCOMING_PACKET) {
			Class246_Sub1_Sub15.method2719(89, StructLoader.aClass12_809);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class121.CLOSE_INTERFACES_IN) {
			int i_269_ = Class78.packetStream.readUnsignedShort();
			int i_270_ = Class78.packetStream.readInt((byte) 81);
			if (Class38_Sub1_Sub1.method2771(i_269_, -32291)) {
				WidgetParent class246_sub40 = (WidgetParent) Widget.get_widget_parents(634).get((long) i_270_);
				if (class246_sub40 != null)
					Widget.close_widget(true, class246_sub40, false, i - 83, 634, "here6");
				if (Client.meslayerContinueWidget != null) {
					Widget.redraw_widget(Client.meslayerContinueWidget);
					Client.meslayerContinueWidget = null;
				}
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == StructType.aClass13_6858) {
			int i_271_ = Class78.packetStream.readUnsignedByteC(-108);
			int i_272_ = i_271_ >> 2;
			int i_273_ = 0x3 & i_271_;
			int i_274_ = Class246_Sub19.anIntArray4712[i_272_];
			int i_275_ = Class78.packetStream.readIntLE(83);
			int i_276_ = i_275_ >> 28 & 0x3;
			int i_277_ = (0xfffe770 & i_275_) >> 14;
			int i_278_ = 0x3fff & i_275_;
			int i_279_ = Class78.packetStream.readUnsignedShortLE(i + 115);
			i_278_ -= Client.base_y;
			if ((i_279_ ^ 0xffffffff) == -65536)
				i_279_ = -1;
			i_277_ -= Client.base_x;
			Class246_Sub32.method2166(i_276_, i_273_, (byte) 119, i_279_, i_274_, i_272_, i_277_, i_278_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (ClickMaskNode.SEND_CAMERA_SHAKE_PACKET == IdentityKitType.INCOMING_PACKET) {
			int i_280_ = Class78.packetStream.readUnsignedShort();
			int slot = Class78.packetStream.readUnsignedByte();
			int i_282_ = Class78.packetStream.readUnsignedByte();
			int i_283_ = Class78.packetStream.readUnsignedByte();
			int i_284_ = Class78.packetStream.readUnsignedByte();
			int i_285_ = Class78.packetStream.readUnsignedShort();
			if (Class38_Sub1_Sub1.method2771(i_280_, -32291)) {
				Class246_Sub28_Sub29.aBoolArray6817[slot] = true;
				Class56.anIntArray795[slot] = i_282_;
				Class59_Sub5_Sub1.anIntArray5827[slot] = i_283_;
				Class35.anIntArray481[slot] = i_284_;
				Class259_Sub3.anIntArray5358[slot] = i_285_;
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class112.REMOVE_GROUND_ITEMS_PACKET) {
			Class246_Sub1_Sub15.method2719(i ^ 0x4f, Material.REMOVE_GROUND_ITEM);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class223.aClass13_3076) {
			Class91.walk_here = ((Class130_Sub1_Sub1.anInt7046 ^ 0xffffffff) < -3
					? Class78.packetStream.readString((byte) -40)
					: Class246_Sub28_Sub14.WALK_HERE_MS.get(Preferences.language_code));
			Class246_Sub28_Sub20.anInt6572 = (Class130_Sub1_Sub1.anInt7046 > 0
					? Class78.packetStream.readUnsignedShort()
					: -1);
			IdentityKitType.INCOMING_PACKET = null;
			if (Class246_Sub28_Sub20.anInt6572 == 65535)
				Class246_Sub28_Sub20.anInt6572 = -1;
			return true;
		}
		if (Cursors.aClass13_2238 == IdentityKitType.INCOMING_PACKET) {
			int i_286_ = Class78.packetStream.readInt((byte) 124);
			Class246_Sub28_Sub19.aClass182_6548 = Client.sign_link.method355((byte) 122, i_286_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class246_Sub43.aClass13_5601 == IdentityKitType.INCOMING_PACKET) {
			Client.private_chat_mode = Class1.method36(0, Class78.packetStream.readUnsignedByte());
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (MapFunctions.aClass13_2338 == IdentityKitType.INCOMING_PACKET) {
			Class246_Sub1_Sub7.method2549(Class78.packetStream, Class130_Sub1_Sub1.anInt7046, Client.sign_link,
					i - 12509);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == TextureOperation.GLOBAL_CONFIG_BYTE) {
			int i_287_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			int i_288_ = Class78.packetStream.readUnsignedShort();
			byte i_289_ = Class78.packetStream.read128Byte(i + 127);
			if (Class38_Sub1_Sub1.method2771(i_287_, i ^ ~0x7e23))
				Class173.method1141(1, i_288_, i_289_);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class40_Sub1.aClass13_3781 == IdentityKitType.INCOMING_PACKET) {
			((Buffer) Class78.packetStream).position += 28;
			if (Class78.packetStream.method2363(true))
				Class83.method527(Class78.packetStream, i - 114, -28 + ((Buffer) Class78.packetStream).position);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class_u.aClass13_4700 == IdentityKitType.INCOMING_PACKET) {
			int i_290_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			int i_291_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			int i_292_ = Class78.packetStream.readInt((byte) 126);
			int i_293_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			if (Class38_Sub1_Sub1.method2771(i_290_, i - 32292))
				Class100_Sub1.method2178(72, i_292_, i_291_ + (i_293_ << 16));
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Class60.aClass13_831) {
			Class246_Sub1_Sub15.method2719(89, Class81.aClass12_1066);
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (IdentityKitType.INCOMING_PACKET == Canvas_Sub1.aClass13_6890) {
			int i_294_ = Class78.packetStream.readIntLE(i ^ 0x3c);
			int i_295_ = Class78.packetStream.readIntV2(118);
			int i_296_ = Class78.packetStream.readUnsignedShortLE(118);
			if (Class38_Sub1_Sub1.method2771(i_296_, i ^ ~0x7e23)) {
				WidgetParent class246_sub40 = ((WidgetParent) Widget.get_widget_parents(634).get((long) i_295_));
				WidgetParent class246_sub40_297_ = (WidgetParent) Widget.get_widget_parents(634).get((long) i_294_);
				if (class246_sub40_297_ != null)
					Widget.close_widget((class246_sub40 == null
							|| (((WidgetParent) class246_sub40_297_).anInt5517 != ((WidgetParent) class246_sub40).anInt5517)),
							class246_sub40_297_, false, -36, 634, "here7");
				if (class246_sub40 != null) {
					class246_sub40.remove();
					Widget.get_widget_parents(634).method547((long) i_294_, -2301, class246_sub40);
				}
				Widget class235 = Widget.get_widget(i_295_, 634);
				if (class235 != null)
					Widget.redraw_widget(class235);
				class235 = Widget.get_widget(i_294_, 634);
				if (class235 != null) {
					Widget.redraw_widget(class235);
					Widget.update_layer(class235, i ^ ~0x1, true);
				}
				if ((Widget.root_interface ^ 0xffffffff) != 0)
					SwitchInt.method2180(Widget.root_interface, -1, 1, 634);
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		if (Class245.RECEIVE_FRIEND_CHAT_MESSAGE_PACKET == IdentityKitType.INCOMING_PACKET) {
			boolean bool = Class78.packetStream.readUnsignedByte() == 1;
			String string = Class78.packetStream.readString((byte) -40);
			String string_298_ = string;
			if (bool)
				string_298_ = Class78.packetStream.readString((byte) -40);
			long l = Class78.packetStream.method2364(true);
			long l_299_ = (long) Class78.packetStream.readUnsignedShort();
			long l_300_ = (long) Class78.packetStream.read24BitInteger((byte) 29);
			int i_301_ = Class78.packetStream.readUnsignedByte();
			long l_302_ = (l_299_ << 32) - -l_300_;
			boolean bool_303_ = false;
			while_3_: do {
				for (int i_304_ = 0; i_304_ < 100; i_304_++) {
					if (l_302_ == Class246_Sub1_Sub16.aLongArray6694[i_304_]) {
						bool_303_ = true;
						break while_3_;
					}
				}
				if ((i_301_ ^ 0xffffffff) >= -2) {
					if (Class59.aBool820 && !Class_u.aBool4703 || Class168.aBool2395)
						bool_303_ = true;
					else if (Class129.method881(string_298_, false))
						bool_303_ = true;
				}
			} while (false);
			if (!bool_303_ && (Class37.anInt551 ^ 0xffffffff) == -1) {
				Class246_Sub1_Sub16.aLongArray6694[Class230.anInt3160] = l_302_;
				Class230.anInt3160 = (Class230.anInt3160 + 1) % 100;
				String string_305_ = (Class59_Sub3_Sub1.method2443(MapFunction.method940(false, Class78.packetStream),
						(byte) 77));
				if ((i_301_ ^ 0xffffffff) != -3 && (i_301_ ^ 0xffffffff) != -4) {
					if ((i_301_ ^ 0xffffffff) == -2)
						Class241.method1545((byte) 110, -1, "<img=0>" + string_298_, string_305_,
								Class20.method194(l, i - 98), 0, "<img=0>" + string, 9);
					else
						Class241.method1545((byte) 92, -1, string_298_, string_305_, Class20.method194(l, i - 77), 0,
								string, 9);
				} else
					Class241.method1545((byte) 117, -1, "<img=1>" + string_298_, string_305_,
							Class20.method194(l, -113), 0, "<img=1>" + string, 9);
			}
			IdentityKitType.INCOMING_PACKET = null;
			return true;
		}
		Class194_Sub1.method1883(null, ("T1 - "
				+ (IdentityKitType.INCOMING_PACKET == null ? -1 : IdentityKitType.INCOMING_PACKET.method142(i ^ ~0x71))
				+ ","
				+ (Class259_Sub2_Sub1.aClass13_6907 != null ? Class259_Sub2_Sub1.aClass13_6907.method142(-116) : -1)
				+ "," + (Class173.aClass13_2438 == null ? -1 : Class173.aClass13_2438.method142(-96)) + " - "
				+ Class130_Sub1_Sub1.anInt7046), 96);
		RenderAnimation.logout(2700);
		return true;
	}

	static final void method180(int i) {
		do {
			try {
				Class40_Sub8.aClass54_5195.method369(false);
				anInt278++;
				if (i == -1)
					break;
				aLong273 = 85L;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "is.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method181(boolean bool) {
		do {
			try {
				((PacketsDecoder) this).anInt274 = (((PacketsDecoder) this).anInt274 << 8
						| ((PacketsDecoder) this).anInt288);
				anInt282++;
				if (((PacketsDecoder) this).anInt276 == -1)
					((PacketsDecoder) this).anInt276 = ((PacketsDecoder) this).anInt279;
				if (bool == false)
					break;
				method181(false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "is.D(" + bool + ')');
			}
			break;
		} while (false);
	}

	private final void process_op(int i, Buffer stream, int i_306_) {
		try {
			anInt270++;
			if (i <= 34)
				method183((byte) 50, -64);
			if (i_306_ != 1) {
				if ((i_306_ ^ 0xffffffff) == -3)
					((PacketsDecoder) this).anInt279 = stream.readUnsignedByte();
				else if ((i_306_ ^ 0xffffffff) != -4) {
					if ((i_306_ ^ 0xffffffff) == -6)
						((PacketsDecoder) this).aBool290 = false;
					else if ((i_306_ ^ 0xffffffff) != -8) {
						if (i_306_ == 8)
							((UnderlayLoader) ((PacketsDecoder) this).aClass105_272).anInt1467 = ((PacketsDecoder) this).anInt288;
						else if (i_306_ != 9) {
							if (i_306_ == 10)
								((PacketsDecoder) this).aBool283 = false;
							else if ((i_306_ ^ 0xffffffff) != -12) {
								if (i_306_ != 12) {
									if (i_306_ == 13)
										((PacketsDecoder) this).anInt277 = stream.read24BitInteger((byte) 29);
									else {
										do {
											if ((i_306_ ^ 0xffffffff) != -15) {
												if (i_306_ != 15) {
													if ((i_306_ ^ 0xffffffff) == -17)
														((PacketsDecoder) this).anInt287 = (stream.readUnsignedByte());
												} else {
													((PacketsDecoder) this).anInt276 = (stream.readUnsignedShort());
													if ((((PacketsDecoder) this).anInt276) != 65535)
														break;
													((PacketsDecoder) this).anInt276 = -1;
												}
												break;
											}
											((PacketsDecoder) this).anInt286 = stream.readUnsignedByte();
										} while (false);
									}
								} else
									((PacketsDecoder) this).blend = true;
							} else
								((PacketsDecoder) this).anInt274 = stream.readUnsignedByte();
						} else
							((PacketsDecoder) this).anInt275 = stream.readUnsignedShort() << 0;
					} else
						((PacketsDecoder) this).anInt271 = Font.method797(116, stream.read24BitInteger((byte) 29));
				} else {
					((PacketsDecoder) this).anInt279 = stream.readUnsignedShort();
					if (((PacketsDecoder) this).anInt279 == 65535)
						((PacketsDecoder) this).anInt279 = -1;
				}
			} else
				((PacketsDecoder) this).anInt284 = Font.method797(117, stream.read24BitInteger((byte) 29));
			((PacketsDecoder) this).blend = true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("is.G(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_306_ + ')'));
		}
	}

	static final int method183(byte i, int i_307_) {
		try {
			if (i != -86)
				aLong273 = -59L;
			anInt285++;
			return i_307_ & 0x7f;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "is.E(" + i + ',' + i_307_ + ')');
		}
	}

	static int method184(int i, int i_308_) {
		try {
			return i & i_308_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "is.C(" + i + ',' + i_308_ + ')');
		}
	}

	final void decode(int i, Buffer stream) {
		do {
			try {
				for (;;) {
					int i_309_ = stream.readUnsignedByte();
					if (i_309_ == 0)
						break;
					process_op(50, stream, i_309_);
				}
				anInt289++;
				if (i < -38)
					break;
				decode(-76, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("is.A(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public PacketsDecoder() {
		((PacketsDecoder) this).anInt276 = -1;
		((PacketsDecoder) this).anInt279 = -1;
		((PacketsDecoder) this).anInt284 = 0;
		((PacketsDecoder) this).anInt275 = 128;
		((PacketsDecoder) this).anInt277 = 1190717;
		((PacketsDecoder) this).aBool290 = true;
		((PacketsDecoder) this).anInt287 = 127;
		((PacketsDecoder) this).anInt271 = -1;
		((PacketsDecoder) this).anInt286 = 16;
	}
}
