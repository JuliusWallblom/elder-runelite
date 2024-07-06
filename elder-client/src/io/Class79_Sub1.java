package io;

final class Class79_Sub1 extends Class79 {
	static TextureInterface anInterface6_5163;
	static int anInt5164;
	static OutgoingPacket aClass201_5165 = new OutgoingPacket(67, 7);
	static int anInt5166;
	static IncomingPacket aClass13_5167 = new IncomingPacket(85, 10);

	static final void draw_compass(byte i, int i_0_, int i_1_, Widget class235) {
		try {
			anInt5164++;
			Class128 class128 = class235.method1514(0, Client.sprite_loader);
			if (class128 != null) {
				if (i >= -84)
					method2206(false);
				Client.sprite_loader.OA(i_0_, i_1_, i_0_ - -(((Widget) class235).screen_width),
						(((Widget) class235).screen_height + i_1_));
				if (Class246_Sub28_Sub13.anInt6293 < 3)
					Class246_Sub16.aClass_l4521.method728(((float) i_0_ + (float) ((Widget) class235).screen_width / 2.0F),
							((float) i_1_ + (float) ((Widget) class235).screen_height / 2.0F), 4096,
							(0x3fff & (int) -Camera.camera_yaw) << 2, class128, i_0_, i_1_);
				else
					Client.sprite_loader.ca(-16777216, class128, i_0_, i_1_);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static final Class109_Sub1_Sub1 method2205(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			Class260_Sub2 class260_sub2) {
		try {
			if (i_5_ >= -96)
				FontCache.bold_font = null;
			anInt5166++;
			if (((Class260_Sub2) class260_sub2).aBool4385
					|| (WidgetParent.method2313(200, i_4_) && WidgetParent.method2313(200, i_2_)))
				return new Class109_Sub1_Sub1(class260_sub2, 3553, i_3_, i, i_4_, i_2_, true);
			if (!((Class260_Sub2) class260_sub2).f_pg)
				return new Class109_Sub1_Sub1(class260_sub2, i_3_, i, i_4_, i_2_, Class206.method1350(i_4_, 269173057),
						Class206.method1350(i_2_, 269173057), true);
			return new Class109_Sub1_Sub1(class260_sub2, 34037, i_3_, i, i_4_, i_2_, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qp.AA(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ','
					+ i_5_ + ',' + (class260_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2206(boolean bool) {
		try {
			if (bool != false)
				draw_compass((byte) 102, -5, 105, null);
			aClass201_5165 = null;
			aClass13_5167 = null;
			anInterface6_5163 = null;
			FontCache.bold_font = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qp.BA(" + bool + ')');
		}
	}
}
