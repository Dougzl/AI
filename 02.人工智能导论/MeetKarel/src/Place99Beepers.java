import stanford.karel.*;

import java.io.File;

/**
 * @author dz <895180729@qq.com>
 * @Description
 * @Version V1.0.0
 * @Since 1.8
 * @Date 2024/12/7 09:44
 */
public class Place99Beepers extends SuperKarel {

    public Place99Beepers() {
        super();
        KarelWorld karelWorld = new KarelWorld();
        karelWorld.add(this);
        karelWorld.load(new File("02.人工智能导论/MeetKarel/worlds/PaintByBeeper.w"));
        setWorld(karelWorld);
    }

    public void run() {
        while(true) {
            if (beepersPresent()) {
                turnLeft();
                turnLeft();
                move();
                putBeeper();
            } else if (frontIsClear()) {
                move();
            } else {
                turnLeft();
                turnLeft();
                putBeeper();
                move();
            }
        }
    }
}
