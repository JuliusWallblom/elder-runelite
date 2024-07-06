package io;

final class Class_cs extends Class246_Sub28_Sub5 {
	static int anInt7143;
	static int anInt7144;
	static int anInt7145;
	static AbstractSprite[] aClass_lArray7146;
	static int anInt7147;

	final int[][] method2139(byte i, int i_0_) {
		try {
			anInt7144++;
			int[][] is = ((TextureOperation) this).aClass136_4933.method922((byte) 94, i_0_);
			if (((Class136) ((TextureOperation) this).aClass136_4933).aBool1946 && this.method2544(-1121128860)) {
				int[] is_1_ = is[0];
				int[] is_2_ = is[1];
				int[] is_3_ = is[2];
				int i_4_ = (((Class246_Sub28_Sub5) this).anInt6005 * (i_0_ % ((Class246_Sub28_Sub5) this).anInt6005));
				for (int i_5_ = 0; Class246_Sub37_Sub1.f_gb > i_5_; i_5_++) {
					int i_6_ = (((Class246_Sub28_Sub5) this).pixels[i_4_
							+ i_5_ % (((Class246_Sub28_Sub5) this).anInt5997)]);
					is_3_[i_5_] = PacketsDecoder.method184(i_6_ << 4, 4080);
					is_2_[i_5_] = PacketsDecoder.method184(i_6_, 65280) >> 4;
					is_1_[i_5_] = PacketsDecoder.method184(i_6_ >> 12, 4080);
				}
			}
			if (i < 33)
				anInt7145 = -102;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cs.J(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method2920(boolean bool) {
		do {
			try {
				aClass_lArray7146 = null;
				if (bool == true)
					break;
				method2921(89, -13, 30, 99, -18, 64, -91, 8, -57, -49, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "cs.D(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method2921(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_,
			int i_14_, int i_15_, Widget widget) {
		try {
			anInt7147++;
			if (Widget.load_widget(i_9_, widget == null ? 634 : widget.revision, 7)) {
				if (i_10_ != 29474)
					anInt7145 = -20;

				if (i_9_ > Widget.get_some_widgets(widget == null ? 634 : widget.revision).length - 1) {
					return;
				}
				if (Widget.get_some_widgets(widget == null ? 634 : widget.revision)[i_9_] == null) {
					Client.render_widget(Widget.get_widget_cache(widget == null ? 634 : widget.revision)[i_9_], -1, i,
							i_11_, i_8_, i_13_, i_12_, i_7_, i_15_, i_14_);
				} else {
					Client.render_widget(Widget.get_some_widgets(widget == null ? 634 : widget.revision)[i_9_], -1, i,
							i_11_, i_8_, i_13_, i_12_, i_7_, i_15_, i_14_);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Class_cs() {
		/* empty */
	}
}
