package io;

final class Class246_Sub36 extends Node {
	private int anInt5242;
	int anInt5243;
	private static int[] animatedPixels;
	int anInt5245;
	private int[] pixels;
	boolean aBool5247;

	final void animateTexture(int direction, int speed, boolean osrs) {
		if (osrs) {
			if (this.pixels != null) { // L: 113
				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int[] var10;
				if (direction == 1 || direction == 3) { // L: 114
					if (animatedPixels == null || animatedPixels.length < this.pixels.length) { // L: 115
						animatedPixels = new int[this.pixels.length];
					}

					var3 = this.pixels.length; // L: 119
					var4 = speed * anInt5242; // L: 120
					var5 = var3 - 1; // L: 121
					if (direction == 1) { // L: 122
						var4 = -var4;
					}

					for (var6 = 0; var6 < var3; ++var6) { // L: 123
						var7 = var6 + var4 & var5; // L: 124
						animatedPixels[var6] = this.pixels[var7]; // L: 125
					}

					var10 = this.pixels; // L: 127
					this.pixels = animatedPixels; // L: 128
					animatedPixels = var10; // L: 129
				}

				if (direction == 2 || direction == 4) { // L: 131
					if (animatedPixels == null || animatedPixels.length < this.pixels.length) { // L: 132
						animatedPixels = new int[this.pixels.length];
					}

					var3 = this.pixels.length; // L: 136
					var4 = speed * anInt5242; // L: 137
					var5 = anInt5242 - 1; // L: 138
					if (direction == 2) { // L: 139
						var4 = -var4;
					}

					for (var6 = 0; var6 < var3; var6 += anInt5242) { // L: 140
						for (var7 = 0; var7 < anInt5242; ++var7) { // L: 141
							int var8 = var6 + var7; // L: 142
							int var9 = var6 + (var7 + var4 & var5); // L: 143
							animatedPixels[var8] = this.pixels[var9]; // L: 144
						}
					}

					var10 = this.pixels; // L: 147
					this.pixels = animatedPixels; // L: 148
					animatedPixels = var10; // L: 149
				}
			}
		} else {
			if (direction != 0 || speed != 0) {
				if (animatedPixels == null || animatedPixels.length < pixels.length)
					animatedPixels = new int[pixels.length];
				int i_1_ = pixels.length;
				int i_2_ = direction;
				int i_3_ = anInt5242 - 1;
				int i_4_ = anInt5242 * speed;
				int i_5_ = i_1_ - 1;
				for (int i_6_ = 0; i_6_ < i_1_; i_6_ += anInt5242) {
					int i_7_ = i_6_ + i_4_ & i_5_;
					for (int i_8_ = 0; i_8_ < anInt5242; i_8_++) {
						int i_9_ = i_6_ + i_8_;
						int i_10_ = i_7_ + (i_8_ + i_2_ & i_3_);
						animatedPixels[i_9_] = pixels[i_10_];
					}
				}
				int[] is = pixels;
				pixels = animatedPixels;
				animatedPixels = is;
			}
		}
	}

	public static void method2223() {
		animatedPixels = null;
	}

	final int[] method2224() {
		return pixels;
	}

	Class246_Sub36(int i, int i_11_, int[] is, boolean bool) {
		try {
			((Class246_Sub36) this).anInt5243 = i;
			anInt5242 = i_11_;
			pixels = is;
			if (bool) {
				int[] is_12_ = new int[anInt5242];
				int[] is_13_ = new int[anInt5242];
				int[] is_14_ = new int[anInt5242];
				if (animatedPixels == null || animatedPixels.length < pixels.length)
					animatedPixels = new int[pixels.length];
				int i_15_ = anInt5242;
				int i_16_ = anInt5242;
				int i_17_ = i_15_ - 1;
				int i_18_ = i_16_ - 1;
				int i_19_ = i_15_ * i_16_;
				int i_21_;
				int i_20_ = i_21_ = i_15_;
				for (int i_22_ = 2; i_22_ >= 0; i_22_--) {
					for (int i_23_ = i_17_; i_23_ >= 0; i_23_--) {
						int i_24_ = pixels[--i_21_];
						is_12_[i_23_] += i_24_ >> 16 & 0xff;
						is_13_[i_23_] += i_24_ >> 8 & 0xff;
						is_14_[i_23_] += i_24_ & 0xff;
					}
					if (i_21_ == 0)
						i_21_ = i_19_;
				}
				int i_25_ = i_19_;
				for (int i_26_ = i_18_; i_26_ >= 0; i_26_--) {
					int i_27_ = 1;
					int i_28_ = 1;
					int i_30_;
					int i_31_;
					int i_29_ = i_30_ = i_31_ = 0;
					for (int i_32_ = 2; i_32_ >= 0; i_32_--) {
						i_28_--;
						i_29_ += is_12_[i_28_];
						i_31_ += is_13_[i_28_];
						i_30_ += is_14_[i_28_];
						if (i_28_ == 0)
							i_28_ = i_15_;
					}
					for (int i_33_ = i_17_; i_33_ >= 0; i_33_--) {
						i_28_--;
						i_27_--;
						int i_34_ = i_29_ / 9;
						int i_35_ = i_31_ / 9;
						int i_36_ = i_30_ / 9;
						animatedPixels[--i_25_] = i_34_ << 16 | i_35_ << 8 | i_36_;
						i_29_ += is_12_[i_28_] - is_12_[i_27_];
						i_30_ += is_14_[i_28_] - is_14_[i_27_];
						i_31_ += is_13_[i_28_] - is_13_[i_27_];
						if (i_28_ == 0)
							i_28_ = i_15_;
						if (i_27_ == 0)
							i_27_ = i_15_;
					}
					for (int i_37_ = i_17_; i_37_ >= 0; i_37_--) {
						int i_38_ = pixels[--i_21_];
						int i_39_ = pixels[--i_20_];
						is_12_[i_37_] += (i_38_ >> 16 & 0xff) - (i_39_ >> 16 & 0xff);
						is_13_[i_37_] += (i_38_ >> 8 & 0xff) - (i_39_ >> 8 & 0xff);
						is_14_[i_37_] += (i_38_ & 0xff) - (i_39_ & 0xff);
					}
					if (i_21_ == 0)
						i_21_ = i_19_;
					if (i_20_ == 0)
						i_20_ = i_19_;
				}
				int[] is_40_ = pixels;
				pixels = animatedPixels;
				animatedPixels = is_40_;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
