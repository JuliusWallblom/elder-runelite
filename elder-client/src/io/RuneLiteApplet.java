package io;

import java.applet.Applet;

public class RuneLiteApplet {

    public static Applet elderApplet;

    public static Client getClient() {
        return (Client) elderApplet;
    }
}
