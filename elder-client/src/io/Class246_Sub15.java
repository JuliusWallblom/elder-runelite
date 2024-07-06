package io;

final class Class246_Sub15 extends Node {
	int anInt4439;
	static int anInt4440;
	int anInt4441;
	static OutgoingPacket aClass201_4442;
	static int[] anIntArray4443 = { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	static OutgoingPacket aClass201_4444;
	static String[] aStringArray4446;

	public static void method1998(int i) {
		try {
			Client.sprite_loader = null;
			aClass201_4442 = null;
			anIntArray4443 = null;
			aStringArray4446 = null;
			if (i == -1)
				aClass201_4444 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gd.A(" + i + ')');
		}
	}

	Class246_Sub15(int i, int i_0_) {
		try {
			((Class246_Sub15) this).anInt4441 = i_0_;
			((Class246_Sub15) this).anInt4439 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gd.<init>(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1999(boolean bool, int i, Widget[] class235s) {
		try {
			if (bool != false)
				method1998(-59);
			anInt4440++;
			for (int i_1_ = 0; (class235s.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				Widget class235 = class235s[i_1_];
				if (class235 != null && (i ^ 0xffffffff) == (((Widget) class235).parent_id ^ 0xffffffff)
						&& !Client.hidden_widget(class235)) {
					if (((Widget) class235).type == 0) {
						method1999(false, ((Widget) class235).hash, class235s);
						if (((Widget) class235).components != null)
							method1999(false, ((Widget) class235).hash, ((Widget) class235).components);
						WidgetParent class246_sub40 = ((WidgetParent) (Widget.get_widget_parents(class235.revision)
								.get((long) ((Widget) class235).hash)));
						if (class246_sub40 != null)
							Class78.method489((byte) -25, ((WidgetParent) class246_sub40).anInt5517, class235.revision);
					}
					if (((Widget) class235).type == 6 && ((((Widget) class235).sequence_id ^ 0xffffffff) != 0)) {
						SequenceType class124 = (Class59_Sub3_Sub3.aClass45_6275.list(3,
								((Widget) class235).sequence_id));
						if (class124 != null) {
							((Widget) class235).model_frame_cycle += Class246_Sub17.anInt4663;
							while ((((SequenceType) class124).frameLenghts[((Widget) class235).model_frame]) < ((Widget) class235).model_frame_cycle) {
								((Widget) class235).model_frame_cycle -= (((SequenceType) class124).frameLenghts[((Widget) class235).model_frame]);
								((Widget) class235).model_frame++;
								if (((SequenceType) class124).frameIDs.length <= ((Widget) class235).model_frame) {
									((Widget) class235).model_frame -= ((SequenceType) class124).frameStep;
									if (((Widget) class235).model_frame < 0 || ((((Widget) class235).model_frame
											^ 0xffffffff) <= ((((SequenceType) class124).frameIDs).length
													^ 0xffffffff)))
										((Widget) class235).model_frame = 0;
								}
								((Widget) class235).anInt3221 = ((Widget) class235).model_frame + 1;
								if (((SequenceType) class124).frameIDs.length <= ((Widget) class235).anInt3221) {
									((Widget) class235).anInt3221 -= ((SequenceType) class124).frameStep;
									if ((((Widget) class235).anInt3221 ^ 0xffffffff) > -1
											|| ((((Widget) class235).anInt3221
													^ 0xffffffff) <= ((((SequenceType) class124).frameIDs).length
															^ 0xffffffff)))
										((Widget) class235).anInt3221 = -1;
								}
								Widget.redraw_widget(class235);
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static {
		aClass201_4442 = new OutgoingPacket(76, 3);
		aClass201_4444 = new OutgoingPacket(18, 6);
		aStringArray4446 = new String[100];
	}
}
