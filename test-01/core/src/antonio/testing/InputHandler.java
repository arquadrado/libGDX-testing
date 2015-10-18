package antonio.testing;

import antonio.testing.animations.MyAnimations;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by António on 18-10-2015.
 */
public class InputHandler {

    private Crash crash;
    private SpriteBatch batch;

    public InputHandler(Crash crash){
        this.crash = crash;
        batch = new SpriteBatch();

    }

    public void create(){


    }

    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

        crash.setAnimationStateTime();

        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            crash.setFacingRight(false);
            crash.setCharacterPositionX(-1);

            crash.currentFrame(crash.getAnimations()[3]);

        } else if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            crash.setFacingRight(true);
            crash.setCharacterPositionX(1);

            crash.currentFrame(crash.getAnimations()[2]);

        } else if(Gdx.input.isKeyPressed(Input.Keys.UP)){

            crash.setCharacterPositionY(1);
            crash.currentFrame(crash.getAnimations()[2]);

        } else {
            crash.currentFrame(crash.getAnimations()[0]);
            crash.currentFrame(crash.getAnimations()[1]);
        }



        batch.begin();
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            batch.draw(crash.getAnimations()[2].getCurrentFrame(), crash.getAnimations()[2].getxPosition(), crash.getAnimations()[2].getyPosition());
        }else if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            batch.draw(crash.getAnimations()[3].getCurrentFrame(), crash.getAnimations()[3].getxPosition(), crash.getAnimations()[3].getyPosition());
        } else if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            batch.draw(crash.getAnimations()[0].getCurrentFrame(), crash.getAnimations()[0].getxPosition(), crash.getAnimations()[0].getyPosition());
        } else  {
            if(crash.isFacingRight()){
                batch.draw(crash.getAnimations()[0].getCurrentFrame(), crash.getAnimations()[0].getxPosition(), crash.getAnimations()[0].getyPosition());
            } else {
                batch.draw(crash.getAnimations()[1].getCurrentFrame(),crash.getAnimations()[1].getxPosition(), crash.getAnimations()[1].getyPosition());
            }

        }

        batch.end();
    }


}
