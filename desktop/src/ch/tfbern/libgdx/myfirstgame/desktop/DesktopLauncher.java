package ch.tfbern.libgdx.myfirstgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ch.tfbern.libgdx.myfirstgame.MyFirstGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "MyFirstGame";
        config.width = 1400;
        config.height = 900;
        new LwjglApplication(new MyFirstGame(), config);
    }
}
