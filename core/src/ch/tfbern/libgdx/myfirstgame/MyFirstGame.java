package ch.tfbern.libgdx.myfirstgame;

import ch.tfbern.libgdx.myfirstgame.screens.SplashScreen;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyFirstGame extends Game {
	private static final String TITLE = "MyFirstGame" ;
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		Gdx.app.log(TITLE, "create() called");
		setScreen(new SplashScreen());
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose () {
	}
}
