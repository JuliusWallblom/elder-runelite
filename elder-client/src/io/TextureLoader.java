package io;

/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

import io.cache.Revision;

final class TextureLoader implements TextureInterface {

	static int anInt966;
	static int anInt967 = -1;
	static int anInt968;
	static int anInt969;
	private CacheIndex texture_sprite_data;
	private CacheIndex osrs_texture_sprite_data;
	static int anInt971;
	static int anInt972;
	static int anInt973 = 0;
	static int anInt974;
	private Class127 texture_cache = new Class127(256), texture_cache_OSRS = new Class127(256);
	static int anInt976;
	private CacheIndex texture_data;
	private CacheIndex osrs_texture_data;
	static int anInt978;
	public static Material[] materials;
	static int anInt980 = -1;

	public final Material get_material(int i, int material_id) {
		try {
			anInt968++;
			if (i != -31305) {
				texture_data = null;
				osrs_texture_data = null;
			}
			return materials[material_id];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hb.D(" + i + ',' + material_id + ')');
		}
	}

	public final int[] method16(boolean bool, int i, boolean bool_1_, float f, int i_2_, int i_3_) {
		try {
			anInt971++;
			if (bool_1_ != false)
				method15(-0.10881342F, -4, 5, false, -14, 121);
			return (get_texture(i, osrs(i) ? Revision.OSRS : Revision.PRE_EOC_634, 3).sprite_method_4(i_3_, (byte) 110,
					get_texture_sprite_index(i, "unknown"), this, i_2_,
					(double) f, osrs(i) ? false : (materials[i]).rotateTexture));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("hb.C(" + bool + ',' + i + ',' + bool_1_ + ',' + f + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public final int[] method14(boolean bool, int i, int texture_id, float f, int i_5_, int i_6_) {
		try {
			return (get_texture(texture_id, osrs(texture_id) ? Revision.OSRS : Revision.PRE_EOC_634, 5).texture_object(
					this, -40, bool, osrs(texture_id) ? false : (materials[i]).rotateTexture,
					get_texture_sprite_index(texture_id, "object"), (double) (osrs(texture_id) ? 0.5F : 0.7F), i_6_,
					i_5_));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public final float[] method15(float f, int i, int i_7_, boolean bool, int i_8_, int i_9_) {
		try {
			if (i_9_ != 15752)
				anInt973 = -59;
			anInt969++;
			return (get_texture(i, osrs(i) ? Revision.OSRS : Revision.PRE_EOC_634, 6).sprite_method_3(false, this,
					get_texture_sprite_index(i, "unknown"), i_8_,
					osrs(i) ? false : (materials[i]).rotateTexture, i_7_));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("hb.B(" + f + ',' + i + ',' + i_7_ + ',' + bool + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	public CacheIndex get_texture_sprite_index(int texture_id, String texture_type) {
		if (osrs(texture_id)) {
			return osrs_texture_sprite_data;
		} else {
			return texture_sprite_data;
		}
	}

	public static boolean osrs(int texture_id) {
		return texture_id <= 127;
	}

	public final Texture get_texture(int texture_id, Revision revision, int from) {
		try {
			NodeSub texture_node = null;
			if (revision == Revision.OSRS) { // TODO just temporarily removing texture cache
				texture_node = texture_cache_OSRS.get((long) texture_id);
			} else {
				texture_node = texture_cache.get((long) texture_id);
			}
			if (texture_node != null) {
				return (Texture) texture_node;
			}

			byte[] data;
			if (revision == Revision.OSRS) {
				data = osrs_texture_data.get_file(texture_id, 0);
			} else {
				data = texture_data.method109(texture_id, -1);
			}
			if (data == null) {
				return null;
			}
			Texture texture = new Texture(new Buffer(data), texture_id, revision);
			if (revision == Revision.OSRS) {
				texture_cache_OSRS.method869((long) texture_id, texture, -8869);
			} else {
				texture_cache.method869((long) texture_id, texture, -8869);
			}
			return texture;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public final boolean method13(int textureId, int i_11_) {
		try {
			anInt972++;
			if (i_11_ != 19378)
				return false;
			Texture class246_sub1_sub13 = get_texture(textureId, osrs(textureId) ? Revision.OSRS : Revision.PRE_EOC_634,
					4);
			if (class246_sub1_sub13 == null
					|| !class246_sub1_sub13.sprite_method_1((byte) -127, get_texture_sprite_index(textureId, "unknown"),
							this))
				return false;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	TextureLoader(CacheIndex materials_data, CacheIndex texture_index, CacheIndex sprite_index,
			CacheIndex osrs_texture_index, CacheIndex osrs_sprite_index) {
		try {
			texture_sprite_data = sprite_index;
			osrs_texture_sprite_data = osrs_sprite_index;
			texture_data = texture_index;
			osrs_texture_data = osrs_texture_index;
			Buffer material_buffer = new Buffer(materials_data.get_file(0, 0));
			int material_length = material_buffer.readUnsignedShort();
			materials = new Material[material_length];
			for (int i = 0; i < material_length; i++) {
				if (material_buffer.readUnsignedByte() == 1)
					materials[i] = new Material();
			}
			for (int i = 0; i < material_length; i++) {
				if (materials[i] != null) {
					(materials[i]).aBool3339 = (material_buffer.readUnsignedByte() ^ 0xffffffff) == -1;
					// prevents some of textures from being rendered
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (material_length ^ 0xffffffff); i++) {
				if (materials[i] != null) {
					(materials[i]).aBool3340 = material_buffer.readUnsignedByte() == 1;
					// makes shit black
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (material_length ^ 0xffffffff); i++) {
				if (materials[i] != null) {
					(materials[i]).aBool3335 = material_buffer.readUnsignedByte() == 1;
					// make shit blurry
				}
			}
			/*
			 * for (int i = 0; material_length > i; i++) { // doesn't seem to be in 634?
			 * if (materials[i] != null)
			 * (materials[i]).aBool3348 = (material_buffer.readUnsignedByte() ^ 0xffffffff)
			 * == -2;
			 * }
			 */
			for (int i = 0; material_length > i; i++) {
				if (materials[i] != null) {
					materials[i].brightness = material_buffer.readByte();
				}
			}
			for (int i = 0; (material_length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (materials[i] != null) {
					(materials[i]).aByte3344 = material_buffer.readByte();
					// no idea
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (material_length ^ 0xffffffff); i++) {
				if (materials[i] != null) {
					(materials[i]).aByte3343 = material_buffer.readByte();
					// no idea
				}
			}
			for (int i = 0; (material_length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (materials[i] != null) {
					(materials[i]).aByte3342 = material_buffer.readByte();
				}
			}
			for (int i = 0; (material_length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (materials[i] != null) {
					(materials[i]).aShort3354 = (short) material_buffer.readUnsignedShort();
					// textured floor col
				}
			}
			for (int i = 0; material_length > i; i++) {
				if (materials[i] != null) {
					(materials[i]).animationDirection = material_buffer.readByte();
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (material_length ^ 0xffffffff); i++) {
				if (materials[i] != null) {
					(materials[i]).animationSpeed = material_buffer.readByte();
				}
			}
			for (int i = 0; material_length > i; i++) {
				if (materials[i] != null) {
					(materials[i]).aBool3347 = (material_buffer.readUnsignedByte() ^ 0xffffffff) == -2;
					// animated?
				}
			}
			for (int i = 0; material_length > i; i++) {
				if (materials[i] != null) {
					(materials[i]).rotateTexture = material_buffer.readUnsignedByte() == 1;
				}
			}
			for (int i = 0; (material_length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (materials[i] != null) {
					(materials[i]).aByte3349 = material_buffer.readByte();
					// no idea
				}
			}
			for (int i = 0; material_length > i; i++) {
				if (materials[i] != null) {
					(materials[i]).aBool3352 = (material_buffer.readUnsignedByte() ^ 0xffffffff) == -2;
					// no idea
				}
			}
			for (int i = 0; i < material_length; i++) {
				if (materials[i] != null) {
					(materials[i]).aBool3353 = material_buffer.readUnsignedByte() == 1;
					// no idea
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (material_length ^ 0xffffffff); i++) {
				if (materials[i] != null) {
					(materials[i]).aBool3337 = material_buffer.readUnsignedByte() == 1;
					// no idea
				}
			}
			for (int i = 0; material_length > i; i++) {
				if (materials[i] != null) {
					materials[i].anInt3341 = material_buffer.readUnsignedByte();
					// no idea
				}
			}
			for (int i = 0; material_length > i; i++) {
				if (materials[i] != null) {
					materials[i].anInt3336 = material_buffer.readInt((byte) 112);
					// no idea
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("hb.<init>(" + (materials_data != null ? "{...}" : "null") + ','
							+ (texture_index != null ? "{...}" : "null") + ','
							+ (sprite_index != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class232 method471(byte i, Component component) {
		try {
			anInt974++;
			if (i <= 14)
				anInt967 = -72;
			return new KeyHandler(component);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("hb.F(" + i + ',' + (component != null ? "{...}" : "null") + ')'));
		}
	}
}
