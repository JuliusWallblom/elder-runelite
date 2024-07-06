package io;

public final class Class_a {
	static int anInt1173;
	static int anInt1174;
	static Class138[][] aClass138ArrayArray1175;
	static int anInt1176;
	static int anInt1177;
	static IncomingPacket DESTROY_WORLD_OBJECT_PACKET = new IncomingPacket(45, 2);
	static int anInt1181 = 0;
	static boolean[][] aBoolArrayArray1182 = { new boolean[4], { false, true, true, false },
			{ true, false, true, false }, { true, false, true, false }, { false, false, true, false },
			{ false, false, true, false }, { true, false, true, false }, { true, false, false, true },
			{ true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true },
			new boolean[4] };

	static final void method572(int i) {
		try {
			anInt1173++;
			if (i != 0)
				method575(-95);
			for (Class246_Sub6 class246_sub6 = (Class246_Sub6) InvTypeLoader.aClass166_846.method1104(
					111); class246_sub6 != null; class246_sub6 = ((Class246_Sub6) InvTypeLoader.aClass166_846
							.method1108((byte) -112))) {
				if ((((Class246_Sub6) class246_sub6).anInt3931 ^ 0xffffffff) != 0)
					class246_sub6.remove();
				else {
					((Class246_Sub6) class246_sub6).anInt3934 = 0;
					if ((((Class246_Sub6) class246_sub6).anInt3928 ^ 0xffffffff) <= -1
							&& (((Class246_Sub6) class246_sub6).anInt3925 ^ 0xffffffff) <= -1
							&& ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (((Class246_Sub6) class246_sub6).anInt3928
									^ 0xffffffff))
							&& (Class152.anInt2205 > ((Class246_Sub6) class246_sub6).anInt3925))
						Class9.method82(22, class246_sub6);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "a.E(" + i + ')');
		}
	}

	static final void method573(boolean bool, int i) {
		do {
			try {
				Class59_Sub3_Sub3.aClass54_6277.method380(i, -50);
				anInt1177++;
				if (bool == true)
					break;
				method572(122);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "a.D(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final void method574(int i) {
		try {
			Widget.redraw_widget(Class150.aClass235_2196);
			anInt1176++;
			SequenceLoader.anInt6734++;
			if (!Class64_Sub1.aBool5240 || !Class259_Sub3.aBool5355) {
				if (SequenceLoader.anInt6734 > 1)
					Class150.aClass235_2196 = null;
			} else {
				if (i >= -75)
					method573(true, -33);
				int i_0_ = Material.aClass102_3360.method640((byte) 58);
				int i_1_ = Material.aClass102_3360.method636(3045);
				i_0_ -= Class99.anInt1292;
				i_1_ -= Class246_Sub43.anInt5605;
				if (i_0_ < SceneGraph.anInt3722)
					i_0_ = SceneGraph.anInt3722;
				if (((((Widget) Class33.aClass235_445).screen_width + SceneGraph.anInt3722)
						^ 0xffffffff) > (i_0_ + ((Widget) Class150.aClass235_2196).screen_width ^ 0xffffffff))
					i_0_ = (-((Widget) Class150.aClass235_2196).screen_width
							+ (SceneGraph.anInt3722 + ((Widget) Class33.aClass235_445).screen_width));
				if ((Class208.anInt2937 ^ 0xffffffff) < (i_1_ ^ 0xffffffff))
					i_1_ = Class208.anInt2937;
				if ((i_1_ - -((Widget) Class150.aClass235_2196).screen_height
						^ 0xffffffff) < ((((Widget) Class33.aClass235_445).screen_height + Class208.anInt2937)
								^ 0xffffffff))
					i_1_ = (Class208.anInt2937 + ((Widget) Class33.aClass235_445).screen_height
							- ((Widget) Class150.aClass235_2196).screen_height);
				int i_2_ = i_0_ + (-SceneGraph.anInt3722 + ((Widget) Class33.aClass235_445).horizontal_scroll_position);
				int i_3_ = (((Widget) Class33.aClass235_445).vertical_scroll_position + (-Class208.anInt2937 + i_1_));
				if (Material.aClass102_3360.method634(114)) {
					if (SequenceLoader.anInt6734 > ((Widget) Class150.aClass235_2196).drag_threshhold) {
						int i_4_ = i_0_ - Class134.anInt1873;
						int i_5_ = -Class259_Sub3_Sub1.anInt6903 + i_1_;
						if ((((Widget) Class150.aClass235_2196).drag_zone_size < i_4_)
								|| (-((Widget) Class150.aClass235_2196).drag_zone_size > i_4_)
								|| (((Widget) Class150.aClass235_2196).drag_zone_size ^ 0xffffffff) > (i_5_
										^ 0xffffffff)
								|| ((i_5_ ^ 0xffffffff) > (-(((Widget) Class150.aClass235_2196).drag_zone_size)
										^ 0xffffffff)))
							Class246_Sub1_Sub2.aBool5698 = true;
					}
					if ((((Widget) Class150.aClass235_2196).on_drag_listener != null) && Class246_Sub1_Sub2.aBool5698) {
						ScriptEvent class246_sub29 = new ScriptEvent();
						((ScriptEvent) class246_sub29).params = (((Widget) Class150.aClass235_2196).on_drag_listener);
						((ScriptEvent) class246_sub29).mouse_x = i_2_;
						((ScriptEvent) class246_sub29).mouse_y = i_3_;
						((ScriptEvent) class246_sub29).source = Class150.aClass235_2196;
						ScriptExecutor.excute_script_event(class246_sub29, ((Widget) Class150.aClass235_2196));
					}
				} else {
					if (!Class246_Sub1_Sub2.aBool5698) {
						if ((Class59_Sub3_Sub2.anInt5889 != 1 && !Class84.method535((byte) -20))
								|| (Class230.anInt3147 ^ 0xffffffff) >= -3) {
							if (Class7.method77(128))
								Class55.method386(113, (Class99.anInt1292 - -Class134.anInt1873),
										(Class259_Sub3_Sub1.anInt6903 + (Class246_Sub43.anInt5605)));
						} else
							Class55.method386(-119, (Class99.anInt1292 + Class134.anInt1873),
									(Class259_Sub3_Sub1.anInt6903 + Class246_Sub43.anInt5605));
					} else {
						Class59_Sub4.method2209((byte) 120);
						if ((((Widget) Class150.aClass235_2196).on_drag_complete_listener) != null) {
							ScriptEvent class246_sub29 = new ScriptEvent();
							((ScriptEvent) class246_sub29).params = (((Widget) Class150.aClass235_2196).on_drag_complete_listener);
							((ScriptEvent) class246_sub29).mouse_y = i_3_;
							((ScriptEvent) class246_sub29).aClass235_4969 = Class_ls.aClass235_964;
							((ScriptEvent) class246_sub29).source = Class150.aClass235_2196;
							((ScriptEvent) class246_sub29).mouse_x = i_2_;
							ScriptExecutor.excute_script_event(class246_sub29, ((Widget) Class150.aClass235_2196));
						}
						if (Class_ls.aClass235_964 != null && (Client.method2977(Class150.aClass235_2196) != null))
							Class46.method312(Class150.aClass235_2196, true, Class_ls.aClass235_964);
					}
					Class150.aClass235_2196 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "a.B(" + i + ')');
		}
	}

	public static void method575(int i) {
		try {
			if (i != -14407)
				DESTROY_WORLD_OBJECT_PACKET = null;
			Client.local_player = null;
			DESTROY_WORLD_OBJECT_PACKET = null;
			aClass138ArrayArray1175 = null;
			aBoolArrayArray1182 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "a.C(" + i + ')');
		}
	}

	static final void method576(byte i) {
		try {
			OutgoingPacket.anInt2856++;
			anInt1174++;
			Class243.writePacket(-122, Npc.aClass201_7168);
			Class130_Sub1.stream.writeByte(255, Client.get_frame_mode((byte) -123));
			if (i >= 48) {
				Class130_Sub1.stream.writeShort((byte) 67, Client.client_width);
				Class130_Sub1.stream.writeShort((byte) 67, Client.client_height);
				Class130_Sub1.stream.writeByte(255, (((Renderer) Client.current_renderer).anInt588));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "a.A(" + i + ')');
		}
	}
}
