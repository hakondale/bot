package no.hiof.andreeg.robocode;

import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.*;
import java.util.Random;

public class Badbot extends AdvancedRobot {

    /**
     * Main method of the robot
     */
    @Override
    public void run() {
        Random rand = new Random();

        while (true) {

            int x = rand.nextInt(100) + 50;
            int turn = rand.nextInt(150) + 45;

            ahead(x);
            turnRight(turn);
        }
    }

    /**
     * When the wall is hit
     * @param event
     */
    @Override
    public void onHitWall(HitWallEvent event) {
        System.out.println("hit wall");
        turnRight(180);
        ahead(150);
    }

    /**
     * Robot hit by the opponent
     * @param event
     */
    @Override
    public void onHitRobot(HitRobotEvent event) {
        turnRight(75);
        ahead(300);
    }

    /**
     * When the opponent is hit
     * @param event
     */
    @Override
    public void onBulletHit(BulletHitEvent event) {
        System.out.println("Opponent hit!");
    }

    /**
     * When the opponent robot's location has been determined
     * @param event
     */
    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(1);
    }
}
