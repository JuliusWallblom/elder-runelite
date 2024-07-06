package io;

final class Class50 {
	static float aFloat708;
	static int anInt709;
	static int anInt710;
	private CacheIndex aClass_fs711;
	private CacheIndex aClass_fs712;
	static int anInt713;
	private HashMap aClass54_714 = new HashMap(64);
	static int anInt715;

	final Class246_Sub1_Sub16 method329(int i, byte i_5_) {
		try {
			anInt713++;
			int i_6_ = -109 % ((i_5_ - 20) / 55);
			Class246_Sub1_Sub16 class246_sub1_sub16 = ((Class246_Sub1_Sub16) aClass54_714.method379((long) i,
					(byte) 58));
			if (class246_sub1_sub16 != null)
				return class246_sub1_sub16;
			byte[] is;
			do {
				if (i < 32768) {
					is = aClass_fs712.get_file(i, 0);
					if (!Client.f_ob)
						break;
				}
				is = aClass_fs711.get_file(i & 0x7fff, 0);
			} while (false);
			class246_sub1_sub16 = new Class246_Sub1_Sub16();
			if (is != null)
				class246_sub1_sub16.method2748(new Buffer(is), -48);
			if (i >= 32768)
				class246_sub1_sub16.method2745((byte) 51);
			aClass54_714.method371(1, (long) i, class246_sub1_sub16);
			return class246_sub1_sub16;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ek.C(" + i + ',' + i_5_ + ')');
		}
	}

	static final void method330(int i, int i_7_) {
		try {
			anInt715++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 117, 3);
			int i_8_ = 87 / ((i_7_ + 54) / 52);
			class246_sub1_sub10.method2604((byte) -74);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ek.D(" + i + ',' + i_7_ + ')');
		}
	}

	static final Class246_Sub1_Sub5 method331(int i, int i_9_, CacheIndex class_fs, int i_10_) {
		try {
			anInt710++;
			Buffer stream = new Buffer(class_fs.get_file(i_9_, i));
			Class246_Sub1_Sub5 class246_sub1_sub5 = new Class246_Sub1_Sub5(i_9_, stream.readString((byte) -40),
					stream.readString((byte) -40), stream.readInt((byte) 119), stream.readInt((byte) 110),
					((stream.readUnsignedByte() ^ 0xffffffff) == -2), stream.readUnsignedByte(),
					stream.readUnsignedByte());
			int i_11_ = stream.readUnsignedByte();
			for (int i_12_ = i_10_; i_11_ > i_12_; i_12_++)
				((Class246_Sub1_Sub5) class246_sub1_sub5).aClass166_5843.push_head(new Class246_Sub38(
						stream.readUnsignedByte(), stream.readUnsignedShort(), stream.readUnsignedShort(),
						stream.readUnsignedShort(), stream.readUnsignedShort(), stream.readUnsignedShort(),
						stream.readUnsignedShort(), stream.readUnsignedShort(), stream.readUnsignedShort()));
			class246_sub1_sub5.method2469((byte) -83);
			return class246_sub1_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("ek.A(" + i + ',' + i_9_ + ',' + (class_fs != null ? "{...}" : "null") + ',' + i_10_ + ')'));
		}
	}

	static final void method332(SceneGraph class260, int i, int i_13_, Class_c class_c, int i_14_, int i_15_, int i_16_,
			byte[][][] is, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, int i_22_, byte i_23_,
			int i_24_, int i_25_, boolean bool) {
		Class259_Sub3.aClass260_5357 = class260;
		Class38_Sub1_Sub1.anInt6768 = i;
		MapFunction.aClass_c2007 = class_c;
		Class246_Sub28_Sub25.aBool6705 = Class259_Sub3.aClass260_5357.method1701() > 0;
		Class244.anInt3454 = i_14_ >> Class126.anInt1781;
		Class59_Sub2_Sub2.anInt6025 = i_16_ >> Class126.anInt1781;
		Class246_Sub1_Sub10.anInt6199 = i_14_;
		Class111.anInt1576 = i_16_;
		Class246_Sub28_Sub20.anInt6573 = i_15_;
		Class56.anInt796 = Class244.anInt3454 - Class125.anInt1777;
		if (Class56.anInt796 < 0) {
			Class130_Sub8.anInt5615 = -Class56.anInt796;
			Class56.anInt796 = 0;
		} else
			Class130_Sub8.anInt5615 = 0;
		Class133.anInt1834 = Class59_Sub2_Sub2.anInt6025 - Class125.anInt1777;
		if (Class133.anInt1834 < 0) {
			Class_cs.anInt7143 = -Class133.anInt1834;
			Class133.anInt1834 = 0;
		} else
			Class_cs.anInt7143 = 0;
		Class188.anInt2662 = Class244.anInt3454 + Class125.anInt1777;
		if (Class188.anInt2662 > Class240.xSize)
			Class188.anInt2662 = Class240.xSize;
		Class246_Sub1_Sub10.f_db = Class59_Sub2_Sub2.anInt6025 + Class125.anInt1777;
		if (Class246_Sub1_Sub10.f_db > HDModel.ySize)
			Class246_Sub1_Sub10.f_db = HDModel.ySize;
		for (int i_26_ = 0; i_26_ < Class125.anInt1777 + Class125.anInt1777 + 2; i_26_++) {
			for (int i_27_ = 0; i_27_ < Class125.anInt1777 + Class125.anInt1777 + 2; i_27_++) {
				int i_28_ = Class244.anInt3454 - Class125.anInt1777 + i_26_;
				int i_29_ = Class59_Sub2_Sub2.anInt6025 - Class125.anInt1777 + i_27_;
				if (i_28_ >= 0 && i_29_ >= 0 && i_28_ < Class240.xSize && i_29_ < HDModel.ySize) {
					int i_30_ = i_28_ << Class126.anInt1781;
					int i_31_ = i_29_ << Class126.anInt1781;
					int i_32_ = (Class246_Sub28_Sub3.aClass210Array5899[(Class246_Sub28_Sub3.aClass210Array5899.length
							- 1)].l(i_28_, i_29_) - (1000 << Class126.anInt1781 - 7));
					int i_33_ = (Class154.aClass210Array2215 != null
							? (Class154.aClass210Array2215[0].l(i_28_, i_29_) + NodeSub.anInt3744)
							: Class246_Sub28_Sub3.aClass210Array5899[0].l(i_28_, i_29_) + NodeSub.anInt3744);
					Class251.aBoolArrayArray3556[i_26_][i_27_] = Class259_Sub3.aClass260_5357.JA(i_30_, i_32_, i_31_,
							i_30_, i_33_, i_31_);
				} else
					Class251.aBoolArrayArray3556[i_26_][i_27_] = false;
			}
		}
		for (int i_34_ = 0; i_34_ < Class125.anInt1777 + Class125.anInt1777 + 1; i_34_++) {
			for (int i_35_ = 0; i_35_ < Class125.anInt1777 + Class125.anInt1777 + 1; i_35_++)
				Class187_Sub1.aBoolArrayArray4866[i_34_][i_35_] = (Class251.aBoolArrayArray3556[i_34_][i_35_]
						|| Class251.aBoolArrayArray3556[i_34_ + 1][i_35_]
						|| Class251.aBoolArrayArray3556[i_34_][i_35_ + 1]
						|| Class251.aBoolArrayArray3556[i_34_ + 1][i_35_ + 1]);
		}
		Class59_Sub2_Sub1.anIntArray5784 = is_17_;
		InputStream_Sub1.anIntArray4828 = is_18_;
		Class246_Sub28_Sub4.anIntArray5978 = is_19_;
		Class59_Sub3_Sub2.anIntArray5885 = is_20_;
		Player.f_vd = is_21_;
		SceneGraph.method1733();
		Class246_Sub1_Sub8_Sub1.method2924(2);
		for (Class130_Sub3 class130_sub3 = (Class130_Sub3) Class246_Sub2.aClass68_3814
				.method445(62); class130_sub3 != null; class130_sub3 = (Class130_Sub3) Class246_Sub2.aClass68_3814
						.method442((byte) -61)) {
			class130_sub3.method886(1024);
			Class59_Sub5_Sub1.method2462(class130_sub3, -201);
		}
		if (Class246_Sub28_Sub25.aBool6705) {
			for (int i_36_ = 0; i_36_ < Class_c.anInt1195; i_36_++)
				StructLoader.aClass174Array811[i_36_].method1143(i, bool, 104);
		}
		if (i_13_ > 1) {
			Class259_Sub3.aClass260_5357.method1744(0);
			if (Class245.aClass106_3462 == null || Class245.aClass106_3462 instanceof Class106_Sub2)
				Class245.aClass106_3462 = new Class106_Sub1();
		} else if (Class245.aClass106_3462 == null || Class245.aClass106_3462 instanceof Class106_Sub1)
			Class245.aClass106_3462 = new Class106_Sub2();
		Class245.aClass106_3462.method722(i_13_, 5000);
		Class245.aClass106_3462.method721(5000);
		if (Class1.aClass147ArrayArrayArray4 != null) {
			Class47.method317(true);
			Class245.aClass106_3462.method724((byte) -122, 22);
			Class59_Sub3.method2170(i_13_, null, 0, (byte) 0, i_24_, i_25_);
			Class245.aClass106_3462.method721(5000);
			Class245.aClass106_3462.method724((byte) -117, 23);
			Class47.method317(false);
		}
		Class59_Sub3.method2170(i_13_, is, i_22_, i_23_, i_24_, i_25_);
		Class245.aClass106_3462.method721(5000);
		Class245.aClass106_3462.method720(-125);
		Class245.aClass106_3462.method721(5000);
		if (i_13_ > 1)
			Class259_Sub3.aClass260_5357.method1714(0);
		Class259_Sub3.aClass260_5357.method1679(0, null);
	}

	Class50(int i, CacheIndex class_fs, CacheIndex class_fs_37_) {
		do {
			try {
				aClass_fs712 = class_fs;
				aClass_fs711 = class_fs_37_;
				if (aClass_fs712 != null)
					aClass_fs712.child_count(0);
				if (aClass_fs711 == null)
					break;
				aClass_fs711.child_count(0);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("ek.<init>(" + i + ',' + (class_fs != null ? "{...}" : "null") + ','
								+ (class_fs_37_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
