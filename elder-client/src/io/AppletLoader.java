package io;

/* ClientLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

@SuppressWarnings("serial")
public class AppletLoader extends Applet {

	public static Properties aProperties1 = new Properties();
	public static String world;

	public static void setParams() {
		aProperties1.put("java_arguments", "-Xmx512m -Dsun.java2d.noddraw=true");
		aProperties1.put("colourid", "0");
		aProperties1.put("worldid", "1");
		aProperties1.put("modewhere", "0");
		aProperties1.put("modewhat", "0");
		aProperties1.put("lang", "0");
		aProperties1.put("objecttag", "0");
		aProperties1.put("js", "1");
		aProperties1.put("game", "0");
		aProperties1.put("affid", "0");
		aProperties1.put("advert", "1");
		aProperties1.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
		aProperties1.put("country", "0");
		aProperties1.put("haveie6", "0");
		aProperties1.put("havefirefox", "1");
		aProperties1.put("cookieprefix", "");
		aProperties1.put("cookiehost", ".runescape.com");
		aProperties1.put("cachesubdirid", "0");
		aProperties1.put("crashurl", "");
		aProperties1.put("unsignedurl", "");
		aProperties1.put("sitesettings_member", "1");
		aProperties1.put("frombilling", "false");
		aProperties1.put("sskey", "");
		aProperties1.put("force64mb", "false");
		aProperties1.put("worldflags", "8");
	}

	@Override
	public String getParameter(final String string) {
		return (String) aProperties1.get(string);
	}

	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	@Override
	public URL getCodeBase() {
		URL url;
		try {
			url = new URL("http://" + Constants.ADRESS);
		} catch (final MalformedURLException malformedurlexception) {
			malformedurlexception.printStackTrace();
			return null;
		}
		return url;
	}
}
