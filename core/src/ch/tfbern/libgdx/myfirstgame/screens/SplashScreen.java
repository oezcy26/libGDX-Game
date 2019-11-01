package ch.tfbern.libgdx.myfirstgame.screens;

import ch.tfbern.libgdx.myfirstgame.MyFirstGame;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SplashScreen implements Screen {
    private MyFirstGame game;

    private static final float SIZE_FAKTOR = 50;
    private SpriteBatch batch;
    private Sprite sprite;
    private float rotateSpeed;

    public SplashScreen(MyFirstGame game) {
        this.game = game;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();

        // neues Blatt mit dem Bild ?
        Texture txt = new Texture("tfbern-logo.jpeg");
        sprite = new Sprite(txt);
        sprite.setSize(50, 50);
        float width = sprite.getWidth();
        float height = sprite.getHeight();
        sprite.setOriginCenter();
        sprite.setPosition(Gdx.graphics.getWidth() / 2 - (width / 2), Gdx.graphics.getHeight() / 2 - (height / 2));

        rotateSpeed = 5;

//        sprite.setPosition(Gdx.graphics.getWidth()/2 - (width/2), Gdx.graphics.getHeight()/2 -(height/2));
//        sprite.setCenter(Gdx.graphics.getWidth()/2 - (width/2), Gdx.graphics.getHeight()/2 -(height/2));
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

        batch.begin();
        sprite.draw(batch);

        //check for end
        float rotation = sprite.getRotation();
        if (sprite.getRotation() <= 360 * 8) {

            //reposition
            float width = sprite.getWidth();
            float height = sprite.getHeight();
            sprite.setPosition(Gdx.graphics.getWidth() / 2 - (width / 2), Gdx.graphics.getHeight() / 2 - (height / 2));

            //rotate
            rotateSpeed = rotateSpeed + (3 * delta);
            sprite.rotate(rotateSpeed);

//            sprite.setRotation(sprite.getRotation() + rotateSpeed);

            //resize
            sprite.setSize(sprite.getWidth() * (1 + delta), sprite.getHeight() * (1 + delta));
            sprite.setOriginCenter();

            // change alpha
//            Color color = sprite.getColor();
//            color.a = color.a - 1000*delta;
            float a = sprite.getColor().a;
            System.out.println("current alpha: " + a);
            if (a > 0) {
                System.out.println("I will subtract :" + delta/7);
                sprite.setAlpha(a - 0.002f);
            }else{
                sprite.setAlpha(0);
            }

        } else {
            game.setScreen(new MainMenuScreen(this.game));

        }


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
