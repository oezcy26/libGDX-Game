package ch.tfbern.libgdx.myfirstgame;

import ch.tfbern.libgdx.myfirstgame.screens.MainMenuScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class MyFirstGame extends Game {

	public SpriteBatch batch;
//	public BitmapFont font;
	public Skin skin;
	public void create() {
		batch = new SpriteBatch();
		skin = new Skin(Gdx.files.internal("uiskin.json"));


//		Skin uiSkin = new Skin(Gdx.files.internal("uiskin.json"));
		//Use LibGDX's default Arial font.
//		font = new BitmapFont();
		this.setScreen(new MainMenuScreen(this));
	}

	public void render() {
		super.render(); //important!
	}

	public void dispose() {
		batch.dispose();
		skin.dispose();
	}

}