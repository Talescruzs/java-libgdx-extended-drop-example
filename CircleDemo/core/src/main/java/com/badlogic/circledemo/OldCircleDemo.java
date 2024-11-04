package com.badlogic.circledemo;


// import com.badlogic.gdx.ApplicationListener;
// import com.badlogic.gdx.Gdx;
// import com.badlogic.gdx.graphics.Color;
// import com.badlogic.gdx.graphics.GL20;
// import com.badlogic.gdx.graphics.OrthographicCamera;
// import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
// import com.badlogic.gdx.math.Circle;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */










public class OldCircleDemo extends ApplicationAdapter {
    private OrthographicCamera camera;
    private ShapeRenderer shapeRenderer;
    private Vector2 circlePosition;
    private float circleRadius = 20;

    @Override
    public void create() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        shapeRenderer = new ShapeRenderer();
        circlePosition = new Vector2(Gdx.graphics.getWidth() / 2f, Gdx.graphics.getHeight() / 2f);
    }

    @Override
    public void render() {
        // Clear the screen
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Update the circle position to follow the mouse
        float mouseX = Gdx.input.getX();
        float mouseY = Gdx.graphics.getHeight() - Gdx.input.getY(); // Flip Y-axis for libGDX
        circlePosition.lerp(new Vector2(mouseX, mouseY), 0.1f); // Smooth following

        // Draw the circle
        shapeRenderer.setProjectionMatrix(camera.combined);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.circle(circlePosition.x, circlePosition.y, circleRadius);
        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }
}





// public class CircleDemo implements ApplicationListener {
//     private ShapeRenderer shapeRenderer;
//     private OrthographicCamera camera;
//     private Circle circle;

//     @Override
//     public void create() {
//         shapeRenderer = new ShapeRenderer();
//         camera = new OrthographicCamera();
//         camera.setToOrtho(false, 800, 480); // Set camera size
//         circle = new Circle(400, 240, 50);  // Set circle center (400,240) and radius (50)
//     }

//     @Override
//     public void render() {
//         Gdx.gl.glClearColor(0, 0, 0, 1); // Clear screen with black color
//         Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

//         camera.update();
//         shapeRenderer.setProjectionMatrix(camera.combined);

//         // Draw the circle
//         shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
//         shapeRenderer.setColor(Color.CYAN);
//         shapeRenderer.circle(circle.x, circle.y, circle.radius);
//         shapeRenderer.end();
//     }

//     @Override
//     public void resize(int width, int height) {
//         camera.setToOrtho(false, width, height);
//     }

//     @Override
//     public void pause() {}

//     @Override
//     public void resume() {}

//     @Override
//     public void dispose() {
//         shapeRenderer.dispose();
//     }
// }

