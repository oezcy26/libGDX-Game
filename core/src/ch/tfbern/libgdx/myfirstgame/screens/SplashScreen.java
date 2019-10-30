package ch.tfbern.libgdx.myfirstgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SplashScreen implements Screen {
    private SpriteBatch batch;
    private Sprite sprite;

    @Override
    public void show() {
        batch = new SpriteBatch();

        // neues Blatt mit dem Bild ?
        Texture txt = new Texture("tfbern-logo.jpeg");
        sprite = new Sprite(txt);
        sprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());


    }

    @Override
    public void render(float delta) {

        batch.begin();
        sprite.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
