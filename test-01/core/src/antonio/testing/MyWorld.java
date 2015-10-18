package antonio.testing;

/**
 * Created by António on 18-10-2015.
 */
public class MyWorld {

    private Crash crash;

    public MyWorld(Crash crash){
        this.crash= crash;
    }
    public void create(){

    }
    public void render(){

        while(crash.getPositionY() > 100){
            crash.falling(-1);
        }
    }
}
