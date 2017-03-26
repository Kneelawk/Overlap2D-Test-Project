package org.kneelawk.hellooverlap2d;

import com.badlogic.ashley.core.Entity;
import com.uwsoft.editor.renderer.scripts.IScript;

public class PlayerLogic implements IScript {
	private Entity player;

	@Override
	public void init(Entity entity) {
		player = entity;
	}

	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
