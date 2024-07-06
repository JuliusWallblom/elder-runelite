package io.osrs_chat;

import java.util.HashMap;
import java.util.Map;

import io.Client;
import io.NodeSub;
import io.IterableNodeHashTable;

public class Message extends NodeSub {

	public int count;
	public int cycle;
	public int type;
	public String sender;
	public TriBool isFromFriend;
	public TriBool isFromIgnored;
	public String prefix;
	public String text;
	public static int size;
	public static IterableDualNodeQueue queue;
	public static IterableNodeHashTable messages;
	public static Map channels;

	static {
		Message.channels = new HashMap();
		Message.messages = new IterableNodeHashTable(1024);
		Message.queue = new IterableDualNodeQueue();
		Message.size = 0;
	}
	
	public static String getMessages() {
		String value = "";
		for (int i = 0; i < size; i++)  {
			value = value + Message.getMessage(i).text + "<br>";
		}
		return value;
	}

	Message(int type, String sender, String prefix, String text) {
		this.isFromFriend = TriBool.TriBool_unknown;
		this.isFromIgnored = TriBool.TriBool_unknown;
		this.set(type, sender, prefix, text);
	}

	void set(int type, String sender, String prefix, String var4) {
		this.count = Message.method594();
		this.cycle = Client.cycle;
		this.type = type;
		this.sender = sender;
		this.fillSenderUsername();
		this.prefix = prefix;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	void clearIsFromFriend() {
		this.isFromFriend = TriBool.TriBool_unknown;
	}

	public final boolean isFromFriend() {
		if (this.isFromFriend == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend == TriBool.TriBool_true;
	}

	void fillIsFromFriend() {
		this.isFromFriend = TriBool.TriBool_false;
	}

	void clearIsFromIgnored() {
		this.isFromIgnored = TriBool.TriBool_unknown;
	}

	public final boolean isFromIgnored() {
		if (this.isFromIgnored == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored == TriBool.TriBool_true;
	}

	void fillIsFromIgnored() {
		this.isFromIgnored = TriBool.TriBool_false;
	}

	final void fillSenderUsername() {
		
	}

	public static int getNextChatId(int var0) {
		Message var1 = (Message)messages.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}
	
	public static int getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	public static Message getByChannelId(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)channels.get(var0);
		return var2.getMessage(var1);
	}

	public static int getLastChatId(int var0) {
		Message var1 = (Message)messages.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	public static int method594() {
		return ++size - 1;
	}

	public static Message getMessage(int messageId) {
		return (Message) messages.get((long) messageId);
	}
}
