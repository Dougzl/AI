import stanford.karel.Karel;
/**
 * @author dz <895180729@qq.com>
 * @Description
 * @Version V1.0.0
 * @Since 1.8
 * @Date 2024/12/7 09:44
 */
public class StepUp_0 extends Karel {

    public void run() {

        move();
        turnLeft();
        pickBeeper();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        putBeeper();
        move();
    }
}
