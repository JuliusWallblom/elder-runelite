package io;

abstract class Class59_Sub4 extends Class59 {
	static MultilingualString aClass67_5182 = new MultilingualString("Loaded update list", "Update-Liste geladen.",
			"Liste des mises \u00e0 jour charg\u00e9e", "Lista de atualiza\u00e7\u00f5es carregada");
	static int anInt5183;
	int anInt5184;
	int anInt5185;
	int anInt5186;
	static int anInt5187;
	int anInt5188;
	static boolean aBool5189 = false;

	static final void method2209(byte i) {
		do {
			try {
				anInt5183++;
				if (Class187.aBool2653) {
					Widget class235 = Widget.get_component(Class231.anInt3168, SubScript.anInt1161);
					if (class235 != null && ((Widget) class235).on_target_leave_listener != null) {
						ScriptEvent class246_sub29 = new ScriptEvent();
						((ScriptEvent) class246_sub29).params = ((Widget) class235).on_target_leave_listener;
						((ScriptEvent) class246_sub29).source = class235;
						ScriptExecutor.excute_script_event(class246_sub29, class235);
					}
					Class83.anInt1089 = -1;
					Class87.anInt1145 = -1;
					Class187.aBool2653 = false;
					if (class235 == null)
						break;
					Widget.redraw_widget(class235);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rb.BA(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method2210(boolean bool) {
		do {
			try {
				aClass67_5182 = null;
				if (bool == true)
					break;
				aClass67_5182 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rb.CA(" + bool + ')');
			}
			break;
		} while (false);
	}

	Class59_Sub4(int i, int i_1_, int i_2_, int i_3_) {
		try {
			((Class59_Sub4) this).anInt5186 = i_2_;
			((Class59_Sub4) this).anInt5184 = i;
			((Class59_Sub4) this).anInt5188 = i_1_;
			((Class59_Sub4) this).anInt5185 = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("rb.<init>(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}
}
