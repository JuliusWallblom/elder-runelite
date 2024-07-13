package io;

import io.cache.Revision;

public final class Widget {

	int[] varp_listener_triggers;
	static int anInt3196;
	int color;
	Object[] on_camera_finish;
	int anInt3199;
	int anInt3200;
	boolean flipped_vertically;
	int[] anIntArray3202;
	static int anInt3203;
	int anInt3204;
	int anInt3205;
	Object[] on_resize_listener;
	boolean line_direction;
	int[] varc_str_change_triggers;
	int border_color;
	int item_id;
	Object[] on_loop_cycle_listener;
	Object[] on_mouse_leave_listener;
	int anInt3213;
	byte[] aByteArray3214;
	int model_id;
	Object[] on_interface_overriding_update;
	int anInt3217;
	Object[] on_game_message_received;
	boolean aBool3219;
	int[] varc_change_triggers;
	int anInt3221 = 1;
	boolean has_listener;
	int vertical_alignment;
	static int anInt3224;
	static int anInt3225;
	int drag_threshhold;
	Object[] on_click_listener;
	static int anInt3228;
	String aString3229;
	Object[] on_stock_update_listener;
	Object[] misc_information_update_listener;
	int sequence_id;
	int anInt3233;
	int anInt3234;
	int font_id;
	Object[] on_option_click_listener;
	int dynamic_height;
	int forced_height = -1;
	int translate_y;
	int line_width;
	int drag_zone_size;
	Object[] on_drag_complete_listener;
	Object[] on_mouse_repeat_listener_wrong;
	Object[] on_varp_update_listener;
	int model_type;
	static int anInt3245;
	Object[] on_inventory_update_listener;
	Object[] key_pressed_listener;
	int f_bb;
	int alignment_x;
	boolean f_db;
	Object[] on_target_enter_listener;
	int f_fb;
	String f_gb;
	static int f_hb;
	Object[] on_hold_listener;
	String data_text;
	static int f_kb;
	int disabled_sprite;
	int original_height;
	Object[] on_click_repeat_listener;
	int horizontal_alignment;
	int vertical_text_alignment;
	static Class166 f_qb;
	int original_x;
	int screen_height;
	int f_tb;
	static int f_ub;
	int original_y;
	Object[] on_mouse_wheel_listener;
	String text;
	int hash;
	int anInt3249;
	Object[] on_target_leave_listener;
	static int anInt3251;
	boolean aBool3252;
	int anInt3253;
	static int anInt3254;
	int anInt3255;
	int model_frame;
	Widget parent;
	int original_width;
	int anInt3259;
	int sprite_angle;
	ClickMaskNode click_mask;
	int anInt3262;
	int anInt3263;
	int scroll_width;
	int dynamic_width;
	static int anInt3266 = 0;
	int anInt3267;
	String[] if3_actions;
	String[] if1_actions;
	Object[] on_drag_listener;
	int horizontal_scroll_position;
	int anInt3271;
	int anInt3272;
	Object[] on_mouse_repeat_listener;
	int item_quantity_mode;
	int model_frame_cycle;
	Object[] on_load_listener;
	static int f_bc;
	boolean text_shadow;
	int border_width;
	int item_quantity;
	int screen_width;
	int scroll_height;
	int[] f_hc;
	boolean hidden;
	int[] inventory_listener_triggers;
	Object[] on_dialog_abort_listener;
	static int f_lc;
	int x;
	static int f_nc;
	int horizontal_text_alignment;
	int[] f_pc;
	int f_qc;
	boolean f_rc;
	Object[] varc_change_listener;
	static Class246_Sub35 f_tc;
	boolean filled;
	int type;
	String tooltip;
	Object[] on_clan_chat_update_listener;
	boolean aBool3277;
	Object[] on_mouse_over_listener;
	static int anInt3279;
	int revision;
	boolean if3_format;
	int content_type;
	int model_rotation_z;
	Object[] on_release_listener;
	int model_rotation_x;
	int anInt3284;
	boolean model_orthogonal;
	boolean sprite_tiling;
	int translate_x;
	int anInt3288;
	int anInt3289;
	boolean no_click_through;
	byte[] aByteArray3291;
	int vertical_scroll_position;
	int parent_id;
	boolean flipped_horizontally;
	int top_transparency;
	public FillMode fill_mode;
	int alignment_y;
	int anInt3297;
	Object[] varc_str_change_listener;
	Object[] private_chat_update_listener;
	int line_height;
	String selected_action_name;
	int[] on_skill_update_listener;
	static int anInt3303;
	private static OutgoingPacket ACTION_BUTTON8;
	static int anInt3305;
	Widget[] components;
	boolean f_bd;
	int f_cd;
	int model_zoom;
	int[] f_ed;
	Object[] skill_listener_triggers;
	int model_rotation_y;
	int y;
	int f_id;
	private IterableNodeHashTable f_jd;
	static int f_kd;
	int[] f_ld;
	int f_md;
	static int f_nd;
	static int f_od;
	int index;
	static CacheIndex osrs_sprite_index;
	static CacheIndex pre_eoc_634_sprite_index;
	static CacheIndex widget_font_index;
	static CacheIndex osrs_widget_model_index;
	static CacheIndex widget_model_index;
	static CacheIndex widget_data_index;
	static CacheIndex osrs_widget_data_index;
	static CacheIndex pre_eoc_550_widget_index;
	static CacheIndex pre_eoc_550_sprite_index;
	static CacheIndex custom_pre_eoc_550_sprite_index;
	static CacheIndex custom_osrs_widget_data_index;
	static CacheIndex custom_pre_eoc_550_widget_data_index;
	static boolean[] loaded_widgets;
	static Widget[][] widgets;
	static IterableNodeHashTable widget_parents = new IterableNodeHashTable(8);
	static IterableNodeHashTable widget_flags = new IterableNodeHashTable(512);

	public static IterableNodeHashTable get_widget_parents(int revision) {
		return widget_parents;
	}

	public static IterableNodeHashTable get_widget_flags(int revision) {
		return widget_flags;
	}

	public static Widget[][] get_widget_cache(int revision) {
		return widgets;
	}

	public static boolean[] get_loaded_widgets(int revision) {
		return loaded_widgets;
	}

	public static Widget[][] get_some_widgets(int revision) {
		return some_634_widgets;
	}

	static final Widget get_widget(int widget_hash, int revision) {
			int widget_id = widget_hash >> 16;
			int child_id = 0xffff & widget_hash;
			if (widget_id == -1 || child_id == -1) {
				return null;
			}
			if (Widget.get_widget_cache(revision)[widget_id] == null
					|| Widget.get_widget_cache(revision)[widget_id][child_id] == null) {
				boolean loaded = load_widget(widget_id, revision, 1);
				if (!loaded) {
					return null;
				}
			}
			return Widget.get_widget_cache(revision)[widget_id][child_id];
	}

	static final Widget get_component(int widget_id, int i_12_) {
		return get_component(widget_id, i_12_, 193);
	}

	// IF1
	public int action_type;
	public int mouse_over_id;
	public int[] value_compare_types;
	public int[] required_values;
	public int[][] cs1_opcodes;
	public int[] inventory_amounts;
	public int[] inventory_ids;
	public int inv_sprite_pad_x;
	public int inv_sprite_pad_y;
	public int[] sprite_x;
	public int[] sprite_y;
	public int[] sprite_ids;
	public String[] if1_options;
	public String enabled_text;
	public int enabled_color;
	public int disabled_mouse_over_color;
	public int enabled_mouse_over_color;
	public int enabled_sprite;
	public int enabled_media_type;
	public int enabled_model_id;
	public int enabled_sequence_id;
	public String spell_name;
	public boolean no_scroll_through;
	public Object[] on_clan_settings_change;
	public Object[] on_clan_transmit;
	public Object[] on_some_change_1;
	public Object[] on_some_change_2;
	public Object[] on_some_change_3;
	public Object[] on_some_change_4;
	public Object[] on_some_change_5;
	public Object[] on_some_change_6;
	public Object[] on_some_change_7;
	public Object[] on_some_change_8;
	private boolean aBoolean784;
	private boolean aBoolean754;
	private int anInt787;
	boolean model_transparency;
	public int bottom_transparency;
	public boolean has_scroll_bar;
	boolean prioritize_menu_entry;

	static Widget[][] some_634_widgets;
	static HashMap pre_eoc_550_sprite_cache = new HashMap(200);
	static HashMap custom_pre_eoc_550_sprite_cache = new HashMap(200);
	static HashMap pre_eoc_634_sprite_cache = new HashMap(200);
	static HashMap osrs_widget_sprite_cache = new HashMap(200);
	static int root_interface = -1;
	static Widget static_active_component1;
	static Widget static_active_component2;

	public static HashMap get_widget_sprite_cache(int revision) {
		if (revision == 0) {
			return osrs_widget_sprite_cache;
		} else if (revision == 1) {
			return custom_pre_eoc_550_sprite_cache;
		} else if (revision < 200) {
			return osrs_widget_sprite_cache;
		} else if (revision == 550) {
			return pre_eoc_550_sprite_cache;
		} else {
			return pre_eoc_634_sprite_cache;
		}
	}

	public CacheIndex get_widget_sprite_index() {
		if (this.revision == 0) {
			return osrs_sprite_index;
		} else if (this.revision == 1) {
			return custom_pre_eoc_550_sprite_index;
		} else if (this.revision < 200) {
			return osrs_sprite_index;
		} else if (this.revision == 550) {
			return pre_eoc_550_sprite_index;
		} else {
			return pre_eoc_634_sprite_index;
		}
	}

	final void method1499(String string, int i, int i_0_) {
		try {
			if (i_0_ != 16)
				decode_listener(null);
			anInt3203++;
			if (f_jd == null) {
				f_jd = new IterableNodeHashTable(16);
				f_jd.method547((long) i, -2301, new Class246_Sub4(string));
			} else {
				Class246_Sub4 class246_sub4 = (Class246_Sub4) f_jd.get((long) i);
				if (class246_sub4 != null)
					((Class246_Sub4) class246_sub4).aString3862 = string;
				else
					f_jd.method547((long) i, -2301, new Class246_Sub4(string));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("uu.K(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	final void method1500(int i, int i_1_, int i_2_) {
		try {
			anInt3228++;
			if (i == 65535) {
				if (f_pc == null || (i_2_ >= f_pc.length)) {
					int[] is = new int[i_2_ + 1];
					if (f_pc != null) {
						for (int i_3_ = 0; f_pc.length > i_3_; i_3_++)
							is[i_3_] = f_pc[i_3_];
						for (int i_4_ = f_pc.length; i_2_ > i_4_; i_4_++)
							is[i_4_] = -1;
					}
					f_pc = is;
				}
				f_pc[i_2_] = i_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.M(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static FillMode[] FillMode_values() {
		return new FillMode[] { FillMode.SOLID, FillMode.field4552, FillMode.field4553 }; // L: 15
	}

	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			MouseWheel var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	final int method1501(int i, int i_5_, int i_6_) {
		try {
			f_ub++;
			if (f_jd == null)
				return i_5_;
			SwitchInt class246_sub33 = (SwitchInt) f_jd.get((long) i_6_);
			if (class246_sub33 == null)
				return i_5_;
			if (i != -1)
				return -96;
			return ((SwitchInt) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.Q(" + i + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final AbstractSprite getWidgetSprite(SceneGraph class260, byte i) {
		try {
			anInt3224++;
			Class_u_Sub1.aBool5687 = false;
			long sprite_id = (((long) border_color << 40) + ((flipped_horizontally ? 1L : 0L) << 39)
					+ ((long) disabled_sprite - -((!aBool3252 ? 0L : 1L) << 35))
					- (-((long) border_width << 36) + -((!flipped_vertically ? 0L : 1L) << 38)));
			AbstractSprite class_l = (AbstractSprite) Widget.get_widget_sprite_cache(this.revision).method379(sprite_id,
					(byte) 58);
			if (class_l != null)
				return class_l;
			LDSprite class10 = LDSprite.get_sprite(get_widget_sprite_index(), disabled_sprite, 0);
			if (class10 == null) {
				Class_u_Sub1.aBool5687 = true;
				return null;
			}
			if (flipped_vertically)
				class10.method123();
			if (flipped_horizontally)
				class10.method118();
			do {
				if (border_width <= 0) {
					if (border_color == 0)
						break;
					class10.method128(1);
					if (!Client.f_ob)
						break;
				}
				class10.method128(border_width);
			} while (false);
			if (border_width >= 1)
				class10.method119(1);
			if (border_width >= 2)
				class10.method119(16777215);
			if (border_color != 0)
				class10.method116(~0xffffff | border_color);
			class_l = class260.ld_to_abstract_sprite(class10, true);
			Widget.get_widget_sprite_cache(this.revision).method371(1, sprite_id, class_l);
			return class_l;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	static final void method1503(int i) {
		do {
			try {
				anInt3254++;
				for (int i_8_ = 0; i_8_ < Class59.anInt819; i_8_++) {
					Class258 class258 = Class47.aClass258Array684[i_8_];
					if (((Class258) class258).aByte3702 == 2) {
						if (((Class258) class258).aClass246_Sub37_Sub3_3692 == null)
							((Class258) class258).anInt3695 = -2147483648;
						else
							Canvas_Sub1.aClass246_Sub37_Sub2_6889
									.method2627(((Class258) class258).aClass246_Sub37_Sub3_3692);
					}
				}
				if (i == 8)
					break;
				method1515(103);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "uu.E(" + i + ')');
			}
			break;
		} while (false);
	}

	private final Object[] decode_listener(Buffer stream) {
		anInt3305++;
		int i_9_ = stream.readUnsignedByte();
		if (i_9_ == 0)
			return null;
		Object[] objects = new Object[i_9_];
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			int i_11_ = stream.readUnsignedByte();
			if (i_11_ != 0) {
				if (i_11_ == 1)
					objects[i_10_] = stream.readString((byte) -40);
			} else
				objects[i_10_] = new Integer(stream.readInt((byte) 98));
		}
		has_listener = true;
		return objects;
	}

	final void method1505(byte i, int i_12_) {
		do {
			try {
				if (f_jd != null) {
					Node class246 = f_jd.get((long) i_12_);
					if (class246 != null)
						class246.remove();
				}
				f_bc++;
				if (i >= 58)
					break;
				method1512(null, -128);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "uu.S(" + i + ',' + i_12_ + ')');
			}
			break;
		} while (false);
	}

	final void decode_if1(Buffer buff) {
		this.if3_format = false;
		this.type = buff.readUnsignedByte();
		this.action_type = buff.readUnsignedByte();
		this.content_type = buff.readUnsignedShort();
		this.original_x = buff.readShort();
		this.original_y = buff.readShort();
		this.original_width = buff.readUnsignedShort();
		this.original_height = buff.readUnsignedShort();
		this.horizontal_alignment = 0;
		this.vertical_alignment = 0;
		this.alignment_x = 0;
		this.alignment_y = 0;
		this.top_transparency = buff.readUnsignedByte();
		this.parent_id = buff.readUnsignedShort();
		if (~this.parent_id != -65536) {
			this.parent_id += -65536 & this.hash;
		} else {
			this.parent_id = -1;
		}

		this.mouse_over_id = buff.readUnsignedShort();
		if (-65536 == ~this.mouse_over_id) {
			this.mouse_over_id = -1;
		}

		int valueCompareCount = buff.readUnsignedByte();
		if (valueCompareCount > 0) {
			this.value_compare_types = new int[valueCompareCount];
			this.required_values = new int[valueCompareCount];
			for (int idx = 0; idx < valueCompareCount; idx++) {
				this.value_compare_types[idx] = buff.readUnsignedByte();
				this.required_values[idx] = buff.readUnsignedShort();
			}
		}

		int cs1Length = buff.readUnsignedByte();
		if (cs1Length > 0) {
			this.cs1_opcodes = new int[cs1Length][];
			for (int id = 0; id < cs1Length; id++) {
				int unknownVar = buff.readUnsignedShort();
				this.cs1_opcodes[id] = new int[unknownVar];

				for (int idx = 0; idx < unknownVar; idx++) {
					this.cs1_opcodes[id][idx] = buff.readUnsignedShort();
					if (~this.cs1_opcodes[id][idx] == -65536) {
						this.cs1_opcodes[id][idx] = -1;
					}
				}
			}
		}

		if (this.type == 0) {
			this.scroll_height = buff.readUnsignedShort();
			this.hidden = buff.readUnsignedByte() == 1;
		}

		if (this.type == 1) {
			buff.readUnsignedShort();
			buff.readUnsignedByte();
		}

		int clickMask = 0;
		if (this.type == 2) {
			this.vertical_alignment = 3;
			this.horizontal_alignment = 3;
			this.inventory_amounts = new int[this.original_width * this.original_height];
			this.inventory_ids = new int[this.original_height * this.original_width];
			int var6 = buff.readUnsignedByte();
			if (var6 == 1) {
				clickMask |= 0x10000000;
			}

			int var7 = buff.readUnsignedByte();
			if (var7 == 1) {
				clickMask |= 0x40000000;
			}

			int var8 = buff.readUnsignedByte();
			if (var8 == 1) {
				clickMask |= Integer.MIN_VALUE;
			}

			int var9 = buff.readUnsignedByte();
			if (var9 == 1) {
				clickMask |= 0x20000000;
			}

			this.inv_sprite_pad_x = buff.readUnsignedByte();
			this.inv_sprite_pad_y = buff.readUnsignedByte();
			this.sprite_x = new int[20];
			this.sprite_y = new int[20];
			this.sprite_ids = new int[20];

			for (int idx = 0; idx < 20; idx++) {
				int enabled = buff.readUnsignedByte();
				if (enabled == 1) {
					this.sprite_x[idx] = buff.readShort();
					this.sprite_y[idx] = buff.readShort();
					this.sprite_ids[idx] = buff.readInt();
				} else {
					this.sprite_ids[idx] = -1;
				}
			}

			this.if1_options = new String[5];

			for (int idx = 0; idx < 5; ++idx) {
				String action = buff.readNullTerminatedString();
				if (action.length() > 0) {
					this.if1_options[idx] = action;
					clickMask |= 1 << 23 + idx;
				}
			}
		}

		if (this.type == 3) {
			this.filled = 1 == buff.readUnsignedByte();
		}

		if (this.type == 4 || this.type == 1) {
			this.horizontal_text_alignment = buff.readUnsignedByte();
			this.vertical_text_alignment = buff.readUnsignedByte();
			this.line_height = buff.readUnsignedByte();
			this.font_id = buff.readUnsignedShort();
			if (this.font_id == 65535) {
				this.font_id = -1;
			}
			this.text_shadow = 1 == buff.readUnsignedByte();
		}

		if (this.type == 4) {
			this.text = buff.readNullTerminatedString();
			this.enabled_text = buff.readNullTerminatedString();
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.color = buff.readInt();
		}

		if (this.type == 3 || this.type == 4) {
			this.enabled_color = buff.readInt();
			this.disabled_mouse_over_color = buff.readInt();
			this.enabled_mouse_over_color = buff.readInt();
		}

		if (this.type == 5) {
			this.disabled_sprite = buff.readInt();
			this.enabled_sprite = buff.readInt();
		}

		if (this.type == 6) {
			this.model_type = 1;
			this.enabled_media_type = 1;

			this.model_id = buff.readUnsignedShort();
			if (this.model_id == 65535) {
				this.model_id = -1;
			}

			this.enabled_model_id = buff.readUnsignedShort();
			if (this.enabled_model_id == 65535) {
				this.enabled_model_id = -1;
			}

			this.sequence_id = buff.readUnsignedShort();
			if (this.sequence_id == 65535) {
				this.sequence_id = -1;
			}

			this.enabled_sequence_id = buff.readUnsignedShort();
			if (this.enabled_sequence_id == 65535) {
				this.enabled_sequence_id = -1;
			}

			this.model_zoom = buff.readUnsignedShort();
			this.model_rotation_x = buff.readUnsignedShort();
			this.model_rotation_z = buff.readUnsignedShort();
		}

		if (this.type == 7) {
			this.vertical_alignment = 3;
			this.horizontal_alignment = 3;
			this.inventory_amounts = new int[this.original_height * this.original_width];
			this.inventory_ids = new int[this.original_width * this.original_height];
			this.horizontal_text_alignment = buff.readUnsignedByte();
			this.font_id = buff.readUnsignedShort();
			if (this.font_id == 65535) {
				this.font_id = -1;
			}

			this.text_shadow = buff.readUnsignedByte() == 1;
			this.color = buff.readInt();
			this.inv_sprite_pad_x = buff.readShort();
			this.inv_sprite_pad_y = buff.readShort();
			int var6 = buff.readUnsignedByte();
			if (var6 == 1) {
				clickMask |= 1073741824;
			}

			this.if1_options = new String[5];

			for (int idx = 0; idx < 5; idx++) {
				String action = buff.readNullTerminatedString();
				if (action.length() > 0) {
					this.if1_options[idx] = action;
					clickMask |= 1 << 23 + idx;
				}
			}
		}

		if (this.type == 8) {
			this.text = buff.readNullTerminatedString();
		}

		if (this.action_type == 2 || this.type == 2) {
			this.selected_action_name = buff.readNullTerminatedString();
			this.spell_name = buff.readNullTerminatedString();
			int var6 = 0x3f & buff.readUnsignedShort();
			clickMask |= var6 << 11;
		}

		if (this.action_type == 1 || this.action_type == 4 || this.action_type == 5 || this.action_type == 6) {
			this.tooltip = buff.readNullTerminatedString();
			if (this.tooltip.length() == 0) {
				if (this.action_type == 1) {
					this.tooltip = "Ok";
				}
				if (this.action_type == 4 || this.action_type == 5) {
					this.tooltip = "Select";
				}
				if (this.action_type == 6) {
					this.tooltip = "Continue";
				}
			}
		}
		if (this.action_type == 1 || this.action_type == 4 || this.action_type == 5) {
			clickMask |= 0x400000;
		}

		if (this.action_type == 6) {
			clickMask |= 1;
		}

		this.click_mask = new ClickMaskNode(clickMask, -1);
	}

	void decode_if1_osrs(Buffer var1) {
		this.if3_format = false; // L: 256
		this.type = var1.readUnsignedByte(); // L: 257
		this.action_type = var1.readUnsignedByte(); // L: 258
		this.content_type = var1.readUnsignedShort(); // L: 259
		this.original_x = var1.readShort(); // L: 260
		this.original_y = var1.readShort(); // L: 261
		this.original_width = var1.readUnsignedShort(); // L: 262
		this.original_height = var1.readUnsignedShort(); // L: 263
		this.top_transparency = var1.readUnsignedByte(); // L: 264
		this.parent_id = var1.readUnsignedShort(); // L: 265
		if (this.parent_id == 65535) { // L: 266
			this.parent_id = -1;
		} else {
			this.parent_id += this.hash & -65536; // L: 267
		}

		this.mouse_over_id = var1.readUnsignedShort(); // L: 268
		if (this.mouse_over_id == 65535) { // L: 269
			this.mouse_over_id = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 270
		int var3;
		if (var2 > 0) { // L: 271
			this.value_compare_types = new int[var2]; // L: 272
			this.required_values = new int[var2]; // L: 273

			for (var3 = 0; var3 < var2; ++var3) { // L: 274
				this.value_compare_types[var3] = var1.readUnsignedByte(); // L: 275
				this.required_values[var3] = var1.readUnsignedShort(); // L: 276
			}
		}

		var3 = var1.readUnsignedByte(); // L: 279
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 280
			this.cs1_opcodes = new int[var3][]; // L: 281

			for (var4 = 0; var4 < var3; ++var4) { // L: 282
				var5 = var1.readUnsignedShort(); // L: 283
				this.cs1_opcodes[var4] = new int[var5]; // L: 284

				for (var6 = 0; var6 < var5; ++var6) { // L: 285
					this.cs1_opcodes[var4][var6] = var1.readUnsignedShort(); // L: 286
					if (this.cs1_opcodes[var4][var6] == 65535) { // L: 287
						this.cs1_opcodes[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 291
			this.scroll_height = var1.readUnsignedShort(); // L: 292
			this.hidden = var1.readUnsignedByte() == 1; // L: 293
		}

		if (this.type == 1) { // L: 295
			var1.readUnsignedShort(); // L: 296
			var1.readUnsignedByte(); // L: 297
		}

		int flags = 0;

		if (this.type == 2) { // L: 299
			this.inventory_ids = new int[this.original_width * this.original_height]; // L: 300
			this.inventory_amounts = new int[this.original_height * this.original_width]; // L: 301
			var4 = var1.readUnsignedByte(); // L: 302
			if (var4 == 1) { // L: 303
				flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 304
			if (var5 == 1) { // L: 305
				flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 306
			if (var6 == 1) { // L: 307
				flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 308
			if (var7 == 1) { // L: 309
				flags |= 536870912;
			}

			this.inv_sprite_pad_x = var1.readUnsignedByte(); // L: 310
			this.inv_sprite_pad_y = var1.readUnsignedByte(); // L: 311
			this.sprite_x = new int[20]; // L: 312
			this.sprite_y = new int[20]; // L: 313
			this.sprite_ids = new int[20]; // L: 314

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 315
				int var11 = var1.readUnsignedByte(); // L: 316
				if (var11 == 1) { // L: 317
					this.sprite_x[var8] = var1.readShort(); // L: 318
					this.sprite_y[var8] = var1.readShort(); // L: 319
					this.sprite_ids[var8] = var1.readInt(); // L: 320
				} else {
					this.sprite_ids[var8] = -1; // L: 322
				}
			}

			this.if1_options = new String[5]; // L: 324

			for (var8 = 0; var8 < 5; ++var8) { // L: 325
				String var9 = var1.readNullTerminatedString(); // L: 326
				if (var9.length() > 0) { // L: 327
					this.if1_options[var8] = var9; // L: 328
					flags |= 1 << var8 + 23; // L: 329
				}
			}
		}

		if (this.type == 3) { // L: 333
			this.filled = var1.readUnsignedByte() == 1; // L: 334
		}

		if (this.type == 4 || this.type == 1) { // L: 336
			this.horizontal_text_alignment = var1.readUnsignedByte(); // L: 337
			this.vertical_text_alignment = var1.readUnsignedByte(); // L: 338
			this.line_height = var1.readUnsignedByte(); // L: 339
			this.font_id = var1.readUnsignedShort(); // L: 340
			if (this.font_id == 65535) { // L: 341
				this.font_id = -1;
			}

			this.text_shadow = var1.readUnsignedByte() == 1; // L: 342
		}

		if (this.type == 4) { // L: 344
			this.text = var1.readNullTerminatedString(); // L: 345
			this.enabled_text = var1.readNullTerminatedString(); // L: 346
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 348
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 349
			this.enabled_color = var1.readInt(); // L: 350
			this.disabled_mouse_over_color = var1.readInt(); // L: 351
			this.enabled_mouse_over_color = var1.readInt(); // L: 352
		}

		if (this.type == 5) { // L: 354
			this.disabled_sprite = var1.readInt(); // L: 355
			this.enabled_sprite = var1.readInt(); // L: 356
		}

		if (this.type == 6) { // L: 358
			this.model_type = 1; // L: 359
			this.model_id = var1.readUnsignedShort(); // L: 360
			if (this.model_id == 65535) { // L: 361
				this.model_id = -1;
			}

			this.enabled_media_type = 1; // L: 362
			this.enabled_model_id = var1.readUnsignedShort(); // L: 363
			if (this.enabled_model_id == 65535) { // L: 364
				this.enabled_model_id = -1;
			}

			this.sequence_id = var1.readUnsignedShort(); // L: 365
			if (this.sequence_id == 65535) { // L: 366
				this.sequence_id = -1;
			}

			this.enabled_sequence_id = var1.readUnsignedShort(); // L: 367
			if (this.enabled_sequence_id == 65535) { // L: 368
				this.enabled_sequence_id = -1;
			}

			this.model_zoom = var1.readUnsignedShort(); // L: 369
			this.model_rotation_x = var1.readUnsignedShort(); // L: 370
			this.model_rotation_y = var1.readUnsignedShort(); // L: 371
		}

		if (this.type == 7) { // L: 373
			this.inventory_ids = new int[this.original_width * this.original_height]; // L: 374
			this.inventory_amounts = new int[this.original_height * this.original_width]; // L: 375
			this.horizontal_text_alignment = var1.readUnsignedByte(); // L: 376
			this.font_id = var1.readUnsignedShort(); // L: 377
			if (this.font_id == 65535) { // L: 378
				this.font_id = -1;
			}

			this.text_shadow = var1.readUnsignedByte() == 1; // L: 379
			this.color = var1.readInt(); // L: 380
			this.inv_sprite_pad_x = var1.readShort(); // L: 381
			this.inv_sprite_pad_y = var1.readShort(); // L: 382
			var4 = var1.readUnsignedByte(); // L: 383
			if (var4 == 1) {
				flags |= 1073741824; // L: 384
			}

			this.if1_options = new String[5]; // L: 385

			for (var5 = 0; var5 < 5; ++var5) { // L: 386
				String var10 = var1.readNullTerminatedString(); // L: 387
				if (var10.length() > 0) { // L: 388
					this.if1_options[var5] = var10; // L: 389
					flags |= 1 << var5 + 23; // L: 390
				}
			}
		}

		if (this.type == 8) { // L: 394
			this.text = var1.readNullTerminatedString(); // L: 395
		}

		if (this.action_type == 2 || this.type == 2) { // L: 397
			this.selected_action_name = var1.readNullTerminatedString(); // L: 398
			this.spell_name = var1.readNullTerminatedString(); // L: 399
			var4 = var1.readUnsignedShort() & 63; // L: 400
			flags |= var4 << 11; // L: 401
		}

		if (this.action_type == 1 || this.action_type == 4 || this.action_type == 5 || this.action_type == 6) { // L:
																												// 403
			this.tooltip = var1.readNullTerminatedString(); // L: 404
			if (this.tooltip.length() == 0) { // L: 405
				if (this.action_type == 1) { // L: 406
					this.tooltip = "Ok";
				}

				if (this.action_type == 4) { // L: 407
					this.tooltip = "Select";
				}

				if (this.action_type == 5) { // L: 408
					this.tooltip = "Select";
				}

				if (this.action_type == 6) { // L: 409
					this.tooltip = "Continue";
				}
			}
		}

		if (this.action_type == 1 || this.action_type == 4 || this.action_type == 5) { // L: 412
			flags |= 4194304; // L: 413
		}

		if (this.action_type == 6) { // L: 415
			flags |= 1; // L: 416
		}

	} // L: 418

	final void decode_634_if3(Buffer stream, boolean bool) {
		int i = stream.readUnsignedByte();
		if (i == 255)
			i = -1;
		((Widget) this).type = stream.readUnsignedByte();
		if ((0x80 & ((Widget) this).type) != 0) {
			((Widget) this).type &= 0x7f;
			((Widget) this).f_gb = stream.readString();
		}
		((Widget) this).content_type = stream.readUnsignedShort();
		((Widget) this).original_x = stream.method2375(13638);
		((Widget) this).original_y = stream.method2375(13638);
		((Widget) this).original_width = stream.readUnsignedShort();
		((Widget) this).original_height = stream.readUnsignedShort();
		((Widget) this).horizontal_alignment = stream.readByte();
		((Widget) this).vertical_alignment = stream.readByte();
		((Widget) this).alignment_x = stream.readByte();
		((Widget) this).alignment_y = stream.readByte();
		((Widget) this).parent_id = stream.readUnsignedShort();
		if (((Widget) this).parent_id == 65535)
			((Widget) this).parent_id = -1;
		else
			((Widget) this).parent_id = ((~0xffff & ((Widget) this).hash) + ((Widget) this).parent_id);
		int i_36_ = stream.readUnsignedByte();
		if (i >= 0)
			((Widget) this).no_click_through = (0x2 & i_36_) != 0;
		((Widget) this).hidden = (0x1 & i_36_) != 0;
		if (((Widget) this).type == 0) {
			((Widget) this).scroll_width = stream.readUnsignedShort();
			((Widget) this).scroll_height = stream.readUnsignedShort();
			if (i < 0)
				((Widget) this).no_click_through = stream.readUnsignedByte() == 1;
		}
		if (((Widget) this).type == 5) {
			((Widget) this).disabled_sprite = stream.readInt((byte) -126);
			((Widget) this).sprite_angle = stream.readUnsignedShort();
			int i_37_ = stream.readUnsignedByte();
			((Widget) this).sprite_tiling = (i_37_ & 0x1) != 0;
			((Widget) this).aBool3252 = (0x2 & i_37_) != 0;
			((Widget) this).top_transparency = stream.readUnsignedByte();
			((Widget) this).border_width = stream.readUnsignedByte();
			((Widget) this).border_color = stream.readInt((byte) -126);
			((Widget) this).flipped_vertically = stream.readUnsignedByte() == 1;
			((Widget) this).flipped_horizontally = stream.readUnsignedByte() == 1;
			((Widget) this).color = stream.readInt((byte) -126);
		}
		if (((Widget) this).type == 6) {
			((Widget) this).model_type = 1;
			((Widget) this).model_id = stream.readUnsignedShort();
			if (((Widget) this).model_id == 65535)
				((Widget) this).model_id = -1;
			int i_38_ = stream.readUnsignedByte();
			((Widget) this).aBoolean784 = (0x2 & i_38_) == 2;
			boolean bool_39_ = (i_38_ & 0x1) == 1;
			((Widget) this).model_orthogonal = (i_38_ & 0x4) == 4;
			((Widget) this).aBoolean754 = (i_38_ & 0x8) == 8;
			if (!bool_39_) {
				if (((Widget) this).aBoolean784) {
					((Widget) this).translate_x = stream.method2375(13638);
					((Widget) this).translate_y = stream.method2375(13638);
					((Widget) this).anInt787 = stream.method2375(13638);
					((Widget) this).model_rotation_x = stream.readUnsignedShort();
					((Widget) this).model_rotation_y = stream.readUnsignedShort();
					((Widget) this).model_rotation_z = stream.readUnsignedShort();
					((Widget) this).model_zoom = stream.method2375(13638);
				}
			} else {
				((Widget) this).translate_x = stream.method2375(13638);
				((Widget) this).translate_y = stream.method2375(13638);
				((Widget) this).model_rotation_x = stream.readUnsignedShort();
				((Widget) this).model_rotation_y = stream.readUnsignedShort();
				((Widget) this).model_rotation_z = stream.readUnsignedShort();
				((Widget) this).model_zoom = stream.readUnsignedShort();
			}
			((Widget) this).sequence_id = stream.readUnsignedShort();
			if (((Widget) this).sequence_id == 65535)
				((Widget) this).sequence_id = -1;
			if (((Widget) this).horizontal_alignment != 0)
				((Widget) this).dynamic_width = stream.readUnsignedShort();
			if (((Widget) this).vertical_alignment != 0)
				((Widget) this).dynamic_height = stream.readUnsignedShort();
		}
		if (((Widget) this).type == 4) {
			((Widget) this).font_id = stream.readUnsignedShort();
			if (((Widget) this).font_id == 65535)
				((Widget) this).font_id = -1;
			((Widget) this).text = stream.readString();
			((Widget) this).line_height = stream.readUnsignedByte();
			((Widget) this).horizontal_text_alignment = stream.readUnsignedByte();
			((Widget) this).vertical_text_alignment = stream.readUnsignedByte();
			((Widget) this).text_shadow = stream.readUnsignedByte() == 1;
			((Widget) this).color = stream.readInt((byte) -126);
			((Widget) this).top_transparency = stream.readUnsignedByte();
			if (i >= 0)
				((Widget) this).anInt3259 = stream.readUnsignedByte();
		}
		if (((Widget) this).type == 3) {
			((Widget) this).color = stream.readInt((byte) -126);
			((Widget) this).filled = stream.readUnsignedByte() == 1;
			((Widget) this).top_transparency = stream.readUnsignedByte();
		}
		if (((Widget) this).type == 9) {
			((Widget) this).line_width = stream.readUnsignedByte();
			((Widget) this).color = stream.readInt((byte) -126);
			((Widget) this).line_direction = stream.readUnsignedByte() == 1;
		}
		int click_mask = stream.read24BitInteger((byte) 29);
		int i_41_ = stream.readUnsignedByte();
		if (i_41_ != 0) {
			((Widget) this).aByteArray3291 = new byte[11];
			((Widget) this).aByteArray3214 = new byte[11];
			((Widget) this).f_ed = new int[11];
			for (/**/; i_41_ != 0; i_41_ = stream.readUnsignedByte()) {
				int i_42_ = -1 + (i_41_ >> 202238372);
				i_41_ = i_41_ << -1198606488 | stream.readUnsignedByte();
				i_41_ &= 0xfff;
				if (i_41_ == 4095)
					i_41_ = -1;
				byte i_43_ = stream.readByte();
				if (i_43_ != 0)
					((Widget) this).f_bd = true;
				byte i_44_ = stream.readByte();
				((Widget) this).f_ed[i_42_] = i_41_;
				((Widget) this).aByteArray3214[i_42_] = i_43_;
				((Widget) this).aByteArray3291[i_42_] = i_44_;
			}
		}
		((Widget) this).data_text = stream.readString();
		int i_45_ = stream.readUnsignedByte();
		int i_46_ = 0xf & i_45_;
		if (i_46_ > 0) {
			((Widget) this).if3_actions = new String[i_46_];
			for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
				((Widget) this).if3_actions[i_47_] = stream.readString();
		}
		int i_48_ = i_45_ >> -315745276;
		if (i_48_ > 0) {
			int i_49_ = stream.readUnsignedByte();
			((Widget) this).f_pc = new int[1 + i_49_];
			for (int i_50_ = 0; i_50_ < ((Widget) this).f_pc.length; i_50_++)
				((Widget) this).f_pc[i_50_] = -1;
			((Widget) this).f_pc[i_49_] = stream.readUnsignedShort();
		}
		if (i_48_ > 1) {
			int i_51_ = stream.readUnsignedByte();
			((Widget) this).f_pc[i_51_] = stream.readUnsignedShort();
		}
		((Widget) this).aString3229 = stream.readString();
		if (((Widget) this).aString3229.equals(""))
			((Widget) this).aString3229 = null;
		((Widget) this).drag_zone_size = stream.readUnsignedByte();
		((Widget) this).drag_threshhold = stream.readUnsignedByte();
		((Widget) this).anInt3205 = stream.readUnsignedByte();
		((Widget) this).selected_action_name = stream.readString();
		int action = -1;
		if (Class259_Sub3_Sub1.method2841(9921, click_mask) != 0) {
			action = stream.readUnsignedShort();
			anInt3234 = stream.readUnsignedShort();
			if (~action == 0xffff0000)
				action = -1;
			if (~anInt3234 == 0xffff0000)
				anInt3234 = -1;
			anInt3199 = stream.readUnsignedShort();
			if (~anInt3199 == 0xffff0000)
				anInt3199 = -1;
		}
		if (i >= 0) {
			((Widget) this).anInt3233 = stream.readUnsignedShort();
			if (((Widget) this).anInt3233 == 65535)
				((Widget) this).anInt3233 = -1;
		}
		((Widget) this).click_mask = new ClickMaskNode(click_mask, action);
		if (i >= 0) {
			int i_30_ = stream.readUnsignedByte();
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
				int i_32_ = stream.read24BitInteger((byte) 29);
				int i_33_ = stream.readInt((byte) 126);
				f_jd.method547((long) i_32_, -2301, new SwitchInt(i_33_));
			}
			int i_34_ = stream.readUnsignedByte();
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
				int i_59_ = stream.read24BitInteger((byte) 29);
				String string = stream.method2360(-126);
				f_jd.method547((long) i_59_, -2301, new Class246_Sub4(string));
			}
		}
		((Widget) this).on_load_listener = decode_listener(stream);
		((Widget) this).on_mouse_over_listener = decode_listener(stream);
		((Widget) this).on_mouse_leave_listener = decode_listener(stream);
		((Widget) this).on_target_leave_listener = decode_listener(stream);
		((Widget) this).on_target_enter_listener = decode_listener(stream);
		((Widget) this).on_varp_update_listener = decode_listener(stream);
		((Widget) this).on_inventory_update_listener = decode_listener(stream);
		((Widget) this).skill_listener_triggers = decode_listener(stream);
		((Widget) this).on_loop_cycle_listener = decode_listener(stream);
		((Widget) this).on_option_click_listener = decode_listener(stream);
		if (i >= 0)
			((Widget) this).on_mouse_repeat_listener_wrong = decode_listener(stream);
		((Widget) this).on_mouse_repeat_listener = decode_listener(stream);
		((Widget) this).on_click_listener = decode_listener(stream);
		((Widget) this).on_click_repeat_listener = decode_listener(stream);
		((Widget) this).on_release_listener = decode_listener(stream);
		((Widget) this).on_hold_listener = decode_listener(stream);
		((Widget) this).on_drag_listener = decode_listener(stream);
		((Widget) this).on_drag_complete_listener = decode_listener(stream);
		((Widget) this).on_mouse_wheel_listener = decode_listener(stream);
		((Widget) this).varc_change_listener = decode_listener(stream);
		((Widget) this).varc_str_change_listener = decode_listener(stream);
		((Widget) this).varp_listener_triggers = decode_634_trigger(!bool, stream);
		((Widget) this).inventory_listener_triggers = decode_634_trigger(!bool, stream);
		((Widget) this).on_skill_update_listener = decode_634_trigger(!bool, stream);
		((Widget) this).varc_change_triggers = decode_634_trigger(false, stream);
		((Widget) this).varc_str_change_triggers = decode_634_trigger(false, stream);
	}

	final void decode_if3_550(Buffer stream, int widget_id, int widget_child, int revision) {
		if3_format = true;
		stream.position++;
		type = stream.readUnsignedByte();
		if ((type & 0x80) != 0) {
			type &= 0x7f;
			stream.readString();
		}
		content_type = stream.readUnsignedShort();
		original_x = stream.readShort();
		original_y = stream.readShort();
		original_width = stream.readUnsignedShort();
		original_height = stream.readUnsignedShort();
		horizontal_alignment = stream.readByte();
		vertical_alignment = stream.readByte();
		alignment_x = stream.readByte();
		alignment_y = stream.readByte();
		parent_id = stream.readUnsignedShort();
		if (parent_id == 65535)
			parent_id = -1;
		else
			parent_id = parent_id + (0xffff0000 & hash);
		hidden = stream.readUnsignedByte() == 1;
		if (type == 0) {
			scroll_width = stream.readUnsignedShort();
			scroll_height = stream.readUnsignedShort();
			no_click_through = stream.readUnsignedByte() == 1;
		}
		if (type == 5) {
			disabled_sprite = stream.readInt();
			sprite_angle = stream.readUnsignedShort();
			int j = stream.readUnsignedByte();
			sprite_tiling = (j & 0x1) != 0;
			aBool3252 = (0x2 & j) != 0;
			top_transparency = stream.readUnsignedByte();
			border_width = stream.readUnsignedByte();
			border_color = stream.readInt();
			flipped_vertically = stream.readUnsignedByte() == 1;
			flipped_horizontally = stream.readUnsignedByte() == 1;
			color = stream.readInt();
		}
		if (type == 6) {
			model_type = 1;
			model_id = stream.readUnsignedShort();
			if (model_id == 65535)
				model_id = -1;
			translate_x = stream.readShort();
			translate_y = stream.readShort();
			model_rotation_x = stream.readUnsignedShort();
			model_rotation_y = stream.readUnsignedShort();
			model_rotation_z = stream.readUnsignedShort();
			model_zoom = stream.readUnsignedShort();
			sequence_id = stream.readUnsignedShort();
			if (sequence_id == 65535)
				sequence_id = -1;
			model_orthogonal = stream.readUnsignedByte() == 1;
			stream.readUnsignedShort();
			stream.readUnsignedShort();
			stream.readUnsignedByte();
			if (horizontal_alignment != 0) {
				dynamic_width = stream.readUnsignedShort();
			}
			if (vertical_alignment != 0)
				stream.readUnsignedShort();
		}
		if (type == 4) {
			font_id = stream.readUnsignedShort();
			if (font_id == 65535)
				font_id = -1;
			text = stream.readString();
			line_height = stream.readUnsignedByte();
			horizontal_text_alignment = stream.readUnsignedByte();
			vertical_text_alignment = stream.readUnsignedByte();
			text_shadow = stream.readUnsignedByte() == 1;
			color = stream.readInt();
		}
		if (type == 3) {
			color = stream.readInt();
			filled = stream.readUnsignedByte() == 1;
			top_transparency = stream.readUnsignedByte();
		}
		if (type == 9) {
			line_width = stream.readUnsignedByte();
			color = stream.readInt();
			line_direction = stream.readUnsignedByte() == 1;
		}
		int clickMask = stream.readTriByte();
		int l = stream.readUnsignedByte();

		if (l != 0) {
			f_ed = new int[11];
			aByteArray3214 = new byte[11];
			aByteArray3291 = new byte[11];
			for (/**/; l != 0; l = stream.readUnsignedByte()) {
				int i_19_ = -1 + (l >> 4);
				l = l << 8 | stream.readUnsignedByte();
				l &= 0xfff;
				if (l == 4095)
					l = -1;
				byte i_20_ = stream.readByte();
				if (i_20_ != 0)
					f_bd = true;
				byte i_21_ = stream.readByte();
				f_ed[i_19_] = l;
				aByteArray3214[i_19_] = i_20_;
				aByteArray3291[i_19_] = i_21_;
			}
		}

		if (l != 0) {
			aByteArray3291 = new byte[10];
			aByteArray3214 = new byte[10];
			for (; l != 0; l = stream.readUnsignedByte()) {
				int i1 = -1 + (l >> 4);
				l = l << 8 | stream.readUnsignedByte();
				l &= 0xfff;
				if (l == 4095)
					l = -1;
				aByteArray3214[i1] = stream.readByte();
				aByteArray3291[i1] = stream.readByte();
			}

		}
		data_text = stream.readString();
		int j1 = stream.readUnsignedByte();
		int l1 = j1 >> 4;
		int k1 = 0xf & j1;
		if (k1 > 0) {
			if3_actions = new String[k1];
			for (int i2 = 0; i2 < k1; i2++)
				if3_actions[i2] = stream.readString();

		}
		if (l1 > 0) {
			int j2 = stream.readUnsignedByte();
			f_pc = new int[j2 + 1];
			for (int i3 = 0; f_pc.length > i3; i3++)
				f_pc[i3] = -1;

			f_pc[j2] = stream.readUnsignedShort();
		}
		if (l1 > 1) {
			int k2 = stream.readUnsignedByte();
			f_pc[k2] = stream.readUnsignedShort();
		}
		aString3229 = stream.readString();
		if (aString3229.equals(""))
			aString3229 = null;
		int action = -1;
		drag_zone_size = stream.readUnsignedByte();
		drag_threshhold = stream.readUnsignedByte();
		anInt3205 = stream.readUnsignedByte();
		selected_action_name = stream.readString();
		if (Class259_Sub3_Sub1.method2841(9921, clickMask) != 0) {
			action = stream.readUnsignedShort();
			anInt3234 = stream.readUnsignedShort();
			if (~action == 0xffff0000)
				action = -1;
			if (~anInt3234 == 0xffff0000)
				anInt3234 = -1;
			anInt3199 = stream.readUnsignedShort();
			if (~anInt3199 == 0xffff0000)
				anInt3199 = -1;
		}
		click_mask = new ClickMaskNode(clickMask, action);
		on_load_listener = decode_listener(stream);
		on_mouse_over_listener = decode_listener(stream);
		on_mouse_leave_listener = decode_listener(stream);
		on_target_leave_listener = decode_listener(stream);
		on_target_enter_listener = decode_listener(stream);
		on_varp_update_listener = decode_listener(stream);
		on_inventory_update_listener = decode_listener(stream);
		skill_listener_triggers = decode_listener(stream);
		on_loop_cycle_listener = decode_listener(stream);
		on_option_click_listener = decode_listener(stream);
		on_mouse_repeat_listener = decode_listener(stream);
		on_click_listener = decode_listener(stream);
		on_click_repeat_listener = decode_listener(stream);
		on_release_listener = decode_listener(stream);
		on_hold_listener = decode_listener(stream);
		on_drag_listener = decode_listener(stream);
		on_drag_complete_listener = decode_listener(stream);
		on_mouse_wheel_listener = decode_listener(stream);
		varc_change_listener = decode_listener(stream);
		varc_str_change_listener = decode_listener(stream);
		varp_listener_triggers = decode_trigger(stream);
		inventory_listener_triggers = decode_trigger(stream);
		on_skill_update_listener = decode_trigger(stream);
		varc_change_triggers = decode_trigger(stream);
		varc_str_change_triggers = decode_trigger(stream);
	}

	void decode_if3_osrs(Buffer buffer) {
		buffer.readUnsignedByte(); // L: 421
		this.if3_format = true; // L: 422
		this.type = buffer.readUnsignedByte(); // L: 423
		this.content_type = buffer.readUnsignedShort(); // L: 424
		this.original_x = buffer.readShort(); // L: 425
		this.original_y = buffer.readShort(); // L: 426
		this.original_width = buffer.readUnsignedShort(); // L: 427
		if (this.type == 9) { // L: 428
			this.original_height = buffer.readShort();
		} else {
			this.original_height = buffer.readUnsignedShort(); // L: 429
		}

		this.horizontal_alignment = buffer.readByte(); // L: 430
		this.vertical_alignment = buffer.readByte(); // L: 431
		this.alignment_x = buffer.readByte(); // L: 432
		this.alignment_y = buffer.readByte(); // L: 433
		this.parent_id = buffer.readUnsignedShort(); // L: 434
		if (this.parent_id == 65535) { // L: 435
			this.parent_id = -1;
		} else {
			this.parent_id += this.hash & -65536; // L: 436
		}

		this.hidden = buffer.readUnsignedByte() == 1; // L: 437
		if (this.type == 0) { // L: 438
			this.scroll_width = buffer.readUnsignedShort(); // L: 439
			this.scroll_height = buffer.readUnsignedShort(); // L: 440
			this.no_click_through = buffer.readUnsignedByte() == 1; // L: 441
		}

		if (this.type == 5) { // L: 443
			this.disabled_sprite = buffer.readInt(); // L: 444
			this.sprite_angle = buffer.readUnsignedShort(); // L: 445
			this.sprite_tiling = buffer.readUnsignedByte() == 1; // L: 446
			this.top_transparency = buffer.readUnsignedByte(); // L: 447
			this.border_width = buffer.readUnsignedByte(); // L: 448
			this.border_color = buffer.readInt(); // L: 449
			this.flipped_vertically = buffer.readUnsignedByte() == 1; // L: 450
			this.flipped_horizontally = buffer.readUnsignedByte() == 1; // L: 451
		}

		if (this.type == 6) { // L: 453
			this.model_type = 1; // L: 454
			this.model_id = buffer.readUnsignedShort(); // L: 455
			if (this.model_id == 65535) { // L: 456
				this.model_id = -1;
			}

			this.translate_x = buffer.readShort(); // L: 457
			this.translate_y = buffer.readShort(); // L: 458
			this.model_rotation_x = buffer.readUnsignedShort(); // L: 459
			this.model_rotation_y = buffer.readUnsignedShort(); // L: 460
			this.model_rotation_z = buffer.readUnsignedShort(); // L: 461
			this.model_zoom = buffer.readUnsignedShort(); // L: 462
			this.sequence_id = buffer.readUnsignedShort(); // L: 463
			if (this.sequence_id == 65535) { // L: 464
				this.sequence_id = -1;
			}

			this.model_orthogonal = buffer.readUnsignedByte() == 1; // L: 465
			buffer.readUnsignedShort(); // L: 466
			if (this.horizontal_alignment != 0) { // L: 467
				this.dynamic_width = buffer.readUnsignedShort();
			}

			if (this.vertical_alignment != 0) { // L: 468
				buffer.readUnsignedShort(); // L: 469
			}
		}

		if (this.type == 4) { // L: 472
			this.font_id = buffer.readUnsignedShort(); // L: 473
			if (this.font_id == 65535) { // L: 474
				this.font_id = -1;
			}

			this.text = buffer.readStringCp1252NullTerminated(); // L: 475
			this.line_height = buffer.readUnsignedByte(); // L: 476
			this.horizontal_text_alignment = buffer.readUnsignedByte(); // L: 477
			this.vertical_text_alignment = buffer.readUnsignedByte(); // L: 478
			this.text_shadow = buffer.readUnsignedByte() == 1; // L: 479
			this.color = buffer.readInt(); // L: 480
		}

		if (this.type == 3) { // L: 482
			this.color = buffer.readInt(); // L: 483
			this.filled = buffer.readUnsignedByte() == 1; // L: 484
			this.top_transparency = buffer.readUnsignedByte(); // L: 485
		}

		if (this.type == 9) { // L: 487
			this.line_width = buffer.readUnsignedByte(); // L: 488
			this.color = buffer.readInt(); // L: 489
			this.line_direction = buffer.readUnsignedByte() == 1; // L: 490
		}
		int click_mask = buffer.readTriByte();
		this.data_text = buffer.readStringCp1252NullTerminated(); // L: 493
		int var2 = buffer.readUnsignedByte(); // L: 494
		int action = 0;
		if (var2 > 0) {
			this.if3_actions = new String[var2];
			for (action = 0; action < var2; ++action) {
				this.if3_actions[action] = buffer.readNullTerminatedString();
			}
		}

		this.click_mask = new ClickMaskNode(click_mask, action);

		this.drag_zone_size = buffer.readUnsignedByte(); // L: 499
		this.drag_threshhold = buffer.readUnsignedByte(); // L: 500
		this.has_scroll_bar = buffer.readUnsignedByte() == 1; // L: 501
		this.selected_action_name = buffer.readStringCp1252NullTerminated(); // L: 502
		this.on_load_listener = this.decode_listener(buffer); // L: 503
		this.on_mouse_over_listener = this.decode_listener(buffer); // L: 504
		this.on_mouse_leave_listener = this.decode_listener(buffer); // L: 505
		this.on_target_leave_listener = this.decode_listener(buffer); // L: 506
		this.on_target_enter_listener = this.decode_listener(buffer); // L: 507
		this.on_varp_update_listener = this.decode_listener(buffer); // L: 508
		this.on_inventory_update_listener = this.decode_listener(buffer); // L: 509
		this.skill_listener_triggers = this.decode_listener(buffer); // L: 510
		this.on_loop_cycle_listener = this.decode_listener(buffer); // L: 511
		this.on_option_click_listener = this.decode_listener(buffer); // L: 512
		this.on_mouse_repeat_listener = this.decode_listener(buffer); // L: 513
		this.on_click_listener = this.decode_listener(buffer); // L: 514
		this.on_click_repeat_listener = this.decode_listener(buffer); // L: 515
		this.on_release_listener = this.decode_listener(buffer); // L: 516
		this.on_hold_listener = this.decode_listener(buffer); // L: 517
		this.on_drag_listener = this.decode_listener(buffer); // L: 518
		this.on_drag_complete_listener = this.decode_listener(buffer); // L: 519
		this.on_mouse_wheel_listener = this.decode_listener(buffer); // L: 520
		this.varp_listener_triggers = this.decode_trigger(buffer); // L: 521
		this.inventory_listener_triggers = this.decode_trigger(buffer); // L: 522
		this.on_skill_update_listener = this.decode_trigger(buffer); // L: 523
	} // L: 524

	final void set_if3_action(String string, int i) {
		try {
			f_hb++;
			if (if3_actions == null || (if3_actions.length <= i)) {
				String[] strings = new String[i + 1];
				if (if3_actions != null) {
					for (int i_38_ = 0; (if3_actions.length > i_38_); i_38_++)
						strings[i_38_] = if3_actions[i_38_];
				}
				if3_actions = strings;
			}
			if3_actions[i] = string;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private final int[] decode_634_trigger(boolean bool, Buffer stream) {
		int i_39_ = stream.readUnsignedByte();
		if (bool != false)
			return null;
		if (i_39_ == 0)
			return null;
		int[] is = new int[i_39_];
		for (int i_40_ = 0; i_39_ > i_40_; i_40_++)
			is[i_40_] = stream.readInt((byte) 113);
		return is;
	}

	private final int[] decode_trigger(Buffer stream) {
		int i_39_ = stream.readUnsignedByte();
		if (i_39_ == 0)
			return null;
		int[] is = new int[i_39_];
		for (int i_40_ = 0; i_39_ > i_40_; i_40_++)
			is[i_40_] = stream.readInt((byte) 113);
		return is;
	}

	final AbstractModel method1509(Class191 class191, SceneGraph class260, Class228 class228, PlayerComposition class27,
			Class45 class45, int i, byte i_41_, SequenceType class124, int i_42_, IdentityKitLoader class92, int i_43_,
			Interface11 interface11, int i_44_, RenderSequenceLoader class_v) {
		try {
			Class_u_Sub1.aBool5687 = false;
			f_od++;
			if (model_type == 0)
				return null;
			if (model_type == 1 && model_id == -1)
				return null;
			if (model_type == 1) {
				int i_45_ = i;
				if (class124 != null)
					i |= class124.method847(i_42_, i_41_ ^ 0x166, i_43_, true);
				AbstractModel class_t = ((AbstractModel) (Class_ls.aClass54_963.method379(
						(long) ((model_type << 16) + (((SceneGraph) class260).anInt3719 << 29) + model_id),
						(byte) 58)));
				if (class_t == null || class260.method1710(class_t.P(), i) != 0) {
					if (class_t != null)
						i = class260.method1723(i, class_t.P());
					Model class103 = Model.get_model(0, Widget.widget_model_index, model_id,
							this.revision < 200 ? Revision.OSRS
									: this.revision == 550 ? Revision.PRE_EOC_550 : Revision.PRE_EOC_634);
					if (class103 == null) {
						Class_u_Sub1.aBool5687 = true;
						return null;
					}
					if (((Model) class103).anInt1358 < 13)
						class103.method646(0, (byte) -47);
					class_t = class260.method1695(class103, i, Class_q_Sub1.anInt6666, 64, 768);
					Class_ls.aClass54_963.method371(i_41_ ^ 0x67, (long) ((model_type << 16) - -model_id), class_t);
				}
				if (class124 != null)
					class_t = class124.method846(i_44_, i, i_43_, i_42_, class_t, i_41_ - 223);
				class_t.UA(i_45_);
				return class_t;
			}
			if (model_type == 2) {
				AbstractModel class_t = (class228.list(model_id).method1634(i_43_, i_44_, 52, i, class124, i_42_,
						interface11, class260, class45));
				if (class_t == null) {
					Class_u_Sub1.aBool5687 = true;
					return null;
				}
				return class_t;
			}
			if (model_type == 3) {
				if (class27 == null)
					return null;
				AbstractModel class_t = class27.method212(i_42_, i_43_, false, class228, class191, interface11, i_44_,
						class124, class92, class260, class45, i);
				if (class_t == null) {
					Class_u_Sub1.aBool5687 = true;
					return null;
				}
				return class_t;
			}
			if (model_type == 4) {
				ObjType class197 = class191.list(22883, model_id);
				AbstractModel class_t = class197.method1281(i_44_, 10, class124, i, i_43_, class27, i_42_, i_41_ - 223,
						class260);
				if (class_t == null) {
					Class_u_Sub1.aBool5687 = true;
					return null;
				}
				return class_t;
			}
			if (i_41_ != 102)
				return null;
			if (model_type == 6) {
				AbstractModel class_t = (class228.list(model_id).method1625(0, 100, class124, interface11, i_43_, i,
						i_44_, 0, class260, i_42_, 0, null, null, class45, class_v));
				if (class_t == null) {
					Class_u_Sub1.aBool5687 = true;
					return null;
				}
				return class_t;
			}
			if (model_type == 7) {
				if (class27 == null)
					return null;
				int i_46_ = model_id >>> 16;
				int i_47_ = 0xffff & model_id;
				int i_48_ = anInt3289;
				AbstractModel class_t = class27.method219(class124, i_41_ - 170, class45, i_46_, i_48_, class92, i,
						i_47_, i_43_, class260, i_44_, i_42_);
				if (class_t == null) {
					Class_u_Sub1.aBool5687 = true;
					return null;
				}
				return class_t;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("uu.H(" + (class191 != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ','
							+ (class228 != null ? "{...}" : "null") + ',' + (class27 != null ? "{...}" : "null") + ','
							+ (class45 != null ? "{...}" : "null") + ',' + i + ',' + i_41_ + ','
							+ (class124 != null ? "{...}" : "null") + ',' + i_42_ + ','
							+ (class92 != null ? "{...}" : "null") + ',' + i_43_ + ','
							+ (interface11 != null ? "{...}" : "null") + ',' + i_44_ + ','
							+ (class_v != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1510(byte i, Stream_Sub1 stream_sub1) {
		try {
			f_lc++;
			int i_49_ = stream_sub1.readBits(-112, 2);
			if (i != -37)
				return -76;
			int i_50_;
			if (i_49_ != 0) {
				if (i_49_ == 1)
					i_50_ = stream_sub1.readBits(-83, 5);
				else if (i_49_ != 2)
					i_50_ = stream_sub1.readBits(-81, 11);
				else
					i_50_ = stream_sub1.readBits(-55, 8);
			} else
				i_50_ = 0;
			return i_50_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"uu.J(" + i + ',' + (stream_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void some_widget(boolean bool, int i, String string, int i_51_, int i_52_, int revision) {
		do {
			try {
				anInt3245++;
				Widget class235 = Widget.get_component(i_51_, i_52_, revision);
				if (class235 != null) {
					if (((Widget) class235).on_option_click_listener != null) {
						ScriptEvent class246_sub29 = new ScriptEvent();
						((ScriptEvent) class246_sub29).source = class235;
						((ScriptEvent) class246_sub29).params = ((Widget) class235).on_option_click_listener;
						((ScriptEvent) class246_sub29).aString4965 = string;
						((ScriptEvent) class246_sub29).anInt4972 = i;
						ScriptExecutor.excute_script_event(class246_sub29, class235);
					}
					boolean bool_53_ = bool;
					if (((Widget) class235).content_type != 0)
						bool_53_ = Class246_Sub28_Sub28.method2812(3, class235);
					if (bool_53_ && Widget.get_active_properties(class235).method2120(i - 1, 1)) {
						if (i == 1) {
							Class243.writePacket(-72, Class172.ACTION_BUTTON1);
							Class46.anInt667++;
							Class250.method1597(23040, i_51_, i_52_, (((Widget) class235).item_id));
						}
						if (i == 2) {
							Class243.writePacket(-67, Class217.ACTION_BUTTON2);
							f_nd++;
							Class250.method1597(23040, i_51_, i_52_, (((Widget) class235).item_id));
						}
						if (i == 3) {
							Class243.writePacket(-69, Class259_Sub1.ACTION_BUTTON3);
							Class223.anInt3070++;
							Class250.method1597(23040, i_51_, i_52_, (((Widget) class235).item_id));
						}
						if (i == 4) {
							Class246_Sub28_Sub7.anInt6053++;
							Class243.writePacket(-49, Class_w.ACTION_BUTTON4);
							Class250.method1597(23040, i_51_, i_52_, (((Widget) class235).item_id));
						}
						if (i == 5) {
							Class243.writePacket(-125, Class188_Sub1.ACTION_BUTTON5);
							Class137.anInt1948++;
							Class250.method1597(23040, i_51_, i_52_, (((Widget) class235).item_id));
						}
						if (i == 6) {
							Class243.writePacket(-101, Class109_Sub1.ACTION_BUTTON9);
							Class59_Sub4_Sub3.anInt6953++;
							Class250.method1597(23040, i_51_, i_52_, (((Widget) class235).item_id));
						}
						if (i == 7) {
							Class243.writePacket(-121, Class155.ACTION_BUTTON6);
							Class101.anInt1308++;
							Class250.method1597(23040, i_51_, i_52_, (((Widget) class235).item_id));
						}
						if (i == 8) {
							Class243.writePacket(-73, Class121.ACTION_BUTTON7);
							MapScenes.anInt3632++;
							Class250.method1597(23040, i_51_, i_52_, (((Widget) class235).item_id));
						}
						if (i == 9) {
							Class243.writePacket(-70, Class224.ACTION_BUTTON10);
							Class_e.anInt1210++;
							Class250.method1597(23040, i_51_, i_52_, (((Widget) class235).item_id));
						}
						if (i != 10)
							break;
						Class243.writePacket(-64, ACTION_BUTTON8);
						Class63_Sub1.anInt4716++;
						Class250.method1597(23040, i_51_, i_52_, ((Widget) class235).item_id);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	final Font method1512(SceneGraph class260, int i) {
		try {
			anInt3251++;
			Class_u_Sub1.aBool5687 = false;
			if (i == font_id) {
				return null;
			}
			Font class116 = font_id == 4040 || font_id == 3793 || font_id == 2710 || font_id == 307 || font_id == 591
					? ((Font) Class216.font_cache.method379((long) (font_id), (byte) 58))
					: Settings.gamefonts == Revision.OSRS
							? ((Font) Class216.osrs_font_cache.method379((long) (font_id), (byte) 58))
							: Settings.gamefonts == Revision.OSRS
									? ((Font) Class216.font_cache_550.method379((long) (font_id), (byte) 58))
									: ((Font) Class216.font_cache.method379((long) (font_id), (byte) 58));
			if (class116 != null)
				return class116;
			LDSprite[] class10s = LDSprite
					.method125(font_id == 4040 || font_id == 3793 || font_id == 2710 || font_id == 307 || font_id == 591
							? pre_eoc_634_sprite_index
							: Settings.gamefonts == Revision.OSRS ? osrs_sprite_index
									: Settings.gamefonts == Revision.PRE_EOC_550 ? pre_eoc_550_sprite_index
											: pre_eoc_634_sprite_index,
							font_id);
			if (class10s == null) {
				Class_u_Sub1.aBool5687 = true;
				return null;
			}
			FontMetric class73 = SequenceLoader.method2763(font_id, Widget.widget_font_index, -18318);
			if (class73 == null) {
				Class_u_Sub1.aBool5687 = true;
				return null;
			}
			class116 = class260.method1716(class73, class10s, true);
			(font_id == 4040 || font_id == 3793 || font_id == 2710 || font_id == 307 || font_id == 591
					? Class216.font_cache
					: Settings.gamefonts == Revision.OSRS ? Class216.osrs_font_cache
							: Settings.gamefonts == Revision.PRE_EOC_550 ? Class216.font_cache_550
									: Class216.font_cache)
					.method371(1, (long) font_id, class116);
			return class116;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"uu.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Class230 method1513(int i, Class214 class214, Class203 class203) {
		try {
			int i_54_ = 127 / ((-54 - i) / 56);
			anInt3196++;
			if (anInt3213 == -1)
				return null;
			long l = ((0xffffL & (long) f_fb) << 16
					| (65535L << 48 & (long) anInt3204 << 48 | (0xffffL & (long) anInt3249) << 32)
					| (long) anInt3213 & 0xffffL);
			Class230 class230 = (Class230) Class84.aClass54_1097.method379(l, (byte) 58);
			if (class230 == null) {
				class230 = class203.method1335(anInt3204, anInt3213, 123, anInt3249, f_fb, class214);
				Class84.aClass54_1097.method371(1, l, class230);
			}
			return class230;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.F(" + i + ',' + (class214 != null ? "{...}" : "null") + ','
					+ (class203 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class128 method1514(int i, SceneGraph class260) {
		f_kb++;
		Class128 class128 = ((Class128) Class29.aClass54_387.method379((long) (hash), (byte) 58));
		if (class128 != null)
			return class128;

		LDSprite class10 = LDSprite.get_sprite(get_widget_sprite_index(), disabled_sprite, 0);
		if (class10 == null)
			return null;
		int i_55_ = (((LDSprite) class10).anInt159 + ((LDSprite) class10).anInt156 + ((LDSprite) class10).anInt158);
		int i_56_ = (((LDSprite) class10).anInt155 + ((LDSprite) class10).anInt162 - -((LDSprite) class10).anInt163);
		f_ld = new int[i_56_];
		f_hc = new int[i_56_];
		for (int i_57_ = i; ((LDSprite) class10).anInt155 > i_57_; i_57_++) {
			int i_58_ = 0;
			int i_59_ = i_55_;
			for (int i_60_ = 0; ((LDSprite) class10).anInt156 > i_60_; i_60_++) {
				if ((((LDSprite) class10).aByteArray157[i_60_ - -(((LDSprite) class10).anInt156 * i_57_)]) != 0) {
					i_58_ = i_60_;
					break;
				}
			}
			for (int i_61_ = i_58_; (((LDSprite) class10).anInt156 > i_61_); i_61_++) {
				if ((((LDSprite) class10).aByteArray157[((LDSprite) class10).anInt156 * i_57_ + i_61_]) == 0) {
					i_59_ = i_61_;
					break;
				}
			}
			f_ld[i_57_ + ((LDSprite) class10).anInt162] = i_58_ - -((LDSprite) class10).anInt158;
			f_hc[((LDSprite) class10).anInt162 + i_57_] = i_59_ + -i_58_;
		}
		class128 = class260.method1726(i_55_, i_56_, f_ld, f_hc);
		Class29.aClass54_387.method371(1, (long) hash, class128);
		return class128;
	}

	final Class128 method1514(int i, SceneGraph class260, int sprite_id) {
		try {
			f_kb++;
			Class128 class128 = ((Class128) Class29.aClass54_387.method379((long) (hash), (byte) 58));
			if (class128 != null)
				return class128;
			LDSprite class10 = LDSprite.get_sprite(pre_eoc_634_sprite_index, sprite_id, 0);
			if (class10 == null)
				return null;
			int i_55_ = (((LDSprite) class10).anInt159 + ((LDSprite) class10).anInt156 + ((LDSprite) class10).anInt158);
			int i_56_ = (((LDSprite) class10).anInt155 + ((LDSprite) class10).anInt162
					- -((LDSprite) class10).anInt163);
			f_ld = new int[i_56_];
			f_hc = new int[i_56_];
			for (int i_57_ = i; ((LDSprite) class10).anInt155 > i_57_; i_57_++) {
				int i_58_ = 0;
				int i_59_ = i_55_;
				for (int i_60_ = 0; ((LDSprite) class10).anInt156 > i_60_; i_60_++) {
					if ((((LDSprite) class10).aByteArray157[i_60_ - -(((LDSprite) class10).anInt156 * i_57_)]) != 0) {
						i_58_ = i_60_;
						break;
					}
				}
				for (int i_61_ = i_58_; (((LDSprite) class10).anInt156 > i_61_); i_61_++) {
					if ((((LDSprite) class10).aByteArray157[((LDSprite) class10).anInt156 * i_57_ + i_61_]) == 0) {
						i_59_ = i_61_;
						break;
					}
				}
				f_ld[i_57_ + ((LDSprite) class10).anInt162] = i_58_ - -((LDSprite) class10).anInt158;
				f_hc[((LDSprite) class10).anInt162 + i_57_] = i_59_ + -i_58_;
			}
			class128 = class260.method1726(i_55_, i_56_, f_ld, f_hc);
			Class29.aClass54_387.method371(1, (long) hash, class128);
			return class128;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("uu.A(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1515(int i) {
		try {
			f_tc = null;
			if (i != -7975)
				ACTION_BUTTON8 = null;
			ACTION_BUTTON8 = null;
			f_qb = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uu.P(" + i + ')');
		}
	}

	final String method1516(String string, int i, int i_62_) {
		try {
			anInt3225++;
			if (f_jd == null)
				return string;
			if (i_62_ != -26191)
				original_x = 16;
			Class246_Sub4 class246_sub4 = (Class246_Sub4) f_jd.get((long) i);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("uu.G(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_62_ + ')'));
		}
	}

	final void method1517(int i, int i_63_, int i_64_) {
		do {
			try {
				anInt3303++;
				if (f_jd == null) {
					f_jd = new IterableNodeHashTable(16);
					f_jd.method547((long) i, -2301, new SwitchInt(i_63_));
				} else {
					SwitchInt class246_sub33 = (SwitchInt) f_jd.get((long) i);
					do {
						if (class246_sub33 != null) {
							((SwitchInt) class246_sub33).value = i_63_;
							if (!Client.f_ob)
								break;
						}
						f_jd.method547((long) i, -2301, new SwitchInt(i_63_));
					} while (false);
					if (i_64_ < -115)
						break;
					method1500(-111, -128, -24);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("uu.O(" + i + ',' + i_63_ + ',' + i_64_ + ')'));
			}
			break;
		} while (false);
	}

	static final void click_widget(Widget class235, int i_1_, int i_0_, int i) {
		try {
			Class246_Sub28_Sub6.anInt6036++;
			if (Class150.aClass235_2196 == null && !ContextMenus.context_menu_open
					&& (class235 != null && Class5.method60(i + 3547, class235) != null)) {
				Class150.aClass235_2196 = class235;
				Class33.aClass235_445 = Class5.method60(3547, class235);
				Class246_Sub43.anInt5605 = i_0_;
				SequenceLoader.anInt6734 = i;
				Class99.anInt1292 = i_1_;
				Class246_Sub1_Sub2.aBool5698 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("eq.A(" + i + ',' + i_0_ + ',' + (class235 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	static final void close_widget(boolean bool, WidgetParent class246_sub40, boolean bool_0_, int i, int revision,
			String from) {
		try {
			Class50.anInt709++;
			int i_1_ = ((WidgetParent) class246_sub40).anInt5517;
			int i_2_ = (int) ((Node) class246_sub40).hash;
			class246_sub40.remove();
			if (bool)
				reset_widget(i_1_);
			Class128_Sub2.method2335(i_1_, (byte) -58, revision);
			Widget class235 = get_widget(i_2_, revision);
			if (class235 != null)
				redraw_widget(class235);
			if (i >= -16)
				Class50.method331(-27, -95, null, -41);
			Class115.method780(22);
			if (!bool_0_ && (root_interface ^ 0xffffffff) != 0) {
				SwitchInt.method2180(root_interface, -1, 1, get_widget(root_interface << 16, revision).revision);
			}
			Class16 class16 = new Class16(get_widget_parents(revision));
			for (WidgetParent class246_sub40_3_ = (WidgetParent) class16.method161(
					4); class246_sub40_3_ != null; class246_sub40_3_ = (WidgetParent) class16.method160(true)) {
				if (!class246_sub40_3_.method1576(-115)) {
					class246_sub40_3_ = (WidgetParent) class16.method161(4);
					if (class246_sub40_3_ == null)
						break;
				}
				if (((WidgetParent) class246_sub40_3_).type == 3) {
					int i_4_ = (int) ((Node) class246_sub40_3_).hash;
					if (i_4_ >>> 16 == i_1_)
						close_widget(true, class246_sub40_3_, bool_0_, -34, revision, "here10");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int get_active_properties(int var0) {
		return var0 >> 11 & 63; // L: 17
	}

	static final ClickMaskNode get_active_properties(Widget widget) {
		ClickMaskNode class246_sub27 = ((ClickMaskNode) Widget.get_widget_flags(widget.revision)
				.get((((long) (widget.hash) << 32) + (long) widget.index)));
		if (class246_sub27 != null)
			return class246_sub27;
		return widget.click_mask;
	}

	static final void resize_interface(Widget[] class235s, int i, int i_44_, int i_45_, int i_46_, boolean bool) {
		try {
			for (int i_47_ = 0; i_47_ < class235s.length; i_47_++) {
				Widget class235 = class235s[i_47_];
				if (class235 != null && ((Widget) class235).parent_id == i_46_) {
					Class_c.method583(bool, i, class235, 46, i_44_);
					Class169.method1124(class235, i, i_44_, 2);
					if ((((Widget) class235).horizontal_scroll_position
							^ 0xffffffff) < ((((Widget) class235).scroll_width + -((Widget) class235).screen_width)
									^ 0xffffffff))
						((Widget) class235).horizontal_scroll_position = (((Widget) class235).scroll_width
								- ((Widget) class235).screen_width);
					if ((((Widget) class235).horizontal_scroll_position ^ 0xffffffff) > -1)
						((Widget) class235).horizontal_scroll_position = 0;
					if ((((Widget) class235).vertical_scroll_position
							^ 0xffffffff) < ((((Widget) class235).scroll_height + -((Widget) class235).screen_height)
									^ 0xffffffff))
						((Widget) class235).vertical_scroll_position = (-((Widget) class235).screen_height
								+ ((Widget) class235).scroll_height);
					if (((Widget) class235).vertical_scroll_position < 0)
						((Widget) class235).vertical_scroll_position = 0;
					if ((((Widget) class235).type ^ 0xffffffff) == -1)
						update_layer(class235, -1, bool);
				}
			}
			Texture.anInt6566++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kv.H(" + i + ',' + i_44_ + ','
					+ (class235s != null ? "{...}" : "null") + ',' + i_45_ + ',' + i_46_ + ',' + bool + ')'));
		}
	}

	static final void reset_widget(int widget_id) {
		if (loaded_widgets.length > widget_id && loaded_widgets[widget_id]) {
			widget_data_index.method102(-1, widget_id);
			widgets[widget_id] = null;
			some_634_widgets[widget_id] = null;
			loaded_widgets[widget_id] = false;
		}
	}

	static final void update_layer(int i, boolean bool) {
		try {
			Class194_Sub2.anInt4953++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 127, 11);
			if (bool != false)
				Class194_Sub2.method2146(96, (byte) -26);
			class246_sub1_sub10.method2604((byte) -84);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "om.G(" + i + ',' + bool + ')');
		}
	}

	static void update_layer(Widget[] var0, Widget widget, boolean bool) {
		int var3 = widget.scroll_width != 0 ? widget.scroll_width * -362959503 * 351761297
				: widget.screen_width * -559707675 * 137530349; // L: 10925
		int var4 = widget.scroll_height != 0 ? widget.scroll_height * 991543577 * -390853847
				: widget.screen_height * 147077041 * -113659567; // L: 10926
		Widget.resize_interface(var0, var3,
				var4, 22611,
				widget.hash, bool);
		if (widget.components != null) { // L: 10928
			Widget.resize_interface(widget.components, var3, var4, 22611,
					(((Widget) widget).hash), bool);
		}
		WidgetParent class246_sub40 = ((WidgetParent) (Widget.get_widget_parents(widget.revision)
				.get((long) ((Widget) widget).hash)));
		if (class246_sub40 != null) {
			Class221.method1433(-1, bool, var4, (((WidgetParent) class246_sub40).anInt5517), var3,
					widget.revision);
		}

	}

	static final void update_layer(Widget widget, int i, boolean bool) {
		do {
			try {
				Class259_Sub3_Sub1.anInt6897++;
				int var3 = ((((Widget) widget).scroll_width ^ 0xffffffff) != -1 ? ((Widget) widget).scroll_width
						: ((Widget) widget).screen_width);
				int var4 = ((((Widget) widget).scroll_height ^ 0xffffffff) != i ? ((Widget) widget).scroll_height
						: ((Widget) widget).screen_height);
				Widget.resize_interface((Widget.get_widget_cache(widget.revision)[((Widget) widget).hash >> 16]), var3,
						var4, 22611,
						((Widget) widget).hash, bool);
				if (((Widget) widget).components != null)
					Widget.resize_interface(((Widget) widget).components, var3, var4, i + 22612,
							(((Widget) widget).hash), bool);
				WidgetParent class246_sub40 = ((WidgetParent) (Widget.get_widget_parents(widget.revision)
						.get((long) ((Widget) widget).hash)));
				if (class246_sub40 == null)
					break;
				Class221.method1433(-1, bool, var4, (((WidgetParent) class246_sub40).anInt5517), var3,
						widget.revision);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	static final void revalidate_widget_scroll(int i, boolean bool) {
		try {
			Class194_Sub2.anInt4953++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 127, 11);
			if (bool != false)
				Class194_Sub2.method2146(96, (byte) -26);
			class246_sub1_sub10.method2604((byte) -84);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "om.G(" + i + ',' + bool + ')');
		}
	}

	static final void update_dynamic_components(Widget class235) {
		try {
			Class246_Sub12.anInt4398++;
			Widget class235_4_ = Class5.method59(class235, (byte) 73);
			int i_5_;
			int i_6_;
			do {
				if (class235_4_ == null) {
					i_5_ = Client.client_height;
					i_6_ = Client.client_width;
					if (!Client.f_ob)
						break;
				}
				i_6_ = ((Widget) class235_4_).screen_width;
				i_5_ = ((Widget) class235_4_).screen_height;
			} while (false);
			Class_c.method583(false, i_6_, class235, -124, i_5_);
			Class169.method1124(class235, i_6_, i_5_, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static final Widget get_component(int i, int i_12_, int revision) {
		try {
			Class211.anInt2959++;
			Widget class235 = get_widget(i, revision);
			if ((i_12_ ^ 0xffffffff) == 0)
				return class235;
			if (class235 == null || ((Widget) class235).components == null
					|| i_12_ >= ((Widget) class235).components.length)
				return null;
			return ((Widget) class235).components[i_12_];
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	static final void redraw_widget(Widget class235) {
		do {
			try {
				Stream_Sub1.anInt5860++;
				if (((Widget) class235).f_bb != Class130_Sub6.anInt4841)
					break;
				Class246_Sub39.aBoolArray5488[((Widget) class235).anInt3297] = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		} while (false);
	}

	public static final boolean native_osrs_widget(final int widget_id) {
		return false;
	}

	static final boolean load_widget(int widget_id, int revision, int from) {
		if (revision == 0) {
			// System.out.println("widget " + widget_id + " is rev 0");
		}
		CacheIndex data_index = revision == 0 ? custom_osrs_widget_data_index
				: revision == 1 ? custom_pre_eoc_550_widget_data_index
						: revision < 200 ? osrs_widget_data_index
								: revision == 550 ? pre_eoc_550_widget_index : widget_data_index;
		if (Widget.get_loaded_widgets(revision)[widget_id]) {
			return true;
		}
		if (!data_index.contains(widget_id)) {
			return false;
		}
		int child_count = data_index.child_count(widget_id);
		if (child_count == 0) {
			Widget.get_loaded_widgets(revision)[widget_id] = true;
			return true;
		}
		if (Widget.get_widget_cache(revision)[widget_id] == null) {
			Widget.get_widget_cache(revision)[widget_id] = new Widget[child_count];
		}
		for (int child = 0; child_count > child; child++) {
			if (Widget.get_widget_cache(revision)[widget_id][child] == null) {
				byte[] data;
				data = data_index.get_file(child, widget_id);
				Widget.get_widget_cache(revision)[widget_id][child] = new Widget();
				Widget.get_widget_cache(revision)[widget_id][child].hash = child + (widget_id << 16);
				Widget.get_widget_cache(revision)[widget_id][child].revision = revision;
				if (data != null) {
					if (data[0] == -1) {
						if (revision == 0) {
							Widget.get_widget_cache(revision)[widget_id][child].decode_if3_osrs(new Buffer(data));
						} else if (revision == 1) {
							Widget.get_widget_cache(revision)[widget_id][child].decode_if3_550(new Buffer(data),
									widget_id, child, revision);
						} else if (revision < 200) {
							Widget.get_widget_cache(revision)[widget_id][child].decode_if3_osrs(new Buffer(data));
						} else if (revision == 550) {
							Widget.get_widget_cache(revision)[widget_id][child].decode_if3_550(new Buffer(data),
									widget_id, child, revision);
						} else {
							Widget.get_widget_cache(revision)[widget_id][child].decode_634_if3(new Buffer(data), true);
						}
					} else {
						if (revision == 0) {
							Widget.get_widget_cache(revision)[widget_id][child].decode_if1_osrs(new Buffer(data));
						} else if (revision == 1) {
							Widget.get_widget_cache(revision)[widget_id][child].decode_if1(new Buffer(data));
						} else if (revision < 200) {
							Widget.get_widget_cache(revision)[widget_id][child].decode_if1_osrs(new Buffer(data));
						} else {
							Widget.get_widget_cache(revision)[widget_id][child].decode_if1(new Buffer(data));
						}

					}
				}
			}
		}
		Widget.get_loaded_widgets(revision)[widget_id] = true;
		return true;
	}

	public Widget() {
		this.prioritize_menu_entry = false; // L: 187
		item_id = -1;
		anInt3199 = -1;
		line_width = 1;
		font_id = -1;
		anInt3200 = 1;
		anInt3217 = 3000;
		anInt3213 = -1;
		disabled_sprite = -1;
		enabled_sprite = -1;
		original_height = 0;
		sequence_id = -1;
		anInt3205 = ClickMaskNode.anInt4894;
		f_bb = -1;
		click_mask = Class43.aClass246_Sub27_635;
		border_color = 0;
		original_y = 0;
		aBool3252 = false;
		line_direction = false;
		dynamic_width = 0;
		model_frame_cycle = 0;
		f_db = false;
		this.has_scroll_bar = false; // L: 125
		this.fill_mode = FillMode.SOLID; // L: 67
		this.model_transparency = false; // L: 95
		color = 0;
		model_frame = 0;
		dynamic_height = 0;
		original_x = 0;
		anInt3267 = -1;
		text_shadow = false;
		original_width = 0;
		has_listener = false;
		item_quantity = 0;
		anInt3234 = -1;
		anInt3233 = -1;
		anInt3263 = 0;
		screen_height = 0;
		drag_threshhold = 0;
		parent = null;
		model_type = 1;
		hash = -1;
		anInt3255 = 0;
		data_text = "";
		sprite_angle = 0;
		anInt3271 = 0;
		item_quantity_mode = 2;
		screen_width = 0;
		f_rc = false;
		aBool3277 = false;
		f_tb = 0;
		border_width = 0;
		aBool3219 = false;
		model_rotation_z = 0;
		drag_zone_size = 0;
		vertical_alignment = (byte) 0;
		horizontal_alignment = (byte) 0;
		vertical_scroll_position = 0;
		alignment_y = (byte) 0;
		anInt3297 = -1;
		no_click_through = false;
		translate_y = 0;
		anInt3289 = -1;
		translate_x = 0;
		alignment_x = (byte) 0;
		vertical_text_alignment = 0;
		selected_action_name = "";
		line_height = 0;
		x = 0;
		filled = false;
		model_orthogonal = false;
		scroll_width = 0;
		text = "";
		model_zoom = 100;
		f_qc = 0;
		scroll_height = 0;
		anInt3288 = 0;
		horizontal_text_alignment = 0;
		top_transparency = 0;
		sprite_tiling = false;
		hidden = false;
		horizontal_scroll_position = 0;
		model_rotation_y = 0;
		model_rotation_x = 0;
		parent_id = -1;
		f_bd = false;
		y = 0;
		anInt3259 = 0;
		f_md = 0;
		f_cd = 1;
		anInt3272 = 0;
		anInt3284 = -1;
		index = -1;
		content_type = 0;
		no_scroll_through = false;
	}

	static {
		f_qb = new Class166();
		ACTION_BUTTON8 = new OutgoingPacket(70, 8);
		f_kd = -1;
	}

	public static void set_key_ignore_held(Widget var4, int var11) {
		// TODO Auto-generated method stub

	}

	public static void set_key_rate(Widget var4, int var11, int var6, int var7) {
		// TODO Auto-generated method stub

	}

	public static void set_key(Widget var4, int var7, byte[] var10, byte[] var8) {
		// TODO Auto-generated method stub

	}
}
