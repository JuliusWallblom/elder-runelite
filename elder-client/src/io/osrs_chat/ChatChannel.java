package io.osrs_chat;

public class ChatChannel {
	Message[] messages;
	int count;

	public ChatChannel() {
		this.messages = new Message[100];
	}

	public Message addMessage(String text, String sender, int type, String prefix) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}
		if (var5 == null) {
			var5 = new Message(type, sender, prefix, text);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(type, sender, prefix, text);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	int size() {
		return this.count;
	}
}
