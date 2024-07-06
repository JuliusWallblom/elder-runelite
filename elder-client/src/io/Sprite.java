package io;

import io.cache.Revision;

final class Sprite {
	static Class246_Sub37_Sub1 aClass246_Sub37_Sub1_433;
	int map_scene_sprite_id;
	static int anInt435;
	static int anInt436;
	int anInt437;
	static int anInt439;
	boolean aBool440 = false;
	static int anInt441;
	static int anInt442;
	MapScenes aClass254_443;

	final AbstractSprite method240(boolean bool, SceneGraph class260, int i, int i_0_, LocType object) {
		try {
			anInt435++;
			long l;
			if (MapRegion.get_revision_by_region() == Revision.OSRS) {
				l = (long) (((SceneGraph) class260).anInt3719 << 19 | ((!bool ? 0 : 262144) | (object.map_scene)));
			} else {
				l = (long) (((SceneGraph) class260).anInt3719 << 19
						| ((!bool ? 0 : 262144) | (((Sprite) this).map_scene_sprite_id | i << 16)));
			}
			AbstractSprite class_l = Class191.osrs_mapscenes[object.map_scene];
			if (class_l != null) {
				return class_l;
			}
			LDSprite class10 = null;
			if (MapRegion.get_revision_by_region() == Revision.OSRS) {
				int osrs_map_scene = 317;
				if (!((MapScenes) ((Sprite) this).aClass254_443).sprite_data_osrs.method112(-1, osrs_map_scene)) {
					return null;
				}
				class10 = LDSprite.get_sprite((((MapScenes) (((Sprite) this).aClass254_443)).sprite_data_osrs),
						osrs_map_scene, object.map_scene);

			} else {
				if (!((MapScenes) ((Sprite) this).aClass254_443).sprite_data.method112(-1,
						((Sprite) this).map_scene_sprite_id)) {
					return null;
				}
				class10 = LDSprite.get_sprite((((MapScenes) (((Sprite) this).aClass254_443)).sprite_data),
						((Sprite) this).map_scene_sprite_id, 0);
			}
			if (class10 != null) {
				((LDSprite) class10).anInt163 = ((LDSprite) class10).anInt158 = ((LDSprite) class10).anInt159 = ((LDSprite) class10).anInt162 = 0;
				if (bool)
					class10.method123();
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i ^ 0xffffffff); i_1_++)
					class10.method122();
			}
			class_l = class260.ld_to_abstract_sprite(class10, true);
			if (class_l != null)
				((MapScenes) ((Sprite) this).aClass254_443).aClass54_3638.method371(1, l, class_l);
			return class_l;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	final void decode(Buffer stream, int i) {
		try {
			anInt441++;
			for (;;) {
				int opcode = stream.readUnsignedByte();
				if ((opcode ^ 0xffffffff) == -1) {
					break;
				}
				if (MapRegion.get_revision_by_region() == Revision.OSRS) {
					process_op_osrs(opcode, stream, -21210);
				} else {
					process_op(opcode, stream, -21210);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "co.A(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void process_op_osrs(int i, Buffer stream, int i_3_) {
	}

	private final void process_op(int opcode, Buffer stream, int i_3_) {
		try {
			if (opcode == 1) {
				this.map_scene_sprite_id = stream.readUnsignedShort();
			} else if (opcode == 2) {
				this.anInt437 = stream.read24BitInteger((byte) 29);
			} else if (opcode == 3) {
				this.aBool440 = true;
			} else if (opcode == 4) {
				this.map_scene_sprite_id = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("co.D(" + opcode + ',' + (stream != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	public static void method243(int i) {
		try {
			aClass246_Sub37_Sub1_433 = null;
			int i_4_ = 116 / ((i - 71) / 54);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "co.E(" + i + ')');
		}
	}

	final boolean method244(byte i) {
		try {
			if (MapRegion.get_revision_by_region() == Revision.OSRS) {
				return ((MapScenes) ((Sprite) this).aClass254_443).sprite_data_osrs.method112(-1,
						((Sprite) this).map_scene_sprite_id);
			} else {
				return ((MapScenes) ((Sprite) this).aClass254_443).sprite_data.method112(-1,
						((Sprite) this).map_scene_sprite_id);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "co.B(" + i + ')');
		}
	}

	public Sprite() {
		/* empty */
	}
}
