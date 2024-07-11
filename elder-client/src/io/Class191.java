package io;

import io.cache.Revision;

final class Class191 {
	static int anInt2678;
	static int anInt2679;
	public static HashMap obj_type_cache = new HashMap(64), obj_type_cache_OSRS = new HashMap(64),
			obj_type_cache_550 = new HashMap(64);
	static int anInt2681;
	static String[] aStringArray2682 = new String[8];
	static int anInt2683;
	static int anInt2684;
	static int anInt2685;
	static int anInt2686;
	static int anInt2687;
	static int anInt2688;
	static int anInt2689;
	int anInt2690;
	static CacheIndex model_cache;
	static CacheIndex osrs_model_cache;
	static CacheIndex model_cache_550;

	int anInt2692;
	static int anInt2693;
	static AbstractSprite[] hit_mark_sprites_592, hit_mark_sprites_osrs, osrs_mapscenes;
	private CacheIndex item_data_cache;
	private CacheIndex osrs_item_data_cache;
	private CacheIndex item_data_cache_550;
	static int anInt2696;
	static int anInt2697;
	private boolean aBool2698;
	static int anInt2699;
	HashMap aClass54_2700 = new HashMap(50);
	Class206 aClass206_2701 = new Class206(250);
	private Class137 aClass137_2702 = new Class137();
	private String[] aStringArray2703;
	private ParamLoader aClass163_2704;
	int anInt2705;
	private String[] aStringArray2706;

	final AbstractSprite method1247(boolean bool, PlayerComposition class27, Font class116, int i, int i_0_,
			SceneGraph class260,
			boolean bool_1_, int i_2_, int i_3_, int i_4_, boolean bool_5_, SceneGraph class260_6_) {
		try {
			anInt2681++;
			AbstractSprite class_l = method1248(class260_6_, i, -127, class27, i_0_, i_2_, i_4_, i_3_);
			if (class_l != null)
				return class_l;
			if (bool_5_ != true)
				method1259(64);
			ObjType class197 = list(22883, i);
			if (i_2_ > 1 && ((ObjType) class197).countObj != null) {
				int i_7_ = -1;
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -11; i_8_++) {
					if (((((ObjType) class197).countCo[i_8_] ^ 0xffffffff) >= (i_2_ ^ 0xffffffff))
							&& ((((ObjType) class197).countCo[i_8_] ^ 0xffffffff) != -1))
						i_7_ = ((ObjType) class197).countObj[i_8_];
				}
				if (i_7_ != -1)
					class197 = list(22883, i_7_);
			}
			int[] is = class197.method1282(class27, bool, class116, i_2_, i_4_, 0, i_0_, class260_6_, i_3_, class260);
			if (is == null)
				return null;
			AbstractSprite class_l_9_;
			if (bool_1_)
				class_l_9_ = class260.method1706(is, 0, 36, 36, 32);
			else
				class_l_9_ = class260_6_.method1706(is, 0, 36, 36, 32);
			if (!bool_1_) {
				Class137 class137 = new Class137();
				((Class137) class137).aBool1955 = class27 != null;
				((Class137) class137).anInt1952 = i_4_;
				((Class137) class137).anInt1950 = i;
				((Class137) class137).anInt1962 = i_0_;
				((Class137) class137).anInt1949 = i_2_;
				((Class137) class137).anInt1953 = ((SceneGraph) class260_6_).anInt3719;
				((Class137) class137).anInt1957 = i_3_;
				((Class191) this).aClass206_2701.method1354(91, class_l_9_, class137);
			}
			return class_l_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("ro.J(" + bool + ',' + (class27 != null ? "{...}" : "null") + ','
							+ (class116 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ','
							+ (class260 != null ? "{...}" : "null") + ',' + bool_1_ + ',' + i_2_ + ',' + i_3_ + ','
							+ i_4_ + ',' + bool_5_ + ',' + (class260_6_ != null ? "{...}" : "null") + ')'));
		}
	}

	final AbstractSprite method1248(SceneGraph class260, int i, int i_10_, PlayerComposition class27, int i_11_,
			int i_12_, int i_13_,
			int i_14_) {
		try {
			((Class137) aClass137_2702).anInt1957 = i_14_;
			((Class137) aClass137_2702).anInt1953 = ((SceneGraph) class260).anInt3719;
			((Class137) aClass137_2702).anInt1962 = i_11_;
			((Class137) aClass137_2702).anInt1952 = i_13_;
			((Class137) aClass137_2702).aBool1955 = class27 != null;
			((Class137) aClass137_2702).anInt1950 = i;
			anInt2683++;
			((Class137) aClass137_2702).anInt1949 = i_12_;
			if (i_10_ > -112)
				list(24, 119);
			return ((AbstractSprite) ((Class191) this).aClass206_2701.method1347(aClass137_2702, 14278));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("ro.A(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_10_ + ','
							+ (class27 != null ? "{...}" : "null") + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ','
							+ i_14_ + ')'));
		}
	}

	final void method1249(byte i) {
		try {
			anInt2678++;
			synchronized (((Class191) this).aClass206_2701) {
				if (i != 65) {
					/* empty */
				} else
					((Class191) this).aClass206_2701.method1352(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.N(" + i + ')');
		}
	}

	final void method1250(int i) {
		try {
			anInt2685++;
			if (i != 36)
				method1255((byte) 58);
			synchronized (obj_type_cache) {
				obj_type_cache.method383(i ^ 0x4a);
			}
			synchronized (obj_type_cache_550) {
				obj_type_cache_550.method383(i ^ 0x4a);
			}
			synchronized (obj_type_cache_OSRS) {
				obj_type_cache_OSRS.method383(i ^ 0x4a);
			}
			synchronized (((Class191) this).aClass54_2700) {
				((Class191) this).aClass54_2700.method383(112);
			}
			synchronized (((Class191) this).aClass206_2701) {
				((Class191) this).aClass206_2701.method1353(107);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.B(" + i + ')');
		}
	}

	ObjType list(int i, int obj_id) {
		try {
			Revision revision = Settings.data;
			ObjType obj_type;
			if (ObjType.native_osrs(obj_id)) {
				revision = Revision.OSRS;
			} else if (ObjType.native_550(obj_id)) {
				revision = Revision.PRE_EOC_550;
			} else if (ObjType.native_634(obj_id)) {
				revision = Revision.PRE_EOC_634;
			}
			if (revision == Revision.OSRS) {
				if (ObjType.translate_duplicates(obj_id) != -1) {
					obj_id = ObjType.translate_duplicates(obj_id);
				}
			}
			if (revision == Revision.OSRS) {
				synchronized (obj_type_cache_OSRS) {
					obj_type = (ObjType) obj_type_cache_OSRS.method379((long) obj_id, (byte) 58);
				}
			} else if (revision == Revision.PRE_EOC_550) {
				synchronized (obj_type_cache_550) {
					obj_type = (ObjType) obj_type_cache_550.method379((long) obj_id, (byte) 58);
				}
			} else {
				synchronized (obj_type_cache) {
					obj_type = (ObjType) obj_type_cache.method379((long) obj_id, (byte) 58);
				}
			}

			if (obj_type != null)
				return obj_type;
			byte[] data;
			if (revision == Revision.OSRS) {
				data = osrs_item_data_cache.get_file(obj_id, 10);
			} else if (revision == Revision.PRE_EOC_550) {
				data = item_data_cache_550.get_file(Class246_Sub1_Sub4.method2446(i - 22628, obj_id),
						Class213.method1394(obj_id, (byte) 103));
			} else {
				data = item_data_cache.get_file(Class246_Sub1_Sub4.method2446(i - 22628, obj_id),
						Class213.method1394(obj_id, (byte) 103));
			}
			obj_type = new ObjType();
			((ObjType) obj_type).id = obj_id;
			obj_type.revision = revision;
			((ObjType) obj_type).f_ob = this;
			((ObjType) obj_type).options = (new String[] { null, null,
					Class246_Sub1_Sub9.aClass67_6178.get(((Class191) this).anInt2692), null, null });
			((ObjType) obj_type).ops = (new String[] { null, null, null, null,
					Class259_Sub3_Sub1.aClass67_6900.get(((Class191) this).anInt2692) });
			if (data != null)
				obj_type.decode(new Buffer(data), revision);
			obj_type.method1299(i ^ ~0x5901);
			if (((ObjType) obj_type).certTemplate != -1)
				obj_type.method1295(i ^ 0x591e, list(i, ((ObjType) obj_type).note),
						list(22883, ((ObjType) obj_type).certTemplate));
			if ((((ObjType) obj_type).boughtTemplateId ^ 0xffffffff) != 0)
				obj_type.method1287(list(22883, (((ObjType) obj_type).boughtId)),
						list(22883, (((ObjType) obj_type).boughtTemplateId)), true);
			if (!aBool2698 && ((ObjType) obj_type).members) {
				((ObjType) obj_type).name = Class59_Sub5.aClass67_5403.get(((Class191) this).anInt2692);
				((ObjType) obj_type).team = 0;
				((ObjType) obj_type).options = aStringArray2706;
				((ObjType) obj_type).anIntArray2772 = null;
				((ObjType) obj_type).isTradeable = false;
				((ObjType) obj_type).ops = aStringArray2703;
				if (((ObjType) obj_type).aClass85_2810 != null) {
					boolean bool = false;
					for (Node class246 = ((ObjType) obj_type).aClass85_2810
							.first((byte) -23); class246 != null; class246 = ((ObjType) obj_type).aClass85_2810
									.next((byte) -20)) {
						ParamType class118 = ParamType.list((int) (((Node) class246).hash));
						if (((ParamType) class118).aBool1633)
							class246.remove();
						else
							bool = true;
					}
					if (!bool)
						((ObjType) obj_type).aClass85_2810 = null;
				}
			}
			if (revision == Revision.OSRS) {
				synchronized (obj_type_cache_OSRS) {
					obj_type_cache_OSRS.method371(1, (long) obj_id, obj_type);
				}
			} else if (revision == Revision.PRE_EOC_550) {
				synchronized (obj_type_cache_550) {
					obj_type_cache_550.method371(1, (long) obj_id, obj_type);
				}
			} else {
				synchronized (obj_type_cache) {
					obj_type_cache.method371(1, (long) obj_id, obj_type);
				}
			}
			return obj_type;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	final ObjType list(int i, int obj_id, Revision revision) {
		try {
			ObjType obj_type;
			if (revision == Revision.OSRS) {
				synchronized (obj_type_cache_OSRS) {
					obj_type = (ObjType) obj_type_cache_OSRS.method379((long) obj_id, (byte) 58);
				}
			} else if (revision == Revision.PRE_EOC_550) {
				synchronized (obj_type_cache) {
					obj_type = (ObjType) obj_type_cache.method379((long) obj_id, (byte) 58);
				}
			} else {
				synchronized (obj_type_cache_550) {
					obj_type = (ObjType) obj_type_cache_550.method379((long) obj_id, (byte) 58);
				}
			}

			if (obj_type != null)
				return obj_type;
			byte[] data;
			if (revision == Revision.OSRS) {
				data = osrs_item_data_cache.get_file(obj_id, 10);
			} else if (revision == Revision.PRE_EOC_550) {
				data = item_data_cache_550.get_file(Class246_Sub1_Sub4.method2446(i - 22628, obj_id),
						Class213.method1394(obj_id, (byte) 103));
			} else {
				data = item_data_cache.get_file(Class246_Sub1_Sub4.method2446(i - 22628, obj_id),
						Class213.method1394(obj_id, (byte) 103));
			}
			obj_type = new ObjType();
			((ObjType) obj_type).id = obj_id;
			obj_type.revision = revision;
			((ObjType) obj_type).f_ob = this;
			((ObjType) obj_type).options = (new String[] { null, null,
					Class246_Sub1_Sub9.aClass67_6178.get(((Class191) this).anInt2692), null, null });
			((ObjType) obj_type).ops = (new String[] { null, null, null, null,
					Class259_Sub3_Sub1.aClass67_6900.get(((Class191) this).anInt2692) });
			if (i != 22883)
				anInt2689 = -127;
			if (data != null)
				obj_type.decode(new Buffer(data), revision);
			obj_type.method1299(i ^ ~0x5901);
			if (((ObjType) obj_type).certTemplate != -1)
				obj_type.method1295(i ^ 0x591e, list(i, ((ObjType) obj_type).note),
						list(22883, ((ObjType) obj_type).certTemplate));
			if ((((ObjType) obj_type).boughtTemplateId ^ 0xffffffff) != 0)
				obj_type.method1287(list(22883, (((ObjType) obj_type).boughtId)),
						list(22883, (((ObjType) obj_type).boughtTemplateId)), true);
			if (!aBool2698 && ((ObjType) obj_type).members) {
				((ObjType) obj_type).name = Class59_Sub5.aClass67_5403.get(((Class191) this).anInt2692);
				((ObjType) obj_type).team = 0;
				((ObjType) obj_type).options = aStringArray2706;
				((ObjType) obj_type).anIntArray2772 = null;
				((ObjType) obj_type).isTradeable = false;
				((ObjType) obj_type).ops = aStringArray2703;
				if (((ObjType) obj_type).aClass85_2810 != null) {
					boolean bool = false;
					for (Node class246 = ((ObjType) obj_type).aClass85_2810
							.first((byte) -23); class246 != null; class246 = ((ObjType) obj_type).aClass85_2810
									.next((byte) -20)) {
						ParamType class118 = ParamType.list((int) (((Node) class246).hash));
						if (((ParamType) class118).aBool1633)
							class246.remove();
						else
							bool = true;
					}
					if (!bool)
						((ObjType) obj_type).aClass85_2810 = null;
				}
			}
			if (revision == Revision.OSRS) {
				synchronized (obj_type_cache_OSRS) {
					obj_type_cache_OSRS.method371(1, (long) obj_id, obj_type);
				}
			} else if (revision == Revision.PRE_EOC_550) {
				synchronized (obj_type_cache_550) {
					obj_type_cache_550.method371(1, (long) obj_id, obj_type);
				}
			} else {
				synchronized (obj_type_cache) {
					obj_type_cache.method371(1, (long) obj_id, obj_type);
				}
			}
			return obj_type;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.G(" + i + ',' + obj_id + ')');
		}
	}

	final void method1252(boolean bool, boolean bool_16_) {
		do {
			try {
				anInt2693++;
				if (bool != aBool2698) {
					aBool2698 = bool;
					method1255((byte) -73);
					if (bool_16_ == true)
						break;
					method1255((byte) 69);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ro.K(" + bool + ',' + bool_16_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1253(Player class_r_sub1, byte i) {
		do {
			try {
				anInt2688++;
				Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class187.aClass85_2651
						.get((long) (((Entity) class_r_sub1).f_db)));
				if (i <= 24)
					method1257(27, -65, 92, 95, -84, (byte) 1);
				if (class246_sub5 == null)
					break;
				if (((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 != null) {
					Canvas_Sub1.aClass246_Sub37_Sub2_6889
							.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893);
					((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 = null;
				}
				class246_sub5.remove();
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception,
						("ro.M(" + (class_r_sub1 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method1254(int i, int i_17_) {
		try {
			synchronized (obj_type_cache) {
				obj_type_cache.method380(i_17_, -50);
			}
			synchronized (obj_type_cache_550) {
				obj_type_cache_550.method380(i_17_, -50);
			}
			synchronized (obj_type_cache_OSRS) {
				obj_type_cache_OSRS.method380(i_17_, -50);
			}
			anInt2696++;
			synchronized (((Class191) this).aClass54_2700) {
				((Class191) this).aClass54_2700.method380(i_17_, -50);
			}
			synchronized (((Class191) this).aClass206_2701) {
				((Class191) this).aClass206_2701.method1351(122, i_17_);
			}
			int i_18_ = -67 / ((i + 33) / 53);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.E(" + i + ',' + i_17_ + ')');
		}
	}

	final void method1255(byte i) {
		try {
			synchronized (obj_type_cache) {
				obj_type_cache.method369(false);
			}
			synchronized (obj_type_cache_550) {
				obj_type_cache_550.method369(false);
			}
			synchronized (obj_type_cache_OSRS) {
				obj_type_cache_OSRS.method369(false);
			}
			if (i != -73)
				aStringArray2703 = null;
			anInt2686++;
			synchronized (((Class191) this).aClass54_2700) {
				((Class191) this).aClass54_2700.method369(false);
			}
			synchronized (((Class191) this).aClass206_2701) {
				((Class191) this).aClass206_2701.method1352(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.C(" + i + ')');
		}
	}

	public static void method1256(int i) {
		do {
			try {
				aStringArray2682 = null;
				hit_mark_sprites_592 = null;
				hit_mark_sprites_osrs = null;
				osrs_mapscenes = null;
				if (i == 1)
					break;
				method1257(-97, -47, -51, 6, 58, (byte) -45);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ro.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1257(int i, int i_19_, int i_20_, int i_21_, int i_22_, byte i_23_) {
		try {
			int i_24_ = 22 % ((i_23_ - 67) / 35);
			do {
				if ((ObjType.anInt2818 ^ 0xffffffff) < (i_19_ ^ 0xffffffff) || Class110.anInt1573 < i_21_
						|| (AbstractModel.anInt1442 ^ 0xffffffff) < (i_22_ ^ 0xffffffff)
						|| ((Class109_Sub4.anInt4570 ^ 0xffffffff) > (i ^ 0xffffffff))) {
					Class15.method159(i_22_, i_20_, -81, i_21_, i_19_, i);
					if (!Client.f_ob)
						break;
				}
				Class246_Sub38.method2295(i_19_, i, i_20_, (byte) 113, i_21_, i_22_);
			} while (false);
			anInt2687++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("ro.L(" + i + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	final void method1258(byte i) {
		try {
			synchronized (((Class191) this).aClass54_2700) {
				if (i >= -68)
					return;
				((Class191) this).aClass54_2700.method369(false);
			}
			anInt2697++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.F(" + i + ')');
		}
	}

	static final void method1259(int i) {
		try {
			do {
				if (Client.sprite_loader.method1732()) {
					Client.sprite_loader.method1704(GameEngine.canvas);
					Class75.method473((byte) 56);
					Client.sprite_loader.method1690(GameEngine.canvas);
					Client.sprite_loader.method1691(GameEngine.canvas);
					if (!Client.f_ob)
						break;
				}
				Class129.method883(Buffer.anInt5656, (byte) 117);
			} while (false);
			anInt2679++;
			if (i > -30)
				aStringArray2682 = null;
			Class205.method1341(-11712);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.I(" + i + ')');
		}
	}

	final void method1260(int i, int i_25_) {
		try {
			if (i_25_ == 8) {
				anInt2699++;
				((Class191) this).anInt2705 = i;
				synchronized (((Class191) this).aClass54_2700) {
					((Class191) this).aClass54_2700.method369(false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.D(" + i + ',' + i_25_ + ')');
		}
	}

	Class191(Class101 class101, int i, boolean bool, ParamLoader class163, CacheIndex data_cache,
			CacheIndex model_cache, CacheIndex osrs_data_cache, CacheIndex osrs_model_cache, CacheIndex data_cache_550,
			CacheIndex model_cache_550) {
		try {
			aClass163_2704 = class163;
			((Class191) this).model_cache = model_cache;
			((Class191) this).osrs_model_cache = osrs_model_cache;
			((Class191) this).model_cache_550 = model_cache_550;
			item_data_cache = data_cache;
			osrs_item_data_cache = osrs_data_cache;
			item_data_cache_550 = data_cache_550;
			aBool2698 = bool;
			((Class191) this).anInt2692 = i;
			do {
				if (item_data_cache != null) {
					int i_27_ = -1 + item_data_cache.method87((byte) 39);
					((Class191) this).anInt2690 = item_data_cache.child_count(i_27_) + 256 * i_27_;
					if (!Client.f_ob)
						break;
				}
				((Class191) this).anInt2690 = 0;
			} while (false);
			do {
				if (osrs_item_data_cache != null) {
					int i_27_ = -1 + osrs_item_data_cache.method87((byte) 39);
					((Class191) this).anInt2690 = osrs_item_data_cache.child_count(i_27_) + 256 * i_27_;
					if (!Client.f_ob)
						break;
				}
				((Class191) this).anInt2690 = 0;
			} while (false);
			do {
				if (item_data_cache_550 != null) {
					int i_27_ = -1 + item_data_cache_550.method87((byte) 39);
					((Class191) this).anInt2690 = item_data_cache_550.child_count(i_27_) + 256 * i_27_;
					if (!Client.f_ob)
						break;
				}
				((Class191) this).anInt2690 = 0;
			} while (false);
			aStringArray2706 = (new String[] { null, null,
					Class246_Sub1_Sub9.aClass67_6178.get(((Class191) this).anInt2692), null, null });
			aStringArray2703 = (new String[] { null, null, null, null,
					Class259_Sub3_Sub1.aClass67_6900.get(((Class191) this).anInt2692) });
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("ro.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + bool + ','
							+ (class163 != null ? "{...}" : "null") + ',' + (data_cache != null ? "{...}" : "null")
							+ ',' + (model_cache != null ? "{...}" : "null") + ')'));
		}
	}
}
