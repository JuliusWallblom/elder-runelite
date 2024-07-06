package io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import io.cache.Cache;
import io.cache.IndexConstants;
import io.cache.Revision;
import jagex3.jagmisc.jagmisc;

final class ScriptExecutor {

	private static int[] int_var_count;
	static int anInt2115;
	static int anInt2116;
	static int anInt2117;
	static int anInt2118;
	static int anInt2119;
	private static Class244 aClass244_2120;
	static int anInt2121;
	static int anInt2124;
	static boolean field818;
	static boolean field816;
	private static int[][] arrays;
	static int anInt2128;
	static int anInt2129;
	static int anInt2131;
	private static Calendar aCalendar2132;
	static int anInt2135;
	private static int[] array_lengths;
	private static String[] string_var_count;
	static HashMap aClass54_2139;
	private static int[] anIntArray2140;
	private static String[] aStringArray2141;
	static int script_io;

	public static boolean method4296(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16
				|| var0 == 17;
	}

	static final void run_script(ScriptEvent script_event, int allocation, int widget_id, int revision) {
		try {
			Object[] params = ((ScriptEvent) script_event).params;
			int script_id = ((Integer) params[0]).intValue();
			CS2Script script = ScriptExecutor.list(script_id, revision);
			if (script == null) {
				return;
			}
			CS2Script.int_stack_size = 0;
			CS2Script.string_stack_size = 0;
			SubScript.subscript_pos = 0;
			int_var_count = new int[script.int_var_count];
			string_var_count = new String[script.string_var_count];
			int int_param_index = 0;
			int string_param_index = 0;
			for (int id = 1; id < params.length; id++) {
				if (params[id] instanceof Integer) {
					int param = ((Integer) params[id]).intValue();
					if (param == -2147483647) {
						param = ((ScriptEvent) script_event).mouse_x;
					}
					if (param == -2147483646) {
						param = ((ScriptEvent) script_event).mouse_y;
					}
					if (param == -2147483645) {
						param = ((((ScriptEvent) script_event).source) != null
								? ((Widget) (((ScriptEvent) script_event).source)).hash
								: -1);
					}
					if (param == -2147483644) {
						param = ((ScriptEvent) script_event).anInt4972;
					}
					if (param == -2147483643) {
						param = ((((ScriptEvent) script_event).source) != null
								? ((Widget) (((ScriptEvent) script_event).source)).index
								: -1);
					}
					if (param == -2147483642) {
						param = ((((ScriptEvent) script_event).aClass235_4969) != null
								? ((Widget) (((ScriptEvent) script_event).aClass235_4969)).hash
								: -1);
					}
					if (param == -2147483641) {
						param = ((((ScriptEvent) script_event).aClass235_4969) != null
								? ((Widget) (((ScriptEvent) script_event).aClass235_4969)).index
								: -1);
					}
					if (param == -2147483640) {
						param = ((ScriptEvent) script_event).anInt4978;
					}
					if (param == -2147483639) {
						param = ((ScriptEvent) script_event).anInt4973;
					}
					int_var_count[int_param_index++] = param;
				} else if (params[id] instanceof String) {
					String string = (String) params[id];
					if (string.equals("event_opbase")) {
						string = ((ScriptEvent) script_event).aString4965;
					}
					string_var_count[string_param_index++] = string;
				}
			}
			script_io = ((ScriptEvent) script_event).script_io;
			execute_script(script, allocation, script_id, widget_id, revision);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static final String method981(int i) {
		long l = ((long) i + 11745L) * 86400000L;
		aCalendar2132.setTime(new Date(l));
		int i_5_ = aCalendar2132.get(5);
		int i_6_ = aCalendar2132.get(2);
		int i_7_ = aCalendar2132.get(1);
		return (String.valueOf(i_5_) + "-" + aStringArray2141[i_6_] + "-" + i_7_);
	}

	private static final void process_op(int opcode, boolean bool, int widget_id, int revision) {
		try {
			if (opcode < 300) {
				if (opcode == 100) {
					CS2Script.int_stack_size -= 3;
					int bit_packed = CS2Script.int_stack[CS2Script.int_stack_size];
					int type = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					int index = CS2Script.int_stack[CS2Script.int_stack_size + 2];
					if (type == 0) {
						throw new RuntimeException();
					}
					Widget widget = Widget.get_widget(bit_packed, revision);
					if (widget.components == null)
						widget.components = new Widget[index + 1];
					if (widget.components.length <= index) {
						Widget[] widget_children = new Widget[index + 1];
						for (int loop_index = 0; loop_index < widget.components.length; loop_index++) {
							widget_children[loop_index] = widget.components[loop_index];
						}
						widget.components = widget_children;
					}
					if (index > 0 && widget.components[index - 1] == null) {
						throw new RuntimeException();
					}
					// throw new RuntimeException("Gap at:" + (index - 1));
					Widget class235_12_ = new Widget();
					class235_12_.revision = revision;
					class235_12_.if3_format = true;
					((Widget) class235_12_).type = type;
					((Widget) class235_12_).parent_id = ((Widget) class235_12_).hash = widget.hash;
					((Widget) class235_12_).index = index;
					widget.components[index] = class235_12_;
					if (bool) {
						Widget.static_active_component1 = class235_12_;
					} else {
						Widget.static_active_component2 = class235_12_;
					}
					Widget.redraw_widget(widget);
					return;
				}
				if (opcode == 101) {
					Widget class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
					if (class235.index == -1) {
						if (bool)
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						throw new RuntimeException("Tried to cc_delete static active-component!");
					}
					Widget class235_13_ = Widget.get_widget(class235.hash, revision);
					((Widget) class235_13_).components[class235.index] = null;
					Widget.redraw_widget(class235_13_);
					return;
				}
				if (opcode == 102) {
					Widget class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
					class235.components = null;
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 200) {
					CS2Script.int_stack_size -= 2;
					int bitPacked = CS2Script.int_stack[CS2Script.int_stack_size];
					int componentIndex = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					Widget class235 = Widget.get_component(bitPacked, componentIndex, revision);
					if (class235 != null && componentIndex != -1) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
						if (bool)
							Widget.static_active_component1 = class235;
						else
							Widget.static_active_component2 = class235;
					} else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
						return;
					}
					return;
				}
				if (opcode == 201) {
					int i_16_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget class235 = Widget.get_widget(i_16_, revision);
					if (class235 != null) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
						if (bool)
							Widget.static_active_component1 = class235;
						else
							Widget.static_active_component2 = class235;
					} else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
						return;
					}
					return;
				}
				if (opcode == 202) {
					int i_17_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					method983(i_17_, revision);
					return;
				}
				if (opcode == 203) {
					int i_18_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					method984(i_18_, revision);
					return;
				}
			} else if (opcode < 500) {
				if (opcode == 403) {
					CS2Script.int_stack_size -= 2;
					int i_19_ = CS2Script.int_stack[CS2Script.int_stack_size];
					int i_20_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					for (int i_21_ = 0; i_21_ < HashMap.anIntArray779.length; i_21_++) {
						if (HashMap.anIntArray779[i_21_] == i_19_) {
							((Player) Client.local_player).appearance.method214(i_20_, Material.aClass92_3358,
									i_21_, 108);
							return;
						}
					}
					for (int i_22_ = 0; i_22_ < VarpType.anIntArray1227.length; i_22_++) {
						if (VarpType.anIntArray1227[i_22_] == i_19_) {
							((Player) Client.local_player).appearance.method214(i_20_, Material.aClass92_3358,
									i_22_, 111);
							break;
						}
					}
					return;
				}
				if (opcode == 404) {
					CS2Script.int_stack_size -= 2;
					int i_23_ = CS2Script.int_stack[CS2Script.int_stack_size];
					int i_24_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					((Player) Client.local_player).appearance.method220(i_23_, i_24_, (byte) 27);
					return;
				}
				if (opcode == 410) {
					boolean bool_25_ = CS2Script.int_stack[--CS2Script.int_stack_size] != 0;
					((Player) Client.local_player).appearance.method213(bool_25_, 15366);
					return;
				}
			} else if (opcode >= 1000 && opcode < 1100 || opcode >= 2000 && opcode < 2100) {
				Widget class235;
				if (opcode >= 2000) {
					opcode -= 1000;
					int some_val = CS2Script.int_stack[--CS2Script.int_stack_size];
					class235 = Widget.get_widget(some_val, revision);
				} else {
					class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
				}
				if (opcode == 1000) {
					CS2Script.int_stack_size -= 4;
					int some_val = CS2Script.int_stack[CS2Script.int_stack_size];
					int some_val_2 = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					int some_val_3 = CS2Script.int_stack[CS2Script.int_stack_size + 2];
					int some_val_4 = CS2Script.int_stack[CS2Script.int_stack_size + 3];
					if (class235 != null) {
						class235.original_x = some_val;
						class235.original_y = some_val_2;
						int i_26_ = some_val_3;
						int i_27_ = some_val_4;
						if (i_26_ < 0) {
							i_26_ = 0;
						} else if (i_26_ > 5) {
							i_26_ = 5;
						}
						if (i_27_ < 0) {
							i_27_ = 0;
						} else if (i_27_ > 5) {
							i_27_ = 5;
						}
						class235.alignment_x = (byte) i_26_;
						class235.alignment_y = (byte) i_27_;
						Widget.redraw_widget(class235);
						Widget.update_dynamic_components(class235);
						if (class235.index == -1)
							Widget.revalidate_widget_scroll(class235.hash, false);
					}
					return;
				}
				if (opcode == 1001) {
					CS2Script.int_stack_size -= 4;
					int some_val = CS2Script.int_stack[CS2Script.int_stack_size];
					int some_val_2 = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					int some_val_3 = CS2Script.int_stack[CS2Script.int_stack_size + 2];
					int some_val_4 = CS2Script.int_stack[CS2Script.int_stack_size + 3];
					if (class235 != null) {
						class235.original_width = some_val;
						class235.original_height = some_val_2;
						int i_28_ = some_val_3;
						int i_29_ = some_val_4;
						class235.dynamic_width = 0;
						class235.dynamic_height = 0;
						if (i_28_ < 0) {
							i_28_ = 0;
						} else if (i_28_ > 4) {
							i_28_ = 4;
						}
						if (i_29_ < 0) {
							i_29_ = 0;
						} else if (i_29_ > 4) {
							i_29_ = 4;
						}
						class235.horizontal_alignment = (byte) i_28_;
						class235.vertical_alignment = (byte) i_29_;
						Widget.redraw_widget(class235);
						Widget.update_dynamic_components(class235);
						if (class235.type == 0)
							Widget.update_layer(class235, -1, false);
					}
					return;
				}
				if (opcode == 1003) {
					boolean bool_30_ = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
					if (class235 == null) {
						return;
					}
					if (class235.hidden != bool_30_) {
						class235.hidden = bool_30_;
						Widget.redraw_widget(class235);
					}
					if (class235.index == -1)
						Class29.method228(class235.hash, true);
					return;
				}
				if (opcode == 1004) {
					CS2Script.int_stack_size -= 2;
					class235.anInt3200 = CS2Script.int_stack[CS2Script.int_stack_size];
					class235.f_cd = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					Widget.redraw_widget(class235);
					Widget.update_dynamic_components(class235);
					if (class235.type == 0)
						Widget.update_layer(class235, -1, false);
					return;
				}
				if (opcode == 1005) {
					class235.no_click_through = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
					return;
				}
			} else if (opcode >= 1100 && opcode < 1200 || opcode >= 2100 && opcode < 2200) {
				Widget class235;
				if (opcode >= 2000) {
					opcode -= 1000;
					class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
				} else {
					class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
				}
				class235.revision = revision;
				if (opcode == 1100) {
					CS2Script.int_stack_size -= 2;
					class235.horizontal_scroll_position = CS2Script.int_stack[CS2Script.int_stack_size];
					if (class235.horizontal_scroll_position > (class235.scroll_width - class235.screen_width))
						class235.horizontal_scroll_position = (class235.scroll_width - class235.screen_width);
					if (class235.horizontal_scroll_position < 0)
						class235.horizontal_scroll_position = 0;
					class235.vertical_scroll_position = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					if (class235.vertical_scroll_position > (class235.scroll_height - class235.screen_height))
						class235.vertical_scroll_position = (class235.scroll_height - class235.screen_height);
					if (class235.vertical_scroll_position < 0)
						class235.vertical_scroll_position = 0;
					Widget.redraw_widget(class235);
					if (class235.index == -1)
						Class172.method1134((byte) 9, class235.hash);
					return;
				}
				if (opcode == 1101) {
					class235.color = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget.redraw_widget(class235);
					if (class235.index == -1)
						Class233.method1494(127, class235.hash);
					return;
				}
				if (opcode == 1102) {
					class235.filled = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1103) {
					class235.top_transparency = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1104) {
					class235.line_width = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1105) {
					int i_31_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (class235.disabled_sprite != i_31_) {
						class235.disabled_sprite = i_31_;
						Widget.redraw_widget(class235);
					}
					if (class235.index == -1) {
						ContextMenus.method2709((class235.hash), (byte) -5);
					}
					return;
				}
				if (opcode == 1106) {
					class235.sprite_angle = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1107) {
					class235.sprite_tiling = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1108) {
					class235.model_type = 1;
					class235.model_id = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget.redraw_widget(class235);
					if (class235.index == -1)
						Class217.method1405(class235.hash, true);
					return;
				}
				if (opcode == 1109) {
					CS2Script.int_stack_size -= 6;
					class235.anInt3255 = CS2Script.int_stack[CS2Script.int_stack_size];
					class235.anInt3271 = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					class235.model_rotation_x = CS2Script.int_stack[CS2Script.int_stack_size + 2];
					class235.model_rotation_y = CS2Script.int_stack[CS2Script.int_stack_size + 3];
					class235.model_rotation_z = CS2Script.int_stack[CS2Script.int_stack_size + 4];
					class235.model_zoom = CS2Script.int_stack[CS2Script.int_stack_size + 5];
					Widget.redraw_widget(class235);
					if (class235.index == -1) {
						Class205.method1343((byte) 126, class235.hash);
						Class211_Sub1_Sub1.method2611(0, class235.hash);
					}
					return;
				}
				if (opcode == 1110) {
					int i_32_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (class235.sequence_id != i_32_) {
						class235.sequence_id = i_32_;
						class235.model_frame = 0;
						class235.anInt3221 = 1;
						class235.model_frame_cycle = 0;
						Widget.redraw_widget(class235);
					}
					if (class235.index == -1)
						Class246_Sub28_Sub31.method2854(class235.hash, 1012);
					return;
				}
				if (opcode == 1111) {
					class235.model_orthogonal = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1112) {
					String string = CS2Script.string_stack[--CS2Script.string_stack_size];
					if (!string.equals(class235.text)) {
						class235.text = string;
						Widget.redraw_widget(class235);
					}
					if (class235.index == -1)
						Class50.method330(class235.hash, -125);
					return;
				}
				if (opcode == 1113) {
					class235.font_id = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget.redraw_widget(class235);
					if (class235.index == -1)
						Class194_Sub2.method2146(class235.hash, (byte) 59);
					return;
				}
				if (opcode == 1114) {
					CS2Script.int_stack_size -= 3;
					class235.horizontal_text_alignment = CS2Script.int_stack[CS2Script.int_stack_size];
					class235.vertical_text_alignment = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					class235.line_height = CS2Script.int_stack[CS2Script.int_stack_size + 2];
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1115) {
					class235.text_shadow = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1116) {
					class235.border_width = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1117) {
					class235.border_color = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1118) {
					class235.flipped_vertically = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1119) {
					class235.flipped_horizontally = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1120) {
					CS2Script.int_stack_size -= 2;
					class235.scroll_width = CS2Script.int_stack[CS2Script.int_stack_size];
					class235.scroll_height = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					Widget.redraw_widget(class235);
					if (class235.type == 0)
						Widget.update_layer(class235, -1, false);
					return;
				}
				if (opcode == 1121) {
					CS2Script.int_stack_size -= 2;
					class235.f_md = (short) CS2Script.int_stack[CS2Script.int_stack_size];
					class235.anInt3217 = (short) CS2Script.int_stack[CS2Script.int_stack_size + 1];
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1122) {
					class235.sprite_tiling = ~CS2Script.int_stack[--CS2Script.int_stack_size] == -2;
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1123) {
					class235.model_zoom = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget.redraw_widget(class235);
					if (class235.index == -1)
						Class205.method1343((byte) 127, class235.hash);
					return;
				}
				if (opcode == 1124) {
					int i_33_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					class235.line_direction = i_33_ == 1;
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1125) {
					CS2Script.int_stack_size -= 2;
					class235.translate_x = CS2Script.int_stack[CS2Script.int_stack_size];
					class235.translate_y = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1126) {
					class235.anInt3259 = CS2Script.int_stack[--CS2Script.int_stack_size];
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1127) {
					CS2Script.int_stack_size -= 2;
					int i_34_ = CS2Script.int_stack[CS2Script.int_stack_size];
					int i_35_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					ParamType class118 = ParamType.list(i_34_, revision);
					if (i_35_ != ((ParamType) class118).default_int)
						class235.method1517(i_34_, i_35_, -122);
					else {
						class235.method1505((byte) 79, i_34_);
						return;
					}
					return;
				}
				if (opcode == 1128) {
					int i_36_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					String string = CS2Script.string_stack[--CS2Script.string_stack_size];
					ParamType class118 = ParamType.list(i_36_, revision);
					if (!((ParamType) class118).defaultStr.equals(string))
						class235.method1499(string, i_36_, 16);
					else {
						class235.method1505((byte) 114, i_36_);
						return;
					}
					return;
				}
			} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
				Widget class235;
				if (opcode >= 2000) {
					opcode -= 1000;
					class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
				} else
					class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
				Widget.redraw_widget(class235);
				if (opcode == 1200 || opcode == 1205 || opcode == 1208 || opcode == 1209 || opcode == 1212
						|| opcode == 1213) {
					CS2Script.int_stack_size -= 2;
					int i_37_ = CS2Script.int_stack[CS2Script.int_stack_size];
					int i_38_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					if (class235.index == -1) {
						Class188.method1237(95, class235.hash);
						Class205.method1343((byte) 125, class235.hash);
						Class211_Sub1_Sub1.method2611(0, class235.hash);
					}
					if (i_37_ == -1) {
						class235.model_type = 1;
						class235.model_id = -1;
						class235.item_id = -1;
					} else {
						class235.item_id = i_37_;
						class235.item_quantity = i_38_;
						if (opcode == 1208 || opcode == 1209)
							class235.f_db = true;
						else
							class235.f_db = false;
						ObjType class197 = MapRegion.aClass191_3663.list(22883, i_37_);
						class235.model_rotation_x = ((ObjType) class197).xan2d;
						class235.model_rotation_y = ((ObjType) class197).yan2d;
						class235.model_rotation_z = ((ObjType) class197).zan2d;
						class235.anInt3255 = ((ObjType) class197).offsetX2d;
						class235.anInt3271 = ((ObjType) class197).offsetY2d;
						class235.model_zoom = ((ObjType) class197).zoom2d;
						if (opcode == 1205 || opcode == 1209)
							class235.item_quantity_mode = 0;
						else if (opcode == 1212 || opcode == 1213)
							class235.item_quantity_mode = 1;
						else
							class235.item_quantity_mode = 2;
						if (class235.dynamic_width > 0)
							class235.model_zoom = (class235.model_zoom * 32 / class235.dynamic_width);
						else {
							if (class235.original_width > 0)
								class235.model_zoom = (class235.model_zoom * 32 / class235.original_width);
							return;
						}
						return;
					}
					return;
				}
				if (opcode == 1201) {
					class235.model_type = 2;
					class235.model_id = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (class235.index == -1)
						Class217.method1405(class235.hash, true);
					return;
				}
				if (opcode == 1202) {
					class235.model_type = 3;
					class235.model_id = -1;
					if (class235.index == -1)
						Class217.method1405(class235.hash, true);
					return;
				}
				if (opcode == 1203) {
					class235.model_type = 6;
					class235.model_id = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (class235.index == -1)
						Class217.method1405(class235.hash, true);
					return;
				}
				if (opcode == 1204) {
					class235.model_type = 5;
					class235.model_id = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (class235.index == -1)
						Class217.method1405(class235.hash, true);
					return;
				}
				if (opcode == 1206) {
					CS2Script.int_stack_size -= 4;
					class235.anInt3213 = CS2Script.int_stack[CS2Script.int_stack_size];
					class235.anInt3204 = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					class235.anInt3249 = CS2Script.int_stack[CS2Script.int_stack_size + 2];
					class235.f_fb = CS2Script.int_stack[CS2Script.int_stack_size + 3];
					Widget.redraw_widget(class235);
					return;
				}
				if (opcode == 1207) {
					CS2Script.int_stack_size -= 2;
					class235.anInt3253 = CS2Script.int_stack[CS2Script.int_stack_size];
					class235.f_id = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					Widget.redraw_widget(class235);
					return;
				}
				if (revision == 634) {
					if (opcode == 1210) {
						CS2Script.int_stack_size -= 4;
						class235.model_id = CS2Script.int_stack[CS2Script.int_stack_size];
						class235.anInt3289 = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						if (CS2Script.int_stack[CS2Script.int_stack_size + 2] == 1)
							class235.model_type = 9;
						else
							class235.model_type = 8;
						if (CS2Script.int_stack[CS2Script.int_stack_size + 3] == 1)
							class235.f_db = true;
						else
							class235.f_db = false;
						if (class235.index == -1)
							Class217.method1405(class235.hash, true);
						return;
					}
					if (opcode == 1211) {
						class235.model_type = 5;
						class235.model_id = Class109.anInt1567;
						class235.anInt3289 = 0;
						if (class235.index == -1)
							Class217.method1405(class235.hash, true);
						return;
					}
				}
			} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
				Widget class235;
				if (opcode >= 2000) {
					opcode -= 1000;
					class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
				} else
					class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
				if (opcode == 1300) {
					int i_39_ = CS2Script.int_stack[--CS2Script.int_stack_size] - 1;
					if (i_39_ < 0 || i_39_ > 9)
						CS2Script.string_stack_size--;
					else {
						class235.set_if3_action(CS2Script.string_stack[--CS2Script.string_stack_size], i_39_);
						return;
					}
					return;
				}
				if (opcode == 1301) {
					CS2Script.int_stack_size -= 2;
					int i_40_ = CS2Script.int_stack[CS2Script.int_stack_size];
					int i_41_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					if (i_40_ == -1 && i_41_ == -1)
						class235.parent = null;
					else {
						class235.parent = Widget.get_component(i_40_, i_41_, revision);
						return;
					}
					return;
				}
				if (opcode == 1302) {
					int i_42_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (i_42_ == ClickMaskNode.anInt4894 || i_42_ == Class_e.anInt1219 || i_42_ == Class214.anInt2993) {
						class235.anInt3205 = i_42_;
						return;
					}
					return;
				}
				if (opcode == 1303) {
					class235.drag_zone_size = CS2Script.int_stack[--CS2Script.int_stack_size];
					return;
				}
				if (opcode == 1304) {
					class235.drag_threshhold = CS2Script.int_stack[--CS2Script.int_stack_size];
					return;
				}
				if (opcode == 1305) {
					class235.data_text = CS2Script.string_stack[--CS2Script.string_stack_size];
					return;
				}
				if (opcode == 1306) {
					class235.selected_action_name = CS2Script.string_stack[--CS2Script.string_stack_size];
					return;
				}
				if (opcode == 1307) {
					class235.if3_actions = null;
					return;
				}
				if (opcode == 1308) {
					class235.anInt3199 = CS2Script.int_stack[--CS2Script.int_stack_size];
					class235.anInt3234 = CS2Script.int_stack[--CS2Script.int_stack_size];
					return;
				}
				if (opcode == 1309) {
					int i_43_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					int i_44_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (i_44_ >= 1 && i_44_ <= 10)
						class235.method1500(65535, i_43_, i_44_ - 1);
					return;
				}
				if (opcode == 1310) {
					class235.aString3229 = CS2Script.string_stack[--CS2Script.string_stack_size];
					return;
				}
				if (revision == 634) {
					if (opcode == 1311) {
						class235.anInt3284 = CS2Script.int_stack[--CS2Script.int_stack_size];
						return;
					}
					if (opcode == 1312 || opcode == 1313) {
						int i_45_;
						int i_46_;
						int i_47_;
						if (opcode == 1312) {
							CS2Script.int_stack_size -= 3;
							i_45_ = CS2Script.int_stack[CS2Script.int_stack_size] - 1;
							i_46_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
							i_47_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
							if (i_45_ < 0 || i_45_ > 9)
								throw new RuntimeException("IOR13121313");
						} else {
							CS2Script.int_stack_size -= 2;
							i_45_ = 10;
							i_46_ = CS2Script.int_stack[CS2Script.int_stack_size];
							i_47_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						}
						if (class235.aByteArray3214 == null) {
							if (i_46_ != 0) {
								class235.aByteArray3214 = new byte[11];
								class235.aByteArray3291 = new byte[11];
								class235.f_ed = new int[11];
							} else
								return;
						}
						class235.aByteArray3214[i_45_] = (byte) i_46_;
						if (i_46_ != 0)
							class235.f_bd = true;
						else {
							class235.f_bd = false;
							for (int i_48_ = 0; i_48_ < class235.aByteArray3214.length; i_48_++) {
								if (class235.aByteArray3214[i_48_] != 0) {
									class235.f_bd = true;
									break;
								}
							}
						}
						class235.aByteArray3291[i_45_] = (byte) i_47_;
						return;
					}
					if (opcode == 1314) {
						class235.anInt3233 = CS2Script.int_stack[--CS2Script.int_stack_size];
						return;
					}
				}
			} else {
				if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
					Widget class235;
					if (opcode >= 2000) {
						opcode -= 1000;
						class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
					} else {
						class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
					}
					if (class235 == null) {
						return;
					}
					String string = CS2Script.string_stack[--CS2Script.string_stack_size];
					int[] triggers = null;
					if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
						int i_49_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (i_49_ > 0) {
							triggers = new int[i_49_];
							while (i_49_-- > 0)
								triggers[i_49_] = CS2Script.int_stack[--CS2Script.int_stack_size];
						}
						string = string.substring(0, string.length() - 1);
					}
					Object[] listener_values = new Object[string.length() + 1];
					for (int i_50_ = listener_values.length - 1; i_50_ >= 1; i_50_--) {
						if (string.charAt(i_50_ - 1) == 's')
							listener_values[i_50_] = CS2Script.string_stack[--CS2Script.string_stack_size];
						else
							listener_values[i_50_] = new Integer(CS2Script.int_stack[--CS2Script.int_stack_size]);
					}
					int i_51_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (i_51_ != -1)
						listener_values[0] = new Integer(i_51_);
					else
						listener_values = null;
					if (opcode == 1400)
						class235.on_click_listener = listener_values;
					else if (opcode == 1401)
						class235.on_hold_listener = listener_values;
					else if (opcode == 1402)
						class235.on_release_listener = listener_values;
					else if (opcode == 1403)
						class235.on_mouse_over_listener = listener_values;
					else if (opcode == 1404)
						class235.on_mouse_leave_listener = listener_values;
					else if (opcode == 1405)
						class235.on_drag_listener = listener_values;
					else if (opcode == 1406)
						class235.on_target_leave_listener = listener_values;
					else if (opcode == 1407) {
						class235.on_varp_update_listener = listener_values;
						class235.varp_listener_triggers = triggers;
					} else if (opcode == 1408)
						class235.on_loop_cycle_listener = listener_values;
					else if (opcode == 1409)
						class235.on_option_click_listener = listener_values;
					else if (opcode == 1410)
						class235.on_drag_complete_listener = listener_values;
					else if (opcode == 1411)
						class235.on_click_repeat_listener = listener_values;
					else if (opcode == 1412)
						class235.on_mouse_repeat_listener = listener_values;
					else if (opcode == 1414) {
						class235.on_inventory_update_listener = listener_values;
						class235.inventory_listener_triggers = triggers;
					} else if (opcode == 1415) {
						class235.skill_listener_triggers = listener_values;
						class235.on_skill_update_listener = triggers;
					} else if (opcode == 1416)
						class235.on_target_enter_listener = listener_values;
					else if (opcode == 1417)
						class235.on_mouse_wheel_listener = listener_values;
					else if (opcode == 1418)
						class235.on_game_message_received = listener_values;
					else if (opcode == 1419)
						class235.key_pressed_listener = listener_values;
					else if (opcode == 1420)
						class235.private_chat_update_listener = listener_values;
					else if (opcode == 1421)
						class235.on_clan_chat_update_listener = listener_values;
					else if (opcode == 1422)
						class235.misc_information_update_listener = listener_values;
					else if (opcode == 1423)
						class235.on_dialog_abort_listener = listener_values;
					else if (opcode == 1424)
						class235.on_interface_overriding_update = listener_values;
					else if (opcode == 1425)
						class235.on_stock_update_listener = listener_values;
					else if (opcode == 1426)
						class235.on_camera_finish = listener_values;
					else if (opcode == 1427)
						class235.on_resize_listener = listener_values;
					else if (opcode == 1428) {
						class235.varc_change_listener = listener_values;
						class235.varc_change_triggers = triggers;
					} else if (opcode == 1429) {
						class235.varc_str_change_listener = listener_values;
						class235.varc_str_change_triggers = triggers;
					} else if (opcode == 1430)
						class235.on_mouse_repeat_listener_wrong = listener_values;
					class235.has_listener = true;
					return;
				}
				if (opcode < 1600) {
					Widget class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
					if (opcode == 1500) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.x;
						return;
					}
					if (opcode == 1501) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.y;
						return;
					}
					if (opcode == 1502) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.screen_width;
						return;
					}
					if (opcode == 1503) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.screen_height;
						return;
					}
					if (opcode == 1504) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.hidden ? 1 : 0;
						return;
					}
					if (opcode == 1505) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.parent_id;
						return;
					}
					if (opcode == 1506) {
						Widget class235_52_ = Class5.method59(class235, (byte) 62);
						CS2Script.int_stack[CS2Script.int_stack_size++] = (class235_52_ == null ? -1
								: ((Widget) class235_52_).hash);
						return;
					}
				} else if (opcode < 1700) {
					Widget class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
					if (opcode == 1600) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.horizontal_scroll_position;
						return;
					}
					if (opcode == 1601) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.vertical_scroll_position;
						return;
					}
					if (opcode == 1602) {
						CS2Script.string_stack[CS2Script.string_stack_size++] = class235.text;
						return;
					}
					if (opcode == 1603) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.scroll_width;
						return;
					}
					if (opcode == 1604) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.scroll_height;
						return;
					}
					if (opcode == 1605) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.model_zoom;
						return;
					}
					if (opcode == 1606) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.model_rotation_x;
						return;
					}
					if (opcode == 1607) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.model_rotation_z;
						return;
					}
					if (opcode == 1608) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.model_rotation_y;
						return;
					}
					if (opcode == 1609) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.top_transparency;
						return;
					}
					if (opcode == 1610) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.anInt3255;
						return;
					}
					if (opcode == 1611) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.anInt3271;
						return;
					}
					if (opcode == 1612) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.disabled_sprite;
						return;
					}
					if (opcode == 1613) {
						int i_53_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						ParamType class118 = ParamType.list(i_53_, revision);
						if (class118.is_string(115)) {
							CS2Script.string_stack[CS2Script.string_stack_size++] = class235
									.method1516((((ParamType) class118).defaultStr), i_53_, -26191);
						} else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = class235.method1501(-1,
									(((ParamType) class118).default_int), i_53_);
						}
					}
					if (revision == 634) {
						if (opcode == 1614) {
							CS2Script.int_stack[CS2Script.int_stack_size++] = class235.sprite_angle;
							return;
						}
					}
				} else if (opcode < 1800) {
					Widget class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
					if (opcode == 1700) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.item_id;
						return;
					}
					if (opcode == 1701) {
						if (class235.item_id != -1)
							CS2Script.int_stack[CS2Script.int_stack_size++] = class235.item_quantity;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 1702) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.index;
						return;
					}
				} else if (opcode < 1900) {
					Widget class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
					if (opcode == 1800) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Widget.get_active_properties(class235)
								.get_widget_flags(16693);
						return;
					}
					if (opcode == 1801) {
						int i_54_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						i_54_--;
						if (class235.if3_actions == null || (i_54_ >= class235.if3_actions.length)
								|| (class235.if3_actions[i_54_] == null))
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = class235.if3_actions[i_54_];
							return;
						}
						return;
					}
					if (opcode == 1802) {
						if (class235.data_text == null)
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = class235.data_text;
							return;
						}
						return;
					}
				} else if (opcode < 2000 || opcode >= 2900 && opcode < 3000) {
					Widget class235;
					if (opcode >= 2000) {
						class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
						opcode -= 1000;
					} else
						class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
					if (script_io >= 10)
						throw new RuntimeException("C29xx-1");
					if (opcode == 1927) {
						if (class235.on_resize_listener != null) {
							ScriptEvent class246_sub29 = new ScriptEvent();
							((ScriptEvent) class246_sub29).source = class235;
							((ScriptEvent) class246_sub29).params = class235.on_resize_listener;
							((ScriptEvent) class246_sub29).script_io = script_io + 1;
							Client.low_priority_script_events.push_head(class246_sub29);
							return;
						}
						return;
					}
				} else if (opcode < 2600) {
					Widget widget = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
					if (opcode == 2500) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = widget.x;
						return;
					}
					if (opcode == 2501) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = widget.y;
						return;
					}
					if (opcode == 2502) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = widget.screen_width;
						return;
					}
					if (opcode == 2503) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = widget.screen_height;
						return;
					}
					if (opcode == 2504) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = widget.hidden ? 1 : 0;
						return;
					}
					if (opcode == 2505) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = widget.parent_id;
						return;
					}
					if (opcode == 1506) {
						Widget class235_55_ = Class5.method59(widget, (byte) 97);
						CS2Script.int_stack[CS2Script.int_stack_size++] = (class235_55_ == null ? -1
								: ((Widget) class235_55_).hash);
						return;
					}
				} else if (opcode < 2700) {
					Widget class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);

					if (opcode == 2600) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.horizontal_scroll_position;
						return;
					}
					if (opcode == 2601) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.vertical_scroll_position;
						return;
					}
					if (opcode == 2602) {
						CS2Script.string_stack[CS2Script.string_stack_size++] = class235.text;
						return;
					}
					if (opcode == 2603) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.scroll_width;
						return;
					}
					if (opcode == 2604) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.scroll_height;
						return;
					}
					if (opcode == 2605) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.model_zoom;
						return;
					}
					if (opcode == 2606) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.model_rotation_x;
						return;
					}
					if (opcode == 2607) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.model_rotation_z;
						return;
					}
					if (opcode == 2608) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.model_rotation_y;
						return;
					}
					if (opcode == 2609) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.top_transparency;
						return;
					}
					if (opcode == 2610) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.anInt3255;
						return;
					}
					if (opcode == 2611) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.anInt3271;
						return;
					}
					if (opcode == 2612) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.disabled_sprite;
						return;
					}
					if (revision == 634) {
						if (opcode == 2613) {
							CS2Script.int_stack[CS2Script.int_stack_size++] = class235.sprite_angle;
							return;
						}
					}
				} else if (opcode < 2800) {
					if (opcode == 2700) {
						Widget class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
						CS2Script.int_stack[CS2Script.int_stack_size++] = class235.item_id;
						return;
					}
					if (opcode == 2701) {
						Widget class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
						if (class235.item_id != -1)
							CS2Script.int_stack[CS2Script.int_stack_size++] = class235.item_quantity;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 2702) {
						int i_56_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						WidgetParent class246_sub40 = ((WidgetParent) Widget.get_widget_parents(revision)
								.get((long) i_56_));
						if (class246_sub40 != null)
							CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 2703) {
						Widget class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
						if (class235.components == null)
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
						else {
							int i_57_ = class235.components.length;
							for (int i_58_ = 0; i_58_ < class235.components.length; i_58_++) {
								if (class235.components[i_58_] == null) {
									i_57_ = i_58_;
									break;
								}
							}
							CS2Script.int_stack[CS2Script.int_stack_size++] = i_57_;
							return;
						}
						return;
					}
					if (opcode == 2704 || opcode == 2705) {
						CS2Script.int_stack_size -= 2;
						int i_59_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_60_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						WidgetParent class246_sub40 = ((WidgetParent) Widget.get_widget_parents(revision)
								.get((long) i_59_));
						if (class246_sub40 != null && (((WidgetParent) class246_sub40).anInt5517 == i_60_))
							CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}

				} else if (opcode < 2900) {
					Widget class235 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], revision);
					if (opcode == 2800) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Widget.get_active_properties(class235)
								.get_widget_flags(16693);
						return;
					}
					if (opcode == 2801) {
						int i_61_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						i_61_--;
						if (class235.if3_actions == null || (i_61_ >= class235.if3_actions.length)
								|| (class235.if3_actions[i_61_] == null))
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = class235.if3_actions[i_61_];
							return;
						}
						return;
					}
					if (opcode == 2802) {
						if (class235.data_text == null)
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = class235.data_text;
							return;
						}
						return;
					}
				} else if (opcode < 3200) {
					if (opcode == ScriptOpcodes.MES) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						Client.add_game_message((byte) -99, string);
						return;
					}
					if (opcode == 3101) {
						CS2Script.int_stack_size -= 2;
						Client.perform_player_animation(Client.local_player,
								CS2Script.int_stack[CS2Script.int_stack_size],
								CS2Script.int_stack[CS2Script.int_stack_size + 1], revision);
						return;
					}
					if (opcode == 3103) {
						Class257.remove_interfaces(-15257, true, revision == 0 ? Revision.CUSTOM_OSRS
								: revision == 1 ? Revision.CUSTOM_PRE_EOC_550
										: revision < 200 ? Revision.OSRS
												: revision == 550 ? Revision.PRE_EOC_550 : Revision.PRE_EOC_634);
						return;
					}
					if (opcode == 3104) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						int i_62_ = 0;
						if (Class48.method323(string, 59))
							i_62_ = Class104.method665(string, 10);
						anInt2118++;
						Class243.writePacket(-126, Class68.aClass201_898);
						Class130_Sub1.stream.writeInt(i_62_, (byte) -46);
						return;
					}
					if (opcode == 3105) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						anInt2129++;
						Class243.writePacket(-53, Class132.aClass201_1832);
						Class130_Sub1.stream.writeByte(255, string.length() + 1);
						Class130_Sub1.stream.writeString(55, string);
						return;
					}
					if (opcode == 3106) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						anInt2117++;
						Class243.writePacket(-93, Class133.aClass201_1844);
						Class130_Sub1.stream.writeByte(255, string.length() + 1);
						Class130_Sub1.stream.writeString(74, string);
						return;
					}
					if (opcode == 3107) {
						int i_63_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						MapScenes.method1643(string, i_63_, (byte) -24);
						return;
					}
					if (opcode == 3108) {
						CS2Script.int_stack_size -= 3;
						int i_64_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_65_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						int i_66_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
						Widget class235 = Widget.get_widget(i_66_, revision);
						Widget.click_widget(class235, i_64_, i_65_, 0);
						return;
					}
					if (opcode == 3109) {
						CS2Script.int_stack_size -= 2;
						int i_67_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_68_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						Widget class235 = bool ? Widget.static_active_component1 : Widget.static_active_component2;
						Widget.click_widget(class235, i_67_, i_68_, 0);
						return;
					}
					if (opcode == 3110) {
						int i_69_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						anInt2131++;
						Class243.writePacket(-61, Class220.GRAND_EXCHANGE_ITEM_SELECT_PACKET);
						Class130_Sub1.stream.writeShort((byte) 67, i_69_);
						return;
					}
					if (revision == 634) {
						if (opcode == 3111) {
							CS2Script.int_stack_size -= 2;
							int i_70_ = CS2Script.int_stack[CS2Script.int_stack_size];
							int i_71_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
							WidgetParent class246_sub40 = ((WidgetParent) Widget.get_widget_parents(revision)
									.get((long) i_70_));
							if (class246_sub40 != null)
								Widget.close_widget((((WidgetParent) class246_sub40).anInt5517) != i_71_,
										class246_sub40, true, -43, revision, "here8");
							IdentityKitType.method1064(i_71_, 3, true, (byte) -71, i_70_, revision);
							return;
						}
						if (opcode == 3112) {
							CS2Script.int_stack_size--;
							int i_72_ = CS2Script.int_stack[CS2Script.int_stack_size];
							WidgetParent class246_sub40 = ((WidgetParent) Widget.get_widget_parents(revision)
									.get((long) i_72_));
							if (class246_sub40 != null && ((WidgetParent) class246_sub40).type == 3)
								Widget.close_widget(true, class246_sub40, true, -41, revision, "here9");
							return;
						}
						if (opcode == 3113) {
							MapFunctions.method1094(CS2Script.string_stack[--CS2Script.string_stack_size], -110);
							return;
						}
						if (opcode == 3114) {
							CS2Script.int_stack_size -= 2;
							int i_73_ = CS2Script.int_stack[CS2Script.int_stack_size];
							int i_74_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
							String string = CS2Script.string_stack[--CS2Script.string_stack_size];
							MultilingualString.method437(i_74_, i_73_, string, "", "", true);
							return;
						}
					}
				} else if (opcode < 3300) {
					if (opcode == 3200) {
						CS2Script.int_stack_size -= 3;
						Client.queue_sound_effect(CS2Script.int_stack[CS2Script.int_stack_size], 0,
								CS2Script.int_stack[CS2Script.int_stack_size + 1], 255,
								CS2Script.int_stack[CS2Script.int_stack_size + 2]);
						return;
					}
					if (opcode == 3201) {
						Client.play_song(CS2Script.int_stack[--CS2Script.int_stack_size], -97, 50, 255);
						return;
					}
					if (opcode == 3202) {
						CS2Script.int_stack_size -= 2;
						Class234.method1497(255, 0, CS2Script.int_stack[CS2Script.int_stack_size + 1],
								CS2Script.int_stack[CS2Script.int_stack_size]);
						return;
					}
					if (revision == 634) {
						if (opcode == 3203) {
							CS2Script.int_stack_size -= 4;
							Client.queue_sound_effect(CS2Script.int_stack[CS2Script.int_stack_size], 0,
									CS2Script.int_stack[CS2Script.int_stack_size + 1],
									CS2Script.int_stack[CS2Script.int_stack_size + 3],
									CS2Script.int_stack[CS2Script.int_stack_size + 2]);
							return;
						}
						if (opcode == 3204) {
							CS2Script.int_stack_size -= 3;
							Client.play_song(CS2Script.int_stack[CS2Script.int_stack_size], 125,
									(CS2Script.int_stack[CS2Script.int_stack_size + 2]),
									(CS2Script.int_stack[CS2Script.int_stack_size + 1]));
							return;
						}
						if (opcode == 3205) {
							CS2Script.int_stack_size -= 3;
							Class234.method1497(CS2Script.int_stack[CS2Script.int_stack_size + 2], 0,
									CS2Script.int_stack[CS2Script.int_stack_size + 1],
									CS2Script.int_stack[CS2Script.int_stack_size]);
							return;
						}
						if (opcode == 3206) {
							CS2Script.int_stack_size -= 4;
							Tile.method994(CS2Script.int_stack[CS2Script.int_stack_size + 1],
									CS2Script.int_stack[CS2Script.int_stack_size + 2], false,
									CS2Script.int_stack[CS2Script.int_stack_size],
									CS2Script.int_stack[CS2Script.int_stack_size + 3]);
							return;
						}
						if (revision == 634) {
							if (opcode == 3207) {
								CS2Script.int_stack_size -= 4;
								Tile.method994(CS2Script.int_stack[CS2Script.int_stack_size + 1],
										CS2Script.int_stack[CS2Script.int_stack_size + 2], true,
										CS2Script.int_stack[CS2Script.int_stack_size],
										CS2Script.int_stack[CS2Script.int_stack_size + 3]);
								return;
							}
						}
					}
				} else if (opcode < 3400) {
					if (opcode == 3300) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Client.cycle;
						return;
					}
					if (opcode == 3301) {
						CS2Script.int_stack_size -= 2;
						int i_75_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_76_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub28_Sub23.method2730(false, false,
								i_76_, i_75_);
						return;
					}
					if (opcode == 3302) {
						CS2Script.int_stack_size -= 2;
						int i_77_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_78_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class130_Sub8.method2347(120, i_78_, i_77_,
								false);
						return;
					}
					if (opcode == 3303) {
						CS2Script.int_stack_size -= 2;
						int i_79_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_80_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Renderer.method274(-10077, false, i_79_,
								i_80_);
						return;
					}
					if (opcode == 3304) {
						int i_81_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class246_Sub1_Sub2) HashMap.inv_type
								.method416(5, i_81_)).anInt5697;
						return;
					}
					if (opcode == 3305) {
						int i_82_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Player.skill_levels[i_82_];
						return;
					}
					if (opcode == 3306) {
						int i_83_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Player.skill_base_levels[i_83_];
						return;
					}
					if (opcode == 3307) {
						int i_84_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Player.experience[i_84_];
						return;
					}
					if (opcode == 3308) {
						int i_85_ = (((Class59_Sub3) Client.local_player).current_plane);
						int i_86_ = (((((Class59_Sub3) Client.local_player).x) >> 7)
								+ Client.base_x);
						int i_87_ = (((((Class59_Sub3) Client.local_player).y) >> 7) + Client.base_y);
						CS2Script.int_stack[CS2Script.int_stack_size++] = (i_85_ << 28) + (i_86_ << 14) + i_87_;
						return;
					}
					if (opcode == 3309) {
						int i_88_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_88_ >> 14 & 0x3fff;
						return;
					}
					if (opcode == 3310) {
						int i_89_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_89_ >> 28;
						return;
					}
					if (opcode == 3311) {
						int i_90_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_90_ & 0x3fff;
						return;
					}
					if (opcode == 3312) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Client.members_world ? 1 : 0;
						return;
					}
					if (opcode == 3313) {
						CS2Script.int_stack_size -= 2;
						int i_91_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_92_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub28_Sub23.method2730(false, true,
								i_92_, i_91_);
						return;
					}
					if (opcode == 3314) {
						CS2Script.int_stack_size -= 2;
						int i_93_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_94_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class130_Sub8.method2347(67, i_94_, i_93_,
								true);
						return;
					}
					if (opcode == 3315) {
						CS2Script.int_stack_size -= 2;
						int i_95_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_96_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Renderer.method274(-10077, true, i_95_,
								i_96_);
						return;
					}
					if (opcode == 3316) {
						if (Client.staff_level >= 2)
							CS2Script.int_stack[CS2Script.int_stack_size++] = Client.staff_level;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 3317) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Client.reboot_timer;
						return;
					}
					if (opcode == 3318) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Client.world_id;
						return;
					}
					if (opcode == 3321) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Player.energy;
						return;
					}
					if (opcode == 3322) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Player.weight;
						return;
					}
					if (opcode == 3323) {
						if (Player.moderator >= 5 && Player.moderator <= 9)
							CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 3324) {
						if (Player.moderator >= 5 && Player.moderator <= 9)
							CS2Script.int_stack[CS2Script.int_stack_size++] = Player.moderator;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 3325) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub23.aBool4817 ? 1 : 0;
						return;
					}
					if (opcode == 3326) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = ((Player) Client.local_player).f_qd;
						return;
					}
					if (opcode == 3327) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = ((PlayerComposition) (((Player) Client.local_player).appearance)).female
								? 1
								: 0;
						return;
					}
					if (revision != 634) {
						if (opcode == 3328) {
							CS2Script.int_stack[CS2Script.int_stack_size++] = Class59.aBool820 && !Class_u.aBool4703 ? 1
									: 0;
							return;
						}
					}
					if (opcode == 3329) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class168.aBool2395 ? 1 : 0;
						return;
					}
					if (opcode == 3330) {
						int i_97_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub28_Sub33.method2861(false, i_97_,
								true);
						return;
					}
					if (opcode == 3331) {
						CS2Script.int_stack_size -= 2;
						int i_98_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_99_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class21_Sub3.method2077(false, false, i_98_,
								i_99_, (byte) 120);
						return;
					}
					if (opcode == 3332) {
						CS2Script.int_stack_size -= 2;
						int i_100_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_101_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class21_Sub3.method2077(false, true, i_100_,
								i_101_, (byte) 84);
						return;
					}
					if (opcode == 3333) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = LoginScreen.login_state;
						return;
					}
					if (opcode == 3335) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Preferences.language_code;
						return;
					}
					if (opcode == 3336) {
						CS2Script.int_stack_size -= 4;
						int i_102_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_103_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						int i_104_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
						int i_105_ = CS2Script.int_stack[CS2Script.int_stack_size + 3];
						i_102_ += i_103_ << 14;
						i_102_ += i_104_ << 28;
						i_102_ += i_105_;
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_102_;
						return;
					}
					if (opcode == 3337) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class109_Sub4.anInt4573;
						return;
					}
					if (opcode == 3338) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = FloorDefinition.method1359(-49);
						return;
					}
					if (revision == 634) {
						if (opcode == 3339) {
							CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class321.aBool4054 ? 1 : 0 */0;
							return;
						}
						if (opcode == 3340) {
							CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class121_Sub49_Sub15.focus ? 1 : 0 */0;
							return;
						}
						if (opcode == 3341) {
							CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																				 * Class121_Sub49_Sub24.from_billing ? 1
																				 * : 0
																				 */0;
							return;
						}
						if (opcode == 3342) {
							CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																				 * Class283_Sub3.mouse_listener.
																				 * get_mouse_x((byte) -90)
																				 */0;
							return;
						}
						if (opcode == 3343) {
							CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																				 * Class283_Sub3.mouse_listener.
																				 * get_mouse_y(74)
																				 */0;
							return;
						}
						if (opcode == 3344) {
							CS2Script.string_stack[CS2Script.string_stack_size++] = /*
																					 * Class121_Sub35.method2833(-123)
																					 */"and 88";
							return;
						}
						if (opcode == 3345) {
							CS2Script.string_stack[CS2Script.string_stack_size++] = /* Class220.method1246(33) */"bush did 634";
							return;
						}
						if (opcode == 3346) {
							CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																				 * Class121_Sub28.method2751((byte) -25)
																				 */0;
							return;
						}
						if (opcode == 3347) {
							CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class271_Sub7.current_cursor */0;
							return;
						}
					}
				} else if (opcode < 3500) {
					if (opcode == 3400) {
						CS2Script.int_stack_size -= 2;
						int i_106_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_107_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						EnumType class183 = Class246_Sub39.aClass141_5487.list(i_106_, -92, revision);
						CS2Script.string_stack[CS2Script.string_stack_size++] = class183.getStringParamValue(114,
								i_107_);
						return;
					}
					if (opcode == 3408) {
						CS2Script.int_stack_size -= 4;
						int return_type = CS2Script.int_stack[CS2Script.int_stack_size];
						int input_type = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						int enum_id = CS2Script.int_stack[CS2Script.int_stack_size + 2];
						int param_id = CS2Script.int_stack[CS2Script.int_stack_size + 3];
						EnumType enum_type = Class246_Sub39.aClass141_5487.list(enum_id, -93, revision);
						if (((EnumType) enum_type).input_type != return_type
								|| ((EnumType) enum_type).output_type != input_type)
							throw new RuntimeException();
						if (input_type == 115)
							CS2Script.string_stack[CS2Script.string_stack_size++] = enum_type.getStringParamValue(109,
									param_id);
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = enum_type.getIntegerParamValue(param_id,
									-6);
							return;
						}
						return;
					}
					if (opcode == 3409) {
						CS2Script.int_stack_size -= 3;
						int i_112_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_113_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						int i_114_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
						if (i_113_ == -1)
							throw new RuntimeException("C3409-2");
						EnumType class183 = Class246_Sub39.aClass141_5487.list(i_113_, 22, revision);
						if (((EnumType) class183).output_type != i_112_)
							throw new RuntimeException("C3409-1");
						CS2Script.int_stack[CS2Script.int_stack_size++] = class183.method1183(true, i_114_) ? 1 : 0;
						return;
					}
					if (opcode == 3410) {
						int i_115_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						if (i_115_ == -1)
							throw new RuntimeException("C3410-2");
						EnumType class183 = Class246_Sub39.aClass141_5487.list(i_115_, -98, revision);
						if (((EnumType) class183).output_type != 's')
							throw new RuntimeException("C3410-1");
						CS2Script.int_stack[CS2Script.int_stack_size++] = class183.method1182(2, string) ? 1 : 0;
						return;
					}
					if (opcode == 3411) {
						int i_116_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						EnumType class183 = Class246_Sub39.aClass141_5487.list(i_116_, -110, revision);
						CS2Script.int_stack[CS2Script.int_stack_size++] = ((EnumType) class183).aClass85_2551
								.method542(-5);
						return;
					}
				} else if (opcode < 3700) {
					if (opcode == 3600) {
						if (Client.anInt1429 == 0)
							CS2Script.int_stack[CS2Script.int_stack_size++] = -2;
						else {
							if (Client.anInt1429 == 1)
								CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
							else {
								CS2Script.int_stack[CS2Script.int_stack_size++] = Client.anInt3969;
								return;
							}
							return;
						}
						return;
					}
					if (opcode == 3601) {
						int i_117_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Client.anInt1429 == 2 && i_117_ < Client.anInt3969) {
							CS2Script.string_stack[CS2Script.string_stack_size++] = Model.f_gb[i_117_];
							if (Class33.aStringArray446[i_117_] != null)
								CS2Script.string_stack[CS2Script.string_stack_size++] = Class33.aStringArray446[i_117_];
							else
								CS2Script.string_stack[CS2Script.string_stack_size++] = "";
						} else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
					if (opcode == 3602) {
						int i_118_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Client.anInt1429 == 2 && i_118_ < Client.anInt3969)
							CS2Script.int_stack[CS2Script.int_stack_size++] = Class40.anIntArray615[i_118_];
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 3603) {
						int i_119_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Client.anInt1429 == 2 && i_119_ < Client.anInt3969)
							CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub28_Sub25.anIntArray6704[i_119_];
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 3604) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						int i_120_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						Class246_Sub1_Sub14.method2712(string, i_120_, 1);
						return;
					}
					if (opcode == 3605) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						Class127.method867(string, false);
						return;
					}
					if (opcode == 3606) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						Class215.method1402(string, (byte) -117);
						return;
					}
					if (opcode == 3607) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						LocType.method1216((byte) -125, false, string);
						return;
					}
					if (opcode == 3608) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						Class250.method1599(string, 104);
						return;
					}
					if (opcode == 3609) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
							string = string.substring(7);
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub1_Sub9.method2586(119, string) ? 1
								: 0;
						return;
					}
					if (opcode == 3610) { // delete in osrs
						int i_121_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Client.anInt1429 == 2 && i_121_ < Client.anInt3969)
							CS2Script.string_stack[CS2Script.string_stack_size++] = Class245.aStringArray3461[i_121_];
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
					if (opcode == 3611) {
						if (Clan.clanName != null)
							CS2Script.string_stack[CS2Script.string_stack_size++] = Class190.method1246(true,
									(Clan.clanName));
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
					if (opcode == 3612) {
						if (Clan.clanName != null)
							CS2Script.int_stack[CS2Script.int_stack_size++] = Clan.clanMembersAmount;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 3613) {
						int i_122_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Clan.clanName != null && i_122_ < Clan.clanMembersAmount)
							CS2Script.string_stack[CS2Script.string_stack_size++] = (((Class9) Clan.clanMembers[i_122_]).name);
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
					if (opcode == 3614) {
						int i_123_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Clan.clanName != null && i_123_ < Clan.clanMembersAmount)
							CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class9) Clan.clanMembers[i_123_]).world);
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 3615) {
						int i_124_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Clan.clanName != null && i_124_ < Clan.clanMembersAmount)
							CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class9) Clan.clanMembers[i_124_]).rank);
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 3616) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Clan.kickRank;
						return;
					}
					if (opcode == 3617) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						Class145.method975(string, (byte) 67);
						return;
					}
					if (opcode == 3618) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class86.aByte1136;
						return;
					}
					if (opcode == 3619) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						Class40_Sub4.method1879(string, 65);
						return;
					}
					if (opcode == 3620) {
						Class64_Sub1.method2221(0);
						return;
					}
					if (opcode == 3621) {
						if (Client.anInt1429 == 0)
							CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = Widget.anInt3266;
							return;
						}
						return;
					}
					if (opcode == 3622) {
						int i_125_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Client.anInt1429 != 0 && i_125_ < Widget.anInt3266) {
							CS2Script.string_stack[CS2Script.string_stack_size++] = Class38_Sub1_Sub1.aStringArray6762[i_125_];
							if (SequenceLoader.aStringArray6745[i_125_] != null)
								CS2Script.string_stack[CS2Script.string_stack_size++] = SequenceLoader.aStringArray6745[i_125_];
							else
								CS2Script.string_stack[CS2Script.string_stack_size++] = "";
						} else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
					if (opcode == 3623) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
							string = string.substring(7);
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class129.method881(string, false) ? 1 : 0;
						return;
					}
					if (opcode == 3624) {
						int i_126_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Clan.clanMembers != null && i_126_ < Clan.clanMembersAmount
								&& (((Class9) Clan.clanMembers[i_126_]).aString109
										.equalsIgnoreCase(((Player) Client.local_player).aString7140)))
							CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 3625) {
						if (Class221.aString3061 != null)
							CS2Script.string_stack[CS2Script.string_stack_size++] = Class221.aString3061;
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
					if (opcode == 3626) {
						int i_127_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Clan.clanName != null && i_127_ < Clan.clanMembersAmount)
							CS2Script.string_stack[CS2Script.string_stack_size++] = (((Class9) Clan.clanMembers[i_127_]).aString105);
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
					if (opcode == 3627) {
						int i_128_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Client.anInt1429 == 2 && i_128_ >= 0 && i_128_ < Client.anInt3969)
							CS2Script.int_stack[CS2Script.int_stack_size++] = WidgetParent.aBoolArray5520[i_128_] ? 1
									: 0;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 3628) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
							string = string.substring(7);
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class59_Sub2_Sub1.method2450(-30749, string);
						return;
					}
					if (opcode == 3629) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class122.anInt1680;
						return;
					}
					if (opcode == 3630) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						LocType.method1216((byte) -118, true, string);
						return;
					}
					if (opcode == 3631) {
						int i_129_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class236.aBoolArray3319[i_129_] ? 1 : 0;
						return;
					}
					if (opcode == 3632) {
						int i_130_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Clan.clanName != null && i_130_ < Clan.clanMembersAmount)
							CS2Script.string_stack[CS2Script.string_stack_size++] = (((Class9) Clan.clanMembers[i_130_]).aString109);
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
					if (opcode == 3633) {
						int i_131_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (Client.anInt1429 != 0 && i_131_ < Widget.anInt3266)
							CS2Script.string_stack[CS2Script.string_stack_size++] = Class55.aStringArray784[i_131_];
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
				} else if (opcode < 4000) {
					if (opcode == 3903) {
						int i_132_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Client.grand_exchange_objects[i_132_]
								.get_offer_type();
						return;
					}
					if (opcode == 3904) {
						int i_133_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class18) Client.grand_exchange_objects[i_133_]).id);
						return;
					}
					if (opcode == 3905) {
						int i_134_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class18) Client.grand_exchange_objects[i_134_]).price);
						return;
					}
					if (opcode == 3906) {
						int i_135_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class18) Client.grand_exchange_objects[i_135_]).amount);
						return;
					}
					if (opcode == 3907) {
						int i_136_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class18) Client.grand_exchange_objects[i_136_]).sold_amount);
						return;
					}
					if (opcode == 3908) {
						int i_137_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class18) Client.grand_exchange_objects[i_137_]).total_price);
						return;
					}
					if (opcode == 3910) {
						int i_138_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						int i_139_ = Client.grand_exchange_objects[i_138_].get_status();
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_139_ == 0 ? 1 : 0;
						return;
					}
					if (opcode == 3911) {
						int i_140_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						int i_141_ = Client.grand_exchange_objects[i_140_].get_status();
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_141_ == 2 ? 1 : 0;
						return;
					}
					if (opcode == 3912) {
						int i_142_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						int i_143_ = Client.grand_exchange_objects[i_142_].get_status();
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_143_ == 5 ? 1 : 0;
						return;
					}
					if (opcode == 3913) {
						int i_144_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						int i_145_ = Client.grand_exchange_objects[i_144_].get_status();
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_145_ == 1 ? 1 : 0;
						return;
					}
				} else if (opcode < 4100) {
					if (opcode == 4000) {
						CS2Script.int_stack_size -= 2;
						int i_146_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_147_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_146_ + i_147_;
						return;
					}
					if (opcode == 4001) {
						CS2Script.int_stack_size -= 2;
						int i_148_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_149_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_148_ - i_149_;
						return;
					}
					if (opcode == 4002) {
						CS2Script.int_stack_size -= 2;
						int i_150_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_151_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_150_ * i_151_;
						return;
					}
					if (opcode == 4003) {
						CS2Script.int_stack_size -= 2;
						int i_152_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_153_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_152_ / i_153_;
						return;
					}
					if (opcode == 4004) {
						int i_154_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (int) (Math.random() * (double) i_154_);
						return;
					}
					if (opcode == 4005) {
						int i_155_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (int) (Math.random() * (double) (i_155_ + 1));
						return;
					}
					if (opcode == 4006) {
						CS2Script.int_stack_size -= 5;
						int i_156_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_157_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						int i_158_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
						int i_159_ = CS2Script.int_stack[CS2Script.int_stack_size + 3];
						int i_160_ = CS2Script.int_stack[CS2Script.int_stack_size + 4];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_156_
								+ ((i_157_ - i_156_) * (i_160_ - i_158_) / (i_159_ - i_158_));
						return;
					}
					if (opcode == 4007) {
						CS2Script.int_stack_size -= 2;
						long l = (long) CS2Script.int_stack[CS2Script.int_stack_size];
						long l_161_ = (long) CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (int) (l + l * l_161_ / 100L);
						return;
					}
					if (opcode == 4008) {
						CS2Script.int_stack_size -= 2;
						int i_162_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_163_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_162_ | 1 << i_163_;
						return;
					}
					if (opcode == 4009) {
						CS2Script.int_stack_size -= 2;
						int i_164_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_165_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_164_ & -1 - (1 << i_165_);
						return;
					}
					if (opcode == 4010) {
						CS2Script.int_stack_size -= 2;
						int i_166_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_167_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (i_166_ & 1 << i_167_) != 0 ? 1 : 0;
						return;
					}
					if (opcode == 4011) {
						CS2Script.int_stack_size -= 2;
						int i_168_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_169_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_168_ % i_169_;
						return;
					}
					if (opcode == 4012) {
						CS2Script.int_stack_size -= 2;
						int i_170_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_171_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						if (i_170_ == 0)
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = (int) Math.pow((double) i_170_,
									(double) i_171_);
							return;
						}
						return;
					}
					if (opcode == 4013) {
						CS2Script.int_stack_size -= 2;
						int i_172_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_173_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						if (i_172_ == 0)
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
						else {
							if (i_173_ == 0)
								CS2Script.int_stack[CS2Script.int_stack_size++] = 2147483647;
							else {
								CS2Script.int_stack[CS2Script.int_stack_size++] = (int) Math.pow((double) i_172_,
										1.0 / (double) i_173_);
								return;
							}
							return;
						}
						return;
					}
					if (opcode == 4014) {
						CS2Script.int_stack_size -= 2;
						int i_174_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_175_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_174_ & i_175_;
						return;
					}
					if (opcode == 4015) {
						CS2Script.int_stack_size -= 2;
						int i_176_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_177_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_176_ | i_177_;
						return;
					}
					if (opcode == 4016) {
						CS2Script.int_stack_size -= 2;
						int i_178_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_179_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_178_ < i_179_ ? i_178_ : i_179_;
						return;
					}
					if (opcode == 4017) {
						CS2Script.int_stack_size -= 2;
						int i_180_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_181_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_180_ > i_181_ ? i_180_ : i_181_;
						return;
					}
					if (opcode == 4018) {
						CS2Script.int_stack_size -= 3;
						long l = (long) CS2Script.int_stack[CS2Script.int_stack_size];
						long l_182_ = (long) CS2Script.int_stack[CS2Script.int_stack_size + 1];
						long l_183_ = (long) CS2Script.int_stack[CS2Script.int_stack_size + 2];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (int) (l * l_183_ / l_182_);
						return;
					}
				} else if (opcode < 4200) {
					if (opcode == 4100) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						int i_184_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.string_stack[CS2Script.string_stack_size++] = string + i_184_;
						return;
					}
					if (opcode == 4101) {
						CS2Script.string_stack_size -= 2;
						String string = CS2Script.string_stack[CS2Script.string_stack_size];
						String string_185_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
						CS2Script.string_stack[CS2Script.string_stack_size++] = string + string_185_;
						return;
					}
					if (opcode == 4102) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						int i_186_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.string_stack[CS2Script.string_stack_size++] = string
								+ Class137.method932(true, i_186_, (byte) 103);
						return;
					}
					if (opcode == 4103) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						CS2Script.string_stack[CS2Script.string_stack_size++] = string.toLowerCase();
						return;
					}
					if (opcode == 4104) {
						CS2Script.string_stack[CS2Script.string_stack_size++] = method981(
								CS2Script.int_stack[--CS2Script.int_stack_size]);
						return;
					}
					if (opcode == 4105) {
						CS2Script.string_stack_size -= 2;
						String string = CS2Script.string_stack[CS2Script.string_stack_size];
						String string_187_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
						if ((((Player) Client.local_player).appearance) != null
								&& ((PlayerComposition) (((Player) Client.local_player).appearance)).female)
							CS2Script.string_stack[CS2Script.string_stack_size++] = string_187_;
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = string;
							return;
						}
						return;
					}
					if (opcode == 4106) {
						int i_188_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.string_stack[CS2Script.string_stack_size++] = Integer.toString(i_188_);
						return;
					}
					if (opcode == 4107) {
						CS2Script.string_stack_size -= 2;
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class19.method191(103,
								CS2Script.string_stack[CS2Script.string_stack_size + 1],
								CS2Script.string_stack[CS2Script.string_stack_size], Preferences.language_code);
						return;
					}
					if (opcode == 4108) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						CS2Script.int_stack_size -= 2;
						int i_189_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_190_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						FontMetric class73 = Class129.method878(6, 0, i_190_,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
						CS2Script.int_stack[CS2Script.int_stack_size++] = class73.method466(94,
								Class243.aClass_lArray3448, i_189_, string);
						return;
					}
					if (opcode == 4109) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						CS2Script.int_stack_size -= 2;
						int i_191_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_192_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						FontMetric class73 = Class129.method878(6, 0, i_192_,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
						CS2Script.int_stack[CS2Script.int_stack_size++] = class73.method468((byte) 123, string, i_191_,
								Class243.aClass_lArray3448);
						return;
					}
					if (opcode == 4110) {
						CS2Script.string_stack_size -= 2;
						String string = CS2Script.string_stack[CS2Script.string_stack_size];
						String string_193_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
						if (CS2Script.int_stack[--CS2Script.int_stack_size] == 1)
							CS2Script.string_stack[CS2Script.string_stack_size++] = string;
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = string_193_;
							return;
						}
						return;
					}
					if (opcode == 4111) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						CS2Script.string_stack[CS2Script.string_stack_size++] = Class59_Sub3_Sub1.method2443(string,
								(byte) 90);
						return;
					}
					if (opcode == 4112) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						int i_194_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (i_194_ == -1)
							throw new RuntimeException("null char");
						CS2Script.string_stack[CS2Script.string_stack_size++] = string + (char) i_194_;
						return;
					}
					if (opcode == 4113) {
						int i_195_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class59.method402((char) i_195_, 123) ? 1 : 0;
						return;
					}
					if (opcode == 4114) {
						int i_196_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (Texture.method2700(-122, (char) i_196_) ? 1
								: 0);
						return;
					}
					if (opcode == 4115) {
						int i_197_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class133.method895(26959, (char) i_197_) ? 1
								: 0;
						return;
					}
					if (opcode == 4116) {
						int i_198_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class_w.method2652((char) i_198_, false) ? 1
								: 0;
						return;
					}
					if (opcode == 4117) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						if (string != null)
							CS2Script.int_stack[CS2Script.int_stack_size++] = string.length();
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
							return;
						}
						return;
					}
					if (opcode == 4118) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						CS2Script.int_stack_size -= 2;
						int i_199_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_200_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.string_stack[CS2Script.string_stack_size++] = string.substring(i_199_, i_200_);
						return;
					}
					if (opcode == 4119) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						StringBuffer stringbuffer = new StringBuffer(string.length());
						boolean bool_201_ = false;
						for (int i_202_ = 0; i_202_ < string.length(); i_202_++) {
							char c = string.charAt(i_202_);
							if (c == '<')
								bool_201_ = true;
							else if (c == '>')
								bool_201_ = false;
							else if (!bool_201_)
								stringbuffer.append(c);
						}
						CS2Script.string_stack[CS2Script.string_stack_size++] = stringbuffer.toString();
						return;
					}
					if (opcode == 4120) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						CS2Script.int_stack_size -= 2;
						int i_203_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_204_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = string.indexOf(i_203_, i_204_);
						return;
					}
					if (opcode == 4121) {
						CS2Script.string_stack_size -= 2;
						String string = CS2Script.string_stack[CS2Script.string_stack_size];
						String string_205_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
						int i_206_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = string.indexOf(string_205_, i_206_);
						return;
					}
					if (opcode == 4122) {
						int i_207_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Character.toLowerCase((char) i_207_);
						return;
					}
					if (opcode == 4123) {
						int i_208_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = Character.toUpperCase((char) i_208_);
						return;
					}
					if (opcode == 4124) {
						boolean bool_209_ = CS2Script.int_stack[--CS2Script.int_stack_size] != 0;
						int i_210_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.string_stack[CS2Script.string_stack_size++] = Class188.method1235(bool_209_,
								(long) i_210_, 0, -121, Preferences.language_code);
						return;
					}
					if (opcode == 4125) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						int i_211_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						FontMetric class73 = Class129.method878(6, 0, i_211_,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
						CS2Script.int_stack[CS2Script.int_stack_size++] = class73 == null ? 1
								: class73.method461(string, 67, Class243.aClass_lArray3448);
						return;
					}
				} else if (opcode < 4300) {
					if (opcode == 4200) {
						int i_212_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.string_stack[CS2Script.string_stack_size++] = (((ObjType) MapRegion.aClass191_3663
								.list(22883, i_212_)).name);
						return;
					}
					if (opcode == 4201) {
						CS2Script.int_stack_size -= 2;
						int i_213_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_214_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						ObjType class197 = MapRegion.aClass191_3663.list(22883, i_213_);
						if (i_214_ >= 1 && i_214_ <= 5 && (((ObjType) class197).options[i_214_ - 1] != null))
							CS2Script.string_stack[CS2Script.string_stack_size++] = (((ObjType) class197).options[i_214_
									- 1]);
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
					if (opcode == 4202) {
						CS2Script.int_stack_size -= 2;
						int i_215_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_216_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						ObjType class197 = MapRegion.aClass191_3663.list(22883, i_215_);
						if (i_216_ >= 1 && i_216_ <= 5 && (((ObjType) class197).ops[i_216_ - 1] != null))
							CS2Script.string_stack[CS2Script.string_stack_size++] = (((ObjType) class197).ops[i_216_
									- 1]);
						else {
							CS2Script.string_stack[CS2Script.string_stack_size++] = "";
							return;
						}
						return;
					}
					if (opcode == 4203) {
						int i_217_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = ((ObjType) MapRegion.aClass191_3663
								.list(22883, i_217_,
										revision == 0 ? Revision.CUSTOM_OSRS
												: revision == 1 ? Revision.CUSTOM_PRE_EOC_550
														: revision < 200 ? Revision.OSRS
																: revision == 550 ? Revision.PRE_EOC_550
																		: Revision.PRE_EOC_634)).cost;
						return;
					}
					if (opcode == 4204) {
						int i_218_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (((ObjType) MapRegion.aClass191_3663
								.list(22883, i_218_)).stackability == 1) ? 1 : 0;
						return;
					}
					if (opcode == 4205) {
						int i_219_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						ObjType class197 = MapRegion.aClass191_3663.list(22883, i_219_);
						if (((ObjType) class197).certTemplate == -1 && ((ObjType) class197).note >= 0)
							CS2Script.int_stack[CS2Script.int_stack_size++] = ((ObjType) class197).note;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = i_219_;
							return;
						}
						return;
					}
					if (opcode == 4206) {
						int i_220_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						ObjType class197 = MapRegion.aClass191_3663.list(22883, i_220_);
						if (((ObjType) class197).certTemplate >= 0 && ((ObjType) class197).note >= 0)
							CS2Script.int_stack[CS2Script.int_stack_size++] = ((ObjType) class197).note;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = i_220_;
							return;
						}
						return;
					}
					if (opcode == 4207) {
						int i_221_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						CS2Script.int_stack[CS2Script.int_stack_size++] = (((ObjType) MapRegion.aClass191_3663
								.list(22883, i_221_)).members) ? 1 : 0;
						return;
					}
					if (opcode == 4208) {
						CS2Script.int_stack_size -= 2;
						int i_222_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_223_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						ParamType class118 = ParamType.list(i_223_, revision);
						if (class118.is_string(115))
							CS2Script.string_stack[CS2Script.string_stack_size++] = (MapRegion.aClass191_3663
									.list(22883, i_222_).method1297(((ParamType) class118).defaultStr, -128, i_223_));
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = (MapRegion.aClass191_3663
									.list(22883, i_222_).method1289(i_223_, -115, ((ParamType) class118).default_int));
							return;
						}
						return;
					}
					if (opcode == 4209) {
						CS2Script.int_stack_size -= 2;
						int i_224_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_225_ = CS2Script.int_stack[CS2Script.int_stack_size + 1] - 1;
						ObjType class197 = MapRegion.aClass191_3663.list(22883, i_224_);
						if (((ObjType) class197).anInt2790 == i_225_)
							CS2Script.int_stack[CS2Script.int_stack_size++] = ((ObjType) class197).f_ab;
						else {
							if (((ObjType) class197).anInt2816 == i_225_)
								CS2Script.int_stack[CS2Script.int_stack_size++] = ((ObjType) class197).anInt2765;
							else {
								CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
								return;
							}
							return;
						}
						return;
					}
					if (opcode == 4210) {
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						int i_226_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						Class133.method897((byte) 105, string, i_226_ == 1);
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub38.anInt5445;
						return;
					}
					if (opcode == 4211) {
						if (Class102.aShortArray1323 == null || Class22.anInt324 >= Class246_Sub38.anInt5445)
							CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = (Class102.aShortArray1323[Class22.anInt324++]
									& 0xffff);
							return;
						}
						return;
					}
					if (opcode == 4212) {
						Class22.anInt324 = 0;
						return;
					}
					if (revision == 634) {
						if (opcode == 4214) {
							String string = CS2Script.string_stack[--CS2Script.string_stack_size];
							CS2Script.int_stack_size -= 3;
							int i_219_ = CS2Script.int_stack[CS2Script.int_stack_size];
							int i_220_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
							int i_221_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
							// Class283_Sub3.find_obj_types(i_221_, i_220_, i_219_ == 1, (byte) 126,
							// string);
							CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class122_Sub1.result_buffer_size */0;
							return;
						}
						if (opcode == 4215) {
							CS2Script.string_stack_size -= 2;
							CS2Script.int_stack_size -= 2;
							String string = CS2Script.string_stack[CS2Script.string_stack_size];
							int i_222_ = CS2Script.int_stack[CS2Script.int_stack_size];
							int i_223_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
							String string_224_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
							// Class131.method721(i_222_ == 1, i_223_, string_224_, (byte) 93, string);
							CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class122_Sub1.result_buffer_size */0;
							return;
						}
					}
				} else if (opcode < 4400) {
					if (opcode == 4300) {
						CS2Script.int_stack_size -= 2;
						int i_227_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_228_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						ParamType class118 = ParamType.list(i_228_, revision);
						if (class118.is_string(115))
							CS2Script.string_stack[CS2Script.string_stack_size++] = (Class179.aClass228_2518
									.list(i_227_)
									.method1629((byte) -116, ((ParamType) class118).defaultStr, i_228_));
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = (Class179.aClass228_2518.list(i_227_)
									.method1632(((ParamType) class118).default_int, i_228_, 0));
							return;
						}
						return;
					}
				} else if (opcode < 4500) {
					if (opcode == 4400) {
						CS2Script.int_stack_size -= 2;
						int i_229_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_230_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						ParamType class118 = ParamType.list(i_230_, revision);
						if (class118.is_string(115))
							CS2Script.string_stack[CS2Script.string_stack_size++] = (Class143.aClass251_2067
									.list(i_229_, 0).method1218(-126, ((ParamType) class118).defaultStr, i_230_));
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = (Class143.aClass251_2067.list(i_229_, 0)
									.method1206(i_230_, (byte) 85, ((ParamType) class118).default_int));
							return;
						}
						return;
					}
				} else if (opcode < 4600) {
					if (opcode == 4500) {
						CS2Script.int_stack_size -= 2;
						int i_231_ = CS2Script.int_stack[CS2Script.int_stack_size];
						int i_232_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
						ParamType class118 = ParamType.list(i_232_, revision);
						if (class118.is_string(115))
							CS2Script.string_stack[CS2Script.string_stack_size++] = (Class246_Sub28_Sub25.struct_loader
									.list(i_231_, -24).method2831(-16471, ((ParamType) class118).defaultStr, i_232_));
						else {
							CS2Script.int_stack[CS2Script.int_stack_size++] = (Class246_Sub28_Sub25.struct_loader
									.list(i_231_, -24).method2830(((ParamType) class118).default_int, 76, i_232_));
							return;
						}
						return;
					}
				} else if (opcode < 4700 && opcode == 4600) {
					int i_233_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					RenderAnimation class135 = ParamType.aClass_v1641.list(false, i_233_);
					if (((RenderAnimation) class135).anIntArray1910 != null
							&& ((RenderAnimation) class135).anIntArray1910.length > 0) {
						int i_234_ = 0;
						int i_235_ = ((RenderAnimation) class135).anIntArray1916[0];
						for (int i_236_ = 1; i_236_ < ((RenderAnimation) class135).anIntArray1910.length; i_236_++) {
							if (((RenderAnimation) class135).anIntArray1916[i_236_] > i_235_) {
								i_234_ = i_236_;
								i_235_ = ((RenderAnimation) class135).anIntArray1916[i_236_];
							}
						}
						CS2Script.int_stack[CS2Script.int_stack_size++] = ((RenderAnimation) class135).anIntArray1910[i_234_];
					} else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = ((RenderAnimation) class135).stand_sequence;
						return;
					}
					return;
				}
			}
			throw new IllegalStateException();
		} catch (IllegalStateException ex) {
			System.out.println("[ScriptExecutor] Unhandled opcode=" + opcode + "" + " for widget " + widget_id
					+ " using revision " + revision + ")");
		}
	}

	private static final void method983(int i, int revision) {
		Widget class235 = Widget.get_widget(i, revision);
		if (class235 != null) {
			int i_237_ = i >>> 16;
			Widget[] class235s;
			class235s = Widget.get_some_widgets(revision)[i_237_];
			if (class235s == null) {
				Widget[] class235s_238_;
				class235s_238_ = Widget.get_some_widgets(revision)[i_237_];
				int i_239_ = class235s_238_.length;
				class235s = Widget.get_some_widgets(revision)[i_237_] = new Widget[i_239_];
				Class117.method807(class235s_238_, 0, class235s, 0, class235s_238_.length);
			}
			int i_240_;
			for (i_240_ = 0; i_240_ < class235s.length; i_240_++) {
				if (class235s[i_240_] == class235)
					break;
			}
			if (i_240_ < class235s.length) {
				Class117.method807(class235s, i_240_ + 1, class235s, i_240_, class235s.length - i_240_ - 1);
				class235s[class235s.length - 1] = class235;
			}
		}
	}

	private static final void method984(int i, int revision) {
		Widget class235 = Widget.get_widget(i, revision);
		if (class235 != null) {
			int i_241_ = i >>> 16;
			Widget[] class235s;
			class235s = Widget.get_some_widgets(revision)[i_241_];
			if (class235s == null) {
				Widget[] class235s_242_;
				class235s_242_ = Widget.get_some_widgets(revision)[i_241_];
				int i_243_ = class235s_242_.length;
				class235s = Widget.get_some_widgets(revision)[i_241_] = new Widget[i_243_];
				Class117.method807(class235s_242_, 0, class235s, 0, class235s_242_.length);
			}
			int i_244_;
			for (i_244_ = 0; i_244_ < class235s.length; i_244_++) {
				if (class235s[i_244_] == class235)
					break;
			}
			if (i_244_ < class235s.length) {
				Class117.method807(class235s, 0, class235s, 1, i_244_);
				class235s[0] = class235;
			}
		}
	}

	static final void method985(String string, int i) {
		if (Client.staff_level != 0 || ((!Class59.aBool820 || Class_u.aBool4703) && !Class168.aBool2395)) {
			String string_245_ = string.toLowerCase();
			int i_246_ = 0;
			if (string_245_.startsWith(Class_q.aClass67_4686.get(0))) {
				i_246_ = 0;
				string = string.substring(Class_q.aClass67_4686.get(0).length());
			} else if (string_245_.startsWith(Class232.aClass67_3178.get(0))) {
				i_246_ = 1;
				string = string.substring(Class232.aClass67_3178.get(0).length());
			} else if (string_245_.startsWith(Class246_Sub1_Sub10.aClass67_6224.get(0))) {
				i_246_ = 2;
				string = string.substring(Class246_Sub1_Sub10.aClass67_6224.get(0).length());
			} else if (string_245_.startsWith(Class83.aClass67_1081.get(0))) {
				i_246_ = 3;
				string = string.substring(Class83.aClass67_1081.get(0).length());
			} else if (string_245_.startsWith(Class188_Sub1.aClass67_3924.get(0))) {
				i_246_ = 4;
				string = string.substring(Class188_Sub1.aClass67_3924.get(0).length());
			} else if (string_245_.startsWith(RenderSequenceLoader.aClass67_1447.get(0))) {
				i_246_ = 5;
				string = string.substring(RenderSequenceLoader.aClass67_1447.get(0).length());
			} else if (string_245_.startsWith(Class130_Sub1_Sub1.aClass67_7047.get(0))) {
				i_246_ = 6;
				string = string.substring(Class130_Sub1_Sub1.aClass67_7047.get(0).length());
			} else if (string_245_.startsWith(Class231.aClass67_3171.get(0))) {
				i_246_ = 7;
				string = string.substring(Class231.aClass67_3171.get(0).length());
			} else if (string_245_.startsWith(Class246_Sub1_Sub9.aClass67_6177.get(0))) {
				i_246_ = 8;
				string = string.substring(Class246_Sub1_Sub9.aClass67_6177.get(0).length());
			} else if (string_245_.startsWith(Class102.aClass67_1320.get(0))) {
				i_246_ = 9;
				string = string.substring(Class102.aClass67_1320.get(0).length());
			} else if (string_245_.startsWith(InvTypeLoader.aClass67_844.get(0))) {
				i_246_ = 10;
				string = string.substring(InvTypeLoader.aClass67_844.get(0).length());
			} else if (string_245_.startsWith(ContextMenus.aClass67_6576.get(0))) {
				i_246_ = 11;
				string = string.substring(ContextMenus.aClass67_6576.get(0).length());
			} else if (Preferences.language_code != 0) {
				if (string_245_.startsWith(Class_q.aClass67_4686.get(Preferences.language_code))) {
					i_246_ = 0;
					string = string.substring(Class_q.aClass67_4686.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class232.aClass67_3178.get(Preferences.language_code))) {
					i_246_ = 1;
					string = string.substring(Class232.aClass67_3178.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class246_Sub1_Sub10.aClass67_6224.get(Preferences.language_code))) {
					i_246_ = 2;
					string = string
							.substring(Class246_Sub1_Sub10.aClass67_6224.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class83.aClass67_1081.get(Preferences.language_code))) {
					i_246_ = 3;
					string = string.substring(Class83.aClass67_1081.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class188_Sub1.aClass67_3924.get(Preferences.language_code))) {
					i_246_ = 4;
					string = string.substring(Class188_Sub1.aClass67_3924.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(RenderSequenceLoader.aClass67_1447.get(Preferences.language_code))) {
					i_246_ = 5;
					string = string
							.substring(RenderSequenceLoader.aClass67_1447.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class130_Sub1_Sub1.aClass67_7047.get(Preferences.language_code))) {
					i_246_ = 6;
					string = string.substring(Class130_Sub1_Sub1.aClass67_7047.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class231.aClass67_3171.get(Preferences.language_code))) {
					i_246_ = 7;
					string = string.substring(Class231.aClass67_3171.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class246_Sub1_Sub9.aClass67_6177.get(Preferences.language_code))) {
					i_246_ = 8;
					string = string.substring(Class246_Sub1_Sub9.aClass67_6177.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class102.aClass67_1320.get(Preferences.language_code))) {
					i_246_ = 9;
					string = string.substring(Class102.aClass67_1320.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(InvTypeLoader.aClass67_844.get(Preferences.language_code))) {
					i_246_ = 10;
					string = string.substring(InvTypeLoader.aClass67_844.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(ContextMenus.aClass67_6576.get(Preferences.language_code))) {
					i_246_ = 11;
					string = string.substring(ContextMenus.aClass67_6576.get(Preferences.language_code).length());
				}
			}
			string_245_ = string.toLowerCase();
			int i_247_ = 0;
			if (string_245_.startsWith(Class133.aClass67_1843.get(0))) {
				i_247_ = 1;
				string = string.substring(Class133.aClass67_1843.get(0).length());
			} else if (string_245_.startsWith(Class53.aClass67_754.get(0))) {
				i_247_ = 2;
				string = string.substring(Class53.aClass67_754.get(0).length());
			} else if (string_245_.startsWith(Class216.aClass67_3006.get(0))) {
				i_247_ = 3;
				string = string.substring(Class216.aClass67_3006.get(0).length());
			} else if (string_245_.startsWith(Class83.aClass67_1084.get(0))) {
				i_247_ = 4;
				string = string.substring(Class83.aClass67_1084.get(0).length());
			} else if (string_245_.startsWith(Class159.aClass67_2259.get(0))) {
				i_247_ = 5;
				string = string.substring(Class159.aClass67_2259.get(0).length());
			} else if (Preferences.language_code != 0) {
				if (string_245_.startsWith(Class133.aClass67_1843.get(Preferences.language_code))) {
					i_247_ = 1;
					string = string.substring(Class133.aClass67_1843.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class53.aClass67_754.get(Preferences.language_code))) {
					i_247_ = 2;
					string = string.substring(Class53.aClass67_754.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class216.aClass67_3006.get(Preferences.language_code))) {
					i_247_ = 3;
					string = string.substring(Class216.aClass67_3006.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class83.aClass67_1084.get(Preferences.language_code))) {
					i_247_ = 4;
					string = string.substring(Class83.aClass67_1084.get(Preferences.language_code).length());
				} else if (string_245_.startsWith(Class159.aClass67_2259.get(Preferences.language_code))) {
					i_247_ = 5;
					string = string.substring(Class159.aClass67_2259.get(Preferences.language_code).length());
				}
			}
			anInt2119++;
			Class243.writePacket(-59, Class246_Sub6.aClass201_3940);
			Class130_Sub1.stream.writeByte(255, 0);
			int i_248_ = ((Buffer) Class130_Sub1.stream).position;
			if (i == 5021)
				Class130_Sub1.stream.writeByte(255, 1);
			else if (i == 5022)
				Class130_Sub1.stream.writeByte(255, 2);
			else
				Class130_Sub1.stream.writeByte(255, 0);
			Class130_Sub1.stream.writeByte(255, i_246_);
			Class130_Sub1.stream.writeByte(255, i_247_);
			Class59_Sub3_Sub4.method2867(string, 0, Class130_Sub1.stream);
			Class130_Sub1.stream.method2408(-1591647264, ((Buffer) Class130_Sub1.stream).position - i_248_);
		}
	}

	public static void method986() {
		int_var_count = null;
		string_var_count = null;
		array_lengths = null;
		arrays = null;
		CS2Script.int_stack = null;
		CS2Script.string_stack = null;
		SubScript.subscripts = null;
		Widget.static_active_component2 = null;
		Widget.static_active_component1 = null;
		aClass244_2120 = null;
		aCalendar2132 = null;
		aStringArray2141 = null;
		anIntArray2140 = null;
		aClass54_2139 = null;
	}

	static final void method987() {
		/* empty */
	}

	static final void excute_script_event(ScriptEvent script_event, Widget widget) {
		run_script(script_event, 500000, -1, widget.revision);
	}

	static final void method989(int i, boolean bool) {
		/* empty */
	}

	static final CS2Script list(int script_id, int revision) {
		Class113.anInt1591++;
		CS2Script script;
		if (revision == 0) {
			script = ((CS2Script) Class109_Sub3.cs2_cache_osrs.get((long) script_id));
		} else if (revision == 1) {
			script = ((CS2Script) Class109_Sub3.cs2_cache_550.get((long) script_id));
		} else if (revision < 200) {
			script = ((CS2Script) Class109_Sub3.cs2_cache_osrs.get((long) script_id));
		} else if (revision == 550) {
			script = ((CS2Script) Class109_Sub3.cs2_cache_550.get((long) script_id));
		} else {
			script = ((CS2Script) Class109_Sub3.cs2_cache.get((long) script_id));
		}
		if (script != null)
			return script;
		byte[] data;
		if (revision == 0) {
			data = Cache.get_index(Revision.CUSTOM_OSRS, "cs2").get_file(0, script_id);
		} else if (revision == 1) {
			data = Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "cs2").get_file(0, script_id);
		} else if (revision < 200) {
			data = Cache.get_index(Revision.OSRS, "cs2").get_file(0, script_id);
		} else if (revision == 550) {
			data = Cache.get_index(Revision.PRE_EOC_550, "cs2").get_file(0, script_id);
		} else {
			data = Cache.get_index(Revision.PRE_EOC_634, "cs2").get_file(0, script_id);
		}
		if (data == null || data.length <= 1)
			return null;
		if (revision != 1 && revision < 200) {
			script = Class122.decode(data);
		} else {
			script = Class122.decode((byte) 112, data);
		}
		script.id = script_id;
		if (revision == 0) {
			Class109_Sub3.cs2_cache_osrs.method869((long) script_id, script, -8869);
		} else if (revision == 1) {
			Class109_Sub3.cs2_cache_550.method869((long) script_id, script, -8869);
		} else if (revision < 200) {
			Class109_Sub3.cs2_cache_osrs.method869((long) script_id, script, -8869);
		} else if (revision == 550) {
			Class109_Sub3.cs2_cache_550.method869((long) script_id, script, -8869);
		} else {
			Class109_Sub3.cs2_cache.method869((long) script_id, script, -8869);
		}
		return script;
	}

	public static ArrayList<Integer> current_opcodes = new ArrayList<>();

	private static final void execute_script(CS2Script script, int i, int scriptid, int widget_id, int revision) {
		CS2Script.int_stack_size = 0;
		CS2Script.string_stack_size = 0;
		int opcode_index = -1;
		int[] opcodes = ((CS2Script) script).opcodes;
		int[] int_values = ((CS2Script) script).integer_operands;
		int opcode = -1;
		SubScript.subscript_pos = 0;
		int i_476_ = 0;
		for (;;) {

			if (++i_476_ > i)
				throw new RuntimeException("slow");
			opcode = opcodes[++opcode_index];
			/*
			 * if (scriptid == 925) {
			 * if (!current_opcodes.contains(opcode)) {
			 * current_opcodes.add(opcode);
			 * }
			 * //System.out.println("opcodes: " + current_opcodes);
			 * }
			 */
			try {
				if (opcode < 100) {
					if (opcode == 0) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = int_values[opcode_index];
					} else if (opcode == 1) {
						int key = int_values[opcode_index];
						int value;
						if (revision == 0) {
							value = VarpType.varp_cache_osrs[key];
						} else if (revision == 1) {
							value = VarpType.varp_cache_550[key];
						} else if (revision < 200) {
							value = VarpType.varp_cache_osrs[key];
						} else if (revision == 550) {
							value = VarpType.varp_cache_550[key];
						} else {
							value = VarpType.varp_cache_634[key];
						}
						CS2Script.int_stack[CS2Script.int_stack_size++] = value;
					} else if (opcode == 2) {
						int varp_id = int_values[opcode_index];
						int val = CS2Script.int_stack[--CS2Script.int_stack_size];
						Varbit.aClass95_6658.setIntVarp(varp_id, val, revision);
					} else if (opcode == 3) {
						CS2Script.string_stack[CS2Script.string_stack_size++] = (((CS2Script) script).string_operands[opcode_index]);
					} else if (opcode == 6) {
						opcode_index += int_values[opcode_index];
					} else if (opcode == 7) {
						CS2Script.int_stack_size -= 2;
						if (CS2Script.int_stack[CS2Script.int_stack_size] != CS2Script.int_stack[CS2Script.int_stack_size
								+ 1]) {
							opcode_index += int_values[opcode_index];
						}
					} else if (opcode == 8) {
						CS2Script.int_stack_size -= 2;
						if (CS2Script.int_stack[CS2Script.int_stack_size] == CS2Script.int_stack[CS2Script.int_stack_size
								+ 1]) {
							opcode_index += int_values[opcode_index];
						}
					} else if (opcode == 9) {
						CS2Script.int_stack_size -= 2;
						if (CS2Script.int_stack[CS2Script.int_stack_size] < CS2Script.int_stack[CS2Script.int_stack_size
								+ 1]) {
							opcode_index += int_values[opcode_index];
						}
					} else if (opcode == 10) {
						CS2Script.int_stack_size -= 2;
						if (CS2Script.int_stack[CS2Script.int_stack_size] > CS2Script.int_stack[CS2Script.int_stack_size
								+ 1]) {
							opcode_index += int_values[opcode_index];
						}
					} else if (opcode == 21) {
						if (SubScript.subscript_pos == 0)
							return;
						SubScript class_b = SubScript.subscripts[--SubScript.subscript_pos];
						script = ((SubScript) class_b).script;
						opcodes = (((CS2Script) script).opcodes);
						int_values = (((CS2Script) script).integer_operands);
						opcode_index = ((SubScript) class_b).opcode_index;
						int_var_count = ((SubScript) class_b).int_local_variables;
						string_var_count = ((SubScript) class_b).string_local_variables;
					} else if (opcode == 25) {
						int id = int_values[opcode_index];
						int val = Varbit.aClass95_6658.getVarBitValue((byte) 45, id, revision);
						CS2Script.int_stack[CS2Script.int_stack_size++] = val;
					} else if (opcode == 27) {
						int varbit_id = int_values[opcode_index];
						int varbit_value = CS2Script.int_stack[--CS2Script.int_stack_size];
						Varbit.aClass95_6658.method611(varbit_id, (byte) 108, varbit_value, revision);
					} else if (opcode == 31) {
						CS2Script.int_stack_size -= 2;
						if (CS2Script.int_stack[CS2Script.int_stack_size] <= CS2Script.int_stack[CS2Script.int_stack_size
								+ 1])
							opcode_index += int_values[opcode_index];
					} else if (opcode == 32) {
						CS2Script.int_stack_size -= 2;
						if (CS2Script.int_stack[CS2Script.int_stack_size] >= CS2Script.int_stack[CS2Script.int_stack_size
								+ 1])
							opcode_index += int_values[opcode_index];
					} else if (opcode == 33)
						CS2Script.int_stack[CS2Script.int_stack_size++] = int_var_count[int_values[opcode_index]];
					else if (opcode == 34)
						int_var_count[int_values[opcode_index]] = CS2Script.int_stack[--CS2Script.int_stack_size];
					else if (opcode == 35)
						CS2Script.string_stack[CS2Script.string_stack_size++] = string_var_count[int_values[opcode_index]];
					else if (opcode == 36)
						string_var_count[int_values[opcode_index]] = CS2Script.string_stack[--CS2Script.string_stack_size];
					else if (opcode == 37) {
						int i_257_ = int_values[opcode_index];
						CS2Script.string_stack_size -= i_257_;
						String string = Class244.method1571(CS2Script.string_stack_size, CS2Script.string_stack,
								(byte) 123, i_257_);
						CS2Script.string_stack[CS2Script.string_stack_size++] = string;
					} else if (opcode == 38)
						CS2Script.int_stack_size--;
					else if (opcode == 39)
						CS2Script.string_stack_size--;
					else if (opcode == 40) {
						int script_id = int_values[opcode_index];
						CS2Script cached_script = ScriptExecutor.list(script_id, revision);
						int[] intArguments = (new int[(((CS2Script) cached_script).int_var_count)]);
						String[] stringArguments = (new String[(((CS2Script) cached_script).string_var_count)]);
						for (int i_261_ = 0; (i_261_ < (((CS2Script) cached_script).int_param_count)); i_261_++) {
							intArguments[i_261_] = (CS2Script.int_stack[CS2Script.int_stack_size
									- (((CS2Script) cached_script).int_param_count) + i_261_]);
						}
						for (int i_262_ = 0; (i_262_ < (((CS2Script) cached_script).string_param_count)); i_262_++) {
							stringArguments[i_262_] = (CS2Script.string_stack[CS2Script.string_stack_size
									- (((CS2Script) cached_script).string_param_count) + i_262_]);
						}
						CS2Script.int_stack_size -= (((CS2Script) cached_script).int_param_count);
						CS2Script.string_stack_size -= (((CS2Script) cached_script).string_param_count);
						SubScript sub_script = new SubScript();
						((SubScript) sub_script).script = script;
						((SubScript) sub_script).opcode_index = opcode_index;
						((SubScript) sub_script).int_local_variables = int_var_count;
						((SubScript) sub_script).string_local_variables = string_var_count;
						SubScript.subscripts[SubScript.subscript_pos++] = sub_script;
						script = cached_script;
						opcodes = (((CS2Script) script).opcodes);
						int_values = (((CS2Script) script).integer_operands);
						opcode_index = -1;
						int_var_count = intArguments;
						string_var_count = stringArguments;
					} else if (opcode == 42) {
						int varc_value;
						if (revision == 0) {
							varc_value = Varc.varcs_osrs[int_values[opcode_index]];
						} else if (revision == 1) {
							varc_value = Varc.varcs_550[int_values[opcode_index]];
						} else if (revision < 200) {
							varc_value = Varc.varcs_osrs[int_values[opcode_index]];
						} else if (revision == 550) {
							varc_value = Varc.varcs_550[int_values[opcode_index]];
						} else {
							varc_value = Varc.varcs_634[int_values[opcode_index]];
						}

						CS2Script.int_stack[CS2Script.int_stack_size++] = varc_value;
					} else if (opcode == 43) {
						int varc_id = int_values[opcode_index];
						int varc_value = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (varc_id == 176) { // DISABLE animated world on login
							varc_value = 0;
						}
						if (revision == 0) {
							Varc.varcs_osrs[varc_id] = varc_value;
						} else if (revision == 1) {
							Varc.varcs_550[varc_id] = varc_value;
						} else if (revision < 200) {
							Varc.varcs_osrs[varc_id] = varc_value;
						} else if (revision == 550) {
							Varc.varcs_550[varc_id] = varc_value;
						} else {
							Varc.varcs_634[varc_id] = varc_value;
						}
						Class18.method175(varc_id, -117);
						Class246_Sub28_Sub10.aBool6159 |= (revision != 1 && revision < 200
								? Class59_Sub3_Sub1.varcs_loaded_osrs[varc_id]
								: (revision == 1 || revision == 550) ? Class59_Sub3_Sub1.varcs_loaded_550[varc_id]
										: Class59_Sub3_Sub1.varcs_loaded_634[varc_id]);
					} else if (opcode == 44) {
						int i_264_ = int_values[opcode_index] >> 16;
						int i_265_ = int_values[opcode_index] & 0xffff;
						int i_266_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (i_266_ < 0 || i_266_ > 5000)
							throw new RuntimeException();
						array_lengths[i_264_] = i_266_;
						int i_267_ = -1;
						if (i_265_ == 105)
							i_267_ = 0;
						for (int i_268_ = 0; i_268_ < i_266_; i_268_++)
							arrays[i_264_][i_268_] = i_267_;
					} else if (opcode == 45) {
						int i_269_ = int_values[opcode_index];
						int i_270_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						if (i_270_ < 0 || i_270_ >= array_lengths[i_269_])
							throw new RuntimeException();
						CS2Script.int_stack[CS2Script.int_stack_size++] = arrays[i_269_][i_270_];
					} else if (opcode == 46) {
						int i_271_ = int_values[opcode_index];
						CS2Script.int_stack_size -= 2;
						int i_272_ = CS2Script.int_stack[CS2Script.int_stack_size];
						if (i_272_ < 0 || i_272_ >= array_lengths[i_271_])
							throw new RuntimeException();
						arrays[i_271_][i_272_] = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					} else if (opcode == 47) {
						String string = "";
						if (revision == 0) {
							string = Filestore.aClass94Array1739_osrs[int_values[opcode_index]];
						} else if (revision == 1) {
							string = Filestore.aClass94Array1739_550[int_values[opcode_index]];
						} else if (revision < 200) {
							string = Filestore.aClass94Array1739_osrs[int_values[opcode_index]];
						} else if (revision == 550) {
							string = Filestore.aClass94Array1739_550[int_values[opcode_index]];
						} else {
							string = Filestore.aClass94Array1739[int_values[opcode_index]];
						}

						if (string == null)
							string = "null";
						CS2Script.string_stack[CS2Script.string_stack_size++] = string;
					} else if (opcode == 48) {
						int i_273_ = int_values[opcode_index];
						if (revision == 0) {
							Filestore.aClass94Array1739_osrs[i_273_] = CS2Script.string_stack[--CS2Script.string_stack_size];
						} else if (revision == 1) {
							Filestore.aClass94Array1739_550[i_273_] = CS2Script.string_stack[--CS2Script.string_stack_size];
						} else if (revision < 200) {
							Filestore.aClass94Array1739_osrs[i_273_] = CS2Script.string_stack[--CS2Script.string_stack_size];
						} else if (revision == 550) {
							Filestore.aClass94Array1739_550[i_273_] = CS2Script.string_stack[--CS2Script.string_stack_size];
						} else {
							Filestore.aClass94Array1739[i_273_] = CS2Script.string_stack[--CS2Script.string_stack_size];
						}

						Class130_Sub6.method2102(2, i_273_);
					} else if (revision != 1 && revision < 200 && opcode == ScriptOpcodes.GET_VARC_STRING) {
						CS2Script.string_stack[++CS2Script.string_stack_size
								- 1] = Filestore.aClass94Array1739_osrs[int_values[opcode_index]];
					} else if (revision != 1 && revision < 200 && opcode == ScriptOpcodes.SET_VARC_STRING) {
						String val = CS2Script.string_stack[--CS2Script.string_stack_size];
						Filestore.aClass94Array1739_osrs[int_values[opcode_index]] = val;
					} else if (opcode == 51) {
						IterableNodeHashTable class85 = (((CS2Script) script).switches[int_values[opcode_index]]);
						int var = --CS2Script.int_stack_size;
						if (var != -1) {
							int val = CS2Script.int_stack[var];
							if (val != -1) {
								SwitchInt class246_sub33 = ((SwitchInt) class85.get((long) (val)));
								if (class246_sub33 != null)
									opcode_index += ((SwitchInt) class246_sub33).value;
							}
						}
					} else {
						if (revision != 1 && revision < 200) {
							if (opcode == 60) {
								int some_int = CS2Script.int_stack[--CS2Script.int_stack_size];
							}
						}
					}
				} else {
					boolean bool;
					if (int_values[opcode_index] == 1) {
						bool = true;
					} else {
						bool = false;
					}

					if (revision != 1 && revision < 200) {
						int return_code = CS2Script.decode(opcode, script, bool, revision);
						switch (return_code) {

							case 0:
								return;

							case 1:
							default:
								break;

							case 2:
								System.err.println("Opcode " + opcode + " is unhandled.");
						}
					} else {
						if (opcode >= 100 && opcode < 5000) {
							process_op(opcode, bool, widget_id, revision);
						} else {
							if (opcode < 5000 || opcode >= 10000) {
								break;
							}
							process_new_op(opcode, bool, revision);
						}
					}
				}
			} catch (Exception e) {
				System.err.println("error opcode " + opcode + ", widget: " + widget_id + ", rev: " + revision);
			}
		}
		// throw new IllegalStateException("Command: " + opcode);
	}

	static final void execute_on_load_script(int widget_id, int revision) {
		if (Widget.load_widget(widget_id, revision, 0)) {
			Widget[] widgets = Widget.get_widget_cache(revision)[widget_id];
			for (int child = 0; child < widgets.length; child++) {
				Widget widget = widgets[child];
				if (widget.on_load_listener != null) {
					ScriptEvent script_event = new ScriptEvent();
					script_event.source = widget;
					script_event.params = widget.on_load_listener;
					run_script(script_event, 5000000, widget_id, revision);
				}
			}
		}
	}

	private static final void process_new_op(int opcode, boolean bool, int revision) {
		if (opcode < 5100) {
			if (opcode == 5000) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Client.public_chat_mode;
				return;
			}
			if (opcode == 5001) {
				CS2Script.int_stack_size -= 3;
				Client.public_chat_mode = CS2Script.int_stack[CS2Script.int_stack_size];
				Client.private_chat_mode = Class1.method36(0, CS2Script.int_stack[CS2Script.int_stack_size + 1]);
				if (Client.private_chat_mode == null)
					Client.private_chat_mode = Class43.aClass87_638;
				Client.trade_chat_mode = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				anInt2116++;
				Class243.writePacket(-101, Class187_Sub2.aClass201_5426);
				Class130_Sub1.stream.writeByte(255, Client.public_chat_mode);
				Class130_Sub1.stream.writeByte(255, ((Class87) Client.private_chat_mode).field4597);
				Class130_Sub1.stream.writeByte(255, Client.trade_chat_mode);
				return;
			}
			if (opcode == 5002) {
				CS2Script.string_stack_size -= 2;
				String string = CS2Script.string_stack[CS2Script.string_stack_size];
				String string_277_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
				CS2Script.int_stack_size -= 2;
				int i_278_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_279_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (string_277_ == null)
					string_277_ = "";
				if (string_277_.length() > 80)
					string_277_ = string_277_.substring(0, 80);
				anInt2121++;
				Class243.writePacket(-114, Class211_Sub1_Sub2.aClass201_6528);
				Class130_Sub1.stream.writeByte(255,
						(Class145.method978(string, (byte) -92) + 2 + Class145.method978(string_277_, (byte) -128)));
				Class130_Sub1.stream.writeString(91, string);
				Class130_Sub1.stream.writeByte(255, i_278_ - 1);
				Class130_Sub1.stream.writeByte(255, i_279_);
				Class130_Sub1.stream.writeString(125, string_277_);
				return;
			}
			if (opcode == 5003) {
				int i_280_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				String string = null;
				if (i_280_ < 100)
					string = Class246_Sub1_Sub2.aStringArray5688[i_280_];
				if (string == null)
					string = "";
				CS2Script.string_stack[CS2Script.string_stack_size++] = string;
				return;
			}
			if (opcode == 5004) {
				int i_281_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				int i_282_ = -1;
				if (i_281_ < 100 && Class246_Sub1_Sub2.aStringArray5688[i_281_] != null)
					i_282_ = Class186.anIntArray2639[i_281_];
				CS2Script.int_stack[CS2Script.int_stack_size++] = i_282_;
				return;
			}
			if (opcode == 5005) {
				if (Client.private_chat_mode == null)
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class87) Client.private_chat_mode).field4597;
					return;
				}
				return;
			}
			if (revision == 634) {
				if (opcode == 5006) {
					int i_251_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					// Class292.method1671(1, Class271_Sub7.SEND_CHAT_TYPE_PACKET);
					// Class121_Sub49_Sub24.packet.writeByte((byte) -106, i_251_);
					return;
				}
			}
			if (opcode == 5008 || opcode == 5021 || opcode == 5022) {
				String string = CS2Script.string_stack[--CS2Script.string_stack_size];
				method985(string, opcode);
				return;
			}
			if (opcode == 5009) {
				CS2Script.string_stack_size -= 2;
				String string = CS2Script.string_stack[CS2Script.string_stack_size];
				String string_283_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
				if (Client.staff_level != 0 || ((!Class59.aBool820 || Class_u.aBool4703) && !Class168.aBool2395)) {
					anInt2124++;
					Class243.writePacket(-70, Class170.aClass201_2420);
					Class130_Sub1.stream.writeByte(255, 0);
					int i_284_ = ((Buffer) Class130_Sub1.stream).position;
					Class130_Sub1.stream.writeString(85, string);
					Class59_Sub3_Sub4.method2867(string_283_, 0, (Class130_Sub1.stream));
					Class130_Sub1.stream.method2408(-1591647264, (((Buffer) Class130_Sub1.stream).position - i_284_));
					return;
				}
				return;
			}
			if (opcode == 5010) {
				int i_285_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				String string = null;
				if (i_285_ < 100)
					string = Class196.aStringArray2750[i_285_];
				if (string == null)
					string = "";
				CS2Script.string_stack[CS2Script.string_stack_size++] = string;
				return;
			}
			if (opcode == 5011) {
				int i_286_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				String string = null;
				if (i_286_ < 100)
					string = Class246_Sub41_Sub2.aStringArray6478[i_286_];
				if (string == null)
					string = "";
				CS2Script.string_stack[CS2Script.string_stack_size++] = string;
				return;
			}
			if (opcode == 5012) {
				int i_287_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				int i_288_ = -1;
				if (i_287_ < 100)
					i_288_ = Class246_Sub22.anIntArray4773[i_287_];
				CS2Script.int_stack[CS2Script.int_stack_size++] = i_288_;
				return;
			}
			if (opcode == 5015) {
				String string;
				if (Client.local_player != null && (((Player) Client.local_player).username != null))
					string = Client.local_player.get_name(120, true);
				else
					string = LoginScreen.username;
				CS2Script.string_stack[CS2Script.string_stack_size++] = string;
				return;
			}
			if (opcode == 5016) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Client.trade_chat_mode;
				return;
			}
			if (opcode == 5017) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class224.anInt3092;
				return;
			}
			if (opcode == 5018) {
				int i_289_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				int i_290_ = 0;
				if (i_289_ < 100 && Class246_Sub1_Sub2.aStringArray5688[i_289_] != null)
					i_290_ = Class186.anIntArray2639[i_289_];
				CS2Script.int_stack[CS2Script.int_stack_size++] = i_290_;
				return;
			}
			if (opcode == 5019) {
				int i_291_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				String string = null;
				if (i_291_ < 100)
					string = Class246_Sub15.aStringArray4446[i_291_];
				if (string == null)
					string = "";
				CS2Script.string_stack[CS2Script.string_stack_size++] = string;
				return;
			}
			if (opcode == 5020) {
				String string;
				if (Client.local_player != null && (((Player) Client.local_player).username != null))
					string = Client.local_player.method2919(false, 1);
				else
					string = LoginScreen.username;
				CS2Script.string_stack[CS2Script.string_stack_size++] = string;
				return;
			}
			if (revision == 634) {
				if (opcode == 5023) {
					int i_261_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					/*
					 * Class251 class251 = Class288.method1639(0, i_261_); int i_262_ = -1; if
					 * (class251 != null) { i_262_ = ((Class251) class251).anInt3164; }
					 */
					CS2Script.int_stack[CS2Script.int_stack_size++] = /* i_262_ */0;
					return;
				}
				if (opcode == 5024) {
					int i_263_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					/*
					 * Class251 class251 = Class288.method1639(0, i_263_); int i_264_ = -1; if
					 * (class251 != null) { i_264_ = ((Class251) class251).anInt3177; }
					 */
					CS2Script.int_stack[CS2Script.int_stack_size++] = /* i_264_ */0;
					return;
				}
				if (opcode == 5025) {
					int i_265_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					/*
					 * Class251 class251 = Class288.method1639(0, i_265_); String string = ""; if
					 * (class251 != null && ((Class251) class251).aString3167 != null) { string =
					 * ((Class251) class251).aString3167; }
					 */
					CS2Script.string_stack[CS2Script.string_stack_size++] = /* string */"bush did 615";
					return;
				}
			}
			if (opcode == 5050) {
				int i_292_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				CS2Script.string_stack[CS2Script.string_stack_size++] = (((Class246_Sub1_Sub16) Class224.aClass50_3096
						.method329(i_292_, (byte) 96)).aString6693);
				return;
			}
			if (opcode == 5051) {
				int i_293_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub1_Sub16 class246_sub1_sub16 = Class224.aClass50_3096.method329(i_293_, (byte) -114);
				if (((Class246_Sub1_Sub16) class246_sub1_sub16).anIntArray6698 == null)
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub16) class246_sub1_sub16).anIntArray6698).length;
					return;
				}
				return;
			}
			if (opcode == 5052) {
				CS2Script.int_stack_size -= 2;
				int i_294_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_295_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				Class246_Sub1_Sub16 class246_sub1_sub16 = Class224.aClass50_3096.method329(i_294_, (byte) 107);
				int i_296_ = (((Class246_Sub1_Sub16) class246_sub1_sub16).anIntArray6698[i_295_]);
				CS2Script.int_stack[CS2Script.int_stack_size++] = i_296_;
				return;
			}
			if (opcode == 5053) {
				int i_297_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub1_Sub16 class246_sub1_sub16 = Class224.aClass50_3096.method329(i_297_, (byte) -98);
				if (((Class246_Sub1_Sub16) class246_sub1_sub16).anIntArray6684 == null)
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub16) class246_sub1_sub16).anIntArray6684).length;
					return;
				}
				return;
			}
			if (opcode == 5054) {
				CS2Script.int_stack_size -= 2;
				int i_298_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_299_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub16) Class224.aClass50_3096
						.method329(i_298_, (byte) 113)).anIntArray6684[i_299_]);
				return;
			}
			if (opcode == 5055) {
				int i_300_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				CS2Script.string_stack[CS2Script.string_stack_size++] = Class128_Sub1.aClass65_5558
						.method428(i_300_, (byte) -99).method2431(0);
				return;
			}
			if (opcode == 5056) {
				int i_301_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub1_Sub3 class246_sub1_sub3 = Class128_Sub1.aClass65_5558.method428(i_301_, (byte) -99);
				if (((Class246_Sub1_Sub3) class246_sub1_sub3).anIntArray5699 == null)
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub3) class246_sub1_sub3).anIntArray5699).length;
					return;
				}
				return;
			}
			if (opcode == 5057) {
				CS2Script.int_stack_size -= 2;
				int i_302_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_303_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub3) Class128_Sub1.aClass65_5558
						.method428(i_302_, (byte) -99)).anIntArray5699[i_303_]);
				return;
			}
			if (opcode == 5058) {
				aClass244_2120 = new Class244();
				((Class244) aClass244_2120).anInt3449 = CS2Script.int_stack[--CS2Script.int_stack_size];
				((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450 = Class128_Sub1.aClass65_5558
						.method428((((Class244) aClass244_2120).anInt3449), (byte) -99);
				((Class244) aClass244_2120).anIntArray3452 = new int[((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450
						.method2435(0)];
				return;
			}
			if (opcode == 5059) {
				anInt2115++;
				Class243.writePacket(-69, Class246_Sub1_Sub14.PUBLIC_QUICK_CHAT_PACKET);
				Class130_Sub1.stream.writeByte(255, 0);
				int i_304_ = ((Buffer) Class130_Sub1.stream).position;
				Class130_Sub1.stream.writeByte(255, 0);
				Class130_Sub1.stream.writeShort((byte) 67, (((Class244) aClass244_2120).anInt3449));
				((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450.method2433((byte) 50,
						((Class244) aClass244_2120).anIntArray3452, Class130_Sub1.stream);
				Class130_Sub1.stream.method2408(-1591647264, ((Buffer) Class130_Sub1.stream).position - i_304_);
				return;
			}
			if (opcode == 5060) {
				String string = CS2Script.string_stack[--CS2Script.string_stack_size];
				anInt2128++;
				Class243.writePacket(-65, Class260_Sub2.SEND_FRIEND_QUICK_CHAT_PACKET);
				Class130_Sub1.stream.writeByte(255, 0);
				int i_305_ = ((Buffer) Class130_Sub1.stream).position;
				Class130_Sub1.stream.writeString(69, string);
				Class130_Sub1.stream.writeShort((byte) 67, (((Class244) aClass244_2120).anInt3449));
				((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450.method2433((byte) 27,
						((Class244) aClass244_2120).anIntArray3452, Class130_Sub1.stream);
				Class130_Sub1.stream.method2408(-1591647264, ((Buffer) Class130_Sub1.stream).position - i_305_);
				return;
			}
			if (opcode == 5061) {
				anInt2115++;
				Class243.writePacket(-123, Class246_Sub1_Sub14.PUBLIC_QUICK_CHAT_PACKET);
				Class130_Sub1.stream.writeByte(255, 0);
				int i_306_ = ((Buffer) Class130_Sub1.stream).position;
				Class130_Sub1.stream.writeByte(255, 1);
				Class130_Sub1.stream.writeShort((byte) 67, (((Class244) aClass244_2120).anInt3449));
				((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450.method2433((byte) 39,
						((Class244) aClass244_2120).anIntArray3452, Class130_Sub1.stream);
				Class130_Sub1.stream.method2408(-1591647264, ((Buffer) Class130_Sub1.stream).position - i_306_);
				return;
			}
			if (opcode == 5062) {
				CS2Script.int_stack_size -= 2;
				int i_307_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_308_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub16) Class224.aClass50_3096
						.method329(i_307_, (byte) 79)).aCharArray6688[i_308_]);
				return;
			}
			if (opcode == 5063) {
				CS2Script.int_stack_size -= 2;
				int i_309_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_310_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub16) Class224.aClass50_3096
						.method329(i_309_, (byte) 81)).aCharArray6696[i_310_]);
				return;
			}
			if (opcode == 5064) {
				CS2Script.int_stack_size -= 2;
				int i_311_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_312_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (i_312_ == -1)
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = Class224.aClass50_3096
							.method329(i_311_, (byte) -59).method2744((char) i_312_, (byte) -112);
					return;
				}
				return;
			}
			if (opcode == 5065) {
				CS2Script.int_stack_size -= 2;
				int i_313_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_314_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (i_314_ == -1)
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = Class224.aClass50_3096
							.method329(i_313_, (byte) 119).method2742((char) i_314_, (byte) -88);
					return;
				}
				return;
			}
			if (opcode == 5066) {
				int i_315_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class128_Sub1.aClass65_5558
						.method428(i_315_, (byte) -99).method2435(0);
				return;
			}
			if (opcode == 5067) {
				CS2Script.int_stack_size -= 2;
				int i_316_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_317_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_318_ = (((Class81) Class128_Sub1.aClass65_5558.method428(i_316_, (byte) -99).method2428(i_317_,
						30)).anInt1065);
				CS2Script.int_stack[CS2Script.int_stack_size++] = i_318_;
				return;
			}
			if (opcode == 5068) {
				CS2Script.int_stack_size -= 2;
				int i_319_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_320_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				((Class244) aClass244_2120).anIntArray3452[i_319_] = i_320_;
				return;
			}
			if (opcode == 5069) {
				CS2Script.int_stack_size -= 2;
				int i_321_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_322_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				((Class244) aClass244_2120).anIntArray3452[i_321_] = i_322_;
				return;
			}
			if (opcode == 5070) {
				CS2Script.int_stack_size -= 3;
				int i_323_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_324_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_325_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Class246_Sub1_Sub3 class246_sub1_sub3 = Class128_Sub1.aClass65_5558.method428(i_323_, (byte) -99);
				if ((((Class81) class246_sub1_sub3.method2428(i_324_, 42)).anInt1065) != 0)
					throw new RuntimeException("bad command");
				CS2Script.int_stack[CS2Script.int_stack_size++] = class246_sub1_sub3.method2429(i_325_, false, i_324_);
				return;
			}
			if (opcode == 5071) {
				String string = CS2Script.string_stack[--CS2Script.string_stack_size];
				boolean bool_326_ = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Class100_Sub1.method2177(bool_326_, 32768, string);
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub38.anInt5445;
				return;
			}
			if (opcode == 5072) {
				if (Class102.aShortArray1323 == null || Class22.anInt324 >= Class246_Sub38.anInt5445)
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = (Class102.aShortArray1323[Class22.anInt324++]
							& 0xffff);
					return;
				}
				return;
			}
			if (opcode == 5073) {
				Class22.anInt324 = 0;
				return;
			}
			if (revision != 634) {
				if (opcode == 5074) {
					anInt2115++;
					Class243.writePacket(-104, Class246_Sub1_Sub14.PUBLIC_QUICK_CHAT_PACKET);
					Class130_Sub1.stream.writeByte(255, 0);
					int i_327_ = ((Buffer) Class130_Sub1.stream).position;
					Class130_Sub1.stream.writeByte(255, 2);
					Class130_Sub1.stream.writeShort((byte) 67, (((Class244) aClass244_2120).anInt3449));
					((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450.method2433((byte) 41,
							((Class244) aClass244_2120).anIntArray3452, Class130_Sub1.stream);
					Class130_Sub1.stream.method2408(-1591647264, ((Buffer) Class130_Sub1.stream).position - i_327_);
					return;
				}
			}
		} else if (opcode < 5200) {
			if (opcode == 5100) {
				if (Class216.aClass232_3009.method1488(-92, 86))
					CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					return;
				}
				return;
			}
			if (opcode == 5101) {
				if (Class216.aClass232_3009.method1488(-89, 82))
					CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					return;
				}
				return;
			}
			if (opcode == 5102) {
				if (Class216.aClass232_3009.method1488(-89, 81))
					CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					return;
				}
				return;
			}
		} else if (opcode < 5300) {
			if (opcode == 5200) {
				Class170.method1127((byte) -126, CS2Script.int_stack[--CS2Script.int_stack_size]);
				return;
			}
			if (opcode == 5201) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Model.method655(true);
				return;
			}
			if (opcode == 5205) {
				Class126.method864(-1, -1, -105, CS2Script.int_stack[--CS2Script.int_stack_size], false);
				return;
			}
			if (opcode == 5206) {
				int i_328_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class79.method498(i_328_ >> 14 & 0x3fff, i_328_ & 0x3fff);
				if (class246_sub1_sub5 == null)
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5836;
					return;
				}
				return;
			}
			if (opcode == 5207) {
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class79
						.method515(CS2Script.int_stack[--CS2Script.int_stack_size]);
				if (class246_sub1_sub5 == null || (((Class246_Sub1_Sub5) class246_sub1_sub5).aString5844 == null))
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
				else {
					CS2Script.string_stack[CS2Script.string_stack_size++] = (((Class246_Sub1_Sub5) class246_sub1_sub5).aString5844);
					return;
				}
				return;
			}
			if (opcode == 5208) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class8.anInt99;
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class216.anInt3010;
				return;
			}
			if (opcode == 5209) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class109_Sub1_Sub1.anInt6725 + Class79.anInt1057;
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class21.anInt322 + Class79.anInt1041;
				return;
			}
			if (opcode == 5210) {
				int i_329_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class79.method515(i_329_);
				if (class246_sub1_sub5 == null) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5850 >> 14)
							& 0x3fff;
					CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5850
							& 0x3fff);
					return;
				}
				return;
			}
			if (opcode == 5211) {
				int i_330_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class79.method515(i_330_);
				if (class246_sub1_sub5 == null) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5838
							- (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5833));
					CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5845
							- (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5842));
					return;
				}
				return;
			}
			if (opcode == 5212) {
				Class246_Sub2 class246_sub2 = VarcType.method1450(true);
				if (class246_sub2 == null) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class246_Sub2) class246_sub2).anInt3808;
					int i_331_ = (((Class246_Sub2) class246_sub2).anInt3812 << 28
							| (((Class246_Sub2) class246_sub2).anInt3807 + Class79.anInt1057) << 14
							| (((Class246_Sub2) class246_sub2).anInt3801 + Class79.anInt1041));
					CS2Script.int_stack[CS2Script.int_stack_size++] = i_331_;
					return;
				}
				return;
			}
			if (opcode == 5213) {
				Class246_Sub2 class246_sub2 = Class99.method627(-2);
				if (class246_sub2 == null) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class246_Sub2) class246_sub2).anInt3808;
					int i_332_ = (((Class246_Sub2) class246_sub2).anInt3812 << 28
							| (((Class246_Sub2) class246_sub2).anInt3807 + Class79.anInt1057) << 14
							| (((Class246_Sub2) class246_sub2).anInt3801 + Class79.anInt1041));
					CS2Script.int_stack[CS2Script.int_stack_size++] = i_332_;
					return;
				}
				return;
			}
			if (opcode == 5214) {
				int i_333_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class58.method398((byte) -83);
				if (class246_sub1_sub5 != null) {
					boolean bool_334_ = class246_sub1_sub5.method2471(false, anIntArray2140, i_333_ >> 28 & 0x3,
							i_333_ & 0x3fff, i_333_ >> 14 & 0x3fff);
					if (bool_334_)
						Class9.method81(anIntArray2140[2], (byte) 109, anIntArray2140[1]);
				}
				return;
			}
			if (opcode == 5215) {
				CS2Script.int_stack_size -= 2;
				int i_335_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_336_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				Class217 class217 = Class79.method510(i_335_ >> 14 & 0x3fff, i_335_ & 0x3fff);
				boolean bool_337_ = false;
				for (Class246_Sub1_Sub5 class246_sub1_sub5 = (Class246_Sub1_Sub5) class217.method1408(
						(byte) 87); class246_sub1_sub5 != null; class246_sub1_sub5 = (Class246_Sub1_Sub5) class217
								.method1411(true)) {
					if (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5836 == i_336_) {
						bool_337_ = true;
						break;
					}
				}
				if (bool_337_)
					CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					return;
				}
				return;
			}
			if (opcode == 5218) {
				int i_338_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class79.method515(i_338_);
				if (class246_sub1_sub5 == null)
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5840;
					return;
				}
				return;
			}
			if (opcode == 5220) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Renderer.anInt571 == 100 ? 1 : 0;
				return;
			}
			if (opcode == 5221) {
				int i_339_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class9.method81(i_339_ & 0x3fff, (byte) 93, i_339_ >> 14 & 0x3fff);
				return;
			}
			if (opcode == 5222) {
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class58.method398((byte) -83);
				if (class246_sub1_sub5 != null) {
					boolean bool_340_ = (class246_sub1_sub5.method2466(Class109_Sub1_Sub1.anInt6725 + Class79.anInt1057,
							anIntArray2140, (byte) 111, Class21.anInt322 + Class79.anInt1041));
					if (bool_340_) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = anIntArray2140[1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = anIntArray2140[2];
					} else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
						CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					}
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					return;
				}
				return;
			}
			if (opcode == 5223) {
				CS2Script.int_stack_size -= 2;
				int i_341_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_342_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				Class126.method864(i_342_ >> 14 & 0x3fff, i_342_ & 0x3fff, -105, i_341_, false);
				return;
			}
			if (opcode == 5224) {
				int i_343_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class58.method398((byte) -83);
				if (class246_sub1_sub5 != null) {
					boolean bool_344_ = class246_sub1_sub5.method2471(false, anIntArray2140, i_343_ >> 28 & 0x3,
							i_343_ & 0x3fff, i_343_ >> 14 & 0x3fff);
					if (bool_344_) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = anIntArray2140[1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = anIntArray2140[2];
					} else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
						CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					}
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					return;
				}
				return;
			}
			if (opcode == 5225) {
				int i_345_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class58.method398((byte) -83);
				if (class246_sub1_sub5 != null) {
					boolean bool_346_ = class246_sub1_sub5.method2466(i_345_ >> 14 & 0x3fff, anIntArray2140, (byte) 111,
							i_345_ & 0x3fff);
					if (bool_346_) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = anIntArray2140[1];
						CS2Script.int_stack[CS2Script.int_stack_size++] = anIntArray2140[2];
					} else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
						CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					}
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					return;
				}
				return;
			}
			if (opcode == 5226) {
				Class228.method1464(false, CS2Script.int_stack[--CS2Script.int_stack_size]);
				return;
			}
			if (opcode == 5227) {
				CS2Script.int_stack_size -= 2;
				int i_347_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_348_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				Class126.method864(i_348_ >> 14 & 0x3fff, i_348_ & 0x3fff, -109, i_347_, true);
				return;
			}
			if (opcode == 5228) {
				Class100_Sub1.aBool5070 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				return;
			}
			if (opcode == 5229) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class100_Sub1.aBool5070 ? 1 : 0;
				return;
			}
			if (opcode == 5230) {
				int i_349_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class246_Sub28_Sub10.method2579(120, i_349_);
				return;
			}
			if (opcode == 5231) {
				CS2Script.int_stack_size -= 2;
				int i_350_ = CS2Script.int_stack[CS2Script.int_stack_size];
				boolean bool_351_ = CS2Script.int_stack[CS2Script.int_stack_size + 1] == 1;
				if (Class40_Sub1.aClass85_3776 != null) {
					Node class246 = Class40_Sub1.aClass85_3776.get((long) i_350_);
					if (class246 != null && !bool_351_)
						class246.remove();
					else if (class246 == null && bool_351_) {
						class246 = new Node();
						Class40_Sub1.aClass85_3776.method547((long) i_350_, -2301, class246);
					}
				}
				return;
			}
			if (opcode == 5232) {
				int i_352_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (Class40_Sub1.aClass85_3776 != null) {
					Node class246 = Class40_Sub1.aClass85_3776.get((long) i_352_);
					CS2Script.int_stack[CS2Script.int_stack_size++] = class246 != null ? 1 : 0;
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					return;
				}
				return;
			}
			if (opcode == 5233) {
				CS2Script.int_stack_size -= 2;
				int i_353_ = CS2Script.int_stack[CS2Script.int_stack_size];
				boolean bool_354_ = CS2Script.int_stack[CS2Script.int_stack_size + 1] == 1;
				if (Class246_Sub28_Sub11.aClass85_6164 != null) {
					Node class246 = Class246_Sub28_Sub11.aClass85_6164.get((long) i_353_);
					if (class246 != null && !bool_354_)
						class246.remove();
					else if (class246 == null && bool_354_) {
						class246 = new Node();
						Class246_Sub28_Sub11.aClass85_6164.method547((long) i_353_, -2301, class246);
					}
				}
				return;
			}
			if (opcode == 5234) {
				int i_355_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (Class246_Sub28_Sub11.aClass85_6164 != null) {
					Node class246 = Class246_Sub28_Sub11.aClass85_6164.get((long) i_355_);
					CS2Script.int_stack[CS2Script.int_stack_size++] = class246 != null ? 1 : 0;
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					return;
				}
				return;
			}
			if (opcode == 5235) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (Class79.aClass246_Sub1_Sub5_1020 != null
						? ((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5836
						: -1);
				return;
			}
			if (opcode == 5236) {
				CS2Script.int_stack_size -= 2;
				int i_356_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_357_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_358_ = i_357_ >> 14 & 0x3fff;
				int i_359_ = i_357_ & 0x3fff;
				int i_360_ = Class218.method1415(i_358_, (byte) 124, i_359_, i_356_);
				if (i_360_ < 0)
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = i_360_;
					return;
				}
				return;
			}
			if (revision == 634) {
				if (opcode == 5237) {
					// Class47.method304(-60);
					return;
				}
			}
		} else if (opcode < 5400) {
			if (opcode == 5300) {
				CS2Script.int_stack_size -= 2;
				int i_361_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_362_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				Class100.setWindowedMode(3, i_362_, i_361_, false, false);
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class38_Sub1.aFrame5114 != null ? 1 : 0;
				return;
			}
			if (opcode == 5301) {
				if (Class38_Sub1.aFrame5114 != null)
					Class100.setWindowedMode((((Renderer) (Client.current_renderer)).frame_mode), -1, -1, false, false);
				return;
			}
			if (opcode == 5302) {
				Class86[] class86s = Class130.method885(true);
				CS2Script.int_stack[CS2Script.int_stack_size++] = class86s.length;
				return;
			}
			if (opcode == 5303) {
				int i_363_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class86[] class86s = Class130.method885(true);
				CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class86) class86s[i_363_]).anInt1137;
				CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class86) class86s[i_363_]).anInt1138;
				return;
			}
			if (opcode == 5305) {
				int i_364_ = (((Renderer) Client.current_renderer).anInt577);
				int i_365_ = (((Renderer) Client.current_renderer).anInt604);
				int i_366_ = -1;
				Class86[] class86s = Class130.method885(true);
				for (int i_367_ = 0; i_367_ < class86s.length; i_367_++) {
					Class86 class86 = class86s[i_367_];
					if (((Class86) class86).anInt1137 == i_364_ && ((Class86) class86).anInt1138 == i_365_) {
						i_366_ = i_367_;
						break;
					}
				}
				CS2Script.int_stack[CS2Script.int_stack_size++] = i_366_;
				return;
			}
			if (opcode == 5306) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Settings.gameframe == Revision.OSRS ? 4
						: Client.get_frame_mode((byte) -123);
				return;
			}
			if (opcode == 5307) {
				int i_368_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_368_ >= 1 && i_368_ <= 2) {
					Class100.setWindowedMode(i_368_, -1, -1, false, false);
					return;
				}
				return;
			}
			if (opcode == 5308) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).frame_mode);
				return;
			}
			if (opcode == 5309) {
				int i_369_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_369_ >= 1 && i_369_ <= 2) {
					((Renderer) Client.current_renderer).frame_mode = i_369_;
					Client.current_renderer.save_preferences(Client.sign_link);
					return;
				}
				return;
			}
		} else if (opcode < 5500) {
			if (opcode == 5400) {
				CS2Script.string_stack_size -= 2;
				String string = CS2Script.string_stack[CS2Script.string_stack_size];
				String string_370_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
				int i_371_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				anInt2135++;
				Class243.writePacket(-101, Class187.aClass201_2647);
				Class130_Sub1.stream.writeByte(255,
						(Class145.method978(string, (byte) -116) + Class145.method978(string_370_, (byte) -95) + 1));
				Class130_Sub1.stream.writeString(55, string);
				Class130_Sub1.stream.writeString(119, string_370_);
				Class130_Sub1.stream.writeByte(255, i_371_);
				return;
			}
			if (opcode == 5401) {
				CS2Script.int_stack_size -= 2;
				Class187_Sub1.aShortArray4872[CS2Script.int_stack[CS2Script.int_stack_size]] = (short) TransformList
						.method2115(0, (CS2Script.int_stack[CS2Script.int_stack_size + 1]));
				MapRegion.aClass191_3663.method1258((byte) -125);
				MapRegion.aClass191_3663.method1249((byte) 65);
				Class179.aClass228_2518.method1456(3);
				Class205.method1341(-11712);
				return;
			}
			if (opcode == 5405) {
				CS2Script.int_stack_size -= 2;
				int i_372_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_373_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (i_372_ >= 0 && i_372_ < 2)
					Class21_Sub2.anIntArrayArrayArray4503[i_372_] = new int[i_373_ << 1][4];
				return;
			}
			if (opcode == 5406) {
				CS2Script.int_stack_size -= 7;
				int i_374_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_375_ = CS2Script.int_stack[CS2Script.int_stack_size + 1] << 1;
				int i_376_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				int i_377_ = CS2Script.int_stack[CS2Script.int_stack_size + 3];
				int i_378_ = CS2Script.int_stack[CS2Script.int_stack_size + 4];
				int i_379_ = CS2Script.int_stack[CS2Script.int_stack_size + 5];
				int i_380_ = CS2Script.int_stack[CS2Script.int_stack_size + 6];
				if (i_374_ >= 0 && i_374_ < 2 && Class21_Sub2.anIntArrayArrayArray4503[i_374_] != null && i_375_ >= 0
						&& i_375_ < (Class21_Sub2.anIntArrayArrayArray4503[i_374_]).length) {
					Class21_Sub2.anIntArrayArrayArray4503[i_374_][i_375_] = new int[] { (i_376_ >> 14 & 0x3fff) << 7,
							i_377_, (i_376_ & 0x3fff) << 7, i_380_ };
					Class21_Sub2.anIntArrayArrayArray4503[i_374_][i_375_ + 1] = new int[] {
							(i_378_ >> 14 & 0x3fff) << 7, i_379_, (i_378_ & 0x3fff) << 7 };
				}
				return;
			}
			if (opcode == 5407) {
				int i_381_ = ((Class21_Sub2.anIntArrayArrayArray4503[CS2Script.int_stack[--CS2Script.int_stack_size]]).length >> 1);
				CS2Script.int_stack[CS2Script.int_stack_size++] = i_381_;
				return;
			}
			if (opcode == 5411) {
				if (Class38_Sub1.aFrame5114 != null)
					Class100.setWindowedMode((((Renderer) (Client.current_renderer)).frame_mode), -1, -1, false, false);
				if (Client.frame != null) {
					Class173.method1136(-22125);
					System.exit(0);
				} else {
					String string = (Class59_Sub2.aString4546 != null ? Class59_Sub2.aString4546
							: Class59_Sub3_Sub1.method2444(256));
					Class148.method1001(Client.sign_link, string, Buffer.anInt5656 == 1, false, 121);
					return;
				}
				return;
			}
			if (opcode == 5419) {
				String string = "";
				if (Class246_Sub28_Sub19.aClass182_6548 != null) {
					if (Class246_Sub28_Sub19.aClass182_6548.anObject2535 != null)
						string = (String) (Class246_Sub28_Sub19.aClass182_6548.anObject2535);
					else
						string = Tile.method995((Class246_Sub28_Sub19.aClass182_6548.anInt2534), (byte) -71);
				}
				CS2Script.string_stack[CS2Script.string_stack_size++] = string;
				return;
			}
			if (opcode == 5420) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Signlink.anInt740 == 3 ? 1 : 0;
				return;
			}
			if (opcode == 5421) {
				if (Class38_Sub1.aFrame5114 != null)
					Class100.setWindowedMode((((Renderer) (Client.current_renderer)).frame_mode), -1, -1, false, false);
				String string = CS2Script.string_stack[--CS2Script.string_stack_size];
				boolean bool_382_ = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				String string_383_ = Class59_Sub3_Sub1.method2444(256) + string;
				Class148.method1001(Client.sign_link, string_383_, Buffer.anInt5656 == 1, bool_382_, -54);
				return;
			}
			if (opcode == 5422) {
				CS2Script.string_stack_size -= 2;
				String string = CS2Script.string_stack[CS2Script.string_stack_size];
				String string_384_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
				int i_385_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (string.length() > 0) {
					if (Class251.aStringArray3546 == null)
						Class251.aStringArray3546 = new String[(Class40_Sub3.anIntArray4071[(((Class101) Class59_Sub4_Sub3.aClass101_6943).anInt1310)])];
					Class251.aStringArray3546[i_385_] = string;
				}
				if (string_384_.length() > 0) {
					if (Class249.aStringArray3514 == null)
						Class249.aStringArray3514 = new String[(Class40_Sub3.anIntArray4071[(((Class101) Class59_Sub4_Sub3.aClass101_6943).anInt1310)])];
					Class249.aStringArray3514[i_385_] = string_384_;
				}
				return;
			}
			if (opcode == 5423) {
				System.out.println(CS2Script.string_stack[--CS2Script.string_stack_size]);
				return;
			}
			if (opcode == 5424) {
				CS2Script.int_stack_size -= 11;
				Class241.anInt3400 = CS2Script.int_stack[CS2Script.int_stack_size];
				Class_ss.anInt7054 = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				Class81.anInt1069 = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Class68.anInt905 = CS2Script.int_stack[CS2Script.int_stack_size + 3];
				UnderlayLoader.anInt1469 = CS2Script.int_stack[CS2Script.int_stack_size + 4];
				Class40_Sub9.anInt5511 = CS2Script.int_stack[CS2Script.int_stack_size + 5];
				Class246_Sub1_Sub16.anInt6697 = CS2Script.int_stack[CS2Script.int_stack_size + 6];
				Class246_Sub28_Sub14.anInt6306 = CS2Script.int_stack[CS2Script.int_stack_size + 7];
				MapRegion.anInt3662 = CS2Script.int_stack[CS2Script.int_stack_size + 8];
				Class130_Sub3.anInt4418 = CS2Script.int_stack[CS2Script.int_stack_size + 9];
				Class155.anInt2227 = CS2Script.int_stack[CS2Script.int_stack_size + 10];
				Cache.get_index(Revision.PRE_EOC_634, "sprites").method112(-1, UnderlayLoader.anInt1469);
				Cache.get_index(Revision.PRE_EOC_634, "sprites").method112(-1, Class40_Sub9.anInt5511);
				Cache.get_index(Revision.PRE_EOC_634, "sprites").method112(-1, Class246_Sub1_Sub16.anInt6697);
				Cache.get_index(Revision.PRE_EOC_634, "sprites").method112(-1, Class246_Sub28_Sub14.anInt6306);
				Cache.get_index(Revision.PRE_EOC_634, "sprites").method112(-1, MapRegion.anInt3662);
				VarcLoader.aClass_l993 = Class69.aClass_l907 = Class246_Sub28_Sub23.aClass_l6656 = null;
				Class246_Sub1_Sub3.aClass_l5707 = Class246_Sub41.aClass_l5535 = Class160.aClass_l2266 = null;
				Class205.aClass_l2885 = Class246_Sub37_Sub1.aClass_l5943 = null;
				Class160.aBool2263 = true;
				return;
			}
			if (opcode == 5425) {
				Class246_Sub23.method2099((byte) 115);
				Class160.aBool2263 = false;
				return;
			}
			if (opcode == 5426) {
				CS2Script.int_stack_size -= 2;
				Class188.anInt2657 = CS2Script.int_stack[CS2Script.int_stack_size];
				Class109.anInt1568 = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				return;
			}
			if (opcode == 5427) {
				CS2Script.int_stack_size -= 2;
				Class106_Sub1.anInt4174 = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				return;
			}
			if (opcode == 5428) {
				CS2Script.int_stack_size -= 2;
				int i_386_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_387_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				CS2Script.int_stack[CS2Script.int_stack_size++] = (Class246_Sub1_Sub12.method2618(i_386_, -125, i_387_,
						revision)
								? 1
								: 0);
				return;
			}
			if (opcode == 5429) {
				Client.run_command(CS2Script.string_stack[--CS2Script.string_stack_size], false);
				return;
			}
			if (opcode == 5430) {
				try {
					Class80.method521(Client.sign_link.anApplet733, "accountcreated", 127);
				} catch (Throwable throwable) {
					/* empty */
				}
				return;
			}
			if (revision == 634) {
				if (opcode == 5431) {
					try {
						Class80.method521(Client.sign_link.anApplet733, "accountcreatestarted", 127);
					} catch (Throwable throwable) {
						/* empty */
					}
					return;
				}
			}
		} else if (opcode < 5600) {
			if (opcode == 5500) {
				CS2Script.int_stack_size -= 4;
				int i_388_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_389_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_390_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				int i_391_ = CS2Script.int_stack[CS2Script.int_stack_size + 3];
				Class59_Sub2_Sub3.method2722(i_389_, false, i_391_, (i_388_ & 0x3fff) - Client.base_y, true,
						(i_388_ >> 14 & 0x3fff) - Client.base_x, i_390_);
				return;
			}
			if (opcode == 5501) {
				CS2Script.int_stack_size -= 4;
				int i_392_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_393_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_394_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				int i_395_ = CS2Script.int_stack[CS2Script.int_stack_size + 3];
				Class172.method1133(i_395_, i_393_, (i_392_ & 0x3fff) - Client.base_y, i_394_, -8,
						((i_392_ >> 14 & 0x3fff) - Client.base_x));
				return;
			}
			if (opcode == 5502) {
				CS2Script.int_stack_size -= 6;
				int i_396_ = CS2Script.int_stack[CS2Script.int_stack_size];
				if (i_396_ >= 2)
					throw new RuntimeException();
				TextureLoader.anInt967 = i_396_;
				int i_397_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (i_397_ + 1 >= (Class21_Sub2.anIntArrayArrayArray4503[TextureLoader.anInt967]).length >> 1)
					throw new RuntimeException();
				Class259_Sub1.anInt4511 = i_397_;
				Class246_Sub4.anInt3868 = 0;
				Class246_Sub28_Sub4.anInt5977 = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Class240.anInt3385 = CS2Script.int_stack[CS2Script.int_stack_size + 3];
				int i_398_ = CS2Script.int_stack[CS2Script.int_stack_size + 4];
				if (i_398_ >= 2)
					throw new RuntimeException();
				Class21_Sub2.anInt4494 = i_398_;
				int i_399_ = CS2Script.int_stack[CS2Script.int_stack_size + 5];
				if (i_399_ + 1 >= (Class21_Sub2.anIntArrayArrayArray4503[Class21_Sub2.anInt4494]).length >> 1)
					throw new RuntimeException();
				VarpType.anInt1228 = i_399_;
				Class130_Sub3.anInt4417 = 3;
				return;
			}
			if (opcode == 5503) {
				Class31.method231(-18006);
				return;
			}
			if (opcode == 5504) {
				CS2Script.int_stack_size -= 2;
				Class246_Sub22.method2084(CS2Script.int_stack[CS2Script.int_stack_size], (byte) -125,
						CS2Script.int_stack[CS2Script.int_stack_size + 1], 0);
				return;
			}
			if (opcode == 5505) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (int) Camera.camera_pitch >> 3;
				return;
			}
			if (opcode == 5506) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (int) Camera.camera_yaw >> 3;
				return;
			}
			if (opcode == 5507) {
				Class122.method825(-123);
				return;
			}
			if (opcode == 5508) {
				Class246_Sub28_Sub31.method2850(-107);
				return;
			}
			if (opcode == 5509) {
				Class246_Sub28_Sub3.method2493(-22855);
				return;
			}
			if (opcode == 5510) {
				Class170.method1128((byte) -127);
				return;
			}
			if (opcode == 5511) {
				int i_400_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				int i_401_ = i_400_ >> 14 & 0x3fff;
				int i_402_ = i_400_ & 0x3fff;
				i_401_ -= Client.base_x;
				if (i_401_ < 0)
					i_401_ = 0;
				else if (i_401_ >= Class38_Sub1_Sub1.anInt6770)
					i_401_ = Class38_Sub1_Sub1.anInt6770;
				i_402_ -= Client.base_y;
				if (i_402_ < 0)
					i_402_ = 0;
				else if (i_402_ >= Class152.anInt2205)
					i_402_ = Class152.anInt2205;
				Class242.anInt3424 = (i_401_ << 7) + 64;
				Class246_Sub43.anInt5606 = (i_402_ << 7) + 64;
				Class130_Sub3.anInt4417 = 4;
				return;
			}
			if (opcode == 5512) {
				Class246_Sub28_Sub8.method2559(true);
				return;
			}
		} else if (opcode < 5700) {
			if (opcode == 5600) {
				CS2Script.string_stack_size -= 2;
				String string = CS2Script.string_stack[CS2Script.string_stack_size];
				String string_403_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
				int i_404_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (VarcType.anInt3103 == 10 && (Class228.anInt3137 == 0 && LoginScreen.login_response == 0
						&& ObjType.anInt2815 == 0 && Class24.anInt349 == 0)) {
					LoginScreen.request_login(string, string_403_, i_404_);
					return;
				}
				return;
			}
			if (opcode == 5601) {
				Class166.method1110(true);
				return;
			}
			if (opcode == 5602) {
				if (LoginScreen.login_response == 0)
					Class246_Sub31.anInt5034 = -2;
				return;
			}
			if (opcode == 5603) {
				CS2Script.int_stack_size -= 4;
				if (VarcType.anInt3103 == 10 && (Class228.anInt3137 == 0 && LoginScreen.login_response == 0
						&& ObjType.anInt2815 == 0 && Class24.anInt349 == 0)) {
					Class211_Sub1.method2266(CS2Script.int_stack[CS2Script.int_stack_size + 1],
							CS2Script.int_stack[CS2Script.int_stack_size],
							CS2Script.int_stack[CS2Script.int_stack_size + 2], 4,
							CS2Script.int_stack[CS2Script.int_stack_size + 3]);
					return;
				}
				return;
			}
			if (opcode == 5604) {
				CS2Script.string_stack_size--;
				if (VarcType.anInt3103 == 10 && (Class228.anInt3137 == 0 && LoginScreen.login_response == 0
						&& ObjType.anInt2815 == 0 && Class24.anInt349 == 0)) {
					Class21_Sub4.method2131(
							(Class246_Sub28_Sub6.method2554(1, CS2Script.string_stack[CS2Script.string_stack_size])),
							(byte) 119);
					return;
				}
				return;
			}
			if (opcode == 5605) {
				if (revision == 634) {
					CS2Script.string_stack_size -= 2;
					String test = CS2Script.string_stack[CS2Script.string_stack_size];
					String test1 = CS2Script.string_stack[CS2Script.string_stack_size + 1];
					/*
					 * if (client.client_state == 3 && (Class146.loginStep == 0 &&
					 * Class221.anInt2863 == 0)) {
					 * OutgoingPacket.method1619(Class121_Sub16_Sub15.method3449(12544,
					 * CS2Script.string_stack[CS2Script.string_stack_size]), 19995,
					 * CS2Script.string_stack[CS2Script.string_stack_size + 1], false); return; }
					 */
					return;
				} else {
					CS2Script.string_stack_size -= 3;
					CS2Script.int_stack_size -= 7;
					if (VarcType.anInt3103 == 10 && (Class228.anInt3137 == 0 && LoginScreen.login_response == 0
							&& ObjType.anInt2815 == 0 && Class24.anInt349 == 0)) {
						Class96.method614(2, CS2Script.int_stack[CS2Script.int_stack_size + 1],
								CS2Script.int_stack[CS2Script.int_stack_size + 5] == 1,
								CS2Script.string_stack[CS2Script.string_stack_size + 1],
								CS2Script.int_stack[CS2Script.int_stack_size + 6] == 1,
								CS2Script.int_stack[CS2Script.int_stack_size + 4] == 1,
								CS2Script.int_stack[CS2Script.int_stack_size + 2],
								CS2Script.int_stack[CS2Script.int_stack_size + 3],
								(Class246_Sub28_Sub6.method2554(1,
										CS2Script.string_stack[CS2Script.string_stack_size])),
								CS2Script.string_stack[CS2Script.string_stack_size + 2],
								CS2Script.int_stack[CS2Script.int_stack_size]);
						return;
					}
				}
				return;
			}
			if (opcode == 5606) {
				if (ObjType.anInt2815 == 0)
					RuntimeException_Sub2.anInt7154 = -2;
				return;
			}
			if (opcode == 5607) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub31.anInt5034;
				return;
			}
			if (opcode == 5608) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class95.anInt1252;
				return;
			}
			if (opcode == 5609) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = RuntimeException_Sub2.anInt7154;
				return;
			}
			if (opcode == 5610) {
				for (int i_405_ = 0; i_405_ < 5; i_405_++)
					CS2Script.string_stack[CS2Script.string_stack_size++] = (Varbit.aStringArray1533.length > i_405_
							? Class190.method1246(true, (Varbit.aStringArray1533[i_405_]))
							: "");
				Varbit.aStringArray1533 = null;
				return;
			}
			if (opcode == 5611) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class160.anInt2271;
				return;
			}
			if (revision == 634) {
				if (opcode == 5612) {
					int i_379_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					/*
					 * if (client.client_state == 7 && (Class146.loginStep == 0 &&
					 * Class221.anInt2863 == 0)) { if (Class195.aClass109_2487 != null) {
					 * Class195.aClass109_2487.method600(102); Class195.aClass109_2487 = null; }
					 * Class11_Sub1.anInt7558 = i_379_; Class121_Sub49_Sub27.set_client_state(9,
					 * (byte) 125); return; }
					 */
					return;
				}
				if (opcode == 5613) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class121_Sub21_Sub1.anInt8213 */0;
					return;
				}
				if (opcode == 5615) {
					CS2Script.string_stack_size -= 2;
					String string = CS2Script.string_stack[CS2Script.string_stack_size];
					String string_380_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
					/*
					 * if (client.client_state == 3 && (Class146.loginStep == 0 &&
					 * Class221.anInt2863 == 0)) { if (Class195.aClass109_2487 != null) {
					 * Class195.aClass109_2487.method600(-91); Class195.aClass109_2487 = null; }
					 * Class164.currentUsername = string; ParamType.currentPassword = string_380_;
					 * Class121_Sub49_Sub27.set_client_state(5, (byte) 125); return; }
					 */
					return;
				}
				if (opcode == 5616) {
					// Class121_Sub16_Sub11.sendLogout(false, 2);
					return;
				}
				if (opcode == 5617) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class121_Sub49_Sub20.anInt8507 */0;
					return;
				}
				if (opcode == 5618) {
					int i_381_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					// Class121_Sub49_Sub6.method3043(i_381_, false, -1934);
					return;
				}
				if (opcode == 5619) {
					int i_382_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					// Class121_Sub49_Sub6.method3043(i_382_, true, -1934);
					return;
				}
				if (opcode == 5620) {
					/*
					 * Class11_Sub1.method2912(-31847); if (Class314_Sub2.aString6636 != "" &&
					 * Class314_Sub2.aString6636 != "") {
					 * CS2Script.int_stack[CS2Script.int_stack_size++] = 1; } else {
					 * CS2Script.int_stack[CS2Script.int_stack_size++] = 0; return; }
					 */
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					return;
				}
				if (opcode == 5621) {
					CS2Script.string_stack_size -= 2;
					String test = CS2Script.string_stack[CS2Script.string_stack_size];
					String test1 = CS2Script.string_stack[CS2Script.string_stack_size + 1];
					/*
					 * if (client.client_state == 3 && (Class146.loginStep == 0 &&
					 * Class221.anInt2863 == 0)) {
					 * OutgoingPacket.method1619(Class121_Sub16_Sub15.method3449(12544,
					 * CS2Script.string_stack[CS2Script.string_stack_size]), 19995,
					 * CS2Script.string_stack[CS2Script.string_stack_size + 1], true); return; }
					 */
					return;
				}
				if (opcode == 5622) {
					/*
					 * SignlinkRequest class100 = Class131_Sub2.signlink.open_preferences(14, "3",
					 * false); while (class100.status == 0) { IntegerNode.sleep(37, 1L); } if
					 * (class100.status == 2) { throw new RuntimeException("Error opening file"); }
					 * FileOnDisk class94 = (FileOnDisk) class100.result; if
					 * (class94.method527(0).exists()) { Packet stream = new Packet(50); try {
					 * class94.method529(((Packet) stream).data, 1, 0, 50); } catch
					 * (java.io.IOException ioexception) {
					 * 
					 * } } try { class94.close(true); } catch (Exception exception) {
					 * 
					 * }
					 */
					return;
				}
				if (opcode == 5623) {
					if (/* Class169.ss_key != null */false) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
					} else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
						return;
					}
					return;
				}
				if (opcode == 5624) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																		 * (int) (RuntimeException_Sub1.user_flow >> 32)
																		 */0;
					CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																		 * (int) (RuntimeException_Sub1.user_flow &
																		 * 0xffffL)
																		 */0;
					return;
				}
			}
		} else if (opcode < 6100) {
			if (opcode == 6001) {
				int i_406_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_406_ < 1)
					i_406_ = 1;
				if (i_406_ > 4)
					i_406_ = 4;
				((Renderer) Client.current_renderer).brightness = i_406_;
				Entity.method2663(true);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6002) {
				Client.current_renderer.method2050(-2, CS2Script.int_stack[--CS2Script.int_stack_size] == 1);
				Entity.method2663(true);
				Class211_Sub1_Sub2.method2689(0);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6003) {
				Settings.show_roofs = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Class211_Sub1_Sub2.method2689(0);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6005) {
				Settings.ground_decorations = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Entity.method2663(true);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6006) {
				((Renderer) Client.current_renderer).aBool586 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Client.sprite_loader.method1678(!((Renderer) Client.current_renderer).aBool586);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6007) {
				((Renderer) Client.current_renderer).anInt580 = CS2Script.int_stack[--CS2Script.int_stack_size];
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6008) {
				((Renderer) Client.current_renderer).aBool576 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6009) {
				((Renderer) Client.current_renderer).aBool573 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Entity.method2663(true);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6010) {
				((Renderer) Client.current_renderer).aBool601 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6011) {
				int i_407_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_407_ < 0 || i_407_ > 2)
					i_407_ = 0;
				Client.current_renderer.method273(Buffer.anInt5656, -4, i_407_);
				Entity.method2663(true);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6012) {
				Client.current_renderer.method276(CS2Script.int_stack[--CS2Script.int_stack_size] == 1, -115,
						Buffer.anInt5656);
				Class59_Sub1_Sub2.method2571(-7);
				ParamType.method815((byte) -36);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6014) {
				((Renderer) Client.current_renderer).aBool574 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Entity.method2663(true);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6015) {
				Settings.draw_fog = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Entity.method2663(true);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6016) {
				int i_408_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_408_ < 0 || i_408_ > 2)
					i_408_ = 0;
				((Renderer) Client.current_renderer).anInt588 = i_408_;
				Class129.method883(Buffer.anInt5656, (byte) 56);
				Client.current_renderer.save_preferences(Client.sign_link);
				return;
			}
			if (opcode == 6017) {
				((Renderer) Client.current_renderer).aBool570 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Class91.method581(false);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6018) {
				int i_409_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_409_ < 0)
					i_409_ = 0;
				if (i_409_ > 127)
					i_409_ = 127;
				((Renderer) Client.current_renderer).anInt602 = i_409_;
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6019) {
				int i_410_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_410_ < 0)
					i_410_ = 0;
				if (i_410_ > 255)
					i_410_ = 255;
				if (i_410_ != (((Renderer) Client.current_renderer).anInt587)) {
					if ((((Renderer) Client.current_renderer).anInt587) == 0 && Class36.anInt512 != -1) {
						Class15.method158(i_410_, Class36.anInt512, 0, Cache.get_index(Revision.PRE_EOC_634, "music"),
								-15727, false);
						Class_w.aBool6383 = false;
					} else if (i_410_ == 0) {
						StructLoader.method394((byte) -19);
						Class_w.aBool6383 = false;
					} else
						Class12.method137(i_410_, 101);
					((Renderer) Client.current_renderer).anInt587 = i_410_;
				}
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6020) {
				int i_411_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_411_ < 0)
					i_411_ = 0;
				if (i_411_ > 127)
					i_411_ = 127;
				((Renderer) Client.current_renderer).anInt603 = i_411_;
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6021) {
				((Class39_Sub1) Client.current_renderer).f_cb = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Class211_Sub1_Sub2.method2689(0);
				return;
			}
			if (opcode == 6023) {
				int i_412_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				boolean bool_413_ = false;
				if (i_412_ < 0)
					i_412_ = 0;
				if (i_412_ > 2)
					i_412_ = 2;
				if (Class40_Sub2.anInt4047 < 96) {
					i_412_ = 0;
					bool_413_ = true;
				}
				Class83.method531(i_412_, 9060);
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				CS2Script.int_stack[CS2Script.int_stack_size++] = bool_413_ ? 0 : 1;
				return;
			}
			if (opcode == 6024) {
				int i_414_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_414_ < 0 || i_414_ > 2)
					i_414_ = 0;
				((Renderer) Client.current_renderer).anInt590 = i_414_;
				Client.current_renderer.save_preferences(Client.sign_link);
				return;
			}
			if (opcode == 6025) {
				int i_415_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_415_ < 0 || i_415_ > Client.method2969(Class40_Sub2.anInt4047, (byte) -98))
					i_415_ = 0;
				((Renderer) Client.current_renderer).anInt581 = i_415_;
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6027) {
				int i_416_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_416_ < 0 || i_416_ > 1)
					i_416_ = 0;
				Class196.method1280(-14734, i_416_ == 1);
				return;
			}
			if (opcode == 6028) {
				((Renderer) Client.current_renderer).aBool606 = CS2Script.int_stack[--CS2Script.int_stack_size] != 0;
				Client.current_renderer.save_preferences(Client.sign_link);
				return;
			}
			if (opcode == 6029) {
				((Renderer) Client.current_renderer).anInt580 = CS2Script.int_stack[--CS2Script.int_stack_size];
				Client.current_renderer.save_preferences(Client.sign_link);
				return;
			}
			if (opcode == 6030) {
				Settings.ground_blending = CS2Script.int_stack[--CS2Script.int_stack_size] != 0;
				Client.current_renderer.save_preferences(Client.sign_link);
				Entity.method2663(true);
				return;
			}
			if (opcode == 6031) {
				int i_417_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_417_ < 0 || i_417_ > 3)
					i_417_ = 2;
				Class129.method883(i_417_, (byte) 58);
				return;
			}
			if (opcode == 6032) {
				int i_418_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_418_ < 0 || i_418_ > 3)
					i_418_ = 2;
				((Renderer) Client.current_renderer).anInt598 = i_418_;
				Client.current_renderer.save_preferences(Client.sign_link);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6033) {
				int i_419_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (i_419_ < 0 || i_419_ > 4)
					i_419_ = 2;
				((Renderer) Client.current_renderer).anInt584 = i_419_;
				Client.current_renderer.save_preferences(Client.sign_link);
				return;
			}
			if (opcode == 6034) {
				((Renderer) Client.current_renderer).texture = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Client.current_renderer.save_preferences(Client.sign_link);
				Class59_Sub1_Sub2.method2571(-7);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (opcode == 6035) {
				((Class39_Sub1) Client.current_renderer).aBool4671 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Entity.method2663(true);
				Class211_Sub1_Sub2.method2689(0);
				return;
			}
			if (revision == 634) {
				if (opcode == 6036) {
					int i_397_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (i_397_ < 0 || i_397_ > 2) {
						i_397_ = 0;
					}
					/*
					 * Class346.preferences.method3538((byte) -68, i_397_);
					 * Class346.preferences.store_preferences(-2, Class131_Sub2.signlink);
					 */
					return;
				}
				if (opcode == 6037) {
					int i_398_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (i_398_ < 0) {
						i_398_ = 0;
					}
					if (i_398_ > 127) {
						i_398_ = 127;
					}
					/*
					 * ((GamePreferences) Class346.preferences).anInt7718 = i_398_;
					 * Class346.preferences.store_preferences(-2, Class131_Sub2.signlink);
					 * Class146.aBool1940 = false;
					 */
					return;
				}
				if (opcode == 6038) {
					int i_399_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (i_399_ < 0) {
						i_399_ = 0;
					}
					if (i_399_ > 255) {
						i_399_ = 255;
					}
					/*
					 * if (i_399_ != ((GamePreferences) Class346.preferences).anInt7686 &&
					 * Class121_Sub13.anInt5682 == Class10.anInt118) { if ((((GamePreferences)
					 * Class346.preferences).anInt7686) == 0) { Class136.method737(false,
					 * Class121_Sub13.anInt5682, 0, Class227.aClass219_2924, i_399_, false);
					 * Class132.aBool1754 = false; } else if (i_399_ == 0) {
					 * Class41_Sub2.method2643((byte) 112); Class132.aBool1754 = false; } else {
					 * Class121_Sub49_Sub20.method3252(0, i_399_); } } ((GamePreferences)
					 * Class346.preferences).anInt7686 = i_399_;
					 * Class346.preferences.store_preferences(-2, Class131_Sub2.signlink);
					 * Class146.aBool1940 = false;
					 */
					return;
				}
				if (opcode == 6039) {
					int i_400_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					if (i_400_ > 255 || i_400_ < 0) {
						i_400_ = 0;
					}
					/*
					 * if (i_400_ != (((GamePreferences) Class346.preferences).anInt7687)) {
					 * ((GamePreferences) Class346.preferences).anInt7687 = i_400_;
					 * Class346.preferences.store_preferences(-2, Class131_Sub2.signlink);
					 * Class146.aBool1940 = false; }
					 */
					return;
				}
			}
		} else if (opcode < 6200) {
			if (opcode == 6101) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).brightness);
				return;
			}
			if (opcode == 6102) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Client.current_renderer.method2048(-117,
						Buffer.anInt5656) ? 1 : 0;
				return;
			}
			if (opcode == 6103) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (Settings.show_roofs) ? 1
						: 0;
				return;
			}
			if (opcode == 6105) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (Settings.ground_decorations) ? 1
						: 0;
				return;
			}
			if (opcode == 6106) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).aBool586) ? 1
						: 0;
				return;
			}
			if (opcode == 6107) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt580);
				return;
			}
			if (opcode == 6108) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).aBool576) ? 1
						: 0;
				return;
			}
			if (opcode == 6109) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).aBool573) ? 1
						: 0;
				return;
			}
			if (opcode == 6110) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).aBool601) ? 1
						: 0;
				return;
			}
			if (opcode == 6111) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Client.current_renderer.method271(Buffer.anInt5656,
						(byte) -28);
				return;
			}
			if (opcode == 6112) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Client.current_renderer.method275(29083,
						Buffer.anInt5656) ? 1 : 0;
				return;
			}
			if (opcode == 6114) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).aBool574) ? 1
						: 0;
				return;
			}
			if (opcode == 6115) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (Settings.draw_fog) ? 1
						: 0;
				return;
			}
			if (opcode == 6116) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt588);
				return;
			}
			if (opcode == 6117) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).aBool570) ? 1
						: 0;
				return;
			}
			if (opcode == 6118) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt602);
				return;
			}
			if (opcode == 6119) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt587);
				return;
			}
			if (opcode == 6120) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt603);
				return;
			}
			if (opcode == 6121) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Client.sprite_loader.method1700() ? 1 : 0;
				return;
			}
			if (opcode == 6123) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Texture.method2699(8458);
				return;
			}
			if (opcode == 6124) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt590);
				return;
			}
			if (opcode == 6125) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt581);
				return;
			}
			if (opcode == 6126) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Client.sprite_loader.method1693() ? 1 : 0;
				return;
			}
			if (opcode == 6127) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).aBool596) ? 1
						: 0;
				return;
			}
			if (opcode == 6128) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).aBool606) ? 1
						: 0;
				return;
			}
			if (opcode == 6129) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt580);
				return;
			}
			if (opcode == 6130) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Settings.ground_blending ? 1 : 0;
				return;
			}
			if (opcode == 6131) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Buffer.anInt5656;
				return;
			}
			if (opcode == 6132) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt598);
				return;
			}
			if (opcode == 6133) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Signlink.anInt740 == 1 || Signlink.anInt740 == 4 ? 1
						: 0;
				return;
			}
			if (opcode == 6134) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Client.method2969(Class40_Sub2.anInt4047, (byte) -48);
				return;
			}
			if (opcode == 6135) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt584);
				return;
			}
			if (opcode == 6136) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).texture) ? 1
						: 0;
				return;
			}
			if (opcode == 6137) {
				boolean bool_420_ = true;
				try {
					bool_420_ = jagmisc.getTotalPhysicalMemory() > 268435456L;
				} catch (Throwable throwable) {
					/* empty */
				}
				CS2Script.int_stack[CS2Script.int_stack_size++] = bool_420_ ? 1 : 0;
				return;
			}
			if (revision == 634) {
				if (opcode == 6138) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																		 * Class271_Sub7.method2897(200,
																		 * Class131_Sub8_Sub1.anInt7990, 93)
																		 */0;
					return;
				}
				if (opcode == 6139) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																		 * Class346.preferences.method3525(true,
																		 * Class131_Sub8_Sub1.anInt7990)
																		 */0;
					return;
				}
				if (opcode == 6140) {
					int i_402_ = 0;
					/*
					 * if (Class260.method1425(Class131_Sub8_Sub1.anInt7990, (byte) -21) &&
					 * Class196.anInt2494 < 96) { i_402_ = 1; }
					 */
					CS2Script.int_stack[CS2Script.int_stack_size++] = i_402_;
					return;
				}
				if (opcode == 6141) {
					if (/* Class196.anInt2494 < 96 */false) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					} else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = 2;
						return;
					}
					return;
				}
				if (opcode == 6142) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																		 * (((GamePreferences)
																		 * Class346.preferences).anInt7718)
																		 */0;
					return;
				}
				if (opcode == 6143) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																		 * (((GamePreferences)
																		 * Class346.preferences).anInt7686)
																		 */0;
					return;
				}
				if (opcode == 6144) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class121_Sub16_Sub15_Sub2.aBool9607 ? 1 : 0 */0;
					return;
				}
				if (opcode == 6145) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																		 * (((GamePreferences)
																		 * Class346.preferences).anInt7687)
																		 */0;
					return;
				}
			}
		} else if (opcode < 6300) {
			if (opcode == 6200) {
				CS2Script.int_stack_size -= 2;
				Class159.aShort2260 = (short) CS2Script.int_stack[CS2Script.int_stack_size];
				if (Class159.aShort2260 <= 0)
					Class159.aShort2260 = (short) 256;
				MultilingualString.aShort888 = (short) CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (MultilingualString.aShort888 <= 0)
					MultilingualString.aShort888 = (short) 205;
				return;
			}
			if (opcode == 6201) {
				CS2Script.int_stack_size -= 2;
				Class7.aShort98 = (short) CS2Script.int_stack[CS2Script.int_stack_size];
				if (Class7.aShort98 <= 0)
					Class7.aShort98 = (short) 256;
				Class35.aShort463 = (short) CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (Class35.aShort463 <= 0)
					Class35.aShort463 = (short) 320;
				return;
			}
			if (opcode == 6202) {
				CS2Script.int_stack_size -= 4;
				Class246_Sub28_Sub26.aShort6711 = (short) CS2Script.int_stack[CS2Script.int_stack_size];
				if (Class246_Sub28_Sub26.aShort6711 <= 0)
					Class246_Sub28_Sub26.aShort6711 = (short) 1;
				Class246_Sub12.aShort4404 = (short) CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (Class246_Sub12.aShort4404 <= 0)
					Class246_Sub12.aShort4404 = (short) 32767;
				else if (Class246_Sub12.aShort4404 < Class246_Sub28_Sub26.aShort6711)
					Class246_Sub12.aShort4404 = Class246_Sub28_Sub26.aShort6711;
				Class60.aShort832 = (short) CS2Script.int_stack[CS2Script.int_stack_size + 2];
				if (Class60.aShort832 <= 0)
					Class60.aShort832 = (short) 1;
				Class232.aShort3179 = (short) CS2Script.int_stack[CS2Script.int_stack_size + 3];
				if (Class232.aShort3179 <= 0)
					Class232.aShort3179 = (short) 32767;
				else {
					if (Class232.aShort3179 < Class60.aShort832)
						Class232.aShort3179 = Class60.aShort832;
					return;
				}
				return;
			}
			if (opcode == 6203) {
				Class_o.method2944(0, ((Widget) Class104.f_vb).screen_width, (byte) -21, 0, false,
						((Widget) Class104.f_vb).screen_height);
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class179.anInt2512;
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class59_Sub1_Sub2.anInt6133;
				return;
			}
			if (opcode == 6204) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class7.aShort98;
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class35.aShort463;
				return;
			}
			if (opcode == 6205) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class159.aShort2260;
				CS2Script.int_stack[CS2Script.int_stack_size++] = MultilingualString.aShort888;
				return;
			}
		} else if (opcode < 6400) {
			if (opcode == 6300) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (int) (TimeUtility.time() / 60000L);
				return;
			}
			if (opcode == 6301) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (int) (TimeUtility.time() / 86400000L) - 11745;
				return;
			}
			if (opcode == 6302) {
				CS2Script.int_stack_size -= 3;
				int i_421_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_422_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_423_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				aCalendar2132.clear();
				aCalendar2132.set(11, 12);
				aCalendar2132.set(i_423_, i_422_, i_421_);
				CS2Script.int_stack[CS2Script.int_stack_size++] = ((int) (aCalendar2132.getTime().getTime() / 86400000L)
						- 11745);
				return;
			}
			if (opcode == 6303) {
				aCalendar2132.clear();
				aCalendar2132.setTime(new Date(TimeUtility.time()));
				CS2Script.int_stack[CS2Script.int_stack_size++] = aCalendar2132.get(1);
				return;
			}
			if (opcode == 6304) {
				int i_424_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				boolean bool_425_ = true;
				if (i_424_ < 0)
					bool_425_ = (i_424_ + 1) % 4 == 0;
				else if (i_424_ < 1582)
					bool_425_ = i_424_ % 4 == 0;
				else if (i_424_ % 4 != 0)
					bool_425_ = false;
				else if (i_424_ % 100 != 0)
					bool_425_ = true;
				else if (i_424_ % 400 != 0)
					bool_425_ = false;
				CS2Script.int_stack[CS2Script.int_stack_size++] = bool_425_ ? 1 : 0;
				return;
			}
		} else if (opcode < 6500) {
			if (opcode == 6405) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class187_Sub2.method2286(89) ? 1 : 0;
				return;
			}
			if (opcode == 6406) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class303.method1077(8271) ? 1 : 0;
				return;
			}
		} else if (opcode < 6600) {
			if (opcode == 6500) {
				if (VarcType.anInt3103 != 10 || Class228.anInt3137 != 0 || LoginScreen.login_response != 0
						|| ObjType.anInt2815 != 0)
					CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub13.load_worlds(3) != -1 ? 1 : 0;
					return;
				}
				return;
			}
			if (opcode == 6501) {
				Class63_Sub1 class63_sub1 = Class230.start_world_list(0);
				if (class63_sub1 != null) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63_Sub1) class63_sub1).anInt4713;
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63) class63_sub1).anInt851;
					CS2Script.string_stack[CS2Script.string_stack_size++] = ((Class63_Sub1) class63_sub1).aString4714;
					Class5 class5 = class63_sub1.method2072(-14839);
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class5) class5).anInt64;
					CS2Script.string_stack[CS2Script.string_stack_size++] = ((Class5) class5).aString54;
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63) class63_sub1).anInt855;
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63_Sub1) class63_sub1).anInt4723;
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					return;
				}
				return;
			}
			if (opcode == 6502) {
				Class63_Sub1 class63_sub1 = Class150.getNextWorldListWorld(1405);
				if (class63_sub1 != null) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63_Sub1) class63_sub1).anInt4713;
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63) class63_sub1).anInt851;
					CS2Script.string_stack[CS2Script.string_stack_size++] = ((Class63_Sub1) class63_sub1).aString4714;
					Class5 class5 = class63_sub1.method2072(-14839);
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class5) class5).anInt64;
					CS2Script.string_stack[CS2Script.string_stack_size++] = ((Class5) class5).aString54;
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63) class63_sub1).anInt855;
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63_Sub1) class63_sub1).anInt4723;
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					return;
				}
				return;
			}
			if (opcode == 6503) {
				int i_426_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (VarcType.anInt3103 != (revision == 550 ? 10 : 7) || Class228.anInt3137 != 0
						|| LoginScreen.login_response != 0
						|| ObjType.anInt2815 != 0)
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = Class88.method559(false, i_426_) ? 1 : 0;
					return;
				}
				return;
			}
			if (opcode == 6504) {
				((Renderer) Client.current_renderer).anInt569 = CS2Script.int_stack[--CS2Script.int_stack_size];
				Client.current_renderer.save_preferences(Client.sign_link);
				return;
			}
			if (opcode == 6505) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).anInt569);
				return;
			}
			if (opcode == 6506) {
				int i_427_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				Class63_Sub1 class63_sub1 = Varbit.method746(i_427_, (byte) 112);
				if (class63_sub1 != null) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63) class63_sub1).anInt851;
					CS2Script.string_stack[CS2Script.string_stack_size++] = ((Class63_Sub1) class63_sub1).aString4714;
					Class5 class5 = class63_sub1.method2072(-14839);
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class5) class5).anInt64;
					CS2Script.string_stack[CS2Script.string_stack_size++] = ((Class5) class5).aString54;
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63) class63_sub1).anInt855;
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class63_Sub1) class63_sub1).anInt4723;
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
					return;
				}
				return;
			}
			if (opcode == 6507) {
				CS2Script.int_stack_size -= 4;
				int i_428_ = CS2Script.int_stack[CS2Script.int_stack_size];
				boolean bool_429_ = CS2Script.int_stack[CS2Script.int_stack_size + 1] == 1;
				int i_430_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				boolean bool_431_ = CS2Script.int_stack[CS2Script.int_stack_size + 3] == 1;
				Class18.method174(i_428_, bool_429_, i_430_, bool_431_, (byte) 90);
				return;
			}
			if (opcode == 6508) {
				Class246_Sub28_Sub9.method2578((byte) -77);
				return;
			}
			if (opcode == 6509) {
				if (VarcType.anInt3103 == 10) {
					Class5.aBool60 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
					return;
				}
				return;
			}
			if (opcode == 6518) {
				CS2Script.int_stack[++CS2Script.int_stack_size - 1] = Client.field652 ? 1 : 0;
				return;
			}
			if (opcode == 6519) {
				CS2Script.int_stack[++CS2Script.int_stack_size - 1] = Client.client_type & 3;
				return;
			}
		} else if (opcode < 6700) {
			if (opcode == 6600) {
				((Renderer) Client.current_renderer).aBool605 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
				Client.current_renderer.save_preferences(Client.sign_link);
				return;
			}
			if (opcode == 6601) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Renderer) Client.current_renderer).aBool605) ? 1
						: 0;
				return;
			}
		} else if (opcode < 6800 && Class259.aClass97_3707 == Class37.aClass97_544) {
			if (opcode == 6700) {
				int i_432_ = Widget.get_widget_parents(revision).method542(-5);
				if (Widget.root_interface != -1)
					i_432_++;
				CS2Script.int_stack[CS2Script.int_stack_size++] = i_432_;
				return;
			}
			if (opcode == 6701) {
				int i_433_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (Widget.root_interface != -1) {
					if (i_433_ == 0) {
						CS2Script.int_stack[CS2Script.int_stack_size++] = Widget.root_interface;
						return;
					}
					i_433_--;
				}
				WidgetParent class246_sub40 = ((WidgetParent) Widget.get_widget_parents(revision).first((byte) -23));
				while (i_433_-- > 0)
					class246_sub40 = ((WidgetParent) Widget.get_widget_parents(revision).next((byte) -20));
				CS2Script.int_stack[CS2Script.int_stack_size++] = ((WidgetParent) class246_sub40).anInt5517;
				return;
			}
			if (opcode == 6702) {
				int i_434_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (Widget.get_widget_cache(revision)[i_434_] == null)
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
				else {
					String string = (((Widget) Widget.get_widget_cache(revision)[i_434_][0]).f_gb);
					if (string == null)
						CS2Script.string_stack[CS2Script.string_stack_size++] = "";
					else {
						CS2Script.string_stack[CS2Script.string_stack_size++] = string.substring(0,
								string.indexOf(':'));
						return;
					}
					return;
				}
				return;
			}
			if (opcode == 6703) {
				int i_435_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (Widget.get_widget_cache(revision)[i_435_] == null)
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = (Widget
							.get_widget_cache(revision)[i_435_]).length;
					return;
				}
				return;
			}
			if (opcode == 6704) {
				CS2Script.int_stack_size -= 2;
				int i_436_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_437_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (Widget.get_widget_cache(revision)[i_436_] == null)
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
				else {
					String string = (((Widget) (Widget.get_widget_cache(revision)[i_436_][i_437_])).f_gb);
					if (string == null)
						CS2Script.string_stack[CS2Script.string_stack_size++] = "";
					else {
						CS2Script.string_stack[CS2Script.string_stack_size++] = string;
						return;
					}
					return;
				}
				return;
			}
			if (opcode == 6705) {
				CS2Script.int_stack_size -= 2;
				int i_438_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_439_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (Widget.get_widget_cache(revision)[i_438_] == null)
					CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = ((Widget) (Widget
							.get_widget_cache(revision)[i_438_][i_439_])).anInt3262;
					return;
				}
				return;
			}
			if (opcode == 6706)
				return;
			if (opcode == 6707) {
				CS2Script.int_stack_size -= 3;
				int i_440_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_441_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_442_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget.some_widget(true, 1, "", i_440_ << 16 | i_441_, i_442_, revision);
				return;
			}
			if (opcode == 6708) {
				CS2Script.int_stack_size -= 3;
				int i_443_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_444_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_445_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget.some_widget(true, 2, "", i_443_ << 16 | i_444_, i_445_, revision);
				return;
			}
			if (opcode == 6709) {
				CS2Script.int_stack_size -= 3;
				int i_446_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_447_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_448_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget.some_widget(true, 3, "", i_446_ << 16 | i_447_, i_448_, revision);
				return;
			}
			if (opcode == 6710) {
				CS2Script.int_stack_size -= 3;
				int i_449_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_450_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_451_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget.some_widget(true, 4, "", i_449_ << 16 | i_450_, i_451_, revision);
				return;
			}
			if (opcode == 6711) {
				CS2Script.int_stack_size -= 3;
				int i_452_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_453_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_454_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget.some_widget(true, 5, "", i_452_ << 16 | i_453_, i_454_, revision);
				return;
			}
			if (opcode == 6712) {
				CS2Script.int_stack_size -= 3;
				int i_455_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_456_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_457_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget.some_widget(true, 6, "", i_455_ << 16 | i_456_, i_457_, revision);
				return;
			}
			if (opcode == 6713) {
				CS2Script.int_stack_size -= 3;
				int i_458_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_459_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_460_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget.some_widget(true, 7, "", i_458_ << 16 | i_459_, i_460_, revision);
				return;
			}
			if (opcode == 6714) {
				CS2Script.int_stack_size -= 3;
				int i_461_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_462_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_463_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget.some_widget(true, 8, "", i_461_ << 16 | i_462_, i_463_, revision);
				return;
			}
			if (opcode == 6715) {
				CS2Script.int_stack_size -= 3;
				int i_464_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_465_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_466_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget.some_widget(true, 9, "", i_464_ << 16 | i_465_, i_466_, revision);
				return;
			}
			if (opcode == 6716) {
				CS2Script.int_stack_size -= 3;
				int i_467_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_468_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_469_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget.some_widget(true, 10, "", i_467_ << 16 | i_468_, i_469_, revision);
				return;
			}
			if (opcode == 6717) {
				CS2Script.int_stack_size -= 3;
				int i_470_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_471_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				int i_472_ = CS2Script.int_stack[CS2Script.int_stack_size + 2];
				Widget class235 = Widget.get_component(i_470_ << 16 | i_471_, i_472_, revision);
				class235.revision = revision;
				Class59_Sub4.method2209((byte) 102);
				ClickMaskNode class246_sub27 = Widget.get_active_properties(class235);
				Class155.method1029((((ClickMaskNode) class246_sub27).anInt4898),
						class246_sub27.get_widget_flags(16693), class235,
						(byte) -38);
				return;
			}
		} else if (opcode < 6900) {
			if (opcode == 6800) {
				int i_473_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				MapFunction class140 = Client.map_functions.method1088(i_473_, (byte) -41);
				if (((MapFunction) class140).aString1998 == null)
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
				else {
					CS2Script.string_stack[CS2Script.string_stack_size++] = ((MapFunction) class140).aString1998;
					return;
				}
				return;
			}
			if (opcode == 6801) {
				int i_474_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				MapFunction class140 = Client.map_functions.method1088(i_474_, (byte) -41);
				CS2Script.int_stack[CS2Script.int_stack_size++] = ((MapFunction) class140).anInt2026;
				return;
			}
			if (opcode == 6802) {
				int i_475_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				MapFunction class140 = Client.map_functions.method1088(i_475_, (byte) -41);
				CS2Script.int_stack[CS2Script.int_stack_size++] = ((MapFunction) class140).anInt1994;
				return;
			}
			if (opcode == 6803) {
				int i_476_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				MapFunction class140 = Client.map_functions.method1088(i_476_, (byte) -41);
				CS2Script.int_stack[CS2Script.int_stack_size++] = ((MapFunction) class140).anInt2014;
				return;
			}
			if (opcode == 6804) {
				CS2Script.int_stack_size -= 2;
				int i_477_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_478_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				ParamType class118 = ParamType.list(i_478_, revision);
				if (class118.is_string(115))
					CS2Script.string_stack[CS2Script.string_stack_size++] = (Client.map_functions
							.method1088(i_477_, (byte) -41).method941(120, ((ParamType) class118).defaultStr, i_478_));
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = (Client.map_functions
							.method1088(i_477_, (byte) -41).method943(121, ((ParamType) class118).default_int, i_478_));
					return;
				}
				return;
			}
		} else if (opcode < 7000) {
			if (opcode == 6900) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class193.aBool2466 && !Class84.aBool1110 ? 1 : 0 */0;
				return;
			}
			if (opcode == 6901) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class30_Sub3.anInt7673 */0;
				return;
			}
			if (opcode == 6902) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class38.anInt512 */0;
				return;
			}
			if (opcode == 6903) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class145.anInt1927 */0;
				return;
			}
			if (opcode == 6904) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class175.anInt2284 */0;
				return;
			}
			if (opcode == 6905) {
				String string = "bush did 616";
				/*
				 * if (FileOnDisk.aClass100_1292 != null) { if (FileOnDisk.aClass100_1292.result
				 * != null) { string = (String) FileOnDisk.aClass100_1292.result; } else {
				 * string = Class166.method878((FileOnDisk.aClass100_1292.int_parameter_1),
				 * 255); } }
				 */
				CS2Script.string_stack[CS2Script.string_stack_size++] = string;
				return;
			}
			if (opcode == 6906) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class212.anInt2735 */0;
				return;
			}
			if (opcode == 6907) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class121_Sub21.anInt6599 */0;
				return;
			}
			if (opcode == 6908) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class283_Sub4.anInt5587 */0;
				return;
			}
			if (opcode == 6909) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class283_Sub9.aBool7510 ? 1 : 0 */0;
				return;
			}
			if (opcode == 6910) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class6.anInt64 */0;
				return;
			}
			if (opcode == 6911) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class65_Sub3.anInt7451 */0;
				return;
			}
			if (opcode == 6912) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* Class11.anInt124 */0;
				return;
			}
		} else if (opcode < 7100) {
			if (opcode == 7000) {
				// int i_462_ = Class346.preferences.method3526(-9917);
				CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																	 * ((Class121_Sub48_Sub1)
																	 * Class346.preferences).anInt9475 =
																	 * Class131_Sub8_Sub1.anInt7990
																	 */0;
				CS2Script.int_stack[CS2Script.int_stack_size++] = /* i_462_ */0;
				/*
				 * Class334_Sub4_Sub1.method3247(16912);
				 * Class346.preferences.store_preferences(-2, Class131_Sub2.signlink);
				 * Class146.aBool1940 = false;
				 */
				return;
			}
			if (opcode == 7001) {
				/*
				 * Class346.preferences.method3531(true); Class334_Sub4_Sub1.method3247(16912);
				 * Class346.preferences.store_preferences(-2, Class131_Sub2.signlink);
				 * Class146.aBool1940 = false;
				 */
				return;
			}
			if (opcode == 7002) {
				/*
				 * Class346.preferences.method3536(1); Class334_Sub4_Sub1.method3247(16912);
				 * Class346.preferences.store_preferences(-2, Class131_Sub2.signlink);
				 * Class146.aBool1940 = false;
				 */
				return;
			}
			if (opcode == 7003) {
				/*
				 * Class346.preferences.method3524(1496); Class334_Sub4_Sub1.method3247(16912);
				 * Class346.preferences.store_preferences(-2, Class131_Sub2.signlink);
				 * Class146.aBool1940 = false;
				 */
				return;
			}
			if (opcode == 7004) {
				/*
				 * Class346.preferences.method3535((byte) 47);
				 * Class334_Sub4_Sub1.method3247(16912);
				 * Class346.preferences.store_preferences(-2, Class131_Sub2.signlink);
				 * Class146.aBool1940 = false;
				 */
				return;
			}
			if (opcode == 7005) {
				/*
				 * ((GamePreferences) Class346.preferences).anInt7720 = 0;
				 * Class346.preferences.store_preferences(-2, Class131_Sub2.signlink);
				 * Class146.aBool1940 = false;
				 */
				return;
			}
			if (opcode == 7006) {
				/*
				 * if ((((Class121_Sub48_Sub1) Class346.preferences).anInt9475) == 2) {
				 * ((Class121_Sub48_Sub1) Class346.preferences).aBool9477 = true; } else { if
				 * (((Class121_Sub48_Sub1) Class346.preferences).anInt9475 == 1) {
				 * ((Class121_Sub48_Sub1) Class346.preferences).aBool9460 = true; } else { if
				 * (((Class121_Sub48_Sub1) Class346.preferences).anInt9475 == 3) {
				 * ((Class121_Sub48_Sub1) Class346.preferences).aBool9466 = true; } return; }
				 * return; }
				 */
				return;
			}
			if (opcode == 7007) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																	 * (((GamePreferences)
																	 * Class346.preferences).anInt7720)
																	 */0;
				return;
			}
			if (opcode == 7008) {
				if (/* Class131_Sub8_Sub1.anInt7990 == 0 && Class196.anInt2494 < 96 */false) {
					CS2Script.int_stack[CS2Script.int_stack_size++] = 2;
				} else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = 4;
					return;
				}
				return;
			}
		}
	}

	static final void method993(Class169 class169, int i, int i_479_, int widget_id) {
		CS2Script class246_sub1_sub1 = Class59_Sub1_Sub2.weird_list(11639, i_479_, i, class169, widget_id);
		if (class246_sub1_sub1 != null) {
			int_var_count = new int[((CS2Script) class246_sub1_sub1).int_var_count];
			string_var_count = (new String[((CS2Script) class246_sub1_sub1).string_var_count]);
			if ((((CS2Script) class246_sub1_sub1).aClass169_5681 == Class171.aClass169_2425)
					|| (((CS2Script) class246_sub1_sub1).aClass169_5681 == Class51.aClass169_718)
					|| (((CS2Script) class246_sub1_sub1).aClass169_5681 == Font.aClass169_1609)) {
				int i_480_ = 0;
				int i_481_ = 0;
				if (Class246_Sub11.aClass235_4106 != null) {
					i_480_ = ((Widget) Class246_Sub11.aClass235_4106).x;
					i_481_ = ((Widget) Class246_Sub11.aClass235_4106).y;
				}
				int_var_count[0] = Material.aClass102_3360.method640((byte) 58) - i_480_;
				int_var_count[1] = Material.aClass102_3360.method636(3045) - i_481_;
			}
			execute_script(class246_sub1_sub1, 200000, -1, widget_id, 634);
		}
	}

	static {
		field818 = false; // L: 96
		field816 = false;
		CS2Script.string_stack = new String[1000];
		CS2Script.int_stack = new int[1000];
		arrays = new int[5][5000];
		SubScript.subscripts = new SubScript[50];
		SubScript.subscript_pos = 0;
		CS2Script.int_stack_size = 0;
		array_lengths = new int[5];
		aCalendar2132 = Calendar.getInstance();
		anIntArray2140 = new int[3];
		aStringArray2141 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
				"Dec" };
		aClass54_2139 = new HashMap(4);
		script_io = 0;
	}
}
