package io;

/* ClientLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import lombok.Getter;
import lombok.Setter;

import java.util.Properties;

@SuppressWarnings("serial")
public class ClientParams {

	public static Properties params = new Properties();

	@Setter
	@Getter
	public static String world;

	public static void setParams() {
		params.put("java_arguments", "-Xmx512m -Dsun.java2d.noddraw=true");
		params.put("colourid", "0");
		params.put("worldid", getWorld());
		params.put("modewhere", "0");
		params.put("modewhat", "0");
		params.put("lang", "0");
		params.put("objecttag", "0");
		params.put("js", "1");
		params.put("game", "0");
		params.put("affid", "0");
		params.put("advert", "1");
		params.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
		params.put("country", "0");
		params.put("haveie6", "0");
		params.put("havefirefox", "1");
		params.put("cookieprefix", "");
		params.put("cookiehost", ".runescape.com");
		params.put("cachesubdirid", "0");
		params.put("crashurl", "");
		params.put("unsignedurl", "");
		params.put("sitesettings_member", "1");
		params.put("frombilling", "false");
		params.put("sskey", "");
		params.put("force64mb", "false");
		params.put("worldflags", "8");
	}
}
