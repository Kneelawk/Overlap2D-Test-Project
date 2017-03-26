package org.kneelawk.hellooverlap2d;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.uwsoft.editor.renderer.SceneLoader;
import com.uwsoft.editor.renderer.utils.ItemWrapper;

public class HelloOverlap2DGame extends ApplicationAdapter {
	private SceneLoader sceneLoader;

	@Override
	public void create() {
		Viewport viewport = new FitViewport(640, 360);
		sceneLoader = new SceneLoader();
		sceneLoader.loadScene("MainScene", viewport);
		
		ItemWrapper root = new ItemWrapper(sceneLoader.getRoot());
		root.getChild("Player").addScript(new PlayerLogic());
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		sceneLoader.getEngine().update(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void dispose() {
	}
}
