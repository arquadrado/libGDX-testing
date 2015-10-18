package antonio.testing;

import antonio.testing.animations.MyAnimations;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by António on 17-10-2015.
 */
public class Crash {

    private MyAnimations[] animations;
    private Rectangle body;
    private float positionX;
    private float positionY;
    private float width = 44;
    private float height = 50;
    private int velocity = 200;
    private boolean facingRight;
    private boolean runningRight;
    private boolean runningLeft;

    public Crash(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
        body = new Rectangle(positionX, positionY, width, height);
        animations = new MyAnimations[4];

        animations[0] = new MyAnimations("core/assets/crashfacingright.png", 14, 1, positionX, positionY, false);
        animations[1] = new MyAnimations("core/assets/crashfacingleft.png", 14, 1, positionX, positionY, true);
        animations[2] = new MyAnimations("core/assets/crashrunning.png", 14, 1, positionX, positionY, false);
        animations[3] = new MyAnimations("core/assets/crashrunningback.png", 14, 1, positionX, positionY, true);
        animations[0].createAnimation();
        animations[1].createAnimation();
        animations[2].createAnimation();
        animations[3].createAnimation();

    }

    public void setPosition(float x, float y){
        positionX = x;
        positionY = y;
    }

    public void setCharacterPositionX(int direction){
        animations[0].setxPosition((int) (animations[0].getxPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[1].setxPosition((int) (animations[1].getxPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[2].setxPosition((int) (animations[2].getxPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[3].setxPosition((int) (animations[3].getxPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));
    }

    public void setCharacterPositionY(int direction){

        positionY =((int)(positionY + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[0].setyPosition((int) (animations[0].getyPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[1].setyPosition((int) (animations[1].getyPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[2].setyPosition((int) (animations[2].getyPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[3].setyPosition((int) (animations[3].getyPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));


    }

    public void falling(int direction){

        positionY =((int)(positionY + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[0].setyPosition((int) (animations[0].getyPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[1].setyPosition((int) (animations[1].getyPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[2].setyPosition((int) (animations[2].getyPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));
        animations[3].setyPosition((int) (animations[3].getyPosition() + (velocity * direction) * Gdx.graphics.getDeltaTime()));


    }

    public void setAnimationStateTime(){
        animations[0].setStateTime(animations[0].getStateTime() + Gdx.graphics.getDeltaTime());
        animations[1].setStateTime(animations[1].getStateTime() + Gdx.graphics.getDeltaTime());
        animations[2].setStateTime(animations[2].getStateTime() + Gdx.graphics.getDeltaTime());
        animations[3].setStateTime(animations[3].getStateTime() + Gdx.graphics.getDeltaTime());
    }

    public void currentFrame(MyAnimations animation){
        animation.setCurrentFrame(animation.getStanding().getKeyFrame(animation.getStateTime(), true));
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public MyAnimations[] getAnimations() {
        return animations;
    }

    public void setAnimations(MyAnimations[] animations) {
        this.animations = animations;
    }

    public Rectangle getBody() {
        return body;
    }

    public void setBody(Rectangle body) {
        this.body = body;
    }

    public float getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }


    public boolean isFacingRight() {
        return facingRight;
    }

    public void setFacingRight(boolean facingRight) {
        this.facingRight = facingRight;
    }

    public boolean isRunningRight() {
        return runningRight;
    }

    public void setRunningRight(boolean runningRight) {
        this.runningRight = runningRight;
    }

    public boolean isRunningLeft() {
        return runningLeft;
    }

    public void setRunningLeft(boolean runningLeft) {
        this.runningLeft = runningLeft;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
