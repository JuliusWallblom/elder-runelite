package io;

import io.cache.Revision;

public final class SequenceLoader extends NodeSub {
	static int anInt6734;
	private int anInt6735;
	static int anInt6736;
	static int anInt6737;
	static int anInt6738;
	private byte[][] skeleton_byte_array;
	static int anInt6740;
	Sequence[] animations;
	static int anInt6742;
	static int anInt6743;
	static int anInt6744;
	static String[] aStringArray6745 = new String[100];
	static int anInt6746;

	final boolean method2757(byte i, int i_0_) {
		return (((Sequence) ((SequenceLoader) this).animations[i_0_]).hasColor);
	}

	static final void method2758(int i, int i_1_, TextureInterface interface6, SceneGraph class260, int i_2_, byte i_3_,
			int i_4_) {
		do {
			try {
				if (Renderer.anInt571 < 100)
					Class125.method855(interface6, -118, class260);
				anInt6746++;
				class260.OA(i, i_4_, i_1_ + i, i_2_ + i_4_);
				if ((Renderer.anInt571 ^ 0xffffffff) > -101) {
					int i_5_ = 20;
					int i_6_ = i_1_ / 2 + i;
					class260.O(i, i_4_, i_1_, i_2_, -16777216, 0);
					int i_7_ = -i_5_ + (-18 + i_4_) + i_2_ / 2;
					class260.method1753(i_6_ - 152, i_7_, 304, 34,
							Class59_Sub2.aColorArray4539[StructType.anInt6859].getRGB(), 0);
					class260.O(i_6_ - 150, 2 + i_7_, Renderer.anInt571 * 3, 30,
							Class59_Sub3_Sub2.f_cb[StructType.anInt6859].getRGB(), 0);
					FontCache.bold_font.draw_centered_text(
							Class246_Sub28_Sub6.aClass67_6044.get(Preferences.language_code),
							i_6_, i_5_ + i_7_, HDModel.aColorArray4641[StructType.anInt6859].getRGB(), -1,
							0);
				} else {
					int i_8_ = (Class109_Sub1_Sub1.anInt6725 + -(int) ((float) i_1_ / Class79.aFloat1033));
					int i_9_ = (Class21.anInt322 + (int) ((float) i_2_ / Class79.aFloat1033));
					int i_10_ = ((int) ((float) i_1_ / Class79.aFloat1033) + Class109_Sub1_Sub1.anInt6725);
					if (i_3_ != -125)
						anInt6734 = 108;
					Class216.anInt3010 = (int) ((float) (2 * i_2_) / Class79.aFloat1033);
					int i_11_ = (Class21.anInt322 + -(int) ((float) i_2_ / Class79.aFloat1033));
					SceneGraph.anInt3724 = (-(int) ((float) i_2_ / Class79.aFloat1033) + Class21.anInt322);
					Class8.anInt99 = (int) ((float) (2 * i_1_) / Class79.aFloat1033);
					Class100.anInt1302 = (Class109_Sub1_Sub1.anInt6725 + -(int) ((float) i_1_ / Class79.aFloat1033));
					Class79.method517(i_8_ + Class79.anInt1057, i_9_ + Class79.anInt1041, Class79.anInt1057 + i_10_,
							Class79.anInt1041 + i_11_, i, i_4_, i - -i_1_, i_2_ + i_4_ + 1);
					Class79.method512(class260);
					Class166 class166 = Class79.method505(class260);
					Class246_Sub28_Sub31.method2851(class166, 3, class260, 0, 0);
					if (TextureLoader.anInt966 > 0) {
						Class40_Sub5.anInt4918--;
						if ((Class40_Sub5.anInt4918 ^ 0xffffffff) == -1) {
							Class40_Sub5.anInt4918 = 20;
							TextureLoader.anInt966--;
						}
					}
					if (!Settings.display_fps)
						break;
					int i_12_ = -5 + (i_1_ + i);
					int i_13_ = i_2_ + i_4_ - 8;
					FontCache.regular_font.draw(-1, false, ("Fps:" + (Class246_Sub28_Sub18.anInt6517)), i_13_,
							16776960, i_12_);
					i_13_ -= 15;
					Runtime runtime = Runtime.getRuntime();
					int i_14_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
					int i_15_ = 16776960;
					if (i_14_ > 65536)
						i_15_ = 16711680;
					FontCache.regular_font.draw(-1, false, "Mem:" + i_14_ + "k", i_13_, i_15_, i_12_);
					i_13_ -= 15;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("pt.I(" + i + ',' + i_1_ + ',' + (interface6 != null ? "{...}" : "null") + ','
								+ (class260 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method2759(byte i) {
		try {
			if (i != 24)
				method2762(true, -46, -112);
			aStringArray6745 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pt.H(" + i + ')');
		}
	}

	static final boolean method2760(int i, Class_f class_f) {
		try {
			if (i != 27298)
				return false;
			anInt6740++;
			LocType class185 = Class143.aClass251_2067.list(class_f.method21(true), 0);
			if ((((LocType) class185).map_scene ^ 0xffffffff) == 0)
				return true;
			Sprite class32 = Client.map_scenes.method1638(1409, ((LocType) class185).map_scene);
			return class32.method244((byte) -110);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("pt.B(" + i + ',' + (class_f != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2761(boolean bool, int sequence_id, Revision revision) { // culprit
		try {
			CacheIndex skeletons;
			if (revision == Revision.OSRS) {
				skeletons = Class_u_Sub1.osrs_skeleton_data;
			} else if (revision == Revision.PRE_EOC_550) {
				skeletons = Class_u_Sub1.skeleton_data_550;
			} else {
				skeletons = Class_u_Sub1.skeleton_data;
			}
			CacheIndex skins;
			if (revision == Revision.OSRS) {
				skins = Class236.osrs_skin_data;
			} else if (revision == Revision.PRE_EOC_550) {
				skins = Class236.skin_data_550;
			} else {
				skins = Class236.skin_data;
			}
			anInt6743++;
			if (((SequenceLoader) this).animations != null)
				return true;
			if (skeleton_byte_array == null) {
				if (!skeletons.contains(anInt6735))
					return false;
				int[] is = skeletons.method111(16947, anInt6735);
				skeleton_byte_array = new byte[is.length][];
				for (int i = 0; is.length > i; i++) {
					skeleton_byte_array[i] = skeletons.get_file(is[i], anInt6735);
				}
			}
			boolean bool_16_ = true;
			for (int i = 0; (skeleton_byte_array.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				byte[] is = skeleton_byte_array[i];
				int i_17_ = (is[0] & 0xff) << 8 | is[1] & 0xff;
				bool_16_ &= skins.method112(-1, i_17_);
			}
			if (!bool_16_)
				return false;
			Class166 class166 = new Class166();
			int i = skeletons.child_count(anInt6735);
			((SequenceLoader) this).animations = new Sequence[i];
			int[] is = skeletons.method111(16947, anInt6735);
			for (int i_18_ = 0; (is.length ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
				byte[] is_19_ = skeleton_byte_array[i_18_];
				int i_20_;
				if (revision == Revision.PRE_EOC_634) {
					Buffer stream = new Buffer(is_19_);
					stream.position = 1;
					i_20_ = stream.readUnsignedShort();
				} else {
					i_20_ = 0xff & is_19_[1] | is_19_[0] << 8 & 0xff00;
				}
				TransformList class246_sub26 = null;
				for (TransformList class246_sub26_21_ = (TransformList) class166
						.method1104(81); class246_sub26_21_ != null; class246_sub26_21_ = (TransformList) class166
								.method1108((byte) -112)) {
					if ((((TransformList) class246_sub26_21_).id ^ 0xffffffff) == (i_20_ ^ 0xffffffff)) {
						class246_sub26 = class246_sub26_21_;
						break;
					}
				}
				if (class246_sub26 == null) {
					class246_sub26 = new TransformList(i_20_, skins.method109(i_20_, -1), revision);
					class166.push_head(class246_sub26);
				}
				((SequenceLoader) this).animations[is[i_18_]] = new Sequence(is_19_, class246_sub26, revision);
			}
			skeleton_byte_array = null;
			if (bool != false)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pt.D(" + bool + ')');
		}
	}

	static final int method2762(boolean bool, int i, int i_22_) {
		try {
			anInt6744++;
			if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -4)
				return Class40_Sub1.anIntArray3768[0x3 & i_22_];
			if (bool != false)
				return 25;
			return Class166.anIntArray2345[i_22_ & 0x3];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pt.F(" + bool + ',' + i + ',' + i_22_ + ')'));
		}
	}

	SequenceLoader(int i) {
		try {
			anInt6735 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pt.<init>(" + i + ')');
		}
	}

	static final FontMetric method2763(int i, CacheIndex class_fs, int i_23_) {
		try {
			anInt6738++;
			byte[] is = class_fs.method109(i, -1);
			if (i_23_ != -18318)
				anInt6734 = -60;
			if (is == null)
				return null;
			return new FontMetric(is);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("pt.A(" + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + i_23_ + ')'));
		}
	}

	final boolean method2764(int i, int i_24_) {
		return (((Sequence) ((SequenceLoader) this).animations[i_24_]).hasAlpha);
	}

	final boolean method2765(int i, byte i_25_) {
		try {
			anInt6737++;
			// if (i_25_ < 93)
			// method2761(true);
			return (((Sequence) ((SequenceLoader) this).animations[i]).aBoolean2646);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pt.E(" + i + ',' + i_25_ + ')');
		}
	}
}
