package io;

final class Material {
	boolean aBool3335;
	int anInt3336;
	boolean aBool3337;
	byte brightness;
	boolean aBool3339;
	boolean aBool3340;
	int anInt3341;
	byte aByte3342;
	byte aByte3343;
	byte aByte3344;
	byte animationDirection;
	static Class12 REMOVE_GROUND_ITEM;
	boolean aBool3347;
	boolean aBool3348;
	byte aByte3349;
	byte animationSpeed;
	static Class205 aClass205_3351;
	boolean aBool3352;
	boolean aBool3353;
	short aShort3354;
	static int anInt3355;
	boolean rotateTexture;
	static int anInt3357;
	static IdentityKitLoader aClass92_3358;
	static boolean aBool3359;
	static Class102 aClass102_3360;
	static boolean aBool3361;

	public static void method1532(int i) {
		try {
			aClass205_3351 = null;
			aClass92_3358 = null;
			if (i != 0)
				aClass92_3358 = null;
			aClass102_3360 = null;
			REMOVE_GROUND_ITEM = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vf.A(" + i + ')');
		}
	}

	static final void method1533(int i, boolean bool, boolean bool_0_, int i_1_) {
		try {
			anInt3357++;
			if (i < 8000 || (i ^ 0xffffffff) < -48001)
				throw new IllegalArgumentException();
			OverlayLoader.anInt2475 = i_1_;
			if (bool_0_ != false)
				aClass102_3360 = null;
			MapFunction.anInt2024 = i;
			Class240.aBool3387 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vf.C(" + i + ',' + bool + ',' + bool_0_ + ',' + i_1_ + ')'));
		}
	}

	public Material() {
		/* empty */
	}

	static final String get_if3_action(int i, boolean bool, Widget class235) {
		try {
			anInt3355++;
			if (!Widget.get_active_properties(class235).method2120(i, 1)
					&& ((Widget) class235).on_option_click_listener == null)
				return null;
			if (((Widget) class235).if3_actions == null
					|| (((Widget) class235).if3_actions.length ^ 0xffffffff) >= (i ^ 0xffffffff)
					|| ((Widget) class235).if3_actions[i] == null
					|| (((Widget) class235).if3_actions[i].trim().length() == 0)) {
				if (RenderSequenceLoader.aBool1452)
					return "Hidden-" + i;
				return null;
			}
			if (bool != false)
				aBool3361 = true;
			String value = ((Widget) class235).if3_actions[i];
			return value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("vf.B(" + i + ',' + bool + ',' + (class235 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		new MultilingualString("Nothing interesting happens.", "Nichts Interessantes passiert.",
				"Il ne se passe rien d'int\u00e9ressant.", "Nada de interessante acontece.");
		REMOVE_GROUND_ITEM = new Class12(8, 3);
		aClass205_3351 = new Class205("WTWIP", 3);
		new MultilingualString("You do not have permission to kick this user.",
				"Du darfst diesen Benutzer nicht rauswerfen.",
				"Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.",
				"Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar este usu\u00e1rio.");
		aBool3359 = false;
		aBool3361 = false;
		new MultilingualString("Use", "Benutzen", "Utiliser", "Usar");
	}
}
