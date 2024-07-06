package io;

import java.util.ArrayList;
import java.util.List;

import io.cache.Cache;
import io.cache.IndexConstants;
import io.cache.Revision;
import io.osrs_chat.Message;

final class CS2Script extends NodeSub {

	static AlsoSomeObj field1302;
	int[] opcodes;
	int int_param_count;
	int[] integer_operands;
	int int_var_count;
	String[] string_operands;
	int string_var_count;
	static int anInt5674;
	int string_param_count;
	static int anInt5676;
	String name;
	static int anInt5678;
	IterableNodeHashTable[] switches;
	static int anInt5680;
	Class169 aClass169_5681;
	public int id;
	public int scriptId;
	static int int_stack_size;
	static int[] int_stack;
	static int string_stack_size = 0;
	static String[] string_stack;
	static int anInt5682;

	public List<Integer> getLinkedInterfaces() {
		List<Integer> linkedInterfaces = new ArrayList<Integer>();
		for (int i = 0; i < integer_operands.length; i++) {
			int interfaceId = integer_operands[i] >> 16;
			if (interfaceId <= 0 || linkedInterfaces.contains(interfaceId))
				continue;
			linkedInterfaces.add(interfaceId);
		}
		return linkedInterfaces;
	}

	static final AbstractModel method2415(int i, int i_0_, AbstractModel class_t, int i_1_, int i_2_, int i_3_,
			SceneGraph class260, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, SequenceType class124,
			int i_9_) {
		try {
			anInt5680++;
			if (class_t == null)
				return null;
			int i_10_ = 2055;
			if (class124 != null) {
				i_10_ |= class124.method847(i_8_, 256, -1, false);
				i_10_ &= ~0x200;
			}
			long l = (((long) i_3_ << 48) + (long) ((i_9_ << 24) + (i_6_ - -(i_4_ << 16))) + ((long) i_1_ << 32));
			AbstractModel class_t_11_;
			synchronized (Clan.aClass54_7109) {
				class_t_11_ = (AbstractModel) Clan.aClass54_7109.method379(l, (byte) 58);
			}
			if (i_5_ < 98)
				return null;
			if (class_t_11_ == null || ((class260.method1710(class_t_11_.P(), i_10_) ^ 0xffffffff) != -1)) {
				if (class_t_11_ != null)
					i_10_ = class260.method1723(i_10_, class_t_11_.P());
				int i_12_;
				if (i_6_ != 1) {
					if ((i_6_ ^ 0xffffffff) == -3)
						i_12_ = 12;
					else if ((i_6_ ^ 0xffffffff) != -4) {
						if ((i_6_ ^ 0xffffffff) != -5)
							i_12_ = 21;
						else
							i_12_ = 18;
					} else
						i_12_ = 15;
				} else
					i_12_ = 9;
				int i_13_ = 3;
				int[] is = { 64, 96, 128 };
				Model class103 = new Model(1 - -(i_13_ * i_12_), -i_12_ + 2 * (i_12_ * i_13_), 0);
				int i_14_ = class103.method647(0, 0, 0, 0);
				int[][] is_15_ = new int[i_13_][i_12_];
				for (int i_16_ = 0; (i_13_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
					int i_17_ = is[i_16_];
					int i_18_ = is[i_16_];
					for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
						int i_20_ = (i_19_ << 14) / i_12_;
						int i_21_ = i_17_ * MathUtils.SINE[i_20_] >> 15;
						int i_22_ = MathUtils.COSINE[i_20_] * i_18_ >> 15;
						is_15_[i_16_][i_19_] = class103.method647(i_22_, 0, i_21_, 0);
					}
				}
				for (int i_23_ = 0; i_13_ > i_23_; i_23_++) {
					int i_24_ = (i_23_ * 256 + 128) / i_13_;
					int i_25_ = -i_24_ + 256;
					byte i_26_ = (byte) (i_9_ * i_24_ + i_25_ * i_4_ >> 8);
					short i_27_ = (short) (((i_24_ * (0x7f & i_3_) + i_25_ * (0x7f & i_1_) & 0x7f00)
							+ (((i_24_ * (i_3_ & 0xfc00) + (0xfc00 & i_1_) * i_25_) & 0xfc0000)
									+ (((0x380 & i_1_) * i_25_ + i_24_ * (0x380 & i_3_)) & 0x38000))) >> 8);
					for (int i_28_ = 0; (i_12_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
						if ((i_23_ ^ 0xffffffff) != -1) {
							class103.method654((is_15_[i_23_][(i_28_ + 1) % i_12_]), (short) -1, (byte) -1,
									is_15_[-1 + i_23_][i_28_], -126, (is_15_[-1 + i_23_][(i_28_ + 1) % i_12_]), i_27_,
									(byte) 1, i_26_);
							class103.method654(is_15_[i_23_][i_28_], (short) -1, (byte) -1, is_15_[-1 + i_23_][i_28_],
									-120, (is_15_[i_23_][(i_28_ + 1) % i_12_]), i_27_, (byte) 1, i_26_);
						} else
							class103.method654(is_15_[0][i_28_], (short) -1, (byte) -1, i_14_, -124,
									is_15_[0][(1 + i_28_) % i_12_], i_27_, (byte) 1, i_26_);
					}
				}
				class_t_11_ = class260.method1695(class103, i_10_, Class109.anInt1569, 64, 768);
				synchronized (Clan.aClass54_7109) {
					Clan.aClass54_7109.method371(1, l, class_t_11_);
				}
			}
			int i_29_ = (i_6_ << 6) - 1;
			int i_30_ = -i_29_;
			int i_31_ = -i_29_;
			int i_32_ = i_29_;
			int i_33_ = i_29_;
			if (bool) {
				if ((i_7_ ^ 0xffffffff) < -1025 && (i_7_ ^ 0xffffffff) > -7169)
					i_30_ -= 128;
				if (i_7_ > 13312 || (i_7_ ^ 0xffffffff) > -3073)
					i_31_ -= 128;
				if (i_7_ > 9216 && i_7_ < 15360)
					i_32_ += 128;
				if ((i_7_ ^ 0xffffffff) < -5121 && (i_7_ ^ 0xffffffff) > -11265)
					i_33_ += 128;
			}
			int i_34_ = class_t.HA();
			int i_35_ = class_t.NA();
			int i_36_ = class_t.PA();
			if ((i_31_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff))
				i_36_ = i_31_;
			if ((i_35_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff))
				i_35_ = i_32_;
			if ((i_30_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff))
				i_34_ = i_30_;
			int i_37_ = class_t.m();
			if (i_37_ > i_33_)
				i_37_ = i_33_;
			SequenceLoader class246_sub1_sub17 = null;
			if (class124 != null) {
				i_8_ = ((SequenceType) class124).frameIDs[i_8_];
				class246_sub1_sub17 = Class59_Sub3_Sub3.aClass45_6275.method298(i_8_ >> 16, 1, class124.id,
						class124.revision);
				i_8_ &= 0xffff;
			}
			if (class246_sub1_sub17 == null) {
				class_t_11_ = class_t_11_.method678((byte) 3, i_10_, true);
				class_t_11_.H(-i_34_ + i_35_ >> 1, 128, i_37_ + -i_36_ >> 1);
				class_t_11_.JA(i_35_ + i_34_ >> 1, 0, i_37_ + i_36_ >> 1);
			} else {
				class_t_11_ = class_t_11_.method678((byte) 3, i_10_, true);
				class_t_11_.H(i_35_ - i_34_ >> 1, 128, -i_36_ + i_37_ >> 1);
				class_t_11_.JA(i_34_ - -i_35_ >> 1, 0, i_37_ + i_36_ >> 1);
				class_t_11_.method683(-5561, i_8_, class246_sub1_sub17, class124.id, class124);
			}
			if ((i_0_ ^ 0xffffffff) != -1)
				class_t_11_.Z(i_0_);
			if (i != 0)
				class_t_11_.R(i);
			if (i_2_ != 0)
				class_t_11_.JA(0, i_2_, 0);
			return class_t_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("ae.B(" + i + ',' + i_0_ + ',' + (class_t != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_
							+ ',' + i_3_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ','
							+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + (class124 != null ? "{...}" : "null")
							+ ',' + i_9_ + ')'));
		}
	}

	static final int method2416(byte i, CollisionMap class199, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_,
			int i_43_, int[] is, int i_44_, boolean bool, int[] is_45_, int i_46_, int i_47_, int i_48_) {
		try {
			anInt5676++;
			for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -129; i_49_++) {
				for (int i_50_ = 0; i_50_ < 128; i_50_++) {
					IterableNodeHashTable.anIntArrayArray1119[i_49_][i_50_] = 0;
					Class7.anIntArrayArray94[i_49_][i_50_] = 99999999;
				}
			}
			boolean bool_51_;
			if (i_42_ != 1) {
				if (i_42_ != 2)
					bool_51_ = ContextMenus.method2706(-1, i_39_, i_47_, i_43_, i_38_, class199, i_41_, i_46_, i_40_,
							i_42_, i_44_, i_48_);
				else
					bool_51_ = Class246_Sub4.method1810((byte) -117, i_48_, class199, i_43_, i_40_, i_47_, i_38_, i_41_,
							i_46_, i_39_, i_44_);
			} else
				bool_51_ = Class_l_Sub2.method2302(i_40_, i_43_, i_48_, -1, i_39_, class199, i_41_, i_44_, i_47_, i_46_,
						i_38_);
			int i_52_ = -64 + i_38_;
			int i_53_ = i_46_ - 64;
			int i_54_ = Class246_Sub28_Sub32.anInt6925;
			int i_55_ = Class55.anInt785;
			if (!bool_51_) {
				if (!bool)
					return -1;
				int i_56_ = 2147483647;
				int i_57_ = 2147483647;
				int i_58_ = 10;
				for (int i_59_ = i_39_ + -i_58_; i_39_ - -i_58_ >= i_59_; i_59_++) {
					for (int i_60_ = i_41_ - i_58_; (i_60_ ^ 0xffffffff) >= (i_58_ + i_41_ ^ 0xffffffff); i_60_++) {
						int i_61_ = i_59_ + -i_52_;
						int i_62_ = -i_53_ + i_60_;
						if ((i_61_ ^ 0xffffffff) <= -1 && (i_62_ ^ 0xffffffff) <= -1 && (i_61_ ^ 0xffffffff) > -129
								&& (i_62_ ^ 0xffffffff) > -129 && Class7.anIntArrayArray94[i_61_][i_62_] < 100) {
							int i_63_ = 0;
							if (i_59_ < i_39_)
								i_63_ = i_39_ - i_59_;
							else if ((i_59_ ^ 0xffffffff) < (-1 + i_40_ + i_39_ ^ 0xffffffff))
								i_63_ = i_59_ + 1 + -i_39_ + -i_40_;
							int i_64_ = 0;
							if ((i_41_ ^ 0xffffffff) >= (i_60_ ^ 0xffffffff)) {
								if (i_60_ > i_41_ + (i_47_ - 1))
									i_64_ = 1 - (i_41_ - -i_47_ - i_60_);
							} else
								i_64_ = -i_60_ + i_41_;
							int i_65_ = i_63_ * i_63_ - -(i_64_ * i_64_);
							if ((i_56_ ^ 0xffffffff) < (i_65_ ^ 0xffffffff)
									|| ((i_65_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff)
											&& i_57_ > (Class7.anIntArrayArray94[i_61_][i_62_]))) {
								i_57_ = Class7.anIntArrayArray94[i_61_][i_62_];
								i_54_ = i_59_;
								i_56_ = i_65_;
								i_55_ = i_60_;
							}
						}
					}
				}
				if ((i_56_ ^ 0xffffffff) == -2147483648)
					return -1;
			}
			if (i_38_ == i_54_ && i_55_ == i_46_)
				return 0;
			int i_66_ = 0;
			Class246_Sub28_Sub9.anIntArray6148[i_66_] = i_54_;
			Class246_Sub39.anIntArray5489[i_66_++] = i_55_;
			if (i > -44)
				method2418(-79, 34);
			int i_68_;
			int i_67_ = i_68_ = (IterableNodeHashTable.anIntArrayArray1119[i_54_ - i_52_][-i_53_ + i_55_]);
			while (i_38_ != i_54_ || (i_46_ ^ 0xffffffff) != (i_55_ ^ 0xffffffff)) {
				if (i_67_ != i_68_) {
					i_68_ = i_67_;
					Class246_Sub28_Sub9.anIntArray6148[i_66_] = i_54_;
					Class246_Sub39.anIntArray5489[i_66_++] = i_55_;
				}
				if ((i_67_ & 0x1 ^ 0xffffffff) != -1)
					i_55_++;
				else if ((i_67_ & 0x4) != 0)
					i_55_--;
				if ((0x2 & i_67_ ^ 0xffffffff) == -1) {
					if ((i_67_ & 0x8) != 0)
						i_54_--;
				} else
					i_54_++;
				i_67_ = (IterableNodeHashTable.anIntArrayArray1119[i_54_ + -i_52_][-i_53_ + i_55_]);
			}
			int i_69_ = 0;
			while (i_66_-- > 0) {
				is_45_[i_69_] = Class246_Sub28_Sub9.anIntArray6148[i_66_];
				is[i_69_++] = Class246_Sub39.anIntArray5489[i_66_];
				if (i_69_ >= is_45_.length)
					break;
			}
			return i_69_;
		} catch (RuntimeException runtimeexception) {
			return 0;
		}
	}

	public static void method2417(byte i) {
		try {
			int i_70_ = 25 / ((i + 49) / 57);
			Client.instance = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ae.D(" + i + ')');
		}
	}

	static final void method2418(int i, int i_71_) {
		try {
			anInt5678++;
			Class_q_Sub1.anInt6666 = i;
			if (i_71_ != 268)
				Client.instance = null;
			Class_ls.aClass54_963.method369(false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ae.C(" + i + ',' + i_71_ + ')');
		}
	}

	public CS2Script() {
		/* empty */
	}

	static {
		new MultilingualString("You have left the channel.", "Du hast den Chatraum verlassen.",
				"Vous avez quitt\u00e9 le canal.", "Voc\u00ea saiu do canal.");
		anInt5674 = -1;
	}

	static int under_1200(int var0, CS2Script var1, boolean var2) {
		int var4 = -1; // L: 614
		Widget var3;
		if (var0 >= 2000) { // L: 615
			var0 -= 1000; // L: 616
			var4 = int_stack[--int_stack_size]; // L: 617
			var3 = Widget.get_widget(var4, 193); // L: 618
		} else {
			var3 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 620
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 621
			int_stack_size -= 2; // L: 622
			var3.horizontal_scroll_position = int_stack[int_stack_size]; // L: 623
			if (var3.horizontal_scroll_position > var3.scroll_width - var3.screen_width) { // L: 624
				var3.horizontal_scroll_position = var3.scroll_width - var3.screen_width;
			}

			if (var3.horizontal_scroll_position < 0) { // L: 625
				var3.horizontal_scroll_position = 0;
			}

			var3.vertical_scroll_position = int_stack[int_stack_size + 1]; // L: 626
			if (var3.vertical_scroll_position > var3.scroll_height - var3.screen_height) { // L: 627
				var3.vertical_scroll_position = var3.scroll_height - var3.screen_height;
			}

			if (var3.vertical_scroll_position < 0) { // L: 628
				var3.vertical_scroll_position = 0;
			}

			Widget.redraw_widget(var3); // L: 629
			return 1; // L: 630
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 632
			var3.color = int_stack[--int_stack_size]; // L: 633
			Widget.redraw_widget(var3); // L: 634
			return 1; // L: 635
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 637
			var3.filled = int_stack[--int_stack_size] == 1; // L: 638
			Widget.redraw_widget(var3); // L: 639
			return 1; // L: 640
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 642
			var3.top_transparency = int_stack[--int_stack_size]; // L: 643
			Widget.redraw_widget(var3); // L: 644
			return 1; // L: 645
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 647
			var3.line_width = int_stack[--int_stack_size]; // L: 648
			Widget.redraw_widget(var3); // L: 649
			return 1; // L: 650
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 652
			var3.disabled_sprite = int_stack[--int_stack_size]; // L: 653
			Widget.redraw_widget(var3); // L: 654
			return 1; // L: 655
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 657
			var3.sprite_angle = int_stack[--int_stack_size]; // L: 658
			Widget.redraw_widget(var3); // L: 659
			return 1; // L: 660
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 662
			var3.sprite_tiling = int_stack[--int_stack_size] == 1; // L: 663
			Widget.redraw_widget(var3); // L: 664
			return 1; // L: 665
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 667
			var3.model_type = 1; // L: 668
			var3.model_id = int_stack[--int_stack_size]; // L: 669
			Widget.redraw_widget(var3); // L: 670
			return 1; // L: 671
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 673
			int_stack_size -= 6; // L: 674
			var3.translate_x = int_stack[int_stack_size]; // L: 675
			var3.translate_y = int_stack[int_stack_size + 1]; // L: 676
			var3.model_rotation_x = int_stack[int_stack_size + 2]; // L: 677
			var3.model_rotation_y = int_stack[int_stack_size + 3]; // L: 678
			var3.model_rotation_z = int_stack[int_stack_size + 4]; // L: 679
			var3.model_zoom = int_stack[int_stack_size + 5]; // L: 680
			Widget.redraw_widget(var3); // L: 681
			return 1; // L: 682
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 684
				var8 = int_stack[--int_stack_size]; // L: 685
				if (var8 != var3.sequence_id) { // L: 686
					var3.sequence_id = var8; // L: 687
					var3.model_frame = 0; // L: 688
					var3.model_frame_cycle = 0; // L: 689
					Widget.redraw_widget(var3); // L: 690
				}

				return 1; // L: 692
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 694
				var3.model_orthogonal = int_stack[--int_stack_size] == 1; // L: 695
				Widget.redraw_widget(var3); // L: 696
				return 1; // L: 697
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 699
				String var7 = CS2Script.string_stack[--CS2Script.string_stack_size];
				if (!var7.equals(var3.text)) { // L: 701
					var3.text = var7; // L: 702
					Widget.redraw_widget(var3); // L: 703
				}
				return 1; // L: 705
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 707
				var3.font_id = int_stack[--int_stack_size]; // L: 708
				Widget.redraw_widget(var3); // L: 709
				return 1; // L: 710
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 712
				int_stack_size -= 3; // L: 713
				var3.horizontal_text_alignment = int_stack[int_stack_size]; // L: 714
				var3.vertical_text_alignment = int_stack[int_stack_size + 1]; // L: 715
				var3.line_height = int_stack[int_stack_size + 2]; // L: 716
				Widget.redraw_widget(var3); // L: 717
				return 1; // L: 718
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 720
				var3.text_shadow = int_stack[--int_stack_size] == 1; // L: 721
				Widget.redraw_widget(var3); // L: 722
				return 1; // L: 723
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 725
				var3.border_width = int_stack[--int_stack_size]; // L: 726
				Widget.redraw_widget(var3); // L: 727
				return 1; // L: 728
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 730
				var3.border_color = int_stack[--int_stack_size]; // L: 731
				Widget.redraw_widget(var3); // L: 732
				return 1; // L: 733
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 735
				var3.flipped_vertically = int_stack[--int_stack_size] == 1; // L: 736
				Widget.redraw_widget(var3); // L: 737
				return 1; // L: 738
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 740
				var3.flipped_horizontally = int_stack[--int_stack_size] == 1; // L: 741
				Widget.redraw_widget(var3); // L: 742
				return 1; // L: 743
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 745
				int_stack_size -= 2; // L: 746
				var3.scroll_width = int_stack[int_stack_size]; // L: 747
				var3.scroll_height = int_stack[int_stack_size + 1]; // L: 748
				Widget.redraw_widget(var3); // L: 749
				if (var4 != -1 && var3.type == 0) { // L: 750
					Widget.update_layer(Widget.get_widget_cache(193)[var4 >> 16], var3, false);
				}

				return 1; // L: 751
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 753
				// Widget.resume_pause(var3.hash, var3.index); // L: 754
				Client.meslayerContinueWidget = var3; // L: 755
				Widget.redraw_widget(var3); // L: 756
				return 1; // L: 757
			} else if (var0 == 1122) { // L: 759
				var3.enabled_sprite = int_stack[--int_stack_size]; // L: 760
				Widget.redraw_widget(var3); // L: 761
				return 1; // L: 762
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 764
				var3.enabled_color = int_stack[--int_stack_size]; // L: 765
				Widget.redraw_widget(var3); // L: 766
				return 1; // L: 767
			} else if (var0 == 1124) { // L: 769
				var3.bottom_transparency = int_stack[--int_stack_size]; // L: 770
				Widget.redraw_widget(var3); // L: 771
				return 1; // L: 772
			} else if (var0 == 1125) { // L: 774
				var8 = int_stack[--int_stack_size]; // L: 775
				FillMode var6 = (FillMode) Widget.findEnumerated(Widget.FillMode_values(), var8); // L: 776
				if (var6 != null) { // L: 777
					var3.fill_mode = var6; // L: 778
					Widget.redraw_widget(var3); // L: 779
				}

				return 1; // L: 781
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 783
					var5 = int_stack[--int_stack_size] == 1; // L: 784
					var3.line_direction = var5; // L: 785
					return 1; // L: 786
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 788
					var5 = int_stack[--int_stack_size] == 1; // L: 789
					var3.model_transparency = var5; // L: 790
					return 1; // L: 791
				} else if (var0 == 1128) { // L: 793
					int_stack_size -= 2; // L: 794
					return 1; // L: 795
				} else {
					return 2; // L: 797
				}
			}
		}
	}

	static int decode(int opcode, CS2Script script, boolean flag, int revision) {
		if (opcode < 1000) { // L: 429
			return CS2Script.under_1000(opcode, script, flag);
		} else if (opcode < 1100) { // L: 430
			return CS2Script.under_1100(opcode, script, flag);
		} else if (opcode < 1200) { // L: 431
			return CS2Script.under_1200(opcode, script, flag);
		} else if (opcode < 1300) { // L: 432
			return CS2Script.under_1300(opcode, script, flag);
		} else if (opcode < 1400) { // L: 433
			return CS2Script.under_1400(opcode, script, flag);
		} else if (opcode < 1500) { // L: 434
			return CS2Script.under_1500(opcode, script, flag);
		} else if (opcode < 1600) { // L: 435
			return CS2Script.under_1600(opcode, script, flag);
		} else if (opcode < 1700) { // L: 436
			return CS2Script.under_1700(opcode, script, flag);
		} else if (opcode < 1800) { // L: 437
			return CS2Script.under_1800(opcode, script, flag);
		} else if (opcode < 1900) { // L: 438
			return CS2Script.under_1900(opcode, script, flag);
		} else if (opcode < 2000) { // L: 439
			return CS2Script.under_2000(opcode, script, flag);
		} else if (opcode < 2100) { // L: 440
			return CS2Script.under_1100(opcode, script, flag);
		} else if (opcode < 2200) { // L: 441
			return CS2Script.under_1200(opcode, script, flag);
		} else if (opcode < 2300) { // L: 442
			return CS2Script.under_1300(opcode, script, flag);
		} else if (opcode < 2400) { // L: 443
			return CS2Script.under_1400(opcode, script, flag);
		} else if (opcode < 2500) { // L: 444
			return CS2Script.under_1500(opcode, script, flag);
		} else if (opcode < 2600) { // L: 445
			return CS2Script.under_2600(opcode, script, flag);
		} else if (opcode < 2700) { // L: 446
			return CS2Script.under_2700(opcode, script, flag);
		} else if (opcode < 2800) { // L: 447
			return CS2Script.under_2800(opcode, script, flag);
		} else if (opcode < 2900) { // L: 448
			return CS2Script.under_2900(opcode, script, flag);
		} else if (opcode < 3000) { // L: 449
			return CS2Script.under_2000(opcode, script, flag);
		} else if (opcode < 3200) { // L: 450
			return CS2Script.under_3200(opcode, script, flag, revision);
		} else if (opcode < 3300) { // L: 451
			return CS2Script.under_3300(opcode, script, flag);
		} else if (opcode < 3400) { // L: 452
			return CS2Script.under_3400(opcode, script, flag);
		} else if (opcode < 3500) { // L: 453
			return CS2Script.under_3500(opcode, script, flag);
		} else if (opcode < 3600) { // L: 454
			return CS2Script.under_3600(opcode, script, flag);
		} else if (opcode < 3700) { // L: 455
			return CS2Script.under_3700(opcode, script, flag);
		} else if (opcode < 3800) { // L: 456
			return CS2Script.under_3800(opcode, script, flag);
		} else if (opcode < 3900) { // L: 457
			return CS2Script.under_3900(opcode, script, flag);
		} else if (opcode < 4000) { // L: 458
			return CS2Script.under_4000(opcode, script, flag);
		} else if (opcode < 4100) {
			return CS2Script.under_4100(opcode, script, flag); // L: 459
		} else if (opcode < 4200) { // L: 460
			return CS2Script.under_4200(opcode, script, flag);
		} else if (opcode < 4300) { // L: 461
			return CS2Script.under_4300(opcode, script, flag);
		} else if (opcode < 5100) { // L: 462
			return CS2Script.under_5100(opcode, script, flag);
		} else if (opcode < 5400) { // L: 463
			return CS2Script.under_5400(opcode, script, flag);
		} else if (opcode < 5600) { // L: 464
			return CS2Script.under_5600(opcode, script, flag);
		} else if (opcode < 5700) { // L: 465
			return CS2Script.under_5700(opcode, script, flag);
		} else if (opcode < 6300) { // L: 466
			return CS2Script.under_6300(opcode, script, flag);
		} else if (opcode < 6600) { // L: 467
			return CS2Script.under_6600(opcode, script, flag);
		} else if (opcode < 6700) { // L: 468
			return CS2Script.under_6700(opcode, script, flag);
		} else if (opcode < 6800) { // L: 469
			return CS2Script.under_6800(opcode, script, flag);
		} else if (opcode < 6900) { // L: 470
			return CS2Script.under_6900(opcode, script, flag);
		} else if (opcode < 7000) { // L: 471
			return CS2Script.under_7000(opcode, script, flag);
		} else if (opcode < 7100) { // L: 472
			return CS2Script.under_7100(opcode, script, flag);
		} else if (opcode < 7200) { // L: 473
			return CS2Script.under_7200(opcode, script, flag);
		} else if (opcode < 7300) { // L: 474
			return CS2Script.under_7300(opcode, script, flag);
		} else {
			return opcode < 7500 ? CS2Script.under_7500(opcode, script, flag) : 2;
		}
	}

	static int under_7500(int var0, CS2Script var1, boolean var2) {
		if (var0 == 7400) { // L: 4460
			--int_stack_size; // L: 4461
			--string_stack_size; // L: 4462
			return 1; // L: 4463
		} else if (var0 == 7401) { // L: 4465
			--int_stack_size; // L: 4466
			--string_stack_size; // L: 4467
			return 1; // L: 4468
		} else if (var0 == 7402) { // L: 4470
			int_stack_size -= 2; // L: 4471
			--string_stack_size; // L: 4472
			return 1; // L: 4473
		} else if (var0 == 7403) { // L: 4475
			int_stack_size -= 2; // L: 4476
			--string_stack_size; // L: 4477
			return 1; // L: 4478
		} else if (var0 == 7404) { // L: 4480
			--int_stack_size; // L: 4481
			--string_stack_size; // L: 4482
			return 1; // L: 4483
		} else if (var0 == 7405) { // L: 4485
			int_stack_size -= 2; // L: 4486
			return 1; // L: 4487
		} else if (var0 == 7406) { // L: 4489
			--int_stack_size; // L: 4490
			string_stack[++string_stack_size - 1] = ""; // L: 4491
			return 1; // L: 4492
		} else if (var0 == 7407) { // L: 4494
			int_stack[++int_stack_size - 1] = 0; // L: 4495
			return 1; // L: 4496
		} else if (var0 == 7408) { // L: 4498
			int_stack_size -= 2; // L: 4499
			--string_stack_size; // L: 4500
			int_stack[++int_stack_size - 1] = 0; // L: 4501
			return 1; // L: 4502
		} else if (var0 == 7409) { // L: 4504
			--int_stack_size; // L: 4505
			return 1; // L: 4506
		} else {
			return 2; // L: 4508
		}
	}

	static int under_7300(int var0, CS2Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4429
			int_stack_size -= 5; // L: 4430
			int_stack[++int_stack_size - 1] = -1; // L: 4431
			return 1; // L: 4432
		} else if (var0 == 7204) { // L: 4434
			int_stack_size -= 6; // L: 4435
			int_stack[++int_stack_size - 1] = -1; // L: 4436
			return 1; // L: 4437
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4439
			int_stack[int_stack_size - 1] = -1; // L: 4440
			return 1; // L: 4441
		} else if (var0 == 7209) { // L: 4443
			int_stack_size -= 2; // L: 4444
			int_stack[++int_stack_size - 1] = -1; // L: 4445
			return 1; // L: 4446
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4448
			--int_stack_size; // L: 4449
			return 1; // L: 4450
		} else if (var0 == 7214) { // L: 4452
			int_stack_size -= 2; // L: 4453
			return 1; // L: 4454
		} else {
			return 2; // L: 4456
		}
	}

	static int under_7200(int var0, CS2Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4382
			++int_stack_size; // L: 4383
			return 1; // L: 4384
		} else if (var0 == 7101) { // L: 4386
			string_stack_size += 2; // L: 4387
			return 1; // L: 4388
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4390
			if (var0 == 7106) { // L: 4394
				++int_stack_size; // L: 4395
				return 1; // L: 4396
			} else if (var0 == 7107) { // L: 4398
				++int_stack_size; // L: 4399
				return 1; // L: 4400
			} else if (var0 == 7108) { // L: 4402
				int_stack[++int_stack_size - 1] = ContextMenus.context_menu_open ? 1 : 0; // L: 4403
				return 1; // L: 4404
			} else if (var0 == 7110) { // L: 4406
				int_stack[++int_stack_size - 1] = 0; // L: 4407
				return 1; // L: 4408
			} else if (var0 == 7120) { // L: 4410
				--int_stack_size; // L: 4411
				int_stack[++int_stack_size - 1] = 0; // L: 4412
				return 1; // L: 4413
			} else if (var0 == 7121) { // L: 4415
				int_stack_size -= 2; // L: 4416
				int_stack[++int_stack_size - 1] = -1; // L: 4417
				return 1; // L: 4418
			} else if (var0 == 7122) { // L: 4420
				int_stack_size -= 2; // L: 4421
				int_stack[++int_stack_size - 1] = 0; // L: 4422
				return 1; // L: 4423
			} else {
				return 2; // L: 4425
			}
		} else {
			++int_stack_size; // L: 4391
			return 1; // L: 4392
		}
	}

	static int under_7100(int var0, CS2Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030
				&& var0 != 7035) { // L: 4337
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L:
																												// 4341
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4345
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L:
																														// 4349
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4353
							if (var0 != 7031 && var0 != 7032) { // L: 4357
								if (var0 == 7033) { // L: 4362
									--string_stack_size; // L: 4363
									return 1; // L: 4364
								} else if (var0 != 7036 && var0 != 7037) { // L: 4366
									if (var0 == 7038) { // L: 4370
										--int_stack_size; // L: 4371
										return 1; // L: 4372
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019
											&& var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L:
																												// 4374
										return 2; // L: 4378
									} else {
										--int_stack_size; // L: 4375
										return 1; // L: 4376
									}
								} else {
									int_stack_size -= 2; // L: 4367
									return 1; // L: 4368
								}
							} else {
								--string_stack_size; // L: 4358
								--int_stack_size; // L: 4359
								return 1; // L: 4360
							}
						} else {
							--int_stack_size; // L: 4354
							return 1; // L: 4355
						}
					} else {
						int_stack_size -= 2; // L: 4350
						return 1; // L: 4351
					}
				} else {
					int_stack_size -= 2; // L: 4346
					return 1; // L: 4347
				}
			} else {
				int_stack_size -= 3; // L: 4342
				return 1; // L: 4343
			}
		} else {
			int_stack_size -= 5; // L: 4338
			return 1; // L: 4339
		}
	}

	static int under_7000(int var0, CS2Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4325
			string_stack[++string_stack_size - 1] = ""; // L: 4326
			return 1; // L: 4327
		} else if (var0 == 6950) { // L: 4329
			int_stack[++int_stack_size - 1] = -1; // L: 4330
			return 1; // L: 4331
		} else {
			return 2; // L: 4333
		}
	}

	static int under_6900(int var0, CS2Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4301
			string_stack[++string_stack_size - 1] = ""; // L: 4302
			return 1; // L: 4303
		} else if (var0 != 6801 && var0 != 6802) { // L: 4305
			if (var0 == 6850) { // L: 4309
				string_stack[++string_stack_size - 1] = ""; // L: 4310
				return 1; // L: 4311
			} else if (var0 != 6851 && var0 != 6852) { // L: 4313
				if (var0 == 6853) { // L: 4317
					int_stack[++int_stack_size - 1] = 0; // L: 4318
					return 1; // L: 4319
				} else {
					return 2; // L: 4321
				}
			} else {
				int_stack[++int_stack_size - 1] = -1; // L: 4314
				return 1; // L: 4315
			}
		} else {
			int_stack[++int_stack_size - 1] = -1; // L: 4306
			return 1; // L: 4307
		}
	}

	static int under_6800(int var0, CS2Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4274
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4279
				if (var0 == 6750) { // L: 4283
					string_stack[++string_stack_size - 1] = ""; // L: 4284
					return 1; // L: 4285
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4287
					if (var0 == 6754) { // L: 4291
						int var3 = int_stack[--int_stack_size]; // L: 4292
						NpcType var4 = Class179.aClass228_2518.list(var3);
						string_stack[++string_stack_size - 1] = var4 != null ? var4.name : ""; // L: 4294
						return 1; // L: 4295
					} else {
						return 2; // L: 4297
					}
				} else {
					int_stack[++int_stack_size - 1] = -1; // L: 4288
					return 1; // L: 4289
				}
			} else {
				--int_stack_size; // L: 4280
				return 1; // L: 4281
			}
		} else {
			int_stack_size -= 2; // L: 4275
			--string_stack_size; // L: 4276
			return 1; // L: 4277
		}
	}

	static int under_3600(int var0, CS2Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2111
			var3 = int_stack[--int_stack_size]; // L: 2112
			int_stack[++int_stack_size - 1] = /* DevicePcmPlayerProvider.method398(var3) */false ? 1 : 0; // L: 2113
			return 1; // L: 2114
		} else if (var0 == 3501) { // L: 2116
			var3 = int_stack[--int_stack_size]; // L: 2117
			int_stack[++int_stack_size - 1] = /* StructComposition.method3424(var3) */false ? 1 : 0; // L: 2118
			return 1; // L: 2119
		} else if (var0 == 3502) { // L: 2121
			var3 = int_stack[--int_stack_size]; // L: 2122
			int_stack[++int_stack_size - 1] = /* class117.method2676(var3) */false ? 1 : 0; // L: 2123
			return 1; // L: 2124
		} else {
			return 2; // L: 2126
		}
	}

	static int under_6700(int opcode, CS2Script script, boolean flag) {
		int var4;
		if (opcode == 6600) {
			/*
			 * var4 = class151.field1949; //TODO int var10 = (class223.field2562.field990 >>
			 * 7) + class243.field3156; int var6 = (class223.field2562.field938 >> 7) +
			 * class41.field300; class78.method1792(-1640183017).method6325(var4, var10,
			 * var6, true, (byte) -70);
			 */
			return 1;
		} else {
			// class35 var12;
			if (opcode == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var4 = int_stack[--int_stack_size];
				String var17 = "bush did 9/12";
				/*
				 * var12 = class78.method1792(-1067145628).method6343(var4, (short) 10284);
				 * //TODO if (var12 != null) { var17 = var12.method395(-681281722); }
				 */

				string_stack[++string_stack_size - 1] = var17;
				return 1;
			} else if (opcode == ScriptOpcodes.WORLDMAP_SETMAP) {
				var4 = int_stack[--int_stack_size];
				// class78.method1792(158198227).method6422(var4, 1569720823); //TODO
				return 1;
			} else if (opcode == ScriptOpcodes.WORLDMAP_GETZOOM) {
				int_stack[++int_stack_size - 1] = /*
													 * class78.method1792(179788496) .method6477((byte) 106);
													 */0; // TODO
				return 1;
			} else if (opcode == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var4 = int_stack[--int_stack_size];
				// class78.method1792(220033286).method6337(var4, -1658246176); //TODO
				return 1;
			} else if (opcode == ScriptOpcodes.WORLDMAP_ISLOADED) {
				int_stack[++int_stack_size - 1] = /*
													 * class78.method1792(116822998) .method6371((byte) -117) ? 1 : 0;
													 */0; // TODO
				return 1;
			} else {
				// class222 var16;
				if (opcode == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					int some_int = int_stack[--int_stack_size];
					/*
					 * var16 = new class222(some_int); //TODO
					 * class78.method1792(-1888758254).method6410(var16.field2546, var16.field2547,
					 * (short) 1536);
					 */
					return 1;
				} else if (opcode == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					int some_int = int_stack[--int_stack_size];
					/*
					 * var16 = new class222(some_int); //TODO
					 * class78.method1792(-1006789158).method6345(var16.field2546, var16.field2547,
					 * (byte) -4);
					 */
					return 1;
				} else if (opcode == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					int some_int = int_stack[--int_stack_size];
					/*
					 * var16 = new class222(some_int); //TODO
					 * class78.method1792(597595248).method6346(var16.field2549, var16.field2546,
					 * var16.field2547, 1818651976);
					 */
					return 1;
				} else if (opcode == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					int some_int = int_stack[--int_stack_size]; // TODO
					/*
					 * var16 = new class222(some_int);
					 * class78.method1792(-1161695133).method6347(var16.field2549, var16.field2546,
					 * var16.field2547, 473887994);
					 */
					return 1;
				} else if (opcode == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					int_stack[++int_stack_size - 1] = /*
														 * class78.method1792(-1069470990) .method6348(1523132182);
														 */0; // TODO
					int_stack[++int_stack_size - 1] = /*
														 * class78.method1792(-1325180782) .method6349('\uff80');
														 */0; // TODO
					return 1;
				} else {
					// class35 var14;
					if (opcode == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var4 = int_stack[--int_stack_size];
						int_stack[++int_stack_size - 1] = 0; // TODO
						/*
						 * var14 = class78.method1792(-1751576362).method6343(var4, (short) 12211); if
						 * (var14 == null) { int_stack[++int_stack_size - 1] = 0; } else {
						 * int_stack[++int_stack_size - 1] = var14.method455(-745168638)
						 * .method3994((byte) -17); }
						 */

						return 1;
					} else if (opcode == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var4 = int_stack[--int_stack_size];
						int_stack[++int_stack_size - 1] = 0; // TODO
						int_stack[++int_stack_size - 1] = 0;
						/*
						 * var14 = class78.method1792(730646878).method6343(var4, (short) 12432); if
						 * (var14 == null) { int_stack[++int_stack_size - 1] = 0;
						 * int_stack[++int_stack_size - 1] = 0; } else { int_stack[++int_stack_size - 1]
						 * = (var14.method425(1672346255) - var14.method398((byte) -26) + 1) * 64;
						 * int_stack[++int_stack_size - 1] = (var14.method446(-1226108190) -
						 * var14.method400(91174907) + 1) * 64; }
						 */

						return 1;
					} else if (opcode == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var4 = int_stack[--int_stack_size];
						int_stack[++int_stack_size - 1] = 0;
						int_stack[++int_stack_size - 1] = 0;
						int_stack[++int_stack_size - 1] = 0;
						int_stack[++int_stack_size - 1] = 0; // TODO
						/*
						 * var14 = class78.method1792(920395591).method6343(var4, (short) 21308); if
						 * (var14 == null) { int_stack[++int_stack_size - 1] = 0;
						 * int_stack[++int_stack_size - 1] = 0; int_stack[++int_stack_size - 1] = 0;
						 * int_stack[++int_stack_size - 1] = 0; } else { int_stack[++int_stack_size - 1]
						 * = var14.method398((byte) -79) * 64; int_stack[++int_stack_size - 1] =
						 * var14.method400(53224751) * 64; int_stack[++int_stack_size - 1] =
						 * var14.method425(2010649590) * 64 + 64 - 1; int_stack[++int_stack_size - 1] =
						 * var14.method446(-1519708634) * 64 + 64 - 1; }
						 */

						return 1;
					} else if (opcode == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var4 = int_stack[--int_stack_size];
						int_stack[++int_stack_size - 1] = -1;// TODO
						/*
						 * var14 = class78.method1792(-6617855).method6343(var4, (short) 3723); if
						 * (var14 == null) { int_stack[++int_stack_size - 1] = -1; } else {
						 * int_stack[++int_stack_size - 1] = var14.method457((byte) -52); }
						 */

						return 1;
					} else if (opcode == 6615) {
						int_stack[++int_stack_size - 1] = -1;
						int_stack[++int_stack_size - 1] = -1; // TODO
						/*
						 * var16 = class78.method1792(744065396).method6350(-862509197); if (var16 ==
						 * null) { int_stack[++int_stack_size - 1] = -1; int_stack[++int_stack_size - 1]
						 * = -1; } else { int_stack[++int_stack_size - 1] = var16.field2546;
						 * int_stack[++int_stack_size - 1] = var16.field2547; }
						 */

						return 1;
					} else if (opcode == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						int_stack[++int_stack_size - 1] = /*
															 * class78.method1792(634931668) .method6417((byte) -4);
															 */0; // TODO
						return 1;
					} else if (opcode == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						int some_int = int_stack[--int_stack_size]; // TODO
						int_stack[++int_stack_size - 1] = -1;
						int_stack[++int_stack_size - 1] = -1;
						return 1;
						/*
						 * var16 = new class222(some_int); var14 =
						 * class78.method1792(-281509462).method6328(-1618834185); if (var14 == null) {
						 * int_stack[++int_stack_size - 1] = -1; int_stack[++int_stack_size - 1] = -1;
						 * return 1; } else { int[] var15 = var14.method389(var16.field2549,
						 * var16.field2546, var16.field2547, 2095717578); if (var15 == null) {
						 * int_stack[++int_stack_size - 1] = -1; int_stack[++int_stack_size - 1] = -1; }
						 * else { int_stack[++int_stack_size - 1] = var15[0]; int_stack[++int_stack_size
						 * - 1] = var15[1]; }
						 * 
						 * return 1; }
						 */
					} else {
						// class222 var8;
						if (opcode == 6618) {
							int some_val = int_stack[--int_stack_size];
							int_stack[++int_stack_size - 1] = -1;
							int_stack[++int_stack_size - 1] = -1; // TODO
							return 1;
							/*
							 * var16 = new class222(some_val); var14 =
							 * class78.method1792(498059785).method6328(-1857447300); if (var14 == null) {
							 * int_stack[++int_stack_size - 1] = -1; int_stack[++int_stack_size - 1] = -1;
							 * return 1; } else { var8 = var14.method384(var16.field2546, var16.field2547,
							 * (byte) -25); if (var8 == null) { int_stack[++int_stack_size - 1] = -1; } else
							 * { int_stack[++int_stack_size - 1] = var8.method3994((byte) 10); }
							 * 
							 * return 1; }
							 */
						} else {
							// class222 var13;
							if (opcode == 6619) {
								int_stack_size -= 2;
								var4 = int_stack[int_stack_size];
								int some_val = int_stack[int_stack_size + 1];
								/*
								 * var13 = new class222(some_val); //TODO class204.method3690(var4, var13,
								 * false, (byte) 78);
								 */
								return 1;
							} else if (opcode == 6620) {
								int_stack_size -= 2;
								var4 = int_stack[int_stack_size];
								int some_val = int_stack[int_stack_size + 1];
								/*
								 * var13 = new class222(some_val); class204.method3690(var4, var13, true, (byte)
								 * -59);
								 */ // TODO
								return 1;
							} else if (opcode == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								int_stack_size -= 2;
								var4 = int_stack[int_stack_size];
								int some_val = int_stack[int_stack_size + 1];
								int_stack[++int_stack_size - 1] = 0; // TODO
								return 1;
								/*
								 * var13 = new class222(some_val); var12 =
								 * class78.method1792(-107876563).method6343(var4, (short) 6595); if (var12 ==
								 * null) { int_stack[++int_stack_size - 1] = 0; return 1; } else {
								 * int_stack[++int_stack_size - 1] = var12.method387( var13.field2549,
								 * var13.field2546, var13.field2547, -262671603) ? 1 : 0; return 1; }
								 */
							} else if (opcode == ScriptOpcodes.WORLDMAP_GETSIZE) {
								int_stack[++int_stack_size
										- 1] = /*
												 * class78.method1792(473851823) .method6351(-1900160402);
												 */ 0; // TODO
								int_stack[++int_stack_size
										- 1] = /*
												 * class78.method1792(773478478) .method6352((byte) 0);
												 */0; // TODO
								return 1;
							} else if (opcode == 6623) {
								int some_var = int_stack[--int_stack_size];
								int_stack[++int_stack_size - 1] = -1; // TODO
								/*
								 * var16 = new class222(some_var); var14 =
								 * class78.method1792(-339675971).method6500(var16.field2549, var16.field2546,
								 * var16.field2547, -1568032870); if (var14 == null) {
								 * int_stack[++int_stack_size - 1] = -1; } else { int_stack[++int_stack_size -
								 * 1] = var14.method392(-1513965339); }
								 */

								return 1;
							} else if (opcode == 6624) {
								int some_val = int_stack[--int_stack_size];
								/*
								 * class78.method1792(-1572903968) .method6353(some_val, (byte) 32);
								 */ // TODO
								return 1;
							} else if (opcode == 6625) {
								// class78.method1792(-273494350).method6354(1668488207); //TODO
								return 1;
							} else if (opcode == 6626) {
								int some_val = int_stack[--int_stack_size];
								/*
								 * class78.method1792(705139838) .method6391(some_val, -626312657);
								 */ // TODO
								return 1;
							} else if (opcode == 6627) {
								// class78.method1792(-1653791752).method6356((byte) 78); //TODO
								return 1;
							} else {
								boolean var11;
								if (opcode == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var11 = int_stack[--int_stack_size] == 1;
									// class78.method1792(757868882).method6357(var11, (byte) 98); //TODO
									return 1;
								} else if (opcode == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var4 = int_stack[--int_stack_size];
									// class78.method1792(124788430).method6334(var4, -2041133251); //TODO
									return 1;
								} else if (opcode == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var4 = int_stack[--int_stack_size];
									// class78.method1792(-1530814954).method6359(var4, 982221358); //TODO
									return 1;
								} else if (opcode == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									// class78.method1792(-1392713019).method6360(1855116248); //TODO
									return 1;
								} else if (opcode == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var11 = int_stack[--int_stack_size] == 1;
									// class78.method1792(907092512).method6362(var11, 795371287); //TODO
									return 1;
								} else {
									boolean var5;
									if (opcode == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										int_stack_size -= 2;
										var4 = int_stack[int_stack_size];
										var5 = int_stack[int_stack_size + 1] == 1;
										// class78.method1792(-641981053).method6398(var4, var5, (byte) -111); //TODO
										return 1;
									} else if (opcode == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										int_stack_size -= 2;
										var4 = int_stack[int_stack_size];
										var5 = int_stack[int_stack_size + 1] == 1;
										// class78.method1792(-696430685).method6363(var4, var5, (byte) -46); //TODO
										return 1;
									} else if (opcode == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										int_stack[++int_stack_size
												- 1] = /*
														 * class78 .method1792(761716466).method6386(580836467) ? 1 : 0;
														 */0; // TODO
										return 1;
									} else if (opcode == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var4 = int_stack[--int_stack_size];
										int_stack[++int_stack_size
												- 1] = /*
														 * class78 .method1792(-1361084913).method6355(var4, 686736746)
														 * ? 1 : 0;
														 */0; // TODO
										return 1;
									} else if (opcode == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var4 = int_stack[--int_stack_size];
										int_stack[++int_stack_size
												- 1] = /*
														 * class78 .method1792(-1844372450).method6373(var4,
														 * -1135479232) ? 1 : 0;
														 */0; // TODO
										return 1;
									} else if (opcode == 6638) {
										int_stack_size -= 2;
										var4 = int_stack[int_stack_size];
										int some_val = int_stack[int_stack_size + 1];
										int_stack[++int_stack_size - 1] = -1; // TODO
										/*
										 * var13 = new class222(some_val); var8 =
										 * class78.method1792(-45564747).method6369(var4, var13, 1185313718); if (var8
										 * == null) { int_stack[++int_stack_size - 1] = -1; } else {
										 * int_stack[++int_stack_size - 1] = var8 .method3994((byte) 97); }
										 */

										return 1;
									} else {
										// class43 var9;
										if (opcode == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											int_stack[++int_stack_size - 1] = -1;
											int_stack[++int_stack_size - 1] = -1; // TODO
											/*
											 * var9 = class78.method1792(308461505).method6453(1413157620); if (var9 ==
											 * null) { int_stack[++int_stack_size - 1] = -1; int_stack[++int_stack_size
											 * - 1] = -1; } else { int_stack[++int_stack_size - 1] = var9
											 * .vmethod630(763215392); int_stack[++int_stack_size - 1] = var9.field321
											 * .method3994((byte) 31); }
											 */

											return 1;
										} else if (opcode == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											int_stack[++int_stack_size - 1] = -1;
											int_stack[++int_stack_size - 1] = -1; // TODO
											/*
											 * var9 = class78.method1792(275904079).method6372((byte) 71); if (var9 ==
											 * null) { int_stack[++int_stack_size - 1] = -1; int_stack[++int_stack_size
											 * - 1] = -1; } else { int_stack[++int_stack_size - 1] = var9
											 * .vmethod630(131062370); int_stack[++int_stack_size - 1] = var9.field321
											 * .method3994((byte) 38); }
											 */

											return 1;
										} else {
											// class252 var7;
											if (opcode == ScriptOpcodes.MEC_TEXT) {
												var4 = int_stack[--int_stack_size];
												string_stack[++string_stack_size - 1] = "lmao"; // TODO
												/*
												 * var7 = class163.method3458(var4, -1872973208); if (var7.field3247 ==
												 * null) { string_stack[++string_stack_size - 1] = ""; } else {
												 * string_stack[++string_stack_size - 1] = var7.field3247; }
												 */

												return 1;
											} else if (opcode == ScriptOpcodes.MEC_TEXTSIZE) {
												var4 = int_stack[--int_stack_size];
												// var7 = class163.method3458(var4, -1829565311);
												int_stack[++int_stack_size - 1] = /* var7.field3249; */0; // TODO
												return 1;
											} else if (opcode == ScriptOpcodes.MEC_CATEGORY) {
												var4 = int_stack[--int_stack_size];
												int_stack[++int_stack_size - 1] = -1; // TODO
												/*
												 * var7 = class163.method3458(var4, -2078361783); if (var7 == null) {
												 * int_stack[++int_stack_size - 1] = -1; } else {
												 * int_stack[++int_stack_size - 1] = var7.field3252; }
												 */

												return 1;
											} else if (opcode == ScriptOpcodes.MEC_SPRITE) {
												var4 = int_stack[--int_stack_size];
												int_stack[++int_stack_size - 1] = -1; // TODO
												/*
												 * var7 = class163.method3458(var4, -1910803663); if (var7 == null) {
												 * int_stack[++int_stack_size - 1] = -1; } else {
												 * int_stack[++int_stack_size - 1] = var7.field3245; }
												 */

												return 1;
											} else if (opcode == ScriptOpcodes.WORLDMAP_ELEMENT) {
												int_stack[++int_stack_size - 1] = /* field1302.field374; */0; // TODO
												return 1;
											} else if (opcode == 6698) {
												int_stack[++int_stack_size
														- 1] = /* field1302.field373.method3994((byte) -4); */0; // TODO
												return 1;
											} else if (opcode == 6699) {
												int_stack[++int_stack_size
														- 1] = /* field1302.field375.method3994((byte) -42); */0; // TODO
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static int under_6600(int var0, CS2Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3707
			int_stack[++int_stack_size - 1] = Class246_Sub13.load_worlds(3) != -1 ? 1 : 0;
			return 1; // L: 3709
		} else {
			Object var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3711
				/*
				 * var9 = class282.start_world_list(); // L: 3712
				 * if (var9 == null) {
				 * int_stack[++int_stack_size - 1] = -1; // L: 3722
				 * int_stack[++int_stack_size - 1] = 0; // L: 3723
				 * string_stack[++string_stack_size - 1] = ""; // L: 3724
				 * int_stack[++int_stack_size - 1] = 0; // L: 3725
				 * int_stack[++int_stack_size - 1] = 0; // L: 3726
				 * string_stack[++string_stack_size - 1] = ""; // L: 3727
				 * } else { // L: 3713
				 * int_stack[++int_stack_size - 1] = var9.id; // L: 3714
				 * int_stack[++int_stack_size - 1] = var9.properties; // L: 3715
				 * string_stack[++string_stack_size - 1] = var9.activity; // L: 3716
				 * int_stack[++int_stack_size - 1] = var9.location; // L: 3717
				 * int_stack[++int_stack_size - 1] = var9.population; // L: 3718
				 * string_stack[++string_stack_size - 1] = var9.host; // L: 3719
				 * }
				 */
				int_stack[++int_stack_size - 1] = -1; // L: 3722
				int_stack[++int_stack_size - 1] = 0; // L: 3723
				string_stack[++string_stack_size - 1] = ""; // L: 3724
				int_stack[++int_stack_size - 1] = 0; // L: 3725
				int_stack[++int_stack_size - 1] = 0; // L: 3726
				string_stack[++string_stack_size - 1] = ""; // L: 3727

				return 1; // L: 3729
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3731
				/*
				 * var9 = Canvas.getNextWorldListWorld(); // L: 3732
				 * if (var9 == null) {
				 * int_stack[++int_stack_size - 1] = -1; // L: 3742
				 * int_stack[++int_stack_size - 1] = 0; // L: 3743
				 * string_stack[++string_stack_size - 1] = ""; // L: 3744
				 * int_stack[++int_stack_size - 1] = 0; // L: 3745
				 * int_stack[++int_stack_size - 1] = 0; // L: 3746
				 * string_stack[++string_stack_size - 1] = ""; // L: 3747
				 * } else { // L: 3733
				 * int_stack[++int_stack_size - 1] = var9.id; // L: 3734
				 * int_stack[++int_stack_size - 1] = var9.properties; // L: 3735
				 * string_stack[++string_stack_size - 1] = var9.activity; // L: 3736
				 * int_stack[++int_stack_size - 1] = var9.location; // L: 3737
				 * int_stack[++int_stack_size - 1] = var9.population; // L: 3738
				 * string_stack[++string_stack_size - 1] = var9.host; // L: 3739
				 * }
				 */
				int_stack[++int_stack_size - 1] = -1; // L: 3742
				int_stack[++int_stack_size - 1] = 0; // L: 3743
				string_stack[++string_stack_size - 1] = ""; // L: 3744
				int_stack[++int_stack_size - 1] = 0; // L: 3745
				int_stack[++int_stack_size - 1] = 0; // L: 3746
				string_stack[++string_stack_size - 1] = ""; // L: 3747

				return 1; // L: 3749
			} else {
				int var3;
				Object var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3751
					var3 = int_stack[--int_stack_size]; // L: 3752
					var7 = null; // L: 3753

					/*
					 * for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3754
					 * if (var3 == class334.World_worlds[var8].id) { // L: 3755
					 * var7 = class334.World_worlds[var8]; // L: 3756
					 * break;
					 * }
					 * }
					 */

					/*
					 * if (var7 == null) {
					 * int_stack[++int_stack_size - 1] = -1; // L: 3769
					 * int_stack[++int_stack_size - 1] = 0; // L: 3770
					 * string_stack[++string_stack_size - 1] = ""; // L: 3771
					 * int_stack[++int_stack_size - 1] = 0; // L: 3772
					 * int_stack[++int_stack_size - 1] = 0; // L: 3773
					 * string_stack[++string_stack_size - 1] = ""; // L: 3774
					 * } else { // L: 3760
					 * int_stack[++int_stack_size - 1] = var7.id; // L: 3761
					 * int_stack[++int_stack_size - 1] = var7.properties; // L: 3762
					 * string_stack[++string_stack_size - 1] = var7.activity; // L: 3763
					 * int_stack[++int_stack_size - 1] = var7.location; // L: 3764
					 * int_stack[++int_stack_size - 1] = var7.population; // L: 3765
					 * string_stack[++string_stack_size - 1] = var7.host; // L: 3766
					 * }
					 */
					int_stack[++int_stack_size - 1] = -1; // L: 3769
					int_stack[++int_stack_size - 1] = 0; // L: 3770
					string_stack[++string_stack_size - 1] = ""; // L: 3771
					int_stack[++int_stack_size - 1] = 0; // L: 3772
					int_stack[++int_stack_size - 1] = 0; // L: 3773
					string_stack[++string_stack_size - 1] = ""; // L: 3774

					return 1; // L: 3776
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3778
					int_stack_size -= 4; // L: 3779
					var3 = int_stack[int_stack_size]; // L: 3780
					boolean var10 = int_stack[int_stack_size + 1] == 1; // L: 3781
					var8 = int_stack[int_stack_size + 2]; // L: 3782
					boolean var6 = int_stack[int_stack_size + 3] == 1; // L: 3783
					// class118.sortWorldList(var3, var10, var8, var6); // L: 3784
					return 1; // L: 3785
				} else if (var0 == 6511) {
					var3 = int_stack[--int_stack_size]; // L: 3788
					/*
					 * if (var3 >= 0 && var3 < World.World_count) { // L: 3789
					 * var7 = class334.World_worlds[var3]; // L: 3790
					 * int_stack[++int_stack_size - 1] = var7.id; // L: 3791
					 * int_stack[++int_stack_size - 1] = var7.properties; // L: 3792
					 * string_stack[++string_stack_size - 1] = var7.activity; // L: 3793
					 * int_stack[++int_stack_size - 1] = var7.location; // L: 3794
					 * int_stack[++int_stack_size - 1] = var7.population; // L: 3795
					 * string_stack[++string_stack_size - 1] = var7.host; // L: 3796
					 * } else {
					 * int_stack[++int_stack_size - 1] = -1; // L: 3799
					 * int_stack[++int_stack_size - 1] = 0; // L: 3800
					 * string_stack[++string_stack_size - 1] = ""; // L: 3801
					 * int_stack[++int_stack_size - 1] = 0; // L: 3802
					 * int_stack[++int_stack_size - 1] = 0; // L: 3803
					 * string_stack[++string_stack_size - 1] = ""; // L: 3804
					 * }
					 */
					int_stack[++int_stack_size - 1] = -1; // L: 3799
					int_stack[++int_stack_size - 1] = 0; // L: 3800
					string_stack[++string_stack_size - 1] = ""; // L: 3801
					int_stack[++int_stack_size - 1] = 0; // L: 3802
					int_stack[++int_stack_size - 1] = 0; // L: 3803
					string_stack[++string_stack_size - 1] = ""; // L: 3804

					return 1; // L: 3806
				} else { // L: 3787
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3808
						Client.followerOpsLowPriority = int_stack[--int_stack_size] == 1; // L: 3809
						return 1; // L: 3810
					} else {
						int var4;
						ParamType var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3812
							int_stack_size -= 2; // L: 3813
							var3 = int_stack[int_stack_size]; // L: 3814
							var4 = int_stack[int_stack_size + 1]; // L: 3815
							var5 = ParamType.list(var4, 193); // L: 3816
							if (var5.is_string(115)) { // L: 3817
								string_stack[++string_stack_size - 1] = /*
																		 * WorldMapLabelSize.getNpcDefinition(var3).
																		 * getStringParam(var4, var5.defaultStr)
																		 */""; // L: 3818
							} else {
								int_stack[++int_stack_size - 1] = /*
																	 * WorldMapLabelSize.getNpcDefinition(var3).
																	 * getIntParam(var4, var5.defaultInt)
																	 */0; // L: 3821
							}

							return 1; // L: 3823
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3825
							int_stack_size -= 2; // L: 3826
							var3 = int_stack[int_stack_size]; // L: 3827
							var4 = int_stack[int_stack_size + 1]; // L: 3828
							var5 = ParamType.list(var4, 193); // L: 3829
							if (var5.is_string(115)) { // L: 3817
								string_stack[++string_stack_size - 1] = /*
																		 * class148.getObjectDefinition(var3).
																		 * getStringParam(var4, var5.defaultStr)
																		 */""; // L: 3831
							} else {
								int_stack[++int_stack_size - 1] = /*
																	 * class148.getObjectDefinition(var3).getIntParam(
																	 * var4, var5.defaultInt)
																	 */0; // L: 3834
							}

							return 1; // L: 3836
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3838
							int_stack_size -= 2; // L: 3839
							var3 = int_stack[int_stack_size]; // L: 3840
							var4 = int_stack[int_stack_size + 1]; // L: 3841
							var5 = ParamType.list(var4, 193); // L: 3829
							if (var5.is_string(115)) { // L: 3817
								string_stack[++string_stack_size - 1] = /*
																		 * UserComparator6.ItemDefinition_get(var3).
																		 * getStringParam(var4, var5.defaultStr)
																		 */""; // L: 3844
							} else {
								int_stack[++int_stack_size - 1] = /*
																	 * UserComparator6.ItemDefinition_get(var3).
																	 * getIntParam(var4, var5.defaultInt)
																	 */0; // L: 3847
							}

							return 1; // L: 3849
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3851
							int_stack_size -= 2;
							var8 = int_stack[int_stack_size];
							var4 = int_stack[int_stack_size + 1];
							ParamType param_type = ParamType.list(var4, 193);
							if (param_type.is_string(115)) {
								string_stack[++string_stack_size - 1] = StructLoader.list(var8, -24)
										.getStringParam(var8, param_type.defaultStr);
							} else {
								int_stack[++int_stack_size - 1] = StructLoader.list(var8, -24).getIntParam(var4,
										param_type.default_int);
							}
							return 1; // L: 3862
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3864
							int_stack[++int_stack_size - 1] = Client.mobile ? 1 : 0; // L: 3865
							return 1; // L: 3866
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3868
							int_stack[++int_stack_size - 1] = Client.client_type & 3; // L: 3869
							return 1; // L: 3870
						} else if (var0 == 6520) { // L: 3872
							return 1; // L: 3873
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3875
							return 1; // L: 3876
						} else if (var0 == 6522) { // L: 3878
							--string_stack_size; // L: 3879
							--int_stack_size; // L: 3880
							return 1; // L: 3881
						} else if (var0 == 6523) { // L: 3883
							--string_stack_size; // L: 3884
							--int_stack_size; // L: 3885
							return 1; // L: 3886
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 3888
							int_stack[++int_stack_size - 1] = -1; // L: 3889
							return 1; // L: 3890
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 3892
							int_stack[++int_stack_size - 1] = 1; // L: 3893
							return 1; // L: 3894
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 3896
							int_stack[++int_stack_size - 1] = 1; // L: 3897
							return 1; // L: 3898
						} else if (var0 == 6527) { // L: 3900
							int_stack[++int_stack_size - 1] = /* Client.field499 */0; // L: 3901
							return 1; // L: 3902
						} else {
							return 2; // L: 3904
						}
					}
				}
			}
		}
	}

	static int method1795(int var0) {
		return (int) Math.pow(2.0D, (double) ((float) var0 / 256.0F + 7.0F));
	}

	static int under_6300(int var0, CS2Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3635
			int_stack_size -= 2; // L: 3636
			Client.field690 = (short) method1795(int_stack[int_stack_size]); // L: 3637
			if (Client.field690 <= 0) { // L: 3638
				Client.field690 = 256;
			}

			Client.field707 = (short) method1795(int_stack[int_stack_size + 1]); // L: 3639
			if (Client.field707 <= 0) { // L: 3640
				Client.field707 = 256;
			}

			return 1; // L: 3641
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3643
			int_stack_size -= 2; // L: 3644
			Client.zoom_height = (short) int_stack[int_stack_size]; // L: 3645
			if (Client.zoom_height <= 0) { // L: 3646
				Client.zoom_height = 256;
			}

			Client.zoom_width = (short) int_stack[int_stack_size + 1]; // L: 3647
			if (Client.zoom_width <= 0) { // L: 3648
				Client.zoom_width = 320;
			}

			return 1; // L: 3649
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3651
			int_stack_size -= 4; // L: 3652
			Client.field900 = (short) int_stack[int_stack_size]; // L: 3653
			if (Client.field900 <= 0) { // L: 3654
				Client.field900 = 1;
			}

			Client.field731 = (short) int_stack[int_stack_size + 1]; // L: 3655
			if (Client.field731 <= 0) { // L: 3656
				Client.field731 = 32767;
			} else if (Client.field731 < Client.field900) { // L: 3657
				Client.field731 = Client.field900;
			}

			Client.field828 = (short) int_stack[int_stack_size + 2]; // L: 3658
			if (Client.field828 <= 0) { // L: 3659
				Client.field828 = 1;
			}

			Client.field903 = (short) int_stack[int_stack_size + 3]; // L: 3660
			if (Client.field903 <= 0) { // L: 3661
				Client.field903 = 32767;
			} else if (Client.field903 < Client.field828) { // L: 3662
				Client.field903 = Client.field828;
			}

			return 1; // L: 3663
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3665
			if (((Widget) Class104.f_vb) == null) {
				int_stack[++int_stack_size - 1] = -1; // L: 3672
				int_stack[++int_stack_size - 1] = -1; // L: 3673
			} else { // L: 3666
				Class_o.method2944(0, ((Widget) Class104.f_vb).screen_width, (byte) -21, 0, false,
						((Widget) Class104.f_vb).screen_height);
				int_stack[++int_stack_size - 1] = Class179.anInt2512; // L: 3668
				int_stack[++int_stack_size - 1] = Class59_Sub1_Sub2.anInt6133; // L: 3669
			}

			return 1; // L: 3675
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3677
			int_stack[++int_stack_size - 1] = Client.zoom_height; // L: 3678
			int_stack[++int_stack_size - 1] = Client.zoom_width; // L: 3679
			return 1; // L: 3680
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3682
			CS2Script.int_stack[CS2Script.int_stack_size++] = Class159.aShort2260;
			CS2Script.int_stack[CS2Script.int_stack_size++] = MultilingualString.aShort888;
			return 1; // L: 3685
		} else if (var0 == 6220) { // L: 3687
			int_stack[++int_stack_size - 1] = 0; // L: 3688
			return 1; // L: 3689
		} else if (var0 == 6221) { // L: 3691
			int_stack[++int_stack_size - 1] = 0; // L: 3692
			return 1; // L: 3693
		} else if (var0 == 6222) { // L: 3695
			int_stack[++int_stack_size - 1] = /* class186.canvasWidth */0; // L: 3696
			return 1; // L: 3697
		} else if (var0 == 6223) { // L: 3699
			int_stack[++int_stack_size - 1] = /* BoundaryObject.canvasHeight */0; // L: 3700
			return 1; // L: 3701
		} else {
			return 2; // L: 3703
		}
	}

	static int under_5700(int var0, CS2Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3611
			// Client.logoutTimer = 250; // L: 3612
			return 1; // L: 3613
		} else if (var0 == 5631 || var0 == 5633) {
			string_stack_size -= 2; // L: 3616
			return 1; // L: 3617
		} else { // L: 3615
			if (var0 == 5632) { // L: 3619
				int_stack[++int_stack_size - 1] = 26; // L: 3620
				return 1; // L: 3621
			} else {
				return 2; // L: 3623
			}
		}
	}

	static int under_5600(int opcode, CS2Script script, boolean flag) {
		int var4;
		if (opcode == ScriptOpcodes.CAM_FORCEANGLE) {
			int_stack_size -= 2; // L: 3580
			int var3 = int_stack[int_stack_size]; // L: 3581
			var4 = int_stack[int_stack_size + 1]; // L: 3582
			// if (!Client.camera_locked) { // L: 3583
			Camera.camera_pitch = var3; // L: 3584
			Camera.camera_yaw = var4; // L: 3585
			// }
			return 1;
		} else if (opcode == ScriptOpcodes.CAM_GETANGLE_XA) {
			int_stack[++int_stack_size - 1] = (int) Camera.camera_pitch >> 3;
			return 1;
		} else if (opcode == ScriptOpcodes.CAM_GETANGLE_YA) {
			int_stack[++int_stack_size - 1] = (int) Camera.camera_yaw >> 3;
			return 1;
		} else if (opcode == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var4 = int_stack[--int_stack_size];
			if (var4 < 0) {
				var4 = 0;
			}

			// Client.field867 = var4; //TODO
			return 1;
		} else if (opcode == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			int_stack[++int_stack_size - 1] = /* Client.field867; */0; // TODO
			return 1;
		} else {
			return 2;
		}
	}

	static int under_5400(int opcode, CS2Script script, boolean flag) {
		if (opcode == ScriptOpcodes.GETWINDOWMODE) {
			CS2Script.int_stack[++CS2Script.int_stack_size - 1] = Client.get_frame_mode((byte) -123);
			return 1;
		} else {
			int var4;
			if (opcode == ScriptOpcodes.SETWINDOWMODE) {
				var4 = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (var4 == 1 || var4 == 2) {
					Class100.setWindowedMode(var4, -1, -1, false, false);
				}

				return 1;
			} else if (opcode == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				CS2Script.int_stack[++CS2Script.int_stack_size - 1] = (((Renderer) Client.current_renderer).frame_mode);
				return 1;
			} else if (opcode != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (opcode == 5310) { // L: 3554
					--int_stack_size; // L: 3555
					return 1; // L: 3556
				} else if (opcode == 5311) { // L: 3558
					int_stack_size -= 2; // L: 3559
					return 1; // L: 3560
				} else if (opcode == 5312) { // L: 3562
					--int_stack_size; // L: 3563
					return 1; // L: 3564
				} else if (opcode == 5350) { // L: 3566
					string_stack_size -= 2; // L: 3567
					--int_stack_size; // L: 3568
					return 1; // L: 3569
				} else if (opcode == 5351) { // L: 3571
					--string_stack_size; // L: 3572
					return 1; // L: 3573
				} else {
					return 2; // L: 3575
				}
			} else {
				var4 = CS2Script.int_stack[--CS2Script.int_stack_size];
				if (var4 == 1 || var4 == 2) {
					((Renderer) Client.current_renderer).frame_mode = var4;
					Client.current_renderer.save_preferences(Client.sign_link);
				}

				return 1;
			}
		}
	}

	static int under_5100(int opcode, CS2Script script, boolean flag) {
		// System.out.println("calling opcode " + opcode);
		if (opcode == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			int_stack[++int_stack_size - 1] = Client.public_chat_mode;
			return 1;
		} else if (opcode == ScriptOpcodes.CHAT_SETFILTER) {
			CS2Script.int_stack_size -= 3;
			Client.public_chat_mode = CS2Script.int_stack[CS2Script.int_stack_size];
			Client.private_chat_mode = Class1.method36(0, CS2Script.int_stack[CS2Script.int_stack_size + 1]);
			if (Client.private_chat_mode == null)
				Client.private_chat_mode = Class43.aClass87_638;
			Client.trade_chat_mode = CS2Script.int_stack[CS2Script.int_stack_size + 2];
			ScriptExecutor.anInt2116++;
			Class243.writePacket(-101, Class187_Sub2.aClass201_5426);
			Class130_Sub1.stream.writeByte(255, Client.public_chat_mode);
			Class130_Sub1.stream.writeByte(255, ((Class87) Client.private_chat_mode).field4597);
			Class130_Sub1.stream.writeByte(255, Client.trade_chat_mode);
			return 1;
		} else {
			String var4;
			int var5;
			if (opcode == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				// CS2Script.string_stack_size -= 2;
				String string = CS2Script.string_stack[--CS2Script.string_stack_size];
				CS2Script.int_stack_size -= 2;
				String string_277_ = /* CS2Script.string_stack[CS2Script.string_stack_size + 1]; */"busho"; // TODO

				int i_278_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_279_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				if (string_277_ == null)
					string_277_ = "";
				if (string_277_.length() > 80)
					string_277_ = string_277_.substring(0, 80);
				ScriptExecutor.anInt2121++;
				Class243.writePacket(-114, Class211_Sub1_Sub2.aClass201_6528);
				Class130_Sub1.stream.writeByte(255,
						(Class145.method978(string, (byte) -92) + 2 + Class145.method978(string_277_, (byte) -128)));
				Class130_Sub1.stream.writeString(91, string);
				Class130_Sub1.stream.writeByte(255, i_278_ - 1);
				Class130_Sub1.stream.writeByte(255, i_279_);
				Class130_Sub1.stream.writeString(125, string_277_);
				return 1;
			} else {
				int var11;
				if (opcode == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					int_stack_size -= 2;
					var11 = int_stack[int_stack_size];
					var5 = int_stack[int_stack_size + 1];
					Message var15 = Message.getByChannelId(var11, var5);
					if (var15 == null) {
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = -1;
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = 0;
						string_stack[++CS2Script.string_stack_size - 1] = "";
						string_stack[++CS2Script.string_stack_size - 1] = "";
						string_stack[++CS2Script.string_stack_size - 1] = "";
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = 0;
					} else {
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = var15.count;
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = var15.cycle;
						string_stack[++CS2Script.string_stack_size - 1] = var15.sender != null ? var15.sender : "";
						string_stack[++CS2Script.string_stack_size - 1] = var15.prefix != null ? var15.prefix : "";
						string_stack[++CS2Script.string_stack_size - 1] = var15.text != null ? var15.text : "";
						CS2Script.int_stack[++CS2Script.int_stack_size
								- 1] = var15.isFromFriend() ? 1 : (var15.isFromIgnored() ? 2 : 0);
					}
					return 1;
				} else if (opcode == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
					int id = CS2Script.int_stack[--CS2Script.int_stack_size];
					Message var16 = Message.getMessage(id);
					if (var16 == null) {
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = -1;
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = 0;
						string_stack[++CS2Script.string_stack_size - 1] = "";
						string_stack[++CS2Script.string_stack_size - 1] = "";
						string_stack[++CS2Script.string_stack_size - 1] = "";
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = 0;
					} else {
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = var16.type;
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = var16.cycle;
						string_stack[++CS2Script.string_stack_size - 1] = var16.sender != null ? var16.sender : "";
						string_stack[++CS2Script.string_stack_size - 1] = var16.prefix != null ? var16.prefix : "";
						string_stack[++CS2Script.string_stack_size - 1] = var16.text != null ? var16.text : "";
						CS2Script.int_stack[++CS2Script.int_stack_size - 1] = 0;
					}
					return 1;
				} else if (opcode == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
					if (Client.private_chat_mode == null) {
						int_stack[++int_stack_size - 1] = -1;
					} else {
						int_stack[++int_stack_size - 1] = ((Class87) Client.private_chat_mode).field4597;
					}

					return 1;
				} else if (opcode == ScriptOpcodes.CHAT_SENDPUBLIC) {
					var4 = string_stack[--string_stack_size];
					var5 = int_stack[--int_stack_size];
					ScriptExecutor.method985(var4, opcode);
					/*
					 * String var15 = var4.toLowerCase(); byte var18 = 0; if
					 * (var15.startsWith("yellow:")) { var18 = 0; var4 =
					 * var4.substring("yellow:".length()); } else if (var15.startsWith("red:")) {
					 * var18 = 1; var4 = var4.substring("red:".length()); } else if
					 * (var15.startsWith("green:")) { var18 = 2; var4 =
					 * var4.substring("green:".length()); } else if (var15.startsWith("cyan:")) {
					 * var18 = 3; var4 = var4.substring("cyan:".length()); } else if
					 * (var15.startsWith("purple:")) { var18 = 4; var4 =
					 * var4.substring("purple:".length()); } else if (var15.startsWith("white:")) {
					 * var18 = 5; var4 = var4.substring("white:".length()); } else if
					 * (var15.startsWith("flash1:")) { var18 = 6; var4 =
					 * var4.substring("flash1:".length()); } else if (var15.startsWith("flash2:")) {
					 * var18 = 7; var4 = var4.substring("flash2:".length()); } else if
					 * (var15.startsWith("flash3:")) { var18 = 8; var4 =
					 * var4.substring("flash3:".length()); } else if (var15.startsWith("glow1:")) {
					 * var18 = 9; var4 = var4.substring("glow1:".length()); } else if
					 * (var15.startsWith("glow2:")) { var18 = 10; var4 =
					 * var4.substring("glow2:".length()); } else if (var15.startsWith("glow3:")) {
					 * var18 = 11; var4 = var4.substring("glow3:".length()); } else if
					 * (class49.field372 != class199.field2382) { if (var15.startsWith("yellow:")) {
					 * var18 = 0; var4 = var4.substring("yellow:".length()); } else if
					 * (var15.startsWith("red:")) { var18 = 1; var4 =
					 * var4.substring("red:".length()); } else if (var15.startsWith("green:")) {
					 * var18 = 2; var4 = var4.substring("green:".length()); } else if
					 * (var15.startsWith("cyan:")) { var18 = 3; var4 =
					 * var4.substring("cyan:".length()); } else if (var15.startsWith("purple:")) {
					 * var18 = 4; var4 = var4.substring("purple:".length()); } else if
					 * (var15.startsWith("white:")) { var18 = 5; var4 =
					 * var4.substring("white:".length()); } else if (var15.startsWith("flash1:")) {
					 * var18 = 6; var4 = var4.substring("flash1:".length()); } else if
					 * (var15.startsWith("flash2:")) { var18 = 7; var4 =
					 * var4.substring("flash2:".length()); } else if (var15.startsWith("flash3:")) {
					 * var18 = 8; var4 = var4.substring("flash3:".length()); } else if
					 * (var15.startsWith("glow1:")) { var18 = 9; var4 =
					 * var4.substring("glow1:".length()); } else if (var15.startsWith("glow2:")) {
					 * var18 = 10; var4 = var4.substring("glow2:".length()); } else if
					 * (var15.startsWith("glow3:")) { var18 = 11; var4 =
					 * var4.substring("glow3:".length()); } }
					 * 
					 * var15 = var4.toLowerCase(); byte var8 = 0; if (var15.startsWith("wave:")) {
					 * var8 = 1; var4 = var4.substring("wave:".length()); } else if
					 * (var15.startsWith("wave2:")) { var8 = 2; var4 =
					 * var4.substring("wave2:".length()); } else if (var15.startsWith("shake:")) {
					 * var8 = 3; var4 = var4.substring("shake:".length()); } else if
					 * (var15.startsWith("scroll:")) { var8 = 4; var4 =
					 * var4.substring("scroll:".length()); } else if (var15.startsWith("slide:")) {
					 * var8 = 5; var4 = var4.substring("slide:".length()); } else if
					 * (class199.field2382 != class49.field372) { if (var15.startsWith("wave:")) {
					 * var8 = 1; var4 = var4.substring("wave:".length()); } else if
					 * (var15.startsWith("wave2:")) { var8 = 2; var4 =
					 * var4.substring("wave2:".length()); } else if (var15.startsWith("shake:")) {
					 * var8 = 3; var4 = var4.substring("shake:".length()); } else if
					 * (var15.startsWith("scroll:")) { var8 = 4; var4 =
					 * var4.substring("scroll:".length()); } else if (var15.startsWith("slide:")) {
					 * var8 = 5; var4 = var4.substring("slide:".length()); } }
					 * 
					 * class196 var9 = class68.method1249(class192.field2304,
					 * Client.field694.field1328, (byte) 1); var9.field2360.method5482(0, (byte)
					 * -57); int var10 = var9.field2360.position; var9.field2360.method5482(var5,
					 * (byte) -119); var9.field2360.method5482(var18, (byte) -5);
					 * var9.field2360.method5482(var8, (byte) -80);
					 * class152.method3355(var9.field2360, var4, -1031927437);
					 * var9.field2360.method5697(var9.field2360.position - var10, -2075050787);
					 * Client.field694.method2295(var9, 1775721640);
					 */
					return 1;
				} else if (opcode == ScriptOpcodes.CHAT_SENDPRIVATE) {
					CS2Script.string_stack_size -= 2;
					String string = CS2Script.string_stack[CS2Script.string_stack_size];
					String string_283_ = CS2Script.string_stack[CS2Script.string_stack_size + 1];
					if (Client.staff_level != 0
							|| ((!Class59.aBool820 || Class_u.aBool4703) && !Class168.aBool2395)) {
						ScriptExecutor.anInt2124++;
						Class243.writePacket(-70, Class170.aClass201_2420);
						Class130_Sub1.stream.writeByte(255, 0);
						int i_284_ = ((Buffer) Class130_Sub1.stream).position;
						Class130_Sub1.stream.writeString(85, string);
						Class59_Sub3_Sub4.method2867(string_283_, 0, (Class130_Sub1.stream));
						Class130_Sub1.stream.method2408(-1591647264,
								(((Buffer) Class130_Sub1.stream).position - i_284_));
					}
					return 1;
				} else if (opcode == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3416
					String var8 = string_stack[--string_stack_size]; // L: 3417
					int_stack_size -= 2; // L: 3418
					int var7 = int_stack[int_stack_size]; // L: 3419
					int var9 = int_stack[int_stack_size + 1]; // L: 3420
					/*
					 * var6 = BufferedSource.method6527(var7, var8, ScriptFrame.clientLanguage,
					 * var9); // L: 3421
					 * Client.packetWriter.addNode(var6); // L: 3422
					 */
					return 1; // L: 3423
				} else if (opcode != ScriptOpcodes.CHAT_PLAYERNAME) {
					int var3;
					int var7;
					if (opcode == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
						int_stack[++int_stack_size - 1] = Client.trade_chat_mode;
						return 1;
					} else if (opcode == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
						var11 = int_stack[--int_stack_size];
						// System.out.println("history length is: " + Message.getHistorySize(var11));
						int_stack[++int_stack_size - 1] = Message.getHistorySize(var11);
						return 1;
					} else if (opcode == ScriptOpcodes.CHAT_GETNEXTUID) {
						var11 = int_stack[--int_stack_size];
						int_stack[++int_stack_size - 1] = Message.getNextChatId(var11);
						return 1;
					} else if (opcode == ScriptOpcodes.CHAT_GETPREVUID) {
						var11 = int_stack[--int_stack_size];
						int_stack[++int_stack_size - 1] = Message.getLastChatId(var11);
						return 1;
					} else if (opcode == ScriptOpcodes.DOCHEAT) {
						var4 = string_stack[--string_stack_size];
						String command = var4;
						Client.run_command(command.toString(), false);
						return 1;
					} else if (opcode == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
						Client.message_filter = string_stack[--string_stack_size].toLowerCase().trim();
						return 1;
					} else if (opcode == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
						string_stack[++string_stack_size - 1] = Client.message_filter;
						return 1;
					} else if (opcode == ScriptOpcodes.WRITECONSOLE) {
						var4 = string_stack[--string_stack_size];
						System.out.println(var4);
						return 1;
					} else if (opcode == 5024) { // L: 3469
						--int_stack_size; // L: 3470
						return 1; // L: 3471
					} else if (opcode == 5025) { // L: 3473
						++int_stack_size; // L: 3474
						return 1; // L: 3475
					} else if (opcode == 5030) { // L: 3477
						int_stack_size -= 2; // L: 3478
						var3 = int_stack[int_stack_size]; // L: 3479
						var7 = int_stack[int_stack_size + 1]; // L: 3480
						Message msg = Message.getByChannelId(var3, var7); // L: 3481
						if (msg == null) {
							int_stack[++int_stack_size - 1] = -1; // L: 3493
							int_stack[++int_stack_size - 1] = 0; // L: 3494
							string_stack[++string_stack_size - 1] = ""; // L: 3495
							string_stack[++string_stack_size - 1] = ""; // L: 3496
							string_stack[++string_stack_size - 1] = ""; // L: 3497
							int_stack[++int_stack_size - 1] = 0; // L: 3498
							string_stack[++string_stack_size - 1] = ""; // L: 3499
							int_stack[++int_stack_size - 1] = 0; // L: 3500
						} else {
							int_stack[++int_stack_size - 1] = msg.count; // L: 3483
							int_stack[++int_stack_size - 1] = msg.cycle; // L: 3484
							string_stack[++string_stack_size - 1] = "f"; // L: 3485
							string_stack[++string_stack_size - 1] = "f"; // L: 3486
							string_stack[++string_stack_size - 1] = "f"; // L: 3487
							int_stack[++int_stack_size - 1] = msg.isFromFriend() ? 1 : (msg.isFromIgnored() ? 2 : 0); // L:
																														// 3488
							string_stack[++string_stack_size - 1] = "f"; // L: 3489
							int_stack[++int_stack_size - 1] = 0; // L: 3490
						}
						return 1; // L: 3502
					} else if (opcode == 5031) { // L: 3504
						var3 = int_stack[--int_stack_size]; // L: 3505
						Message msg = Message.getMessage(var3); // L: 3506
						if (msg == null) {
							int_stack[++int_stack_size - 1] = -1; // L: 3518
							int_stack[++int_stack_size - 1] = 0; // L: 3519
							string_stack[++string_stack_size - 1] = ""; // L: 3520
							string_stack[++string_stack_size - 1] = ""; // L: 3521
							string_stack[++string_stack_size - 1] = ""; // L: 3522
							int_stack[++int_stack_size - 1] = 0; // L: 3523
							string_stack[++string_stack_size - 1] = ""; // L: 3524
							int_stack[++int_stack_size - 1] = 0; // L: 3525 //TODO
						} else {
							int_stack[++int_stack_size - 1] = msg.type; // L: 3508
							int_stack[++int_stack_size - 1] = msg.cycle; // L: 3509
							string_stack[++string_stack_size - 1] = msg.sender != null ? msg.sender : ""; // L: 3510
							string_stack[++string_stack_size - 1] = msg.prefix != null ? msg.prefix : ""; // L: 3511
							string_stack[++string_stack_size - 1] = msg.text != null ? msg.text : ""; // L: 3512
							int_stack[++int_stack_size - 1] = msg.isFromFriend() ? 1 : (msg.isFromIgnored() ? 2 : 0); // L:
																														// 3513
							string_stack[++string_stack_size - 1] = ""; // L: 3514
							int_stack[++int_stack_size - 1] = 0; // L: 3515
						}
						return 1; // L: 3527
					} else {
						return 2; // L: 3529
					}
				} else {
					if (Client.local_player != null
							&& (((Player) Client.local_player).username != null)) {
						var4 = Client.local_player.get_name(120, true);
					} else {
						var4 = "";
					}

					string_stack[++string_stack_size - 1] = var4;
					return 1;
				}
			}
		}
	}

	static int under_4300(int opcode, CS2Script script, boolean flag) {
		int var4;
		if (opcode == ScriptOpcodes.OC_NAME) {
			var4 = int_stack[--int_stack_size];
			string_stack[++string_stack_size - 1] = (((ObjType) MapRegion.aClass191_3663.list(22883, var4)).name);
			return 1;
		} else {
			int var5;
			if (opcode == ScriptOpcodes.OC_OP) {
				CS2Script.int_stack_size -= 2;
				int i_213_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_214_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				ObjType class197 = MapRegion.aClass191_3663.list(22883, i_213_);
				if (i_214_ >= 1 && i_214_ <= 5 && (((ObjType) class197).options[i_214_ - 1] != null))
					CS2Script.string_stack[CS2Script.string_stack_size++] = (((ObjType) class197).options[i_214_ - 1]);
				else {
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
					return 1;
				}
				return 1;
			} else if (opcode == ScriptOpcodes.OC_IOP) {
				CS2Script.int_stack_size -= 2;
				int i_215_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_216_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				ObjType class197 = MapRegion.aClass191_3663.list(22883, i_215_);
				if (i_216_ >= 1 && i_216_ <= 5 && (((ObjType) class197).ops[i_216_ - 1] != null))
					CS2Script.string_stack[CS2Script.string_stack_size++] = (((ObjType) class197).ops[i_216_ - 1]);
				else {
					CS2Script.string_stack[CS2Script.string_stack_size++] = "";
					return 1;
				}
				return 1;
			} else if (opcode == ScriptOpcodes.OC_COST) {
				var4 = int_stack[--int_stack_size];
				CS2Script.int_stack[CS2Script.int_stack_size++] = ((ObjType) MapRegion.aClass191_3663.list(22883,
						var4)).cost;
				return 1;
			} else if (opcode == ScriptOpcodes.OC_STACKABLE) {
				var4 = int_stack[--int_stack_size];
				int_stack[++int_stack_size
						- 1] = (((ObjType) MapRegion.aClass191_3663.list(22883, var4)).stackability == 1) ? 1 : 0;
				return 1;
			} else {
				if (opcode == ScriptOpcodes.OC_CERT) {
					int i_219_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					ObjType class197 = MapRegion.aClass191_3663.list(22883, i_219_);
					if (((ObjType) class197).certTemplate == -1 && ((ObjType) class197).note >= 0)
						CS2Script.int_stack[CS2Script.int_stack_size++] = ((ObjType) class197).note;
					else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_219_;
						return 1;
					}
					return 1;
				} else if (opcode == ScriptOpcodes.OC_UNCERT) {
					int i_220_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					ObjType class197 = MapRegion.aClass191_3663.list(22883, i_220_);
					if (((ObjType) class197).certTemplate >= 0 && ((ObjType) class197).note >= 0)
						CS2Script.int_stack[CS2Script.int_stack_size++] = ((ObjType) class197).note;
					else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = i_220_;
						return 1;
					}
					return 1;
				} else if (opcode == ScriptOpcodes.OC_MEMBERS) {
					var4 = int_stack[--int_stack_size];
					int_stack[++int_stack_size - 1] = (((ObjType) MapRegion.aClass191_3663.list(22883, var4)).members)
							? 1
							: 0;
					return 1;
				} else if (opcode == ScriptOpcodes.OC_PLACEHOLDER) {
					int var3 = int_stack[--int_stack_size]; // L: 3270
					ObjType var7 = ((ObjType) MapRegion.aClass191_3663.list(22883, var3)); // L: 3271
					if (var7.placeholderTemplate == -1 && var7.placeholderLink >= 0) { // L: 3272
						int_stack[++int_stack_size - 1] = var7.placeholderLink;
					} else {
						int_stack[++int_stack_size - 1] = var3; // L: 3273
					}
					return 1;
				} else if (opcode == ScriptOpcodes.OC_UNPLACEHOLDER) {
					int var3 = int_stack[--int_stack_size]; // L: 3277
					ObjType var7 = ((ObjType) MapRegion.aClass191_3663.list(22883, var3)); // L: 3278
					if (var7.placeholderTemplate >= 0 && var7.placeholderLink >= 0) { // L: 3279
						int_stack[++int_stack_size - 1] = var7.placeholderLink;
					} else {
						int_stack[++int_stack_size - 1] = var3; // L: 3280
					}
					return 1;
				} else if (opcode == ScriptOpcodes.OC_FIND) {
					String string = CS2Script.string_stack[--CS2Script.string_stack_size];
					int i_226_ = CS2Script.int_stack[--CS2Script.int_stack_size];
					Class133.method897((byte) 105, string, i_226_ == 1);
					CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub38.anInt5445;
					return 1;
				} else if (opcode != ScriptOpcodes.OC_FINDNEXT) {
					if (opcode == ScriptOpcodes.OC_FINDRESET) {
						Class22.anInt324 = 0;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (Class102.aShortArray1323 == null || Class22.anInt324 >= Class246_Sub38.anInt5445)
						CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
					else {
						CS2Script.int_stack[CS2Script.int_stack_size++] = (Class102.aShortArray1323[Class22.anInt324++]
								& 0xffff);
						return 1;
					}
					return 1;
				}
			}
		}
	}

	static String method3944(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 116
			if (var2 && var0 >= 0) { // L: 117
				int var3 = 2; // L: 118

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 119 120 122
					var4 /= var1; // L: 121
				}

				char[] var5 = new char[var3]; // L: 124
				var5[0] = '+'; // L: 125

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 126
					int var7 = var0; // L: 127
					var0 /= var1; // L: 128
					int var8 = var7 - var0 * var1; // L: 129
					if (var8 >= 10) { // L: 130
						var5[var6] = (char) (var8 + 87);
					} else {
						var5[var6] = (char) (var8 + 48); // L: 131
					}
				}

				return new String(var5); // L: 133
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? method3944(var0, 10, var1) : Integer.toString(var0); // L: 111 112
	}

	static int under_4200(int var0, CS2Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3056
			var3 = string_stack[--string_stack_size]; // L: 3057
			var9 = int_stack[--int_stack_size]; // L: 3058
			string_stack[++string_stack_size - 1] = var3 + var9; // L: 3059
			return 1; // L: 3060
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3062
				string_stack_size -= 2; // L: 3063
				var3 = string_stack[string_stack_size]; // L: 3064
				var4 = string_stack[string_stack_size + 1]; // L: 3065
				string_stack[++string_stack_size - 1] = var3 + var4; // L: 3066
				return 1; // L: 3067
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3069
				var3 = string_stack[--string_stack_size]; // L: 3070
				var9 = int_stack[--int_stack_size]; // L: 3071
				string_stack[++string_stack_size - 1] = var3 + intToString(var9, true); // L: 3072
				return 1; // L: 3073
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3075
				var3 = string_stack[--string_stack_size]; // L: 3076
				string_stack[++string_stack_size - 1] = var3.toLowerCase(); // L: 3077
				return 1; // L: 3078
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3080
					var10 = int_stack[--int_stack_size];
					long var13 = ((long) var10 + 11745L) * 86400000L;
					/*
					 * class85.field1091.setTime(new Date(var12)); var7 = class85.field1091.get(5);
					 * int var17 = class85.field1091.get(2); int var9 = class85.field1091.get(1);
					 */
					string_stack[++string_stack_size - 1] = /*
															 * var7 + "-" + class85.field1101[var17] + "-" + var9;
															 */"bush did 11"; // TODO
					return 1; // L: 3088
				} else if (var0 == ScriptOpcodes.TEXT_GENDER) {
					string_stack_size -= 2; // L: 3091
					var3 = string_stack[string_stack_size]; // L: 3092
					var4 = string_stack[string_stack_size + 1]; // L: 3093
					if (Client.local_player.appearance != null && Client.local_player.appearance.female) { // L: 3094
						string_stack[++string_stack_size - 1] = var4;
					} else {
						string_stack[++string_stack_size - 1] = var3; // L: 3095
					}

					return 1; // L: 3096
				} else { // L: 3090
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3098
						var10 = int_stack[--int_stack_size]; // L: 3099
						string_stack[++string_stack_size - 1] = Integer.toString(var10); // L: 3100
						return 1; // L: 3101
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3103
						string_stack_size -= 2;
						CS2Script.int_stack[CS2Script.int_stack_size++] = Class19.method191(103,
								CS2Script.string_stack[CS2Script.string_stack_size + 1],
								CS2Script.string_stack[CS2Script.string_stack_size], Preferences.language_code);
						return 1; // L: 3106
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3108
							String string = CS2Script.string_stack[--CS2Script.string_stack_size];
							CS2Script.int_stack_size -= 2;
							int i_189_ = CS2Script.int_stack[CS2Script.int_stack_size];
							int i_190_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
							FontMetric class73 = Class129.method878(6, 0, i_190_,
									Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
							CS2Script.int_stack[CS2Script.int_stack_size++] = class73.method466(94,
									Class243.aClass_lArray3448, i_189_, string);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3118
							String string = CS2Script.string_stack[--CS2Script.string_stack_size];
							CS2Script.int_stack_size -= 2;
							int i_191_ = CS2Script.int_stack[CS2Script.int_stack_size];
							int i_192_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
							FontMetric class73 = Class129.method878(6, 0, i_192_,
									Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
							CS2Script.int_stack[CS2Script.int_stack_size++] = class73.method468((byte) 123, string,
									i_191_, Class243.aClass_lArray3448);
							return 1; // L: 3126
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3128
							string_stack_size -= 2; // L: 3129
							var3 = string_stack[string_stack_size]; // L: 3130
							var4 = string_stack[string_stack_size + 1]; // L: 3131
							if (int_stack[--int_stack_size] == 1) { // L: 3132
								string_stack[++string_stack_size - 1] = var3;
							} else {
								string_stack[++string_stack_size - 1] = var4; // L: 3133
							}

							return 1; // L: 3134
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3136
							var3 = string_stack[--string_stack_size];
							string_stack[++string_stack_size - 1] = Class59_Sub3_Sub1.method2443(var3, (byte) 90);
							return 1; // L: 3139
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3141
							var3 = string_stack[--string_stack_size]; // L: 3142
							var9 = int_stack[--int_stack_size]; // L: 3143
							string_stack[++string_stack_size - 1] = var3 + (char) var9; // L: 3144
							return 1; // L: 3145
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3147
							var10 = int_stack[--int_stack_size]; // L: 3148
							int_stack[++int_stack_size - 1] = Class59.method402((char) var10, 123) ? 1 : 0;
							return 1; // L: 3150
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3152
							var10 = int_stack[--int_stack_size]; // L: 3153
							int_stack[++int_stack_size - 1] = (Texture.method2700(-122, (char) var10) ? 1 : 0);
							return 1; // L: 3155
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3157
							var10 = int_stack[--int_stack_size]; // L: 3158
							int_stack[++int_stack_size - 1] = Class133.method895(26959, (char) var10) ? 1 : 0;
							return 1; // L: 3160
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3162
							var10 = int_stack[--int_stack_size]; // L: 3163
							int_stack[++int_stack_size - 1] = Class_w.method2652((char) var10, false) ? 1 : 0;
							return 1; // L: 3165
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3167
							var3 = string_stack[--string_stack_size]; // L: 3168
							if (var3 == null) {
								int_stack[++int_stack_size - 1] = 0; // L: 3170
							} else { // L: 3169
								int_stack[++int_stack_size - 1] = var3.length();
							}

							return 1; // L: 3171
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3173
							var3 = string_stack[--string_stack_size]; // L: 3174
							int_stack_size -= 2; // L: 3175
							var9 = int_stack[int_stack_size]; // L: 3176
							var5 = int_stack[int_stack_size + 1]; // L: 3177
							string_stack[++string_stack_size - 1] = var3.substring(var9, var5); // L: 3178
							return 1; // L: 3179
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3181
							var3 = string_stack[--string_stack_size]; // L: 3182
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3183
							boolean var16 = false; // L: 3184

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3185
								char var7 = var3.charAt(var6); // L: 3186
								if (var7 == '<') { // L: 3187
									var16 = true;
								} else if (var7 == '>') { // L: 3188
									var16 = false;
								} else if (!var16) { // L: 3189
									var15.append(var7);
								}
							}

							string_stack[++string_stack_size - 1] = var15.toString(); // L: 3191
							return 1; // L: 3192
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3194
							var3 = string_stack[--string_stack_size]; // L: 3195
							var9 = int_stack[--int_stack_size]; // L: 3196
							int_stack[++int_stack_size - 1] = var3.indexOf(var9); // L: 3197
							return 1; // L: 3198
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3200
							string_stack_size -= 2; // L: 3201
							var3 = string_stack[string_stack_size]; // L: 3202
							var4 = string_stack[string_stack_size + 1]; // L: 3203
							var5 = int_stack[--int_stack_size]; // L: 3204
							int_stack[++int_stack_size - 1] = var3.indexOf(var4, var5); // L: 3205
							return 1; // L: 3206
						} else if (var0 == 4122) { // L: 3208
							var3 = string_stack[--string_stack_size]; // L: 3209
							string_stack[++string_stack_size - 1] = var3.toUpperCase(); // L: 3210
							return 1; // L: 3211
						} else {
							return 2; // L: 3213
						}
					}
				}
			}
		}
	}

	public static int method5825(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 42
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 43
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 44
		var0 += var0 >>> 8; // L: 45
		var0 += var0 >>> 16; // L: 46
		return var0 & 255; // L: 47
	}

	static int under_4100(int var0, CS2Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 2828
			int_stack_size -= 2; // L: 2829
			var3 = int_stack[int_stack_size]; // L: 2830
			var4 = int_stack[int_stack_size + 1]; // L: 2831
			int_stack[++int_stack_size - 1] = var4 + var3; // L: 2832
			return 1; // L: 2833
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2835
			int_stack_size -= 2; // L: 2836
			var3 = int_stack[int_stack_size]; // L: 2837
			var4 = int_stack[int_stack_size + 1]; // L: 2838
			int_stack[++int_stack_size - 1] = var3 - var4; // L: 2839
			return 1; // L: 2840
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2842
			int_stack_size -= 2; // L: 2843
			var3 = int_stack[int_stack_size]; // L: 2844
			var4 = int_stack[int_stack_size + 1]; // L: 2845
			int_stack[++int_stack_size - 1] = var3 * var4; // L: 2846
			return 1; // L: 2847
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2849
			int_stack_size -= 2; // L: 2850
			var3 = int_stack[int_stack_size]; // L: 2851
			var4 = int_stack[int_stack_size + 1]; // L: 2852
			int_stack[++int_stack_size - 1] = var3 / var4; // L: 2853
			return 1; // L: 2854
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2856
			var3 = int_stack[--int_stack_size]; // L: 2857
			int_stack[++int_stack_size - 1] = (int) (Math.random() * (double) var3); // L: 2858
			return 1; // L: 2859
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2861
			var3 = int_stack[--int_stack_size]; // L: 2862
			int_stack[++int_stack_size - 1] = (int) (Math.random() * (double) (var3 + 1)); // L: 2863
			return 1; // L: 2864
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2866
				int_stack_size -= 5; // L: 2867
				var3 = int_stack[int_stack_size]; // L: 2868
				var4 = int_stack[int_stack_size + 1]; // L: 2869
				var5 = int_stack[int_stack_size + 2]; // L: 2870
				var6 = int_stack[int_stack_size + 3]; // L: 2871
				var7 = int_stack[int_stack_size + 4]; // L: 2872
				int_stack[++int_stack_size - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 2873
				return 1; // L: 2874
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2876
				int_stack_size -= 2; // L: 2877
				var3 = int_stack[int_stack_size]; // L: 2878
				var4 = int_stack[int_stack_size + 1]; // L: 2879
				int_stack[++int_stack_size - 1] = var3 + var3 * var4 / 100; // L: 2880
				return 1; // L: 2881
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2883
				int_stack_size -= 2; // L: 2884
				var3 = int_stack[int_stack_size]; // L: 2885
				var4 = int_stack[int_stack_size + 1]; // L: 2886
				int_stack[++int_stack_size - 1] = var3 | 1 << var4; // L: 2887
				return 1; // L: 2888
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2890
				int_stack_size -= 2; // L: 2891
				var3 = int_stack[int_stack_size]; // L: 2892
				var4 = int_stack[int_stack_size + 1]; // L: 2893
				int_stack[++int_stack_size - 1] = var3 & -1 - (1 << var4); // L: 2894
				return 1; // L: 2895
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2897
				int_stack_size -= 2; // L: 2898
				var3 = int_stack[int_stack_size]; // L: 2899
				var4 = int_stack[int_stack_size + 1]; // L: 2900
				int_stack[++int_stack_size - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 2901
				return 1; // L: 2902
			} else if (var0 == ScriptOpcodes.MOD) { // L: 2904
				int_stack_size -= 2; // L: 2905
				var3 = int_stack[int_stack_size]; // L: 2906
				var4 = int_stack[int_stack_size + 1]; // L: 2907
				int_stack[++int_stack_size - 1] = var3 % var4; // L: 2908
				return 1; // L: 2909
			} else if (var0 == ScriptOpcodes.POW) { // L: 2911
				int_stack_size -= 2; // L: 2912
				var3 = int_stack[int_stack_size]; // L: 2913
				var4 = int_stack[int_stack_size + 1]; // L: 2914
				if (var3 == 0) { // L: 2915
					int_stack[++int_stack_size - 1] = 0;
				} else {
					int_stack[++int_stack_size - 1] = (int) Math.pow((double) var3, (double) var4); // L: 2916
				}

				return 1; // L: 2917
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2919
				int_stack_size -= 2; // L: 2920
				var3 = int_stack[int_stack_size]; // L: 2921
				var4 = int_stack[int_stack_size + 1]; // L: 2922
				if (var3 == 0) { // L: 2923
					int_stack[++int_stack_size - 1] = 0; // L: 2924
					return 1; // L: 2925
				} else {
					switch (var4) { // L: 2927
						case 0:
							int_stack[++int_stack_size - 1] = Integer.MAX_VALUE; // L: 2935
							break; // L: 2936
						case 1:
							int_stack[++int_stack_size - 1] = var3; // L: 2950
							break; // L: 2951
						case 2:
							int_stack[++int_stack_size - 1] = (int) Math.sqrt((double) var3); // L: 2945
							break; // L: 2946
						case 3:
							int_stack[++int_stack_size - 1] = (int) Math.cbrt((double) var3); // L: 2930
							break;
						case 4:
							int_stack[++int_stack_size - 1] = (int) Math.sqrt(Math.sqrt((double) var3)); // L: 2955
							break;
						default:
							int_stack[++int_stack_size - 1] = (int) Math.pow((double) var3, 1.0D / (double) var4); // L:
																													// 2940
					}

					return 1; // L: 2959
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 2961
				int_stack_size -= 2; // L: 2962
				var3 = int_stack[int_stack_size]; // L: 2963
				var4 = int_stack[int_stack_size + 1]; // L: 2964
				int_stack[++int_stack_size - 1] = var3 & var4; // L: 2965
				return 1; // L: 2966
			} else if (var0 == ScriptOpcodes.OR) { // L: 2968
				int_stack_size -= 2; // L: 2969
				var3 = int_stack[int_stack_size]; // L: 2970
				var4 = int_stack[int_stack_size + 1]; // L: 2971
				int_stack[++int_stack_size - 1] = var3 | var4; // L: 2972
				return 1; // L: 2973
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 2975
				int_stack_size -= 3; // L: 2976
				long var9 = (long) int_stack[int_stack_size]; // L: 2977
				long var11 = (long) int_stack[int_stack_size + 1]; // L: 2978
				long var13 = (long) int_stack[int_stack_size + 2]; // L: 2979
				int_stack[++int_stack_size - 1] = (int) (var13 * var9 / var11); // L: 2980
				return 1; // L: 2981
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 2983
				var3 = method5825(int_stack[--int_stack_size]); // L: 2984
				int_stack[++int_stack_size - 1] = var3; // L: 2985
				return 1; // L: 2986
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 2988
				int_stack_size -= 2; // L: 2989
				var3 = int_stack[int_stack_size]; // L: 2990
				var4 = int_stack[int_stack_size + 1]; // L: 2991
				int_stack[++int_stack_size - 1] = var3 ^ 1 << var4; // L: 2992
				return 1; // L: 2993
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 2995
				int_stack_size -= 3; // L: 2996
				var3 = int_stack[int_stack_size]; // L: 2997
				var4 = int_stack[int_stack_size + 1]; // L: 2998
				var5 = int_stack[int_stack_size + 2]; // L: 2999
				int_stack[++int_stack_size - 1] = /* FloorOverlayDefinition.method3636(var3, var4, var5) */0; // L: 3000
				return 1; // L: 3001
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3003
				int_stack_size -= 3; // L: 3004
				var3 = int_stack[int_stack_size]; // L: 3005
				var4 = int_stack[int_stack_size + 1]; // L: 3006
				var5 = int_stack[int_stack_size + 2]; // L: 3007
				int_stack[++int_stack_size - 1] = /* class123.method2737(var3, var4, var5) */0; // L: 3008
				return 1; // L: 3009
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3011
				int_stack_size -= 3; // L: 3012
				var3 = int_stack[int_stack_size]; // L: 3013
				var4 = int_stack[int_stack_size + 1]; // L: 3014
				var5 = int_stack[int_stack_size + 2]; // L: 3015
				var6 = 31 - var5; // L: 3016
				int_stack[++int_stack_size - 1] = var3 << var6 >>> var4 + var6; // L: 3017
				return 1; // L: 3018
			} else if (var0 == 4030) { // L: 3020
				int_stack_size -= 4; // L: 3021
				var3 = int_stack[int_stack_size]; // L: 3022
				var4 = int_stack[int_stack_size + 1]; // L: 3023
				var5 = int_stack[int_stack_size + 2]; // L: 3024
				var6 = int_stack[int_stack_size + 3]; // L: 3025
				var3 = /* class123.method2737(var3, var5, var6) */0; // L: 3026
				var7 = /* WorldMapEvent.method4942(var6 - var5 + 1) */0; // L: 3027
				if (var4 > var7) { // L: 3028
					var4 = var7;
				}

				int_stack[++int_stack_size - 1] = var3 | var4 << var5; // L: 3029
				return 1; // L: 3030
			} else if (var0 == 4032) { // L: 3032
				int_stack[int_stack_size - 1] = /* SoundCache.method833(int_stack[int_stack_size - 1]) */0; // L: 3033
				return 1; // L: 3034
			} else if (var0 == 4033) { // L: 3036
				int_stack[int_stack_size - 1] = /*
												 * GrandExchangeOfferNameComparator.method5727(int_stack[int_stack_size
												 * - 1])
												 */0; // L: 3037
				return 1; // L: 3038
			} else if (var0 == 4034) { // L: 3040
				int_stack_size -= 2; // L: 3041
				var3 = int_stack[int_stack_size]; // L: 3042
				var4 = int_stack[int_stack_size + 1]; // L: 3043
				var5 = /* class123.method2744(var3, var4) */0; // L: 3044
				int_stack[++int_stack_size - 1] = var5; // L: 3045
				return 1; // L: 3046
			} else if (var0 == 4035) { // L: 3048
				int_stack[int_stack_size - 1] = Math.abs(int_stack[int_stack_size - 1]); // L: 3049
				return 1; // L: 3050
			} else {
				return 2; // L: 3052
			}
		}
	}

	static int under_4000(int var0, CS2Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2681
			var3 = int_stack[--int_stack_size]; // L: 2682
			int_stack[++int_stack_size - 1] = Client.grand_exchange_objects[var3].get_offer_type(); // L: 2683
			return 1; // L: 2684
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2686
			var3 = int_stack[--int_stack_size]; // L: 2687
			int_stack[++int_stack_size - 1] = Client.grand_exchange_objects[var3].id; // L: 2688
			return 1; // L: 2689
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2691
			var3 = int_stack[--int_stack_size]; // L: 2692
			int_stack[++int_stack_size - 1] = Client.grand_exchange_objects[var3].price; // L: 2693
			return 1; // L: 2694
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2696
			var3 = int_stack[--int_stack_size]; // L: 2697
			int_stack[++int_stack_size - 1] = Client.grand_exchange_objects[var3].amount; // L: 2698
			return 1; // L: 2699
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2701
			var3 = int_stack[--int_stack_size]; // L: 2702
			int_stack[++int_stack_size - 1] = Client.grand_exchange_objects[var3].sold_amount; // L: 2703
			return 1; // L: 2704
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2706
			var3 = int_stack[--int_stack_size]; // L: 2707
			int_stack[++int_stack_size - 1] = Client.grand_exchange_objects[var3].total_price; // L: 2708
			return 1; // L: 2709
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2711
				var3 = int_stack[--int_stack_size]; // L: 2712
				var13 = Client.grand_exchange_objects[var3].get_status(); // L: 2713
				int_stack[++int_stack_size - 1] = var13 == 0 ? 1 : 0; // L: 2714
				return 1; // L: 2715
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2717
				var3 = int_stack[--int_stack_size]; // L: 2718
				var13 = Client.grand_exchange_objects[var3].get_status(); // L: 2719
				int_stack[++int_stack_size - 1] = var13 == 2 ? 1 : 0; // L: 2720
				return 1; // L: 2721
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2723
				var3 = int_stack[--int_stack_size]; // L: 2724
				var13 = Client.grand_exchange_objects[var3].get_status(); // L: 2725
				int_stack[++int_stack_size - 1] = var13 == 5 ? 1 : 0; // L: 2726
				return 1; // L: 2727
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2729
				var3 = int_stack[--int_stack_size]; // L: 2730
				var13 = Client.grand_exchange_objects[var3].get_status(); // L: 2731
				int_stack[++int_stack_size - 1] = var13 == 1 ? 1 : 0; // L: 2732
				return 1; // L: 2733
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2735
					var12 = int_stack[--int_stack_size] == 1; // L: 2736
					/*
					 * if (Client.grand_exchange_events != null) { // L: 2737
					 * Client.grand_exchange_events.sort(GrandExchangeEvents.name_comparator,
					 * var12); // L: 2738
					 * }
					 */

					return 1; // L: 2740
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2742
					var12 = int_stack[--int_stack_size] == 1; // L: 2743
					/*
					 * if (Client.grand_exchange_events != null) { // L: 2744
					 * Client.grand_exchange_events.sort(GrandExchangeEvents.
					 * GrandExchangeEvents_priceComparator, var12); // L: 2745
					 * }
					 */

					return 1; // L: 2747
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2749
					int_stack_size -= 2; // L: 2750
					var12 = int_stack[int_stack_size] == 1; // L: 2751
					boolean var11 = int_stack[int_stack_size + 1] == 1; // L: 2752
					/*
					 * if (Client.grand_exchange_events != null) { // L: 2753
					 * Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2754
					 * Client.grand_exchange_events.sort(Client.GrandExchangeEvents_worldComparator,
					 * var12); // L: 2755
					 * }
					 */

					return 1; // L: 2757
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2759
					var12 = int_stack[--int_stack_size] == 1; // L: 2760
					/*
					 * if (Client.grand_exchange_events != null) { // L: 2761
					 * Client.grand_exchange_events.sort(GrandExchangeEvents.
					 * GrandExchangeEvents_ageComparator, var12); // L: 2762
					 * }
					 */

					return 1; // L: 2764
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2766
					var12 = int_stack[--int_stack_size] == 1; // L: 2767
					/*
					 * if (Client.grand_exchange_events != null) { // L: 2768
					 * Client.grand_exchange_events.sort(GrandExchangeEvents.
					 * GrandExchangeEvents_quantityComparator, var12); // L: 2769
					 * }
					 */

					return 1; // L: 2771
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2773
					int_stack[++int_stack_size - 1] = /*
														 * Client.grand_exchange_events == null ? 0 :
														 * Client.grand_exchange_events.events.size()
														 */0; // L: 2774
					return 1; // L: 2775
				} else {
					Object var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2777
						var3 = int_stack[--int_stack_size]; // L: 2778
						var4 = /* (GrandExchangeEvent)Client.grand_exchange_events.events.get(var3) */0; // L: 2779
						int_stack[++int_stack_size - 1] = /* var4.world */0; // L: 2780
						return 1; // L: 2781
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2783
						var3 = int_stack[--int_stack_size]; // L: 2784
						var4 = /* (GrandExchangeEvent)Client.grand_exchange_events.events.get(var3) */0; // L: 2785
						string_stack[++string_stack_size - 1] = /* var4.getOfferName() */"jaha did 911"; // L: 2786
						return 1; // L: 2787
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2789
						var3 = int_stack[--int_stack_size]; // L: 2790
						var4 = /* (GrandExchangeEvent)Client.grand_exchange_events.events.get(var3) */0; // L: 2791
						string_stack[++string_stack_size - 1] = /* var4.getPreviousOfferName() */""; // L: 2792
						return 1; // L: 2793
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2795
						var3 = int_stack[--int_stack_size]; // L: 2796
						var4 = /* (GrandExchangeEvent)Client.grand_exchange_events.events.get(var3) */0; // L: 2797
						long var5 = /* Ignored.method6459() - WorldMapSprite.field2727 - var4.age */0; // L: 2798
						int var7 = (int) (var5 / 3600000L); // L: 2799
						int var8 = (int) ((var5 - (long) (var7 * 3600000)) / 60000L); // L: 2800
						int var9 = (int) ((var5 - (long) (var7 * 3600000) - (long) (var8 * 60000)) / 1000L); // L: 2801
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2802
						string_stack[++string_stack_size - 1] = var10; // L: 2803
						return 1; // L: 2804
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2806
						var3 = int_stack[--int_stack_size]; // L: 2807
						var4 = /* (GrandExchangeEvent)Client.grand_exchange_events.events.get(var3) */0; // L: 2808
						int_stack[++int_stack_size - 1] = /* var4.grandExchangeOffer.amount */0; // L: 2809
						return 1; // L: 2810
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2812
						var3 = int_stack[--int_stack_size]; // L: 2813
						var4 = /* (GrandExchangeEvent)Client.grand_exchange_events.events.get(var3) */0; // L: 2814
						int_stack[++int_stack_size - 1] = /* var4.grandExchangeOffer.price */0; // L: 2815
						return 1; // L: 2816
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2818
						var3 = int_stack[--int_stack_size]; // L: 2819
						var4 = /* (GrandExchangeEvent)Client.grand_exchange_events.events.get(var3) */0; // L: 2820
						int_stack[++int_stack_size - 1] = /* var4.grandExchangeOffer.id */0; // L: 2821
						return 1; // L: 2822
					} else {
						return 2; // L: 2824
					}
				}
			}
		}
	}

	static int under_3800(int var0, CS2Script var1, boolean var2) {
		if (var0 == 3700 || var0 == 3701) {
			--int_stack_size; // L: 2487
			--string_stack_size; // L: 2488
			return 1; // L: 2489
		} else { // L: 2486
			if (var0 == 3702) { // L: 2491
				++int_stack_size; // L: 2492
				return 1; // L: 2493
			} else {
				return 2; // L: 2495
			}
		}
	}

	static int under_3900(int opcode, CS2Script script, boolean flag) {
		if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2499
			int_stack[++int_stack_size - 1] = 0; // L: 2504 //TODO
			/*
			 * if (class222.guestClanSettings != null) { // L: 2500
			 * int_stack[++int_stack_size - 1] = 1; // L: 2501 Friend.field4084 =
			 * class222.guestClanSettings; // L: 2502 } else { int_stack[++int_stack_size -
			 * 1] = 0; // L: 2504 }
			 */

			return 1; // L: 2505
		} else {
			int var3;
			if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2507
				var3 = int_stack[--int_stack_size]; // L: 2508
				int_stack[++int_stack_size - 1] = 0; // L: 2513 //TODO
				/*
				 * if (Client.currentClanSettings[var3] != null) { // L: 2509
				 * int_stack[++int_stack_size - 1] = 1; // L: 2510 Friend.field4084 =
				 * Client.currentClanSettings[var3]; // L: 2511 } else {
				 * int_stack[++int_stack_size - 1] = 0; // L: 2513 }
				 */

				return 1; // L: 2514
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2516
				string_stack[++string_stack_size - 1] = /* Friend.field4084.name; // L: 2517 */"jaha"; // TODO
				return 1; // L: 2518
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2520
				int_stack[++int_stack_size - 1] = /* Friend.field4084.allowGuests ? 1 : 0; // L: 2521 */0; // TODO
				return 1; // L: 2522
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2524
				int_stack[++int_stack_size - 1] = /* Friend.field4084.field1567; // L: 2525 */ 0; // TODO
				return 1; // L: 2526
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2528
				int_stack[++int_stack_size - 1] = /* Friend.field4084.field1568; // L: 2529 */0; // TODO
				return 1; // L: 2530
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2532
				int_stack[++int_stack_size - 1] = /* Friend.field4084.field1569; // L: 2533 */0; // TODO
				return 1; // L: 2534
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2536
				int_stack[++int_stack_size - 1] = /* Friend.field4084.field1570; // L: 2537 */0; // TODO
				return 1; // L: 2538
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2540
				int_stack[++int_stack_size - 1] = /* Friend.field4084.memberCount; // L: 2541 */0;// TODO
				return 1; // L: 2542
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2544
				var3 = int_stack[--int_stack_size]; // L: 2545
				string_stack[++string_stack_size - 1] = /* Friend.field4084.memberNames[var3]; // L: 2546 */"jaha2"; // TODO
				return 1; // L: 2547
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2549
				var3 = int_stack[--int_stack_size]; // L: 2550
				int_stack[++int_stack_size - 1] = /* Friend.field4084.memberRanks[var3]; // L: 2551 */0; // TODO
				return 1; // L: 2552
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2554
				int_stack[++int_stack_size - 1] = /* Friend.field4084.bannedMemberCount; // L: 2555 */0; // TODO
				return 1; // L: 2556
			} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2558
				var3 = int_stack[--int_stack_size]; // L: 2559
				string_stack[++string_stack_size
						- 1] = /* Friend.field4084.bannedMemberNames[var3]; // L: 2560 */"jaha3"; // TODO
				return 1; // L: 2561
			} else {
				int var5;
				int var6;
				if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2563
					int_stack_size -= 3; // L: 2564
					var3 = int_stack[int_stack_size]; // L: 2565
					var6 = int_stack[int_stack_size + 1]; // L: 2566
					var5 = int_stack[int_stack_size + 2]; // L: 2567
					int_stack[++int_stack_size - 1] = /* Friend.field4084.method2847(var3, var6, var5); // L: 2568 */0; // TODO
					return 1; // L: 2569
				} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2571
					int_stack[++int_stack_size - 1] = /* Friend.field4084.currentOwner; // L: 2572 */0; // TODO
					return 1; // L: 2573
				} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2575
					int_stack[++int_stack_size - 1] = /* Friend.field4084.field1579; // L: 2576 */ 0; // TODO
					return 1; // L: 2577
				} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2579
					int_stack[++int_stack_size
							- 1] = /* Friend.field4084.method2881(string_stack[--string_stack_size]); // L: 2580 */0; // TODO
					return 1; // L: 2581
				} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2583
					int_stack[int_stack_size - 1] = /*
													 * Friend.field4084.getSortedMembers()[int_stack[int_stack_size -
													 * 1]]; // L: 2584
													 */0; // TODO
					return 1; // L: 2585
				} else if (opcode == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2587
					int_stack_size -= 2; // L: 2588
					var3 = int_stack[int_stack_size]; // L: 2589
					var6 = int_stack[int_stack_size + 1]; // L: 2590
					// class113.method2617(var6, var3); // L: 2591 //TODO
					return 1; // L: 2592
				} else if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2594
					var3 = int_stack[--int_stack_size]; // L: 2595
					int_stack[++int_stack_size - 1] = /* Friend.field4084.field1582[var3]; // L: 2596 */ 0; // TODO
					return 1; // L: 2597
				} else {
					if (opcode == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2599
						int_stack_size -= 3; // L: 2600
						var3 = int_stack[int_stack_size]; // L: 2601
						boolean var4 = int_stack[int_stack_size + 1] == 1; // L: 2602
						var5 = int_stack[int_stack_size + 2]; // L: 2603
						// class6.method48(var5, var3, var4); // L: 2604 //TODO
					}

					if (opcode == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2606
						var3 = int_stack[--int_stack_size]; // L: 2607
						int_stack[++int_stack_size - 1] = /* Friend.field4084.field1577[var3] ? 1 : 0; // L: 2608 */0; // TODO
						return 1; // L: 2609
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2611
						int_stack[++int_stack_size - 1] = 0; // L: 2616 //TODO
						/*
						 * if (UserComparator5.guestClanChannel != null) { // L: 2612
						 * int_stack[++int_stack_size - 1] = 1; // L: 2613 class1.field0 =
						 * UserComparator5.guestClanChannel; // L: 2614 } else {
						 * int_stack[++int_stack_size - 1] = 0; // L: 2616 }
						 */

						return 1; // L: 2617
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2619
						var3 = int_stack[--int_stack_size]; // L: 2620
						int_stack[++int_stack_size - 1] = 0; // L: 2626 //TODO
						/*
						 * if (Client.currentClanChannels[var3] != null) { // L: 2621
						 * int_stack[++int_stack_size - 1] = 1; // L: 2622 class1.field0 =
						 * Client.currentClanChannels[var3]; // L: 2623 Interpreter.field812 = var3; //
						 * L: 2624 } else { int_stack[++int_stack_size - 1] = 0; // L: 2626 }
						 */

						return 1; // L: 2627
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2629
						string_stack[++string_stack_size - 1] = /* class1.field0.name; // L: 2630 */"jaha4"; // TODO
						return 1; // L: 2631
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2633
						int_stack[++int_stack_size - 1] = /* class1.field0.field1643; // L: 2634 */0; // TODO
						return 1; // L: 2635
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2637
						int_stack[++int_stack_size - 1] = /* class1.field0.field1636; // L: 2638 */0; // TODO
						return 1; // L: 2639
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2641
						int_stack[++int_stack_size - 1] = /* class1.field0.method2990(); // L: 2642 */0; // TODO
						return 1; // L: 2643
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2645
						var3 = int_stack[--int_stack_size]; // L: 2646
						string_stack[++string_stack_size - 1] = /*
																 * ((ClanChannelMember)class1.field0.members.get(var3)).
																 * username.getName(); // L: 2647
																 */"jaha5"; // TODO
						return 1; // L: 2648
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2650
						var3 = int_stack[--int_stack_size]; // L: 2651
						int_stack[++int_stack_size
								- 1] = /* ((ClanChannelMember)class1.field0.members.get(var3)).rank; // L: 2652 */0; // TODO
						return 1; // L: 2653
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2655
						var3 = int_stack[--int_stack_size]; // L: 2656
						int_stack[++int_stack_size
								- 1] = /* ((ClanChannelMember)class1.field0.members.get(var3)).world; // L: 2657 */0; // TODO
						return 1; // L: 2658
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2660
						var3 = int_stack[--int_stack_size]; // L: 2661
						// class135.method2831(Interpreter.field812, var3); // L: 2662
						return 1; // L: 2663
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2665
						String some_val = string_stack[--string_stack_size];
						int_stack[++int_stack_size
								- 1] = /* class1.field0.method2991(string_stack[--string_stack_size]); // L: 2666 */0; // TODO
						return 1; // L: 2667
					} else if (opcode == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2669
						int_stack[int_stack_size
								- 1] = /*
										 * class1.field0.getSortedMembers()[int_stack[int_stack_size - 1]]; // L: 2670
										 */int_stack[int_stack_size - 1]; // TODO
						return 1; // L: 2671
					} else if (opcode == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2673
						int_stack[++int_stack_size
								- 1] = /* BuddyRankComparator.field1342 != null ? 1 : 0; // L: 2674 */0; // TODO
						return 1; // L: 2675
					} else {
						return 2; // L: 2677
					}
				}
			}
		}
	}

	static int under_3700(int opcode, CS2Script script, boolean flag) {
		if (opcode == ScriptOpcodes.FRIEND_COUNT) {
			if (Client.anInt1429 == 0)
				CS2Script.int_stack[CS2Script.int_stack_size++] = -2;
			else {
				if (Client.anInt1429 == 1)
					CS2Script.int_stack[CS2Script.int_stack_size++] = -1;
				else {
					CS2Script.int_stack[CS2Script.int_stack_size++] = Client.anInt3969;
					return 1;
				}
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.FRIEND_GETNAME) {
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
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.FRIEND_GETWORLD) {
			int i_118_ = CS2Script.int_stack[--CS2Script.int_stack_size];
			if (Client.anInt1429 == 2 && i_118_ < Client.anInt3969)
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class40.anIntArray615[i_118_];
			else {
				CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.FRIEND_GETRANK) {
			int i_119_ = CS2Script.int_stack[--CS2Script.int_stack_size];
			if (Client.anInt1429 == 2 && i_119_ < Client.anInt3969)
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub28_Sub25.anIntArray6704[i_119_];
			else {
				CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.FRIEND_SETRANK) {
			String string = CS2Script.string_stack[--CS2Script.string_stack_size];
			int i_120_ = CS2Script.int_stack[--CS2Script.int_stack_size];
			Class246_Sub1_Sub14.method2712(string, i_120_, 1);
			return 1;
		}
		if (opcode == ScriptOpcodes.FRIEND_ADD) {
			String string = CS2Script.string_stack[--CS2Script.string_stack_size];
			Class127.method867(string, false);
			return 1;
		}
		if (opcode == ScriptOpcodes.FRIEND_DEL) {
			String string = CS2Script.string_stack[--CS2Script.string_stack_size];
			Class215.method1402(string, (byte) -117);
			return 1;
		}
		if (opcode == ScriptOpcodes.IGNORE_ADD) {
			String string = CS2Script.string_stack[--CS2Script.string_stack_size];
			LocType.method1216((byte) -125, false, string);
			return 1;
		}
		if (opcode == ScriptOpcodes.IGNORE_DEL) {
			String string = CS2Script.string_stack[--CS2Script.string_stack_size];
			Class250.method1599(string, 104);
			return 1;
		}
		if (opcode == ScriptOpcodes.FRIEND_TEST) {
			String string = CS2Script.string_stack[--CS2Script.string_stack_size];
			if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
				string = string.substring(7);
			CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub1_Sub9.method2586(119, string) ? 1 : 0;
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
			if (Clan.clanName != null)
				CS2Script.string_stack[CS2Script.string_stack_size++] = Clan.clanName;
			else {
				CS2Script.string_stack[CS2Script.string_stack_size++] = "";
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_GETCHATCOUNT) {
			if (Clan.clanName != null) {
				CS2Script.int_stack[CS2Script.int_stack_size++] = Clan.clanMembersAmount;
			} else {
				CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
			int i_122_ = CS2Script.int_stack[--CS2Script.int_stack_size];
			if (Clan.clanName != null && i_122_ < Clan.clanMembersAmount) {
				CS2Script.string_stack[CS2Script.string_stack_size++] = Clan.clanMembers[i_122_].name;
			} else {
				CS2Script.string_stack[CS2Script.string_stack_size++] = "";
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
			int i_123_ = CS2Script.int_stack[--CS2Script.int_stack_size];
			if (Clan.clanName != null && i_123_ < Clan.clanMembersAmount)
				CS2Script.int_stack[CS2Script.int_stack_size++] = (((Class9) Clan.clanMembers[i_123_]).world);
			else {
				CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
			int i_124_ = CS2Script.int_stack[--CS2Script.int_stack_size];
			if (Clan.clanName != null && i_124_ < Clan.clanMembersAmount)
				CS2Script.int_stack[CS2Script.int_stack_size++] = Clan.clanMembers[i_124_].rank;
			else {
				CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_GETCHATMINKICK) {
			CS2Script.int_stack[CS2Script.int_stack_size++] = Clan.clanName != null ? Clan.kickRank : 0;
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_KICKUSER) {
			String string = CS2Script.string_stack[--CS2Script.string_stack_size];
			Class145.method975(string, (byte) 67);
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_GETCHATRANK) {
			CS2Script.int_stack[CS2Script.int_stack_size++] = Class86.aByte1136;
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_JOINCHAT) {
			String string = CS2Script.string_stack[--CS2Script.string_stack_size];
			Class40_Sub4.method1879(string, 65);
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_LEAVECHAT) {
			Class64_Sub1.method2221(0);
			return 1;
		}
		if (opcode == ScriptOpcodes.IGNORE_COUNT) {
			if (Client.anInt1429 == 0) {
				CS2Script.int_stack[++int_stack_size - 1] = -1;
			} else {
				CS2Script.int_stack[++int_stack_size - 1] = Widget.anInt3266;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.IGNORE_GETNAME) {
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
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.IGNORE_TEST) {
			String string = CS2Script.string_stack[--CS2Script.string_stack_size];
			if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
				string = string.substring(7);
			CS2Script.int_stack[CS2Script.int_stack_size++] = Class129.method881(string, false) ? 1 : 0;
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_ISSELF) {
			int i_126_ = CS2Script.int_stack[--CS2Script.int_stack_size];
			if (Clan.clanMembers != null && i_126_ < Clan.clanMembersAmount
					&& (((Class9) Clan.clanMembers[i_126_]).aString109
							.equalsIgnoreCase(((Player) Client.local_player).aString7140)))
				CS2Script.int_stack[CS2Script.int_stack_size++] = 1;
			else {
				CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
			if (Class221.aString3061 != null)
				CS2Script.string_stack[CS2Script.string_stack_size++] = Class221.aString3061;
			else {
				CS2Script.string_stack[CS2Script.string_stack_size++] = "";
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_ISFRIEND) {
			int i_127_ = CS2Script.int_stack[--CS2Script.int_stack_size];
			if (Clan.clanName != null && i_127_ < Clan.clanMembersAmount)
				CS2Script.int_stack[CS2Script.int_stack_size++] = /*
																	 * (((Class9)
																	 * Class_o.aClass9Array7224[i_127_]).aString105);
																	 */1; // TODO
			else {
				CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				return 1;
			}
			return 1;
		}
		if (opcode == ScriptOpcodes.CLAN_ISIGNORE) {
			int i_128_ = CS2Script.int_stack[--CS2Script.int_stack_size];
			if (Client.anInt1429 == 2 && i_128_ >= 0 && i_128_ < Client.anInt3969)
				CS2Script.int_stack[CS2Script.int_stack_size++] = WidgetParent.aBoolArray5520[i_128_] ? 1 : 0;
			else {
				CS2Script.int_stack[CS2Script.int_stack_size++] = 0;
				return 1;
			}
			return 1;
		}
		if (opcode == 3628) { // TODO
			/*
			 * String string = CS2Script.string_stack[--CS2Script.string_stack_size]; if
			 * (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string =
			 * string.substring(7); CS2Script.int_stack[CS2Script.int_stack_size++] =
			 * Class59_Sub2_Sub1.method2450(-30749, string);
			 */
			return 1;
		}
		boolean var8;
		// TODO
		if (opcode == 3629) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class324(var8), 345387098);
			return 1;
		} else if (opcode == 3630) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class325(var8), -443946675);
			return 1;
		} else if (opcode == 3631) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class166(var8), -953682122);
			return 1;
		} else if (opcode == 3632) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class160(var8), -852907174);
			return 1;
		} else if (opcode == 3633) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class165(var8), 151172076);
			return 1;
		} else if (opcode == 3634) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class168(var8), -1637200798);
			return 1;
		} else if (opcode == 3635) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class164(var8), -604005466);
			return 1;
		} else if (opcode == 3636) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class162(var8), -1690778580);
			return 1;
		} else if (opcode == 3637) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class161(var8), -1683674904);
			return 1;
		} else if (opcode == 3638) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class163(var8), 146936524);
			return 1;
		} else if (opcode == 3639) {
			// Client.anInt3969.method5082(1917063500);
			return 1;
		} else if (opcode == 3640) {
			// class173.field2036.field1068.method5069(1897236335);
			return 1;
		} else if (opcode == 3641) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// class173.field2036.field1068.method5139(new class324(var8), 355276768);
			return 1;
		} else if (opcode == 3642) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// class173.field2036.field1068.method5139(new class325(var8), -244102223);
			return 1;
		} else if (opcode == 3643) {
			// class173.field2036.field1068.method5082(1929586782);
			return 1;
		} else if (opcode == 3644) {
			/*
			 * if (class35.field244 != null) { class35.field244.method5069(949323751); }
			 */

			return 1;
		} else if (opcode == 3645) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class324(var8), -1936802834); }
			 */

			return 1;
		} else if (opcode == 3646) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class325(var8), -319059070); }
			 */

			return 1;
		} else if (opcode == 3647) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class166(var8), -524279034); }
			 */

			return 1;
		} else if (opcode == 3648) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class160(var8), -245575436); }
			 */

			return 1;
		} else if (opcode == 3649) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class165(var8), 395847525); }
			 */

			return 1;
		} else if (opcode == 3650) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class168(var8), 284692852); }
			 */

			return 1;
		} else if (opcode == 3651) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class164(var8), -2116808317); }
			 */

			return 1;
		} else if (opcode == 3652) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class162(var8), -368731425); }
			 */

			return 1;
		} else if (opcode == 3653) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class161(var8), -2143527633); }
			 */

			return 1;
		} else if (opcode == 3654) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class163(var8), -456059258); }
			 */

			return 1;
		} else if (opcode == 3655) {
			/*
			 * if (class35.field244 != null) { class35.field244.method5082(1989546643); }
			 */

			return 1;
		} else if (opcode == 3656) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			// Client.anInt3969.method5139(new class167(var8), -173580394);
			return 1;
		} else if (opcode == 3657) {
			var8 = CS2Script.int_stack[--CS2Script.int_stack_size] == 1;
			/*
			 * if (class35.field244 != null) { class35.field244.method5139(new
			 * class167(var8), 233736602); }
			 */

			return 1;
		} else {
			return 2;
		}
	}

	static int under_3500(int var0, CS2Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2059
			int_stack_size -= 2; // L: 2060
			var3 = int_stack[int_stack_size]; // L: 2061
			var9 = int_stack[int_stack_size + 1]; // L: 2062
			EnumType var10 = Class246_Sub39.aClass141_5487.list(var3, -92, 193); // L: 2063
																					// //Class246_Sub39.aClass141_5487.list(i_106_,
																					// -92, 193);
			if (var10.output_type != 's') { // L: 2064
			}

			for (var6 = 0; var6 < var10.output_count; ++var6) { // L: 2065
				if (var9 == var10.keys[var6]) { // L: 2066
					string_stack[++string_stack_size - 1] = var10.string_values[var6]; // L: 2067
					var10 = null; // L: 2068
					break;
				}
			}

			if (var10 != null) { // L: 2072
				string_stack[++string_stack_size - 1] = var10.default_string;
			}

			return 1; // L: 2073
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2075
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2101
				var3 = int_stack[--int_stack_size]; // L: 2102
				EnumType var4 = Class246_Sub39.aClass141_5487.list(var3, -92, 193); // L: 2103
																					// //Class246_Sub39.aClass141_5487.list(i_106_,
																					// -92, 193);
				int_stack[++int_stack_size - 1] = var4.size(); // L: 2104
				return 1; // L: 2105
			} else {
				return 2; // L: 2107
			}
		} else {
			int_stack_size -= 4; // L: 2076
			var3 = int_stack[int_stack_size]; // L: 2077
			var9 = int_stack[int_stack_size + 1]; // L: 2078
			int var5 = int_stack[int_stack_size + 2]; // L: 2079
			var6 = int_stack[int_stack_size + 3]; // L: 2080
			EnumType var7 = Class246_Sub39.aClass141_5487.list(var5, -92, 193); // L: 2081
																				// //Class246_Sub39.aClass141_5487.list(i_106_,
																				// -92, 193);
			if (var3 == var7.input_type && var9 == var7.output_type) { // L: 2082
				for (int var8 = 0; var8 < var7.output_count; ++var8) { // L: 2087
					if (var6 == var7.keys[var8]) { // L: 2088
						if (var9 == 115) { // L: 2089
							string_stack[++string_stack_size - 1] = var7.string_values[var8];
						} else {
							int_stack[++int_stack_size - 1] = var7.integer_values[var8]; // L: 2090
						}

						var7 = null; // L: 2091
						break;
					}
				}

				if (var7 != null) { // L: 2095
					if (var9 == 115) {
						string_stack[++string_stack_size - 1] = var7.default_string; // L: 2096
					} else {
						int_stack[++int_stack_size - 1] = var7.default_int; // L: 2097
					}
				}

				return 1; // L: 2099
			} else {
				if (var9 == 115) { // L: 2083
					string_stack[++string_stack_size - 1] = "null";
				} else {
					int_stack[++int_stack_size - 1] = 0; // L: 2084
				}

				return 1; // L: 2085
			}
		}
	}

	static int under_3400(int var0, CS2Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1913
			int_stack[++int_stack_size - 1] = Client.cycle; // L: 1914
			return 1; // L: 1915
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1917
				CS2Script.int_stack_size -= 2;
				int i_75_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_76_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub28_Sub23.method2730(false, false, i_76_,
						i_75_);
				return 1; // L: 1922
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1924
				CS2Script.int_stack_size -= 2;
				int i_77_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_78_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				CS2Script.int_stack[CS2Script.int_stack_size++] = Class130_Sub8.method2347(120, i_78_, i_77_, false);
				return 1; // L: 1929
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1931
				CS2Script.int_stack_size -= 2;
				int i_79_ = CS2Script.int_stack[CS2Script.int_stack_size];
				int i_80_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
				CS2Script.int_stack[CS2Script.int_stack_size++] = Renderer.method274(-10077, false, i_79_, i_80_);
				return 1; // L: 1936
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1938
				int i_81_ = CS2Script.int_stack[--CS2Script.int_stack_size];
				CS2Script.int_stack[CS2Script.int_stack_size++] = ((Class246_Sub1_Sub2) HashMap.inv_type
						.method416(5, i_81_)).anInt5697;
				return 1; // L: 1941
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1943
				var3 = int_stack[--int_stack_size]; // L: 1944
				int_stack[++int_stack_size - 1] = Player.skill_levels[var3]; // L: 1945
				return 1; // L: 1946
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1948
				var3 = int_stack[--int_stack_size]; // L: 1949
				int_stack[++int_stack_size - 1] = Player.skill_base_levels[var3]; // L: 1950
				return 1; // L: 1951
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1953
				var3 = int_stack[--int_stack_size]; // L: 1954
				int_stack[++int_stack_size - 1] = Player.experience[var3]; // L: 1955
				return 1; // L: 1956
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1958
					var3 = Client.local_player.current_plane; // L: 1959
					var4 = (Client.local_player.x >> 7) + Client.base_x; // L: 1960
					var5 = (Client.local_player.y >> 7) + Client.base_y; // L: 1961
					int_stack[++int_stack_size - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1962
					return 1; // L: 1963
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1965
					var3 = int_stack[--int_stack_size]; // L: 1966
					int_stack[++int_stack_size - 1] = var3 >> 14 & 16383; // L: 1967
					return 1; // L: 1968
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1970
					var3 = int_stack[--int_stack_size]; // L: 1971
					int_stack[++int_stack_size - 1] = var3 >> 28; // L: 1972
					return 1; // L: 1973
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1975
					var3 = int_stack[--int_stack_size]; // L: 1976
					int_stack[++int_stack_size - 1] = var3 & 16383; // L: 1977
					return 1; // L: 1978
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1980
					int_stack[++int_stack_size - 1] = Client.members_world ? 1 : 0; // L: 1981
					return 1; // L: 1982
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1984
					CS2Script.int_stack_size -= 2;
					int i_91_ = CS2Script.int_stack[CS2Script.int_stack_size];
					int i_92_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					CS2Script.int_stack[CS2Script.int_stack_size++] = Class246_Sub28_Sub23.method2730(false, true,
							i_92_, i_91_);
					return 1; // L: 1989
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1991
					CS2Script.int_stack_size -= 2;
					int i_93_ = CS2Script.int_stack[CS2Script.int_stack_size];
					int i_94_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					CS2Script.int_stack[CS2Script.int_stack_size++] = Class130_Sub8.method2347(67, i_94_, i_93_, true);
					return 1; // L: 1996
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 1998
					CS2Script.int_stack_size -= 2;
					int i_95_ = CS2Script.int_stack[CS2Script.int_stack_size];
					int i_96_ = CS2Script.int_stack[CS2Script.int_stack_size + 1];
					CS2Script.int_stack[CS2Script.int_stack_size++] = Renderer.method274(-10077, true, i_95_, i_96_);
					return 1; // L: 2003
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2005
					if (Client.staff_level >= 2) { // L: 2006
						int_stack[++int_stack_size - 1] = Client.staff_level;
					} else {
						int_stack[++int_stack_size - 1] = 0; // L: 2007
					}

					return 1; // L: 2008
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2010
					int_stack[++int_stack_size - 1] = Client.reboot_timer; // L: 2011
					return 1; // L: 2012
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2014
					int_stack[++int_stack_size - 1] = Client.world_id; // L: 2015
					return 1; // L: 2016
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2018
					int_stack[++int_stack_size - 1] = Player.energy; // L: 2019
					return 1; // L: 2020
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2022
					int_stack[++int_stack_size - 1] = Player.weight; // L: 2023
					return 1; // L: 2024
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2026
					if (Player.moderator >= 5 && Player.moderator <= 9) {
						int_stack[++int_stack_size - 1] = 1;
					} else {
						int_stack[++int_stack_size - 1] = 0; // L: 2028
					}

					return 1; // L: 2029
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2031
					int_stack[++int_stack_size - 1] = Client.world_properties; // L: 2032
					return 1; // L: 2033
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2035
					int_stack_size -= 4; // L: 2036
					var3 = int_stack[int_stack_size]; // L: 2037
					var4 = int_stack[int_stack_size + 1]; // L: 2038
					var5 = int_stack[int_stack_size + 2]; // L: 2039
					int var6 = int_stack[int_stack_size + 3]; // L: 2040
					var3 += var4 << 14; // L: 2041
					var3 += var5 << 28; // L: 2042
					var3 += var6; // L: 2043
					int_stack[++int_stack_size - 1] = var3; // L: 2044
					return 1; // L: 2045
				} else if (var0 == 3326) { // L: 2047
					int_stack[++int_stack_size - 1] = Client.field483; // L: 2048
					return 1; // L: 2049
				} else if (var0 == 3327) { // L: 2051
					int_stack[++int_stack_size - 1] = Client.field746; // L: 2052
					return 1; // L: 2053
				} else {
					return 2; // L: 2055
				}
			}
		}
	}

	static int under_3300(int var0, CS2Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1822
			int_stack_size -= 3; // L: 1823
			Client.queue_sound_effect(CS2Script.int_stack[CS2Script.int_stack_size], 0,
					CS2Script.int_stack[CS2Script.int_stack_size + 1], 255,
					CS2Script.int_stack[CS2Script.int_stack_size + 2]);
			return 1; // L: 1825
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1827
			Client.play_song(CS2Script.int_stack[--CS2Script.int_stack_size], -97, 50, 255);
			return 1; // L: 1829
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1831
			int_stack_size -= 2; // L: 1832
			Class234.method1497(255, 0, CS2Script.int_stack[CS2Script.int_stack_size + 1],
					CS2Script.int_stack[CS2Script.int_stack_size]);
			return 1; // L: 1834
		} else {
			int var3;
			int var4;
			if (var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 1836
				if (var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 1872
					return var0 == 3211 ? 1 : 2; // L: 1906 1907 1909
				} else {
					var3 = 0; // L: 1873
					var4 = 0; // L: 1874
					if (var0 == 3210) { // L: 1875
						var3 = int_stack[--int_stack_size]; // L: 1876
					} else if (var0 == 3182) { // L: 1878
						var3 = 6; // L: 1879
					} else if (var0 == 3204) { // L: 1881
						var3 = 7; // L: 1882
					} else if (var0 == 3206) { // L: 1884
						var3 = 8; // L: 1885
					} else if (var0 == 3208) { // L: 1887
						var3 = 9; // L: 1888
					}

					if (var3 == 6) { // L: 1890
						float var5 = 200.0F * ((float) Client.current_renderer.brightness - 0.5F); // L: 1891
						var4 = 100 - Math.round(var5); // L: 1892
					} else /*
							 * if (var3 == 7) { // L: 1894
							 * var4 = Math.round((float)SecureRandomFuture.clientPreferences.musicVolume /
							 * 2.55F); // L: 1895
							 * } else if (var3 == 8) { // L: 1897
							 * var4 =
							 * Math.round((float)SecureRandomFuture.clientPreferences.soundEffectsVolume /
							 * 1.27F); // L: 1898
							 * } else if (var3 == 9)
							 */ { // L: 1900
						var4 = 0;
						// var4 =
						// Math.round((float)SecureRandomFuture.clientPreferences.areaSoundEffectsVolume
						// / 1.27F); // L: 1901
					}

					int_stack[++int_stack_size - 1] = var4; // L: 1903
					return 1; // L: 1904
				}
			} else {
				var3 = 0; // L: 1837
				var4 = int_stack[--int_stack_size]; // L: 1838
				if (var0 == 3209) { // L: 1839
					var3 = int_stack[--int_stack_size]; // L: 1840
				} else if (var0 == 3181) { // L: 1842
					var3 = 6; // L: 1843
				} else if (var0 == 3203) { // L: 1845
					var3 = 7; // L: 1846
				} else if (var0 == 3205) { // L: 1848
					var3 = 8; // L: 1849
				} else if (var0 == 3207) { // L: 1851
					var3 = 9; // L: 1852
				}

				if (var3 == 6) { // L: 1854
					var4 = 100 - Math.min(Math.max(var4, 0), 100); // L: 1855
					// WidgetParent.method2142((double)(0.5F + (float)var4 / 200.0F)); // L: 1856
				} else if (var3 == 7) { // L: 1858
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1859
					// Varcs.method2426(Math.round((float)var4 * 2.55F)); // L: 1860
				} else if (var3 == 8) { // L: 1862
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1863
					// class20.updateSoundEffectVolume(Math.round((float)var4 * 1.27F)); // L: 1864
				} else if (var3 == 9) { // L: 1866
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1867
					// Players.method2383(Math.round(1.27F * (float)var4)); // L: 1868
				}

				return 1; // L: 1870
			}
		}
	}

	static int under_3200(int var0, CS2Script var1, boolean var2, int revision) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1409
			var7 = string_stack[--string_stack_size]; // L: 1410
			Client.add_game_message((byte) -99, var7);
			return 1; // L: 1412
		} else if (var0 == ScriptOpcodes.ANIM) {
			int_stack_size -= 2; // L: 1415
			Client.perform_player_animation(Client.local_player, int_stack[int_stack_size],
					int_stack[int_stack_size + 1], 193); // L: 1416
			return 1; // L: 1417
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			Class257.remove_interfaces(-15257, true,
					revision == 0 ? Revision.CUSTOM_OSRS
							: revision == 1 ? Revision.CUSTOM_PRE_EOC_550
									: revision < 200 ? Revision.OSRS
											: revision == 550 ? Revision.PRE_EOC_550 : Revision.PRE_EOC_634);

			return 1; // L: 1423
		} else {
			int i_65_;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				String string = CS2Script.string_stack[--CS2Script.string_stack_size];
				int i_62_ = 0;
				if (Class48.method323(string, 59))
					i_62_ = Class104.method665(string, 10);
				ScriptExecutor.anInt2118++;
				Class243.writePacket(-126, Class68.aClass201_898);
				Class130_Sub1.stream.writeInt(i_62_, (byte) -46);
				return 1; // L: 1433
			} else {
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					String string = CS2Script.string_stack[--CS2Script.string_stack_size];
					ScriptExecutor.anInt2129++;
					Class243.writePacket(-53, Class132.aClass201_1832);
					Class130_Sub1.stream.writeByte(255, string.length() + 1);
					Class130_Sub1.stream.writeString(55, string);
					return 1; // L: 1442
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					String string = CS2Script.string_stack[--CS2Script.string_stack_size];
					ScriptExecutor.anInt2117++;
					Class243.writePacket(-93, Class133.aClass201_1844);
					Class130_Sub1.stream.writeByte(255, string.length() + 1);
					Class130_Sub1.stream.writeString(74, string);
					return 1; // L: 1451
				} else {
					String var4;
					int i_64_;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						int i_63_ = CS2Script.int_stack[--CS2Script.int_stack_size];
						String string = CS2Script.string_stack[--CS2Script.string_stack_size];
						MapScenes.method1643(string, i_63_, (byte) -24);
						return 1; // L: 1457
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						int_stack_size -= 3; // L: 1460
						i_64_ = int_stack[int_stack_size]; // L: 1461
						i_65_ = int_stack[int_stack_size + 1]; // L: 1462
						int i_66_ = int_stack[int_stack_size + 2]; // L: 1463
						Widget var15 = Widget.get_widget(i_66_, 193); // L: 1464
						Widget.click_widget(var15, i_64_, i_65_, 0); // L: 1465
						return 1; // L: 1466
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						int_stack_size -= 2; // L: 1469
						i_64_ = int_stack[int_stack_size]; // L: 1470
						i_65_ = int_stack[int_stack_size + 1]; // L: 1471
						Widget var13 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L:
																													// 1472
						Widget.click_widget(var13, i_64_, i_65_, 0); // L: 1473
						return 1; // L: 1474
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						Settings.middle_mouse_camera_control = int_stack[--int_stack_size] == 1; // L: 1477
						return 1; // L: 1478
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						int_stack[++int_stack_size - 1] = Settings.show_roofs ? 1 : 0; // L: 1481
						return 1; // L: 1482
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Settings.show_roofs = int_stack[--int_stack_size] == 1; // L: 1485
						Client.current_renderer.save_preferences(Client.sign_link);
						return 1; // L: 1487
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = string_stack[--string_stack_size]; // L: 1490
						boolean var8 = int_stack[--int_stack_size] == 1; // L: 1491
						Client.open_url(var7); // L: 1492
						return 1; // L: 1493
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						i_64_ = int_stack[--int_stack_size]; // L: 1496
						/*
						 * var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2808,
						 * Client.packetWriter.isaacCipher); // L: 1498
						 * var12.packetBuffer.writeShort(i_64_); // L: 1499
						 * Client.packetWriter.addNode(var12); // L: 1500
						 */
						return 1; // L: 1501
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						i_64_ = int_stack[--int_stack_size]; // L: 1504
						string_stack_size -= 2; // L: 1505
						var4 = string_stack[string_stack_size]; // L: 1506
						String var5 = string_stack[string_stack_size + 1]; // L: 1507
						if (var4.length() > 500) { // L: 1508
							return 1;
						} else if (var5.length() > 500) { // L: 1509
							return 1;
						} else {
							/*
							 * PacketBufferNode var6 =
							 * HitSplatDefinition.getPacketBufferNode(ClientPacket.field2841,
							 * Client.packetWriter.isaacCipher); // L: 1510
							 * var6.packetBuffer.writeShort(1 +
							 * class116.stringCp1252NullTerminatedByteSize(var4) +
							 * class116.stringCp1252NullTerminatedByteSize(var5)); // L: 1511
							 * var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1512
							 * var6.packetBuffer.method7343(i_64_); // L: 1513
							 * var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1514
							 * Client.packetWriter.addNode(var6); // L: 1515
							 */
							return 1; // L: 1516
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Settings.shift_click_drop = int_stack[--int_stack_size] == 1; // L: 1519
						return 1; // L: 1520
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Settings.show_mouse_over_text = int_stack[--int_stack_size] == 1; // L: 1523
						return 1; // L: 1524
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Settings.render_self = int_stack[--int_stack_size] == 1; // L: 1527
						return 1; // L: 1528
					} else if (var0 == 3120) {
						if (int_stack[--int_stack_size] == 1) { // L: 1531
							Settings.draw_player_names |= 1;
						} else {
							Settings.draw_player_names &= -2; // L: 1532
						}

						return 1; // L: 1533
					} else if (var0 == 3121) {
						if (int_stack[--int_stack_size] == 1) { // L: 1536
							Settings.draw_player_names |= 2;
						} else {
							Settings.draw_player_names &= -3; // L: 1537
						}

						return 1; // L: 1538
					} else if (var0 == 3122) {
						if (int_stack[--int_stack_size] == 1) { // L: 1541
							Settings.draw_player_names |= 4;
						} else {
							Settings.draw_player_names &= -5; // L: 1542
						}

						return 1; // L: 1543
					} else if (var0 == 3123) {
						if (int_stack[--int_stack_size] == 1) { // L: 1546
							Settings.draw_player_names |= 8;
						} else {
							Settings.draw_player_names &= -9; // L: 1547
						}

						return 1; // L: 1548
					} else if (var0 == 3124) {
						Settings.draw_player_names = 0; // L: 1551
						return 1; // L: 1552
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Settings.show_mouse_cross = int_stack[--int_stack_size] == 1; // L: 1555
						return 1; // L: 1556
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Settings.show_loading_messages = int_stack[--int_stack_size] == 1; // L: 1559
						return 1; // L: 1560
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Settings.tap_to_drop = int_stack[--int_stack_size] == 1; // L: 1563
						return 1; // L: 1564
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						int_stack[++int_stack_size - 1] = Settings.tap_to_drop ? 1 : 0; // L: 1567
						return 1; // L: 1568
					} else if (var0 == 3129) {
						int_stack_size -= 2; // L: 1571
						Client.oculusOrbNormalSpeed = int_stack[int_stack_size]; // L: 1572
						Client.oculusOrbSlowedSpeed = int_stack[int_stack_size + 1]; // L: 1573
						return 1; // L: 1574
					} else if (var0 == 3130) {
						int_stack_size -= 2; // L: 1577
						return 1; // L: 1578
					} else if (var0 == 3131) {
						--int_stack_size; // L: 1581
						return 1; // L: 1582
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						int_stack[++int_stack_size - 1] = Client.client_width; // L: 1585
						int_stack[++int_stack_size - 1] = Client.client_height; // L: 1586
						return 1; // L: 1587
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--int_stack_size; // L: 1590
						return 1; // L: 1591
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1594
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						int_stack_size -= 2; // L: 1597
						return 1; // L: 1598
					} else if (var0 == 3136) {
						Client.field638 = 3; // L: 1601
						Client.field639 = int_stack[--int_stack_size]; // L: 1602
						return 1; // L: 1603
					} else if (var0 == 3137) {
						Client.field638 = 2; // L: 1606
						Client.field639 = int_stack[--int_stack_size]; // L: 1607
						return 1; // L: 1608
					} else if (var0 == 3138) {
						Client.field638 = 0; // L: 1611
						return 1; // L: 1612
					} else if (var0 == 3139) {
						Client.field638 = 1; // L: 1615
						return 1; // L: 1616
					} else if (var0 == 3140) {
						Client.field638 = 3; // L: 1619
						Client.field639 = var2 ? Widget.static_active_component1.hash * 1695982371 * 2075239563
								: Widget.static_active_component2.hash * 1695982371 * 2075239563; // L: 1620
						return 1; // L: 1621
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = int_stack[--int_stack_size] == 1; // L: 1624
							LoginScreen.hide_username = var11; // L: 1625
							Client.current_renderer.save_preferences(Client.sign_link);
							return 1; // L: 1627
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							int_stack[++int_stack_size - 1] = LoginScreen.hide_username ? 1 : 0; // L: 1630
							return 1; // L: 1631
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = int_stack[--int_stack_size] == 1; // L: 1634
							LoginScreen.remember_username = var11; // L: 1635
							if (!var11) { // L: 1636
								LoginScreen.remembered_username = ""; // L: 1637
								Client.current_renderer.save_preferences(Client.sign_link);
							}

							return 1; // L: 1640
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							int_stack[++int_stack_size - 1] = LoginScreen.remember_username ? 1 : 0; // L: 1643
							return 1; // L: 1644
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1647
						} else if (var0 == 3146) {
							var11 = int_stack[--int_stack_size] == 1; // L: 1650
							if (var11 == LoginScreen.disable_music) { // L: 1651
								LoginScreen.disable_music = !var11; // L: 1652
								Client.current_renderer.save_preferences(Client.sign_link);
							}

							return 1; // L: 1655
						} else if (var0 == 3147) {
							int_stack[++int_stack_size - 1] = LoginScreen.disable_music ? 0 : 1; // L: 1658
							return 1; // L: 1659
						} else if (var0 == 3148) {
							return 1; // L: 1662
						} else if (var0 == 3149) {
							int_stack[++int_stack_size - 1] = 0; // L: 1665
							return 1; // L: 1666
						} else if (var0 == 3150) {
							int_stack[++int_stack_size - 1] = 0; // L: 1669
							return 1; // L: 1670
						} else if (var0 == 3151) {
							int_stack[++int_stack_size - 1] = 0; // L: 1673
							return 1; // L: 1674
						} else if (var0 == 3152) {
							int_stack[++int_stack_size - 1] = 0; // L: 1677
							return 1; // L: 1678
						} else if (var0 == 3153) {
							int_stack[++int_stack_size - 1] = TitleScreen.loading_percentage; // L: 1681
							return 1; // L: 1682
						} else if (var0 == 3154) {
							int_stack[++int_stack_size - 1] = Client.method7714(); // L: 1685
							return 1; // L: 1686
						} else if (var0 == 3155) {
							--string_stack_size; // L: 1689
							return 1; // L: 1690
						} else if (var0 == 3156) {
							return 1; // L: 1693
						} else if (var0 == 3157) {
							int_stack_size -= 2; // L: 1696
							return 1; // L: 1697
						} else if (var0 == 3158) {
							int_stack[++int_stack_size - 1] = 0; // L: 1700
							return 1; // L: 1701
						} else if (var0 == 3159) {
							int_stack[++int_stack_size - 1] = 0; // L: 1704
							return 1; // L: 1705
						} else if (var0 == 3160) {
							int_stack[++int_stack_size - 1] = 0; // L: 1708
							return 1; // L: 1709
						} else if (var0 == 3161) {
							--int_stack_size; // L: 1712
							int_stack[++int_stack_size - 1] = 0; // L: 1713
							return 1; // L: 1714
						} else if (var0 == 3162) {
							--int_stack_size; // L: 1717
							int_stack[++int_stack_size - 1] = 0; // L: 1718
							return 1; // L: 1719
						} else if (var0 == 3163) {
							--string_stack_size; // L: 1722
							int_stack[++int_stack_size - 1] = 0; // L: 1723
							return 1; // L: 1724
						} else if (var0 == 3164) {
							--int_stack_size; // L: 1727
							string_stack[++string_stack_size - 1] = ""; // L: 1728
							return 1; // L: 1729
						} else if (var0 == 3165) {
							--int_stack_size; // L: 1732
							int_stack[++int_stack_size - 1] = 0; // L: 1733
							return 1; // L: 1734
						} else if (var0 == 3166) {
							int_stack_size -= 2; // L: 1737
							int_stack[++int_stack_size - 1] = 0; // L: 1738
							return 1; // L: 1739
						} else if (var0 == 3167) {
							int_stack_size -= 2; // L: 1742
							int_stack[++int_stack_size - 1] = 0; // L: 1743
							return 1; // L: 1744
						} else if (var0 == 3168) {
							int_stack_size -= 2; // L: 1747
							string_stack[++string_stack_size - 1] = ""; // L: 1748
							string_stack[++string_stack_size - 1] = ""; // L: 1749
							string_stack[++string_stack_size - 1] = ""; // L: 1750
							string_stack[++string_stack_size - 1] = ""; // L: 1751
							string_stack[++string_stack_size - 1] = ""; // L: 1752
							string_stack[++string_stack_size - 1] = ""; // L: 1753
							string_stack[++string_stack_size - 1] = ""; // L: 1754
							string_stack[++string_stack_size - 1] = ""; // L: 1755
							string_stack[++string_stack_size - 1] = ""; // L: 1756
							return 1; // L: 1757
						} else if (var0 == 3169) {
							return 1; // L: 1760
						} else if (var0 == 3170) {
							int_stack[++int_stack_size - 1] = 0; // L: 1763
							return 1; // L: 1764
						} else if (var0 == 3171) {
							int_stack[++int_stack_size - 1] = 0; // L: 1767
							return 1; // L: 1768
						} else if (var0 == 3172) {
							--int_stack_size; // L: 1771
							return 1; // L: 1772
						} else if (var0 == 3173) {
							--int_stack_size; // L: 1775
							int_stack[++int_stack_size - 1] = 0; // L: 1776
							return 1; // L: 1777
						} else if (var0 == 3174) {
							--int_stack_size; // L: 1780
							return 1; // L: 1781
						} else if (var0 == 3175) {
							int_stack[++int_stack_size - 1] = 0; // L: 1784
							return 1; // L: 1785
						} else if (var0 == 3176) {
							return 1; // L: 1788
						} else if (var0 == 3177) {
							return 1; // L: 1791
						} else if (var0 == 3178) {
							--string_stack_size; // L: 1794
							return 1; // L: 1795
						} else if (var0 == 3179) {
							return 1; // L: 1798
						} else if (var0 == 3180) {
							--string_stack_size; // L: 1801
							return 1; // L: 1802
						} else if (var0 == 3181) {
							i_64_ = 100 - Math.min(Math.max(int_stack[--int_stack_size], 0), 100); // L: 1805
							// WidgetParent.method2142((double)(0.5F + (float)i_64_ / 200.0F)); // L: 1806
							return 1; // L: 1807
						} else if (var0 == 3182) {
							float var3 = ((float) Client.current_renderer.brightness - 0.5F) * 200.0F; // L: 1810
							int_stack[++int_stack_size - 1] = 100 - Math.round(var3); // L: 1811
							return 1; // L: 1812
						} else if (var0 != 3183 && var0 != 3184) {
							return 2; // L: 1818
						} else {
							--int_stack_size; // L: 1815
							return 1; // L: 1816
						}
					}
				}
			}
		}
	}

	static int under_2900(int var0, CS2Script var1, boolean var2) {
		Widget var3 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 1388
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1389
			int_stack[++int_stack_size - 1] = Widget.get_active_properties(var3).get_widget_flags(16693);
			return 1; // L: 1391
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1393
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1400
				if (var3.data_text == null) { // L: 1401
					string_stack[++string_stack_size - 1] = "";
				} else {
					string_stack[++string_stack_size - 1] = var3.data_text; // L: 1402
				}

				return 1; // L: 1403
			} else {
				return 2; // L: 1405
			}
		} else {
			int var4 = int_stack[--int_stack_size]; // L: 1394
			--var4; // L: 1395
			if (var3.if3_actions != null && var4 < var3.if3_actions.length && var3.if3_actions[var4] != null) { // L:
																												// 1396
				string_stack[++string_stack_size - 1] = var3.if3_actions[var4]; // L: 1397
			} else {
				string_stack[++string_stack_size - 1] = "";
			}

			return 1; // L: 1398
		}
	}

	static int under_2800(int var0, CS2Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1362
			var5 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 1363
			int_stack[++int_stack_size - 1] = var5.item_id; // L: 1364
			return 1; // L: 1365
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1367
			var5 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 1368
			if (var5.item_id != -1) { // L: 1369
				int_stack[++int_stack_size - 1] = var5.item_quantity;
			} else {
				int_stack[++int_stack_size - 1] = 0; // L: 1370
			}

			return 1; // L: 1371
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1373
			int var3 = int_stack[--int_stack_size]; // L: 1374
			WidgetParent var4 = (WidgetParent) Widget.get_widget_parents(193).get((long) var3); // L: 1375
			if (var4 != null) { // L: 1376
				int_stack[++int_stack_size - 1] = 1;
			} else {
				int_stack[++int_stack_size - 1] = 0; // L: 1377
			}

			return 1; // L: 1378
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1380
			int_stack[++int_stack_size - 1] = Widget.root_interface; // L: 1381
			return 1; // L: 1382
		} else {
			return 2; // L: 1384
		}
	}

	static int under_2700(int var0, CS2Script var1, boolean var2) {
		Widget var3 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 1293
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1294
			int_stack[++int_stack_size - 1] = var3.horizontal_scroll_position; // L: 1295
			return 1; // L: 1296
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1298
			int_stack[++int_stack_size - 1] = var3.vertical_scroll_position; // L: 1299
			return 1; // L: 1300
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1302
			string_stack[++string_stack_size - 1] = var3.text; // L: 1303
			return 1; // L: 1304
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1306
			int_stack[++int_stack_size - 1] = var3.scroll_width; // L: 1307
			return 1; // L: 1308
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1310
			int_stack[++int_stack_size - 1] = var3.scroll_height; // L: 1311
			return 1; // L: 1312
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1314
			int_stack[++int_stack_size - 1] = var3.model_zoom; // L: 1315
			return 1; // L: 1316
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1318
			int_stack[++int_stack_size - 1] = var3.model_rotation_x; // L: 1319
			return 1; // L: 1320
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1322
			int_stack[++int_stack_size - 1] = var3.model_rotation_z; // L: 1323
			return 1; // L: 1324
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1326
			int_stack[++int_stack_size - 1] = var3.model_rotation_y; // L: 1327
			return 1; // L: 1328
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1330
			int_stack[++int_stack_size - 1] = var3.top_transparency; // L: 1331
			return 1; // L: 1332
		} else if (var0 == 2610) { // L: 1334
			int_stack[++int_stack_size - 1] = var3.bottom_transparency; // L: 1335
			return 1; // L: 1336
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1338
			int_stack[++int_stack_size - 1] = var3.color; // L: 1339
			return 1; // L: 1340
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1342
			int_stack[++int_stack_size - 1] = var3.enabled_color; // L: 1343
			return 1; // L: 1344
		} else if (var0 == 2613) { // L: 1346
			int_stack[++int_stack_size - 1] = var3.fill_mode.rsOrdinal(); // L: 1347
			return 1; // L: 1348
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1350
			int_stack[++int_stack_size - 1] = var3.model_transparency ? 1 : 0; // L: 1351
			return 1; // L: 1352
		} else if (var0 != 2615 && var0 != 2616) { // L: 1354
			return 2; // L: 1358
		} else {
			++int_stack_size; // L: 1355
			return 1; // L: 1356
		}
	}

	static int under_2600(int var0, CS2Script var1, boolean var2) {
		Widget var3 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 1264
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1265
			int_stack[++int_stack_size - 1] = var3.x; // L: 1266
			return 1; // L: 1267
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1269
			int_stack[++int_stack_size - 1] = var3.y; // L: 1270
			return 1; // L: 1271
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1273
			int_stack[++int_stack_size - 1] = var3.screen_width; // L: 1274
			return 1; // L: 1275
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1277
			int_stack[++int_stack_size - 1] = var3.screen_height; // L: 1278
			return 1; // L: 1279
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1281
			int_stack[++int_stack_size - 1] = var3.hidden ? 1 : 0; // L: 1282
			return 1; // L: 1283
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1285
			int_stack[++int_stack_size - 1] = var3.parent_id; // L: 1286
			return 1; // L: 1287
		} else {
			return 2; // L: 1289
		}
	}

	static int under_2000(int var0, CS2Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1221
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1238
				var7 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 1239
				var4 = int_stack[--int_stack_size]; // L: 1240
				if (var4 >= 1 && var4 <= 10) { // L: 1241
					// class92 var8 = new class92(var4, var7.hash, var7.index, var7.item_id); // L:
					// 1244
					// ScriptExecutor.field817.add(var8); // L: 1245
					return 1; // L: 1246
				} else {
					throw new RuntimeException(); // L: 1242
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1248
				int_stack_size -= 3; // L: 1249
				int var3 = int_stack[int_stack_size]; // L: 1250
				var4 = int_stack[int_stack_size + 1]; // L: 1251
				int var5 = int_stack[int_stack_size + 2]; // L: 1252
				if (var5 >= 1 && var5 <= 10) { // L: 1253
					// class92 var6 = new class92(var5, var3, var4, Widget.get_widget(var3,
					// 193).item_id); // L: 1256
					// ScriptExecutor.field817.add(var6); // L: 1257
					return 1; // L: 1258
				} else {
					throw new RuntimeException(); // L: 1254
				}
			} else {
				return 2; // L: 1260
			}
		} else if (ScriptExecutor.script_io >= 10) { // L: 1222
			throw new RuntimeException(); // L: 1223
		} else {
			if (var0 >= 2000) { // L: 1226
				var7 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 1227
			} else {
				var7 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 1229
			}

			if (var7.on_resize_listener == null) { // L: 1230
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1231
				var9.source = var7; // L: 1232
				var9.params = var7.on_resize_listener; // L: 1233
				var9.script_io = ScriptExecutor.script_io + 1; // L: 1234
				Client.low_priority_script_events.push_head(var9); // L: 1235
				return 1; // L: 1236
			}
		}
	}

	static int under_1900(int var0, CS2Script var1, boolean var2) {
		Widget var3 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 1200
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1201
			int_stack[++int_stack_size - 1] = Widget.get_active_properties(var3).get_widget_flags(16693);
			return 1; // L: 1203
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1205
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1212
				if (var3.data_text == null) { // L: 1213
					string_stack[++string_stack_size - 1] = "";
				} else {
					string_stack[++string_stack_size - 1] = var3.data_text; // L: 1214
				}

				return 1; // L: 1215
			} else {
				return 2; // L: 1217
			}
		} else {
			int var4 = int_stack[--int_stack_size]; // L: 1206
			--var4; // L: 1207
			if (var3.if3_actions != null && var4 < var3.if3_actions.length && var3.if3_actions[var4] != null) { // L:
																												// 1208
				string_stack[++string_stack_size - 1] = var3.if3_actions[var4]; // L: 1209
			} else {
				string_stack[++string_stack_size - 1] = "";
			}

			return 1; // L: 1210
		}
	}

	static int under_1800(int var0, CS2Script var1, boolean var2) {
		Widget var3 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 1182
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1183
			int_stack[++int_stack_size - 1] = var3.item_id; // L: 1184
			return 1; // L: 1185
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1187
			if (var3.item_id != -1) { // L: 1188
				int_stack[++int_stack_size - 1] = var3.item_quantity;
			} else {
				int_stack[++int_stack_size - 1] = 0; // L: 1189
			}

			return 1; // L: 1190
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1192
			int_stack[++int_stack_size - 1] = var3.index; // L: 1193
			return 1; // L: 1194
		} else {
			return 2; // L: 1196
		}
	}

	static int under_1700(int var0, CS2Script var1, boolean var2) {
		Widget var3 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 1113
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1114
			int_stack[++int_stack_size - 1] = var3.horizontal_scroll_position; // L: 1115
			return 1; // L: 1116
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1118
			int_stack[++int_stack_size - 1] = var3.vertical_scroll_position; // L: 1119
			return 1; // L: 1120
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1122
			string_stack[++string_stack_size - 1] = var3.text; // L: 1123
			return 1; // L: 1124
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1126
			int_stack[++int_stack_size - 1] = var3.scroll_width; // L: 1127
			return 1; // L: 1128
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1130
			int_stack[++int_stack_size - 1] = var3.scroll_height; // L: 1131
			return 1; // L: 1132
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1134
			int_stack[++int_stack_size - 1] = var3.model_zoom; // L: 1135
			return 1; // L: 1136
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1138
			int_stack[++int_stack_size - 1] = var3.model_rotation_x; // L: 1139
			return 1; // L: 1140
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1142
			int_stack[++int_stack_size - 1] = var3.model_rotation_z; // L: 1143
			return 1; // L: 1144
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1146
			int_stack[++int_stack_size - 1] = var3.model_rotation_y; // L: 1147
			return 1; // L: 1148
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1150
			int_stack[++int_stack_size - 1] = var3.top_transparency; // L: 1151
			return 1; // L: 1152
		} else if (var0 == 1610) { // L: 1154
			int_stack[++int_stack_size - 1] = var3.bottom_transparency; // L: 1155
			return 1; // L: 1156
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1158
			int_stack[++int_stack_size - 1] = var3.color; // L: 1159
			return 1; // L: 1160
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1162
			int_stack[++int_stack_size - 1] = var3.enabled_color; // L: 1163
			return 1; // L: 1164
		} else if (var0 == 1613) { // L: 1166
			int_stack[++int_stack_size - 1] = var3.fill_mode.rsOrdinal(); // L: 1167
			return 1; // L: 1168
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1170
			int_stack[++int_stack_size - 1] = var3.model_transparency ? 1 : 0; // L: 1171
			return 1; // L: 1172
		} else if (var0 != 1615 && var0 != 1616) { // L: 1174
			return 2; // L: 1178
		} else {
			++int_stack_size; // L: 1175
			return 1; // L: 1176
		}
	}

	static int under_1600(int var0, CS2Script var1, boolean var2) {
		Widget var3 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 1084
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1085
			int_stack[++int_stack_size - 1] = var3.x; // L: 1086
			return 1; // L: 1087
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1089
			int_stack[++int_stack_size - 1] = var3.y; // L: 1090
			return 1; // L: 1091
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1093
			int_stack[++int_stack_size - 1] = var3.screen_width; // L: 1094
			return 1; // L: 1095
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1097
			int_stack[++int_stack_size - 1] = var3.screen_height; // L: 1098
			return 1; // L: 1099
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1101
			int_stack[++int_stack_size - 1] = var3.hidden ? 1 : 0; // L: 1102
			return 1; // L: 1103
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1105
			int_stack[++int_stack_size - 1] = var3.parent_id; // L: 1106
			return 1; // L: 1107
		} else {
			return 2; // L: 1109
		}
	}

	static int under_1500(int var0, CS2Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1015
			var0 -= 1000; // L: 1016
			var3 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 1017
		} else {
			var3 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 1019
		}

		String var4 = string_stack[--string_stack_size]; // L: 1020
		int[] triggers = null; // L: 1021
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1022
			int var6 = int_stack[--int_stack_size]; // L: 1023
			if (var6 > 0) { // L: 1024
				for (triggers = new int[var6]; var6-- > 0; triggers[var6] = int_stack[--int_stack_size]) { // L: 1025
																											// 1026
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1028
		}

		Object[] listener_values = new Object[var4.length() + 1]; // L: 1030

		int var7;
		for (var7 = listener_values.length - 1; var7 >= 1; --var7) { // L: 1031
			if (var4.charAt(var7 - 1) == 's') { // L: 1032
				listener_values[var7] = string_stack[--string_stack_size];
			} else {
				listener_values[var7] = new Integer(int_stack[--int_stack_size]); // L: 1033
			}
		}

		var7 = int_stack[--int_stack_size]; // L: 1035
		if (var7 != -1) { // L: 1036
			listener_values[0] = new Integer(var7);
		} else {
			listener_values = null; // L: 1037
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.on_click_listener = listener_values; // L: 1038
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1039
			var3.on_hold_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1040
			var3.on_release_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1041
			var3.on_mouse_over_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1042
			var3.on_mouse_leave_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1043
			var3.on_drag_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1044
			var3.on_target_leave_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1045
			var3.on_varp_update_listener = listener_values; // L: 1046
			var3.varp_listener_triggers = triggers; // L: 1047
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1049
			var3.on_loop_cycle_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1050
			var3.on_option_click_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1051
			var3.on_drag_complete_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1052
			var3.on_click_repeat_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1053
			var3.on_mouse_repeat_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1054
			var3.on_inventory_update_listener = listener_values; // L: 1055
			var3.inventory_listener_triggers = triggers; // L: 1056
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1058
			var3.skill_listener_triggers = listener_values; // L: 1059
			var3.on_skill_update_listener = triggers; // L: 1060
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1062
			var3.on_target_enter_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1063
			var3.on_mouse_wheel_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1064
			var3.on_game_message_received = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1065
			var3.key_pressed_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1066
			var3.private_chat_update_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1067
			var3.on_clan_chat_update_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1068
			var3.misc_information_update_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1069
			var3.on_dialog_abort_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1070
			var3.on_interface_overriding_update = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1071
			var3.on_stock_update_listener = listener_values;
		} else if (var0 == 1426) { // L: 1072
			var3.on_camera_finish = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1073
			var3.on_resize_listener = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1074
			var3.field3217 = listener_values;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1075
			var3.field3340 = listener_values;
		} else if (var0 == 1430) {
			var3.field3335 = listener_values; // L: 1076
		} else {
			if (var0 != 1431) { // L: 1077
				return 2; // L: 1078
			}

			var3.field3336 = listener_values;
		}

		var3.has_listener = true; // L: 1079
		return 1; // L: 1080
	}

	static int under_1400(int var0, CS2Script var1, boolean var2) {
		boolean var3 = true; // L: 842
		Widget var4;
		if (var0 >= 2000) { // L: 844
			var0 -= 1000; // L: 845
			var4 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 846
			var3 = false; // L: 847
		} else {
			var4 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 849
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 850
			var11 = int_stack[--int_stack_size] - 1; // L: 851
			if (var11 >= 0 && var11 <= 9) { // L: 852
				var4.set_if3_action(string_stack[--string_stack_size], var11); // L: 856
				return 1; // L: 857
			} else {
				--string_stack_size; // L: 853
				return 1; // L: 854
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 859
				int_stack_size -= 2; // L: 860
				var11 = int_stack[int_stack_size]; // L: 861
				var6 = int_stack[int_stack_size + 1]; // L: 862
				var4.parent = Widget.get_component(var11, var6, 193); // L: 863
				return 1; // L: 864
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 866
				var4.has_scroll_bar = int_stack[--int_stack_size] == 1; // L: 867
				return 1; // L: 868
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 870
				var4.drag_zone_size = int_stack[--int_stack_size]; // L: 871
				return 1; // L: 872
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 874
				var4.drag_threshhold = int_stack[--int_stack_size]; // L: 875
				return 1; // L: 876
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 878
				var4.data_text = string_stack[--string_stack_size]; // L: 879
				return 1; // L: 880
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 882
				var4.selected_action_name = string_stack[--string_stack_size]; // L: 883
				return 1; // L: 884
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 886
				var4.if3_actions = null; // L: 887
				return 1; // L: 888
			} else if (var0 == 1308) { // L: 890
				var4.prioritize_menu_entry = int_stack[--int_stack_size] == 1; // L: 891
				return 1; // L: 892
			} else if (var0 == 1309) { // L: 894
				--int_stack_size; // L: 895
				return 1; // L: 896
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 898
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 928
						int_stack_size -= 2; // L: 929
						var5 = 10; // L: 930
						var8 = new byte[] { (byte) int_stack[int_stack_size] }; // L: 931
						byte[] var9 = new byte[] { (byte) int_stack[int_stack_size + 1] }; // L: 932
						Widget.set_key(var4, var5, var8, var9); // L: 933
						return 1; // L: 934
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 936
						int_stack_size -= 3; // L: 937
						var11 = int_stack[int_stack_size] - 1; // L: 938
						var6 = int_stack[int_stack_size + 1]; // L: 939
						var7 = int_stack[int_stack_size + 2]; // L: 940
						if (var11 >= 0 && var11 <= 9) { // L: 941
							Widget.set_key_rate(var4, var11, var6, var7); // L: 944
							return 1; // L: 945
						} else {
							throw new RuntimeException(); // L: 942
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 947
						var5 = 10; // L: 948
						var6 = int_stack[--int_stack_size]; // L: 949
						var7 = int_stack[--int_stack_size]; // L: 950
						Widget.set_key_rate(var4, var5, var6, var7); // L: 951
						return 1; // L: 952
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 954
						--int_stack_size; // L: 955
						var11 = int_stack[int_stack_size] - 1; // L: 956
						if (var11 >= 0 && var11 <= 9) { // L: 957
							Widget.set_key_ignore_held(var4, var11); // L: 960
							return 1; // L: 961
						} else {
							throw new RuntimeException(); // L: 958
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 963
						var5 = 10; // L: 964
						Widget.set_key_ignore_held(var4, var5); // L: 965
						return 1; // L: 966
					} else {
						return 2; // L: 968
					}
				} else {
					byte[] var10 = null; // L: 899
					var8 = null; // L: 900
					if (var3) { // L: 901
						int_stack_size -= 10; // L: 902

						for (var7 = 0; var7 < 10 && int_stack[var7 + int_stack_size] >= 0; var7 += 2) { // L: 904 905
						}

						if (var7 > 0) { // L: 907
							var10 = new byte[var7 / 2]; // L: 908
							var8 = new byte[var7 / 2]; // L: 909

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 910
								var10[var7 / 2] = (byte) int_stack[var7 + int_stack_size]; // L: 911
								var8[var7 / 2] = (byte) int_stack[var7 + int_stack_size + 1]; // L: 912
							}
						}
					} else {
						int_stack_size -= 2; // L: 917
						var10 = new byte[] { (byte) int_stack[int_stack_size] }; // L: 918
						var8 = new byte[] { (byte) int_stack[int_stack_size + 1] }; // L: 919
					}

					var7 = int_stack[--int_stack_size] - 1; // L: 921
					if (var7 >= 0 && var7 <= 9) { // L: 922
						Widget.set_key(var4, var7, var10, var8); // L: 925
						return 1; // L: 926
					} else {
						throw new RuntimeException(); // L: 923
					}
				}
			}
		}
	}

	static int under_1300(int var0, CS2Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 802
			var0 -= 1000; // L: 803
			var3 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 804
		} else {
			var3 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 806
		}

		Widget.redraw_widget(var3); // L: 807
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM
				&& var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 808
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 828
				var3.model_type = 2; // L: 829
				var3.model_id = int_stack[--int_stack_size]; // L: 830
				return 1; // L: 831
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 833
				var3.model_type = 3; // L: 834
				var3.model_id = Client.local_player.appearance.getChatHeadId(); // L: 835
				return 1; // L: 836
			} else {
				return 2; // L: 838
			}
		} else {
			int_stack_size -= 2; // L: 809
			int var4 = int_stack[int_stack_size]; // L: 810
			int var5 = int_stack[int_stack_size + 1]; // L: 811
			var3.item_id = var4; // L: 812
			var3.item_quantity = var5; // L: 813
			ObjType var6 = MapRegion.aClass191_3663.list(22883, var4, Revision.OSRS);
			var3.model_rotation_x = var6.xan2d; // L: 815
			var3.model_rotation_y = var6.yan2d; // L: 816
			var3.model_rotation_z = var6.zan2d; // L: 817
			var3.translate_x = var6.offsetX2d; // L: 818
			var3.translate_y = var6.offsetY2d; // L: 819
			var3.model_zoom = var6.zoom2d; // L: 820
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.item_quantity_mode = 0; // L: 821
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.stackability) { // L: 822
				var3.item_quantity_mode = 1;
			} else {
				var3.item_quantity_mode = 2; // L: 823
			}

			if (var3.dynamic_width > 0) { // L: 824
				var3.model_zoom = var3.model_zoom * 32 / var3.dynamic_width;
			} else if (var3.original_width > 0) { // L: 825
				var3.model_zoom = var3.model_zoom * 32 / var3.original_width;
			}

			return 1; // L: 826
		}
	}

	private static int under_1100(int opcode, CS2Script script, boolean flag) {
		int var3 = -1;
		Widget var4;
		if (opcode >= 2000) {
			opcode -= 1000;
			var4 = Widget.get_widget(CS2Script.int_stack[--CS2Script.int_stack_size], 193);
		} else {
			var4 = flag ? Widget.static_active_component1 : Widget.static_active_component2;
		}
		if (opcode == ScriptOpcodes.CC_SETPOSITION) { // L: 571
			int_stack_size -= 4; // L: 572
			var4.original_x = int_stack[int_stack_size]; // L: 573
			var4.original_y = int_stack[int_stack_size + 1]; // L: 574
			var4.alignment_x = int_stack[int_stack_size + 2]; // L: 575
			var4.alignment_y = int_stack[int_stack_size + 3]; // L: 576
			Widget.redraw_widget(var4); // L: 577
			Widget.update_dynamic_components(var4); // L: 578
			if (var3 != -1 && var4.type == 0) { // L: 579
				Widget.update_layer(Widget.get_widget_cache(193)[var3 >> 16], var4, false);
			}

			return 1; // L: 580
		} else if (opcode == ScriptOpcodes.CC_SETSIZE) { // L: 582
			int_stack_size -= 4; // L: 583
			var4.original_width = int_stack[int_stack_size]; // L: 584
			var4.original_height = int_stack[int_stack_size + 1]; // L: 585
			var4.horizontal_alignment = int_stack[int_stack_size + 2]; // L: 586
			var4.vertical_alignment = int_stack[int_stack_size + 3]; // L: 587
			Widget.redraw_widget(var4); // L: 588
			Widget.update_dynamic_components(var4); // L: 589
			if (var3 != -1 && var4.type == 0) { // L: 590
				Widget.update_layer(Widget.get_widget_cache(193)[var3 >> 16], var4, false);
			}

			return 1; // L: 591
		} else if (opcode == ScriptOpcodes.CC_SETHIDE) { // L: 593
			boolean var5 = int_stack[--int_stack_size] == 1; // L: 594
			if (var5 != var4.hidden) { // L: 595
				var4.hidden = var5; // L: 596
				Widget.redraw_widget(var4); // L: 597
			}

			return 1; // L: 599
		} else if (opcode == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 601
			var4.no_click_through = int_stack[--int_stack_size] == 1; // L: 602
			return 1; // L: 603
		} else if (opcode == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 605
			var4.no_scroll_through = int_stack[--int_stack_size] == 1; // L: 606
			return 1; // L: 607
		} else {
			return 2; // L: 609
		}
	}

	static int under_1000(int var0, CS2Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 480
			int_stack_size -= 3; // L: 481
			var9 = int_stack[int_stack_size]; // L: 482
			var4 = int_stack[int_stack_size + 1]; // L: 483
			int var11 = int_stack[int_stack_size + 2]; // L: 484
			if (var4 == 0) { // L: 485
				throw new RuntimeException(); // L: 486
			} else {
				Widget var6 = Widget.get_widget(var9, 193); // L: 488
				if (var6.components == null) { // L: 489
					var6.components = new Widget[var11 + 1];
				}

				if (var6.components.length <= var11) { // L: 490
					Widget[] var7 = new Widget[var11 + 1]; // L: 491

					for (int var8 = 0; var8 < var6.components.length; ++var8) { // L: 492
						var7[var8] = var6.components[var8];
					}

					var6.components = var7; // L: 493
				}

				if (var11 > 0 && var6.components[var11 - 1] == null) { // L: 495
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 496
					var12.type = var4; // L: 497
					var12.parent_id = var12.hash = var6.hash; // L: 498
					var12.index = var11; // L: 499
					var12.if3_format = true; // L: 500
					var6.components[var11] = var12; // L: 501
					if (var2) { // L: 502
						Widget.static_active_component1 = var12;
					} else {
						Widget.static_active_component2 = var12; // L: 503
					}

					Widget.redraw_widget(var6); // L: 504
					return 1; // L: 505
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 507
				var3 = var2 ? Widget.static_active_component1 : Widget.static_active_component2; // L: 508
				Widget var10 = Widget.get_widget(var3.hash, 193); // L: 509
				var10.components[var3.index] = null; // L: 510
				Widget.redraw_widget(var10); // L: 511
				return 1; // L: 512
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 514
				var3 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 515
				var3.components = null; // L: 516
				Widget.redraw_widget(var3); // L: 517
				return 1; // L: 518
			} else if (var0 == 103) { // L: 520
				int_stack_size -= 3; // L: 521
				return 1; // L: 522
			} else if (var0 == 104) { // L: 524
				--int_stack_size; // L: 525
				return 1; // L: 526
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 528
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 541
					var3 = Widget.get_widget(int_stack[--int_stack_size], 193); // L: 542
					if (var3 != null) { // L: 543
						int_stack[++int_stack_size - 1] = 1; // L: 544
						if (var2) { // L: 545
							Widget.static_active_component1 = var3;
						} else {
							Widget.static_active_component2 = var3; // L: 546
						}
					} else {
						int_stack[++int_stack_size - 1] = 0; // L: 548
					}

					return 1; // L: 549
				} else if (var0 == 202) { // L: 551
					int_stack[int_stack_size + 1] = 0; // L: 552
					return 1; // L: 553
				} else if (var0 == 203) { // L: 555
					int_stack[--int_stack_size + 1] = 0; // L: 556
					return 1; // L: 557
				} else {
					return 2; // L: 559
				}
			} else {
				int_stack_size -= 2; // L: 529
				var9 = int_stack[int_stack_size]; // L: 530
				var4 = int_stack[int_stack_size + 1]; // L: 531
				Widget var5 = Widget.get_component(var9, var4, 193); // L: 532
				if (var5 != null && var4 != -1) { // L: 533
					int_stack[++int_stack_size - 1] = 1; // L: 534
					if (var2) { // L: 535
						Widget.static_active_component1 = var5;
					} else {
						Widget.static_active_component2 = var5; // L: 536
					}
				} else {
					int_stack[++int_stack_size - 1] = 0; // L: 538
				}

				return 1; // L: 539
			}
		}
	}

	IterableNodeHashTable[] newSwitchTable(int var1) {
		return new IterableNodeHashTable[var1];
	}
}
