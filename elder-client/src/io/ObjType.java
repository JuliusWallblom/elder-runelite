package io;

import io.cache.CacheType;
import io.cache.Revision;
import net.runelite.api.IterableHashTable;
import net.runelite.rs.api.RSItemComposition;
import net.runelite.rs.api.RSIterableNodeHashTable;
import net.runelite.rs.api.RSModel;

public final class ObjType extends CacheType implements RSItemComposition {

	Revision revision;

	@Override
	public Revision revision() {
		return this.revision;
	}

	int yan2d = 0;
	static short[] aShortArray2759 = { 6798, 8741, 25238, 4626, 4550 };
	static int anInt2760;
	private byte[] aByteArray2761;
	int anInt2762;
	private int maleHeadModel2 = -1;
	private short[] colorReplace;
	int anInt2765;
	int anInt2766;
	static int anInt2767;
	static int anInt2768;
	static OutgoingPacket NPC_CLICK_1_PACKET_NEW;
	static Buffer[] aStreamArray2770 = new Buffer[2048];
	private int ambient;
	int[] anIntArray2772;
	static int anInt2773;
	boolean isTradeable;
	private int anInt2775;
	int xan2d;
	private int anInt2777 = 0;
	String name;
	String[] ops;
	int zan2d;
	private int anInt2781 = 0;
	int[] countObj;
	int zoom2d;
	private short[] textureReplace;
	int boughtId;
	static int anInt2786;
	private int anInt2787;
	static int anInt2788;
	static int anInt2789;
	int anInt2790;
	private int resizeY;
	private int anInt2792;
	private int contrast;
	boolean members;
	private int femaleHeadModel;
	String[] options;
	private short[] textureFind;
	private int resizeZ;
	static int anInt2799;
	private int femaleModel1;
	int anInt2801;
	int offsetX2d;
	int anInt2803;
	static int anInt2804;
	int anInt2805;
	int femaleModel0;
	int maleModel0;
	static int anInt2808;
	private int femaleModel2;
	int f_ab;
	private int femaleHeadModel2;
	int note;
	static int f_db;
	int stackability;
	int cost;
	int[] countCo;
	static int f_hb;
	private short[] colorFind;
	static int f_jb;
	private int maleHeadModel;
	int offsetY2d;
	static int f_mb;
	private int maleModel2;
	Class191 f_ob;
	int id;
	static int f_qb;
	static int f_rb;
	private int f_sb;
	int certTemplate;
	private int maleModel1;
	static int f_vb;
	private int inventoryModel;
	IterableNodeHashTable aClass85_2810;
	static int anInt2811;
	private int resizeX;
	int team;
	static int anInt2814;
	static int anInt2815;
	int anInt2816;
	int boughtTemplateId;
	static int anInt2818;

	public CacheIndex item_model_cache() {
		if (this.revision == Revision.OSRS) {
			return Class191.osrs_model_cache;
		} else if (this.revision == Revision.PRE_EOC_550) {
			return Class191.model_cache_550;
		} else {
			return Class191.model_cache;
		}
	}

	final AbstractModel method1281(int i, int i_0_, SequenceType class124, int i_1_, int i_2_,
			PlayerComposition class27,
			int i_3_, int i_4_, SceneGraph class260) {
		try {
			f_rb++;
			if (i_4_ > -120)
				return null;
			if (((ObjType) this).countObj != null && i_0_ > 1) {
				int i_5_ = -1;
				for (int i_6_ = 0; i_6_ < 10; i_6_++) {
					if (((ObjType) this).countCo[i_6_] <= i_0_ && ((ObjType) this).countCo[i_6_] != 0)
						i_5_ = ((ObjType) this).countObj[i_6_];
				}
				if (i_5_ != -1)
					return (((ObjType) this).f_ob.list(22883, i_5_).method1281(i, 1, class124, i_1_, i_2_, class27,
							i_3_, -128, class260));
			}
			int i_7_ = i_1_;
			if (class124 != null)
				i_7_ |= class124.method847(i_3_, 256, i_2_, true);
			AbstractModel class_t;
			synchronized (((Class191) ((ObjType) this).f_ob).aClass54_2700) {
				class_t = ((AbstractModel) (((Class191) ((ObjType) this).f_ob).aClass54_2700
						.method379((long) (((ObjType) this).id | ((SceneGraph) class260).anInt3719 << 29), (byte) 58)));
			}
			if (class_t == null || class260.method1710(class_t.P(), i_7_) != 0) {
				if (class_t != null)
					i_7_ = class260.method1723(i_7_, class_t.P());
				int i_8_ = i_7_;
				if (textureFind != null)
					i_8_ |= 0x8000;
				if (colorFind != null || class27 != null)
					i_8_ |= 0x4000;
				if (resizeX != 128)
					i_8_ |= 0x1;
				if (resizeX != 128)
					i_8_ |= 0x2;
				if (resizeX != 128)
					i_8_ |= 0x4;
				Model class103 = Model.get_model(0, (this.item_model_cache()),
						inventoryModel, revision);
				if (class103 == null)
					return null;
				if (((Model) class103).anInt1358 < 13)
					class103.method646(0, (byte) -73);
				class_t = class260.method1695(class103, i_8_, (((Class191) ((ObjType) this).f_ob).anInt2705),
						ambient + 64, 850 - -contrast);
				if (resizeX != 128 || resizeY != 128 || resizeZ != 128)
					class_t.H(resizeX, resizeY, resizeZ);
				if (colorFind != null) {
					for (int i_9_ = 0; i_9_ < colorFind.length; i_9_++) {
						if (aByteArray2761 != null && aByteArray2761.length > i_9_)
							class_t.BA(colorFind[i_9_], (Class90.aShortArray1172[aByteArray2761[i_9_] & 0xff]));
						else
							class_t.BA(colorFind[i_9_], colorReplace[i_9_]);
					}
				}
				if (textureFind != null) {
					for (int i_10_ = 0; textureFind.length > i_10_; i_10_++)
						class_t.I(textureFind[i_10_], textureReplace[i_10_]);
				}
				if (class27 != null) {
					for (int i_11_ = 0; i_11_ < 5; i_11_++) {
						if (((PlayerComposition) class27).body_colors[i_11_] < (Class246_Sub30_Sub1.aShortArrayArray5767[i_11_]).length)
							class_t.BA(Class160.aShortArray2270[i_11_],
									(Class246_Sub30_Sub1.aShortArrayArray5767[i_11_][(((PlayerComposition) class27).body_colors[i_11_])]));
						if (((PlayerComposition) class27).body_colors[i_11_] < (Class246_Sub1_Sub2.aShortArrayArray5693[i_11_]).length)
							class_t.BA(Node.aShortArray3466[i_11_],
									(Class246_Sub1_Sub2.aShortArrayArray5693[i_11_][(((PlayerComposition) class27).body_colors[i_11_])]));
					}
				}
				class_t.UA(i_7_);
				synchronized (((Class191) ((ObjType) this).f_ob).aClass54_2700) {
					((Class191) ((ObjType) this).f_ob).aClass54_2700.method371(1,
							(long) (((SceneGraph) class260).anInt3719 << 29 | ((ObjType) this).id), class_t);
				}
			}
			if (class124 != null)
				class_t = class124.method846(i, i_7_, i_2_, i_3_, class_t, -108);
			class_t.UA(i_1_);
			return class_t;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("rv.M(" + i + ',' + i_0_ + ',' + (class124 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_
							+ ',' + (class27 != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ','
							+ (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method1282(PlayerComposition class27, boolean bool, Font class116, int i, int i_12_, int i_13_,
			int i_14_,
			SceneGraph class260, int i_15_, SceneGraph class260_16_) {
		try {
			anInt2788++;
			Model class103 = Model.get_model(0, (this.item_model_cache()),
					inventoryModel, revision);
			if (class103 == null)
				return null;
			if (((Model) class103).anInt1358 < 13)
				class103.method646(0, (byte) -44);
			if (colorFind != null) {
				for (int i_17_ = 0; colorFind.length > i_17_; i_17_++) {
					if (aByteArray2761 != null && aByteArray2761.length > i_17_)
						class103.method662(colorFind[i_17_], (Class90.aShortArray1172[0xff & aByteArray2761[i_17_]]),
								false);
					else
						class103.method662(colorFind[i_17_], colorReplace[i_17_], false);
				}
			}
			if (textureFind != null) {
				for (int i_18_ = 0; (i_18_ < textureFind.length); i_18_++)
					class103.method645(textureReplace[i_18_], 0, textureFind[i_18_]);
			}
			if (class27 != null) {
				for (int i_19_ = 0; i_19_ < 5; i_19_++) {
					if ((Class246_Sub30_Sub1.aShortArrayArray5767[i_19_]).length > ((PlayerComposition) class27).body_colors[i_19_])
						class103.method662(Class160.aShortArray2270[i_19_],
								(Class246_Sub30_Sub1.aShortArrayArray5767[i_19_][(((PlayerComposition) class27).body_colors[i_19_])]),
								false);
					if ((Class246_Sub1_Sub2.aShortArrayArray5693[i_19_]).length > ((PlayerComposition) class27).body_colors[i_19_])
						class103.method662(Node.aShortArray3466[i_19_],
								(Class246_Sub1_Sub2.aShortArrayArray5693[i_19_][(((PlayerComposition) class27).body_colors[i_19_])]),
								false);
				}
			}
			int i_20_ = 2048;
			boolean bool_21_ = false;
			if (resizeX != 128 || resizeY != 128 || resizeZ != 128) {
				bool_21_ = true;
				i_20_ |= 0x7;
			}
			AbstractModel class_t = class260_16_.method1695(class103, i_20_, 0, 64 + ambient, contrast + 768);
			if (!class_t.method681())
				return null;
			if (bool_21_)
				class_t.H(resizeX, resizeY, resizeZ);
			AbstractSprite class_l = null;
			if (((ObjType) this).certTemplate == -1) {
				if (((ObjType) this).boughtTemplateId != -1) {
					class_l = ((ObjType) this).f_ob.method1247(false, class27, class116, (((ObjType) this).boughtId), 0,
							class260_16_, true, i, i_15_, i_12_, true, class260);
					if (class_l == null)
						return null;
				}
			} else {
				class_l = ((ObjType) this).f_ob.method1247(true, class27, class116, ((ObjType) this).note, 0,
						class260_16_, true, 10, 0, 1, true, class260);
				if (class_l == null)
					return null;
			}
			int i_22_;
			if (!bool) {
				if (i_12_ != 2)
					i_22_ = ((ObjType) this).zoom2d << 0;
				else
					i_22_ = (int) ((double) ((ObjType) this).zoom2d * 1.04) << 0;
			} else
				i_22_ = (int) ((double) ((ObjType) this).zoom2d * 1.5) << 0;
			class260_16_.H(16, 16, 512, 512);
			Class_c class_c = class260_16_.method1715();
			class_c.xa();
			class260_16_.ea(class_c);
			class260_16_.B(1.0F);
			class260_16_.T(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
			Class_c class_c_23_ = class260_16_.method1730();
			class_c_23_.O(-((ObjType) this).zan2d << 3);
			class_c_23_.ja(((ObjType) this).yan2d << 3);
			class_c_23_.o(((ObjType) this).offsetX2d,
					((MathUtils.SINE[((ObjType) this).xan2d << 3] * i_22_) >> 15) - class_t.MA() / 2
							- -((ObjType) this).offsetY2d,
					(i_22_ * (MathUtils.COSINE[((ObjType) this).xan2d << 3]) >> 15) + ((ObjType) this).offsetY2d);
			class_c_23_.ka(((ObjType) this).xan2d << 3);
			int i_24_ = class260_16_.a();
			int i_25_ = class260_16_.YA();
			class260_16_.ia(50, 2147483647);
			class260_16_.method1707();
			class260_16_.e();
			class260_16_.O(0, 0, 36, 32, 0, 0);
			class_t.method680(class_c_23_, null, 1);
			class260_16_.ia(i_24_, i_25_);
			int[] is = class260_16_.F(0, 0, 36, 32);
			if (i_12_ >= 1) {
				is = method1283(is, i_13_ ^ 0x41f1, -16777214);
				if (i_12_ >= 2)
					is = method1283(is, 16881, -1);
			}
			if (i_15_ != 0)
				method1290(10624, i_15_, is);
			class260_16_.method1706(is, 0, 36, 36, 32).draw_sprite(0, i_13_);
			if (((ObjType) this).certTemplate != -1)
				class_l.draw_sprite(0, 0);
			else if (((ObjType) this).boughtTemplateId != -1)
				class_l.draw_sprite(0, 0);
			if (i_14_ == 1 || i_14_ == 2 && (((ObjType) this).stackability == 1 || i != 1) && i != -1)
				class116.draw_text(-16777215, -256, method1286(i, -18536), 0, 9, 0);
			is = class260_16_.F(0, 0, 36, 32);
			for (int i_26_ = 0; i_26_ < is.length; i_26_++) {
				if ((is[i_26_] & 0xffffff) != 0)
					is[i_26_] = Class236.method1523(is[i_26_], -16777216);
				else
					is[i_26_] = 0;
			}
			return is;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private final int[] method1283(int[] is, int i, int i_27_) {
		try {
			anInt2814++;
			int[] is_28_ = new int[1152];
			if (i != 16881)
				((ObjType) this).countObj = null;
			int i_29_ = 0;
			for (int i_30_ = 0; i_30_ < 32; i_30_++) {
				for (int i_31_ = 0; i_31_ < 36; i_31_++) {
					int i_32_ = is[i_29_];
					if (i_32_ == 0) {
						if (i_31_ <= 0 || is[i_29_ - 1] == 0) {
							if (i_30_ > 0 && is[-36 + i_29_] != 0)
								i_32_ = i_27_;
							else if (i_31_ < 35 && is[1 + i_29_] != 0)
								i_32_ = i_27_;
							else if (i_30_ < 31 && is[i_29_ + 36] != 0)
								i_32_ = i_27_;
						} else
							i_32_ = i_27_;
					}
					is_28_[i_29_++] = i_32_;
				}
			}
			return is_28_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("rv.G(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_27_ + ')'));
		}
	}

	final boolean method1284(int i, boolean bool) {
		try {
			if (i < 110)
				return false;
			anInt2767++;
			int i_33_ = maleHeadModel;
			int i_34_ = maleHeadModel2;
			if (bool) {
				i_33_ = femaleHeadModel;
				i_34_ = femaleHeadModel2;
			}
			if (i_33_ == -1)
				return true;
			boolean bool_35_ = true;
			if (!this.item_model_cache().method85(0, (byte) -124, i_33_))
				bool_35_ = false;
			if (i_34_ != -1 && !this.item_model_cache().method85(0, (byte) -124, i_34_))
				bool_35_ = false;
			return bool_35_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.E(" + i + ',' + bool + ')');
		}
	}

	static final void method1285(int i, int i_36_, int i_37_) {
		Tile class147 = Class106.tiles[i][i_36_][i_37_];
		if (class147 != null) {
			if (((Tile) class147).aClass59_Sub4_2172 != null)
				((Tile) class147).aClass59_Sub4_2172 = null;
			if (((Tile) class147).aClass59_Sub4_2152 != null)
				((Tile) class147).aClass59_Sub4_2152 = null;
		}
	}

	private final String method1286(int i, int i_38_) {
		try {
			f_jb++;
			if (i < 100000)
				return "<col=ffff00>" + i + "</col>";
			if (i < 10000000)
				return ("<col=ffffff>" + i / 1000
						+ Class99.aClass67_1287.get(((Class191) (((ObjType) this).f_ob)).anInt2692) + "</col>");
			if (i_38_ != -18536)
				((ObjType) this).maleModel0 = 124;
			return ("<col=00ff80>" + i / 1000000
					+ Class_j.aClass67_1486.get((((Class191) ((ObjType) this).f_ob).anInt2692)) + "</col>");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.I(" + i + ',' + i_38_ + ')');
		}
	}

	final void method1287(ObjType class197_39_, ObjType class197_40_, boolean bool) {
		try {
			femaleHeadModel2 = class197_39_.femaleHeadModel2;
			textureFind = class197_39_.textureFind;
			anInt2799++;
			femaleModel1 = class197_39_.femaleModel1;
			anInt2775 = class197_39_.anInt2775;
			anInt2792 = class197_39_.anInt2792;
			maleModel2 = class197_39_.maleModel2;
			((ObjType) this).cost = 0;
			((ObjType) this).options = ((ObjType) class197_39_).options;
			maleHeadModel2 = class197_39_.maleHeadModel2;
			((ObjType) this).name = ((ObjType) class197_39_).name;
			((ObjType) this).zoom2d = ((ObjType) class197_40_).zoom2d;
			((ObjType) this).xan2d = ((ObjType) class197_40_).xan2d;
			femaleHeadModel = class197_39_.femaleHeadModel;
			colorFind = class197_39_.colorFind;
			((ObjType) this).zan2d = ((ObjType) class197_40_).zan2d;
			maleModel1 = class197_39_.maleModel1;
			anInt2781 = class197_39_.anInt2781;
			f_sb = class197_39_.f_sb;
			colorReplace = class197_39_.colorReplace;
			((ObjType) this).offsetX2d = ((ObjType) class197_40_).offsetX2d;
			maleHeadModel = class197_39_.maleHeadModel;
			((ObjType) this).femaleModel0 = ((ObjType) class197_39_).femaleModel0;
			((ObjType) this).offsetY2d = ((ObjType) class197_40_).offsetY2d;
			aByteArray2761 = class197_39_.aByteArray2761;
			((ObjType) this).team = ((ObjType) class197_39_).team;
			textureReplace = class197_39_.textureReplace;
			((ObjType) this).aClass85_2810 = ((ObjType) class197_39_).aClass85_2810;
			((ObjType) this).members = ((ObjType) class197_39_).members;
			((ObjType) this).yan2d = ((ObjType) class197_40_).yan2d;
			anInt2777 = class197_39_.anInt2777;
			anInt2787 = class197_39_.anInt2787;
			((ObjType) this).maleModel0 = ((ObjType) class197_39_).maleModel0;
			inventoryModel = class197_40_.inventoryModel;
			femaleModel2 = class197_39_.femaleModel2;
			((ObjType) this).ops = new String[5];
			if (((ObjType) class197_39_).ops != null) {
				for (int i = 0; i < 4; i++)
					((ObjType) this).ops[i] = ((ObjType) class197_39_).ops[i];
			}
			((ObjType) this).ops[4] = Class18.aClass67_267.get((((Class191) ((ObjType) this).f_ob).anInt2692));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.S(" + (class197_39_ != null ? "{...}" : "null") + ','
					+ (class197_40_ != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	/*
	 * OSRS additions.
	 */
	private int shiftClickIndex;
	public int placeholderLink;
	public int placeholderTemplate;

	public void process_op_osrs(int opcode, Buffer buffer) {
		if (opcode == 1) {
			inventoryModel = buffer.readUnsignedShort();
		} else if (opcode == 2) {
			name = buffer.readString();
		} else if (opcode == 3) {
			String examine = buffer.readString();
		} else if (opcode == 4) {
			zoom2d = buffer.readUnsignedShort();
		} else if (opcode == 5) {
			xan2d = buffer.readUnsignedShort();
		} else if (opcode == 6) {
			yan2d = buffer.readUnsignedShort();
		} else if (opcode == 7) {
			offsetX2d = buffer.readUnsignedShort();
			if (offsetX2d > 32767) {
				offsetX2d -= 0x10000;
			}
		} else if (opcode == 8) {
			offsetY2d = buffer.readUnsignedShort();
			if (offsetY2d > 32767) {
				offsetY2d -= 0x10000;
			}
		} else if (opcode == 9) {
			buffer.readString();
		} else if (opcode == 11) {
			stackability = 1;
		} else if (opcode == 12) {
			cost = buffer.readInt();
		} else if (opcode == 13) {
			int wearPos1 = buffer.readByte();
		} else if (opcode == 14) {
			int wearPos2 = buffer.readByte();
		} else if (opcode == 16) {
			members = true;
		} else if (opcode == 23) {
			maleModel0 = buffer.readUnsignedShort();
			int maleOffset = buffer.readUnsignedByte();
		} else if (opcode == 24) {
			maleModel1 = buffer.readUnsignedShort();
		} else if (opcode == 25) {
			femaleModel0 = buffer.readUnsignedShort();
			int femaleOffset = buffer.readUnsignedByte();
		} else if (opcode == 26) {
			femaleModel1 = buffer.readUnsignedShort();
		} else if (opcode == 27) {
			int wearPos3 = buffer.readByte();

		} else if (opcode >= 30 && opcode < 35) {
			options[opcode - 30] = buffer.readString();
			if (options[opcode - 30].equalsIgnoreCase("Hidden")) {
				options[opcode - 30] = null;
			}
		} else if (opcode >= 35 && opcode < 40) {
			if (ops == null) {
				ops = new String[5];
			}
			ops[opcode - 35] = buffer.readString();
		} else if (opcode == 40) {
			int j = buffer.readUnsignedByte();
			colorFind = new short[j];
			colorReplace = new short[j];
			for (int k = 0; k < j; k++) {
				colorFind[k] = (short) buffer.readUnsignedShort();
				colorReplace[k] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 41) {
			int var5 = buffer.readUnsignedByte();
			textureFind = new short[var5];
			textureReplace = new short[var5];
			for (int var4 = 0; var4 < var5; ++var4) {
				textureFind[var4] = (short) buffer.readUnsignedShort();
				textureReplace[var4] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 42) {
			shiftClickIndex = buffer.readByte();
		} else if (opcode == 65) {
			isTradeable = true;
		} else if (opcode == 75) {
			int weight = buffer.readShort();
		} else if (opcode == 78) {
			maleModel2 = buffer.readUnsignedShort();
		} else if (opcode == 79) {
			femaleModel2 = buffer.readUnsignedShort();
		} else if (opcode == 90) {
			maleHeadModel = buffer.readUnsignedShort();
		} else if (opcode == 91) {
			femaleHeadModel = buffer.readUnsignedShort();
		} else if (opcode == 92) {
			maleHeadModel2 = buffer.readUnsignedShort();
		} else if (opcode == 93) {
			femaleHeadModel2 = buffer.readUnsignedShort();
		} else if (opcode == 94) {
			int category = buffer.readUnsignedShort();
		} else if (opcode == 95) {
			zan2d = buffer.readUnsignedShort();
		} else if (opcode == 97) {
			note = buffer.readUnsignedShort();
		} else if (opcode == 98) {
			certTemplate = buffer.readUnsignedShort();
		} else if (opcode >= 100 && opcode < 110) {
			if (countObj == null) {
				countObj = new int[10];
				countCo = new int[10];
			}
			countObj[opcode - 100] = buffer.readUnsignedShort();
			countCo[opcode - 100] = buffer.readUnsignedShort();
		} else if (opcode == 110) {
			resizeX = buffer.readUnsignedShort();
		} else if (opcode == 111) {
			resizeY = buffer.readUnsignedShort();
		} else if (opcode == 112) {
			resizeZ = buffer.readUnsignedShort();
		} else if (opcode == 113) {
			ambient = buffer.readByte();
		} else if (opcode == 114) {
			contrast = buffer.readByte() * 5;
		} else if (opcode == 115) {
			team = buffer.readUnsignedByte();
		} else if (opcode == 139) {
			boughtId = buffer.readUnsignedShort();
		} else if (opcode == 140) {
			boughtTemplateId = buffer.readUnsignedShort();
		} else if (opcode == 148) {
			placeholderLink = buffer.readUnsignedShort();
		} else if (opcode == 149) {
			placeholderTemplate = buffer.readUnsignedShort();
		} else if (opcode == 249) {
			int i_46_ = buffer.readUnsignedByte();
			if (aClass85_2810 == null) {
				int i_47_ = Class206.method1350(i_46_, 269173057);
				aClass85_2810 = new IterableNodeHashTable(i_47_);
			}
			for (int i_48_ = 0; i_46_ > i_48_; i_48_++) {
				boolean bool = buffer.readUnsignedByte() == 1;
				int i_49_ = buffer.read24BitInteger((byte) 29);
				Node class246;
				if (bool)
					class246 = new Class246_Sub4(buffer.readString());
				else
					class246 = new SwitchInt(buffer.readInt());
				aClass85_2810.method547((long) i_49_, 0 ^ ~0x8fc, class246);
			}
		}
	}

	private final void process_op(int opcode, Buffer stream) {
		try {
			f_db++;
			if (opcode == 1)
				inventoryModel = stream.readUnsignedShort();
			else if (opcode == 2) {
				((ObjType) this).name = stream.readString((byte) -40);
			} else if (opcode == 4) {
				((ObjType) this).zoom2d = stream.readUnsignedShort();
			} else if (opcode == 5) {
				((ObjType) this).xan2d = stream.readUnsignedShort();
			} else if (opcode == 6) {
				((ObjType) this).yan2d = stream.readUnsignedShort();
			} else if (opcode == 7) {
				((ObjType) this).offsetX2d = stream.readUnsignedShort();
				if (((ObjType) this).offsetX2d > 32767)
					((ObjType) this).offsetX2d -= 65536;
				((ObjType) this).offsetX2d <<= 0;
			} else if (opcode == 8) {
				((ObjType) this).offsetY2d = stream.readUnsignedShort();
				if (((ObjType) this).offsetY2d > 32767)
					((ObjType) this).offsetY2d -= 65536;
				((ObjType) this).offsetY2d <<= 0;
			} else if (opcode == 11) {
				((ObjType) this).stackability = 1;
			} else if (opcode == 12) {
				((ObjType) this).cost = stream.readInt((byte) 122);
			} else if (opcode == 16)
				((ObjType) this).members = true;
			else if (opcode == 23) {
				((ObjType) this).maleModel0 = stream.readUnsignedShort();
			} else if (opcode == 24) {
				maleModel1 = (stream.readUnsignedShort());
			} else if (opcode == 25) {
				((ObjType) this).femaleModel0 = (stream.readUnsignedShort());
			} else if (opcode == 26) {
				femaleModel1 = (stream.readUnsignedShort());
			} else if (opcode >= 30 && (opcode < 35))
				((ObjType) this).options[-30 + opcode] = (stream.readString());
			else if ((opcode >= 35) && (opcode < 40))
				((ObjType) this).ops[opcode - 35] = (stream.readString());
			else if (opcode == 40) {
				int i_42_ = (stream.readUnsignedByte());
				colorReplace = (new short[i_42_]);
				colorFind = (new short[i_42_]);
				for (int i_43_ = 0; (i_43_ < i_42_); i_43_++) {
					colorFind[i_43_] = (short) stream.readUnsignedShort();
					colorReplace[i_43_] = (short) stream.readUnsignedShort();
				}
			} else if (opcode == 41) {
				int i_52_ = (stream.readUnsignedByte());
				textureReplace = (new short[i_52_]);
				textureFind = (new short[i_52_]);
				for (int i_53_ = 0; (i_53_ < i_52_); i_53_++) {
					textureFind[i_53_] = (short) stream.readUnsignedShort();
					textureReplace[i_53_] = (short) stream.readUnsignedShort();
				}
			} else if (opcode == 42) {
				int i_44_ = (stream.readUnsignedByte());
				aByteArray2761 = (new byte[i_44_]);
				for (int i_45_ = 0; (i_44_ > i_45_); i_45_++)
					aByteArray2761[i_45_] = (stream.readByte());
			} else if (opcode == 65)
				((ObjType) this).isTradeable = true;
			else if (opcode == 78)
				maleModel2 = (stream.readUnsignedShort());
			else if (opcode == 79) {
				femaleModel2 = (stream.readUnsignedShort());
			} else if (opcode == 90) {
				maleHeadModel = (stream.readUnsignedShort());
			} else if (opcode == 91)
				femaleHeadModel = stream.readUnsignedShort();
			else if (opcode == 92) {
				maleHeadModel2 = stream.readUnsignedShort();
			} else if (opcode == 93)
				femaleHeadModel2 = stream.readUnsignedShort();
			else if (opcode == 95)
				((ObjType) this).zan2d = stream.readUnsignedShort();
			else if (opcode == 96)
				((ObjType) this).anInt2801 = stream.readUnsignedByte();
			else if (opcode == 97) {
				((ObjType) this).note = stream.readUnsignedShort();
			} else if (opcode == 98) {
				((ObjType) this).certTemplate = stream.readUnsignedShort();
			} else if (opcode >= 100 && opcode < 110) {
				if (((ObjType) this).countObj == null) {
					((ObjType) this).countObj = new int[10];
					((ObjType) this).countCo = new int[10];
				}
				((ObjType) this).countObj[-100 + opcode] = stream.readUnsignedShort();
				((ObjType) this).countCo[opcode - 100] = stream.readUnsignedShort();
			} else if (opcode == 110) {
				resizeX = stream.readUnsignedShort();
			} else if (opcode == 111)
				resizeY = stream.readUnsignedShort();
			else if (opcode == 112)
				resizeZ = stream.readUnsignedShort();
			else if (opcode == 113)
				ambient = stream.readByte();
			else if (opcode == 114)
				contrast = stream.readByte() * 5;
			else if (opcode == 115) {
				((ObjType) this).team = stream.readUnsignedByte();
			} else if (opcode == 121)
				((ObjType) this).boughtId = stream.readUnsignedShort();
			else if (opcode == 122) {
				((ObjType) this).boughtTemplateId = stream.readUnsignedShort();
			} else if (opcode == 125) {
				f_sb = stream.readByte() << 0;
				anInt2787 = stream.readByte() << 0;
				anInt2781 = stream.readByte() << 0;
			} else if (opcode == 126) {
				anInt2792 = stream.readByte() << 0;
				anInt2775 = stream.readByte() << 0;
				anInt2777 = stream.readByte() << 0;
			} else if (opcode == 127) {
				((ObjType) this).anInt2762 = stream.readUnsignedByte();
				((ObjType) this).anInt2805 = stream.readUnsignedShort();
			} else if (opcode == 128) {
				((ObjType) this).anInt2803 = stream.readUnsignedByte();
				((ObjType) this).anInt2766 = stream.readUnsignedShort();
			} else if (opcode == 129) {
				((ObjType) this).anInt2790 = stream.readUnsignedByte();
				((ObjType) this).f_ab = stream.readUnsignedShort();
			} else if (opcode == 130) {
				((ObjType) this).anInt2816 = stream.readUnsignedByte();
				((ObjType) this).anInt2765 = stream.readUnsignedShort();
			} else if (opcode == 132) {
				int i_50_ = stream.readUnsignedByte();
				((ObjType) this).anIntArray2772 = new int[i_50_];
				for (int i_51_ = 0; i_50_ > i_51_; i_51_++)
					((ObjType) this).anIntArray2772[i_51_] = stream.readUnsignedShort();
			} else if (opcode == 249) {
				int i_46_ = stream.readUnsignedByte();
				if (((ObjType) this).aClass85_2810 == null) {
					int i_47_ = Class206.method1350(i_46_, 269173057);
					((ObjType) this).aClass85_2810 = new IterableNodeHashTable(i_47_);
				}
				for (int i_48_ = 0; i_46_ > i_48_; i_48_++) {
					boolean bool = stream.readUnsignedByte() == 1;
					int i_49_ = stream.read24BitInteger((byte) 29);
					Node class246;
					if (bool)
						class246 = new Class246_Sub4(stream.readString((byte) -40));
					else
						class246 = new SwitchInt(stream.readInt((byte) 114));
					((ObjType) this).aClass85_2810.method547((long) i_49_, 0, class246);
				}
			}
		} catch (Exception e) {
			;
		}
	}

	final int method1289(int i, int i_54_, int i_55_) {
		try {
			anInt2768++;
			if (((ObjType) this).aClass85_2810 == null)
				return i_55_;
			SwitchInt class246_sub33 = ((SwitchInt) ((ObjType) this).aClass85_2810.get((long) i));
			int i_56_ = 52 / ((i_54_ + 40) / 62);
			if (class246_sub33 == null)
				return i_55_;
			return ((SwitchInt) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.F(" + i + ',' + i_54_ + ',' + i_55_ + ')'));
		}
	}

	private final void method1290(int i, int i_57_, int[] is) {
		try {
			for (int i_58_ = 31; i_58_ > 0; i_58_--) {
				int i_59_ = 36 * i_58_;
				for (int i_60_ = 35; i_60_ > 0; i_60_--) {
					if (is[i_59_ + i_60_] == 0 && is[i_59_ + (i_60_ - 37)] != 0)
						is[i_60_ - -i_59_] = i_57_;
				}
			}
			if (i != 10624)
				resizeZ = -113;
			anInt2786++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("rv.D(" + i + ',' + i_57_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final Model method1291(boolean bool, int i) {
		try {
			anInt2773++;
			int i_61_ = ((ObjType) this).maleModel0;
			int i_62_ = maleModel1;
			int i_63_ = maleModel2;
			if (bool) {
				i_63_ = femaleModel2;
				i_61_ = ((ObjType) this).femaleModel0;
				i_62_ = femaleModel1;
			}
			if (i == (i_61_ ^ 0xffffffff))
				return null;
			Model class103 = Model.get_model(0, (this.item_model_cache()), i_61_,
					revision);
			if (((Model) class103).anInt1358 < 13)
				class103.method646(0, (byte) -98);
			if (i_62_ != -1) {
				Model class103_64_ = Model.get_model(0, (this.item_model_cache()),
						i_62_, revision);
				if (((Model) class103_64_).anInt1358 < 13)
					class103_64_.method646(0, (byte) -101);
				if (i_63_ == -1) {
					Model[] class103s = { class103, class103_64_ };
					class103 = new Model(class103s, 2);
				} else {
					Model class103_65_ = Model.get_model(0, (this.item_model_cache()),
							i_63_, revision);
					if (((Model) class103_65_).anInt1358 < 13)
						class103_65_.method646(0, (byte) -91);
					Model[] class103s = { class103, class103_64_, class103_65_ };
					class103 = new Model(class103s, 3);
				}
			}
			if (class103 == null)
				return null;
			if (!bool && (f_sb != 0 || anInt2787 != 0 || anInt2781 != 0))
				class103.method648(anInt2787, f_sb, anInt2781, -35);
			if (bool && (anInt2792 != 0 || anInt2775 != 0 || anInt2777 != 0))
				class103.method648(anInt2775, anInt2792, anInt2777, -58);
			if (colorFind != null) {
				for (int i_66_ = 0; colorFind.length > i_66_; i_66_++)
					class103.method662(colorFind[i_66_], colorReplace[i_66_], false);
			}
			if (textureFind != null) {
				for (int i_67_ = 0; (i_67_ < textureFind.length); i_67_++)
					class103.method645(textureReplace[i_67_], 0, textureFind[i_67_]);
			}
			return class103;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.O(" + bool + ',' + i + ')');
		}
	}

	final boolean method1292(int i, boolean bool) {
		try {
			f_qb++;
			int i_68_ = ((ObjType) this).maleModel0;
			int i_69_ = maleModel1;
			int i_70_ = maleModel2;
			if (bool) {
				i_70_ = femaleModel2;
				i_69_ = femaleModel1;
				i_68_ = ((ObjType) this).femaleModel0;
			}
			if (i_68_ == i)
				return true;
			boolean bool_71_ = true;
			if (!this.item_model_cache().method85(0, (byte) -124, i_68_))
				bool_71_ = false;
			if (i_69_ != -1 && !this.item_model_cache().method85(0, (byte) -124, i_69_))
				bool_71_ = false;
			if (i_70_ != -1 && !this.item_model_cache().method85(0, (byte) -124, i_70_))
				bool_71_ = false;
			return bool_71_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.Q(" + i + ',' + bool + ')');
		}
	}

	static final int method1293(int i, byte i_72_) {
		try {
			if (i_72_ != -12)
				NPC_CLICK_1_PACKET_NEW = null;
			anInt2804++;
			return i >>> 7;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.C(" + i + ',' + i_72_ + ')');
		}
	}

	public static void method1294(int i) {
		try {
			NPC_CLICK_1_PACKET_NEW = null;
			if (i == 0) {
				aStreamArray2770 = null;
				aShortArray2759 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.H(" + i + ')');
		}
	}

	final void method1295(int i, ObjType class197_73_, ObjType class197_74_) {
		try {
			((ObjType) this).zan2d = ((ObjType) class197_74_).zan2d;
			anInt2760++;
			colorReplace = class197_74_.colorReplace;
			colorFind = class197_74_.colorFind;
			((ObjType) this).name = ((ObjType) class197_73_).name;
			((ObjType) this).offsetY2d = ((ObjType) class197_74_).offsetY2d;
			((ObjType) this).zoom2d = ((ObjType) class197_74_).zoom2d;
			((ObjType) this).xan2d = ((ObjType) class197_74_).xan2d;
			textureFind = class197_74_.textureFind;
			((ObjType) this).yan2d = ((ObjType) class197_74_).yan2d;
			((ObjType) this).members = ((ObjType) class197_73_).members;
			aByteArray2761 = class197_74_.aByteArray2761;
			textureReplace = class197_74_.textureReplace;
			if (i <= 108)
				method1282(null, true, null, -75, -3, -98, 22, null, -48, null);
			((ObjType) this).stackability = 1;
			inventoryModel = class197_74_.inventoryModel;
			((ObjType) this).cost = ((ObjType) class197_73_).cost;
			((ObjType) this).offsetX2d = ((ObjType) class197_74_).offsetX2d;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.J(" + i + ',' + (class197_73_ != null ? "{...}" : "null")
					+ ',' + (class197_74_ != null ? "{...}" : "null") + ')'));
		}
	}

	final ObjType method1296(int i, int i_75_) {
		try {
			if (i_75_ != 4223)
				((ObjType) this).cost = -6;
			anInt2808++;
			if (((ObjType) this).countObj != null && i > 1) {
				int i_76_ = -1;
				for (int i_77_ = 0; i_77_ < 10; i_77_++) {
					if (((ObjType) this).countCo[i_77_] <= i && ((ObjType) this).countCo[i_77_] != 0)
						i_76_ = ((ObjType) this).countObj[i_77_];
				}
				if (i_76_ != -1)
					return ((ObjType) this).f_ob.list(22883, i_76_);
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.B(" + i + ',' + i_75_ + ')');
		}
	}

	final String method1297(String string, int i, int i_78_) {
		try {
			f_hb++;
			if (((ObjType) this).aClass85_2810 == null)
				return string;
			Class246_Sub4 class246_sub4 = ((Class246_Sub4) ((ObjType) this).aClass85_2810.get((long) i_78_));
			int i_79_ = -14 % ((52 - i) / 61);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("rv.P(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_78_ + ')'));
		}
	}

	final void decode(Buffer stream, Revision revision) {
		while (true) {
			int opcode = stream.readUnsignedByte();
			if (opcode == 0) {
				break;
			}
			if (revision == Revision.OSRS) {
				process_op_osrs(opcode, stream);
			} else {
				process_op(opcode, stream);
			}
		}
	}

	final void method1299(int i) {
		do {
			try {
				f_vb++;
				if (i <= -51)
					break;
				((ObjType) this).cost = -49;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rv.T(" + i + ')');
			}
			break;
		} while (false);
	}

	final Model method1300(int i, boolean bool) {
		try {
			f_mb++;
			int i_81_ = maleHeadModel;
			int i_82_ = maleHeadModel2;
			if (bool) {
				i_81_ = femaleHeadModel;
				i_82_ = femaleHeadModel2;
			}
			if (i_81_ == -1)
				return null;
			Model class103 = Model.get_model(i, (this.item_model_cache()), i_81_,
					revision);
			if (((Model) class103).anInt1358 < 13)
				class103.method646(0, (byte) -83);
			if (i_82_ != -1) {
				Model class103_83_ = Model.get_model(0, (this.item_model_cache()),
						i_82_, revision);
				if (((Model) class103_83_).anInt1358 < 13)
					class103_83_.method646(0, (byte) -106);
				Model[] class103s = { class103, class103_83_ };
				class103 = new Model(class103s, 2);
			}
			if (colorFind != null) {
				for (int i_84_ = 0; i_84_ < colorFind.length; i_84_++)
					class103.method662(colorFind[i_84_], colorReplace[i_84_], false);
			}
			if (textureFind != null) {
				for (int i_85_ = 0; i_85_ < textureFind.length; i_85_++)
					class103.method645(textureReplace[i_85_], i, textureFind[i_85_]);
			}
			return class103;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.K(" + i + ',' + bool + ')');
		}
	}

	public static boolean native_osrs(int item_id) {
		return (item_id == 21295 || item_id == 20997 || item_id == 29000);
	}

	public static boolean native_634(int item_id) {
		return (item_id == 19780);
	}

	public static boolean native_550(int item_id) {
		return false;
	}

	public static int translate_duplicates(int id) {
		switch (id) {
			case 11834:
				return 11726;
			case 11726:
				return 11834;
			case 11724:
				return 11832;
			case 11832:
				return 11724;
			case 11840:
				return 11732;
			case 11732:
				return 11840;
			case 14484:
				return 13652;
			case 11694:
				return 11802;
			case 13652:
				return 14484;
			default:
				return -1;
		}
	}

	public ObjType() {
		((ObjType) this).anInt2765 = -1;
		((ObjType) this).zoom2d = 2000;
		((ObjType) this).anInt2790 = -1;
		ambient = 0;
		((ObjType) this).zan2d = 0;
		((ObjType) this).isTradeable = false;
		anInt2792 = 0;
		((ObjType) this).members = false;
		((ObjType) this).xan2d = 0;
		((ObjType) this).boughtId = -1;
		((ObjType) this).maleModel0 = -1;
		((ObjType) this).anInt2803 = -1;
		((ObjType) this).f_ab = -1;
		femaleModel1 = -1;
		((ObjType) this).anInt2801 = 0;
		((ObjType) this).cost = 1;
		((ObjType) this).offsetY2d = 0;
		((ObjType) this).femaleModel0 = -1;
		resizeY = 128;
		femaleHeadModel2 = -1;
		maleModel2 = -1;
		((ObjType) this).anInt2762 = -1;
		contrast = 0;
		((ObjType) this).name = "null";
		anInt2787 = 0;
		((ObjType) this).anInt2805 = -1;
		maleHeadModel = -1;
		((ObjType) this).certTemplate = -1;
		((ObjType) this).stackability = 0;
		maleModel1 = -1;
		femaleModel2 = -1;
		resizeZ = 128;
		((ObjType) this).offsetX2d = 0;
		((ObjType) this).anInt2766 = -1;
		f_sb = 0;
		this.options = new String[] { null, null, "Take", null, null }; // L: 48
		this.ops = new String[] { null, null, null, null, "Drop" }; // L: 49
		femaleHeadModel = -1;
		((ObjType) this).note = -1;
		((ObjType) this).anInt2816 = -1;
		((ObjType) this).team = 0;
		anInt2775 = 0;
		((ObjType) this).boughtTemplateId = -1;
		resizeX = 128;
	}

	static {
		NPC_CLICK_1_PACKET_NEW = new OutgoingPacket(13, 3);
		anInt2818 = 0;
		anInt2815 = 0;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getMembersName() {
		return this.name + "(members)";
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public int getNote() {
		return this.note;
	}

	@Override
	public int getLinkedNoteId() {
		return this.note;
	}

	@Override
	public int getPlaceholderId() {
		return this.placeholderLink;
	}

	@Override
	public int getPlaceholderTemplateId() {
		return this.placeholderTemplate;
	}

	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public int getHaPrice() {
		return 0;
	}

	@Override
	public boolean isMembers() {
		return this.members;
	}

	@Override
	public boolean isStackable() {
		return this.stackability == 1;
	}

	@Override
	public boolean isTradeable() {
		return this.isTradeable;
	}

	@Override
	public void setTradeable(boolean yes) {
		this.isTradeable = yes;
	}

	@Override
	public int getIsStackable() {
		return this.stackability;
	}

	@Override
	public int getMaleModel() {
		return this.maleModel0;
	}

	@Override
	public String[] getInventoryActions() {
		return this.ops;
	}

	@Override
	public String[] getGroundActions() {
		return this.options;
	}

	@Override
	public int getShiftClickActionIndex() {
		return this.shiftClickIndex;
	}

	@Override
	public void setShiftClickActionIndex(int shiftClickActionIndex) {
		this.shiftClickIndex = shiftClickActionIndex;
	}

	@Override
	public RSModel getModel(int quantity) {
		return null;
	}

	@Override
	public int getInventoryModel() {
		return this.inventoryModel;
	}

	@Override
	public void setInventoryModel(int model) {
		this.inventoryModel = model;
	}

	@Override
	public short[] getColorToReplaceWith() {
		return this.colorReplace;
	}

	@Override
	public void setColorToReplaceWith(short[] color) {
		this.colorReplace = color;
	}

	@Override
	public short[] getColorToReplace() {
		return this.colorFind;
	}

	@Override
	public void setColorToReplace(short[] color) {
		this.colorFind = color;
	}

	@Override
	public short[] getTextureToReplaceWith() {
		return this.textureReplace;
	}

	@Override
	public void setTextureToReplaceWith(short[] texture) {
		this.textureReplace = texture;
	}

	@Override
	public short[] getTextureToReplace() {
		return this.textureFind;
	}

	@Override
	public void setTextureToReplace(short[] texture) {
		this.textureFind = texture;
	}

	@Override
	public int getModelZoom() {
		return this.zoom2d;
	}

	@Override
	public void setModelZoom(int zoom) {
		this.zoom2d = zoom;
	}

	@Override
	public int getOffsetX() {
		return this.offsetX2d;
	}

	@Override
	public void setOffsetX(int offsetX) {
		this.offsetX2d = offsetX;
	}

	@Override
	public int getOffsetY() {
		return this.offsetY2d;
	}

	@Override
	public void setOffsetY(int offsetY) {
		this.offsetY2d = offsetY;
	}

	@Override
	public RSIterableNodeHashTable getParams() {
		return null;
	}

	@Override
	public int getIntValue(int paramID) {
		return 0;
	}

	@Override
	public void setValue(int paramID, int value) {

	}

	@Override
	public String getStringValue(int paramID) {
		return "";
	}

	@Override
	public void setValue(int paramID, String value) {

	}

	@Override
	public void setParams(IterableHashTable params) {

	}

	@Override
	public void setParams(RSIterableNodeHashTable params) {

	}

	@Override
	public int getXan2d() {
		return this.xan2d;
	}

	@Override
	public int getYan2d() {
		return this.yan2d;
	}

	@Override
	public int getZan2d() {
		return this.zan2d;
	}

	@Override
	public void setXan2d(int angle) {
		this.xan2d = angle;
	}

	@Override
	public void setYan2d(int angle) {
		this.yan2d = angle;
	}

	@Override
	public void setZan2d(int angle) {
		this.zan2d = angle;
	}

	@Override
	public int getAmbient() {
		return this.ambient;
	}

	@Override
	public void setAmbient(int ambient) {
		this.ambient = ambient;
	}

	@Override
	public int getContrast() {
		return this.contrast;
	}

	@Override
	public void setContrast(int contrast) {
		this.contrast = contrast;
	}
}
