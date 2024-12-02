package com.badlogic.circledemo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;

public class CircleDemo extends ApplicationAdapter implements InputProcessor{
    private Integer tamx = 1600, tamy = 837;
    private GameController gController;

    @Override
    public void create() {
        this.gController = new GameController(
            new Texture(Gdx.files.internal("img/mapaMenu.jpg")), 
            this.tamx, 
            this.tamy
        );
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render() {
        gController.move();
        gController.render();
    }

    @Override
    public void dispose() {
        // Libera os recursos
        gController.dispose();
    }

    @Override
    public boolean keyDown(int keycode) {
        gController.tecla(keycode);
        return true;
    }
    @Override
    public boolean keyUp(int keycode) {
        gController.tecla(keycode);
        return false;
    }
    @Override
    public boolean keyTyped(char character) {
        return false;
    }
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) { 
        gController.click(screenX, screenY, pointer, button);
        return true;
    }
    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }
    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }
    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }
    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }

    // Método faltante da interface InputProcessor
    @Override
    public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
        return false;  // Apenas retornando false, pois você não está utilizando este evento.
    }
}
