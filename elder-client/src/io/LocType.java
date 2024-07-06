package io;

import java.util.Arrays;

import io.cache.Revision;

public final class LocType {

	int size_y = 1;
	private int anInt2571;
	int map_scene;
	private int model_size_y = 128;
	private byte aByte2574;
	private byte[] aByteArray2575;
	static int anInt2576;
	boolean hollow = false;
	int anInt2578;
	int map_function;
	private int[] anIntArray2580;
	static int anInt2581;
	static int anInt2582;
	boolean aBool2583;
	boolean aBool2584;
	static int anInt2585;
	int[] transforms;
	private short[] retexture_to_find;
	private int varp;
	private int ambience;
	int wall_or_door;
	static int anInt2591;
	static OutgoingPacket aClass201_2592;
	int decor_displacement;
	boolean merge_normals;
	String[] actions;
	int size_x;
	int anInt2597;
	int supports_items;
	private int model_size_height;
	int anInt2600;
	boolean aBool2601;
	private byte aByte2602;
	int ambient_sound;
	boolean aBool2604;
	int[] field3392;
	private int config;
	int id;
	private int[] osrs_object_models;
	private int[][] object_models;
	int anInt2609;
	Class251 aClass302_2963;
	boolean aBool2611;
	private int contrast;
	static int anInt2613;
	private byte aByte2614;
	private int offset_height;
	int occlude_type;
	private int model_size_x;
	boolean aBool2618;
	boolean aBool2619;
	boolean blocks_projectile;
	static int anInt2621;
	boolean f_ab;
	int[] f_bb;
	static int f_cb;
	private int offset_y;
	private IterableNodeHashTable f_eb;
	boolean rotated;
	private int offset_x;
	int blocking_mask;
	static int f_ib;
	static int f_jb;
	int f_kb;
	private int[] object_types;
	private int contoured_ground;
	int[] f_nb;
	static int f_ob;
	int animation_id;
	boolean f_qb;
	private short[] retexture_to_replace;
	static int f_sb;
	private short[] recolor_to_replace;
	int f_ub;
	boolean shadow;
	String name;
	int anint2113;
	int anint2112;
	Revision revision;
	static int anInt2624;
	private byte aByte2625;
	boolean obstructs_ground;
	private byte aByte2628;
	static int anInt2629;
	static int anInt2630;
	int anint2083;
	static int anInt2632;
	private short[] recolor_to_find;
	int interact_type;
	static Model[] field3386 = new Model[10];

	final void post_decode(byte i) {
		do {
			try {
				if (wall_or_door == -1) {
					wall_or_door = 0;
					if (object_types != null && object_types.length == 1 && object_types[0] == 10)
						wall_or_door = 1;
					for (int i_0_ = 0; i_0_ < 5; i_0_++) {
						if (actions[i_0_] != null) {
							wall_or_door = 1;
							break;
						}
					}
				}
				anInt2621++;
				if (supports_items == -1)
					supports_items = (interact_type != 0 ? 1 : 0);
				if (i < -11)
					break;
				method1218(-23, null, -125);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rd.Q(" + i + ')');
			}
			break;
		} while (false);
	}

	void post_decode() {
		if (this.wall_or_door == -1) {
			this.wall_or_door = 0;
			if (this.osrs_object_models != null && (this.object_types == null || this.object_types[0] == 10)) {
				this.wall_or_door = 1;
			}
			for (int var2 = 0; var2 < 5; ++var2) {
				if (this.actions[var2] != null) {
					this.wall_or_door = 1;
				}
			}
		}
		if (this.supports_items == -1) {
			this.supports_items = this.interact_type != 0 ? 1 : 0;
		}
	}

	final boolean method1203(int i) {
		try {
			anInt2629++;
			if (f_bb == null) {
				if (ambient_sound == -1 && field3392 == null)
					return false;
				return true;
			}
			for (int i_1_ = i; (f_bb.length > i_1_); i_1_++) {
				if (f_bb[i_1_] != -1) {
					LocType class185_2_ = aClass302_2963.list(f_bb[i_1_], 0);
					if (((LocType) class185_2_).ambient_sound != -1 || ((LocType) class185_2_).field3392 != null)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.K(" + i + ')');
		}
	}

	final boolean method1204(int i, int i_3_) {
		try {
			if (i != 0)
				return false;
			f_sb++;
			if (i_3_ == -1)
				return false;
			if (animation_id == i_3_)
				return true;
			if (transforms != null) {
				for (int i_4_ = 0; i_4_ < transforms.length; i_4_++) {
					if (transforms[i_4_] == i_3_)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.O(" + i + ',' + i_3_ + ')');
		}
	}

	final LocType method1205(Interface11 interface11, byte i) {
		try {
			anInt2630++;
			int i_5_ = -1;
			do {
				if (varp == -1) {
					if (config == -1) {
						break;
					}
					i_5_ = interface11.method35(config, 0,
							revision == Revision.OSRS ? 193 : revision == Revision.PRE_EOC_550 ? 550 : 634);
					if (!Client.f_ob)
						break;
				}
				i_5_ = interface11.getVarBitValue((byte) 45, varp,
						revision == Revision.OSRS ? 193 : revision == Revision.PRE_EOC_634 ? 634 : 550);
			} while (false);

			if (i_5_ < 0 || i_5_ >= f_bb.length - 1 || f_bb[i_5_] == -1) {
				int i_7_ = (f_bb[-1 + f_bb.length]);
				if (i_7_ == -1)
					return null;
				return aClass302_2963.list(i_7_, 0);
			}
			return aClass302_2963.list(f_bb[i_5_], 0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"rd.E(" + (interface11 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method1206(int i, byte i_8_, int i_9_) {
		try {
			anInt2581++;
			if (i_8_ <= 75)
				name = null;
			if (f_eb == null)
				return i_9_;
			SwitchInt class246_sub33 = (SwitchInt) f_eb.get((long) i);
			if (class246_sub33 == null)
				return i_9_;
			return ((SwitchInt) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rd.P(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	public static void method1207(byte i) {
		do {
			try {
				aClass201_2592 = null;
				if (i == 17)
					break;
				method1216((byte) 92, false, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rd.L(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method1208(Buffer stream, byte i) {
		try {
			f_jb++;
			int i_10_ = stream.readUnsignedByte();
			if (i == 34) {
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
					((Buffer) stream).position++;
					int i_12_ = stream.readUnsignedByte();
					((Buffer) stream).position += i_12_ * 2;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.N(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method1209(byte i) {
		try {
			anInt2591++;
			if (transforms != null) {
				int i_13_ = (int) ((double) anInt2571 * Math.random());
				int i_14_;
				for (i_14_ = 0; i_13_ >= anIntArray2580[i_14_]; i_14_++)
					i_13_ -= anIntArray2580[i_14_];
				return transforms[i_14_];
			}
			if (i >= -31)
				method1213(-110);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.G(" + i + ')');
		}
	}

	final Class133 method1210(SceneGraph class260, int i, int i_15_, int i_16_, int i_17_, boolean bool, int i_18_,
			Class210 class210, int i_19_, int i_20_, Class210 class210_21_) {
		try {
			f_cb++;
			if (Class242.method1559(122, i_20_))
				i_20_ = 4;
			long l = (long) ((i_20_ << 3) + ((id << 10) + i_18_));
			l |= (long) (((SceneGraph) class260).anInt3719 << 29);
			int i_22_ = i_16_;
			if (aByte2625 == 3)
				i_22_ |= 0x7;
			else if (aByte2625 != 0)
				i_22_ |= 0x2;
			if (bool)
				i_22_ |= 0x40000;
			Class133 class133;
			synchronized (((Class251) aClass302_2963).aClass54_3557) {
				if (i_15_ != 3)
					interact_type = 107;
				class133 = (Class133) ((Class251) aClass302_2963).aClass54_3557.method379(l, (byte) 58);
			}
			AbstractModel class_t = class133 == null ? null : ((Class133) class133).aClass_t1837;
			Class246_Sub1_Sub4 class246_sub1_sub4 = null;
			if (class_t == null || class260.method1710(class_t.P(), i_22_) != 0) {
				if (class_t != null)
					i_22_ = class260.method1723(i_22_, class_t.P());
				int i_23_ = i_22_;
				if (i_20_ == 10 && i_18_ > 3)
					i_23_ |= 0x5;
				class_t = get_object_model((byte) 17, class260, i_18_, i_20_, i_23_);
				if (class_t == null)
					return null;
				if (i_20_ == 10 && i_18_ > 3)
					class_t.Q(2048);
				if (bool)
					class246_sub1_sub4 = class_t.fa(null);
				class_t.UA(i_22_);
				class133 = new Class133();
				((Class133) class133).aClass_t1837 = class_t;
				((Class133) class133).aClass246_Sub1_Sub4_1835 = class246_sub1_sub4;
				synchronized (((Class251) aClass302_2963).aClass54_3557) {
					((Class251) aClass302_2963).aClass54_3557.method371(1, l, class133);
				}
			} else {
				class_t = ((Class133) class133).aClass_t1837;
				class246_sub1_sub4 = ((Class133) class133).aClass246_Sub1_Sub4_1835;
				if (bool && class246_sub1_sub4 == null)
					class246_sub1_sub4 = ((Class133) class133).aClass246_Sub1_Sub4_1835 = class_t.fa(null);
			}
			if (aByte2625 != 0 && (class210_21_ != null || class210 != null)) {
				class_t = class_t.method678((byte) 0, i_22_, true);
				class_t.h(aByte2625, contoured_ground, class210_21_, class210, i, i_17_, i_19_);
				class_t.UA(i_16_);
			} else
				class_t = class_t.method678((byte) 0, i_16_, true);
			((Class133) Class246_Sub28_Sub36.aClass133_7032).aClass_t1837 = class_t;
			((Class133) Class246_Sub28_Sub36.aClass133_7032).aClass246_Sub1_Sub4_1835 = class246_sub1_sub4;
			return Class246_Sub28_Sub36.aClass133_7032;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	final boolean method1211(byte i, int i_24_) {
		if (osrs(this.id)) {
			if (this.object_types != null) {
				for (int var5 = 0; var5 < this.object_types.length; ++var5) {
					if (this.object_types[var5] == i_24_) {
						if (!((Class251) aClass302_2963).get_object_model_cache(id).method85(0, (byte) -124,
								osrs_object_models[var5] & '\uffff')) {
							return false;
						}
					}
				}
				return true;
			} else if (this.osrs_object_models == null) {
				return true;
			} else if (i_24_ != 10) {
				return true;
			} else {
				boolean var3 = true;
				for (int var4 = 0; var4 < this.osrs_object_models.length; ++var4) {
					if (!((Class251) aClass302_2963).get_object_model_cache(id).method85(0, (byte) -124,
							osrs_object_models[var4] & '\uffff')) {
						return false;
					}
				}
				return var3;
			}
		} else {
			try {
				anInt2632++;
				if (object_models == null)
					return true;
				synchronized (((Class251) aClass302_2963).get_object_model_cache(id)) {
					for (int i_25_ = 0; i_25_ < object_types.length; i_25_++) {
						if (object_types[i_25_] == i_24_) {
							for (int i_26_ = 0; (i_26_ < object_models[i_25_].length); i_26_++) {
								if (!((Class251) aClass302_2963).get_object_model_cache(id).method85(0, (byte) -124,
										object_models[i_25_][i_26_]))
									return false;
							}
							return true;
						}
					}
				}
				return true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rd.B(" + i + ',' + i_24_ + ')');
			}
		}
	}

	private final AbstractModel get_object_model(byte i, SceneGraph class260, int i_27_, int i_28_, int i_29_) {
		try {
			anInt2582++;
			// var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			int objectAmbience = (osrs(this.id) ? 57 : 64) + ambience;
			int objectContrast = contrast + (osrs(this.id) ? 768 : 850);

			int i_32_ = i_29_;
			boolean rotate_object = (rotated || i_28_ == 2 && i_27_ > 3);
			if (rotate_object)
				i_29_ |= 0x10;
			if (i_27_ == 0) {
				if (model_size_x != 128 || offset_x != 0)
					i_29_ |= 0x1;
				if (model_size_y != 128 || offset_y != 0)
					i_29_ |= 0x4;
			} else
				i_29_ |= 0xd;
			if (model_size_height != 128 || offset_height != 0)
				i_29_ |= 0x2;
			if (recolor_to_find != null)
				i_29_ |= 0x4000;
			if (retexture_to_find != null)
				i_29_ |= 0x8000;
			if (aByte2614 != 0)
				i_29_ |= 0x80000;
			AbstractModel abstract_model = null;
			if (osrs(this.id)) {
				if (this.object_types == null) {
					if (i_28_ != 10) {
						return null;
					}
					if (this.osrs_object_models == null) {
						return null;
					}
					rotate_object = this.rotated;
					if (i_28_ == 2 && i_27_ > 3) {
						rotate_object = !rotate_object;
					}
					int object_model_length = osrs_object_models.length;
					synchronized (((Class251) aClass302_2963).aClass54_3554) {
						abstract_model = ((AbstractModel) ((Class251) aClass302_2963).aClass54_3554.method379(0,
								(byte) 58));
					}
					if (abstract_model == null || class260.method1710(abstract_model.P(), i_29_) != 0) {

						Model class103 = null;
						for (int object_model_index = 0; object_model_index < object_model_length; object_model_index++) {
							int current_object_model = this.osrs_object_models[object_model_index];
							if (rotate_object) {
								current_object_model += 65536;
							}
							synchronized (((Class251) aClass302_2963).get_object_model_cache(id)) {
								class103 = (Model.get_model(0,
										(((Class251) (aClass302_2963)).get_object_model_cache(id)),
										current_object_model, this.revision));
							}
							if (class103 == null) {
								class103 = (Model.get_model(0,
										(((Class251) (aClass302_2963)).get_object_model_cache(id)),
										current_object_model & '\uffff', this.revision));
							}
							if (class103 == null) {
								return null;
							}
							if (((Model) class103).anInt1358 < 13) {
								class103.method646(0, (byte) -49);
							}
							if (object_model_length > 1) {
								LocType.field3386[object_model_index] = class103;
							}
						}
						if (object_model_length > 1) {
							class103 = new Model(LocType.field3386, object_model_length);
						}
						int i_37_ = 0x1f01f | i_29_;
						if (abstract_model != null) {
							i_37_ = class260.method1723(i_37_, abstract_model.P());
						}
						abstract_model = class260.method1695(class103, i_37_, (((Class251) (aClass302_2963)).anInt3559),
								objectAmbience, objectContrast);
						synchronized (((Class251) aClass302_2963).aClass54_3554) {
							((Class251) aClass302_2963).aClass54_3554.method371(1, object_model_length, abstract_model);
						}
					}
				} else {
					int var10 = -1;
					for (int object_model_length = 0; object_model_length < object_types.length; object_model_length++) {
						if (object_types[object_model_length] == i_28_) {
							var10 = object_model_length;
							break;
						}
					}
					if (var10 == -1) {
						return null;
					}
					int object_model_length = this.osrs_object_models[var10];
					int i_35_ = osrs_object_models.length;
					if (i_35_ > 0) {
						synchronized (((Class251) aClass302_2963).aClass54_3554) {
							abstract_model = ((AbstractModel) ((Class251) aClass302_2963).aClass54_3554
									.method379(object_model_length, (byte) 58));
						}
						if (abstract_model != null) {
							if (abstract_model.D() != objectAmbience) {
								i_29_ |= 0x1000;
							}
							if (abstract_model.l() != objectContrast) {
								i_29_ |= 0x2000;
							}
						}
						if (abstract_model == null || class260.method1710(abstract_model.P(), i_29_) != 0) {
							int i_37_ = 0x1f01f | i_29_;
							if (abstract_model != null) {
								i_37_ = class260.method1723(i_37_, abstract_model.P());
							}
							Model class103 = null;
							synchronized (LocType.field3386) {
								for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
									synchronized (((Class251) aClass302_2963).get_object_model_cache(id)) {
										class103 = (Model.get_model(0,
												(((Class251) (aClass302_2963)).get_object_model_cache(id)),
												0xffff & (osrs_object_models[var10]), this.revision));
									}
									if (class103 == null) {
										return null;
									}
									if (((Model) class103).anInt1358 < 13) {
										class103.method646(0, (byte) -49);
									}
									if (i_35_ > 1) {
										LocType.field3386[i_38_] = class103;
									}
								}
								if (i_35_ > 1) {
									class103 = new Model(LocType.field3386, i_35_);
								}
							}
							abstract_model = class260.method1695(class103, i_37_,
									(((Class251) (aClass302_2963)).anInt3559), objectAmbience, objectContrast);
							synchronized (((Class251) aClass302_2963).aClass54_3554) {
								((Class251) aClass302_2963).aClass54_3554.method371(1, object_model_length,
										abstract_model);
							}
						}
					}
				}
			} else {
				if (this.object_types == null) {
					return null;
				}
				int i_33_ = -1;
				for (int i_34_ = 0; i_34_ < object_types.length; i_34_++) {
					if (object_types[i_34_] == i_28_) {
						i_33_ = i_34_;
						break;
					}
				}
				if (i_33_ == -1) {
					return null;
				}
				int i_35_ = object_models[i_33_].length;
				if (i_35_ > 0) {
					long l = (long) ((SceneGraph) class260).anInt3719;
					for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
						l = (long) object_models[i_33_][i_36_] + l * 67783L;
					synchronized (((Class251) aClass302_2963).aClass54_3554) {
						abstract_model = ((AbstractModel) ((Class251) aClass302_2963).aClass54_3554.method379(l,
								(byte) 58));
					}
					if (abstract_model != null) {
						if (abstract_model.D() != objectAmbience)
							i_29_ |= 0x1000;
						if (abstract_model.l() != objectContrast)
							i_29_ |= 0x2000;
					}
					if (abstract_model == null || class260.method1710(abstract_model.P(), i_29_) != 0) {
						int i_37_ = 0x1f01f | i_29_;
						if (abstract_model != null)
							i_37_ = class260.method1723(i_37_, abstract_model.P());
						Model class103 = null;
						synchronized (LocType.field3386) {
							for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
								synchronized (((Class251) aClass302_2963).get_object_model_cache(id)) {
									class103 = (Model.get_model(0,
											(((Class251) (aClass302_2963)).get_object_model_cache(id)),
											0xffff & (object_models[i_33_][i_38_]), this.revision));
								}
								if (class103 == null)
									return null;
								if (((Model) class103).anInt1358 < 13)
									class103.method646(0, (byte) -49);
								if (i_35_ > 1)
									LocType.field3386[i_38_] = class103;
							}
							if (i_35_ > 1)
								class103 = new Model(LocType.field3386, i_35_);
						}
						abstract_model = class260.method1695(class103, i_37_, (((Class251) (aClass302_2963)).anInt3559),
								objectAmbience, objectContrast);
						synchronized (((Class251) aClass302_2963).aClass54_3554) {
							((Class251) aClass302_2963).aClass54_3554.method371(1, l, abstract_model);
						}
					}
				}
			}
			AbstractModel class_t_39_ = abstract_model.method678((byte) 0, i_29_, true);
			if (!osrs(id) && objectAmbience != abstract_model.D())
				class_t_39_.E(objectAmbience);
			if (!osrs(id) && abstract_model.l() != objectContrast)
				class_t_39_.aa(objectContrast);
			if (rotate_object)
				class_t_39_.IA();
			if (i_28_ == 4 && i_27_ > 3) {
				class_t_39_.c(2048);
				class_t_39_.JA(45, 0, -45);
			}
			i_27_ &= 0x3;
			if (i_27_ != 1) {
				if (i_27_ == 2)
					class_t_39_.c(8192);
				else if (i_27_ == 3)
					class_t_39_.c(12288);
			} else
				class_t_39_.c(4096);
			if (recolor_to_find != null) {
				for (int i_40_ = 0; recolor_to_find.length > i_40_; i_40_++)
					class_t_39_.BA(recolor_to_find[i_40_], recolor_to_replace[i_40_]);
			}
			if (retexture_to_find != null) {
				for (int i_41_ = 0; (retexture_to_find.length > i_41_); i_41_++)
					class_t_39_.I(retexture_to_find[i_41_], retexture_to_replace[i_41_]);
			}
			if (aByte2614 != 0)
				class_t_39_.method684(aByte2628, aByte2574, aByte2602, 0xff & aByte2614);
			if (model_size_x != 128 || model_size_height != 128 || model_size_y != 128)
				class_t_39_.H(model_size_x, model_size_height, model_size_y);
			if (offset_x != 0 || offset_height != 0 || offset_y != 0)
				class_t_39_.JA(offset_x, offset_height, offset_y);
			class_t_39_.UA(i_32_);
			if (i != 17)
				method1207((byte) 83);
			return class_t_39_;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	final boolean method1213(int i) {
		try {
			if (osrs(this.id)) {
				anInt2576++;
				if (osrs_object_models == null)
					return true;
				boolean bool = true;
				synchronized (((Class251) aClass302_2963).get_object_model_cache(id)) {
					for (int i_43_ = 0; i_43_ < osrs_object_models.length; i_43_++) {
						bool &= (((Class251) aClass302_2963).get_object_model_cache(id).method85(0, (byte) -124,
								osrs_object_models[i_43_] & '\uffff'));
					}
				}
				return bool;
			} else {
				anInt2576++;
				if (object_models == null)
					return true;
				boolean bool = true;
				synchronized (((Class251) aClass302_2963).get_object_model_cache(id)) {
					for (int i_42_ = 0; (object_models.length > i_42_); i_42_++) {
						for (int i_43_ = 0; i_43_ < object_models[i_42_].length; i_43_++)
							bool &= (((Class251) aClass302_2963).get_object_model_cache(id).method85(0, (byte) -124,
									object_models[i_42_][i_43_]));
					}
				}
				int i_44_ = -10 % ((71 - i) / 32);
				return bool;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.D(" + i + ')');
		}
	}

	private final void process_op(Buffer stream, int opcode) {
		try {
			if (opcode == 1 || opcode == 5) {
				if (opcode == 5 && ((Class251) aClass302_2963).aBool3547)
					method1208(stream, (byte) 34);
				int i_46_ = stream.readUnsignedByte();
				object_models = new int[i_46_][];
				object_types = new int[i_46_];
				for (int i_47_ = 0; i_46_ > i_47_; i_47_++) {
					object_types[i_47_] = stream.readByte();
					int i_48_ = stream.readUnsignedByte();
					object_models[i_47_] = new int[i_48_];
					for (int i_49_ = 0; i_48_ > i_49_; i_49_++)
						object_models[i_47_][i_49_] = stream.readUnsignedShort();
				}
				if (opcode == 5 && !(((Class251) aClass302_2963).aBool3547))
					method1208(stream, (byte) 34);
			} else if (opcode == 2)
				name = stream.readString();
			else if (opcode == 14) {
				size_x = stream.readUnsignedByte();
			} else if (opcode == 15) {
				size_y = stream.readUnsignedByte();
			} else if (opcode == 17) {
				blocks_projectile = false;
				interact_type = 0;
			} else if (opcode == 18)
				blocks_projectile = false;
			else if (opcode == 19)
				wall_or_door = stream.readUnsignedByte();
			else if (opcode == 21) {
				aByte2625 = (byte) 1;
			} else if (opcode == 22)
				merge_normals = true;
			else if (opcode == 23)
				occlude_type = 1;
			else if (opcode == 24) {
				animation_id = stream.readUnsignedShort();
				if (animation_id == 65535) {
					animation_id = -1;
				}
			} else if (opcode == 27)
				interact_type = 1;
			else if (opcode == 28) {
				decor_displacement = stream.readUnsignedByte();
			} else if (opcode == 29)
				ambience = stream.readByte();
			else if (opcode == 39) {
				contrast = stream.readByte() * 5;
			} else if (opcode >= 30 && opcode < 35)
				actions[-30 + opcode] = stream.readString();
			else if (opcode == 40) {
				int i_50_ = stream.readUnsignedByte();
				recolor_to_replace = new short[i_50_];
				recolor_to_find = new short[i_50_];
				for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
					recolor_to_find[i_51_] = (short) (stream.readUnsignedShort());
					recolor_to_replace[i_51_] = (short) (stream.readUnsignedShort());
				}
			} else if (opcode == 41) {
				int i_68_ = stream.readUnsignedByte();
				retexture_to_replace = new short[i_68_];
				retexture_to_find = new short[i_68_];
				for (int i_69_ = 0; (i_68_ > i_69_); i_69_++) {
					retexture_to_find[i_69_] = (short) (stream.readUnsignedShort());
					retexture_to_replace[i_69_] = (short) (stream.readUnsignedShort());
				}
			} else if (opcode == 42) {
				int i_66_ = stream.readUnsignedByte();
				aByteArray2575 = new byte[i_66_];
				for (int i_67_ = 0; (i_67_ < i_66_); i_67_++)
					aByteArray2575[i_67_] = stream.readByte();
			} else if (opcode == 62)
				rotated = true;
			else if (opcode == 64)
				shadow = false;
			else if (opcode == 65)
				model_size_x = (stream.readUnsignedShort());
			else if (opcode == 66)
				model_size_height = (stream.readUnsignedShort());
			else if (opcode == 67) {
				model_size_y = (stream.readUnsignedShort());
			} else if (opcode == 69) {
				blocking_mask = (stream.readUnsignedByte());
			} else if (opcode == 70) {
				offset_x = ((stream.method2375((byte) 1)));
			} else if (opcode == 71) {
				offset_height = ((stream.method2375((byte) 1)));
			} else if (opcode == 72) {
				offset_y = ((stream.method2375((byte) 1)));
			} else if (opcode == 73) {
				obstructs_ground = true;
			} else if (opcode == 74) {
				hollow = true;
			} else if (opcode == 75) {
				supports_items = stream.readUnsignedByte();
			} else if (opcode == 77 || opcode == 92) {
				varp = stream.readUnsignedShort();
				if (varp == 65535)
					varp = -1;
				config = stream.readUnsignedShort();
				if (config == 65535)
					config = -1;
				int i_52_ = -1;
				if (opcode == 92) {
					i_52_ = stream.readUnsignedShort();
					if (i_52_ == 65535)
						i_52_ = -1;
				}
				int i_53_ = stream.readUnsignedByte();
				f_bb = new int[2 + i_53_];
				for (int i_54_ = 0; i_54_ <= i_53_; i_54_++) {
					f_bb[i_54_] = stream.readUnsignedShort();
					if (f_bb[i_54_] == 65535)
						f_bb[i_54_] = -1;
				}
				f_bb[1 + i_53_] = i_52_;
			} else if (opcode == 78) {
				ambient_sound = stream.readUnsignedShort();
				anint2083 = stream.readUnsignedByte();
			} else if (opcode == 79) {
				anint2112 = stream.readUnsignedShort();
				anint2113 = stream.readUnsignedShort();
				anint2083 = stream.readUnsignedByte();
				int i_64_ = stream.readUnsignedByte();
				field3392 = new int[i_64_];
				for (int i_65_ = 0; i_64_ > i_65_; i_65_++)
					field3392[i_65_] = stream.readUnsignedShort();
			} else if (opcode == 81) {
				aByte2625 = (byte) 2;
				contoured_ground = stream.readUnsignedByte() * 256;
			} else if (opcode == 82)
				aBool2611 = true;
			else if (opcode == 88)
				aBool2583 = false;
			else if (opcode == 89)
				f_ab = false;
			else if (opcode == 90) {
				aBool2584 = true;
			} else if (opcode == 91) {
				aBool2618 = true;
			} else if (opcode == 93) {
				aByte2625 = (byte) 3;
				contoured_ground = stream.readUnsignedShort();
			} else if (opcode == 94) {
				aByte2625 = (byte) 4;
			} else if (opcode == 95)
				aByte2625 = (byte) 5;
			else if (opcode == 96)
				aBool2601 = true;
			else if (opcode == 97) {
				aBool2619 = true;
			} else if (opcode == 98)
				f_qb = true;
			else if (opcode == 99) {
				anInt2600 = stream.readUnsignedByte();
				anInt2609 = stream.readUnsignedShort();
			} else if (opcode == 100) {
				f_kb = stream.readUnsignedByte();
				f_ub = stream.readUnsignedShort();
			} else if (opcode == 101)
				anInt2597 = stream.readUnsignedByte();
			else if (opcode == 102) {
				map_scene = stream.readUnsignedShort();
			} else if (opcode == 103)
				occlude_type = 0;
			else if (opcode == 104) {
				anInt2578 = stream.readUnsignedByte();
			} else if (opcode == 105)
				aBool2604 = true;
			else if (opcode == 106) {
				int i_55_ = stream.readUnsignedByte();
				transforms = new int[i_55_];
				anIntArray2580 = new int[i_55_];
				for (int i_56_ = 0; i_55_ > i_56_; i_56_++) {
					transforms[i_56_] = stream.readUnsignedShort();
					int i_57_ = stream.readUnsignedByte();
					anIntArray2580[i_56_] = i_57_;
					anInt2571 += i_57_;
				}
			} else if (opcode == 107) {
				map_function = stream.readUnsignedShort();
			} else if (opcode >= 150 && opcode < 155) {
				actions[opcode - 150] = stream.readString();
				if (!((Class251) aClass302_2963).aBool3539)
					actions[-150 + opcode] = null;
			} else if (opcode == 160) {
				int i_62_ = stream.readUnsignedByte();
				f_nb = new int[i_62_];
				for (int i_63_ = 0; i_63_ < i_62_; i_63_++)
					f_nb[i_63_] = stream.readUnsignedShort();
			} else if (opcode == 162) {
				aByte2625 = (byte) 3;
				contoured_ground = stream.readInt();
			} else if (opcode == 163) {
				aByte2628 = stream.readByte();
				aByte2574 = stream.readByte();
				aByte2602 = stream.readByte();
				aByte2614 = stream.readByte();
			} else if (opcode == 249) {
				int i_58_ = stream.readUnsignedByte();
				if (f_eb == null) {
					int i_59_ = Class206.method1350(i_58_, 269173057);
					f_eb = new IterableNodeHashTable(i_59_);
				}
				for (int i_60_ = 0; i_58_ > i_60_; i_60_++) {
					boolean bool = stream.readUnsignedByte() == 1;
					int i_61_ = stream.read24BitInteger();
					Node class246;
					if (!bool)
						class246 = new SwitchInt(stream.readInt());
					else
						class246 = new Class246_Sub4(stream.readString());
					f_eb.method547((long) i_61_, -2301, class246);
				}
			}
			anInt2613++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("rd.J(" + (stream != null ? "{...}" : "null") + ',' + opcode + ',' + -2 + ')'));
		}
	}

	public static boolean field3399 = false;

	void process_op_osrs(Buffer buffer, int opcode, int objectId) {
		int var4;
		int var5;
		if (opcode == 1) {
			var4 = buffer.readUnsignedByte();
			if (var4 > 0) {
				if (this.osrs_object_models != null && !field3399) {
					buffer.position += 3 * var4;
				} else {
					this.object_types = new int[var4];
					this.osrs_object_models = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						this.osrs_object_models[var5] = buffer.readUnsignedShort();
						this.object_types[var5] = buffer.readUnsignedByte();
					}
				}
			}
		} else if (opcode == 2) {
			this.name = buffer.readString();
		} else if (opcode == 5) {
			var4 = buffer.readUnsignedByte();
			if (var4 > 0) {
				if (this.osrs_object_models != null && !field3399) {
					buffer.position += 2 * var4;
				} else {
					this.object_types = null;
					this.osrs_object_models = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						this.osrs_object_models[var5] = buffer.readUnsignedShort();
					}
				}
			}
		} else if (opcode == 14) {
			this.size_x = buffer.readUnsignedByte();
		} else if (opcode == 15) {
			this.size_y = buffer.readUnsignedByte();
		} else if (opcode == 17) {
			this.interact_type = 0;
			this.blocks_projectile = false;
		} else if (opcode == 18) {
			this.blocks_projectile = false;
		} else if (opcode == 19) {
			this.wall_or_door = buffer.readUnsignedByte();
		} else if (opcode == 21) {
			aByte2625 = (byte) 1;
			this.contoured_ground = 0;
		} else if (opcode == 22) {
			this.merge_normals = true;
		} else if (opcode == 23) {
			this.occlude_type = 1;
			// this.field3402 = true;
		} else if (opcode == 24) {
			this.animation_id = buffer.readUnsignedShort();
			if (this.animation_id == '\uffff') {
				this.animation_id = -1;
			}
		} else if (opcode == 27) {
			this.interact_type = 1;
		} else if (opcode == 28) {
			this.decor_displacement = buffer.readUnsignedByte();
		} else if (opcode == 29) {
			this.ambience = buffer.readByte();
		} else if (opcode == 39) {
			this.contrast = buffer.readByte() * 25;
		} else if (opcode >= 30 && opcode < 35) {
			this.actions[opcode - 30] = buffer.readString();
			if (this.actions[opcode - 30].equalsIgnoreCase("Hidden")) {
				this.actions[opcode - 30] = null;
			}
		} else if (opcode == 40) {
			var4 = buffer.readUnsignedByte();
			this.recolor_to_find = new short[var4];
			this.recolor_to_replace = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.recolor_to_find[var5] = (short) buffer.readShort();
				this.recolor_to_replace[var5] = (short) buffer.readShort();
			}
		} else if (opcode == 41) {
			var4 = buffer.readUnsignedByte();
			this.retexture_to_find = new short[var4];
			this.retexture_to_replace = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.retexture_to_find[var5] = (short) buffer.readShort();
				this.retexture_to_replace[var5] = (short) buffer.readShort();
			}
		} else if (opcode == 61) { // L: 179
			buffer.readUnsignedShort(); // L: 180
		} else if (opcode == 62) {
			this.rotated = true;
		} else if (opcode == 64) {
			this.shadow = false;
		} else if (opcode == 65) {
			this.model_size_x = buffer.readUnsignedShort();
		} else if (opcode == 66) {
			this.model_size_height = buffer.readUnsignedShort();
		} else if (opcode == 67) {
			this.model_size_y = buffer.readUnsignedShort();
		} else if (opcode == 68) {
			this.map_scene = buffer.readUnsignedShort();
		} else if (opcode == 69) {
			buffer.readByte();
		} else if (opcode == 70) {
			this.offset_x = buffer.readShort();
		} else if (opcode == 71) {
			this.offset_height = buffer.readShort();
		} else if (opcode == 72) {
			this.offset_y = buffer.readShort();
		} else if (opcode == 73) {
			this.obstructs_ground = true;
		} else if (opcode == 74) {
			this.hollow = true;
		} else if (opcode == 75) {
			this.supports_items = buffer.readUnsignedByte();
		} else if (opcode != 77 && opcode != 92) {
			if (opcode == 78) {
				this.ambient_sound = buffer.readUnsignedShort();
				this.anint2083 = buffer.readUnsignedByte();
				int idk = buffer.readUnsignedByte();
			} else if (opcode == 79) {
				this.anint2112 = buffer.readUnsignedShort();
				this.anint2113 = buffer.readUnsignedShort();
				this.anint2083 = buffer.readUnsignedByte();
				int idk = buffer.readUnsignedByte();
				var4 = buffer.readUnsignedByte();
				this.field3392 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field3392[var5] = buffer.readUnsignedShort();
				}
			} else if (opcode == 81) {
				this.aByte2625 = (byte) 2;
				this.contoured_ground = buffer.readUnsignedByte() * 256;
			} else if (opcode == 82) {
				this.map_function = buffer.readUnsignedShort();
			} else if (opcode == 89) {
				this.f_ab = false;
			} else if (opcode == 249) {
				int i_58_ = buffer.readUnsignedByte();
				if (f_eb == null) {
					int i_59_ = Class206.method1350(i_58_, 269173057);
					f_eb = new IterableNodeHashTable(i_59_);
				}
				for (int i_60_ = 0; i_58_ > i_60_; i_60_++) {
					boolean bool = buffer.readUnsignedByte() == 1;
					int i_61_ = buffer.read24BitInteger();
					Node class246;
					if (!bool)
						class246 = new SwitchInt(buffer.readInt());
					else
						class246 = new Class246_Sub4(buffer.readString());
					f_eb.method547((long) i_61_, -2301, class246);
				}
			}
		} else {
			this.varp = buffer.readUnsignedShort();
			if (this.varp == '\uffff') {
				this.varp = -1;
			}

			this.config = buffer.readUnsignedShort();
			if (this.config == '\uffff') {
				this.config = -1;
			}

			var4 = -1;
			if (opcode == 92) {
				var4 = buffer.readUnsignedShort();
				if (var4 == '\uffff') {
					var4 = -1;
				}
			}

			var5 = buffer.readUnsignedByte();
			this.f_bb = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				this.f_bb[var6] = buffer.readUnsignedShort();
				if (this.f_bb[var6] == '\uffff') {
					this.f_bb[var6] = -1;
				}
			}

			this.f_bb[var5 + 1] = var4;
		}
	}

	final AbstractModel method1215(byte i, int i_70_, int i_71_, int i_72_, int i_73_, SceneGraph class260,
			SequenceType class124, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, Class210 class210,
			Class210 class210_79_) {
		try {
			if (Class242.method1559(126, i_70_))
				i_70_ = 4;
			f_ob++;
			long l = (long) ((id << 10) - (-(i_70_ << 3) - i_76_));
			int i_80_ = i_78_;
			l |= (long) (((SceneGraph) class260).anInt3719 << 29);
			if (class124 != null)
				i_78_ |= class124.method847(i_73_, 256, i_74_, false);
			do {
				if (aByte2625 != 3) {
					if (aByte2625 == 0)
						break;
					i_78_ |= 0x2;
					if (!Client.f_ob)
						break;
				}
				i_78_ |= 0x7;
			} while (false);
			if (i_70_ == 10 && i_76_ > 3)
				i_78_ |= 0x5;
			AbstractModel class_t;
			synchronized (((Class251) aClass302_2963).aClass54_3558) {
				if (i >= -63)
					return null;
				class_t = (AbstractModel) ((Class251) aClass302_2963).aClass54_3558.method379(l, (byte) 58);
			}
			if (class_t == null || class260.method1710(class_t.P(), i_78_) != 0) {
				if (class_t != null)
					i_78_ = class260.method1723(i_78_, class_t.P());
				class_t = get_object_model((byte) 17, class260, i_76_, i_70_, i_78_);
				if (class_t == null)
					return null;
				synchronized (((Class251) aClass302_2963).aClass54_3558) {
					((Class251) aClass302_2963).aClass54_3558.method371(1, l, class_t);
				}
			}
			boolean bool = false;
			if (class124 != null) {
				class_t = class124.method849(i_73_, (byte) 1, class_t, i_72_, i_74_, 0x3 & i_76_, i_78_, 256);
				bool = true;
			}
			if (i_70_ == 10 && i_76_ > 3) {
				if (!bool) {
					class_t = class_t.method678((byte) 3, i_78_, true);
					bool = true;
				}
				class_t.Q(2048);
			}
			if (aByte2625 != 0) {
				if (!bool) {
					bool = true;
					class_t = class_t.method678((byte) 3, i_78_, true);
				}
				class_t.h(aByte2625, contoured_ground, class210_79_, class210, i_75_, i_71_, i_77_);
			}
			if (bool)
				class_t.UA(i_80_);
			return class_t;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	static final void method1216(byte i, boolean bool, String string) {
		try {
			if (i <= -109) {
				anInt2624++;
				if (string != null) {
					if (Widget.anInt3266 >= 100)
						Client.add_game_message((byte) -99, (Class249.aClass67_3497.get(Preferences.language_code)));
					else {
						String string_81_ = Class64.method424(string, (byte) -64);
						if (string_81_ != null) {
							for (int i_82_ = 0; (i_82_ < Widget.anInt3266); i_82_++) {
								String string_83_ = Class64.method424((Class38_Sub1_Sub1.aStringArray6762[i_82_]),
										(byte) -69);
								if (string_83_ != null && string_83_.equals(string_81_)) {
									Client.add_game_message((byte) -99,
											string + (Class100.aClass67_1300.get(Preferences.language_code)));
									return;
								}
								if (SequenceLoader.aStringArray6745[i_82_] != null) {
									String string_84_ = (Class64.method424((SequenceLoader.aStringArray6745[i_82_]),
											(byte) -116));
									if (string_84_ != null && string_84_.equals(string_81_)) {
										Client.add_game_message((byte) -99,
												string + (Class100.aClass67_1300.get(Preferences.language_code)));
										return;
									}
								}
							}
							for (int i_85_ = 0; i_85_ < Client.anInt3969; i_85_++) {
								String string_86_ = Class64.method424(Model.f_gb[i_85_], (byte) -98);
								if (string_86_ != null && string_86_.equals(string_81_)) {
									Client.add_game_message((byte) -99,
											((Class138.aClass67_1968.get(Preferences.language_code)) + string
													+ (Class_ls.aClass67_965.get(Preferences.language_code))));
									return;
								}
								if (Class33.aStringArray446[i_85_] != null) {
									String string_87_ = Class64.method424((Class33.aStringArray446[i_85_]), (byte) -71);
									if (string_87_ != null && string_87_.equals(string_81_)) {
										Client.add_game_message((byte) -99,
												((Class138.aClass67_1968.get(Preferences.language_code)) + string
														+ (Class_ls.aClass67_965.get(Preferences.language_code))));
										return;
									}
								}
							}
							if (Class64.method424(((Player) Client.local_player).aString7140, (byte) -85)
									.equals(string_81_))
								Client.add_game_message((byte) -99,
										Class186.aClass67_2637.get(Preferences.language_code));
							else {
								Class243.writePacket(-126, (Class246_Sub11.ADD_IGNORE_PACKET));
								Cursors.anInt2232++;
								Class130_Sub1.stream.writeByte(255, Class145.method978(string, (byte) -126) + 1);
								Class130_Sub1.stream.writeString(100, string);
								Class130_Sub1.stream.writeByte(255, bool ? 1 : 0);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("rd.I(" + i + ',' + bool + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void decode(Buffer stream, boolean osrs, int objectId) {
		for (;;) {
			int op = stream.readUnsignedByte();
			if (op == 0)
				break;
			if (osrs) {
				process_op_osrs(stream, op, objectId);
			} else {
				process_op(stream, op);
			}
		}
	}

	final String method1218(int i, String string, int i_89_) {
		try {
			if (i > -114)
				return null;
			f_ib++;
			if (f_eb == null)
				return string;
			Class246_Sub4 class246_sub4 = (Class246_Sub4) f_eb.get((long) i_89_);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("rd.F(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_89_ + ')'));
		}
	}

	public final boolean osrs(int loc_id) {
		boolean result = this.revision == Revision.OSRS || MapRegion.get_revision_by_region() == Revision.OSRS;
		return result;
	}

	public LocType() {
		revision = Revision.OSRS;
		map_scene = -1;
		decor_displacement = 16;
		actions = new String[5];
		ambience = 0;
		anInt2578 = 255;
		merge_normals = false;
		map_function = -1;
		anInt2571 = 0;
		size_x = 1;
		supports_items = -1;
		aBool2584 = false;
		aBool2611 = false;
		anInt2597 = 0;
		aBool2604 = false;
		aBool2601 = false;
		transforms = null;
		contrast = 0;
		wall_or_door = -1;
		anInt2609 = -1;
		blocks_projectile = true;
		model_size_height = 128;
		aByte2614 = (byte) 0;
		aBool2583 = true;
		offset_y = 0;
		aBool2619 = false;
		model_size_x = 128;
		aBool2618 = false;
		f_kb = -1;
		shadow = true;
		f_ab = true;
		contoured_ground = -1;
		anint2112 = 0;
		blocking_mask = 0;
		offset_height = 0;
		anIntArray2580 = null;
		animation_id = -1;
		aByte2625 = (byte) 0;
		anInt2600 = -1;
		f_ub = -1;
		offset_x = 0;
		occlude_type = -1;
		varp = -1;
		anint2113 = 0;
		name = "null";
		f_qb = false;
		anint2083 = 0;
		ambient_sound = -1;
		rotated = false;
		interact_type = 2;
		obstructs_ground = false;
		config = -1;
	}

	static {
		aClass201_2592 = new OutgoingPacket(39, 7);
	}
}
