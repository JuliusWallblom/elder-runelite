package io;

/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import io.cache.Cache;
import io.cache.IndexConstants;
import io.cache.Revision;

final class Class45 {
	static int anInt644;
	static int anInt645;
	static HashMap sequence_cache = new HashMap(64), sequence_cache_osrs = new HashMap(64),
			sequence_cache_550 = new HashMap(64);
	static int anInt647;
	static byte[][][] tileRenderFlags;
	static int anInt649;
	private CacheIndex sequence_data;
	private CacheIndex osrs_sequence_data;
	private CacheIndex sequence_data_550;
	static int anInt651;
	static int anInt652;
	static int anInt653;
	static int anInt654;
	private HashMap aClass54_655 = new HashMap(100);
	static int anInt656;

	final SequenceLoader method298(int i, int i_0_, int sequence_id, Revision revision) {
		try {
			anInt647++;
			SequenceLoader class246_sub1_sub17;
			synchronized (aClass54_655) {
				if (i_0_ != 1)
					aClass54_655 = null;
				class246_sub1_sub17 = (SequenceLoader) aClass54_655.method379((long) i, (byte) 58);
				if (class246_sub1_sub17 == null) {
					class246_sub1_sub17 = new SequenceLoader(i);
					aClass54_655.method371(i_0_, (long) i, class246_sub1_sub17);
				}
			}
			synchronized (class246_sub1_sub17) {
				if (!class246_sub1_sub17.method2761(false, sequence_id, revision))
					return null;
			}
			return class246_sub1_sub17;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.F(" + i + ',' + i_0_ + ')');
		}
	}

	final void method299(int i) {
		try {
			synchronized (sequence_cache) {
				sequence_cache.method383(84);
			}
			synchronized (sequence_cache_550) {
				sequence_cache_550.method383(84);
			}
			synchronized (sequence_cache_osrs) {
				sequence_cache_osrs.method383(84);
			}
			if (i == -16517) {
				anInt644++;
				synchronized (aClass54_655) {
					aClass54_655.method383(112);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.A(" + i + ')');
		}
	}

	public static void method300(boolean bool) {
		try {
			if (bool != false)
				tileRenderFlags = null;
			tileRenderFlags = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.H(" + bool + ')');
		}
	}

	final void method301(int i, int i_1_) {
		try {
			synchronized (sequence_cache) {
				sequence_cache.method380(i, -50);
			}
			synchronized (sequence_cache_550) {
				sequence_cache_550.method380(i, -50);
			}
			synchronized (sequence_cache_osrs) {
				sequence_cache_osrs.method380(i, -50);
			}
			anInt656++;
			synchronized (aClass54_655) {
				aClass54_655.method380(i, i_1_ - 86);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.C(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method302(int i, int i_2_, int i_3_, int i_4_, byte i_5_) {
		try {
			anInt653++;
			float f = (float) Class79.anInt1058 / (float) Class79.anInt1054;
			int i_6_ = i;
			int i_7_ = i_3_;
			do {
				if (f < 1.0F) {
					i_7_ = (int) ((float) i * f);
					if (!Client.f_ob)
						break;
				}
				i_6_ = (int) ((float) i_3_ / f);
			} while (false);
			i_4_ -= (-i_7_ + i_3_) / 2;
			i_2_ -= (-i_6_ + i) / 2;
			OutputStream_Sub1.anInt4489 = -1;
			Class21.anInt322 = Class79.anInt1058 + -(i_4_ * Class79.anInt1058 / i_7_);
			Class109_Sub1_Sub1.anInt6725 = i_2_ * Class79.anInt1054 / i_6_;
			if (i_5_ < 40)
				method302(7, 18, 102, 52, (byte) -98);
			Class40.anInt617 = -1;
			Class_c_Sub1.method2278(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("du.B(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method303(int i) {
		try {
			anInt645++;
			synchronized (sequence_cache) {
				sequence_cache.method369(false);
				if (i != 2)
					tileRenderFlags = null;
			}
			synchronized (sequence_cache_550) {
				sequence_cache_550.method369(false);
				if (i != 2)
					tileRenderFlags = null;
			}
			synchronized (sequence_cache_osrs) {
				sequence_cache_osrs.method369(false);
				if (i != 2)
					tileRenderFlags = null;
			}
			synchronized (aClass54_655) {
				aClass54_655.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.E(" + i + ')');
		}
	}

	final SequenceType list(int i, int seq_id) {
		try {
			Revision revision = Settings.data;
			if (Settings.data == Revision.OSRS) {
				if (SequenceType.translate_duplicates_645(seq_id) != -1) {
					seq_id = SequenceType.translate_duplicates_645(seq_id);
				}
			} else if (Settings.data == Revision.PRE_EOC_550) {
				if (SequenceType.translate_duplicates_550(seq_id) != -1) {
					seq_id = SequenceType.translate_duplicates_550(seq_id);
				}
			}
			if (Settings.data != Revision.OSRS) {
				if (SequenceType.translate_duplicates_osrs(seq_id) != -1) {
					seq_id = SequenceType.translate_duplicates_osrs(seq_id);
				}
			}
			anInt654++;
			SequenceType seq_type;
			if (revision == Revision.OSRS) {
				synchronized (sequence_cache_osrs) {
					seq_type = (SequenceType) sequence_cache_osrs.method379((long) seq_id, (byte) 58);
				}
			} else if (revision == Revision.PRE_EOC_550) {
				synchronized (sequence_cache_550) {
					seq_type = (SequenceType) sequence_cache_550.method379((long) seq_id, (byte) 58);
				}
			} else {
				synchronized (sequence_cache) {
					seq_type = (SequenceType) sequence_cache.method379((long) seq_id, (byte) 58);
				}
			}
			if (seq_type != null)
				return seq_type;
			byte[] data;
			if (revision == Revision.OSRS) {
				data = osrs_sequence_data.get_file(seq_id, 12);
			} else if (revision == Revision.PRE_EOC_550) {
				data = sequence_data_550.get_file(OutputStream_Sub1.method2011(seq_id, -1),
						Class69.method451(seq_id, 1011));
			} else {
				data = sequence_data.get_file(OutputStream_Sub1.method2011(seq_id, -1),
						Class69.method451(seq_id, 1011));
			}
			seq_type = new SequenceType();
			((SequenceType) seq_type).id = seq_id;
			seq_type.revision = revision;
			((SequenceType) seq_type).aClass45_1736 = this;
			if (data != null) {
				seq_type.decode(new Buffer(data), 24, revision);
			}
			seq_type.post_decode(2);
			if (revision == Revision.OSRS) {
				synchronized (sequence_cache_osrs) {
					sequence_cache_osrs.method371(i ^ 0x2, (long) seq_id, seq_type);
				}
			} else if (revision == Revision.PRE_EOC_550) {
				synchronized (sequence_cache_550) {
					sequence_cache_550.method371(i ^ 0x2, (long) seq_id, seq_type);
				}
			} else {
				synchronized (sequence_cache) {
					sequence_cache.method371(i ^ 0x2, (long) seq_id, seq_type);
				}
			}
			return seq_type;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.D(" + i + ',' + seq_id + ')');
		}
	}

	final SequenceType list(int i, int seq_id, Revision revision) {
		try {
			anInt654++;
			SequenceType seq_type;
			if (Settings.data == Revision.OSRS) {
				if (SequenceType.translate_duplicates_645(seq_id) != -1) {
					seq_id = SequenceType.translate_duplicates_645(seq_id);
				}
			} else if (Settings.data == Revision.PRE_EOC_550) {
				if (SequenceType.translate_duplicates_550(seq_id) != -1) {
					seq_id = SequenceType.translate_duplicates_550(seq_id);
				}
			}
			if (Settings.data != Revision.OSRS) {
				if (SequenceType.translate_duplicates_osrs(seq_id) != -1) {
					seq_id = SequenceType.translate_duplicates_osrs(seq_id);
				}
			}
			if (revision == Revision.OSRS) {
				synchronized (sequence_cache_osrs) {
					seq_type = (SequenceType) sequence_cache_osrs.method379((long) seq_id, (byte) 58);
				}
			} else if (revision == Revision.PRE_EOC_550) {
				synchronized (sequence_cache_550) {
					seq_type = (SequenceType) sequence_cache_550.method379((long) seq_id, (byte) 58);
				}
			} else {
				synchronized (sequence_cache) {
					seq_type = (SequenceType) sequence_cache.method379((long) seq_id, (byte) 58);
				}
			}
			if (seq_type != null)
				return seq_type;
			byte[] data;
			if (revision == Revision.OSRS) {
				data = osrs_sequence_data.get_file(seq_id, 12);
			} else if (revision == Revision.PRE_EOC_550) {
				data = sequence_data_550.get_file(OutputStream_Sub1.method2011(seq_id, -1),
						Class69.method451(seq_id, 1011));
			} else {
				data = sequence_data.get_file(OutputStream_Sub1.method2011(seq_id, -1),
						Class69.method451(seq_id, 1011));
			}
			seq_type = new SequenceType();
			((SequenceType) seq_type).id = seq_id;
			seq_type.revision = revision;
			((SequenceType) seq_type).aClass45_1736 = this;
			if (data != null) {
				seq_type.decode(new Buffer(data), 24, revision);
			}
			seq_type.post_decode(2);
			if (revision == Revision.OSRS) {
				synchronized (sequence_cache_osrs) {
					sequence_cache_osrs.method371(i ^ 0x2, (long) seq_id, seq_type);
				}
			} else if (revision == Revision.PRE_EOC_550) {
				synchronized (sequence_cache_550) {
					sequence_cache_550.method371(i ^ 0x2, (long) seq_id, seq_type);
				}
			} else {
				synchronized (sequence_cache) {
					sequence_cache.method371(i ^ 0x2, (long) seq_id, seq_type);
				}
			}
			return seq_type;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.D(" + i + ',' + seq_id + ')');
		}
	}

	static final void method305(String string, int widget, int i_9_, int revision) {
		try {
			anInt651++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(widget, (byte) 121, i_9_);
			class246_sub1_sub10.method2600(i_9_ - 25855);
			((Class246_Sub1_Sub10) class246_sub1_sub10).aString6209 = string;
			((Class246_Sub1_Sub10) class246_sub1_sub10).aRevision6209 = revision;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("du.G(" + (string != null ? "{...}" : "null") + ',' + widget + ',' + i_9_ + ')'));
		}
	}

	static final void method306(int i, int i_10_, int i_11_) {
		try {
			if (i != 10447)
				tileRenderFlags = null;
			anInt649++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_11_, (byte) 116, 16);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("du.J(" + i + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	static final void method307(SceneGraph class260, boolean bool) {
		try {
			if (bool != false)
				method306(107, 99, -27);
			anInt652++;
			if ((Class213.aClass166_2982.method1112(0) ^ 0xffffffff) != -1) {
				if (Buffer.anInt5656 != 0) {
					if (NodeSub.aClass260_3741 == null) {
						Canvas canvas = new Canvas();
						canvas.setSize(36, 32);
						NodeSub.aClass260_3741 = SceneGraph.method1682((Class246_Sub37_Sub1.textureLoader), 0,
								canvas, 0, (byte) -116, Client.sign_link);
						Class59_Sub3_Sub1.aClass116_5747 = (NodeSub.aClass260_3741.method1716(
								Class129.method878(6, 0, Buffer.f_eb,
										Cache.client_cache.get(IndexConstants.PRE_EOC_634_FONT_METRICS_INDEX)),
								LDSprite.method129(Cache.get_index(Settings.gamefonts, "sprites"), Buffer.f_eb, 0),
								true));
					}
					for (Class246_Sub12 class246_sub12 = ((Class246_Sub12) Class213.aClass166_2982.method1104(
							51)); class246_sub12 != null; class246_sub12 = (Class246_Sub12) Class213.aClass166_2982
									.method1108((byte) -112)) {
						MapRegion.aClass191_3663.method1247(false,
								(!((Class246_Sub12) class246_sub12).aBool4402 ? null
										: (((Player) Client.local_player).appearance)),
								Class59_Sub3_Sub1.aClass116_5747, ((Class246_Sub12) class246_sub12).anInt4400,
								((Class246_Sub12) class246_sub12).anInt4395, NodeSub.aClass260_3741, false,
								((Class246_Sub12) class246_sub12).anInt4396,
								((Class246_Sub12) class246_sub12).anInt4394,
								((Class246_Sub12) class246_sub12).anInt4401, true, class260);
						class246_sub12.remove();
					}
				} else {
					for (Class246_Sub12 class246_sub12 = ((Class246_Sub12) Class213.aClass166_2982.method1104(
							103)); class246_sub12 != null; class246_sub12 = (Class246_Sub12) Class213.aClass166_2982
									.method1108((byte) -112)) {
						MapRegion.aClass191_3663.method1247(false,
								(((Class246_Sub12) class246_sub12).aBool4402
										? (((Player) Client.local_player).appearance)
										: null),
								FontCache.small_font, ((Class246_Sub12) class246_sub12).anInt4400,
								((Class246_Sub12) class246_sub12).anInt4395, class260, false,
								((Class246_Sub12) class246_sub12).anInt4396,
								((Class246_Sub12) class246_sub12).anInt4394,
								((Class246_Sub12) class246_sub12).anInt4401, !bool, class260);
						class246_sub12.remove();
					}
					Class205.method1341(-11712);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					"du.I(" + (class260 != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	Class45(Class101 class101, int i, CacheIndex sequence_index, CacheIndex skeleton_index, CacheIndex skin_index,
			CacheIndex osrs_skeleton_index, CacheIndex osrs_skin_index, CacheIndex osrs_sequence_index,
			CacheIndex sequence_index_550, CacheIndex skeleton_index_550, CacheIndex skin_index_550) {
		try {
			sequence_data = sequence_index;
			sequence_data_550 = sequence_index_550;
			osrs_sequence_data = osrs_sequence_index;
			if (sequence_data != null) {
				int i_14_ = -1 + sequence_data.method87((byte) 39);
				sequence_data.child_count(i_14_);
			}
			if (sequence_data_550 != null) {
				int i_14_ = -1 + sequence_data_550.method87((byte) 39);
				sequence_data_550.child_count(i_14_);
			}
			if (osrs_sequence_data != null) {
				int i_14_ = -1 + osrs_sequence_data.method87((byte) 39);
				osrs_sequence_data.child_count(i_14_);
			}
			Class40_Sub6.method2185(3168, skeleton_index, skin_index, osrs_skeleton_index, osrs_skin_index,
					skeleton_index_550, skin_index_550);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("du.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ','
							+ (sequence_index != null ? "{...}" : "null") + ','
							+ (skeleton_index != null ? "{...}" : "null") + ','
							+ (skin_index != null ? "{...}" : "null") + ')'));
		}
	}
}
