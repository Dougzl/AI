import stanford.karel.*;

/**
 * @author dz <895180729@qq.com>
 * @Description
 * @Version V1.0.0
 * @Since 1.8
 * @Date 2024/12/7 16:31
 */
public class Maze extends SuperKarel {

    public void run() {
        while (noBeepersPresent()) {
            turnRight();
            while (frontIsBlocked()) {
                turnLeft();
            }
            move();
        }
    }
}
