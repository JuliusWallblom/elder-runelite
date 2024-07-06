package io;

import io.cache.Cache;
import io.cache.IndexConstants;
import io.cache.Revision;

public class TitleScreen {

	/*
	 * Constant multilingual messages displayed in the title-screen.
	 */
	static final MultilingualString LOADING_634_INTERFACES_MS = new MultilingualString("Loading interfaces (3 / 5) - ",
			"Lade Benutzeroberfl\u00e4che (3 / 5) - ", "Chargement des interfaces (3 / 5) - ",
			"Carregando interfaces (3 / 5) - ");
	static final MultilingualString LOADING_OSRS_INTERFACES_MS = new MultilingualString("Loading interfaces (1 / 5) - ",
			"Lade Benutzeroberfl\u00e4che (1 / 5) - ", "Chargement des interfaces (1 / 5) - ",
			"Carregando interfaces (1 / 5) - ");
	static final MultilingualString LOADING_CUSTOM_OSRS_INTERFACES_MS = new MultilingualString(
			"Loading interfaces (2 / 5) - ",
			"Lade Benutzeroberfl\u00e4che (2 / 5) - ", "Chargement des interfaces (2 / 5) - ",
			"Carregando interfaces (2 / 5) - ");
	static final MultilingualString LOADING_550_INTERFACES_MS = new MultilingualString("Loading interfaces (4 / 5) - ",
			"Lade Benutzeroberfl\u00e4che (4 / 5) - ", "Chargement des interfaces (4 / 5) - ",
			"Carregando interfaces (4 / 5) - ");
	static final MultilingualString LOADING_CUSTOM_550_INTERFACES_MS = new MultilingualString(
			"Loading interfaces (5 / 5) - ",
			"Lade Benutzeroberfl\u00e4che (5 / 5) - ", "Chargement des interfaces (5 / 5) - ",
			"Carregando interfaces (5 / 5) - ");
	static final MultilingualString LOADING_634_INTERFACE_SCRIPTS_MS = new MultilingualString(
			"Loading interface scripts (2 / 3) - ", "Lade Interface-Skripte (2 / 3) - ",
			"Chargement des interfaces (2 / 3) - ",
			"Carregando interfaces (2 / 3) - ");
	static final MultilingualString LOADING_550_INTERFACE_SCRIPTS_MS = new MultilingualString(
			"Loading interface scripts (3 / 3) - ", "Lade Interface-Skripte (3 / 3) - ",
			"Chargement des interfaces (3 / 3) - ",
			"Carregando interfaces (3 / 3) - ");
	static final MultilingualString LOADING_OSRS_INTERFACE_SCRIPTS_MS = new MultilingualString(
			"Loading interface scripts (1 / 3) - ", "Lade Interface-Skripte (1 / 3) - ",
			"Chargement des interfaces (1 / 3) - ",
			"Carregando interfaces (1 / 3) - ");
	static final MultilingualString ALLOCATING_MEMORY_MS = new MultilingualString("Allocating memory",
			"Speicher wird zugewiesen.", "M\u00e9moire en cours d'attribution", "Alocando mem\u00f3ria");
	static final MultilingualString ALLOCATED_MEMORY_MS = new MultilingualString("Allocated memory",
			"Zugewiesener Speicher.", "M\u00e9moire attribu\u00e9e", "Mem\u00f3ria alocada");
	static final MultilingualString CREATED_GAMEWORLD_MS = new MultilingualString("Created gameworld",
			"Spielwelt erstellt.", "Monde de jeu cr\u00e9\u00e9", "Universo de jogo criado");
	static final MultilingualString CONNECTING_TO_UPDATE_SERVER_MS = new MultilingualString(
			"Connecting to update server", "Verbindung mit Update-Server...",
			"Connexion au serveur de mise \u00e0 jour en cours", "Conectando ao servidor de atualiza\u00e7\u00e3o");
	static final MultilingualString CONNECTED_TO_UPDATE_SERVER_MS = new MultilingualString("Connected to update server",
			"Verbindung zum Update-Server hergestellt.", "Connect\u00e9 au serveur de mise \u00e0 jour",
			"Conectado ao servidor de atualiza\u00e7\u00e3o");
	static final MultilingualString CHECKING_FOR_UPDATES_MS = new MultilingualString("Checking for updates - ",
			"Suche nach Updates - ", "V\u00e9rification des mises \u00e0 jour - ",
			"Verificando atualiza\u00e7\u00f5es - ");

	/*
	 * The loading message displayed on the title-screen.
	 */
	static String loading_message = "";

	/*
	 * The current loading percentage of the loading bar.
	 */
	static int loading_percentage = 10;

	/*
	 * The current loading phase.
	 */
	static int loading_phase = 0;

	public final static void start() {
		int i = 23396;
		try {
			if (!Client.current_renderer.safe_mode) {
				for (int index = 0; index < Client.total_characters; index++) {
					if (Client.characters[index].method1236() == 's' || Client.characters[index].method1236() == 's') {
						Client.current_renderer.safe_mode = true;
						break;
					}
				}
			}
			if (loading_phase == 0) {
				Runtime runtime = Runtime.getRuntime();
				int allocated_memory = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
				long time = TimeUtility.time();
				if (Client.allocating_time == 0L) {
					Client.allocating_time = time;
				}
				if (allocated_memory > 16384 && time - Client.allocating_time < 5000L) {
					if (time + -Client.allocated_gc_time > 1000L) {
						System.gc();
						Client.allocated_gc_time = time;
					}
					loading_message = ALLOCATING_MEMORY_MS.get(Preferences.language_code);
					loading_percentage = 5;
				} else {
					loading_message = ALLOCATED_MEMORY_MS.get(Preferences.language_code);
					loading_phase = 10;
					loading_percentage = 5;
				}
			} else if (loading_phase == 10) {
				for (int i_131_ = 0; (i_131_ ^ 0xffffffff) > -5; i_131_++)
					Class95.aClass199Array1235[i_131_] = Class256.method1664((byte) -118, Class152.anInt2205,
							Class38_Sub1_Sub1.anInt6770);
				loading_message = CREATED_GAMEWORLD_MS.get(Preferences.language_code);
				loading_percentage = 10;
				loading_phase = 20;
			} else if (loading_phase == 20) {
				if (Class194_Sub1.aClass142_4140 == null)
					Class194_Sub1.aClass142_4140 = new Filestore(MapFunction.aClass242_2036,
							Class106_Sub2.aClass241_5339);
				if (!Class194_Sub1.aClass142_4140.method955(true)) {
					loading_message = CONNECTING_TO_UPDATE_SERVER_MS.get(Preferences.language_code);
					loading_percentage = 12;
				} else {
					for (int cache_index = 0; cache_index < Constants.MAX_INDEX_COUNT; cache_index++) {
						Cache.client_cache.add(
								CacheIndex.load_cache_index(cache_index, Cache.ON_INDEX_LOAD_ATTRIBUTES[cache_index]));
					}
					loading_message = CONNECTED_TO_UPDATE_SERVER_MS.get(Preferences.language_code);
					loading_percentage = 15;
					loading_phase = 30;
				}
			} else if (loading_phase == 30) {
				int i_132_ = 0;
				for (int i_133_ = 0; i_133_ < Constants.MAX_INDEX_COUNT; i_133_++) {
					i_132_ += (Class59_Sub1_Sub2.aClass154_Sub1Array6127[i_133_].method2095(-1398) * Cache.f_ab[i_133_]
							/ 100);
				}
				if ((i_132_ ^ 0xffffffff) != -101) {
					if ((i_132_ ^ 0xffffffff) != -1)
						loading_message = (CHECKING_FOR_UPDATES_MS.get(Preferences.language_code) + i_132_ + "%");
					loading_percentage = 20;
				} else {
					loading_message = Class59_Sub4.aClass67_5182.get(Preferences.language_code);
					loading_percentage = 20;
					Class246_Sub28_Sub11.method2583((byte) 80, Cache.get_index(Revision.PRE_EOC_634, "sprites"));
					Clan.method2907(Cache.get_index(Revision.PRE_EOC_550, "sprites"), 14564);
					loading_phase = 40;
				}
			} else if ((loading_phase ^ 0xffffffff) == -41) {
				if (!Cache.client_cache.get(IndexConstants.PRE_EOC_634_DEFAULTS_INDEX).method103(0)) {
					loading_message = (Class24.aClass67_342.get(Preferences.language_code)
							+ Cache.client_cache.get(IndexConstants.PRE_EOC_634_DEFAULTS_INDEX).method99(false) + "%");
					loading_percentage = 25;
				} else {
					Client.instance.method2979(
							Cache.client_cache.get(IndexConstants.PRE_EOC_634_DEFAULTS_INDEX).method109(1, -1),
							(byte) 40);
					loading_message = Class232.aClass67_3177.get(Preferences.language_code);
					loading_percentage = 25;
					loading_phase = 50;
				}
			} else if ((loading_phase ^ 0xffffffff) == -51) {
				Class40_Sub3.method1864((byte) 6);
				loading_message = Class169.aClass67_2409.get(Preferences.language_code);
				loading_percentage = 30;
				loading_phase = 60;
			} else if (loading_phase == 60) {
				int current_progress = MapRegion.method1649((byte) -88,
						Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX),
						Cache.get_index(Revision.PRE_EOC_634, "sprites"));
				int expected_progress = Class130_Sub1_Sub1.method2882(Revision.PRE_EOC_634);
				if (current_progress < expected_progress) {
					loading_message = (TitleScreen.loading_core_fonts_ms.get(Preferences.language_code)
							+ 100 * current_progress / expected_progress + "%");
					loading_percentage = 35;
				} else {
					current_progress = MapRegion.method1649((byte) -88,
							Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX),
							Cache.get_index(Revision.PRE_EOC_550, "sprites"));
					expected_progress = Class130_Sub1_Sub1.method2882(Revision.PRE_EOC_550);
					if (current_progress < expected_progress) {
						loading_message = (TitleScreen.loading_550_core_fonts_ms.get(Preferences.language_code)
								+ 100 * current_progress / expected_progress + "%");
						loading_percentage = 35;
					} else {
						current_progress = MapRegion.method1649((byte) -88,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX),
								Cache.get_index(Revision.OSRS, "sprites"));
						expected_progress = Class130_Sub1_Sub1.method2882(Revision.OSRS);
						if (current_progress < expected_progress) {
							loading_message = (TitleScreen.loading_osrs_core_fonts_ms.get(Preferences.language_code)
									+ 100 * current_progress / expected_progress + "%");
							loading_percentage = 35;
						} else {
							loading_message = TitleScreen.loaded_core_fonts_ms.get(Preferences.language_code);
							loading_phase = 70;
							loading_percentage = 35;
						}
					}
				}
			} else if ((loading_phase ^ 0xffffffff) == -71) {
				int i_136_ = Class246_Sub28_Sub7.preload_title_screen(Cache.get_index(Revision.OSRS, "sprites"),
						Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "sprites"), -125);
				int i_137_ = Class221.method1434(i ^ ~0x5b02);
				if (i_137_ > i_136_) {
					loading_message = (Class200.aClass67_2854.get(Preferences.language_code) + i_136_ * 100 / i_137_
							+ "%");
					loading_percentage = 40;
				} else {
					loading_message = Class200.aClass67_2851.get(Preferences.language_code);
					loading_phase = 80;
					loading_percentage = 40;
				}
			} else if (loading_phase == 80) {
				if (!Cache.client_cache.get(IndexConstants.PRE_EOC_634_MATERIALS_INDEX).method103(i ^ 0x5b64)) {
					loading_message = (TitleScreen.loading_textures_ms.get(Preferences.language_code)
							+ Cache.client_cache.get(IndexConstants.PRE_EOC_634_MATERIALS_INDEX).method99(false) + "%");
					loading_percentage = 45;
				} else {
					if (!Cache.get_index(Revision.OSRS, "textures").method103(i ^ 0x5b64)) {
						loading_message = (TitleScreen.loading_OSRS_textures_ms.get(Preferences.language_code)
								+ Cache.get_index(Revision.OSRS, "textures").method99(false) + "%");
						loading_percentage = 45;
					} else {
						Class246_Sub37_Sub1.textureLoader = new TextureLoader(
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_MATERIALS_INDEX),
								Cache.get_index(Revision.PRE_EOC_634, "textures"),
								Cache.get_index(Revision.PRE_EOC_634, "sprites"),
								Cache.get_index(Revision.OSRS, "textures"), Cache.get_index(Revision.OSRS, "sprites"));
						loading_message = Class188_Sub1.aClass67_3912.get(Preferences.language_code);
						loading_percentage = 45;
						loading_phase = 1000; // was 90
					}
				}

			} else if (i == 23396) {
				/* Native Library Loading from Index 30 */
				if (loading_phase == 1000) {
					NativeLibraryManager.setOSAndArch();
					loading_message = "Loaded native registry.";
					loading_percentage = 45;
					loading_phase = 1001;
				} else if (loading_phase == 1001) {
					int percent = NativeLibraryManager.writeNativeLibrary("jaggl");
					if (percent >= 0 && percent < 100) {
						loading_message = "Loading library JAGGL";
					} else {
						loading_message = "Loaded JAGGL.";
						loading_phase = 1002;
					}

				} else if (loading_phase == 1002) {
					int percent = NativeLibraryManager.writeNativeLibrary("sw3d");
					if (percent >= 0 && percent < 100) {
						loading_message = "Loading library SW3D";
					} else {
						loading_message = "Loaded SW3D.";
						loading_phase = 1003;
					}

				} else if (loading_phase == 1003) {
					int percent = NativeLibraryManager.writeNativeLibrary("jaclib");
					if (percent >= 0 && percent < 100) {
						loading_message = "Loading library JACLIB";
					} else {
						loading_message = "Loaded JACLIB.";
						loading_phase = 1004;
					}
					if (percent == 100)
						NativeLibraryLoader.loadNative("jaclib");

				} else if (loading_phase == 1004) {
					int percent = NativeLibraryManager.writeNativeLibrary("jagmisc");
					if (percent >= 0 && percent < 100) {
						loading_message = "Loading library JAGMISC";
					} else {
						loading_message = "Loaded JAGMISC.";
						loading_phase = 90;
					}
					if (percent == 100)
						NativeLibraryLoader.loadNative("jagmisc");

					/* END */
				} else if (loading_phase == 90) {
					loading_message = Class133.aClass67_1841.get(Preferences.language_code);
					loading_percentage = 50;
					loading_phase = 95;
				} else if (loading_phase == 95) {
					if (((Renderer) Client.current_renderer).safe_mode) {
						((Renderer) Client.current_renderer).anInt590 = 0;
						((Renderer) Client.current_renderer).frame_mode = 1;
						((Renderer) Client.current_renderer).anInt588 = 0;
						((Renderer) Client.current_renderer).anInt598 = 0;
						((Renderer) Client.current_renderer).anInt581 = 0;
					}
					((Renderer) Client.current_renderer).safe_mode = true;
					Client.current_renderer.save_preferences(Client.sign_link);
					Class251.method1611(-27345, false, (((Renderer) (Client.current_renderer)).anInt598));
					loading_message = Class_ss.aClass67_7057.get(Preferences.language_code);
					loading_percentage = 55;
					loading_phase = 100;
				} else if (loading_phase == 100) {

					// Fonts game
					Class19.method189(Client.sprite_loader, Cache.get_index(Settings.gamefonts, "sprites"), 73,
							Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX));
					loading_message = opened_title_screen_ms.get(Preferences.language_code);
					loading_percentage = 60;
					Class99.method622((byte) 32, 5);
					loading_phase = 110;
				} else if (loading_phase == 110) {
					Cache.get_index(Revision.OSRS, "config").method103(i - 23396);
					Cache.get_index(Revision.PRE_EOC_550, "config").method103(i - 23396);
					Cache.get_index(Revision.PRE_EOC_634, "config").method103(i - 23396);
					int crc_position = 0;
					crc_position += Cache.get_index(Revision.OSRS, "config").method99(false);
					crc_position += Cache.get_index(Revision.PRE_EOC_550, "config").method99(false);
					crc_position += Cache.get_index(Revision.PRE_EOC_634, "config").method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_LOC_INDEX).method103(i - 23396);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_LOC_INDEX).method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_ENUM_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_ENUM_INDEX)
							.method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_ENUM_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_ENUM_INDEX)
							.method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_NPC_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_NPC_INDEX).method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_OBJ_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_OBJ_INDEX).method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_OBJ_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_OBJ_INDEX).method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_SEQ_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_SEQ_INDEX).method99(false);

					Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_SEQ_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_SEQ_INDEX).method99(false);

					Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_SPOT_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_SPOT_INDEX)
							.method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_STRUCT_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_STRUCT_INDEX)
							.method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_QUICK_CHAT_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_QUICK_CHAT_INDEX).method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_QUICK_CHAT_GLOBAL_INDEX).method103(i - 23396);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_QUICK_CHAT_GLOBAL_INDEX)
							.method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_PARTICLE_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_PARTICLE_INDEX)
							.method99(false);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_BILLBOARD_INDEX).method103(0);
					crc_position += Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_BILLBOARD_INDEX)
							.method99(false);
					if (crc_position < 1700) {
						loading_message = (Class59_Sub3_Sub1.aClass67_5728.get(Preferences.language_code)
								+ crc_position / 17 + "%");
						loading_percentage = 65;
					} else {
						Class246_Sub1_Sub10.f_eb = new ParamLoader(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.OSRS, "config"),
								Cache.get_index(Revision.PRE_EOC_550, "config"));
						ParamType.aClass_v1641 = new RenderSequenceLoader(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.OSRS, "config"));
						CacheIndex.aClass156_150 = new Cursors(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.PRE_EOC_634, "sprites"));
						Class246_Sub39.aClass141_5487 = new EnumLoader(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_ENUM_INDEX),
								Cache.get_index(Revision.OSRS, "config"),
								Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_ENUM_INDEX));
						Class82.underlay_loader = new UnderlayLoader(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.OSRS, "config"));
						ContextMenus.overlay_loader = new OverlayLoader(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.OSRS, "config"));
						Material.aClass92_3358 = new IdentityKitLoader(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.PRE_EOC_634, "models"),
								Cache.get_index(Revision.OSRS, "config"), Cache.get_index(Revision.OSRS, "models"),
								Cache.get_index(Revision.PRE_EOC_550, "config"),
								Cache.get_index(Revision.PRE_EOC_550, "models"));
						HashMap.inv_type = new InvTypeLoader(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code,
								Cache.get_index(Revision.PRE_EOC_634, "config"));
						Class228.aClass189_3132 = new Class189(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"));
						Class143.aClass251_2067 = new Class251(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, true,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_LOC_INDEX),
								Cache.get_index(Revision.PRE_EOC_634, "models"),
								Cache.get_index(Revision.OSRS, "config"), Cache.get_index(Revision.OSRS, "models"));
						Client.map_functions = new MapFunctions(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.PRE_EOC_634, "sprites"),
								Cache.get_index(Revision.OSRS, "config"), Cache.get_index(Revision.OSRS, "sprites"));
						Client.map_scenes = new MapScenes(Class59_Sub4_Sub3.aClass101_6943, Preferences.language_code,
								Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.PRE_EOC_634, "sprites"),
								Cache.get_index(Revision.OSRS, "config"), Cache.get_index(Revision.OSRS, "sprites"));
						Class179.aClass228_2518 = new Class228(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, true,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_NPC_INDEX),
								Cache.get_index(Revision.PRE_EOC_634, "models"),
								Cache.get_index(Revision.OSRS, "config"), Cache.get_index(Revision.OSRS, "models"));
						MapRegion.aClass191_3663 = new Class191(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, true, Class246_Sub1_Sub10.f_eb,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_OBJ_INDEX),
								Cache.get_index(Revision.PRE_EOC_634, "models"),
								Cache.get_index(Revision.OSRS, "config"), Cache.get_index(Revision.OSRS, "models"),
								Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_OBJ_INDEX),
								Cache.get_index(Revision.PRE_EOC_550, "models"));
						Class241.aClass193_3398 = new Class193(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"));
						Class59_Sub3_Sub3.aClass45_6275 = new Class45(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_SEQ_INDEX),
								Cache.get_index(Revision.PRE_EOC_634, "skeletons"),
								Cache.get_index(Revision.PRE_EOC_634, "skins"),
								Cache.get_index(Revision.OSRS, "skeletons"), Cache.get_index(Revision.OSRS, "skins"),
								Cache.get_index(Revision.OSRS, "config"),
								Cache.client_cache.get(IndexConstants.PRE_EOC_550_CONFIG_SEQ_INDEX),
								Cache.get_index(Revision.PRE_EOC_550, "skeletons"),
								Cache.get_index(Revision.PRE_EOC_550, "skins"));
						Class246_Sub31.aClass203_5038 = new Class203(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"));
						Class246_Sub1_Sub14.aClass214_6597 = new Class214(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"));
						Class195.aClass177_2745 = new Class177(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_SPOT_INDEX),
								Cache.get_index(Revision.PRE_EOC_634, "models"),
								Cache.get_index(Revision.OSRS, "config"), Cache.get_index(Revision.OSRS, "models"));
						Class246_Sub28_Sub25.struct_loader = new StructLoader(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.OSRS, "config"));
						Class246_Sub18.aClass180_4678 = new Class180(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.OSRS, "config"));
						Class_c.varc_loader = new VarcLoader(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code,
								Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.PRE_EOC_550, "config"),
								Cache.get_index(Revision.OSRS, "config"));
						Class246_Sub30_Sub1.aClass17_5761 = new Class17(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_STRUCT_INDEX),
								Cache.get_index(Revision.OSRS, "config"),
								Cache.get_index(Revision.PRE_EOC_550, "config"));
						SubIncomingPacket.aClass209_7085 = new Class209(Class59_Sub4_Sub3.aClass101_6943,
								Preferences.language_code, Cache.get_index(Revision.PRE_EOC_634, "config"),
								Cache.get_index(Revision.OSRS, "config"),
								Cache.get_index(Revision.PRE_EOC_550, "config"));
						NpcType.method1636(-1, Cache.get_index(Revision.PRE_EOC_634, "widgets"),
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX),
								Cache.get_index(Revision.PRE_EOC_634, "models"),
								Cache.get_index(Revision.PRE_EOC_634, "sprites"),
								Cache.get_index(Revision.OSRS, "widgets"),
								Cache.get_index(Revision.CUSTOM_OSRS, "widgets"),
								Cache.get_index(Revision.OSRS, "models"), Cache.get_index(Revision.OSRS, "sprites"),
								Cache.get_index(Revision.PRE_EOC_550, "widgets"),
								Cache.get_index(Revision.PRE_EOC_550, "sprites"),
								Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "widgets"),
								Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "sprites"));
						Varc.method2614(Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_BILLBOARD_INDEX),
								23028);
						Class224.aClass50_3096 = new Class50(Preferences.language_code,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_QUICK_CHAT_INDEX),
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_QUICK_CHAT_GLOBAL_INDEX));
						Class128_Sub1.aClass65_5558 = new Class65(Preferences.language_code,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_QUICK_CHAT_INDEX),
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_QUICK_CHAT_GLOBAL_INDEX),
								new Class114());
						loading_message = Class246_Sub1_Sub4_Sub1.aClass67_7066.get(Preferences.language_code);
						loading_percentage = 65;
						Class18.method178(i ^ ~0x5b19);
						Class143.aClass251_2067.method1612((byte) 114,
								!Client.current_renderer.method2052(Buffer.anInt5656, 107));
						Varbit.aClass95_6658 = new Class95();
						Class59_Sub1_Sub2.method2571(-7);
						Class211.method1387(-117,
								Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_PARTICLE_INDEX));
						Tile.method998(Cache.get_index(Revision.PRE_EOC_634, "models"),
								(Class246_Sub37_Sub1.textureLoader), (byte) -62);
						Tile.method998(Cache.get_index(Revision.PRE_EOC_550, "models"),
								(Class246_Sub37_Sub1.textureLoader), (byte) -62);
						Tile.method998(Cache.get_index(Revision.OSRS, "models"),
								(Class246_Sub37_Sub1.textureLoader), (byte) -62);
						loading_phase = 120;
					}
				} else if (loading_phase == 120) {
					int current = Class259_Sub2.preload_sprites(Cache.get_index(Revision.PRE_EOC_634, "sprites"));
					int expected_progress = Class63_Sub1.method2073(-41);
					if (current < expected_progress) {
						loading_message = (TitleScreen.loading_sprites_ms.get(Preferences.language_code)
								+ current * 100 / expected_progress + "%");
						loading_percentage = 70;
					} else {
						int current_osrs = Class259_Sub2
								.preload_osrs_sprites(Cache.get_index(Revision.OSRS, "sprites"));
						int expected_progress_osrs = 17;
						if (current_osrs < expected_progress_osrs) {
							loading_message = (TitleScreen.loading_osrs_sprites_ms.get(Preferences.language_code)
									+ current_osrs * 100 / expected_progress_osrs + "%");
							loading_percentage = 70;
						} else {
							int current_550 = Class259_Sub2
									.preload_550_sprites(Cache.get_index(Revision.PRE_EOC_550, "sprites"));
							int expected_progress_550 = 31;
							if (current_550 < expected_progress_550) {
								loading_message = (TitleScreen.loading_550_sprites_ms.get(Preferences.language_code)
										+ current_550 * 100 / expected_progress_550 + "%");
								loading_percentage = 70;
							} else {
								Class246_Sub28_Sub7.method2556(Cache.get_index(Revision.PRE_EOC_634, "sprites"),
										Cache.get_index(Revision.OSRS, "sprites"), false, (Client.sprite_loader));
								Class176.method1158(Class243.aClass_lArray3448, 10);
								loading_message = Class219.aClass67_3038.get(Preferences.language_code);
								loading_phase = 130;
								loading_percentage = 70;
							}
						}
					}
				} else if (loading_phase == 130) {
					if (!Cache.client_cache.get(IndexConstants.PRE_EOC_634_BINARY_INDEX).methodIdk2(0, "", "huffman")) {
						loading_message = Class34.aClass67_450.get(Preferences.language_code) + "0%";
						loading_percentage = 75;
					} else {
						Class99 class99 = new Class99(Cache.client_cache.get(IndexConstants.PRE_EOC_634_BINARY_INDEX)
								.method96("huffman", false, ""));
						Class246_Sub28_Sub15.method2648((byte) -47, class99);
						loading_message = Class130_Sub1.aClass67_3733.get(Preferences.language_code);
						loading_percentage = 75;
						loading_phase = 140;
					}
				} else if ((loading_phase ^ 0xffffffff) == -141) {
					if (!Cache.get_index(Revision.OSRS, "widgets").method103(0)) {
						loading_message = (LOADING_OSRS_INTERFACES_MS.get(Preferences.language_code)
								+ Cache.get_index(Revision.OSRS, "widgets").method99(false) + "%");
						loading_percentage = 80;
					} else {
						if (!Cache.get_index(Revision.CUSTOM_OSRS, "widgets").method103(0)) {
							loading_message = (LOADING_CUSTOM_OSRS_INTERFACES_MS.get(Preferences.language_code)
									+ Cache.get_index(Revision.CUSTOM_OSRS, "widgets").method99(false) + "%");
							loading_percentage = 80;
						} else {
							if (!Cache.get_index(Revision.PRE_EOC_634, "widgets").method103(0)) {
								loading_message = (LOADING_634_INTERFACES_MS.get(Preferences.language_code)
										+ Cache.get_index(Revision.PRE_EOC_634, "widgets").method99(false) + "%");
								loading_percentage = 80;
							} else {
								if (!Cache.get_index(Revision.PRE_EOC_550, "widgets").method103(0)) {
									loading_message = (LOADING_550_INTERFACES_MS.get(Preferences.language_code)
											+ Cache.get_index(Revision.PRE_EOC_550, "widgets").method99(false) + "%");
									loading_percentage = 80;
								} else {
									if (!Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "widgets").method103(0)) {
										loading_message = (LOADING_CUSTOM_550_INTERFACES_MS
												.get(Preferences.language_code)
												+ Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "widgets")
														.method99(false)
												+ "%");
										loading_percentage = 80;
									} else {
										loading_message = Class213.aClass67_2979.get(Preferences.language_code);
										loading_phase = 150;
										loading_percentage = 80;
									}
								}
							}
						}
					}
				} else if ((loading_phase ^ 0xffffffff) == -151) {
					if (!Cache.get_index(Revision.OSRS, "cs2").method103(0)) {
						loading_message = (LOADING_OSRS_INTERFACE_SCRIPTS_MS.get(Preferences.language_code)
								+ Cache.get_index(Revision.OSRS, "cs2").method99(false) + "%");
						loading_percentage = 82;
					} else {
						if (!Cache.get_index(Revision.PRE_EOC_634, "cs2").method103(0)) {
							loading_message = (LOADING_634_INTERFACE_SCRIPTS_MS.get(Preferences.language_code)
									+ Cache.get_index(Revision.PRE_EOC_634, "cs2").method99(false) + "%");
							loading_percentage = 82;
						} else {
							if (!Cache.get_index(Revision.PRE_EOC_550, "cs2").method103(0)) {
								loading_message = (LOADING_550_INTERFACE_SCRIPTS_MS.get(Preferences.language_code)
										+ Cache.get_index(Revision.PRE_EOC_550, "cs2").method99(false) + "%");
								loading_percentage = 82;
							} else {
								loading_message = Class223.aClass67_3075.get(Preferences.language_code);
								loading_phase = 160;
								loading_percentage = 82;
							}
						}
					}
				} else if ((loading_phase ^ 0xffffffff) == -161) {
					if (!Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX).method103(i ^ 0x5b64)) {
						loading_message = (Class220.aClass67_3059.get(Preferences.language_code)
								+ Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX).method99(false)
								+ "%");
						loading_percentage = 85;
					} else {
						loading_message = Class220.aClass67_3059_2.get(Preferences.language_code);
						loading_phase = 170;
						loading_percentage = 85;
					}
				} else if (loading_phase == 170) {
					if (!Cache.client_cache.get(IndexConstants.PRE_EOC_634_WORLD_MAP_INDEX).method90(-1, "details")) {
						loading_message = (Class246_Sub1_Sub16.aClass67_6692.get(Preferences.language_code)
								+ Cache.client_cache.get(IndexConstants.PRE_EOC_634_WORLD_MAP_INDEX)
										.method100("details", (byte) 33)
								+ "%");
						loading_percentage = 87;
					} else {
						Class79.method518(Cache.client_cache.get(IndexConstants.PRE_EOC_634_WORLD_MAP_INDEX),
								Class82.underlay_loader, ContextMenus.overlay_loader, Class143.aClass251_2067,
								Client.map_functions, Client.map_scenes, Varbit.aClass95_6658);
						loading_message = MapFunction.aClass67_2010.get(Preferences.language_code);
						loading_phase = 180;
						loading_percentage = 89;
					}
				} else if ((loading_phase ^ 0xffffffff) == -181) {
					int i_141_ = Class246_Sub13.load_worlds(3);
					if (i_141_ == -1) {
						loading_message = Class246_Sub28_Sub25.aClass67_6703.get(Preferences.language_code);
						loading_percentage = 90;
					} else if ((i_141_ ^ 0xffffffff) == -8 || (i_141_ ^ 0xffffffff) == -10) {
						Client.instance.method2937(127, "worldlistfull");
						Class99.method622((byte) 67, 1000);
					} else if (!Class194_Sub1.aBool4139) {
						Client.instance.method2937(127, "worldlistio_" + i_141_);
						Class99.method622((byte) -117, 1000);
					} else {
						loading_message = Class59_Sub1_Sub2.aClass67_6128.get(Preferences.language_code);
						loading_phase = 190;
						loading_percentage = 90;
					}
				} else if (loading_phase == 190) {
					Filestore.aClass94Array1739 = new String[((Class180) (Class246_Sub18.aClass180_4678)).anInt2526];
					Filestore.aClass94Array1739_osrs = new String[680];
					Filestore.aClass94Array1739_550 = new String[((Class180) (Class246_Sub18.aClass180_4678)).anInt2526];
					Class59_Sub3_Sub1.varcs_loaded_634 = (new boolean[((VarcLoader) Class_c.varc_loader).varc_size_634]);
					Class59_Sub3_Sub1.varcs_loaded_550 = (new boolean[((VarcLoader) Class_c.varc_loader).varc_size_550]);
					Class59_Sub3_Sub1.varcs_loaded_osrs = (new boolean[((VarcLoader) Class_c.varc_loader).varc_size_osrs]);
					Varc.varcs_634 = new int[((VarcLoader) Class_c.varc_loader).varc_size_634];
					Varc.varcs_550 = new int[((VarcLoader) Class_c.varc_loader).varc_size_550];
					Varc.varcs_osrs = new int[((VarcLoader) Class_c.varc_loader).varc_size_osrs];
					for (int i_142_ = 0; ((i_142_ ^ 0xffffffff) > (((VarcLoader) Class_c.varc_loader).varc_size_634
							^ 0xffffffff)); i_142_++) {
						if ((((VarcType) Class_c.varc_loader.list(125, i_142_, 634)).anInt3105 ^ 0xffffffff) == -1) {
							Class59_Sub3_Sub1.varcs_loaded_634[i_142_] = true;
							SpotAnimType.anInt2085++;
						}
						Varc.varcs_634[i_142_] = -1;
					}
					for (int i_142_ = 0; ((i_142_ ^ 0xffffffff) > (((VarcLoader) Class_c.varc_loader).varc_size_550
							^ 0xffffffff)); i_142_++) {
						if ((((VarcType) Class_c.varc_loader.list(125, i_142_, 550)).anInt3105 ^ 0xffffffff) == -1) {
							Class59_Sub3_Sub1.varcs_loaded_550[i_142_] = true;
							SpotAnimType.anInt2085++;
						}
						Varc.varcs_550[i_142_] = -1;
					}
					for (int i_142_ = 0; ((i_142_ ^ 0xffffffff) > (((VarcLoader) Class_c.varc_loader).varc_size_osrs
							^ 0xffffffff)); i_142_++) {
						if ((((VarcType) Class_c.varc_loader.list(125, i_142_, 193)).anInt3105 ^ 0xffffffff) == -1) {
							Class59_Sub3_Sub1.varcs_loaded_osrs[i_142_] = true;
							SpotAnimType.anInt2085++;
						}
						Varc.varcs_osrs[i_142_] = -1;
					}
					Class123.method834((byte) 14);
					Cache.get_index(Revision.PRE_EOC_634, "maps").method115(false, 4, true);
					Cache.get_index(Revision.PRE_EOC_634, "music").method115(true, 4, true);
					Cache.get_index(Revision.PRE_EOC_634, "sprites").method115(true, 4, true);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX).method115(true, 4, true);
					Cache.client_cache.get(IndexConstants.PRE_EOC_634_BINARY_INDEX).method115(true, 4, true);
					Cache.get_index(Revision.PRE_EOC_634, "widgets").method115(true, 4, true);
					((CacheIndex) Cache.get_index(Revision.PRE_EOC_634, "config")).anInt126 = 2;
					Class4.aBool52 = true;
					((CacheIndex) Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_ENUM_INDEX)).anInt126 = 2;
					((CacheIndex) Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_LOC_INDEX)).anInt126 = 2;
					((CacheIndex) Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_NPC_INDEX)).anInt126 = 2;
					((CacheIndex) Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_OBJ_INDEX)).anInt126 = 2;
					((CacheIndex) Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_SEQ_INDEX)).anInt126 = 2;
					((CacheIndex) Cache.client_cache.get(IndexConstants.PRE_EOC_634_CONFIG_SPOT_INDEX)).anInt126 = 2;
					LoginScreen.unpack();
					Class100.setWindowedMode((((Renderer) (Client.current_renderer)).frame_mode), -1, -1, false, false);
					loading_message = Class35.aClass67_468.get(Preferences.language_code);
					loading_percentage = 95;
					loading_phase = 200;
				} else if (loading_phase == 200) {
					LoginScreen.prepare(true);
				}
			}
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class193.method1272(runtimeexception, "client.PA(" + i + ')');
		}
	}

	static MultilingualString opened_title_screen_ms = new MultilingualString("Opened title screen",
			"Titelbild ge\u00f6ffnet.", "\u00c9cran-titre ouvert", "Tela t\u00edtulo aberta");
	static MultilingualString loading_sprites_ms = new MultilingualString("Loading sprites (1 / 3) - ",
			"Lade Sprites (1 / 3) - ",
			"Chargement des sprites (1 / 3) - ", "Carregando sprites (1 / 3) - ");
	static MultilingualString loading_550_core_fonts_ms = new MultilingualString("Loading core fonts (2 / 3) - ",
			"Lade Schriftarten (2 / 3) - ", "Chargement des polices (2 / 3) - ",
			"Carregando fontes principais (3 / 3) - ");
	static MultilingualString loading_osrs_sprites_ms = new MultilingualString("Loading sprites (2 / 3) - ",
			"Lade Sprites (2 / 3) - ", "Chargement des sprites (2 / 3) - ", "Carregando sprites (2 / 3) - ");
	static MultilingualString loading_550_sprites_ms = new MultilingualString("Loading sprites (3 / 3) - ",
			"Lade Sprites (3 / 3) - ", "Chargement des sprites (3 / 3) - ", "Carregando sprites (3 / 3) - ");
	static MultilingualString loading_core_fonts_ms = new MultilingualString("Loading core fonts (1 / 3) - ",
			"Lade Schriftarten (1 / 3) - ", "Chargement des polices (1 / 3) - ",
			"Carregando fontes principais (1 / 3) - ");
	static MultilingualString loading_osrs_core_fonts_ms = new MultilingualString("Loading core fonts (3 / 3) - ",
			"Lade Schriftarten (3 / 3) - ", "Chargement des polices (3 / 3) - ",
			"Carregando fontes principais (3 / 3) - ");
	static MultilingualString loaded_core_fonts_ms = new MultilingualString("Loaded core fonts", "Schriftarten geladen",
			"Polices charg\u00e9es", "Fontes principais carregadas");
	static MultilingualString loading_textures_ms = new MultilingualString("Loading textures - ", "Lade Texturen - ",
			"Chargement des textures - ", "Carregando texturas - ");
	static MultilingualString loading_OSRS_textures_ms = new MultilingualString("Loading OSRS textures - ",
			"Lade OSRS Texturen - ", "Chargement des OSRS textures - ", "Carregando OSRS texturas - ");
	static AbstractSprite logo_image;

	public static void unpack() {
		TitleScreen.background_image = Client.sprite_loader.ld_to_abstract_sprite(
				LDSprite.method130(Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "sprites"),
						(SpriteConstants.TITLE_SCREEN_BACKGROUND)),
				true);
		TitleScreen.logo_image = Client.sprite_loader.ld_to_abstract_sprite(LDSprite.method130(
				Cache.get_index(Revision.CUSTOM_PRE_EOC_550, "sprites"), (SpriteConstants.TITLE_SCREEN_LOGO)), true);
	}

	public static void draw_background() {
		TitleScreen.background_image.draw_sprite(0, 0);
	}

	public static void draw_logo() {
		// TitleScreen.logo_image.draw_sprite(Client.client_width / 2 - 281 / 2, 30);
	}

	public static void draw() {
		draw_background();
		draw_logo();
	}

	static final void draw_loading_screen(int i, byte i_3_, boolean bool, int i_4_, int i_5_, Font class116,
			SceneGraph class260) {
		try {
			if (bool) {
				draw_background();
				draw_logo();
			}
			class116.draw_centered_text(
					((Class246_Sub28_Sub16.aClass101_6394 != Class59_Sub4_Sub3.aClass101_6943)
							? Class259_Sub3_Sub1.aClass67_6902
							: SpotAnimType.aClass67_2088).get(Preferences.language_code),
					Client.client_width / 2, Client.client_height / 2 - 26, i_5_, -1, 0);
			int i_6_ = -18 + Client.client_height / 2;
			class260.method1753(-152 + Client.client_width / 2, i_6_, 304, 34, i, 0);
			class260.method1753(-151 + Client.client_width / 2, i_6_ + 1, 302, 32, 0, 0);
			class260.O(-150 + Client.client_width / 2, i_6_ + 2, 3 * loading_percentage, 30, i_4_, 0);
			class260.O((Client.client_width / 2 - 150 + 3 * loading_percentage), 2 + i_6_,
					-(3 * loading_percentage) + 300, 30, 0, 0);
			class116.draw_centered_text(loading_message, Client.client_width / 2, Client.client_height / 2 + 4, i_5_,
					-1, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static AbstractSprite background_image;
}
