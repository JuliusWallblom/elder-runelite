package io;

import io.cache.Revision;

final class Class246_Sub2 extends Node {
	int anInt3801;
	boolean aBool3802 = false;
	static int anInt3803;
	static int anInt3804;
	int anInt3805;
	static int anInt3806;
	int anInt3807;
	int anInt3808 = -1;
	static MultilingualString aClass67_3809;
	int anInt3810;
	static long aLong3811;
	int anInt3812;
	static IterableNodeHashTable aClass85_3813;
	static Class68 aClass68_3814;

	static final void method1785(int i, int i_0_, int i_1_, Class59_Sub4 class59_sub4, Class59_Sub4 class59_sub4_2_) {
		Tile class147 = Class187.method1222(i, i_0_, i_1_);
		if (class147 != null) {
			((Tile) class147).aClass59_Sub4_2172 = class59_sub4;
			((Tile) class147).aClass59_Sub4_2152 = class59_sub4_2_;
		}
	}

	static final int method1786(int i, int i_3_, int i_4_, byte i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			i_4_ &= 0x3;
			if ((0x1 & i_3_) == 1) {
				int i_9_ = i;
				i = i_6_;
				i_6_ = i_9_;
			}
			anInt3804++;
			if (i_4_ == 0)
				return i_7_;
			if ((i_4_ ^ 0xffffffff) == -2)
				return 7 + (-i_8_ + 1 + -i);
			if (i_5_ <= 33)
				aClass85_3813 = null;
			if ((i_4_ ^ 0xffffffff) == -3)
				return 1 - i_6_ + (7 - i_7_);
			return i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception,
					("aq.B(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	public static void method1787(int i) {
		try {
			aClass85_3813 = null;
			aClass68_3814 = null;
			int i_10_ = 102 / ((-81 - i) / 45);
			aClass67_3809 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "aq.C(" + i + ')');
		}
	}

	static final boolean method1788(int i, int i_11_, int i_12_, int i_13_, byte[] is, int i_14_, int i_15_) {
		try {
			if (i_13_ > -94)
				return true;
			anInt3806++;
			int i_16_ = i_12_ % i;
			int i_17_;
			if ((i_16_ ^ 0xffffffff) == -1)
				i_17_ = 0;
			else
				i_17_ = -i_16_ + i;
			int i_18_ = -((-1 + (i + i_15_)) / i);
			int i_19_ = -((i_12_ - -i - 1) / i);
			for (int i_20_ = i_18_; (i_20_ ^ 0xffffffff) > -1; i_20_++) {
				for (int i_21_ = i_19_; (i_21_ ^ 0xffffffff) > -1; i_21_++) {
					if ((is[i_11_] ^ 0xffffffff) == -1)
						return true;
					i_11_ += i;
				}
				i_11_ -= i_17_;
				if (is[-1 + i_11_] == 0)
					return true;
				i_11_ += i_14_;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("aq.A(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	Class246_Sub2(int i) {
		try {
			((Class246_Sub2) this).anInt3808 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "aq.<init>(" + i + ')');
		}
	}

	static {
		new MultilingualString("System update in: ", "System-Update in: ", "Mise \u00e0 jour syst\u00e8me dans : ",
				"Atualiza\u00e7\u00e3o do sistema em: ");
		aClass67_3809 = (new MultilingualString("You can't add yourself to your own friend list.",
				"Du kannst dich nicht auf deine eigene Freunde-Liste setzen!",
				"Vous ne pouvez pas ajouter votre nom \u00e0 votre liste d'amis.",
				"Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de amigos."));
		aLong3811 = 0L;
		aClass85_3813 = new IterableNodeHashTable(16);
		aClass68_3814 = new Class68();
	}
}
