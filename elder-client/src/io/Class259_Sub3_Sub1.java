package io;

import io.cache.Cache;
import io.cache.Revision;

final class Class259_Sub3_Sub1 extends Class259_Sub3 {
	static int anInt6896;
	static int anInt6897;
	static int anInt6898;
	static int anInt6899;
	static MultilingualString aClass67_6900;
	static float aFloat6901;
	static MultilingualString aClass67_6902;
	static int anInt6903;

	static final int method2841(int i, int i_1_) {
		try {
			if (i != 9921)
				aFloat6901 = -2.019924F;
			anInt6898++;
			return 0x7f & i_1_ >> 11;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "su.B(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method2842(byte i) {
		try {
			Class98.anInt1274++;
			Class243.writePacket(-114, Class195.aClass201_2746);
			anInt6896++;
			Class130_Sub1.stream.writeShort((byte) 67, SubIncomingPacket.anInt7095);
			int i_2_ = -3 / ((14 - i) / 47);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "su.D(" + i + ')');
		}
	}

	public static void method2843(byte i) {
		try {
			if (i > 105) {
				aClass67_6900 = null;
				aClass67_6902 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "su.A(" + i + ')');
		}
	}

	static {
		new MultilingualString("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.",
				"Votre canal de clan est activ\u00e9 !", "Seu canal de cl\u00e3 j\u00e1 est\u00e1 ativado!");
		aClass67_6900 = new MultilingualString("Drop", "Fallen lassen", "Poser", "Largar");
		new MultilingualString("This player is on a quick chat world and cannot receive your message.",
				"Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.",
				"Ce joueur est sur un serveur \u00e0 messagerie rapide et ne peut pas recevoir votre message.",
				"Este jogador n\u00e3o pode receber sua mensagem porque est\u00e1 em um mundo de papo r\u00e1pido.");
		aClass67_6902 = (new MultilingualString("Stellar Dawn is loading - please wait...",
				"Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...",
				"Mechscape carregando. Aguarde..."));
		anInt6903 = -1;
	}
}
