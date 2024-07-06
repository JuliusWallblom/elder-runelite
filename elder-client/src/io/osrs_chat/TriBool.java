package io.osrs_chat;

public class TriBool {
	public static final TriBool TriBool_unknown;
	public static final TriBool TriBool_true;
	public static final TriBool TriBool_false;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}
}
