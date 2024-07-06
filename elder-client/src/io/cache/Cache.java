package io.cache;

import java.util.ArrayList;

import io.CacheIndex;

public class Cache {

	/**
	 * @author jaha
	 * 
	 * This class exists to organize the cache by index & revision.
	 */
	
	
	/*
	 * The cache index load attributes.
	 */
	public final static boolean[][] ON_INDEX_LOAD_ATTRIBUTES = new boolean[][] {{false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {true, true, true}, {true, false, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, false, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {true, true, true}, {false, true, true}, {false, true, true}, {true, true, true}, {false, true, true}, {true, true, true}, {false, true, true}, {true, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}, {false, true, true}};
	public static int[] f_ab = { 4, 4, 1, 2, 6, 4, 2, 13, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 13, 1, 0, 0, 2, 0, 0, 0, 0, 2, 2, 0, 0, 1, 0, 13, 0, 0, 0, 0, 0};

	/*
	 * The current cache indexes in the clients memory.
	 */
	public static ArrayList<CacheIndex> client_cache = new ArrayList<CacheIndex>();
	
	public static CacheIndex get_index(Revision revision, String identifier) {
		if (identifier.equalsIgnoreCase("sprites")) {
			return client_cache.get(revision.sprite_index);
		} else if (identifier.equalsIgnoreCase("config")) {
			return client_cache.get(revision.config_index);
		} else if (identifier.equalsIgnoreCase("maps")) {
			return client_cache.get(revision.map_index);
		} else if (identifier.equalsIgnoreCase("models")) {
			return client_cache.get(revision.model_index);
		} else if (identifier.equalsIgnoreCase("skeletons")) {
			return client_cache.get(revision.skeleton_index);
		} else if (identifier.equalsIgnoreCase("skins")) {
			return client_cache.get(revision.skin_index);
		} else if (identifier.equalsIgnoreCase("widgets")) {
			return client_cache.get(revision.widget_index);
		} else if (identifier.equalsIgnoreCase("cs2")) {
			return client_cache.get(revision.cs2_index);
		} else if (identifier.equalsIgnoreCase("textures")) {
			return client_cache.get(revision.texture_index);
		} else if (identifier.equalsIgnoreCase("sound_effects")) {
			return client_cache.get(revision.sound_effects_index);
		} else if (identifier.equalsIgnoreCase("music")) {
			return client_cache.get(revision.music_index);
		}
		return null;
	}

	/*
	 * Reset a cache index by commonly used nicknames.
	 * 
	 * @note This function uses if-statements to maintain a low minimum JDK version (1.6).
	 */
	public static void reset_index(Revision revision, String identifier) {
		if (identifier.equalsIgnoreCase("sprites")) {
			client_cache.set(revision.sprite_index, null);
		} else if (identifier.equalsIgnoreCase("config")) {
			client_cache.set(revision.config_index, null);
		} else if (identifier.equalsIgnoreCase("maps")) {
			client_cache.set(revision.map_index, null);
		} else if (identifier.equalsIgnoreCase("models")) {
			client_cache.set(revision.model_index, null);
		} else if (identifier.equalsIgnoreCase("skeletons")) {
			client_cache.set(revision.skeleton_index, null);
		} else if (identifier.equalsIgnoreCase("skins")) {
			client_cache.set(revision.skin_index, null);
		} else if (identifier.equalsIgnoreCase("widgets")) {
			client_cache.set(revision.widget_index, null);
		} else if (identifier.equalsIgnoreCase("cs2")) {
			client_cache.set(revision.cs2_index, null);
		} else if (identifier.equalsIgnoreCase("textures")) {
			client_cache.set(revision.texture_index, null);
		} else if (identifier.equalsIgnoreCase("sound_effects")) {
			client_cache.set(revision.sound_effects_index, null);
		} else if (identifier.equalsIgnoreCase("music")) {
			client_cache.set(revision.music_index, null);
		}
	}
}
