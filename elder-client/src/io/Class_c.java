package io;

abstract class Class_c {
	static int anInt1191;
	static int anInt1192;
	static VarcLoader varc_loader;
	static int anInt1195;

	public Class_c() {
		/* empty */
	}

	abstract void p(int i, int i_0_, int i_1_, int[] is);

	abstract void N(int i);

	abstract void xa();

	abstract void m(int[] is);

	abstract void ra(int i);

	abstract void j(int i, int i_2_, int i_3_);

	abstract Class_c method582();

	abstract void ja(int i);

	abstract void za(Class_c class_c_4_);

	abstract void ka(int i);

	static final void method583(boolean bool, int i, Widget class235, int i_5_, int i_6_) {
		do {
			try {
				anInt1191++;
				int i_7_ = ((Widget) class235).screen_width;
				if ((((Widget) class235).horizontal_alignment ^ 0xffffffff) == -1) {
					((Widget) class235).screen_width = ((Widget) class235).original_width;
				} else if ((((Widget) class235).horizontal_alignment ^ 0xffffffff) == -2)
					((Widget) class235).screen_width = i + -((Widget) class235).original_width;
				else if ((((Widget) class235).horizontal_alignment ^ 0xffffffff) == -3)
					((Widget) class235).screen_width = ((Widget) class235).original_width * i >> 14;
				int i_8_ = ((Widget) class235).screen_height;
				int i_9_ = 4 % ((-13 - i_5_) / 45);
				if (((Widget) class235).vertical_alignment == 0)
					((Widget) class235).screen_height = ((Widget) class235).original_height;
				else if (((Widget) class235).vertical_alignment == 1)
					((Widget) class235).screen_height = -((Widget) class235).original_height + i_6_;
				else if (((Widget) class235).vertical_alignment == 2)
					((Widget) class235).screen_height = ((Widget) class235).original_height * i_6_ >> 14;
				if (((Widget) class235).horizontal_alignment == 4)
					((Widget) class235).screen_width = (((Widget) class235).anInt3200
							* ((Widget) class235).screen_height / ((Widget) class235).f_cd);
				if (((Widget) class235).vertical_alignment == 4)
					((Widget) class235).screen_height = (((Widget) class235).f_cd * ((Widget) class235).screen_width
							/ ((Widget) class235).anInt3200);
				if (RenderSequenceLoader.aBool1452
						&& (((((ClickMaskNode) Widget.get_active_properties(class235)).anInt4893) ^ 0xffffffff) != -1
								|| ((Widget) class235).type == 0)) {
					if ((((Widget) class235).screen_height ^ 0xffffffff) > -6
							&& (((Widget) class235).screen_width ^ 0xffffffff) > -6) {
						((Widget) class235).screen_height = 5;
						((Widget) class235).screen_width = 5;
					} else {
						if ((((Widget) class235).screen_height ^ 0xffffffff) >= -1)
							((Widget) class235).screen_height = 5;
						if ((((Widget) class235).screen_width ^ 0xffffffff) >= -1)
							((Widget) class235).screen_width = 5;
					}
				}
				if (((Widget) class235).content_type == Class246_Sub1_Sub3.anInt5719)
					Class104.f_vb = class235;
				if (!bool || ((Widget) class235).on_resize_listener == null)
					break;
				if ((i_7_ ^ 0xffffffff) != (((Widget) class235).screen_width ^ 0xffffffff)
						|| (i_8_ ^ 0xffffffff) != (((Widget) class235).screen_height ^ 0xffffffff)) {
					ScriptEvent script_event = new ScriptEvent();
					script_event.source = class235;
					script_event.params = class235.on_resize_listener;
					Client.low_priority_script_events.push_head(script_event);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("c.C(" + bool + ',' + i + ','
						+ (class235 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method584(boolean bool) {
		try {
			varc_loader = null;
			if (bool != false)
				anInt1195 = 60;
			MapRegion.DYNAMIC_MAP_REGION_PACKET = null;
			TitleScreen.loaded_core_fonts_ms = null;
			FontCache.small_font = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "c.D(" + bool + ')');
		}
	}

	abstract void O(int i);

	abstract void method585(int i, int i_10_, int i_11_, int[] is);

	abstract void s(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_);

	abstract void o(int i, int i_17_, int i_18_);
}
