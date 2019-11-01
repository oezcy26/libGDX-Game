package ch.tfbern.libgdx.myfirstgame.screens;

import ch.tfbern.libgdx.myfirstgame.MyFirstGame;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.FitViewport;


public class MainMenuScreen implements Screen {

    final MyFirstGame game;

    OrthographicCamera camera;
    Stage stage;

    public MainMenuScreen(final MyFirstGame game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480); // Abschnitt der gezeigt wird


        stage = new Stage();

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();

        Table table = new Table();
        table.setBounds(0,0,Gdx.graphics.getWidth(), Gdx.graphics.getHeight()); // (!)
//        table.setDebug(true);
        table.setFillParent(true);
        table.align(Align.center);
        table.top();
        table.padTop(50);

        Label title = new Label("Technische Fachschule Bern", game.skin);
        title.setFontScale(2);
        Label landerButton = new Label("Play Cay-Lander", game.skin);

        table.add(title).pad(10);
        table.row();
        table.add(landerButton).pad(10);

        stage.addActor(table);

        stage.draw();

//        table.draw(game.batch,0.5f);



//        game.draw(game.batch, "Welcome to Drop!!! ", 100, 150);
//        game.font.draw(game.batch, "Tap anywhere to begin!", 100, 100);



        game.batch.end();




//        if (Gdx.input.isTouched()) {
//            game.setScreen(new GameScreen(game));
//            dispose();
//        }

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


    //...Rest of class omitted for succinctness.


}
