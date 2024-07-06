package io.cache;

public enum Revision {

	OSRS(IndexConstants.OSRS_SPRITE_INDEX, IndexConstants.OSRS_CONFIG_INDEX, IndexConstants.OSRS_MAP_INDEX,
			IndexConstants.OSRS_MODEL_INDEX, IndexConstants.OSRS_SKELETON_INDEX, IndexConstants.OSRS_SKIN_INDEX,
			IndexConstants.OSRS_WIDGET_INDEX, IndexConstants.OSRS_CS2_INDEX, IndexConstants.OSRS_TEXTURE_INDEX,
			IndexConstants.PRE_EOC_634_SOUND_EFFECTS_INDEX, IndexConstants.PRE_EOC_634_MUSIC_INDEX),

	CUSTOM_OSRS(IndexConstants.OSRS_SPRITE_INDEX, IndexConstants.OSRS_CONFIG_INDEX, IndexConstants.OSRS_MAP_INDEX,
			IndexConstants.OSRS_MODEL_INDEX, IndexConstants.OSRS_SKELETON_INDEX, IndexConstants.OSRS_SKIN_INDEX,
			IndexConstants.CUSTOM_OSRS_WIDGET_INDEX, IndexConstants.OSRS_CS2_INDEX, IndexConstants.OSRS_TEXTURE_INDEX,
			IndexConstants.PRE_EOC_634_SOUND_EFFECTS_INDEX, IndexConstants.PRE_EOC_634_MUSIC_INDEX),

	PRE_EOC_634(IndexConstants.PRE_EOC_634_SPRITE_INDEX, IndexConstants.PRE_EOC_634_CONFIG_INDEX,
			IndexConstants.PRE_EOC_634_MAP_INDEX, IndexConstants.PRE_EOC_634_MODEL_INDEX,
			IndexConstants.PRE_EOC_634_SKELETON_INDEX, IndexConstants.PRE_EOC_634_SKIN_INDEX,
			IndexConstants.PRE_EOC_634_WIDGET_INDEX, IndexConstants.PRE_EOC_634_CS2_INDEX,
			IndexConstants.PRE_EOC_634_TEXTURE_INDEX, IndexConstants.PRE_EOC_634_SOUND_EFFECTS_INDEX,
			IndexConstants.PRE_EOC_634_MUSIC_INDEX),

	PRE_EOC_550(IndexConstants.PRE_EOC_550_SPRITE_INDEX, IndexConstants.PRE_EOC_550_CONFIG_INDEX,
			IndexConstants.OSRS_MAP_INDEX, IndexConstants.PRE_EOC_550_MODEL_INDEX,
			IndexConstants.PRE_EOC_550_SKELETON_INDEX, IndexConstants.PRE_EOC_550_SKIN_INDEX,
			IndexConstants.PRE_EOC_550_WIDGET_INDEX, IndexConstants.PRE_EOC_550_CS2_INDEX,
			IndexConstants.PRE_EOC_634_TEXTURE_INDEX, IndexConstants.PRE_EOC_634_SOUND_EFFECTS_INDEX,
			IndexConstants.PRE_EOC_634_MUSIC_INDEX),

	CUSTOM_PRE_EOC_550(IndexConstants.CUSTOM_PRE_EOC_550_SPRITE_INDEX, IndexConstants.PRE_EOC_550_CONFIG_INDEX,
			IndexConstants.OSRS_MAP_INDEX, IndexConstants.PRE_EOC_550_MODEL_INDEX,
			IndexConstants.PRE_EOC_550_SKELETON_INDEX, IndexConstants.PRE_EOC_550_SKIN_INDEX,
			IndexConstants.CUSTOM_PRE_EOC_550_WIDGET_INDEX, IndexConstants.PRE_EOC_550_CS2_INDEX,
			IndexConstants.PRE_EOC_634_TEXTURE_INDEX, IndexConstants.PRE_EOC_634_SOUND_EFFECTS_INDEX,
			IndexConstants.PRE_EOC_634_MUSIC_INDEX);

	public int sprite_index;
	public int config_index;
	public int map_index;
	public int model_index;
	public int skeleton_index;
	public int skin_index;
	public int widget_index;
	public int cs2_index;
	public int texture_index;
	public int sound_effects_index;
	public int music_index;

	Revision(int... indexes) {
		this.sprite_index = indexes[0];
		this.config_index = indexes[1];
		this.map_index = indexes[2];
		this.model_index = indexes[3];
		this.skeleton_index = indexes[4];
		this.skin_index = indexes[5];
		this.widget_index = indexes[6];
		this.cs2_index = indexes[7];
		this.texture_index = indexes[8];
		this.sound_effects_index = indexes[9];
		this.music_index = indexes[10];
	}
}
